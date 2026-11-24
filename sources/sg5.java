// default package

import android.net.Uri;
import android.text.TextUtils;
import j$.util.Objects;
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
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class sg5 extends dm6 {
    public static final AtomicInteger d0 = new AtomicInteger();
    public final boolean E;
    public final int F;
    public final a83 G;
    public final g83 H;
    public final p41 I;
    public final boolean J;
    public final boolean K;
    public final vqb L;
    public final bc3 M;
    public final List N;
    public final as3 O;
    public final sl5 P;
    public final yw7 Q;
    public final boolean R;
    public final boolean S;
    public p41 T;
    public sh5 U;
    public int V;
    public boolean W;
    public volatile boolean X;
    public boolean Y;
    public y79 Z;
    public boolean a0;
    public long b0;
    public boolean c0;
    public final int w;
    public final int x;
    public final Uri y;

    public sg5(bc3 bc3Var, a83 a83Var, g83 g83Var, go4 go4Var, boolean z, a83 a83Var2, g83 g83Var2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, vqb vqbVar, as3 as3Var, p41 p41Var, sl5 sl5Var, yw7 yw7Var, boolean z6, boolean z7, we8 we8Var, String str) {
        super(a83Var, g83Var, go4Var, i, obj, j, j2, j3, str);
        this.R = z;
        this.F = i2;
        this.b0 = z3 ? j2 - j : -9223372036854775807L;
        this.x = i3;
        this.H = g83Var2;
        this.G = a83Var2;
        this.W = g83Var2 != null;
        this.S = z2;
        this.y = uri;
        this.J = z5;
        this.L = vqbVar;
        this.K = z4;
        this.M = bc3Var;
        this.N = list;
        this.O = as3Var;
        this.I = p41Var;
        this.P = sl5Var;
        this.Q = yw7Var;
        this.c0 = z6;
        this.E = z7;
        ko5 ko5Var = mo5.b;
        this.Z = y79.e;
        this.w = d0.getAndIncrement();
    }

    public static byte[] f(String str) {
        if (vod.c(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // ja6
    public final void a() {
        p41 p41Var;
        this.U.getClass();
        if (this.T == null && (p41Var = this.I) != null) {
            s84 a = ((s84) p41Var.b).a();
            if ((a instanceof j4c) || (a instanceof er4)) {
                this.T = this.I;
                this.W = false;
            }
        }
        g83 g83Var = this.H;
        a83 a83Var = this.G;
        if (this.W) {
            a83Var.getClass();
            g83Var.getClass();
            d(a83Var, g83Var, this.S);
            this.V = 0;
            this.W = false;
        }
        if (this.X) {
            return;
        }
        if (!this.K) {
            d(this.r, this.b, this.R);
        }
        this.Y = !this.X;
    }

    public final void d(a83 a83Var, g83 g83Var, boolean z) {
        g83 b;
        boolean z2;
        int i = this.V;
        if (z) {
            z2 = i != 0;
            b = g83Var;
        } else {
            b = g83Var.b(i);
            z2 = false;
        }
        try {
            vb3 i2 = i(a83Var, b);
            if (z2) {
                i2.m(this.V, false);
            }
            while (!this.X && ((s84) this.T.b).b(i2, p41.f) == 0) {
                try {
                    try {
                    } catch (EOFException e) {
                        if ((this.d.f & TLObject.FLAG_14) == 0) {
                            long j = g83Var.f;
                            if (j != -1 && i2.d >= g83Var.e + j) {
                                throw bx7.a(null, e);
                            }
                            throw e;
                        }
                        ((s84) this.T.b).d(0L, 0L);
                    }
                } finally {
                    this.V = (int) (i2.d - g83Var.e);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            wde.a(a83Var);
            throw th;
        }
        wde.a(a83Var);
    }

    @Override // ja6
    public final void e() {
        this.X = true;
    }

    public final int g(int i) {
        jte.p(!this.c0);
        y79 y79Var = this.Z;
        if (i >= y79Var.d) {
            return 0;
        }
        return ((Integer) y79Var.get(i)).intValue();
    }

    public final boolean h() {
        return this.b0 != -9223372036854775807L;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:109|(2:111|(2:113|(2:115|(2:117|(7:119|(2:121|(1:123)(1:150))(7:151|(1:153)(1:167)|154|155|(4:157|(1:159)|160|(1:162))(1:166)|(1:164)|165)|124|125|126|127|(2:142|143)(3:129|(2:139|140)|138))(5:168|(1:170)(1:176)|171|(1:173)|174))(1:177))(1:178))(1:179))(1:180)|175|124|125|126|127|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x033f, code lost:
    
        r6 = 0;
        r8.f = 0;
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x033a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x033b, code lost:
    
        r8.f = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x033e, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x009a, code lost:
    
        if (((ol8) r13).b.equals("com.apple.streaming.transportStreamTimestamp") == false) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0345 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v5 */
    /* JADX WARN: Type inference failed for: r30v6 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v4, types: [s84] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, s84] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vb3 i(a83 a83Var, g83 g83Var) {
        int i;
        vb3 vb3Var;
        long j;
        long j2;
        long j3;
        long j4;
        p41 p41Var;
        p41 p41Var2;
        int i2;
        int i3;
        go4 go4Var;
        int i4;
        ArrayList arrayList;
        int i5;
        Object e4Var;
        ?? r5;
        boolean z;
        int i6;
        int i7;
        int i8;
        ?? r30;
        s84 kh7Var;
        lf7 lf7Var;
        long j5 = this.h;
        vqb vqbVar = this.L;
        long open = a83Var.open(g83Var);
        try {
            vqbVar.h(j5, this.J);
            vb3 vb3Var2 = new vb3(a83Var, g83Var.e, open);
            int i9 = 0;
            if (this.T == null) {
                yw7 yw7Var = this.Q;
                vb3Var2.f = 0;
                try {
                    yw7Var.K(10);
                    vb3Var2.d(yw7Var.a, 0, 10, false);
                } catch (EOFException unused) {
                    vb3Var = null;
                    j = -9223372036854775807L;
                }
                if (yw7Var.D() != 4801587) {
                    j2 = -9223372036854775807L;
                    vb3Var = null;
                    j = -9223372036854775807L;
                } else {
                    yw7Var.O(3);
                    int z2 = yw7Var.z();
                    int i10 = z2 + 10;
                    vb3Var = null;
                    byte[] bArr = yw7Var.a;
                    j = -9223372036854775807L;
                    if (i10 > bArr.length) {
                        yw7Var.K(i10);
                        System.arraycopy(bArr, 0, yw7Var.a, 0, 10);
                    }
                    vb3Var2.d(yw7Var.a, 10, z2, false);
                    nf7 c = this.P.c(z2, yw7Var.a);
                    if (c != null) {
                        lf7[] lf7VarArr = c.a;
                        int length = lf7VarArr.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                lf7Var = null;
                                break;
                            }
                            lf7 lf7Var2 = lf7VarArr[i11];
                            if (ol8.class.isAssignableFrom(lf7Var2.getClass())) {
                                lf7Var = (lf7) ol8.class.cast(lf7Var2);
                            }
                            lf7Var = null;
                            if (lf7Var != null) {
                                break;
                            }
                            i11++;
                        }
                        ol8 ol8Var = (ol8) lf7Var;
                        if (ol8Var != null) {
                            System.arraycopy(ol8Var.c, 0, yw7Var.a, 0, 8);
                            yw7Var.N(0);
                            yw7Var.M(8);
                            j2 = yw7Var.u() & 8589934591L;
                        }
                    }
                    j2 = j;
                }
                vb3Var2.f = 0;
                p41 p41Var3 = this.I;
                if (p41Var3 != null) {
                    vqb vqbVar2 = (vqb) p41Var3.d;
                    s84 s84Var = (s84) p41Var3.b;
                    s84 a = s84Var.a();
                    jte.p(!((a instanceof j4c) || (a instanceof er4)));
                    boolean z3 = s84Var.a() == s84Var;
                    Class<?> cls = s84Var.getClass();
                    if (!z3) {
                        dq9.m(pwe.a("Can't recreate wrapped extractors. Outer type: %s", cls));
                        return vb3Var;
                    }
                    if (s84Var instanceof dxc) {
                        kh7Var = new dxc(((go4) p41Var3.c).d, vqbVar2, (fgf) p41Var3.e, p41Var3.a);
                    } else if (s84Var instanceof kb) {
                        kh7Var = new kb(0);
                    } else if (s84Var instanceof e4) {
                        kh7Var = new e4();
                    } else if (s84Var instanceof g4) {
                        kh7Var = new g4();
                    } else {
                        if (!(s84Var instanceof kh7)) {
                            dq9.m("Unexpected extractor type for recreation: ".concat(s84Var.getClass().getSimpleName()));
                            return vb3Var;
                        }
                        kh7Var = new kh7(0);
                    }
                    p41Var2 = new p41(kh7Var, (go4) p41Var3.c, vqbVar2, (fgf) p41Var3.e, p41Var3.a);
                    j3 = j5;
                    i = 0;
                    j4 = 0;
                } else {
                    Uri uri = g83Var.a;
                    Map responseHeaders = a83Var.getResponseHeaders();
                    bc3 bc3Var = this.M;
                    bc3Var.getClass();
                    go4 go4Var2 = this.d;
                    int a2 = fie.a(go4Var2.t);
                    List list = (List) responseHeaders.get("Content-Type");
                    int a3 = fie.a((list == null || list.isEmpty()) ? vb3Var : (String) list.get(0));
                    int b = fie.b(uri);
                    ArrayList arrayList2 = new ArrayList(7);
                    bc3.d(a2, arrayList2);
                    bc3.d(a3, arrayList2);
                    bc3.d(b, arrayList2);
                    int i12 = 0;
                    for (int i13 = 7; i12 < i13; i13 = 7) {
                        bc3.d(bc3.d[i12], arrayList2);
                        i12++;
                    }
                    vb3Var2.f = 0;
                    int i14 = 0;
                    vb3 vb3Var3 = vb3Var;
                    while (true) {
                        if (i14 >= arrayList2.size()) {
                            j3 = j5;
                            i = i9;
                            j4 = 0;
                            vb3Var3.getClass();
                            p41Var = new p41(vb3Var3, go4Var2, vqbVar, (fgf) bc3Var.c, bc3Var.a);
                            break;
                        }
                        int intValue = ((Integer) arrayList2.get(i14)).intValue();
                        if (intValue == 0) {
                            j3 = j5;
                            i2 = a3;
                            i3 = intValue;
                            go4Var = go4Var2;
                            i4 = a2;
                            arrayList = arrayList2;
                            i5 = i14;
                            j4 = 0;
                            e4Var = new e4();
                        } else if (intValue == 1) {
                            j3 = j5;
                            i2 = a3;
                            i3 = intValue;
                            go4Var = go4Var2;
                            i4 = a2;
                            arrayList = arrayList2;
                            i5 = i14;
                            j4 = 0;
                            e4Var = new g4();
                        } else if (intValue == 2) {
                            j3 = j5;
                            i2 = a3;
                            i3 = intValue;
                            go4Var = go4Var2;
                            i4 = a2;
                            arrayList = arrayList2;
                            i5 = i14;
                            j4 = 0;
                            e4Var = new kb(0);
                        } else if (intValue != 7) {
                            List list2 = this.N;
                            tcb tcbVar = tcb.B;
                            j3 = j5;
                            if (intValue != 8) {
                                if (intValue == 11) {
                                    int i15 = a3;
                                    tcb tcbVar2 = (fgf) bc3Var.c;
                                    boolean z4 = bc3Var.a;
                                    if (list2 != null) {
                                        i8 = 48;
                                    } else {
                                        fo4 fo4Var = new fo4();
                                        fo4Var.s = wf7.n("application/cea-608");
                                        list2 = Collections.singletonList(new go4(fo4Var));
                                        i8 = 16;
                                    }
                                    String str = go4Var2.l;
                                    if (TextUtils.isEmpty(str)) {
                                        r30 = z4;
                                    } else {
                                        boolean z5 = z4;
                                        if (wf7.b(str, "audio/mp4a-latm") == null) {
                                            i8 |= 2;
                                        }
                                        r30 = z5;
                                        if (wf7.b(str, "video/avc") == null) {
                                            i8 |= 4;
                                            r30 = z5;
                                        }
                                    }
                                    if (r30 != 0) {
                                        tcbVar = tcbVar2;
                                    }
                                    arrayList = arrayList2;
                                    go4Var = go4Var2;
                                    i4 = a2;
                                    i5 = i14;
                                    j4 = 0;
                                    vqb vqbVar3 = vqbVar;
                                    i2 = i15;
                                    i3 = intValue;
                                    vqbVar = vqbVar3;
                                    r5 = new j4c(2, r30 ^ 1, tcbVar, vqbVar3, new de(i8, list2, (byte) 6));
                                } else if (intValue != 13) {
                                    i2 = a3;
                                    i3 = intValue;
                                    go4Var = go4Var2;
                                    i4 = a2;
                                    arrayList = arrayList2;
                                    i5 = i14;
                                    r5 = vb3Var;
                                    j4 = 0;
                                } else {
                                    i3 = intValue;
                                    go4Var = go4Var2;
                                    i4 = a2;
                                    arrayList = arrayList2;
                                    i5 = i14;
                                    j4 = 0;
                                    r5 = new dxc(go4Var2.d, vqbVar, (fgf) bc3Var.c, bc3Var.a);
                                    i2 = a3;
                                }
                                r5.getClass();
                                z = r5.c(vb3Var2);
                                int i16 = 0;
                                vb3Var2.f = 0;
                                if (!z) {
                                    i = i16;
                                    p41Var = new p41(r5, go4Var, vqbVar, (fgf) bc3Var.c, bc3Var.a);
                                    break;
                                }
                                int i17 = i16;
                                go4Var2 = go4Var;
                                if (vb3Var3 == null && ((i6 = i3) == i4 || i6 == i2 || i6 == b || i6 == 11)) {
                                    vb3Var3 = r5;
                                }
                                a2 = i4;
                                i14 = i5 + 1;
                                i9 = i17;
                                arrayList2 = arrayList;
                                a3 = i2;
                                j5 = j3;
                            } else {
                                i2 = a3;
                                go4Var = go4Var2;
                                i4 = a2;
                                arrayList = arrayList2;
                                i5 = i14;
                                List list3 = list2;
                                j4 = 0;
                                tcb tcbVar3 = (fgf) bc3Var.c;
                                boolean z6 = bc3Var.a;
                                byte b2 = bc3Var.b;
                                if (z6) {
                                    tcbVar = tcbVar3;
                                    i7 = 4;
                                } else {
                                    i7 = 36;
                                }
                                int g = i7 | er4.g(b2);
                                if (list3 == null) {
                                    ko5 ko5Var = mo5.b;
                                    list3 = y79.e;
                                }
                                i3 = intValue;
                                e4Var = new er4(tcbVar, g, vqbVar, list3, null);
                            }
                        } else {
                            j3 = j5;
                            i2 = a3;
                            i3 = intValue;
                            go4Var = go4Var2;
                            i4 = a2;
                            arrayList = arrayList2;
                            i5 = i14;
                            j4 = 0;
                            e4Var = new kh7(0, 0L);
                        }
                        r5 = e4Var;
                        r5.getClass();
                        z = r5.c(vb3Var2);
                        int i162 = 0;
                        vb3Var2.f = 0;
                        if (!z) {
                        }
                    }
                    p41Var2 = p41Var;
                }
                p41 p41Var4 = p41Var2;
                this.T = p41Var4;
                s84 a4 = ((s84) p41Var4.b).a();
                if ((a4 instanceof kb) || (a4 instanceof e4) || (a4 instanceof g4) || (a4 instanceof kh7)) {
                    sh5 sh5Var = this.U;
                    long b3 = j2 != j ? vqbVar.b(j2) : j3;
                    if (sh5Var.n0 != b3) {
                        sh5Var.n0 = b3;
                        rh5[] rh5VarArr = sh5Var.M;
                        int length2 = rh5VarArr.length;
                        for (int i18 = i; i18 < length2; i18++) {
                            rh5 rh5Var = rh5VarArr[i18];
                            if (rh5Var.I != b3) {
                                rh5Var.I = b3;
                                rh5Var.C = true;
                            }
                        }
                    }
                } else {
                    sh5 sh5Var2 = this.U;
                    if (sh5Var2.n0 != j4) {
                        sh5Var2.n0 = j4;
                        rh5[] rh5VarArr2 = sh5Var2.M;
                        int length3 = rh5VarArr2.length;
                        for (int i19 = i; i19 < length3; i19++) {
                            rh5 rh5Var2 = rh5VarArr2[i19];
                            if (rh5Var2.I != j4) {
                                rh5Var2.I = j4;
                                rh5Var2.C = true;
                            }
                        }
                    }
                }
                this.U.O.clear();
                ((s84) this.T.b).f(this.U);
            } else {
                i = 0;
            }
            sh5 sh5Var3 = this.U;
            as3 as3Var = sh5Var3.o0;
            as3 as3Var2 = this.O;
            if (!Objects.equals(as3Var, as3Var2)) {
                sh5Var3.o0 = as3Var2;
                int i20 = i;
                while (true) {
                    rh5[] rh5VarArr3 = sh5Var3.M;
                    if (i20 >= rh5VarArr3.length) {
                        break;
                    }
                    if (sh5Var3.f0[i20]) {
                        rh5 rh5Var3 = rh5VarArr3[i20];
                        rh5Var3.L = as3Var2;
                        rh5Var3.C = true;
                    }
                    i20++;
                }
            }
            return vb3Var2;
        } catch (InterruptedException unused2) {
            throw new InterruptedIOException();
        } catch (TimeoutException e) {
            throw new IOException(e);
        }
    }
}
