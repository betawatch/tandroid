package s4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class o {
    public static final fb.i a = new fb.i(4);

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
    
        r6 = new s4.n();
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
    public static k c(o oVar, boolean z10) {
        int i10;
        int[] iArr;
        int[] iArr2;
        n nVar;
        int i11;
        boolean z11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int e7 = oVar.e();
        int d = oVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m mVar = new m();
        int i17 = 0;
        mVar.a = 0;
        mVar.b = e7;
        mVar.c = 0;
        mVar.d = d;
        arrayList2.add(mVar);
        int abs = Math.abs(e7 - d) + e7 + d;
        int i18 = abs * 2;
        int[] iArr3 = new int[i18];
        int[] iArr4 = new int[i18];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            m mVar2 = (m) hg.c.x(1, arrayList2);
            int i19 = mVar2.a;
            int i20 = mVar2.b;
            int i21 = mVar2.c;
            int i22 = i20 - i19;
            int i23 = mVar2.d - i21;
            if (i22 >= 1 && i23 >= 1) {
                int i24 = i22 - i23;
                int i25 = ((i22 + i23) + 1) / 2;
                boolean z12 = true;
                int i26 = (abs - i25) - 1;
                i10 = abs;
                int i27 = abs + i25 + 1;
                Arrays.fill(iArr3, i26, i27, i17);
                Arrays.fill(iArr4, i26 + i24, i27 + i24, i22);
                int i28 = i24 % 2 != 0 ? 1 : i17;
                int i29 = i17;
                while (i29 <= i25) {
                    int i30 = -i29;
                    int i31 = i28;
                    int i32 = i30;
                    while (true) {
                        if (i32 > i29) {
                            break;
                        }
                        if (i32 != i30) {
                            if (i32 != i29) {
                                int i33 = i10 + i32;
                                iArr = iArr4;
                                iArr2 = iArr3;
                            } else {
                                iArr = iArr4;
                                iArr2 = iArr3;
                            }
                            i11 = iArr2[(i10 + i32) - 1] + 1;
                            z11 = z12;
                            i12 = i19;
                            i13 = i11 - i32;
                            while (i11 < i22 && i13 < i23) {
                                i16 = i13;
                                i14 = i22;
                                if (oVar.b(i12 + i11, i21 + i16)) {
                                    break;
                                }
                                i11++;
                                i13 = i16 + 1;
                                i22 = i14;
                            }
                            i14 = i22;
                            int i34 = i10 + i32;
                            iArr2[i34] = i11;
                            if (i31 == 0 && i32 >= (i24 - i29) + 1 && i32 <= (i24 + i29) - 1 && i11 >= (i15 = iArr[i34])) {
                                nVar = new n();
                                nVar.a = i15;
                                nVar.b = i15 - i32;
                                nVar.c = i11 - i15;
                                nVar.d = z11;
                                nVar.e = false;
                                break;
                            }
                            i32 += 2;
                            i19 = i12;
                            iArr3 = iArr2;
                            iArr4 = iArr;
                            i22 = i14;
                        } else {
                            iArr = iArr4;
                            iArr2 = iArr3;
                        }
                        i11 = iArr2[i10 + i32 + 1];
                        z11 = false;
                        i12 = i19;
                        i13 = i11 - i32;
                        while (i11 < i22) {
                            i16 = i13;
                            i14 = i22;
                            if (oVar.b(i12 + i11, i21 + i16)) {
                            }
                        }
                        i14 = i22;
                        int i342 = i10 + i32;
                        iArr2[i342] = i11;
                        if (i31 == 0) {
                        }
                        i32 += 2;
                        i19 = i12;
                        iArr3 = iArr2;
                        iArr4 = iArr;
                        i22 = i14;
                    }
                }
                throw new IllegalStateException("DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation.");
            }
            i10 = abs;
            iArr = iArr4;
            iArr2 = iArr3;
            nVar = null;
            if (nVar != null) {
                if (nVar.c > 0) {
                    arrayList.add(nVar);
                }
                nVar.a += mVar2.a;
                nVar.b += mVar2.c;
                m mVar3 = arrayList3.isEmpty() ? new m() : (m) hg.c.x(1, arrayList3);
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
                    int i35 = nVar.a;
                    int i36 = nVar.c;
                    mVar2.a = i35 + i36;
                    mVar2.c = nVar.b + i36;
                } else if (nVar.d) {
                    int i37 = nVar.a;
                    int i38 = nVar.c;
                    mVar2.a = i37 + i38 + 1;
                    mVar2.c = nVar.b + i38;
                } else {
                    int i39 = nVar.a;
                    int i40 = nVar.c;
                    mVar2.a = i39 + i40;
                    mVar2.c = nVar.b + i40 + 1;
                }
                arrayList2.add(mVar2);
            } else {
                arrayList3.add(mVar2);
            }
            abs = i10;
            iArr3 = iArr2;
            iArr4 = iArr;
            i17 = 0;
        }
        int[] iArr5 = iArr3;
        Collections.sort(arrayList, a);
        return new k(oVar, arrayList, iArr5, iArr4, z10);
    }

    public abstract boolean a(int i10, int i11);

    public abstract boolean b(int i10, int i11);

    public abstract int d();

    public abstract int e();
}
