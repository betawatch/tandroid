// default package

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tn2 {
    public int a;
    public final int b;
    public final boolean c;
    public Object d;
    public final Cloneable e;
    public Serializable f;
    public Object g;

    /* JADX WARN: Multi-variable type inference failed */
    public tn2(age ageVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z) {
        int i;
        int i2;
        this.d = arrayList;
        this.e = iArr;
        this.f = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.g = ageVar;
        int d = ageVar.d();
        this.a = d;
        int c = ageVar.c();
        this.b = c;
        this.c = z;
        ep3 ep3Var = arrayList.isEmpty() ? null : (ep3) arrayList.get(0);
        if (ep3Var == null || ep3Var.a != 0 || ep3Var.b != 0) {
            ep3 ep3Var2 = new ep3();
            ep3Var2.a = 0;
            ep3Var2.b = 0;
            ep3Var2.d = false;
            ep3Var2.c = 0;
            ep3Var2.e = false;
            arrayList.add(0, ep3Var2);
        }
        int size = arrayList.size() - 1;
        while (size >= 0) {
            ep3 ep3Var3 = (ep3) arrayList.get(size);
            int i3 = ep3Var3.a;
            int i4 = ep3Var3.c;
            int i5 = i3 + i4;
            int i6 = ep3Var3.b + i4;
            if (this.c) {
                while (d > i5) {
                    if (iArr[d - 1] == 0) {
                        d(d, c, size, false);
                    }
                    d--;
                }
                while (c > i6) {
                    if (iArr2[c - 1] == 0) {
                        d(d, c, size, true);
                    }
                    c--;
                }
            }
            int i7 = 0;
            while (true) {
                int i8 = ep3Var3.c;
                i = ep3Var3.a;
                i2 = ep3Var3.b;
                if (i7 < i8) {
                    int i9 = i + i7;
                    int i10 = i2 + i7;
                    int i11 = ((age) this.g).a(i9, i10) ? 1 : 2;
                    iArr[i9] = (i10 << 5) | i11;
                    iArr2[i10] = (i9 << 5) | i11;
                    i7++;
                }
            }
            size--;
            d = i;
            c = i2;
        }
    }

    public static cp3 e(int i, ArrayList arrayList, boolean z) {
        int size = arrayList.size() - 1;
        while (size >= 0) {
            cp3 cp3Var = (cp3) arrayList.get(size);
            if (cp3Var.a == i && cp3Var.c == z) {
                arrayList.remove(size);
                while (size < arrayList.size()) {
                    ((cp3) arrayList.get(size)).b += z ? 1 : -1;
                    size++;
                }
                return cp3Var;
            }
            size--;
        }
        return null;
    }

    public final un2 a() {
        int i;
        jte.o("Exactly one of sessionCommand and playerCommand should be set", (((r7a) this.d) == null) != (this.a == -1));
        if (((io5) this.f) == null) {
            int i2 = this.a;
            if (i2 != 1) {
                if (i2 != 11 && i2 != 7) {
                    i = 6;
                    if (i2 != 6) {
                        if (i2 == 12 || i2 == 9 || i2 == 8) {
                            i = 3;
                        }
                    }
                }
                i = 2;
            } else {
                i = 1;
            }
            this.f = new io5(new int[]{i}, 1);
        }
        return new un2((r7a) this.d, this.a, this.b, (Bundle) this.e, this.c, (io5) this.f, this.g);
    }

    public final void b(r76 r76Var) {
        int i;
        int[] iArr = (int[]) this.e;
        ArrayList arrayList = (ArrayList) this.d;
        age ageVar = (age) this.g;
        bi0 bi0Var = r76Var instanceof bi0 ? (bi0) r76Var : new bi0(r76Var);
        ArrayList arrayList2 = new ArrayList();
        int i2 = this.a;
        int size = arrayList.size() - 1;
        int i3 = this.b;
        while (size >= 0) {
            ep3 ep3Var = (ep3) arrayList.get(size);
            int i4 = ep3Var.c;
            int i5 = ep3Var.a + i4;
            int i6 = ep3Var.b + i4;
            boolean z = this.c;
            int[] iArr2 = iArr;
            if (i5 < i2) {
                int i7 = i2 - i5;
                if (z) {
                    int i8 = i7 - 1;
                    while (i8 >= 0) {
                        int i9 = i5 + i8;
                        int i10 = iArr2[i9];
                        ArrayList arrayList3 = arrayList;
                        int i11 = i10 & 31;
                        age ageVar2 = ageVar;
                        if (i11 == 0) {
                            i = i8;
                            boolean z2 = true;
                            bi0Var.C0(i9, 1);
                            int size2 = arrayList2.size();
                            int i12 = 0;
                            while (i12 < size2) {
                                Object obj = arrayList2.get(i12);
                                i12++;
                                cp3 cp3Var = (cp3) obj;
                                cp3Var.b--;
                                z2 = true;
                            }
                        } else if (i11 == 4 || i11 == 8) {
                            int i13 = i10 >> 5;
                            i = i8;
                            cp3 e = e(i13, arrayList2, false);
                            bi0Var.l(i9, e.b - 1);
                            if (i11 == 4) {
                                int i14 = e.b - 1;
                                ageVar2.getClass();
                                bi0Var.O0(i14, 1);
                            }
                        } else if (i11 != 16) {
                            rjb.l(hg9.l(i9, "unknown flag for pos ", " "), Long.toBinaryString(i11));
                            return;
                        } else {
                            arrayList2.add(new cp3(i9, i9, true));
                            i = i8;
                        }
                        i8 = i - 1;
                        arrayList = arrayList3;
                        ageVar = ageVar2;
                    }
                } else {
                    bi0Var.C0(i5, i7);
                }
            }
            ArrayList arrayList4 = arrayList;
            age ageVar3 = ageVar;
            if (i6 < i3) {
                int i15 = i3 - i6;
                if (z) {
                    for (int i16 = i15 - 1; i16 >= 0; i16--) {
                        int i17 = i6 + i16;
                        int i18 = ((int[]) this.f)[i17];
                        int i19 = i18 & 31;
                        if (i19 == 0) {
                            boolean z3 = true;
                            bi0Var.C(i5, 1);
                            int size3 = arrayList2.size();
                            int i20 = 0;
                            while (i20 < size3) {
                                Object obj2 = arrayList2.get(i20);
                                i20++;
                                ((cp3) obj2).b++;
                                z3 = true;
                            }
                        } else if (i19 == 4 || i19 == 8) {
                            bi0Var.l(e(i18 >> 5, arrayList2, true).b, i5);
                            if (i19 == 4) {
                                ageVar3.getClass();
                                bi0Var.O0(i5, 1);
                            }
                        } else {
                            if (i19 != 16) {
                                rjb.l(hg9.l(i17, "unknown flag for pos ", " "), Long.toBinaryString(i19));
                                return;
                            }
                            arrayList2.add(new cp3(i17, i5, false));
                        }
                    }
                } else {
                    bi0Var.C(i5, i15);
                }
            }
            while (true) {
                i4--;
                i2 = ep3Var.a;
                if (i4 >= 0) {
                    int i21 = i2 + i4;
                    if ((iArr2[i21] & 31) == 2) {
                        ageVar3.getClass();
                        bi0Var.O0(i21, 1);
                    }
                }
            }
            i3 = ep3Var.b;
            size--;
            iArr = iArr2;
            arrayList = arrayList4;
            ageVar = ageVar3;
        }
        bi0Var.a();
    }

    public final void c(y59 y59Var) {
        b(new k6d((Object) y59Var, (byte) 4));
    }

    public final void d(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        int i6;
        int[] iArr = (int[]) this.e;
        int[] iArr2 = (int[]) this.f;
        age ageVar = (age) this.g;
        if (z) {
            i2--;
            i5 = i;
            i4 = i2;
        } else {
            i4 = i - 1;
            i5 = i4;
        }
        while (i3 >= 0) {
            ep3 ep3Var = (ep3) ((ArrayList) this.d).get(i3);
            int i7 = ep3Var.a;
            int i8 = ep3Var.c;
            int i9 = i7 + i8;
            int i10 = ep3Var.b + i8;
            if (z) {
                for (int i11 = i5 - 1; i11 >= i9; i11--) {
                    if (ageVar.b(i11, i4)) {
                        i6 = ageVar.a(i11, i4) ? 8 : 4;
                        iArr2[i4] = (i11 << 5) | 16;
                        iArr[i11] = (i4 << 5) | i6;
                        return;
                    }
                }
            } else {
                for (int i12 = i2 - 1; i12 >= i10; i12--) {
                    if (ageVar.b(i4, i12)) {
                        i6 = ageVar.a(i4, i12) ? 8 : 4;
                        int i13 = i - 1;
                        iArr[i13] = (i12 << 5) | 16;
                        iArr2[i12] = (i13 << 5) | i6;
                        return;
                    }
                }
            }
            i5 = ep3Var.a;
            i2 = ep3Var.b;
            i3--;
        }
    }

    public tn2() {
        this.b = 0;
        this.e = Bundle.EMPTY;
        this.a = -1;
        this.c = true;
    }
}
