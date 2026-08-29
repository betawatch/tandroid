package q4;

import android.net.Uri;
import android.text.TextUtils;
import f5.c0;
import f5.d0;
import f5.w;
import h7.m5;
import i7.n6;
import j3.s0;
import j3.t0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import q8.l0;
import q8.x;
import q8.z;
import y3.b0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k extends n4.k {
    public static final AtomicInteger X = new AtomicInteger();
    public final int A;
    public final com.google.android.exoplayer2.upstream.m B;
    public final com.google.android.exoplayer2.upstream.q C;
    public final b D;
    public final boolean E;
    public final boolean F;
    public final c0 G;
    public final j H;
    public final List I;
    public final n3.c J;
    public final g4.i K;
    public final w L;
    public final boolean M;
    public final boolean N;
    public b O;
    public r P;
    public int Q;
    public boolean R;
    public volatile boolean S;
    public boolean T;
    public z U;
    public boolean V;
    public boolean W;
    public final int v;
    public final int w;
    public final Uri x;
    public final boolean y;

    public k(j jVar, com.google.android.exoplayer2.upstream.m mVar, com.google.android.exoplayer2.upstream.q qVar, t0 t0Var, boolean z10, com.google.android.exoplayer2.upstream.m mVar2, com.google.android.exoplayer2.upstream.q qVar2, boolean z11, Uri uri, List list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, c0 c0Var, n3.c cVar, b bVar, g4.i iVar, w wVar, boolean z15, k3.k kVar) {
        super(mVar, qVar, t0Var, i10, obj, j10, j11, j12);
        this.M = z10;
        this.A = i11;
        this.W = z12;
        this.w = i12;
        this.C = qVar2;
        this.B = mVar2;
        this.R = qVar2 != null;
        this.N = z11;
        this.x = uri;
        this.E = z14;
        this.G = c0Var;
        this.F = z13;
        this.H = jVar;
        this.I = list;
        this.J = cVar;
        this.D = bVar;
        this.K = iVar;
        this.L = wVar;
        this.y = z15;
        x xVar = z.b;
        this.U = l0.e;
        this.v = X.getAndIncrement();
    }

    public static byte[] e(String str) {
        if (n6.b(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // com.google.android.exoplayer2.upstream.n0
    public final void a() {
        b bVar;
        this.P.getClass();
        if (this.O == null && (bVar = this.D) != null) {
            o3.k kVar = bVar.a;
            if ((kVar instanceof b0) || (kVar instanceof w3.i)) {
                this.O = bVar;
                this.R = false;
            }
        }
        com.google.android.exoplayer2.upstream.q qVar = this.C;
        com.google.android.exoplayer2.upstream.m mVar = this.B;
        if (this.R) {
            mVar.getClass();
            qVar.getClass();
            d(mVar, qVar, this.N);
            this.Q = 0;
            this.R = false;
        }
        if (this.S) {
            return;
        }
        if (!this.F) {
            d(this.r, this.b, this.M);
        }
        this.T = !this.S;
    }

    @Override // n4.k
    public final boolean c() {
        throw null;
    }

    public final void d(com.google.android.exoplayer2.upstream.m mVar, com.google.android.exoplayer2.upstream.q qVar, boolean z10) {
        com.google.android.exoplayer2.upstream.q a2;
        long j10;
        if (z10) {
            r0 = this.Q != 0;
            a2 = qVar;
        } else {
            a2 = qVar.a(this.Q);
        }
        try {
            try {
                o3.h g10 = g(mVar, a2);
                if (r0) {
                    g10.t(this.Q);
                }
                while (!this.S && this.O.a.d(g10, b.d) == 0) {
                    try {
                        try {
                        } catch (EOFException e10) {
                            if ((this.d.e & 16384) == 0) {
                                throw e10;
                            }
                            this.O.a.f(0L, 0L);
                            j10 = g10.d;
                        }
                    } catch (Throwable th2) {
                        this.Q = (int) (g10.d - qVar.e);
                        throw th2;
                    }
                }
                j10 = g10.d;
                this.Q = (int) (j10 - qVar.e);
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        } finally {
            m5.a(mVar);
        }
    }

    public final int f(int i10) {
        f5.a.i(!this.y);
        if (i10 >= this.U.size()) {
            return 0;
        }
        return ((Integer) this.U.get(i10)).intValue();
    }

    public final o3.h g(com.google.android.exoplayer2.upstream.m mVar, com.google.android.exoplayer2.upstream.q qVar) {
        int i10;
        int i11;
        long j10;
        long j11;
        b bVar;
        b bVar2;
        int i12;
        ArrayList arrayList;
        List list;
        o3.k aVar;
        boolean z10;
        boolean z11;
        List singletonList;
        int i13;
        o3.k dVar;
        long open = mVar.open(qVar);
        try {
            c0 c0Var = this.G;
            boolean z12 = this.E;
            long j12 = this.h;
            synchronized (c0Var) {
                try {
                    i10 = 1;
                    i11 = 0;
                    f5.a.i(c0Var.a == 9223372036854775806L);
                    if (c0Var.b == -9223372036854775807L) {
                        if (z12) {
                            c0Var.d.set(Long.valueOf(j12));
                        } else {
                            while (c0Var.b == -9223372036854775807L) {
                                c0Var.wait();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            o3.h hVar = new o3.h(mVar, qVar.e, open);
            if (this.O == null) {
                w wVar = this.L;
                hVar.f = 0;
                try {
                    wVar.z(10);
                    hVar.f(wVar.a, 0, 10, false);
                    if (wVar.t() == 4801587) {
                        wVar.D(3);
                        int q6 = wVar.q();
                        int i14 = q6 + 10;
                        byte[] bArr = wVar.a;
                        if (i14 > bArr.length) {
                            wVar.z(i14);
                            System.arraycopy(bArr, 0, wVar.a, 0, 10);
                        }
                        hVar.f(wVar.a, 10, q6, false);
                        b4.c c3 = this.K.c(q6, wVar.a);
                        if (c3 != null) {
                            for (b4.b bVar3 : c3.a) {
                                if (bVar3 instanceof g4.m) {
                                    g4.m mVar2 = (g4.m) bVar3;
                                    if ("com.apple.streaming.transportStreamTimestamp".equals(mVar2.b)) {
                                        System.arraycopy(mVar2.c, 0, wVar.a, 0, 8);
                                        wVar.C(0);
                                        wVar.B(8);
                                        j10 = wVar.l() & 8589934591L;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } catch (EOFException unused) {
                }
                j10 = -9223372036854775807L;
                hVar.f = 0;
                b bVar4 = this.D;
                if (bVar4 != null) {
                    c0 c0Var2 = bVar4.c;
                    t0 t0Var = bVar4.b;
                    o3.k kVar = bVar4.a;
                    f5.a.i(!((kVar instanceof b0) || (kVar instanceof w3.i)));
                    o3.k kVar2 = bVar4.a;
                    if (kVar2 instanceof v) {
                        dVar = new v(t0Var.c, c0Var2);
                    } else if (kVar2 instanceof y3.d) {
                        dVar = new y3.d(0);
                    } else if (kVar2 instanceof y3.a) {
                        dVar = new y3.a();
                    } else if (kVar2 instanceof y3.c) {
                        dVar = new y3.c();
                    } else {
                        if (!(kVar2 instanceof v3.d)) {
                            throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(kVar2.getClass().getSimpleName()));
                        }
                        dVar = new v3.d(0);
                    }
                    bVar2 = new b(dVar, t0Var, c0Var2);
                    j11 = -9223372036854775807L;
                } else {
                    j jVar = this.H;
                    Uri uri = qVar.a;
                    t0 t0Var2 = this.d;
                    List list2 = this.I;
                    c0 c0Var3 = this.G;
                    j11 = -9223372036854775807L;
                    Map responseHeaders = mVar.getResponseHeaders();
                    ((c) jVar).getClass();
                    int w10 = f5.a.w(t0Var2.B);
                    List list3 = (List) responseHeaders.get("Content-Type");
                    int w11 = f5.a.w((list3 == null || list3.isEmpty()) ? null : (String) list3.get(0));
                    int x4 = f5.a.x(uri);
                    int[] iArr = c.b;
                    ArrayList arrayList2 = new ArrayList(7);
                    c.a(w10, arrayList2);
                    c.a(w11, arrayList2);
                    c.a(x4, arrayList2);
                    int i15 = 0;
                    for (int i16 = 7; i15 < i16; i16 = 7) {
                        c.a(iArr[i15], arrayList2);
                        i15++;
                    }
                    hVar.f = 0;
                    int i17 = 0;
                    o3.k kVar3 = null;
                    while (true) {
                        if (i17 >= arrayList2.size()) {
                            kVar3.getClass();
                            bVar = new b(kVar3, t0Var2, c0Var3);
                            break;
                        }
                        int intValue = ((Integer) arrayList2.get(i17)).intValue();
                        if (intValue == 0) {
                            i12 = i17;
                            arrayList = arrayList2;
                            list = list2;
                            aVar = new y3.a();
                        } else if (intValue == i10) {
                            i12 = i17;
                            arrayList = arrayList2;
                            list = list2;
                            aVar = new y3.c();
                        } else if (intValue == 2) {
                            i12 = i17;
                            arrayList = arrayList2;
                            list = list2;
                            aVar = new y3.d(0);
                        } else if (intValue != 7) {
                            if (intValue == 8) {
                                i12 = i17;
                                arrayList = arrayList2;
                                b4.c cVar = t0Var2.s;
                                if (cVar != null) {
                                    int i18 = 0;
                                    while (true) {
                                        b4.b[] bVarArr = cVar.a;
                                        b4.c cVar2 = cVar;
                                        if (i18 >= bVarArr.length) {
                                            break;
                                        }
                                        b4.b bVar5 = bVarArr[i18];
                                        if (bVar5 instanceof u) {
                                            z11 = !((u) bVar5).c.isEmpty();
                                            break;
                                        }
                                        i18++;
                                        cVar = cVar2;
                                    }
                                }
                                z11 = false;
                                aVar = new w3.i(z11 ? 4 : 0, c0Var3, list2 != null ? list2 : Collections.EMPTY_LIST, null);
                            } else if (intValue == 11) {
                                if (list2 != null) {
                                    i13 = 48;
                                    singletonList = list2;
                                } else {
                                    s0 s0Var = new s0();
                                    s0Var.o = "application/cea-608";
                                    singletonList = Collections.singletonList(new t0(s0Var));
                                    i13 = 16;
                                }
                                i12 = i17;
                                String str = t0Var2.r;
                                if (TextUtils.isEmpty(str)) {
                                    arrayList = arrayList2;
                                } else {
                                    arrayList = arrayList2;
                                    if (f5.o.a(str, MediaController.AUDIO_MIME_TYPE) == null) {
                                        i13 |= 2;
                                    }
                                    if (f5.o.a(str, MediaController.VIDEO_MIME_TYPE) == null) {
                                        i13 |= 4;
                                    }
                                }
                                aVar = new b0(2, c0Var3, new o0.i(i13, singletonList));
                            } else if (intValue != 13) {
                                i12 = i17;
                                arrayList = arrayList2;
                                list = list2;
                                aVar = null;
                            } else {
                                aVar = new v(t0Var2.c, c0Var3);
                                i12 = i17;
                                arrayList = arrayList2;
                            }
                            list = list2;
                        } else {
                            i12 = i17;
                            arrayList = arrayList2;
                            list = list2;
                            aVar = new v3.d(0, 0L);
                        }
                        aVar.getClass();
                        try {
                            z10 = aVar.e(hVar);
                            i11 = 0;
                            hVar.f = 0;
                        } catch (EOFException unused2) {
                            i11 = 0;
                            hVar.f = 0;
                            z10 = false;
                        } catch (Throwable th3) {
                            hVar.f = 0;
                            throw th3;
                        }
                        if (z10) {
                            bVar = new b(aVar, t0Var2, c0Var3);
                            break;
                        }
                        if (kVar3 == null && (intValue == w10 || intValue == w11 || intValue == x4 || intValue == 11)) {
                            kVar3 = aVar;
                        }
                        list2 = list;
                        i17 = i12 + 1;
                        arrayList2 = arrayList;
                        i10 = 1;
                    }
                    bVar2 = bVar;
                }
                this.O = bVar2;
                o3.k kVar4 = bVar2.a;
                if ((kVar4 instanceof y3.d) || (kVar4 instanceof y3.a) || (kVar4 instanceof y3.c) || (kVar4 instanceof v3.d)) {
                    r rVar = this.P;
                    long b10 = j10 != j11 ? this.G.b(j10) : this.h;
                    if (rVar.h0 != b10) {
                        rVar.h0 = b10;
                        for (q qVar2 : rVar.H) {
                            if (qVar2.F != b10) {
                                qVar2.F = b10;
                                qVar2.z = true;
                            }
                        }
                    }
                } else {
                    r rVar2 = this.P;
                    if (rVar2.h0 != 0) {
                        rVar2.h0 = 0L;
                        for (q qVar3 : rVar2.H) {
                            if (qVar3.F != 0) {
                                qVar3.F = 0L;
                                qVar3.z = true;
                            }
                        }
                    }
                }
                this.P.J.clear();
                this.O.a.i(this.P);
            }
            r rVar3 = this.P;
            n3.c cVar3 = this.J;
            if (!d0.a(rVar3.i0, cVar3)) {
                rVar3.i0 = cVar3;
                while (true) {
                    q[] qVarArr = rVar3.H;
                    if (i11 >= qVarArr.length) {
                        break;
                    }
                    if (rVar3.a0[i11]) {
                        q qVar4 = qVarArr[i11];
                        qVar4.I = cVar3;
                        qVar4.z = true;
                    }
                    i11++;
                }
            }
            return hVar;
        } catch (InterruptedException unused3) {
            throw new InterruptedIOException();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.n0
    public final void q() {
        this.S = true;
    }
}
