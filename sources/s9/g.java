package s9;

import android.os.Build;
import android.support.v4.media.session.a0;
import android.util.SparseArray;
import android.view.TextureView;
import b2.w0;
import c3.j0;
import c3.t;
import e2.x;
import eg.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import m.p3;
import org.telegram.messenger.jj;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.mx;
import org.telegram.ui.os0;
import org.telegram.ui.un;
import sg.o;
import th.f7;
import th.z2;
import vh.b0;
import vh.o8;
import vh.s7;
import vh.t8;
import yh.d0;
import yh.e0;
import yh.q;
import zf.k1;
import zf.l1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g implements fe.e, os0, p, jg.c, t8, d0, l1 {
    public Object a;

    public /* synthetic */ g(Object obj) {
        this.a = obj;
    }

    @Override // fe.e
    public void E(float f7, int i10) {
        o oVar = (o) this.a;
        oVar.c.setLayerType(0, null);
        if (f7 == 0.0f && !oVar.N) {
            oVar.c.setVisibility(4);
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                oVar.E.setFocusableInTouchMode(false);
            }
        }
        zs.e().k(zs.k1, 512);
    }

    @Override // org.telegram.ui.os0
    public void H0(jj jjVar) {
        ((f7) ((z2) this.a).z1).f(true);
    }

    @Override // org.telegram.ui.os0
    public void I(jj jjVar) {
        ((f7) ((z2) this.a).z1).f(false);
    }

    @Override // zf.l1
    public /* synthetic */ a0.h M() {
        return null;
    }

    @Override // zf.l1
    public boolean Y(int i10) {
        return i10 == ((zm0) this.a).d0;
    }

    @Override // yh.d0
    public void a(long j10) {
        ((q) this.a).presentFragment(un.ha(j10));
    }

    @Override // yh.d0
    public void b() {
        q qVar = (q) this.a;
        fe.b bVar = qVar.a;
        e0 e0Var = qVar.w;
        bVar.a(e0Var.n && e0Var.l == 0, true);
        qVar.d.f3.O(true);
    }

    public void c(int i10, int i11, c3.p pVar) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j10;
        int i17;
        int i18;
        int i19;
        int i20;
        u3.f fVar = (u3.f) this.a;
        u3.g gVar = fVar.b;
        SparseArray sparseArray = fVar.c;
        x xVar = fVar.k;
        x xVar2 = fVar.i;
        int i21 = 2;
        int i22 = 0;
        int i23 = 1;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (fVar.O != 2) {
                    return;
                }
                u3.e eVar = (u3.e) sparseArray.get(fVar.U);
                int i24 = fVar.X;
                x xVar3 = fVar.p;
                if (i24 != 4 || !"V_VP9".equals(eVar.c)) {
                    pVar.q(i11);
                    return;
                } else {
                    xVar3.K(i11);
                    pVar.readFully(xVar3.a, 0, i11);
                    return;
                }
            }
            if (i10 == 16877) {
                fVar.h(i10);
                u3.e eVar2 = fVar.y;
                int i25 = eVar2.h;
                if (i25 != 1685485123 && i25 != 1685480259) {
                    pVar.q(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                eVar2.P = bArr;
                pVar.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 16981) {
                fVar.h(i10);
                byte[] bArr2 = new byte[i11];
                fVar.y.j = bArr2;
                pVar.readFully(bArr2, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr3 = new byte[i11];
                pVar.readFully(bArr3, 0, i11);
                fVar.h(i10);
                fVar.y.k = new j0(1, 0, 0, bArr3);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(xVar.a, (byte) 0);
                pVar.readFully(xVar.a, 4 - i11, i11);
                xVar.N(0);
                fVar.A = (int) xVar.C();
                return;
            }
            if (i10 == 25506) {
                fVar.h(i10);
                byte[] bArr4 = new byte[i11];
                fVar.y.l = bArr4;
                pVar.readFully(bArr4, 0, i11);
                return;
            }
            if (i10 != 30322) {
                throw w0.a(null, "Unexpected id: " + i10);
            }
            fVar.h(i10);
            byte[] bArr5 = new byte[i11];
            fVar.y.x = bArr5;
            pVar.readFully(bArr5, 0, i11);
            return;
        }
        if (fVar.O == 0) {
            fVar.U = (int) gVar.b(pVar, false, true, 8);
            fVar.V = gVar.c;
            fVar.Q = -9223372036854775807L;
            fVar.O = 1;
            xVar2.K(0);
        }
        u3.e eVar3 = (u3.e) sparseArray.get(fVar.U);
        if (eVar3 == null) {
            pVar.q(i11 - fVar.V);
            fVar.O = 0;
            return;
        }
        eVar3.a0.getClass();
        if (fVar.O == 1) {
            fVar.l(pVar, 3);
            int i26 = (xVar2.a[2] & 6) >> 1;
            byte b10 = 255;
            if (i26 == 0) {
                fVar.S = 1;
                int[] iArr = fVar.T;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                fVar.T = iArr;
                iArr[0] = (i11 - fVar.V) - 3;
            } else {
                fVar.l(pVar, 4);
                int i27 = (xVar2.a[3] & zs.e4) + 1;
                fVar.S = i27;
                int[] iArr2 = fVar.T;
                if (iArr2 == null) {
                    iArr2 = new int[i27];
                } else if (iArr2.length < i27) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i27)];
                }
                fVar.T = iArr2;
                if (i26 == 2) {
                    int i28 = (i11 - fVar.V) - 4;
                    int i29 = fVar.S;
                    Arrays.fill(iArr2, 0, i29, i28 / i29);
                } else {
                    if (i26 != 1) {
                        if (i26 != 3) {
                            throw w0.a(null, "Unexpected lacing value: " + i26);
                        }
                        int i30 = 0;
                        int i31 = 0;
                        int i32 = 4;
                        while (true) {
                            int i33 = fVar.S - i23;
                            if (i30 >= i33) {
                                i12 = i21;
                                i13 = i22;
                                i14 = i23;
                                fVar.T[i33] = ((i11 - fVar.V) - i32) - i31;
                                break;
                            }
                            fVar.T[i30] = i22;
                            int i34 = i32 + 1;
                            fVar.l(pVar, i34);
                            if (xVar2.a[i32] == 0) {
                                throw w0.a(null, "No valid varint length mask found");
                            }
                            int i35 = i22;
                            while (true) {
                                if (i35 >= 8) {
                                    i15 = i21;
                                    i16 = i23;
                                    j10 = 0;
                                    i17 = i34;
                                    break;
                                }
                                int i36 = i23 << (7 - i35);
                                i15 = i21;
                                if ((xVar2.a[i32] & i36) != 0) {
                                    int i37 = i34 + i35;
                                    fVar.l(pVar, i37);
                                    i16 = i23;
                                    j10 = xVar2.a[i32] & b10 & (~i36);
                                    while (i34 < i37) {
                                        j10 = (j10 << 8) | (xVar2.a[i34] & b10);
                                        i34++;
                                        i37 = i37;
                                        b10 = 255;
                                    }
                                    i17 = i37;
                                    if (i30 > 0) {
                                        j10 -= (1 << ((i35 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i35++;
                                    i21 = i15;
                                    b10 = 255;
                                }
                            }
                            if (j10 < -2147483648L || j10 > 2147483647L) {
                                break;
                            }
                            int i38 = (int) j10;
                            int[] iArr3 = fVar.T;
                            if (i30 != 0) {
                                i38 += iArr3[i30 - 1];
                            }
                            iArr3[i30] = i38;
                            i31 += i38;
                            i30++;
                            i22 = i35;
                            i21 = i15;
                            i23 = i16;
                            i32 = i17;
                            b10 = 255;
                        }
                        throw w0.a(null, "EBML lacing sample size out of range.");
                    }
                    int i39 = 0;
                    int i40 = 0;
                    int i41 = 4;
                    while (true) {
                        i18 = fVar.S - 1;
                        if (i39 >= i18) {
                            break;
                        }
                        fVar.T[i39] = 0;
                        while (true) {
                            i19 = i41 + 1;
                            fVar.l(pVar, i19);
                            int i42 = xVar2.a[i41] & 255;
                            int[] iArr4 = fVar.T;
                            i20 = iArr4[i39] + i42;
                            iArr4[i39] = i20;
                            if (i42 != 255) {
                                break;
                            } else {
                                i41 = i19;
                            }
                        }
                        i40 += i20;
                        i39++;
                        i41 = i19;
                    }
                    fVar.T[i18] = ((i11 - fVar.V) - i41) - i40;
                }
            }
            i12 = 2;
            i13 = 0;
            i14 = 1;
            byte[] bArr6 = xVar2.a;
            fVar.P = fVar.n((bArr6[i14] & 255) | (bArr6[i13] << 8)) + fVar.M;
            fVar.W = (eVar3.e == i14 || (i10 == 163 && (xVar2.a[i12] & 128) == 128)) ? 1 : i13;
            fVar.O = i12;
            fVar.R = i13;
        }
        if (i10 == 163) {
            while (true) {
                int i43 = fVar.R;
                if (i43 >= fVar.S) {
                    fVar.O = 0;
                    return;
                } else {
                    fVar.i(eVar3, ((fVar.R * eVar3.f) / 1000) + fVar.P, fVar.W, fVar.o(pVar, eVar3, fVar.T[i43], false), 0);
                    fVar.R++;
                }
            }
        } else {
            while (true) {
                int i44 = fVar.R;
                if (i44 >= fVar.S) {
                    return;
                }
                int[] iArr5 = fVar.T;
                iArr5[i44] = fVar.o(pVar, eVar3, iArr5[i44], true);
                fVar.R++;
            }
        }
    }

    @Override // zf.l1
    public void c0(ArrayList arrayList) {
        zm0 zm0Var = (zm0) this.a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            zm0Var.J.add(((k1) arrayList.get(i10)).a);
        }
        mx mxVar = zm0Var.U;
        if (mxVar != null) {
            mxVar.d(zm0Var.D0 > 0, false);
        }
        zm0Var.f();
    }

    @Override // yh.d0
    public void close() {
        ((q) this.a).finishFragment();
    }

    @Override // eg.p
    public void d() {
        ((b0) this.a).d.invalidate();
    }

    @Override // jg.c
    public jg.j g0() {
        return ((s7) this.a).s0;
    }

    @Override // zf.l1
    public void i(int i10) {
        zm0 zm0Var = (zm0) this.a;
        zm0Var.D0--;
        zm0Var.e0 = i10;
        if (zm0Var.f0 != i10) {
            zm0Var.s.clear();
        }
        if (zm0Var.g0 != i10) {
            zm0Var.I.clear();
        }
        zm0Var.N = true;
        mx mxVar = zm0Var.U;
        if (mxVar != null) {
            mxVar.d(zm0Var.D0 > 0, true);
        }
        zm0Var.f();
        mx mxVar2 = zm0Var.U;
        if (mxVar2 != null) {
            mxVar2.c();
        }
    }

    public void k(int i10, long j10) {
        u3.f fVar = (u3.f) this.a;
        if (i10 == 240) {
            if (fVar.z) {
                return;
            }
            fVar.g(i10);
            if (fVar.H == -1) {
                fVar.H = j10;
                return;
            }
            return;
        }
        if (i10 == 241) {
            if (fVar.z) {
                return;
            }
            fVar.g(i10);
            if (fVar.G == -1) {
                fVar.G = j10;
                return;
            }
            return;
        }
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw w0.a(null, "ContentEncodingOrder " + j10 + " not supported");
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw w0.a(null, "ContentEncodingScope " + j10 + " not supported");
        }
        switch (i10) {
            case zs.P1 /* 131 */:
                int i11 = (int) j10;
                if (i11 == 1) {
                    fVar.h(i10);
                    fVar.y.e = 2;
                    return;
                }
                if (i11 == 2) {
                    fVar.h(i10);
                    fVar.y.e = 1;
                    return;
                } else if (i11 == 17) {
                    fVar.h(i10);
                    fVar.y.e = 3;
                    return;
                } else if (i11 != 33) {
                    fVar.h(i10);
                    fVar.y.e = -1;
                    return;
                } else {
                    fVar.h(i10);
                    fVar.y.e = 5;
                    return;
                }
            case zs.S1 /* 136 */:
                fVar.h(i10);
                fVar.y.Y = j10 == 1;
                return;
            case zs.l2 /* 155 */:
                fVar.Q = fVar.n(j10);
                return;
            case zs.p2 /* 159 */:
                fVar.h(i10);
                fVar.y.Q = (int) j10;
                return;
            case zs.G2 /* 176 */:
                fVar.h(i10);
                fVar.y.n = (int) j10;
                return;
            case zs.J2 /* 179 */:
                if (fVar.z) {
                    return;
                }
                fVar.g(i10);
                fVar.E = fVar.n(j10);
                return;
            case zs.Q2 /* 186 */:
                fVar.h(i10);
                fVar.y.o = (int) j10;
                return;
            case zs.s3 /* 215 */:
                fVar.h(i10);
                fVar.y.d = (int) j10;
                return;
            case zs.H3 /* 231 */:
                fVar.M = fVar.n(j10);
                return;
            case zs.N3 /* 238 */:
                fVar.X = (int) j10;
                return;
            case zs.W3 /* 247 */:
                if (fVar.z) {
                    return;
                }
                fVar.g(i10);
                fVar.F = (int) j10;
                return;
            case zs.a4 /* 251 */:
                fVar.Y = true;
                return;
            case 16871:
                fVar.h(i10);
                fVar.y.h = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw w0.a(null, "ContentCompAlgo " + j10 + " not supported");
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw w0.a(null, "DocTypeReadVersion " + j10 + " not supported");
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw w0.a(null, "EBMLReadVersion " + j10 + " not supported");
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw w0.a(null, "ContentEncAlgo " + j10 + " not supported");
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw w0.a(null, "AESSettingsCipherMode " + j10 + " not supported");
            case 21420:
                fVar.B = j10 + fVar.s;
                return;
            case 21432:
                int i12 = (int) j10;
                fVar.h(i10);
                if (i12 == 0) {
                    fVar.y.y = 0;
                    return;
                }
                if (i12 == 1) {
                    fVar.y.y = 2;
                    return;
                } else if (i12 == 3) {
                    fVar.y.y = 1;
                    return;
                } else {
                    if (i12 != 15) {
                        return;
                    }
                    fVar.y.y = 3;
                    return;
                }
            case 21680:
                fVar.h(i10);
                fVar.y.q = (int) j10;
                return;
            case 21682:
                fVar.h(i10);
                fVar.y.s = (int) j10;
                return;
            case 21690:
                fVar.h(i10);
                fVar.y.r = (int) j10;
                return;
            case 21930:
                fVar.h(i10);
                fVar.y.X = j10 == 1;
                return;
            case 21938:
                fVar.h(i10);
                u3.e eVar = fVar.y;
                eVar.z = true;
                eVar.p = (int) j10;
                return;
            case 21998:
                fVar.h(i10);
                fVar.y.g = (int) j10;
                return;
            case 22186:
                fVar.h(i10);
                fVar.y.T = j10;
                return;
            case 22203:
                fVar.h(i10);
                fVar.y.U = j10;
                return;
            case 25188:
                fVar.h(i10);
                fVar.y.R = (int) j10;
                return;
            case 30114:
                fVar.Z = j10;
                return;
            case 30321:
                fVar.h(i10);
                int i13 = (int) j10;
                if (i13 == 0) {
                    fVar.y.t = 0;
                    return;
                }
                if (i13 == 1) {
                    fVar.y.t = 1;
                    return;
                } else if (i13 == 2) {
                    fVar.y.t = 2;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    fVar.y.t = 3;
                    return;
                }
            case 2352003:
                fVar.h(i10);
                fVar.y.f = (int) j10;
                return;
            case 2807729:
                fVar.t = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        fVar.h(i10);
                        int i14 = (int) j10;
                        if (i14 == 1) {
                            fVar.y.C = 2;
                            return;
                        } else {
                            if (i14 != 2) {
                                return;
                            }
                            fVar.y.C = 1;
                            return;
                        }
                    case 21946:
                        fVar.h(i10);
                        int g10 = b2.o.g((int) j10);
                        if (g10 != -1) {
                            fVar.y.B = g10;
                            return;
                        }
                        return;
                    case 21947:
                        fVar.h(i10);
                        fVar.y.z = true;
                        int f7 = b2.o.f((int) j10);
                        if (f7 != -1) {
                            fVar.y.A = f7;
                            return;
                        }
                        return;
                    case 21948:
                        fVar.h(i10);
                        fVar.y.D = (int) j10;
                        return;
                    case 21949:
                        fVar.h(i10);
                        fVar.y.E = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // org.telegram.ui.os0
    public /* synthetic */ TextureView k0() {
        return null;
    }

    public void o(a0 a0Var) {
        p3 p3Var = (p3) this.a;
        p3Var.b = a0Var;
        Iterator it = ((LinkedList) p3Var.c).iterator();
        while (it.hasNext()) {
            ((x6.c) it.next()).b();
        }
        ((LinkedList) p3Var.c).clear();
    }

    public void p(long j10, int i10, long j11) {
        u3.f fVar = (u3.f) this.a;
        fVar.j0.getClass();
        if (i10 == 160) {
            fVar.Y = false;
            fVar.Z = 0L;
            return;
        }
        if (i10 == 174) {
            u3.e eVar = new u3.e();
            eVar.n = -1;
            eVar.o = -1;
            eVar.p = -1;
            eVar.q = -1;
            eVar.r = -1;
            eVar.s = 0;
            eVar.t = -1;
            eVar.u = 0.0f;
            eVar.v = 0.0f;
            eVar.w = 0.0f;
            eVar.x = null;
            eVar.y = -1;
            eVar.z = false;
            eVar.A = -1;
            eVar.B = -1;
            eVar.C = -1;
            eVar.D = 1000;
            eVar.E = zs.e3;
            eVar.F = -1.0f;
            eVar.G = -1.0f;
            eVar.H = -1.0f;
            eVar.I = -1.0f;
            eVar.J = -1.0f;
            eVar.K = -1.0f;
            eVar.L = -1.0f;
            eVar.M = -1.0f;
            eVar.N = -1.0f;
            eVar.O = -1.0f;
            eVar.Q = 1;
            eVar.R = -1;
            eVar.S = 8000;
            eVar.T = 0L;
            eVar.U = 0L;
            eVar.W = false;
            eVar.Y = true;
            eVar.Z = "eng";
            fVar.y = eVar;
            eVar.a = fVar.w;
            return;
        }
        if (i10 == 183) {
            if (fVar.z) {
                return;
            }
            fVar.g(i10);
            fVar.F = -1;
            fVar.G = -1L;
            fVar.H = -1L;
            return;
        }
        if (i10 == 187) {
            if (fVar.z) {
                return;
            }
            fVar.g(i10);
            fVar.E = -9223372036854775807L;
            return;
        }
        if (i10 == 19899) {
            fVar.A = -1;
            fVar.B = -1L;
            return;
        }
        if (i10 == 20533) {
            fVar.h(i10);
            fVar.y.i = true;
            return;
        }
        if (i10 == 21968) {
            fVar.h(i10);
            fVar.y.z = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = fVar.s;
            if (j12 != -1 && j12 != j10) {
                throw w0.a(null, "Multiple Segment elements not supported");
            }
            fVar.s = j10;
            fVar.r = j11;
            return;
        }
        if (i10 == 475249515) {
            if (fVar.z) {
                return;
            }
            fVar.D = true;
        } else if (i10 == 524531317 && !fVar.z) {
            if (fVar.d && fVar.K != -1) {
                fVar.J = true;
            } else {
                fVar.j0.G1(new t(fVar.v));
                fVar.z = true;
            }
        }
    }

    @Override // vh.t8
    public void q(boolean z10, float f7) {
        ((qh.d) this.a).a(Boolean.FALSE, Float.valueOf(f7));
    }

    @Override // jg.c
    public void s() {
        s7 s7Var = (s7) this.a;
        s7Var.A0(null, true);
        if (s7Var.v0) {
            o8 o8Var = s7Var.j2;
            o8Var.c1.f.d();
            o8Var.k0(-1, false, true);
            s7Var.v0 = false;
        }
        s7Var.L0(false);
    }

    @Override // fe.e
    public void v(int i10, float f7, float f10, fe.f fVar) {
        ((o) this.a).i0(f7);
    }

    @Override // zf.l1
    public /* synthetic */ a0.h x() {
        return null;
    }

    public void y(int i10, String str) {
        u3.f fVar = (u3.f) this.a;
        if (i10 == 134) {
            fVar.h(i10);
            fVar.y.c = str;
            return;
        }
        if (i10 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                fVar.w = str.equals("webm");
                return;
            }
            throw w0.a(null, "DocType " + str + " not supported");
        }
        if (i10 == 21358) {
            fVar.h(i10);
            fVar.y.b = str;
        } else {
            if (i10 != 2274716) {
                return;
            }
            fVar.h(i10);
            fVar.y.Z = str;
        }
    }

    @Override // vh.t8
    public /* synthetic */ void K() {
    }

    @Override // vh.t8
    public /* synthetic */ void m() {
    }

    @Override // eg.p
    public void n() {
    }

    @Override // vh.t8
    public /* synthetic */ void A(boolean z10) {
    }

    @Override // vh.t8
    public /* synthetic */ void D(float f7) {
    }

    @Override // vh.t8
    public /* synthetic */ void F(float f7) {
    }

    @Override // vh.t8
    public /* synthetic */ void J(float f7) {
    }

    @Override // vh.t8
    public /* synthetic */ void L(float f7) {
    }

    @Override // vh.t8
    public /* synthetic */ void O(long j10) {
    }

    @Override // vh.t8
    public /* synthetic */ void e(int i10) {
    }

    @Override // vh.t8
    public /* synthetic */ void f(float f7) {
    }

    @Override // eg.p
    public void g(boolean z10) {
    }

    @Override // vh.t8
    public /* synthetic */ void h(float f7) {
    }

    @Override // eg.p
    public void l(boolean z10) {
    }

    @Override // vh.t8
    public /* synthetic */ void r(float f7) {
    }

    @Override // vh.t8
    public /* synthetic */ void t(boolean z10) {
    }

    @Override // vh.t8
    public /* synthetic */ void w(float f7) {
    }

    @Override // vh.t8
    public /* synthetic */ void z(long j10) {
    }

    @Override // vh.t8
    public /* synthetic */ void B(float f7, int i10) {
    }

    @Override // vh.t8
    public /* synthetic */ void H(float f7, int i10) {
    }

    @Override // vh.t8
    public /* synthetic */ void N(int i10, long j10) {
    }

    @Override // vh.t8
    public /* synthetic */ void j(long j10, boolean z10) {
    }

    @Override // vh.t8
    public /* synthetic */ void u(float f7, int i10) {
    }
}
