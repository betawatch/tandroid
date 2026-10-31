package vh;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeoutException;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.do0;
import org.telegram.ui.o10;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w3 implements ig.b1, s61, hu0 {
    public final Object a;

    public /* synthetic */ w3(Object obj) {
        this.a = obj;
    }

    @Override // org.telegram.ui.Components.hu0
    public void F(boolean z10) {
        wh.g gVar = (wh.g) this.a;
        fe.b bVar = gVar.Y;
        if (bVar != null) {
            bVar.a(z10, true);
        }
        o10 o10Var = gVar.s;
        if (o10Var != null) {
            o10Var.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x05e9 A[Catch: a | c -> 0x0685, TryCatch #3 {a | c -> 0x0685, blocks: (B:297:0x05cf, B:298:0x05e5, B:300:0x05e9, B:301:0x05ec, B:303:0x05f0, B:305:0x05fa, B:307:0x0600, B:312:0x0605), top: B:296:0x05cf }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q5.d a(u9.b bVar) {
        int i10;
        ArrayList arrayList;
        bc.c cVar;
        bc.c cVar2;
        bc.c cVar3;
        float f7;
        float f10;
        bc.a aVar;
        float f11;
        float f12;
        float f13;
        int i11;
        int i12;
        vb.j[] jVarArr;
        vb.a aVar2;
        wb.b bVar2;
        int i13;
        c2.q qVar;
        int i14;
        q5.d dVar;
        List list;
        String str;
        int i15;
        boolean z10;
        double d;
        double abs;
        int i16;
        int i17;
        int i18;
        k6.h hVar = (k6.h) this.a;
        if (((wb.b) bVar.c) == null) {
            bVar.c = ((wb.e) bVar.b).a();
        }
        wb.b bVar3 = (wb.b) bVar.c;
        za.c cVar4 = new za.c(bVar3, 7);
        bc.e eVar = new bc.e(bVar3);
        int i19 = bVar3.b;
        int i20 = bVar3.a;
        int i21 = (i19 * 3) / 388;
        int i22 = 3;
        if (i21 < 3) {
            i21 = 3;
        }
        char c10 = 5;
        int[] iArr = new int[5];
        int i23 = i21 - 1;
        int i24 = 0;
        boolean z11 = false;
        while (true) {
            char c11 = c10;
            int i25 = 1;
            i10 = i22;
            arrayList = eVar.b;
            if (i23 >= i19 || z11) {
                break;
            }
            Arrays.fill(iArr, i24);
            int i26 = i24;
            while (i26 < i20) {
                if (bVar3.b(i26, i23)) {
                    if ((i24 & 1) == i25) {
                        i24++;
                    }
                    iArr[i24] = iArr[i24] + i25;
                    i16 = i19;
                } else if ((i24 & 1) != 0) {
                    i16 = i19;
                    iArr[i24] = iArr[i24] + 1;
                } else if (i24 == 4) {
                    if (!bc.e.b(iArr)) {
                        i16 = i19;
                        int i27 = i25;
                        iArr[0] = iArr[2];
                        iArr[i27] = iArr[i10];
                        iArr[2] = iArr[4];
                        iArr[i10] = i27;
                        iArr[4] = 0;
                    } else if (eVar.c(i23, i26, iArr)) {
                        if (eVar.c) {
                            z11 = eVar.d();
                            i16 = i19;
                            i17 = 2;
                        } else {
                            if (arrayList.size() > i25) {
                                int size = arrayList.size();
                                int i28 = 0;
                                bc.c cVar5 = null;
                                while (true) {
                                    if (i28 >= size) {
                                        i16 = i19;
                                        i17 = 2;
                                        i18 = 0;
                                        break;
                                    }
                                    Object obj = arrayList.get(i28);
                                    i28++;
                                    bc.c cVar6 = (bc.c) obj;
                                    i16 = i19;
                                    if (cVar6.d >= 2) {
                                        if (cVar5 != null) {
                                            eVar.c = true;
                                            i17 = 2;
                                            i18 = ((int) (Math.abs(cVar5.a - cVar6.a) - Math.abs(cVar5.b - cVar6.b))) / 2;
                                            break;
                                        }
                                        cVar5 = cVar6;
                                    }
                                    i19 = i16;
                                }
                            } else {
                                i16 = i19;
                                i18 = 0;
                                i17 = 2;
                            }
                            if (i18 > iArr[i17]) {
                                i23 += (i18 - r5) - 2;
                                i26 = i20 - 1;
                            }
                        }
                        Arrays.fill(iArr, 0);
                        i24 = 0;
                        i21 = i17;
                    } else {
                        i16 = i19;
                        iArr[0] = iArr[2];
                        iArr[1] = iArr[i10];
                        iArr[2] = iArr[4];
                        iArr[i10] = 1;
                        iArr[4] = 0;
                    }
                    i24 = i10;
                } else {
                    i16 = i19;
                    int i29 = i24 + 1;
                    iArr[i29] = iArr[i29] + 1;
                    i24 = i29;
                }
                i26++;
                i19 = i16;
                i25 = 1;
            }
            int i30 = i19;
            if (bc.e.b(iArr) && eVar.c(i23, i20, iArr)) {
                int i31 = iArr[0];
                if (eVar.c) {
                    i21 = i31;
                    z11 = eVar.d();
                } else {
                    i21 = i31;
                }
            }
            i23 += i21;
            c10 = c11;
            i22 = i10;
            i19 = i30;
            i24 = 0;
        }
        if (arrayList.size() < i10) {
            throw vb.e.a();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((bc.c) it.next()).d < 2) {
                it.remove();
            }
        }
        Collections.sort(arrayList, bc.e.e);
        bc.c[] cVarArr = new bc.c[3];
        int i32 = 0;
        double d10 = Double.MAX_VALUE;
        for (int i33 = 2; i32 < arrayList.size() - i33; i33 = 2) {
            bc.c cVar7 = (bc.c) arrayList.get(i32);
            float f14 = cVar7.c;
            i32++;
            int i34 = i32;
            while (i34 < arrayList.size() - 1) {
                bc.c cVar8 = (bc.c) arrayList.get(i34);
                double e = bc.e.e(cVar7, cVar8);
                i34++;
                for (int i35 = i34; i35 < arrayList.size(); i35++) {
                    bc.c cVar9 = (bc.c) arrayList.get(i35);
                    if (cVar9.c <= 1.4f * f14) {
                        double e7 = bc.e.e(cVar8, cVar9);
                        double e10 = bc.e.e(cVar7, cVar9);
                        if (e < e7) {
                            if (e7 <= e10) {
                                e10 = e7;
                                e7 = e10;
                            } else if (e >= e10) {
                                d = e10;
                                e10 = e;
                                abs = Math.abs(e7 - (d * 2.0d)) + Math.abs(e7 - (e10 * 2.0d));
                                if (abs >= d10) {
                                    cVarArr[0] = cVar7;
                                    cVarArr[1] = cVar8;
                                    cVarArr[2] = cVar9;
                                    d10 = abs;
                                }
                            }
                            d = e;
                            abs = Math.abs(e7 - (d * 2.0d)) + Math.abs(e7 - (e10 * 2.0d));
                            if (abs >= d10) {
                            }
                        } else {
                            if (e7 >= e10) {
                                d = e10;
                                e10 = e7;
                            } else if (e < e10) {
                                d = e7;
                                e7 = e10;
                                e10 = e;
                                abs = Math.abs(e7 - (d * 2.0d)) + Math.abs(e7 - (e10 * 2.0d));
                                if (abs >= d10) {
                                }
                            } else {
                                d = e7;
                            }
                            e7 = e;
                            abs = Math.abs(e7 - (d * 2.0d)) + Math.abs(e7 - (e10 * 2.0d));
                            if (abs >= d10) {
                            }
                        }
                    }
                }
            }
        }
        if (d10 == Double.MAX_VALUE) {
            throw vb.e.a();
        }
        float a2 = vb.j.a(cVarArr[0], cVarArr[1]);
        float a10 = vb.j.a(cVarArr[1], cVarArr[2]);
        float a11 = vb.j.a(cVarArr[0], cVarArr[2]);
        if (a10 >= a2 && a10 >= a11) {
            cVar = cVarArr[0];
            cVar2 = cVarArr[1];
            cVar3 = cVarArr[2];
        } else if (a11 < a10 || a11 < a2) {
            cVar = cVarArr[2];
            cVar2 = cVarArr[0];
            cVar3 = cVarArr[1];
        } else {
            cVar = cVarArr[1];
            cVar2 = cVarArr[0];
            cVar3 = cVarArr[2];
        }
        float f15 = cVar.a;
        float f16 = cVar.b;
        if (sc.e.z(cVar2.a, f15, cVar3.b - f16, (cVar2.b - f16) * (cVar3.a - f15)) < 0.0f) {
            bc.c cVar10 = cVar3;
            cVar3 = cVar2;
            cVar2 = cVar10;
        }
        cVarArr[0] = cVar2;
        cVarArr[1] = cVar;
        cVarArr[2] = cVar3;
        float i36 = cVar4.i(cVar, cVar3);
        float f17 = cVar.a;
        float f18 = cVar3.b;
        float f19 = cVar3.a;
        float i37 = cVar4.i(cVar, cVar2);
        float f20 = cVar2.b;
        float f21 = cVar2.a;
        float f22 = (i37 + i36) / 2.0f;
        if (f22 < 1.0f) {
            throw vb.e.a();
        }
        float a12 = vb.j.a(cVar, cVar3) / f22;
        int i38 = (int) (a12 + (a12 < 0.0f ? -0.5f : 0.5f));
        float a13 = vb.j.a(cVar, cVar2) / f22;
        int i39 = (((int) (a13 + (a13 >= 0.0f ? 0.5f : -0.5f))) + i38) / 2;
        int i40 = i39 + 7;
        int i41 = i40 & 3;
        if (i41 == 0) {
            i40 = i39 + 8;
        } else if (i41 == 2) {
            i40 = i39 + 6;
        } else if (i41 == 3) {
            i40 = i39 + 5;
        }
        int i42 = i40;
        int[] iArr2 = ac.h.e;
        if (i42 % 4 != 1) {
            throw vb.c.a();
        }
        try {
            ac.h c12 = ac.h.c((i42 - 17) / 4);
            int i43 = (c12.a * 4) + 10;
            if (c12.b.length > 0) {
                float f23 = (f19 - f17) + f21;
                f10 = f19;
                float f24 = (f18 - f16) + f20;
                float f25 = 1.0f - (3.0f / i43);
                int z12 = (int) c3.i0.z(f23, f17, f25, f17);
                int z13 = (int) c3.i0.z(f24, f16, f25, f16);
                f7 = f17;
                for (int i44 = 4; i44 <= 16; i44 <<= 1) {
                    try {
                        aVar = cVar4.l(f22, i44, z12, z13);
                        break;
                    } catch (vb.e unused) {
                    }
                }
            } else {
                f7 = f17;
                f10 = f19;
            }
            aVar = null;
            float f26 = i42 - 3.5f;
            if (aVar != null) {
                f11 = aVar.a;
                f12 = aVar.b;
                f13 = f26 - 3.0f;
            } else {
                f11 = (f10 - f7) + f21;
                f12 = (f18 - f16) + f20;
                f13 = f26;
            }
            float f27 = f12;
            float f28 = cVar.a;
            float f29 = cVar.b;
            float f30 = cVar3.a;
            float f31 = cVar3.b;
            float f32 = cVar2.a;
            float f33 = cVar2.b;
            wb.g a14 = wb.g.a(3.5f, 3.5f, f26, 3.5f, f13, f13, 3.5f, f26);
            bc.a aVar3 = aVar;
            float f34 = a14.e;
            float f35 = a14.i;
            float f36 = f34 * f35;
            float f37 = a14.f;
            float f38 = a14.h;
            float f39 = f36 - (f37 * f38);
            float f40 = a14.g;
            float f41 = f37 * f40;
            float f42 = a14.d;
            float f43 = f41 - (f42 * f35);
            float f44 = (f42 * f38) - (f34 * f40);
            float f45 = a14.c;
            float f46 = f45 * f38;
            float f47 = a14.b;
            float f48 = f46 - (f47 * f35);
            float f49 = a14.a;
            float f50 = (f35 * f49) - (f45 * f40);
            float f51 = (f40 * f47) - (f38 * f49);
            float f52 = (f47 * f37) - (f45 * f34);
            float f53 = (f45 * f42) - (f37 * f49);
            float f54 = (f49 * f34) - (f47 * f42);
            wb.g a15 = wb.g.a(f28, f29, f30, f31, f11, f27, f32, f33);
            float f55 = a15.a;
            float f56 = a15.d;
            float f57 = a15.g;
            float f58 = (f57 * f52) + (f56 * f48) + (f55 * f39);
            float f59 = (f57 * f53) + (f56 * f50) + (f55 * f43);
            float f60 = (f57 * f54) + (f56 * f51) + (f55 * f44);
            float f61 = a15.b;
            float f62 = a15.e;
            float f63 = a15.h;
            float f64 = (f63 * f52) + (f62 * f48) + (f61 * f39);
            float f65 = (f63 * f53) + (f62 * f50) + (f61 * f43);
            float f66 = (f63 * f54) + (f62 * f51) + (f61 * f44);
            float f67 = a15.c;
            float f68 = a15.f;
            float f69 = a15.i;
            float f70 = (f52 * f69) + (f48 * f68) + (f39 * f67);
            float f71 = (f53 * f69) + (f50 * f68) + (f43 * f67);
            float f72 = (f69 * f54) + (f68 * f51) + (f67 * f44);
            if (i42 <= 0 || i42 <= 0) {
                throw vb.e.a();
            }
            wb.b bVar4 = new wb.b(i42, i42);
            int i45 = i42 * 2;
            bc.c cVar11 = cVar;
            float[] fArr = new float[i45];
            int i46 = 0;
            while (i46 < i42) {
                int i47 = i42;
                float f73 = i46 + 0.5f;
                int i48 = 0;
                while (i48 < i45) {
                    int i49 = i48;
                    fArr[i49] = (i49 / 2) + 0.5f;
                    fArr[i49 + 1] = f73;
                    i48 = i49 + 2;
                }
                int i50 = i45 - 1;
                bc.c cVar12 = cVar2;
                int i51 = 0;
                while (i51 < i50) {
                    float f74 = fArr[i51];
                    int i52 = i51 + 1;
                    int i53 = i51;
                    float f75 = fArr[i52];
                    bc.c cVar13 = cVar3;
                    float d11 = sc.e.d(f71, f75, f70 * f74, f72);
                    fArr[i53] = (((f59 * f75) + (f58 * f74)) + f60) / d11;
                    fArr[i52] = (((f75 * f65) + (f74 * f64)) + f66) / d11;
                    i51 = i53 + 2;
                    cVar3 = cVar13;
                }
                bc.c cVar14 = cVar3;
                int i54 = bVar3.b;
                float f76 = f71;
                int i55 = 0;
                boolean z14 = true;
                while (i55 < i50 && z14) {
                    int i56 = (int) fArr[i55];
                    int i57 = i55 + 1;
                    int i58 = i50;
                    int i59 = (int) fArr[i57];
                    int i60 = i55;
                    if (i56 < -1 || i56 > i20 || i59 < -1 || i59 > i54) {
                        throw vb.e.a();
                    }
                    if (i56 == -1) {
                        fArr[i60] = 0.0f;
                    } else if (i56 == i20) {
                        fArr[i60] = i20 - 1;
                    } else {
                        z10 = false;
                        if (i59 != -1) {
                            fArr[i57] = 0.0f;
                        } else if (i59 == i54) {
                            fArr[i57] = i54 - 1;
                        } else {
                            z14 = z10;
                            i55 = i60 + 2;
                            i50 = i58;
                        }
                        z14 = true;
                        i55 = i60 + 2;
                        i50 = i58;
                    }
                    z10 = true;
                    if (i59 != -1) {
                    }
                    z14 = true;
                    i55 = i60 + 2;
                    i50 = i58;
                }
                int i61 = i45 - 2;
                boolean z15 = true;
                while (i61 >= 0 && z15) {
                    int i62 = (int) fArr[i61];
                    int i63 = i61 + 1;
                    int i64 = i61;
                    int i65 = (int) fArr[i63];
                    if (i62 < -1 || i62 > i20 || i65 < -1 || i65 > i54) {
                        throw vb.e.a();
                    }
                    if (i62 == -1) {
                        fArr[i64] = 0.0f;
                    } else if (i62 == i20) {
                        fArr[i64] = i20 - 1;
                    } else {
                        z15 = false;
                        if (i65 != -1) {
                            fArr[i63] = 0.0f;
                        } else if (i65 == i54) {
                            fArr[i63] = i54 - 1;
                        } else {
                            i61 = i64 - 2;
                        }
                        z15 = true;
                        i61 = i64 - 2;
                    }
                    z15 = true;
                    if (i65 != -1) {
                    }
                    z15 = true;
                    i61 = i64 - 2;
                }
                for (int i66 = 0; i66 < i45; i66 += 2) {
                    try {
                        if (bVar3.b((int) fArr[i66], (int) fArr[i66 + 1])) {
                            bVar4.c(i66 / 2, i46);
                        }
                    } catch (ArrayIndexOutOfBoundsException unused2) {
                        throw vb.e.a();
                    }
                }
                i46++;
                i42 = i47;
                cVar2 = cVar12;
                f71 = f76;
                cVar3 = cVar14;
            }
            bc.c cVar15 = cVar2;
            bc.c cVar16 = cVar3;
            if (aVar3 == null) {
                i12 = 3;
                i11 = 1;
                jVarArr = new vb.j[]{cVar15, cVar11, cVar16};
            } else {
                i11 = 1;
                i12 = 3;
                jVarArr = new vb.j[]{cVar15, cVar11, cVar16, aVar3};
            }
            vb.j[] jVarArr2 = jVarArr;
            hVar.getClass();
            ac.a aVar4 = new ac.a();
            int i67 = bVar4.b;
            if (i67 < 21 || (i67 & i12) != i11) {
                throw vb.c.a();
            }
            aVar4.b = bVar4;
            try {
                qVar = hVar.c(aVar4);
            } catch (vb.a e11) {
                aVar2 = e11;
                e = null;
                try {
                    aVar4.v();
                    aVar4.c = null;
                    aVar4.d = null;
                    aVar4.a = true;
                    aVar4.u();
                    aVar4.t();
                    bVar2 = (wb.b) aVar4.b;
                    i13 = 0;
                    while (i13 < bVar2.a) {
                        int i68 = i13 + 1;
                        for (int i69 = i68; i69 < bVar2.b; i69++) {
                            if (bVar2.b(i13, i69) != bVar2.b(i69, i13)) {
                                bVar2.a(i69, i13);
                                bVar2.a(i13, i69);
                            }
                        }
                        i13 = i68;
                    }
                    c2.q c13 = hVar.c(aVar4);
                    c13.h = new jb.b(1);
                    qVar = c13;
                    i14 = qVar.a;
                    if (c3.i0.t((jb.b) qVar.h)) {
                        vb.j jVar = jVarArr2[0];
                        jVarArr2[0] = jVarArr2[2];
                        jVarArr2[2] = jVar;
                    }
                    dVar = new q5.d((String) qVar.d, jVarArr2);
                    list = (List) qVar.e;
                    if (list != null) {
                    }
                    str = (String) qVar.f;
                    if (str != null) {
                    }
                    if (i14 >= 0) {
                        dVar.v(vb.i.d, Integer.valueOf(i15));
                        dVar.v(vb.i.e, Integer.valueOf(i14));
                    }
                    dVar.v(vb.i.c, (Integer) qVar.g);
                    dVar.v(vb.i.f, "]Q" + qVar.c);
                    return dVar;
                } catch (vb.a | vb.c unused3) {
                    if (e != null) {
                        throw e;
                    }
                    throw aVar2;
                }
            } catch (vb.c e12) {
                e = e12;
                aVar2 = null;
                aVar4.v();
                aVar4.c = null;
                aVar4.d = null;
                aVar4.a = true;
                aVar4.u();
                aVar4.t();
                bVar2 = (wb.b) aVar4.b;
                i13 = 0;
                while (i13 < bVar2.a) {
                }
                c2.q c132 = hVar.c(aVar4);
                c132.h = new jb.b(1);
                qVar = c132;
                i14 = qVar.a;
                if (c3.i0.t((jb.b) qVar.h)) {
                }
                dVar = new q5.d((String) qVar.d, jVarArr2);
                list = (List) qVar.e;
                if (list != null) {
                }
                str = (String) qVar.f;
                if (str != null) {
                }
                if (i14 >= 0) {
                }
                dVar.v(vb.i.c, (Integer) qVar.g);
                dVar.v(vb.i.f, "]Q" + qVar.c);
                return dVar;
            }
            i14 = qVar.a;
            if (c3.i0.t((jb.b) qVar.h) && jVarArr2.length >= 3) {
                vb.j jVar2 = jVarArr2[0];
                jVarArr2[0] = jVarArr2[2];
                jVarArr2[2] = jVar2;
            }
            dVar = new q5.d((String) qVar.d, jVarArr2);
            list = (List) qVar.e;
            if (list != null) {
                dVar.v(vb.i.a, list);
            }
            str = (String) qVar.f;
            if (str != null) {
                dVar.v(vb.i.b, str);
            }
            if (i14 >= 0 && (i15 = qVar.b) >= 0) {
                dVar.v(vb.i.d, Integer.valueOf(i15));
                dVar.v(vb.i.e, Integer.valueOf(i14));
            }
            dVar.v(vb.i.c, (Integer) qVar.g);
            dVar.v(vb.i.f, "]Q" + qVar.c);
            return dVar;
        } catch (IllegalArgumentException unused4) {
            throw vb.c.a();
        }
    }

    @Override // org.telegram.ui.Components.hu0
    public float a1() {
        return i0.a.d(9.66f, ei.b.d(((wh.g) this.a).b0), 0);
    }

    public synchronized void b() {
        ((SharedPreferences) this.a).edit().clear().commit();
    }

    public void c(ea.d dVar, Thread thread, Throwable th2) {
        x9.n nVar = (x9.n) this.a;
        synchronized (nVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    x9.x.a(nVar.e.Z(new x9.k(nVar, System.currentTimeMillis(), th2, thread, dVar)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }

    @Override // ig.b1
    public void g() {
        do0 do0Var = ((s7) this.a).y0;
        if (do0Var != null) {
            do0Var.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.hu0
    public int g1() {
        return ((wh.g) this.a).c0;
    }

    @Override // ig.b1
    public void j() {
        s7 s7Var = (s7) this.a;
        if (s7Var.L0) {
            s7Var.L0 = false;
        } else {
            s7Var.T0.b(1);
            s7Var.z((ig.h) ig.h.a.get(0));
        }
    }

    @Override // ig.b1
    public boolean k() {
        s7 s7Var = (s7) this.a;
        boolean z10 = s7Var.s0 == null;
        if (!z10) {
            s7Var.A0(null, true);
        }
        return z10;
    }

    @Override // ig.b1
    public void n() {
        s7 s7Var = (s7) this.a;
        s7Var.m0.a.B();
        s7Var.M0.setViewHidden(false);
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s61
    public void onStateChanged(boolean z10, int i10) {
        k4 k4Var = (k4) this.a;
        i4 i4Var = k4Var.M;
        u61 u61Var = k4Var.y;
        if (u61Var == null) {
            return;
        }
        if (u61Var.d0()) {
            org.telegram.messenger.i0.g3(i4Var);
        } else {
            org.telegram.messenger.i0.r(i4Var);
        }
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.s61
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        jg.i2 i2Var = ((k4) this.a).x;
        if (i2Var != null) {
            float f10 = i10 / i11;
            if (Math.abs(i2Var.y0 - f10) >= 1.0E-4f) {
                i2Var.y0 = f10;
                i2Var.requestLayout();
            }
        }
    }

    @Override // ig.b1
    public void t() {
        s7 s7Var = (s7) this.a;
        if (s7Var.s0 != null) {
            s7Var.A0(null, true);
        }
        s7Var.M0.setViewHidden(true);
    }

    public w3() {
        this.a = new k6.h(2);
    }

    @Override // org.telegram.ui.Components.s61
    public void onRenderedFirstFrame() {
    }

    public w3(Context context) {
        boolean isEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.a = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                b();
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // ig.b1
    public void d() {
    }

    @Override // org.telegram.ui.Components.s61
    public void onError(u61 u61Var, Exception exc) {
    }
}
