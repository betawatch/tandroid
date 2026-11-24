// default package

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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class wr6 {
    public long b;
    public final i69 c;
    public final dbf f;
    public BasePendingResult k;
    public BasePendingResult l;
    public final Set m = DesugarCollections.synchronizedSet(new HashSet());
    public final dc6 a = new dc6("MediaQueue", null);
    public ArrayList d = new ArrayList();
    public final SparseIntArray e = new SparseIntArray();
    public final ArrayList g = new ArrayList();
    public final ArrayDeque h = new ArrayDeque(20);
    public final o59 i = new o59(Looper.getMainLooper(), (byte) 3);
    public final aw3 j = new aw3(this, 4);

    public wr6(i69 i69Var) {
        this.c = i69Var;
        i69Var.p(new cbf(this, (byte) 1));
        this.f = new dbf(this);
        this.b = d();
        c();
    }

    public static /* bridge */ /* synthetic */ void a(wr6 wr6Var) {
        SparseIntArray sparseIntArray = wr6Var.e;
        sparseIntArray.clear();
        for (int i = 0; i < wr6Var.d.size(); i++) {
            sparseIntArray.put(((Integer) wr6Var.d.get(i)).intValue(), i);
        }
    }

    public final void b() {
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
        f();
        e();
    }

    public final void c() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        fre.e("Must be called from the main thread.");
        if (this.b == 0 || (basePendingResult = this.l) != null) {
            return;
        }
        if (basePendingResult != null) {
            basePendingResult.c();
            this.l = null;
        }
        BasePendingResult basePendingResult3 = this.k;
        if (basePendingResult3 != null) {
            basePendingResult3.c();
            this.k = null;
        }
        i69 i69Var = this.c;
        i69Var.getClass();
        fre.e("Must be called from the main thread.");
        if (i69Var.w()) {
            x5d x5dVar = new x5d(i69Var);
            i69.x(x5dVar);
            basePendingResult2 = x5dVar;
        } else {
            basePendingResult2 = i69.t();
        }
        this.l = basePendingResult2;
        basePendingResult2.i(new k5f(this, (byte) 0));
    }

    public final long d() {
        fy6 e = this.c.e();
        if (e == null) {
            return 0L;
        }
        MediaInfo mediaInfo = e.a;
        int i = mediaInfo == null ? -1 : mediaInfo.b;
        int i2 = e.e;
        int i3 = e.f;
        int i4 = e.x;
        if (i2 == 1) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        return 0L;
                    }
                } else if (i != 2) {
                    return 0L;
                }
            }
            if (i4 == 0) {
                return 0L;
            }
        }
        return e.b;
    }

    public final void e() {
        synchronized (this.m) {
            Iterator it = this.m.iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
        }
    }

    public final void f() {
        synchronized (this.m) {
            Iterator it = this.m.iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
        }
    }

    public final void g() {
        synchronized (this.m) {
            Iterator it = this.m.iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
        }
    }

    public final void h() {
        synchronized (this.m) {
            Iterator it = this.m.iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
        }
    }
}
