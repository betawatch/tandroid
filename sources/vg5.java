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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class vg5 extends fm6 {
    public static final AtomicInteger d0 = new AtomicInteger();
    public final boolean E;
    public final int F;
    public final h73 G;
    public final n73 H;
    public final q31 I;
    public final boolean J;
    public final boolean K;
    public final usb L;
    public final ib3 M;
    public final List N;
    public final hr3 O;
    public final vl5 P;
    public final ey7 Q;
    public final boolean R;
    public final boolean S;
    public q31 T;
    public vh5 U;
    public int V;
    public boolean W;
    public volatile boolean X;
    public boolean Y;
    public j99 Z;
    public boolean a0;
    public long b0;
    public boolean c0;
    public final int w;
    public final int x;
    public final Uri y;

    public vg5(ib3 ib3Var, h73 h73Var, n73 n73Var, ko4 ko4Var, boolean z, h73 h73Var2, n73 n73Var2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, usb usbVar, hr3 hr3Var, q31 q31Var, vl5 vl5Var, ey7 ey7Var, boolean z6, boolean z7, ig8 ig8Var, String str) {
        super(h73Var, n73Var, ko4Var, i, obj, j, j2, j3, str);
        this.R = z;
        this.F = i2;
        this.b0 = z3 ? j2 - j : -9223372036854775807L;
        this.x = i3;
        this.H = n73Var2;
        this.G = h73Var2;
        this.W = n73Var2 != null;
        this.S = z2;
        this.y = uri;
        this.J = z5;
        this.L = usbVar;
        this.K = z4;
        this.M = ib3Var;
        this.N = list;
        this.O = hr3Var;
        this.I = q31Var;
        this.P = vl5Var;
        this.Q = ey7Var;
        this.c0 = z6;
        this.E = z7;
        no5 no5Var = po5.b;
        this.Z = j99.e;
        this.w = d0.getAndIncrement();
    }

    public static byte[] f(String str) {
        if (jrd.c(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // oa6
    public final void a() {
        q31 q31Var;
        this.U.getClass();
        if (this.T == null && (q31Var = this.I) != null) {
            e84 a = ((e84) q31Var.b).a();
            if ((a instanceof j6c) || (a instanceof hr4)) {
                this.T = this.I;
                this.W = false;
            }
        }
        n73 n73Var = this.H;
        h73 h73Var = this.G;
        if (this.W) {
            h73Var.getClass();
            n73Var.getClass();
            e(h73Var, n73Var, this.S);
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

    @Override // oa6
    public final void c() {
        this.X = true;
    }

    public final void e(h73 h73Var, n73 n73Var, boolean z) {
        n73 b;
        boolean z2;
        int i = this.V;
        if (z) {
            z2 = i != 0;
            b = n73Var;
        } else {
            b = n73Var.b(i);
            z2 = false;
        }
        try {
            cb3 i2 = i(h73Var, b);
            if (z2) {
                i2.l(this.V, false);
            }
            while (!this.X && ((e84) this.T.b).b(i2, q31.f) == 0) {
                try {
                    try {
                    } catch (EOFException e) {
                        if ((this.d.f & TLObject.FLAG_14) == 0) {
                            long j = n73Var.f;
                            if (j != -1 && i2.d >= n73Var.e + j) {
                                throw hy7.a(null, e);
                            }
                            throw e;
                        }
                        ((e84) this.T.b).d(0L, 0L);
                    }
                } finally {
                    this.V = (int) (i2.d - n73Var.e);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            lge.a(h73Var);
            throw th;
        }
        lge.a(h73Var);
    }

    public final int g(int i) {
        yve.p(!this.c0);
        j99 j99Var = this.Z;
        if (i >= j99Var.d) {
            return 0;
        }
        return ((Integer) j99Var.get(i)).intValue();
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
    
        if (((ym8) r13).b.equals("com.apple.streaming.transportStreamTimestamp") == false) goto L22;
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
    /* JADX WARN: Type inference failed for: r5v4, types: [e84] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [e84, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cb3 i(h73 h73Var, n73 n73Var) {
        int i;
        cb3 cb3Var;
        long j;
        long j2;
        long j3;
        long j4;
        q31 q31Var;
        q31 q31Var2;
        int i2;
        int i3;
        ko4 ko4Var;
        int i4;
        ArrayList arrayList;
        int i5;
        e84 f4Var;
        ?? r5;
        boolean z;
        int i6;
        int i7;
        int i8;
        ?? r30;
        e84 qh7Var;
        sf7 sf7Var;
        long j5 = this.h;
        usb usbVar = this.L;
        long open = h73Var.open(n73Var);
        try {
            usbVar.h(j5, this.J);
            cb3 cb3Var2 = new cb3(h73Var, n73Var.e, open);
            int i9 = 0;
            if (this.T == null) {
                ey7 ey7Var = this.Q;
                cb3Var2.f = 0;
                try {
                    ey7Var.K(10);
                    cb3Var2.d(ey7Var.a, 0, 10, false);
                } catch (EOFException unused) {
                    cb3Var = null;
                    j = -9223372036854775807L;
                }
                if (ey7Var.D() != 4801587) {
                    j2 = -9223372036854775807L;
                    cb3Var = null;
                    j = -9223372036854775807L;
                } else {
                    ey7Var.O(3);
                    int z2 = ey7Var.z();
                    int i10 = z2 + 10;
                    cb3Var = null;
                    byte[] bArr = ey7Var.a;
                    j = -9223372036854775807L;
                    if (i10 > bArr.length) {
                        ey7Var.K(i10);
                        System.arraycopy(bArr, 0, ey7Var.a, 0, 10);
                    }
                    cb3Var2.d(ey7Var.a, 10, z2, false);
                    uf7 c = this.P.c(z2, ey7Var.a);
                    if (c != null) {
                        sf7[] sf7VarArr = c.a;
                        int length = sf7VarArr.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                sf7Var = null;
                                break;
                            }
                            sf7 sf7Var2 = sf7VarArr[i11];
                            if (ym8.class.isAssignableFrom(sf7Var2.getClass())) {
                                sf7Var = (sf7) ym8.class.cast(sf7Var2);
                            }
                            sf7Var = null;
                            if (sf7Var != null) {
                                break;
                            }
                            i11++;
                        }
                        ym8 ym8Var = (ym8) sf7Var;
                        if (ym8Var != null) {
                            System.arraycopy(ym8Var.c, 0, ey7Var.a, 0, 8);
                            ey7Var.N(0);
                            ey7Var.M(8);
                            j2 = ey7Var.u() & 8589934591L;
                        }
                    }
                    j2 = j;
                }
                cb3Var2.f = 0;
                q31 q31Var3 = this.I;
                if (q31Var3 != null) {
                    usb usbVar2 = (usb) q31Var3.d;
                    e84 e84Var = (e84) q31Var3.b;
                    e84 a = e84Var.a();
                    yve.p(!((a instanceof j6c) || (a instanceof hr4)));
                    boolean z3 = e84Var.a() == e84Var;
                    Class<?> cls = e84Var.getClass();
                    if (!z3) {
                        grb.i(fze.a("Can't recreate wrapped extractors. Outer type: %s", cls));
                        return cb3Var;
                    }
                    if (e84Var instanceof szc) {
                        qh7Var = new szc(((ko4) q31Var3.c).d, usbVar2, (uif) q31Var3.e, q31Var3.a);
                    } else if (e84Var instanceof lb) {
                        qh7Var = new lb(0);
                    } else if (e84Var instanceof f4) {
                        qh7Var = new f4();
                    } else if (e84Var instanceof h4) {
                        qh7Var = new h4();
                    } else {
                        if (!(e84Var instanceof qh7)) {
                            grb.i("Unexpected extractor type for recreation: ".concat(e84Var.getClass().getSimpleName()));
                            return cb3Var;
                        }
                        qh7Var = new qh7(0);
                    }
                    q31Var2 = new q31(qh7Var, (ko4) q31Var3.c, usbVar2, (uif) q31Var3.e, q31Var3.a);
                    j3 = j5;
                    i = 0;
                    j4 = 0;
                } else {
                    Uri uri = n73Var.a;
                    Map responseHeaders = h73Var.getResponseHeaders();
                    ib3 ib3Var = this.M;
                    ib3Var.getClass();
                    ko4 ko4Var2 = this.d;
                    int a2 = zke.a(ko4Var2.t);
                    List list = (List) responseHeaders.get("Content-Type");
                    int a3 = zke.a((list == null || list.isEmpty()) ? cb3Var : (String) list.get(0));
                    int b = zke.b(uri);
                    ArrayList arrayList2 = new ArrayList(7);
                    ib3.d(a2, arrayList2);
                    ib3.d(a3, arrayList2);
                    ib3.d(b, arrayList2);
                    int i12 = 0;
                    for (int i13 = 7; i12 < i13; i13 = 7) {
                        ib3.d(ib3.d[i12], arrayList2);
                        i12++;
                    }
                    cb3Var2.f = 0;
                    int i14 = 0;
                    cb3 cb3Var3 = cb3Var;
                    while (true) {
                        if (i14 >= arrayList2.size()) {
                            j3 = j5;
                            i = i9;
                            j4 = 0;
                            cb3Var3.getClass();
                            q31Var = new q31(cb3Var3, ko4Var2, usbVar, (uif) ib3Var.c, ib3Var.a);
                            break;
                        }
                        int intValue = ((Integer) arrayList2.get(i14)).intValue();
                        if (intValue == 0) {
                            j3 = j5;
                            i2 = a3;
                            i3 = intValue;
                            ko4Var = ko4Var2;
                            i4 = a2;
                            arrayList = arrayList2;
                            i5 = i14;
                            j4 = 0;
                            f4Var = new f4();
                        } else if (intValue == 1) {
                            j3 = j5;
                            i2 = a3;
                            i3 = intValue;
                            ko4Var = ko4Var2;
                            i4 = a2;
                            arrayList = arrayList2;
                            i5 = i14;
                            j4 = 0;
                            f4Var = new h4();
                        } else if (intValue == 2) {
                            j3 = j5;
                            i2 = a3;
                            i3 = intValue;
                            ko4Var = ko4Var2;
                            i4 = a2;
                            arrayList = arrayList2;
                            i5 = i14;
                            j4 = 0;
                            f4Var = new lb(0);
                        } else if (intValue != 7) {
                            List list2 = this.N;
                            peb pebVar = peb.B;
                            j3 = j5;
                            if (intValue != 8) {
                                if (intValue == 11) {
                                    int i15 = a3;
                                    peb pebVar2 = (uif) ib3Var.c;
                                    boolean z4 = ib3Var.a;
                                    if (list2 != null) {
                                        i8 = 48;
                                    } else {
                                        jo4 jo4Var = new jo4();
                                        jo4Var.s = dg7.n("application/cea-608");
                                        list2 = Collections.singletonList(new ko4(jo4Var));
                                        i8 = 16;
                                    }
                                    String str = ko4Var2.l;
                                    if (TextUtils.isEmpty(str)) {
                                        r30 = z4;
                                    } else {
                                        boolean z5 = z4;
                                        if (dg7.b(str, "audio/mp4a-latm") == null) {
                                            i8 |= 2;
                                        }
                                        r30 = z5;
                                        if (dg7.b(str, "video/avc") == null) {
                                            i8 |= 4;
                                            r30 = z5;
                                        }
                                    }
                                    if (r30 != 0) {
                                        pebVar = pebVar2;
                                    }
                                    arrayList = arrayList2;
                                    ko4Var = ko4Var2;
                                    i4 = a2;
                                    i5 = i14;
                                    j4 = 0;
                                    usb usbVar3 = usbVar;
                                    i2 = i15;
                                    i3 = intValue;
                                    usbVar = usbVar3;
                                    r5 = new j6c(2, r30 ^ 1, pebVar, usbVar3, new ed(i8, list2, (byte) 6));
                                } else if (intValue != 13) {
                                    i2 = a3;
                                    i3 = intValue;
                                    ko4Var = ko4Var2;
                                    i4 = a2;
                                    arrayList = arrayList2;
                                    i5 = i14;
                                    r5 = cb3Var;
                                    j4 = 0;
                                } else {
                                    i3 = intValue;
                                    ko4Var = ko4Var2;
                                    i4 = a2;
                                    arrayList = arrayList2;
                                    i5 = i14;
                                    j4 = 0;
                                    r5 = new szc(ko4Var2.d, usbVar, (uif) ib3Var.c, ib3Var.a);
                                    i2 = a3;
                                }
                                r5.getClass();
                                z = r5.c(cb3Var2);
                                int i16 = 0;
                                cb3Var2.f = 0;
                                if (!z) {
                                    i = i16;
                                    q31Var = new q31(r5, ko4Var, usbVar, (uif) ib3Var.c, ib3Var.a);
                                    break;
                                }
                                int i17 = i16;
                                ko4Var2 = ko4Var;
                                if (cb3Var3 == null && ((i6 = i3) == i4 || i6 == i2 || i6 == b || i6 == 11)) {
                                    cb3Var3 = r5;
                                }
                                a2 = i4;
                                i14 = i5 + 1;
                                i9 = i17;
                                arrayList2 = arrayList;
                                a3 = i2;
                                j5 = j3;
                            } else {
                                i2 = a3;
                                ko4Var = ko4Var2;
                                i4 = a2;
                                arrayList = arrayList2;
                                i5 = i14;
                                List list3 = list2;
                                j4 = 0;
                                peb pebVar3 = (uif) ib3Var.c;
                                boolean z6 = ib3Var.a;
                                byte b2 = ib3Var.b;
                                if (z6) {
                                    pebVar = pebVar3;
                                    i7 = 4;
                                } else {
                                    i7 = 36;
                                }
                                int g = i7 | hr4.g(b2);
                                if (list3 == null) {
                                    no5 no5Var = po5.b;
                                    list3 = j99.e;
                                }
                                i3 = intValue;
                                f4Var = new hr4(pebVar, g, usbVar, list3, null);
                            }
                        } else {
                            j3 = j5;
                            i2 = a3;
                            i3 = intValue;
                            ko4Var = ko4Var2;
                            i4 = a2;
                            arrayList = arrayList2;
                            i5 = i14;
                            j4 = 0;
                            f4Var = new qh7(0, 0L);
                        }
                        r5 = f4Var;
                        r5.getClass();
                        z = r5.c(cb3Var2);
                        int i162 = 0;
                        cb3Var2.f = 0;
                        if (!z) {
                        }
                    }
                    q31Var2 = q31Var;
                }
                q31 q31Var4 = q31Var2;
                this.T = q31Var4;
                e84 a4 = ((e84) q31Var4.b).a();
                if ((a4 instanceof lb) || (a4 instanceof f4) || (a4 instanceof h4) || (a4 instanceof qh7)) {
                    vh5 vh5Var = this.U;
                    long b3 = j2 != j ? usbVar.b(j2) : j3;
                    if (vh5Var.n0 != b3) {
                        vh5Var.n0 = b3;
                        uh5[] uh5VarArr = vh5Var.M;
                        int length2 = uh5VarArr.length;
                        for (int i18 = i; i18 < length2; i18++) {
                            uh5 uh5Var = uh5VarArr[i18];
                            if (uh5Var.I != b3) {
                                uh5Var.I = b3;
                                uh5Var.C = true;
                            }
                        }
                    }
                } else {
                    vh5 vh5Var2 = this.U;
                    if (vh5Var2.n0 != j4) {
                        vh5Var2.n0 = j4;
                        uh5[] uh5VarArr2 = vh5Var2.M;
                        int length3 = uh5VarArr2.length;
                        for (int i19 = i; i19 < length3; i19++) {
                            uh5 uh5Var2 = uh5VarArr2[i19];
                            if (uh5Var2.I != j4) {
                                uh5Var2.I = j4;
                                uh5Var2.C = true;
                            }
                        }
                    }
                }
                this.U.O.clear();
                ((e84) this.T.b).f(this.U);
            } else {
                i = 0;
            }
            vh5 vh5Var3 = this.U;
            hr3 hr3Var = vh5Var3.o0;
            hr3 hr3Var2 = this.O;
            if (!Objects.equals(hr3Var, hr3Var2)) {
                vh5Var3.o0 = hr3Var2;
                int i20 = i;
                while (true) {
                    uh5[] uh5VarArr3 = vh5Var3.M;
                    if (i20 >= uh5VarArr3.length) {
                        break;
                    }
                    if (vh5Var3.f0[i20]) {
                        uh5 uh5Var3 = uh5VarArr3[i20];
                        uh5Var3.L = hr3Var2;
                        uh5Var3.C = true;
                    }
                    i20++;
                }
            }
            return cb3Var2;
        } catch (InterruptedException unused2) {
            throw new InterruptedIOException();
        } catch (TimeoutException e) {
            throw new IOException(e);
        }
    }
}
