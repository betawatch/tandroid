package u3;

import android.util.Log;
import android.util.SparseArray;
import b2.n;
import b2.w0;
import c3.i0;
import c3.p;
import c3.t;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import e2.x;
import e9.l0;
import e9.n0;
import e9.s;
import e9.x1;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import v7.u6;
import x8.m;
import y8.e0;
import zh.f0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class c implements w2.a, OnCompleteListener {
    public final Object a;

    public /* synthetic */ c(Object obj) {
        this.a = obj;
    }

    @Override // w2.a
    public long a(long j10) {
        ArrayList arrayList = (ArrayList) this.a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < ((z3.a) arrayList.get(0)).b) {
            return ((z3.a) arrayList.get(0)).b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            z3.a aVar = (z3.a) arrayList.get(i10);
            long j11 = aVar.b;
            long j12 = aVar.b;
            if (j10 < j11) {
                long j13 = ((z3.a) arrayList.get(i10 - 1)).d;
                return (j13 == -9223372036854775807L || j13 <= j10 || j13 >= j12) ? j12 : j13;
            }
        }
        long j14 = ((z3.a) s.m(arrayList)).d;
        if (j14 == -9223372036854775807L || j10 >= j14) {
            return Long.MIN_VALUE;
        }
        return j14;
    }

    @Override // w2.a
    public n0 b(long j10) {
        int g10 = g(j10);
        if (g10 == 0) {
            l0 l0Var = n0.b;
            return x1.e;
        }
        z3.a aVar = (z3.a) ((ArrayList) this.a).get(g10 - 1);
        long j11 = aVar.d;
        if (j11 == -9223372036854775807L || j10 < j11) {
            return aVar.a;
        }
        l0 l0Var2 = n0.b;
        return x1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    @Override // w2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(z3.a aVar, long j10) {
        boolean z10;
        int size;
        ArrayList arrayList = (ArrayList) this.a;
        long j11 = aVar.b;
        u6.g(j11 != -9223372036854775807L);
        if (j11 <= j10) {
            long j12 = aVar.d;
            if (j12 == -9223372036854775807L || j10 < j12) {
                z10 = true;
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    if (j11 >= ((z3.a) arrayList.get(size)).b) {
                        arrayList.add(size + 1, aVar);
                        return z10;
                    }
                    if (((z3.a) arrayList.get(size)).b <= j10) {
                        z10 = false;
                    }
                }
                arrayList.add(0, aVar);
                return z10;
            }
        }
        z10 = false;
        while (size >= 0) {
        }
        arrayList.add(0, aVar);
        return z10;
    }

    @Override // w2.a
    public void clear() {
        ((ArrayList) this.a).clear();
    }

    @Override // w2.a
    public long d(long j10) {
        ArrayList arrayList = (ArrayList) this.a;
        if (arrayList.isEmpty() || j10 < ((z3.a) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j11 = ((z3.a) arrayList.get(i10)).b;
            if (j10 == j11) {
                return j11;
            }
            if (j10 < j11) {
                z3.a aVar = (z3.a) arrayList.get(i10 - 1);
                long j12 = aVar.d;
                return (j12 == -9223372036854775807L || j12 > j10) ? aVar.b : j12;
            }
        }
        z3.a aVar2 = (z3.a) s.m(arrayList);
        long j13 = aVar2.d;
        return (j13 == -9223372036854775807L || j10 < j13) ? aVar2.b : j13;
    }

    @Override // w2.a
    public void e(long j10) {
        ArrayList arrayList = (ArrayList) this.a;
        int g10 = g(j10);
        if (g10 == 0) {
            return;
        }
        long j11 = ((z3.a) arrayList.get(g10 - 1)).d;
        if (j11 == -9223372036854775807L || j11 >= j10) {
            g10--;
        }
        arrayList.subList(0, g10).clear();
    }

    public void f(int i10, int i11, p pVar) {
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
        g gVar = (g) this.a;
        h hVar = gVar.b;
        SparseArray sparseArray = gVar.c;
        x xVar = gVar.k;
        x xVar2 = gVar.i;
        int i21 = 2;
        int i22 = 0;
        int i23 = 1;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (gVar.O != 2) {
                    return;
                }
                f fVar = (f) sparseArray.get(gVar.U);
                int i24 = gVar.X;
                x xVar3 = gVar.p;
                if (i24 != 4 || !"V_VP9".equals(fVar.c)) {
                    pVar.r(i11);
                    return;
                } else {
                    xVar3.K(i11);
                    pVar.readFully(xVar3.a, 0, i11);
                    return;
                }
            }
            if (i10 == 16877) {
                gVar.h(i10);
                f fVar2 = gVar.y;
                int i25 = fVar2.h;
                if (i25 != 1685485123 && i25 != 1685480259) {
                    pVar.r(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                fVar2.P = bArr;
                pVar.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 16981) {
                gVar.h(i10);
                byte[] bArr2 = new byte[i11];
                gVar.y.j = bArr2;
                pVar.readFully(bArr2, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr3 = new byte[i11];
                pVar.readFully(bArr3, 0, i11);
                gVar.h(i10);
                gVar.y.k = new i0(1, 0, 0, bArr3);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(xVar.a, (byte) 0);
                pVar.readFully(xVar.a, 4 - i11, i11);
                xVar.N(0);
                gVar.A = (int) xVar.C();
                return;
            }
            if (i10 == 25506) {
                gVar.h(i10);
                byte[] bArr4 = new byte[i11];
                gVar.y.l = bArr4;
                pVar.readFully(bArr4, 0, i11);
                return;
            }
            if (i10 != 30322) {
                throw w0.a(null, "Unexpected id: " + i10);
            }
            gVar.h(i10);
            byte[] bArr5 = new byte[i11];
            gVar.y.x = bArr5;
            pVar.readFully(bArr5, 0, i11);
            return;
        }
        if (gVar.O == 0) {
            gVar.U = (int) hVar.b(pVar, false, true, 8);
            gVar.V = hVar.c;
            gVar.Q = -9223372036854775807L;
            gVar.O = 1;
            xVar2.K(0);
        }
        f fVar3 = (f) sparseArray.get(gVar.U);
        if (fVar3 == null) {
            pVar.r(i11 - gVar.V);
            gVar.O = 0;
            return;
        }
        fVar3.a0.getClass();
        if (gVar.O == 1) {
            gVar.l(pVar, 3);
            int i26 = (xVar2.a[2] & 6) >> 1;
            byte b10 = 255;
            if (i26 == 0) {
                gVar.S = 1;
                int[] iArr = gVar.T;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                gVar.T = iArr;
                iArr[0] = (i11 - gVar.V) - 3;
            } else {
                gVar.l(pVar, 4);
                int i27 = (xVar2.a[3] & 255) + 1;
                gVar.S = i27;
                int[] iArr2 = gVar.T;
                if (iArr2 == null) {
                    iArr2 = new int[i27];
                } else if (iArr2.length < i27) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i27)];
                }
                gVar.T = iArr2;
                if (i26 == 2) {
                    int i28 = (i11 - gVar.V) - 4;
                    int i29 = gVar.S;
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
                            int i33 = gVar.S - i23;
                            if (i30 >= i33) {
                                i12 = i21;
                                i13 = i22;
                                i14 = i23;
                                gVar.T[i33] = ((i11 - gVar.V) - i32) - i31;
                                break;
                            }
                            gVar.T[i30] = i22;
                            int i34 = i32 + 1;
                            gVar.l(pVar, i34);
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
                                    gVar.l(pVar, i37);
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
                            int[] iArr3 = gVar.T;
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
                        i18 = gVar.S - 1;
                        if (i39 >= i18) {
                            break;
                        }
                        gVar.T[i39] = 0;
                        while (true) {
                            i19 = i41 + 1;
                            gVar.l(pVar, i19);
                            int i42 = xVar2.a[i41] & 255;
                            int[] iArr4 = gVar.T;
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
                    gVar.T[i18] = ((i11 - gVar.V) - i41) - i40;
                }
            }
            i12 = 2;
            i13 = 0;
            i14 = 1;
            byte[] bArr6 = xVar2.a;
            gVar.P = gVar.n((bArr6[i14] & 255) | (bArr6[i13] << 8)) + gVar.M;
            gVar.W = (fVar3.e == i14 || (i10 == 163 && (xVar2.a[i12] & 128) == 128)) ? 1 : i13;
            gVar.O = i12;
            gVar.R = i13;
        }
        if (i10 == 163) {
            while (true) {
                int i43 = gVar.R;
                if (i43 >= gVar.S) {
                    gVar.O = 0;
                    return;
                } else {
                    gVar.i(fVar3, ((gVar.R * fVar3.f) / MediaDataController.MAX_STYLE_RUNS_COUNT) + gVar.P, gVar.W, gVar.o(pVar, fVar3, gVar.T[i43], false), 0);
                    gVar.R++;
                }
            }
        } else {
            while (true) {
                int i44 = gVar.R;
                if (i44 >= gVar.S) {
                    return;
                }
                int[] iArr5 = gVar.T;
                iArr5[i44] = gVar.o(pVar, fVar3, iArr5[i44], true);
                gVar.R++;
            }
        }
    }

    public int g(long j10) {
        ArrayList arrayList = (ArrayList) this.a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (j10 < ((z3.a) arrayList.get(i10)).b) {
                return i10;
            }
        }
        return arrayList.size();
    }

    public void h(int i10, long j10) {
        g gVar = (g) this.a;
        if (i10 == 240) {
            if (gVar.z) {
                return;
            }
            gVar.g(i10);
            if (gVar.H == -1) {
                gVar.H = j10;
                return;
            }
            return;
        }
        if (i10 == 241) {
            if (gVar.z) {
                return;
            }
            gVar.g(i10);
            if (gVar.G == -1) {
                gVar.G = j10;
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
            case 131:
                int i11 = (int) j10;
                if (i11 == 1) {
                    gVar.h(i10);
                    gVar.y.e = 2;
                    return;
                }
                if (i11 == 2) {
                    gVar.h(i10);
                    gVar.y.e = 1;
                    return;
                } else if (i11 == 17) {
                    gVar.h(i10);
                    gVar.y.e = 3;
                    return;
                } else if (i11 != 33) {
                    gVar.h(i10);
                    gVar.y.e = -1;
                    return;
                } else {
                    gVar.h(i10);
                    gVar.y.e = 5;
                    return;
                }
            case 136:
                gVar.h(i10);
                gVar.y.Y = j10 == 1;
                return;
            case 155:
                gVar.Q = gVar.n(j10);
                return;
            case 159:
                gVar.h(i10);
                gVar.y.Q = (int) j10;
                return;
            case 176:
                gVar.h(i10);
                gVar.y.n = (int) j10;
                return;
            case MessagesStorage.LAST_DB_VERSION /* 179 */:
                if (gVar.z) {
                    return;
                }
                gVar.g(i10);
                gVar.E = gVar.n(j10);
                return;
            case 186:
                gVar.h(i10);
                gVar.y.o = (int) j10;
                return;
            case 215:
                gVar.h(i10);
                gVar.y.d = (int) j10;
                return;
            case 231:
                gVar.M = gVar.n(j10);
                return;
            case 238:
                gVar.X = (int) j10;
                return;
            case 247:
                if (gVar.z) {
                    return;
                }
                gVar.g(i10);
                gVar.F = (int) j10;
                return;
            case 251:
                gVar.Y = true;
                return;
            case 16871:
                gVar.h(i10);
                gVar.y.h = (int) j10;
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
                gVar.B = j10 + gVar.s;
                return;
            case 21432:
                int i12 = (int) j10;
                gVar.h(i10);
                if (i12 == 0) {
                    gVar.y.y = 0;
                    return;
                }
                if (i12 == 1) {
                    gVar.y.y = 2;
                    return;
                } else if (i12 == 3) {
                    gVar.y.y = 1;
                    return;
                } else {
                    if (i12 != 15) {
                        return;
                    }
                    gVar.y.y = 3;
                    return;
                }
            case 21680:
                gVar.h(i10);
                gVar.y.q = (int) j10;
                return;
            case 21682:
                gVar.h(i10);
                gVar.y.s = (int) j10;
                return;
            case 21690:
                gVar.h(i10);
                gVar.y.r = (int) j10;
                return;
            case 21930:
                gVar.h(i10);
                gVar.y.X = j10 == 1;
                return;
            case 21938:
                gVar.h(i10);
                f fVar = gVar.y;
                fVar.z = true;
                fVar.p = (int) j10;
                return;
            case 21998:
                gVar.h(i10);
                gVar.y.g = (int) j10;
                return;
            case 22186:
                gVar.h(i10);
                gVar.y.T = j10;
                return;
            case 22203:
                gVar.h(i10);
                gVar.y.U = j10;
                return;
            case 25188:
                gVar.h(i10);
                gVar.y.R = (int) j10;
                return;
            case 30114:
                gVar.Z = j10;
                return;
            case 30321:
                gVar.h(i10);
                int i13 = (int) j10;
                if (i13 == 0) {
                    gVar.y.t = 0;
                    return;
                }
                if (i13 == 1) {
                    gVar.y.t = 1;
                    return;
                } else if (i13 == 2) {
                    gVar.y.t = 2;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    gVar.y.t = 3;
                    return;
                }
            case 2352003:
                gVar.h(i10);
                gVar.y.f = (int) j10;
                return;
            case 2807729:
                gVar.t = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        gVar.h(i10);
                        int i14 = (int) j10;
                        if (i14 == 1) {
                            gVar.y.C = 2;
                            return;
                        } else {
                            if (i14 != 2) {
                                return;
                            }
                            gVar.y.C = 1;
                            return;
                        }
                    case 21946:
                        gVar.h(i10);
                        int g10 = n.g((int) j10);
                        if (g10 != -1) {
                            gVar.y.B = g10;
                            return;
                        }
                        return;
                    case 21947:
                        gVar.h(i10);
                        gVar.y.z = true;
                        int f7 = n.f((int) j10);
                        if (f7 != -1) {
                            gVar.y.A = f7;
                            return;
                        }
                        return;
                    case 21948:
                        gVar.h(i10);
                        gVar.y.D = (int) j10;
                        return;
                    case 21949:
                        gVar.h(i10);
                        gVar.y.E = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    public void i(int i10) {
        TLRPC.TL_exportedNoPaidMessagesToken b10;
        zh.i0 i0Var = ((f0) this.a).e;
        if (i0Var != null) {
            int i11 = i0Var.a;
            if (i0Var.d == i10) {
                return;
            }
            if (i0Var.c.d && i10 == 2) {
                i10 = 1;
            }
            i0Var.d = i10;
            MessagesController.getMainSettings(i11).edit().putBoolean("qrNoPaidPermanent", i0Var.d == 2).apply();
            int i12 = i0Var.d;
            if (i12 == 0) {
                if (i0Var.n != 0) {
                    ConnectionsManager.getInstance(i11).cancelRequest(i0Var.n, true);
                    i0Var.n = 0;
                    return;
                }
                return;
            }
            if (i12 == 2 && (b10 = i0Var.b()) != null) {
                i0Var.f = b10;
                i0Var.b.setFreeLink(i0Var.c(b10));
            }
            i0Var.h(false, i0Var.d == 1);
        }
    }

    public void j(int i10, long j10, long j11) {
        g gVar = (g) this.a;
        gVar.j0.getClass();
        if (i10 == 160) {
            gVar.Y = false;
            gVar.Z = 0L;
            return;
        }
        if (i10 == 174) {
            f fVar = new f();
            fVar.n = -1;
            fVar.o = -1;
            fVar.p = -1;
            fVar.q = -1;
            fVar.r = -1;
            fVar.s = 0;
            fVar.t = -1;
            fVar.u = 0.0f;
            fVar.v = 0.0f;
            fVar.w = 0.0f;
            fVar.x = null;
            fVar.y = -1;
            fVar.z = false;
            fVar.A = -1;
            fVar.B = -1;
            fVar.C = -1;
            fVar.D = MediaDataController.MAX_STYLE_RUNS_COUNT;
            fVar.E = 200;
            fVar.F = -1.0f;
            fVar.G = -1.0f;
            fVar.H = -1.0f;
            fVar.I = -1.0f;
            fVar.J = -1.0f;
            fVar.K = -1.0f;
            fVar.L = -1.0f;
            fVar.M = -1.0f;
            fVar.N = -1.0f;
            fVar.O = -1.0f;
            fVar.Q = 1;
            fVar.R = -1;
            fVar.S = 8000;
            fVar.T = 0L;
            fVar.U = 0L;
            fVar.W = false;
            fVar.Y = true;
            fVar.Z = "eng";
            gVar.y = fVar;
            fVar.a = gVar.w;
            return;
        }
        if (i10 == 183) {
            if (gVar.z) {
                return;
            }
            gVar.g(i10);
            gVar.F = -1;
            gVar.G = -1L;
            gVar.H = -1L;
            return;
        }
        if (i10 == 187) {
            if (gVar.z) {
                return;
            }
            gVar.g(i10);
            gVar.E = -9223372036854775807L;
            return;
        }
        if (i10 == 19899) {
            gVar.A = -1;
            gVar.B = -1L;
            return;
        }
        if (i10 == 20533) {
            gVar.h(i10);
            gVar.y.i = true;
            return;
        }
        if (i10 == 21968) {
            gVar.h(i10);
            gVar.y.z = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = gVar.s;
            if (j12 != -1 && j12 != j10) {
                throw w0.a(null, "Multiple Segment elements not supported");
            }
            gVar.s = j10;
            gVar.r = j11;
            return;
        }
        if (i10 == 475249515) {
            if (gVar.z) {
                return;
            }
            gVar.D = true;
        } else if (i10 == 524531317 && !gVar.z) {
            if (gVar.d && gVar.K != -1) {
                gVar.J = true;
            } else {
                gVar.j0.g0(new t(gVar.v));
                gVar.z = true;
            }
        }
    }

    public void k(int i10, String str) {
        g gVar = (g) this.a;
        if (i10 == 134) {
            gVar.h(i10);
            gVar.y.c = str;
            return;
        }
        if (i10 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                gVar.w = str.equals("webm");
                return;
            }
            throw w0.a(null, "DocType " + str + " not supported");
        }
        if (i10 == 21358) {
            gVar.h(i10);
            gVar.y.b = str;
        } else {
            if (i10 != 2274716) {
                return;
            }
            gVar.h(i10);
            gVar.y.Z = str;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        e0 e0Var = (e0) this.a;
        if (task.isSuccessful()) {
            m.L0(e0Var, true, (byte[]) task.getResult());
        } else {
            Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
            m.L0(e0Var, false, null);
        }
    }

    public c() {
        this.a = new ArrayList();
    }
}
