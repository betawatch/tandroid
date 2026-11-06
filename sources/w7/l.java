package w7;

import a8.v;
import a8.wa;
import c8.ed;
import c8.gd;
import j$.util.Objects;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class l extends v {
    public static final l n = new l(null, new Object[0], 0);
    public final transient Object e;
    public final transient Object[] f;
    public final transient int h;

    public l(Object obj, Object[] objArr, int i7) {
        super(4);
        this.e = obj;
        this.f = objArr;
        this.h = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01be  */
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
    public static l c(int i7, Object[] objArr, wa waVar) {
        int i10;
        boolean z9;
        int i11;
        char c10;
        Object obj;
        char c11;
        short[] sArr;
        boolean z10;
        int i12;
        ?? r16;
        boolean z11;
        boolean z12;
        int i13 = i7;
        Object[] objArr2 = objArr;
        if (i13 == 0) {
            return n;
        }
        Object obj2 = null;
        boolean z13 = false;
        int i14 = 1;
        if (i13 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            return new l(null, objArr2, 1);
        }
        ed.b(i13, objArr2.length >> 1);
        char c12 = 2;
        int max = Math.max(i13, 2);
        if (max < 751619276) {
            i10 = Integer.highestOneBit(max - 1);
            do {
                i10 += i10;
            } while (i10 * 0.7d < max);
        } else {
            i10 = TLObject.FLAG_30;
            if (max >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i13 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            z12 = false;
            i13 = 1;
            i11 = 1;
        } else {
            int i15 = i10 - 1;
            if (i10 <= 128) {
                byte[] bArr = new byte[i10];
                Arrays.fill(bArr, (byte) -1);
                int i16 = 0;
                int i17 = 0;
                while (i16 < i13) {
                    int i18 = i17 + i17;
                    int i19 = i16 + i16;
                    Object obj3 = objArr2[i19];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArr2[i19 ^ i14];
                    Objects.requireNonNull(obj4);
                    int a10 = gd.a(obj3.hashCode());
                    while (true) {
                        int i20 = a10 & i15;
                        z10 = z13;
                        i12 = i14;
                        int i21 = bArr[i20] & 255;
                        if (i21 == 255) {
                            bArr[i20] = (byte) i18;
                            if (i17 < i16) {
                                objArr2[i18] = obj3;
                                objArr2[i18 ^ 1] = obj4;
                            }
                            i17++;
                        } else {
                            if (obj3.equals(objArr2[i21])) {
                                int i22 = i21 ^ 1;
                                Object obj5 = objArr2[i22];
                                Objects.requireNonNull(obj5);
                                e eVar = new e(obj3, obj4, obj5);
                                objArr2[i22] = obj4;
                                obj2 = eVar;
                                break;
                            }
                            a10 = i20 + 1;
                            z13 = z10;
                            i14 = i12;
                        }
                    }
                    i16++;
                    z13 = z10;
                    i14 = i12;
                }
                z9 = z13;
                i11 = i14;
                if (i17 == i13) {
                    c10 = 2;
                    obj = bArr;
                    r16 = z9;
                    z11 = obj instanceof Object[];
                    Object obj6 = obj;
                    if (z11) {
                        Object[] objArr3 = (Object[]) obj;
                        e eVar2 = (e) objArr3[c10];
                        if (waVar == null) {
                            throw eVar2.a();
                        }
                        waVar.d = eVar2;
                        Object obj7 = objArr3[r16];
                        int intValue = ((Integer) objArr3[i11]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                        obj6 = obj7;
                        i13 = intValue;
                    }
                    return new l(obj6, objArr2, i13);
                }
                sArr = new Object[3];
                sArr[z9 ? 1 : 0] = bArr;
                sArr[i11] = Integer.valueOf(i17);
                sArr[2] = obj2;
                obj2 = sArr;
                z12 = z9;
            } else {
                z9 = false;
                i11 = 1;
                if (i10 > 32768) {
                    int[] iArr = new int[i10];
                    Arrays.fill(iArr, -1);
                    int i23 = 0;
                    int i24 = 0;
                    while (i23 < i13) {
                        int i25 = i24 + i24;
                        int i26 = i23 + i23;
                        Object obj8 = objArr2[i26];
                        Objects.requireNonNull(obj8);
                        Object obj9 = objArr2[i26 ^ 1];
                        Objects.requireNonNull(obj9);
                        int a11 = gd.a(obj8.hashCode());
                        while (true) {
                            int i27 = a11 & i15;
                            int i28 = iArr[i27];
                            if (i28 == -1) {
                                iArr[i27] = i25;
                                if (i24 < i23) {
                                    objArr2[i25] = obj8;
                                    objArr2[i25 ^ 1] = obj9;
                                }
                                i24++;
                                c11 = c12;
                            } else {
                                c11 = c12;
                                if (obj8.equals(objArr2[i28])) {
                                    int i29 = i28 ^ 1;
                                    Object obj10 = objArr2[i29];
                                    Objects.requireNonNull(obj10);
                                    e eVar3 = new e(obj8, obj9, obj10);
                                    objArr2[i29] = obj9;
                                    obj2 = eVar3;
                                    break;
                                }
                                a11 = i27 + 1;
                                c12 = c11;
                            }
                        }
                        i23++;
                        c12 = c11;
                    }
                    c10 = c12;
                    if (i24 == i13) {
                        obj = iArr;
                        r16 = z9;
                    } else {
                        Object[] objArr4 = new Object[3];
                        objArr4[0] = iArr;
                        objArr4[1] = Integer.valueOf(i24);
                        objArr4[c10] = obj2;
                        obj = objArr4;
                        r16 = z9;
                    }
                    z11 = obj instanceof Object[];
                    Object obj62 = obj;
                    if (z11) {
                    }
                    return new l(obj62, objArr2, i13);
                }
                sArr = new short[i10];
                Arrays.fill(sArr, (short) -1);
                int i30 = 0;
                for (int i31 = 0; i31 < i13; i31++) {
                    int i32 = i30 + i30;
                    int i33 = i31 + i31;
                    Object obj11 = objArr2[i33];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArr2[i33 ^ 1];
                    Objects.requireNonNull(obj12);
                    int a12 = gd.a(obj11.hashCode());
                    while (true) {
                        int i34 = a12 & i15;
                        char c13 = (char) sArr[i34];
                        if (c13 == 65535) {
                            sArr[i34] = (short) i32;
                            if (i30 < i31) {
                                objArr2[i32] = obj11;
                                objArr2[i32 ^ 1] = obj12;
                            }
                            i30++;
                        } else {
                            if (obj11.equals(objArr2[c13])) {
                                int i35 = c13 ^ 1;
                                Object obj13 = objArr2[i35];
                                Objects.requireNonNull(obj13);
                                e eVar4 = new e(obj11, obj12, obj13);
                                objArr2[i35] = obj12;
                                obj2 = eVar4;
                                break;
                            }
                            a12 = i34 + 1;
                        }
                    }
                }
                if (i30 != i13) {
                    obj2 = new Object[]{sArr, Integer.valueOf(i30), obj2};
                    z12 = z9;
                }
                obj2 = sArr;
                z12 = z9;
            }
        }
        c10 = 2;
        obj = obj2;
        r16 = z12;
        z11 = obj instanceof Object[];
        Object obj622 = obj;
        if (z11) {
        }
        return new l(obj622, objArr2, i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // a8.v, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            int i7 = this.h;
            Object[] objArr = this.f;
            if (i7 == 1) {
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
                        int a10 = gd.a(obj.hashCode());
                        while (true) {
                            int i10 = a10 & length;
                            int i11 = bArr[i10] & 255;
                            if (i11 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i11])) {
                                obj2 = objArr[i11 ^ 1];
                                break;
                            }
                            a10 = i10 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int a11 = gd.a(obj.hashCode());
                        while (true) {
                            int i12 = a11 & length2;
                            char c10 = (char) sArr[i12];
                            if (c10 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c10])) {
                                obj2 = objArr[c10 ^ 1];
                                break;
                            }
                            a11 = i12 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int a12 = gd.a(obj.hashCode());
                        while (true) {
                            int i13 = a12 & length3;
                            int i14 = iArr[i13];
                            if (i14 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i14])) {
                                obj2 = objArr[i14 ^ 1];
                                break;
                            }
                            a12 = i13 + 1;
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
