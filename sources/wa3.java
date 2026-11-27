// default package

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class wa3 implements pr3 {
    public final Set E;
    public int F;
    public d64 G;
    public ta3 H;
    public ta3 I;
    public Looper J;
    public Handler K;
    public byte[] L;
    public ig8 M;
    public volatile d1 N;
    public final UUID a;
    public final xi4 b;
    public final vh4 c;
    public final HashMap d;
    public final boolean e;
    public final int[] f;
    public final boolean h;
    public final qx6 n;
    public final z6f r;
    public final ri6 s;
    public final int w;
    public final ArrayList x;
    public final Set y;

    public wa3(UUID uuid, vh4 vh4Var, HashMap hashMap, boolean z, int[] iArr, boolean z2, z6f z6fVar) {
        uuid.getClass();
        yve.e("Use C.CLEARKEY_UUID instead", !o51.c.equals(uuid));
        this.a = uuid;
        this.b = qr4.d;
        this.c = vh4Var;
        this.d = hashMap;
        this.e = z;
        this.f = iArr;
        this.h = z2;
        this.r = z6fVar;
        this.n = new qx6((byte) 19);
        this.s = new ri6(this, (byte) 25);
        this.x = new ArrayList();
        this.y = Collections.newSetFromMap(new IdentityHashMap());
        this.E = Collections.newSetFromMap(new IdentityHashMap());
        this.w = 300000;
    }

    public static boolean d(ta3 ta3Var) {
        ta3Var.p();
        if (ta3Var.p != 1) {
            return false;
        }
        ir3 g = ta3Var.g();
        g.getClass();
        Throwable cause = g.getCause();
        return (cause instanceof ResourceBusyException) || ije.c(cause);
    }

    public static ArrayList h(hr3 hr3Var, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(hr3Var.d);
        for (int i = 0; i < hr3Var.d; i++) {
            gr3 gr3Var = hr3Var.a[i];
            if ((gr3Var.a(uuid) || (o51.d.equals(uuid) && gr3Var.a(o51.c))) && (gr3Var.e != null || z)) {
                arrayList.add(gr3Var);
            }
        }
        return arrayList;
    }

    @Override // pr3
    public final void a() {
        d64 sjfVar;
        j(true);
        int i = this.F;
        this.F = i + 1;
        if (i != 0) {
            return;
        }
        if (this.G == null) {
            UUID uuid = this.a;
            this.b.getClass();
            try {
                try {
                    sjfVar = new qr4(uuid);
                } catch (gac unused) {
                    efd.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                    sjfVar = new sjf((byte) 18);
                }
                this.G = sjfVar;
                sjfVar.m(new wz4(this));
                return;
            } catch (UnsupportedSchemeException e) {
                throw new gac(e);
            } catch (Exception e2) {
                throw new gac(e2);
            }
        }
        if (this.w == -9223372036854775807L) {
            return;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.x;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((ta3) arrayList.get(i2)).d(null);
            i2++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (or4.c == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jr3 b(Looper looper, mr3 mr3Var, ko4 ko4Var, boolean z) {
        ArrayList arrayList;
        if (this.N == null) {
            this.N = new d1(this, looper, (byte) 3);
        }
        hr3 hr3Var = ko4Var.x;
        int i = 0;
        ta3 ta3Var = null;
        if (hr3Var == null) {
            int h = dg7.h(ko4Var.t);
            d64 d64Var = this.G;
            d64Var.getClass();
            if (d64Var.v() == 2) {
                HashSet hashSet = gt6.a;
            }
            int[] iArr = this.f;
            while (true) {
                if (i >= iArr.length) {
                    i = -1;
                    break;
                }
                if (iArr[i] == h) {
                    break;
                }
                i++;
            }
            if (i != -1 && d64Var.v() != 1) {
                ta3 ta3Var2 = this.H;
                if (ta3Var2 == null) {
                    no5 no5Var = po5.b;
                    ta3 g = g(j99.e, true, null, z);
                    this.x.add(g);
                    this.H = g;
                } else {
                    ta3Var2.d(null);
                }
                return this.H;
            }
            return null;
        }
        if (this.L == null) {
            arrayList = h(hr3Var, this.a, false);
            if (arrayList.isEmpty()) {
                ua3 ua3Var = new ua3("Media does not support uuid: " + this.a);
                efd.d("DefaultDrmSessionMgr", "DRM error", ua3Var);
                if (mr3Var != null) {
                    mr3Var.d(ua3Var);
                }
                return new t44(new ir3(6003, ua3Var));
            }
        } else {
            arrayList = null;
        }
        if (this.e) {
            ArrayList arrayList2 = this.x;
            int size = arrayList2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                Object obj = arrayList2.get(i2);
                i2++;
                ta3 ta3Var3 = (ta3) obj;
                if (Objects.equals(ta3Var3.a, arrayList)) {
                    ta3Var = ta3Var3;
                    break;
                }
            }
        } else {
            ta3Var = this.I;
        }
        if (ta3Var != null) {
            ta3Var.d(mr3Var);
            return ta3Var;
        }
        ta3 g2 = g(arrayList, false, mr3Var, z);
        if (!this.e) {
            this.I = g2;
        }
        this.x.add(g2);
        return g2;
    }

    @Override // pr3
    public final jr3 c(mr3 mr3Var, ko4 ko4Var) {
        j(false);
        yve.p(this.F > 0);
        this.J.getClass();
        return b(this.J, mr3Var, ko4Var, true);
    }

    public final ta3 e(List list, boolean z, mr3 mr3Var) {
        this.G.getClass();
        boolean z2 = this.h | z;
        d64 d64Var = this.G;
        byte[] bArr = this.L;
        Looper looper = this.J;
        looper.getClass();
        ig8 ig8Var = this.M;
        ig8Var.getClass();
        ta3 ta3Var = new ta3(this.a, d64Var, this.n, this.s, list, z2, z, bArr, this.d, this.c, looper, this.r, ig8Var);
        ta3Var.d(mr3Var);
        if (this.w != -9223372036854775807L) {
            ta3Var.d(null);
        }
        return ta3Var;
    }

    @Override // pr3
    public final or3 f(mr3 mr3Var, ko4 ko4Var) {
        yve.p(this.F > 0);
        this.J.getClass();
        va3 va3Var = new va3(this, mr3Var);
        Handler handler = this.K;
        handler.getClass();
        handler.post(new bv2(va3Var, ko4Var, (byte) 26));
        return va3Var;
    }

    public final ta3 g(List list, boolean z, mr3 mr3Var, boolean z2) {
        ta3 e = e(list, z, mr3Var);
        boolean d = d(e);
        int i = this.w;
        Set set = this.E;
        if (d && !set.isEmpty()) {
            v9c it = bp5.q(set).iterator();
            while (it.hasNext()) {
                ((jr3) it.next()).c(null);
            }
            e.c(mr3Var);
            if (i != -9223372036854775807L) {
                e.c(null);
            }
            e = e(list, z, mr3Var);
        }
        if (d(e) && z2) {
            Set set2 = this.y;
            if (!set2.isEmpty()) {
                v9c it2 = bp5.q(set2).iterator();
                while (it2.hasNext()) {
                    ((va3) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    v9c it3 = bp5.q(set).iterator();
                    while (it3.hasNext()) {
                        ((jr3) it3.next()).c(null);
                    }
                }
                e.c(mr3Var);
                if (i != -9223372036854775807L) {
                    e.c(null);
                }
                return e(list, z, mr3Var);
            }
        }
        return e;
    }

    public final void i() {
        if (this.G != null && this.F == 0 && this.x.isEmpty() && this.y.isEmpty()) {
            d64 d64Var = this.G;
            d64Var.getClass();
            d64Var.release();
            this.G = null;
        }
    }

    public final void j(boolean z) {
        if (z && this.J == null) {
            efd.g("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.J;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            efd.g("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.J.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // pr3
    public final void release() {
        j(true);
        int i = this.F - 1;
        this.F = i;
        if (i != 0) {
            return;
        }
        if (this.w != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.x);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((ta3) arrayList.get(i2)).c(null);
            }
        }
        v9c it = bp5.q(this.y).iterator();
        while (it.hasNext()) {
            ((va3) it.next()).release();
        }
        i();
    }

    @Override // pr3
    public final void w(Looper looper, ig8 ig8Var) {
        synchronized (this) {
            Looper looper2 = this.J;
            if (looper2 == null) {
                this.J = looper;
                this.K = new Handler(looper);
            } else {
                yve.p(looper2 == looper);
                this.K.getClass();
            }
        }
        this.M = ig8Var;
    }

    @Override // pr3
    public final int x(ko4 ko4Var) {
        j(false);
        d64 d64Var = this.G;
        d64Var.getClass();
        int v = d64Var.v();
        hr3 hr3Var = ko4Var.x;
        if (hr3Var == null) {
            int h = dg7.h(ko4Var.t);
            int i = 0;
            while (true) {
                int[] iArr = this.f;
                if (i >= iArr.length) {
                    i = -1;
                    break;
                }
                if (iArr[i] == h) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                return 0;
            }
        } else if (this.L == null) {
            UUID uuid = this.a;
            if (h(hr3Var, uuid, true).isEmpty()) {
                if (hr3Var.d == 1 && hr3Var.a[0].a(o51.c)) {
                    efd.f("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = hr3Var.c;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : Build.VERSION.SDK_INT < 25)) {
                return 1;
            }
        }
        return v;
    }
}
