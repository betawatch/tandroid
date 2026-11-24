// default package

import j$.util.Objects;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class skd extends h9d {
    public static final skd n = new skd(null, new Object[0], 0);
    public final transient Object e;
    public final transient Object[] f;
    public final transient int h;

    public skd(Object obj, Object[] objArr, int i) {
        super((byte) 3);
        this.e = obj;
        this.f = objArr;
        this.h = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01bc  */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static skd c(int i, Object[] objArr, kq kqVar) {
        int i2;
        boolean z;
        int i3;
        char c;
        Object obj;
        char c2;
        short[] sArr;
        boolean z2;
        int i4;
        ?? r16;
        boolean z3;
        boolean z4;
        int i5 = i;
        Object[] objArr2 = objArr;
        if (i5 == 0) {
            return n;
        }
        Object obj2 = null;
        boolean z5 = false;
        int i6 = 1;
        if (i5 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            return new skd(null, objArr2, 1);
        }
        u1f.b(i5, objArr2.length >> 1);
        char c3 = 2;
        int max = Math.max(i5, 2);
        if (max < 751619276) {
            i2 = Integer.highestOneBit(max - 1) << 1;
            while (i2 * 0.7d < max) {
                i2 <<= 1;
            }
        } else {
            i2 = TLObject.FLAG_30;
            if (max >= 1073741824) {
                u36.j("collection too large");
                return null;
            }
        }
        if (i5 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            z4 = false;
            i5 = 1;
            i3 = 1;
        } else {
            int i7 = i2 - 1;
            if (i2 <= 128) {
                byte[] bArr = new byte[i2];
                Arrays.fill(bArr, (byte) -1);
                int i8 = 0;
                int i9 = 0;
                while (i8 < i5) {
                    int i10 = i9 << 1;
                    int i11 = i8 << 1;
                    Object obj3 = objArr2[i11];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArr2[i11 ^ i6];
                    Objects.requireNonNull(obj4);
                    int a = o2f.a(obj3.hashCode());
                    while (true) {
                        int i12 = a & i7;
                        z2 = z5;
                        i4 = i6;
                        int i13 = bArr[i12] & 255;
                        if (i13 == 255) {
                            bArr[i12] = (byte) i10;
                            if (i9 < i8) {
                                objArr2[i10] = obj3;
                                objArr2[i10 ^ 1] = obj4;
                            }
                            i9++;
                        } else {
                            if (obj3.equals(objArr2[i13])) {
                                int i14 = i13 ^ 1;
                                Object obj5 = objArr2[i14];
                                Objects.requireNonNull(obj5);
                                obj2 = new jhd(obj3, obj4, obj5);
                                objArr2[i14] = obj4;
                                break;
                            }
                            a = i12 + 1;
                            z5 = z2;
                            i6 = i4;
                        }
                    }
                    i8++;
                    z5 = z2;
                    i6 = i4;
                }
                z = z5;
                i3 = i6;
                if (i9 == i5) {
                    c = 2;
                    obj = bArr;
                    r16 = z;
                    z3 = obj instanceof Object[];
                    Object obj6 = obj;
                    if (z3) {
                        Object[] objArr3 = (Object[]) obj;
                        jhd jhdVar = (jhd) objArr3[c];
                        if (kqVar == null) {
                            throw jhdVar.a();
                        }
                        kqVar.d = jhdVar;
                        Object obj7 = objArr3[r16];
                        int intValue = ((Integer) objArr3[i3]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue << 1);
                        obj6 = obj7;
                        i5 = intValue;
                    }
                    return new skd(obj6, objArr2, i5);
                }
                sArr = new Object[3];
                sArr[z ? 1 : 0] = bArr;
                sArr[i3] = Integer.valueOf(i9);
                sArr[2] = obj2;
                obj2 = sArr;
                z4 = z;
            } else {
                z = false;
                i3 = 1;
                if (i2 > 32768) {
                    int[] iArr = new int[i2];
                    Arrays.fill(iArr, -1);
                    int i15 = 0;
                    int i16 = 0;
                    while (i15 < i5) {
                        int i17 = i16 << 1;
                        int i18 = i15 << 1;
                        Object obj8 = objArr2[i18];
                        Objects.requireNonNull(obj8);
                        Object obj9 = objArr2[i18 ^ 1];
                        Objects.requireNonNull(obj9);
                        int a2 = o2f.a(obj8.hashCode());
                        while (true) {
                            int i19 = a2 & i7;
                            int i20 = iArr[i19];
                            if (i20 == -1) {
                                iArr[i19] = i17;
                                if (i16 < i15) {
                                    objArr2[i17] = obj8;
                                    objArr2[i17 ^ 1] = obj9;
                                }
                                i16++;
                                c2 = c3;
                            } else {
                                c2 = c3;
                                if (obj8.equals(objArr2[i20])) {
                                    int i21 = i20 ^ 1;
                                    Object obj10 = objArr2[i21];
                                    Objects.requireNonNull(obj10);
                                    obj2 = new jhd(obj8, obj9, obj10);
                                    objArr2[i21] = obj9;
                                    break;
                                }
                                a2 = i19 + 1;
                                c3 = c2;
                            }
                        }
                        i15++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i16 == i5) {
                        obj = iArr;
                        r16 = z;
                    } else {
                        Object[] objArr4 = new Object[3];
                        objArr4[0] = iArr;
                        objArr4[1] = Integer.valueOf(i16);
                        objArr4[c] = obj2;
                        obj = objArr4;
                        r16 = z;
                    }
                    z3 = obj instanceof Object[];
                    Object obj62 = obj;
                    if (z3) {
                    }
                    return new skd(obj62, objArr2, i5);
                }
                sArr = new short[i2];
                Arrays.fill(sArr, (short) -1);
                int i22 = 0;
                for (int i23 = 0; i23 < i5; i23++) {
                    int i24 = i22 << 1;
                    int i25 = i23 << 1;
                    Object obj11 = objArr2[i25];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArr2[i25 ^ 1];
                    Objects.requireNonNull(obj12);
                    int a3 = o2f.a(obj11.hashCode());
                    while (true) {
                        int i26 = a3 & i7;
                        char c4 = (char) sArr[i26];
                        if (c4 == 65535) {
                            sArr[i26] = (short) i24;
                            if (i22 < i23) {
                                objArr2[i24] = obj11;
                                objArr2[i24 ^ 1] = obj12;
                            }
                            i22++;
                        } else {
                            if (obj11.equals(objArr2[c4])) {
                                int i27 = c4 ^ 1;
                                Object obj13 = objArr2[i27];
                                Objects.requireNonNull(obj13);
                                obj2 = new jhd(obj11, obj12, obj13);
                                objArr2[i27] = obj12;
                                break;
                            }
                            a3 = i26 + 1;
                        }
                    }
                }
                if (i22 != i5) {
                    obj2 = new Object[]{sArr, Integer.valueOf(i22), obj2};
                    z4 = z;
                }
                obj2 = sArr;
                z4 = z;
            }
        }
        c = 2;
        obj = obj2;
        r16 = z4;
        z3 = obj instanceof Object[];
        Object obj622 = obj;
        if (z3) {
        }
        return new skd(obj622, objArr2, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0095 A[RETURN] */
    @Override // h9d, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            int i = this.h;
            Object[] objArr = this.f;
            if (i == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.e;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int a = o2f.a(obj.hashCode());
                        while (true) {
                            int i2 = a & length;
                            int i3 = bArr[i2] & 255;
                            if (i3 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i3])) {
                                obj2 = objArr[i3 ^ 1];
                                break;
                            }
                            a = i2 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int a2 = o2f.a(obj.hashCode());
                        while (true) {
                            int i4 = a2 & length2;
                            char c = (char) sArr[i4];
                            if (c == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c])) {
                                obj2 = objArr[c ^ 1];
                                break;
                            }
                            a2 = i4 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int a3 = o2f.a(obj.hashCode());
                        while (true) {
                            int i5 = a3 & length3;
                            int i6 = iArr[i5];
                            if (i6 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i6])) {
                                obj2 = objArr[i6 ^ 1];
                                break;
                            }
                            a3 = i5 + 1;
                        }
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.h;
    }
}
