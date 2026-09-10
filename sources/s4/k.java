package s4;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class k {
    public final ArrayList a;
    public final int[] b;
    public final int[] c;
    public final o d;
    public final int e;
    public final int f;
    public final boolean g;

    public k(o oVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z10) {
        this.a = arrayList;
        this.b = iArr;
        this.c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = oVar;
        int e = oVar.e();
        this.e = e;
        int d = oVar.d();
        this.f = d;
        this.g = z10;
        n nVar = arrayList.isEmpty() ? null : (n) arrayList.get(0);
        if (nVar == null || nVar.a != 0 || nVar.b != 0) {
            n nVar2 = new n();
            nVar2.a = 0;
            nVar2.b = 0;
            nVar2.d = false;
            nVar2.c = 0;
            nVar2.e = false;
            arrayList.add(0, nVar2);
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            n nVar3 = (n) arrayList.get(size);
            int i10 = nVar3.a;
            int i11 = nVar3.c;
            int i12 = i10 + i11;
            int i13 = nVar3.b + i11;
            if (this.g) {
                while (e > i12) {
                    if (iArr[e - 1] == 0) {
                        c(e, d, size, false);
                    }
                    e--;
                }
                while (d > i13) {
                    if (iArr2[d - 1] == 0) {
                        c(e, d, size, true);
                    }
                    d--;
                }
            }
            for (int i14 = 0; i14 < nVar3.c; i14++) {
                int i15 = nVar3.a + i14;
                int i16 = nVar3.b + i14;
                int i17 = this.d.a(i15, i16) ? 1 : 2;
                iArr[i15] = (i16 << 5) | i17;
                iArr2[i16] = (i15 << 5) | i17;
            }
            e = nVar3.a;
            d = nVar3.b;
        }
    }

    public static l d(int i10, ArrayList arrayList, boolean z10) {
        int size = arrayList.size() - 1;
        while (size >= 0) {
            l lVar = (l) arrayList.get(size);
            if (lVar.a == i10 && lVar.c == z10) {
                arrayList.remove(size);
                while (size < arrayList.size()) {
                    ((l) arrayList.get(size)).b += z10 ? 1 : -1;
                    size++;
                }
                return lVar;
            }
            size--;
        }
        return null;
    }

    public final void a(e0 e0Var) {
        int[] iArr;
        int i10;
        b bVar = e0Var instanceof b ? (b) e0Var : new b(e0Var);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size() - 1;
        int i11 = this.e;
        int i12 = this.f;
        while (size >= 0) {
            n nVar = (n) arrayList2.get(size);
            int i13 = nVar.c;
            int i14 = nVar.a + i13;
            int i15 = nVar.b + i13;
            int[] iArr2 = this.b;
            boolean z10 = this.g;
            o oVar = this.d;
            ArrayList arrayList3 = arrayList2;
            if (i14 < i11) {
                int i16 = i11 - i14;
                if (z10) {
                    int i17 = i16 - 1;
                    while (i17 >= 0) {
                        int i18 = i14 + i17;
                        int i19 = iArr2[i18];
                        int i20 = size;
                        int i21 = i19 & 31;
                        if (i21 != 0) {
                            iArr = iArr2;
                            if (i21 == 4 || i21 == 8) {
                                int i22 = i19 >> 5;
                                i10 = i17;
                                l d = d(i22, arrayList, false);
                                bVar.C(i18, d.b - 1);
                                if (i21 == 4) {
                                    int i23 = d.b - 1;
                                    oVar.getClass();
                                    bVar.k1(i23, 1);
                                }
                            } else {
                                if (i21 != 16) {
                                    StringBuilder m10 = hc.b.m(i18, "unknown flag for pos ", " ");
                                    m10.append(Long.toBinaryString(i21));
                                    throw new IllegalStateException(m10.toString());
                                }
                                arrayList.add(new l(i18, i18, true));
                                i10 = i17;
                            }
                        } else {
                            iArr = iArr2;
                            i10 = i17;
                            bVar.O0(i18, 1);
                            int size2 = arrayList.size();
                            int i24 = 0;
                            while (i24 < size2) {
                                Object obj = arrayList.get(i24);
                                i24++;
                                l lVar = (l) obj;
                                lVar.b--;
                            }
                        }
                        i17 = i10 - 1;
                        size = i20;
                        iArr2 = iArr;
                    }
                } else {
                    bVar.O0(i14, i16);
                }
            }
            int i25 = size;
            int[] iArr3 = iArr2;
            if (i15 < i12) {
                int i26 = i12 - i15;
                if (z10) {
                    for (int i27 = i26 - 1; i27 >= 0; i27--) {
                        int i28 = i15 + i27;
                        int i29 = this.c[i28];
                        int i30 = i29 & 31;
                        if (i30 != 0) {
                            if (i30 != 4 && i30 != 8) {
                                if (i30 != 16) {
                                    StringBuilder m11 = hc.b.m(i28, "unknown flag for pos ", " ");
                                    m11.append(Long.toBinaryString(i30));
                                    throw new IllegalStateException(m11.toString());
                                }
                                arrayList.add(new l(i28, i14, false));
                            }
                            bVar.C(d(i29 >> 5, arrayList, true).b, i14);
                            if (i30 == 4) {
                                oVar.getClass();
                                bVar.k1(i14, 1);
                            }
                        } else {
                            bVar.j0(i14, 1);
                            int size3 = arrayList.size();
                            int i31 = 0;
                            while (i31 < size3) {
                                Object obj2 = arrayList.get(i31);
                                i31++;
                                ((l) obj2).b++;
                            }
                        }
                    }
                } else {
                    bVar.j0(i14, i26);
                }
            }
            for (int i32 = i13 - 1; i32 >= 0; i32--) {
                int i33 = nVar.a + i32;
                if ((iArr3[i33] & 31) == 2) {
                    oVar.getClass();
                    bVar.k1(i33, 1);
                }
            }
            i11 = nVar.a;
            i12 = nVar.b;
            size = i25 - 1;
            arrayList2 = arrayList3;
        }
        bVar.a();
    }

    public final void b(h0 h0Var) {
        a(new o0.b(h0Var));
    }

    public final void c(int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        int i15;
        if (z10) {
            i11--;
            i14 = i10;
            i13 = i11;
        } else {
            i13 = i10 - 1;
            i14 = i13;
        }
        while (i12 >= 0) {
            n nVar = (n) this.a.get(i12);
            int i16 = nVar.a;
            int i17 = nVar.c;
            int i18 = i16 + i17;
            int i19 = nVar.b + i17;
            int[] iArr = this.b;
            int[] iArr2 = this.c;
            o oVar = this.d;
            if (z10) {
                for (int i20 = i14 - 1; i20 >= i18; i20--) {
                    if (oVar.b(i20, i13)) {
                        i15 = oVar.a(i20, i13) ? 8 : 4;
                        iArr2[i13] = (i20 << 5) | 16;
                        iArr[i20] = (i13 << 5) | i15;
                        return;
                    }
                }
            } else {
                for (int i21 = i11 - 1; i21 >= i19; i21--) {
                    if (oVar.b(i13, i21)) {
                        i15 = oVar.a(i13, i21) ? 8 : 4;
                        int i22 = i10 - 1;
                        iArr[i22] = (i21 << 5) | 16;
                        iArr2[i21] = (i22 << 5) | i15;
                        return;
                    }
                }
            }
            i14 = nVar.a;
            i11 = nVar.b;
            i12--;
        }
    }
}
