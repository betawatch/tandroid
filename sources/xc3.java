// default package

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xc3 {
    public static final y79 q;
    public final aqb a;
    public final ypb b;
    public final ag0 c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final boolean l;
    public final long m;
    public final qo5 n;
    public final ConcurrentHashMap o;
    public long p;

    static {
        ko5 ko5Var = mo5.b;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        ase.a(6, objArr);
        q = mo5.o(6, objArr);
    }

    public xc3(ag0 ag0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, Map map) {
        a(i5, 0, "bufferForPlaybackMs", "0");
        a(i6, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        a(i7, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i8, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        a(i, i5, "minBufferMs", "bufferForPlaybackMs");
        a(i2, i6, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        a(i, i7, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i2, i8, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        a(i3, i, "maxBufferMs", "minBufferMs");
        a(i4, i2, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.a = new aqb();
        this.b = new ypb();
        this.c = ag0Var;
        this.d = hac.T(i);
        this.e = hac.T(i2);
        this.f = hac.T(i3);
        this.g = hac.T(i4);
        this.h = hac.T(i5);
        this.i = hac.T(i6);
        this.j = hac.T(i7);
        this.k = hac.T(i8);
        this.l = z;
        this.m = hac.T(0L);
        this.o = new ConcurrentHashMap();
        this.n = qo5.b(map);
        this.p = -1L;
    }

    public static void a(int i, int i2, String str, String str2) {
        jte.i(i >= i2, "%s cannot be less than %s", str, str2);
    }

    public final int b(we8 we8Var) {
        int i;
        wc3 wc3Var = (wc3) this.o.get(we8Var);
        wc3Var.getClass();
        synchronized (wc3Var) {
            i = wc3Var.d;
        }
        return i << 16;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(aa6 aa6Var) {
        boolean z;
        long j;
        long j2;
        float f;
        long max;
        long j3;
        boolean z2;
        boolean z3;
        int i;
        we8 we8Var = aa6Var.a;
        wc3 wc3Var = (wc3) this.o.get(we8Var);
        wc3Var.getClass();
        int b = b(we8Var);
        wc3 wc3Var2 = (wc3) this.o.get(we8Var);
        wc3Var2.getClass();
        boolean z4 = b >= wc3Var2.c;
        if (we8Var.equals(we8.c)) {
            return !z4;
        }
        bqb bqbVar = aa6Var.b;
        xs6 xs6Var = bqbVar.m(bqbVar.g(aa6Var.c.a, this.b).c, this.a, 0L).b.b;
        if (xs6Var != null) {
            String scheme = xs6Var.a.getScheme();
            if (TextUtils.isEmpty(scheme) || q.contains(scheme)) {
                z = true;
                if (z) {
                    j = this.d;
                    j2 = this.f;
                } else {
                    j = this.e;
                    j2 = this.g;
                }
                f = aa6Var.e;
                if (f > 1.0f) {
                    j = Math.min(hac.D(j, f), j2);
                }
                max = Math.max(j, 500000L);
                j3 = aa6Var.d;
                if (j3 >= max) {
                    boolean z5 = z ? this.l : false;
                    Runtime runtime = Runtime.getRuntime();
                    long maxMemory = runtime.maxMemory();
                    if (runtime.totalMemory() >= maxMemory) {
                        long freeMemory = runtime.freeMemory();
                        ag0 ag0Var = this.c;
                        synchronized (ag0Var) {
                            i = ag0Var.c << 16;
                        }
                        if (freeMemory + i < maxMemory / 25) {
                            z2 = false;
                            z3 = (z5 && z2) || !z4;
                            wc3Var.b = z3;
                            if (!z3 && z5 && !z2) {
                                ncd.e("DefaultLoadControl", "Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
                            }
                            if (!wc3Var.b && aa6Var.d < 500000) {
                                ncd.f("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                            }
                        }
                    }
                    z2 = true;
                    if (z5) {
                        wc3Var.b = z3;
                        if (!z3) {
                            ncd.e("DefaultLoadControl", "Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
                        }
                        if (!wc3Var.b) {
                            ncd.f("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                        }
                    }
                    wc3Var.b = z3;
                    if (!z3) {
                    }
                    if (!wc3Var.b) {
                    }
                } else if (j3 >= j2 || z4) {
                    wc3Var.b = false;
                }
                return wc3Var.b;
            }
        }
        z = false;
        if (z) {
        }
        f = aa6Var.e;
        if (f > 1.0f) {
        }
        max = Math.max(j, 500000L);
        j3 = aa6Var.d;
        if (j3 >= max) {
        }
        return wc3Var.b;
    }

    public final void d() {
        boolean isEmpty = this.o.isEmpty();
        ag0 ag0Var = this.c;
        int i = 0;
        if (isEmpty) {
            synchronized (ag0Var) {
                ag0Var.C(0);
            }
        } else {
            Iterator it = this.o.values().iterator();
            while (it.hasNext()) {
                i += ((wc3) it.next()).c;
            }
            ag0Var.C(i);
        }
    }
}
