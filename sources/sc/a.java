package sc;

import g7.y5;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import m.y2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class a implements qc.c, d, Serializable {
    private final qc.c completion;

    public a(qc.c cVar) {
        this.completion = cVar;
    }

    public qc.c create(qc.c completion) {
        kotlin.jvm.internal.i.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        qc.c cVar = this.completion;
        if (cVar instanceof d) {
            return (d) cVar;
        }
        return null;
    }

    public final qc.c getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i9;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v = eVar.v();
        if (v > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i9 = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i9 = -1;
        }
        int i10 = i9 >= 0 ? eVar.l()[i9] : -1;
        y2 y2Var = f.b;
        y2 y2Var2 = f.a;
        if (y2Var == null) {
            try {
                y2 y2Var3 = new y2(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f.b = y2Var3;
                y2Var = y2Var3;
            } catch (Exception unused2) {
                f.b = y2Var2;
                y2Var = y2Var2;
            }
        }
        if (y2Var != y2Var2 && (method = y2Var.a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = y2Var.b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = y2Var.c;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = eVar.c();
        } else {
            str = str2 + '/' + eVar.c();
        }
        return new StackTraceElement(str, eVar.m(), eVar.f(), i10);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // qc.c
    public final void resumeWith(Object obj) {
        qc.c cVar = this;
        while (true) {
            a aVar = (a) cVar;
            qc.c cVar2 = aVar.completion;
            kotlin.jvm.internal.i.b(cVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == rc.a.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = y5.a(th);
            }
            aVar.releaseIntercepted();
            if (!(cVar2 instanceof a)) {
                cVar2.resumeWith(obj);
                return;
            }
            cVar = cVar2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public qc.c create(Object obj, qc.c completion) {
        kotlin.jvm.internal.i.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
