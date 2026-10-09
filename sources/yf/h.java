package yf;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class h implements Choreographer.FrameCallback {
    public static final long[] s;
    public static h v;
    public final Choreographer a;
    public final LinkedHashSet b;
    public final SparseArray c;
    public final qe.b d;
    public final qe.b e;
    public final qe.b f;
    public long h;
    public long n;
    public int r;

    static {
        int i10;
        boolean z10;
        long j3;
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
            long j10 = 0;
            for (int i18 = 0; i18 < i11; i18 += i17) {
                j10 |= 1 << i18;
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
                            long j11 = 1 << i24;
                            if (i19 <= 0) {
                                if ((j10 & j11) != 0) {
                                    j3 = (~j11) & j10;
                                    j10 = j3;
                                    z10 = true;
                                    break;
                                }
                                i23++;
                                i14 = 2;
                            } else {
                                if ((j10 & j11) == 0 && (i17 % 2 != 0 || i24 % 2 != 0)) {
                                    j3 = j11 | j10;
                                    j10 = j3;
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
            jArr[i12] = j10;
            i12 = i13;
        }
        s = jArr;
    }

    public h() {
        Choreographer choreographer = Choreographer.getInstance();
        this.a = choreographer;
        this.b = new LinkedHashSet();
        this.c = new SparseArray();
        this.d = new qe.b();
        this.e = new qe.b();
        this.f = new qe.b();
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
                        qe.b bVar = fVar.d;
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
                qe.b bVar2 = this.f;
                Iterator it5 = bVar2.iterator();
                while (it5.hasNext()) {
                    ((View) it5.next()).invalidate();
                }
                qe.b bVar3 = this.d;
                Iterator it6 = bVar3.iterator();
                while (it6.hasNext()) {
                    ((Drawable) it6.next()).invalidateSelf();
                }
                bVar2.clear();
                bVar3.clear();
                linkedHashSet.clear();
                if (this.r % 2 == 0) {
                    qe.b bVar4 = this.e;
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
            qe.b bVar = ((f) sparseArray.valueAt(i10)).d;
            if (bVar != null && bVar.remove(runnable)) {
                return;
            } else {
                i10++;
            }
        }
    }
}
