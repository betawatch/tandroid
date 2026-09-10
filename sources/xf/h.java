package xf;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class h implements Choreographer.FrameCallback {
    public static h s;
    public final Choreographer a;
    public final LinkedHashSet b;
    public final SparseArray c;
    public final pe.b d;
    public final pe.b e;
    public final pe.b f;
    public long h;
    public long n;
    public int r;

    public h() {
        Choreographer choreographer = Choreographer.getInstance();
        this.a = choreographer;
        this.b = new LinkedHashSet();
        this.c = new SparseArray();
        this.d = new pe.b(true);
        this.e = new pe.b(true);
        this.f = new pe.b(true);
        choreographer.postFrameCallback(this);
    }

    public static void c() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Choreographer60FpsContent must be used on the main thread");
        }
    }

    public static h d() {
        c();
        if (s == null) {
            s = new h();
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
        e(max).e.add(runnable);
    }

    public final void b(g gVar, int i10) {
        c();
        int max = Math.max(1, Math.min(i10, 60));
        g(gVar);
        e(max).d.add(gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[LOOP:2: B:24:0x0067->B:26:0x006d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083 A[LOOP:3: B:29:0x007d->B:31:0x0083, LOOP_END] */
    @Override // android.view.Choreographer.FrameCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void doFrame(long j3) {
        int i10;
        pe.b bVar;
        Iterator it;
        Iterator it2;
        long j10 = this.n;
        if (j10 == 0) {
            this.n = j3;
        } else {
            long j11 = (j3 - j10) + this.h;
            this.h = j11;
            this.n = j3;
            if (j11 >= 16666666) {
                this.h = j11 % 16666666;
                while (true) {
                    SparseArray sparseArray = this.c;
                    if (i10 >= sparseArray.size()) {
                        break;
                    }
                    f fVar = (f) sparseArray.valueAt(i10);
                    int i11 = fVar.b;
                    if (i11 > 0) {
                        i10 = this.r % i11 != 0 ? i10 + 1 : 0;
                        bVar = fVar.f;
                        if (bVar != null) {
                            fVar.f = null;
                            Iterator it3 = bVar.iterator();
                            while (it3.hasNext()) {
                                ((Runnable) it3.next()).run();
                            }
                        }
                        it = fVar.d.iterator();
                        while (it.hasNext()) {
                            ((g) it.next()).doFrame(j3);
                        }
                        it2 = fVar.e.iterator();
                        while (it2.hasNext()) {
                            ((Runnable) it2.next()).run();
                        }
                    } else {
                        long j12 = fVar.c + 16666666;
                        fVar.c = j12;
                        long j13 = fVar.a;
                        if (j12 >= j13) {
                            fVar.c = j12 % j13;
                            bVar = fVar.f;
                            if (bVar != null) {
                            }
                            it = fVar.d.iterator();
                            while (it.hasNext()) {
                            }
                            it2 = fVar.e.iterator();
                            while (it2.hasNext()) {
                            }
                        }
                    }
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
                this.r++;
            }
        }
        this.a.postFrameCallback(this);
    }

    public final f e(int i10) {
        SparseArray sparseArray = this.c;
        f fVar = (f) sparseArray.get(i10);
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(1000000000 / i10, 60 % i10 == 0 ? 60 / i10 : 0);
        sparseArray.put(i10, fVar2);
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
            if (i10 >= sparseArray.size() || ((f) sparseArray.valueAt(i10)).e.remove(runnable)) {
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
            if (i10 >= sparseArray.size() || ((f) sparseArray.valueAt(i10)).d.remove(gVar)) {
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
            pe.b bVar = ((f) sparseArray.valueAt(i10)).f;
            if (bVar != null && bVar.remove(runnable)) {
                return;
            } else {
                i10++;
            }
        }
    }
}
