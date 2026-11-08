package v4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class o {
    public static final c5.b a = new c5.b(8);

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0189, code lost:
    
        r0 = r25 + 2;
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0164, code lost:
    
        r25 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x013f, code lost:
    
        r10 = r22[(r18 + r5) - 1];
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x018e, code lost:
    
        r8 = r8 + 1;
        r0 = r19;
        r10 = r20;
        r5 = r21;
        r2 = r22;
        r11 = r24;
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0099, code lost:
    
        if (r5[r20 - 1] < r21[r20 + 1]) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0111, code lost:
    
        r22 = r2;
        r21 = r5;
        r20 = r10;
        r24 = r11;
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x011b, code lost:
    
        if (r0 > r8) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x011d, code lost:
    
        r5 = r0 + r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0121, code lost:
    
        if (r5 == (r8 + r14)) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0125, code lost:
    
        if (r5 == (r6 + r14)) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0127, code lost:
    
        r10 = r18 + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0131, code lost:
    
        if (r22[r10 - 1] >= r22[r10 + 1]) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0134, code lost:
    
        r10 = r22[(r18 + r5) + 1] - 1;
        r11 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0146, code lost:
    
        r16 = r10 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0148, code lost:
    
        if (r10 <= 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x014a, code lost:
    
        if (r16 <= 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x014c, code lost:
    
        r25 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x015a, code lost:
    
        if (r27.b((r20 + r10) - 1, (r12 + r16) - 1) == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x015c, code lost:
    
        r10 = r10 - 1;
        r16 = r16 - 1;
        r0 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0166, code lost:
    
        r0 = r18 + r5;
        r22[r0] = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x016a, code lost:
    
        if (r19 != 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016c, code lost:
    
        if (r5 < r6) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x016e, code lost:
    
        if (r5 > r8) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0170, code lost:
    
        r0 = r21[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0172, code lost:
    
        if (r0 < r10) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0174, code lost:
    
        r6 = new v4.n();
        r6.a = r10;
        r6.b = r10 - r5;
        r6.c = r0 - r10;
        r6.d = r11;
        r6.e = r17;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d0 A[LOOP:3: B:20:0x00be->B:24:0x00d0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d9 A[EDGE_INSN: B:25:0x00d9->B:26:0x00d9 BREAK  A[LOOP:3: B:20:0x00be->B:24:0x00d0], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static p4.c c(o oVar, boolean z9) {
        int i7;
        int[] iArr;
        int[] iArr2;
        n nVar;
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int e10 = oVar.e();
        int d = oVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m mVar = new m();
        int i16 = 0;
        mVar.a = 0;
        mVar.b = e10;
        mVar.c = 0;
        mVar.d = d;
        arrayList2.add(mVar);
        int abs = Math.abs(e10 - d) + e10 + d;
        int i17 = abs * 2;
        int[] iArr3 = new int[i17];
        int[] iArr4 = new int[i17];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            m mVar2 = (m) org.telegram.ui.Cells.f1.k(1, arrayList2);
            int i18 = mVar2.a;
            int i19 = mVar2.b;
            int i20 = mVar2.c;
            int i21 = i19 - i18;
            int i22 = mVar2.d - i20;
            if (i21 >= 1 && i22 >= 1) {
                int i23 = i21 - i22;
                int i24 = ((i21 + i22) + 1) / 2;
                boolean z11 = true;
                int i25 = (abs - i24) - 1;
                i7 = abs;
                int i26 = abs + i24 + 1;
                Arrays.fill(iArr3, i25, i26, i16);
                Arrays.fill(iArr4, i25 + i23, i26 + i23, i21);
                int i27 = i23 % 2 != 0 ? 1 : i16;
                int i28 = i16;
                while (i28 <= i24) {
                    int i29 = -i28;
                    int i30 = i27;
                    int i31 = i29;
                    while (true) {
                        if (i31 > i28) {
                            break;
                        }
                        if (i31 != i29) {
                            if (i31 != i28) {
                                int i32 = i7 + i31;
                                iArr = iArr4;
                                iArr2 = iArr3;
                            } else {
                                iArr = iArr4;
                                iArr2 = iArr3;
                            }
                            i10 = iArr2[(i7 + i31) - 1] + 1;
                            z10 = z11;
                            i11 = i18;
                            i12 = i10 - i31;
                            while (i10 < i21 && i12 < i22) {
                                i15 = i12;
                                i13 = i21;
                                if (oVar.b(i11 + i10, i20 + i15)) {
                                    break;
                                }
                                i10++;
                                i12 = i15 + 1;
                                i21 = i13;
                            }
                            i13 = i21;
                            int i33 = i7 + i31;
                            iArr2[i33] = i10;
                            if (i30 == 0 && i31 >= (i23 - i28) + 1 && i31 <= (i23 + i28) - 1 && i10 >= (i14 = iArr[i33])) {
                                nVar = new n();
                                nVar.a = i14;
                                nVar.b = i14 - i31;
                                nVar.c = i10 - i14;
                                nVar.d = z10;
                                nVar.e = false;
                                break;
                            }
                            i31 += 2;
                            i18 = i11;
                            iArr3 = iArr2;
                            iArr4 = iArr;
                            i21 = i13;
                        } else {
                            iArr = iArr4;
                            iArr2 = iArr3;
                        }
                        i10 = iArr2[i7 + i31 + 1];
                        z10 = false;
                        i11 = i18;
                        i12 = i10 - i31;
                        while (i10 < i21) {
                            i15 = i12;
                            i13 = i21;
                            if (oVar.b(i11 + i10, i20 + i15)) {
                            }
                        }
                        i13 = i21;
                        int i332 = i7 + i31;
                        iArr2[i332] = i10;
                        if (i30 == 0) {
                        }
                        i31 += 2;
                        i18 = i11;
                        iArr3 = iArr2;
                        iArr4 = iArr;
                        i21 = i13;
                    }
                }
                throw new IllegalStateException("DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation.");
            }
            i7 = abs;
            iArr = iArr4;
            iArr2 = iArr3;
            nVar = null;
            if (nVar != null) {
                if (nVar.c > 0) {
                    arrayList.add(nVar);
                }
                nVar.a += mVar2.a;
                nVar.b += mVar2.c;
                m mVar3 = arrayList3.isEmpty() ? new m() : (m) org.telegram.ui.Cells.f1.k(1, arrayList3);
                mVar3.a = mVar2.a;
                mVar3.c = mVar2.c;
                if (nVar.e) {
                    mVar3.b = nVar.a;
                    mVar3.d = nVar.b;
                } else if (nVar.d) {
                    mVar3.b = nVar.a - 1;
                    mVar3.d = nVar.b;
                } else {
                    mVar3.b = nVar.a;
                    mVar3.d = nVar.b - 1;
                }
                arrayList2.add(mVar3);
                if (!nVar.e) {
                    int i34 = nVar.a;
                    int i35 = nVar.c;
                    mVar2.a = i34 + i35;
                    mVar2.c = nVar.b + i35;
                } else if (nVar.d) {
                    int i36 = nVar.a;
                    int i37 = nVar.c;
                    mVar2.a = i36 + i37 + 1;
                    mVar2.c = nVar.b + i37;
                } else {
                    int i38 = nVar.a;
                    int i39 = nVar.c;
                    mVar2.a = i38 + i39;
                    mVar2.c = nVar.b + i39 + 1;
                }
                arrayList2.add(mVar2);
            } else {
                arrayList3.add(mVar2);
            }
            abs = i7;
            iArr3 = iArr2;
            iArr4 = iArr;
            i16 = 0;
        }
        int[] iArr5 = iArr3;
        Collections.sort(arrayList, a);
        return new p4.c(oVar, arrayList, iArr5, iArr4, z9);
    }

    public abstract boolean a(int i7, int i10);

    public abstract boolean b(int i7, int i10);

    public abstract int d();

    public abstract int e();
}
