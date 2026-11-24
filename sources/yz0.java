// default package

import android.util.Pair;
import j$.util.Objects;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class yz0 {
    public static final byte[] a;

    static {
        String str = hac.a;
        a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(yw7 yw7Var) {
        int i = yw7Var.b;
        yw7Var.O(4);
        if (yw7Var.m() != 1751411826) {
            i += 4;
        }
        yw7Var.N(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:310:0x0596, code lost:
    
        if (r12 != 2) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x0176, code lost:
    
        if (r13 == (-1)) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:237:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x07b7  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0806 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0667  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(yw7 yw7Var, int i, int i2, int i3, int i4, String str, boolean z, as3 as3Var, uz0 uz0Var, int i5) {
        int i6;
        int i7;
        int i8;
        int m;
        int i9;
        int i10;
        int i11;
        as3 as3Var2;
        String str2;
        String str3;
        int i12;
        int i13;
        int i14;
        int i15;
        String str4;
        int i16;
        sz0 sz0Var;
        String str5;
        String str6;
        List list;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int f;
        int i28;
        boolean z2;
        boolean z3;
        int i29;
        int i30;
        int i31;
        boolean e;
        int i32;
        String str7;
        int i33;
        String format;
        int i34 = i;
        int i35 = i3;
        int[] iArr = oe3.e;
        int[] iArr2 = oe3.c;
        yw7Var.N(i2 + 16);
        if (z) {
            i6 = yw7Var.H();
            yw7Var.O(6);
        } else {
            yw7Var.O(8);
            i6 = 0;
        }
        int i36 = 0;
        if (i6 == 0 || i6 == 1) {
            i7 = 4;
            i8 = 2;
            int H = yw7Var.H();
            yw7Var.O(6);
            int B = yw7Var.B();
            yw7Var.N(yw7Var.b - 4);
            m = yw7Var.m();
            if (i6 == 1) {
                yw7Var.O(16);
            }
            i9 = B;
            i10 = H;
            i11 = -1;
        } else {
            if (i6 != 2) {
                return;
            }
            yw7Var.O(16);
            i8 = 2;
            i9 = (int) Math.round(Double.longBitsToDouble(yw7Var.u()));
            i10 = yw7Var.E();
            yw7Var.O(4);
            int E = yw7Var.E();
            int E2 = yw7Var.E();
            boolean z4 = (E2 & 1) != 0;
            boolean z5 = (E2 & 2) != 0;
            if (z4) {
                i7 = 4;
                i11 = hac.C(E, z5 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            } else {
                i7 = 4;
                i11 = hac.F(E, z5 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            }
            if (i11 == 0) {
                i11 = -1;
            }
            yw7Var.O(8);
            m = 0;
        }
        if (i34 == 1767992678) {
            i9 = -1;
            i10 = -1;
        } else {
            if (i34 != 1935764850) {
                i9 = i34 == 1935767394 ? od1.AUDIO_CONTENT_SAMPLING_RATE : 8000;
            }
            i10 = 1;
        }
        int i37 = yw7Var.b;
        if (i34 == 1701733217) {
            Pair h = h(yw7Var, i2, i35);
            if (h != null) {
                i34 = ((Integer) h.first).intValue();
                as3Var2 = as3Var == null ? null : as3Var.a(((szb) h.second).b);
                ((szb[]) uz0Var.c)[i5] = (szb) h.second;
            } else {
                as3Var2 = as3Var;
            }
            yw7Var.N(i37);
        } else {
            as3Var2 = as3Var;
        }
        String str8 = "audio/mhm1";
        if (i34 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i34 == 1700998451) {
            str2 = "audio/eac3";
        } else if (i34 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i34 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (i34 == 1685353320 || i34 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (i34 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i34 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i34 == 1935764850) {
            str2 = "audio/3gpp";
        } else if (i34 == 1935767394) {
            str2 = "audio/amr-wb";
        } else {
            if (i34 != 1936684916) {
                if (i34 == 1953984371) {
                    i11 = 268435456;
                } else if (i34 != 1819304813) {
                    str2 = (i34 == 778924082 || i34 == 778924083) ? "audio/mpeg" : i34 == 1835557169 ? "audio/mha1" : i34 == 1835560241 ? "audio/mhm1" : i34 == 1634492771 ? "audio/alac" : i34 == 1634492791 ? "audio/g711-alaw" : i34 == 1970037111 ? "audio/g711-mlaw" : i34 == 1332770163 ? "audio/opus" : i34 == 1716281667 ? "audio/flac" : i34 == 1835823201 ? "audio/true-hd" : i34 == 1767992678 ? "audio/iamf" : null;
                }
                str2 = "audio/raw";
            }
            i11 = i8;
            str2 = "audio/raw";
        }
        sz0 sz0Var2 = null;
        String str9 = null;
        List list2 = null;
        qz0 qz0Var = null;
        while (i37 - i2 < i35) {
            yw7Var.N(i37);
            int m2 = yw7Var.m();
            int i38 = i11;
            zhe.a("childAtomSize must be positive", m2 > 0 ? 1 : i36);
            int m3 = yw7Var.m();
            String str10 = str9;
            if (m3 == 1835557187) {
                yw7Var.N(i37 + 8);
                yw7Var.O(1);
                int A = yw7Var.A();
                yw7Var.O(1);
                if (Objects.equals(str2, str8)) {
                    Object[] objArr = new Object[1];
                    objArr[i36] = Integer.valueOf(A);
                    format = String.format("mhm1.%02X", objArr);
                } else {
                    Object[] objArr2 = new Object[1];
                    objArr2[i36] = Integer.valueOf(A);
                    format = String.format("mha1.%02X", objArr2);
                }
                int H2 = yw7Var.H();
                byte[] bArr = new byte[H2];
                str10 = format;
                int i39 = i36;
                yw7Var.k(i39, H2, bArr);
                list2 = list2 == null ? mo5.u(bArr) : mo5.v(bArr, (byte[]) list2.get(i39));
            } else if (m3 == 1835557200) {
                yw7Var.N(i37 + 8);
                int A2 = yw7Var.A();
                if (A2 > 0) {
                    byte[] bArr2 = new byte[A2];
                    yw7Var.k(0, A2, bArr2);
                    list2 = list2 == null ? mo5.u(bArr2) : mo5.v((byte[]) list2.get(0), bArr2);
                }
            } else {
                if (m3 == 1702061171) {
                    str3 = str2;
                    i12 = i37;
                    i13 = i34;
                    i14 = i12;
                } else if (z && m3 == 2002876005) {
                    int i40 = yw7Var.b;
                    zhe.a(null, i40 >= i37);
                    int i41 = i40;
                    while (true) {
                        if (i41 - i37 < m2) {
                            yw7Var.N(i41);
                            int m4 = yw7Var.m();
                            i33 = i41;
                            zhe.a("childAtomSize must be positive", m4 > 0);
                            if (yw7Var.m() != 1702061171) {
                                i41 = i33 + m4;
                            }
                        } else {
                            i33 = -1;
                        }
                    }
                    String str11 = str2;
                    i13 = i34;
                    i14 = i33;
                    str3 = str11;
                    i12 = i37;
                } else if (m3 == 1651798644) {
                    yw7Var.N(i37 + 8);
                    yw7Var.O(i7);
                    i15 = m2;
                    str6 = str2;
                    sz0Var = sz0Var2;
                    str9 = str10;
                    qz0Var = new qz0(yw7Var.C(), yw7Var.C());
                    i12 = i37;
                    str4 = str8;
                    i16 = 0;
                    i13 = i34;
                    i37 = i12 + i15;
                    i35 = i3;
                    i34 = i13;
                    sz0Var2 = sz0Var;
                    i36 = i16;
                    i11 = i38;
                    str2 = str6;
                    str8 = str4;
                    i7 = 4;
                    i8 = 2;
                } else {
                    str6 = str2;
                    i15 = m2;
                    String str12 = str8;
                    if (m3 == 1684103987) {
                        yw7Var.N(i37 + 8);
                        String num = Integer.toString(i4);
                        ye1 ye1Var = new ye1();
                        ye1Var.k(yw7Var);
                        int i42 = iArr2[ye1Var.f(i8)];
                        ye1Var.n(8);
                        int i43 = iArr[ye1Var.f(3)];
                        if (ye1Var.f(1) != 0) {
                            i43++;
                        }
                        int i44 = oe3.f[ye1Var.f(5)] * 1000;
                        ye1Var.c();
                        yw7Var.N(ye1Var.d());
                        fo4 fo4Var = new fo4();
                        fo4Var.a = num;
                        fo4Var.s = wf7.n("audio/ac3");
                        fo4Var.M = i43;
                        fo4Var.O = i42;
                        fo4Var.w = as3Var2;
                        fo4Var.d = str;
                        fo4Var.i = i44;
                        fo4Var.j = i44;
                        uz0Var.d = new go4(fo4Var);
                        i13 = i34;
                        list = list2;
                        i12 = i37;
                        i18 = i9;
                        str4 = str12;
                    } else if (m3 == 1684366131) {
                        yw7Var.N(i37 + 8);
                        String num2 = Integer.toString(i4);
                        ye1 ye1Var2 = new ye1();
                        ye1Var2.k(yw7Var);
                        int f2 = ye1Var2.f(13) * 1000;
                        ye1Var2.n(3);
                        int i45 = iArr2[ye1Var2.f(2)];
                        i12 = i37;
                        ye1Var2.n(10);
                        int i46 = iArr[ye1Var2.f(3)];
                        if (ye1Var2.f(1) != 0) {
                            i46++;
                        }
                        ye1Var2.n(3);
                        int f3 = ye1Var2.f(4);
                        ye1Var2.n(1);
                        if (f3 > 0) {
                            int i47 = i46;
                            ye1Var2.n(6);
                            i46 = ye1Var2.f(1) != 0 ? i47 + 2 : i47;
                            ye1Var2.n(1);
                        }
                        str4 = str12;
                        if (ye1Var2.b() > 7) {
                            ye1Var2.n(7);
                            if (ye1Var2.f(1) != 0) {
                                str7 = "audio/eac3-joc";
                                ye1Var2.c();
                                yw7Var.N(ye1Var2.d());
                                fo4 fo4Var2 = new fo4();
                                fo4Var2.a = num2;
                                fo4Var2.s = wf7.n(str7);
                                fo4Var2.M = i46;
                                fo4Var2.O = i45;
                                fo4Var2.w = as3Var2;
                                fo4Var2.d = str;
                                fo4Var2.j = f2;
                                uz0Var.d = new go4(fo4Var2);
                                i13 = i34;
                                list = list2;
                                i18 = i9;
                            }
                        }
                        str7 = "audio/eac3";
                        ye1Var2.c();
                        yw7Var.N(ye1Var2.d());
                        fo4 fo4Var22 = new fo4();
                        fo4Var22.a = num2;
                        fo4Var22.s = wf7.n(str7);
                        fo4Var22.M = i46;
                        fo4Var22.O = i45;
                        fo4Var22.w = as3Var2;
                        fo4Var22.d = str;
                        fo4Var22.j = f2;
                        uz0Var.d = new go4(fo4Var22);
                        i13 = i34;
                        list = list2;
                        i18 = i9;
                    } else {
                        i12 = i37;
                        str4 = str12;
                        if (m3 == 1684103988) {
                            yw7Var.N(i12 + 8);
                            String num3 = Integer.toString(i4);
                            ye1 ye1Var3 = new ye1();
                            ye1Var3.k(yw7Var);
                            int b = ye1Var3.b();
                            int f4 = ye1Var3.f(3);
                            if (f4 > 1) {
                                throw bx7.d("Unsupported AC-4 DSI version: " + f4);
                            }
                            int f5 = ye1Var3.f(7);
                            int i48 = ye1Var3.e() ? 48000 : 44100;
                            ye1Var3.n(4);
                            int f6 = ye1Var3.f(9);
                            if (f5 > 1) {
                                if (f4 == 0) {
                                    throw bx7.d("Invalid AC-4 DSI version: " + f4);
                                }
                                if (ye1Var3.e()) {
                                    ye1Var3.n(16);
                                    if (ye1Var3.e()) {
                                        ye1Var3.n(128);
                                    }
                                }
                            }
                            if (f4 == 1) {
                                i20 = f5;
                                if (ye1Var3.b() < 66) {
                                    throw bx7.d("Invalid AC-4 DSI bitrate.");
                                }
                                ye1Var3.n(66);
                                ye1Var3.c();
                            } else {
                                i20 = f5;
                            }
                            h4 h4Var = new h4();
                            h4Var.a = true;
                            h4Var.b = -1;
                            h4Var.c = -1;
                            h4Var.d = true;
                            list = list2;
                            h4Var.e = 2;
                            h4Var.f = 1;
                            h4Var.g = 0;
                            int i49 = 0;
                            while (i49 < f6) {
                                if (f4 == 0) {
                                    boolean e2 = ye1Var3.e();
                                    int f7 = ye1Var3.f(5);
                                    i22 = i9;
                                    f = ye1Var3.f(5);
                                    i28 = 0;
                                    z2 = false;
                                    z3 = e2;
                                    i29 = f7;
                                    i30 = 0;
                                } else {
                                    int i50 = f6;
                                    int f8 = ye1Var3.f(8);
                                    i22 = i9;
                                    int f9 = ye1Var3.f(8);
                                    if (f9 == 255) {
                                        f9 = ye1Var3.f(16) + f9;
                                    }
                                    if (f8 > 2) {
                                        ye1Var3.n(f9 << 3);
                                        i49++;
                                        f6 = i50;
                                        i9 = i22;
                                    } else {
                                        int b2 = (b - ye1Var3.b()) / 8;
                                        int i51 = f9;
                                        int f10 = ye1Var3.f(5);
                                        z2 = f10 == 31;
                                        i29 = f10;
                                        f = f8;
                                        i30 = b2;
                                        i28 = i51;
                                        z3 = false;
                                    }
                                }
                                h4Var.f = f;
                                i23 = i10;
                                if (z3 || z2 || i29 != 6) {
                                    i21 = i34;
                                    h4Var.g = ye1Var3.f(3);
                                    if (ye1Var3.e()) {
                                        ye1Var3.n(5);
                                    }
                                    ye1Var3.n(2);
                                    int i52 = 1;
                                    if (f4 == 1 && (f == 1 || f == 2)) {
                                        ye1Var3.n(2);
                                    }
                                    ye1Var3.n(5);
                                    ye1Var3.n(10);
                                    if (f4 == 1) {
                                        if (f > 0) {
                                            h4Var.a = ye1Var3.e();
                                        }
                                        if (h4Var.a) {
                                            if (f != 1) {
                                                i32 = 2;
                                            }
                                            int f11 = ye1Var3.f(5);
                                            if (f11 >= 0 && f11 <= 15) {
                                                h4Var.b = f11;
                                            }
                                            if (f11 < 11 || f11 > 14) {
                                                i32 = 2;
                                            } else {
                                                h4Var.d = ye1Var3.e();
                                                i32 = 2;
                                                h4Var.e = ye1Var3.f(2);
                                            }
                                            ye1Var3.n(24);
                                            i52 = 1;
                                        } else {
                                            i32 = 2;
                                        }
                                        if (f == i52 || f == i32) {
                                            if (ye1Var3.e() && ye1Var3.e()) {
                                                ye1Var3.n(i32);
                                            }
                                            if (ye1Var3.e()) {
                                                ye1Var3.m();
                                                int i53 = 8;
                                                int f12 = ye1Var3.f(8);
                                                i31 = f;
                                                int i54 = 0;
                                                while (i54 < f12) {
                                                    ye1Var3.n(i53);
                                                    i54++;
                                                    i53 = 8;
                                                }
                                                if (z3 && !z2) {
                                                    ye1Var3.m();
                                                    if (i29 == 0 || i29 == 1 || i29 == 2) {
                                                        int i55 = 0;
                                                        if (i31 == 0) {
                                                            while (i55 < 2) {
                                                                ik7.f(ye1Var3, h4Var);
                                                                i55++;
                                                            }
                                                        } else {
                                                            for (int i56 = 2; i55 < i56; i56 = 2) {
                                                                ik7.g(ye1Var3, h4Var);
                                                                i55++;
                                                            }
                                                        }
                                                    } else if (i29 == 3 || i29 == 4) {
                                                        int i57 = 0;
                                                        if (i31 == 0) {
                                                            while (i57 < 3) {
                                                                ik7.f(ye1Var3, h4Var);
                                                                i57++;
                                                            }
                                                        } else {
                                                            for (int i58 = 3; i57 < i58; i58 = 3) {
                                                                ik7.g(ye1Var3, h4Var);
                                                                i57++;
                                                            }
                                                        }
                                                    } else if (i29 != 5) {
                                                        int f13 = ye1Var3.f(7);
                                                        for (int i59 = 0; i59 < f13; i59++) {
                                                            ye1Var3.n(8);
                                                        }
                                                    } else if (i31 == 0) {
                                                        ik7.f(ye1Var3, h4Var);
                                                    } else {
                                                        int f14 = ye1Var3.f(3);
                                                        for (int i60 = 0; i60 < f14 + 2; i60++) {
                                                            ik7.g(ye1Var3, h4Var);
                                                        }
                                                    }
                                                } else if (i31 != 0) {
                                                    ik7.f(ye1Var3, h4Var);
                                                } else {
                                                    ik7.g(ye1Var3, h4Var);
                                                }
                                                ye1Var3.m();
                                                e = ye1Var3.e();
                                            }
                                        }
                                    }
                                    i31 = f;
                                    if (z3) {
                                    }
                                    if (i31 != 0) {
                                    }
                                    ye1Var3.m();
                                    e = ye1Var3.e();
                                } else {
                                    i21 = i34;
                                    i31 = f;
                                    e = true;
                                }
                                if (e) {
                                    int f15 = ye1Var3.f(7);
                                    for (int i61 = 0; i61 < f15; i61++) {
                                        ye1Var3.n(15);
                                    }
                                }
                                if (i31 > 0) {
                                    if (ye1Var3.e()) {
                                        if (ye1Var3.b() < 66) {
                                            throw bx7.d("Can't parse bitrate DSI.");
                                        }
                                        ye1Var3.n(66);
                                    }
                                    if (ye1Var3.e()) {
                                        ye1Var3.c();
                                        ye1Var3.o(ye1Var3.f(16));
                                        int f16 = ye1Var3.f(5);
                                        for (int i62 = 0; i62 < f16; i62++) {
                                            ye1Var3.n(3);
                                            ye1Var3.n(8);
                                        }
                                    }
                                }
                                i24 = 8;
                                ye1Var3.c();
                                if (f4 == 1) {
                                    int b3 = ((b - ye1Var3.b()) / 8) - i30;
                                    if (i28 < b3) {
                                        throw bx7.d("pres_bytes is smaller than presentation bytes read.");
                                    }
                                    ye1Var3.o(i28 - b3);
                                }
                                if (h4Var.a && h4Var.b == -1) {
                                    throw bx7.d("Can't determine channel mode of presentation " + i49);
                                }
                                i25 = 12;
                                if (h4Var.a) {
                                    int i63 = h4Var.c;
                                    int i64 = h4Var.g;
                                    if (i63 > 0) {
                                        int i65 = i63 + 1;
                                        if (i64 == 4 && i65 == 17) {
                                            i65 = 21;
                                        }
                                        i25 = i65;
                                    } else {
                                        if (i64 != 0) {
                                            if (i64 == 1) {
                                                i25 = 6;
                                            } else if (i64 == 2) {
                                                i25 = i24;
                                            } else if (i64 == 3) {
                                                i25 = 10;
                                            } else if (i64 != 4) {
                                                ncd.f("Ac4Util", "AC-4 level " + h4Var.g + " has not been defined.");
                                            }
                                        }
                                        i25 = 2;
                                    }
                                } else {
                                    int i66 = h4Var.b;
                                    boolean z6 = h4Var.d;
                                    int i67 = h4Var.e;
                                    switch (i66) {
                                        case 0:
                                            i26 = 11;
                                            i27 = 1;
                                            break;
                                        case 1:
                                            i26 = 11;
                                            i27 = 2;
                                            break;
                                        case 2:
                                            i26 = 11;
                                            i27 = 3;
                                            break;
                                        case 3:
                                            i26 = 11;
                                            i27 = 5;
                                            break;
                                        case 4:
                                            i26 = 11;
                                            i27 = 6;
                                            break;
                                        case 5:
                                        case 7:
                                        case 9:
                                            i26 = 11;
                                            i27 = 7;
                                            break;
                                        case 6:
                                        case 8:
                                        case 10:
                                            i27 = i24;
                                            i26 = 11;
                                            break;
                                        case 11:
                                            i26 = 11;
                                            i27 = 11;
                                            break;
                                        case 12:
                                            i27 = 12;
                                            i26 = 11;
                                            break;
                                        case 13:
                                            i26 = 11;
                                            i27 = 13;
                                            break;
                                        case 14:
                                            i26 = 11;
                                            i27 = 14;
                                            break;
                                        case 15:
                                            i26 = 11;
                                            i27 = 24;
                                            break;
                                        default:
                                            i26 = 11;
                                            i27 = -1;
                                            break;
                                    }
                                    if (i66 == i26 || i66 == 12 || i66 == 13 || i66 == 14) {
                                        if (!z6) {
                                            i27 -= 2;
                                        }
                                        if (i67 == 0) {
                                            i27 -= 4;
                                        } else if (i67 == 1) {
                                            i27 -= 2;
                                        }
                                    }
                                    i25 = i27;
                                }
                                if (i25 > 0) {
                                    throw bx7.d("Cannot determine channel count of presentation.");
                                }
                                Object[] objArr3 = {Integer.valueOf(i20), Integer.valueOf(h4Var.f), Integer.valueOf(h4Var.g)};
                                String str13 = hac.a;
                                String format2 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr3);
                                fo4 fo4Var3 = new fo4();
                                fo4Var3.a = num3;
                                fo4Var3.s = wf7.n("audio/ac4");
                                fo4Var3.M = i25;
                                fo4Var3.O = i48;
                                fo4Var3.w = as3Var2;
                                fo4Var3.d = str;
                                fo4Var3.k = format2;
                                uz0Var.d = new go4(fo4Var3);
                                i18 = i22;
                                i17 = i23;
                                i13 = i21;
                            }
                            i21 = i34;
                            i22 = i9;
                            i23 = i10;
                            i24 = 8;
                            i25 = 12;
                            if (h4Var.a) {
                            }
                            if (i25 > 0) {
                            }
                        } else {
                            int i68 = i34;
                            list = list2;
                            int i69 = i9;
                            int i70 = i10;
                            if (m3 == 1684892784) {
                                if (m <= 0) {
                                    throw bx7.a("Invalid sample rate for Dolby TrueHD MLP stream: " + m, null);
                                }
                                sz0Var = sz0Var2;
                                str9 = str10;
                                i9 = m;
                                list2 = list;
                                i13 = i68;
                                i16 = 0;
                                i10 = 2;
                            } else if (m3 == 1684305011 || m3 == 1969517683) {
                                i13 = i68;
                                fo4 fo4Var4 = new fo4();
                                fo4Var4.a = Integer.toString(i4);
                                fo4Var4.s = wf7.n(str6);
                                i17 = i70;
                                fo4Var4.M = i17;
                                i18 = i69;
                                fo4Var4.O = i18;
                                fo4Var4.w = as3Var2;
                                fo4Var4.d = str;
                                uz0Var.d = new go4(fo4Var4);
                            } else {
                                if (m3 == 1682927731) {
                                    int i71 = i15 - 8;
                                    byte[] bArr3 = a;
                                    byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + i71);
                                    yw7Var.N(i12 + 8);
                                    yw7Var.k(bArr3.length, i71, copyOf);
                                    list2 = jse.a(copyOf);
                                } else if (m3 == 1684425825) {
                                    byte[] bArr4 = new byte[i15 - 8];
                                    bArr4[0] = 102;
                                    bArr4[1] = 76;
                                    bArr4[2] = 97;
                                    bArr4[3] = 67;
                                    yw7Var.N(i12 + 12);
                                    yw7Var.k(4, i15 - 12, bArr4);
                                    list2 = mo5.u(bArr4);
                                } else if (m3 == 1634492771) {
                                    int i72 = i15 - 12;
                                    byte[] bArr5 = new byte[i72];
                                    yw7Var.N(i12 + 12);
                                    yw7Var.k(0, i72, bArr5);
                                    byte[] bArr6 = jl2.a;
                                    yw7 yw7Var2 = new yw7(bArr5);
                                    yw7Var2.N(5);
                                    int A3 = yw7Var2.A();
                                    yw7Var2.N(9);
                                    int A4 = yw7Var2.A();
                                    yw7Var2.N(20);
                                    int[] iArr3 = {yw7Var2.E(), A4, A3};
                                    int i73 = iArr3[0];
                                    int i74 = iArr3[1];
                                    int i75 = iArr3[2];
                                    String str14 = hac.a;
                                    int F = hac.F(i75, ByteOrder.LITTLE_ENDIAN);
                                    if (F == 0) {
                                        F = -1;
                                    }
                                    str9 = str10;
                                    i38 = F;
                                    i9 = i73;
                                    i10 = i74;
                                    i13 = i68;
                                    i16 = 0;
                                    sz0Var = sz0Var2;
                                    list2 = mo5.u(bArr5);
                                } else if (m3 == 1767990114) {
                                    yw7Var.N(i12 + 9);
                                    int F2 = yw7Var.F();
                                    byte[] bArr7 = new byte[F2];
                                    yw7Var.k(0, F2, bArr7);
                                    byte[] bArr8 = jl2.a;
                                    yw7 yw7Var3 = new yw7(bArr7);
                                    String str15 = null;
                                    String str16 = null;
                                    while (yw7Var3.a() > 0 && (str15 == null || str16 == null)) {
                                        int A5 = yw7Var3.A();
                                        int i76 = A5 >> 3;
                                        boolean z7 = (A5 & 2) != 0;
                                        boolean z8 = (A5 & 1) != 0;
                                        int F3 = yw7Var3.F();
                                        if (i76 > 4 && i76 < 24 && z7) {
                                            do {
                                            } while ((yw7Var3.A() & 128) != 0);
                                            for (i19 = 128; (yw7Var3.A() & i19) != 0; i19 = 128) {
                                            }
                                        }
                                        if (z8) {
                                            yw7Var3.O(yw7Var3.F());
                                        }
                                        int i77 = yw7Var3.b + F3;
                                        if (i76 == 31) {
                                            yw7Var3.O(4);
                                            Object[] objArr4 = {Integer.valueOf(yw7Var3.A()), Integer.valueOf(yw7Var3.A())};
                                            String str17 = hac.a;
                                            str15 = String.format(Locale.US, "iamf.%03X.%03X", objArr4);
                                        } else if (i76 == 0) {
                                            while ((yw7Var3.A() & 128) != 0) {
                                            }
                                            str16 = yw7Var3.y(4, StandardCharsets.UTF_8);
                                            if (str16.equals("mp4a")) {
                                                while ((yw7Var3.A() & 128) != 0) {
                                                }
                                                yw7Var3.O(2);
                                                ye1 ye1Var4 = new ye1();
                                                ye1Var4.k(yw7Var3);
                                                int f17 = ye1Var4.f(5);
                                                if (f17 == 31) {
                                                    f17 = ye1Var4.f(6) + 32;
                                                }
                                                str16 = str16 + ".40." + f17;
                                            }
                                        }
                                        yw7Var3.N(i77);
                                    }
                                    str9 = (str15 == null || str16 == null) ? null : kt6.o(str15, ".", str16);
                                    list2 = mo5.u(bArr7);
                                    sz0Var = sz0Var2;
                                    i9 = i69;
                                    i10 = i70;
                                    i13 = i68;
                                    i16 = 0;
                                } else if (m3 == 1885564227) {
                                    yw7Var.N(i12 + 12);
                                    ByteOrder byteOrder = (yw7Var.A() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                    int A6 = yw7Var.A();
                                    i13 = i68;
                                    int F4 = i13 == 1768973165 ? hac.F(A6, byteOrder) : i13 == 1718641517 ? hac.C(A6, byteOrder) : i38;
                                    if (F4 == 0) {
                                        F4 = -1;
                                    }
                                    sz0Var = sz0Var2;
                                    str9 = str10;
                                    i38 = F4;
                                    if (F4 != -1) {
                                        str6 = "audio/raw";
                                    }
                                    list2 = list;
                                    i9 = i69;
                                    i10 = i70;
                                    i16 = 0;
                                } else {
                                    i13 = i68;
                                    i18 = i69;
                                    i17 = i70;
                                }
                                sz0Var = sz0Var2;
                                str9 = str10;
                                i9 = i69;
                                i10 = i70;
                                i13 = i68;
                                i16 = 0;
                            }
                            i37 = i12 + i15;
                            i35 = i3;
                            i34 = i13;
                            sz0Var2 = sz0Var;
                            i36 = i16;
                            i11 = i38;
                            str2 = str6;
                            str8 = str4;
                            i7 = 4;
                            i8 = 2;
                        }
                        sz0Var = sz0Var2;
                        i10 = i17;
                        i9 = i18;
                        list2 = list;
                        i16 = 0;
                        str9 = str10;
                        i37 = i12 + i15;
                        i35 = i3;
                        i34 = i13;
                        sz0Var2 = sz0Var;
                        i36 = i16;
                        i11 = i38;
                        str2 = str6;
                        str8 = str4;
                        i7 = 4;
                        i8 = 2;
                    }
                    i17 = i10;
                    sz0Var = sz0Var2;
                    i10 = i17;
                    i9 = i18;
                    list2 = list;
                    i16 = 0;
                    str9 = str10;
                    i37 = i12 + i15;
                    i35 = i3;
                    i34 = i13;
                    sz0Var2 = sz0Var;
                    i36 = i16;
                    i11 = i38;
                    str2 = str6;
                    str8 = str4;
                    i7 = 4;
                    i8 = 2;
                }
                List list3 = list2;
                i15 = m2;
                str4 = str8;
                int i78 = i9;
                int i79 = i10;
                if (i14 != -1) {
                    sz0Var = c(i14, yw7Var);
                    str5 = (String) sz0Var.c;
                    byte[] bArr9 = (byte[]) sz0Var.d;
                    if (bArr9 == null) {
                        i16 = 0;
                        i10 = i79;
                        i9 = i78;
                    } else if ("audio/vorbis".equals(str5)) {
                        io5 io5Var = zlc.a;
                        yw7 yw7Var4 = new yw7(bArr9);
                        yw7Var4.O(1);
                        int i80 = 0;
                        while (yw7Var4.a() > 0 && yw7Var4.j() == 255) {
                            i80 += nm7.d4;
                            yw7Var4.O(1);
                        }
                        int A7 = yw7Var4.A() + i80;
                        int i81 = 0;
                        while (yw7Var4.a() > 0 && yw7Var4.j() == 255) {
                            i81 += nm7.d4;
                            yw7Var4.O(1);
                        }
                        int A8 = yw7Var4.A() + i81;
                        byte[] bArr10 = new byte[A7];
                        int i82 = yw7Var4.b;
                        i16 = 0;
                        System.arraycopy(bArr9, i82, bArr10, 0, A7);
                        int i83 = i82 + A7 + A8;
                        int length = bArr9.length - i83;
                        byte[] bArr11 = new byte[length];
                        System.arraycopy(bArr9, i83, bArr11, 0, length);
                        list2 = mo5.v(bArr10, bArr11);
                        i10 = i79;
                        i9 = i78;
                        str9 = str10;
                        str6 = str5;
                        i37 = i12 + i15;
                        i35 = i3;
                        i34 = i13;
                        sz0Var2 = sz0Var;
                        i36 = i16;
                        i11 = i38;
                        str2 = str6;
                        str8 = str4;
                        i7 = 4;
                        i8 = 2;
                    } else {
                        i16 = 0;
                        if ("audio/mp4a-latm".equals(str5)) {
                            g1 j = bo2.j(new ye1(bArr9.length, bArr9), false);
                            i9 = j.a;
                            i10 = j.b;
                            str9 = j.c;
                        } else {
                            i10 = i79;
                            i9 = i78;
                            str9 = str10;
                        }
                        list2 = mo5.u(bArr9);
                        str6 = str5;
                        i37 = i12 + i15;
                        i35 = i3;
                        i34 = i13;
                        sz0Var2 = sz0Var;
                        i36 = i16;
                        i11 = i38;
                        str2 = str6;
                        str8 = str4;
                        i7 = 4;
                        i8 = 2;
                    }
                } else {
                    i16 = 0;
                    sz0Var = sz0Var2;
                    i10 = i79;
                    i9 = i78;
                    str5 = str3;
                }
                list2 = list3;
                str9 = str10;
                str6 = str5;
                i37 = i12 + i15;
                i35 = i3;
                i34 = i13;
                sz0Var2 = sz0Var;
                i36 = i16;
                i11 = i38;
                str2 = str6;
                str8 = str4;
                i7 = 4;
                i8 = 2;
            }
            str9 = str10;
            str6 = str2;
            i15 = m2;
            str4 = str8;
            i12 = i37;
            i16 = 0;
            sz0Var = sz0Var2;
            i13 = i34;
            i37 = i12 + i15;
            i35 = i3;
            i34 = i13;
            sz0Var2 = sz0Var;
            i36 = i16;
            i11 = i38;
            str2 = str6;
            str8 = str4;
            i7 = 4;
            i8 = 2;
        }
        String str18 = str9;
        String str19 = str2;
        List list4 = list2;
        int i84 = i9;
        int i85 = i11;
        int i86 = i10;
        if (((go4) uz0Var.d) != null || str19 == null) {
            return;
        }
        fo4 fo4Var5 = new fo4();
        fo4Var5.a = Integer.toString(i4);
        fo4Var5.s = wf7.n(str19);
        fo4Var5.k = str18;
        fo4Var5.M = i86;
        fo4Var5.O = i84;
        fo4Var5.P = i85;
        fo4Var5.v = list4;
        fo4Var5.w = as3Var2;
        fo4Var5.d = str;
        if (sz0Var2 != null) {
            sz0 sz0Var3 = sz0Var2;
            fo4Var5.i = ine.d(sz0Var3.a);
            fo4Var5.j = ine.d(sz0Var3.b);
        } else {
            qz0 qz0Var2 = qz0Var;
            if (qz0Var2 != null) {
                fo4Var5.i = ine.d(qz0Var2.a);
                fo4Var5.j = ine.d(qz0Var2.b);
            }
        }
        uz0Var.d = new go4(fo4Var5);
    }

    public static sz0 c(int i, yw7 yw7Var) {
        yw7Var.N(i + 12);
        yw7Var.O(1);
        d(yw7Var);
        yw7Var.O(2);
        int A = yw7Var.A();
        if ((A & 128) != 0) {
            yw7Var.O(2);
        }
        if ((A & 64) != 0) {
            yw7Var.O(yw7Var.A());
        }
        if ((A & 32) != 0) {
            yw7Var.O(2);
        }
        yw7Var.O(1);
        d(yw7Var);
        String e = wf7.e(yw7Var.A());
        if ("audio/mpeg".equals(e) || "audio/vnd.dts".equals(e) || "audio/vnd.dts.hd".equals(e)) {
            return new sz0(e, null, -1L, -1L);
        }
        yw7Var.O(4);
        long C = yw7Var.C();
        long C2 = yw7Var.C();
        yw7Var.O(1);
        int d = d(yw7Var);
        long j = C2;
        byte[] bArr = new byte[d];
        yw7Var.k(0, d, bArr);
        if (j <= 0) {
            j = -1;
        }
        return new sz0(e, bArr, j, C > 0 ? C : -1L);
    }

    public static int d(yw7 yw7Var) {
        int A = yw7Var.A();
        int i = A & nm7.K1;
        while ((A & 128) == 128) {
            A = yw7Var.A();
            i = (i << 7) | (A & nm7.K1);
        }
        return i;
    }

    public static int e(int i) {
        return (i >> 24) & nm7.d4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        r9 = r14.m();
        r10 = r14.m();
        r11 = r11 - 16;
        r12 = new byte[r11];
        r14.k(0, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
    
        r11 = new vl6(r8, r12, r10, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        aq1.s("Failed to parse metadata entry with key: ", r8, "MetadataUtil");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static nf7 f(oh7 oh7Var) {
        ph7 v = oh7Var.v(1751411826);
        ph7 v2 = oh7Var.v(1801812339);
        ph7 v3 = oh7Var.v(1768715124);
        if (v == null || v2 == null || v3 == null) {
            return null;
        }
        yw7 yw7Var = v.e;
        yw7Var.N(16);
        if (yw7Var.m() != 1835299937) {
            return null;
        }
        yw7 yw7Var2 = v2.e;
        yw7Var2.N(12);
        int m = yw7Var2.m();
        String[] strArr = new String[m];
        for (int i = 0; i < m; i++) {
            int m2 = yw7Var2.m();
            yw7Var2.O(4);
            strArr[i] = yw7Var2.y(m2 - 8, StandardCharsets.UTF_8);
        }
        yw7 yw7Var3 = v3.e;
        yw7Var3.N(8);
        ArrayList arrayList = new ArrayList();
        while (yw7Var3.a() > 8) {
            int i2 = yw7Var3.b;
            int m3 = yw7Var3.m();
            int m4 = yw7Var3.m() - 1;
            if (m4 < 0 || m4 >= m) {
                b10.o(m4, "Skipped metadata with unknown key index: ", "BoxParsers");
            } else {
                String str = strArr[m4];
                int i3 = i2 + m3;
                while (true) {
                    int i4 = yw7Var3.b;
                    if (i4 >= i3) {
                        break;
                    }
                    int m5 = yw7Var3.m();
                    if (yw7Var3.m() == 1684108385) {
                        break;
                    }
                    yw7Var3.N(i4 + m5);
                }
                vl6 vl6Var = null;
                if (vl6Var != null) {
                    arrayList.add(vl6Var);
                }
            }
            yw7Var3.N(i2 + m3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new nf7(arrayList);
    }

    public static uh7 g(yw7 yw7Var) {
        long u;
        long u2;
        yw7Var.N(8);
        if (e(yw7Var.m()) == 0) {
            u = yw7Var.C();
            u2 = yw7Var.C();
        } else {
            u = yw7Var.u();
            u2 = yw7Var.u();
        }
        return new uh7(u, u2, yw7Var.C());
    }

    public static Pair h(yw7 yw7Var, int i, int i2) {
        Integer num;
        szb szbVar;
        Pair create;
        int i3;
        int i4;
        Integer num2;
        boolean z;
        int i5 = yw7Var.b;
        while (i5 - i < i2) {
            yw7Var.N(i5);
            int m = yw7Var.m();
            zhe.a("childAtomSize must be positive", m > 0);
            if (yw7Var.m() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer num3 = null;
                String str = null;
                while (i6 - i5 < m) {
                    yw7Var.N(i6);
                    int m2 = yw7Var.m();
                    int m3 = yw7Var.m();
                    if (m3 == 1718775137) {
                        num3 = Integer.valueOf(yw7Var.m());
                    } else if (m3 == 1935894637) {
                        yw7Var.O(4);
                        str = yw7Var.y(4, StandardCharsets.UTF_8);
                    } else if (m3 == 1935894633) {
                        i8 = i6;
                        i7 = m2;
                    }
                    i6 += m2;
                }
                byte[] bArr = null;
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    zhe.a("frma atom is mandatory", num3 != null);
                    zhe.a("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            num = num3;
                            szbVar = null;
                            break;
                        }
                        yw7Var.N(i9);
                        int m4 = yw7Var.m();
                        if (yw7Var.m() == 1952804451) {
                            int e = e(yw7Var.m());
                            yw7Var.O(1);
                            if (e == 0) {
                                yw7Var.O(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int A = yw7Var.A();
                                i3 = A & 15;
                                i4 = (A & nm7.O3) >> 4;
                            }
                            if (yw7Var.A() == 1) {
                                num2 = num3;
                                z = true;
                            } else {
                                num2 = num3;
                                z = false;
                            }
                            int A2 = yw7Var.A();
                            byte[] bArr2 = new byte[16];
                            yw7Var.k(0, 16, bArr2);
                            if (z && A2 == 0) {
                                int A3 = yw7Var.A();
                                byte[] bArr3 = new byte[A3];
                                yw7Var.k(0, A3, bArr3);
                                bArr = bArr3;
                            }
                            num = num2;
                            szbVar = new szb(z, str, A2, bArr2, i4, i3, bArr);
                        } else {
                            i9 += m4;
                        }
                    }
                    zhe.a("tenc atom is mandatory", szbVar != null);
                    String str2 = hac.a;
                    create = Pair.create(num, szbVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i5 += m;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0c4e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0c5b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0c61  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0c55  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static uz0 i(yw7 yw7Var, wz0 wz0Var, String str, as3 as3Var, boolean z) {
        int i;
        as3 as3Var2;
        int i2;
        String str2;
        String str3;
        int i3;
        int i4;
        int i5;
        int i6;
        du2 du2Var;
        int i7;
        String str4;
        String str5;
        wz0 wz0Var2;
        int i8;
        String str6;
        int i9;
        String str7;
        int i10;
        int i11;
        int i12;
        xvc xvcVar;
        int i13;
        byte[] bArr;
        int i14;
        int i15;
        String str8;
        String str9;
        int i16;
        int i17;
        int i18;
        int i19;
        as3 as3Var3;
        int i20;
        int i21;
        String str10;
        y79 y79Var;
        yw7 yw7Var2 = yw7Var;
        wz0 wz0Var3 = wz0Var;
        String str11 = str;
        int i22 = wz0Var3.a;
        yw7Var2.N(12);
        int m = yw7Var2.m();
        uz0 uz0Var = new uz0();
        uz0Var.c = new szb[m];
        boolean z2 = false;
        uz0Var.b = false;
        int i23 = 0;
        while (i23 < m) {
            int i24 = yw7Var2.b;
            int m2 = yw7Var2.m();
            String str12 = "childAtomSize must be positive";
            zhe.a("childAtomSize must be positive", m2 > 0 ? true : z2);
            int m3 = yw7Var2.m();
            byte b = 3;
            String str13 = null;
            int i25 = 8;
            if (m3 == 1635148593 || m3 == 1635148595 || m3 == 1701733238 || m3 == 1831958048 || m3 == 1836070006 || m3 == 1752589105 || m3 == 1751479857 || m3 == 1987470129 || m3 == 1987471665 || m3 == 1932670515 || m3 == 1211250227 || m3 == 1748121139 || m3 == 1987063864 || m3 == 1987063865 || m3 == 1635135537 || m3 == 1685479798 || m3 == 1685479729 || m3 == 1685481573 || m3 == 1685481521 || m3 == 1634760241 || m3 == 1684108849 || m3 == 1634743416 || m3 == 1634743400 || m3 == 1634755432 || m3 == 1634755438 || m3 == 1634755443 || m3 == 1634755439) {
                int i26 = m3;
                yw7Var2.N(i24 + 16);
                yw7Var2.O(16);
                int H = yw7Var2.H();
                int H2 = yw7Var2.H();
                yw7Var2.O(50);
                int i27 = yw7Var2.b;
                if (i26 == 1701733238) {
                    Pair h = h(yw7Var2, i24, m2);
                    if (h != null) {
                        int intValue = ((Integer) h.first).intValue();
                        as3Var3 = as3Var == null ? null : as3Var.a(((szb) h.second).b);
                        ((szb[]) uz0Var.c)[i23] = (szb) h.second;
                        i26 = intValue;
                    } else {
                        as3Var3 = as3Var;
                    }
                    yw7Var2.N(i27);
                    i = i26;
                    as3Var2 = as3Var3;
                } else {
                    i = i26;
                    as3Var2 = as3Var;
                }
                i2 = i24;
                if (i == 1831958048) {
                    str2 = "video/mpeg";
                } else {
                    if (i == 1211250227) {
                        str3 = "video/3gpp";
                    } else if (i == 1634743416 || i == 1634743400 || i == 1634755432 || i == 1634755438 || i == 1634755443 || i == 1634755439) {
                        str2 = "video/prores";
                    } else {
                        str3 = null;
                    }
                    as3 as3Var4 = as3Var2;
                    i3 = i23;
                    i4 = i22;
                    i5 = i27;
                    i6 = m;
                    xvc xvcVar2 = null;
                    List list = null;
                    String str14 = null;
                    byte[] bArr2 = null;
                    ByteBuffer byteBuffer = null;
                    du2Var = null;
                    qz0 qz0Var = null;
                    sz0 sz0Var = null;
                    int i28 = 8;
                    int i29 = 8;
                    String str15 = str3;
                    float f = 1.0f;
                    int i30 = -1;
                    int i31 = -1;
                    int i32 = -1;
                    int i33 = -1;
                    boolean z3 = false;
                    int i34 = -1;
                    int i35 = -1;
                    int i36 = -1;
                    int i37 = -1;
                    while (i5 - i2 < m2) {
                        yw7Var2.N(i5);
                        int i38 = yw7Var2.b;
                        int i39 = i5;
                        int m4 = yw7Var2.m();
                        if (m4 == 0 && yw7Var2.b - i2 == m2) {
                            break;
                        }
                        zhe.a(str12, m4 > 0);
                        int m5 = yw7Var2.m();
                        int i40 = m2;
                        if (m5 == 1635148611) {
                            zhe.a(str13, str15 == null);
                            yw7Var2.N(i38 + 8);
                            kd0 a2 = kd0.a(yw7Var2);
                            list = a2.a;
                            uz0Var.a = a2.b;
                            float f2 = !z3 ? a2.k : f;
                            String str16 = a2.l;
                            int i41 = a2.j;
                            i33 = a2.g;
                            int i42 = a2.h;
                            int i43 = a2.i;
                            int i44 = a2.e;
                            i10 = a2.f;
                            xvcVar = xvcVar2;
                            str6 = str12;
                            f = f2;
                            i8 = i43;
                            i34 = i41;
                            i9 = i44;
                            i11 = i;
                            str15 = "video/avc";
                            str14 = str16;
                            i32 = i42;
                            i12 = i25;
                        } else {
                            int i45 = i;
                            if (m5 == 1752589123) {
                                zhe.a(null, str15 == null);
                                yw7Var2.N(i38 + 8);
                                xf5 a3 = xf5.a(yw7Var2, false, null);
                                list = a3.a;
                                uz0Var.a = a3.b;
                                float f3 = !z3 ? a3.l : f;
                                int i46 = a3.m;
                                int i47 = a3.c;
                                String str17 = a3.n;
                                int i48 = a3.k;
                                if (i48 != -1) {
                                    i30 = i48;
                                }
                                int i49 = a3.d;
                                int i50 = a3.e;
                                int i51 = a3.h;
                                int i52 = a3.i;
                                int i53 = i30;
                                int i54 = a3.j;
                                int i55 = a3.f;
                                i10 = a3.g;
                                str6 = str12;
                                i37 = i49;
                                f = f3;
                                i36 = i50;
                                i33 = i51;
                                i32 = i52;
                                i12 = i25;
                                i30 = i53;
                                i8 = i54;
                                i9 = i55;
                                i11 = i45;
                                i35 = i47;
                                xvcVar = a3.o;
                                str14 = str17;
                                i34 = i46;
                                str15 = "video/hevc";
                            } else {
                                int i56 = i30;
                                if (m5 == 1818785347) {
                                    zhe.a("lhvC must follow hvcC atom", "video/hevc".equals(str15));
                                    zhe.a("must have at least two layers", xvcVar2 != null && ((mo5) xvcVar2.b).size() >= 2);
                                    yw7Var2.N(i38 + 8);
                                    xvcVar2.getClass();
                                    xf5 a4 = xf5.a(yw7Var2, true, xvcVar2);
                                    zhe.a("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", uz0Var.a == a4.b);
                                    int i57 = a4.h;
                                    if (i57 != -1) {
                                        zhe.a("colorSpace must be the same for both views", i33 == i57);
                                    }
                                    int i58 = a4.i;
                                    if (i58 != -1) {
                                        zhe.a("colorRange must be the same for both views", i32 == i58);
                                    }
                                    int i59 = a4.j;
                                    if (i59 != -1) {
                                        zhe.a("colorTransfer must be the same for both views", i31 == i59);
                                    }
                                    zhe.a("bitdepthLuma must be the same for both views", i28 == a4.f);
                                    zhe.a("bitdepthChroma must be the same for both views", i29 == a4.g);
                                    if (list != null) {
                                        jo5 p = mo5.p();
                                        p.d(list);
                                        p.d(a4.a);
                                        list = p.f();
                                    } else {
                                        zhe.a("initializationData must be already set from hvcC atom", false);
                                    }
                                    str14 = a4.n;
                                    str15 = "video/mv-hevc";
                                    i8 = i31;
                                    str6 = str12;
                                    i9 = i28;
                                    i10 = i29;
                                    i12 = i25;
                                    i30 = i56;
                                } else {
                                    if (m5 == 1987470147) {
                                        zhe.a(null, str15 == null);
                                        yw7Var2.N(i38 + 8);
                                        try {
                                            if (yw7Var2.m() != 0) {
                                                throw bx7.a("Unsupported VVC version", null);
                                            }
                                            int A = yw7Var2.A();
                                            int i60 = (A >> 1) & 3;
                                            boolean z4 = (A & 1) != 0;
                                            int i61 = i60 + 1;
                                            str9 = "L";
                                            if (z4) {
                                                yw7Var2.O(1);
                                                int A2 = (yw7Var2.A() >> 4) & 7;
                                                i17 = (yw7Var2.A() >> 5) & 7;
                                                int A3 = yw7Var2.A() & 63;
                                                int A4 = yw7Var2.A();
                                                int i62 = (A4 >> 1) & nm7.K1;
                                                str9 = (A4 & 1) != 0 ? "H" : "L";
                                                i18 = yw7Var2.A();
                                                yw7Var2.O(A3);
                                                int i63 = 1;
                                                if (A2 > 1) {
                                                    int A5 = yw7Var2.A();
                                                    int i64 = 0;
                                                    while (i64 < A2 - 1) {
                                                        if (((A5 >> (7 - i64)) & i63) != 0) {
                                                            yw7Var2.O(i63);
                                                        }
                                                        i64++;
                                                        i63 = 1;
                                                    }
                                                }
                                                yw7Var2.O(yw7Var2.A() << 2);
                                                yw7Var2.O(6);
                                                i16 = i62;
                                            } else {
                                                i16 = 0;
                                                i17 = 0;
                                                i18 = 0;
                                            }
                                            int A6 = yw7Var2.A();
                                            int i65 = yw7Var2.b;
                                            int i66 = i32;
                                            int i67 = i17;
                                            int i68 = 0;
                                            int i69 = 0;
                                            while (true) {
                                                i19 = 13;
                                                if (i69 >= A6) {
                                                    break;
                                                }
                                                int i70 = i69;
                                                int A7 = yw7Var2.A() & 31;
                                                int H3 = (A7 == 13 || A7 == 12) ? 1 : yw7Var2.H();
                                                int i71 = 0;
                                                while (i71 < H3) {
                                                    int i72 = i68;
                                                    int H4 = yw7Var2.H();
                                                    yw7Var2.O(H4);
                                                    i71++;
                                                    i68 = H4 + 4 + i72;
                                                }
                                                i69 = i70 + 1;
                                            }
                                            yw7Var2.N(i65);
                                            byte[] bArr3 = new byte[i68];
                                            int i73 = 0;
                                            int i74 = 0;
                                            while (i73 < A6) {
                                                int i75 = A6;
                                                int A8 = yw7Var2.A() & 31;
                                                int H5 = (A8 == i19 || A8 == 12) ? 1 : yw7Var2.H();
                                                int i76 = 0;
                                                while (i76 < H5) {
                                                    int i77 = H5;
                                                    int H6 = yw7Var2.H();
                                                    System.arraycopy(add.a, 0, bArr3, i74, 4);
                                                    int i78 = i74 + 4;
                                                    yw7Var2.k(i78, H6, bArr3);
                                                    i74 = i78 + H6;
                                                    i76++;
                                                    H5 = i77;
                                                    i73 = i73;
                                                    i31 = i31;
                                                }
                                                i73++;
                                                A6 = i75;
                                                i19 = 13;
                                            }
                                            i8 = i31;
                                            Locale locale = Locale.US;
                                            String str18 = "vvc1." + i16 + "." + str9 + i18;
                                            list = mo5.u(bArr3);
                                            int i79 = i67 + 8;
                                            uz0Var.a = i61;
                                            str14 = str18;
                                            i9 = i79;
                                            i10 = i9;
                                            str15 = "video/vvc";
                                            str6 = str12;
                                            i12 = i25;
                                            i30 = i56;
                                            i32 = i66;
                                            i34 = 16;
                                        } catch (ArrayIndexOutOfBoundsException e) {
                                            throw bx7.a("Error parsing VVC configuration", e);
                                        }
                                    } else {
                                        int i80 = 2;
                                        i8 = i31;
                                        int i81 = i32;
                                        if (m5 == 1986361461) {
                                            yw7Var2.N(i38 + 8);
                                            int i82 = yw7Var2.b;
                                            nl9 nl9Var = null;
                                            while (i82 - i38 < m4) {
                                                yw7Var2.N(i82);
                                                int m6 = yw7Var2.m();
                                                zhe.a(str12, m6 > 0);
                                                if (yw7Var2.m() == 1702454643) {
                                                    yw7Var2.N(i82 + 8);
                                                    int i83 = yw7Var2.b;
                                                    while (true) {
                                                        if (i83 - i82 >= m6) {
                                                            i15 = i82;
                                                            str8 = str12;
                                                            nl9Var = null;
                                                            break;
                                                        }
                                                        yw7Var2.N(i83);
                                                        int m7 = yw7Var2.m();
                                                        zhe.a(str12, m7 > 0);
                                                        if (yw7Var2.m() == 1937011305) {
                                                            yw7Var2.O(4);
                                                            int A9 = yw7Var2.A();
                                                            i15 = i82;
                                                            str8 = str12;
                                                            nl9Var = new nl9((Object) new j10((A9 & 1) == 1, (A9 & 2) == i80, (A9 & 8) == i25), (byte) 11);
                                                        } else {
                                                            i83 += m7;
                                                            i25 = 8;
                                                            i80 = 2;
                                                        }
                                                    }
                                                } else {
                                                    i15 = i82;
                                                    str8 = str12;
                                                }
                                                i82 = i15 + m6;
                                                str12 = str8;
                                                i25 = 8;
                                                i80 = 2;
                                            }
                                            str6 = str12;
                                            sz4 sz4Var = nl9Var == null ? null : new sz4(nl9Var);
                                            if (sz4Var != null) {
                                                j10 j10Var = (j10) ((nl9) sz4Var.a).b;
                                                boolean z5 = j10Var.c;
                                                if (xvcVar2 == null || ((mo5) xvcVar2.b).size() < 2) {
                                                    i30 = i56;
                                                    if (i30 == -1) {
                                                        i30 = z5 ? 5 : 4;
                                                    }
                                                    i9 = i28;
                                                    i10 = i29;
                                                    i11 = i45;
                                                    i32 = i81;
                                                    i12 = 8;
                                                    xvcVar = xvcVar2;
                                                } else {
                                                    zhe.a("both eye views must be marked as available", j10Var.a && j10Var.b);
                                                    zhe.a("for MV-HEVC, eye_views_reversed must be set to false", !z5);
                                                }
                                            }
                                            i30 = i56;
                                            i9 = i28;
                                            i10 = i29;
                                            i11 = i45;
                                            i32 = i81;
                                            i12 = 8;
                                            xvcVar = xvcVar2;
                                        } else {
                                            str6 = str12;
                                            i30 = i56;
                                            if (m5 == 1685480259 || m5 == 1685485123 || m5 == 1685485379) {
                                                i9 = i28;
                                                str7 = str15;
                                                i10 = i29;
                                                i11 = i45;
                                                i12 = 8;
                                                xvcVar = xvcVar2;
                                                i8 = i8;
                                                du2Var = du2.a(yw7Var2);
                                            } else {
                                                if (m5 == 1987076931) {
                                                    zhe.a(null, str15 == null);
                                                    String str19 = i45 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                    yw7Var2.N(i38 + 12);
                                                    byte A10 = (byte) yw7Var2.A();
                                                    byte A11 = (byte) yw7Var2.A();
                                                    int A12 = yw7Var2.A();
                                                    int i84 = A12 >> 4;
                                                    byte b2 = (byte) ((A12 >> 1) & 7);
                                                    if (str19.equals("video/x-vnd.on2.vp9")) {
                                                        byte[] bArr4 = jl2.a;
                                                        byte[] bArr5 = new byte[12];
                                                        bArr5[0] = 1;
                                                        bArr5[1] = 1;
                                                        bArr5[2] = A10;
                                                        bArr5[b] = 2;
                                                        bArr5[4] = 1;
                                                        bArr5[5] = A11;
                                                        bArr5[6] = b;
                                                        bArr5[7] = 1;
                                                        bArr5[8] = (byte) i84;
                                                        bArr5[9] = 4;
                                                        bArr5[10] = 1;
                                                        bArr5[11] = b2;
                                                        list = mo5.u(bArr5);
                                                    }
                                                    boolean z6 = (A12 & 1) != 0;
                                                    int A13 = yw7Var2.A();
                                                    int A14 = yw7Var2.A();
                                                    int f4 = tm2.f(A13);
                                                    int i85 = z6 ? 1 : 2;
                                                    i8 = tm2.g(A14);
                                                    xvcVar = xvcVar2;
                                                    i11 = i45;
                                                    i33 = f4;
                                                    i9 = i84;
                                                    i10 = i9;
                                                    i32 = i85;
                                                    str15 = str19;
                                                } else if (m5 == 1635135811) {
                                                    int i86 = m4 - 8;
                                                    byte[] bArr6 = new byte[i86];
                                                    yw7Var2.k(0, i86, bArr6);
                                                    list = mo5.u(bArr6);
                                                    ub0 b3 = ub0.b(bArr6);
                                                    if (b3 != null) {
                                                        i28 = b3.a;
                                                        i33 = b3.b;
                                                        i32 = b3.c;
                                                        i14 = b3.d;
                                                        str14 = b3.e;
                                                        i29 = i28;
                                                    } else {
                                                        i32 = i81;
                                                        i14 = i8;
                                                    }
                                                    str15 = "video/av01";
                                                    xvcVar = xvcVar2;
                                                    i11 = i45;
                                                    i9 = i28;
                                                    i8 = i14;
                                                    i10 = i29;
                                                } else {
                                                    if (m5 == 1668050025) {
                                                        ByteBuffer order = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                        order.position(21);
                                                        order.putShort(yw7Var2.x());
                                                        order.putShort(yw7Var2.x());
                                                        byteBuffer = order;
                                                        xvcVar = xvcVar2;
                                                        i11 = i45;
                                                        i9 = i28;
                                                        i10 = i29;
                                                    } else {
                                                        if (m5 == 1835295606) {
                                                            ByteBuffer order2 = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                            short x = yw7Var2.x();
                                                            short x2 = yw7Var2.x();
                                                            short x3 = yw7Var2.x();
                                                            short x4 = yw7Var2.x();
                                                            xvcVar = xvcVar2;
                                                            short x5 = yw7Var2.x();
                                                            i11 = i45;
                                                            short x6 = yw7Var2.x();
                                                            i9 = i28;
                                                            short x7 = yw7Var2.x();
                                                            str7 = str15;
                                                            short x8 = yw7Var2.x();
                                                            long C = yw7Var2.C();
                                                            long C2 = yw7Var2.C();
                                                            i10 = i29;
                                                            order2.position(1);
                                                            order2.putShort(x5);
                                                            order2.putShort(x6);
                                                            order2.putShort(x);
                                                            order2.putShort(x2);
                                                            order2.putShort(x3);
                                                            order2.putShort(x4);
                                                            order2.putShort(x7);
                                                            order2.putShort(x8);
                                                            order2.putShort((short) (C / 10000));
                                                            order2.putShort((short) (C2 / 10000));
                                                            byteBuffer = order2;
                                                        } else {
                                                            xvcVar = xvcVar2;
                                                            i11 = i45;
                                                            i9 = i28;
                                                            str7 = str15;
                                                            i10 = i29;
                                                            if (m5 == 1681012275) {
                                                                zhe.a(null, str7 == null);
                                                                str15 = "video/3gpp";
                                                            } else if (m5 == 1702061171) {
                                                                zhe.a(null, str7 == null);
                                                                sz0 c = c(i38, yw7Var2);
                                                                String str20 = (String) c.c;
                                                                byte[] bArr7 = (byte[]) c.d;
                                                                if (bArr7 != null) {
                                                                    list = mo5.u(bArr7);
                                                                }
                                                                sz0Var = c;
                                                                str15 = str20;
                                                            } else if (m5 == 1651798644) {
                                                                yw7Var2.N(i38 + 8);
                                                                yw7Var2.O(4);
                                                                qz0Var = new qz0(yw7Var2.C(), yw7Var2.C());
                                                            } else if (m5 == 1885434736) {
                                                                yw7Var2.N(i38 + 8);
                                                                f = yw7Var2.E() / yw7Var2.E();
                                                                i32 = i81;
                                                                str15 = str7;
                                                                i12 = 8;
                                                                z3 = true;
                                                            } else if (m5 == 1937126244) {
                                                                int i87 = i38 + 8;
                                                                while (true) {
                                                                    if (i87 - i38 >= m4) {
                                                                        bArr = null;
                                                                        break;
                                                                    }
                                                                    yw7Var2.N(i87);
                                                                    int m8 = yw7Var2.m();
                                                                    if (yw7Var2.m() == 1886547818) {
                                                                        bArr = Arrays.copyOfRange(yw7Var2.a, i87, m8 + i87);
                                                                        break;
                                                                    }
                                                                    i87 += m8;
                                                                }
                                                                bArr2 = bArr;
                                                            } else if (m5 == 1936995172) {
                                                                int A15 = yw7Var2.A();
                                                                byte b4 = b;
                                                                yw7Var2.O(b4);
                                                                if (A15 == 0) {
                                                                    int A16 = yw7Var2.A();
                                                                    if (A16 == 0) {
                                                                        i30 = 0;
                                                                    } else if (A16 == 1) {
                                                                        i30 = 1;
                                                                    } else if (A16 == 2) {
                                                                        i30 = 2;
                                                                    } else if (A16 == b4) {
                                                                        i30 = 3;
                                                                    }
                                                                }
                                                                i32 = i81;
                                                                str15 = str7;
                                                                i12 = 8;
                                                                b = 3;
                                                            } else if (m5 == 1634760259) {
                                                                int i88 = m4 - 12;
                                                                byte[] bArr8 = new byte[i88];
                                                                yw7Var2.N(i38 + 12);
                                                                yw7Var2.k(0, i88, bArr8);
                                                                byte[] bArr9 = jl2.a;
                                                                jte.c(i88, "Invalid APV CSD length: %s", i88 >= 17);
                                                                byte b5 = bArr8[0];
                                                                jte.c(b5, "Invalid APV CSD version: %s", b5 == 1);
                                                                int i89 = bArr8[5] & 255;
                                                                int i90 = bArr8[6] & 255;
                                                                int i91 = bArr8[7] & 255;
                                                                String str21 = hac.a;
                                                                Locale locale2 = Locale.US;
                                                                StringBuilder o = ts2.o("apv1.apvf", i89, ".apvl", i90, ".apvb");
                                                                o.append(i91);
                                                                str14 = o.toString();
                                                                list = mo5.u(bArr8);
                                                                yw7 yw7Var3 = new yw7(bArr8);
                                                                ye1 ye1Var = new ye1(i88, bArr8);
                                                                b = 3;
                                                                ye1Var.l(yw7Var3.b << 3);
                                                                ye1Var.o(1);
                                                                i12 = 8;
                                                                int f5 = ye1Var.f(8);
                                                                int i92 = 0;
                                                                int i93 = -1;
                                                                int i94 = -1;
                                                                int i95 = -1;
                                                                int i96 = -1;
                                                                int i97 = -1;
                                                                while (i92 < f5) {
                                                                    ye1Var.o(1);
                                                                    int f6 = ye1Var.f(8);
                                                                    int i98 = i97;
                                                                    int i99 = i96;
                                                                    int i100 = i95;
                                                                    int i101 = i94;
                                                                    int i102 = i93;
                                                                    int i103 = 0;
                                                                    while (i103 < f6) {
                                                                        ye1Var.n(6);
                                                                        boolean e2 = ye1Var.e();
                                                                        ye1Var.m();
                                                                        ye1Var.o(11);
                                                                        ye1Var.n(4);
                                                                        i98 = ye1Var.f(4) + 8;
                                                                        ye1Var.o(1);
                                                                        if (e2) {
                                                                            int f7 = ye1Var.f(8);
                                                                            int f8 = ye1Var.f(8);
                                                                            ye1Var.o(1);
                                                                            boolean e3 = ye1Var.e();
                                                                            int f9 = tm2.f(f7);
                                                                            i100 = e3 ? 1 : 2;
                                                                            i99 = f9;
                                                                            i102 = tm2.g(f8);
                                                                        }
                                                                        i103++;
                                                                        i101 = i98;
                                                                    }
                                                                    i92++;
                                                                    i93 = i102;
                                                                    i94 = i101;
                                                                    i95 = i100;
                                                                    i96 = i99;
                                                                    i97 = i98;
                                                                }
                                                                str15 = "video/apv";
                                                                i8 = i93;
                                                                i9 = i94;
                                                                i32 = i95;
                                                                i33 = i96;
                                                                i10 = i97;
                                                            } else {
                                                                i12 = 8;
                                                                b = 3;
                                                                if (m5 == 1668246642 && i33 == -1) {
                                                                    i13 = i8;
                                                                    if (i13 == -1) {
                                                                        int m9 = yw7Var2.m();
                                                                        if (m9 == 1852009592 || m9 == 1852009571) {
                                                                            int H7 = yw7Var2.H();
                                                                            int H8 = yw7Var2.H();
                                                                            yw7Var2.O(2);
                                                                            boolean z7 = m4 == 19 && (yw7Var2.A() & 128) != 0;
                                                                            int f10 = tm2.f(H7);
                                                                            int i104 = z7 ? 1 : 2;
                                                                            i8 = tm2.g(H8);
                                                                            i32 = i104;
                                                                            str15 = str7;
                                                                            i33 = f10;
                                                                        } else {
                                                                            ncd.f("BoxParsers", "Unsupported color type: ".concat(eu5.e(m9)));
                                                                        }
                                                                    }
                                                                } else {
                                                                    i13 = i8;
                                                                }
                                                                i8 = i13;
                                                            }
                                                        }
                                                        i32 = i81;
                                                        str15 = str7;
                                                    }
                                                    i32 = i81;
                                                }
                                                i12 = 8;
                                            }
                                            i32 = i81;
                                            str15 = str7;
                                        }
                                    }
                                }
                                i11 = i45;
                                xvcVar = xvcVar2;
                            }
                        }
                        i5 = i39 + m4;
                        i25 = i12;
                        m2 = i40;
                        xvcVar2 = xvcVar;
                        i = i11;
                        i31 = i8;
                        str12 = str6;
                        i28 = i9;
                        i29 = i10;
                        str13 = null;
                    }
                    i7 = m2;
                    int i105 = i31;
                    int i106 = i28;
                    int i107 = i32;
                    String str22 = str15;
                    int i108 = i29;
                    if (du2Var == null) {
                        str4 = du2Var.b;
                        str5 = "video/dolby-vision";
                    } else {
                        str4 = str14;
                        str5 = str22;
                    }
                    if (str5 != null) {
                        wz0Var2 = wz0Var;
                        str11 = str;
                    } else {
                        fo4 fo4Var = new fo4();
                        fo4Var.a = Integer.toString(i4);
                        fo4Var.s = wf7.n(str5);
                        fo4Var.k = str4;
                        fo4Var.z = H;
                        fo4Var.A = H2;
                        fo4Var.C = i37;
                        fo4Var.D = i36;
                        fo4Var.H = f;
                        wz0Var2 = wz0Var;
                        fo4Var.F = wz0Var2.c;
                        fo4Var.G = wz0Var2.d;
                        fo4Var.I = bArr2;
                        fo4Var.J = i30;
                        fo4Var.v = list;
                        fo4Var.u = i34;
                        fo4Var.L = i35;
                        fo4Var.w = as3Var4;
                        str11 = str;
                        fo4Var.d = str11;
                        fo4Var.K = new tm2(i33, i107, i105, byteBuffer != null ? byteBuffer.array() : null, i106, i108);
                        qz0 qz0Var2 = qz0Var;
                        if (qz0Var2 != null) {
                            fo4Var.i = ine.d(qz0Var2.a);
                            fo4Var.j = ine.d(qz0Var2.b);
                        } else {
                            sz0 sz0Var2 = sz0Var;
                            if (sz0Var2 != null) {
                                fo4Var.i = ine.d(sz0Var2.a);
                                fo4Var.j = ine.d(sz0Var2.b);
                            }
                        }
                        uz0Var.d = new go4(fo4Var);
                    }
                }
                str3 = str2;
                as3 as3Var42 = as3Var2;
                i3 = i23;
                i4 = i22;
                i5 = i27;
                i6 = m;
                xvc xvcVar22 = null;
                List list2 = null;
                String str142 = null;
                byte[] bArr22 = null;
                ByteBuffer byteBuffer2 = null;
                du2Var = null;
                qz0 qz0Var3 = null;
                sz0 sz0Var3 = null;
                int i282 = 8;
                int i292 = 8;
                String str152 = str3;
                float f11 = 1.0f;
                int i302 = -1;
                int i312 = -1;
                int i322 = -1;
                int i332 = -1;
                boolean z32 = false;
                int i342 = -1;
                int i352 = -1;
                int i362 = -1;
                int i372 = -1;
                while (i5 - i2 < m2) {
                }
                i7 = m2;
                int i1052 = i312;
                int i1062 = i282;
                int i1072 = i322;
                String str222 = str152;
                int i1082 = i292;
                if (du2Var == null) {
                }
                if (str5 != null) {
                }
            } else {
                if (m3 == 1836069985 || m3 == 1701733217 || m3 == 1633889587 || m3 == 1700998451 || m3 == 1633889588 || m3 == 1835823201 || m3 == 1685353315 || m3 == 1685353317 || m3 == 1685353320 || m3 == 1685353324 || m3 == 1685353336 || m3 == 1935764850 || m3 == 1935767394 || m3 == 1819304813 || m3 == 1936684916 || m3 == 1953984371 || m3 == 778924082 || m3 == 778924083 || m3 == 1835557169 || m3 == 1835560241 || m3 == 1634492771 || m3 == 1634492791 || m3 == 1970037111 || m3 == 1332770163 || m3 == 1716281667 || m3 == 1767992678 || m3 == 1768973165 || m3 == 1718641517) {
                    yw7Var2 = yw7Var;
                    i24 = i24;
                    m2 = m2;
                    b(yw7Var2, m3, i24, m2, wz0Var3.a, str11, z, as3Var, uz0Var, i23);
                    str11 = str;
                } else if (m3 == 1414810956 || m3 == 1954034535 || m3 == 2004251764 || m3 == 1937010800 || m3 == 1664495672 || m3 == 1836070003 || m3 == 1952807028) {
                    yw7Var2.N(i24 + 16);
                    String str23 = "application/ttml+xml";
                    long j = Long.MAX_VALUE;
                    if (m3 != 1414810956) {
                        if (m3 == 1954034535) {
                            int i109 = m2 - 16;
                            byte[] bArr10 = new byte[i109];
                            yw7Var2.k(0, i109, bArr10);
                            y79Var = mo5.u(bArr10);
                            str23 = "application/x-quicktime-tx3g";
                            i20 = i24;
                            i21 = m2;
                        } else if (m3 == 2004251764) {
                            str23 = "application/x-mp4-vtt";
                        } else if (m3 == 1937010800) {
                            j = 0;
                        } else if (m3 == 1664495672) {
                            uz0Var.b = true;
                            str23 = "application/x-mp4-cea-608";
                        } else if (m3 == 1836070003) {
                            int i110 = yw7Var2.b;
                            yw7Var2.O(4);
                            if (yw7Var2.m() == 1702061171) {
                                byte[] bArr11 = (byte[]) c(i110, yw7Var2).d;
                                if (bArr11 == null || bArr11.length != 64) {
                                    i20 = i24;
                                    i21 = m2;
                                    yw7Var2 = yw7Var;
                                    i3 = i23;
                                    wz0Var2 = wz0Var3;
                                    i4 = i22;
                                    i6 = m;
                                    i2 = i20;
                                    i7 = i21;
                                } else {
                                    int i111 = wz0Var3.e;
                                    int i112 = wz0Var3.f;
                                    jte.p(bArr11.length == 64);
                                    ArrayList arrayList = new ArrayList(16);
                                    int i113 = 0;
                                    while (i113 < bArr11.length - 3) {
                                        byte[] bArr12 = bArr11;
                                        int c2 = ine.c(bArr11[i113], bArr11[i113 + 1], bArr11[i113 + 2], bArr12[i113 + 3]);
                                        int i114 = (c2 >> 16) & nm7.d4;
                                        int i115 = ((c2 >> 8) & nm7.d4) - 128;
                                        int i116 = (c2 & nm7.d4) - 128;
                                        arrayList.add(String.format("%06x", Integer.valueOf((hac.i(kt6.z(i115, 14075, 10000, i114), 0, nm7.d4) << 16) | (hac.i((i114 - ((i116 * 3455) / 10000)) - ((i115 * 7169) / 10000), 0, nm7.d4) << 8) | hac.i(kt6.z(i116, 17790, 10000, i114), 0, nm7.d4))));
                                        i113 += 4;
                                        bArr11 = bArr12;
                                        i24 = i24;
                                        m2 = m2;
                                    }
                                    i20 = i24;
                                    i21 = m2;
                                    StringBuilder o2 = ts2.o("size: ", i111, "x", i112, "\npalette: ");
                                    o2.append(new jw5(", ", (byte) 0).b(arrayList));
                                    o2.append("\n");
                                    String sb = o2.toString();
                                    String str24 = hac.a;
                                    y79Var = mo5.u(sb.getBytes(StandardCharsets.UTF_8));
                                    str10 = "application/vobsub";
                                }
                            } else {
                                i20 = i24;
                                i21 = m2;
                                str10 = null;
                                y79Var = null;
                            }
                            str23 = str10;
                        } else {
                            i20 = i24;
                            i21 = m2;
                            if (m3 != 1952807028) {
                                rjb.h();
                                return null;
                            }
                            str23 = "text/x-unknown";
                            y79Var = null;
                        }
                        long j2 = j;
                        if (str23 != null) {
                            fo4 fo4Var2 = new fo4();
                            fo4Var2.a = Integer.toString(i22);
                            fo4Var2.s = wf7.n(str23);
                            fo4Var2.d = str11;
                            fo4Var2.x = j2;
                            fo4Var2.v = y79Var;
                            uz0Var.d = new go4(fo4Var2);
                        }
                        yw7Var2 = yw7Var;
                        i3 = i23;
                        wz0Var2 = wz0Var3;
                        i4 = i22;
                        i6 = m;
                        i2 = i20;
                        i7 = i21;
                    }
                    i20 = i24;
                    i21 = m2;
                    y79Var = null;
                    long j22 = j;
                    if (str23 != null) {
                    }
                    yw7Var2 = yw7Var;
                    i3 = i23;
                    wz0Var2 = wz0Var3;
                    i4 = i22;
                    i6 = m;
                    i2 = i20;
                    i7 = i21;
                } else if (m3 == 1835365492 || m3 == 1769222965) {
                    yw7Var2.N(i24 + 16);
                    if (m3 == 1835365492) {
                        yw7Var2.v();
                        String v = yw7Var2.v();
                        if (v != null) {
                            fo4 fo4Var3 = new fo4();
                            fo4Var3.a = Integer.toString(i22);
                            fo4Var3.s = wf7.n(v);
                            uz0Var.d = new go4(fo4Var3);
                        }
                    } else if (m3 == 1769222965) {
                        int A17 = yw7Var2.A();
                        byte[] bArr13 = new byte[A17];
                        yw7Var2.k(0, A17, bArr13);
                        fo4 fo4Var4 = new fo4();
                        fo4Var4.a = Integer.toString(i22);
                        fo4Var4.s = wf7.n("application/x-itut-t35");
                        fo4Var4.v = mo5.u(bArr13);
                        uz0Var.d = new go4(fo4Var4);
                    }
                } else if (m3 == 1667329389) {
                    fo4 fo4Var5 = new fo4();
                    fo4Var5.a = Integer.toString(i22);
                    fo4Var5.s = wf7.n("application/x-camera-motion");
                    uz0Var.d = new go4(fo4Var5);
                }
                i2 = i24;
                i7 = m2;
                i3 = i23;
                wz0Var2 = wz0Var3;
                i4 = i22;
                i6 = m;
            }
            yw7Var2.N(i2 + i7);
            i23 = i3 + 1;
            wz0Var3 = wz0Var2;
            i22 = i4;
            m = i6;
            z2 = false;
        }
        return uz0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:357:0x00ea, code lost:
    
        if (r29 == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x00ec, code lost:
    
        r29 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:506:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0880  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList j(oh7 oh7Var, au4 au4Var, long j, as3 as3Var, boolean z, boolean z2, bs4 bs4Var, boolean z3) {
        int i;
        long j2;
        long j3;
        long j4;
        int i2;
        int i3;
        long j5;
        long b0;
        long j6;
        int e;
        int i4;
        ArrayList arrayList;
        int i5;
        ArrayList arrayList2;
        long j7;
        ArrayList arrayList3;
        int i6;
        int i7;
        String str;
        ph7 v;
        int i8;
        long j8;
        oh7 oh7Var2;
        long j9;
        int i9;
        String str2;
        oo5 oo5Var;
        oo5 oo5Var2;
        go4 go4Var;
        qzb qzbVar;
        bs4 bs4Var2;
        oh7 u;
        Pair create;
        long[] jArr;
        int i10;
        long m;
        ph7 v2;
        int i11;
        int i12;
        tz0 vz0Var;
        boolean z4;
        int i13;
        yw7 yw7Var;
        int i14;
        int i15;
        boolean z5;
        yw7 yw7Var2;
        tz0 tz0Var;
        long[] jArr2;
        int[] iArr;
        int[] iArr2;
        long[] jArr3;
        int i16;
        int i17;
        String str3;
        long[] jArr4;
        int i18;
        int[] iArr3;
        long[] jArr5;
        boolean z6;
        ArrayList arrayList4;
        int[] iArr4;
        long j10;
        int i19;
        int[] iArr5;
        long j11;
        int i20;
        long[] jArr6;
        long j12;
        oo5 oo5Var3;
        int i21;
        long j13;
        int i22;
        long[] jArr7;
        int[] iArr6;
        ArrayList arrayList5;
        int i23;
        int[] iArr7;
        zzb zzbVar;
        long[] jArr8;
        long[] jArr9;
        int[] iArr8;
        boolean z7;
        oo5 oo5Var4;
        int i24;
        int i25;
        long b02;
        ArrayList arrayList6;
        zzb zzbVar2;
        oh7 oh7Var3 = oh7Var;
        ArrayList arrayList7 = oh7Var3.g;
        ArrayList arrayList8 = new ArrayList();
        int i26 = 0;
        while (i26 < arrayList7.size()) {
            oh7 oh7Var4 = (oh7) arrayList7.get(i26);
            if (oh7Var4.b != 1953653099) {
                arrayList = arrayList7;
                arrayList6 = arrayList8;
                i = i26;
            } else {
                ph7 v3 = oh7Var3.v(1836476516);
                v3.getClass();
                oh7 u2 = oh7Var4.u(1835297121);
                u2.getClass();
                ph7 v4 = u2.v(1751411826);
                v4.getClass();
                yw7 yw7Var3 = v4.e;
                yw7Var3.N(16);
                int m2 = yw7Var3.m();
                int i27 = m2 == 1936684398 ? 1 : m2 == 1986618469 ? 2 : (m2 == 1952807028 || m2 == 1935832172 || m2 == 1937072756 || m2 == 1668047728 || m2 == 1937072752) ? 3 : m2 == 1835365473 ? 5 : -1;
                int i28 = 1;
                i = i26;
                if (i27 == -1) {
                    bs4Var2 = bs4Var;
                    arrayList = arrayList7;
                    arrayList3 = arrayList8;
                    oh7Var2 = oh7Var4;
                    str2 = "BoxParsers";
                    qzbVar = null;
                    j2 = 0;
                } else {
                    j2 = 0;
                    ph7 v5 = oh7Var4.v(1953196132);
                    v5.getClass();
                    yw7 yw7Var4 = v5.e;
                    yw7Var4.N(8);
                    int e2 = e(yw7Var4.m());
                    yw7Var4.O(e2 != 0 ? 16 : 8);
                    int m3 = yw7Var4.m();
                    yw7Var4.O(4);
                    int i29 = yw7Var4.b;
                    int i30 = e2 == 0 ? 4 : 8;
                    int i31 = 0;
                    while (true) {
                        j3 = -9223372036854775807L;
                        if (i31 >= i30) {
                            yw7Var4.O(i30);
                            break;
                        }
                        if (yw7Var4.a[i29 + i31] != -1) {
                            j4 = e2 == 0 ? yw7Var4.C() : yw7Var4.G();
                        } else {
                            i31++;
                        }
                    }
                    yw7Var4.O(10);
                    int H = yw7Var4.H();
                    yw7Var4.O(4);
                    int m4 = yw7Var4.m();
                    int m5 = yw7Var4.m();
                    yw7Var4.O(4);
                    int m6 = yw7Var4.m();
                    int m7 = yw7Var4.m();
                    if (m4 == 0 && m5 == 65536 && ((m6 == -65536 || m6 == 65536) && m7 == 0)) {
                        i2 = 90;
                    } else if (m4 == 0 && m5 == -65536 && ((m6 == 65536 || m6 == -65536) && m7 == 0)) {
                        i2 = nm7.s4;
                    } else if ((m4 == -65536 || m4 == 65536) && m5 == 0 && m6 == 0 && m7 == -65536) {
                        i2 = nm7.J2;
                    } else {
                        i3 = 0;
                        yw7Var4.O(16);
                        short x = yw7Var4.x();
                        yw7Var4.O(2);
                        wz0 wz0Var = new wz0(m3, j4, H, i3, (((long) m4) * ((long) m7)) - (((long) m5) * ((long) m6)) >= 0, x, yw7Var4.x());
                        j5 = j != -9223372036854775807L ? j4 : j;
                        long j14 = g(v3.e).c;
                        if (j5 != -9223372036854775807L) {
                            j6 = j14;
                            b0 = -9223372036854775807L;
                        } else {
                            String str4 = hac.a;
                            b0 = hac.b0(j5, 1000000L, j14, RoundingMode.DOWN);
                            j6 = j14;
                        }
                        oh7 u3 = u2.u(1835626086);
                        u3.getClass();
                        oh7 u4 = u3.u(1937007212);
                        u4.getClass();
                        ph7 v6 = u2.v(1835296868);
                        v6.getClass();
                        yw7 yw7Var5 = v6.e;
                        yw7Var5.N(8);
                        e = e(yw7Var5.m());
                        yw7Var5.O(e != 0 ? 8 : 16);
                        long C = yw7Var5.C();
                        int i32 = yw7Var5.b;
                        i4 = e != 0 ? 4 : 8;
                        arrayList = arrayList7;
                        i5 = 0;
                        while (true) {
                            if (i5 < i4) {
                                arrayList2 = arrayList8;
                                j7 = C;
                                yw7Var5.O(i4);
                                break;
                            }
                            i11 = i5;
                            i12 = e;
                            if (yw7Var5.a[i32 + i11] != -1) {
                                long C2 = i12 == 0 ? yw7Var5.C() : yw7Var5.G();
                                if (C2 != 0) {
                                    String str5 = hac.a;
                                    j3 = hac.b0(C2, 1000000L, C, RoundingMode.DOWN);
                                }
                                arrayList2 = arrayList8;
                                j7 = C;
                            } else {
                                arrayList8 = arrayList8;
                                i5 = i11 + 1;
                                e = i12;
                            }
                        }
                        long j15 = j3;
                        int H2 = yw7Var5.H();
                        char c = (char) (((H2 >> 10) & 31) + 96);
                        char c2 = (char) (((H2 >> 5) & 31) + 96);
                        char c3 = (char) ((H2 & 31) + 96);
                        arrayList3 = arrayList2;
                        char[] cArr = {c, c2, c3};
                        i7 = 0;
                        for (i6 = 3; i7 < i6; i6 = 3) {
                            char c4 = cArr[i7];
                            int i33 = i7;
                            if (c4 < 'a' || c4 > 'z') {
                                str = null;
                                break;
                            }
                            i7 = i33 + 1;
                        }
                        str = new String(cArr);
                        v = u4.v(1937011556);
                        if (v != null) {
                            ncd.f("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                            bs4Var2 = bs4Var;
                            oh7Var2 = oh7Var4;
                            str2 = "BoxParsers";
                        } else {
                            uz0 i34 = i(v.e, wz0Var, str, as3Var, z2);
                            oh7 u5 = oh7Var4.u(1953654118);
                            if (u5 != null && (v2 = u5.v(1667785072)) != null) {
                                yw7 yw7Var6 = v2.e;
                                yw7Var6.N(8);
                                if (yw7Var6.a() >= 4) {
                                    i8 = yw7Var6.m();
                                    if (!z || (u = oh7Var4.u(1701082227)) == null) {
                                        j8 = j15;
                                        oh7Var2 = oh7Var4;
                                        j9 = b0;
                                        i9 = i8;
                                        str2 = "BoxParsers";
                                    } else {
                                        ph7 v7 = u.v(1701606260);
                                        if (v7 == null) {
                                            j8 = j15;
                                            oh7Var2 = oh7Var4;
                                            j9 = b0;
                                            i9 = i8;
                                            str2 = "BoxParsers";
                                            create = null;
                                        } else {
                                            yw7 yw7Var7 = v7.e;
                                            yw7Var7.N(8);
                                            int e3 = e(yw7Var7.m());
                                            str2 = "BoxParsers";
                                            int E = yw7Var7.E();
                                            oh7Var2 = oh7Var4;
                                            i9 = i8;
                                            jte.c(E, "Invalid initialCapacity: %s", E >= 0);
                                            long[] jArr10 = new long[E];
                                            jte.c(E, "Invalid initialCapacity: %s", E >= 0);
                                            long[] jArr11 = new long[E];
                                            j9 = b0;
                                            int i35 = 0;
                                            long[] jArr12 = jArr10;
                                            j8 = j15;
                                            int i36 = 0;
                                            int i37 = 0;
                                            while (i36 < E) {
                                                long G = e3 == i28 ? yw7Var7.G() : yw7Var7.C();
                                                int i38 = i37 + 1;
                                                int i39 = i36;
                                                if (i38 > jArr12.length) {
                                                    int length = jArr12.length;
                                                    if (i38 < 0) {
                                                        bh7.j("cannot store more than MAX_VALUE elements");
                                                        return null;
                                                    }
                                                    int i40 = length + (length >> 1) + 1;
                                                    if (i40 < i38) {
                                                        i40 = Integer.highestOneBit(i37) << 1;
                                                    }
                                                    if (i40 < 0) {
                                                        i40 = Integer.MAX_VALUE;
                                                    }
                                                    jArr12 = Arrays.copyOf(jArr12, i40);
                                                }
                                                long[] jArr13 = jArr12;
                                                jArr12[i37] = G;
                                                int i41 = i37 + 1;
                                                if (e3 == 1) {
                                                    jArr = jArr13;
                                                    i10 = i41;
                                                    m = yw7Var7.u();
                                                } else {
                                                    jArr = jArr13;
                                                    i10 = i41;
                                                    m = yw7Var7.m();
                                                }
                                                int i42 = i35 + 1;
                                                long j16 = m;
                                                if (i42 > jArr11.length) {
                                                    int length2 = jArr11.length;
                                                    if (i42 < 0) {
                                                        bh7.j("cannot store more than MAX_VALUE elements");
                                                        return null;
                                                    }
                                                    int i43 = length2 + (length2 >> 1) + 1;
                                                    if (i43 < i42) {
                                                        i43 = Integer.highestOneBit(i35) << 1;
                                                    }
                                                    if (i43 < 0) {
                                                        i43 = Integer.MAX_VALUE;
                                                    }
                                                    jArr11 = Arrays.copyOf(jArr11, i43);
                                                }
                                                long[] jArr14 = jArr11;
                                                jArr11[i35] = j16;
                                                i35++;
                                                if (yw7Var7.x() != 1) {
                                                    u36.j("Unsupported media rate.");
                                                    return null;
                                                }
                                                yw7Var7.O(2);
                                                jArr11 = jArr14;
                                                i36 = i39 + 1;
                                                jArr12 = jArr;
                                                i37 = i10;
                                                i28 = 1;
                                            }
                                            oo5 oo5Var5 = oo5.c;
                                            oo5 oo5Var6 = i37 == 0 ? oo5Var5 : new oo5(i37, jArr12);
                                            if (i35 != 0) {
                                                oo5Var5 = new oo5(i35, jArr11);
                                            }
                                            create = Pair.create(oo5Var6, oo5Var5);
                                        }
                                        if (create != null) {
                                            oo5Var2 = (oo5) create.first;
                                            oo5Var = (oo5) create.second;
                                            go4Var = (go4) i34.d;
                                            if (go4Var == null) {
                                                bs4Var2 = bs4Var;
                                            } else {
                                                int i44 = wz0Var.b;
                                                if (i44 != 0) {
                                                    nh7 nh7Var = new nh7(i44);
                                                    fo4 a2 = go4Var.a();
                                                    nf7 nf7Var = ((go4) i34.d).m;
                                                    a2.l = nf7Var != null ? nf7Var.a(nh7Var) : new nf7(nh7Var);
                                                    go4Var = new go4(a2);
                                                }
                                                boolean z8 = !Objects.equals(go4Var.t, "text/x-unknown");
                                                pzb pzbVar = new pzb();
                                                pzbVar.m = true;
                                                pzbVar.n = -1;
                                                pzbVar.a = wz0Var.a;
                                                pzbVar.b = i27;
                                                pzbVar.c = j7;
                                                pzbVar.d = j6;
                                                pzbVar.e = j9;
                                                pzbVar.f = j8;
                                                pzbVar.g = go4Var;
                                                pzbVar.h = i34.b;
                                                pzbVar.i = (szb[]) ((szb[]) i34.c).clone();
                                                pzbVar.j = i34.a;
                                                pzbVar.k = oo5Var2;
                                                pzbVar.l = oo5Var;
                                                pzbVar.m = z8;
                                                pzbVar.n = i9;
                                                pzbVar.g.getClass();
                                                qzbVar = new qzb(pzbVar);
                                                bs4Var2 = bs4Var;
                                            }
                                        }
                                    }
                                    oo5Var = null;
                                    oo5Var2 = null;
                                    go4Var = (go4) i34.d;
                                    if (go4Var == null) {
                                    }
                                }
                            }
                            i8 = -1;
                            if (z) {
                            }
                            j8 = j15;
                            oh7Var2 = oh7Var4;
                            j9 = b0;
                            i9 = i8;
                            str2 = "BoxParsers";
                            oo5Var = null;
                            oo5Var2 = null;
                            go4Var = (go4) i34.d;
                            if (go4Var == null) {
                            }
                        }
                        qzbVar = null;
                    }
                    i3 = i2;
                    yw7Var4.O(16);
                    short x2 = yw7Var4.x();
                    yw7Var4.O(2);
                    wz0 wz0Var2 = new wz0(m3, j4, H, i3, (((long) m4) * ((long) m7)) - (((long) m5) * ((long) m6)) >= 0, x2, yw7Var4.x());
                    if (j != -9223372036854775807L) {
                    }
                    long j142 = g(v3.e).c;
                    if (j5 != -9223372036854775807L) {
                    }
                    oh7 u32 = u2.u(1835626086);
                    u32.getClass();
                    oh7 u42 = u32.u(1937007212);
                    u42.getClass();
                    ph7 v62 = u2.v(1835296868);
                    v62.getClass();
                    yw7 yw7Var52 = v62.e;
                    yw7Var52.N(8);
                    e = e(yw7Var52.m());
                    yw7Var52.O(e != 0 ? 8 : 16);
                    long C3 = yw7Var52.C();
                    int i322 = yw7Var52.b;
                    if (e != 0) {
                    }
                    arrayList = arrayList7;
                    i5 = 0;
                    while (true) {
                        if (i5 < i4) {
                        }
                        arrayList8 = arrayList8;
                        i5 = i11 + 1;
                        e = i12;
                    }
                    long j152 = j3;
                    int H22 = yw7Var52.H();
                    char c5 = (char) (((H22 >> 10) & 31) + 96);
                    char c22 = (char) (((H22 >> 5) & 31) + 96);
                    char c32 = (char) ((H22 & 31) + 96);
                    arrayList3 = arrayList2;
                    char[] cArr2 = {c5, c22, c32};
                    i7 = 0;
                    while (i7 < i6) {
                    }
                    str = new String(cArr2);
                    v = u42.v(1937011556);
                    if (v != null) {
                    }
                    qzbVar = null;
                }
                qzb qzbVar2 = (qzb) bs4Var2.apply(qzbVar);
                if (qzbVar2 == null) {
                    arrayList6 = arrayList3;
                } else {
                    go4 go4Var2 = qzbVar2.g;
                    oh7 u6 = oh7Var2.u(1835297121);
                    u6.getClass();
                    oh7 u7 = u6.u(1835626086);
                    u7.getClass();
                    oh7 u8 = u7.u(1937007212);
                    u8.getClass();
                    ph7 v8 = u8.v(1937011578);
                    if (v8 != null) {
                        vz0Var = new rk0(v8, go4Var2);
                    } else {
                        ph7 v9 = u8.v(1937013298);
                        if (v9 == null) {
                            throw bx7.a("Track has no sample table size information", null);
                        }
                        vz0Var = new vz0(v9);
                    }
                    int b = vz0Var.b();
                    if (b == 0) {
                        zzbVar2 = new zzb(qzbVar2, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
                        arrayList6 = arrayList3;
                    } else {
                        if (qzbVar2.b == 2) {
                            long j17 = qzbVar2.f;
                            if (j17 > j2) {
                                fo4 a3 = go4Var2.a();
                                a3.a(b / (j17 / 1000000.0f));
                                go4 go4Var3 = new go4(a3);
                                pzb a4 = qzbVar2.a();
                                a4.g = go4Var3;
                                qzbVar2 = new qzb(a4);
                            }
                        }
                        go4 go4Var4 = qzbVar2.g;
                        ph7 v10 = u8.v(1937007471);
                        if (v10 == null) {
                            v10 = u8.v(1668232756);
                            v10.getClass();
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        yw7 yw7Var8 = v10.e;
                        ph7 v11 = u8.v(1937011555);
                        v11.getClass();
                        yw7 yw7Var9 = v11.e;
                        ph7 v12 = u8.v(1937011827);
                        v12.getClass();
                        yw7 yw7Var10 = v12.e;
                        ph7 v13 = u8.v(1937011571);
                        yw7 yw7Var11 = v13 != null ? v13.e : null;
                        ph7 v14 = u8.v(1668576371);
                        yw7 yw7Var12 = v14 != null ? v14.e : null;
                        rz0 rz0Var = new rz0(yw7Var9, yw7Var8, z4);
                        yw7Var10.N(12);
                        int E2 = yw7Var10.E() - 1;
                        int E3 = yw7Var10.E();
                        int E4 = yw7Var10.E();
                        if (yw7Var12 != null) {
                            yw7Var12.N(12);
                            i13 = yw7Var12.E();
                        } else {
                            i13 = 0;
                        }
                        if (yw7Var11 != null) {
                            yw7Var11.N(12);
                            i14 = yw7Var11.E();
                            if (i14 > 0) {
                                i15 = yw7Var11.E() - 1;
                                yw7Var = yw7Var11;
                                int a5 = vz0Var.a();
                                String str6 = go4Var4.t;
                                z5 = a5 == -1 && ("audio/raw".equals(str6) || "audio/g711-mlaw".equals(str6) || "audio/g711-alaw".equals(str6)) && E2 == 0 && i13 == 0 && i14 == 0;
                                ArrayList arrayList9 = new ArrayList();
                                boolean z9 = yw7Var != null;
                                if (z5) {
                                    if (z3) {
                                        yw7Var2 = yw7Var12;
                                        iArr2 = new int[0];
                                        jArr3 = new long[0];
                                        tz0Var = vz0Var;
                                        jArr2 = new long[0];
                                        iArr = new int[0];
                                    } else {
                                        yw7Var2 = yw7Var12;
                                        tz0Var = vz0Var;
                                        jArr2 = new long[b];
                                        iArr = new int[b];
                                        iArr2 = new int[b];
                                        jArr3 = new long[b];
                                    }
                                    int i45 = i13;
                                    yw7 yw7Var13 = yw7Var;
                                    long j18 = j2;
                                    long j19 = j18;
                                    long j20 = j19;
                                    int i46 = 0;
                                    int i47 = 0;
                                    int i48 = 0;
                                    int i49 = 0;
                                    int i50 = 0;
                                    while (true) {
                                        if (i46 >= b) {
                                            i16 = E2;
                                            i17 = E3;
                                            str3 = str2;
                                            jArr4 = jArr3;
                                            i18 = i49;
                                            iArr3 = iArr;
                                            jArr5 = jArr2;
                                            break;
                                        }
                                        int i51 = i49;
                                        boolean z10 = true;
                                        while (i51 == 0) {
                                            z10 = rz0Var.a();
                                            if (!z10) {
                                                break;
                                            }
                                            int i52 = E2;
                                            long j21 = rz0Var.d;
                                            i51 = rz0Var.c;
                                            j20 = j21;
                                            E2 = i52;
                                            E3 = E3;
                                            b = b;
                                        }
                                        int i53 = b;
                                        i16 = E2;
                                        i17 = E3;
                                        if (z10) {
                                            String str7 = str2;
                                            if (yw7Var2 != null) {
                                                int i54 = i47;
                                                int i55 = i45;
                                                while (i50 == 0 && i55 > 0) {
                                                    i50 = yw7Var2.E();
                                                    i54 = yw7Var2.m();
                                                    i55--;
                                                }
                                                i50--;
                                                i45 = i55;
                                                i47 = i54;
                                            }
                                            int c6 = tz0Var.c();
                                            int[] iArr9 = iArr;
                                            rz0 rz0Var2 = rz0Var;
                                            long j22 = c6;
                                            j19 += j22;
                                            if (c6 > i48) {
                                                i48 = c6;
                                            }
                                            if (z3) {
                                                jArr6 = jArr2;
                                            } else {
                                                jArr2[i46] = j20;
                                                iArr9[i46] = c6;
                                                jArr6 = jArr2;
                                                jArr3[i46] = j18 + i47;
                                                iArr2[i46] = yw7Var13 == null ? 1 : 0;
                                                if (i46 == i15) {
                                                    iArr2[i46] = 1;
                                                    arrayList9.add(Integer.valueOf(i46));
                                                }
                                            }
                                            if (yw7Var13 != null && i46 == i15 && i14 - 1 > 0) {
                                                i15 = yw7Var13.E() - 1;
                                            }
                                            j18 += E4;
                                            int i56 = i17 - 1;
                                            if (i56 == 0 && i16 > 0) {
                                                i56 = yw7Var10.E();
                                                i16--;
                                                E4 = yw7Var10.m();
                                            }
                                            j20 += j22;
                                            i49 = i51 - 1;
                                            i46++;
                                            rz0Var = rz0Var2;
                                            iArr = iArr9;
                                            jArr2 = jArr6;
                                            E3 = i56;
                                            str2 = str7;
                                            E2 = i16;
                                            b = i53;
                                        } else {
                                            str3 = str2;
                                            ncd.f(str3, "Unexpected end of chunk data");
                                            if (z3) {
                                                jArr4 = jArr3;
                                                jArr5 = jArr2;
                                                b = i46;
                                                iArr3 = iArr;
                                            } else {
                                                long[] copyOf = Arrays.copyOf(jArr2, i46);
                                                int[] copyOf2 = Arrays.copyOf(iArr, i46);
                                                long[] copyOf3 = Arrays.copyOf(jArr3, i46);
                                                iArr2 = Arrays.copyOf(iArr2, i46);
                                                jArr4 = copyOf3;
                                                jArr5 = copyOf;
                                                iArr3 = copyOf2;
                                                b = i46;
                                            }
                                            i18 = i51;
                                        }
                                    }
                                    long j23 = j18 + i47;
                                    if (yw7Var2 != null) {
                                        for (int i57 = i45; i57 > 0; i57--) {
                                            if (yw7Var2.E() != 0) {
                                                z6 = false;
                                                break;
                                            }
                                            yw7Var2.m();
                                        }
                                    }
                                    z6 = true;
                                    if (i14 == 0 && i17 == 0 && i18 == 0 && i16 == 0 && i50 == 0 && z6) {
                                        arrayList4 = arrayList9;
                                        iArr4 = iArr2;
                                    } else {
                                        StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                                        arrayList4 = arrayList9;
                                        iArr4 = iArr2;
                                        ts2.v(sb, qzbVar2.a, ": remainingSynchronizationSamples ", i14, ", remainingSamplesAtTimestampDelta ");
                                        ts2.v(sb, i17, ", remainingSamplesInChunk ", i18, ", remainingTimestampDeltaChanges ");
                                        sb.append(i16);
                                        sb.append(", remainingSamplesAtTimestampOffset ");
                                        sb.append(i50);
                                        sb.append(!z6 ? ", ctts invalid" : "");
                                        ncd.f(str3, sb.toString());
                                    }
                                    j10 = j23;
                                    i19 = i48;
                                    iArr5 = iArr4;
                                    j11 = j19;
                                    i20 = b;
                                } else {
                                    int i58 = rz0Var.a;
                                    long[] jArr15 = new long[i58];
                                    int[] iArr10 = new int[i58];
                                    while (rz0Var.a()) {
                                        int i59 = rz0Var.b;
                                        jArr15[i59] = rz0Var.d;
                                        iArr10[i59] = rz0Var.c;
                                    }
                                    long j24 = E4;
                                    int max = Math.max(1, TLObject.FLAG_13 / a5);
                                    i20 = 0;
                                    for (int i60 = 0; i60 < i58; i60++) {
                                        i20 += hac.g(iArr10[i60], max);
                                    }
                                    jArr5 = new long[i20];
                                    iArr3 = new int[i20];
                                    jArr4 = new long[i20];
                                    int[] iArr11 = new int[i20];
                                    int i61 = 0;
                                    int i62 = 0;
                                    int i63 = 0;
                                    int i64 = 0;
                                    int i65 = 0;
                                    while (i62 < i58) {
                                        int i66 = iArr10[i62];
                                        long j25 = jArr15[i62];
                                        int i67 = i65;
                                        int i68 = i58;
                                        int i69 = i64;
                                        int i70 = i67;
                                        int i71 = i61;
                                        int i72 = i66;
                                        while (i72 > 0) {
                                            int min = Math.min(max, i72);
                                            jArr5[i70] = j25;
                                            int i73 = i72;
                                            int i74 = a5 * min;
                                            iArr3[i70] = i74;
                                            i71 += i74;
                                            i69 = Math.max(i69, i74);
                                            long j26 = j24;
                                            jArr4[i70] = j26 * i63;
                                            iArr11[i70] = 1;
                                            j25 += iArr3[i70];
                                            i63 += min;
                                            i72 = i73 - min;
                                            i70++;
                                            iArr10 = iArr10;
                                            j24 = j26;
                                        }
                                        i62++;
                                        int i75 = i70;
                                        i64 = i69;
                                        i58 = i68;
                                        i65 = i75;
                                        i61 = i71;
                                    }
                                    long j27 = j24 * i63;
                                    j11 = i61;
                                    if (z3) {
                                        jArr5 = new long[0];
                                        iArr3 = new int[0];
                                        jArr4 = new long[0];
                                        iArr11 = new int[0];
                                    }
                                    j10 = j27;
                                    iArr5 = iArr11;
                                    i19 = i64;
                                    arrayList4 = arrayList9;
                                }
                                long[] jArr16 = jArr5;
                                int[] iArr12 = iArr3;
                                j12 = qzbVar2.f;
                                if (j12 > j2) {
                                    long b03 = hac.b0(j11 << 3, 1000000L, j12, RoundingMode.HALF_DOWN);
                                    if (b03 > j2 && b03 < 2147483647L) {
                                        fo4 a6 = go4Var4.a();
                                        a6.i = (int) b03;
                                        go4 go4Var5 = new go4(a6);
                                        pzb a7 = qzbVar2.a();
                                        a7.g = go4Var5;
                                        qzbVar2 = new qzb(a7);
                                    }
                                }
                                int i76 = qzbVar2.b;
                                long j28 = qzbVar2.c;
                                go4 go4Var6 = qzbVar2.g;
                                oo5 oo5Var7 = qzbVar2.j;
                                oo5Var3 = qzbVar2.i;
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long b04 = hac.b0(j10, 1000000L, j28, roundingMode);
                                int[] e4 = ine.e(arrayList4);
                                if (oo5Var3 != null) {
                                    if (!z3) {
                                        hac.a0(jArr4, j28);
                                    }
                                    zzbVar = new zzb(qzbVar2, jArr16, iArr12, i19, jArr4, iArr5, e4, z9, b04, i20);
                                } else {
                                    long[] jArr17 = jArr4;
                                    int i77 = oo5Var3.b;
                                    if (z3) {
                                        oo5Var7.getClass();
                                        if (i77 == 1 && oo5Var3.a(0) == j2) {
                                            b02 = hac.b0(j10 - oo5Var7.a(0), 1000000L, qzbVar2.c, roundingMode);
                                        } else {
                                            long j29 = j2;
                                            for (int i78 = 0; i78 < i77; i78++) {
                                                if (oo5Var7.a(i78) != -1) {
                                                    j29 = oo5Var3.a(i78) + j29;
                                                }
                                            }
                                            b02 = hac.b0(j29, 1000000L, qzbVar2.d, RoundingMode.DOWN);
                                        }
                                        zzbVar = new zzb(qzbVar2, jArr16, iArr12, i19, jArr17, iArr5, e4, z9, b02, i20);
                                    } else {
                                        if (i77 == 1 && i76 == 1 && jArr17.length >= 2) {
                                            oo5Var7.getClass();
                                            long a8 = oo5Var7.a(0);
                                            j13 = -1;
                                            long b05 = a8 + hac.b0(oo5Var3.a(0), qzbVar2.c, qzbVar2.d, roundingMode);
                                            int length3 = jArr17.length - 1;
                                            int i79 = hac.i(4, 0, length3);
                                            int i80 = hac.i(jArr17.length - 4, 0, length3);
                                            if (jArr17[0] <= a8 && a8 < jArr17[i79] && jArr17[i80] < b05 && b05 <= j10 + 2) {
                                                long max2 = Math.max(j2, j10 - b05);
                                                long b06 = hac.b0(a8 - jArr17[0], go4Var6.P, qzbVar2.c, roundingMode);
                                                long b07 = hac.b0(max2, go4Var6.P, qzbVar2.c, roundingMode);
                                                if ((b06 != j2 || b07 != j2) && b06 <= 2147483647L && b07 <= 2147483647L) {
                                                    au4Var.a = (int) b06;
                                                    au4Var.b = (int) b07;
                                                    hac.a0(jArr17, j28);
                                                    zzbVar = new zzb(qzbVar2, jArr16, iArr12, i19, jArr17, iArr5, e4, z9, hac.b0(oo5Var3.a(0), 1000000L, qzbVar2.d, roundingMode), i20);
                                                }
                                            }
                                            i21 = i20;
                                            i22 = 1;
                                        } else {
                                            i21 = i20;
                                            j13 = -1;
                                            i22 = 1;
                                        }
                                        if (i77 == i22 && oo5Var3.a(0) == 0) {
                                            oo5Var7.getClass();
                                            long a9 = oo5Var7.a(0);
                                            for (int i81 = 0; i81 < jArr17.length; i81++) {
                                                jArr17[i81] = hac.b0(jArr17[i81] - a9, 1000000L, qzbVar2.c, RoundingMode.DOWN);
                                            }
                                            zzbVar = new zzb(qzbVar2, jArr16, iArr12, i19, jArr17, iArr5, e4, z9, hac.b0(j10 - a9, 1000000L, qzbVar2.c, RoundingMode.DOWN), i21);
                                        } else {
                                            long[] jArr18 = jArr17;
                                            long[] jArr19 = jArr16;
                                            int[] iArr13 = iArr5;
                                            int i82 = i21;
                                            boolean z11 = i76 == 1;
                                            int[] iArr14 = new int[i77];
                                            int[] iArr15 = new int[i77];
                                            oo5Var7.getClass();
                                            int i83 = 0;
                                            int i84 = 0;
                                            int i85 = 0;
                                            boolean z12 = false;
                                            while (i85 < i77) {
                                                int[] iArr16 = iArr13;
                                                long a10 = oo5Var7.a(i85);
                                                if (a10 != j13) {
                                                    i24 = i85;
                                                    boolean z13 = z12;
                                                    long b08 = hac.b0(oo5Var3.a(i85), qzbVar2.c, qzbVar2.d, RoundingMode.DOWN) + a10;
                                                    oo5Var4 = oo5Var3;
                                                    iArr14[i24] = hac.f(jArr18, a10, true);
                                                    int b2 = hac.b(jArr18, b08, z11);
                                                    z7 = z11;
                                                    int i86 = b2 - 1;
                                                    int i87 = 0;
                                                    for (int i88 = b2; i88 < jArr18.length; i88++) {
                                                        if (jArr18[i88] >= b08) {
                                                            i87++;
                                                            if (i87 > go4Var6.v) {
                                                                break;
                                                            }
                                                        } else {
                                                            i86 = i88;
                                                        }
                                                    }
                                                    iArr15[i24] = i86 + 1;
                                                    int i89 = iArr14[i24];
                                                    while (true) {
                                                        i25 = iArr14[i24];
                                                        if (i25 <= 0 || (iArr16[i25] & 1) != 0) {
                                                            break;
                                                        }
                                                        iArr14[i24] = i25 - 1;
                                                    }
                                                    if (i25 == 0 && (iArr16[0] & 1) == 0) {
                                                        iArr14[i24] = i89;
                                                        while (true) {
                                                            int i90 = iArr14[i24];
                                                            if (i90 >= iArr15[i24] || (iArr16[i90] & 1) != 0) {
                                                                break;
                                                            }
                                                            iArr14[i24] = i90 + 1;
                                                        }
                                                    }
                                                    int i91 = iArr15[i24];
                                                    int i92 = iArr14[i24];
                                                    int i93 = (i91 - i92) + i83;
                                                    z12 = z13 | (i84 != i92);
                                                    i84 = i91;
                                                    i83 = i93;
                                                } else {
                                                    z7 = z11;
                                                    oo5Var4 = oo5Var3;
                                                    i24 = i85;
                                                }
                                                i85 = i24 + 1;
                                                oo5Var3 = oo5Var4;
                                                z11 = z7;
                                                iArr13 = iArr16;
                                            }
                                            oo5 oo5Var8 = oo5Var3;
                                            int[] iArr17 = iArr13;
                                            boolean z14 = z12 | (i83 != i82);
                                            if (z14) {
                                                arrayList5 = new ArrayList();
                                                iArr7 = new int[i83];
                                                iArr6 = new int[i83];
                                                jArr7 = new long[i83];
                                                i23 = 0;
                                            } else {
                                                jArr7 = jArr19;
                                                iArr6 = iArr12;
                                                arrayList5 = arrayList4;
                                                i23 = i19;
                                                iArr7 = iArr17;
                                            }
                                            long[] jArr20 = new long[i83];
                                            int i94 = i23;
                                            int i95 = 0;
                                            boolean z15 = false;
                                            int i96 = 0;
                                            long j30 = 0;
                                            while (i95 < i77) {
                                                long a11 = oo5Var7.a(i95);
                                                int i97 = i77;
                                                int i98 = iArr14[i95];
                                                long[] jArr21 = jArr18;
                                                int i99 = iArr15[i95];
                                                if (z14) {
                                                    jArr9 = jArr20;
                                                    int i100 = i99 - i98;
                                                    System.arraycopy(jArr19, i98, jArr7, i96, i100);
                                                    System.arraycopy(iArr12, i98, iArr6, i96, i100);
                                                    jArr8 = jArr19;
                                                    iArr8 = iArr17;
                                                    System.arraycopy(iArr8, i98, iArr7, i96, i100);
                                                } else {
                                                    jArr8 = jArr19;
                                                    jArr9 = jArr20;
                                                    iArr8 = iArr17;
                                                }
                                                int i101 = i94;
                                                while (i98 < i99) {
                                                    int i102 = i98;
                                                    int[] iArr18 = iArr8;
                                                    long j31 = qzbVar2.d;
                                                    RoundingMode roundingMode2 = RoundingMode.DOWN;
                                                    long b09 = hac.b0(j30, 1000000L, j31, roundingMode2);
                                                    long b010 = hac.b0(jArr21[i102] - a11, 1000000L, qzbVar2.c, roundingMode2);
                                                    if (b010 < 0) {
                                                        z15 = true;
                                                    }
                                                    jArr9[i96] = b09 + b010;
                                                    if (z14 && iArr6[i96] > i101) {
                                                        i101 = iArr12[i102];
                                                    }
                                                    if (z14 && !z9 && (iArr7[i96] & 1) != 0) {
                                                        arrayList5.add(Integer.valueOf(i96));
                                                    }
                                                    i96++;
                                                    i98 = i102 + 1;
                                                    iArr8 = iArr18;
                                                }
                                                iArr17 = iArr8;
                                                oo5 oo5Var9 = oo5Var8;
                                                j30 = oo5Var9.a(i95) + j30;
                                                i95++;
                                                oo5Var8 = oo5Var9;
                                                i94 = i101;
                                                i77 = i97;
                                                jArr20 = jArr9;
                                                jArr19 = jArr8;
                                                jArr18 = jArr21;
                                            }
                                            long[] jArr22 = jArr20;
                                            long b011 = hac.b0(j30, 1000000L, qzbVar2.d, RoundingMode.DOWN);
                                            if (z15) {
                                                fo4 a12 = go4Var6.a();
                                                a12.y = true;
                                                go4 go4Var7 = new go4(a12);
                                                pzb a13 = qzbVar2.a();
                                                a13.g = go4Var7;
                                                qzbVar2 = new qzb(a13);
                                            }
                                            zzbVar = new zzb(qzbVar2, jArr7, iArr6, i94, jArr22, iArr7, ine.e(arrayList5), z9, b011, jArr7.length);
                                        }
                                    }
                                }
                                arrayList6 = arrayList3;
                                zzbVar2 = zzbVar;
                            } else {
                                yw7Var = null;
                            }
                        } else {
                            yw7Var = yw7Var11;
                            i14 = 0;
                        }
                        i15 = -1;
                        int a52 = vz0Var.a();
                        String str62 = go4Var4.t;
                        if (a52 == -1) {
                        }
                        ArrayList arrayList92 = new ArrayList();
                        if (yw7Var != null) {
                        }
                        if (z5) {
                        }
                        long[] jArr162 = jArr5;
                        int[] iArr122 = iArr3;
                        j12 = qzbVar2.f;
                        if (j12 > j2) {
                        }
                        int i762 = qzbVar2.b;
                        long j282 = qzbVar2.c;
                        go4 go4Var62 = qzbVar2.g;
                        oo5 oo5Var72 = qzbVar2.j;
                        oo5Var3 = qzbVar2.i;
                        RoundingMode roundingMode3 = RoundingMode.DOWN;
                        long b042 = hac.b0(j10, 1000000L, j282, roundingMode3);
                        int[] e42 = ine.e(arrayList4);
                        if (oo5Var3 != null) {
                        }
                        arrayList6 = arrayList3;
                        zzbVar2 = zzbVar;
                    }
                    arrayList6.add(zzbVar2);
                }
            }
            i26 = i + 1;
            oh7Var3 = oh7Var;
            arrayList8 = arrayList6;
            arrayList7 = arrayList;
        }
        return arrayList8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01af, code lost:
    
        if (r12 != 1684108385) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01b1, code lost:
    
        r8 = r10;
        r9 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b3, code lost:
    
        r1.O(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01a8, code lost:
    
        r3 = r1.w(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x019c, code lost:
    
        r0 = r1.w(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01b9, code lost:
    
        if (r0 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01bb, code lost:
    
        if (r3 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01be, code lost:
    
        if (r8 == (-1)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01c0, code lost:
    
        r1.N(r8);
        r1.O(16);
        r8 = new nr5(r0, r3, r1.w(r9 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x020c, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0296, code lost:
    
        ncd.b("MetadataUtil", "Skipped unknown metadata entry: ".concat(eu5.e(r10)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02a1, code lost:
    
        r1.N(r13);
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01d6, code lost:
    
        r3 = 16777215 & r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01dd, code lost:
    
        if (r3 != 6516084) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01df, code lost:
    
        r0 = r1.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01e7, code lost:
    
        if (r1.m() != 1684108385) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01e9, code lost:
    
        r1.O(8);
        r0 = r1.w(r0 - 16);
        r8 = new wn2("und", r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01ff, code lost:
    
        ncd.f("MetadataUtil", "Failed to parse comment attribute: ".concat(eu5.e(r10)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0212, code lost:
    
        if (r3 == 7233901) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0217, code lost:
    
        if (r3 == 7631467) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x021c, code lost:
    
        if (r3 == 6516589) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0221, code lost:
    
        if (r3 == 7828084) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0226, code lost:
    
        if (r3 != 6578553) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0228, code lost:
    
        r8 = ere.e(r10, r1, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0233, code lost:
    
        if (r3 != 4280916) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0235, code lost:
    
        r8 = ere.e(r10, r1, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        r1.N(r7);
        r7 = r7 + r13;
        r1.O(r0);
        r6 = new java.util.ArrayList();
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0240, code lost:
    
        if (r3 != 7630703) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0242, code lost:
    
        r8 = ere.e(r10, r1, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x024d, code lost:
    
        if (r3 != 6384738) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x024f, code lost:
    
        r8 = ere.e(r10, r1, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0259, code lost:
    
        if (r3 != 7108978) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x025b, code lost:
    
        r8 = ere.e(r10, r1, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        r13 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0265, code lost:
    
        if (r3 != 6776174) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0267, code lost:
    
        r8 = ere.e(r10, r1, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x026f, code lost:
    
        if (r3 != 6779504) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0271, code lost:
    
        r8 = ere.e(r10, r1, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x027b, code lost:
    
        if (r3 != 7173742) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x027d, code lost:
    
        r8 = ere.e(r10, r1, "MVNM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0287, code lost:
    
        if (r3 != 7173737) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        if (r13 >= r7) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0289, code lost:
    
        r0 = ere.d(r10, "MVIN", r1, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0291, code lost:
    
        r1.N(r13);
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02a6, code lost:
    
        r8 = ere.e(r10, r1, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02ad, code lost:
    
        r8 = ere.e(r10, r1, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02c1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02c2, code lost:
    
        r1.N(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02c5, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        r10 = r1.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02ca, code lost:
    
        if (r6.isEmpty() != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02cc, code lost:
    
        r12 = new nf7(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (r10 >= r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        ncd.f("MetadataUtil", "Skipped empty metadata entry");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x02b6, code lost:
    
        if (r8 == null) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x02b8, code lost:
    
        r6.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x02bb, code lost:
    
        r0 = 8;
        r11 = 1;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        r13 = r13 + r10;
        r10 = r1.m();
        r8 = (r10 >> 24) & nm7.d4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if ((r13 - r1.b) >= r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        ncd.f("MetadataUtil", "Skipped empty metadata entry: ".concat(eu5.e(r10)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        r1.N(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
    
        if (r8 == 169) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0091, code lost:
    
        if (r8 == 253) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0096, code lost:
    
        if (r10 != 1735291493) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0098, code lost:
    
        r3 = ul5.a(ere.c(r1) - r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
    
        if (r3 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a3, code lost:
    
        r8 = new ojb("TCON", r12, mo5.u(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x02b3, code lost:
    
        r1.N(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ae, code lost:
    
        ncd.f("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f0, code lost:
    
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b7, code lost:
    
        if (r10 != 1684632427) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
    
        r8 = ere.b(r10, r1, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c4, code lost:
    
        if (r10 != 1953655662) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c6, code lost:
    
        r8 = ere.b(r10, r1, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d1, code lost:
    
        if (r10 != 1953329263) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d3, code lost:
    
        r8 = ere.d(r10, "TBPM", r1, r11, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00df, code lost:
    
        if (r10 != 1668311404) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e1, code lost:
    
        r8 = ere.d(r10, "TCMP", r1, r11, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ec, code lost:
    
        if (r10 != 1668249202) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ee, code lost:
    
        if (r25 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f3, code lost:
    
        r8 = ere.a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fd, code lost:
    
        if (r10 != 1631670868) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ff, code lost:
    
        r8 = ere.e(r10, r1, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010a, code lost:
    
        if (r10 != 1936682605) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010c, code lost:
    
        r8 = ere.e(r10, r1, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0117, code lost:
    
        if (r10 != 1936679276) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0119, code lost:
    
        r8 = ere.e(r10, r1, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0124, code lost:
    
        if (r10 != 1936679282) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0126, code lost:
    
        r8 = ere.e(r10, r1, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0131, code lost:
    
        if (r10 != 1936679265) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0133, code lost:
    
        r8 = ere.e(r10, r1, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x013e, code lost:
    
        if (r10 != 1936679791) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0140, code lost:
    
        r8 = ere.e(r10, r1, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x014b, code lost:
    
        if (r10 != 1920233063) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x014d, code lost:
    
        r8 = ere.d(r10, "ITUNESADVISORY", r1, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0159, code lost:
    
        if (r10 != 1885823344) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015b, code lost:
    
        r8 = ere.d(r10, "ITUNESGAPLESS", r1, false, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0167, code lost:
    
        if (r10 != 1936683886) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0169, code lost:
    
        r8 = ere.e(r10, r1, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0174, code lost:
    
        if (r10 != 1953919848) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0176, code lost:
    
        r8 = ere.e(r10, r1, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0181, code lost:
    
        if (r10 != 757935405) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0183, code lost:
    
        r0 = r12;
        r3 = r0;
        r8 = -1;
        r9 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0187, code lost:
    
        r10 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0189, code lost:
    
        if (r10 >= r13) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x018b, code lost:
    
        r14 = r1.m();
        r12 = r1.m();
        r1.O(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x019a, code lost:
    
        if (r12 != 1835360622) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a6, code lost:
    
        if (r12 != 1851878757) goto L252;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:212:0x036a  */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static nf7 k(ph7 ph7Var, boolean z) {
        int i;
        nf7 nf7Var;
        nf7 b;
        nf7 nf7Var2;
        nf7 nf7Var3;
        int i2;
        yw7 yw7Var = ph7Var.e;
        int i3 = 8;
        yw7Var.N(8);
        nf7 nf7Var4 = new nf7(new lf7[0]);
        while (yw7Var.a() >= i3) {
            int i4 = yw7Var.b;
            int m = yw7Var.m();
            int m2 = yw7Var.m();
            boolean z2 = true;
            String str = null;
            if (m2 == 1835365473) {
                yw7Var.N(i4);
                int i5 = i4 + m;
                yw7Var.O(i3);
                a(yw7Var);
                while (true) {
                    int i6 = yw7Var.b;
                    if (i6 >= i5) {
                        break;
                    }
                    int m3 = yw7Var.m();
                    if (yw7Var.m() == 1768715124) {
                        break;
                    }
                    yw7Var.N(i6 + m3);
                    i3 = 8;
                    z2 = true;
                    str = null;
                }
                nf7 nf7Var5 = null;
                nf7Var4 = nf7Var4.b(nf7Var5);
                i = 8;
            } else {
                if (m2 == 1936553057) {
                    yw7Var.N(i4);
                    int i7 = i4 + m;
                    yw7Var.O(12);
                    while (true) {
                        int i8 = yw7Var.b;
                        if (i8 >= i7) {
                            i = 8;
                            break;
                        }
                        int m4 = yw7Var.m();
                        if (yw7Var.m() != 1935766900) {
                            yw7Var.N(i8 + m4);
                        } else if (m4 < 16) {
                            nf7Var3 = null;
                            i = 8;
                        } else {
                            yw7Var.O(4);
                            int i9 = -1;
                            int i10 = 0;
                            for (int i11 = 0; i11 < 2; i11++) {
                                int A = yw7Var.A();
                                int A2 = yw7Var.A();
                                if (A == 0) {
                                    i9 = A2;
                                } else if (A == 1) {
                                    i10 = A2;
                                }
                            }
                            if (i9 == 12) {
                                i2 = nm7.O3;
                            } else if (i9 == 13) {
                                i2 = nm7.E1;
                            } else if (i9 != 21) {
                                i2 = -2147483647;
                            } else {
                                i = 8;
                                if (yw7Var.a() >= 8 && yw7Var.b + 8 <= i7) {
                                    int m5 = yw7Var.m();
                                    int m6 = yw7Var.m();
                                    if (m5 >= 12 && m6 == 1936877170) {
                                        i2 = yw7Var.B();
                                        if (i2 != -2147483647) {
                                            nf7Var3 = new nf7(new zla(i2, i10));
                                        }
                                    }
                                }
                                i2 = -2147483647;
                                if (i2 != -2147483647) {
                                }
                            }
                            i = 8;
                            if (i2 != -2147483647) {
                            }
                        }
                    }
                    nf7Var3 = null;
                    b = nf7Var4.b(nf7Var3);
                } else {
                    i = 8;
                    if (m2 == -1451722374) {
                        short x = yw7Var.x();
                        yw7Var.O(2);
                        String y = yw7Var.y(x, StandardCharsets.UTF_8);
                        int max = Math.max(y.lastIndexOf(43), y.lastIndexOf(45));
                        try {
                            nf7Var2 = new nf7(new th7(Float.parseFloat(y.substring(0, max)), Float.parseFloat(y.substring(max, y.length() - 1))));
                        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                            nf7Var2 = null;
                        }
                        b = nf7Var4.b(nf7Var2);
                    } else if (m2 == 1667788908) {
                        try {
                            yw7Var.O(5);
                            int m7 = yw7Var.m();
                            ArrayList arrayList = new ArrayList();
                            for (int i12 = 0; i12 < m7; i12++) {
                                long u = yw7Var.u() / 10000;
                                if (u < 0) {
                                    u = -9223372036854775807L;
                                }
                                nf7Var = null;
                                try {
                                    arrayList.add(new sk1(u, -9223372036854775807L, false, new sy5(null, yw7Var.y(yw7Var.A(), StandardCharsets.UTF_8))));
                                } catch (IndexOutOfBoundsException unused2) {
                                }
                            }
                            nf7Var = null;
                            if (!arrayList.isEmpty()) {
                                nf7Var = new nf7(arrayList);
                            }
                        } catch (IndexOutOfBoundsException unused3) {
                            nf7Var = null;
                        }
                        b = nf7Var4.b(nf7Var);
                    }
                }
                nf7Var4 = b;
            }
            yw7Var.N(i4 + m);
            i3 = i;
        }
        return nf7Var4;
    }
}
