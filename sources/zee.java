// default package

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zee {
    public static final zee c = new zee();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final wz4 a = new wz4((byte) 2);

    /* JADX WARN: Removed duplicated region for block: B:114:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final rfe a(Class cls) {
        rfe heeVar;
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int i2;
        int[] iArr;
        int i3;
        int i4;
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
        int objectFieldOffset;
        int i19;
        int i20;
        Class<?> cls2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        Field z;
        char charAt12;
        int i26;
        int i27;
        int i28;
        Object obj;
        Field z2;
        Object obj2;
        Field z3;
        int i29;
        char charAt13;
        int i30;
        int i31;
        char charAt14;
        int i32;
        int i33;
        char charAt15;
        Object[] objArr2;
        int i34;
        char charAt16;
        Charset charset = x7e.a;
        if (cls == null) {
            p3d.h("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        rfe rfeVar = (rfe) concurrentHashMap.get(cls);
        if (rfeVar != null) {
            return rfeVar;
        }
        rad radVar = fge.a;
        s6e.class.isAssignableFrom(cls);
        lfe zzb = ((oqd) this.a.a).zzb(cls);
        int i35 = 0;
        if ((zzb.d & 2) == 2) {
            rad radVar2 = fge.a;
            zgd zgdVar = r2e.a;
            heeVar = new hee(radVar2, zzb.a);
        } else {
            int i36 = uee.a;
            int i37 = jae.a;
            rad radVar3 = fge.a;
            zgd zgdVar2 = zzb.a() + (-1) != 1 ? r2e.a : null;
            int i38 = sce.a;
            int[] iArr2 = bee.j;
            if (!(zzb instanceof lfe)) {
                grb.o();
                return null;
            }
            String str = zzb.b;
            int length = str.length();
            if (str.charAt(0) >= 55296) {
                int i39 = 1;
                while (true) {
                    i = i39 + 1;
                    if (str.charAt(i39) < 55296) {
                        break;
                    }
                    i39 = i;
                }
            } else {
                i = 1;
            }
            int i40 = i + 1;
            int charAt17 = str.charAt(i);
            if (charAt17 >= 55296) {
                int i41 = charAt17 & 8191;
                int i42 = 13;
                while (true) {
                    i34 = i40 + 1;
                    charAt16 = str.charAt(i40);
                    if (charAt16 < 55296) {
                        break;
                    }
                    i41 |= (charAt16 & 8191) << i42;
                    i42 += 13;
                    i40 = i34;
                }
                charAt17 = i41 | (charAt16 << i42);
                i40 = i34;
            }
            if (charAt17 == 0) {
                i4 = 0;
                charAt = 0;
                charAt2 = 0;
                charAt3 = 0;
                i5 = 0;
                iArr = bee.j;
                i3 = 0;
            } else {
                int i43 = i40 + 1;
                int charAt18 = str.charAt(i40);
                if (charAt18 >= 55296) {
                    int i44 = charAt18 & 8191;
                    int i45 = 13;
                    while (true) {
                        i13 = i43 + 1;
                        charAt11 = str.charAt(i43);
                        if (charAt11 < 55296) {
                            break;
                        }
                        i44 |= (charAt11 & 8191) << i45;
                        i45 += 13;
                        i43 = i13;
                    }
                    charAt18 = i44 | (charAt11 << i45);
                    i43 = i13;
                }
                int i46 = i43 + 1;
                int charAt19 = str.charAt(i43);
                if (charAt19 >= 55296) {
                    int i47 = charAt19 & 8191;
                    int i48 = 13;
                    while (true) {
                        i12 = i46 + 1;
                        charAt10 = str.charAt(i46);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i47 |= (charAt10 & 8191) << i48;
                        i48 += 13;
                        i46 = i12;
                    }
                    charAt19 = i47 | (charAt10 << i48);
                    i46 = i12;
                }
                int i49 = i46 + 1;
                charAt = str.charAt(i46);
                if (charAt >= 55296) {
                    int i50 = charAt & 8191;
                    int i51 = 13;
                    while (true) {
                        i11 = i49 + 1;
                        charAt9 = str.charAt(i49);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i50 |= (charAt9 & 8191) << i51;
                        i51 += 13;
                        i49 = i11;
                    }
                    charAt = i50 | (charAt9 << i51);
                    i49 = i11;
                }
                int i52 = i49 + 1;
                charAt2 = str.charAt(i49);
                if (charAt2 >= 55296) {
                    int i53 = charAt2 & 8191;
                    int i54 = 13;
                    while (true) {
                        i10 = i52 + 1;
                        charAt8 = str.charAt(i52);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i53 |= (charAt8 & 8191) << i54;
                        i54 += 13;
                        i52 = i10;
                    }
                    charAt2 = i53 | (charAt8 << i54);
                    i52 = i10;
                }
                int i55 = i52 + 1;
                charAt3 = str.charAt(i52);
                if (charAt3 >= 55296) {
                    int i56 = charAt3 & 8191;
                    int i57 = 13;
                    while (true) {
                        i9 = i55 + 1;
                        charAt7 = str.charAt(i55);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i56 |= (charAt7 & 8191) << i57;
                        i57 += 13;
                        i55 = i9;
                    }
                    charAt3 = i56 | (charAt7 << i57);
                    i55 = i9;
                }
                int i58 = i55 + 1;
                int charAt20 = str.charAt(i55);
                if (charAt20 >= 55296) {
                    int i59 = charAt20 & 8191;
                    int i60 = 13;
                    while (true) {
                        i8 = i58 + 1;
                        charAt6 = str.charAt(i58);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i59 |= (charAt6 & 8191) << i60;
                        i60 += 13;
                        i58 = i8;
                    }
                    charAt20 = i59 | (charAt6 << i60);
                    i58 = i8;
                }
                int i61 = i58 + 1;
                int charAt21 = str.charAt(i58);
                if (charAt21 >= 55296) {
                    int i62 = charAt21 & 8191;
                    int i63 = i61;
                    int i64 = 13;
                    while (true) {
                        i7 = i63 + 1;
                        charAt5 = str.charAt(i63);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i62 |= (charAt5 & 8191) << i64;
                        i64 += 13;
                        i63 = i7;
                    }
                    charAt21 = i62 | (charAt5 << i64);
                    i2 = i7;
                } else {
                    i2 = i61;
                }
                int i65 = i2 + 1;
                int charAt22 = str.charAt(i2);
                if (charAt22 >= 55296) {
                    int i66 = charAt22 & 8191;
                    int i67 = i65;
                    int i68 = 13;
                    while (true) {
                        i6 = i67 + 1;
                        charAt4 = str.charAt(i67);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i66 |= (charAt4 & 8191) << i68;
                        i68 += 13;
                        i67 = i6;
                    }
                    charAt22 = i66 | (charAt4 << i68);
                    i65 = i6;
                }
                int i69 = charAt22 + charAt20 + charAt21;
                int i70 = (charAt18 << 1) + charAt19;
                int[] iArr3 = new int[i69];
                int i71 = charAt20;
                iArr = iArr3;
                i3 = i71;
                i4 = i70;
                i5 = charAt22;
                i35 = charAt18;
                i40 = i65;
            }
            Unsafe unsafe = bee.k;
            Object[] objArr3 = zzb.c;
            int i72 = i40;
            Class<?> cls3 = zzb.a.getClass();
            int i73 = i3 + i5;
            int i74 = i35;
            int i75 = charAt3 << 1;
            int[] iArr4 = new int[charAt3 * 3];
            Object[] objArr4 = new Object[i75];
            int i76 = i4;
            int i77 = i72;
            int i78 = i73;
            int i79 = i5;
            int i80 = 0;
            int i81 = 0;
            while (i77 < length) {
                int i82 = i77 + 1;
                int charAt23 = str.charAt(i77);
                int i83 = length;
                if (charAt23 >= 55296) {
                    int i84 = charAt23 & 8191;
                    int i85 = i82;
                    int i86 = 13;
                    while (true) {
                        i33 = i85 + 1;
                        charAt15 = str.charAt(i85);
                        objArr2 = objArr4;
                        if (charAt15 < 55296) {
                            break;
                        }
                        i84 |= (charAt15 & 8191) << i86;
                        i86 += 13;
                        i85 = i33;
                        objArr4 = objArr2;
                    }
                    charAt23 = i84 | (charAt15 << i86);
                    i14 = i33;
                    objArr = objArr2;
                } else {
                    objArr = objArr4;
                    i14 = i82;
                }
                int i87 = i14 + 1;
                int charAt24 = str.charAt(i14);
                if (charAt24 >= 55296) {
                    int i88 = charAt24 & 8191;
                    int i89 = i87;
                    int i90 = 13;
                    while (true) {
                        i31 = i89 + 1;
                        charAt14 = str.charAt(i89);
                        i32 = i88;
                        if (charAt14 < 55296) {
                            break;
                        }
                        i88 = i32 | ((charAt14 & 8191) << i90);
                        i90 += 13;
                        i89 = i31;
                    }
                    charAt24 = i32 | (charAt14 << i90);
                    i15 = i31;
                } else {
                    i15 = i87;
                }
                Object[] objArr5 = objArr3;
                if ((charAt24 & 1024) != 0) {
                    iArr[i80] = i81;
                    i80++;
                }
                int i91 = charAt24 & jn7.d4;
                int i92 = i73;
                int i93 = charAt24 & 2048;
                if (i91 >= 51) {
                    int i94 = i15 + 1;
                    int charAt25 = str.charAt(i15);
                    if (charAt25 >= 55296) {
                        int i95 = charAt25 & 8191;
                        int i96 = i94;
                        int i97 = 13;
                        while (true) {
                            i29 = i96 + 1;
                            charAt13 = str.charAt(i96);
                            i30 = i95;
                            if (charAt13 < 55296) {
                                break;
                            }
                            i95 = i30 | ((charAt13 & 8191) << i97);
                            i97 += 13;
                            i96 = i29;
                        }
                        charAt25 = i30 | (charAt13 << i97);
                        i27 = i29;
                    } else {
                        i27 = i94;
                    }
                    int i98 = charAt25;
                    int i99 = i91 - 51;
                    int i100 = i27;
                    if (i99 == 9 || i99 == 17) {
                        i28 = i76 + 1;
                        objArr[((i81 / 3) << 1) + 1] = objArr5[i76];
                    } else {
                        if (i99 == 12) {
                            if (zzb.a() == 1 || i93 != 0) {
                                i28 = i76 + 1;
                                objArr[((i81 / 3) << 1) + 1] = objArr5[i76];
                            } else {
                                i93 = 0;
                            }
                        }
                        int i101 = i98 << 1;
                        obj = objArr5[i101];
                        if (obj instanceof Field) {
                            z2 = bee.z(cls3, (String) obj);
                            objArr5[i101] = z2;
                        } else {
                            z2 = (Field) obj;
                        }
                        i16 = charAt23;
                        int objectFieldOffset2 = (int) unsafe.objectFieldOffset(z2);
                        int i102 = i101 + 1;
                        obj2 = objArr5[i102];
                        if (obj2 instanceof Field) {
                            z3 = bee.z(cls3, (String) obj2);
                            objArr5[i102] = z3;
                        } else {
                            z3 = (Field) obj2;
                        }
                        int i103 = i93;
                        i19 = (int) unsafe.objectFieldOffset(z3);
                        i24 = objectFieldOffset2;
                        i20 = i103;
                        cls2 = cls3;
                        i17 = charAt;
                        i77 = i100;
                        i23 = 0;
                    }
                    i76 = i28;
                    int i1012 = i98 << 1;
                    obj = objArr5[i1012];
                    if (obj instanceof Field) {
                    }
                    i16 = charAt23;
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(z2);
                    int i1022 = i1012 + 1;
                    obj2 = objArr5[i1022];
                    if (obj2 instanceof Field) {
                    }
                    int i1032 = i93;
                    i19 = (int) unsafe.objectFieldOffset(z3);
                    i24 = objectFieldOffset22;
                    i20 = i1032;
                    cls2 = cls3;
                    i17 = charAt;
                    i77 = i100;
                    i23 = 0;
                } else {
                    i16 = charAt23;
                    int i104 = i76 + 1;
                    Field z4 = bee.z(cls3, (String) objArr5[i76]);
                    if (i91 == 9 || i91 == 17) {
                        i17 = charAt;
                        objArr[((i81 / 3) << 1) + 1] = z4.getType();
                    } else {
                        if (i91 == 27) {
                            i17 = charAt;
                            i26 = 1;
                            i76 += 2;
                        } else if (i91 == 49) {
                            i76 += 2;
                            i17 = charAt;
                            i26 = 1;
                        } else {
                            if (i91 == 12 || i91 == 30 || i91 == 44) {
                                i17 = charAt;
                                if (zzb.a() == 1 || i93 != 0) {
                                    i76 += 2;
                                    objArr[((i81 / 3) << 1) + 1] = objArr5[i104];
                                    i18 = i93;
                                } else {
                                    i76 = i104;
                                    i18 = 0;
                                }
                            } else if (i91 == 50) {
                                int i105 = i76 + 2;
                                int i106 = i79 + 1;
                                iArr[i79] = i81;
                                int i107 = (i81 / 3) << 1;
                                objArr[i107] = objArr5[i104];
                                if (i93 != 0) {
                                    i76 += 3;
                                    objArr[i107 + 1] = objArr5[i105];
                                    i18 = i93;
                                    i79 = i106;
                                } else {
                                    i76 = i105;
                                    i79 = i106;
                                    i18 = 0;
                                }
                                i17 = charAt;
                            } else {
                                i17 = charAt;
                            }
                            objectFieldOffset = (int) unsafe.objectFieldOffset(z4);
                            i19 = 1048575;
                            if ((charAt24 & TLObject.FLAG_12) != 0 || i91 > 17) {
                                i20 = i18;
                                cls2 = cls3;
                                i21 = i15;
                                i22 = 0;
                            } else {
                                int i108 = i15 + 1;
                                int charAt26 = str.charAt(i15);
                                i20 = i18;
                                if (charAt26 >= 55296) {
                                    int i109 = charAt26 & 8191;
                                    int i110 = 13;
                                    while (true) {
                                        i25 = i108 + 1;
                                        charAt12 = str.charAt(i108);
                                        if (charAt12 < 55296) {
                                            break;
                                        }
                                        i109 |= (charAt12 & 8191) << i110;
                                        i110 += 13;
                                        i108 = i25;
                                    }
                                    charAt26 = i109 | (charAt12 << i110);
                                } else {
                                    i25 = i108;
                                }
                                int i111 = (charAt26 / 32) + (i74 << 1);
                                Object obj3 = objArr5[i111];
                                if (obj3 instanceof Field) {
                                    z = (Field) obj3;
                                } else {
                                    z = bee.z(cls3, (String) obj3);
                                    objArr5[i111] = z;
                                }
                                cls2 = cls3;
                                i22 = charAt26 % 32;
                                int i112 = i25;
                                i19 = (int) unsafe.objectFieldOffset(z);
                                i21 = i112;
                            }
                            if (i91 >= 18 || i91 > 49) {
                                i77 = i21;
                                i23 = i22;
                                i24 = objectFieldOffset;
                            } else {
                                iArr[i78] = objectFieldOffset;
                                i77 = i21;
                                i23 = i22;
                                i24 = objectFieldOffset;
                                i78++;
                            }
                        }
                        objArr[((i81 / 3) << i26) + i26] = objArr5[i104];
                        i18 = i93;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(z4);
                        i19 = 1048575;
                        if ((charAt24 & TLObject.FLAG_12) != 0) {
                        }
                        i20 = i18;
                        cls2 = cls3;
                        i21 = i15;
                        i22 = 0;
                        if (i91 >= 18) {
                        }
                        i77 = i21;
                        i23 = i22;
                        i24 = objectFieldOffset;
                    }
                    i18 = i93;
                    i76 = i104;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(z4);
                    i19 = 1048575;
                    if ((charAt24 & TLObject.FLAG_12) != 0) {
                    }
                    i20 = i18;
                    cls2 = cls3;
                    i21 = i15;
                    i22 = 0;
                    if (i91 >= 18) {
                    }
                    i77 = i21;
                    i23 = i22;
                    i24 = objectFieldOffset;
                }
                int i113 = i81 + 1;
                iArr4[i81] = i16;
                int i114 = i81 + 2;
                String str2 = str;
                iArr4[i113] = ((charAt24 & 512) != 0 ? TLObject.FLAG_29 : 0) | ((charAt24 & 256) != 0 ? TLObject.FLAG_28 : 0) | (i20 != 0 ? TLObject.FLAG_31 : 0) | (i91 << 20) | i24;
                i81 += 3;
                iArr4[i114] = (i23 << 20) | i19;
                cls3 = cls2;
                objArr3 = objArr5;
                length = i83;
                i73 = i92;
                objArr4 = objArr;
                charAt = i17;
                str = str2;
            }
            heeVar = new bee(iArr4, objArr4, charAt, charAt2, zzb.a, iArr, i5, i73, radVar3, zgdVar2);
        }
        Charset charset2 = x7e.a;
        rfe rfeVar2 = (rfe) concurrentHashMap.putIfAbsent(cls, heeVar);
        return rfeVar2 != null ? rfeVar2 : heeVar;
    }
}
