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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xt6 {
    public long b;
    public final k89 c;
    public final edf f;
    public BasePendingResult k;
    public BasePendingResult l;
    public final Set m = DesugarCollections.synchronizedSet(new HashSet());
    public final ce6 a = new ce6("MediaQueue", null);
    public ArrayList d = new ArrayList();
    public final SparseIntArray e = new SparseIntArray();
    public final ArrayList g = new ArrayList();
    public final ArrayDeque h = new ArrayDeque(20);
    public final q79 i = new q79(Looper.getMainLooper(), (byte) 3);
    public final lx3 j = new lx3(this, 4);

    public xt6(k89 k89Var) {
        this.c = k89Var;
        k89Var.p(new ddf(this, (byte) 1));
        this.f = new edf(this);
        this.b = d();
        c();
    }

    public static /* bridge */ /* synthetic */ void a(xt6 xt6Var) {
        SparseIntArray sparseIntArray = xt6Var.e;
        sparseIntArray.clear();
        for (int i = 0; i < xt6Var.d.size(); i++) {
            sparseIntArray.put(((Integer) xt6Var.d.get(i)).intValue(), i);
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
        ite.e("Must be called from the main thread.");
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
        k89 k89Var = this.c;
        k89Var.getClass();
        ite.e("Must be called from the main thread.");
        if (k89Var.w()) {
            z7d z7dVar = new z7d(k89Var);
            k89.x(z7dVar);
            basePendingResult2 = z7dVar;
        } else {
            basePendingResult2 = k89.t();
        }
        this.l = basePendingResult2;
        basePendingResult2.i(new m7f(this, (byte) 0));
    }

    public final long d() {
        f07 e = this.c.e();
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
