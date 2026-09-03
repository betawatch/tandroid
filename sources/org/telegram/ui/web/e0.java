package org.telegram.ui.web;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import eg.z2;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import k7.q7;
import oh.h4;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.y4;
import org.telegram.ui.m9;
import org.telegram.ui.ti0;
import org.telegram.ui.u9;
import org.telegram.ui.xn;
import qh.g5;
import qh.i5;
import wh.g4;
import wh.i4;
import wh.n3;
import wh.r3;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class e0 implements u9, com.google.android.gms.common.api.internal.s, zf.m, g71, OnCompleteListener, ra.m, t5.a, th.m0, v0.i, ki, fo0, y4, wh.h0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ e0(com.google.android.gms.common.api.j jVar, Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // wh.h0
    public void B(CharSequence charSequence) {
        g4 g4Var = ((i4) this.b).D;
        if (g4Var != null) {
            n3 n3Var = (n3) g4Var;
            n3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            n3Var.a.s4(charSequence.toString());
        }
    }

    @Override // org.telegram.ui.Components.ki
    public void B0(wg wgVar) {
        int i10;
        i10 = ((p2) ((vf.k) this.b)).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(wgVar);
    }

    @Override // wh.h0
    public l9 E() {
        return (i4) this.b;
    }

    @Override // org.telegram.ui.u9
    public String E0() {
        return ((a1) this.b).f0;
    }

    @Override // wh.h0
    public wh.a G() {
        return ((i4) this.b).a;
    }

    @Override // org.telegram.ui.Components.y4
    public void I(int i10, int i11, boolean z4) {
        wh.z1 z1Var = (wh.z1) this.b;
        z1Var.s0(i10, i11, z4);
        ti0 ti0Var = z1Var.L0;
        if (ti0Var != null) {
            ti0Var.i();
            z1Var.L0 = null;
        }
    }

    @Override // org.telegram.ui.u9
    public void J(String str) {
        a1 a1Var = (a1) this.b;
        try {
            a1Var.M = System.currentTimeMillis();
            a1Var.v("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e6) {
            FileLog.e(e6);
        }
    }

    @Override // wh.h0
    public boolean L() {
        i4 i4Var = (i4) this.b;
        g4 g4Var = i4Var.D;
        if (g4Var == null) {
            return false;
        }
        wh.a aVar = i4Var.a;
        return ((n3) g4Var).a.R4();
    }

    @Override // wh.h0
    public void M(int i10, int i11) {
        i4 i4Var = (i4) this.b;
        g4 g4Var = i4Var.D;
        if (g4Var != null) {
            wh.a aVar = i4Var.a;
            wh.d2 d2Var = ((n3) g4Var).a.G3;
            if (d2Var != null) {
                d2Var.f(i10, i11);
            }
        }
    }

    @Override // wh.h0
    public void Q() {
        i4 i4Var = (i4) this.b;
        g4 g4Var = i4Var.D;
        if (g4Var != null) {
            wh.a aVar = i4Var.a;
            r3 r3Var = ((n3) g4Var).a;
            wh.d2 d2Var = r3Var.G3;
            if (d2Var != null) {
                d2Var.g();
            }
            r3Var.e3.onContentChanged();
        }
    }

    @Override // wh.h0
    public void W() {
        i4 i4Var = (i4) this.b;
        g4 g4Var = i4Var.D;
        if (g4Var != null) {
            wh.a aVar = i4Var.a;
            r3.N1(((n3) g4Var).a);
        }
    }

    @Override // th.m0
    public void a(long j10) {
        ((th.q) this.b).presentFragment(xn.R9(j10));
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 2:
                p6.b bVar = new p6.b(0, (TaskCompletionSource) obj2);
                b7.r1 r1Var = (b7.r1) ((b7.q1) obj).u();
                q6.v vVar = (q6.v) this.b;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(r1Var.b);
                int i10 = b7.l.a;
                obtain.writeStrongBinder(bVar);
                obtain.writeInt(1);
                vVar.writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    r1Var.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
            case 4:
                u5.x xVar = (u5.x) obj;
                u5.f fVar = (u5.f) xVar.u();
                q5.e0 e0Var = ((q5.f0) this.b).k;
                Parcel M0 = fVar.M0();
                com.google.android.gms.internal.cast.s.d(M0, e0Var);
                fVar.R0(M0, 18);
                u5.f fVar2 = (u5.f) xVar.u();
                fVar2.R0(fVar2.M0(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                return;
            case 14:
                u5.r rVar = new u5.r(2, (TaskCompletionSource) obj2);
                u5.i iVar = (u5.i) ((u5.t) obj).u();
                String[] strArr = (String[]) this.b;
                Parcel M02 = iVar.M0();
                com.google.android.gms.internal.cast.s.d(M02, rVar);
                M02.writeStringArray(strArr);
                iVar.R0(M02, 7);
                return;
            case 16:
                u6.f fVar3 = (u6.f) this.b;
                v6.f fVar4 = new v6.f(0, (TaskCompletionSource) obj2);
                v6.d dVar = (v6.d) ((v6.e) obj).u();
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i11 = e7.a.a;
                obtain3.writeStrongBinder(fVar4);
                e7.a.b(obtain3, fVar3);
                e7.a.b(obtain3, gVar);
                ((v6.b) dVar).E0(obtain3, 6);
                return;
            default:
                w6.b bVar2 = (w6.b) this.b;
                w6.a aVar = new w6.a((TaskCompletionSource) obj2);
                w6.i iVar2 = (w6.i) ((w6.c) obj).u();
                String str = bVar2.k;
                Parcel I0 = iVar2.I0();
                int i12 = w6.f.a;
                I0.writeStrongBinder(aVar);
                I0.writeString(str);
                iVar2.J0(I0, 2);
                return;
        }
    }

    @Override // org.telegram.ui.Components.fo0
    public void b(float f10) {
        wh.y yVar = (wh.y) this.b;
        MessageObject messageObject = yVar.M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f10;
        MediaController.getInstance().seekToProgress(yVar.M, f10);
    }

    @Override // org.telegram.ui.Components.ki
    public /* synthetic */ boolean b2() {
        return false;
    }

    @Override // wh.h0
    public void c(wh.e1 e1Var) {
        g4 g4Var = ((i4) this.b).D;
        if (g4Var != null) {
            r3 r3Var = ((n3) g4Var).a;
            r3.L1(r3Var, e1Var);
            r3Var.e3.h(e1Var, true);
        }
    }

    @Override // th.m0
    public void close() {
        ((th.q) this.b).finishFragment();
    }

    @Override // org.telegram.ui.Components.fo0
    public void d(float f10) {
        MessageObject messageObject = ((wh.y) this.b).M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f10;
    }

    @Override // th.m0
    public void e() {
        th.q qVar = (th.q) this.b;
        xd.a aVar = qVar.a;
        th.n0 n0Var = qVar.v;
        aVar.a(n0Var.n && n0Var.l == 0, true);
        qVar.d.V2.N(true);
    }

    @Override // org.telegram.ui.u9
    public /* synthetic */ boolean e1(String str, m9 m9Var) {
        return false;
    }

    @Override // wh.h0
    public void f() {
        i4 i4Var = (i4) this.b;
        g4 g4Var = i4Var.D;
        if (g4Var != null) {
            r3.O1(((n3) g4Var).a, i4Var.a);
        }
    }

    public void g(int i10, int i11, r3.l lVar) {
        char c3;
        char c10;
        long j10;
        int i12;
        int i13;
        int i14;
        int i15;
        x3.d dVar = (x3.d) this.b;
        x3.e eVar = dVar.b;
        SparseArray sparseArray = dVar.c;
        h5.w wVar = dVar.i;
        h5.w wVar2 = dVar.g;
        int i16 = 1;
        int i17 = 0;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (dVar.G != 2) {
                    return;
                }
                x3.c cVar = (x3.c) sparseArray.get(dVar.M);
                int i18 = dVar.P;
                h5.w wVar3 = dVar.n;
                if (i18 != 4 || !"V_VP9".equals(cVar.b)) {
                    lVar.s(i11);
                    return;
                } else {
                    wVar3.C(i11);
                    lVar.readFully(wVar3.a, 0, i11);
                    return;
                }
            }
            if (i10 == 16877) {
                dVar.b(i10);
                x3.c cVar2 = dVar.u;
                int i19 = cVar2.g;
                if (i19 != 1685485123 && i19 != 1685480259) {
                    lVar.s(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                cVar2.N = bArr;
                lVar.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 16981) {
                dVar.b(i10);
                byte[] bArr2 = new byte[i11];
                dVar.u.i = bArr2;
                lVar.readFully(bArr2, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr3 = new byte[i11];
                lVar.readFully(bArr3, 0, i11);
                dVar.b(i10);
                dVar.u.j = new r3.u(1, 0, 0, bArr3);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(wVar.a, (byte) 0);
                lVar.readFully(wVar.a, 4 - i11, i11);
                wVar.F(0);
                dVar.w = (int) wVar.v();
                return;
            }
            if (i10 == 25506) {
                dVar.b(i10);
                byte[] bArr4 = new byte[i11];
                dVar.u.k = bArr4;
                lVar.readFully(bArr4, 0, i11);
                return;
            }
            if (i10 != 30322) {
                throw j3.r1.a("Unexpected id: " + i10, null);
            }
            dVar.b(i10);
            byte[] bArr5 = new byte[i11];
            dVar.u.v = bArr5;
            lVar.readFully(bArr5, 0, i11);
            return;
        }
        if (dVar.G == 0) {
            dVar.M = (int) eVar.b(lVar, false, true, 8);
            dVar.N = eVar.c;
            dVar.I = -9223372036854775807L;
            dVar.G = 1;
            wVar2.C(0);
        }
        x3.c cVar3 = (x3.c) sparseArray.get(dVar.M);
        if (cVar3 == null) {
            lVar.s(i11 - dVar.N);
            dVar.G = 0;
            return;
        }
        cVar3.X.getClass();
        if (dVar.G == 1) {
            dVar.g(lVar, 3);
            int i20 = (wVar2.a[2] & 6) >> 1;
            byte b10 = 255;
            if (i20 == 0) {
                dVar.K = 1;
                int[] iArr = dVar.L;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.L = iArr;
                iArr[0] = (i11 - dVar.N) - 3;
            } else {
                dVar.g(lVar, 4);
                int i21 = (wVar2.a[3] & 255) + 1;
                dVar.K = i21;
                int[] iArr2 = dVar.L;
                if (iArr2 == null) {
                    iArr2 = new int[i21];
                } else if (iArr2.length < i21) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i21)];
                }
                dVar.L = iArr2;
                if (i20 == 2) {
                    int i22 = (i11 - dVar.N) - 4;
                    int i23 = dVar.K;
                    Arrays.fill(iArr2, 0, i23, i22 / i23);
                } else {
                    if (i20 != 1) {
                        if (i20 != 3) {
                            throw j3.r1.a("Unexpected lacing value: " + i20, null);
                        }
                        int i24 = 0;
                        int i25 = 0;
                        int i26 = 4;
                        while (true) {
                            int i27 = dVar.K - i16;
                            if (i24 >= i27) {
                                c3 = 1;
                                c10 = 0;
                                dVar.L[i27] = ((i11 - dVar.N) - i26) - i25;
                                break;
                            }
                            dVar.L[i24] = i17;
                            int i28 = i26 + 1;
                            dVar.g(lVar, i28);
                            if (wVar2.a[i26] == 0) {
                                throw j3.r1.a("No valid varint length mask found", null);
                            }
                            int i29 = 0;
                            while (true) {
                                if (i29 >= 8) {
                                    j10 = 0;
                                    i12 = i28;
                                    break;
                                }
                                int i30 = 1 << (7 - i29);
                                if ((wVar2.a[i26] & i30) != 0) {
                                    i12 = i28 + i29;
                                    dVar.g(lVar, i12);
                                    j10 = wVar2.a[i26] & b10 & (~i30);
                                    while (i28 < i12) {
                                        j10 = (j10 << 8) | (wVar2.a[i28] & b10);
                                        i28++;
                                        b10 = 255;
                                    }
                                    if (i24 > 0) {
                                        j10 -= (1 << ((i29 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i29++;
                                    b10 = 255;
                                }
                            }
                            if (j10 < -2147483648L || j10 > 2147483647L) {
                                break;
                            }
                            int i31 = (int) j10;
                            int[] iArr3 = dVar.L;
                            if (i24 != 0) {
                                i31 += iArr3[i24 - 1];
                            }
                            iArr3[i24] = i31;
                            i25 += i31;
                            i24++;
                            i26 = i12;
                            b10 = 255;
                            i16 = 1;
                            i17 = 0;
                        }
                        throw j3.r1.a("EBML lacing sample size out of range.", null);
                    }
                    int i32 = 0;
                    int i33 = 0;
                    int i34 = 4;
                    while (true) {
                        i13 = dVar.K - 1;
                        if (i32 >= i13) {
                            break;
                        }
                        dVar.L[i32] = 0;
                        while (true) {
                            i14 = i34 + 1;
                            dVar.g(lVar, i14);
                            int i35 = wVar2.a[i34] & 255;
                            int[] iArr4 = dVar.L;
                            i15 = iArr4[i32] + i35;
                            iArr4[i32] = i15;
                            if (i35 != 255) {
                                break;
                            } else {
                                i34 = i14;
                            }
                        }
                        i33 += i15;
                        i32++;
                        i34 = i14;
                    }
                    dVar.L[i13] = ((i11 - dVar.N) - i34) - i33;
                }
            }
            c3 = 1;
            c10 = 0;
            byte[] bArr6 = wVar2.a;
            dVar.H = dVar.k((bArr6[c3] & 255) | (bArr6[c10] << 8)) + dVar.B;
            dVar.O = (cVar3.d == 2 || (i10 == 163 && (wVar2.a[2] & 128) == 128)) ? 1 : 0;
            dVar.G = 2;
            dVar.J = 0;
        }
        if (i10 == 163) {
            while (true) {
                int i36 = dVar.J;
                if (i36 >= dVar.K) {
                    dVar.G = 0;
                    return;
                } else {
                    dVar.c(cVar3, ((dVar.J * cVar3.e) / MediaDataController.MAX_STYLE_RUNS_COUNT) + dVar.H, dVar.O, dVar.l(lVar, cVar3, dVar.L[i36], false), 0);
                    dVar.J++;
                }
            }
        } else {
            while (true) {
                int i37 = dVar.J;
                if (i37 >= dVar.K) {
                    return;
                }
                int[] iArr5 = dVar.L;
                iArr5[i37] = dVar.l(lVar, cVar3, iArr5[i37], true);
                dVar.J++;
            }
        }
    }

    public void h(int i10, long j10) {
        x3.d dVar = (x3.d) this.b;
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw j3.r1.a("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw j3.r1.a("ContentEncodingScope " + j10 + " not supported", null);
        }
        switch (i10) {
            case 131:
                dVar.b(i10);
                dVar.u.d = (int) j10;
                return;
            case 136:
                dVar.b(i10);
                dVar.u.V = j10 == 1;
                return;
            case 155:
                dVar.I = dVar.k(j10);
                return;
            case 159:
                dVar.b(i10);
                dVar.u.O = (int) j10;
                return;
            case 176:
                dVar.b(i10);
                dVar.u.m = (int) j10;
                return;
            case 179:
                dVar.a(i10);
                dVar.C.c(dVar.k(j10));
                return;
            case 186:
                dVar.b(i10);
                dVar.u.n = (int) j10;
                return;
            case 215:
                dVar.b(i10);
                dVar.u.c = (int) j10;
                return;
            case 231:
                dVar.B = dVar.k(j10);
                return;
            case 238:
                dVar.P = (int) j10;
                return;
            case 241:
                if (dVar.E) {
                    return;
                }
                dVar.a(i10);
                dVar.D.c(j10);
                dVar.E = true;
                return;
            case 251:
                dVar.Q = true;
                return;
            case 16871:
                dVar.b(i10);
                dVar.u.g = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw j3.r1.a("ContentCompAlgo " + j10 + " not supported", null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw j3.r1.a("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw j3.r1.a("EBMLReadVersion " + j10 + " not supported", null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw j3.r1.a("ContentEncAlgo " + j10 + " not supported", null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw j3.r1.a("AESSettingsCipherMode " + j10 + " not supported", null);
            case 21420:
                dVar.x = j10 + dVar.q;
                return;
            case 21432:
                int i11 = (int) j10;
                dVar.b(i10);
                if (i11 == 0) {
                    dVar.u.w = 0;
                    return;
                }
                if (i11 == 1) {
                    dVar.u.w = 2;
                    return;
                } else if (i11 == 3) {
                    dVar.u.w = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    dVar.u.w = 3;
                    return;
                }
            case 21680:
                dVar.b(i10);
                dVar.u.o = (int) j10;
                return;
            case 21682:
                dVar.b(i10);
                dVar.u.q = (int) j10;
                return;
            case 21690:
                dVar.b(i10);
                dVar.u.p = (int) j10;
                return;
            case 21930:
                dVar.b(i10);
                dVar.u.U = j10 == 1;
                return;
            case 21998:
                dVar.b(i10);
                dVar.u.f = (int) j10;
                return;
            case 22186:
                dVar.b(i10);
                dVar.u.R = j10;
                return;
            case 22203:
                dVar.b(i10);
                dVar.u.S = j10;
                return;
            case 25188:
                dVar.b(i10);
                dVar.u.P = (int) j10;
                return;
            case 30114:
                dVar.R = j10;
                return;
            case 30321:
                dVar.b(i10);
                int i12 = (int) j10;
                if (i12 == 0) {
                    dVar.u.r = 0;
                    return;
                }
                if (i12 == 1) {
                    dVar.u.r = 1;
                    return;
                } else if (i12 == 2) {
                    dVar.u.r = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    dVar.u.r = 3;
                    return;
                }
            case 2352003:
                dVar.b(i10);
                dVar.u.e = (int) j10;
                return;
            case 2807729:
                dVar.r = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        dVar.b(i10);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            dVar.u.A = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            dVar.u.A = 1;
                            return;
                        }
                    case 21946:
                        dVar.b(i10);
                        int c3 = i5.b.c((int) j10);
                        if (c3 != -1) {
                            dVar.u.z = c3;
                            return;
                        }
                        return;
                    case 21947:
                        dVar.b(i10);
                        dVar.u.x = true;
                        int b10 = i5.b.b((int) j10);
                        if (b10 != -1) {
                            dVar.u.y = b10;
                            return;
                        }
                        return;
                    case 21948:
                        dVar.b(i10);
                        dVar.u.B = (int) j10;
                        return;
                    case 21949:
                        dVar.b(i10);
                        dVar.u.C = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // org.telegram.ui.Components.ki
    public /* synthetic */ boolean h0() {
        return false;
    }

    public p9.a i(JSONObject jSONObject) {
        p9.b aVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            aVar = new z9.d(18);
        } else {
            aVar = new ab.a(19);
        }
        return aVar.f((db.a) this.b, jSONObject);
    }

    public void j() {
        s5.h hVar = (s5.h) this.b;
        Iterator it = hVar.h.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        Iterator it2 = hVar.i.iterator();
        while (it2.hasNext()) {
            ((s5.g) it2.next()).a();
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        r5.c.h((r5.c) ((r5.j) this.b).c, "launchApplication", task);
    }

    @Override // org.telegram.ui.u9
    public void onDismiss() {
        a1 a1Var = (a1) this.b;
        a1Var.v("scan_qr_popup_closed", null);
        a1Var.e0 = false;
    }

    @Override // v0.i
    public void onError(Object obj) {
        w0.d e6 = (w0.d) obj;
        kotlin.jvm.internal.j.e(e6, "e");
        ld.m mVar = (ld.m) this.b;
        if (mVar.w()) {
            mVar.resumeWith(q7.a(e6));
        }
    }

    @Override // org.telegram.ui.Components.g71
    public /* synthetic */ void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override // v0.i
    public void onResult(Object obj) {
        v0.c result = (v0.c) obj;
        kotlin.jvm.internal.j.e(result, "result");
        ld.m mVar = (ld.m) this.b;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }

    @Override // org.telegram.ui.Components.g71
    public void onStateChanged(boolean z4, int i10) {
        i5 i5Var = (i5) this.b;
        g5 g5Var = i5Var.J;
        j71 j71Var = i5Var.x;
        if (j71Var == null) {
            return;
        }
        if (j71Var.y()) {
            AndroidUtilities.runOnUIThread(g5Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(g5Var);
        }
    }

    @Override // org.telegram.ui.Components.g71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.g71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        i5 i5Var = (i5) this.b;
        i5Var.getClass();
        i5Var.getClass();
        z2 z2Var = i5Var.w;
        if (z2Var != null) {
            float f11 = i10 / i11;
            if (Math.abs(z2Var.v0 - f11) >= 1.0E-4f) {
                z2Var.v0 = f11;
                z2Var.requestLayout();
            }
        }
    }

    @Override // t5.a
    public void t(Bitmap bitmap) {
        ((t5.h) this.b).e(bitmap, 3);
    }

    @Override // zf.m
    public void w() {
        ((qh.f0) this.b).e.invalidate();
    }

    @Override // ra.m
    public Object y2() {
        Type type = (Type) this.b;
        if (!(type instanceof ParameterizedType)) {
            throw new pa.j("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new pa.j("Invalid EnumMap type: " + type.toString());
    }

    @Override // wh.h0
    public org.telegram.ui.Cells.m9 z() {
        g4 g4Var = ((i4) this.b).D;
        if (g4Var != null) {
            return ((n3) g4Var).a.getTextSelectionHelper();
        }
        return null;
    }

    public /* synthetic */ e0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.g71
    public void onRenderedFirstFrame() {
    }

    public /* synthetic */ e0(h4 h4Var) {
        this.a = 1;
        this.b = (com.google.android.gms.internal.play_billing.r) h4Var.b;
    }

    public e0(int i10) {
        this.a = i10;
        switch (i10) {
            case 23:
                break;
            default:
                this.b = new t4.d(5, 1.0f, false);
                break;
        }
    }

    @Override // org.telegram.ui.Components.g71
    public void onError(j71 j71Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.ki
    public /* synthetic */ void Q0() {
    }

    @Override // zf.m
    public void S() {
    }

    @Override // org.telegram.ui.Components.ki
    public /* synthetic */ void y0() {
    }

    @Override // zf.m
    public void F(boolean z4) {
    }

    @Override // zf.m
    public void N(boolean z4) {
    }

    @Override // org.telegram.ui.u9
    public /* synthetic */ void P0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.Components.ki
    public /* synthetic */ void Z0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ki
    public /* synthetic */ void o1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.g71
    public /* synthetic */ void onSeekFinished(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.g71
    public /* synthetic */ void onSeekStarted(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.g71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.ki
    public /* synthetic */ void f2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }

    @Override // org.telegram.ui.Components.ki
    public void I1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
    }
}
