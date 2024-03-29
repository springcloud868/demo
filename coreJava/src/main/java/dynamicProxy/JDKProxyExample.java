package dynamicProxy;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK Proxy 相关示例
 */
public class JDKProxyExample {

    interface Car {
        void running();
    }

    static class Bus implements Car {
        @Override
        public void running() {
            System.out.println("The bus is running.");
        }
    }

    static class Taxi implements Car {
        @Override
        public void running() {
            System.out.println("The taxi is running.");
        }
    }

    /**
     * JDK Proxy
     */
    static class JDKProxy implements InvocationHandler {
        private Object target; // 代理对象

        // 获取到代理对象
        public Object getInstance(Object target) {
            this.target = target;
            // 取得代理对象
            return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                    target.getClass().getInterfaces(), this);
        }

        /**
         * 执行代理方法
         * @param proxy  代理对象
         * @param method 代理方法
         * @param args   方法的参数
         * @return Object
         * @throws InvocationTargetException
         * @throws IllegalAccessException
         */
        @Override
        public Object invoke(Object proxy, @NotNull Method method, Object[] args)
                throws InvocationTargetException, IllegalAccessException {
            System.out.println("动态代理之前的业务处理.");
            return method.invoke(target, args);
        }
    }

    public static void main(String[] args) {
        // 执行 JDK Proxy
        JDKProxy jdkProxy = new JDKProxy();
        Car carInstance = (Car) jdkProxy.getInstance(new Taxi());
        carInstance.running();
    }
}
