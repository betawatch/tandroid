// default package

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.List;
import java.util.logging.Logger;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class ptd implements ywd {
    public static final Unsafe o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final int e;
    public final xkd f;
    public final boolean g;
    public final int[] h;
    public final int[] i;
    public final int[] j;
    public final rud k;
    public final wod l;
    public final m0e m;
    public final bsd n;

    static {
        Unsafe unsafe;
        Logger logger = x1e.a;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new q2((byte) 3));
        } catch (Throwable unused) {
            unsafe = null;
        }
        o = unsafe;
    }

    public ptd(int[] iArr, Object[] objArr, int i, int i2, int i3, xkd xkdVar, boolean z, int[] iArr2, int[] iArr3, int[] iArr4, rud rudVar, wod wodVar, m0e m0eVar, khd khdVar, bsd bsdVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.g = z;
        this.h = iArr2;
        this.i = iArr3;
        this.j = iArr4;
        this.k = rudVar;
        this.l = wodVar;
        this.m = m0eVar;
        this.f = xkdVar;
        this.n = bsdVar;
    }

    public static int A(Object obj, long j) {
        return ((Integer) x1e.l(obj, j)).intValue();
    }

    public static long B(Object obj, long j) {
        return ((Long) x1e.l(obj, j)).longValue();
    }

    public static int k(ywd ywdVar, int i, byte[] bArr, int i2, int i3, omd omdVar, ucd ucdVar) {
        int m = m(ywdVar, bArr, i2, i3, ucdVar);
        while (true) {
            omdVar.add(ucdVar.c);
            if (m >= i3) {
                break;
            }
            int d = r1f.d(bArr, m, ucdVar);
            if (i != ucdVar.a) {
                break;
            }
            m = m(ywdVar, bArr, d, i3, ucdVar);
        }
        return m;
    }

    public static int l(ywd ywdVar, byte[] bArr, int i, int i2, int i3, ucd ucdVar) {
        ptd ptdVar = (ptd) ywdVar;
        Object a = ptdVar.a();
        int j = ptdVar.j(a, bArr, i, i2, i3, ucdVar);
        ptdVar.b(a);
        ucdVar.c = a;
        return j;
    }

    public static int m(ywd ywdVar, byte[] bArr, int i, int i2, ucd ucdVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = r1f.c(i4, bArr, i3, ucdVar);
            i4 = ucdVar.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw xmd.a();
        }
        Object a = ywdVar.a();
        int i6 = i5 + i4;
        ywdVar.c(a, bArr, i5, i6, ucdVar);
        ywdVar.b(a);
        ucdVar.c = a;
        return i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a7 A[EDGE_INSN: B:59:0x01a7->B:60:0x01a7 BREAK  A[LOOP:0: B:18:0x0049->B:29:0x019d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ptd n(iwd iwdVar, rud rudVar, wod wodVar, m0e m0eVar, khd khdVar, bsd bsdVar) {
        int i;
        int i2;
        int i3;
        int[] iArr;
        qjd qjdVar;
        int i4;
        int i5;
        Field b;
        int i6;
        int i7;
        Object obj;
        int i8;
        Field b2;
        Field b3;
        if (!(iwdVar instanceof iwd)) {
            rjb.p();
            return null;
        }
        jwd jwdVar = iwdVar.b;
        int i9 = 1;
        boolean z = (jwdVar.d & 1) != 1;
        if (jwdVar.e == 0) {
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            int i10 = jwdVar.g;
            int i11 = jwdVar.h;
            i = jwdVar.k;
            i2 = i10;
            i3 = i11;
        }
        int[] iArr2 = new int[i << 2];
        Object[] objArr = new Object[i << 1];
        int i12 = jwdVar.i;
        int[] iArr3 = i12 > 0 ? new int[i12] : null;
        int i13 = jwdVar.l;
        int[] iArr4 = i13 > 0 ? new int[i13] : null;
        boolean a = jwdVar.a();
        Class cls = jwdVar.c;
        Object[] objArr2 = jwdVar.b;
        if (a) {
            int i14 = jwdVar.s;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (true) {
                if (i14 >= jwdVar.j || i15 >= ((i14 - i2) << 2)) {
                    int i18 = i9;
                    int i19 = jwdVar.u;
                    qjd qjdVar2 = qjd.s;
                    if (i19 <= qjdVar2.a) {
                        iArr = iArr2;
                        qjdVar = qjdVar2;
                        Field field = jwdVar.x;
                        c8c c8cVar = x1e.d;
                        int objectFieldOffset = (int) c8cVar.a.objectFieldOffset(field);
                        if ((jwdVar.d & 1) == i18 && jwdVar.u <= qjd.d.a) {
                            int i20 = (jwdVar.w / 32) + (jwdVar.f << 1);
                            Object obj2 = objArr2[i20];
                            if (obj2 instanceof Field) {
                                b = (Field) obj2;
                            } else {
                                b = jwd.b(cls, (String) obj2);
                                objArr2[i20] = b;
                            }
                            i5 = (int) c8cVar.a.objectFieldOffset(b);
                            i6 = jwdVar.w % 32;
                            i4 = objectFieldOffset;
                            iArr[i15] = jwdVar.s;
                            int i21 = i15 + 1;
                            int i22 = i5;
                            int i23 = jwdVar.t;
                            int i24 = i4;
                            int i25 = ((i23 & 512) == 0 ? TLObject.FLAG_29 : 0) | ((i23 & 256) == 0 ? TLObject.FLAG_28 : 0);
                            i7 = jwdVar.u;
                            iArr[i21] = i25 | (i7 << 20) | i24;
                            iArr[i15 + 2] = (i6 << 20) | i22;
                            obj = jwdVar.A;
                            if (obj == null) {
                                int i26 = (i15 / 4) << 1;
                                objArr[i26] = obj;
                                Object obj3 = jwdVar.y;
                                if (obj3 != null) {
                                    objArr[i26 + 1] = obj3;
                                } else {
                                    Object obj4 = jwdVar.z;
                                    if (obj4 != null) {
                                        objArr[i26 + 1] = obj4;
                                    }
                                }
                                i8 = 1;
                            } else {
                                Object obj5 = jwdVar.y;
                                if (obj5 != null) {
                                    i8 = 1;
                                    objArr[((i15 / 4) << 1) + 1] = obj5;
                                } else {
                                    i8 = 1;
                                    Object obj6 = jwdVar.z;
                                    if (obj6 != null) {
                                        objArr[((i15 / 4) << 1) + 1] = obj6;
                                    }
                                }
                            }
                            if (i7 != qjdVar.ordinal()) {
                                iArr3[i16] = i15;
                                i16++;
                            } else if (i7 >= 18 && i7 <= 49) {
                                iArr4[i17] = iArr[i21] & 1048575;
                                i17++;
                            }
                            if (jwdVar.a()) {
                                break;
                            }
                            i14 = jwdVar.s;
                        } else {
                            i4 = objectFieldOffset;
                            i5 = 0;
                        }
                    } else {
                        int i27 = jwdVar.v << 1;
                        Object obj7 = objArr2[i27];
                        if (obj7 instanceof Field) {
                            b2 = (Field) obj7;
                        } else {
                            b2 = jwd.b(cls, (String) obj7);
                            objArr2[i27] = b2;
                        }
                        c8c c8cVar2 = x1e.d;
                        iArr = iArr2;
                        qjdVar = qjdVar2;
                        int objectFieldOffset2 = (int) c8cVar2.a.objectFieldOffset(b2);
                        int i28 = (jwdVar.v << 1) + 1;
                        Object obj8 = objArr2[i28];
                        if (obj8 instanceof Field) {
                            b3 = (Field) obj8;
                        } else {
                            b3 = jwd.b(cls, (String) obj8);
                            objArr2[i28] = b3;
                        }
                        i5 = (int) c8cVar2.a.objectFieldOffset(b3);
                        i4 = objectFieldOffset2;
                    }
                    i6 = 0;
                    iArr[i15] = jwdVar.s;
                    int i212 = i15 + 1;
                    int i222 = i5;
                    int i232 = jwdVar.t;
                    int i242 = i4;
                    int i252 = ((i232 & 512) == 0 ? TLObject.FLAG_29 : 0) | ((i232 & 256) == 0 ? TLObject.FLAG_28 : 0);
                    i7 = jwdVar.u;
                    iArr[i212] = i252 | (i7 << 20) | i242;
                    iArr[i15 + 2] = (i6 << 20) | i222;
                    obj = jwdVar.A;
                    if (obj == null) {
                    }
                    if (i7 != qjdVar.ordinal()) {
                    }
                    if (jwdVar.a()) {
                    }
                } else {
                    i8 = i9;
                    for (int i29 = 0; i29 < 4; i29++) {
                        iArr2[i15 + i29] = -1;
                    }
                    iArr = iArr2;
                }
                i15 += 4;
                i9 = i8;
                iArr2 = iArr;
            }
        } else {
            iArr = iArr2;
        }
        return new ptd(iArr, objArr, i2, i3, jwdVar.j, iwdVar.a, z, jwdVar.m, iArr3, iArr4, rudVar, wodVar, m0eVar, khdVar, bsdVar);
    }

    @Override // ywd
    public final Object a() {
        this.k.getClass();
        return this.f.a(4);
    }

    @Override // ywd
    public final void b(Object obj) {
        int[] iArr = this.i;
        if (iArr != null) {
            for (int i : iArr) {
                long v = v(i) & 1048575;
                Object l = x1e.l(obj, v);
                if (l != null) {
                    this.n.getClass();
                    ((ord) l).a = false;
                    x1e.d(obj, v, l);
                }
            }
        }
        int[] iArr2 = this.j;
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                this.l.a(obj, i2);
            }
        }
        this.m.getClass();
        ((xkd) obj).zzjp.d = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x01e4  */
    @Override // ywd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Object obj, byte[] bArr, int i, int i2, ucd ucdVar) {
        int i3;
        int i4;
        g0e g0eVar;
        int e;
        long j;
        Object obj2;
        Unsafe unsafe;
        Object obj3;
        int i5;
        Unsafe unsafe2;
        Object obj4;
        Object a;
        int h;
        ptd ptdVar = this;
        byte[] bArr2 = bArr;
        int i6 = i2;
        ucd ucdVar2 = ucdVar;
        if (!ptdVar.g) {
            j(obj, bArr, i, i6, 0, ucdVar);
            return;
        }
        int i7 = i;
        while (i7 < i6) {
            int i8 = i7 + 1;
            int i9 = bArr2[i7];
            if (i9 < 0) {
                i8 = r1f.c(i9, bArr2, i8, ucdVar2);
                i9 = ucdVar2.a;
            }
            int i10 = i9;
            int i11 = i8;
            int i12 = i10 >>> 3;
            int i13 = i10 & 7;
            int w = ptdVar.w(i12);
            if (w >= 0) {
                int i14 = ptdVar.a[w + 1];
                int i15 = (267386880 & i14) >>> 20;
                long j2 = 1048575 & i14;
                Unsafe unsafe3 = o;
                if (i15 <= 17) {
                    switch (i15) {
                        case 0:
                            if (i13 != 1) {
                                break;
                            } else {
                                x1e.d.m(obj, j2, Double.longBitsToDouble(r1f.h(i11, bArr2)));
                                i7 = i11 + 8;
                                break;
                            }
                        case 1:
                            if (i13 != 5) {
                                break;
                            } else {
                                x1e.d.n(obj, j2, Float.intBitsToFloat(r1f.f(i11, bArr2)));
                                i5 = i11 + 4;
                                i7 = i5;
                                break;
                            }
                        case 2:
                        case 3:
                            if (i13 != 0) {
                                break;
                            } else {
                                e = r1f.e(bArr2, i11, ucdVar2);
                                j = ucdVar2.b;
                                obj2 = obj;
                                unsafe3 = unsafe3;
                                unsafe3.putLong(obj2, j2, j);
                                i7 = e;
                                break;
                            }
                        case 4:
                        case 11:
                            unsafe = unsafe3;
                            obj3 = obj;
                            if (i13 != 0) {
                                break;
                            } else {
                                i5 = r1f.d(bArr2, i11, ucdVar2);
                                unsafe.putInt(obj3, j2, ucdVar2.a);
                                i7 = i5;
                                break;
                            }
                        case 5:
                        case 14:
                            if (i13 != 1) {
                                break;
                            } else {
                                unsafe3.putLong(obj, j2, r1f.h(i11, bArr2));
                                i5 = i11 + 8;
                                i7 = i5;
                                break;
                            }
                        case 6:
                        case 13:
                            if (i13 != 5) {
                                break;
                            } else {
                                unsafe3.putInt(obj, j2, r1f.f(i11, bArr2));
                                i5 = i11 + 4;
                                i7 = i5;
                                break;
                            }
                        case 7:
                            if (i13 != 0) {
                                break;
                            } else {
                                i5 = r1f.e(bArr2, i11, ucdVar2);
                                x1e.d.o(obj, j2, ucdVar2.b != 0);
                                i7 = i5;
                                break;
                            }
                        case 8:
                            unsafe2 = unsafe3;
                            obj4 = obj;
                            if (i13 != 2) {
                                break;
                            } else {
                                if ((i14 & TLObject.FLAG_29) == 0) {
                                    i5 = r1f.d(bArr2, i11, ucdVar2);
                                    int i16 = ucdVar2.a;
                                    if (i16 == 0) {
                                        ucdVar2.c = "";
                                    } else {
                                        ucdVar2.c = new String(bArr2, i5, i16, gld.a);
                                        i5 += i16;
                                    }
                                } else {
                                    i5 = r1f.g(bArr2, i11, ucdVar2);
                                }
                                a = ucdVar2.c;
                                unsafe2.putObject(obj4, j2, a);
                                i7 = i5;
                                break;
                            }
                        case 9:
                            unsafe2 = unsafe3;
                            obj4 = obj;
                            if (i13 != 2) {
                                break;
                            } else {
                                i5 = m(ptdVar.s(w), bArr2, i11, i6, ucdVar2);
                                Object object = unsafe2.getObject(obj4, j2);
                                Object obj5 = ucdVar2.c;
                                if (object == null) {
                                    unsafe2.putObject(obj4, j2, obj5);
                                    i7 = i5;
                                    break;
                                } else {
                                    a = gld.a(object, obj5);
                                    unsafe2.putObject(obj4, j2, a);
                                    i7 = i5;
                                }
                            }
                        case 10:
                            unsafe2 = unsafe3;
                            obj4 = obj;
                            if (i13 != 2) {
                                break;
                            } else {
                                i5 = r1f.i(bArr2, i11, ucdVar2);
                                a = ucdVar2.c;
                                unsafe2.putObject(obj4, j2, a);
                                i7 = i5;
                                break;
                            }
                        case 12:
                            unsafe = unsafe3;
                            obj3 = obj;
                            if (i13 != 0) {
                                break;
                            } else {
                                i5 = r1f.d(bArr2, i11, ucdVar2);
                                unsafe.putInt(obj3, j2, ucdVar2.a);
                                i7 = i5;
                                break;
                            }
                        case 15:
                            if (i13 != 0) {
                                break;
                            } else {
                                i5 = r1f.d(bArr2, i11, ucdVar2);
                                int i17 = ucdVar2.a;
                                unsafe3.putInt(obj, j2, (i17 >>> 1) ^ (-(i17 & 1)));
                                i7 = i5;
                                break;
                            }
                        case 16:
                            if (i13 != 0) {
                                break;
                            } else {
                                e = r1f.e(bArr2, i11, ucdVar2);
                                long j3 = ucdVar2.b;
                                j = (-(j3 & 1)) ^ (j3 >>> 1);
                                obj2 = obj;
                                unsafe3.putLong(obj2, j2, j);
                                i7 = e;
                                break;
                            }
                    }
                } else if (i15 != 27) {
                    i10 = i10;
                    if (i15 <= 49) {
                        h = ptdVar.i(obj, bArr, i11, i2, i10, i12, i13, w, i14, i15, j2, ucdVar);
                        if (h != i11) {
                            bArr2 = bArr;
                            i6 = i2;
                            ucdVar2 = ucdVar;
                            i7 = h;
                        } else {
                            i4 = h;
                            xkd xkdVar = (xkd) obj;
                            g0eVar = xkdVar.zzjp;
                            if (g0eVar == g0e.e) {
                                g0eVar = g0e.b();
                                xkdVar.zzjp = g0eVar;
                            }
                            bArr2 = bArr;
                            ucdVar2 = ucdVar;
                            i7 = r1f.b(i10, bArr, i4, i2, g0eVar, ucdVar);
                            i6 = i2;
                            ptdVar = this;
                        }
                    } else {
                        i3 = i11;
                        if (i15 != 50) {
                            h = ptdVar.h(obj, bArr, i3, i2, i10, i12, i13, i14, i15, j2, w, ucdVar);
                            if (h == i3) {
                                i4 = h;
                                xkd xkdVar2 = (xkd) obj;
                                g0eVar = xkdVar2.zzjp;
                                if (g0eVar == g0e.e) {
                                }
                                bArr2 = bArr;
                                ucdVar2 = ucdVar;
                                i7 = r1f.b(i10, bArr, i4, i2, g0eVar, ucdVar);
                                i6 = i2;
                                ptdVar = this;
                            } else {
                                ptdVar = this;
                                bArr2 = bArr;
                                i6 = i2;
                                ucdVar2 = ucdVar;
                                i7 = h;
                            }
                        } else if (i13 == 2) {
                            ptdVar.o(obj, w, j2);
                            throw null;
                        }
                    }
                } else if (i13 == 2) {
                    omd omdVar = (omd) unsafe3.getObject(obj, j2);
                    if (!((fcd) omdVar).a) {
                        int size = omdVar.size();
                        omdVar = omdVar.f(size == 0 ? 10 : size << 1);
                        unsafe3.putObject(obj, j2, omdVar);
                    }
                    i7 = k(ptdVar.s(w), i10, bArr2, i11, i6, omdVar, ucdVar2);
                    bArr2 = bArr;
                    i6 = i2;
                    ucdVar2 = ucdVar;
                } else {
                    i10 = i10;
                }
                i4 = i3;
                xkd xkdVar22 = (xkd) obj;
                g0eVar = xkdVar22.zzjp;
                if (g0eVar == g0e.e) {
                }
                bArr2 = bArr;
                ucdVar2 = ucdVar;
                i7 = r1f.b(i10, bArr, i4, i2, g0eVar, ucdVar);
                i6 = i2;
                ptdVar = this;
            }
            i3 = i11;
            i4 = i3;
            xkd xkdVar222 = (xkd) obj;
            g0eVar = xkdVar222.zzjp;
            if (g0eVar == g0e.e) {
            }
            bArr2 = bArr;
            ucdVar2 = ucdVar;
            i7 = r1f.b(i10, bArr, i4, i2, g0eVar, ucdVar);
            i6 = i2;
            ptdVar = this;
        }
        if (i7 != i6) {
            throw xmd.b();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // ywd
    public final void d(xkd xkdVar, xkd xkdVar2) {
        xkd xkdVar3;
        long k;
        Unsafe unsafe;
        int i;
        xkdVar2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                xkd xkdVar4 = xkdVar;
                if (this.g) {
                    return;
                }
                jxd.a(this.m, xkdVar4, xkdVar2);
                return;
            }
            int v = v(i2);
            long j = v & 1048575;
            int i3 = iArr[i2];
            switch ((v & 267386880) >>> 20) {
                case 0:
                    xkdVar3 = xkdVar;
                    if (!r(i2, xkdVar2)) {
                        break;
                    } else {
                        c8c c8cVar = x1e.d;
                        c8cVar.m(xkdVar3, j, c8cVar.A(xkdVar2, j));
                        x(xkdVar3, i2);
                        break;
                    }
                case 1:
                    xkdVar3 = xkdVar;
                    if (!r(i2, xkdVar2)) {
                        break;
                    } else {
                        c8c c8cVar2 = x1e.d;
                        c8cVar2.n(xkdVar3, j, c8cVar2.z(xkdVar2, j));
                        x(xkdVar3, i2);
                        break;
                    }
                case 2:
                    xkdVar3 = xkdVar;
                    if (!r(i2, xkdVar2)) {
                        break;
                    }
                    k = x1e.k(xkdVar2, j);
                    unsafe = x1e.d.a;
                    unsafe.putLong(xkdVar3, j, k);
                    x(xkdVar3, i2);
                    break;
                case 3:
                    xkdVar3 = xkdVar;
                    if (!r(i2, xkdVar2)) {
                        break;
                    }
                    k = x1e.k(xkdVar2, j);
                    unsafe = x1e.d.a;
                    unsafe.putLong(xkdVar3, j, k);
                    x(xkdVar3, i2);
                    break;
                case 4:
                    xkdVar3 = xkdVar;
                    if (!r(i2, xkdVar2)) {
                        break;
                    }
                    x1e.c(xkdVar3, x1e.j(xkdVar2, j), j);
                    x(xkdVar3, i2);
                    break;
                case 5:
                    xkdVar3 = xkdVar;
                    if (!r(i2, xkdVar2)) {
                        break;
                    }
                    k = x1e.k(xkdVar2, j);
                    unsafe = x1e.d.a;
                    unsafe.putLong(xkdVar3, j, k);
                    x(xkdVar3, i2);
                    break;
                case 6:
                    xkdVar3 = xkdVar;
                    if (!r(i2, xkdVar2)) {
                        break;
                    }
                    x1e.c(xkdVar3, x1e.j(xkdVar2, j), j);
                    x(xkdVar3, i2);
                    break;
                case 7:
                    xkdVar3 = xkdVar;
                    if (!r(i2, xkdVar2)) {
                        break;
                    } else {
                        c8c c8cVar3 = x1e.d;
                        c8cVar3.o(xkdVar3, j, c8cVar3.y(xkdVar2, j));
                        x(xkdVar3, i2);
                        break;
                    }
                case 8:
                    xkdVar3 = xkdVar;
                    if (!r(i2, xkdVar2)) {
                        break;
                    }
                    x1e.d(xkdVar3, j, x1e.l(xkdVar2, j));
                    x(xkdVar3, i2);
                    break;
                case 9:
                    xkdVar3 = xkdVar;
                    p(xkdVar3, xkdVar2, i2);
                    break;
                case 10:
                    xkdVar3 = xkdVar;
                    if (!r(i2, xkdVar2)) {
                        break;
                    }
                    x1e.d(xkdVar3, j, x1e.l(xkdVar2, j));
                    x(xkdVar3, i2);
                    break;
                case 11:
                    xkdVar3 = xkdVar;
                    if (!r(i2, xkdVar2)) {
                        break;
                    }
                    x1e.c(xkdVar3, x1e.j(xkdVar2, j), j);
                    x(xkdVar3, i2);
                    break;
                case 12:
                    xkdVar3 = xkdVar;
                    if (!r(i2, xkdVar2)) {
                        break;
                    }
                    x1e.c(xkdVar3, x1e.j(xkdVar2, j), j);
                    x(xkdVar3, i2);
                    break;
                case 13:
                    xkdVar3 = xkdVar;
                    if (!r(i2, xkdVar2)) {
                        break;
                    }
                    x1e.c(xkdVar3, x1e.j(xkdVar2, j), j);
                    x(xkdVar3, i2);
                    break;
                case 14:
                    xkdVar3 = xkdVar;
                    if (!r(i2, xkdVar2)) {
                        break;
                    }
                    k = x1e.k(xkdVar2, j);
                    unsafe = x1e.d.a;
                    unsafe.putLong(xkdVar3, j, k);
                    x(xkdVar3, i2);
                    break;
                case 15:
                    xkdVar3 = xkdVar;
                    if (!r(i2, xkdVar2)) {
                        break;
                    }
                    x1e.c(xkdVar3, x1e.j(xkdVar2, j), j);
                    x(xkdVar3, i2);
                    break;
                case 16:
                    if (r(i2, xkdVar2)) {
                        k = x1e.k(xkdVar2, j);
                        unsafe = x1e.d.a;
                        xkdVar3 = xkdVar;
                        unsafe.putLong(xkdVar3, j, k);
                        x(xkdVar3, i2);
                        break;
                    }
                    xkdVar3 = xkdVar;
                    break;
                case 17:
                    p(xkdVar, xkdVar2, i2);
                    xkdVar3 = xkdVar;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case nm7.S /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.l.b(xkdVar, xkdVar2, j);
                    xkdVar3 = xkdVar;
                    break;
                case 50:
                    Class cls = jxd.a;
                    Object l = x1e.l(xkdVar, j);
                    Object l2 = x1e.l(xkdVar2, j);
                    this.n.getClass();
                    x1e.d(xkdVar, j, bsd.a(l, l2));
                    xkdVar3 = xkdVar;
                    break;
                case nm7.n0 /* 51 */:
                case nm7.o0 /* 52 */:
                case nm7.p0 /* 53 */:
                case nm7.q0 /* 54 */:
                case nm7.r0 /* 55 */:
                case 56:
                case nm7.t0 /* 57 */:
                case nm7.u0 /* 58 */:
                case nm7.v0 /* 59 */:
                    if (q(i3, i2, xkdVar2)) {
                        x1e.d(xkdVar, j, x1e.l(xkdVar2, j));
                        i = iArr[i2 + 2];
                        x1e.c(xkdVar, i3, i & 1048575);
                    }
                    xkdVar3 = xkdVar;
                    break;
                case nm7.w0 /* 60 */:
                case nm7.E0 /* 68 */:
                    y(xkdVar, xkdVar2, i2);
                    xkdVar3 = xkdVar;
                    break;
                case nm7.x0 /* 61 */:
                case nm7.y0 /* 62 */:
                case nm7.z0 /* 63 */:
                case 64:
                case 65:
                case nm7.C0 /* 66 */:
                case nm7.D0 /* 67 */:
                    if (q(i3, i2, xkdVar2)) {
                        x1e.d(xkdVar, j, x1e.l(xkdVar2, j));
                        i = iArr[i2 + 2];
                        x1e.c(xkdVar, i3, i & 1048575);
                    }
                    xkdVar3 = xkdVar;
                    break;
                default:
                    xkdVar3 = xkdVar;
                    break;
            }
            i2 += 4;
            xkdVar = xkdVar3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008e, code lost:
    
        if (r4 != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x013a, code lost:
    
        r3 = r8 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0139, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f7, code lost:
    
        if (r4 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x011b, code lost:
    
        r3 = (r3 * 53) + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0117, code lost:
    
        r10 = r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0115, code lost:
    
        if (r4 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0137, code lost:
    
        if (r4 != false) goto L79;
     */
    @Override // ywd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(xkd xkdVar) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int i2;
        Object l;
        Object l2;
        long k;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 4) {
            int v = v(i4);
            int i5 = iArr[i4];
            long j = 1048575 & v;
            int i6 = 1237;
            int i7 = 37;
            switch ((v & 267386880) >>> 20) {
                case 0:
                    i = i3 * 53;
                    doubleToLongBits = Double.doubleToLongBits(x1e.d.A(xkdVar, j));
                    floatToIntBits = gld.b(doubleToLongBits);
                    i3 = floatToIntBits + i;
                    break;
                case 1:
                    i = i3 * 53;
                    floatToIntBits = Float.floatToIntBits(x1e.d.z(xkdVar, j));
                    i3 = floatToIntBits + i;
                    break;
                case 2:
                case 3:
                case 5:
                    i = i3 * 53;
                    doubleToLongBits = x1e.k(xkdVar, j);
                    floatToIntBits = gld.b(doubleToLongBits);
                    i3 = floatToIntBits + i;
                    break;
                case 4:
                case 6:
                    i = i3 * 53;
                    floatToIntBits = x1e.j(xkdVar, j);
                    i3 = floatToIntBits + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean y = x1e.d.y(xkdVar, j);
                    Charset charset = gld.a;
                    break;
                case 8:
                    i = i3 * 53;
                    floatToIntBits = ((String) x1e.l(xkdVar, j)).hashCode();
                    i3 = floatToIntBits + i;
                    break;
                case 9:
                    l = x1e.l(xkdVar, j);
                    break;
                case 10:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case nm7.S /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    i = i3 * 53;
                    l2 = x1e.l(xkdVar, j);
                    floatToIntBits = l2.hashCode();
                    i3 = floatToIntBits + i;
                    break;
                case 11:
                case 12:
                case 13:
                case 15:
                    i = i3 * 53;
                    floatToIntBits = x1e.j(xkdVar, j);
                    i3 = floatToIntBits + i;
                    break;
                case 14:
                case 16:
                    i = i3 * 53;
                    k = x1e.k(xkdVar, j);
                    floatToIntBits = gld.b(k);
                    i3 = floatToIntBits + i;
                    break;
                case 17:
                    l = x1e.l(xkdVar, j);
                    break;
                case nm7.n0 /* 51 */:
                    if (q(i5, i4, xkdVar)) {
                        i = i3 * 53;
                        k = Double.doubleToLongBits(((Double) x1e.l(xkdVar, j)).doubleValue());
                        floatToIntBits = gld.b(k);
                        i3 = floatToIntBits + i;
                        break;
                    } else {
                        break;
                    }
                case nm7.o0 /* 52 */:
                    if (q(i5, i4, xkdVar)) {
                        i = i3 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) x1e.l(xkdVar, j)).floatValue());
                        i3 = floatToIntBits + i;
                        break;
                    } else {
                        break;
                    }
                case nm7.p0 /* 53 */:
                    if (!q(i5, i4, xkdVar)) {
                        break;
                    }
                    i = i3 * 53;
                    k = B(xkdVar, j);
                    floatToIntBits = gld.b(k);
                    i3 = floatToIntBits + i;
                    break;
                case nm7.q0 /* 54 */:
                    if (!q(i5, i4, xkdVar)) {
                        break;
                    }
                    i = i3 * 53;
                    k = B(xkdVar, j);
                    floatToIntBits = gld.b(k);
                    i3 = floatToIntBits + i;
                    break;
                case nm7.r0 /* 55 */:
                    if (!q(i5, i4, xkdVar)) {
                        break;
                    }
                    i = i3 * 53;
                    floatToIntBits = A(xkdVar, j);
                    i3 = floatToIntBits + i;
                    break;
                case 56:
                    if (!q(i5, i4, xkdVar)) {
                        break;
                    }
                    i = i3 * 53;
                    k = B(xkdVar, j);
                    floatToIntBits = gld.b(k);
                    i3 = floatToIntBits + i;
                    break;
                case nm7.t0 /* 57 */:
                    if (!q(i5, i4, xkdVar)) {
                        break;
                    }
                    i = i3 * 53;
                    floatToIntBits = A(xkdVar, j);
                    i3 = floatToIntBits + i;
                    break;
                case nm7.u0 /* 58 */:
                    if (q(i5, i4, xkdVar)) {
                        i2 = i3 * 53;
                        boolean booleanValue = ((Boolean) x1e.l(xkdVar, j)).booleanValue();
                        Charset charset2 = gld.a;
                        break;
                    } else {
                        break;
                    }
                case nm7.v0 /* 59 */:
                    if (!q(i5, i4, xkdVar)) {
                        break;
                    }
                    i = i3 * 53;
                    floatToIntBits = ((String) x1e.l(xkdVar, j)).hashCode();
                    i3 = floatToIntBits + i;
                    break;
                case nm7.w0 /* 60 */:
                    if (!q(i5, i4, xkdVar)) {
                        break;
                    }
                    l2 = x1e.l(xkdVar, j);
                    i = i3 * 53;
                    floatToIntBits = l2.hashCode();
                    i3 = floatToIntBits + i;
                    break;
                case nm7.x0 /* 61 */:
                    if (!q(i5, i4, xkdVar)) {
                        break;
                    }
                    i = i3 * 53;
                    l2 = x1e.l(xkdVar, j);
                    floatToIntBits = l2.hashCode();
                    i3 = floatToIntBits + i;
                    break;
                case nm7.y0 /* 62 */:
                    if (!q(i5, i4, xkdVar)) {
                        break;
                    }
                    i = i3 * 53;
                    floatToIntBits = A(xkdVar, j);
                    i3 = floatToIntBits + i;
                    break;
                case nm7.z0 /* 63 */:
                    if (!q(i5, i4, xkdVar)) {
                        break;
                    }
                    i = i3 * 53;
                    floatToIntBits = A(xkdVar, j);
                    i3 = floatToIntBits + i;
                    break;
                case 64:
                    if (!q(i5, i4, xkdVar)) {
                        break;
                    }
                    i = i3 * 53;
                    floatToIntBits = A(xkdVar, j);
                    i3 = floatToIntBits + i;
                    break;
                case 65:
                    if (!q(i5, i4, xkdVar)) {
                        break;
                    }
                    i = i3 * 53;
                    k = B(xkdVar, j);
                    floatToIntBits = gld.b(k);
                    i3 = floatToIntBits + i;
                    break;
                case nm7.C0 /* 66 */:
                    if (!q(i5, i4, xkdVar)) {
                        break;
                    }
                    i = i3 * 53;
                    floatToIntBits = A(xkdVar, j);
                    i3 = floatToIntBits + i;
                    break;
                case nm7.D0 /* 67 */:
                    if (!q(i5, i4, xkdVar)) {
                        break;
                    }
                    i = i3 * 53;
                    k = B(xkdVar, j);
                    floatToIntBits = gld.b(k);
                    i3 = floatToIntBits + i;
                    break;
                case nm7.E0 /* 68 */:
                    if (!q(i5, i4, xkdVar)) {
                        break;
                    }
                    l2 = x1e.l(xkdVar, j);
                    i = i3 * 53;
                    floatToIntBits = l2.hashCode();
                    i3 = floatToIntBits + i;
                    break;
            }
        }
        this.m.getClass();
        return xkdVar.zzjp.hashCode() + (i3 * 53);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        if (jxd.c(x1e.l(r11, r7), x1e.l(r12, r7)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (x1e.k(r11, r7) == x1e.k(r12, r7)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (x1e.j(r11, r7) == x1e.j(r12, r7)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (x1e.k(r11, r7) == x1e.k(r12, r7)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        if (x1e.j(r11, r7) == x1e.j(r12, r7)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
    
        if (x1e.j(r11, r7) == x1e.j(r12, r7)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
    
        if (x1e.j(r11, r7) == x1e.j(r12, r7)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
    
        if (jxd.c(x1e.l(r11, r7), x1e.l(r12, r7)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f8, code lost:
    
        if (jxd.c(x1e.l(r11, r7), x1e.l(r12, r7)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010e, code lost:
    
        if (jxd.c(x1e.l(r11, r7), x1e.l(r12, r7)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0122, code lost:
    
        if (r5.y(r11, r7) != r5.y(r12, r7)) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0134, code lost:
    
        if (x1e.j(r11, r7) == x1e.j(r12, r7)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0148, code lost:
    
        if (x1e.k(r11, r7) == x1e.k(r12, r7)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0159, code lost:
    
        if (x1e.j(r11, r7) == x1e.j(r12, r7)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016c, code lost:
    
        if (x1e.k(r11, r7) == x1e.k(r12, r7)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017f, code lost:
    
        if (x1e.k(r11, r7) == x1e.k(r12, r7)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0190, code lost:
    
        if (x1e.j(r11, r7) == x1e.j(r12, r7)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a3, code lost:
    
        if (x1e.k(r11, r7) == x1e.k(r12, r7)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (jxd.c(x1e.l(r11, r7), x1e.l(r12, r7)) != false) goto L104;
     */
    @Override // ywd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(xkd xkdVar, xkd xkdVar2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int v = v(i);
                long j = v & 1048575;
                switch ((v & 267386880) >>> 20) {
                    case 0:
                        if (z(xkdVar, xkdVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (z(xkdVar, xkdVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (z(xkdVar, xkdVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (z(xkdVar, xkdVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (z(xkdVar, xkdVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (z(xkdVar, xkdVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (z(xkdVar, xkdVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (z(xkdVar, xkdVar2, i)) {
                            c8c c8cVar = x1e.d;
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (z(xkdVar, xkdVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (z(xkdVar, xkdVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (z(xkdVar, xkdVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (z(xkdVar, xkdVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (z(xkdVar, xkdVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (z(xkdVar, xkdVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (z(xkdVar, xkdVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (z(xkdVar, xkdVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (z(xkdVar, xkdVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (z(xkdVar, xkdVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case nm7.S /* 30 */:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                        z = jxd.c(x1e.l(xkdVar, j), x1e.l(xkdVar2, j));
                        break;
                    case nm7.n0 /* 51 */:
                    case nm7.o0 /* 52 */:
                    case nm7.p0 /* 53 */:
                    case nm7.q0 /* 54 */:
                    case nm7.r0 /* 55 */:
                    case 56:
                    case nm7.t0 /* 57 */:
                    case nm7.u0 /* 58 */:
                    case nm7.v0 /* 59 */:
                    case nm7.w0 /* 60 */:
                    case nm7.x0 /* 61 */:
                    case nm7.y0 /* 62 */:
                    case nm7.z0 /* 63 */:
                    case 64:
                    case 65:
                    case nm7.C0 /* 66 */:
                    case nm7.D0 /* 67 */:
                    case nm7.E0 /* 68 */:
                        long j2 = iArr[i + 2] & 1048575;
                        if (x1e.j(xkdVar, j2) == x1e.j(xkdVar2, j2)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (z) {
                    i += 4;
                }
            } else {
                this.m.getClass();
                if (xkdVar.zzjp.equals(xkdVar2.zzjp)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ywd
    public final boolean g(Object obj) {
        boolean z;
        int[] iArr;
        int i;
        boolean z2 = true;
        z2 = true;
        z2 = true;
        int[] iArr2 = this.h;
        if (iArr2 != null && iArr2.length != 0) {
            int length = iArr2.length;
            int i2 = -1;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                int i5 = iArr2[i3];
                int w = w(i5);
                int v = v(w);
                boolean z3 = this.g;
                if (z3) {
                    z = z2 ? 1 : 0;
                    iArr = iArr2;
                    i = 0;
                } else {
                    int i6 = this.a[w + 2];
                    int i7 = i6 & 1048575;
                    i = (z2 ? 1 : 0) << (i6 >>> 20);
                    if (i7 != i2) {
                        Unsafe unsafe = o;
                        z = z2 ? 1 : 0;
                        iArr = iArr2;
                        i4 = unsafe.getInt(obj, i7);
                        i2 = i7;
                    } else {
                        z = z2 ? 1 : 0;
                        iArr = iArr2;
                    }
                }
                if ((268435456 & v) != 0) {
                    if (!(z3 ? r(w, obj) : (i4 & i) != 0 ? z : false)) {
                        return false;
                    }
                }
                int i8 = (267386880 & v) >>> 20;
                if (i8 == 9 || i8 == 17) {
                    if ((z3 ? r(w, obj) : (i & i4) != 0 ? z : false) && !s(w).g(x1e.l(obj, v & 1048575))) {
                        return false;
                    }
                    i3++;
                    z2 = z;
                    iArr2 = iArr;
                } else {
                    if (i8 != 27) {
                        if (i8 == 60 || i8 == 68) {
                            if (q(i5, w, obj) && !s(w).g(x1e.l(obj, v & 1048575))) {
                                return false;
                            }
                        } else if (i8 != 49) {
                            if (i8 == 50) {
                                Object l = x1e.l(obj, v & 1048575);
                                this.n.getClass();
                                if (!((ord) l).isEmpty()) {
                                    t(w);
                                    throw new NoSuchMethodError();
                                }
                            } else {
                                continue;
                            }
                        }
                        i3++;
                        z2 = z;
                        iArr2 = iArr;
                    }
                    List list = (List) x1e.l(obj, v & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        ywd s = s(w);
                        for (int i9 = 0; i9 < list.size(); i9++) {
                            if (!s.g(list.get(i9))) {
                                return false;
                            }
                        }
                    }
                    i3++;
                    z2 = z;
                    iArr2 = iArr;
                }
            }
        }
        return z2;
    }

    public final int h(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, ucd ucdVar) {
        int i9;
        Object valueOf;
        int i10;
        Object valueOf2;
        int e;
        Object valueOf3;
        int i11;
        Object str;
        Object object;
        long j2 = this.a[i8 + 2] & 1048575;
        Unsafe unsafe = o;
        switch (i7) {
            case nm7.n0 /* 51 */:
                i9 = i;
                if (i5 != 1) {
                    return i9;
                }
                valueOf = Double.valueOf(Double.longBitsToDouble(r1f.h(i9, bArr)));
                unsafe.putObject(obj, j, valueOf);
                e = i9 + 8;
                unsafe.putInt(obj, j2, i4);
                return e;
            case nm7.o0 /* 52 */:
                i10 = i;
                if (i5 != 5) {
                    return i10;
                }
                valueOf2 = Float.valueOf(Float.intBitsToFloat(r1f.f(i10, bArr)));
                unsafe.putObject(obj, j, valueOf2);
                e = i10 + 4;
                unsafe.putInt(obj, j2, i4);
                return e;
            case nm7.p0 /* 53 */:
            case nm7.q0 /* 54 */:
                if (i5 != 0) {
                    return i;
                }
                e = r1f.e(bArr, i, ucdVar);
                valueOf3 = Long.valueOf(ucdVar.b);
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case nm7.r0 /* 55 */:
            case nm7.y0 /* 62 */:
                if (i5 != 0) {
                    return i;
                }
                e = r1f.d(bArr, i, ucdVar);
                valueOf3 = Integer.valueOf(ucdVar.a);
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case 56:
            case 65:
                i9 = i;
                if (i5 != 1) {
                    return i9;
                }
                valueOf = Long.valueOf(r1f.h(i9, bArr));
                unsafe.putObject(obj, j, valueOf);
                e = i9 + 8;
                unsafe.putInt(obj, j2, i4);
                return e;
            case nm7.t0 /* 57 */:
            case 64:
                i10 = i;
                if (i5 != 5) {
                    return i10;
                }
                valueOf2 = Integer.valueOf(r1f.f(i10, bArr));
                unsafe.putObject(obj, j, valueOf2);
                e = i10 + 4;
                unsafe.putInt(obj, j2, i4);
                return e;
            case nm7.u0 /* 58 */:
                if (i5 != 0) {
                    return i;
                }
                e = r1f.e(bArr, i, ucdVar);
                valueOf3 = Boolean.valueOf(ucdVar.b != 0);
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case nm7.v0 /* 59 */:
                if (i5 != 2) {
                    return i;
                }
                e = r1f.d(bArr, i, ucdVar);
                i11 = ucdVar.a;
                if (i11 == 0) {
                    valueOf3 = "";
                    unsafe.putObject(obj, j, valueOf3);
                    unsafe.putInt(obj, j2, i4);
                    return e;
                }
                if ((i6 & TLObject.FLAG_29) != 0) {
                    if (!o2e.a.b(bArr, e, e + i11)) {
                        throw new xmd("Protocol message had invalid UTF-8.");
                    }
                }
                str = new String(bArr, e, i11, gld.a);
                unsafe.putObject(obj, j, str);
                e += i11;
                unsafe.putInt(obj, j2, i4);
                return e;
            case nm7.w0 /* 60 */:
                if (i5 != 2) {
                    return i;
                }
                e = m(s(i8), bArr, i, i2, ucdVar);
                object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                valueOf3 = ucdVar.c;
                if (object != null) {
                    valueOf3 = gld.a(object, valueOf3);
                }
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case nm7.x0 /* 61 */:
                if (i5 != 2) {
                    return i;
                }
                e = r1f.d(bArr, i, ucdVar);
                i11 = ucdVar.a;
                if (i11 == 0) {
                    valueOf3 = efd.c;
                    unsafe.putObject(obj, j, valueOf3);
                    unsafe.putInt(obj, j2, i4);
                    return e;
                }
                str = efd.i(e, i11, bArr);
                unsafe.putObject(obj, j, str);
                e += i11;
                unsafe.putInt(obj, j2, i4);
                return e;
            case nm7.z0 /* 63 */:
                if (i5 != 0) {
                    return i;
                }
                int d = r1f.d(bArr, i, ucdVar);
                int i12 = ucdVar.a;
                u(i8);
                unsafe.putObject(obj, j, Integer.valueOf(i12));
                e = d;
                unsafe.putInt(obj, j2, i4);
                return e;
            case nm7.C0 /* 66 */:
                if (i5 != 0) {
                    return i;
                }
                e = r1f.d(bArr, i, ucdVar);
                int i13 = ucdVar.a;
                valueOf3 = Integer.valueOf((i13 >>> 1) ^ (-(i13 & 1)));
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case nm7.D0 /* 67 */:
                if (i5 != 0) {
                    return i;
                }
                e = r1f.e(bArr, i, ucdVar);
                long j3 = ucdVar.b;
                valueOf3 = Long.valueOf((j3 >>> 1) ^ (-(j3 & 1)));
                unsafe.putObject(obj, j, valueOf3);
                unsafe.putInt(obj, j2, i4);
                return e;
            case nm7.E0 /* 68 */:
                if (i5 == 3) {
                    e = l(s(i8), bArr, i, i2, (i3 & (-8)) | 4, ucdVar);
                    object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    Object obj2 = ucdVar.c;
                    if (object != null) {
                        obj2 = gld.a(object, obj2);
                    }
                    unsafe.putObject(obj, j, obj2);
                    unsafe.putInt(obj, j2, i4);
                    return e;
                }
            default:
                return i;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x016d, code lost:
    
        if (r16 != 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0172, code lost:
    
        if (r16 != 5) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0177, code lost:
    
        if (r16 != 1) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x017c, code lost:
    
        if (r16 == 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0188, code lost:
    
        if (r16 != 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x018d, code lost:
    
        if (r16 != 5) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0192, code lost:
    
        if (r16 != 1) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        if (r16 != 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        if (r16 != 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        if (r16 != 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x017e, code lost:
    
        rjb.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0181, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        if (r12 == 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
    
        r5.add(efd.i(r9, r12, r11));
        r9 = r9 + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0098, code lost:
    
        if (r9 >= r13) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009a, code lost:
    
        r12 = r1f.d(r11, r9, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a0, code lost:
    
        if (r14 != r23.a) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
    
        r9 = r1f.d(r11, r12, r23);
        r12 = r23.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a8, code lost:
    
        if (r12 != 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00aa, code lost:
    
        r5.add(efd.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b9, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0098, code lost:
    
        r5.add(efd.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f8, code lost:
    
        r5.add("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0136, code lost:
    
        r5.add("");
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0138  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00a8 -> B:35:0x00b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x010e -> B:54:0x00f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0156 -> B:68:0x0132). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, ucd ucdVar) {
        Unsafe unsafe = o;
        omd omdVar = (omd) unsafe.getObject(obj, j2);
        if (!((fcd) omdVar).a) {
            int size = omdVar.size();
            omdVar = omdVar.f(size == 0 ? 10 : size << 1);
            unsafe.putObject(obj, j2, omdVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 != 2) {
                }
                rjb.p();
                return 0;
            case 19:
            case 36:
                if (i5 != 2) {
                }
                rjb.p();
                return 0;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 != 2) {
                }
                rjb.p();
                return 0;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 != 2) {
                }
                rjb.p();
                return 0;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 != 2) {
                }
                rjb.p();
                return 0;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 != 2) {
                }
                rjb.p();
                return 0;
            case 25:
            case 42:
                if (i5 != 2) {
                }
                rjb.p();
                return 0;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int d = r1f.d(bArr, i, ucdVar);
                        int i8 = ucdVar.a;
                        if (i8 != 0) {
                            String str = new String(bArr, d, i8, gld.a);
                            omdVar.add(str);
                            d += i8;
                            while (d < i2) {
                                int d2 = r1f.d(bArr, d, ucdVar);
                                if (i3 != ucdVar.a) {
                                    return d;
                                }
                                d = r1f.d(bArr, d2, ucdVar);
                                i8 = ucdVar.a;
                                if (i8 != 0) {
                                    str = new String(bArr, d, i8, gld.a);
                                    omdVar.add(str);
                                    d += i8;
                                    while (d < i2) {
                                    }
                                }
                            }
                            return d;
                        }
                        omdVar.add("");
                    } else {
                        int d3 = r1f.d(bArr, i, ucdVar);
                        int i9 = ucdVar.a;
                        if (i9 != 0) {
                            int i10 = d3 + i9;
                            if (!o2e.a.b(bArr, d3, i10)) {
                                throw new xmd("Protocol message had invalid UTF-8.");
                            }
                            String str2 = new String(bArr, d3, i9, gld.a);
                            omdVar.add(str2);
                            d3 = i10;
                            while (d3 < i2) {
                                int d4 = r1f.d(bArr, d3, ucdVar);
                                if (i3 != ucdVar.a) {
                                    return d3;
                                }
                                d3 = r1f.d(bArr, d4, ucdVar);
                                int i11 = ucdVar.a;
                                if (i11 != 0) {
                                    i10 = d3 + i11;
                                    if (!o2e.a.b(bArr, d3, i10)) {
                                        throw new xmd("Protocol message had invalid UTF-8.");
                                    }
                                    str2 = new String(bArr, d3, i11, gld.a);
                                    omdVar.add(str2);
                                    d3 = i10;
                                    while (d3 < i2) {
                                    }
                                }
                            }
                            return d3;
                        }
                        omdVar.add("");
                    }
                }
                return i;
            case 27:
                if (i5 == 2) {
                    return k(s(i6), i3, bArr, i, i2, omdVar, ucdVar);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    int d5 = r1f.d(bArr, i, ucdVar);
                    int i12 = ucdVar.a;
                    break;
                }
                return i;
            case nm7.S /* 30 */:
            case 44:
                if (i5 != 2) {
                }
                rjb.p();
                return 0;
            case 33:
            case 47:
                if (i5 != 2) {
                }
                rjb.p();
                return 0;
            case 34:
            case 48:
                if (i5 != 2) {
                }
                rjb.p();
                return 0;
            case 49:
                if (i5 == 3) {
                    ywd s = s(i6);
                    int i13 = (i3 & (-8)) | 4;
                    int l = l(s, bArr, i, i2, i13, ucdVar);
                    int i14 = i13;
                    ucd ucdVar2 = ucdVar;
                    omdVar.add(ucdVar2.c);
                    while (l < i2) {
                        int d6 = r1f.d(bArr, l, ucdVar2);
                        if (i3 != ucdVar2.a) {
                            return l;
                        }
                        ucd ucdVar3 = ucdVar2;
                        int i15 = i14;
                        l = l(s, bArr, d6, i2, i15, ucdVar3);
                        omdVar.add(ucdVar3.c);
                        i14 = i15;
                        ucdVar2 = ucdVar3;
                    }
                    return l;
                }
                return i;
            default:
                return i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0366 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0375  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(Object obj, byte[] bArr, int i, int i2, int i3, ucd ucdVar) {
        ptd ptdVar;
        Object obj2;
        int[] iArr;
        int i4;
        Unsafe unsafe;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        g0e g0eVar;
        int i10;
        int i11;
        int i12;
        byte[] bArr2;
        Unsafe unsafe2;
        int i13;
        ucd ucdVar2;
        Unsafe unsafe3;
        int i14;
        int g;
        byte[] bArr3;
        int i15;
        Object a;
        byte[] bArr4;
        int i16;
        ucd ucdVar3;
        int h;
        ptd ptdVar2 = this;
        Object obj3 = obj;
        byte[] bArr5 = bArr;
        int i17 = i2;
        ucd ucdVar4 = ucdVar;
        int i18 = -1;
        int i19 = i;
        int i20 = -1;
        int i21 = 0;
        int i22 = 0;
        while (true) {
            int[] iArr2 = ptdVar2.a;
            Unsafe unsafe4 = o;
            if (i19 < i17) {
                int i23 = i19 + 1;
                int i24 = bArr5[i19];
                if (i24 < 0) {
                    i23 = r1f.c(i24, bArr5, i23, ucdVar4);
                    i24 = ucdVar4.a;
                }
                int i25 = i24;
                int i26 = i23;
                int i27 = i25 >>> 3;
                int i28 = i25 & 7;
                int w = ptdVar2.w(i27);
                if (w != i18) {
                    int i29 = iArr2[w + 1];
                    int i30 = (i29 & 267386880) >>> 20;
                    long j = i29 & 1048575;
                    if (i30 <= 17) {
                        int i31 = iArr2[w + 2];
                        int i32 = 1 << (i31 >>> 20);
                        int i33 = i31 & 1048575;
                        if (i33 != i20) {
                            i4 = -1;
                            i10 = 1;
                            iArr = iArr2;
                            if (i20 != -1) {
                                unsafe4.putInt(obj3, i20, i22);
                            }
                            i11 = unsafe4.getInt(obj3, i33);
                            i12 = i33;
                        } else {
                            i10 = 1;
                            iArr = iArr2;
                            i4 = -1;
                            i11 = i22;
                            i12 = i20;
                        }
                        switch (i30) {
                            case 0:
                                unsafe2 = unsafe4;
                                i13 = i26;
                                if (i28 == i10) {
                                    x1e.d.m(obj3, j, Double.longBitsToDouble(r1f.h(i13, bArr)));
                                    Object obj4 = obj3;
                                    i19 = i13 + 8;
                                    int i34 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr;
                                    i20 = i34;
                                    i17 = i2;
                                    obj3 = obj4;
                                    i18 = i4;
                                    i21 = i25;
                                    ucdVar4 = ucdVar;
                                    break;
                                } else {
                                    obj2 = obj3;
                                    i5 = i3;
                                    ptdVar = ptdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5 && i5 != 0) {
                                        i17 = i2;
                                        i19 = i9;
                                        break;
                                    } else {
                                        xkd xkdVar = (xkd) obj2;
                                        g0eVar = xkdVar.zzjp;
                                        if (g0eVar == g0e.e) {
                                            g0eVar = g0e.b();
                                            xkdVar.zzjp = g0eVar;
                                        }
                                        int i35 = i21;
                                        int b = r1f.b(i35, bArr, i9, i2, g0eVar, ucdVar);
                                        i21 = i35;
                                        bArr5 = bArr;
                                        i17 = i2;
                                        ptdVar2 = ptdVar;
                                        i18 = i4;
                                        i19 = b;
                                        obj3 = obj2;
                                        ucdVar4 = ucdVar;
                                        break;
                                    }
                                }
                            case 1:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i13 = i26;
                                ucdVar2 = ucdVar;
                                if (i28 == 5) {
                                    x1e.d.n(obj3, j, Float.intBitsToFloat(r1f.f(i13, bArr2)));
                                    i19 = i13 + 4;
                                    int i36 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr2;
                                    i20 = i36;
                                    i17 = i2;
                                    ucdVar4 = ucdVar2;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    obj2 = obj3;
                                    i5 = i3;
                                    ptdVar = ptdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    xkd xkdVar2 = (xkd) obj2;
                                    g0eVar = xkdVar2.zzjp;
                                    if (g0eVar == g0e.e) {
                                    }
                                    int i352 = i21;
                                    int b2 = r1f.b(i352, bArr, i9, i2, g0eVar, ucdVar);
                                    i21 = i352;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    ptdVar2 = ptdVar;
                                    i18 = i4;
                                    i19 = b2;
                                    obj3 = obj2;
                                    ucdVar4 = ucdVar;
                                    break;
                                }
                                break;
                            case 2:
                            case 3:
                                unsafe3 = unsafe4;
                                i13 = i26;
                                ucdVar2 = ucdVar;
                                if (i28 == 0) {
                                    int e = r1f.e(bArr, i13, ucdVar2);
                                    unsafe3.putLong(obj3, j, ucdVar2.b);
                                    int i37 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr;
                                    i20 = i37;
                                    i17 = i2;
                                    i19 = e;
                                    ucdVar4 = ucdVar2;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    obj2 = obj3;
                                    i5 = i3;
                                    ptdVar = ptdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    xkd xkdVar22 = (xkd) obj2;
                                    g0eVar = xkdVar22.zzjp;
                                    if (g0eVar == g0e.e) {
                                    }
                                    int i3522 = i21;
                                    int b22 = r1f.b(i3522, bArr, i9, i2, g0eVar, ucdVar);
                                    i21 = i3522;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    ptdVar2 = ptdVar;
                                    i18 = i4;
                                    i19 = b22;
                                    obj3 = obj2;
                                    ucdVar4 = ucdVar;
                                    break;
                                }
                                break;
                            case 4:
                            case 11:
                                unsafe3 = unsafe4;
                                i13 = i26;
                                ucdVar2 = ucdVar;
                                if (i28 == 0) {
                                    int d = r1f.d(bArr, i13, ucdVar2);
                                    unsafe3.putInt(obj3, j, ucdVar2.a);
                                    int i38 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr;
                                    i20 = i38;
                                    i17 = i2;
                                    i19 = d;
                                    ucdVar4 = ucdVar2;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    obj2 = obj3;
                                    i5 = i3;
                                    ptdVar = ptdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    xkd xkdVar222 = (xkd) obj2;
                                    g0eVar = xkdVar222.zzjp;
                                    if (g0eVar == g0e.e) {
                                    }
                                    int i35222 = i21;
                                    int b222 = r1f.b(i35222, bArr, i9, i2, g0eVar, ucdVar);
                                    i21 = i35222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    ptdVar2 = ptdVar;
                                    i18 = i4;
                                    i19 = b222;
                                    obj3 = obj2;
                                    ucdVar4 = ucdVar;
                                    break;
                                }
                                break;
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i14 = i26;
                                unsafe2 = unsafe4;
                                ucdVar2 = ucdVar;
                                if (i28 == i10) {
                                    unsafe2.putLong(obj3, j, r1f.h(i14, bArr2));
                                    i19 = i14 + 8;
                                    int i362 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr2;
                                    i20 = i362;
                                    i17 = i2;
                                    ucdVar4 = ucdVar2;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    i13 = i14;
                                    obj2 = obj3;
                                    i5 = i3;
                                    ptdVar = ptdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    xkd xkdVar2222 = (xkd) obj2;
                                    g0eVar = xkdVar2222.zzjp;
                                    if (g0eVar == g0e.e) {
                                    }
                                    int i352222 = i21;
                                    int b2222 = r1f.b(i352222, bArr, i9, i2, g0eVar, ucdVar);
                                    i21 = i352222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    ptdVar2 = ptdVar;
                                    i18 = i4;
                                    i19 = b2222;
                                    obj3 = obj2;
                                    ucdVar4 = ucdVar;
                                    break;
                                }
                                break;
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i14 = i26;
                                unsafe2 = unsafe4;
                                ucdVar2 = ucdVar;
                                if (i28 == 5) {
                                    unsafe2.putInt(obj3, j, r1f.f(i14, bArr2));
                                    i19 = i14 + 4;
                                    int i3622 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr2;
                                    i20 = i3622;
                                    i17 = i2;
                                    ucdVar4 = ucdVar2;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    i13 = i14;
                                    obj2 = obj3;
                                    i5 = i3;
                                    ptdVar = ptdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    xkd xkdVar22222 = (xkd) obj2;
                                    g0eVar = xkdVar22222.zzjp;
                                    if (g0eVar == g0e.e) {
                                    }
                                    int i3522222 = i21;
                                    int b22222 = r1f.b(i3522222, bArr, i9, i2, g0eVar, ucdVar);
                                    i21 = i3522222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    ptdVar2 = ptdVar;
                                    i18 = i4;
                                    i19 = b22222;
                                    obj3 = obj2;
                                    ucdVar4 = ucdVar;
                                    break;
                                }
                                break;
                            case 7:
                                bArr2 = bArr;
                                i14 = i26;
                                unsafe2 = unsafe4;
                                ucdVar2 = ucdVar;
                                if (i28 == 0) {
                                    i19 = r1f.e(bArr2, i14, ucdVar2);
                                    x1e.d.o(obj3, j, ucdVar2.b != 0 ? i10 : 0);
                                    int i36222 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr2;
                                    i20 = i36222;
                                    i17 = i2;
                                    ucdVar4 = ucdVar2;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    i13 = i14;
                                    obj2 = obj3;
                                    i5 = i3;
                                    ptdVar = ptdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    xkd xkdVar222222 = (xkd) obj2;
                                    g0eVar = xkdVar222222.zzjp;
                                    if (g0eVar == g0e.e) {
                                    }
                                    int i35222222 = i21;
                                    int b222222 = r1f.b(i35222222, bArr, i9, i2, g0eVar, ucdVar);
                                    i21 = i35222222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    ptdVar2 = ptdVar;
                                    i18 = i4;
                                    i19 = b222222;
                                    obj3 = obj2;
                                    ucdVar4 = ucdVar;
                                    break;
                                }
                                break;
                            case 8:
                                bArr2 = bArr;
                                i14 = i26;
                                unsafe2 = unsafe4;
                                ucdVar2 = ucdVar;
                                if (i28 == 2) {
                                    if ((i29 & TLObject.FLAG_29) == 0) {
                                        g = r1f.d(bArr2, i14, ucdVar2);
                                        int i39 = ucdVar2.a;
                                        if (i39 == 0) {
                                            ucdVar2.c = "";
                                        } else {
                                            ucdVar2.c = new String(bArr2, g, i39, gld.a);
                                            g += i39;
                                        }
                                    } else {
                                        g = r1f.g(bArr2, i14, ucdVar2);
                                    }
                                    i19 = g;
                                    unsafe2.putObject(obj3, j, ucdVar2.c);
                                    int i362222 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr2;
                                    i20 = i362222;
                                    i17 = i2;
                                    ucdVar4 = ucdVar2;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    i13 = i14;
                                    obj2 = obj3;
                                    i5 = i3;
                                    ptdVar = ptdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    xkd xkdVar2222222 = (xkd) obj2;
                                    g0eVar = xkdVar2222222.zzjp;
                                    if (g0eVar == g0e.e) {
                                    }
                                    int i352222222 = i21;
                                    int b2222222 = r1f.b(i352222222, bArr, i9, i2, g0eVar, ucdVar);
                                    i21 = i352222222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    ptdVar2 = ptdVar;
                                    i18 = i4;
                                    i19 = b2222222;
                                    obj3 = obj2;
                                    ucdVar4 = ucdVar;
                                    break;
                                }
                            case 9:
                                bArr3 = bArr;
                                i14 = i26;
                                i15 = i2;
                                unsafe2 = unsafe4;
                                ucdVar2 = ucdVar;
                                if (i28 != 2) {
                                    i13 = i14;
                                    obj2 = obj3;
                                    i5 = i3;
                                    ptdVar = ptdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    xkd xkdVar22222222 = (xkd) obj2;
                                    g0eVar = xkdVar22222222.zzjp;
                                    if (g0eVar == g0e.e) {
                                    }
                                    int i3522222222 = i21;
                                    int b22222222 = r1f.b(i3522222222, bArr, i9, i2, g0eVar, ucdVar);
                                    i21 = i3522222222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    ptdVar2 = ptdVar;
                                    i18 = i4;
                                    i19 = b22222222;
                                    obj3 = obj2;
                                    ucdVar4 = ucdVar;
                                    break;
                                } else {
                                    i19 = m(ptdVar2.s(w), bArr3, i14, i15, ucdVar2);
                                    if ((i11 & i32) != 0) {
                                        a = gld.a(unsafe2.getObject(obj3, j), ucdVar2.c);
                                        unsafe2.putObject(obj3, j, a);
                                        int i40 = i12;
                                        i22 = i11 | i32;
                                        bArr5 = bArr3;
                                        i20 = i40;
                                        i17 = i15;
                                        ucdVar4 = ucdVar2;
                                        i18 = i4;
                                        i21 = i25;
                                        break;
                                    }
                                    a = ucdVar2.c;
                                    unsafe2.putObject(obj3, j, a);
                                    int i402 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr3;
                                    i20 = i402;
                                    i17 = i15;
                                    ucdVar4 = ucdVar2;
                                    i18 = i4;
                                    i21 = i25;
                                }
                                break;
                            case 10:
                                bArr3 = bArr;
                                i14 = i26;
                                i15 = i2;
                                unsafe2 = unsafe4;
                                ucdVar2 = ucdVar;
                                if (i28 == 2) {
                                    i19 = r1f.i(bArr3, i14, ucdVar2);
                                    a = ucdVar2.c;
                                    unsafe2.putObject(obj3, j, a);
                                    int i4022 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr3;
                                    i20 = i4022;
                                    i17 = i15;
                                    ucdVar4 = ucdVar2;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    i13 = i14;
                                    obj2 = obj3;
                                    i5 = i3;
                                    ptdVar = ptdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    xkd xkdVar222222222 = (xkd) obj2;
                                    g0eVar = xkdVar222222222.zzjp;
                                    if (g0eVar == g0e.e) {
                                    }
                                    int i35222222222 = i21;
                                    int b222222222 = r1f.b(i35222222222, bArr, i9, i2, g0eVar, ucdVar);
                                    i21 = i35222222222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    ptdVar2 = ptdVar;
                                    i18 = i4;
                                    i19 = b222222222;
                                    obj3 = obj2;
                                    ucdVar4 = ucdVar;
                                    break;
                                }
                                break;
                            case 12:
                                bArr3 = bArr;
                                i14 = i26;
                                i15 = i2;
                                unsafe2 = unsafe4;
                                ucdVar2 = ucdVar;
                                if (i28 == 0) {
                                    i19 = r1f.d(bArr3, i14, ucdVar2);
                                    int i41 = ucdVar2.a;
                                    ptdVar2.u(w);
                                    unsafe2.putInt(obj3, j, i41);
                                    int i40222 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr3;
                                    i20 = i40222;
                                    i17 = i15;
                                    ucdVar4 = ucdVar2;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    i13 = i14;
                                    obj2 = obj3;
                                    i5 = i3;
                                    ptdVar = ptdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    xkd xkdVar2222222222 = (xkd) obj2;
                                    g0eVar = xkdVar2222222222.zzjp;
                                    if (g0eVar == g0e.e) {
                                    }
                                    int i352222222222 = i21;
                                    int b2222222222 = r1f.b(i352222222222, bArr, i9, i2, g0eVar, ucdVar);
                                    i21 = i352222222222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    ptdVar2 = ptdVar;
                                    i18 = i4;
                                    i19 = b2222222222;
                                    obj3 = obj2;
                                    ucdVar4 = ucdVar;
                                    break;
                                }
                                break;
                            case 15:
                                bArr4 = bArr;
                                i14 = i26;
                                i16 = i2;
                                ucdVar3 = ucdVar;
                                unsafe2 = unsafe4;
                                if (i28 == 0) {
                                    i19 = r1f.d(bArr4, i14, ucdVar3);
                                    int i42 = ucdVar3.a;
                                    unsafe2.putInt(obj3, j, (i42 >>> 1) ^ (-(i42 & 1)));
                                    int i43 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr4;
                                    i20 = i43;
                                    i17 = i16;
                                    ucdVar4 = ucdVar3;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    i13 = i14;
                                    obj2 = obj3;
                                    i5 = i3;
                                    ptdVar = ptdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    xkd xkdVar22222222222 = (xkd) obj2;
                                    g0eVar = xkdVar22222222222.zzjp;
                                    if (g0eVar == g0e.e) {
                                    }
                                    int i3522222222222 = i21;
                                    int b22222222222 = r1f.b(i3522222222222, bArr, i9, i2, g0eVar, ucdVar);
                                    i21 = i3522222222222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    ptdVar2 = ptdVar;
                                    i18 = i4;
                                    i19 = b22222222222;
                                    obj3 = obj2;
                                    ucdVar4 = ucdVar;
                                    break;
                                }
                                break;
                            case 16:
                                i16 = i2;
                                ucdVar3 = ucdVar;
                                if (i28 == 0) {
                                    int e2 = r1f.e(bArr, i26, ucdVar3);
                                    long j2 = ucdVar3.b;
                                    unsafe4.putLong(obj3, j, (j2 >>> i10) ^ (-(j2 & 1)));
                                    int i44 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr;
                                    i20 = i44;
                                    i19 = e2;
                                    i17 = i16;
                                    ucdVar4 = ucdVar3;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    i13 = i26;
                                    obj2 = obj3;
                                    unsafe2 = unsafe4;
                                    i5 = i3;
                                    ptdVar = ptdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    xkd xkdVar222222222222 = (xkd) obj2;
                                    g0eVar = xkdVar222222222222.zzjp;
                                    if (g0eVar == g0e.e) {
                                    }
                                    int i35222222222222 = i21;
                                    int b222222222222 = r1f.b(i35222222222222, bArr, i9, i2, g0eVar, ucdVar);
                                    i21 = i35222222222222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    ptdVar2 = ptdVar;
                                    i18 = i4;
                                    i19 = b222222222222;
                                    obj3 = obj2;
                                    ucdVar4 = ucdVar;
                                    break;
                                }
                                break;
                            case 17:
                                if (i28 == 3) {
                                    i19 = l(ptdVar2.s(w), bArr, i26, i2, (i27 << 3) | 4, ucdVar);
                                    i16 = i2;
                                    ucdVar3 = ucdVar;
                                    bArr4 = bArr;
                                    unsafe4.putObject(obj3, j, (i11 & i32) == 0 ? ucdVar3.c : gld.a(unsafe4.getObject(obj3, j), ucdVar3.c));
                                    int i432 = i12;
                                    i22 = i11 | i32;
                                    bArr5 = bArr4;
                                    i20 = i432;
                                    i17 = i16;
                                    ucdVar4 = ucdVar3;
                                    i18 = i4;
                                    i21 = i25;
                                    break;
                                } else {
                                    i13 = i26;
                                    obj2 = obj3;
                                    unsafe2 = unsafe4;
                                    i5 = i3;
                                    ptdVar = ptdVar2;
                                    unsafe = unsafe2;
                                    i20 = i12;
                                    i9 = i13;
                                    i21 = i25;
                                    i22 = i11;
                                    if (i21 != i5) {
                                    }
                                    xkd xkdVar2222222222222 = (xkd) obj2;
                                    g0eVar = xkdVar2222222222222.zzjp;
                                    if (g0eVar == g0e.e) {
                                    }
                                    int i352222222222222 = i21;
                                    int b2222222222222 = r1f.b(i352222222222222, bArr, i9, i2, g0eVar, ucdVar);
                                    i21 = i352222222222222;
                                    bArr5 = bArr;
                                    i17 = i2;
                                    ptdVar2 = ptdVar;
                                    i18 = i4;
                                    i19 = b2222222222222;
                                    obj3 = obj2;
                                    ucdVar4 = ucdVar;
                                    break;
                                }
                                break;
                            default:
                                i13 = i26;
                                obj2 = obj3;
                                unsafe2 = unsafe4;
                                i5 = i3;
                                ptdVar = ptdVar2;
                                unsafe = unsafe2;
                                i20 = i12;
                                i9 = i13;
                                i21 = i25;
                                i22 = i11;
                                if (i21 != i5) {
                                }
                                xkd xkdVar22222222222222 = (xkd) obj2;
                                g0eVar = xkdVar22222222222222.zzjp;
                                if (g0eVar == g0e.e) {
                                }
                                int i3522222222222222 = i21;
                                int b22222222222222 = r1f.b(i3522222222222222, bArr, i9, i2, g0eVar, ucdVar);
                                i21 = i3522222222222222;
                                bArr5 = bArr;
                                i17 = i2;
                                ptdVar2 = ptdVar;
                                i18 = i4;
                                i19 = b22222222222222;
                                obj3 = obj2;
                                ucdVar4 = ucdVar;
                                break;
                        }
                    } else {
                        obj2 = obj3;
                        i8 = i26;
                        iArr = iArr2;
                        i4 = -1;
                        if (i30 != 27) {
                            i21 = i25;
                            if (i30 <= 49) {
                                unsafe = unsafe4;
                                int i45 = i20;
                                i7 = i22;
                                h = ptdVar2.i(obj2, bArr, i8, i2, i21, i27, i28, w, i29, i30, j, ucdVar);
                                obj3 = obj2;
                                if (h == i8) {
                                    i20 = i45;
                                    ptdVar = ptdVar2;
                                    obj2 = obj3;
                                } else {
                                    bArr5 = bArr;
                                    i20 = i45;
                                    i17 = i2;
                                    ucdVar4 = ucdVar;
                                    i19 = h;
                                    i18 = -1;
                                    i22 = i7;
                                }
                            } else {
                                unsafe = unsafe4;
                                i6 = i20;
                                i7 = i22;
                                if (i30 != 50) {
                                    h = ptdVar2.h(obj2, bArr, i8, i2, i21, i27, i28, i29, i30, j, w, ucdVar);
                                    ptdVar = ptdVar2;
                                    obj2 = obj2;
                                    if (h == i8) {
                                        i20 = i6;
                                    } else {
                                        bArr5 = bArr;
                                        i20 = i6;
                                        i17 = i2;
                                        i19 = h;
                                        ptdVar2 = ptdVar;
                                        obj3 = obj2;
                                        i18 = -1;
                                        i22 = i7;
                                        ucdVar4 = ucdVar;
                                    }
                                } else {
                                    if (i28 == 2) {
                                        ptdVar2.o(obj2, w, j);
                                        throw null;
                                    }
                                    ptdVar = ptdVar2;
                                    obj2 = obj2;
                                }
                            }
                            i9 = h;
                            i22 = i7;
                            i5 = i3;
                            if (i21 != i5) {
                            }
                            xkd xkdVar222222222222222 = (xkd) obj2;
                            g0eVar = xkdVar222222222222222.zzjp;
                            if (g0eVar == g0e.e) {
                            }
                            int i35222222222222222 = i21;
                            int b222222222222222 = r1f.b(i35222222222222222, bArr, i9, i2, g0eVar, ucdVar);
                            i21 = i35222222222222222;
                            bArr5 = bArr;
                            i17 = i2;
                            ptdVar2 = ptdVar;
                            i18 = i4;
                            i19 = b222222222222222;
                            obj3 = obj2;
                            ucdVar4 = ucdVar;
                        } else if (i28 == 2) {
                            omd omdVar = (omd) unsafe4.getObject(obj2, j);
                            if (!((fcd) omdVar).a) {
                                int size = omdVar.size();
                                omdVar = omdVar.f(size == 0 ? 10 : size << 1);
                                unsafe4.putObject(obj2, j, omdVar);
                            }
                            i21 = i25;
                            i17 = i2;
                            i19 = k(ptdVar2.s(w), i25, bArr, i8, i2, omdVar, ucdVar);
                            obj3 = obj2;
                            i18 = -1;
                            bArr5 = bArr;
                            ucdVar4 = ucdVar;
                        } else {
                            ptdVar = ptdVar2;
                            unsafe = unsafe4;
                            i6 = i20;
                            i21 = i25;
                            i7 = i22;
                        }
                    }
                } else {
                    ptdVar = ptdVar2;
                    obj2 = obj3;
                    iArr = iArr2;
                    i6 = i20;
                    i4 = i18;
                    i7 = i22;
                    unsafe = unsafe4;
                    i21 = i25;
                    i8 = i26;
                }
                i20 = i6;
                i5 = i3;
                i9 = i8;
                i22 = i7;
                if (i21 != i5) {
                }
                xkd xkdVar2222222222222222 = (xkd) obj2;
                g0eVar = xkdVar2222222222222222.zzjp;
                if (g0eVar == g0e.e) {
                }
                int i352222222222222222 = i21;
                int b2222222222222222 = r1f.b(i352222222222222222, bArr, i9, i2, g0eVar, ucdVar);
                i21 = i352222222222222222;
                bArr5 = bArr;
                i17 = i2;
                ptdVar2 = ptdVar;
                i18 = i4;
                i19 = b2222222222222222;
                obj3 = obj2;
                ucdVar4 = ucdVar;
            } else {
                ptdVar = ptdVar2;
                obj2 = obj3;
                iArr = iArr2;
                i4 = i18;
                unsafe = unsafe4;
                i5 = i3;
            }
        }
        if (i20 != i4) {
            unsafe.putInt(obj2, i20, i22);
        }
        int[] iArr3 = ptdVar.i;
        if (iArr3 != null) {
            for (int i46 : iArr3) {
                int i47 = iArr[i46];
                if (x1e.l(obj2, ptdVar.v(i46) & 1048575) != null) {
                    ptdVar.u(i46);
                }
            }
        }
        if (i5 != 0 ? i19 > i17 || i21 != i5 : i19 != i17) {
            throw xmd.b();
        }
        return i19;
    }

    public final void o(Object obj, int i, long j) {
        ord ordVar;
        t(i);
        Unsafe unsafe = o;
        Object object = unsafe.getObject(obj, j);
        this.n.getClass();
        if (!((ord) object).a) {
            ord ordVar2 = ord.b;
            if (ordVar2.isEmpty()) {
                ordVar = new ord();
            } else {
                ord ordVar3 = new ord(ordVar2);
                ordVar3.a = true;
                ordVar = ordVar3;
            }
            bsd.a(ordVar, object);
            unsafe.putObject(obj, j, ordVar);
        }
        throw new NoSuchMethodError();
    }

    public final void p(xkd xkdVar, xkd xkdVar2, int i) {
        long v = v(i) & 1048575;
        if (r(i, xkdVar2)) {
            Object l = x1e.l(xkdVar, v);
            Object l2 = x1e.l(xkdVar2, v);
            if (l != null && l2 != null) {
                l2 = gld.a(l, l2);
            } else if (l2 == null) {
                return;
            }
            x1e.d(xkdVar, v, l2);
            x(xkdVar, i);
        }
    }

    public final boolean q(int i, int i2, Object obj) {
        return x1e.j(obj, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ec A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(int i, Object obj) {
        if (this.g) {
            int v = v(i);
            long j = 1048575 & v;
            switch ((v & 267386880) >>> 20) {
                case 0:
                    return x1e.d.A(obj, j) != 0.0d;
                case 1:
                    if (x1e.d.z(obj, j) != 0.0f) {
                    }
                    break;
                case 2:
                    if (x1e.k(obj, j) != 0) {
                    }
                    break;
                case 3:
                    if (x1e.k(obj, j) != 0) {
                    }
                    break;
                case 4:
                    if (x1e.j(obj, j) != 0) {
                    }
                    break;
                case 5:
                    if (x1e.k(obj, j) != 0) {
                    }
                    break;
                case 6:
                    if (x1e.j(obj, j) != 0) {
                    }
                    break;
                case 7:
                    return x1e.d.y(obj, j);
                case 8:
                    Object l = x1e.l(obj, j);
                    if (!(l instanceof String)) {
                        if (l instanceof efd) {
                            if (!efd.c.equals(l)) {
                            }
                        }
                        i98.g();
                        return false;
                    }
                    if (!((String) l).isEmpty()) {
                    }
                    break;
                case 9:
                    if (x1e.l(obj, j) != null) {
                    }
                    break;
                case 10:
                    if (!efd.c.equals(x1e.l(obj, j))) {
                    }
                    break;
                case 11:
                    if (x1e.j(obj, j) != 0) {
                    }
                    break;
                case 12:
                    if (x1e.j(obj, j) != 0) {
                    }
                    break;
                case 13:
                    if (x1e.j(obj, j) != 0) {
                    }
                    break;
                case 14:
                    if (x1e.k(obj, j) != 0) {
                    }
                    break;
                case 15:
                    if (x1e.j(obj, j) != 0) {
                    }
                    break;
                case 16:
                    if (x1e.k(obj, j) != 0) {
                    }
                    break;
                case 17:
                    if (x1e.l(obj, j) != null) {
                    }
                    break;
                default:
                    i98.g();
                    return false;
            }
        } else {
            if ((x1e.j(obj, r6 & 1048575) & (1 << (this.a[i + 2] >>> 20))) != 0) {
            }
        }
    }

    public final ywd s(int i) {
        int i2 = (i / 4) << 1;
        Object[] objArr = this.b;
        ywd ywdVar = (ywd) objArr[i2];
        if (ywdVar != null) {
            return ywdVar;
        }
        ywd a = wvd.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final Object t(int i) {
        return this.b[(i / 4) << 1];
    }

    public final zbe u(int i) {
        return (zbe) this.b[((i / 4) << 1) + 1];
    }

    public final int v(int i) {
        return this.a[i + 1];
    }

    public final int w(int i) {
        int i2 = this.c;
        if (i < i2) {
            return -1;
        }
        int[] iArr = this.a;
        int i3 = this.e;
        if (i < i3) {
            int i4 = (i - i2) << 2;
            if (iArr[i4] == i) {
                return i4;
            }
            return -1;
        }
        if (i > this.d) {
            return -1;
        }
        int i5 = i3 - i2;
        int length = (iArr.length / 4) - 1;
        while (i5 <= length) {
            int i6 = (length + i5) >>> 1;
            int i7 = i6 << 2;
            int i8 = iArr[i7];
            if (i == i8) {
                return i7;
            }
            if (i < i8) {
                length = i6 - 1;
            } else {
                i5 = i6 + 1;
            }
        }
        return -1;
    }

    public final void x(xkd xkdVar, int i) {
        if (this.g) {
            return;
        }
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        x1e.c(xkdVar, x1e.j(xkdVar, j) | (1 << (i2 >>> 20)), j);
    }

    public final void y(xkd xkdVar, xkd xkdVar2, int i) {
        int i2;
        int v = v(i);
        int[] iArr = this.a;
        int i3 = iArr[i];
        long j = v & 1048575;
        if (q(i3, i, xkdVar2)) {
            Object l = x1e.l(xkdVar, j);
            Object l2 = x1e.l(xkdVar2, j);
            if (l != null && l2 != null) {
                x1e.d(xkdVar, j, gld.a(l, l2));
                i2 = iArr[i + 2];
            } else {
                if (l2 == null) {
                    return;
                }
                x1e.d(xkdVar, j, l2);
                i2 = iArr[i + 2];
            }
            x1e.c(xkdVar, i3, i2 & 1048575);
        }
    }

    public final boolean z(xkd xkdVar, xkd xkdVar2, int i) {
        return r(i, xkdVar) == r(i, xkdVar2);
    }
}
