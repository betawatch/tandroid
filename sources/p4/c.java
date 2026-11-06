package p4;

import a8.ia;
import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.Components.uy;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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

    public static v4.l e(int i7, ArrayList arrayList, boolean z9) {
        int size = arrayList.size() - 1;
        while (size >= 0) {
            v4.l lVar = (v4.l) arrayList.get(size);
            if (lVar.a == i7 && lVar.c == z9) {
                arrayList.remove(size);
                while (size < arrayList.size()) {
                    ((v4.l) arrayList.get(size)).b += z9 ? 1 : -1;
                    size++;
                }
                return lVar;
            }
            size--;
        }
        return null;
    }

    public d a() {
        int i7 = 1;
        ia.o("Exactly one of sessionCommand and playerCommand should be set", (((i1) this.d) == null) != (this.a == -1));
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
        return new d((i1) this.d, this.a, this.b, (Bundle) this.e, this.c, (l9.a) this.f, this.g);
    }

    public void b(v4.d0 d0Var) {
        v4.o oVar;
        int i7;
        int[] iArr = (int[]) this.e;
        ArrayList arrayList = (ArrayList) this.d;
        v4.o oVar2 = (v4.o) this.g;
        v4.b bVar = d0Var instanceof v4.b ? (v4.b) d0Var : new v4.b(d0Var);
        ArrayList arrayList2 = new ArrayList();
        int i10 = this.a;
        int size = arrayList.size() - 1;
        int i11 = this.b;
        while (size >= 0) {
            v4.n nVar = (v4.n) arrayList.get(size);
            int i12 = nVar.c;
            int i13 = nVar.a + i12;
            int i14 = nVar.b + i12;
            boolean z9 = this.c;
            int[] iArr2 = iArr;
            if (i13 < i10) {
                int i15 = i10 - i13;
                if (z9) {
                    int i16 = i15 - 1;
                    while (i16 >= 0) {
                        int i17 = i13 + i16;
                        int i18 = iArr2[i17];
                        ArrayList arrayList3 = arrayList;
                        int i19 = i18 & 31;
                        if (i19 != 0) {
                            oVar = oVar2;
                            if (i19 == 4 || i19 == 8) {
                                int i20 = i18 >> 5;
                                i7 = i16;
                                v4.l e10 = e(i20, arrayList2, false);
                                bVar.E(i17, e10.b - 1);
                                if (i19 == 4) {
                                    int i21 = e10.b - 1;
                                    oVar.getClass();
                                    bVar.k1(i21, 1);
                                }
                            } else {
                                if (i19 != 16) {
                                    StringBuilder n10 = jg.g.n(i17, "unknown flag for pos ", " ");
                                    n10.append(Long.toBinaryString(i19));
                                    throw new IllegalStateException(n10.toString());
                                }
                                arrayList2.add(new v4.l(i17, i17, true));
                                i7 = i16;
                            }
                        } else {
                            oVar = oVar2;
                            i7 = i16;
                            boolean z10 = true;
                            bVar.M0(i17, 1);
                            int size2 = arrayList2.size();
                            int i22 = 0;
                            while (i22 < size2) {
                                Object obj = arrayList2.get(i22);
                                i22++;
                                v4.l lVar = (v4.l) obj;
                                lVar.b--;
                                z10 = true;
                            }
                        }
                        i16 = i7 - 1;
                        arrayList = arrayList3;
                        oVar2 = oVar;
                    }
                } else {
                    bVar.M0(i13, i15);
                }
            }
            ArrayList arrayList4 = arrayList;
            v4.o oVar3 = oVar2;
            if (i14 < i11) {
                int i23 = i11 - i14;
                if (z9) {
                    for (int i24 = i23 - 1; i24 >= 0; i24--) {
                        int i25 = i14 + i24;
                        int i26 = ((int[]) this.f)[i25];
                        int i27 = i26 & 31;
                        if (i27 != 0) {
                            if (i27 != 4 && i27 != 8) {
                                if (i27 != 16) {
                                    StringBuilder n11 = jg.g.n(i25, "unknown flag for pos ", " ");
                                    n11.append(Long.toBinaryString(i27));
                                    throw new IllegalStateException(n11.toString());
                                }
                                arrayList2.add(new v4.l(i25, i13, false));
                            }
                            bVar.E(e(i26 >> 5, arrayList2, true).b, i13);
                            if (i27 == 4) {
                                oVar3.getClass();
                                bVar.k1(i13, 1);
                            }
                        } else {
                            boolean z11 = true;
                            bVar.o0(i13, 1);
                            int size3 = arrayList2.size();
                            int i28 = 0;
                            while (i28 < size3) {
                                Object obj2 = arrayList2.get(i28);
                                i28++;
                                ((v4.l) obj2).b++;
                                z11 = true;
                            }
                        }
                    }
                } else {
                    bVar.o0(i13, i23);
                }
            }
            for (int i29 = i12 - 1; i29 >= 0; i29--) {
                int i30 = nVar.a + i29;
                if ((iArr2[i30] & 31) == 2) {
                    oVar3.getClass();
                    bVar.k1(i30, 1);
                }
            }
            i10 = nVar.a;
            i11 = nVar.b;
            size--;
            iArr = iArr2;
            arrayList = arrayList4;
            oVar2 = oVar3;
        }
        bVar.a();
    }

    public void c(v4.g0 g0Var) {
        b(new uy(g0Var, 24));
    }

    public void d(int i7, int i10, int i11, boolean z9) {
        int i12;
        int i13;
        int i14;
        int[] iArr = (int[]) this.e;
        int[] iArr2 = (int[]) this.f;
        v4.o oVar = (v4.o) this.g;
        if (z9) {
            i10--;
            i13 = i7;
            i12 = i10;
        } else {
            i12 = i7 - 1;
            i13 = i12;
        }
        while (i11 >= 0) {
            v4.n nVar = (v4.n) ((ArrayList) this.d).get(i11);
            int i15 = nVar.a;
            int i16 = nVar.c;
            int i17 = i15 + i16;
            int i18 = nVar.b + i16;
            if (z9) {
                for (int i19 = i13 - 1; i19 >= i17; i19--) {
                    if (oVar.b(i19, i12)) {
                        i14 = oVar.a(i19, i12) ? 8 : 4;
                        iArr2[i12] = (i19 << 5) | 16;
                        iArr[i19] = (i12 << 5) | i14;
                        return;
                    }
                }
            } else {
                for (int i20 = i10 - 1; i20 >= i18; i20--) {
                    if (oVar.b(i12, i20)) {
                        i14 = oVar.a(i12, i20) ? 8 : 4;
                        int i21 = i7 - 1;
                        iArr[i21] = (i20 << 5) | 16;
                        iArr2[i20] = (i21 << 5) | i14;
                        return;
                    }
                }
            }
            i13 = nVar.a;
            i10 = nVar.b;
            i11--;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(v4.o oVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z9) {
        this.d = arrayList;
        this.e = iArr;
        this.f = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.g = oVar;
        int e10 = oVar.e();
        this.a = e10;
        int d = oVar.d();
        this.b = d;
        this.c = z9;
        v4.n nVar = arrayList.isEmpty() ? null : (v4.n) arrayList.get(0);
        if (nVar == null || nVar.a != 0 || nVar.b != 0) {
            v4.n nVar2 = new v4.n();
            nVar2.a = 0;
            nVar2.b = 0;
            nVar2.d = false;
            nVar2.c = 0;
            nVar2.e = false;
            arrayList.add(0, nVar2);
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            v4.n nVar3 = (v4.n) arrayList.get(size);
            int i7 = nVar3.a;
            int i10 = nVar3.c;
            int i11 = i7 + i10;
            int i12 = nVar3.b + i10;
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
            for (int i13 = 0; i13 < nVar3.c; i13++) {
                int i14 = nVar3.a + i13;
                int i15 = nVar3.b + i13;
                int i16 = ((v4.o) this.g).a(i14, i15) ? 1 : 2;
                iArr[i14] = (i15 << 5) | i16;
                iArr2[i15] = (i14 << 5) | i16;
            }
            e10 = nVar3.a;
            d = nVar3.b;
        }
    }
}
