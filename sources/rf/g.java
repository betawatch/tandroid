package rf;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.View;
import java.lang.reflect.Field;
import java.util.Iterator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.s5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g implements Choreographer.FrameCallback {
    public static final long[] r;
    public static g s;
    public final Choreographer a;
    public final SparseArray b;
    public final je.b c;
    public final je.b d;
    public final je.b e;
    public long f;
    public long h;
    public int n;

    static {
        int i10;
        boolean z10;
        long j10;
        int i11 = 60;
        long[] jArr = new long[60];
        int i12 = 0;
        while (i12 < i11) {
            int i13 = i12 + 1;
            int i14 = 2;
            int i15 = 1;
            for (int i16 = 2; i16 <= i11; i16++) {
                if (i11 % i16 == 0 && Math.abs(i16 - i13) < Math.abs(i15 - i13)) {
                    i15 = i16;
                }
            }
            int i17 = i11 / i15;
            long j11 = 0;
            for (int i18 = 0; i18 < i11; i18 += i17) {
                j11 |= 1 << i18;
            }
            int i19 = i13 - i15;
            int abs = Math.abs(i19);
            int i20 = 0;
            while (i20 < abs) {
                int i21 = (((i20 * 2) + 1) * 60) / (abs * 2);
                int i22 = 0;
                while (true) {
                    i10 = i11;
                    if (i22 < i11) {
                        int i23 = 0;
                        while (i23 < i14) {
                            int i24 = ((i21 + (i23 == 0 ? i22 : -i22)) + 60) % 60;
                            long j12 = 1 << i24;
                            if (i19 <= 0) {
                                if ((j11 & j12) != 0) {
                                    j10 = (~j12) & j11;
                                    j11 = j10;
                                    z10 = true;
                                    break;
                                }
                                i23++;
                                i14 = 2;
                            } else {
                                if ((j11 & j12) == 0 && (i17 % 2 != 0 || i24 % 2 != 0)) {
                                    j10 = j12 | j11;
                                    j11 = j10;
                                    z10 = true;
                                    break;
                                }
                                i23++;
                                i14 = 2;
                            }
                        }
                        z10 = false;
                        if (z10) {
                            break;
                        }
                        i22++;
                        i11 = i10;
                        i14 = 2;
                    }
                }
                i20++;
                i11 = i10;
                i14 = 2;
            }
            jArr[i12] = j11;
            i12 = i13;
        }
        r = jArr;
    }

    public g() {
        Choreographer choreographer = Choreographer.getInstance();
        this.a = choreographer;
        this.b = new SparseArray();
        this.c = new je.b();
        this.d = new je.b();
        this.e = new je.b();
        choreographer.postFrameCallback(this);
    }

    public static void c() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Choreographer60FpsContent must be used on the main thread");
        }
    }

    public static g d() {
        c();
        if (s == null) {
            s = new g();
        }
        return s;
    }

    public final void a(int i10, Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int max = Math.max(1, Math.min(i10, 60));
        f(runnable);
        e(max).c.add(runnable);
    }

    public final void b(r5 r5Var, int i10) {
        c();
        int max = Math.max(1, Math.min(i10, 60));
        g(r5Var);
        e(max).b.add(r5Var);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        long j11 = this.h;
        long j12 = 0;
        if (j11 == 0) {
            this.h = j10;
        } else {
            long j13 = (j10 - j11) + this.f;
            this.f = j13;
            this.h = j10;
            if (j13 >= 16666666) {
                this.f = j13 % 16666666;
                je.b bVar = this.d;
                je.b bVar2 = this.c;
                je.b bVar3 = this.e;
                SparseArray sparseArray = this.b;
                long j14 = 1 << this.n;
                int i10 = 0;
                while (i10 < sparseArray.size()) {
                    f fVar = (f) sparseArray.valueAt(i10);
                    if ((fVar.a & j14) != j12) {
                        je.b bVar4 = fVar.d;
                        if (bVar4 != null) {
                            fVar.d = null;
                            Iterator it = bVar4.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                        }
                        Iterator it2 = fVar.b.iterator();
                        while (it2.hasNext()) {
                            r5 r5Var = (r5) it2.next();
                            int i11 = r5Var.a;
                            Object obj = r5Var.b;
                            switch (i11) {
                                case 0:
                                    s5 s5Var = (s5) obj;
                                    int i12 = s5Var.Q0 + 1;
                                    s5Var.Q0 = i12;
                                    if (i12 > 10) {
                                        s5Var.R0 = true;
                                    }
                                    s5Var.i();
                                    if (!s5Var.U0) {
                                        break;
                                    } else {
                                        s5Var.T0 = true;
                                        s5Var.t();
                                        break;
                                    }
                                case 1:
                                    Field field = EditTextBoldCursor.y1;
                                    ((EditTextBoldCursor) obj).invalidate();
                                    break;
                                default:
                                    bi0.g((bi0) obj);
                                    break;
                            }
                        }
                        Iterator it3 = fVar.c.iterator();
                        while (it3.hasNext()) {
                            ((Runnable) it3.next()).run();
                        }
                    }
                    i10++;
                    j12 = 0;
                }
                Iterator it4 = bVar3.iterator();
                while (it4.hasNext()) {
                    ((View) it4.next()).invalidate();
                }
                Iterator it5 = bVar2.iterator();
                while (it5.hasNext()) {
                    ((Drawable) it5.next()).invalidateSelf();
                }
                bVar3.clear();
                bVar2.clear();
                if (this.n % 2 == 0) {
                    Iterator it6 = bVar.iterator();
                    while (it6.hasNext()) {
                        ((Drawable) it6.next()).invalidateSelf();
                    }
                    bVar.clear();
                }
                int i13 = this.n + 1;
                this.n = i13;
                if (i13 == 60) {
                    this.n = 0;
                }
            }
        }
        this.a.postFrameCallback(this);
    }

    public final f e(int i10) {
        int max = Math.max(1, Math.min(i10, 60));
        SparseArray sparseArray = this.b;
        f fVar = (f) sparseArray.get(max);
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(r[max - 1]);
        sparseArray.put(max, fVar2);
        return fVar2;
    }

    public final void f(Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i10 >= sparseArray.size() || ((f) sparseArray.valueAt(i10)).c.remove(runnable)) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void g(r5 r5Var) {
        c();
        if (r5Var == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i10 >= sparseArray.size() || ((f) sparseArray.valueAt(i10)).b.remove(r5Var)) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void h(Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i10 >= sparseArray.size()) {
                return;
            }
            je.b bVar = ((f) sparseArray.valueAt(i10)).d;
            if (bVar != null && bVar.remove(runnable)) {
                return;
            } else {
                i10++;
            }
        }
    }
}
