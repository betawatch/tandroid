package qd;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ld.t0;
import ld.u0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class x {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(x.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public t0[] a;

    public final void a(t0 t0Var) {
        t0Var.e((u0) this);
        t0[] t0VarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (t0VarArr == null) {
            t0VarArr = new t0[4];
            this.a = t0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= t0VarArr.length) {
            Object[] copyOf = Arrays.copyOf(t0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
            t0VarArr = (t0[]) copyOf;
            this.a = t0VarArr;
        }
        int i10 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i10 + 1);
        t0VarArr[i10] = t0Var;
        t0Var.b = i10;
        e(i10);
    }

    public final t0 b() {
        t0 t0Var;
        synchronized (this) {
            t0[] t0VarArr = this.a;
            t0Var = t0VarArr != null ? t0VarArr[0] : null;
        }
        return t0Var;
    }

    public final void c(t0 t0Var) {
        synchronized (this) {
            if (t0Var.a() != null) {
                d(t0Var.b);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t0 d(int i10) {
        Object[] objArr = this.a;
        kotlin.jvm.internal.j.b(objArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i10 < atomicIntegerFieldUpdater.get(this)) {
            f(i10, atomicIntegerFieldUpdater.get(this));
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                t0 t0Var = objArr[i10];
                kotlin.jvm.internal.j.b(t0Var);
                Object obj = objArr[i11];
                kotlin.jvm.internal.j.b(obj);
                if (t0Var.compareTo(obj) < 0) {
                    f(i10, i11);
                    e(i11);
                }
            }
            while (true) {
                int i12 = i10 * 2;
                int i13 = i12 + 1;
                if (i13 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.a;
                kotlin.jvm.internal.j.b(objArr2);
                int i14 = i12 + 2;
                if (i14 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i14];
                    kotlin.jvm.internal.j.b(comparable);
                    Object obj2 = objArr2[i13];
                    kotlin.jvm.internal.j.b(obj2);
                }
                i14 = i13;
                Comparable comparable2 = objArr2[i10];
                kotlin.jvm.internal.j.b(comparable2);
                Comparable comparable3 = objArr2[i14];
                kotlin.jvm.internal.j.b(comparable3);
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                f(i10, i14);
                i10 = i14;
            }
        }
        t0 t0Var2 = objArr[atomicIntegerFieldUpdater.get(this)];
        kotlin.jvm.internal.j.b(t0Var2);
        t0Var2.e(null);
        t0Var2.b = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return t0Var2;
    }

    public final void e(int i10) {
        while (i10 > 0) {
            t0[] t0VarArr = this.a;
            kotlin.jvm.internal.j.b(t0VarArr);
            int i11 = (i10 - 1) / 2;
            t0 t0Var = t0VarArr[i11];
            kotlin.jvm.internal.j.b(t0Var);
            t0 t0Var2 = t0VarArr[i10];
            kotlin.jvm.internal.j.b(t0Var2);
            if (t0Var.compareTo(t0Var2) <= 0) {
                return;
            }
            f(i10, i11);
            i10 = i11;
        }
    }

    public final void f(int i10, int i11) {
        t0[] t0VarArr = this.a;
        kotlin.jvm.internal.j.b(t0VarArr);
        t0 t0Var = t0VarArr[i11];
        kotlin.jvm.internal.j.b(t0Var);
        t0 t0Var2 = t0VarArr[i10];
        kotlin.jvm.internal.j.b(t0Var2);
        t0VarArr[i10] = t0Var;
        t0VarArr[i11] = t0Var2;
        t0Var.b = i10;
        t0Var2.b = i11;
    }
}
