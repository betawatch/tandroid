package wc;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import k7.p7;
import kotlin.jvm.internal.j;
import m.y2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class a implements uc.c, d, Serializable {
    private final uc.c completion;

    public a(uc.c cVar) {
        this.completion = cVar;
    }

    public uc.c create(uc.c completion) {
        j.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        uc.c cVar = this.completion;
        if (cVar instanceof d) {
            return (d) cVar;
        }
        return null;
    }

    public final uc.c getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i10;
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
            i10 = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i10 = -1;
        }
        int i11 = i10 >= 0 ? eVar.l()[i10] : -1;
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
        return new StackTraceElement(str, eVar.m(), eVar.f(), i11);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // uc.c
    public final void resumeWith(Object obj) {
        uc.c cVar = this;
        while (true) {
            a aVar = (a) cVar;
            uc.c cVar2 = aVar.completion;
            j.b(cVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == vc.a.a) {
                    return;
                }
            } catch (Throwable th2) {
                obj = p7.a(th2);
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
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public uc.c create(Object obj, uc.c completion) {
        j.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
