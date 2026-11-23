package p4;

import a8.ma;
import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class c {
    public int a;
    public final int b;
    public final boolean c;
    public Object d;
    public final Cloneable e;
    public Serializable f;
    public Object g;

    public c() {
        this.b = 0;
        this.e = Bundle.EMPTY;
        this.a = -1;
        this.c = true;
    }

    public static v4.m e(int i7, ArrayList arrayList, boolean z10) {
        int size = arrayList.size() - 1;
        while (size >= 0) {
            v4.m mVar = (v4.m) arrayList.get(size);
            if (mVar.a == i7 && mVar.c == z10) {
                arrayList.remove(size);
                while (size < arrayList.size()) {
                    ((v4.m) arrayList.get(size)).b += z10 ? 1 : -1;
                    size++;
                }
                return mVar;
            }
            size--;
        }
        return null;
    }

    public d a() {
        int i7 = 1;
        ma.o("Exactly one of sessionCommand and playerCommand should be set", (((j1) this.d) == null) != (this.a == -1));
        if (((l9.a) this.f) == null) {
            int i10 = this.a;
            if (i10 != 1) {
                if (i10 != 11 && i10 != 7) {
                    i7 = 6;
                    if (i10 != 6) {
                        if (i10 == 12 || i10 == 9 || i10 == 8) {
                            i7 = 3;
                        }
                    }
                }
                i7 = 2;
            }
            this.f = new l9.a(new int[]{i7});
        }
        return new d((j1) this.d, this.a, this.b, (Bundle) this.e, this.c, (l9.a) this.f, this.g);
    }

    public void b(v4.e0 e0Var) {
        v4.p pVar;
        int i7;
        int[] iArr = (int[]) this.e;
        ArrayList arrayList = (ArrayList) this.d;
        v4.p pVar2 = (v4.p) this.g;
        v4.c cVar = e0Var instanceof v4.c ? (v4.c) e0Var : new v4.c(e0Var);
        ArrayList arrayList2 = new ArrayList();
        int i10 = this.a;
        int size = arrayList.size() - 1;
        int i11 = this.b;
        while (size >= 0) {
            v4.o oVar = (v4.o) arrayList.get(size);
            int i12 = oVar.c;
            int i13 = oVar.a + i12;
            int i14 = oVar.b + i12;
            boolean z10 = this.c;
            int[] iArr2 = iArr;
            if (i13 < i10) {
                int i15 = i10 - i13;
                if (z10) {
                    int i16 = i15 - 1;
                    while (i16 >= 0) {
                        int i17 = i13 + i16;
                        int i18 = iArr2[i17];
                        ArrayList arrayList3 = arrayList;
                        int i19 = i18 & 31;
                        if (i19 != 0) {
                            pVar = pVar2;
                            if (i19 == 4 || i19 == 8) {
                                int i20 = i18 >> 5;
                                i7 = i16;
                                v4.m e10 = e(i20, arrayList2, false);
                                cVar.z(i17, e10.b - 1);
                                if (i19 == 4) {
                                    int i21 = e10.b - 1;
                                    pVar.getClass();
                                    cVar.V0(i21, 1);
                                }
                            } else {
                                if (i19 != 16) {
                                    StringBuilder m10 = i5.c.m(i17, "unknown flag for pos ", " ");
                                    m10.append(Long.toBinaryString(i19));
                                    throw new IllegalStateException(m10.toString());
                                }
                                arrayList2.add(new v4.m(i17, i17, true));
                                i7 = i16;
                            }
                        } else {
                            pVar = pVar2;
                            i7 = i16;
                            boolean z11 = true;
                            cVar.y0(i17, 1);
                            int size2 = arrayList2.size();
                            int i22 = 0;
                            while (i22 < size2) {
                                Object obj = arrayList2.get(i22);
                                i22++;
                                v4.m mVar = (v4.m) obj;
                                mVar.b--;
                                z11 = true;
                            }
                        }
                        i16 = i7 - 1;
                        arrayList = arrayList3;
                        pVar2 = pVar;
                    }
                } else {
                    cVar.y0(i13, i15);
                }
            }
            ArrayList arrayList4 = arrayList;
            v4.p pVar3 = pVar2;
            if (i14 < i11) {
                int i23 = i11 - i14;
                if (z10) {
                    for (int i24 = i23 - 1; i24 >= 0; i24--) {
                        int i25 = i14 + i24;
                        int i26 = ((int[]) this.f)[i25];
                        int i27 = i26 & 31;
                        if (i27 != 0) {
                            if (i27 != 4 && i27 != 8) {
                                if (i27 != 16) {
                                    StringBuilder m11 = i5.c.m(i25, "unknown flag for pos ", " ");
                                    m11.append(Long.toBinaryString(i27));
                                    throw new IllegalStateException(m11.toString());
                                }
                                arrayList2.add(new v4.m(i25, i13, false));
                            }
                            cVar.z(e(i26 >> 5, arrayList2, true).b, i13);
                            if (i27 == 4) {
                                pVar3.getClass();
                                cVar.V0(i13, 1);
                            }
                        } else {
                            boolean z12 = true;
                            cVar.V(i13, 1);
                            int size3 = arrayList2.size();
                            int i28 = 0;
                            while (i28 < size3) {
                                Object obj2 = arrayList2.get(i28);
                                i28++;
                                ((v4.m) obj2).b++;
                                z12 = true;
                            }
                        }
                    }
                } else {
                    cVar.V(i13, i23);
                }
            }
            for (int i29 = i12 - 1; i29 >= 0; i29--) {
                int i30 = oVar.a + i29;
                if ((iArr2[i30] & 31) == 2) {
                    pVar3.getClass();
                    cVar.V0(i30, 1);
                }
            }
            i10 = oVar.a;
            i11 = oVar.b;
            size--;
            iArr = iArr2;
            arrayList = arrayList4;
            pVar2 = pVar3;
        }
        cVar.a();
    }

    public void c(v4.i0 i0Var) {
        b(new v4.b(i0Var, 0));
    }

    public void d(int i7, int i10, int i11, boolean z10) {
        int i12;
        int i13;
        int i14;
        int[] iArr = (int[]) this.e;
        int[] iArr2 = (int[]) this.f;
        v4.p pVar = (v4.p) this.g;
        if (z10) {
            i10--;
            i13 = i7;
            i12 = i10;
        } else {
            i12 = i7 - 1;
            i13 = i12;
        }
        while (i11 >= 0) {
            v4.o oVar = (v4.o) ((ArrayList) this.d).get(i11);
            int i15 = oVar.a;
            int i16 = oVar.c;
            int i17 = i15 + i16;
            int i18 = oVar.b + i16;
            if (z10) {
                for (int i19 = i13 - 1; i19 >= i17; i19--) {
                    if (pVar.b(i19, i12)) {
                        i14 = pVar.a(i19, i12) ? 8 : 4;
                        iArr2[i12] = (i19 << 5) | 16;
                        iArr[i19] = (i12 << 5) | i14;
                        return;
                    }
                }
            } else {
                for (int i20 = i10 - 1; i20 >= i18; i20--) {
                    if (pVar.b(i12, i20)) {
                        i14 = pVar.a(i12, i20) ? 8 : 4;
                        int i21 = i7 - 1;
                        iArr[i21] = (i20 << 5) | 16;
                        iArr2[i20] = (i21 << 5) | i14;
                        return;
                    }
                }
            }
            i13 = oVar.a;
            i10 = oVar.b;
            i11--;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(v4.p pVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z10) {
        this.d = arrayList;
        this.e = iArr;
        this.f = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.g = pVar;
        int e10 = pVar.e();
        this.a = e10;
        int d = pVar.d();
        this.b = d;
        this.c = z10;
        v4.o oVar = arrayList.isEmpty() ? null : (v4.o) arrayList.get(0);
        if (oVar == null || oVar.a != 0 || oVar.b != 0) {
            v4.o oVar2 = new v4.o();
            oVar2.a = 0;
            oVar2.b = 0;
            oVar2.d = false;
            oVar2.c = 0;
            oVar2.e = false;
            arrayList.add(0, oVar2);
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            v4.o oVar3 = (v4.o) arrayList.get(size);
            int i7 = oVar3.a;
            int i10 = oVar3.c;
            int i11 = i7 + i10;
            int i12 = oVar3.b + i10;
            if (this.c) {
                while (e10 > i11) {
                    if (iArr[e10 - 1] == 0) {
                        d(e10, d, size, false);
                    }
                    e10--;
                }
                while (d > i12) {
                    if (iArr2[d - 1] == 0) {
                        d(e10, d, size, true);
                    }
                    d--;
                }
            }
            for (int i13 = 0; i13 < oVar3.c; i13++) {
                int i14 = oVar3.a + i13;
                int i15 = oVar3.b + i13;
                int i16 = ((v4.p) this.g).a(i14, i15) ? 1 : 2;
                iArr[i14] = (i15 << 5) | i16;
                iArr2[i15] = (i14 << 5) | i16;
            }
            e10 = oVar3.a;
            d = oVar3.b;
        }
    }
}
