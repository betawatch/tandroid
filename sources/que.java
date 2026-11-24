// default package

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Level;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class que implements xwe {
    public static final int[] n = new int[0];
    public static final Unsafe o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final qde e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final tve j;
    public final zqe k;
    public final mze l;
    public final ite m;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new q2((byte) 5));
        } catch (Throwable unused) {
            unsafe = null;
        }
        o = unsafe;
    }

    public que(int[] iArr, Object[] objArr, int i, int i2, qde qdeVar, boolean z, int[] iArr2, int i3, int i4, tve tveVar, zqe zqeVar, mze mzeVar, wke wkeVar, ite iteVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = z;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = tveVar;
        this.k = zqeVar;
        this.l = mzeVar;
        this.e = qdeVar;
        this.m = iteVar;
    }

    public static long A(Object obj, long j) {
        return ((Long) i0f.l(obj, j)).longValue();
    }

    public static qze B(Object obj) {
        nne nneVar = (nne) obj;
        qze qzeVar = nneVar.zzb;
        if (qzeVar != qze.f) {
            return qzeVar;
        }
        qze b = qze.b();
        nneVar.zzb = b;
        return b;
    }

    public static Field k(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + name.length() + String.valueOf(str).length() + 40);
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            wn4.j(b00.j(sb, " not found. Known fields are ", arrays));
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x027d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static que l(swe sweVar, tve tveVar, zqe zqeVar, mze mzeVar, wke wkeVar, ite iteVar) {
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        char charAt4;
        int i7;
        char charAt5;
        int i8;
        char charAt6;
        int i9;
        char charAt7;
        int i10;
        char charAt8;
        int i11;
        char charAt9;
        int i12;
        char charAt10;
        int i13;
        char charAt11;
        Object[] objArr;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        Field k;
        char charAt12;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field k2;
        Object obj2;
        Field k3;
        int i27;
        char charAt13;
        int i28;
        int i29;
        char charAt14;
        int i30;
        int i31;
        char charAt15;
        int i32;
        char charAt16;
        if (!(sweVar instanceof swe)) {
            fyb.g();
            return null;
        }
        boolean z = (sweVar.d & 1) != 1;
        String str = sweVar.b;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i33 = 1;
            while (true) {
                i = i33 + 1;
                if (str.charAt(i33) < 55296) {
                    break;
                }
                i33 = i;
            }
        } else {
            i = 1;
        }
        int i34 = i + 1;
        int charAt17 = str.charAt(i);
        if (charAt17 >= 55296) {
            int i35 = charAt17 & 8191;
            int i36 = 13;
            while (true) {
                i32 = i34 + 1;
                charAt16 = str.charAt(i34);
                if (charAt16 < 55296) {
                    break;
                }
                i35 |= (charAt16 & 8191) << i36;
                i36 += 13;
                i34 = i32;
            }
            charAt17 = i35 | (charAt16 << i36);
            i34 = i32;
        }
        if (charAt17 == 0) {
            i5 = 0;
            charAt = 0;
            charAt2 = 0;
            i2 = 0;
            charAt3 = 0;
            iArr = n;
            i3 = 0;
            i4 = 0;
        } else {
            int i37 = i34 + 1;
            int charAt18 = str.charAt(i34);
            if (charAt18 >= 55296) {
                int i38 = charAt18 & 8191;
                int i39 = 13;
                while (true) {
                    i13 = i37 + 1;
                    charAt11 = str.charAt(i37);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i38 |= (charAt11 & 8191) << i39;
                    i39 += 13;
                    i37 = i13;
                }
                charAt18 = i38 | (charAt11 << i39);
                i37 = i13;
            }
            int i40 = i37 + 1;
            int charAt19 = str.charAt(i37);
            if (charAt19 >= 55296) {
                int i41 = charAt19 & 8191;
                int i42 = 13;
                while (true) {
                    i12 = i40 + 1;
                    charAt10 = str.charAt(i40);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i41 |= (charAt10 & 8191) << i42;
                    i42 += 13;
                    i40 = i12;
                }
                charAt19 = i41 | (charAt10 << i42);
                i40 = i12;
            }
            int i43 = i40 + 1;
            int charAt20 = str.charAt(i40);
            if (charAt20 >= 55296) {
                int i44 = charAt20 & 8191;
                int i45 = 13;
                while (true) {
                    i11 = i43 + 1;
                    charAt9 = str.charAt(i43);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i44 |= (charAt9 & 8191) << i45;
                    i45 += 13;
                    i43 = i11;
                }
                charAt20 = i44 | (charAt9 << i45);
                i43 = i11;
            }
            int i46 = i43 + 1;
            int charAt21 = str.charAt(i43);
            if (charAt21 >= 55296) {
                int i47 = charAt21 & 8191;
                int i48 = 13;
                while (true) {
                    i10 = i46 + 1;
                    charAt8 = str.charAt(i46);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i47 |= (charAt8 & 8191) << i48;
                    i48 += 13;
                    i46 = i10;
                }
                charAt21 = i47 | (charAt8 << i48);
                i46 = i10;
            }
            int i49 = i46 + 1;
            charAt = str.charAt(i46);
            if (charAt >= 55296) {
                int i50 = charAt & 8191;
                int i51 = 13;
                while (true) {
                    i9 = i49 + 1;
                    charAt7 = str.charAt(i49);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i50 |= (charAt7 & 8191) << i51;
                    i51 += 13;
                    i49 = i9;
                }
                charAt = i50 | (charAt7 << i51);
                i49 = i9;
            }
            int i52 = i49 + 1;
            charAt2 = str.charAt(i49);
            if (charAt2 >= 55296) {
                int i53 = charAt2 & 8191;
                int i54 = 13;
                while (true) {
                    i8 = i52 + 1;
                    charAt6 = str.charAt(i52);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i53 |= (charAt6 & 8191) << i54;
                    i54 += 13;
                    i52 = i8;
                }
                charAt2 = i53 | (charAt6 << i54);
                i52 = i8;
            }
            int i55 = i52 + 1;
            int charAt22 = str.charAt(i52);
            if (charAt22 >= 55296) {
                int i56 = charAt22 & 8191;
                int i57 = 13;
                while (true) {
                    i7 = i55 + 1;
                    charAt5 = str.charAt(i55);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i56 |= (charAt5 & 8191) << i57;
                    i57 += 13;
                    i55 = i7;
                }
                charAt22 = i56 | (charAt5 << i57);
                i55 = i7;
            }
            int i58 = i55 + 1;
            charAt3 = str.charAt(i55);
            if (charAt3 >= 55296) {
                int i59 = charAt3 & 8191;
                int i60 = i58;
                int i61 = 13;
                while (true) {
                    i6 = i60 + 1;
                    charAt4 = str.charAt(i60);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i59 |= (charAt4 & 8191) << i61;
                    i61 += 13;
                    i60 = i6;
                }
                charAt3 = i59 | (charAt4 << i61);
                i58 = i6;
            }
            int[] iArr2 = new int[charAt3 + charAt2 + charAt22];
            i2 = (charAt18 << 1) + charAt19;
            i3 = charAt20;
            i4 = charAt21;
            iArr = iArr2;
            i5 = charAt18;
            i34 = i58;
        }
        Object[] objArr2 = sweVar.c;
        Class<?> cls = sweVar.a.getClass();
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr3 = new Object[charAt << 1];
        int i62 = charAt2 + charAt3;
        int i63 = i62;
        int i64 = charAt3;
        int i65 = 0;
        int i66 = 0;
        while (i34 < length) {
            int i67 = i34 + 1;
            int charAt23 = str.charAt(i34);
            int i68 = i5;
            if (charAt23 >= 55296) {
                int i69 = charAt23 & 8191;
                int i70 = i67;
                int i71 = 13;
                while (true) {
                    i31 = i70 + 1;
                    charAt15 = str.charAt(i70);
                    objArr = objArr2;
                    if (charAt15 < 55296) {
                        break;
                    }
                    i69 |= (charAt15 & 8191) << i71;
                    i71 += 13;
                    i70 = i31;
                    objArr2 = objArr;
                }
                charAt23 = i69 | (charAt15 << i71);
                i14 = i31;
            } else {
                objArr = objArr2;
                i14 = i67;
            }
            int i72 = i14 + 1;
            int charAt24 = str.charAt(i14);
            if (charAt24 >= 55296) {
                int i73 = charAt24 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i29 = i74 + 1;
                    charAt14 = str.charAt(i74);
                    i30 = i73;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i73 = i30 | ((charAt14 & 8191) << i75);
                    i75 += 13;
                    i74 = i29;
                }
                charAt24 = i30 | (charAt14 << i75);
                i15 = i29;
            } else {
                i15 = i72;
            }
            int i76 = length;
            int i77 = charAt24 & kk7.d4;
            int i78 = charAt23;
            if ((charAt24 & 1024) != 0) {
                iArr[i65] = i66;
                i65++;
            }
            int[] iArr4 = iArr3;
            Unsafe unsafe = o;
            if (i77 >= 51) {
                int i79 = i15 + 1;
                int charAt25 = str.charAt(i15);
                if (charAt25 >= 55296) {
                    int i80 = charAt25 & 8191;
                    int i81 = i79;
                    int i82 = 13;
                    while (true) {
                        i27 = i81 + 1;
                        charAt13 = str.charAt(i81);
                        i28 = i80;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i80 = i28 | ((charAt13 & 8191) << i82);
                        i82 += 13;
                        i81 = i27;
                    }
                    charAt25 = i28 | (charAt13 << i82);
                    i25 = i27;
                } else {
                    i25 = i79;
                }
                int i83 = charAt25;
                int i84 = i77 - 51;
                int i85 = i25;
                if (i84 == 9 || i84 == 17) {
                    i26 = i2 + 1;
                    objArr3[((i66 / 3) << 1) + 1] = objArr[i2];
                } else {
                    if (i84 == 12 && !z) {
                        i26 = i2 + 1;
                        objArr3[((i66 / 3) << 1) + 1] = objArr[i2];
                    }
                    int i86 = i83 << 1;
                    obj = objArr[i86];
                    if (obj instanceof Field) {
                        k2 = k(cls, (String) obj);
                        objArr[i86] = k2;
                    } else {
                        k2 = (Field) obj;
                    }
                    i16 = i3;
                    i17 = i4;
                    i23 = (int) unsafe.objectFieldOffset(k2);
                    int i87 = i86 + 1;
                    obj2 = objArr[i87];
                    if (obj2 instanceof Field) {
                        k3 = k(cls, (String) obj2);
                        objArr[i87] = k3;
                    } else {
                        k3 = (Field) obj2;
                    }
                    i21 = (int) unsafe.objectFieldOffset(k3);
                    i19 = i85;
                    i22 = 0;
                }
                i2 = i26;
                int i862 = i83 << 1;
                obj = objArr[i862];
                if (obj instanceof Field) {
                }
                i16 = i3;
                i17 = i4;
                i23 = (int) unsafe.objectFieldOffset(k2);
                int i872 = i862 + 1;
                obj2 = objArr[i872];
                if (obj2 instanceof Field) {
                }
                i21 = (int) unsafe.objectFieldOffset(k3);
                i19 = i85;
                i22 = 0;
            } else {
                i16 = i3;
                i17 = i4;
                int i88 = i2 + 1;
                Field k4 = k(cls, (String) objArr[i2]);
                if (i77 == 9 || i77 == 17) {
                    objArr3[((i66 / 3) << 1) + 1] = k4.getType();
                } else {
                    if (i77 == 27 || i77 == 49) {
                        i24 = i2 + 2;
                        objArr3[((i66 / 3) << 1) + 1] = objArr[i88];
                    } else if (i77 == 12 || i77 == 30 || i77 == 44) {
                        if (!z) {
                            i24 = i2 + 2;
                            objArr3[((i66 / 3) << 1) + 1] = objArr[i88];
                        }
                    } else if (i77 == 50) {
                        int i89 = i64 + 1;
                        iArr[i64] = i66;
                        int i90 = (i66 / 3) << 1;
                        int i91 = i2 + 2;
                        objArr3[i90] = objArr[i88];
                        if ((charAt24 & 2048) != 0) {
                            i88 = i2 + 3;
                            objArr3[i90 + 1] = objArr[i91];
                            i64 = i89;
                        } else {
                            i64 = i89;
                            i88 = i91;
                        }
                    }
                    i88 = i24;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(k4);
                if ((charAt24 & TLObject.FLAG_12) != 4096 || i77 > 17) {
                    i2 = i88;
                    i18 = 1048575;
                    i19 = i15;
                    i20 = 0;
                } else {
                    int i92 = i15 + 1;
                    int charAt26 = str.charAt(i15);
                    if (charAt26 >= 55296) {
                        int i93 = charAt26 & 8191;
                        int i94 = 13;
                        while (true) {
                            i19 = i92 + 1;
                            charAt12 = str.charAt(i92);
                            if (charAt12 < 55296) {
                                break;
                            }
                            i93 |= (charAt12 & 8191) << i94;
                            i94 += 13;
                            i92 = i19;
                        }
                        charAt26 = i93 | (charAt12 << i94);
                    } else {
                        i19 = i92;
                    }
                    int i95 = (charAt26 / 32) + (i68 << 1);
                    Object obj3 = objArr[i95];
                    if (obj3 instanceof Field) {
                        k = (Field) obj3;
                    } else {
                        k = k(cls, (String) obj3);
                        objArr[i95] = k;
                    }
                    i2 = i88;
                    i18 = (int) unsafe.objectFieldOffset(k);
                    i20 = charAt26 % 32;
                }
                if (i77 >= 18 && i77 <= 49) {
                    iArr[i63] = objectFieldOffset;
                    i63++;
                }
                i21 = i18;
                i22 = i20;
                i23 = objectFieldOffset;
            }
            int i96 = i66 + 1;
            iArr4[i66] = i78;
            int i97 = i66 + 2;
            String str2 = str;
            iArr4[i96] = ((charAt24 & 512) != 0 ? TLObject.FLAG_29 : 0) | ((charAt24 & 256) != 0 ? TLObject.FLAG_28 : 0) | (i77 << 20) | i23;
            i66 += 3;
            iArr4[i97] = (i22 << 20) | i21;
            str = str2;
            length = i76;
            i5 = i68;
            objArr2 = objArr;
            i34 = i19;
            iArr3 = iArr4;
            i3 = i16;
            i4 = i17;
        }
        return new que(iArr3, objArr3, i3, i4, sweVar.a, z, iArr, charAt3, i62, tveVar, zqeVar, mzeVar, wkeVar, iteVar);
    }

    public static void n(int i, Object obj, g6e g6eVar) {
        if (!(obj instanceof String)) {
            g6eVar.b(i, (sie) obj);
            return;
        }
        String str = (String) obj;
        lje ljeVar = (lje) g6eVar.b;
        ljeVar.c(i, 2);
        byte[] bArr = ljeVar.b;
        int i2 = ljeVar.d;
        try {
            int t = lje.t(str.length() * 3);
            int t2 = lje.t(str.length());
            if (t2 != t) {
                ljeVar.g(q0f.a(str));
                ljeVar.d = q0f.a.b(str, bArr, ljeVar.d, ljeVar.e());
                return;
            }
            int i3 = i2 + t2;
            ljeVar.d = i3;
            int b = q0f.a.b(str, bArr, i3, ljeVar.e());
            ljeVar.d = i2;
            ljeVar.g((b - i2) - t2);
            ljeVar.d = b;
        } catch (IndexOutOfBoundsException e) {
            throw new mje(e);
        } catch (z0f e2) {
            ljeVar.d = i2;
            lje.e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
            byte[] bytes = str.getBytes(foe.a);
            try {
                ljeVar.g(bytes.length);
                ljeVar.k(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e3) {
                throw new mje(e3);
            } catch (mje e4) {
                throw e4;
            }
        }
    }

    public static int z(Object obj, long j) {
        return ((Integer) i0f.l(obj, j)).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e1, code lost:
    
        return false;
     */
    @Override // xwe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Object obj) {
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            boolean z = true;
            if (i2 >= this.h) {
                return true;
            }
            int i4 = this.g[i2];
            int[] iArr = this.a;
            int i5 = iArr[i4];
            int y = y(i4);
            int i6 = iArr[i4 + 2];
            int i7 = i6 & 1048575;
            int i8 = 1 << (i6 >>> 20);
            if (i7 != i) {
                if (i7 != 1048575) {
                    i3 = o.getInt(obj, i7);
                }
                i = i7;
            }
            if ((268435456 & y) != 0) {
                if (!(i == 1048575 ? r(i4, obj) : (i3 & i8) != 0)) {
                    break;
                }
            }
            int i9 = (267386880 & y) >>> 20;
            if (i9 == 9 || i9 == 17) {
                if (i == 1048575) {
                    z = r(i4, obj);
                } else if ((i8 & i3) == 0) {
                    z = false;
                }
                if (z && !m(i4).a(i0f.l(obj, y & 1048575))) {
                    break;
                }
                i2++;
            } else {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        if (q(i5, i4, obj) && !m(i4).a(i0f.l(obj, y & 1048575))) {
                            break;
                        }
                    } else if (i9 != 49) {
                        if (i9 == 50) {
                            Object l = i0f.l(obj, y & 1048575);
                            this.m.getClass();
                            if (!((ate) l).isEmpty()) {
                                if (t(i4) == null) {
                                    throw new NoSuchMethodError();
                                }
                                fyb.g();
                                return false;
                            }
                        } else {
                            continue;
                        }
                    }
                    i2++;
                }
                List list = (List) i0f.l(obj, y & 1048575);
                if (!list.isEmpty()) {
                    xwe m = m(i4);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!m.a(list.get(i10))) {
                            break loop0;
                        }
                    }
                } else {
                    continue;
                }
                i2++;
            }
        }
    }

    @Override // xwe
    public final void b(Object obj) {
        int[] iArr;
        int i;
        int i2 = this.h;
        while (true) {
            iArr = this.g;
            i = this.i;
            if (i2 >= i) {
                break;
            }
            long y = y(iArr[i2]) & 1048575;
            Object l = i0f.l(obj, y);
            if (l != null) {
                this.m.getClass();
                ((ate) l).a = false;
                i0f.d(obj, y, l);
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.k.b(obj, iArr[i]);
            i++;
        }
        this.l.getClass();
        ((nne) obj).zzb.e = false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:81:0x009f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xwe
    public final void c(Object obj, byte[] bArr, int i, int i2, sad sadVar) {
        int i3;
        int i4;
        int i5;
        Object obj2;
        int i6;
        int i7;
        int i8;
        int i9;
        Object obj3;
        int i10;
        int i11;
        Object obj4;
        int i12;
        int i13;
        int i14;
        que queVar = this;
        Object obj5 = obj;
        byte[] bArr2 = bArr;
        int i15 = i2;
        sad sadVar2 = sadVar;
        if (!queVar.f) {
            j(obj5, bArr, i, i15, 0, sadVar);
            return;
        }
        int i16 = i;
        int i17 = -1;
        int i18 = 0;
        int i19 = 1048575;
        int i20 = 0;
        while (true) {
            Unsafe unsafe = o;
            if (i16 >= i15) {
                int i21 = i15;
                int i22 = i19;
                int i23 = i20;
                Object obj6 = obj5;
                if (i22 != 1048575) {
                    unsafe.putInt(obj6, i22, i23);
                }
                if (i16 != i21) {
                    throw new fpe("Failed to parse the message.");
                }
                return;
            }
            int i24 = i16 + 1;
            int i25 = bArr2[i16];
            if (i25 < 0) {
                i24 = g2f.d(i25, bArr2, i24, sadVar2);
                i25 = sadVar2.a;
            }
            int i26 = i24;
            int i27 = i25 >>> 3;
            int i28 = i25 & 7;
            int i29 = queVar.d;
            int i30 = queVar.c;
            if (i27 > i17) {
                i4 = (i27 < i30 || i27 > i29) ? -1 : queVar.s(i27, i18 / 3);
                i3 = 0;
            } else if (i27 < i30 || i27 > i29) {
                i3 = 0;
                i4 = -1;
            } else {
                i3 = 0;
                i4 = queVar.s(i27, 0);
            }
            int i31 = i4;
            if (i31 == -1) {
                i5 = i25;
                obj2 = obj5;
                i6 = i20;
                i7 = i26;
                i8 = i3;
            } else {
                int[] iArr = queVar.a;
                int i32 = iArr[i31 + 1];
                int i33 = (i32 & 267386880) >>> 20;
                int i34 = i25;
                long j = i32 & 1048575;
                if (i33 <= 17) {
                    int i35 = iArr[i31 + 2];
                    int i36 = 1 << (i35 >>> 20);
                    int i37 = i35 & 1048575;
                    if (i37 != i19) {
                        int i38 = 1048575;
                        i9 = 1;
                        if (i19 != 1048575) {
                            unsafe.putInt(obj5, i19, i20);
                            i38 = 1048575;
                        }
                        if (i37 != i38) {
                            i20 = unsafe.getInt(obj5, i37);
                        }
                        i19 = i37;
                    } else {
                        i9 = 1;
                    }
                    switch (i33) {
                        case 0:
                            i10 = i27;
                            if (i28 != i9) {
                                obj3 = obj5;
                                obj2 = obj3;
                                i6 = i20;
                                i7 = i26;
                                i8 = i31;
                                i27 = i10;
                                i5 = i34;
                                break;
                            } else {
                                i0f.c.m(obj5, j, Double.longBitsToDouble(g2f.j(i26, bArr2)));
                                i20 |= i36;
                                obj5 = obj5;
                                i16 = i26 + 8;
                                i18 = i31;
                                i17 = i10;
                                break;
                            }
                        case 1:
                            i10 = i27;
                            if (i28 != 5) {
                                obj3 = obj5;
                                obj2 = obj3;
                                i6 = i20;
                                i7 = i26;
                                i8 = i31;
                                i27 = i10;
                                i5 = i34;
                                break;
                            } else {
                                i0f.c.n(obj5, j, Float.intBitsToFloat(g2f.a(i26, bArr2)));
                                i16 = i26 + 4;
                                i20 |= i36;
                                i18 = i31;
                                i17 = i10;
                                break;
                            }
                        case 2:
                        case 3:
                            i10 = i27;
                            if (i28 != 0) {
                                obj3 = obj5;
                                obj2 = obj3;
                                i6 = i20;
                                i7 = i26;
                                i8 = i31;
                                i27 = i10;
                                i5 = i34;
                                break;
                            } else {
                                i11 = g2f.i(bArr2, i26, sadVar2);
                                unsafe.putLong(obj5, j, sadVar2.b);
                                i20 |= i36;
                                i16 = i11;
                                i18 = i31;
                                i17 = i10;
                                break;
                            }
                        case 4:
                        case 11:
                            i10 = i27;
                            if (i28 != 0) {
                                obj3 = obj5;
                                obj2 = obj3;
                                i6 = i20;
                                i7 = i26;
                                i8 = i31;
                                i27 = i10;
                                i5 = i34;
                                break;
                            } else {
                                int h = g2f.h(bArr2, i26, sadVar2);
                                unsafe.putInt(obj5, j, sadVar2.a);
                                i20 |= i36;
                                i16 = h;
                                i18 = i31;
                                i17 = i10;
                                break;
                            }
                        case 5:
                        case 14:
                            i10 = i27;
                            if (i28 != i9) {
                                obj3 = obj5;
                                obj2 = obj3;
                                i6 = i20;
                                i7 = i26;
                                i8 = i31;
                                i27 = i10;
                                i5 = i34;
                                break;
                            } else {
                                unsafe.putLong(obj5, j, g2f.j(i26, bArr2));
                                i16 = i26 + 8;
                                i20 |= i36;
                                i18 = i31;
                                i17 = i10;
                                break;
                            }
                        case 6:
                        case 13:
                            i10 = i27;
                            if (i28 != 5) {
                                obj3 = obj5;
                                obj2 = obj3;
                                i6 = i20;
                                i7 = i26;
                                i8 = i31;
                                i27 = i10;
                                i5 = i34;
                                break;
                            } else {
                                unsafe.putInt(obj5, j, g2f.a(i26, bArr2));
                                i16 = i26 + 4;
                                i20 |= i36;
                                i18 = i31;
                                i17 = i10;
                                break;
                            }
                        case 7:
                            i10 = i27;
                            if (i28 != 0) {
                                obj3 = obj5;
                                obj2 = obj3;
                                i6 = i20;
                                i7 = i26;
                                i8 = i31;
                                i27 = i10;
                                i5 = i34;
                                break;
                            } else {
                                i16 = g2f.i(bArr2, i26, sadVar2);
                                i0f.c.o(obj5, j, sadVar2.b != 0 ? i9 : 0);
                                i20 |= i36;
                                i18 = i31;
                                i17 = i10;
                                break;
                            }
                        case 8:
                            i10 = i27;
                            if (i28 != 2) {
                                obj3 = obj5;
                                obj2 = obj3;
                                i6 = i20;
                                i7 = i26;
                                i8 = i31;
                                i27 = i10;
                                i5 = i34;
                                break;
                            } else {
                                i16 = (i32 & TLObject.FLAG_29) == 0 ? g2f.k(bArr2, i26, sadVar2) : g2f.l(bArr2, i26, sadVar2);
                                unsafe.putObject(obj5, j, sadVar2.c);
                                i20 |= i36;
                                i18 = i31;
                                i17 = i10;
                                break;
                            }
                        case 9:
                            i10 = i27;
                            if (i28 != 2) {
                                obj3 = obj5;
                                obj2 = obj3;
                                i6 = i20;
                                i7 = i26;
                                i8 = i31;
                                i27 = i10;
                                i5 = i34;
                                break;
                            } else {
                                i16 = g2f.g(queVar.m(i31), bArr2, i26, i15, sadVar2);
                                Object object = unsafe.getObject(obj5, j);
                                Object obj7 = sadVar2.c;
                                if (object == null) {
                                    unsafe.putObject(obj5, j, obj7);
                                } else {
                                    unsafe.putObject(obj5, j, foe.b(object, obj7));
                                }
                                i20 |= i36;
                                i18 = i31;
                                i17 = i10;
                                break;
                            }
                        case 10:
                            i10 = i27;
                            if (i28 != 2) {
                                obj3 = obj5;
                                obj2 = obj3;
                                i6 = i20;
                                i7 = i26;
                                i8 = i31;
                                i27 = i10;
                                i5 = i34;
                                break;
                            } else {
                                i16 = g2f.m(bArr2, i26, sadVar2);
                                unsafe.putObject(obj5, j, sadVar2.c);
                                i20 |= i36;
                                i18 = i31;
                                i17 = i10;
                                break;
                            }
                        case 12:
                            i10 = i27;
                            if (i28 != 0) {
                                obj3 = obj5;
                                obj2 = obj3;
                                i6 = i20;
                                i7 = i26;
                                i8 = i31;
                                i27 = i10;
                                i5 = i34;
                                break;
                            } else {
                                i16 = g2f.h(bArr2, i26, sadVar2);
                                unsafe.putInt(obj5, j, sadVar2.a);
                                i20 |= i36;
                                i18 = i31;
                                i17 = i10;
                                break;
                            }
                        case 15:
                            i10 = i27;
                            if (i28 != 0) {
                                obj3 = obj5;
                                obj2 = obj3;
                                i6 = i20;
                                i7 = i26;
                                i8 = i31;
                                i27 = i10;
                                i5 = i34;
                                break;
                            } else {
                                i16 = g2f.h(bArr2, i26, sadVar2);
                                unsafe.putInt(obj5, j, o2f.a(sadVar2.a));
                                i20 |= i36;
                                i18 = i31;
                                i17 = i10;
                                break;
                            }
                        case 16:
                            if (i28 != 0) {
                                i10 = i27;
                                obj3 = obj5;
                                obj2 = obj3;
                                i6 = i20;
                                i7 = i26;
                                i8 = i31;
                                i27 = i10;
                                i5 = i34;
                                break;
                            } else {
                                i11 = g2f.i(bArr2, i26, sadVar2);
                                long j2 = sadVar2.b;
                                i10 = i27;
                                unsafe.putLong(obj5, j, (j2 >>> i9) ^ (-(j2 & 1)));
                                i20 |= i36;
                                i16 = i11;
                                i18 = i31;
                                i17 = i10;
                                break;
                            }
                        default:
                            obj3 = obj5;
                            i10 = i27;
                            obj2 = obj3;
                            i6 = i20;
                            i7 = i26;
                            i8 = i31;
                            i27 = i10;
                            i5 = i34;
                            break;
                    }
                } else {
                    Object obj8 = obj5;
                    i10 = i27;
                    if (i33 != 27) {
                        i5 = i34;
                        if (i33 <= 49) {
                            i6 = i20;
                            i13 = i19;
                            i27 = i10;
                            i14 = queVar.i(obj, bArr, i26, i2, i5, i27, i28, i31, i32, i33, j, sadVar);
                            obj5 = obj;
                            i8 = i31;
                            if (i14 == i26) {
                                obj2 = obj5;
                                i7 = i14;
                            } else {
                                i15 = i2;
                                sadVar2 = sadVar;
                                i17 = i27;
                                i16 = i14;
                                i18 = i8;
                                i19 = i13;
                                i20 = i6;
                                bArr2 = bArr;
                            }
                        } else {
                            obj4 = obj;
                            i6 = i20;
                            i8 = i31;
                            i13 = i19;
                            i12 = i26;
                            i27 = i10;
                            if (i33 != 50) {
                                i14 = queVar.h(obj4, bArr, i12, i2, i5, i27, i28, i32, i33, j, i8, sadVar);
                                obj2 = obj4;
                                if (i14 == i12) {
                                    i7 = i14;
                                } else {
                                    queVar = this;
                                    sadVar2 = sadVar;
                                    i17 = i27;
                                    i16 = i14;
                                    obj5 = obj2;
                                    i18 = i8;
                                    i19 = i13;
                                    i20 = i6;
                                    bArr2 = bArr;
                                    i15 = i2;
                                }
                            } else if (i28 == 2) {
                                queVar.o(obj4, i8, j);
                                throw null;
                            }
                        }
                        i19 = i13;
                    } else if (i28 == 2) {
                        kpe kpeVar = (kpe) unsafe.getObject(obj8, j);
                        if (!kpeVar.zza()) {
                            int size = kpeVar.size();
                            kpeVar = kpeVar.zza(size == 0 ? 10 : size << 1);
                            unsafe.putObject(obj8, j, kpeVar);
                        }
                        i16 = g2f.e(queVar.m(i31), i34, bArr2, i26, i15, kpeVar, sadVar2);
                        obj5 = obj;
                        bArr2 = bArr;
                        i15 = i2;
                        sadVar2 = sadVar;
                        i18 = i31;
                        i17 = i10;
                    } else {
                        obj4 = obj;
                        i6 = i20;
                        i12 = i26;
                        i8 = i31;
                        i27 = i10;
                        i5 = i34;
                        i13 = i19;
                    }
                    obj2 = obj4;
                    i7 = i12;
                    i19 = i13;
                }
            }
            bArr2 = bArr;
            sadVar2 = sadVar;
            i16 = g2f.c(i5, bArr, i7, i2, B(obj2), sadVar);
            obj5 = obj2;
            i18 = i8;
            i20 = i6;
            queVar = this;
            i15 = i2;
            i17 = i27;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xwe
    public final void d(Object obj, g6e g6eVar) {
        int i;
        int i2;
        int i3;
        int i4;
        g6eVar.getClass();
        lje ljeVar = (lje) g6eVar.b;
        boolean z = this.f;
        mze mzeVar = this.l;
        ite iteVar = this.m;
        int[] iArr = this.a;
        int i5 = 1;
        int i6 = 1048575;
        if (z) {
            int length = iArr.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int y = y(i7);
                int i8 = iArr[i7];
                switch ((y & 267386880) >>> 20) {
                    case 0:
                        if (r(i7, obj)) {
                            long doubleToRawLongBits = Double.doubleToRawLongBits(i0f.c.t(obj, y & 1048575));
                            ljeVar.c(i8, 1);
                            ljeVar.j(doubleToRawLongBits);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (r(i7, obj)) {
                            int floatToRawIntBits = Float.floatToRawIntBits(i0f.c.r(obj, y & 1048575));
                            ljeVar.c(i8, 5);
                            ljeVar.l(floatToRawIntBits);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (r(i7, obj)) {
                            long g = i0f.g(obj, y & 1048575);
                            ljeVar.c(i8, 0);
                            ljeVar.d(g);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (r(i7, obj)) {
                            long g2 = i0f.g(obj, y & 1048575);
                            ljeVar.c(i8, 0);
                            ljeVar.d(g2);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (r(i7, obj)) {
                            int b = i0f.b(obj, y & 1048575);
                            ljeVar.c(i8, 0);
                            ljeVar.b(b);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (r(i7, obj)) {
                            long g3 = i0f.g(obj, y & 1048575);
                            ljeVar.c(i8, 1);
                            ljeVar.j(g3);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (r(i7, obj)) {
                            int b2 = i0f.b(obj, y & 1048575);
                            ljeVar.c(i8, 5);
                            ljeVar.l(b2);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (r(i7, obj)) {
                            boolean q = i0f.c.q(obj, y & 1048575);
                            ljeVar.c(i8, 0);
                            ljeVar.a(q ? (byte) 1 : (byte) 0);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (r(i7, obj)) {
                            n(i8, i0f.l(obj, y & 1048575), g6eVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (r(i7, obj)) {
                            g6eVar.a(i8, i0f.l(obj, y & 1048575), m(i7));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (r(i7, obj)) {
                            g6eVar.b(i8, (sie) i0f.l(obj, y & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (r(i7, obj)) {
                            int b3 = i0f.b(obj, y & 1048575);
                            ljeVar.c(i8, 0);
                            ljeVar.g(b3);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (r(i7, obj)) {
                            int b4 = i0f.b(obj, y & 1048575);
                            ljeVar.c(i8, 0);
                            ljeVar.b(b4);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (r(i7, obj)) {
                            int b5 = i0f.b(obj, y & 1048575);
                            ljeVar.c(i8, 5);
                            ljeVar.l(b5);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (r(i7, obj)) {
                            long g4 = i0f.g(obj, y & 1048575);
                            ljeVar.c(i8, 1);
                            ljeVar.j(g4);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (r(i7, obj)) {
                            int b6 = i0f.b(obj, y & 1048575);
                            ljeVar.c(i8, 0);
                            ljeVar.g((b6 << 1) ^ (b6 >> 31));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (r(i7, obj)) {
                            long g5 = i0f.g(obj, y & 1048575);
                            ljeVar.c(i8, 0);
                            ljeVar.d((g5 << 1) ^ (g5 >> 63));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (r(i7, obj)) {
                            g6eVar.c(i8, i0f.l(obj, y & 1048575), m(i7));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        fxe.g(i8, (List) i0f.l(obj, y & 1048575), g6eVar, false);
                        break;
                    case 19:
                        fxe.n(i8, (List) i0f.l(obj, y & 1048575), g6eVar, false);
                        break;
                    case 20:
                        fxe.q(i8, (List) i0f.l(obj, y & 1048575), g6eVar, false);
                        break;
                    case 21:
                        fxe.s(i8, (List) i0f.l(obj, y & 1048575), g6eVar, false);
                        break;
                    case 22:
                        fxe.B(i8, (List) i0f.l(obj, y & 1048575), g6eVar, false);
                        break;
                    case 23:
                        fxe.w(i8, (List) i0f.l(obj, y & 1048575), g6eVar, false);
                        break;
                    case 24:
                        fxe.G(i8, (List) i0f.l(obj, y & 1048575), g6eVar, false);
                        break;
                    case 25:
                        fxe.J(i8, (List) i0f.l(obj, y & 1048575), g6eVar, false);
                        break;
                    case 26:
                        fxe.e(i8, (List) i0f.l(obj, y & 1048575), g6eVar);
                        break;
                    case 27:
                        fxe.f(i8, (List) i0f.l(obj, y & 1048575), g6eVar, m(i7));
                        break;
                    case 28:
                        fxe.l(i8, (List) i0f.l(obj, y & 1048575), g6eVar);
                        break;
                    case 29:
                        fxe.E(i8, (List) i0f.l(obj, y & 1048575), g6eVar, false);
                        break;
                    case kk7.S /* 30 */:
                        fxe.I(i8, (List) i0f.l(obj, y & 1048575), g6eVar, false);
                        break;
                    case 31:
                        fxe.H(i8, (List) i0f.l(obj, y & 1048575), g6eVar, false);
                        break;
                    case 32:
                        fxe.y(i8, (List) i0f.l(obj, y & 1048575), g6eVar, false);
                        break;
                    case 33:
                        fxe.F(i8, (List) i0f.l(obj, y & 1048575), g6eVar, false);
                        break;
                    case 34:
                        fxe.u(i8, (List) i0f.l(obj, y & 1048575), g6eVar, false);
                        break;
                    case 35:
                        fxe.g(i8, (List) i0f.l(obj, y & 1048575), g6eVar, true);
                        break;
                    case 36:
                        fxe.n(i8, (List) i0f.l(obj, y & 1048575), g6eVar, true);
                        break;
                    case 37:
                        fxe.q(i8, (List) i0f.l(obj, y & 1048575), g6eVar, true);
                        break;
                    case 38:
                        fxe.s(i8, (List) i0f.l(obj, y & 1048575), g6eVar, true);
                        break;
                    case 39:
                        fxe.B(i8, (List) i0f.l(obj, y & 1048575), g6eVar, true);
                        break;
                    case 40:
                        fxe.w(i8, (List) i0f.l(obj, y & 1048575), g6eVar, true);
                        break;
                    case 41:
                        fxe.G(i8, (List) i0f.l(obj, y & 1048575), g6eVar, true);
                        break;
                    case 42:
                        fxe.J(i8, (List) i0f.l(obj, y & 1048575), g6eVar, true);
                        break;
                    case 43:
                        fxe.E(i8, (List) i0f.l(obj, y & 1048575), g6eVar, true);
                        break;
                    case 44:
                        fxe.I(i8, (List) i0f.l(obj, y & 1048575), g6eVar, true);
                        break;
                    case 45:
                        fxe.H(i8, (List) i0f.l(obj, y & 1048575), g6eVar, true);
                        break;
                    case 46:
                        fxe.y(i8, (List) i0f.l(obj, y & 1048575), g6eVar, true);
                        break;
                    case 47:
                        fxe.F(i8, (List) i0f.l(obj, y & 1048575), g6eVar, true);
                        break;
                    case 48:
                        fxe.u(i8, (List) i0f.l(obj, y & 1048575), g6eVar, true);
                        break;
                    case 49:
                        fxe.m(i8, (List) i0f.l(obj, y & 1048575), g6eVar, m(i7));
                        break;
                    case 50:
                        if (i0f.l(obj, y & 1048575) != null) {
                            Object t = t(i7);
                            iteVar.getClass();
                            if (t == null) {
                                throw new NoSuchMethodError();
                            }
                            fyb.g();
                            return;
                        }
                        break;
                    case kk7.n0 /* 51 */:
                        if (q(i8, i7, obj)) {
                            long doubleToRawLongBits2 = Double.doubleToRawLongBits(((Double) i0f.l(obj, y & 1048575)).doubleValue());
                            ljeVar.c(i8, 1);
                            ljeVar.j(doubleToRawLongBits2);
                            break;
                        } else {
                            break;
                        }
                    case kk7.o0 /* 52 */:
                        if (q(i8, i7, obj)) {
                            int floatToRawIntBits2 = Float.floatToRawIntBits(((Float) i0f.l(obj, y & 1048575)).floatValue());
                            ljeVar.c(i8, 5);
                            ljeVar.l(floatToRawIntBits2);
                            break;
                        } else {
                            break;
                        }
                    case kk7.p0 /* 53 */:
                        if (q(i8, i7, obj)) {
                            long A = A(obj, y & 1048575);
                            ljeVar.c(i8, 0);
                            ljeVar.d(A);
                            break;
                        } else {
                            break;
                        }
                    case kk7.q0 /* 54 */:
                        if (q(i8, i7, obj)) {
                            long A2 = A(obj, y & 1048575);
                            ljeVar.c(i8, 0);
                            ljeVar.d(A2);
                            break;
                        } else {
                            break;
                        }
                    case kk7.r0 /* 55 */:
                        if (q(i8, i7, obj)) {
                            int z2 = z(obj, y & 1048575);
                            ljeVar.c(i8, 0);
                            ljeVar.b(z2);
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (q(i8, i7, obj)) {
                            long A3 = A(obj, y & 1048575);
                            ljeVar.c(i8, 1);
                            ljeVar.j(A3);
                            break;
                        } else {
                            break;
                        }
                    case kk7.t0 /* 57 */:
                        if (q(i8, i7, obj)) {
                            int z3 = z(obj, y & 1048575);
                            ljeVar.c(i8, 5);
                            ljeVar.l(z3);
                            break;
                        } else {
                            break;
                        }
                    case kk7.u0 /* 58 */:
                        if (q(i8, i7, obj)) {
                            boolean booleanValue = ((Boolean) i0f.l(obj, y & 1048575)).booleanValue();
                            ljeVar.c(i8, 0);
                            ljeVar.a(booleanValue ? (byte) 1 : (byte) 0);
                            break;
                        } else {
                            break;
                        }
                    case kk7.v0 /* 59 */:
                        if (q(i8, i7, obj)) {
                            n(i8, i0f.l(obj, y & 1048575), g6eVar);
                            break;
                        } else {
                            break;
                        }
                    case kk7.w0 /* 60 */:
                        if (q(i8, i7, obj)) {
                            g6eVar.a(i8, i0f.l(obj, y & 1048575), m(i7));
                            break;
                        } else {
                            break;
                        }
                    case kk7.x0 /* 61 */:
                        if (q(i8, i7, obj)) {
                            g6eVar.b(i8, (sie) i0f.l(obj, y & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case kk7.y0 /* 62 */:
                        if (q(i8, i7, obj)) {
                            int z4 = z(obj, y & 1048575);
                            ljeVar.c(i8, 0);
                            ljeVar.g(z4);
                            break;
                        } else {
                            break;
                        }
                    case kk7.z0 /* 63 */:
                        if (q(i8, i7, obj)) {
                            int z5 = z(obj, y & 1048575);
                            ljeVar.c(i8, 0);
                            ljeVar.b(z5);
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (q(i8, i7, obj)) {
                            int z6 = z(obj, y & 1048575);
                            ljeVar.c(i8, 5);
                            ljeVar.l(z6);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (q(i8, i7, obj)) {
                            long A4 = A(obj, y & 1048575);
                            ljeVar.c(i8, 1);
                            ljeVar.j(A4);
                            break;
                        } else {
                            break;
                        }
                    case kk7.C0 /* 66 */:
                        if (q(i8, i7, obj)) {
                            int z7 = z(obj, y & 1048575);
                            ljeVar.c(i8, 0);
                            ljeVar.g((z7 << 1) ^ (z7 >> 31));
                            break;
                        } else {
                            break;
                        }
                    case kk7.D0 /* 67 */:
                        if (q(i8, i7, obj)) {
                            long A5 = A(obj, y & 1048575);
                            ljeVar.c(i8, 0);
                            ljeVar.d((A5 << 1) ^ (A5 >> 63));
                            break;
                        } else {
                            break;
                        }
                    case kk7.E0 /* 68 */:
                        if (q(i8, i7, obj)) {
                            g6eVar.c(i8, i0f.l(obj, y & 1048575), m(i7));
                            break;
                        } else {
                            break;
                        }
                }
            }
            mzeVar.getClass();
            ((nne) obj).zzb.c(g6eVar);
            return;
        }
        int length2 = iArr.length;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (i9 < length2) {
            int y2 = y(i9);
            int i12 = iArr[i9];
            int i13 = i6;
            int i14 = (y2 & 267386880) >>> 20;
            int i15 = i5;
            Unsafe unsafe = o;
            if (i14 <= 17) {
                int i16 = iArr[i9 + 2];
                i = length2;
                int i17 = i16 & i13;
                if (i17 != i11) {
                    i10 = unsafe.getInt(obj, i17);
                    i11 = i17;
                }
                i2 = i15 << (i16 >>> 20);
            } else {
                i = length2;
                i2 = 0;
            }
            int i18 = i2;
            mze mzeVar2 = mzeVar;
            long j = y2 & i13;
            switch (i14) {
                case 0:
                    if ((i10 & i18) != 0) {
                        long doubleToRawLongBits3 = Double.doubleToRawLongBits(i0f.c.t(obj, j));
                        i3 = 1;
                        ljeVar.c(i12, 1);
                        ljeVar.j(doubleToRawLongBits3);
                        i9 += 3;
                        mzeVar = mzeVar2;
                        i5 = i3;
                        i6 = i13;
                        length2 = i;
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 1:
                    if ((i10 & i18) != 0) {
                        int floatToRawIntBits3 = Float.floatToRawIntBits(i0f.c.r(obj, j));
                        ljeVar.c(i12, 5);
                        ljeVar.l(floatToRawIntBits3);
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 2:
                    if ((i10 & i18) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        ljeVar.c(i12, 0);
                        ljeVar.d(j2);
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 3:
                    if ((i10 & i18) != 0) {
                        long j3 = unsafe.getLong(obj, j);
                        ljeVar.c(i12, 0);
                        ljeVar.d(j3);
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 4:
                    if ((i10 & i18) != 0) {
                        int i19 = unsafe.getInt(obj, j);
                        ljeVar.c(i12, 0);
                        ljeVar.b(i19);
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 5:
                    if ((i10 & i18) != 0) {
                        long j4 = unsafe.getLong(obj, j);
                        ljeVar.c(i12, 1);
                        ljeVar.j(j4);
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 6:
                    if ((i10 & i18) != 0) {
                        int i20 = unsafe.getInt(obj, j);
                        ljeVar.c(i12, 5);
                        ljeVar.l(i20);
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 7:
                    if ((i10 & i18) != 0) {
                        boolean q2 = i0f.c.q(obj, j);
                        ljeVar.c(i12, 0);
                        ljeVar.a(q2 ? (byte) 1 : (byte) 0);
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 8:
                    if ((i10 & i18) != 0) {
                        n(i12, unsafe.getObject(obj, j), g6eVar);
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 9:
                    if ((i10 & i18) != 0) {
                        g6eVar.a(i12, unsafe.getObject(obj, j), m(i9));
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 10:
                    if ((i10 & i18) != 0) {
                        g6eVar.b(i12, (sie) unsafe.getObject(obj, j));
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 11:
                    if ((i10 & i18) != 0) {
                        int i21 = unsafe.getInt(obj, j);
                        ljeVar.c(i12, 0);
                        ljeVar.g(i21);
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 12:
                    if ((i10 & i18) != 0) {
                        int i22 = unsafe.getInt(obj, j);
                        ljeVar.c(i12, 0);
                        ljeVar.b(i22);
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 13:
                    if ((i10 & i18) != 0) {
                        int i23 = unsafe.getInt(obj, j);
                        ljeVar.c(i12, 5);
                        ljeVar.l(i23);
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 14:
                    if ((i10 & i18) != 0) {
                        long j5 = unsafe.getLong(obj, j);
                        ljeVar.c(i12, 1);
                        ljeVar.j(j5);
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 15:
                    if ((i10 & i18) != 0) {
                        int i24 = unsafe.getInt(obj, j);
                        ljeVar.c(i12, 0);
                        ljeVar.g((i24 << 1) ^ (i24 >> 31));
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 16:
                    if ((i10 & i18) != 0) {
                        long j6 = unsafe.getLong(obj, j);
                        ljeVar.c(i12, 0);
                        ljeVar.d((j6 << 1) ^ (j6 >> 63));
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 17:
                    if ((i10 & i18) != 0) {
                        g6eVar.c(i12, unsafe.getObject(obj, j), m(i9));
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 18:
                    fxe.g(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, false);
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 19:
                    fxe.n(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, false);
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 20:
                    fxe.q(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, false);
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 21:
                    fxe.s(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, false);
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 22:
                    fxe.B(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, false);
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 23:
                    fxe.w(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, false);
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 24:
                    fxe.G(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, false);
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 25:
                    fxe.J(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, false);
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 26:
                    fxe.e(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar);
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 27:
                    fxe.f(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, m(i9));
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 28:
                    fxe.l(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar);
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 29:
                    fxe.E(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, false);
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case kk7.S /* 30 */:
                    fxe.I(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, false);
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 31:
                    fxe.H(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, false);
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 32:
                    fxe.y(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, false);
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 33:
                    fxe.F(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, false);
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 34:
                    fxe.u(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, false);
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 35:
                    boolean z8 = i15;
                    fxe.g(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, z8);
                    i4 = z8;
                    i3 = i4;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 36:
                    boolean z9 = i15;
                    fxe.n(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, z9);
                    i4 = z9;
                    i3 = i4;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 37:
                    boolean z10 = i15;
                    fxe.q(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, z10);
                    i4 = z10;
                    i3 = i4;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 38:
                    boolean z11 = i15;
                    fxe.s(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, z11);
                    i4 = z11;
                    i3 = i4;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 39:
                    boolean z12 = i15;
                    fxe.B(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, z12);
                    i4 = z12;
                    i3 = i4;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 40:
                    boolean z13 = i15;
                    fxe.w(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, z13);
                    i4 = z13;
                    i3 = i4;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 41:
                    boolean z14 = i15;
                    fxe.G(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, z14);
                    i4 = z14;
                    i3 = i4;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 42:
                    boolean z15 = i15;
                    fxe.J(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, z15);
                    i4 = z15;
                    i3 = i4;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 43:
                    boolean z16 = i15;
                    fxe.E(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, z16);
                    i4 = z16;
                    i3 = i4;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 44:
                    boolean z17 = i15;
                    fxe.I(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, z17);
                    i4 = z17;
                    i3 = i4;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 45:
                    boolean z18 = i15;
                    fxe.H(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, z18);
                    i4 = z18;
                    i3 = i4;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 46:
                    boolean z19 = i15;
                    fxe.y(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, z19);
                    i4 = z19;
                    i3 = i4;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 47:
                    boolean z20 = i15;
                    fxe.F(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, z20);
                    i4 = z20;
                    i3 = i4;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 48:
                    i4 = 1;
                    fxe.u(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, true);
                    i3 = i4;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 49:
                    fxe.m(iArr[i9], (List) unsafe.getObject(obj, j), g6eVar, m(i9));
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        Object t2 = t(i9);
                        iteVar.getClass();
                        if (t2 == null) {
                            throw new NoSuchMethodError();
                        }
                        fyb.g();
                        return;
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case kk7.n0 /* 51 */:
                    if (q(i12, i9, obj)) {
                        long doubleToRawLongBits4 = Double.doubleToRawLongBits(((Double) i0f.l(obj, j)).doubleValue());
                        ljeVar.c(i12, 1);
                        ljeVar.j(doubleToRawLongBits4);
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case kk7.o0 /* 52 */:
                    if (q(i12, i9, obj)) {
                        int floatToRawIntBits4 = Float.floatToRawIntBits(((Float) i0f.l(obj, j)).floatValue());
                        ljeVar.c(i12, 5);
                        ljeVar.l(floatToRawIntBits4);
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case kk7.p0 /* 53 */:
                    if (q(i12, i9, obj)) {
                        long A6 = A(obj, j);
                        ljeVar.c(i12, 0);
                        ljeVar.d(A6);
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case kk7.q0 /* 54 */:
                    if (q(i12, i9, obj)) {
                        long A7 = A(obj, j);
                        ljeVar.c(i12, 0);
                        ljeVar.d(A7);
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case kk7.r0 /* 55 */:
                    if (q(i12, i9, obj)) {
                        int z21 = z(obj, j);
                        ljeVar.c(i12, 0);
                        ljeVar.b(z21);
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 56:
                    if (q(i12, i9, obj)) {
                        long A8 = A(obj, j);
                        ljeVar.c(i12, 1);
                        ljeVar.j(A8);
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case kk7.t0 /* 57 */:
                    if (q(i12, i9, obj)) {
                        int z22 = z(obj, j);
                        ljeVar.c(i12, 5);
                        ljeVar.l(z22);
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case kk7.u0 /* 58 */:
                    if (q(i12, i9, obj)) {
                        boolean booleanValue2 = ((Boolean) i0f.l(obj, j)).booleanValue();
                        ljeVar.c(i12, 0);
                        ljeVar.a(booleanValue2 ? (byte) 1 : (byte) 0);
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case kk7.v0 /* 59 */:
                    if (q(i12, i9, obj)) {
                        n(i12, unsafe.getObject(obj, j), g6eVar);
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case kk7.w0 /* 60 */:
                    if (q(i12, i9, obj)) {
                        g6eVar.a(i12, unsafe.getObject(obj, j), m(i9));
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case kk7.x0 /* 61 */:
                    if (q(i12, i9, obj)) {
                        g6eVar.b(i12, (sie) unsafe.getObject(obj, j));
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case kk7.y0 /* 62 */:
                    if (q(i12, i9, obj)) {
                        int z23 = z(obj, j);
                        ljeVar.c(i12, 0);
                        ljeVar.g(z23);
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case kk7.z0 /* 63 */:
                    if (q(i12, i9, obj)) {
                        int z24 = z(obj, j);
                        ljeVar.c(i12, 0);
                        ljeVar.b(z24);
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 64:
                    if (q(i12, i9, obj)) {
                        int z25 = z(obj, j);
                        ljeVar.c(i12, 5);
                        ljeVar.l(z25);
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case 65:
                    if (q(i12, i9, obj)) {
                        long A9 = A(obj, j);
                        ljeVar.c(i12, i15);
                        ljeVar.j(A9);
                    }
                    i3 = 1;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case kk7.C0 /* 66 */:
                    if (q(i12, i9, obj)) {
                        int z26 = z(obj, j);
                        ljeVar.c(i12, 0);
                        ljeVar.g((z26 << 1) ^ (z26 >> 31));
                    }
                    i3 = i15;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case kk7.D0 /* 67 */:
                    if (q(i12, i9, obj)) {
                        long A10 = A(obj, j);
                        ljeVar.c(i12, 0);
                        ljeVar.d((A10 << i15) ^ (A10 >> 63));
                    }
                    i3 = i15;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                case kk7.E0 /* 68 */:
                    if (q(i12, i9, obj)) {
                        g6eVar.c(i12, unsafe.getObject(obj, j), m(i9));
                    }
                    i3 = i15;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
                default:
                    i3 = i15;
                    i9 += 3;
                    mzeVar = mzeVar2;
                    i5 = i3;
                    i6 = i13;
                    length2 = i;
            }
        }
        mzeVar.getClass();
        ((nne) obj).zzb.c(g6eVar);
    }

    @Override // xwe
    public final void e(nne nneVar, nne nneVar2) {
        nne nneVar3;
        nneVar2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                fxe.h(this.l, nneVar, nneVar2);
                return;
            }
            int y = y(i);
            long j = y & 1048575;
            int i2 = iArr[i];
            switch ((y & 267386880) >>> 20) {
                case 0:
                    nneVar3 = nneVar;
                    if (!r(i, nneVar2)) {
                        break;
                    } else {
                        c6c c6cVar = i0f.c;
                        c6cVar.m(nneVar3, j, c6cVar.t(nneVar2, j));
                        u(nneVar3, i);
                        continue;
                    }
                case 1:
                    nneVar3 = nneVar;
                    if (r(i, nneVar2)) {
                        c6c c6cVar2 = i0f.c;
                        c6cVar2.n(nneVar3, j, c6cVar2.r(nneVar2, j));
                        u(nneVar3, i);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    nneVar3 = nneVar;
                    if (r(i, nneVar2)) {
                        i0f.c.a.putLong(nneVar3, j, i0f.g(nneVar2, j));
                        u(nneVar3, i);
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    nneVar3 = nneVar;
                    if (r(i, nneVar2)) {
                        i0f.c.a.putLong(nneVar3, j, i0f.g(nneVar2, j));
                        u(nneVar3, i);
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    nneVar3 = nneVar;
                    if (r(i, nneVar2)) {
                        i0f.c(nneVar3, i0f.b(nneVar2, j), j);
                        u(nneVar3, i);
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    nneVar3 = nneVar;
                    if (r(i, nneVar2)) {
                        i0f.c.a.putLong(nneVar3, j, i0f.g(nneVar2, j));
                        u(nneVar3, i);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    nneVar3 = nneVar;
                    if (r(i, nneVar2)) {
                        i0f.c(nneVar3, i0f.b(nneVar2, j), j);
                        u(nneVar3, i);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    nneVar3 = nneVar;
                    if (r(i, nneVar2)) {
                        c6c c6cVar3 = i0f.c;
                        c6cVar3.o(nneVar3, j, c6cVar3.q(nneVar2, j));
                        u(nneVar3, i);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    nneVar3 = nneVar;
                    if (r(i, nneVar2)) {
                        i0f.d(nneVar3, j, i0f.l(nneVar2, j));
                        u(nneVar3, i);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    nneVar3 = nneVar;
                    p(nneVar3, nneVar2, i);
                    continue;
                case 10:
                    nneVar3 = nneVar;
                    if (r(i, nneVar2)) {
                        i0f.d(nneVar3, j, i0f.l(nneVar2, j));
                        u(nneVar3, i);
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    nneVar3 = nneVar;
                    if (r(i, nneVar2)) {
                        i0f.c(nneVar3, i0f.b(nneVar2, j), j);
                        u(nneVar3, i);
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    nneVar3 = nneVar;
                    if (r(i, nneVar2)) {
                        i0f.c(nneVar3, i0f.b(nneVar2, j), j);
                        u(nneVar3, i);
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    nneVar3 = nneVar;
                    if (r(i, nneVar2)) {
                        i0f.c(nneVar3, i0f.b(nneVar2, j), j);
                        u(nneVar3, i);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    nneVar3 = nneVar;
                    if (r(i, nneVar2)) {
                        i0f.c.a.putLong(nneVar3, j, i0f.g(nneVar2, j));
                        u(nneVar3, i);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    nneVar3 = nneVar;
                    if (r(i, nneVar2)) {
                        i0f.c(nneVar3, i0f.b(nneVar2, j), j);
                        u(nneVar3, i);
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (r(i, nneVar2)) {
                        nneVar3 = nneVar;
                        i0f.c.a.putLong(nneVar3, j, i0f.g(nneVar2, j));
                        u(nneVar3, i);
                        break;
                    }
                    break;
                case 17:
                    p(nneVar, nneVar2, i);
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
                case kk7.S /* 30 */:
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
                    this.k.a(nneVar, nneVar2, j);
                    break;
                case 50:
                    Class cls = fxe.a;
                    Object l = i0f.l(nneVar, j);
                    Object l2 = i0f.l(nneVar2, j);
                    this.m.getClass();
                    i0f.d(nneVar, j, ite.a(l, l2));
                    break;
                case kk7.n0 /* 51 */:
                case kk7.o0 /* 52 */:
                case kk7.p0 /* 53 */:
                case kk7.q0 /* 54 */:
                case kk7.r0 /* 55 */:
                case 56:
                case kk7.t0 /* 57 */:
                case kk7.u0 /* 58 */:
                case kk7.v0 /* 59 */:
                    if (q(i2, i, nneVar2)) {
                        i0f.d(nneVar, j, i0f.l(nneVar2, j));
                        i0f.c(nneVar, i2, iArr[i + 2] & 1048575);
                        break;
                    }
                    break;
                case kk7.w0 /* 60 */:
                    v(nneVar, nneVar2, i);
                    break;
                case kk7.x0 /* 61 */:
                case kk7.y0 /* 62 */:
                case kk7.z0 /* 63 */:
                case 64:
                case 65:
                case kk7.C0 /* 66 */:
                case kk7.D0 /* 67 */:
                    if (q(i2, i, nneVar2)) {
                        i0f.d(nneVar, j, i0f.l(nneVar2, j));
                        i0f.c(nneVar, i2, iArr[i + 2] & 1048575);
                        break;
                    }
                    break;
                case kk7.E0 /* 68 */:
                    v(nneVar, nneVar2, i);
                    break;
            }
            nneVar3 = nneVar;
            i += 3;
            nneVar = nneVar3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        if (fxe.i(i0f.l(r12, r7), i0f.l(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (i0f.g(r12, r7) == i0f.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if (i0f.b(r12, r7) == i0f.b(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (i0f.g(r12, r7) == i0f.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b6, code lost:
    
        if (i0f.b(r12, r7) == i0f.b(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        if (i0f.b(r12, r7) == i0f.b(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
    
        if (i0f.b(r12, r7) == i0f.b(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f0, code lost:
    
        if (fxe.i(i0f.l(r12, r7), i0f.l(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0106, code lost:
    
        if (fxe.i(i0f.l(r12, r7), i0f.l(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011c, code lost:
    
        if (fxe.i(i0f.l(r12, r7), i0f.l(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0130, code lost:
    
        if (r5.q(r12, r7) != r5.q(r13, r7)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0142, code lost:
    
        if (i0f.b(r12, r7) == i0f.b(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0156, code lost:
    
        if (i0f.g(r12, r7) == i0f.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0168, code lost:
    
        if (i0f.b(r12, r7) == i0f.b(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017b, code lost:
    
        if (i0f.g(r12, r7) == i0f.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018e, code lost:
    
        if (i0f.g(r12, r7) == i0f.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a9, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.r(r12, r7)) != java.lang.Float.floatToIntBits(r5.r(r13, r7))) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c6, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.t(r12, r7)) != java.lang.Double.doubleToLongBits(r5.t(r13, r7))) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (fxe.i(i0f.l(r12, r7), i0f.l(r13, r7)) != false) goto L105;
     */
    @Override // xwe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(nne nneVar, nne nneVar2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int y = y(i);
                long j = y & 1048575;
                switch ((y & 267386880) >>> 20) {
                    case 0:
                        if (x(nneVar, nneVar2, i)) {
                            c6c c6cVar = i0f.c;
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (x(nneVar, nneVar2, i)) {
                            c6c c6cVar2 = i0f.c;
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (x(nneVar, nneVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (x(nneVar, nneVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (x(nneVar, nneVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (x(nneVar, nneVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (x(nneVar, nneVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (x(nneVar, nneVar2, i)) {
                            c6c c6cVar3 = i0f.c;
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (x(nneVar, nneVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (x(nneVar, nneVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (x(nneVar, nneVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (x(nneVar, nneVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (x(nneVar, nneVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (x(nneVar, nneVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (x(nneVar, nneVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (x(nneVar, nneVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (x(nneVar, nneVar2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (x(nneVar, nneVar2, i)) {
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
                    case kk7.S /* 30 */:
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
                        z = fxe.i(i0f.l(nneVar, j), i0f.l(nneVar2, j));
                        break;
                    case 50:
                        z = fxe.i(i0f.l(nneVar, j), i0f.l(nneVar2, j));
                        break;
                    case kk7.n0 /* 51 */:
                    case kk7.o0 /* 52 */:
                    case kk7.p0 /* 53 */:
                    case kk7.q0 /* 54 */:
                    case kk7.r0 /* 55 */:
                    case 56:
                    case kk7.t0 /* 57 */:
                    case kk7.u0 /* 58 */:
                    case kk7.v0 /* 59 */:
                    case kk7.w0 /* 60 */:
                    case kk7.x0 /* 61 */:
                    case kk7.y0 /* 62 */:
                    case kk7.z0 /* 63 */:
                    case 64:
                    case 65:
                    case kk7.C0 /* 66 */:
                    case kk7.D0 /* 67 */:
                    case kk7.E0 /* 68 */:
                        long j2 = iArr[i + 2] & 1048575;
                        if (i0f.b(nneVar, j2) == i0f.b(nneVar2, j2)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (z) {
                    i += 3;
                }
            } else {
                this.l.getClass();
                if (nneVar.zzb.equals(nneVar2.zzb)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ee, code lost:
    
        if (r4 != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d6, code lost:
    
        if (r4 != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01f1, code lost:
    
        r3 = r8 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01f0, code lost:
    
        r8 = 1231;
     */
    @Override // xwe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(nne nneVar) {
        int i;
        int a;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int y = y(i4);
            int i5 = iArr[i4];
            long j = 1048575 & y;
            int i6 = 1237;
            int i7 = 37;
            switch ((y & 267386880) >>> 20) {
                case 0:
                    i = i3 * 53;
                    a = foe.a(Double.doubleToLongBits(i0f.c.t(nneVar, j)));
                    i3 = a + i;
                    break;
                case 1:
                    i = i3 * 53;
                    a = Float.floatToIntBits(i0f.c.r(nneVar, j));
                    i3 = a + i;
                    break;
                case 2:
                    i = i3 * 53;
                    a = foe.a(i0f.g(nneVar, j));
                    i3 = a + i;
                    break;
                case 3:
                    i = i3 * 53;
                    a = foe.a(i0f.g(nneVar, j));
                    i3 = a + i;
                    break;
                case 4:
                    i = i3 * 53;
                    a = i0f.b(nneVar, j);
                    i3 = a + i;
                    break;
                case 5:
                    i = i3 * 53;
                    a = foe.a(i0f.g(nneVar, j));
                    i3 = a + i;
                    break;
                case 6:
                    i = i3 * 53;
                    a = i0f.b(nneVar, j);
                    i3 = a + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean q = i0f.c.q(nneVar, j);
                    Charset charset = foe.a;
                    break;
                case 8:
                    i = i3 * 53;
                    a = ((String) i0f.l(nneVar, j)).hashCode();
                    i3 = a + i;
                    break;
                case 9:
                    Object l = i0f.l(nneVar, j);
                    if (l != null) {
                        i7 = l.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
                    break;
                case 10:
                    i = i3 * 53;
                    a = i0f.l(nneVar, j).hashCode();
                    i3 = a + i;
                    break;
                case 11:
                    i = i3 * 53;
                    a = i0f.b(nneVar, j);
                    i3 = a + i;
                    break;
                case 12:
                    i = i3 * 53;
                    a = i0f.b(nneVar, j);
                    i3 = a + i;
                    break;
                case 13:
                    i = i3 * 53;
                    a = i0f.b(nneVar, j);
                    i3 = a + i;
                    break;
                case 14:
                    i = i3 * 53;
                    a = foe.a(i0f.g(nneVar, j));
                    i3 = a + i;
                    break;
                case 15:
                    i = i3 * 53;
                    a = i0f.b(nneVar, j);
                    i3 = a + i;
                    break;
                case 16:
                    i = i3 * 53;
                    a = foe.a(i0f.g(nneVar, j));
                    i3 = a + i;
                    break;
                case 17:
                    Object l2 = i0f.l(nneVar, j);
                    if (l2 != null) {
                        i7 = l2.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
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
                case kk7.S /* 30 */:
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
                    i = i3 * 53;
                    a = i0f.l(nneVar, j).hashCode();
                    i3 = a + i;
                    break;
                case 50:
                    i = i3 * 53;
                    a = i0f.l(nneVar, j).hashCode();
                    i3 = a + i;
                    break;
                case kk7.n0 /* 51 */:
                    if (q(i5, i4, nneVar)) {
                        i = i3 * 53;
                        a = foe.a(Double.doubleToLongBits(((Double) i0f.l(nneVar, j)).doubleValue()));
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case kk7.o0 /* 52 */:
                    if (q(i5, i4, nneVar)) {
                        i = i3 * 53;
                        a = Float.floatToIntBits(((Float) i0f.l(nneVar, j)).floatValue());
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case kk7.p0 /* 53 */:
                    if (q(i5, i4, nneVar)) {
                        i = i3 * 53;
                        a = foe.a(A(nneVar, j));
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case kk7.q0 /* 54 */:
                    if (q(i5, i4, nneVar)) {
                        i = i3 * 53;
                        a = foe.a(A(nneVar, j));
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case kk7.r0 /* 55 */:
                    if (q(i5, i4, nneVar)) {
                        i = i3 * 53;
                        a = z(nneVar, j);
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (q(i5, i4, nneVar)) {
                        i = i3 * 53;
                        a = foe.a(A(nneVar, j));
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case kk7.t0 /* 57 */:
                    if (q(i5, i4, nneVar)) {
                        i = i3 * 53;
                        a = z(nneVar, j);
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case kk7.u0 /* 58 */:
                    if (q(i5, i4, nneVar)) {
                        i2 = i3 * 53;
                        boolean booleanValue = ((Boolean) i0f.l(nneVar, j)).booleanValue();
                        Charset charset2 = foe.a;
                        break;
                    } else {
                        break;
                    }
                case kk7.v0 /* 59 */:
                    if (q(i5, i4, nneVar)) {
                        i = i3 * 53;
                        a = ((String) i0f.l(nneVar, j)).hashCode();
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case kk7.w0 /* 60 */:
                    if (q(i5, i4, nneVar)) {
                        i = i3 * 53;
                        a = i0f.l(nneVar, j).hashCode();
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case kk7.x0 /* 61 */:
                    if (q(i5, i4, nneVar)) {
                        i = i3 * 53;
                        a = i0f.l(nneVar, j).hashCode();
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case kk7.y0 /* 62 */:
                    if (q(i5, i4, nneVar)) {
                        i = i3 * 53;
                        a = z(nneVar, j);
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case kk7.z0 /* 63 */:
                    if (q(i5, i4, nneVar)) {
                        i = i3 * 53;
                        a = z(nneVar, j);
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(i5, i4, nneVar)) {
                        i = i3 * 53;
                        a = z(nneVar, j);
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (q(i5, i4, nneVar)) {
                        i = i3 * 53;
                        a = foe.a(A(nneVar, j));
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case kk7.C0 /* 66 */:
                    if (q(i5, i4, nneVar)) {
                        i = i3 * 53;
                        a = z(nneVar, j);
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case kk7.D0 /* 67 */:
                    if (q(i5, i4, nneVar)) {
                        i = i3 * 53;
                        a = foe.a(A(nneVar, j));
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
                case kk7.E0 /* 68 */:
                    if (q(i5, i4, nneVar)) {
                        i = i3 * 53;
                        a = i0f.l(nneVar, j).hashCode();
                        i3 = a + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.l.getClass();
        return nneVar.zzb.hashCode() + (i3 * 53);
    }

    public final int h(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, sad sadVar) {
        int i9;
        int i10;
        int i11;
        Object object;
        long j2 = this.a[i8 + 2] & 1048575;
        Unsafe unsafe = o;
        switch (i7) {
            case kk7.n0 /* 51 */:
                i9 = i;
                if (i5 != 1) {
                    return i9;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(g2f.j(i9, bArr))));
                i11 = i9 + 8;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case kk7.o0 /* 52 */:
                i10 = i;
                if (i5 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(g2f.a(i10, bArr))));
                i11 = i10 + 4;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case kk7.p0 /* 53 */:
            case kk7.q0 /* 54 */:
                if (i5 != 0) {
                    return i;
                }
                i11 = g2f.i(bArr, i, sadVar);
                unsafe.putObject(obj, j, Long.valueOf(sadVar.b));
                unsafe.putInt(obj, j2, i4);
                return i11;
            case kk7.r0 /* 55 */:
            case kk7.y0 /* 62 */:
                if (i5 != 0) {
                    return i;
                }
                i11 = g2f.h(bArr, i, sadVar);
                unsafe.putObject(obj, j, Integer.valueOf(sadVar.a));
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 56:
            case 65:
                i9 = i;
                if (i5 != 1) {
                    return i9;
                }
                unsafe.putObject(obj, j, Long.valueOf(g2f.j(i9, bArr)));
                i11 = i9 + 8;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case kk7.t0 /* 57 */:
            case 64:
                i10 = i;
                if (i5 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j, Integer.valueOf(g2f.a(i10, bArr)));
                i11 = i10 + 4;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case kk7.u0 /* 58 */:
                if (i5 != 0) {
                    return i;
                }
                i11 = g2f.i(bArr, i, sadVar);
                unsafe.putObject(obj, j, Boolean.valueOf(sadVar.b != 0));
                unsafe.putInt(obj, j2, i4);
                return i11;
            case kk7.v0 /* 59 */:
                if (i5 != 2) {
                    return i;
                }
                int h = g2f.h(bArr, i, sadVar);
                int i12 = sadVar.a;
                if (i12 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & TLObject.FLAG_29) != 0) {
                        if (!q0f.a.c(h, h + i12, bArr)) {
                            throw fpe.c();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, h, i12, foe.a));
                    h += i12;
                }
                unsafe.putInt(obj, j2, i4);
                return h;
            case kk7.w0 /* 60 */:
                if (i5 != 2) {
                    return i;
                }
                int g = g2f.g(m(i8), bArr, i, i2, sadVar);
                object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                Object obj2 = sadVar.c;
                if (object == null) {
                    unsafe.putObject(obj, j, obj2);
                } else {
                    unsafe.putObject(obj, j, foe.b(object, obj2));
                }
                unsafe.putInt(obj, j2, i4);
                return g;
            case kk7.x0 /* 61 */:
                if (i5 != 2) {
                    return i;
                }
                i11 = g2f.m(bArr, i, sadVar);
                unsafe.putObject(obj, j, sadVar.c);
                unsafe.putInt(obj, j2, i4);
                return i11;
            case kk7.z0 /* 63 */:
                if (i5 != 0) {
                    return i;
                }
                int h2 = g2f.h(bArr, i, sadVar);
                int i13 = sadVar.a;
                b3e w = w(i8);
                if (w != null && !w.a(i13)) {
                    B(obj).a(i3, Long.valueOf(i13));
                    return h2;
                }
                unsafe.putObject(obj, j, Integer.valueOf(i13));
                i11 = h2;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case kk7.C0 /* 66 */:
                if (i5 != 0) {
                    return i;
                }
                i11 = g2f.h(bArr, i, sadVar);
                unsafe.putObject(obj, j, Integer.valueOf(o2f.a(sadVar.a)));
                unsafe.putInt(obj, j2, i4);
                return i11;
            case kk7.D0 /* 67 */:
                if (i5 != 0) {
                    return i;
                }
                i11 = g2f.i(bArr, i, sadVar);
                long j3 = sadVar.b;
                unsafe.putObject(obj, j, Long.valueOf((j3 >>> 1) ^ (-(j3 & 1))));
                unsafe.putInt(obj, j2, i4);
                return i11;
            case kk7.E0 /* 68 */:
                if (i5 == 3) {
                    i11 = g2f.f(m(i8), bArr, i, i2, (i3 & (-8)) | 4, sadVar);
                    object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    Object obj3 = sadVar.c;
                    if (object == null) {
                        unsafe.putObject(obj, j, obj3);
                    } else {
                        unsafe.putObject(obj, j, foe.b(object, obj3));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
            default:
                return i;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int i(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, sad sadVar) {
        int b;
        Unsafe unsafe = o;
        kpe kpeVar = (kpe) unsafe.getObject(obj, j2);
        if (!kpeVar.zza()) {
            int size = kpeVar.size();
            kpeVar = kpeVar.zza(size == 0 ? 10 : size << 1);
            unsafe.putObject(obj, j2, kpeVar);
        }
        kpe kpeVar2 = kpeVar;
        switch (i7) {
            case 18:
            case 35:
                if (i5 != 2) {
                    if (i5 == 1) {
                        g2f.j(i, bArr);
                        throw null;
                    }
                    return i;
                }
                int h = g2f.h(bArr, i, sadVar);
                int i8 = sadVar.a + h;
                if (h < i8) {
                    g2f.j(h, bArr);
                    throw null;
                }
                if (h == i8) {
                    return h;
                }
                throw fpe.a();
            case 19:
            case 36:
                if (i5 != 2) {
                    if (i5 == 5) {
                        g2f.a(i, bArr);
                        throw null;
                    }
                    return i;
                }
                int h2 = g2f.h(bArr, i, sadVar);
                int i9 = sadVar.a + h2;
                if (h2 < i9) {
                    g2f.a(h2, bArr);
                    throw null;
                }
                if (h2 == i9) {
                    return h2;
                }
                throw fpe.a();
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 != 2) {
                    if (i5 == 0) {
                        g2f.i(bArr, i, sadVar);
                        throw null;
                    }
                    return i;
                }
                int h3 = g2f.h(bArr, i, sadVar);
                int i10 = sadVar.a + h3;
                if (h3 < i10) {
                    g2f.i(bArr, h3, sadVar);
                    throw null;
                }
                if (h3 == i10) {
                    return h3;
                }
                throw fpe.a();
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 != 2) {
                    if (i5 == 0) {
                        return g2f.b(i3, bArr, i, i2, kpeVar2, sadVar);
                    }
                    return i;
                }
                wne wneVar = (wne) kpeVar2;
                int h4 = g2f.h(bArr, i, sadVar);
                int i11 = sadVar.a + h4;
                while (h4 < i11) {
                    h4 = g2f.h(bArr, h4, sadVar);
                    wneVar.i(sadVar.a);
                }
                if (h4 == i11) {
                    return h4;
                }
                throw fpe.a();
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 != 2) {
                    if (i5 == 1) {
                        g2f.j(i, bArr);
                        throw null;
                    }
                    return i;
                }
                int h5 = g2f.h(bArr, i, sadVar);
                int i12 = sadVar.a + h5;
                if (h5 < i12) {
                    g2f.j(h5, bArr);
                    throw null;
                }
                if (h5 == i12) {
                    return h5;
                }
                throw fpe.a();
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    wne wneVar2 = (wne) kpeVar2;
                    int h6 = g2f.h(bArr, i, sadVar);
                    int i13 = sadVar.a + h6;
                    while (h6 < i13) {
                        wneVar2.i(g2f.a(h6, bArr));
                        h6 += 4;
                    }
                    if (h6 == i13) {
                        return h6;
                    }
                    throw fpe.a();
                }
                if (i5 == 5) {
                    wne wneVar3 = (wne) kpeVar2;
                    wneVar3.i(g2f.a(i, bArr));
                    int i14 = i + 4;
                    while (i14 < i2) {
                        int h7 = g2f.h(bArr, i14, sadVar);
                        if (i3 != sadVar.a) {
                            return i14;
                        }
                        wneVar3.i(g2f.a(h7, bArr));
                        i14 = h7 + 4;
                    }
                    return i14;
                }
                return i;
            case 25:
            case 42:
                if (i5 != 2) {
                    if (i5 == 0) {
                        g2f.i(bArr, i, sadVar);
                        throw null;
                    }
                    return i;
                }
                int h8 = g2f.h(bArr, i, sadVar);
                int i15 = sadVar.a + h8;
                if (h8 < i15) {
                    g2f.i(bArr, h8, sadVar);
                    throw null;
                }
                if (h8 == i15) {
                    return h8;
                }
                throw fpe.a();
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int h9 = g2f.h(bArr, i, sadVar);
                        int i16 = sadVar.a;
                        if (i16 < 0) {
                            throw fpe.b();
                        }
                        if (i16 == 0) {
                            kpeVar2.add("");
                        } else {
                            kpeVar2.add(new String(bArr, h9, i16, foe.a));
                            h9 += i16;
                        }
                        while (h9 < i2) {
                            int h10 = g2f.h(bArr, h9, sadVar);
                            if (i3 != sadVar.a) {
                                return h9;
                            }
                            h9 = g2f.h(bArr, h10, sadVar);
                            int i17 = sadVar.a;
                            if (i17 < 0) {
                                throw fpe.b();
                            }
                            if (i17 == 0) {
                                kpeVar2.add("");
                            } else {
                                kpeVar2.add(new String(bArr, h9, i17, foe.a));
                                h9 += i17;
                            }
                        }
                        return h9;
                    }
                    int h11 = g2f.h(bArr, i, sadVar);
                    int i18 = sadVar.a;
                    if (i18 < 0) {
                        throw fpe.b();
                    }
                    if (i18 == 0) {
                        kpeVar2.add("");
                    } else {
                        int i19 = h11 + i18;
                        if (!q0f.a.c(h11, i19, bArr)) {
                            throw fpe.c();
                        }
                        kpeVar2.add(new String(bArr, h11, i18, foe.a));
                        h11 = i19;
                    }
                    while (h11 < i2) {
                        int h12 = g2f.h(bArr, h11, sadVar);
                        if (i3 != sadVar.a) {
                            return h11;
                        }
                        h11 = g2f.h(bArr, h12, sadVar);
                        int i20 = sadVar.a;
                        if (i20 < 0) {
                            throw fpe.b();
                        }
                        if (i20 == 0) {
                            kpeVar2.add("");
                        } else {
                            int i21 = h11 + i20;
                            if (!q0f.a.c(h11, i21, bArr)) {
                                throw fpe.c();
                            }
                            kpeVar2.add(new String(bArr, h11, i20, foe.a));
                            h11 = i21;
                        }
                    }
                    return h11;
                }
                return i;
            case 27:
                if (i5 == 2) {
                    return g2f.e(m(i6), i3, bArr, i, i2, kpeVar2, sadVar);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    int h13 = g2f.h(bArr, i, sadVar);
                    int i22 = sadVar.a;
                    if (i22 < 0) {
                        throw fpe.b();
                    }
                    if (i22 > bArr.length - h13) {
                        throw fpe.a();
                    }
                    if (i22 == 0) {
                        kpeVar2.add(sie.c);
                    } else {
                        kpeVar2.add(sie.j(h13, i22, bArr));
                        h13 += i22;
                    }
                    while (h13 < i2) {
                        int h14 = g2f.h(bArr, h13, sadVar);
                        if (i3 != sadVar.a) {
                            return h13;
                        }
                        h13 = g2f.h(bArr, h14, sadVar);
                        int i23 = sadVar.a;
                        if (i23 < 0) {
                            throw fpe.b();
                        }
                        if (i23 > bArr.length - h13) {
                            throw fpe.a();
                        }
                        if (i23 == 0) {
                            kpeVar2.add(sie.c);
                        } else {
                            kpeVar2.add(sie.j(h13, i23, bArr));
                            h13 += i23;
                        }
                    }
                    return h13;
                }
                return i;
            case kk7.S /* 30 */:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        b = g2f.b(i3, bArr, i, i2, kpeVar2, sadVar);
                    }
                    return i;
                }
                wne wneVar4 = (wne) kpeVar2;
                b = g2f.h(bArr, i, sadVar);
                int i24 = sadVar.a + b;
                while (b < i24) {
                    b = g2f.h(bArr, b, sadVar);
                    wneVar4.i(sadVar.a);
                }
                if (b != i24) {
                    throw fpe.a();
                }
                nne nneVar = (nne) obj;
                qze qzeVar = nneVar.zzb;
                qze qzeVar2 = qzeVar != qze.f ? qzeVar : null;
                b3e w = w(i6);
                Class cls = fxe.a;
                if (w != null) {
                    boolean z = kpeVar2 instanceof RandomAccess;
                    mze mzeVar = this.l;
                    if (z) {
                        int size2 = kpeVar2.size();
                        int i25 = 0;
                        for (int i26 = 0; i26 < size2; i26++) {
                            Integer num = (Integer) kpeVar2.get(i26);
                            int intValue = num.intValue();
                            if (w.a(intValue)) {
                                if (i26 != i25) {
                                    kpeVar2.set(i25, num);
                                }
                                i25++;
                            } else {
                                if (qzeVar2 == null) {
                                    mzeVar.getClass();
                                    qzeVar2 = qze.b();
                                }
                                mzeVar.getClass();
                                qzeVar2.a(i4 << 3, Long.valueOf(intValue));
                            }
                        }
                        if (i25 != size2) {
                            kpeVar2.subList(i25, size2).clear();
                        }
                    } else {
                        Iterator it = kpeVar2.iterator();
                        while (it.hasNext()) {
                            int intValue2 = ((Integer) it.next()).intValue();
                            if (!w.a(intValue2)) {
                                if (qzeVar2 == null) {
                                    mzeVar.getClass();
                                    qzeVar2 = qze.b();
                                }
                                mzeVar.getClass();
                                qzeVar2.a(i4 << 3, Long.valueOf(intValue2));
                                it.remove();
                            }
                        }
                    }
                }
                if (qzeVar2 != null) {
                    nneVar.zzb = qzeVar2;
                }
                return b;
            case 33:
            case 47:
                if (i5 == 2) {
                    wne wneVar5 = (wne) kpeVar2;
                    int h15 = g2f.h(bArr, i, sadVar);
                    int i27 = sadVar.a + h15;
                    while (h15 < i27) {
                        h15 = g2f.h(bArr, h15, sadVar);
                        wneVar5.i(o2f.a(sadVar.a));
                    }
                    if (h15 == i27) {
                        return h15;
                    }
                    throw fpe.a();
                }
                if (i5 == 0) {
                    wne wneVar6 = (wne) kpeVar2;
                    int h16 = g2f.h(bArr, i, sadVar);
                    wneVar6.i(o2f.a(sadVar.a));
                    while (h16 < i2) {
                        int h17 = g2f.h(bArr, h16, sadVar);
                        if (i3 != sadVar.a) {
                            return h16;
                        }
                        h16 = g2f.h(bArr, h17, sadVar);
                        wneVar6.i(o2f.a(sadVar.a));
                    }
                    return h16;
                }
                return i;
            case 34:
            case 48:
                if (i5 != 2) {
                    if (i5 == 0) {
                        g2f.i(bArr, i, sadVar);
                        throw null;
                    }
                    return i;
                }
                int h18 = g2f.h(bArr, i, sadVar);
                int i28 = sadVar.a + h18;
                if (h18 < i28) {
                    g2f.i(bArr, h18, sadVar);
                    throw null;
                }
                if (h18 == i28) {
                    return h18;
                }
                throw fpe.a();
            case 49:
                if (i5 == 3) {
                    xwe m = m(i6);
                    int i29 = (i3 & (-8)) | 4;
                    int f = g2f.f(m, bArr, i, i2, i29, sadVar);
                    int i30 = i2;
                    int i31 = i29;
                    sad sadVar2 = sadVar;
                    kpeVar2.add(sadVar2.c);
                    while (f < i30) {
                        int h19 = g2f.h(bArr, f, sadVar2);
                        if (i3 != sadVar2.a) {
                            return f;
                        }
                        int i32 = i31;
                        int i33 = i30;
                        sad sadVar3 = sadVar2;
                        f = g2f.f(m, bArr, h19, i33, i32, sadVar3);
                        kpeVar2.add(sadVar3.c);
                        i31 = i32;
                        i30 = i33;
                        sadVar2 = sadVar3;
                    }
                    return f;
                }
                return i;
            default:
                return i;
        }
    }

    public final int j(Object obj, byte[] bArr, int i, int i2, int i3, sad sadVar) {
        int i4;
        Unsafe unsafe;
        int[] iArr;
        int i5;
        que queVar;
        Object obj2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr2;
        int i12;
        int i13;
        Unsafe unsafe2;
        byte[] bArr2;
        sad sadVar2;
        int i14;
        int i15;
        byte[] bArr3;
        int i16;
        Object obj3;
        int i17;
        int i18;
        int i19;
        int h;
        que queVar2 = this;
        Object obj4 = obj;
        byte[] bArr4 = bArr;
        int i20 = i2;
        sad sadVar3 = sadVar;
        int i21 = i;
        int i22 = -1;
        int i23 = 0;
        int i24 = 0;
        int i25 = 1048575;
        int i26 = 0;
        while (true) {
            int[] iArr3 = queVar2.a;
            Unsafe unsafe3 = o;
            if (i21 < i20) {
                int i27 = i21 + 1;
                int i28 = bArr4[i21];
                if (i28 < 0) {
                    i27 = g2f.d(i28, bArr4, i27, sadVar3);
                    i28 = sadVar3.a;
                }
                int i29 = i27;
                int i30 = i28;
                int i31 = i30 >>> 3;
                int i32 = i30 & 7;
                int i33 = queVar2.d;
                int i34 = queVar2.c;
                if (i31 > i22) {
                    i7 = (i31 < i34 || i31 > i33) ? -1 : queVar2.s(i31, i23 / 3);
                    i6 = 0;
                } else if (i31 < i34 || i31 > i33) {
                    i6 = 0;
                    i7 = -1;
                } else {
                    i6 = 0;
                    i7 = queVar2.s(i31, 0);
                }
                if (i7 == -1) {
                    iArr = iArr3;
                    i8 = i30;
                    i4 = i25;
                    unsafe = unsafe3;
                    i5 = i6;
                    i9 = i31;
                    queVar = queVar2;
                    obj2 = obj4;
                    i10 = i29;
                    i11 = i5;
                } else {
                    int i35 = iArr3[i7 + 1];
                    int i36 = (i35 & 267386880) >>> 20;
                    long j = i35 & 1048575;
                    if (i36 <= 17) {
                        int i37 = iArr3[i7 + 2];
                        int i38 = 1 << (i37 >>> 20);
                        int i39 = i37 & 1048575;
                        if (i39 != i25) {
                            iArr2 = iArr3;
                            if (i25 != 1048575) {
                                unsafe3.putInt(obj4, i25, i26);
                            }
                            i13 = i39;
                            i12 = unsafe3.getInt(obj4, i39);
                        } else {
                            iArr2 = iArr3;
                            i12 = i26;
                            i13 = i25;
                        }
                        switch (i36) {
                            case 0:
                                bArr2 = bArr;
                                i8 = i30;
                                sadVar2 = sadVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i14 = i29;
                                if (i32 != 1) {
                                    int i40 = i14;
                                    obj2 = obj4;
                                    i10 = i40;
                                    queVar = queVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                } else {
                                    i0f.c.m(obj4, j, Double.longBitsToDouble(g2f.j(i14, bArr2)));
                                    i21 = i14 + 8;
                                    int i41 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr2;
                                    i25 = i41;
                                    i20 = i2;
                                    sadVar3 = sadVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                }
                            case 1:
                                bArr2 = bArr;
                                i8 = i30;
                                sadVar2 = sadVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i14 = i29;
                                if (i32 != 5) {
                                    int i402 = i14;
                                    obj2 = obj4;
                                    i10 = i402;
                                    queVar = queVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                } else {
                                    i0f.c.n(obj4, j, Float.intBitsToFloat(g2f.a(i14, bArr2)));
                                    i21 = i14 + 4;
                                    int i412 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr2;
                                    i25 = i412;
                                    i20 = i2;
                                    sadVar3 = sadVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                }
                            case 2:
                            case 3:
                                i8 = i30;
                                sadVar2 = sadVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i14 = i29;
                                if (i32 != 0) {
                                    int i4022 = i14;
                                    obj2 = obj4;
                                    i10 = i4022;
                                    queVar = queVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                } else {
                                    int i42 = g2f.i(bArr, i14, sadVar2);
                                    unsafe2.putLong(obj4, j, sadVar2.b);
                                    int i43 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr;
                                    i25 = i43;
                                    i20 = i2;
                                    i21 = i42;
                                    sadVar3 = sadVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                }
                            case 4:
                            case 11:
                                i8 = i30;
                                sadVar2 = sadVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i14 = i29;
                                if (i32 != 0) {
                                    int i40222 = i14;
                                    obj2 = obj4;
                                    i10 = i40222;
                                    queVar = queVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                } else {
                                    int h2 = g2f.h(bArr, i14, sadVar2);
                                    unsafe2.putInt(obj4, j, sadVar2.a);
                                    int i44 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr;
                                    i25 = i44;
                                    i20 = i2;
                                    i21 = h2;
                                    sadVar3 = sadVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                }
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i8 = i30;
                                sadVar2 = sadVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i14 = i29;
                                if (i32 != 1) {
                                    int i402222 = i14;
                                    obj2 = obj4;
                                    i10 = i402222;
                                    queVar = queVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                } else {
                                    unsafe2.putLong(obj4, j, g2f.j(i14, bArr2));
                                    i21 = i14 + 8;
                                    int i4122 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr2;
                                    i25 = i4122;
                                    i20 = i2;
                                    sadVar3 = sadVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                }
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i8 = i30;
                                sadVar2 = sadVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i14 = i29;
                                if (i32 != 5) {
                                    int i4022222 = i14;
                                    obj2 = obj4;
                                    i10 = i4022222;
                                    queVar = queVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                } else {
                                    unsafe2.putInt(obj4, j, g2f.a(i14, bArr2));
                                    i21 = i14 + 4;
                                    int i41222 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr2;
                                    i25 = i41222;
                                    i20 = i2;
                                    sadVar3 = sadVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                }
                            case 7:
                                bArr2 = bArr;
                                i8 = i30;
                                i15 = i29;
                                sadVar2 = sadVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                if (i32 != 0) {
                                    i14 = i15;
                                    int i40222222 = i14;
                                    obj2 = obj4;
                                    i10 = i40222222;
                                    queVar = queVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                } else {
                                    i21 = g2f.i(bArr2, i15, sadVar2);
                                    i0f.c.o(obj4, j, sadVar2.b != 0);
                                    int i412222 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr2;
                                    i25 = i412222;
                                    i20 = i2;
                                    sadVar3 = sadVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                }
                            case 8:
                                bArr2 = bArr;
                                i8 = i30;
                                i15 = i29;
                                sadVar2 = sadVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                if (i32 != 2) {
                                    i14 = i15;
                                    int i402222222 = i14;
                                    obj2 = obj4;
                                    i10 = i402222222;
                                    queVar = queVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                } else {
                                    i21 = (i35 & TLObject.FLAG_29) == 0 ? g2f.k(bArr2, i15, sadVar2) : g2f.l(bArr2, i15, sadVar2);
                                    unsafe2.putObject(obj4, j, sadVar2.c);
                                    int i4122222 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr2;
                                    i25 = i4122222;
                                    i20 = i2;
                                    sadVar3 = sadVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                }
                            case 9:
                                bArr3 = bArr;
                                i8 = i30;
                                i15 = i29;
                                sadVar2 = sadVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i16 = i2;
                                if (i32 != 2) {
                                    i14 = i15;
                                    int i4022222222 = i14;
                                    obj2 = obj4;
                                    i10 = i4022222222;
                                    queVar = queVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                } else {
                                    i21 = g2f.g(queVar2.m(i11), bArr3, i15, i16, sadVar2);
                                    if ((i12 & i38) == 0) {
                                        unsafe2.putObject(obj4, j, sadVar2.c);
                                    } else {
                                        unsafe2.putObject(obj4, j, foe.b(unsafe2.getObject(obj4, j), sadVar2.c));
                                    }
                                    int i45 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr3;
                                    i25 = i45;
                                    i20 = i16;
                                    sadVar3 = sadVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                }
                            case 10:
                                bArr3 = bArr;
                                i8 = i30;
                                i15 = i29;
                                sadVar2 = sadVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i16 = i2;
                                if (i32 != 2) {
                                    i14 = i15;
                                    int i40222222222 = i14;
                                    obj2 = obj4;
                                    i10 = i40222222222;
                                    queVar = queVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                } else {
                                    i21 = g2f.m(bArr3, i15, sadVar2);
                                    unsafe2.putObject(obj4, j, sadVar2.c);
                                    int i452 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr3;
                                    i25 = i452;
                                    i20 = i16;
                                    sadVar3 = sadVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                }
                            case 12:
                                bArr3 = bArr;
                                i8 = i30;
                                i15 = i29;
                                sadVar2 = sadVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i16 = i2;
                                if (i32 != 0) {
                                    i14 = i15;
                                    int i402222222222 = i14;
                                    obj2 = obj4;
                                    i10 = i402222222222;
                                    queVar = queVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                } else {
                                    i21 = g2f.h(bArr3, i15, sadVar2);
                                    int i46 = sadVar2.a;
                                    b3e w = queVar2.w(i11);
                                    if (w == null || w.a(i46)) {
                                        unsafe2.putInt(obj4, j, i46);
                                        int i4522 = i13;
                                        i26 = i12 | i38;
                                        bArr4 = bArr3;
                                        i25 = i4522;
                                        i20 = i16;
                                        sadVar3 = sadVar2;
                                        i23 = i11;
                                        i24 = i8;
                                        i22 = i31;
                                    } else {
                                        B(obj4).a(i8, Long.valueOf(i46));
                                        bArr4 = bArr3;
                                        i20 = i16;
                                        i23 = i11;
                                        i25 = i13;
                                        i26 = i12;
                                        i24 = i8;
                                        i22 = i31;
                                        sadVar3 = sadVar2;
                                    }
                                }
                                break;
                            case 15:
                                bArr3 = bArr;
                                i8 = i30;
                                i15 = i29;
                                sadVar2 = sadVar;
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i16 = i2;
                                if (i32 != 0) {
                                    i14 = i15;
                                    int i4022222222222 = i14;
                                    obj2 = obj4;
                                    i10 = i4022222222222;
                                    queVar = queVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                } else {
                                    i21 = g2f.h(bArr3, i15, sadVar2);
                                    unsafe2.putInt(obj4, j, o2f.a(sadVar2.a));
                                    int i45222 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr3;
                                    i25 = i45222;
                                    i20 = i16;
                                    sadVar3 = sadVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                }
                            case 16:
                                i8 = i30;
                                i15 = i29;
                                if (i32 != 0) {
                                    i11 = i7;
                                    unsafe2 = unsafe3;
                                    i14 = i15;
                                    int i40222222222222 = i14;
                                    obj2 = obj4;
                                    i10 = i40222222222222;
                                    queVar = queVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                } else {
                                    int i47 = g2f.i(bArr, i15, sadVar);
                                    int i48 = i7;
                                    long j2 = sadVar.b;
                                    sadVar2 = sadVar;
                                    obj4 = obj;
                                    i11 = i48;
                                    i16 = i2;
                                    unsafe3.putLong(obj4, j, (j2 >>> 1) ^ (-(j2 & 1)));
                                    int i49 = i13;
                                    i26 = i12 | i38;
                                    bArr4 = bArr;
                                    i25 = i49;
                                    i21 = i47;
                                    i20 = i16;
                                    sadVar3 = sadVar2;
                                    i23 = i11;
                                    i24 = i8;
                                    i22 = i31;
                                }
                            case 17:
                                if (i32 != 3) {
                                    i8 = i30;
                                    i11 = i7;
                                    unsafe2 = unsafe3;
                                    i14 = i29;
                                    int i402222222222222 = i14;
                                    obj2 = obj4;
                                    i10 = i402222222222222;
                                    queVar = queVar2;
                                    unsafe = unsafe2;
                                    iArr = iArr2;
                                    i9 = i31;
                                    i4 = i13;
                                    i26 = i12;
                                    i5 = 0;
                                    break;
                                } else {
                                    i21 = g2f.f(queVar2.m(i7), bArr, i29, i2, (i31 << 3) | 4, sadVar);
                                    if ((i12 & i38) == 0) {
                                        unsafe3.putObject(obj4, j, sadVar.c);
                                    } else {
                                        unsafe3.putObject(obj4, j, foe.b(unsafe3.getObject(obj4, j), sadVar.c));
                                    }
                                    int i50 = i12 | i38;
                                    i23 = i7;
                                    sadVar3 = sadVar;
                                    bArr4 = bArr;
                                    i25 = i13;
                                    i24 = i30;
                                    i22 = i31;
                                    i26 = i50;
                                    i20 = i2;
                                }
                            default:
                                i11 = i7;
                                unsafe2 = unsafe3;
                                i8 = i30;
                                i14 = i29;
                                int i4022222222222222 = i14;
                                obj2 = obj4;
                                i10 = i4022222222222222;
                                queVar = queVar2;
                                unsafe = unsafe2;
                                iArr = iArr2;
                                i9 = i31;
                                i4 = i13;
                                i26 = i12;
                                i5 = 0;
                                break;
                        }
                    } else {
                        sad sadVar4 = sadVar3;
                        i8 = i30;
                        i11 = i7;
                        if (i36 == 27) {
                            if (i32 == 2) {
                                kpe kpeVar = (kpe) unsafe3.getObject(obj4, j);
                                if (!kpeVar.zza()) {
                                    int size = kpeVar.size();
                                    kpeVar = kpeVar.zza(size == 0 ? 10 : size << 1);
                                    unsafe3.putObject(obj4, j, kpeVar);
                                }
                                obj4 = obj;
                                i20 = i2;
                                sadVar3 = sadVar;
                                i21 = g2f.e(queVar2.m(i11), i8, bArr, i29, i2, kpeVar, sadVar4);
                                i23 = i11;
                                i24 = i8;
                                i22 = i31;
                                bArr4 = bArr;
                            } else {
                                obj3 = obj;
                                unsafe = unsafe3;
                                i17 = i29;
                                i18 = i26;
                                iArr = iArr3;
                                i19 = i31;
                                i4 = i25;
                                i5 = 0;
                                queVar = queVar2;
                                obj2 = obj3;
                                i10 = i17;
                                i9 = i19;
                            }
                        } else if (i36 <= 49) {
                            unsafe = unsafe3;
                            i18 = i26;
                            iArr = iArr3;
                            i4 = i25;
                            i5 = 0;
                            h = queVar2.i(obj, bArr, i29, i2, i8, i31, i32, i11, i35, i36, j, sadVar);
                            obj4 = obj;
                            i8 = i8;
                            i22 = i31;
                            i11 = i11;
                            if (h == i29) {
                                queVar = queVar2;
                                obj2 = obj4;
                                i9 = i22;
                                i10 = h;
                            } else {
                                bArr4 = bArr;
                                i20 = i2;
                                sadVar3 = sadVar;
                                i21 = h;
                                i23 = i11;
                                i24 = i8;
                                i25 = i4;
                                i26 = i18;
                            }
                        } else {
                            obj3 = obj;
                            unsafe = unsafe3;
                            i18 = i26;
                            iArr = iArr3;
                            i4 = i25;
                            i17 = i29;
                            i19 = i31;
                            i5 = 0;
                            if (i36 == 50) {
                                if (i32 == 2) {
                                    queVar2.o(obj3, i11, j);
                                    throw null;
                                }
                                queVar = queVar2;
                                obj2 = obj3;
                                i10 = i17;
                                i9 = i19;
                            } else {
                                i9 = i19;
                                h = queVar2.h(obj3, bArr, i17, i2, i8, i9, i32, i35, i36, j, i11, sadVar);
                                queVar = queVar2;
                                obj2 = obj3;
                                i11 = i11;
                                if (h == i17) {
                                    i10 = h;
                                } else {
                                    bArr4 = bArr;
                                    i20 = i2;
                                    sadVar3 = sadVar;
                                    i22 = i9;
                                    i21 = h;
                                    queVar2 = queVar;
                                    obj4 = obj2;
                                    i23 = i11;
                                    i24 = i8;
                                    i25 = i4;
                                    i26 = i18;
                                }
                            }
                        }
                        i26 = i18;
                    }
                }
                if (i8 != i3 || i3 == 0) {
                    bArr4 = bArr;
                    sadVar3 = sadVar;
                    i20 = i2;
                    i22 = i9;
                    queVar2 = queVar;
                    i23 = i11;
                    i24 = i8;
                    i25 = i4;
                    i21 = g2f.c(i8, bArr4, i10, i2, B(obj2), sadVar);
                    obj4 = obj2;
                } else {
                    i20 = i2;
                    i21 = i10;
                    i24 = i8;
                }
            } else {
                i4 = i25;
                unsafe = unsafe3;
                iArr = iArr3;
                i5 = 0;
                queVar = queVar2;
                obj2 = obj4;
            }
        }
        int i51 = i4;
        if (i51 != 1048575) {
            unsafe.putInt(obj2, i51, i26);
        }
        for (int i52 = queVar.h; i52 < queVar.i; i52++) {
            int i53 = queVar.g[i52];
            int i54 = iArr[i53];
            Object l = i0f.l(obj2, queVar.y(i53) & 1048575);
            if (l != null && queVar.w(i53) != null) {
                queVar.m.getClass();
                if (queVar.t(i53) == null) {
                    throw new NoSuchMethodError();
                }
                fyb.g();
                return i5;
            }
        }
        if (i3 == 0) {
            if (i21 != i20) {
                throw new fpe("Failed to parse the message.");
            }
        } else if (i21 > i20 || i24 != i3) {
            throw new fpe("Failed to parse the message.");
        }
        return i21;
    }

    public final xwe m(int i) {
        int i2 = (i / 3) << 1;
        Object[] objArr = this.b;
        xwe xweVar = (xwe) objArr[i2];
        if (xweVar != null) {
            return xweVar;
        }
        xwe a = fwe.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final void o(Object obj, int i, long j) {
        ate ateVar;
        Object t = t(i);
        Unsafe unsafe = o;
        Object object = unsafe.getObject(obj, j);
        this.m.getClass();
        if (!((ate) object).a) {
            ate ateVar2 = ate.b;
            if (ateVar2.isEmpty()) {
                ateVar = new ate();
            } else {
                ate ateVar3 = new ate(ateVar2);
                ateVar3.a = true;
                ateVar = ateVar3;
            }
            ite.a(ateVar, object);
            unsafe.putObject(obj, j, ateVar);
        }
        if (t != null) {
            throw new ClassCastException();
        }
        throw new NoSuchMethodError();
    }

    public final void p(nne nneVar, nne nneVar2, int i) {
        long y = y(i) & 1048575;
        if (r(i, nneVar2)) {
            Object l = i0f.l(nneVar, y);
            Object l2 = i0f.l(nneVar2, y);
            if (l != null && l2 != null) {
                i0f.d(nneVar, y, foe.b(l, l2));
                u(nneVar, i);
            } else if (l2 != null) {
                i0f.d(nneVar, y, l2);
                u(nneVar, i);
            }
        }
    }

    public final boolean q(int i, int i2, Object obj) {
        return i0f.b(obj, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    public final boolean r(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return (i0f.b(obj, j) & (1 << (i2 >>> 20))) != 0;
        }
        int y = y(i);
        long j2 = 1048575 & y;
        switch ((y & 267386880) >>> 20) {
            case 0:
                if (i0f.c.t(obj, j2) != 0.0d) {
                }
                break;
            case 1:
                if (i0f.c.r(obj, j2) != 0.0f) {
                }
                break;
            case 2:
                if (i0f.g(obj, j2) != 0) {
                }
                break;
            case 3:
                if (i0f.g(obj, j2) != 0) {
                }
                break;
            case 4:
                if (i0f.b(obj, j2) != 0) {
                }
                break;
            case 5:
                if (i0f.g(obj, j2) != 0) {
                }
                break;
            case 6:
                if (i0f.b(obj, j2) != 0) {
                }
                break;
            case 7:
                break;
            case 8:
                Object l = i0f.l(obj, j2);
                if (!(l instanceof String)) {
                    if (!(l instanceof sie)) {
                        sc8.e();
                        break;
                    } else if (!sie.c.equals(l)) {
                    }
                } else if (!((String) l).isEmpty()) {
                }
                break;
            case 9:
                if (i0f.l(obj, j2) != null) {
                }
                break;
            case 10:
                if (!sie.c.equals(i0f.l(obj, j2))) {
                }
                break;
            case 11:
                if (i0f.b(obj, j2) != 0) {
                }
                break;
            case 12:
                if (i0f.b(obj, j2) != 0) {
                }
                break;
            case 13:
                if (i0f.b(obj, j2) != 0) {
                }
                break;
            case 14:
                if (i0f.g(obj, j2) != 0) {
                }
                break;
            case 15:
                if (i0f.b(obj, j2) != 0) {
                }
                break;
            case 16:
                if (i0f.g(obj, j2) != 0) {
                }
                break;
            case 17:
                if (i0f.l(obj, j2) != null) {
                }
                break;
            default:
                sc8.e();
                break;
        }
        return false;
    }

    public final int s(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final Object t(int i) {
        return this.b[(i / 3) << 1];
    }

    public final void u(nne nneVar, int i) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        i0f.c(nneVar, i0f.b(nneVar, j) | (1 << (i2 >>> 20)), j);
    }

    public final void v(nne nneVar, nne nneVar2, int i) {
        int y = y(i);
        int i2 = this.a[i];
        long j = y & 1048575;
        if (q(i2, i, nneVar2)) {
            Object l = q(i2, i, nneVar) ? i0f.l(nneVar, j) : null;
            Object l2 = i0f.l(nneVar2, j);
            if (l != null && l2 != null) {
                i0f.d(nneVar, j, foe.b(l, l2));
                i0f.c(nneVar, i2, r1[i + 2] & 1048575);
            } else if (l2 != null) {
                i0f.d(nneVar, j, l2);
                i0f.c(nneVar, i2, r1[i + 2] & 1048575);
            }
        }
    }

    public final b3e w(int i) {
        return (b3e) this.b[((i / 3) << 1) + 1];
    }

    public final boolean x(nne nneVar, nne nneVar2, int i) {
        return r(i, nneVar) == r(i, nneVar2);
    }

    public final int y(int i) {
        return this.a[i + 1];
    }

    @Override // xwe
    public final Object zza() {
        this.j.getClass();
        return ((nne) this.e).d(4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // xwe
    public final int zzb(Object obj) {
        mze mzeVar;
        int i;
        int i2;
        int o2;
        int t;
        int f;
        int i3;
        int i4;
        int t2;
        int f2;
        int i5;
        int t3;
        int o3;
        int n2;
        int i6;
        mze mzeVar2 = this.l;
        ite iteVar = this.m;
        int i7 = 267386880;
        int i8 = 1048575;
        int[] iArr = this.a;
        int i9 = 1;
        boolean z = this.f;
        Unsafe unsafe = o;
        if (z) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < iArr.length) {
                int y = y(i10);
                int i12 = (y & i7) >>> 20;
                int i13 = i7;
                int i14 = iArr[i10];
                int i15 = i8;
                int[] iArr2 = iArr;
                long j = y & i8;
                if (i12 >= yle.b.a && i12 <= yle.c.a) {
                    int i16 = iArr2[i10 + 2];
                }
                switch (i12) {
                    case 0:
                        if (r(i10, obj)) {
                            i11 = yjb.A(i14 << 3, 8, i11);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (r(i10, obj)) {
                            i11 = yjb.A(i14 << 3, 4, i11);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (r(i10, obj)) {
                            long g = i0f.g(obj, j);
                            t3 = lje.t(i14 << 3);
                            o3 = lje.o(g);
                            i11 += o3 + t3;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (r(i10, obj)) {
                            n2 = lje.n(i14, i0f.g(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (r(i10, obj)) {
                            int b = i0f.b(obj, j);
                            t3 = lje.t(i14 << 3);
                            o3 = lje.p(b);
                            i11 += o3 + t3;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (r(i10, obj)) {
                            n2 = lje.r(i14);
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (r(i10, obj)) {
                            n2 = lje.v(i14);
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (r(i10, obj)) {
                            i11 = yjb.A(i14 << 3, 1, i11);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (r(i10, obj)) {
                            Object l = i0f.l(obj, j);
                            if (l instanceof sie) {
                                n2 = lje.i(i14, (sie) l);
                                i11 += n2;
                                break;
                            } else {
                                t3 = lje.t(i14 << 3);
                                o3 = lje.f((String) l);
                                i11 += o3 + t3;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (r(i10, obj)) {
                            n2 = fxe.a(i14, i0f.l(obj, j), m(i10));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (r(i10, obj)) {
                            n2 = lje.i(i14, (sie) i0f.l(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (r(i10, obj)) {
                            n2 = lje.s(i14, i0f.b(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (r(i10, obj)) {
                            int b2 = i0f.b(obj, j);
                            t3 = lje.t(i14 << 3);
                            o3 = lje.p(b2);
                            i11 += o3 + t3;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (r(i10, obj)) {
                            i11 = yjb.A(i14 << 3, 4, i11);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (r(i10, obj)) {
                            i11 = yjb.A(i14 << 3, 8, i11);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (r(i10, obj)) {
                            n2 = lje.u(i14, i0f.b(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (r(i10, obj)) {
                            n2 = lje.q(i14, i0f.g(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (r(i10, obj)) {
                            n2 = lje.h(i14, (qde) i0f.l(obj, j), m(i10));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        n2 = fxe.C(i14, (List) i0f.l(obj, j));
                        i11 += n2;
                        break;
                    case 19:
                        n2 = fxe.z(i14, (List) i0f.l(obj, j));
                        i11 += n2;
                        break;
                    case 20:
                        List list = (List) i0f.l(obj, j);
                        Class cls = fxe.a;
                        if (list.size() != 0) {
                            n2 = mue.a(i14, list.size(), fxe.c(list));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 21:
                        List list2 = (List) i0f.l(obj, j);
                        Class cls2 = fxe.a;
                        int size = list2.size();
                        if (size != 0) {
                            n2 = mue.a(i14, size, fxe.k(list2));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 22:
                        List list3 = (List) i0f.l(obj, j);
                        Class cls3 = fxe.a;
                        int size2 = list3.size();
                        if (size2 != 0) {
                            n2 = mue.a(i14, size2, fxe.t(list3));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 23:
                        n2 = fxe.C(i14, (List) i0f.l(obj, j));
                        i11 += n2;
                        break;
                    case 24:
                        n2 = fxe.z(i14, (List) i0f.l(obj, j));
                        i11 += n2;
                        break;
                    case 25:
                        List list4 = (List) i0f.l(obj, j);
                        Class cls4 = fxe.a;
                        int size3 = list4.size();
                        if (size3 != 0) {
                            n2 = (lje.t(i14 << 3) + 1) * size3;
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 26:
                        n2 = fxe.j(i14, (List) i0f.l(obj, j));
                        i11 += n2;
                        break;
                    case 27:
                        n2 = fxe.b(i14, (List) i0f.l(obj, j), m(i10));
                        i11 += n2;
                        break;
                    case 28:
                        n2 = fxe.o(i14, (List) i0f.l(obj, j));
                        i11 += n2;
                        break;
                    case 29:
                        List list5 = (List) i0f.l(obj, j);
                        Class cls5 = fxe.a;
                        int size4 = list5.size();
                        if (size4 != 0) {
                            n2 = mue.a(i14, size4, fxe.v(list5));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case kk7.S /* 30 */:
                        List list6 = (List) i0f.l(obj, j);
                        Class cls6 = fxe.a;
                        int size5 = list6.size();
                        if (size5 != 0) {
                            n2 = mue.a(i14, size5, fxe.r(list6));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 31:
                        n2 = fxe.z(i14, (List) i0f.l(obj, j));
                        i11 += n2;
                        break;
                    case 32:
                        n2 = fxe.C(i14, (List) i0f.l(obj, j));
                        i11 += n2;
                        break;
                    case 33:
                        List list7 = (List) i0f.l(obj, j);
                        Class cls7 = fxe.a;
                        int size6 = list7.size();
                        if (size6 != 0) {
                            n2 = mue.a(i14, size6, fxe.x(list7));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 34:
                        List list8 = (List) i0f.l(obj, j);
                        Class cls8 = fxe.a;
                        int size7 = list8.size();
                        if (size7 != 0) {
                            n2 = mue.a(i14, size7, fxe.p(list8));
                            i11 += n2;
                            break;
                        }
                        n2 = 0;
                        i11 += n2;
                    case 35:
                        int D = fxe.D((List) unsafe.getObject(obj, j));
                        if (D > 0) {
                            i11 = mue.b(D, lje.m(i14), D, i11);
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        int A = fxe.A((List) unsafe.getObject(obj, j));
                        if (A > 0) {
                            i11 = mue.b(A, lje.m(i14), A, i11);
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        int c = fxe.c((List) unsafe.getObject(obj, j));
                        if (c > 0) {
                            i11 = mue.b(c, lje.m(i14), c, i11);
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        int k = fxe.k((List) unsafe.getObject(obj, j));
                        if (k > 0) {
                            i11 = mue.b(k, lje.m(i14), k, i11);
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        int t4 = fxe.t((List) unsafe.getObject(obj, j));
                        if (t4 > 0) {
                            i11 = mue.b(t4, lje.m(i14), t4, i11);
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        int D2 = fxe.D((List) unsafe.getObject(obj, j));
                        if (D2 > 0) {
                            i11 = mue.b(D2, lje.m(i14), D2, i11);
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        int A2 = fxe.A((List) unsafe.getObject(obj, j));
                        if (A2 > 0) {
                            i11 = mue.b(A2, lje.m(i14), A2, i11);
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        List list9 = (List) unsafe.getObject(obj, j);
                        Class cls9 = fxe.a;
                        int size8 = list9.size();
                        if (size8 > 0) {
                            i11 = mue.b(size8, lje.m(i14), size8, i11);
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        int v = fxe.v((List) unsafe.getObject(obj, j));
                        if (v > 0) {
                            i11 = mue.b(v, lje.m(i14), v, i11);
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        int r = fxe.r((List) unsafe.getObject(obj, j));
                        if (r > 0) {
                            i11 = mue.b(r, lje.m(i14), r, i11);
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        int A3 = fxe.A((List) unsafe.getObject(obj, j));
                        if (A3 > 0) {
                            i11 = mue.b(A3, lje.m(i14), A3, i11);
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        int D3 = fxe.D((List) unsafe.getObject(obj, j));
                        if (D3 > 0) {
                            i11 = mue.b(D3, lje.m(i14), D3, i11);
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        int x = fxe.x((List) unsafe.getObject(obj, j));
                        if (x > 0) {
                            i11 = mue.b(x, lje.m(i14), x, i11);
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        int p = fxe.p((List) unsafe.getObject(obj, j));
                        if (p > 0) {
                            i11 = mue.b(p, lje.m(i14), p, i11);
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        List list10 = (List) i0f.l(obj, j);
                        xwe m = m(i10);
                        Class cls10 = fxe.a;
                        int size9 = list10.size();
                        if (size9 == 0) {
                            i6 = 0;
                        } else {
                            i6 = 0;
                            for (int i17 = 0; i17 < size9; i17++) {
                                i6 = lje.h(i14, (qde) list10.get(i17), m) + i6;
                            }
                        }
                        i11 = i6 + i11;
                        break;
                    case 50:
                        Object l2 = i0f.l(obj, j);
                        Object t5 = t(i10);
                        iteVar.getClass();
                        ite.b(l2, t5);
                        break;
                    case kk7.n0 /* 51 */:
                        if (q(i14, i10, obj)) {
                            i11 = yjb.A(i14 << 3, 8, i11);
                            break;
                        } else {
                            break;
                        }
                    case kk7.o0 /* 52 */:
                        if (q(i14, i10, obj)) {
                            i11 = yjb.A(i14 << 3, 4, i11);
                            break;
                        } else {
                            break;
                        }
                    case kk7.p0 /* 53 */:
                        if (q(i14, i10, obj)) {
                            long A4 = A(obj, j);
                            t3 = lje.t(i14 << 3);
                            o3 = lje.o(A4);
                            i11 += o3 + t3;
                            break;
                        } else {
                            break;
                        }
                    case kk7.q0 /* 54 */:
                        if (q(i14, i10, obj)) {
                            n2 = lje.n(i14, A(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case kk7.r0 /* 55 */:
                        if (q(i14, i10, obj)) {
                            int z2 = z(obj, j);
                            t3 = lje.t(i14 << 3);
                            o3 = lje.p(z2);
                            i11 += o3 + t3;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (q(i14, i10, obj)) {
                            n2 = lje.r(i14);
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case kk7.t0 /* 57 */:
                        if (q(i14, i10, obj)) {
                            n2 = lje.v(i14);
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case kk7.u0 /* 58 */:
                        if (q(i14, i10, obj)) {
                            i11 = yjb.A(i14 << 3, 1, i11);
                            break;
                        } else {
                            break;
                        }
                    case kk7.v0 /* 59 */:
                        if (q(i14, i10, obj)) {
                            Object l3 = i0f.l(obj, j);
                            if (l3 instanceof sie) {
                                n2 = lje.i(i14, (sie) l3);
                                i11 += n2;
                                break;
                            } else {
                                t3 = lje.t(i14 << 3);
                                o3 = lje.f((String) l3);
                                i11 += o3 + t3;
                                break;
                            }
                        } else {
                            break;
                        }
                    case kk7.w0 /* 60 */:
                        if (q(i14, i10, obj)) {
                            n2 = fxe.a(i14, i0f.l(obj, j), m(i10));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case kk7.x0 /* 61 */:
                        if (q(i14, i10, obj)) {
                            n2 = lje.i(i14, (sie) i0f.l(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case kk7.y0 /* 62 */:
                        if (q(i14, i10, obj)) {
                            n2 = lje.s(i14, z(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case kk7.z0 /* 63 */:
                        if (q(i14, i10, obj)) {
                            int z3 = z(obj, j);
                            t3 = lje.t(i14 << 3);
                            o3 = lje.p(z3);
                            i11 += o3 + t3;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (q(i14, i10, obj)) {
                            i11 = yjb.A(i14 << 3, 4, i11);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (q(i14, i10, obj)) {
                            i11 = yjb.A(i14 << 3, 8, i11);
                            break;
                        } else {
                            break;
                        }
                    case kk7.C0 /* 66 */:
                        if (q(i14, i10, obj)) {
                            n2 = lje.u(i14, z(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case kk7.D0 /* 67 */:
                        if (q(i14, i10, obj)) {
                            n2 = lje.q(i14, A(obj, j));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                    case kk7.E0 /* 68 */:
                        if (q(i14, i10, obj)) {
                            n2 = lje.h(i14, (qde) i0f.l(obj, j), m(i10));
                            i11 += n2;
                            break;
                        } else {
                            break;
                        }
                }
                i10 += 3;
                i7 = i13;
                i8 = i15;
                iArr = iArr2;
            }
            mzeVar2.getClass();
            return ((nne) obj).zzb.d() + i11;
        }
        int i18 = 1048575;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        while (i19 < iArr.length) {
            int y2 = y(i19);
            int i22 = iArr[i19];
            int i23 = (y2 & 267386880) >>> 20;
            int i24 = i9;
            if (i23 <= 17) {
                int i25 = iArr[i19 + 2];
                int i26 = i25 & 1048575;
                i = i24 << (i25 >>> 20);
                mzeVar = mzeVar2;
                if (i26 != i18) {
                    i21 = unsafe.getInt(obj, i26);
                    i18 = i26;
                }
            } else {
                mzeVar = mzeVar2;
                i = 0;
            }
            long j2 = y2 & 1048575;
            switch (i23) {
                case 0:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        i20 = yjb.A(i22 << 3, 8, i20);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        i20 = yjb.A(i22 << 3, 4, i20);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        o2 = lje.o(unsafe.getLong(obj, j2)) + lje.t(i22 << 3);
                        i20 += o2;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        o2 = lje.n(i22, unsafe.getLong(obj, j2));
                        i20 += o2;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        o2 = lje.p(unsafe.getInt(obj, j2)) + lje.t(i22 << 3);
                        i20 += o2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        o2 = lje.r(i22);
                        i20 += o2;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    i2 = i24;
                    if ((i & i21) != 0) {
                        o2 = lje.v(i22);
                        i20 += o2;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i & i21) != 0) {
                        i2 = 1;
                        i20 = yjb.A(i22 << 3, 1, i20);
                        break;
                    }
                    i2 = 1;
                    break;
                case 8:
                    if ((i & i21) != 0) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof sie) {
                            i3 = lje.i(i22, (sie) object);
                            i20 += i3;
                        } else {
                            t = lje.t(i22 << 3);
                            f = lje.f((String) object);
                            i3 = f + t;
                            i20 += i3;
                        }
                    }
                    i2 = 1;
                    break;
                case 9:
                    if ((i & i21) != 0) {
                        i3 = fxe.a(i22, unsafe.getObject(obj, j2), m(i19));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 10:
                    if ((i & i21) != 0) {
                        i3 = lje.i(i22, (sie) unsafe.getObject(obj, j2));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 11:
                    if ((i & i21) != 0) {
                        i3 = lje.s(i22, unsafe.getInt(obj, j2));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 12:
                    if ((i & i21) != 0) {
                        int i27 = unsafe.getInt(obj, j2);
                        t = lje.t(i22 << 3);
                        f = lje.p(i27);
                        i3 = f + t;
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 13:
                    if ((i & i21) != 0) {
                        i20 = yjb.A(i22 << 3, 4, i20);
                    }
                    i2 = 1;
                    break;
                case 14:
                    if ((i & i21) != 0) {
                        i20 = yjb.A(i22 << 3, 8, i20);
                    }
                    i2 = 1;
                    break;
                case 15:
                    if ((i & i21) != 0) {
                        i3 = lje.u(i22, unsafe.getInt(obj, j2));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 16:
                    if ((i & i21) != 0) {
                        i3 = lje.q(i22, unsafe.getLong(obj, j2));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 17:
                    if ((i & i21) != 0) {
                        i3 = lje.h(i22, (qde) unsafe.getObject(obj, j2), m(i19));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 18:
                    i3 = fxe.C(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 19:
                    i3 = fxe.z(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 20:
                    List list11 = (List) unsafe.getObject(obj, j2);
                    Class cls11 = fxe.a;
                    if (list11.size() != 0) {
                        i3 = mue.a(i22, list11.size(), fxe.c(list11));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 21:
                    List list12 = (List) unsafe.getObject(obj, j2);
                    Class cls12 = fxe.a;
                    int size10 = list12.size();
                    if (size10 != 0) {
                        i3 = mue.a(i22, size10, fxe.k(list12));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 22:
                    List list13 = (List) unsafe.getObject(obj, j2);
                    Class cls13 = fxe.a;
                    int size11 = list13.size();
                    if (size11 != 0) {
                        i3 = mue.a(i22, size11, fxe.t(list13));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 23:
                    i3 = fxe.C(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 24:
                    i3 = fxe.z(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 25:
                    List list14 = (List) unsafe.getObject(obj, j2);
                    Class cls14 = fxe.a;
                    int size12 = list14.size();
                    i20 += size12 == 0 ? 0 : (lje.t(i22 << 3) + 1) * size12;
                    i2 = 1;
                    break;
                case 26:
                    i3 = fxe.j(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 27:
                    i3 = fxe.b(i22, (List) unsafe.getObject(obj, j2), m(i19));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 28:
                    i3 = fxe.o(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 29:
                    List list15 = (List) unsafe.getObject(obj, j2);
                    Class cls15 = fxe.a;
                    int size13 = list15.size();
                    if (size13 != 0) {
                        i3 = mue.a(i22, size13, fxe.v(list15));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case kk7.S /* 30 */:
                    List list16 = (List) unsafe.getObject(obj, j2);
                    Class cls16 = fxe.a;
                    int size14 = list16.size();
                    if (size14 != 0) {
                        i3 = mue.a(i22, size14, fxe.r(list16));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 31:
                    i3 = fxe.z(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 32:
                    i3 = fxe.C(i22, (List) unsafe.getObject(obj, j2));
                    i20 += i3;
                    i2 = 1;
                    break;
                case 33:
                    List list17 = (List) unsafe.getObject(obj, j2);
                    Class cls17 = fxe.a;
                    int size15 = list17.size();
                    if (size15 != 0) {
                        i3 = mue.a(i22, size15, fxe.x(list17));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 34:
                    List list18 = (List) unsafe.getObject(obj, j2);
                    Class cls18 = fxe.a;
                    int size16 = list18.size();
                    if (size16 != 0) {
                        i3 = mue.a(i22, size16, fxe.p(list18));
                        i20 += i3;
                        i2 = 1;
                        break;
                    }
                    i3 = 0;
                    i20 += i3;
                    i2 = 1;
                case 35:
                    int D4 = fxe.D((List) unsafe.getObject(obj, j2));
                    if (D4 > 0) {
                        i20 = mue.b(D4, lje.m(i22), D4, i20);
                    }
                    i2 = 1;
                    break;
                case 36:
                    int A5 = fxe.A((List) unsafe.getObject(obj, j2));
                    if (A5 > 0) {
                        i20 = mue.b(A5, lje.m(i22), A5, i20);
                    }
                    i2 = 1;
                    break;
                case 37:
                    int c2 = fxe.c((List) unsafe.getObject(obj, j2));
                    if (c2 > 0) {
                        i20 = mue.b(c2, lje.m(i22), c2, i20);
                    }
                    i2 = 1;
                    break;
                case 38:
                    int k2 = fxe.k((List) unsafe.getObject(obj, j2));
                    if (k2 > 0) {
                        i20 = mue.b(k2, lje.m(i22), k2, i20);
                    }
                    i2 = 1;
                    break;
                case 39:
                    int t6 = fxe.t((List) unsafe.getObject(obj, j2));
                    if (t6 > 0) {
                        i20 = mue.b(t6, lje.m(i22), t6, i20);
                    }
                    i2 = 1;
                    break;
                case 40:
                    int D5 = fxe.D((List) unsafe.getObject(obj, j2));
                    if (D5 > 0) {
                        i20 = mue.b(D5, lje.m(i22), D5, i20);
                    }
                    i2 = 1;
                    break;
                case 41:
                    int A6 = fxe.A((List) unsafe.getObject(obj, j2));
                    if (A6 > 0) {
                        i20 = mue.b(A6, lje.m(i22), A6, i20);
                    }
                    i2 = 1;
                    break;
                case 42:
                    List list19 = (List) unsafe.getObject(obj, j2);
                    Class cls19 = fxe.a;
                    int size17 = list19.size();
                    if (size17 > 0) {
                        i20 = mue.b(size17, lje.m(i22), size17, i20);
                    }
                    i2 = 1;
                    break;
                case 43:
                    int v2 = fxe.v((List) unsafe.getObject(obj, j2));
                    if (v2 > 0) {
                        i20 = mue.b(v2, lje.m(i22), v2, i20);
                    }
                    i2 = 1;
                    break;
                case 44:
                    int r2 = fxe.r((List) unsafe.getObject(obj, j2));
                    if (r2 > 0) {
                        i20 = mue.b(r2, lje.m(i22), r2, i20);
                    }
                    i2 = 1;
                    break;
                case 45:
                    int A7 = fxe.A((List) unsafe.getObject(obj, j2));
                    if (A7 > 0) {
                        i20 = mue.b(A7, lje.m(i22), A7, i20);
                    }
                    i2 = 1;
                    break;
                case 46:
                    int D6 = fxe.D((List) unsafe.getObject(obj, j2));
                    if (D6 > 0) {
                        i20 = mue.b(D6, lje.m(i22), D6, i20);
                    }
                    i2 = 1;
                    break;
                case 47:
                    int x2 = fxe.x((List) unsafe.getObject(obj, j2));
                    if (x2 > 0) {
                        i20 = mue.b(x2, lje.m(i22), x2, i20);
                    }
                    i2 = 1;
                    break;
                case 48:
                    int p2 = fxe.p((List) unsafe.getObject(obj, j2));
                    if (p2 > 0) {
                        i20 = mue.b(p2, lje.m(i22), p2, i20);
                    }
                    i2 = 1;
                    break;
                case 49:
                    List list20 = (List) unsafe.getObject(obj, j2);
                    xwe m2 = m(i19);
                    Class cls20 = fxe.a;
                    int size18 = list20.size();
                    if (size18 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        for (int i28 = 0; i28 < size18; i28++) {
                            i4 += lje.h(i22, (qde) list20.get(i28), m2);
                        }
                    }
                    i20 += i4;
                    i2 = 1;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j2);
                    Object t7 = t(i19);
                    iteVar.getClass();
                    ite.b(object2, t7);
                    i2 = 1;
                    break;
                case kk7.n0 /* 51 */:
                    if (q(i22, i19, obj)) {
                        i20 = yjb.A(i22 << 3, 8, i20);
                    }
                    i2 = 1;
                    break;
                case kk7.o0 /* 52 */:
                    if (q(i22, i19, obj)) {
                        i20 = yjb.A(i22 << 3, 4, i20);
                    }
                    i2 = 1;
                    break;
                case kk7.p0 /* 53 */:
                    if (q(i22, i19, obj)) {
                        i3 = lje.o(A(obj, j2)) + lje.t(i22 << 3);
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case kk7.q0 /* 54 */:
                    if (q(i22, i19, obj)) {
                        i3 = lje.n(i22, A(obj, j2));
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case kk7.r0 /* 55 */:
                    if (q(i22, i19, obj)) {
                        int z4 = z(obj, j2);
                        t = lje.t(i22 << 3);
                        f = lje.p(z4);
                        i3 = f + t;
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case 56:
                    if (q(i22, i19, obj)) {
                        i3 = lje.r(i22);
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case kk7.t0 /* 57 */:
                    if (q(i22, i19, obj)) {
                        i3 = lje.v(i22);
                        i20 += i3;
                    }
                    i2 = 1;
                    break;
                case kk7.u0 /* 58 */:
                    if (q(i22, i19, obj)) {
                        i20 = yjb.A(i22 << 3, i24, i20);
                        i2 = i24;
                        break;
                    }
                    i2 = 1;
                    break;
                case kk7.v0 /* 59 */:
                    if (q(i22, i19, obj)) {
                        Object object3 = unsafe.getObject(obj, j2);
                        if (object3 instanceof sie) {
                            i5 = lje.i(i22, (sie) object3);
                            i20 += i5;
                        } else {
                            t2 = lje.t(i22 << 3);
                            f2 = lje.f((String) object3);
                            i5 = f2 + t2;
                            i20 += i5;
                        }
                    }
                    i2 = i24;
                    break;
                case kk7.w0 /* 60 */:
                    if (q(i22, i19, obj)) {
                        i5 = fxe.a(i22, unsafe.getObject(obj, j2), m(i19));
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                case kk7.x0 /* 61 */:
                    if (q(i22, i19, obj)) {
                        i5 = lje.i(i22, (sie) unsafe.getObject(obj, j2));
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                case kk7.y0 /* 62 */:
                    if (q(i22, i19, obj)) {
                        i5 = lje.s(i22, z(obj, j2));
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                case kk7.z0 /* 63 */:
                    if (q(i22, i19, obj)) {
                        int z5 = z(obj, j2);
                        t2 = lje.t(i22 << 3);
                        f2 = lje.p(z5);
                        i5 = f2 + t2;
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                case 64:
                    if (q(i22, i19, obj)) {
                        i20 = yjb.A(i22 << 3, 4, i20);
                    }
                    i2 = i24;
                    break;
                case 65:
                    if (q(i22, i19, obj)) {
                        i20 = yjb.A(i22 << 3, 8, i20);
                    }
                    i2 = i24;
                    break;
                case kk7.C0 /* 66 */:
                    if (q(i22, i19, obj)) {
                        i5 = lje.u(i22, z(obj, j2));
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                case kk7.D0 /* 67 */:
                    if (q(i22, i19, obj)) {
                        i5 = lje.q(i22, A(obj, j2));
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                case kk7.E0 /* 68 */:
                    if (q(i22, i19, obj)) {
                        i5 = lje.h(i22, (qde) unsafe.getObject(obj, j2), m(i19));
                        i20 += i5;
                    }
                    i2 = i24;
                    break;
                default:
                    i2 = i24;
                    break;
            }
            i19 += 3;
            i9 = i2;
            mzeVar2 = mzeVar;
        }
        mzeVar2.getClass();
        return ((nne) obj).zzb.d() + i20;
    }
}
