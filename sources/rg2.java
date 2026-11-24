// default package

import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.View;
import java.lang.reflect.Field;
import java.util.Iterator;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class rg2 implements Choreographer.FrameCallback {
    public static final long[] r;
    public static rg2 s;
    public final Choreographer a;
    public final SparseArray b;
    public final e59 c;
    public final e59 d;
    public final e59 e;
    public long f;
    public long h;
    public int n;

    static {
        int i;
        boolean z;
        int i2 = 60;
        long[] jArr = new long[60];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i3 + 1;
            int i5 = 2;
            int i6 = 1;
            for (int i7 = 2; i7 <= i2; i7++) {
                if (i2 % i7 == 0 && Math.abs(i7 - i4) < Math.abs(i6 - i4)) {
                    i6 = i7;
                }
            }
            int i8 = i2 / i6;
            long j = 0;
            for (int i9 = 0; i9 < i2; i9 += i8) {
                j |= 1 << i9;
            }
            int i10 = i4 - i6;
            int abs = Math.abs(i10);
            int i11 = 0;
            while (i11 < abs) {
                int i12 = (((i11 << 1) + 1) * 60) / (abs << 1);
                int i13 = 0;
                while (true) {
                    i = i2;
                    if (i13 < i2) {
                        int i14 = 0;
                        while (i14 < i5) {
                            int i15 = ((i12 + (i14 == 0 ? i13 : -i13)) + 60) % 60;
                            long j2 = 1 << i15;
                            long j3 = j & j2;
                            if (i10 > 0) {
                                if (j3 == 0 && (i8 % 2 != 0 || i15 % 2 != 0)) {
                                    j |= j2;
                                    z = true;
                                    break;
                                }
                                i14++;
                                i5 = 2;
                            } else if (j3 != 0) {
                                j &= ~j2;
                                z = true;
                                break;
                            } else {
                                i14++;
                                i5 = 2;
                            }
                        }
                        z = false;
                        if (!z) {
                            i13++;
                            i2 = i;
                            i5 = 2;
                        }
                    }
                }
                i11++;
                i2 = i;
                i5 = 2;
            }
            jArr[i3] = j;
            i3 = i4;
        }
        r = jArr;
    }

    public rg2() {
        Choreographer choreographer = Choreographer.getInstance();
        this.a = choreographer;
        this.b = new SparseArray();
        this.c = new e59(0, false);
        this.d = new e59(0, false);
        this.e = new e59(0, false);
        choreographer.postFrameCallback(this);
    }

    public static void c() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        sc8.j("Choreographer60FpsContent must be used on the main thread");
    }

    public static rg2 d() {
        c();
        rg2 rg2Var = s;
        if (rg2Var != null) {
            return rg2Var;
        }
        rg2 rg2Var2 = new rg2();
        s = rg2Var2;
        return rg2Var2;
    }

    public final void a(int i, Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int max = Math.max(1, Math.min(i, 60));
        g(runnable);
        e(max).c.add(runnable);
    }

    public final void b(jm jmVar, int i) {
        c();
        int max = Math.max(1, Math.min(i, 60));
        f(jmVar);
        e(max).b.add(jmVar);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        long j2 = this.h;
        long j3 = 0;
        if (j2 == 0) {
            this.h = j;
        } else {
            long j4 = (j - j2) + this.f;
            this.f = j4;
            this.h = j;
            if (j4 >= 16666666) {
                this.f = j4 % 16666666;
                e59 e59Var = this.d;
                e59 e59Var2 = this.c;
                e59 e59Var3 = this.e;
                SparseArray sparseArray = this.b;
                long j5 = 1 << this.n;
                int i = 0;
                while (i < sparseArray.size()) {
                    qg2 qg2Var = (qg2) sparseArray.valueAt(i);
                    if ((qg2Var.a & j5) != j3) {
                        e59 e59Var4 = qg2Var.d;
                        if (e59Var4 != null) {
                            qg2Var.d = null;
                            Iterator it = e59Var4.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                        }
                        Iterator it2 = qg2Var.b.iterator();
                        while (it2.hasNext()) {
                            jm jmVar = (jm) it2.next();
                            switch (jmVar.a) {
                                case 0:
                                    km kmVar = (km) jmVar.b;
                                    int i2 = kmVar.R0 + 1;
                                    kmVar.R0 = i2;
                                    if (i2 > 10) {
                                        kmVar.S0 = true;
                                    }
                                    kmVar.i();
                                    if (!kmVar.V0) {
                                        break;
                                    } else {
                                        kmVar.U0 = true;
                                        kmVar.t();
                                        break;
                                    }
                                case 1:
                                    EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) jmVar.b;
                                    Field field = EditTextBoldCursor.E1;
                                    editTextBoldCursor.invalidate();
                                    break;
                                default:
                                    oy8 oy8Var = (oy8) jmVar.b;
                                    int i3 = oy8Var.L0 + 1;
                                    oy8Var.L0 = i3;
                                    if (i3 > 10) {
                                        oy8Var.M0 = true;
                                    }
                                    oy8Var.h();
                                    if (!oy8Var.P0) {
                                        break;
                                    } else {
                                        oy8Var.O0 = true;
                                        oy8Var.s();
                                        break;
                                    }
                            }
                        }
                        Iterator it3 = qg2Var.c.iterator();
                        while (it3.hasNext()) {
                            ((Runnable) it3.next()).run();
                        }
                    }
                    i++;
                    j3 = 0;
                }
                Iterator it4 = e59Var3.iterator();
                while (it4.hasNext()) {
                    ((View) it4.next()).invalidate();
                }
                Iterator it5 = e59Var2.iterator();
                while (it5.hasNext()) {
                    ((Drawable) it5.next()).invalidateSelf();
                }
                e59Var3.clear();
                e59Var2.clear();
                if (this.n % 2 == 0) {
                    Iterator it6 = e59Var.iterator();
                    while (it6.hasNext()) {
                        ((Drawable) it6.next()).invalidateSelf();
                    }
                    e59Var.clear();
                }
                int i4 = this.n + 1;
                this.n = i4;
                if (i4 == 60) {
                    this.n = 0;
                }
            }
        }
        this.a.postFrameCallback(this);
    }

    public final qg2 e(int i) {
        int max = Math.max(1, Math.min(i, 60));
        SparseArray sparseArray = this.b;
        qg2 qg2Var = (qg2) sparseArray.get(max);
        if (qg2Var != null) {
            return qg2Var;
        }
        qg2 qg2Var2 = new qg2(r[max - 1]);
        sparseArray.put(max, qg2Var2);
        return qg2Var2;
    }

    public final void f(jm jmVar) {
        c();
        if (jmVar == null) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i >= sparseArray.size() || ((qg2) sparseArray.valueAt(i)).b.remove(jmVar)) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void g(Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i >= sparseArray.size() || ((qg2) sparseArray.valueAt(i)).c.remove(runnable)) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void h(Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i >= sparseArray.size()) {
                return;
            }
            e59 e59Var = ((qg2) sparseArray.valueAt(i)).d;
            if (e59Var != null && e59Var.remove(runnable)) {
                return;
            } else {
                i++;
            }
        }
    }
}
