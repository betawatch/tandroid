package yf;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class h implements Choreographer.FrameCallback {
    public static final long[] s;
    public static h v;
    public final Choreographer a;
    public final LinkedHashSet b;
    public final SparseArray c;
    public final pe.b d;
    public final pe.b e;
    public final pe.b f;
    public long h;
    public long n;
    public int r;

    static {
        boolean z10;
        long j3;
        int i10 = 60;
        long[] jArr = new long[60];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = i11 + 1;
            int i13 = 2;
            int i14 = 1;
            for (int i15 = 2; i15 <= i10; i15++) {
                if (i10 % i15 == 0 && Math.abs(i15 - i12) < Math.abs(i14 - i12)) {
                    i14 = i15;
                }
            }
            int i16 = i10 / i14;
            long j10 = 0;
            for (int i17 = 0; i17 < i10; i17 += i16) {
                j10 |= 1 << i17;
            }
            int i18 = i12 - i14;
            int abs = Math.abs(i18);
            int i19 = 0;
            while (i19 < abs) {
                int i20 = (((i19 * 2) + 1) * 60) / (abs * 2);
                int i21 = 0;
                while (i21 < i10) {
                    int i22 = 0;
                    while (i22 < i13) {
                        int i23 = ((i20 + (i22 == 0 ? i21 : -i21)) + 60) % 60;
                        long j11 = 1 << i23;
                        if (i18 <= 0) {
                            if ((j10 & j11) != 0) {
                                j3 = (~j11) & j10;
                                j10 = j3;
                                z10 = true;
                                break;
                            }
                            i22++;
                            i13 = 2;
                        } else {
                            if ((j10 & j11) == 0 && (i16 % 2 != 0 || i23 % 2 != 0)) {
                                j3 = j11 | j10;
                                j10 = j3;
                                z10 = true;
                                break;
                            }
                            i22++;
                            i13 = 2;
                        }
                    }
                    z10 = false;
                    if (z10) {
                        break;
                    }
                    i21++;
                    i10 = 60;
                    i13 = 2;
                }
                i19++;
                i10 = 60;
                i13 = 2;
            }
            jArr[i11] = j10;
            i11 = i12;
            i10 = 60;
        }
        s = jArr;
    }

    public h() {
        Choreographer choreographer = Choreographer.getInstance();
        this.a = choreographer;
        this.b = new LinkedHashSet();
        this.c = new SparseArray();
        this.d = new pe.b();
        this.e = new pe.b();
        this.f = new pe.b();
        choreographer.postFrameCallback(this);
    }

    public static void c() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Choreographer60FpsContent must be used on the main thread");
        }
    }

    public static h d() {
        c();
        if (v == null) {
            v = new h();
        }
        return v;
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

    public final void b(g gVar, int i10) {
        c();
        int max = Math.max(1, Math.min(i10, 60));
        g(gVar);
        e(max).b.add(gVar);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        long j10 = this.n;
        if (j10 == 0) {
            this.n = j3;
        } else {
            long j11 = (j3 - j10) + this.h;
            this.h = j11;
            this.n = j3;
            if (j11 >= 16666666) {
                this.h = j11 % 16666666;
                long j12 = 1 << this.r;
                int i10 = 0;
                while (true) {
                    SparseArray sparseArray = this.c;
                    if (i10 >= sparseArray.size()) {
                        break;
                    }
                    f fVar = (f) sparseArray.valueAt(i10);
                    if ((fVar.a & j12) != 0) {
                        pe.b bVar = fVar.d;
                        if (bVar != null) {
                            fVar.d = null;
                            Iterator it = bVar.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                        }
                        Iterator it2 = fVar.b.iterator();
                        while (it2.hasNext()) {
                            ((g) it2.next()).doFrame(j3);
                        }
                        Iterator it3 = fVar.c.iterator();
                        while (it3.hasNext()) {
                            ((Runnable) it3.next()).run();
                        }
                    }
                    i10++;
                }
                LinkedHashSet linkedHashSet = this.b;
                Iterator it4 = linkedHashSet.iterator();
                while (it4.hasNext()) {
                    ((g) it4.next()).doFrame(j3);
                }
                pe.b bVar2 = this.f;
                Iterator it5 = bVar2.iterator();
                while (it5.hasNext()) {
                    ((View) it5.next()).invalidate();
                }
                pe.b bVar3 = this.d;
                Iterator it6 = bVar3.iterator();
                while (it6.hasNext()) {
                    ((Drawable) it6.next()).invalidateSelf();
                }
                bVar2.clear();
                bVar3.clear();
                linkedHashSet.clear();
                if (this.r % 2 == 0) {
                    pe.b bVar4 = this.e;
                    Iterator it7 = bVar4.iterator();
                    while (it7.hasNext()) {
                        ((Drawable) it7.next()).invalidateSelf();
                    }
                    bVar4.clear();
                }
                int i11 = this.r + 1;
                this.r = i11;
                if (i11 == 60) {
                    this.r = 0;
                }
            }
        }
        this.a.postFrameCallback(this);
    }

    public final f e(int i10) {
        int max = Math.max(1, Math.min(i10, 60));
        SparseArray sparseArray = this.c;
        f fVar = (f) sparseArray.get(max);
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(s[max - 1]);
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
            SparseArray sparseArray = this.c;
            if (i10 >= sparseArray.size() || ((f) sparseArray.valueAt(i10)).c.remove(runnable)) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void g(g gVar) {
        c();
        if (gVar == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i10 >= sparseArray.size() || ((f) sparseArray.valueAt(i10)).b.remove(gVar)) {
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
            SparseArray sparseArray = this.c;
            if (i10 >= sparseArray.size()) {
                return;
            }
            pe.b bVar = ((f) sparseArray.valueAt(i10)).d;
            if (bVar != null && bVar.remove(runnable)) {
                return;
            } else {
                i10++;
            }
        }
    }
}
