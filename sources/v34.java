// default package

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.util.SparseArray;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class v34 implements u69, qec, tj5, aea, v78, fx7, ty9, cj2, dgc, jy2, yu8, z34, be8, a43, k98, y11, esb, p7, on5 {
    public final /* synthetic */ byte a;
    public Object b;

    public v34(byte b) {
        this.a = b;
        switch (b) {
            case 6:
                break;
            case 16:
                this.b = new Bundle();
                break;
            default:
                this.b = new rr4(5, 1.0f, false, (byte) 0);
                break;
        }
    }

    @Override // jy2
    public final void B(gy2 gy2Var) {
        sl7 sl7Var = (sl7) this.b;
        sl7Var.x1 = true;
        String str = gy2Var.c;
        sl7Var.H1.setText(str);
        sl7Var.H0(str, gy2Var);
        sl7Var.x1 = false;
        hl.d3(new ge7(this, (byte) 6), 300L);
        sl7Var.J1.requestFocus();
        rl7 rl7Var = sl7Var.J1;
        rl7Var.setSelection(rl7Var.length());
    }

    @Override // esb
    public final void B0(float f, int i) {
        ArrayList arrayList;
        mm8 mm8Var = (mm8) this.b;
        c8b c8bVar = mm8Var.d;
        if (c8bVar == null || (arrayList = c8bVar.T) == null || i < 0 || i >= arrayList.size()) {
            return;
        }
        ((c8b) mm8Var.d.T.get(i)).P = f;
    }

    @Override // esb
    public final void C(long j, boolean z) {
        mm8 mm8Var = (mm8) this.b;
        if (!z) {
            mm8Var.m(j);
            return;
        }
        kfc kfcVar = mm8Var.e;
        if (kfcVar != null) {
            kfcVar.p0(j, true);
            return;
        }
        if (mm8Var.i()) {
            mm8Var.F.m(j, true);
            return;
        }
        kfc kfcVar2 = mm8Var.E;
        if (kfcVar2 != null) {
            kfcVar2.p0(j, false);
        }
    }

    @Override // be8
    public final TextureView D() {
        return null;
    }

    @Override // cj2
    public final void D1(View view, float f, float f2) {
        hj6 hj6Var = (hj6) this.b;
        hj6.n(view, f, f2);
        hj6Var.m(false, false, f);
        hj6Var.invalidate();
    }

    @Override // aea
    public final boolean E() {
        if (!hl.C3()) {
            return true;
        }
        ((j95) this.b).d1().k(0L, 33, null, null, null, null);
        return true;
    }

    @Override // esb
    public final void E1(float f) {
        mm8 mm8Var = (mm8) this.b;
        c8b c8bVar = mm8Var.d;
        if (c8bVar == null) {
            return;
        }
        c8bVar.E = f;
        c8bVar.j = true;
        mm8Var.w(true);
    }

    @Override // k98
    public final void F(String str) {
        ((s98) this.b).l0(str);
    }

    @Override // a43
    public final void F0(boolean z) {
        j88 j88Var = ((k88) this.b).a;
        if (j88Var != null) {
            ((ua8) j88Var).b(z);
        }
    }

    @Override // fx7
    public final void G(float f) {
        hc8 hc8Var = (hc8) this.b;
        a78.e(hc8Var.z1).k(String.valueOf(v01.a.indexOf(hc8Var.G0.getCurrentBrush())), f);
        igb igbVar = hc8Var.u1;
        igbVar.c = f;
        hc8Var.u0(igbVar, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x026c, code lost:
    
        throw hy7.a("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(int i, int i2, cb3 cb3Var) {
        int i3;
        byte b;
        int i4;
        int i5;
        byte b2;
        int i6;
        long j;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        vl6 vl6Var = (vl6) this.b;
        cdc cdcVar = vl6Var.b;
        SparseArray sparseArray = vl6Var.c;
        ey7 ey7Var = vl6Var.m;
        ey7 ey7Var2 = vl6Var.k;
        byte b3 = 2;
        int i11 = 0;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (vl6Var.V == 2) {
                    ul6 ul6Var = (ul6) sparseArray.get(vl6Var.b0);
                    int i12 = vl6Var.e0;
                    ey7 ey7Var3 = vl6Var.r;
                    if (i12 != 4 || !"V_VP9".equals(ul6Var.c)) {
                        cb3Var.l(i2, false);
                        return;
                    }
                    ey7Var3.K(i2);
                    cb3Var.c(ey7Var3.a, 0, i2, false);
                    if (vl6Var.f) {
                        return;
                    }
                    byte[] bArr = ey7Var3.a;
                    byte[] bArr2 = rk2.d;
                    if (i2 >= bArr2.length) {
                        for (int i13 = 0; i13 < bArr2.length; i13++) {
                            if (bArr[i13] != bArr2[i13]) {
                                return;
                            }
                        }
                        ey7Var3.K(0);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 16877) {
                vl6Var.h(i);
                ul6 ul6Var2 = vl6Var.B;
                int i14 = ul6Var2.i;
                if (i14 != 1685485123 && i14 != 1685480259) {
                    cb3Var.l(i2, false);
                    return;
                }
                byte[] bArr3 = new byte[i2];
                ul6Var2.P = bArr3;
                cb3Var.c(bArr3, 0, i2, false);
                return;
            }
            if (i == 16981) {
                vl6Var.h(i);
                byte[] bArr4 = new byte[i2];
                vl6Var.B.k = bArr4;
                cb3Var.c(bArr4, 0, i2, false);
                return;
            }
            if (i == 18402) {
                byte[] bArr5 = new byte[i2];
                cb3Var.c(bArr5, 0, i2, false);
                vl6Var.h(i);
                vl6Var.B.l = new w1c(1, 0, 0, bArr5);
                return;
            }
            if (i == 21419) {
                Arrays.fill(ey7Var.a, (byte) 0);
                cb3Var.c(ey7Var.a, 4 - i2, i2, false);
                ey7Var.N(0);
                vl6Var.D = (int) ey7Var.C();
                return;
            }
            if (i == 25506) {
                vl6Var.h(i);
                byte[] bArr6 = new byte[i2];
                vl6Var.B.m = bArr6;
                cb3Var.c(bArr6, 0, i2, false);
                return;
            }
            if (i != 30322) {
                throw hy7.a("Unexpected id: " + i, null);
            }
            vl6Var.h(i);
            byte[] bArr7 = new byte[i2];
            vl6Var.B.y = bArr7;
            cb3Var.c(bArr7, 0, i2, false);
            return;
        }
        int i15 = 8;
        if (vl6Var.V == 0) {
            vl6Var.b0 = (int) cdcVar.d(cb3Var, false, true, 8);
            vl6Var.c0 = cdcVar.b;
            vl6Var.X = -9223372036854775807L;
            vl6Var.V = (byte) 1;
            ey7Var2.K(0);
        }
        ul6 ul6Var3 = (ul6) sparseArray.get(vl6Var.b0);
        if (ul6Var3 == null) {
            cb3Var.l(i2 - vl6Var.c0, false);
            vl6Var.V = (byte) 0;
            return;
        }
        ul6Var3.d0.getClass();
        if (vl6Var.V == 1) {
            vl6Var.n(cb3Var, 3);
            int i16 = (ey7Var2.a[2] & 6) >> 1;
            if (i16 == 0) {
                vl6Var.Z = 1;
                int[] iArr2 = vl6Var.a0;
                if (iArr2 == null) {
                    iArr2 = new int[1];
                } else if (iArr2.length < 1) {
                    iArr2 = new int[Math.max(iArr2.length << 1, 1)];
                }
                vl6Var.a0 = iArr2;
                iArr2[0] = (i2 - vl6Var.c0) - 3;
            } else {
                vl6Var.n(cb3Var, 4);
                int i17 = (ey7Var2.a[3] & jn7.d4) + 1;
                vl6Var.Z = i17;
                int[] iArr3 = vl6Var.a0;
                if (iArr3 == null) {
                    iArr3 = new int[i17];
                    i3 = 4;
                } else {
                    i3 = 4;
                    if (iArr3.length < i17) {
                        iArr3 = new int[Math.max(iArr3.length << 1, i17)];
                    }
                }
                vl6Var.a0 = iArr3;
                if (i16 == 2) {
                    int i18 = (i2 - vl6Var.c0) - 4;
                    int i19 = vl6Var.Z;
                    Arrays.fill(iArr3, 0, i19, i18 / i19);
                } else if (i16 == 1) {
                    int i20 = 0;
                    int i21 = 0;
                    int i22 = i3;
                    while (true) {
                        i8 = vl6Var.Z - 1;
                        iArr = vl6Var.a0;
                        if (i20 >= i8) {
                            break;
                        }
                        iArr[i20] = 0;
                        while (true) {
                            i9 = i22 + 1;
                            vl6Var.n(cb3Var, i9);
                            int i23 = ey7Var2.a[i22] & 255;
                            int[] iArr4 = vl6Var.a0;
                            i10 = iArr4[i20] + i23;
                            iArr4[i20] = i10;
                            if (i23 != 255) {
                                break;
                            } else {
                                i22 = i9;
                            }
                        }
                        i21 += i10;
                        i20++;
                        i22 = i9;
                    }
                    iArr[i8] = qd4.f(i2, vl6Var.c0, i22, i21);
                } else {
                    if (i16 != 3) {
                        throw hy7.a("Unexpected lacing value: " + i16, null);
                    }
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = i3;
                    while (true) {
                        int i27 = vl6Var.Z - 1;
                        int[] iArr5 = vl6Var.a0;
                        if (i24 >= i27) {
                            b = b3;
                            i4 = i11;
                            iArr5[i27] = qd4.f(i2, vl6Var.c0, i26, i25);
                            break;
                        }
                        iArr5[i24] = i11;
                        int i28 = i26 + 1;
                        vl6Var.n(cb3Var, i28);
                        if (ey7Var2.a[i26] == 0) {
                            throw hy7.a("No valid varint length mask found", null);
                        }
                        int i29 = i11;
                        while (true) {
                            if (i29 >= i15) {
                                i5 = i15;
                                b2 = b3;
                                i6 = i11;
                                j = 0;
                                i7 = i28;
                                break;
                            }
                            i5 = i15;
                            int i30 = 1 << (7 - i29);
                            i6 = i11;
                            if ((ey7Var2.a[i26] & i30) != 0) {
                                i7 = i28 + i29;
                                vl6Var.n(cb3Var, i7);
                                b2 = b3;
                                j = ey7Var2.a[i26] & 255 & (~i30);
                                while (i28 < i7) {
                                    j = (j << i5) | (ey7Var2.a[i28] & 255);
                                    i28++;
                                }
                                if (i24 > 0) {
                                    j -= (1 << ((i29 * 7) + 6)) - 1;
                                }
                            } else {
                                i29++;
                                i11 = i6;
                                i15 = i5;
                            }
                        }
                        if (j < -2147483648L || j > 2147483647L) {
                            break;
                        }
                        int i31 = (int) j;
                        int[] iArr6 = vl6Var.a0;
                        if (i24 != 0) {
                            i31 += iArr6[i24 - 1];
                        }
                        iArr6[i24] = i31;
                        i25 += i31;
                        i24++;
                        i26 = i7;
                        i11 = i6;
                        i15 = i5;
                        b3 = b2;
                    }
                }
            }
            b = 2;
            i4 = 0;
            byte[] bArr8 = ey7Var2.a;
            vl6Var.W = vl6Var.p((bArr8[i4] << 8) | (bArr8[1] & 255)) + vl6Var.T;
            vl6Var.d0 = (ul6Var3.f == 1 || (i == 163 && (ey7Var2.a[b] & 128) == 128)) ? 1 : i4;
            vl6Var.V = b;
            vl6Var.Y = i4;
        }
        if (i == 163) {
            while (true) {
                int i32 = vl6Var.Y;
                if (i32 >= vl6Var.Z) {
                    vl6Var.V = (byte) 0;
                    return;
                } else {
                    vl6Var.i(ul6Var3, ((vl6Var.Y * ul6Var3.g) / 1000) + vl6Var.W, vl6Var.d0, vl6Var.r(cb3Var, ul6Var3, vl6Var.a0[i32], false), 0);
                    vl6Var.Y++;
                }
            }
        } else {
            while (true) {
                int i33 = vl6Var.Y;
                if (i33 >= vl6Var.Z) {
                    return;
                }
                int[] iArr7 = vl6Var.a0;
                iArr7[i33] = vl6Var.r(cb3Var, ul6Var3, iArr7[i33], true);
                vl6Var.Y++;
            }
        }
    }

    @Override // esb
    public final void H0(float f) {
        mm8 mm8Var = (mm8) this.b;
        c8b c8bVar = mm8Var.d;
        if (c8bVar == null) {
            return;
        }
        c8bVar.P = f;
        mm8Var.b();
    }

    @Override // be8
    public final void J(r47 r47Var) {
        ((ccb) ((o68) this.b).A1).f(false);
    }

    public final void K(int i, long j) {
        vl6 vl6Var = (vl6) this.b;
        if (i == 136) {
            vl6Var.h(i);
            vl6Var.B.b0 = j == 1;
            return;
        }
        if (i == 137) {
            vl6Var.k(i).e = j;
            return;
        }
        if (i == 145) {
            vl6Var.k(i).b = j;
            return;
        }
        if (i == 146) {
            vl6Var.k(i).c = j;
            return;
        }
        if (i == 240) {
            if (vl6Var.C) {
                return;
            }
            vl6Var.g(i);
            if (vl6Var.K == -1) {
                vl6Var.K = j;
                return;
            }
            return;
        }
        if (i == 241) {
            if (vl6Var.C) {
                return;
            }
            vl6Var.g(i);
            if (vl6Var.J == -1) {
                vl6Var.J = j;
                return;
            }
            return;
        }
        if (i == 20529) {
            if (j != 0) {
                throw hy7.a("ContentEncodingOrder " + j + " not supported", null);
            }
            return;
        }
        if (i == 20530) {
            if (j != 1) {
                throw hy7.a("ContentEncodingScope " + j + " not supported", null);
            }
            return;
        }
        if (i == 29636) {
            vl6Var.k(i).a = j;
            return;
        }
        if (i == 29637) {
            vl6Var.h(i);
            vl6Var.B.e = j;
            return;
        }
        switch (i) {
            case jn7.O1 /* 131 */:
                int i2 = (int) j;
                if (i2 == 1) {
                    vl6Var.h(i);
                    vl6Var.B.f = 2;
                    return;
                }
                if (i2 == 2) {
                    vl6Var.h(i);
                    vl6Var.B.f = 1;
                    return;
                } else if (i2 == 17) {
                    vl6Var.h(i);
                    vl6Var.B.f = 3;
                    return;
                } else if (i2 != 33) {
                    vl6Var.h(i);
                    vl6Var.B.f = -1;
                    return;
                } else {
                    vl6Var.h(i);
                    vl6Var.B.f = 5;
                    return;
                }
            case jn7.h2 /* 152 */:
                vl6Var.k(i).d = j == 1;
                return;
            case jn7.k2 /* 155 */:
                vl6Var.X = vl6Var.p(j);
                return;
            case jn7.o2 /* 159 */:
                vl6Var.h(i);
                vl6Var.B.Q = (int) j;
                return;
            case jn7.F2 /* 176 */:
                vl6Var.h(i);
                vl6Var.B.o = (int) j;
                return;
            case jn7.I2 /* 179 */:
                if (vl6Var.C) {
                    return;
                }
                vl6Var.g(i);
                vl6Var.H = vl6Var.p(j);
                return;
            case jn7.P2 /* 186 */:
                vl6Var.h(i);
                vl6Var.B.p = (int) j;
                return;
            case jn7.r3 /* 215 */:
                vl6Var.h(i);
                vl6Var.B.d = (int) j;
                return;
            case jn7.G3 /* 231 */:
                vl6Var.T = vl6Var.p(j);
                return;
            case jn7.M3 /* 238 */:
                vl6Var.e0 = (int) j;
                return;
            case jn7.V3 /* 247 */:
                if (vl6Var.C) {
                    return;
                }
                vl6Var.g(i);
                vl6Var.I = (int) j;
                return;
            case jn7.Z3 /* 251 */:
                vl6Var.f0 = true;
                return;
            case 16871:
                vl6Var.h(i);
                vl6Var.B.i = (int) j;
                return;
            case 16980:
                if (j != 3) {
                    throw hy7.a("ContentCompAlgo " + j + " not supported", null);
                }
                return;
            case 17029:
                if (j < 1 || j > 2) {
                    throw hy7.a("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j != 1) {
                    throw hy7.a("EBMLReadVersion " + j + " not supported", null);
                }
                return;
            case 18401:
                if (j != 5) {
                    throw hy7.a("ContentEncAlgo " + j + " not supported", null);
                }
                return;
            case 18408:
                if (j != 1) {
                    throw hy7.a("AESSettingsCipherMode " + j + " not supported", null);
                }
                return;
            case 21420:
                vl6Var.E = j + vl6Var.u;
                return;
            case 21432:
                int i3 = (int) j;
                vl6Var.h(i);
                if (i3 == 0) {
                    vl6Var.B.z = 0;
                    return;
                }
                if (i3 == 1) {
                    vl6Var.B.z = 2;
                    return;
                } else if (i3 == 3) {
                    vl6Var.B.z = 1;
                    return;
                } else {
                    if (i3 == 15) {
                        vl6Var.B.z = 3;
                        return;
                    }
                    return;
                }
            case 21680:
                vl6Var.h(i);
                vl6Var.B.r = (int) j;
                return;
            case 21682:
                vl6Var.h(i);
                vl6Var.B.t = (int) j;
                return;
            case 21690:
                vl6Var.h(i);
                vl6Var.B.s = (int) j;
                return;
            case 21930:
                vl6Var.h(i);
                vl6Var.B.a0 = j == 1;
                return;
            case 21938:
                vl6Var.h(i);
                vl6Var.B.q = (int) j;
                return;
            case 21998:
                vl6Var.h(i);
                vl6Var.B.h = (int) j;
                return;
            case 22186:
                vl6Var.h(i);
                vl6Var.B.U = j;
                return;
            case 22203:
                vl6Var.h(i);
                vl6Var.B.V = j;
                return;
            case 25188:
                vl6Var.h(i);
                vl6Var.B.R = (int) j;
                return;
            case 30114:
                vl6Var.g0 = j;
                return;
            case 30321:
                vl6Var.h(i);
                int i4 = (int) j;
                if (i4 == 0) {
                    vl6Var.B.u = 0;
                    return;
                }
                if (i4 == 1) {
                    vl6Var.B.u = 1;
                    return;
                } else if (i4 == 2) {
                    vl6Var.B.u = 2;
                    return;
                } else {
                    if (i4 == 3) {
                        vl6Var.B.u = 3;
                        return;
                    }
                    return;
                }
            case 2352003:
                vl6Var.h(i);
                vl6Var.B.g = (int) j;
                return;
            case 2807729:
                vl6Var.v = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        vl6Var.h(i);
                        int i5 = (int) j;
                        if (i5 == 1) {
                            vl6Var.B.C = 2;
                            return;
                        } else {
                            if (i5 == 2) {
                                vl6Var.B.C = 1;
                                return;
                            }
                            return;
                        }
                    case 21946:
                        vl6Var.h(i);
                        int g = bm2.g((int) j);
                        if (g != -1) {
                            vl6Var.B.B = g;
                            return;
                        }
                        return;
                    case 21947:
                        vl6Var.h(i);
                        int f = bm2.f((int) j);
                        if (f != -1) {
                            vl6Var.B.A = f;
                            return;
                        }
                        return;
                    case 21948:
                        vl6Var.h(i);
                        vl6Var.B.D = (int) j;
                        return;
                    case 21949:
                        vl6Var.h(i);
                        vl6Var.B.E = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // z34
    public final h44 L() {
        return ((wab) this.b).t0;
    }

    @Override // a43
    public final void L0() {
        j88 j88Var = ((k88) this.b).a;
        if (j88Var != null) {
            PhotoViewer photoViewer = ((ua8) j88Var).a;
            if (photoViewer.d2 == 1) {
                photoViewer.H2 = true;
                photoViewer.B2();
            }
        }
    }

    public final void M() {
        ((ip4) this.b).d.R();
    }

    public final void N(eh6 eh6Var) {
        ph6 ph6Var = (ph6) this.b;
        boolean z = true;
        ph6Var.O = true;
        qh6 qh6Var = ph6Var.h0;
        qh6Var.K = false;
        qh6Var.B1(0, false);
        if (hl.L1()) {
            boolean z2 = qh6Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            boolean z3 = qh6Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            int i = Build.VERSION.SDK_INT;
            boolean z4 = i < 28 || qh6Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z5 = i < 26 || qh6Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            mh6 mh6Var = ph6Var.a;
            if (mh6Var != null && "888".equals(mh6Var.getText())) {
                z2 = true;
                z3 = true;
                z4 = true;
                z5 = true;
            }
            if (qh6Var.w) {
                qh6Var.r.clear();
                if (!z2) {
                    qh6Var.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z3) {
                    qh6Var.r.add("android.permission.CALL_PHONE");
                }
                if (!z4) {
                    qh6Var.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z5 && i >= 26) {
                    qh6Var.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!qh6Var.r.isEmpty()) {
                    SharedPreferences e1 = uc7.e1();
                    if (!e1.getBoolean("firstlogin", true) && !qh6Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !qh6Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            qh6Var.getParentActivity().requestPermissions((String[]) qh6Var.r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e) {
                            cc4.g(e, true);
                            return;
                        }
                    }
                    e1.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qh6Var.getParentActivity());
                    alertDialog$Builder.j(ob6.M0(2131751736, "Continue"), null);
                    int i2 = R.raw.calls_log;
                    id idVar = alertDialog$Builder.a;
                    if (!z2 && (!z3 || !z4)) {
                        idVar.U = ob6.M0(2131754267, "AllowReadCallAndLog");
                    } else if (z3 && z4) {
                        idVar.U = ob6.M0(2131754268, "AllowReadCall");
                        i2 = R.raw.incoming_calls;
                    } else {
                        idVar.U = ob6.M0(2131754266, "AllowReadCallLog");
                    }
                    int i3 = aob.L5;
                    alertDialog$Builder.l(i2, 46, aob.w0(null, i3, false), null);
                    alertDialog$Builder.m(i3, null);
                    qh6Var.h = qh6Var.showDialog(idVar);
                    ph6Var.O = true;
                    return;
                }
            }
            z = true;
        }
        oh6 oh6Var = new oh6((byte) 0, this, eh6Var);
        int i4 = eh6.G;
        eh6Var.h.f(z, z);
        hl.d3(oh6Var, 400L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(int i) {
        TLRPC.TL_exportedNoPaidMessagesToken c;
        vz8 vz8Var = ((rz8) this.b).e;
        if (vz8Var == null || vz8Var.d == i) {
            return;
        }
        byte b = i;
        b = i;
        if (vz8Var.c.d && i == 2) {
            b = 1;
        }
        vz8Var.d = b;
        vz8Var.f().edit().putBoolean("qrNoPaidPermanent", vz8Var.d == 2).apply();
        byte b2 = vz8Var.d;
        if (b2 == 0) {
            if (vz8Var.n != 0) {
                ConnectionsManager.getInstance(vz8Var.a).cancelRequest(vz8Var.n, true);
                vz8Var.n = 0;
                return;
            }
            return;
        }
        if (b2 == 2 && (c = vz8Var.c()) != null) {
            vz8Var.f = c;
            vz8Var.b.setFreeLink(vz8Var.d(c));
        }
        vz8Var.n(false, vz8Var.d == 1);
    }

    @Override // esb
    public final void O1(float f, int i) {
        ArrayList arrayList;
        mm8 mm8Var = (mm8) this.b;
        c8b c8bVar = mm8Var.d;
        if (c8bVar == null || (arrayList = c8bVar.T) == null || i < 0 || i >= arrayList.size()) {
            return;
        }
        ((c8b) mm8Var.d.T.get(i)).W = f;
    }

    public final void P(zv6 zv6Var, ev6 ev6Var, ArrayList arrayList) {
        a05 a05Var = (a05) this.b;
        if (zv6Var != a05Var.y || ev6Var == null) {
            if (zv6Var == a05Var.e) {
                if (ev6Var != null) {
                    a05Var.n(a05Var.d, ev6Var);
                }
                a05Var.d.n(arrayList);
                return;
            }
            return;
        }
        iw6 iw6Var = a05Var.x.a;
        String d = ev6Var.d();
        jw6 jw6Var = new jw6(iw6Var, d, a05Var.b(iw6Var, d), false);
        jw6Var.i(ev6Var);
        if (a05Var.d != jw6Var) {
            a05Var.h(a05Var, jw6Var, a05Var.y, 3, a05Var.x, arrayList);
            a05Var.x = null;
            a05Var.y = null;
        }
    }

    @Override // esb
    public final void P1(float f) {
        c8b c8bVar = ((mm8) this.b).d;
        if (c8bVar == null) {
            return;
        }
        c8bVar.a0 = f;
        c8bVar.j = true;
    }

    public final void Q(String str, Bitmap bitmap) {
        qs qsVar = MediaMetadataCompat.d;
        if (!qsVar.containsKey(str) || ((Integer) qsVar.get(str)).intValue() == 2) {
            ((Bundle) this.b).putParcelable(str, bitmap);
        } else {
            lq5.j(qd4.y("The ", str, " key cannot be used to put a Bitmap"));
        }
    }

    public final void R(long j) {
        qs qsVar = MediaMetadataCompat.d;
        if (!qsVar.containsKey("android.media.metadata.DURATION") || ((Integer) qsVar.get("android.media.metadata.DURATION")).intValue() == 0) {
            ((Bundle) this.b).putLong("android.media.metadata.DURATION", j);
        } else {
            lq5.j("The android.media.metadata.DURATION key cannot be used to put a long");
        }
    }

    public final void S(String str, String str2) {
        qs qsVar = MediaMetadataCompat.d;
        if (!qsVar.containsKey(str) || ((Integer) qsVar.get(str)).intValue() == 1) {
            ((Bundle) this.b).putCharSequence(str, str2);
        } else {
            lq5.j(qd4.y("The ", str, " key cannot be used to put a String"));
        }
    }

    @Override // esb
    public final void S1() {
        ((mm8) this.b).p(null);
    }

    public final void T(long j, int i, long j2) {
        vl6 vl6Var = (vl6) this.b;
        vl6Var.q0.getClass();
        if (i == 128) {
            vl6Var.k(i).h = null;
            vl6Var.k(i).i = null;
            return;
        }
        if (i == 160) {
            vl6Var.f0 = false;
            vl6Var.g0 = 0L;
            return;
        }
        if (i == 174) {
            ul6 ul6Var = new ul6();
            ul6Var.o = -1;
            ul6Var.p = -1;
            ul6Var.q = -1;
            ul6Var.r = -1;
            ul6Var.s = -1;
            ul6Var.t = 0;
            ul6Var.u = -1;
            ul6Var.v = 0.0f;
            ul6Var.w = 0.0f;
            ul6Var.x = 0.0f;
            ul6Var.y = null;
            ul6Var.z = -1;
            ul6Var.A = -1;
            ul6Var.B = -1;
            ul6Var.C = -1;
            ul6Var.D = 1000;
            ul6Var.E = jn7.d3;
            ul6Var.F = -1.0f;
            ul6Var.G = -1.0f;
            ul6Var.H = -1.0f;
            ul6Var.I = -1.0f;
            ul6Var.J = -1.0f;
            ul6Var.K = -1.0f;
            ul6Var.L = -1.0f;
            ul6Var.M = -1.0f;
            ul6Var.N = -1.0f;
            ul6Var.O = -1.0f;
            ul6Var.Q = 1;
            ul6Var.R = -1;
            ul6Var.S = -1;
            ul6Var.T = 8000;
            ul6Var.U = 0L;
            ul6Var.V = 0L;
            ul6Var.X = false;
            ul6Var.b0 = true;
            ul6Var.c0 = "eng";
            vl6Var.B = ul6Var;
            ul6Var.a = vl6Var.y;
            return;
        }
        if (i == 187) {
            if (vl6Var.C) {
                return;
            }
            vl6Var.g(i);
            vl6Var.H = -9223372036854775807L;
            return;
        }
        if (i == 19899) {
            vl6Var.D = -1;
            vl6Var.E = -1L;
            return;
        }
        if (i == 20533) {
            vl6Var.h(i);
            vl6Var.B.j = true;
            return;
        }
        if (i == 408125543) {
            long j3 = vl6Var.u;
            if (j3 != -1 && j3 != j) {
                throw hy7.a("Multiple Segment elements not supported", null);
            }
            vl6Var.u = j;
            vl6Var.t = j2;
            return;
        }
        if (i == 475249515) {
            if (vl6Var.C) {
                return;
            }
            vl6Var.G = true;
            return;
        }
        if (i == 524531317) {
            if (vl6Var.P == -1 || vl6Var.S) {
                vl6Var.m();
                return;
            } else {
                vl6Var.Q = true;
                return;
            }
        }
        if (i == 182) {
            rl6 rl6Var = new rl6();
            rl6Var.b = -9223372036854775807L;
            rl6Var.c = -9223372036854775807L;
            vl6Var.A = rl6Var;
            return;
        }
        if (i != 183 || vl6Var.C) {
            return;
        }
        vl6Var.g(i);
        vl6Var.I = -1;
        vl6Var.J = -1L;
        vl6Var.K = -1L;
    }

    @Override // cj2
    public final boolean T0(float f, float f2) {
        hj6 hj6Var = (hj6) this.b;
        View view = null;
        hj6Var.P = null;
        int childCount = hj6Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = hj6Var.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && f >= childAt.getLeft() && f <= childAt.getRight() && f2 >= childAt.getTop() && f2 <= childAt.getBottom()) {
                view = childAt;
                break;
            }
            childCount--;
        }
        return (view == null || hj6Var.Q.contains(view)) ? false : true;
    }

    public final void U(int i, String str) {
        vl6 vl6Var = (vl6) this.b;
        if (i == 133) {
            vl6Var.k(i).h = str;
            return;
        }
        if (i == 134) {
            vl6Var.h(i);
            vl6Var.B.c = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                vl6Var.y = str.equals("webm");
                return;
            }
            throw hy7.a("DocType " + str + " not supported", null);
        }
        if (i == 17276) {
            vl6Var.k(i).i = str;
            return;
        }
        if (i == 21358) {
            vl6Var.h(i);
            vl6Var.B.b = str;
        } else {
            if (i != 2274716) {
                return;
            }
            vl6Var.h(i);
            vl6Var.B.c0 = str;
        }
    }

    @Override // esb
    public final void V() {
        mm8 mm8Var = (mm8) this.b;
        mm8Var.s(null, null, true);
        sbb sbbVar = ((hbb) mm8Var).D0;
        hbb hbbVar = sbbVar.Y0;
        if (hbbVar != null) {
            hbbVar.s(null, null, true);
        }
        wab wabVar = sbbVar.w1;
        if (wabVar != null) {
            wabVar.n0();
        }
        ibb ibbVar = sbbVar.d1;
        if (ibbVar != null) {
            ibbVar.setHasRoundVideo(false);
        }
        c8b c8bVar = sbbVar.L1;
        if (c8bVar != null) {
            File file = c8bVar.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                c8bVar = sbbVar.L1;
                c8bVar.o0 = null;
            }
            if (c8bVar.p0 != null) {
                try {
                    new File(sbbVar.L1.p0).delete();
                } catch (Exception unused2) {
                }
                sbbVar.L1.p0 = null;
            }
        }
    }

    @Override // p7
    public final void W() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        RectF rectF = ProfileActivity.Z6;
        mu9.d(new hj8(profileActivity, (byte) 3));
    }

    @Override // cj2
    public final boolean W0(View view, float f, float f2) {
        hj6 hj6Var = (hj6) this.b;
        hj6.n(view, f, f2);
        hl.r(hj6Var.I);
        hj6Var.setSkipDrawSelector(true);
        hj6Var.m(true, false, f);
        hj6Var.invalidate();
        hj6Var.R.a(true, true);
        return true;
    }

    @Override // esb
    public final void X(boolean z, float f) {
        mm8 mm8Var = (mm8) this.b;
        c8b c8bVar = mm8Var.d;
        if (c8bVar != null) {
            c8bVar.Z = f;
            c8bVar.j = true;
            kfc kfcVar = mm8Var.e;
            if (kfcVar == null || kfcVar.U() == -9223372036854775807L) {
                return;
            }
            mm8Var.m((long) (f * mm8Var.e.U()));
        }
    }

    @Override // cj2
    public final boolean Y1() {
        return true;
    }

    @Override // esb
    public final void Z1(float f) {
        mm8 mm8Var = (mm8) this.b;
        c8b c8bVar = mm8Var.d;
        if (c8bVar == null) {
            return;
        }
        c8bVar.t0 = f;
        c8bVar.j = true;
        mm8Var.y(true);
    }

    @Override // k98
    public final void b() {
        s98 s98Var = (s98) this.b;
        s98Var.a.b0();
        s98Var.b.b0();
    }

    @Override // a43
    public final void b0() {
        j88 j88Var = ((k88) this.b).a;
        if (j88Var != null) {
            ((ua8) j88Var).a.f0.invalidate();
        }
    }

    @Override // esb
    public final void b1(long j) {
        mm8 mm8Var = (mm8) this.b;
        c8b c8bVar = mm8Var.d;
        if (c8bVar == null) {
            return;
        }
        c8bVar.r0 = j;
        c8bVar.j = true;
        mm8Var.y(true);
    }

    @Override // esb
    public final void b2(int i, long j) {
        ArrayList arrayList;
        mm8 mm8Var = (mm8) this.b;
        c8b c8bVar = mm8Var.d;
        if (c8bVar == null || (arrayList = c8bVar.T) == null || i < 0 || i >= arrayList.size()) {
            return;
        }
        ((c8b) mm8Var.d.T.get(i)).X = j;
    }

    @Override // y11
    public final void c(z11 z11Var, j11 j11Var, fv0 fv0Var, y42 y42Var) {
        ((xd8) this.b).g(true, j11Var, fv0Var, y42Var);
    }

    @Override // u69
    public final boolean d(float f, float f2, int i, View view) {
        yg4 yg4Var = (yg4) this.b;
        if (view instanceof zea) {
            yg4Var.f(((zea) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof cfa) {
            yg4Var.f(((cfa) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof vea) {
            yg4Var.f(((vea) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof vw2) {
            yg4Var.f(((vw2) view).getMessageObject(), view, 0);
            return true;
        }
        if (view instanceof of3) {
            if (!yg4Var.p0.u()) {
                of3 of3Var = (of3) view;
                if (of3Var.a0(f)) {
                    yg4Var.j0.B(of3Var);
                    return true;
                }
            }
            yg4Var.f(((of3) view).getMessage(), view, 0);
        }
        return true;
    }

    @Override // z34
    public final void e() {
        wab wabVar = (wab) this.b;
        wabVar.C0(null, true);
        if (wabVar.w0) {
            sbb sbbVar = wabVar.o2;
            sbbVar.d1.f.d();
            sbbVar.k0(-1, false, true);
            wabVar.w0 = false;
        }
        wabVar.N0(false);
    }

    @Override // cj2
    public final boolean e0() {
        return false;
    }

    @Override // esb
    public final void e1(boolean z) {
        pp9 pp9Var;
        sbb sbbVar = ((hbb) ((mm8) this.b)).D0;
        wab wabVar = sbbVar.w1;
        if (wabVar != null) {
            pp9 pp9Var2 = null;
            if (!z) {
                if (wabVar.getSelectedEntity() instanceof pp9) {
                    sbbVar.w1.C0(null, true);
                    return;
                }
                return;
            }
            if (wabVar.getSelectedEntity() instanceof pp9) {
                return;
            }
            zw7 zw7Var = sbbVar.w1.B0;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= zw7Var.getChildCount()) {
                    pp9Var = null;
                    break;
                }
                View childAt = zw7Var.getChildAt(i2);
                if (childAt instanceof pp9) {
                    pp9Var = (pp9) childAt;
                    break;
                }
                i2++;
            }
            if (pp9Var != null) {
                wab wabVar2 = sbbVar.w1;
                zw7 zw7Var2 = wabVar2.B0;
                while (true) {
                    if (i >= zw7Var2.getChildCount()) {
                        break;
                    }
                    View childAt2 = zw7Var2.getChildAt(i);
                    if (childAt2 instanceof pp9) {
                        pp9Var2 = (pp9) childAt2;
                        break;
                    }
                    i++;
                }
                wabVar2.C0(pp9Var2, true);
            }
        }
    }

    @Override // u69
    public final void f() {
        ((yg4) this.b).j0.finish();
    }

    @Override // esb
    public final void g(int i) {
        kl2 kl2Var = ((mm8) this.b).F;
        if (kl2Var != null) {
            ArrayList arrayList = kl2Var.h;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                jl2 jl2Var = (jl2) obj;
                if (jl2Var.a == i) {
                    jl2Var.b.e(true, 1.0f);
                    kl2Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override // esb
    public final void g2(long j) {
        mm8 mm8Var = (mm8) this.b;
        c8b c8bVar = mm8Var.d;
        if (c8bVar == null) {
            return;
        }
        c8bVar.D = j;
        c8bVar.j = true;
        mm8Var.w(true);
    }

    @Override // fx7
    public final float get() {
        hc8 hc8Var = (hc8) this.b;
        v01 currentBrush = hc8Var.G0.getCurrentBrush();
        int i = hc8Var.z1;
        return currentBrush == null ? a78.e(i).i : a78.e(i).f(String.valueOf(v01.a.indexOf(currentBrush)), currentBrush.c());
    }

    @Override // ty9
    public final CharSequence getContentDescription() {
        return " ";
    }

    @Override // cj2
    public final long getLongPressDuration() {
        return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
    }

    @Override // u69
    public final void h(float f) {
        ((yg4) this.b).j0.p(f);
    }

    @Override // ty9
    public final int i0() {
        return 0;
    }

    @Override // qec
    public final void invalidate() {
        switch (this.a) {
            case 2:
                ((xl4) this.b).o.invalidate();
                break;
            default:
                ((PhotoViewer) this.b).f0.invalidate();
                break;
        }
    }

    @Override // cj2
    public final void j(View view, float f, float f2) {
        hj6 hj6Var = (hj6) this.b;
        hj6.n(view, f, f2);
        hj6Var.m(false, true, f);
        hl.d3(hj6Var.I, 450L);
        View view2 = hj6Var.P;
        if (view2 != null) {
            view2.performClick();
        }
        hj6Var.P = null;
        hj6Var.invalidate();
        hj6Var.R.a(false, true);
    }

    @Override // be8
    public final void k(r47 r47Var) {
        ((ccb) ((o68) this.b).A1).f(true);
    }

    @Override // yu8
    public final void l() {
        ((np7) this.b).a();
    }

    @Override // v78
    public final void m(ArrayList arrayList) {
        ((zn5) this.b).e(arrayList, false);
    }

    @Override // esb
    public final void m0(float f) {
        mm8 mm8Var = (mm8) this.b;
        c8b c8bVar = mm8Var.d;
        if (c8bVar == null) {
            return;
        }
        c8bVar.s0 = f;
        c8bVar.j = true;
        mm8Var.y(true);
    }

    @Override // ty9
    public final void o(boolean z, float f) {
        o86 o86Var = (o86) this.b;
        q86 q86Var = o86Var.E;
        int round = Math.round(f * 100.0f);
        if (round != i86.c()) {
            i86.g = ete.b(round, 0, 100);
            i86.k();
            i86.d(false);
            q86Var.c0();
            ArrayList arrayList = q86Var.s;
            if (arrayList.isEmpty()) {
                q86Var.b0();
            } else if (arrayList.size() >= 2) {
                arrayList.set(1, new k86(2, 0, 0, 0, i86.c() <= 0 ? ob6.M0(2131748625, null) : i86.c() >= 100 ? ob6.M0(2131748624, null) : ob6.a0(null, null, 2131748626, String.format("%d%%", Integer.valueOf(i86.c())))));
                q86Var.d.g(1);
            }
            if (round <= 0 || round >= 100) {
                try {
                    o86Var.performHapticFeedback(3, 1);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // dgc
    public final void onFirstFrameRendered() {
        bn6 bn6Var = (bn6) this.b;
        Surface surface = bn6Var.v1;
        if (surface != null) {
            bn6Var.c1.s(surface);
            bn6Var.y1 = true;
        }
    }

    @Override // dgc
    public final void p() {
        bn6 bn6Var = (bn6) this.b;
        if (bn6Var.v1 != null) {
            bn6Var.Y0(0, 1);
        }
    }

    @Override // esb
    public final void p1(float f, int i) {
        ArrayList arrayList;
        mm8 mm8Var = (mm8) this.b;
        c8b c8bVar = mm8Var.d;
        if (c8bVar == null || (arrayList = c8bVar.T) == null || i < 0 || i >= arrayList.size()) {
            return;
        }
        ((c8b) mm8Var.d.T.get(i)).V = f;
    }

    @Override // y11
    public final void q(z11 z11Var, j11 j11Var, k11 k11Var, hw hwVar) {
        ((xd8) this.b).g(false, j11Var, k11Var, hwVar);
    }

    @Override // on5
    public final void r(ImageReceiver imageReceiver) {
        at8 at8Var = ((dt8) this.b).h.H0;
        if (at8Var != null) {
            at8Var.d();
        }
    }

    @Override // cj2
    public final void s(View view, float f, float f2) {
        hj6 hj6Var = (hj6) this.b;
        hj6.n(view, f, f2);
        hj6Var.m(false, true, f);
        hl.d3(hj6Var.I, 450L);
        hj6Var.P = null;
        hj6Var.invalidate();
        hj6Var.R.a(false, true);
    }

    @Override // esb
    public final void s1(float f) {
        mm8 mm8Var = (mm8) this.b;
        c8b c8bVar = mm8Var.d;
        if (c8bVar == null) {
            return;
        }
        c8bVar.F = f;
        c8bVar.j = true;
        mm8Var.w(true);
    }

    @Override // esb
    public final void t(float f) {
        mm8 mm8Var = (mm8) this.b;
        c8b c8bVar = mm8Var.d;
        if (c8bVar == null) {
            return;
        }
        c8bVar.u0 = f;
        c8bVar.j = true;
        mm8Var.b();
    }

    @Override // a43
    public final void t0(boolean z) {
        ((k88) this.b).c.setAspectLock(z);
    }

    @Override // esb
    public final void v0(boolean z) {
        mm8 mm8Var = (mm8) this.b;
        if (mm8Var.i()) {
            mm8Var.F.getClass();
        }
        mm8Var.x(-4, z);
    }

    @Override // dgc
    public final void w() {
        w64 w64Var = ((bn6) this.b).Y;
        if (w64Var != null) {
            w64Var.a();
        }
    }

    @Override // esb
    public final void y(float f) {
        mm8 mm8Var = (mm8) this.b;
        c8b c8bVar = mm8Var.d;
        if (c8bVar == null) {
            return;
        }
        c8bVar.G = f;
        c8bVar.j = true;
        mm8Var.b();
    }

    @Override // v78
    public final void y0() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            ((zn5) this.b).a.startActivityForResult(intent, 14);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // p7
    public final void A() {
    }

    @Override // cj2
    public final void p0() {
    }

    @Override // aea
    public final void u() {
    }

    @Override // ty9
    public final void x() {
    }

    @Override // cj2
    public final void x0() {
    }

    @Override // dgc
    public final void a(ggc ggcVar) {
    }

    @Override // yu8
    public final void i(vp7 vp7Var) {
    }

    public /* synthetic */ v34(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public v34(MediaMetadataCompat mediaMetadataCompat) {
        this.a = (byte) 16;
        Bundle bundle = new Bundle(mediaMetadataCompat.a);
        this.b = bundle;
        rx6.D(bundle);
    }

    @Override // cj2
    public final void I(float f, float f2) {
    }

    @Override // cj2
    public final void n(float f, float f2) {
    }

    @Override // on5
    public final void z(int i, Drawable drawable) {
    }

    @Override // on5
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
    }
}
