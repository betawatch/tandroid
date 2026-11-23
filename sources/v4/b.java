package v4;

import a8.m8;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Arrays;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class b implements e0, k1, q5.b, com.google.android.gms.common.api.internal.q {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ b() {
        this.a = 7;
    }

    @Override // v4.e0
    public void V(int i7, int i10) {
        ((i0) this.b).o(i7, i10);
    }

    @Override // v4.e0
    public void V0(int i7, int i10) {
        ((i0) this.b).n(i7, i10, null);
    }

    public void a(int i7, int i10, f3.p pVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j3;
        int i16;
        int i17;
        int i18;
        int i19;
        x3.f fVar = (x3.f) this.b;
        x3.g gVar = fVar.b;
        SparseArray sparseArray = fVar.c;
        h2.x xVar = fVar.k;
        h2.x xVar2 = fVar.i;
        int i20 = 2;
        int i21 = 0;
        int i22 = 1;
        if (i7 != 161 && i7 != 163) {
            if (i7 == 165) {
                if (fVar.O != 2) {
                    return;
                }
                x3.e eVar = (x3.e) sparseArray.get(fVar.U);
                int i23 = fVar.X;
                h2.x xVar3 = fVar.p;
                if (i23 != 4 || !"V_VP9".equals(eVar.c)) {
                    pVar.q(i10);
                    return;
                } else {
                    xVar3.K(i10);
                    pVar.readFully(xVar3.a, 0, i10);
                    return;
                }
            }
            if (i7 == 16877) {
                fVar.h(i7);
                x3.e eVar2 = fVar.y;
                int i24 = eVar2.h;
                if (i24 != 1685485123 && i24 != 1685480259) {
                    pVar.q(i10);
                    return;
                }
                byte[] bArr = new byte[i10];
                eVar2.P = bArr;
                pVar.readFully(bArr, 0, i10);
                return;
            }
            if (i7 == 16981) {
                fVar.h(i7);
                byte[] bArr2 = new byte[i10];
                fVar.y.j = bArr2;
                pVar.readFully(bArr2, 0, i10);
                return;
            }
            if (i7 == 18402) {
                byte[] bArr3 = new byte[i10];
                pVar.readFully(bArr3, 0, i10);
                fVar.h(i7);
                fVar.y.k = new f3.i0(1, 0, 0, bArr3);
                return;
            }
            if (i7 == 21419) {
                Arrays.fill(xVar.a, (byte) 0);
                pVar.readFully(xVar.a, 4 - i10, i10);
                xVar.N(0);
                fVar.A = (int) xVar.C();
                return;
            }
            if (i7 == 25506) {
                fVar.h(i7);
                byte[] bArr4 = new byte[i10];
                fVar.y.l = bArr4;
                pVar.readFully(bArr4, 0, i10);
                return;
            }
            if (i7 != 30322) {
                throw e2.t0.a(null, "Unexpected id: " + i7);
            }
            fVar.h(i7);
            byte[] bArr5 = new byte[i10];
            fVar.y.x = bArr5;
            pVar.readFully(bArr5, 0, i10);
            return;
        }
        if (fVar.O == 0) {
            fVar.U = (int) gVar.b(pVar, false, true, 8);
            fVar.V = gVar.c;
            fVar.Q = -9223372036854775807L;
            fVar.O = 1;
            xVar2.K(0);
        }
        x3.e eVar3 = (x3.e) sparseArray.get(fVar.U);
        if (eVar3 == null) {
            pVar.q(i10 - fVar.V);
            fVar.O = 0;
            return;
        }
        eVar3.a0.getClass();
        if (fVar.O == 1) {
            fVar.l(pVar, 3);
            int i25 = (xVar2.a[2] & 6) >> 1;
            byte b10 = 255;
            if (i25 == 0) {
                fVar.S = 1;
                int[] iArr = fVar.T;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                fVar.T = iArr;
                iArr[0] = (i10 - fVar.V) - 3;
            } else {
                fVar.l(pVar, 4);
                int i26 = (xVar2.a[3] & ks.e4) + 1;
                fVar.S = i26;
                int[] iArr2 = fVar.T;
                if (iArr2 == null) {
                    iArr2 = new int[i26];
                } else if (iArr2.length < i26) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i26)];
                }
                fVar.T = iArr2;
                if (i25 == 2) {
                    int i27 = (i10 - fVar.V) - 4;
                    int i28 = fVar.S;
                    Arrays.fill(iArr2, 0, i28, i27 / i28);
                } else {
                    if (i25 != 1) {
                        if (i25 != 3) {
                            throw e2.t0.a(null, "Unexpected lacing value: " + i25);
                        }
                        int i29 = 0;
                        int i30 = 0;
                        int i31 = 4;
                        while (true) {
                            int i32 = fVar.S - i22;
                            if (i29 >= i32) {
                                i11 = i20;
                                i12 = i21;
                                i13 = i22;
                                fVar.T[i32] = ((i10 - fVar.V) - i31) - i30;
                                break;
                            }
                            fVar.T[i29] = i21;
                            int i33 = i31 + 1;
                            fVar.l(pVar, i33);
                            if (xVar2.a[i31] == 0) {
                                throw e2.t0.a(null, "No valid varint length mask found");
                            }
                            int i34 = i21;
                            while (true) {
                                if (i34 >= 8) {
                                    i14 = i20;
                                    i15 = i22;
                                    j3 = 0;
                                    i16 = i33;
                                    break;
                                }
                                int i35 = i22 << (7 - i34);
                                i14 = i20;
                                if ((xVar2.a[i31] & i35) != 0) {
                                    int i36 = i33 + i34;
                                    fVar.l(pVar, i36);
                                    i15 = i22;
                                    j3 = xVar2.a[i31] & b10 & (~i35);
                                    while (i33 < i36) {
                                        j3 = (j3 << 8) | (xVar2.a[i33] & b10);
                                        i33++;
                                        i36 = i36;
                                        b10 = 255;
                                    }
                                    i16 = i36;
                                    if (i29 > 0) {
                                        j3 -= (1 << ((i34 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i34++;
                                    i20 = i14;
                                    b10 = 255;
                                }
                            }
                            if (j3 < -2147483648L || j3 > 2147483647L) {
                                break;
                            }
                            int i37 = (int) j3;
                            int[] iArr3 = fVar.T;
                            if (i29 != 0) {
                                i37 += iArr3[i29 - 1];
                            }
                            iArr3[i29] = i37;
                            i30 += i37;
                            i29++;
                            i21 = i34;
                            i20 = i14;
                            i22 = i15;
                            i31 = i16;
                            b10 = 255;
                        }
                        throw e2.t0.a(null, "EBML lacing sample size out of range.");
                    }
                    int i38 = 0;
                    int i39 = 0;
                    int i40 = 4;
                    while (true) {
                        i17 = fVar.S - 1;
                        if (i38 >= i17) {
                            break;
                        }
                        fVar.T[i38] = 0;
                        while (true) {
                            i18 = i40 + 1;
                            fVar.l(pVar, i18);
                            int i41 = xVar2.a[i40] & 255;
                            int[] iArr4 = fVar.T;
                            i19 = iArr4[i38] + i41;
                            iArr4[i38] = i19;
                            if (i41 != 255) {
                                break;
                            } else {
                                i40 = i18;
                            }
                        }
                        i39 += i19;
                        i38++;
                        i40 = i18;
                    }
                    fVar.T[i17] = ((i10 - fVar.V) - i40) - i39;
                }
            }
            i11 = 2;
            i12 = 0;
            i13 = 1;
            byte[] bArr6 = xVar2.a;
            fVar.P = fVar.n((bArr6[i13] & 255) | (bArr6[i12] << 8)) + fVar.M;
            fVar.W = (eVar3.e == i13 || (i7 == 163 && (xVar2.a[i11] & 128) == 128)) ? 1 : i12;
            fVar.O = i11;
            fVar.R = i12;
        }
        if (i7 == 163) {
            while (true) {
                int i42 = fVar.R;
                if (i42 >= fVar.S) {
                    fVar.O = 0;
                    return;
                } else {
                    fVar.i(eVar3, ((fVar.R * eVar3.f) / 1000) + fVar.P, fVar.W, fVar.o(pVar, eVar3, fVar.T[i42], false), 0);
                    fVar.R++;
                }
            }
        } else {
            while (true) {
                int i43 = fVar.R;
                if (i43 >= fVar.S) {
                    return;
                }
                int[] iArr5 = fVar.T;
                iArr5[i43] = fVar.o(pVar, eVar3, iArr5[i43], true);
                fVar.R++;
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        y8.e eVar = (y8.e) this.b;
        h8.b bVar = (h8.b) obj;
        bVar.getClass();
        h8.a aVar = new h8.a(1, (TaskCompletionSource) obj2);
        try {
            h8.i iVar = (h8.i) bVar.n();
            Bundle B = bVar.B();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            int i7 = h8.c.a;
            obtain.writeInt(1);
            eVar.writeToParcel(obtain, 0);
            obtain.writeInt(1);
            B.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aVar);
            try {
                iVar.a.transact(14, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e10) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e10);
            Bundle bundle = Bundle.EMPTY;
            m8.a(Status.h, Boolean.FALSE, aVar.b);
        }
    }

    public void b(int i7, long j3) {
        x3.f fVar = (x3.f) this.b;
        if (i7 == 240) {
            if (fVar.z) {
                return;
            }
            fVar.g(i7);
            if (fVar.H == -1) {
                fVar.H = j3;
                return;
            }
            return;
        }
        if (i7 == 241) {
            if (fVar.z) {
                return;
            }
            fVar.g(i7);
            if (fVar.G == -1) {
                fVar.G = j3;
                return;
            }
            return;
        }
        if (i7 == 20529) {
            if (j3 == 0) {
                return;
            }
            throw e2.t0.a(null, "ContentEncodingOrder " + j3 + " not supported");
        }
        if (i7 == 20530) {
            if (j3 == 1) {
                return;
            }
            throw e2.t0.a(null, "ContentEncodingScope " + j3 + " not supported");
        }
        switch (i7) {
            case ks.P1 /* 131 */:
                int i10 = (int) j3;
                if (i10 == 1) {
                    fVar.h(i7);
                    fVar.y.e = 2;
                    return;
                }
                if (i10 == 2) {
                    fVar.h(i7);
                    fVar.y.e = 1;
                    return;
                } else if (i10 == 17) {
                    fVar.h(i7);
                    fVar.y.e = 3;
                    return;
                } else if (i10 != 33) {
                    fVar.h(i7);
                    fVar.y.e = -1;
                    return;
                } else {
                    fVar.h(i7);
                    fVar.y.e = 5;
                    return;
                }
            case ks.S1 /* 136 */:
                fVar.h(i7);
                fVar.y.Y = j3 == 1;
                return;
            case ks.l2 /* 155 */:
                fVar.Q = fVar.n(j3);
                return;
            case ks.p2 /* 159 */:
                fVar.h(i7);
                fVar.y.Q = (int) j3;
                return;
            case ks.G2 /* 176 */:
                fVar.h(i7);
                fVar.y.n = (int) j3;
                return;
            case ks.J2 /* 179 */:
                if (fVar.z) {
                    return;
                }
                fVar.g(i7);
                fVar.E = fVar.n(j3);
                return;
            case ks.Q2 /* 186 */:
                fVar.h(i7);
                fVar.y.o = (int) j3;
                return;
            case ks.s3 /* 215 */:
                fVar.h(i7);
                fVar.y.d = (int) j3;
                return;
            case ks.H3 /* 231 */:
                fVar.M = fVar.n(j3);
                return;
            case ks.N3 /* 238 */:
                fVar.X = (int) j3;
                return;
            case ks.W3 /* 247 */:
                if (fVar.z) {
                    return;
                }
                fVar.g(i7);
                fVar.F = (int) j3;
                return;
            case ks.a4 /* 251 */:
                fVar.Y = true;
                return;
            case 16871:
                fVar.h(i7);
                fVar.y.h = (int) j3;
                return;
            case 16980:
                if (j3 == 3) {
                    return;
                }
                throw e2.t0.a(null, "ContentCompAlgo " + j3 + " not supported");
            case 17029:
                if (j3 < 1 || j3 > 2) {
                    throw e2.t0.a(null, "DocTypeReadVersion " + j3 + " not supported");
                }
                return;
            case 17143:
                if (j3 == 1) {
                    return;
                }
                throw e2.t0.a(null, "EBMLReadVersion " + j3 + " not supported");
            case 18401:
                if (j3 == 5) {
                    return;
                }
                throw e2.t0.a(null, "ContentEncAlgo " + j3 + " not supported");
            case 18408:
                if (j3 == 1) {
                    return;
                }
                throw e2.t0.a(null, "AESSettingsCipherMode " + j3 + " not supported");
            case 21420:
                fVar.B = j3 + fVar.s;
                return;
            case 21432:
                int i11 = (int) j3;
                fVar.h(i7);
                if (i11 == 0) {
                    fVar.y.y = 0;
                    return;
                }
                if (i11 == 1) {
                    fVar.y.y = 2;
                    return;
                } else if (i11 == 3) {
                    fVar.y.y = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    fVar.y.y = 3;
                    return;
                }
            case 21680:
                fVar.h(i7);
                fVar.y.q = (int) j3;
                return;
            case 21682:
                fVar.h(i7);
                fVar.y.s = (int) j3;
                return;
            case 21690:
                fVar.h(i7);
                fVar.y.r = (int) j3;
                return;
            case 21930:
                fVar.h(i7);
                fVar.y.X = j3 == 1;
                return;
            case 21938:
                fVar.h(i7);
                x3.e eVar = fVar.y;
                eVar.z = true;
                eVar.p = (int) j3;
                return;
            case 21998:
                fVar.h(i7);
                fVar.y.g = (int) j3;
                return;
            case 22186:
                fVar.h(i7);
                fVar.y.T = j3;
                return;
            case 22203:
                fVar.h(i7);
                fVar.y.U = j3;
                return;
            case 25188:
                fVar.h(i7);
                fVar.y.R = (int) j3;
                return;
            case 30114:
                fVar.Z = j3;
                return;
            case 30321:
                fVar.h(i7);
                int i12 = (int) j3;
                if (i12 == 0) {
                    fVar.y.t = 0;
                    return;
                }
                if (i12 == 1) {
                    fVar.y.t = 1;
                    return;
                } else if (i12 == 2) {
                    fVar.y.t = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    fVar.y.t = 3;
                    return;
                }
            case 2352003:
                fVar.h(i7);
                fVar.y.f = (int) j3;
                return;
            case 2807729:
                fVar.t = j3;
                return;
            default:
                switch (i7) {
                    case 21945:
                        fVar.h(i7);
                        int i13 = (int) j3;
                        if (i13 == 1) {
                            fVar.y.C = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            fVar.y.C = 1;
                            return;
                        }
                    case 21946:
                        fVar.h(i7);
                        int g10 = e2.m.g((int) j3);
                        if (g10 != -1) {
                            fVar.y.B = g10;
                            return;
                        }
                        return;
                    case 21947:
                        fVar.h(i7);
                        fVar.y.z = true;
                        int f10 = e2.m.f((int) j3);
                        if (f10 != -1) {
                            fVar.y.A = f10;
                            return;
                        }
                        return;
                    case 21948:
                        fVar.h(i7);
                        fVar.y.D = (int) j3;
                        return;
                    case 21949:
                        fVar.h(i7);
                        fVar.y.E = (int) j3;
                        return;
                    default:
                        return;
                }
        }
    }

    public void c(int i7) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i7);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i7);
    }

    @Override // v4.k1
    public int d(View view) {
        return p0.x(view) - ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).leftMargin;
    }

    public void e(long j3, int i7, long j10) {
        x3.f fVar = (x3.f) this.b;
        fVar.j0.getClass();
        if (i7 == 160) {
            fVar.Y = false;
            fVar.Z = 0L;
            return;
        }
        if (i7 == 174) {
            x3.e eVar = new x3.e();
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
            eVar.E = ks.e3;
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
        if (i7 == 183) {
            if (fVar.z) {
                return;
            }
            fVar.g(i7);
            fVar.F = -1;
            fVar.G = -1L;
            fVar.H = -1L;
            return;
        }
        if (i7 == 187) {
            if (fVar.z) {
                return;
            }
            fVar.g(i7);
            fVar.E = -9223372036854775807L;
            return;
        }
        if (i7 == 19899) {
            fVar.A = -1;
            fVar.B = -1L;
            return;
        }
        if (i7 == 20533) {
            fVar.h(i7);
            fVar.y.i = true;
            return;
        }
        if (i7 == 21968) {
            fVar.h(i7);
            fVar.y.z = true;
            return;
        }
        if (i7 == 408125543) {
            long j11 = fVar.s;
            if (j11 != -1 && j11 != j3) {
                throw e2.t0.a(null, "Multiple Segment elements not supported");
            }
            fVar.s = j3;
            fVar.r = j10;
            return;
        }
        if (i7 == 475249515) {
            if (fVar.z) {
                return;
            }
            fVar.D = true;
        } else if (i7 == 524531317 && !fVar.z) {
            if (fVar.d && fVar.K != -1) {
                fVar.J = true;
            } else {
                fVar.j0.h(new f3.t(fVar.v));
                fVar.z = true;
            }
        }
    }

    public void f(int i7, String str) {
        x3.f fVar = (x3.f) this.b;
        if (i7 == 134) {
            fVar.h(i7);
            fVar.y.c = str;
            return;
        }
        if (i7 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                fVar.w = str.equals("webm");
                return;
            }
            throw e2.t0.a(null, "DocType " + str + " not supported");
        }
        if (i7 == 21358) {
            fVar.h(i7);
            fVar.y.b = str;
        } else {
            if (i7 != 2274716) {
                return;
            }
            fVar.h(i7);
            fVar.y.Z = str;
        }
    }

    @Override // fd.a
    public Object get() {
        return new v5.i(Integer.valueOf(v5.i.d).intValue(), (Context) ((fd.a) this.b).get(), "com.google.android.datatransport.events");
    }

    @Override // v4.k1
    public int i() {
        return ((p0) this.b).D();
    }

    @Override // v4.k1
    public int k() {
        p0 p0Var = (p0) this.b;
        return p0Var.m - p0Var.E();
    }

    @Override // v4.k1
    public View l(int i7) {
        return ((p0) this.b).q(i7);
    }

    @Override // v4.k1
    public int m(View view) {
        return p0.y(view) + ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).rightMargin;
    }

    public String toString() {
        switch (this.a) {
            case 7:
                ze.c cVar = ze.c.e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((ug.m0) this.b).m());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    @Override // v4.e0
    public void y0(int i7, int i10) {
        ((i0) this.b).p(i7, i10);
    }

    @Override // v4.e0
    public void z(int i7, int i10) {
        ((i0) this.b).j(i7, i10);
    }

    public /* synthetic */ b(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }
}
