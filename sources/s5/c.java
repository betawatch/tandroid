package s5;

import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.telegram.ui.Components.g50;
import r5.d0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c {
    public long b;
    public final h c;
    public ArrayList d;
    public final SparseIntArray e;
    public final r f;
    public final ArrayList g;
    public final ArrayDeque h;
    public final a7.e i;
    public final g50 j;
    public BasePendingResult k;
    public BasePendingResult l;
    public final Set m = DesugarCollections.synchronizedSet(new HashSet());
    public final u5.b a = new u5.b("MediaQueue", null);

    public c(h hVar) {
        this.c = hVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.e = new SparseIntArray();
        this.g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.i = new a7.e(Looper.getMainLooper(), 2);
        this.j = new g50(this, 4);
        hVar.p(new d0(this, 1));
        this.f = new r(this);
        this.b = e();
        d();
    }

    public static void a(c cVar) {
        synchronized (cVar.m) {
            try {
                Iterator it = cVar.m.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void b(c cVar) {
        SparseIntArray sparseIntArray = cVar.e;
        sparseIntArray.clear();
        for (int i10 = 0; i10 < cVar.d.size(); i10++) {
            sparseIntArray.put(((Integer) cVar.d.get(i10)).intValue(), i10);
        }
    }

    public final void c() {
        h();
        this.d.clear();
        this.e.clear();
        this.f.evictAll();
        this.g.clear();
        this.i.removeCallbacks(this.j);
        this.h.clear();
        BasePendingResult basePendingResult = this.l;
        if (basePendingResult != null) {
            basePendingResult.c();
            this.l = null;
        }
        BasePendingResult basePendingResult2 = this.k;
        if (basePendingResult2 != null) {
            basePendingResult2.c();
            this.k = null;
        }
        g();
        f();
    }

    public final void d() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        b6.m.e("Must be called from the main thread.");
        if (this.b != 0 && (basePendingResult = this.l) == null) {
            if (basePendingResult != null) {
                basePendingResult.c();
                this.l = null;
            }
            BasePendingResult basePendingResult3 = this.k;
            if (basePendingResult3 != null) {
                basePendingResult3.c();
                this.k = null;
            }
            h hVar = this.c;
            hVar.getClass();
            b6.m.e("Must be called from the main thread.");
            if (hVar.w()) {
                i iVar = new i(hVar);
                h.x(iVar);
                basePendingResult2 = iVar;
            } else {
                basePendingResult2 = h.t();
            }
            this.l = basePendingResult2;
            basePendingResult2.i(new q(this, 0));
        }
    }

    public final long e() {
        q5.q e = this.c.e();
        if (e == null) {
            return 0L;
        }
        MediaInfo mediaInfo = e.a;
        int i10 = mediaInfo == null ? -1 : mediaInfo.b;
        int i11 = e.e;
        int i12 = e.f;
        int i13 = e.w;
        if (i11 == 1) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        return 0L;
                    }
                } else if (i10 != 2) {
                    return 0L;
                }
            }
            if (i13 == 0) {
                return 0L;
            }
        }
        return e.b;
    }

    public final void f() {
        synchronized (this.m) {
            try {
                Iterator it = this.m.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        synchronized (this.m) {
            try {
                Iterator it = this.m.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h() {
        synchronized (this.m) {
            try {
                Iterator it = this.m.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
