package t7;

import com.google.android.gms.internal.cast.j0;
import j$.util.Objects;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;
import w7.o7;
import w7.q7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class l extends j0 {
    public static final l n = new l(null, new Object[0], 0);
    public final transient Object e;
    public final transient Object[] f;
    public final transient int h;

    public l(Object obj, Object[] objArr, int i10) {
        super(2);
        this.e = obj;
        this.f = objArr;
        this.h = i10;
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
    public static l b(int i10, Object[] objArr, a5.a aVar) {
        int i11;
        boolean z10;
        int i12;
        char c10;
        Object obj;
        char c11;
        short[] sArr;
        boolean z11;
        int i13;
        ?? r16;
        boolean z12;
        boolean z13;
        int i14 = i10;
        Object[] objArr2 = objArr;
        if (i14 == 0) {
            return n;
        }
        Object obj2 = null;
        boolean z14 = false;
        int i15 = 1;
        if (i14 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            return new l(null, objArr2, 1);
        }
        o7.b(i14, objArr2.length >> 1);
        char c12 = 2;
        int max = Math.max(i14, 2);
        if (max < 751619276) {
            i11 = Integer.highestOneBit(max - 1);
            do {
                i11 += i11;
            } while (i11 * 0.7d < max);
        } else {
            i11 = TLObject.FLAG_30;
            if (max >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i14 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            z13 = false;
            i14 = 1;
            i12 = 1;
        } else {
            int i16 = i11 - 1;
            if (i11 <= 128) {
                byte[] bArr = new byte[i11];
                Arrays.fill(bArr, (byte) -1);
                int i17 = 0;
                int i18 = 0;
                while (i17 < i14) {
                    int i19 = i18 + i18;
                    int i20 = i17 + i17;
                    Object obj3 = objArr2[i20];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArr2[i20 ^ i15];
                    Objects.requireNonNull(obj4);
                    int a2 = q7.a(obj3.hashCode());
                    while (true) {
                        int i21 = a2 & i16;
                        z11 = z14;
                        i13 = i15;
                        int i22 = bArr[i21] & 255;
                        if (i22 == 255) {
                            bArr[i21] = (byte) i19;
                            if (i18 < i17) {
                                objArr2[i19] = obj3;
                                objArr2[i19 ^ 1] = obj4;
                            }
                            i18++;
                        } else {
                            if (obj3.equals(objArr2[i22])) {
                                int i23 = i22 ^ 1;
                                Object obj5 = objArr2[i23];
                                Objects.requireNonNull(obj5);
                                e eVar = new e(obj3, obj4, obj5);
                                objArr2[i23] = obj4;
                                obj2 = eVar;
                                break;
                            }
                            a2 = i21 + 1;
                            z14 = z11;
                            i15 = i13;
                        }
                    }
                    i17++;
                    z14 = z11;
                    i15 = i13;
                }
                z10 = z14;
                i12 = i15;
                if (i18 == i14) {
                    c10 = 2;
                    obj = bArr;
                    r16 = z10;
                    z12 = obj instanceof Object[];
                    Object obj6 = obj;
                    if (z12) {
                        Object[] objArr3 = (Object[]) obj;
                        e eVar2 = (e) objArr3[c10];
                        if (aVar == null) {
                            throw eVar2.a();
                        }
                        aVar.d = eVar2;
                        Object obj7 = objArr3[r16];
                        int intValue = ((Integer) objArr3[i12]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                        obj6 = obj7;
                        i14 = intValue;
                    }
                    return new l(obj6, objArr2, i14);
                }
                sArr = new Object[3];
                sArr[z10 ? 1 : 0] = bArr;
                sArr[i12] = Integer.valueOf(i18);
                sArr[2] = obj2;
                obj2 = sArr;
                z13 = z10;
            } else {
                z10 = false;
                i12 = 1;
                if (i11 > 32768) {
                    int[] iArr = new int[i11];
                    Arrays.fill(iArr, -1);
                    int i24 = 0;
                    int i25 = 0;
                    while (i24 < i14) {
                        int i26 = i25 + i25;
                        int i27 = i24 + i24;
                        Object obj8 = objArr2[i27];
                        Objects.requireNonNull(obj8);
                        Object obj9 = objArr2[i27 ^ 1];
                        Objects.requireNonNull(obj9);
                        int a10 = q7.a(obj8.hashCode());
                        while (true) {
                            int i28 = a10 & i16;
                            int i29 = iArr[i28];
                            if (i29 == -1) {
                                iArr[i28] = i26;
                                if (i25 < i24) {
                                    objArr2[i26] = obj8;
                                    objArr2[i26 ^ 1] = obj9;
                                }
                                i25++;
                                c11 = c12;
                            } else {
                                c11 = c12;
                                if (obj8.equals(objArr2[i29])) {
                                    int i30 = i29 ^ 1;
                                    Object obj10 = objArr2[i30];
                                    Objects.requireNonNull(obj10);
                                    e eVar3 = new e(obj8, obj9, obj10);
                                    objArr2[i30] = obj9;
                                    obj2 = eVar3;
                                    break;
                                }
                                a10 = i28 + 1;
                                c12 = c11;
                            }
                        }
                        i24++;
                        c12 = c11;
                    }
                    c10 = c12;
                    if (i25 == i14) {
                        obj = iArr;
                        r16 = z10;
                    } else {
                        Object[] objArr4 = new Object[3];
                        objArr4[0] = iArr;
                        objArr4[1] = Integer.valueOf(i25);
                        objArr4[c10] = obj2;
                        obj = objArr4;
                        r16 = z10;
                    }
                    z12 = obj instanceof Object[];
                    Object obj62 = obj;
                    if (z12) {
                    }
                    return new l(obj62, objArr2, i14);
                }
                sArr = new short[i11];
                Arrays.fill(sArr, (short) -1);
                int i31 = 0;
                for (int i32 = 0; i32 < i14; i32++) {
                    int i33 = i31 + i31;
                    int i34 = i32 + i32;
                    Object obj11 = objArr2[i34];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArr2[i34 ^ 1];
                    Objects.requireNonNull(obj12);
                    int a11 = q7.a(obj11.hashCode());
                    while (true) {
                        int i35 = a11 & i16;
                        char c13 = (char) sArr[i35];
                        if (c13 == 65535) {
                            sArr[i35] = (short) i33;
                            if (i31 < i32) {
                                objArr2[i33] = obj11;
                                objArr2[i33 ^ 1] = obj12;
                            }
                            i31++;
                        } else {
                            if (obj11.equals(objArr2[c13])) {
                                int i36 = c13 ^ 1;
                                Object obj13 = objArr2[i36];
                                Objects.requireNonNull(obj13);
                                e eVar4 = new e(obj11, obj12, obj13);
                                objArr2[i36] = obj12;
                                obj2 = eVar4;
                                break;
                            }
                            a11 = i35 + 1;
                        }
                    }
                }
                if (i31 != i14) {
                    obj2 = new Object[]{sArr, Integer.valueOf(i31), obj2};
                    z13 = z10;
                }
                obj2 = sArr;
                z13 = z10;
            }
        }
        c10 = 2;
        obj = obj2;
        r16 = z13;
        z12 = obj instanceof Object[];
        Object obj622 = obj;
        if (z12) {
        }
        return new l(obj622, objArr2, i14);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.cast.j0, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            int i10 = this.h;
            Object[] objArr = this.f;
            if (i10 == 1) {
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
                        int a2 = q7.a(obj.hashCode());
                        while (true) {
                            int i11 = a2 & length;
                            int i12 = bArr[i11] & 255;
                            if (i12 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i12])) {
                                obj2 = objArr[i12 ^ 1];
                                break;
                            }
                            a2 = i11 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int a10 = q7.a(obj.hashCode());
                        while (true) {
                            int i13 = a10 & length2;
                            char c10 = (char) sArr[i13];
                            if (c10 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c10])) {
                                obj2 = objArr[c10 ^ 1];
                                break;
                            }
                            a10 = i13 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int a11 = q7.a(obj.hashCode());
                        while (true) {
                            int i14 = a11 & length3;
                            int i15 = iArr[i14];
                            if (i15 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i15])) {
                                obj2 = objArr[i15 ^ 1];
                                break;
                            }
                            a11 = i14 + 1;
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
