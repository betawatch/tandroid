// default package

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class qf0 implements zw2, wx2, Serializable {
    private final zw2 completion;

    public qf0(zw2 zw2Var) {
        this.completion = zw2Var;
    }

    public zw2 create(zw2 zw2Var) {
        zw2Var.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public wx2 getCallerFrame() {
        zw2 zw2Var = this.completion;
        if (zw2Var instanceof wx2) {
            return (wx2) zw2Var;
        }
        return null;
    }

    public final zw2 getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        g93 g93Var = (g93) getClass().getAnnotation(g93.class);
        String str2 = null;
        if (g93Var == null) {
            return null;
        }
        int v = g93Var.v();
        if (v > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i = -1;
        }
        int i2 = i >= 0 ? g93Var.l()[i] : -1;
        zg7 zg7Var = mfd.b;
        zg7 zg7Var2 = mfd.a;
        if (zg7Var == null) {
            try {
                zg7 zg7Var3 = new zg7(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                mfd.b = zg7Var3;
                zg7Var = zg7Var3;
            } catch (Exception unused2) {
                mfd.b = zg7Var2;
                zg7Var = zg7Var2;
            }
        }
        if (zg7Var != zg7Var2 && (method = zg7Var.a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = zg7Var.b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = zg7Var.c;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = g93Var.c();
        } else {
            str = str2 + '/' + g93Var.c();
        }
        return new StackTraceElement(str, g93Var.m(), g93Var.f(), i2);
    }

    public Object invokeSuspend(Object obj) {
        ixe.b(obj);
        return g9c.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zw2
    public final void resumeWith(Object obj) {
        while (true) {
            qf0 qf0Var = this;
            zw2 zw2Var = qf0Var.completion;
            zw2Var.getClass();
            try {
                obj = qf0Var.invokeSuspend(obj);
                if (obj == vx2.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = new ge9(th);
            }
            qf0Var.releaseIntercepted();
            if (!(zw2Var instanceof qf0)) {
                zw2Var.resumeWith(obj);
                return;
            }
            this = zw2Var;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public zw2 create(Object obj, zw2 zw2Var) {
        zw2Var.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
