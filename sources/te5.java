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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class te5 extends ak6 {
    public static final AtomicInteger d0 = new AtomicInteger();
    public final boolean E;
    public final int F;
    public final o63 G;
    public final u63 H;
    public final h31 I;
    public final boolean J;
    public final boolean K;
    public final uob L;
    public final pa3 M;
    public final List N;
    public final qq3 O;
    public final tj5 P;
    public final xu7 Q;
    public final boolean R;
    public final boolean S;
    public h31 T;
    public tf5 U;
    public int V;
    public boolean W;
    public volatile boolean X;
    public boolean Y;
    public w59 Z;
    public boolean a0;
    public long b0;
    public boolean c0;
    public final int w;
    public final int x;
    public final Uri y;

    public te5(pa3 pa3Var, o63 o63Var, u63 u63Var, fm4 fm4Var, boolean z, o63 o63Var2, u63 u63Var2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, uob uobVar, qq3 qq3Var, h31 h31Var, tj5 tj5Var, xu7 xu7Var, boolean z6, boolean z7, uc8 uc8Var, String str) {
        super(o63Var, u63Var, fm4Var, i, obj, j, j2, j3, str);
        this.R = z;
        this.F = i2;
        this.b0 = z3 ? j2 - j : -9223372036854775807L;
        this.x = i3;
        this.H = u63Var2;
        this.G = o63Var2;
        this.W = u63Var2 != null;
        this.S = z2;
        this.y = uri;
        this.J = z5;
        this.L = uobVar;
        this.K = z4;
        this.M = pa3Var;
        this.N = list;
        this.O = qq3Var;
        this.I = h31Var;
        this.P = tj5Var;
        this.Q = xu7Var;
        this.c0 = z6;
        this.E = z7;
        km5 km5Var = mm5.b;
        this.Z = w59.e;
        this.w = d0.getAndIncrement();
    }

    public static byte[] f(String str) {
        if (smd.c(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // k86
    public final void a() {
        h31 h31Var;
        this.U.getClass();
        if (this.T == null && (h31Var = this.I) != null) {
            j74 a = ((j74) h31Var.b).a();
            if ((a instanceof j2c) || (a instanceof dp4)) {
                this.T = this.I;
                this.W = false;
            }
        }
        u63 u63Var = this.H;
        o63 o63Var = this.G;
        if (this.W) {
            o63Var.getClass();
            u63Var.getClass();
            e(o63Var, u63Var, this.S);
            this.V = 0;
            this.W = false;
        }
        if (this.X) {
            return;
        }
        if (!this.K) {
            e(this.r, this.b, this.R);
        }
        this.Y = !this.X;
    }

    @Override // k86
    public final void d() {
        this.X = true;
    }

    public final void e(o63 o63Var, u63 u63Var, boolean z) {
        u63 b;
        boolean z2;
        int i = this.V;
        if (z) {
            z2 = i != 0;
            b = u63Var;
        } else {
            b = u63Var.b(i);
            z2 = false;
        }
        try {
            ja3 i2 = i(o63Var, b);
            if (z2) {
                i2.l(this.V, false);
            }
            while (!this.X && ((j74) this.T.b).b(i2, h31.f) == 0) {
                try {
                    try {
                    } catch (EOFException e) {
                        if ((this.d.f & TLObject.FLAG_14) == 0) {
                            long j = u63Var.f;
                            if (j != -1 && i2.d >= u63Var.e + j) {
                                throw av7.a(null, e);
                            }
                            throw e;
                        }
                        ((j74) this.T.b).d(0L, 0L);
                    }
                } finally {
                    this.V = (int) (i2.d - u63Var.e);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            vbe.a(o63Var);
            throw th;
        }
        vbe.a(o63Var);
    }

    public final int g(int i) {
        gre.p(!this.c0);
        w59 w59Var = this.Z;
        if (i >= w59Var.d) {
            return 0;
        }
        return ((Integer) w59Var.get(i)).intValue();
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
    
        if (((lj8) r13).b.equals("com.apple.streaming.transportStreamTimestamp") == false) goto L22;
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
    /* JADX WARN: Type inference failed for: r5v4, types: [j74] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [j74, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ja3 i(o63 o63Var, u63 u63Var) {
        int i;
        ja3 ja3Var;
        long j;
        long j2;
        long j3;
        long j4;
        h31 h31Var;
        h31 h31Var2;
        int i2;
        int i3;
        fm4 fm4Var;
        int i4;
        ArrayList arrayList;
        int i5;
        j74 e4Var;
        ?? r5;
        boolean z;
        int i6;
        int i7;
        int i8;
        ?? r30;
        j74 hf7Var;
        jd7 jd7Var;
        long j5 = this.h;
        uob uobVar = this.L;
        long open = o63Var.open(u63Var);
        try {
            uobVar.h(j5, this.J);
            ja3 ja3Var2 = new ja3(o63Var, u63Var.e, open);
            int i9 = 0;
            if (this.T == null) {
                xu7 xu7Var = this.Q;
                ja3Var2.f = 0;
                try {
                    xu7Var.K(10);
                    ja3Var2.d(xu7Var.a, 0, 10, false);
                } catch (EOFException unused) {
                    ja3Var = null;
                    j = -9223372036854775807L;
                }
                if (xu7Var.D() != 4801587) {
                    j2 = -9223372036854775807L;
                    ja3Var = null;
                    j = -9223372036854775807L;
                } else {
                    xu7Var.O(3);
                    int z2 = xu7Var.z();
                    int i10 = z2 + 10;
                    ja3Var = null;
                    byte[] bArr = xu7Var.a;
                    j = -9223372036854775807L;
                    if (i10 > bArr.length) {
                        xu7Var.K(i10);
                        System.arraycopy(bArr, 0, xu7Var.a, 0, 10);
                    }
                    ja3Var2.d(xu7Var.a, 10, z2, false);
                    ld7 c = this.P.c(z2, xu7Var.a);
                    if (c != null) {
                        jd7[] jd7VarArr = c.a;
                        int length = jd7VarArr.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                jd7Var = null;
                                break;
                            }
                            jd7 jd7Var2 = jd7VarArr[i11];
                            if (lj8.class.isAssignableFrom(jd7Var2.getClass())) {
                                jd7Var = (jd7) lj8.class.cast(jd7Var2);
                            }
                            jd7Var = null;
                            if (jd7Var != null) {
                                break;
                            }
                            i11++;
                        }
                        lj8 lj8Var = (lj8) jd7Var;
                        if (lj8Var != null) {
                            System.arraycopy(lj8Var.c, 0, xu7Var.a, 0, 8);
                            xu7Var.N(0);
                            xu7Var.M(8);
                            j2 = xu7Var.u() & 8589934591L;
                        }
                    }
                    j2 = j;
                }
                ja3Var2.f = 0;
                h31 h31Var3 = this.I;
                if (h31Var3 != null) {
                    uob uobVar2 = (uob) h31Var3.d;
                    j74 j74Var = (j74) h31Var3.b;
                    j74 a = j74Var.a();
                    gre.p(!((a instanceof j2c) || (a instanceof dp4)));
                    boolean z3 = j74Var.a() == j74Var;
                    Class<?> cls = j74Var.getClass();
                    if (!z3) {
                        sc8.j(nue.a("Can't recreate wrapped extractors. Outer type: %s", cls));
                        return ja3Var;
                    }
                    if (j74Var instanceof cvc) {
                        hf7Var = new cvc(((fm4) h31Var3.c).d, uobVar2, (eef) h31Var3.e, h31Var3.a);
                    } else if (j74Var instanceof kb) {
                        hf7Var = new kb(0);
                    } else if (j74Var instanceof e4) {
                        hf7Var = new e4();
                    } else if (j74Var instanceof g4) {
                        hf7Var = new g4();
                    } else {
                        if (!(j74Var instanceof hf7)) {
                            sc8.j("Unexpected extractor type for recreation: ".concat(j74Var.getClass().getSimpleName()));
                            return ja3Var;
                        }
                        hf7Var = new hf7(0);
                    }
                    h31Var2 = new h31(hf7Var, (fm4) h31Var3.c, uobVar2, (eef) h31Var3.e, h31Var3.a);
                    j3 = j5;
                    i = 0;
                    j4 = 0;
                } else {
                    Uri uri = u63Var.a;
                    Map responseHeaders = o63Var.getResponseHeaders();
                    pa3 pa3Var = this.M;
                    pa3Var.getClass();
                    fm4 fm4Var2 = this.d;
                    int a2 = ege.a(fm4Var2.t);
                    List list = (List) responseHeaders.get("Content-Type");
                    int a3 = ege.a((list == null || list.isEmpty()) ? ja3Var : (String) list.get(0));
                    int b = ege.b(uri);
                    ArrayList arrayList2 = new ArrayList(7);
                    pa3.d(a2, arrayList2);
                    pa3.d(a3, arrayList2);
                    pa3.d(b, arrayList2);
                    int i12 = 0;
                    for (int i13 = 7; i12 < i13; i13 = 7) {
                        pa3.d(pa3.d[i12], arrayList2);
                        i12++;
                    }
                    ja3Var2.f = 0;
                    int i14 = 0;
                    ja3 ja3Var3 = ja3Var;
                    while (true) {
                        if (i14 >= arrayList2.size()) {
                            j3 = j5;
                            i = i9;
                            j4 = 0;
                            ja3Var3.getClass();
                            h31Var = new h31(ja3Var3, fm4Var2, uobVar, (eef) pa3Var.c, pa3Var.a);
                            break;
                        }
                        int intValue = ((Integer) arrayList2.get(i14)).intValue();
                        if (intValue == 0) {
                            j3 = j5;
                            i2 = a3;
                            i3 = intValue;
                            fm4Var = fm4Var2;
                            i4 = a2;
                            arrayList = arrayList2;
                            i5 = i14;
                            j4 = 0;
                            e4Var = new e4();
                        } else if (intValue == 1) {
                            j3 = j5;
                            i2 = a3;
                            i3 = intValue;
                            fm4Var = fm4Var2;
                            i4 = a2;
                            arrayList = arrayList2;
                            i5 = i14;
                            j4 = 0;
                            e4Var = new g4();
                        } else if (intValue == 2) {
                            j3 = j5;
                            i2 = a3;
                            i3 = intValue;
                            fm4Var = fm4Var2;
                            i4 = a2;
                            arrayList = arrayList2;
                            i5 = i14;
                            j4 = 0;
                            e4Var = new kb(0);
                        } else if (intValue != 7) {
                            List list2 = this.N;
                            sab sabVar = sab.B;
                            j3 = j5;
                            if (intValue != 8) {
                                if (intValue == 11) {
                                    int i15 = a3;
                                    sab sabVar2 = (eef) pa3Var.c;
                                    boolean z4 = pa3Var.a;
                                    if (list2 != null) {
                                        i8 = 48;
                                    } else {
                                        em4 em4Var = new em4();
                                        em4Var.s = ud7.n("application/cea-608");
                                        list2 = Collections.singletonList(new fm4(em4Var));
                                        i8 = 16;
                                    }
                                    String str = fm4Var2.l;
                                    if (TextUtils.isEmpty(str)) {
                                        r30 = z4;
                                    } else {
                                        boolean z5 = z4;
                                        if (ud7.b(str, "audio/mp4a-latm") == null) {
                                            i8 |= 2;
                                        }
                                        r30 = z5;
                                        if (ud7.b(str, "video/avc") == null) {
                                            i8 |= 4;
                                            r30 = z5;
                                        }
                                    }
                                    if (r30 != 0) {
                                        sabVar = sabVar2;
                                    }
                                    arrayList = arrayList2;
                                    fm4Var = fm4Var2;
                                    i4 = a2;
                                    i5 = i14;
                                    j4 = 0;
                                    uob uobVar3 = uobVar;
                                    i2 = i15;
                                    i3 = intValue;
                                    uobVar = uobVar3;
                                    r5 = new j2c(2, r30 ^ 1, sabVar, uobVar3, new dd(i8, list2, (byte) 6));
                                } else if (intValue != 13) {
                                    i2 = a3;
                                    i3 = intValue;
                                    fm4Var = fm4Var2;
                                    i4 = a2;
                                    arrayList = arrayList2;
                                    i5 = i14;
                                    r5 = ja3Var;
                                    j4 = 0;
                                } else {
                                    i3 = intValue;
                                    fm4Var = fm4Var2;
                                    i4 = a2;
                                    arrayList = arrayList2;
                                    i5 = i14;
                                    j4 = 0;
                                    r5 = new cvc(fm4Var2.d, uobVar, (eef) pa3Var.c, pa3Var.a);
                                    i2 = a3;
                                }
                                r5.getClass();
                                z = r5.c(ja3Var2);
                                int i16 = 0;
                                ja3Var2.f = 0;
                                if (!z) {
                                    i = i16;
                                    h31Var = new h31(r5, fm4Var, uobVar, (eef) pa3Var.c, pa3Var.a);
                                    break;
                                }
                                int i17 = i16;
                                fm4Var2 = fm4Var;
                                if (ja3Var3 == null && ((i6 = i3) == i4 || i6 == i2 || i6 == b || i6 == 11)) {
                                    ja3Var3 = r5;
                                }
                                a2 = i4;
                                i14 = i5 + 1;
                                i9 = i17;
                                arrayList2 = arrayList;
                                a3 = i2;
                                j5 = j3;
                            } else {
                                i2 = a3;
                                fm4Var = fm4Var2;
                                i4 = a2;
                                arrayList = arrayList2;
                                i5 = i14;
                                List list3 = list2;
                                j4 = 0;
                                sab sabVar3 = (eef) pa3Var.c;
                                boolean z6 = pa3Var.a;
                                byte b2 = pa3Var.b;
                                if (z6) {
                                    sabVar = sabVar3;
                                    i7 = 4;
                                } else {
                                    i7 = 36;
                                }
                                int g = i7 | dp4.g(b2);
                                if (list3 == null) {
                                    km5 km5Var = mm5.b;
                                    list3 = w59.e;
                                }
                                i3 = intValue;
                                e4Var = new dp4(sabVar, g, uobVar, list3, null);
                            }
                        } else {
                            j3 = j5;
                            i2 = a3;
                            i3 = intValue;
                            fm4Var = fm4Var2;
                            i4 = a2;
                            arrayList = arrayList2;
                            i5 = i14;
                            j4 = 0;
                            e4Var = new hf7(0, 0L);
                        }
                        r5 = e4Var;
                        r5.getClass();
                        z = r5.c(ja3Var2);
                        int i162 = 0;
                        ja3Var2.f = 0;
                        if (!z) {
                        }
                    }
                    h31Var2 = h31Var;
                }
                h31 h31Var4 = h31Var2;
                this.T = h31Var4;
                j74 a4 = ((j74) h31Var4.b).a();
                if ((a4 instanceof kb) || (a4 instanceof e4) || (a4 instanceof g4) || (a4 instanceof hf7)) {
                    tf5 tf5Var = this.U;
                    long b3 = j2 != j ? uobVar.b(j2) : j3;
                    if (tf5Var.n0 != b3) {
                        tf5Var.n0 = b3;
                        sf5[] sf5VarArr = tf5Var.M;
                        int length2 = sf5VarArr.length;
                        for (int i18 = i; i18 < length2; i18++) {
                            sf5 sf5Var = sf5VarArr[i18];
                            if (sf5Var.I != b3) {
                                sf5Var.I = b3;
                                sf5Var.C = true;
                            }
                        }
                    }
                } else {
                    tf5 tf5Var2 = this.U;
                    if (tf5Var2.n0 != j4) {
                        tf5Var2.n0 = j4;
                        sf5[] sf5VarArr2 = tf5Var2.M;
                        int length3 = sf5VarArr2.length;
                        for (int i19 = i; i19 < length3; i19++) {
                            sf5 sf5Var2 = sf5VarArr2[i19];
                            if (sf5Var2.I != j4) {
                                sf5Var2.I = j4;
                                sf5Var2.C = true;
                            }
                        }
                    }
                }
                this.U.O.clear();
                ((j74) this.T.b).f(this.U);
            } else {
                i = 0;
            }
            tf5 tf5Var3 = this.U;
            qq3 qq3Var = tf5Var3.o0;
            qq3 qq3Var2 = this.O;
            if (!Objects.equals(qq3Var, qq3Var2)) {
                tf5Var3.o0 = qq3Var2;
                int i20 = i;
                while (true) {
                    sf5[] sf5VarArr3 = tf5Var3.M;
                    if (i20 >= sf5VarArr3.length) {
                        break;
                    }
                    if (tf5Var3.f0[i20]) {
                        sf5 sf5Var3 = sf5VarArr3[i20];
                        sf5Var3.L = qq3Var2;
                        sf5Var3.C = true;
                    }
                    i20++;
                }
            }
            return ja3Var2;
        } catch (InterruptedException unused2) {
            throw new InterruptedIOException();
        } catch (TimeoutException e) {
            throw new IOException(e);
        }
    }
}
