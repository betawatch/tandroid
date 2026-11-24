// default package

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Surface;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class pj4 implements qac, rh5, jaa, f48, lt8, yt7, zu9, gi2, fcc, gs3, px2, xb1, ca1, o7, t58, sbc, al0, i8b {
    public final /* synthetic */ byte a;
    public Object b;

    public pj4(String str, Charset charset) {
        int i;
        this.a = (byte) 17;
        fs3 fs3Var = new fs3(str, charset);
        CharsetEncoder[] charsetEncoderArr = fs3Var.a;
        int i2 = 0;
        int i3 = -1;
        if (charsetEncoderArr.length == 1) {
            this.b = new int[str.length()];
            while (i2 < ((int[]) this.b).length) {
                char charAt = str.charAt(i2);
                int[] iArr = (int[]) this.b;
                if (charAt == 65535) {
                    charAt = 1000;
                }
                iArr[i2] = charAt;
                i2++;
            }
            return;
        }
        int length = str.length();
        vd7[][] vd7VarArr = (vd7[][]) Array.newInstance((Class<?>) vd7.class, length + 1, charsetEncoderArr.length);
        s(str, fs3Var, vd7VarArr, 0, null);
        for (int i4 = 1; i4 <= length; i4++) {
            for (int i5 = 0; i5 < charsetEncoderArr.length; i5++) {
                vd7 vd7Var = vd7VarArr[i4][i5];
                if (vd7Var != null && i4 < length) {
                    s(str, fs3Var, vd7VarArr, i4, vd7Var);
                }
            }
            for (int i6 = 0; i6 < charsetEncoderArr.length; i6++) {
                vd7VarArr[i4 - 1][i6] = null;
            }
        }
        int i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i8 = 0; i8 < charsetEncoderArr.length; i8++) {
            vd7 vd7Var2 = vd7VarArr[length][i8];
            if (vd7Var2 != null && (i = vd7Var2.d) < i7) {
                i3 = i8;
                i7 = i;
            }
        }
        if (i3 < 0) {
            sc8.j(tb4.y("Failed to encode \"", str, "\""));
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        vd7 vd7Var3 = vd7VarArr[length][i3];
        while (vd7Var3 != null) {
            vd7 vd7Var4 = vd7Var3.c;
            int i9 = vd7Var3.b;
            char c = vd7Var3.a;
            if (c == 1000) {
                arrayList.add(0, 1000);
            } else {
                byte[] bytes = String.valueOf(c).getBytes(charsetEncoderArr[i9].charset());
                for (int length2 = bytes.length - 1; length2 >= 0; length2--) {
                    arrayList.add(0, Integer.valueOf(bytes[length2] & 255));
                }
            }
            if ((vd7Var4 == null ? 0 : vd7Var4.b) != i9) {
                arrayList.add(0, Integer.valueOf(ak1.a(charsetEncoderArr[i9].charset()).a[0] + 256));
            }
            vd7Var3 = vd7Var4;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        while (i2 < size) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
            i2++;
        }
        this.b = iArr2;
    }

    public static void s(String str, fs3 fs3Var, vd7[][] vd7VarArr, int i, vd7 vd7Var) {
        char charAt = str.charAt(i);
        CharsetEncoder[] charsetEncoderArr = fs3Var.a;
        int length = charsetEncoderArr.length;
        int i2 = fs3Var.b;
        if (i2 < 0 || !(charAt == 65535 || charsetEncoderArr[i2].canEncode(String.valueOf(charAt)))) {
            i2 = 0;
        } else {
            length = i2 + 1;
        }
        while (i2 < length) {
            if (charAt == 65535 || charsetEncoderArr[i2].canEncode(String.valueOf(charAt))) {
                vd7 vd7Var2 = new vd7(charAt, fs3Var, i2, vd7Var);
                vd7[] vd7VarArr2 = vd7VarArr[i + 1];
                vd7 vd7Var3 = vd7VarArr2[i2];
                if (vd7Var3 == null || vd7Var3.d > vd7Var2.d) {
                    vd7VarArr2[i2] = vd7Var2;
                }
            }
            i2++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x026c, code lost:
    
        throw av7.a("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i, int i2, ja3 ja3Var) {
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
        qj6 qj6Var = (qj6) this.b;
        c9c c9cVar = qj6Var.b;
        SparseArray sparseArray = qj6Var.c;
        xu7 xu7Var = qj6Var.m;
        xu7 xu7Var2 = qj6Var.k;
        byte b3 = 2;
        int i11 = 0;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (qj6Var.V == 2) {
                    pj6 pj6Var = (pj6) sparseArray.get(qj6Var.b0);
                    int i12 = qj6Var.e0;
                    xu7 xu7Var3 = qj6Var.r;
                    if (i12 != 4 || !"V_VP9".equals(pj6Var.c)) {
                        ja3Var.l(i2, false);
                        return;
                    }
                    xu7Var3.K(i2);
                    ja3Var.c(xu7Var3.a, 0, i2, false);
                    if (qj6Var.f) {
                        return;
                    }
                    byte[] bArr = xu7Var3.a;
                    byte[] bArr2 = wj2.d;
                    if (i2 >= bArr2.length) {
                        for (int i13 = 0; i13 < bArr2.length; i13++) {
                            if (bArr[i13] != bArr2[i13]) {
                                return;
                            }
                        }
                        xu7Var3.K(0);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 16877) {
                qj6Var.h(i);
                pj6 pj6Var2 = qj6Var.B;
                int i14 = pj6Var2.i;
                if (i14 != 1685485123 && i14 != 1685480259) {
                    ja3Var.l(i2, false);
                    return;
                }
                byte[] bArr3 = new byte[i2];
                pj6Var2.P = bArr3;
                ja3Var.c(bArr3, 0, i2, false);
                return;
            }
            if (i == 16981) {
                qj6Var.h(i);
                byte[] bArr4 = new byte[i2];
                qj6Var.B.k = bArr4;
                ja3Var.c(bArr4, 0, i2, false);
                return;
            }
            if (i == 18402) {
                byte[] bArr5 = new byte[i2];
                ja3Var.c(bArr5, 0, i2, false);
                qj6Var.h(i);
                qj6Var.B.l = new vxb(1, 0, 0, bArr5);
                return;
            }
            if (i == 21419) {
                Arrays.fill(xu7Var.a, (byte) 0);
                ja3Var.c(xu7Var.a, 4 - i2, i2, false);
                xu7Var.N(0);
                qj6Var.D = (int) xu7Var.C();
                return;
            }
            if (i == 25506) {
                qj6Var.h(i);
                byte[] bArr6 = new byte[i2];
                qj6Var.B.m = bArr6;
                ja3Var.c(bArr6, 0, i2, false);
                return;
            }
            if (i != 30322) {
                throw av7.a("Unexpected id: " + i, null);
            }
            qj6Var.h(i);
            byte[] bArr7 = new byte[i2];
            qj6Var.B.y = bArr7;
            ja3Var.c(bArr7, 0, i2, false);
            return;
        }
        int i15 = 8;
        if (qj6Var.V == 0) {
            qj6Var.b0 = (int) c9cVar.d(ja3Var, false, true, 8);
            qj6Var.c0 = c9cVar.b;
            qj6Var.X = -9223372036854775807L;
            qj6Var.V = (byte) 1;
            xu7Var2.K(0);
        }
        pj6 pj6Var3 = (pj6) sparseArray.get(qj6Var.b0);
        if (pj6Var3 == null) {
            ja3Var.l(i2 - qj6Var.c0, false);
            qj6Var.V = (byte) 0;
            return;
        }
        pj6Var3.d0.getClass();
        if (qj6Var.V == 1) {
            qj6Var.n(ja3Var, 3);
            int i16 = (xu7Var2.a[2] & 6) >> 1;
            if (i16 == 0) {
                qj6Var.Z = 1;
                int[] iArr2 = qj6Var.a0;
                if (iArr2 == null) {
                    iArr2 = new int[1];
                } else if (iArr2.length < 1) {
                    iArr2 = new int[Math.max(iArr2.length << 1, 1)];
                }
                qj6Var.a0 = iArr2;
                iArr2[0] = (i2 - qj6Var.c0) - 3;
            } else {
                qj6Var.n(ja3Var, 4);
                int i17 = (xu7Var2.a[3] & kk7.d4) + 1;
                qj6Var.Z = i17;
                int[] iArr3 = qj6Var.a0;
                if (iArr3 == null) {
                    iArr3 = new int[i17];
                    i3 = 4;
                } else {
                    i3 = 4;
                    if (iArr3.length < i17) {
                        iArr3 = new int[Math.max(iArr3.length << 1, i17)];
                    }
                }
                qj6Var.a0 = iArr3;
                if (i16 == 2) {
                    int i18 = (i2 - qj6Var.c0) - 4;
                    int i19 = qj6Var.Z;
                    Arrays.fill(iArr3, 0, i19, i18 / i19);
                } else if (i16 == 1) {
                    int i20 = 0;
                    int i21 = 0;
                    int i22 = i3;
                    while (true) {
                        i8 = qj6Var.Z - 1;
                        iArr = qj6Var.a0;
                        if (i20 >= i8) {
                            break;
                        }
                        iArr[i20] = 0;
                        while (true) {
                            i9 = i22 + 1;
                            qj6Var.n(ja3Var, i9);
                            int i23 = xu7Var2.a[i22] & 255;
                            int[] iArr4 = qj6Var.a0;
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
                    iArr[i8] = tb4.f(i2, qj6Var.c0, i22, i21);
                } else {
                    if (i16 != 3) {
                        throw av7.a("Unexpected lacing value: " + i16, null);
                    }
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = i3;
                    while (true) {
                        int i27 = qj6Var.Z - 1;
                        int[] iArr5 = qj6Var.a0;
                        if (i24 >= i27) {
                            b = b3;
                            i4 = i11;
                            iArr5[i27] = tb4.f(i2, qj6Var.c0, i26, i25);
                            break;
                        }
                        iArr5[i24] = i11;
                        int i28 = i26 + 1;
                        qj6Var.n(ja3Var, i28);
                        if (xu7Var2.a[i26] == 0) {
                            throw av7.a("No valid varint length mask found", null);
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
                            if ((xu7Var2.a[i26] & i30) != 0) {
                                i7 = i28 + i29;
                                qj6Var.n(ja3Var, i7);
                                b2 = b3;
                                j = xu7Var2.a[i26] & 255 & (~i30);
                                while (i28 < i7) {
                                    j = (j << i5) | (xu7Var2.a[i28] & 255);
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
                        int[] iArr6 = qj6Var.a0;
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
            byte[] bArr8 = xu7Var2.a;
            qj6Var.W = qj6Var.p((bArr8[i4] << 8) | (bArr8[1] & 255)) + qj6Var.T;
            qj6Var.d0 = (pj6Var3.f == 1 || (i == 163 && (xu7Var2.a[b] & 128) == 128)) ? 1 : i4;
            qj6Var.V = b;
            qj6Var.Y = i4;
        }
        if (i == 163) {
            while (true) {
                int i32 = qj6Var.Y;
                if (i32 >= qj6Var.Z) {
                    qj6Var.V = (byte) 0;
                    return;
                } else {
                    qj6Var.i(pj6Var3, ((qj6Var.Y * pj6Var3.g) / 1000) + qj6Var.W, qj6Var.d0, qj6Var.r(ja3Var, pj6Var3, qj6Var.a0[i32], false), 0);
                    qj6Var.Y++;
                }
            }
        } else {
            while (true) {
                int i33 = qj6Var.Y;
                if (i33 >= qj6Var.Z) {
                    return;
                }
                int[] iArr7 = qj6Var.a0;
                iArr7[i33] = qj6Var.r(ja3Var, pj6Var3, iArr7[i33], true);
                qj6Var.Y++;
            }
        }
    }

    @Override // xb1
    public final FrameLayout E() {
        return (x6b) this.b;
    }

    @Override // t58
    public final void F(String str) {
        ((b68) this.b).l0(str);
    }

    @Override // jaa
    public final void G() {
        switch (this.a) {
            case 5:
                if (gl.C3()) {
                    ((h75) this.b).c1().k(0L, 33, null, null, null, null);
                    break;
                }
                break;
            default:
                ((y28) this.b).I0();
                break;
        }
    }

    @Override // gi2
    public final boolean H0(float f, float f2) {
        ch6 ch6Var = (ch6) this.b;
        View view = null;
        ch6Var.P = null;
        int childCount = ch6Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = ch6Var.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && f >= childAt.getLeft() && f <= childAt.getRight() && f2 >= childAt.getTop() && f2 <= childAt.getBottom()) {
                view = childAt;
                break;
            }
            childCount--;
        }
        return (view == null || ch6Var.Q.contains(view)) ? false : true;
    }

    @Override // xb1
    public final long I() {
        f4b f4bVar = ((x6b) this.b).b2;
        if (f4bVar == null) {
            return 0L;
        }
        return (long) (f4bVar.a0 * f4bVar.h0);
    }

    @Override // xb1
    public final long J() {
        f4b f4bVar = ((x6b) this.b).b2;
        if (f4bVar == null) {
            return 0L;
        }
        return (long) (f4bVar.Z * f4bVar.h0);
    }

    @Override // al0
    public final int K() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        nl0 nl0Var = profileActivity.M5;
        return bm2.f(profileActivity.e2(), 553648127, nl0Var.a(nl0Var.c));
    }

    @Override // gi2
    public final boolean K0(View view, float f, float f2) {
        ch6 ch6Var = (ch6) this.b;
        ch6.n(view, f, f2);
        gl.r(ch6Var.I);
        ch6Var.setSkipDrawSelector(true);
        ch6Var.m(true, false, f);
        ch6Var.invalidate();
        ch6Var.R.a(true, true);
        return true;
    }

    @Override // xb1
    public final void L(cc1 cc1Var) {
        ((x6b) this.b).a0(cc1Var);
    }

    @Override // xb1
    public final void M(long j) {
        y54 y54Var;
        i7b i7bVar = ((x6b) this.b).W1;
        if (i7bVar != null) {
            lbc lbcVar = i7bVar.e;
            if (lbcVar == null || ((y54Var = lbcVar.d) != null && y54Var.c0())) {
                i7bVar.m(j);
            }
        }
    }

    @Override // yt7
    public final void O(float f) {
        q88 q88Var = (q88) this.b;
        k38.e(q88Var.F1).k(String.valueOf(m01.a.indexOf(q88Var.M0.getCurrentBrush())), f);
        mcb mcbVar = q88Var.A1;
        mcbVar.c = f;
        q88Var.u0(mcbVar, null);
    }

    public final void P(int i, long j) {
        qj6 qj6Var = (qj6) this.b;
        if (i == 136) {
            qj6Var.h(i);
            qj6Var.B.b0 = j == 1;
            return;
        }
        if (i == 137) {
            qj6Var.k(i).e = j;
            return;
        }
        if (i == 145) {
            qj6Var.k(i).b = j;
            return;
        }
        if (i == 146) {
            qj6Var.k(i).c = j;
            return;
        }
        if (i == 240) {
            if (qj6Var.C) {
                return;
            }
            qj6Var.g(i);
            if (qj6Var.K == -1) {
                qj6Var.K = j;
                return;
            }
            return;
        }
        if (i == 241) {
            if (qj6Var.C) {
                return;
            }
            qj6Var.g(i);
            if (qj6Var.J == -1) {
                qj6Var.J = j;
                return;
            }
            return;
        }
        if (i == 20529) {
            if (j != 0) {
                throw av7.a("ContentEncodingOrder " + j + " not supported", null);
            }
            return;
        }
        if (i == 20530) {
            if (j != 1) {
                throw av7.a("ContentEncodingScope " + j + " not supported", null);
            }
            return;
        }
        if (i == 29636) {
            qj6Var.k(i).a = j;
            return;
        }
        if (i == 29637) {
            qj6Var.h(i);
            qj6Var.B.e = j;
            return;
        }
        switch (i) {
            case kk7.O1 /* 131 */:
                int i2 = (int) j;
                if (i2 == 1) {
                    qj6Var.h(i);
                    qj6Var.B.f = 2;
                    return;
                }
                if (i2 == 2) {
                    qj6Var.h(i);
                    qj6Var.B.f = 1;
                    return;
                } else if (i2 == 17) {
                    qj6Var.h(i);
                    qj6Var.B.f = 3;
                    return;
                } else if (i2 != 33) {
                    qj6Var.h(i);
                    qj6Var.B.f = -1;
                    return;
                } else {
                    qj6Var.h(i);
                    qj6Var.B.f = 5;
                    return;
                }
            case kk7.h2 /* 152 */:
                qj6Var.k(i).d = j == 1;
                return;
            case kk7.k2 /* 155 */:
                qj6Var.X = qj6Var.p(j);
                return;
            case kk7.o2 /* 159 */:
                qj6Var.h(i);
                qj6Var.B.Q = (int) j;
                return;
            case kk7.F2 /* 176 */:
                qj6Var.h(i);
                qj6Var.B.o = (int) j;
                return;
            case kk7.I2 /* 179 */:
                if (qj6Var.C) {
                    return;
                }
                qj6Var.g(i);
                qj6Var.H = qj6Var.p(j);
                return;
            case kk7.P2 /* 186 */:
                qj6Var.h(i);
                qj6Var.B.p = (int) j;
                return;
            case kk7.r3 /* 215 */:
                qj6Var.h(i);
                qj6Var.B.d = (int) j;
                return;
            case kk7.G3 /* 231 */:
                qj6Var.T = qj6Var.p(j);
                return;
            case kk7.M3 /* 238 */:
                qj6Var.e0 = (int) j;
                return;
            case kk7.V3 /* 247 */:
                if (qj6Var.C) {
                    return;
                }
                qj6Var.g(i);
                qj6Var.I = (int) j;
                return;
            case kk7.Z3 /* 251 */:
                qj6Var.f0 = true;
                return;
            case 16871:
                qj6Var.h(i);
                qj6Var.B.i = (int) j;
                return;
            case 16980:
                if (j != 3) {
                    throw av7.a("ContentCompAlgo " + j + " not supported", null);
                }
                return;
            case 17029:
                if (j < 1 || j > 2) {
                    throw av7.a("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j != 1) {
                    throw av7.a("EBMLReadVersion " + j + " not supported", null);
                }
                return;
            case 18401:
                if (j != 5) {
                    throw av7.a("ContentEncAlgo " + j + " not supported", null);
                }
                return;
            case 18408:
                if (j != 1) {
                    throw av7.a("AESSettingsCipherMode " + j + " not supported", null);
                }
                return;
            case 21420:
                qj6Var.E = j + qj6Var.u;
                return;
            case 21432:
                int i3 = (int) j;
                qj6Var.h(i);
                if (i3 == 0) {
                    qj6Var.B.z = 0;
                    return;
                }
                if (i3 == 1) {
                    qj6Var.B.z = 2;
                    return;
                } else if (i3 == 3) {
                    qj6Var.B.z = 1;
                    return;
                } else {
                    if (i3 == 15) {
                        qj6Var.B.z = 3;
                        return;
                    }
                    return;
                }
            case 21680:
                qj6Var.h(i);
                qj6Var.B.r = (int) j;
                return;
            case 21682:
                qj6Var.h(i);
                qj6Var.B.t = (int) j;
                return;
            case 21690:
                qj6Var.h(i);
                qj6Var.B.s = (int) j;
                return;
            case 21930:
                qj6Var.h(i);
                qj6Var.B.a0 = j == 1;
                return;
            case 21938:
                qj6Var.h(i);
                qj6Var.B.q = (int) j;
                return;
            case 21998:
                qj6Var.h(i);
                qj6Var.B.h = (int) j;
                return;
            case 22186:
                qj6Var.h(i);
                qj6Var.B.U = j;
                return;
            case 22203:
                qj6Var.h(i);
                qj6Var.B.V = j;
                return;
            case 25188:
                qj6Var.h(i);
                qj6Var.B.R = (int) j;
                return;
            case 30114:
                qj6Var.g0 = j;
                return;
            case 30321:
                qj6Var.h(i);
                int i4 = (int) j;
                if (i4 == 0) {
                    qj6Var.B.u = 0;
                    return;
                }
                if (i4 == 1) {
                    qj6Var.B.u = 1;
                    return;
                } else if (i4 == 2) {
                    qj6Var.B.u = 2;
                    return;
                } else {
                    if (i4 == 3) {
                        qj6Var.B.u = 3;
                        return;
                    }
                    return;
                }
            case 2352003:
                qj6Var.h(i);
                qj6Var.B.g = (int) j;
                return;
            case 2807729:
                qj6Var.v = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        qj6Var.h(i);
                        int i5 = (int) j;
                        if (i5 == 1) {
                            qj6Var.B.C = 2;
                            return;
                        } else {
                            if (i5 == 2) {
                                qj6Var.B.C = 1;
                                return;
                            }
                            return;
                        }
                    case 21946:
                        qj6Var.h(i);
                        int g = hl2.g((int) j);
                        if (g != -1) {
                            qj6Var.B.B = g;
                            return;
                        }
                        return;
                    case 21947:
                        qj6Var.h(i);
                        int f = hl2.f((int) j);
                        if (f != -1) {
                            qj6Var.B.A = f;
                            return;
                        }
                        return;
                    case 21948:
                        qj6Var.h(i);
                        qj6Var.B.D = (int) j;
                        return;
                    case 21949:
                        qj6Var.h(i);
                        qj6Var.B.E = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // o7
    public final void Q() {
        u58 u58Var = (u58) this.b;
        u58Var.R.setText(k96.M0(u58Var.Z ? 2131745154 : 2131745153, null));
        u58Var.R.setIcon(u58Var.Z ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // ca1
    public final void Q1(vf7 vf7Var) {
        vx7 vx7Var = (vx7) this.b;
        if (!TextUtils.isEmpty(vf7Var.b)) {
            vx7Var.Z[0].setText(vf7Var.b);
        }
        if (!TextUtils.isEmpty(vf7Var.d)) {
            vx7Var.Z[1].setText(vf7Var.d);
        }
        if (!TextUtils.isEmpty(vf7Var.c)) {
            vx7Var.Z[2].setText(vf7Var.c);
        }
        int i = vf7Var.n;
        if (i != 0) {
            if (i == 1) {
                vx7Var.x = "male";
                vx7Var.Z[4].setText(k96.M0(2131747315, null));
            } else if (i == 2) {
                vx7Var.x = "female";
                vx7Var.Z[4].setText(k96.M0(2131747376, null));
            }
        }
        if (!TextUtils.isEmpty(vf7Var.m)) {
            String str = vf7Var.m;
            vx7Var.s = str;
            String str2 = (String) vx7Var.Z0.get(str);
            if (str2 != null) {
                vx7Var.Z[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(vf7Var.l)) {
            String str3 = vf7Var.l;
            vx7Var.w = str3;
            String str4 = (String) vx7Var.Z0.get(str3);
            if (str4 != null) {
                vx7Var.Z[6].setText(str4);
            }
        }
        int i2 = vf7Var.k;
        if (i2 <= 0 || vf7Var.j <= 0 || vf7Var.i <= 0) {
            return;
        }
        vx7Var.Z[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i2), Integer.valueOf(vf7Var.j), Integer.valueOf(vf7Var.i)));
    }

    @Override // xb1
    public final void R(l34 l34Var) {
        ((x6b) this.b).B0(l34Var);
    }

    @Override // gi2
    public final boolean S() {
        return false;
    }

    public final void T() {
        ((dn4) this.b).d.R();
    }

    public final void U(af6 af6Var) {
        lf6 lf6Var = (lf6) this.b;
        boolean z = true;
        lf6Var.O = true;
        mf6 mf6Var = lf6Var.h0;
        mf6Var.K = false;
        mf6Var.A1(0, false);
        if (gl.L1()) {
            boolean z2 = mf6Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            boolean z3 = mf6Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            int i = Build.VERSION.SDK_INT;
            boolean z4 = i < 28 || mf6Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z5 = i < 26 || mf6Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            if6 if6Var = lf6Var.a;
            if (if6Var != null && "888".equals(if6Var.getText())) {
                z2 = true;
                z3 = true;
                z4 = true;
                z5 = true;
            }
            if (mf6Var.w) {
                mf6Var.r.clear();
                if (!z2) {
                    mf6Var.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z3) {
                    mf6Var.r.add("android.permission.CALL_PHONE");
                }
                if (!z4) {
                    mf6Var.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z5 && i >= 26) {
                    mf6Var.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!mf6Var.r.isEmpty()) {
                    SharedPreferences c1 = na7.c1();
                    if (!c1.getBoolean("firstlogin", true) && !mf6Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !mf6Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            mf6Var.getParentActivity().requestPermissions((String[]) mf6Var.r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e) {
                            fa4.g(e, true);
                            return;
                        }
                    }
                    c1.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mf6Var.getParentActivity());
                    alertDialog$Builder.j(k96.M0(2131751759, "Continue"), null);
                    int i2 = R.raw.calls_log;
                    hd hdVar = alertDialog$Builder.a;
                    if (!z2 && (!z3 || !z4)) {
                        hdVar.U = k96.M0(2131754271, "AllowReadCallAndLog");
                    } else if (z3 && z4) {
                        hdVar.U = k96.M0(2131754272, "AllowReadCall");
                        i2 = R.raw.incoming_calls;
                    } else {
                        hdVar.U = k96.M0(2131754270, "AllowReadCallLog");
                    }
                    int i3 = bkb.K5;
                    alertDialog$Builder.l(i2, 46, bkb.w0(null, i3, false), null);
                    alertDialog$Builder.m(i3, null);
                    mf6Var.h = mf6Var.showDialog(hdVar);
                    lf6Var.O = true;
                    return;
                }
            }
            z = true;
        }
        kf6 kf6Var = new kf6((byte) 0, this, af6Var);
        int i4 = af6.G;
        af6Var.h.f(z, z);
        gl.d3(kf6Var, 400L);
    }

    @Override // al0
    public final float U0() {
        return 0.0f;
    }

    public final void V(ut6 ut6Var, zs6 zs6Var, ArrayList arrayList) {
        ux4 ux4Var = (ux4) this.b;
        if (ut6Var != ux4Var.y || zs6Var == null) {
            if (ut6Var == ux4Var.e) {
                if (zs6Var != null) {
                    ux4Var.n(ux4Var.d, zs6Var);
                }
                ux4Var.d.n(arrayList);
                return;
            }
            return;
        }
        du6 du6Var = ux4Var.x.a;
        String d = zs6Var.d();
        eu6 eu6Var = new eu6(du6Var, d, ux4Var.b(du6Var, d), false);
        eu6Var.i(zs6Var);
        if (ux4Var.d != eu6Var) {
            ux4Var.h(ux4Var, eu6Var, ux4Var.y, 3, ux4Var.x, arrayList);
            ux4Var.x = null;
            ux4Var.y = null;
        }
    }

    public final void W(String str, Bitmap bitmap) {
        ps psVar = MediaMetadataCompat.d;
        if (!psVar.containsKey(str) || ((Integer) psVar.get(str)).intValue() == 2) {
            ((Bundle) this.b).putParcelable(str, bitmap);
        } else {
            w26.j(tb4.y("The ", str, " key cannot be used to put a Bitmap"));
        }
    }

    @Override // ca1
    public final boolean W0(String str, u91 u91Var) {
        return false;
    }

    public final void X(long j) {
        ps psVar = MediaMetadataCompat.d;
        if (!psVar.containsKey("android.media.metadata.DURATION") || ((Integer) psVar.get("android.media.metadata.DURATION")).intValue() == 0) {
            ((Bundle) this.b).putLong("android.media.metadata.DURATION", j);
        } else {
            w26.j("The android.media.metadata.DURATION key cannot be used to put a long");
        }
    }

    public final void Y(String str, String str2) {
        ps psVar = MediaMetadataCompat.d;
        if (!psVar.containsKey(str) || ((Integer) psVar.get(str)).intValue() == 1) {
            ((Bundle) this.b).putCharSequence(str, str2);
        } else {
            w26.j(tb4.y("The ", str, " key cannot be used to put a String"));
        }
    }

    public final void Z(long j, int i, long j2) {
        qj6 qj6Var = (qj6) this.b;
        qj6Var.q0.getClass();
        if (i == 128) {
            qj6Var.k(i).h = null;
            qj6Var.k(i).i = null;
            return;
        }
        if (i == 160) {
            qj6Var.f0 = false;
            qj6Var.g0 = 0L;
            return;
        }
        if (i == 174) {
            pj6 pj6Var = new pj6();
            pj6Var.o = -1;
            pj6Var.p = -1;
            pj6Var.q = -1;
            pj6Var.r = -1;
            pj6Var.s = -1;
            pj6Var.t = 0;
            pj6Var.u = -1;
            pj6Var.v = 0.0f;
            pj6Var.w = 0.0f;
            pj6Var.x = 0.0f;
            pj6Var.y = null;
            pj6Var.z = -1;
            pj6Var.A = -1;
            pj6Var.B = -1;
            pj6Var.C = -1;
            pj6Var.D = 1000;
            pj6Var.E = kk7.d3;
            pj6Var.F = -1.0f;
            pj6Var.G = -1.0f;
            pj6Var.H = -1.0f;
            pj6Var.I = -1.0f;
            pj6Var.J = -1.0f;
            pj6Var.K = -1.0f;
            pj6Var.L = -1.0f;
            pj6Var.M = -1.0f;
            pj6Var.N = -1.0f;
            pj6Var.O = -1.0f;
            pj6Var.Q = 1;
            pj6Var.R = -1;
            pj6Var.S = -1;
            pj6Var.T = 8000;
            pj6Var.U = 0L;
            pj6Var.V = 0L;
            pj6Var.X = false;
            pj6Var.b0 = true;
            pj6Var.c0 = "eng";
            qj6Var.B = pj6Var;
            pj6Var.a = qj6Var.y;
            return;
        }
        if (i == 187) {
            if (qj6Var.C) {
                return;
            }
            qj6Var.g(i);
            qj6Var.H = -9223372036854775807L;
            return;
        }
        if (i == 19899) {
            qj6Var.D = -1;
            qj6Var.E = -1L;
            return;
        }
        if (i == 20533) {
            qj6Var.h(i);
            qj6Var.B.j = true;
            return;
        }
        if (i == 408125543) {
            long j3 = qj6Var.u;
            if (j3 != -1 && j3 != j) {
                throw av7.a("Multiple Segment elements not supported", null);
            }
            qj6Var.u = j;
            qj6Var.t = j2;
            return;
        }
        if (i == 475249515) {
            if (qj6Var.C) {
                return;
            }
            qj6Var.G = true;
            return;
        }
        if (i == 524531317) {
            if (qj6Var.P == -1 || qj6Var.S) {
                qj6Var.m();
                return;
            } else {
                qj6Var.Q = true;
                return;
            }
        }
        if (i == 182) {
            mj6 mj6Var = new mj6();
            mj6Var.b = -9223372036854775807L;
            mj6Var.c = -9223372036854775807L;
            qj6Var.A = mj6Var;
            return;
        }
        if (i != 183 || qj6Var.C) {
            return;
        }
        qj6Var.g(i);
        qj6Var.I = -1;
        qj6Var.J = -1L;
        qj6Var.K = -1L;
    }

    @Override // ca1
    public final String Z0() {
        return null;
    }

    @Override // zu9
    public final int a0() {
        return 0;
    }

    @Override // al0
    public final int a1() {
        return 0;
    }

    @Override // gs3
    public final int b(int i) {
        int[] iArr = (int[]) this.b;
        if (i < 0 || i >= iArr.length) {
            k93.i(String.valueOf(i));
            return 0;
        }
        if (c(i)) {
            return iArr[i] - 256;
        }
        w26.j(tb4.n(i, "value at ", " is not an ECI but a character"));
        return 0;
    }

    @Override // al0
    public final int b0() {
        return 0;
    }

    @Override // gs3
    public final boolean c(int i) {
        if (i >= 0) {
            int[] iArr = (int[]) this.b;
            if (i < iArr.length) {
                int i2 = iArr[i];
                return i2 > 255 && i2 <= 999;
            }
        }
        k93.i(String.valueOf(i));
        return false;
    }

    public final void c0(int i, String str) {
        qj6 qj6Var = (qj6) this.b;
        if (i == 133) {
            qj6Var.k(i).h = str;
            return;
        }
        if (i == 134) {
            qj6Var.h(i);
            qj6Var.B.c = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                qj6Var.y = str.equals("webm");
                return;
            }
            throw av7.a("DocType " + str + " not supported", null);
        }
        if (i == 17276) {
            qj6Var.k(i).i = str;
            return;
        }
        if (i == 21358) {
            qj6Var.h(i);
            qj6Var.B.b = str;
        } else {
            if (i != 2274716) {
                return;
            }
            qj6Var.h(i);
            qj6Var.B.c0 = str;
        }
    }

    @Override // gs3
    public final char charAt(int i) {
        int[] iArr = (int[]) this.b;
        if (i < 0 || i >= iArr.length) {
            k93.i(String.valueOf(i));
            return (char) 0;
        }
        if (c(i)) {
            w26.j(tb4.n(i, "value at ", " is not a character but an ECI"));
            return (char) 0;
        }
        if (i < 0 || i >= iArr.length) {
            k93.i(String.valueOf(i));
            return (char) 0;
        }
        int i2 = iArr[i];
        if (i2 == 1000) {
            return (char) 65535;
        }
        return (char) i2;
    }

    @Override // t58
    public final void d() {
        b68 b68Var = (b68) this.b;
        b68Var.a.b0();
        b68Var.b.b0();
    }

    @Override // al0
    public final int d1() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        nl0 nl0Var = profileActivity.M5;
        return bkb.p1(profileActivity.e2(), nl0Var.a(nl0Var.b));
    }

    @Override // f48
    public final void e(ArrayList arrayList) {
        ((wl5) this.b).e(arrayList, false);
    }

    @Override // i8b
    public final void e1(long j, int i, g28 g28Var) {
        an8 an8Var = (an8) this.b;
        int i2 = ProfileStoriesView.t0;
        an8Var.f(true, false);
        g28Var.run();
    }

    @Override // sbc
    public final void f(float f) {
        x88 x88Var;
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        if (photoViewer.G2 != null || ((x88Var = photoViewer.g0) != null && x88Var.y)) {
            if (!photoViewer.G8 && photoViewer.W7.getVisibility() == 0) {
                f = ((photoViewer.X7.getRightProgress() - photoViewer.X7.getLeftProgress()) * f) + photoViewer.X7.getLeftProgress();
            }
            if (photoViewer.z0() == -9223372036854775807L) {
                photoViewer.a3 = f;
            } else {
                photoViewer.C1((int) (f * r0));
            }
            photoViewer.l2(false);
            photoViewer.u3 = false;
        }
    }

    @Override // gi2
    public final void f1(View view, float f, float f2) {
        ch6 ch6Var = (ch6) this.b;
        ch6.n(view, f, f2);
        ch6Var.m(false, false, f);
        ch6Var.invalidate();
    }

    @Override // gi2
    public final void g(View view, float f, float f2) {
        ch6 ch6Var = (ch6) this.b;
        ch6.n(view, f, f2);
        ch6Var.m(false, true, f);
        gl.d3(ch6Var.I, 450L);
        View view2 = ch6Var.P;
        if (view2 != null) {
            view2.performClick();
        }
        ch6Var.P = null;
        ch6Var.invalidate();
        ch6Var.R.a(false, true);
    }

    @Override // yt7
    public final float get() {
        q88 q88Var = (q88) this.b;
        m01 currentBrush = q88Var.M0.getCurrentBrush();
        int i = q88Var.F1;
        return currentBrush == null ? k38.e(i).i : k38.e(i).f(String.valueOf(m01.a.indexOf(currentBrush)), currentBrush.c());
    }

    @Override // zu9
    public final CharSequence getContentDescription() {
        return " ";
    }

    @Override // gi2
    public final long getLongPressDuration() {
        return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
    }

    @Override // sbc
    public final void h(float f) {
        h88 h88Var;
        h88 h88Var2;
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        x88 x88Var = photoViewer.g0;
        if (x88Var != null && x88Var.y && (h88Var2 = photoViewer.s3) != null) {
            int i = photoViewer.q3.h - tbc.S;
            h88Var2.O = x88Var;
            if (h88Var2.a0 != 0) {
                h88Var2.a0 = 0L;
                h88Var2.g0 = null;
                h88Var2.f0 = null;
                h88Var2.e0 = null;
                h88Var2.b(-1);
            }
            if (i != 0) {
                h88Var2.r = i;
                int i2 = ((int) (i * f)) / 5;
                if (h88Var2.n != i2) {
                    h88Var2.n = i2;
                }
            }
            h88Var2.E = gl.g0((int) (((long) (x88Var.getVideoDuration() * f)) / 1000), false, false);
            h88Var2.F = (int) Math.ceil(h88Var2.G.measureText(r0));
            h88Var2.invalidate();
            if (h88Var2.f != null) {
                Utilities.e.a(h88Var2.f);
            }
            double videoDuration = (f * x88Var.getVideoDuration()) / 1000.0d;
            h88Var2.P = videoDuration;
            String b = x88Var.b((int) videoDuration);
            if (b != null) {
                h88Var2.R.e0(b, null, null, null, 0L);
            }
        } else if (photoViewer.G2 != null && (h88Var = photoViewer.s3) != null) {
            h88Var.e(photoViewer.S4, f, photoViewer.q3.h - tbc.S);
        }
        ((PhotoViewer) this.b).l2(true);
        ((PhotoViewer) this.b).R2();
    }

    @Override // qac
    public final void invalidate() {
        ((sj4) this.b).m.invalidate();
    }

    @Override // zu9
    public final void j(boolean z, float f) {
        k66 k66Var = (k66) this.b;
        m66 m66Var = k66Var.E;
        int round = Math.round(f * 100.0f);
        if (round != e66.c()) {
            e66.g = moe.b(round, 0, 100);
            e66.k();
            e66.d(false);
            m66Var.c0();
            ArrayList arrayList = m66Var.s;
            if (arrayList.isEmpty()) {
                m66Var.b0();
            } else if (arrayList.size() >= 2) {
                arrayList.set(1, new g66(2, 0, 0, 0, e66.c() <= 0 ? k96.M0(2131748679, null) : e66.c() >= 100 ? k96.M0(2131748678, null) : k96.a0(null, null, 2131748680, String.format("%d%%", Integer.valueOf(e66.c())))));
                m66Var.d.g(1);
            }
            if (round <= 0 || round >= 100) {
                try {
                    k66Var.performHapticFeedback(3, 1);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // al0
    public final int k0() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        nl0 nl0Var = profileActivity.M5;
        return bm2.f(profileActivity.e2(), 352321535, nl0Var.a(nl0Var.d));
    }

    @Override // xb1
    public final void l(boolean z) {
        i7b i7bVar = ((x6b) this.b).W1;
        if (i7bVar != null) {
            i7bVar.x(-8713, z);
        }
    }

    @Override // gs3
    public final int length() {
        return ((int[]) this.b).length;
    }

    @Override // xb1
    public final FrameLayout m() {
        return ((x6b) this.b).C1;
    }

    @Override // gi2
    public final void n(View view, float f, float f2) {
        ch6 ch6Var = (ch6) this.b;
        ch6.n(view, f, f2);
        ch6Var.m(false, true, f);
        gl.d3(ch6Var.I, 450L);
        ch6Var.P = null;
        ch6Var.invalidate();
        ch6Var.R.a(false, true);
    }

    @Override // xb1
    public final wjb o() {
        return ((x6b) this.b).w1;
    }

    @Override // fcc
    public final void onFirstFrameRendered() {
        vk6 vk6Var = (vk6) this.b;
        Surface surface = vk6Var.v1;
        if (surface != null) {
            vk6Var.c1.p(surface);
            vk6Var.y1 = true;
        }
    }

    @Override // xb1
    public final cc1 p() {
        x6b x6bVar = (x6b) this.b;
        x6bVar.f2 = true;
        return x6bVar.e0();
    }

    @Override // al0
    public final float p0() {
        return -1.0f;
    }

    @Override // fcc
    public final void q() {
        vk6 vk6Var = (vk6) this.b;
        if (vk6Var.v1 != null) {
            vk6Var.Y0(0, 1);
        }
    }

    @Override // al0
    public final float q0() {
        return -1.0f;
    }

    @Override // f48
    public final void r() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            ((wl5) this.b).a.startActivityForResult(intent, 14);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // gi2
    public final boolean s1() {
        return true;
    }

    @Override // gs3
    public final CharSequence subSequence(int i, int i2) {
        if (i < 0 || i > i2 || i2 > ((int[]) this.b).length) {
            k93.i(String.valueOf(i));
            return null;
        }
        StringBuilder sb = new StringBuilder();
        while (i < i2) {
            if (c(i)) {
                w26.j(tb4.n(i, "value at ", " is not a character but an ECI"));
                return null;
            }
            sb.append(charAt(i));
            i++;
        }
        return sb;
    }

    @Override // xb1
    public final cc1 t() {
        st7 st7Var = ((x6b) this.b).H0;
        for (int i = 0; i < st7Var.getChildCount(); i++) {
            if (st7Var.getChildAt(i) instanceof cc1) {
                return (cc1) st7Var.getChildAt(i);
            }
        }
        return null;
    }

    @Override // al0
    public final int t1() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        nl0 nl0Var = profileActivity.M5;
        return bkb.p1(profileActivity.e2(), nl0Var.a(nl0Var.e));
    }

    public final String toString() {
        switch (this.a) {
            case 17:
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < ((int[]) this.b).length; i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    if (c(i)) {
                        sb.append("ECI(");
                        sb.append(b(i));
                        sb.append(')');
                    } else if (charAt(i) < 128) {
                        sb.append('\'');
                        sb.append(charAt(i));
                        sb.append('\'');
                    } else {
                        sb.append((int) charAt(i));
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // fcc
    public final void u() {
        c64 c64Var = ((vk6) this.b).Y;
        if (c64Var != null) {
            c64Var.a();
        }
    }

    @Override // xb1
    public final long v() {
        i7b i7bVar = ((x6b) this.b).W1;
        if (i7bVar != null) {
            return i7bVar.getCurrentPosition();
        }
        return 0L;
    }

    @Override // i8b
    public final boolean w(long j, int i, int i2, int i3, j8b j8bVar) {
        ImageReceiver imageReceiver;
        zr8 zr8Var;
        zr8 zr8Var2;
        j8bVar.b = null;
        j8bVar.c = null;
        an8 an8Var = (an8) this.b;
        xm8 xm8Var = an8Var.h;
        ArrayList arrayList = an8Var.x;
        if (an8Var.O < 0.2f) {
            j8bVar.b = xm8Var.getImageReceiver();
            j8bVar.c = null;
            j8bVar.a = xm8Var;
            j8bVar.h = 0.0f;
            j8bVar.i = gl.q.y;
            j8bVar.g = (View) an8Var.getParent();
            j8bVar.d = an8Var.E;
            j8bVar.n = true;
            return true;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= arrayList.size()) {
                imageReceiver = null;
                zr8Var = null;
                zr8Var2 = null;
                break;
            }
            zr8 zr8Var3 = (zr8) arrayList.get(i4);
            if (zr8Var3.e < 1.0f || zr8Var3.a != i2) {
                i4++;
            } else {
                int i5 = i4 - 1;
                int i6 = i4 - 2;
                zr8 d = ProfileStoriesView.d(i5 >= 0 ? (zr8) arrayList.get(i5) : null, i6 >= 0 ? (zr8) arrayList.get(i6) : null, zr8Var3);
                imageReceiver = zr8Var3.b;
                zr8Var2 = d;
                zr8Var = zr8Var3;
            }
        }
        if (imageReceiver == null) {
            return false;
        }
        j8bVar.c = imageReceiver;
        j8bVar.b = null;
        j8bVar.a = an8Var;
        j8bVar.h = 0.0f;
        j8bVar.i = gl.q.y;
        j8bVar.g = (View) an8Var.getParent();
        if (zr8Var == null || zr8Var2 == null) {
            j8bVar.f = null;
            return true;
        }
        j8bVar.f = new kh(this, new RectF(zr8Var.m), zr8Var, new RectF(zr8Var2.m), zr8Var2);
        return true;
    }

    @Override // jaa
    public final void x() {
        byte b = this.a;
    }

    @Override // px2
    public final void z(mx2 mx2Var) {
        jj7 jj7Var = (jj7) this.b;
        jj7Var.x1 = true;
        String str = mx2Var.c;
        jj7Var.H1.setText(str);
        jj7Var.G0(str, mx2Var);
        jj7Var.x1 = false;
        gl.d3(new vl6(this, (byte) 23), 300L);
        jj7Var.J1.requestFocus();
        ij7 ij7Var = jj7Var.J1;
        ij7Var.setSelection(ij7Var.length());
    }

    private final void C() {
    }

    private final void N() {
    }

    @Override // o7
    public final void A() {
    }

    @Override // gi2
    public final void h0() {
    }

    @Override // gi2
    public final void n0() {
    }

    @Override // ca1
    public final void onDismiss() {
    }

    @Override // zu9
    public final void y() {
    }

    @Override // ca1
    public final void H(String str) {
    }

    @Override // fcc
    public final void a(icc iccVar) {
    }

    @Override // i8b
    public final void i(boolean z) {
    }

    @Override // gi2
    public final void D(float f, float f2) {
    }

    @Override // gi2
    public final void k(float f, float f2) {
    }

    @Override // lt8
    public final Object get() {
        return this.b;
    }

    public pj4(byte b) {
        this.a = b;
        switch (b) {
            case 4:
                break;
            case 15:
                this.b = new Bundle();
                break;
            default:
                this.b = new np4(5, 1.0f, false, (byte) 0);
                break;
        }
    }

    public /* synthetic */ pj4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public pj4(MediaMetadataCompat mediaMetadataCompat) {
        this.a = (byte) 15;
        Bundle bundle = new Bundle(mediaMetadataCompat.a);
        this.b = bundle;
        mv6.B(bundle);
    }
}
