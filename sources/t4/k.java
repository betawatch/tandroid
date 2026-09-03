package t4;

import android.net.Uri;
import android.text.TextUtils;
import b4.f0;
import h5.c0;
import h5.d0;
import h5.w;
import j3.m0;
import j3.n0;
import j7.p7;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import k7.a7;
import org.telegram.messenger.MediaController;
import s8.i0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class k extends q4.k {
    public static final AtomicInteger Y = new AtomicInteger();
    public final int B;
    public final g5.m C;
    public final g5.p D;
    public final b E;
    public final boolean F;
    public final boolean G;
    public final c0 H;
    public final j I;
    public final List J;
    public final o3.h K;
    public final j4.i L;
    public final w M;
    public final boolean N;
    public final boolean O;
    public b P;
    public r Q;
    public int R;
    public boolean S;
    public volatile boolean T;
    public boolean U;
    public s8.v V;
    public boolean W;
    public boolean X;
    public final int v;
    public final int w;
    public final Uri x;
    public final boolean y;

    public k(j jVar, g5.m mVar, g5.p pVar, n0 n0Var, boolean z4, g5.m mVar2, g5.p pVar2, boolean z10, Uri uri, List list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z11, int i12, boolean z12, boolean z13, c0 c0Var, o3.h hVar, b bVar, j4.i iVar, w wVar, boolean z14, k3.k kVar) {
        super(mVar, pVar, n0Var, i10, obj, j10, j11, j12);
        this.N = z4;
        this.B = i11;
        this.X = z11;
        this.w = i12;
        this.D = pVar2;
        this.C = mVar2;
        this.S = pVar2 != null;
        this.O = z10;
        this.x = uri;
        this.F = z13;
        this.H = c0Var;
        this.G = z12;
        this.I = jVar;
        this.J = list;
        this.K = hVar;
        this.E = bVar;
        this.L = iVar;
        this.M = wVar;
        this.y = z14;
        s8.t tVar = s8.v.b;
        this.V = i0.e;
        this.v = Y.getAndIncrement();
    }

    public static byte[] f(String str) {
        if (a7.b(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // g5.j0
    public final void a() {
        b bVar;
        this.Q.getClass();
        if (this.P == null && (bVar = this.E) != null) {
            r3.k kVar = bVar.a;
            if ((kVar instanceof f0) || (kVar instanceof z3.i)) {
                this.P = bVar;
                this.S = false;
            }
        }
        g5.p pVar = this.D;
        g5.m mVar = this.C;
        if (this.S) {
            mVar.getClass();
            pVar.getClass();
            e(mVar, pVar, this.O);
            this.R = 0;
            this.S = false;
        }
        if (this.T) {
            return;
        }
        if (!this.G) {
            e(this.r, this.b, this.N);
        }
        this.U = !this.T;
    }

    @Override // g5.j0
    public final void b() {
        this.T = true;
    }

    @Override // q4.k
    public final boolean d() {
        throw null;
    }

    public final void e(g5.m mVar, g5.p pVar, boolean z4) {
        g5.p b10;
        long j10;
        if (z4) {
            r0 = this.R != 0;
            b10 = pVar;
        } else {
            b10 = pVar.b(this.R);
        }
        try {
            r3.h h = h(mVar, b10);
            if (r0) {
                h.n(this.R);
            }
            while (!this.T && this.P.a.h(h, b.d) == 0) {
                try {
                    try {
                    } catch (EOFException e) {
                        if ((this.d.e & 16384) == 0) {
                            throw e;
                        }
                        this.P.a.d(0L, 0L);
                        j10 = h.d;
                    }
                } catch (Throwable th2) {
                    this.R = (int) (h.d - pVar.e);
                    throw th2;
                }
            }
            j10 = h.d;
            this.R = (int) (j10 - pVar.e);
        } catch (Exception unused) {
        } catch (Throwable th3) {
            p7.a(mVar);
            throw th3;
        }
        p7.a(mVar);
    }

    public final int g(int i10) {
        h5.a.i(!this.y);
        if (i10 >= this.V.size()) {
            return 0;
        }
        return ((Integer) this.V.get(i10)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r3.h h(g5.m mVar, g5.p pVar) {
        long j10;
        long j11;
        long j12;
        b bVar;
        b bVar2;
        int i10;
        r3.k aVar;
        boolean z4;
        r3.k iVar;
        List list;
        boolean z10;
        int i11;
        r3.k eVar;
        long j13 = this.h;
        c0 c0Var = this.H;
        long open = mVar.open(pVar);
        try {
            c0Var.g(j13, this.F);
            r3.h hVar = new r3.h(mVar, pVar.e, open);
            int i12 = 1;
            if (this.P == null) {
                w wVar = this.M;
                hVar.f = 0;
                try {
                    wVar.C(10);
                    hVar.f(wVar.a, 0, 10, false);
                } catch (EOFException unused) {
                    j10 = -9223372036854775807L;
                }
                if (wVar.w() != 4801587) {
                    j11 = -9223372036854775807L;
                    j10 = -9223372036854775807L;
                } else {
                    wVar.G(3);
                    int t6 = wVar.t();
                    int i13 = t6 + 10;
                    byte[] bArr = wVar.a;
                    j10 = -9223372036854775807L;
                    if (i13 > bArr.length) {
                        wVar.C(i13);
                        System.arraycopy(bArr, 0, wVar.a, 0, 10);
                    }
                    hVar.f(wVar.a, 10, t6, false);
                    e4.c c3 = this.L.c(t6, wVar.a);
                    if (c3 != null) {
                        for (e4.b bVar3 : c3.a) {
                            if (bVar3 instanceof j4.m) {
                                j4.m mVar2 = (j4.m) bVar3;
                                if ("com.apple.streaming.transportStreamTimestamp".equals(mVar2.b)) {
                                    System.arraycopy(mVar2.c, 0, wVar.a, 0, 8);
                                    wVar.F(0);
                                    wVar.E(8);
                                    j11 = wVar.o() & 8589934591L;
                                    break;
                                }
                            }
                        }
                    }
                    j11 = j10;
                }
                hVar.f = 0;
                b bVar4 = this.E;
                if (bVar4 != null) {
                    r3.k kVar = bVar4.a;
                    c0 c0Var2 = bVar4.c;
                    n0 n0Var = bVar4.b;
                    h5.a.i(!((kVar instanceof f0) || (kVar instanceof z3.i)));
                    if (kVar instanceof v) {
                        eVar = new v(n0Var.c, c0Var2);
                    } else if (kVar instanceof b4.d) {
                        eVar = new b4.d(0);
                    } else if (kVar instanceof b4.a) {
                        eVar = new b4.a();
                    } else if (kVar instanceof b4.c) {
                        eVar = new b4.c();
                    } else {
                        if (!(kVar instanceof y3.e)) {
                            throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(kVar.getClass().getSimpleName()));
                        }
                        eVar = new y3.e(0);
                    }
                    bVar2 = new b(eVar, n0Var, c0Var2);
                    j12 = j13;
                } else {
                    Uri uri = pVar.a;
                    Map responseHeaders = mVar.getResponseHeaders();
                    ((c) this.I).getClass();
                    n0 n0Var2 = this.d;
                    int w10 = h5.a.w(n0Var2.C);
                    List list2 = (List) responseHeaders.get("Content-Type");
                    int w11 = h5.a.w((list2 == null || list2.isEmpty()) ? null : (String) list2.get(0));
                    int x10 = h5.a.x(uri);
                    ArrayList arrayList = new ArrayList(7);
                    c.a(w10, arrayList);
                    c.a(w11, arrayList);
                    c.a(x10, arrayList);
                    int i14 = 0;
                    for (int i15 = 7; i14 < i15; i15 = 7) {
                        c.a(c.b[i14], arrayList);
                        i14++;
                    }
                    hVar.f = 0;
                    int i16 = 0;
                    r3.k kVar2 = null;
                    while (true) {
                        if (i16 >= arrayList.size()) {
                            j12 = j13;
                            kVar2.getClass();
                            bVar = new b(kVar2, n0Var2, c0Var);
                            break;
                        }
                        int intValue = ((Integer) arrayList.get(i16)).intValue();
                        j12 = j13;
                        if (intValue == 0) {
                            i10 = i16;
                            aVar = new b4.a();
                        } else if (intValue == i12) {
                            i10 = i16;
                            aVar = new b4.c();
                        } else if (intValue == 2) {
                            i10 = i16;
                            aVar = new b4.d(0);
                        } else if (intValue != 7) {
                            List list3 = this.J;
                            if (intValue == 8) {
                                i10 = i16;
                                e4.c cVar = n0Var2.s;
                                if (cVar == null) {
                                    list = list3;
                                } else {
                                    list = list3;
                                    int i17 = 0;
                                    while (true) {
                                        e4.b[] bVarArr = cVar.a;
                                        e4.c cVar2 = cVar;
                                        if (i17 >= bVarArr.length) {
                                            break;
                                        }
                                        e4.b bVar5 = bVarArr[i17];
                                        if (bVar5 instanceof u) {
                                            z10 = !((u) bVar5).c.isEmpty();
                                            break;
                                        }
                                        i17++;
                                        cVar = cVar2;
                                    }
                                    iVar = new z3.i(!z10 ? 4 : 0, c0Var, list == null ? list : Collections.EMPTY_LIST, null);
                                }
                                z10 = false;
                                iVar = new z3.i(!z10 ? 4 : 0, c0Var, list == null ? list : Collections.EMPTY_LIST, null);
                            } else if (intValue == 11) {
                                if (list3 != null) {
                                    i11 = 48;
                                } else {
                                    m0 m0Var = new m0();
                                    m0Var.o = "application/cea-608";
                                    list3 = Collections.singletonList(new n0(m0Var));
                                    i11 = 16;
                                }
                                String str = n0Var2.r;
                                if (!TextUtils.isEmpty(str)) {
                                    int i18 = i11;
                                    if (h5.o.a(str, MediaController.AUDIO_MIME_TYPE) == null) {
                                        i18 |= 2;
                                    }
                                    i11 = h5.o.a(str, MediaController.VIDEO_MIME_TYPE) != null ? i18 : i18 | 4;
                                }
                                i10 = i16;
                                iVar = new f0(2, c0Var, new b4.f(i11, list3));
                            } else if (intValue != 13) {
                                i10 = i16;
                                aVar = null;
                            } else {
                                aVar = new v(n0Var2.c, c0Var);
                                i10 = i16;
                            }
                            aVar = iVar;
                        } else {
                            i10 = i16;
                            aVar = new y3.e(0, 0L);
                        }
                        aVar.getClass();
                        try {
                            z4 = aVar.i(hVar);
                            hVar.f = 0;
                        } catch (EOFException unused2) {
                            hVar.f = 0;
                            z4 = false;
                        } catch (Throwable th2) {
                            hVar.f = 0;
                            throw th2;
                        }
                        if (z4) {
                            bVar = new b(aVar, n0Var2, c0Var);
                            break;
                        }
                        if (kVar2 == null && (intValue == w10 || intValue == w11 || intValue == x10 || intValue == 11)) {
                            kVar2 = aVar;
                        }
                        i16 = i10 + 1;
                        j13 = j12;
                        i12 = 1;
                    }
                    bVar2 = bVar;
                }
                this.P = bVar2;
                r3.k kVar3 = bVar2.a;
                if ((kVar3 instanceof b4.d) || (kVar3 instanceof b4.a) || (kVar3 instanceof b4.c) || (kVar3 instanceof y3.e)) {
                    r rVar = this.Q;
                    long b10 = j11 != j10 ? c0Var.b(j11) : j12;
                    if (rVar.i0 != b10) {
                        rVar.i0 = b10;
                        for (q qVar : rVar.I) {
                            if (qVar.F != b10) {
                                qVar.F = b10;
                                qVar.z = true;
                            }
                        }
                    }
                } else {
                    r rVar2 = this.Q;
                    if (rVar2.i0 != 0) {
                        rVar2.i0 = 0L;
                        for (q qVar2 : rVar2.I) {
                            if (qVar2.F != 0) {
                                qVar2.F = 0L;
                                qVar2.z = true;
                            }
                        }
                    }
                }
                this.Q.K.clear();
                this.P.a.e(this.Q);
            }
            r rVar3 = this.Q;
            o3.h hVar2 = rVar3.j0;
            o3.h hVar3 = this.K;
            if (!d0.a(hVar2, hVar3)) {
                rVar3.j0 = hVar3;
                int i19 = 0;
                while (true) {
                    q[] qVarArr = rVar3.I;
                    if (i19 >= qVarArr.length) {
                        break;
                    }
                    if (rVar3.b0[i19]) {
                        q qVar3 = qVarArr[i19];
                        qVar3.I = hVar3;
                        qVar3.z = true;
                    }
                    i19++;
                }
            }
            return hVar;
        } catch (InterruptedException unused3) {
            throw new InterruptedIOException();
        } catch (TimeoutException e) {
            throw new IOException(e);
        }
    }
}
