package w3;

import a3.y;
import android.util.Pair;
import b2.o0;
import b2.p0;
import b2.r0;
import b2.s;
import b2.s0;
import c3.w;
import c3.x;
import com.google.android.gms.internal.vision.e2;
import e2.a0;
import e2.d0;
import e2.v;
import e9.a1;
import e9.f0;
import e9.i0;
import j$.util.Objects;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k2.g0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;
import s4.g1;
import u2.x0;
import v7.x7;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public abstract class c {
    public static final byte[] a;

    static {
        String str = d0.a;
        a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(v vVar) {
        int i10 = vVar.b;
        vVar.K(4);
        if (vVar.j() != 1751411826) {
            i10 += 4;
        }
        vVar.J(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:318:0x059f, code lost:
    
        if (r14 == 2) goto L272;
     */
    /* JADX WARN: Removed duplicated region for block: B:227:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0837 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x09e7 A[LOOP:18: B:458:0x09e7->B:468:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0a24  */
    /* JADX WARN: Removed duplicated region for block: B:470:? A[LOOP:17: B:453:0x09d0->B:470:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:471:? A[LOOP:16: B:450:0x09c8->B:471:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:472:? A[LOOP:15: B:446:0x09ae->B:472:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(v vVar, int i10, int i11, int i12, int i13, String str, boolean z10, b2.o oVar, a0 a0Var, int i14) {
        int i15;
        int y3;
        int j3;
        int i16;
        int i17;
        b2.o oVar2;
        String str2;
        String str3;
        List list;
        int i18;
        int i19;
        int i20;
        String str4;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        x0 x0Var;
        String str5;
        String str6;
        x0 x0Var2;
        int i26;
        int i27;
        int i28;
        int i29;
        v vVar2;
        String v;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        boolean h;
        int i37;
        int i38;
        int i39;
        int i40;
        boolean z11;
        int i41;
        boolean h10;
        int i42;
        boolean z12;
        String str7;
        String format;
        int i43;
        v vVar3 = vVar;
        int i44 = i10;
        int i45 = i12;
        int[] iArr = c3.b.f;
        int[] iArr2 = c3.b.d;
        vVar3.J(i11 + 16);
        if (z10) {
            i15 = vVar3.D();
            vVar3.K(6);
        } else {
            vVar3.K(8);
            i15 = 0;
        }
        char c10 = 0;
        if (i15 == 0 || i15 == 1) {
            int D = vVar3.D();
            vVar3.K(6);
            y3 = vVar3.y();
            vVar3.J(vVar3.b - 4);
            j3 = vVar3.j();
            if (i15 == 1) {
                vVar3.K(16);
            }
            i16 = D;
            i17 = -1;
        } else {
            if (i15 != 2) {
                return;
            }
            vVar3.K(16);
            int round = (int) Math.round(Double.longBitsToDouble(vVar3.r()));
            int B = vVar3.B();
            vVar3.K(4);
            int B2 = vVar3.B();
            int B3 = vVar3.B();
            boolean z13 = (B3 & 1) != 0;
            boolean z14 = (B3 & 2) != 0;
            if (z13) {
                if (B2 == 32) {
                    i43 = 4;
                    vVar3.K(8);
                    y3 = round;
                    i16 = B;
                    i17 = i43;
                    j3 = 0;
                }
                i43 = -1;
                vVar3.K(8);
                y3 = round;
                i16 = B;
                i17 = i43;
                j3 = 0;
            } else {
                if (B2 == 8) {
                    i43 = 3;
                } else if (B2 == 16) {
                    i43 = z14 ? TLObject.FLAG_28 : 2;
                } else if (B2 == 24) {
                    i43 = z14 ? 1342177280 : 21;
                } else {
                    if (B2 == 32) {
                        i43 = z14 ? 1610612736 : 22;
                    }
                    i43 = -1;
                }
                vVar3.K(8);
                y3 = round;
                i16 = B;
                i17 = i43;
                j3 = 0;
            }
        }
        if (i44 == 1767992678) {
            i16 = -1;
            y3 = -1;
        } else if (i44 == 1935764850) {
            i16 = 1;
            y3 = 8000;
        } else if (i44 == 1935767394) {
            i16 = 1;
            y3 = androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE;
        }
        int i46 = vVar3.b;
        if (i44 == 1701733217) {
            Pair h11 = h(vVar3, i11, i45);
            if (h11 != null) {
                i44 = ((Integer) h11.first).intValue();
                oVar2 = oVar == null ? null : oVar.a(((p) h11.second).b);
                ((p[]) a0Var.c)[i14] = (p) h11.second;
            } else {
                oVar2 = oVar;
            }
            vVar3.J(i46);
        } else {
            oVar2 = oVar;
        }
        String str8 = "audio/mhm1";
        if (i44 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i44 == 1700998451) {
            str2 = "audio/eac3";
        } else if (i44 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i44 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (i44 == 1685353320 || i44 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (i44 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i44 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i44 == 1935764850) {
            str2 = "audio/3gpp";
        } else if (i44 == 1935767394) {
            str2 = "audio/amr-wb";
        } else {
            if (i44 != 1936684916) {
                if (i44 == 1953984371) {
                    str2 = "audio/raw";
                    i17 = TLObject.FLAG_28;
                } else if (i44 != 1819304813) {
                    str2 = (i44 == 778924082 || i44 == 778924083) ? "audio/mpeg" : i44 == 1835557169 ? "audio/mha1" : i44 == 1835560241 ? "audio/mhm1" : i44 == 1634492771 ? "audio/alac" : i44 == 1634492791 ? "audio/g711-alaw" : i44 == 1970037111 ? "audio/g711-mlaw" : i44 == 1332770163 ? "audio/opus" : i44 == 1716281667 ? "audio/flac" : i44 == 1835823201 ? "audio/true-hd" : i44 == 1767992678 ? "audio/iamf" : null;
                } else if (i17 != -1) {
                    str2 = "audio/raw";
                }
            }
            str2 = "audio/raw";
            i17 = 2;
        }
        x0 x0Var3 = null;
        String str9 = null;
        List list2 = null;
        y yVar = null;
        while (i46 - i11 < i45) {
            vVar3.J(i46);
            int j10 = vVar3.j();
            int i47 = i17;
            c3.b.c("childAtomSize must be positive", j10 > 0);
            int j11 = vVar3.j();
            String str10 = str9;
            if (j11 == 1835557187) {
                vVar3.J(i46 + 8);
                vVar3.K(1);
                int x10 = vVar3.x();
                vVar3.K(1);
                if (Objects.equals(str2, str8)) {
                    Object[] objArr = new Object[1];
                    objArr[c10] = Integer.valueOf(x10);
                    format = String.format("mhm1.%02X", objArr);
                } else {
                    Object[] objArr2 = new Object[1];
                    objArr2[c10] = Integer.valueOf(x10);
                    format = String.format("mha1.%02X", objArr2);
                }
                int D2 = vVar3.D();
                byte[] bArr = new byte[D2];
                String str11 = format;
                vVar3.h(0, D2, bArr);
                list2 = list2 == null ? i0.z(bArr) : i0.A(bArr, (byte[]) list2.get(0));
                x0Var = x0Var3;
                str9 = str11;
                str6 = str2;
                i25 = i46;
                str4 = str8;
                i17 = i47;
            } else if (j11 == 1835557200) {
                vVar3.J(i46 + 8);
                int x11 = vVar3.x();
                if (x11 > 0) {
                    byte[] bArr2 = new byte[x11];
                    vVar3.h(0, x11, bArr2);
                    list2 = list2 == null ? i0.z(bArr2) : i0.A((byte[]) list2.get(0), bArr2);
                }
                x0Var = x0Var3;
                str6 = str2;
                i25 = i46;
                str4 = str8;
                i17 = i47;
                str9 = str10;
            } else {
                if (j11 == 1702061171) {
                    str3 = str2;
                    list = list2;
                    i18 = j10;
                    i19 = i46;
                    i20 = i16;
                    str4 = str8;
                    i21 = i44;
                    i22 = y3;
                    i23 = 1702061171;
                } else if (z10 && j11 == 2002876005) {
                    str3 = str2;
                    list = list2;
                    i18 = j10;
                    i19 = i46;
                    i20 = i16;
                    str4 = str8;
                    i23 = 1702061171;
                    i21 = i44;
                    i22 = y3;
                } else if (j11 == 1651798644) {
                    vVar3.J(i46 + 8);
                    vVar3.K(4);
                    y yVar2 = new y(vVar3.z(), vVar3.z());
                    x0Var = x0Var3;
                    str6 = str2;
                    i25 = i46;
                    yVar = yVar2;
                    str4 = str8;
                    i17 = i47;
                    str9 = str10;
                    j10 = j10;
                    list2 = list2;
                } else {
                    List list3 = list2;
                    if (j11 == 1684103987) {
                        vVar3.J(i46 + 8);
                        String num = Integer.toString(i13);
                        a4.h hVar = new a4.h();
                        hVar.p(vVar3);
                        int i48 = iArr2[hVar.i(2)];
                        hVar.t(8);
                        int i49 = iArr[hVar.i(3)];
                        if (hVar.i(1) != 0) {
                            i49++;
                        }
                        int i50 = c3.b.g[hVar.i(5)] * MediaDataController.MAX_STYLE_RUNS_COUNT;
                        hVar.c();
                        vVar3.J(hVar.f());
                        b2.r rVar = new b2.r();
                        rVar.a = num;
                        rVar.q = r0.n("audio/ac3");
                        rVar.I = i49;
                        rVar.J = i48;
                        rVar.u = oVar2;
                        rVar.d = str;
                        rVar.h = i50;
                        rVar.i = i50;
                        a0Var.d = new s(rVar);
                        str6 = str2;
                        i26 = i46;
                        i27 = i16;
                        str4 = str8;
                    } else if (j11 == 1684366131) {
                        vVar3.J(i46 + 8);
                        String num2 = Integer.toString(i13);
                        a4.h hVar2 = new a4.h();
                        hVar2.p(vVar3);
                        int i51 = hVar2.i(13) * MediaDataController.MAX_STYLE_RUNS_COUNT;
                        hVar2.t(3);
                        int i52 = iArr2[hVar2.i(2)];
                        hVar2.t(10);
                        int i53 = iArr[hVar2.i(3)];
                        if (hVar2.i(1) != 0) {
                            i53++;
                        }
                        int i54 = i53;
                        hVar2.t(3);
                        int i55 = hVar2.i(4);
                        hVar2.t(1);
                        if (i55 > 0) {
                            str6 = str2;
                            hVar2.t(6);
                            if (hVar2.i(1) != 0) {
                                i54 += 2;
                            }
                            hVar2.t(1);
                        } else {
                            str6 = str2;
                        }
                        int i56 = i54;
                        str4 = str8;
                        if (hVar2.b() > 7) {
                            hVar2.t(7);
                            if (hVar2.i(1) != 0) {
                                str7 = "audio/eac3-joc";
                                hVar2.c();
                                vVar3.J(hVar2.f());
                                b2.r rVar2 = new b2.r();
                                rVar2.a = num2;
                                rVar2.q = r0.n(str7);
                                rVar2.I = i56;
                                rVar2.J = i52;
                                rVar2.u = oVar2;
                                rVar2.d = str;
                                rVar2.i = i51;
                                a0Var.d = new s(rVar2);
                                i26 = i46;
                                i27 = i16;
                            }
                        }
                        str7 = "audio/eac3";
                        hVar2.c();
                        vVar3.J(hVar2.f());
                        b2.r rVar22 = new b2.r();
                        rVar22.a = num2;
                        rVar22.q = r0.n(str7);
                        rVar22.I = i56;
                        rVar22.J = i52;
                        rVar22.u = oVar2;
                        rVar22.d = str;
                        rVar22.i = i51;
                        a0Var.d = new s(rVar22);
                        i26 = i46;
                        i27 = i16;
                    } else {
                        str6 = str2;
                        str4 = str8;
                        if (j11 == 1684103988) {
                            vVar3.J(i46 + 8);
                            String num3 = Integer.toString(i13);
                            a4.h hVar3 = new a4.h();
                            hVar3.p(vVar3);
                            int b10 = hVar3.b();
                            int i57 = hVar3.i(3);
                            if (i57 > 1) {
                                throw s0.c("Unsupported AC-4 DSI version: " + i57);
                            }
                            int i58 = hVar3.i(7);
                            int i59 = hVar3.h() ? 48000 : 44100;
                            hVar3.t(4);
                            int i60 = hVar3.i(9);
                            if (i58 > 1) {
                                if (i57 == 0) {
                                    throw s0.c("Invalid AC-4 DSI version: " + i57);
                                }
                                if (hVar3.h()) {
                                    hVar3.t(16);
                                    if (hVar3.h()) {
                                        hVar3.t(128);
                                    }
                                }
                            }
                            if (i57 == 1) {
                                i30 = i58;
                                if (hVar3.b() < 66) {
                                    throw s0.c("Invalid AC-4 DSI bitrate.");
                                }
                                hVar3.t(66);
                                hVar3.c();
                            } else {
                                i30 = i58;
                            }
                            c3.c cVar = new c3.c();
                            cVar.a = true;
                            cVar.b = -1;
                            cVar.c = -1;
                            cVar.d = true;
                            i26 = i46;
                            cVar.e = 2;
                            cVar.f = 1;
                            cVar.g = 0;
                            int i61 = 0;
                            while (i61 < i60) {
                                if (i57 == 0) {
                                    h = hVar3.h();
                                    i33 = y3;
                                    i37 = hVar3.i(5);
                                    i38 = hVar3.i(5);
                                    i39 = 0;
                                    i40 = 0;
                                    z11 = false;
                                } else {
                                    int i62 = i60;
                                    int i63 = hVar3.i(8);
                                    i33 = y3;
                                    int i64 = hVar3.i(8);
                                    int i65 = i64 == 255 ? hVar3.i(16) + i64 : i64;
                                    if (i63 > 2) {
                                        hVar3.t(i65 * 8);
                                        i61++;
                                        i60 = i62;
                                        y3 = i33;
                                    } else {
                                        int b11 = (b10 - hVar3.b()) / 8;
                                        i37 = hVar3.i(5);
                                        z11 = i37 == 31;
                                        i38 = i63;
                                        i40 = b11;
                                        i39 = i65;
                                        h = false;
                                    }
                                }
                                cVar.f = i38;
                                i32 = i16;
                                if (h || z11 || i37 != 6) {
                                    i31 = i44;
                                    cVar.g = hVar3.i(3);
                                    if (hVar3.h()) {
                                        hVar3.t(5);
                                    }
                                    hVar3.t(2);
                                    if (i57 == 1 && (i38 == 1 || i38 == 2)) {
                                        hVar3.t(2);
                                    }
                                    hVar3.t(5);
                                    hVar3.t(10);
                                    if (i57 == 1) {
                                        if (i38 > 0) {
                                            cVar.a = hVar3.h();
                                        }
                                        if (cVar.a) {
                                            if (i38 != 1) {
                                                i42 = 2;
                                            }
                                            int i66 = hVar3.i(5);
                                            if (i66 >= 0 && i66 <= 15) {
                                                cVar.b = i66;
                                            }
                                            if (i66 < 11 || i66 > 14) {
                                                i42 = 2;
                                            } else {
                                                cVar.d = hVar3.h();
                                                i42 = 2;
                                                cVar.e = hVar3.i(2);
                                            }
                                            hVar3.t(24);
                                        } else {
                                            i42 = 2;
                                        }
                                        if (i38 == 1 || i38 == i42) {
                                            if (hVar3.h() && hVar3.h()) {
                                                hVar3.t(i42);
                                            }
                                            if (hVar3.h()) {
                                                hVar3.s();
                                                int i67 = 8;
                                                int i68 = hVar3.i(8);
                                                i41 = i38;
                                                int i69 = 0;
                                                while (i69 < i68) {
                                                    hVar3.t(i67);
                                                    i69++;
                                                    i67 = 8;
                                                }
                                                if (h && !z11) {
                                                    hVar3.s();
                                                    if (i37 == 0 || i37 == 1 || i37 == 2) {
                                                        if (i41 == 0) {
                                                            for (int i70 = 0; i70 < 2; i70++) {
                                                                c3.b.o(hVar3, cVar);
                                                            }
                                                        } else {
                                                            for (int i71 = 0; i71 < 2; i71++) {
                                                                c3.b.p(hVar3, cVar);
                                                            }
                                                        }
                                                    } else if (i37 == 3 || i37 == 4) {
                                                        if (i41 == 0) {
                                                            for (int i72 = 0; i72 < 3; i72++) {
                                                                c3.b.o(hVar3, cVar);
                                                            }
                                                        } else {
                                                            for (int i73 = 0; i73 < 3; i73++) {
                                                                c3.b.p(hVar3, cVar);
                                                            }
                                                        }
                                                    } else if (i37 != 5) {
                                                        int i74 = hVar3.i(7);
                                                        for (int i75 = 0; i75 < i74; i75++) {
                                                            hVar3.t(8);
                                                        }
                                                    } else if (i41 == 0) {
                                                        c3.b.o(hVar3, cVar);
                                                    } else {
                                                        int i76 = hVar3.i(3);
                                                        for (int i77 = 0; i77 < i76 + 2; i77++) {
                                                            c3.b.p(hVar3, cVar);
                                                        }
                                                    }
                                                } else if (i41 != 0) {
                                                    c3.b.o(hVar3, cVar);
                                                } else {
                                                    c3.b.p(hVar3, cVar);
                                                }
                                                hVar3.s();
                                                h10 = hVar3.h();
                                            }
                                        }
                                    }
                                    i41 = i38;
                                    if (h) {
                                    }
                                    if (i41 != 0) {
                                    }
                                    hVar3.s();
                                    h10 = hVar3.h();
                                } else {
                                    i31 = i44;
                                    i41 = i38;
                                    h10 = true;
                                }
                                if (h10) {
                                    int i78 = hVar3.i(7);
                                    for (int i79 = 0; i79 < i78; i79++) {
                                        hVar3.t(15);
                                    }
                                }
                                if (i41 > 0) {
                                    if (hVar3.h()) {
                                        if (hVar3.b() < 66) {
                                            z12 = false;
                                        } else {
                                            hVar3.t(66);
                                            z12 = true;
                                        }
                                        if (!z12) {
                                            throw s0.c("Can't parse bitrate DSI.");
                                        }
                                    }
                                    if (hVar3.h()) {
                                        hVar3.c();
                                        hVar3.u(hVar3.i(16));
                                        int i80 = hVar3.i(5);
                                        for (int i81 = 0; i81 < i80; i81++) {
                                            hVar3.t(3);
                                            hVar3.t(8);
                                        }
                                        hVar3.c();
                                        if (i57 == 1) {
                                            int b12 = ((b10 - hVar3.b()) / 8) - i40;
                                            if (i39 < b12) {
                                                throw s0.c("pres_bytes is smaller than presentation bytes read.");
                                            }
                                            hVar3.u(i39 - b12);
                                        }
                                        if (cVar.a && cVar.b == -1) {
                                            throw s0.c("Can't determine channel mode of presentation " + i61);
                                        }
                                        i34 = 12;
                                        if (cVar.a) {
                                            int i82 = cVar.b;
                                            boolean z15 = cVar.d;
                                            int i83 = cVar.e;
                                            switch (i82) {
                                                case 0:
                                                    i35 = 11;
                                                    i36 = 1;
                                                    break;
                                                case 1:
                                                    i35 = 11;
                                                    i36 = 2;
                                                    break;
                                                case 2:
                                                    i35 = 11;
                                                    i36 = 3;
                                                    break;
                                                case 3:
                                                    i35 = 11;
                                                    i36 = 5;
                                                    break;
                                                case 4:
                                                    i35 = 11;
                                                    i36 = 6;
                                                    break;
                                                case 5:
                                                case 7:
                                                case 9:
                                                    i35 = 11;
                                                    i36 = 7;
                                                    break;
                                                case 6:
                                                case 8:
                                                case 10:
                                                    i35 = 11;
                                                    i36 = 8;
                                                    break;
                                                case 11:
                                                    i35 = 11;
                                                    i36 = 11;
                                                    break;
                                                case 12:
                                                    i35 = 11;
                                                    i36 = 12;
                                                    break;
                                                case 13:
                                                    i35 = 11;
                                                    i36 = 13;
                                                    break;
                                                case 14:
                                                    i35 = 11;
                                                    i36 = 14;
                                                    break;
                                                case 15:
                                                    i35 = 11;
                                                    i36 = 24;
                                                    break;
                                                default:
                                                    i35 = 11;
                                                    i36 = -1;
                                                    break;
                                            }
                                            if (i82 == i35 || i82 == 12 || i82 == 13 || i82 == 14) {
                                                if (!z15) {
                                                    i36 -= 2;
                                                }
                                                if (i83 == 0) {
                                                    i36 -= 4;
                                                } else if (i83 == 1) {
                                                    i36 -= 2;
                                                }
                                            }
                                            i34 = i36;
                                        } else {
                                            int i84 = cVar.c;
                                            if (i84 > 0) {
                                                int i85 = i84 + 1;
                                                if (cVar.g == 4 && i85 == 17) {
                                                    i85 = 21;
                                                }
                                                i34 = i85;
                                            } else {
                                                int i86 = cVar.g;
                                                if (i86 != 0) {
                                                    if (i86 == 1) {
                                                        i34 = 6;
                                                    } else if (i86 == 2) {
                                                        i34 = 8;
                                                    } else if (i86 == 3) {
                                                        i34 = 10;
                                                    } else if (i86 != 4) {
                                                        e2.a.n("Ac4Util", "AC-4 level " + cVar.g + " has not been defined.");
                                                    }
                                                }
                                                i34 = 2;
                                            }
                                        }
                                        if (i34 <= 0) {
                                            throw s0.c("Cannot determine channel count of presentation.");
                                        }
                                        Object[] objArr3 = {Integer.valueOf(i30), Integer.valueOf(cVar.f), Integer.valueOf(cVar.g)};
                                        String str12 = d0.a;
                                        String format2 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr3);
                                        b2.r rVar3 = new b2.r();
                                        rVar3.a = num3;
                                        rVar3.q = r0.n("audio/ac4");
                                        rVar3.I = i34;
                                        rVar3.J = i59;
                                        rVar3.u = oVar2;
                                        rVar3.d = str;
                                        rVar3.j = format2;
                                        a0Var.d = new s(rVar3);
                                        i28 = i33;
                                        i27 = i32;
                                        i21 = i31;
                                    }
                                }
                                hVar3.c();
                                if (i57 == 1) {
                                }
                                if (cVar.a) {
                                    throw s0.c("Can't determine channel mode of presentation " + i61);
                                }
                                i34 = 12;
                                if (cVar.a) {
                                }
                                if (i34 <= 0) {
                                }
                            }
                            i31 = i44;
                            i32 = i16;
                            i33 = y3;
                            i34 = 12;
                            if (cVar.a) {
                            }
                            if (i34 <= 0) {
                            }
                        } else {
                            int i87 = i44;
                            i26 = i46;
                            int i88 = i16;
                            int i89 = y3;
                            if (j11 == 1684892784) {
                                if (j3 <= 0) {
                                    throw s0.a(null, "Invalid sample rate for Dolby TrueHD MLP stream: " + j3);
                                }
                                x0Var = x0Var3;
                                y3 = j3;
                                i17 = i47;
                                str9 = str10;
                                j10 = j10;
                                list2 = list3;
                                i25 = i26;
                                i21 = i87;
                                i16 = 2;
                            } else if (j11 == 1684305011 || j11 == 1969517683) {
                                i21 = i87;
                                b2.r rVar4 = new b2.r();
                                rVar4.a = Integer.toString(i13);
                                rVar4.q = r0.n(str6);
                                i27 = i88;
                                rVar4.I = i27;
                                i28 = i89;
                                rVar4.J = i28;
                                rVar4.u = oVar2;
                                rVar4.d = str;
                                a0Var.d = new s(rVar4);
                            } else {
                                if (j11 == 1682927731) {
                                    int i90 = j10 - 8;
                                    byte[] bArr3 = a;
                                    byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + i90);
                                    vVar3.J(i26 + 8);
                                    vVar3.h(bArr3.length, i90, copyOf);
                                    list2 = c3.b.a(copyOf);
                                } else if (j11 == 1684425825) {
                                    byte[] bArr4 = new byte[j10 - 8];
                                    bArr4[0] = 102;
                                    bArr4[1] = 76;
                                    bArr4[2] = 97;
                                    bArr4[3] = 67;
                                    vVar3.J(i26 + 12);
                                    vVar3.h(4, j10 - 12, bArr4);
                                    list2 = i0.z(bArr4);
                                } else {
                                    if (j11 == 1634492771) {
                                        int i91 = j10 - 12;
                                        byte[] bArr5 = new byte[i91];
                                        vVar3.J(i26 + 12);
                                        vVar3.h(0, i91, bArr5);
                                        byte[] bArr6 = e2.e.a;
                                        v vVar4 = new v(bArr5);
                                        vVar4.J(9);
                                        int x12 = vVar4.x();
                                        vVar4.J(20);
                                        Pair create = Pair.create(Integer.valueOf(vVar4.B()), Integer.valueOf(x12));
                                        int intValue = ((Integer) create.first).intValue();
                                        x0Var = x0Var3;
                                        i16 = ((Integer) create.second).intValue();
                                        y3 = intValue;
                                        i17 = i47;
                                        str9 = str10;
                                        j10 = j10;
                                        i25 = i26;
                                        i21 = i87;
                                        list2 = i0.z(bArr5);
                                    } else if (j11 == 1767990114) {
                                        vVar3.J(i26 + 9);
                                        long j12 = 0;
                                        for (int i92 = 0; i92 < 9; i92++) {
                                            if (vVar3.b == vVar3.c) {
                                                throw new IllegalStateException("Attempting to read a byte over the limit.");
                                            }
                                            long x13 = vVar3.x();
                                            j12 |= (x13 & 127) << (i92 * 7);
                                            if ((x13 & 128) == 0) {
                                                int b13 = x7.b(j12);
                                                byte[] bArr7 = new byte[b13];
                                                vVar3.h(0, b13, bArr7);
                                                byte[] bArr8 = e2.e.a;
                                                vVar2 = new v(bArr7);
                                                while ((vVar2.x() & 128) != 0) {
                                                }
                                                vVar2.K(4);
                                                int x14 = vVar2.x();
                                                int x15 = vVar2.x();
                                                vVar2.K(1);
                                                while ((vVar2.x() & 128) != 0) {
                                                }
                                                while ((vVar2.x() & 128) != 0) {
                                                }
                                                v = vVar2.v(4, StandardCharsets.UTF_8);
                                                if (!v.equals("mp4a")) {
                                                    while ((vVar2.x() & 128) != 0) {
                                                    }
                                                    vVar2.K(2);
                                                    a4.h hVar4 = new a4.h();
                                                    hVar4.p(vVar2);
                                                    int i93 = hVar4.i(5);
                                                    if (i93 == 31) {
                                                        i93 = hVar4.i(6) + 32;
                                                    }
                                                    v = v + ".40." + i93;
                                                }
                                                Object[] objArr4 = {Integer.valueOf(x14), Integer.valueOf(x15), v};
                                                String str13 = d0.a;
                                                String format3 = String.format(Locale.US, "iamf.%03X.%03X.%s", objArr4);
                                                x0Var = x0Var3;
                                                list2 = i0.z(bArr7);
                                                i17 = i47;
                                                j10 = j10;
                                                i25 = i26;
                                                y3 = i89;
                                                i16 = i88;
                                                i21 = i87;
                                                str9 = format3;
                                                int i94 = i21;
                                                i46 = i25 + j10;
                                                i44 = i94;
                                                i45 = i12;
                                                x0Var3 = x0Var;
                                                str2 = str6;
                                                str8 = str4;
                                                c10 = 0;
                                                vVar3 = vVar;
                                            }
                                        }
                                        int b132 = x7.b(j12);
                                        byte[] bArr72 = new byte[b132];
                                        vVar3.h(0, b132, bArr72);
                                        byte[] bArr82 = e2.e.a;
                                        vVar2 = new v(bArr72);
                                        while ((vVar2.x() & 128) != 0) {
                                        }
                                        vVar2.K(4);
                                        int x142 = vVar2.x();
                                        int x152 = vVar2.x();
                                        vVar2.K(1);
                                        while ((vVar2.x() & 128) != 0) {
                                        }
                                        while ((vVar2.x() & 128) != 0) {
                                        }
                                        v = vVar2.v(4, StandardCharsets.UTF_8);
                                        if (!v.equals("mp4a")) {
                                        }
                                        Object[] objArr42 = {Integer.valueOf(x142), Integer.valueOf(x152), v};
                                        String str132 = d0.a;
                                        String format32 = String.format(Locale.US, "iamf.%03X.%03X.%s", objArr42);
                                        x0Var = x0Var3;
                                        list2 = i0.z(bArr72);
                                        i17 = i47;
                                        j10 = j10;
                                        i25 = i26;
                                        y3 = i89;
                                        i16 = i88;
                                        i21 = i87;
                                        str9 = format32;
                                        int i942 = i21;
                                        i46 = i25 + j10;
                                        i44 = i942;
                                        i45 = i12;
                                        x0Var3 = x0Var;
                                        str2 = str6;
                                        str8 = str4;
                                        c10 = 0;
                                        vVar3 = vVar;
                                    } else if (j11 == 1885564227) {
                                        vVar3.J(i26 + 12);
                                        ByteOrder byteOrder = (vVar3.x() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                        int x16 = vVar3.x();
                                        i21 = i87;
                                        if (i21 == 1768973165) {
                                            i17 = d0.B(x16, byteOrder);
                                            i29 = -1;
                                        } else if (i21 == 1718641517 && x16 == 32 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                                            i29 = -1;
                                            i17 = 4;
                                        } else {
                                            i17 = i47;
                                            i29 = -1;
                                        }
                                        x0Var = x0Var3;
                                        str9 = str10;
                                        if (i17 != i29) {
                                            str6 = "audio/raw";
                                        }
                                        j10 = j10;
                                        list2 = list3;
                                        i25 = i26;
                                        y3 = i89;
                                        i16 = i88;
                                    } else {
                                        i21 = i87;
                                        i28 = i89;
                                        i27 = i88;
                                    }
                                    int i9422 = i21;
                                    i46 = i25 + j10;
                                    i44 = i9422;
                                    i45 = i12;
                                    x0Var3 = x0Var;
                                    str2 = str6;
                                    str8 = str4;
                                    c10 = 0;
                                    vVar3 = vVar;
                                }
                                x0Var = x0Var3;
                                i17 = i47;
                                str9 = str10;
                                j10 = j10;
                                i25 = i26;
                                y3 = i89;
                                i16 = i88;
                                i21 = i87;
                            }
                            int i94222 = i21;
                            i46 = i25 + j10;
                            i44 = i94222;
                            i45 = i12;
                            x0Var3 = x0Var;
                            str2 = str6;
                            str8 = str4;
                            c10 = 0;
                            vVar3 = vVar;
                        }
                        x0Var = x0Var3;
                        i16 = i27;
                        y3 = i28;
                        i17 = i47;
                        str9 = str10;
                        j10 = j10;
                        list2 = list3;
                        i25 = i26;
                        int i942222 = i21;
                        i46 = i25 + j10;
                        i44 = i942222;
                        i45 = i12;
                        x0Var3 = x0Var;
                        str2 = str6;
                        str8 = str4;
                        c10 = 0;
                        vVar3 = vVar;
                    }
                    i28 = y3;
                    i21 = i44;
                    x0Var = x0Var3;
                    i16 = i27;
                    y3 = i28;
                    i17 = i47;
                    str9 = str10;
                    j10 = j10;
                    list2 = list3;
                    i25 = i26;
                    int i9422222 = i21;
                    i46 = i25 + j10;
                    i44 = i9422222;
                    i45 = i12;
                    x0Var3 = x0Var;
                    str2 = str6;
                    str8 = str4;
                    c10 = 0;
                    vVar3 = vVar;
                }
                if (j11 == i23) {
                    j10 = i18;
                    i24 = i19;
                    i25 = i24;
                } else {
                    i24 = vVar3.b;
                    i25 = i19;
                    c3.b.c(null, i24 >= i25);
                    while (true) {
                        j10 = i18;
                        if (i24 - i25 < j10) {
                            vVar3.J(i24);
                            int j13 = vVar3.j();
                            c3.b.c("childAtomSize must be positive", j13 > 0);
                            if (vVar3.j() != 1702061171) {
                                i24 += j13;
                                i18 = j10;
                            }
                        } else {
                            i24 = -1;
                        }
                    }
                }
                if (i24 != -1) {
                    x0 c11 = c(i24, vVar3);
                    str5 = (String) c11.c;
                    byte[] bArr9 = (byte[]) c11.d;
                    if (bArr9 != null) {
                        if ("audio/vorbis".equals(str5)) {
                            v vVar5 = new v(bArr9);
                            vVar5.K(1);
                            int i95 = 0;
                            while (vVar5.a() > 0 && (vVar5.a[vVar5.b] & 255) == 255) {
                                i95 += 255;
                                vVar5.K(1);
                            }
                            int x17 = vVar5.x() + i95;
                            int i96 = 0;
                            while (true) {
                                if (vVar5.a() > 0) {
                                    x0Var2 = c11;
                                    if ((vVar5.a[vVar5.b] & 255) == 255) {
                                        i96 += 255;
                                        vVar5.K(1);
                                        c11 = x0Var2;
                                    }
                                } else {
                                    x0Var2 = c11;
                                }
                            }
                            int x18 = vVar5.x() + i96;
                            byte[] bArr10 = new byte[x17];
                            int i97 = vVar5.b;
                            System.arraycopy(bArr9, i97, bArr10, 0, x17);
                            int i98 = i97 + x17 + x18;
                            int length = bArr9.length - i98;
                            byte[] bArr11 = new byte[length];
                            System.arraycopy(bArr9, i98, bArr11, 0, length);
                            list = i0.A(bArr10, bArr11);
                            y3 = i22;
                            i16 = i20;
                            str9 = str10;
                        } else {
                            x0Var2 = c11;
                            if (MediaController.AUDIO_MIME_TYPE.equals(str5)) {
                                c3.a n10 = c3.b.n(new a4.h(bArr9, bArr9.length), false);
                                y3 = n10.b;
                                i16 = n10.c;
                                str9 = n10.a;
                            } else {
                                y3 = i22;
                                i16 = i20;
                                str9 = str10;
                            }
                            list = i0.z(bArr9);
                        }
                        x0Var = x0Var2;
                    } else {
                        x0Var = c11;
                        y3 = i22;
                        i16 = i20;
                        str9 = str10;
                    }
                } else {
                    x0Var = x0Var3;
                    y3 = i22;
                    i16 = i20;
                    str9 = str10;
                    str5 = str3;
                }
                str6 = str5;
                i17 = i47;
                list2 = list;
                int i94222222 = i21;
                i46 = i25 + j10;
                i44 = i94222222;
                i45 = i12;
                x0Var3 = x0Var;
                str2 = str6;
                str8 = str4;
                c10 = 0;
                vVar3 = vVar;
            }
            i21 = i44;
            int i942222222 = i21;
            i46 = i25 + j10;
            i44 = i942222222;
            i45 = i12;
            x0Var3 = x0Var;
            str2 = str6;
            str8 = str4;
            c10 = 0;
            vVar3 = vVar;
        }
        String str14 = str9;
        String str15 = str2;
        List list4 = list2;
        int i99 = i17;
        int i100 = i16;
        int i101 = y3;
        if (((s) a0Var.d) != null || str15 == null) {
            return;
        }
        b2.r rVar5 = new b2.r();
        rVar5.a = Integer.toString(i13);
        rVar5.q = r0.n(str15);
        rVar5.j = str14;
        rVar5.I = i100;
        rVar5.J = i101;
        rVar5.K = i99;
        rVar5.t = list4;
        rVar5.u = oVar2;
        rVar5.d = str;
        if (x0Var3 != null) {
            x0 x0Var4 = x0Var3;
            rVar5.h = x7.e(x0Var4.a);
            rVar5.i = x7.e(x0Var4.b);
        } else {
            y yVar3 = yVar;
            if (yVar3 != null) {
                rVar5.h = x7.e(yVar3.a);
                rVar5.i = x7.e(yVar3.b);
            }
        }
        a0Var.d = new s(rVar5);
    }

    public static x0 c(int i10, v vVar) {
        vVar.J(i10 + 12);
        vVar.K(1);
        d(vVar);
        vVar.K(2);
        int x10 = vVar.x();
        if ((x10 & 128) != 0) {
            vVar.K(2);
        }
        if ((x10 & 64) != 0) {
            vVar.K(vVar.x());
        }
        if ((x10 & 32) != 0) {
            vVar.K(2);
        }
        vVar.K(1);
        d(vVar);
        String e7 = r0.e(vVar.x());
        if ("audio/mpeg".equals(e7) || "audio/vnd.dts".equals(e7) || "audio/vnd.dts.hd".equals(e7)) {
            return new x0(e7, null, -1L, -1L);
        }
        vVar.K(4);
        long z10 = vVar.z();
        long z11 = vVar.z();
        vVar.K(1);
        int d = d(vVar);
        long j3 = z11;
        byte[] bArr = new byte[d];
        vVar.h(0, d, bArr);
        if (j3 <= 0) {
            j3 = -1;
        }
        return new x0(e7, bArr, j3, z10 > 0 ? z10 : -1L);
    }

    public static int d(v vVar) {
        int x10 = vVar.x();
        int i10 = x10 & 127;
        while ((x10 & 128) == 128) {
            x10 = vVar.x();
            i10 = (i10 << 7) | (x10 & 127);
        }
        return i10;
    }

    public static int e(int i10) {
        return (i10 >> 24) & 255;
    }

    public static p0 f(f2.d dVar) {
        f2.b bVar;
        f2.e j3 = dVar.j(1751411826);
        f2.e j10 = dVar.j(1801812339);
        f2.e j11 = dVar.j(1768715124);
        if (j3 != null && j10 != null && j11 != null) {
            v vVar = j3.c;
            vVar.J(16);
            if (vVar.j() == 1835299937) {
                v vVar2 = j10.c;
                vVar2.J(12);
                int j12 = vVar2.j();
                String[] strArr = new String[j12];
                for (int i10 = 0; i10 < j12; i10++) {
                    int j13 = vVar2.j();
                    vVar2.K(4);
                    strArr[i10] = vVar2.v(j13 - 8, StandardCharsets.UTF_8);
                }
                v vVar3 = j11.c;
                vVar3.J(8);
                ArrayList arrayList = new ArrayList();
                while (vVar3.a() > 8) {
                    int i11 = vVar3.b;
                    int j14 = vVar3.j();
                    int j15 = vVar3.j() - 1;
                    if (j15 < 0 || j15 >= j12) {
                        e2.n(j15, "Skipped metadata with unknown key index: ", "BoxParsers");
                    } else {
                        String str = strArr[j15];
                        int i12 = i11 + j14;
                        while (true) {
                            int i13 = vVar3.b;
                            if (i13 >= i12) {
                                bVar = null;
                                break;
                            }
                            int j16 = vVar3.j();
                            if (vVar3.j() == 1684108385) {
                                int j17 = vVar3.j();
                                int j18 = vVar3.j();
                                int i14 = j16 - 16;
                                byte[] bArr = new byte[i14];
                                vVar3.h(0, i14, bArr);
                                bVar = new f2.b(str, bArr, j18, j17);
                                break;
                            }
                            vVar3.J(i13 + j16);
                        }
                        if (bVar != null) {
                            arrayList.add(bVar);
                        }
                    }
                    vVar3.J(i11 + j14);
                }
                if (!arrayList.isEmpty()) {
                    return new p0(arrayList);
                }
            }
        }
        return null;
    }

    public static f2.g g(v vVar) {
        long r10;
        long r11;
        vVar.J(8);
        if (e(vVar.j()) == 0) {
            r10 = vVar.z();
            r11 = vVar.z();
        } else {
            r10 = vVar.r();
            r11 = vVar.r();
        }
        return new f2.g(r10, r11, vVar.z());
    }

    public static Pair h(v vVar, int i10, int i11) {
        Integer num;
        p pVar;
        Pair create;
        int i12;
        int i13;
        Integer num2;
        boolean z10;
        int i14 = vVar.b;
        while (i14 - i10 < i11) {
            vVar.J(i14);
            int j3 = vVar.j();
            c3.b.c("childAtomSize must be positive", j3 > 0);
            if (vVar.j() == 1936289382) {
                int i15 = i14 + 8;
                int i16 = -1;
                Integer num3 = null;
                String str = null;
                int i17 = 0;
                while (i15 - i14 < j3) {
                    vVar.J(i15);
                    int j10 = vVar.j();
                    int j11 = vVar.j();
                    if (j11 == 1718775137) {
                        num3 = Integer.valueOf(vVar.j());
                    } else if (j11 == 1935894637) {
                        vVar.K(4);
                        str = vVar.v(4, StandardCharsets.UTF_8);
                    } else if (j11 == 1935894633) {
                        i16 = i15;
                        i17 = j10;
                    }
                    i15 += j10;
                }
                byte[] bArr = null;
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    c3.b.c("frma atom is mandatory", num3 != null);
                    c3.b.c("schi atom is mandatory", i16 != -1);
                    int i18 = i16 + 8;
                    while (true) {
                        if (i18 - i16 >= i17) {
                            num = num3;
                            pVar = null;
                            break;
                        }
                        vVar.J(i18);
                        int j12 = vVar.j();
                        if (vVar.j() == 1952804451) {
                            int e7 = e(vVar.j());
                            vVar.K(1);
                            if (e7 == 0) {
                                vVar.K(1);
                                i13 = 0;
                                i12 = 0;
                            } else {
                                int x10 = vVar.x();
                                i12 = x10 & 15;
                                i13 = (x10 & 240) >> 4;
                            }
                            if (vVar.x() == 1) {
                                num2 = num3;
                                z10 = true;
                            } else {
                                num2 = num3;
                                z10 = false;
                            }
                            int x11 = vVar.x();
                            byte[] bArr2 = new byte[16];
                            vVar.h(0, 16, bArr2);
                            if (z10 && x11 == 0) {
                                int x12 = vVar.x();
                                byte[] bArr3 = new byte[x12];
                                vVar.h(0, x12, bArr3);
                                bArr = bArr3;
                            }
                            num = num2;
                            pVar = new p(z10, str, x11, bArr2, i13, i12, bArr);
                        } else {
                            i18 += j12;
                        }
                    }
                    c3.b.c("tenc atom is mandatory", pVar != null);
                    String str2 = d0.a;
                    create = Pair.create(num, pVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i14 += j3;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0833  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a0 i(v vVar, g1 g1Var, String str, b2.o oVar, boolean z10) {
        int i10;
        int i11;
        b2.o oVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        String str2;
        a0 a0Var;
        fg.f fVar;
        String str3;
        String str4;
        int i16;
        byte[] bArr;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        b2.j jVar;
        b2.j jVar2;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        mg.n nVar;
        b2.o oVar3;
        int i31;
        String str5;
        a1 a1Var;
        long j3;
        v vVar2 = vVar;
        g1 g1Var2 = g1Var;
        String str6 = str;
        int i32 = g1Var2.a;
        vVar2.J(12);
        int j10 = vVar2.j();
        a0 a0Var2 = new a0();
        a0Var2.c = new p[j10];
        a0Var2.b = 0;
        int i33 = 0;
        while (i33 < j10) {
            int i34 = vVar2.b;
            int j11 = vVar2.j();
            String str7 = "childAtomSize must be positive";
            c3.b.c("childAtomSize must be positive", j11 > 0);
            int j12 = vVar2.j();
            byte b10 = 3;
            if (j12 == 1635148593 || j12 == 1635148595 || j12 == 1701733238 || j12 == 1831958048 || j12 == 1836070006 || j12 == 1752589105 || j12 == 1751479857 || j12 == 1932670515 || j12 == 1211250227 || j12 == 1748121139 || j12 == 1987063864 || j12 == 1987063865 || j12 == 1635135537 || j12 == 1685479798 || j12 == 1685479729 || j12 == 1685481573 || j12 == 1685481521 || j12 == 1634760241) {
                int i35 = g1Var2.c;
                vVar2.J(i34 + 16);
                vVar2.K(16);
                int D = vVar2.D();
                int D2 = vVar2.D();
                vVar2.K(50);
                int i36 = vVar2.b;
                i10 = i33;
                if (j12 == 1701733238) {
                    Pair h = h(vVar2, i34, j11);
                    if (h != null) {
                        j12 = ((Integer) h.first).intValue();
                        if (oVar == null) {
                            i11 = i34;
                            oVar3 = null;
                        } else {
                            i11 = i34;
                            oVar3 = oVar.a(((p) h.second).b);
                        }
                        ((p[]) a0Var2.c)[i10] = (p) h.second;
                    } else {
                        i11 = i34;
                        oVar3 = oVar;
                    }
                    vVar2.J(i36);
                    oVar2 = oVar3;
                } else {
                    i11 = i34;
                    oVar2 = oVar;
                }
                b2.o oVar4 = oVar2;
                i12 = i32;
                i13 = j10;
                int i37 = i36;
                String str8 = j12 == 1831958048 ? "video/mpeg" : j12 == 1211250227 ? "video/3gpp" : null;
                int i38 = 8;
                int i39 = 8;
                int i40 = -1;
                int i41 = -1;
                List list = null;
                int i42 = -1;
                int i43 = -1;
                fg.f fVar2 = null;
                ByteBuffer byteBuffer = null;
                boolean z11 = false;
                int i44 = -1;
                int i45 = -1;
                byte[] bArr2 = null;
                float f7 = 1.0f;
                int i46 = -1;
                int i47 = -1;
                String str9 = null;
                y yVar = null;
                x0 x0Var = null;
                while (i37 - i11 < j11) {
                    vVar2.J(i37);
                    int i48 = vVar2.b;
                    int i49 = i37;
                    int j13 = vVar2.j();
                    if (j13 == 0 && vVar2.b - i11 == j11) {
                        break;
                    }
                    c3.b.c(str7, j13 > 0);
                    int j14 = vVar2.j();
                    int i50 = j11;
                    if (j14 == 1635148611) {
                        c3.b.c(null, str8 == null);
                        vVar2.J(i48 + 8);
                        c3.d a2 = c3.d.a(vVar2);
                        list = a2.a;
                        a0Var2.a = a2.b;
                        float f10 = !z11 ? a2.k : f7;
                        String str10 = a2.l;
                        int i51 = a2.j;
                        i42 = a2.g;
                        int i52 = a2.h;
                        i43 = a2.i;
                        int i53 = a2.e;
                        i38 = a2.f;
                        i15 = j12;
                        str2 = str7;
                        a0Var = a0Var2;
                        f7 = f10;
                        str9 = str10;
                        fVar = fVar2;
                        str4 = MediaController.VIDEO_MIME_TYPE;
                        i45 = i51;
                        i41 = i52;
                        i16 = i40;
                        i39 = i53;
                    } else {
                        i15 = j12;
                        if (j14 == 1752589123) {
                            c3.b.c(null, str8 == null);
                            vVar2.J(i48 + 8);
                            x a10 = x.a(vVar2, false, null);
                            list = a10.a;
                            a0Var2.a = a10.b;
                            float f11 = !z11 ? a10.l : f7;
                            int i54 = a10.m;
                            int i55 = a10.c;
                            String str11 = a10.n;
                            int i56 = a10.k;
                            if (i56 != -1) {
                                i40 = i56;
                            }
                            int i57 = a10.d;
                            int i58 = a10.e;
                            i42 = a10.h;
                            int i59 = a10.i;
                            int i60 = a10.j;
                            int i61 = a10.f;
                            int i62 = a10.g;
                            fVar = a10.o;
                            i38 = i62;
                            str4 = "video/hevc";
                            str2 = str7;
                            i47 = i57;
                            a0Var = a0Var2;
                            str9 = str11;
                            i46 = i58;
                            i43 = i60;
                            i39 = i61;
                            f7 = f11;
                            i41 = i59;
                            i45 = i54;
                            i44 = i55;
                            i16 = i40;
                        } else {
                            int i63 = i40;
                            if (j14 == 1818785347) {
                                c3.b.c("lhvC must follow hvcC atom", "video/hevc".equals(str8));
                                c3.b.c("must have at least two layers", fVar2 != null && ((i0) fVar2.a).size() >= 2);
                                vVar2.J(i48 + 8);
                                fVar2.getClass();
                                x a11 = x.a(vVar2, true, fVar2);
                                c3.b.c("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", a0Var2.a == a11.b);
                                int i64 = a11.h;
                                if (i64 != -1) {
                                    c3.b.c("colorSpace must be the same for both views", i42 == i64);
                                }
                                int i65 = a11.i;
                                if (i65 != -1) {
                                    c3.b.c("colorRange must be the same for both views", i41 == i65);
                                }
                                int i66 = a11.j;
                                if (i66 != -1) {
                                    c3.b.c("colorTransfer must be the same for both views", i43 == i66);
                                }
                                c3.b.c("bitdepthLuma must be the same for both views", i39 == a11.f);
                                c3.b.c("bitdepthChroma must be the same for both views", i38 == a11.g);
                                if (list != null) {
                                    f0 u10 = i0.u();
                                    u10.d(list);
                                    u10.d(a11.a);
                                    list = u10.i();
                                } else {
                                    c3.b.c("initializationData must be already set from hvcC atom", false);
                                }
                                str4 = "video/mv-hevc";
                                a0Var = a0Var2;
                                str9 = a11.n;
                                fVar = fVar2;
                                i16 = i63;
                                str2 = str7;
                            } else if (j14 == 1986361461) {
                                vVar2.J(i48 + 8);
                                int i67 = vVar2.b;
                                mg.n nVar2 = null;
                                while (i67 - i48 < j13) {
                                    vVar2.J(i67);
                                    int j15 = vVar2.j();
                                    c3.b.c(str7, j15 > 0);
                                    int i68 = i38;
                                    if (vVar2.j() == 1702454643) {
                                        vVar2.J(i67 + 8);
                                        int i69 = vVar2.b;
                                        while (true) {
                                            if (i69 - i67 >= j15) {
                                                i28 = i39;
                                                i29 = i67;
                                                i30 = j15;
                                                nVar = null;
                                                break;
                                            }
                                            vVar2.J(i69);
                                            int j16 = vVar2.j();
                                            c3.b.c(str7, j16 > 0);
                                            int i70 = i69;
                                            if (vVar2.j() == 1937011305) {
                                                vVar2.K(4);
                                                int x10 = vVar2.x();
                                                i28 = i39;
                                                i29 = i67;
                                                i30 = j15;
                                                nVar = new mg.n(new ac.d((x10 & 1) == 1, (x10 & 2) == 2, (x10 & 8) == 8), 21);
                                            } else {
                                                i69 = i70 + j16;
                                            }
                                        }
                                        nVar2 = nVar;
                                    } else {
                                        i28 = i39;
                                        i29 = i67;
                                        i30 = j15;
                                    }
                                    i67 = i29 + i30;
                                    i38 = i68;
                                    i39 = i28;
                                }
                                int i71 = i38;
                                int i72 = i39;
                                g0 g0Var = nVar2 == null ? null : new g0(nVar2, 24);
                                if (g0Var != null) {
                                    ac.d dVar = (ac.d) ((mg.n) g0Var.b).b;
                                    boolean z12 = dVar.c;
                                    if (fVar2 == null || ((i0) fVar2.a).size() < 2) {
                                        i26 = i63;
                                        if (i26 == -1) {
                                            i27 = z12 ? 5 : 4;
                                            i16 = i27;
                                            str2 = str7;
                                            str4 = str8;
                                            a0Var = a0Var2;
                                            fVar = fVar2;
                                            i38 = i71;
                                            i39 = i72;
                                        }
                                        i27 = i26;
                                        i16 = i27;
                                        str2 = str7;
                                        str4 = str8;
                                        a0Var = a0Var2;
                                        fVar = fVar2;
                                        i38 = i71;
                                        i39 = i72;
                                    } else {
                                        c3.b.c("both eye views must be marked as available", dVar.a && dVar.b);
                                        c3.b.c("for MV-HEVC, eye_views_reversed must be set to false", !z12);
                                    }
                                }
                                i26 = i63;
                                i27 = i26;
                                i16 = i27;
                                str2 = str7;
                                str4 = str8;
                                a0Var = a0Var2;
                                fVar = fVar2;
                                i38 = i71;
                                i39 = i72;
                            } else {
                                int i73 = i38;
                                int i74 = i39;
                                int i75 = i63;
                                if (j14 == 1685480259 || j14 == 1685485123 || j14 == 1685485379) {
                                    str2 = str7;
                                    String str12 = str8;
                                    a0Var = a0Var2;
                                    int i76 = i41;
                                    fVar = fVar2;
                                    int i77 = j13 - 8;
                                    byte[] bArr3 = new byte[i77];
                                    vVar2.h(0, i77, bArr3);
                                    if (list != null) {
                                        f0 u11 = i0.u();
                                        u11.d(list);
                                        u11.b(bArr3);
                                        list = u11.i();
                                    } else {
                                        c3.b.c("initializationData must already be set from hvcC or avcC atom", false);
                                    }
                                    vVar2.J(i48 + 8);
                                    f2.a a12 = f2.a.a(vVar2);
                                    if (a12 != null) {
                                        str3 = "video/dolby-vision";
                                        str9 = a12.a;
                                    } else {
                                        str3 = str12;
                                    }
                                    str4 = str3;
                                    i41 = i76;
                                    i39 = i74;
                                } else {
                                    int i78 = 6;
                                    if (j14 == 1987076931) {
                                        c3.b.c(null, str8 == null);
                                        String str13 = i15 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                        vVar2.J(i48 + 12);
                                        byte x11 = (byte) vVar2.x();
                                        byte x12 = (byte) vVar2.x();
                                        int x13 = vVar2.x();
                                        int i79 = x13 >> 4;
                                        byte b11 = (byte) ((x13 >> 1) & 7);
                                        if (str13.equals("video/x-vnd.on2.vp9")) {
                                            byte[] bArr4 = e2.e.a;
                                            byte[] bArr5 = new byte[12];
                                            bArr5[0] = 1;
                                            bArr5[1] = 1;
                                            bArr5[2] = x11;
                                            bArr5[b10] = 2;
                                            bArr5[4] = 1;
                                            bArr5[5] = x12;
                                            bArr5[6] = b10;
                                            bArr5[7] = 1;
                                            bArr5[8] = (byte) i79;
                                            bArr5[9] = 4;
                                            bArr5[10] = 1;
                                            bArr5[11] = b11;
                                            list = i0.z(bArr5);
                                        }
                                        boolean z13 = (x13 & 1) != 0;
                                        int x14 = vVar2.x();
                                        int x15 = vVar2.x();
                                        int f12 = b2.j.f(x14);
                                        int i80 = z13 ? 1 : 2;
                                        i43 = b2.j.g(x15);
                                        str2 = str7;
                                        i15 = i15;
                                        a0Var = a0Var2;
                                        i39 = i79;
                                        str4 = str13;
                                        fVar = fVar2;
                                        i42 = f12;
                                        i41 = i80;
                                        i16 = i75;
                                        i38 = i39;
                                    } else if (j14 == 1635135811) {
                                        int i81 = j13 - 8;
                                        byte[] bArr6 = new byte[i81];
                                        vVar2.h(0, i81, bArr6);
                                        list = i0.z(bArr6);
                                        vVar2.J(i48 + 8);
                                        byte[] bArr7 = vVar2.a;
                                        a4.h hVar = new a4.h(bArr7, bArr7.length);
                                        hVar.q(vVar2.b * 8);
                                        hVar.u(1);
                                        int i82 = hVar.i(3);
                                        hVar.t(6);
                                        boolean h10 = hVar.h();
                                        boolean h11 = hVar.h();
                                        int i83 = -1;
                                        if (i82 == 2 && h10) {
                                            int i84 = h11 ? 12 : 10;
                                            i19 = h11 ? 12 : 10;
                                            i17 = i84;
                                        } else if (i82 <= 2) {
                                            int i85 = h10 ? 10 : 8;
                                            i19 = h10 ? 10 : 8;
                                            i17 = i85;
                                        } else {
                                            i17 = -1;
                                            i18 = -1;
                                            hVar.t(13);
                                            hVar.s();
                                            i20 = hVar.i(4);
                                            if (i20 == 1) {
                                                e2.a.i("BoxParsers", "Unsupported obu_type: " + i20);
                                                jVar2 = new b2.j(-1, -1, -1, null, i17, i18);
                                            } else if (hVar.h()) {
                                                e2.a.i("BoxParsers", "Unsupported obu_extension_flag");
                                                jVar2 = new b2.j(-1, -1, -1, null, i17, i18);
                                            } else {
                                                boolean h12 = hVar.h();
                                                hVar.s();
                                                if (!h12 || hVar.i(8) <= 127) {
                                                    int i86 = hVar.i(3);
                                                    hVar.s();
                                                    if (hVar.h()) {
                                                        e2.a.i("BoxParsers", "Unsupported reduced_still_picture_header");
                                                        jVar2 = new b2.j(-1, -1, -1, null, i17, i18);
                                                    } else if (hVar.h()) {
                                                        e2.a.i("BoxParsers", "Unsupported timing_info_present_flag");
                                                        jVar2 = new b2.j(-1, -1, -1, null, i17, i18);
                                                    } else if (hVar.h()) {
                                                        e2.a.i("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                        jVar2 = new b2.j(-1, -1, -1, null, i17, i18);
                                                    } else {
                                                        int i87 = hVar.i(5);
                                                        for (int i88 = 0; i88 <= i87; i88++) {
                                                            hVar.t(12);
                                                            if (hVar.i(5) > 7) {
                                                                hVar.s();
                                                            }
                                                        }
                                                        int i89 = hVar.i(4);
                                                        int i90 = hVar.i(4);
                                                        hVar.t(i89 + 1);
                                                        hVar.t(i90 + 1);
                                                        if (hVar.h()) {
                                                            hVar.t(7);
                                                        }
                                                        hVar.t(7);
                                                        boolean h13 = hVar.h();
                                                        if (h13) {
                                                            hVar.t(2);
                                                        }
                                                        if (hVar.h()) {
                                                            i21 = 1;
                                                            i22 = 2;
                                                        } else {
                                                            i21 = 1;
                                                            i22 = hVar.i(1);
                                                        }
                                                        if (i22 > 0 && !hVar.h()) {
                                                            hVar.t(i21);
                                                        }
                                                        if (h13) {
                                                            hVar.t(3);
                                                        }
                                                        hVar.t(3);
                                                        boolean h14 = hVar.h();
                                                        if (i86 == 2 && h14) {
                                                            hVar.s();
                                                        }
                                                        boolean z14 = i86 != 1 && hVar.h();
                                                        if (hVar.h()) {
                                                            int i91 = hVar.i(8);
                                                            int i92 = hVar.i(8);
                                                            int i93 = (!z14 && i91 == 1 && i92 == 13 && hVar.i(8) == 0) ? 1 : hVar.i(1);
                                                            int f13 = b2.j.f(i91);
                                                            int i94 = i93 == 1 ? 1 : 2;
                                                            i24 = f13;
                                                            i23 = i17;
                                                            i25 = b2.j.g(i92);
                                                            i83 = i94;
                                                        } else {
                                                            i23 = i17;
                                                            i24 = -1;
                                                            i25 = -1;
                                                        }
                                                        jVar = new b2.j(i24, i83, i25, null, i23, i18);
                                                        int i95 = jVar.e;
                                                        int i96 = jVar.f;
                                                        int i97 = jVar.a;
                                                        i41 = jVar.b;
                                                        i43 = jVar.c;
                                                        str4 = "video/av01";
                                                        i39 = i95;
                                                        str2 = str7;
                                                        i42 = i97;
                                                        a0Var = a0Var2;
                                                        fVar = fVar2;
                                                        i16 = i75;
                                                        i38 = i96;
                                                    }
                                                } else {
                                                    e2.a.i("BoxParsers", "Excessive obu_size");
                                                    jVar2 = new b2.j(-1, -1, -1, null, i17, i18);
                                                }
                                            }
                                            jVar = jVar2;
                                            int i952 = jVar.e;
                                            int i962 = jVar.f;
                                            int i972 = jVar.a;
                                            i41 = jVar.b;
                                            i43 = jVar.c;
                                            str4 = "video/av01";
                                            i39 = i952;
                                            str2 = str7;
                                            i42 = i972;
                                            a0Var = a0Var2;
                                            fVar = fVar2;
                                            i16 = i75;
                                            i38 = i962;
                                        }
                                        i18 = i19;
                                        hVar.t(13);
                                        hVar.s();
                                        i20 = hVar.i(4);
                                        if (i20 == 1) {
                                        }
                                        jVar = jVar2;
                                        int i9522 = jVar.e;
                                        int i9622 = jVar.f;
                                        int i9722 = jVar.a;
                                        i41 = jVar.b;
                                        i43 = jVar.c;
                                        str4 = "video/av01";
                                        i39 = i9522;
                                        str2 = str7;
                                        i42 = i9722;
                                        a0Var = a0Var2;
                                        fVar = fVar2;
                                        i16 = i75;
                                        i38 = i9622;
                                    } else {
                                        if (j14 == 1668050025) {
                                            if (byteBuffer == null) {
                                                byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                            }
                                            ByteBuffer byteBuffer2 = byteBuffer;
                                            byteBuffer2.position(21);
                                            byteBuffer2.putShort(vVar2.u());
                                            byteBuffer2.putShort(vVar2.u());
                                            i16 = i75;
                                            byteBuffer = byteBuffer2;
                                            str2 = str7;
                                            str4 = str8;
                                            a0Var = a0Var2;
                                            fVar = fVar2;
                                        } else if (j14 == 1835295606) {
                                            if (byteBuffer == null) {
                                                byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                            }
                                            ByteBuffer byteBuffer3 = byteBuffer;
                                            short u12 = vVar2.u();
                                            short u13 = vVar2.u();
                                            short u14 = vVar2.u();
                                            short u15 = vVar2.u();
                                            str2 = str7;
                                            short u16 = vVar2.u();
                                            str4 = str8;
                                            short u17 = vVar2.u();
                                            int i98 = i41;
                                            short u18 = vVar2.u();
                                            fVar = fVar2;
                                            short u19 = vVar2.u();
                                            long z15 = vVar2.z();
                                            long z16 = vVar2.z();
                                            a0Var = a0Var2;
                                            byteBuffer3.position(1);
                                            byteBuffer3.putShort(u16);
                                            byteBuffer3.putShort(u17);
                                            byteBuffer3.putShort(u12);
                                            byteBuffer3.putShort(u13);
                                            byteBuffer3.putShort(u14);
                                            byteBuffer3.putShort(u15);
                                            byteBuffer3.putShort(u18);
                                            byteBuffer3.putShort(u19);
                                            byteBuffer3.putShort((short) (z15 / 10000));
                                            byteBuffer3.putShort((short) (z16 / 10000));
                                            i16 = i75;
                                            byteBuffer = byteBuffer3;
                                            i41 = i98;
                                        } else {
                                            str2 = str7;
                                            str4 = str8;
                                            a0Var = a0Var2;
                                            int i99 = i41;
                                            fVar = fVar2;
                                            if (j14 == 1681012275) {
                                                c3.b.c(null, str4 == null);
                                                i16 = i75;
                                                str4 = "video/3gpp";
                                                i41 = i99;
                                                i38 = i73;
                                                i39 = i74;
                                            } else if (j14 == 1702061171) {
                                                c3.b.c(null, str4 == null);
                                                x0 c10 = c(i48, vVar2);
                                                String str14 = (String) c10.c;
                                                byte[] bArr8 = (byte[]) c10.d;
                                                if (bArr8 != null) {
                                                    list = i0.z(bArr8);
                                                }
                                                x0Var = c10;
                                                str4 = str14;
                                                i41 = i99;
                                                i39 = i74;
                                            } else {
                                                if (j14 == 1651798644) {
                                                    vVar2.J(i48 + 8);
                                                    vVar2.K(4);
                                                    i16 = i75;
                                                    yVar = new y(vVar2.z(), vVar2.z());
                                                } else if (j14 == 1885434736) {
                                                    vVar2.J(i48 + 8);
                                                    i16 = i75;
                                                    f7 = vVar2.B() / vVar2.B();
                                                    i41 = i99;
                                                    i38 = i73;
                                                    i39 = i74;
                                                    z11 = true;
                                                } else if (j14 == 1937126244) {
                                                    int i100 = i48 + 8;
                                                    while (true) {
                                                        if (i100 - i48 >= j13) {
                                                            bArr = null;
                                                            break;
                                                        }
                                                        vVar2.J(i100);
                                                        int j17 = vVar2.j();
                                                        if (vVar2.j() == 1886547818) {
                                                            bArr = Arrays.copyOfRange(vVar2.a, i100, j17 + i100);
                                                            break;
                                                        }
                                                        i100 += j17;
                                                    }
                                                    i16 = i75;
                                                    bArr2 = bArr;
                                                } else if (j14 == 1936995172) {
                                                    int x16 = vVar2.x();
                                                    vVar2.K(3);
                                                    if (x16 == 0) {
                                                        int x17 = vVar2.x();
                                                        if (x17 == 0) {
                                                            i75 = 0;
                                                        } else if (x17 == 1) {
                                                            i75 = 1;
                                                        } else if (x17 == 2) {
                                                            i75 = 2;
                                                        } else if (x17 == 3) {
                                                            i75 = 3;
                                                        }
                                                    }
                                                    i16 = i75;
                                                } else if (j14 == 1634760259) {
                                                    int i101 = j13 - 12;
                                                    byte[] bArr9 = new byte[i101];
                                                    vVar2.J(i48 + 12);
                                                    vVar2.h(0, i101, bArr9);
                                                    list = i0.z(bArr9);
                                                    v vVar3 = new v(bArr9);
                                                    a4.h hVar2 = new a4.h(bArr9, i101);
                                                    hVar2.q(vVar3.b * 8);
                                                    hVar2.u(1);
                                                    int i102 = hVar2.i(8);
                                                    int i103 = -1;
                                                    int i104 = -1;
                                                    int i105 = 0;
                                                    int i106 = -1;
                                                    int i107 = -1;
                                                    int i108 = -1;
                                                    while (i105 < i102) {
                                                        hVar2.u(1);
                                                        int i109 = hVar2.i(8);
                                                        int i110 = i108;
                                                        int i111 = i107;
                                                        int i112 = i106;
                                                        int i113 = i104;
                                                        int i114 = 0;
                                                        while (i114 < i109) {
                                                            hVar2.t(i78);
                                                            boolean h15 = hVar2.h();
                                                            hVar2.s();
                                                            hVar2.u(11);
                                                            hVar2.t(4);
                                                            int i115 = hVar2.i(4) + 8;
                                                            hVar2.u(1);
                                                            if (h15) {
                                                                int i116 = hVar2.i(8);
                                                                int i117 = hVar2.i(8);
                                                                hVar2.u(1);
                                                                boolean h16 = hVar2.h();
                                                                int f14 = b2.j.f(i116);
                                                                int i118 = h16 ? 1 : 2;
                                                                i110 = b2.j.g(i117);
                                                                i112 = i118;
                                                                i111 = f14;
                                                            }
                                                            i114++;
                                                            i103 = i115;
                                                            i113 = i103;
                                                            i78 = 6;
                                                        }
                                                        i105++;
                                                        i104 = i113;
                                                        i106 = i112;
                                                        i107 = i111;
                                                        i108 = i110;
                                                        i78 = 6;
                                                    }
                                                    int i119 = i103;
                                                    i16 = i75;
                                                    i38 = i119;
                                                    str4 = "video/apv";
                                                    i39 = i104;
                                                    i41 = i106;
                                                    i42 = i107;
                                                    i43 = i108;
                                                } else {
                                                    if (j14 == 1668246642 && i42 == -1 && i43 == -1) {
                                                        int j18 = vVar2.j();
                                                        if (j18 == 1852009592 || j18 == 1852009571) {
                                                            int D3 = vVar2.D();
                                                            int D4 = vVar2.D();
                                                            vVar2.K(2);
                                                            boolean z17 = j13 == 19 && (vVar2.x() & 128) != 0;
                                                            int f15 = b2.j.f(D3);
                                                            i41 = z17 ? 1 : 2;
                                                            i43 = b2.j.g(D4);
                                                            i16 = i75;
                                                            i42 = f15;
                                                            i38 = i73;
                                                            i39 = i74;
                                                        } else {
                                                            e2.a.n("BoxParsers", "Unsupported color type: " + dd.k.b(j18));
                                                        }
                                                    }
                                                    i16 = i75;
                                                    i41 = i99;
                                                    i38 = i73;
                                                    i39 = i74;
                                                }
                                                i41 = i99;
                                                i38 = i73;
                                                i39 = i74;
                                            }
                                        }
                                        i38 = i73;
                                        i39 = i74;
                                    }
                                }
                                i16 = i75;
                                i38 = i73;
                            }
                        }
                    }
                    i37 = i49 + j13;
                    i40 = i16;
                    j11 = i50;
                    j12 = i15;
                    str7 = str2;
                    str8 = str4;
                    fVar2 = fVar;
                    a0Var2 = a0Var;
                    b10 = 3;
                }
                int i120 = i38;
                int i121 = i39;
                i14 = j11;
                int i122 = i40;
                String str15 = str8;
                a0 a0Var3 = a0Var2;
                int i123 = i41;
                if (str15 == null) {
                    str6 = str;
                    a0Var2 = a0Var3;
                } else {
                    b2.r rVar = new b2.r();
                    rVar.a = Integer.toString(i12);
                    rVar.q = r0.n(str15);
                    rVar.j = str9;
                    rVar.x = D;
                    rVar.y = D2;
                    rVar.z = i47;
                    rVar.A = i46;
                    rVar.D = f7;
                    rVar.C = i35;
                    rVar.E = bArr2;
                    rVar.F = i122;
                    rVar.t = list;
                    rVar.s = i45;
                    rVar.H = i44;
                    rVar.u = oVar4;
                    str6 = str;
                    rVar.d = str6;
                    rVar.G = new b2.j(i42, i123, i43, byteBuffer != null ? byteBuffer.array() : null, i121, i120);
                    y yVar2 = yVar;
                    if (yVar2 != null) {
                        rVar.h = x7.e(yVar2.a);
                        rVar.i = x7.e(yVar2.b);
                    } else {
                        x0 x0Var2 = x0Var;
                        if (x0Var2 != null) {
                            rVar.h = x7.e(x0Var2.a);
                            rVar.i = x7.e(x0Var2.b);
                        }
                    }
                    a0Var2 = a0Var3;
                    a0Var2.d = new s(rVar);
                }
            } else {
                if (j12 == 1836069985 || j12 == 1701733217 || j12 == 1633889587 || j12 == 1700998451 || j12 == 1633889588 || j12 == 1835823201 || j12 == 1685353315 || j12 == 1685353317 || j12 == 1685353320 || j12 == 1685353324 || j12 == 1685353336 || j12 == 1935764850 || j12 == 1935767394 || j12 == 1819304813 || j12 == 1936684916 || j12 == 1953984371 || j12 == 778924082 || j12 == 778924083 || j12 == 1835557169 || j12 == 1835560241 || j12 == 1634492771 || j12 == 1634492791 || j12 == 1970037111 || j12 == 1332770163 || j12 == 1716281667 || j12 == 1767992678 || j12 == 1768973165 || j12 == 1718641517) {
                    vVar2 = vVar;
                    i34 = i34;
                    b(vVar2, j12, i34, j11, g1Var2.a, str6, z10, oVar, a0Var2, i33);
                    str6 = str;
                } else if (j12 == 1414810956 || j12 == 1954034535 || j12 == 2004251764 || j12 == 1937010800 || j12 == 1664495672 || j12 == 1836070003) {
                    vVar2.J(i34 + 16);
                    String str16 = "application/ttml+xml";
                    long j19 = Long.MAX_VALUE;
                    if (j12 != 1414810956) {
                        if (j12 == 1954034535) {
                            int i124 = j11 - 16;
                            byte[] bArr10 = new byte[i124];
                            vVar2.h(0, i124, bArr10);
                            a1Var = i0.z(bArr10);
                            str16 = "application/x-quicktime-tx3g";
                            i31 = i34;
                        } else if (j12 == 2004251764) {
                            str16 = "application/x-mp4-vtt";
                        } else if (j12 == 1937010800) {
                            j19 = 0;
                        } else if (j12 == 1664495672) {
                            a0Var2.b = 1;
                            str16 = "application/x-mp4-cea-608";
                        } else {
                            if (j12 != 1836070003) {
                                throw new IllegalStateException();
                            }
                            int i125 = vVar2.b;
                            vVar2.K(4);
                            if (vVar2.j() == 1702061171) {
                                byte[] bArr11 = (byte[]) c(i125, vVar2).d;
                                if (bArr11 == null || bArr11.length != 64) {
                                    i31 = i34;
                                    vVar2 = vVar;
                                    i14 = j11;
                                    i10 = i33;
                                    i12 = i32;
                                    i13 = j10;
                                    i11 = i31;
                                } else {
                                    int i126 = g1Var2.d;
                                    int i127 = g1Var2.e;
                                    e2.d.g(bArr11.length == 64);
                                    ArrayList arrayList = new ArrayList(16);
                                    int i128 = 0;
                                    while (i128 < bArr11.length - 3) {
                                        byte[] bArr12 = bArr11;
                                        int c11 = x7.c(bArr11[i128], bArr11[i128 + 1], bArr11[i128 + 2], bArr12[i128 + 3]);
                                        int i129 = (c11 >> 16) & 255;
                                        int i130 = ((c11 >> 8) & 255) - 128;
                                        int i131 = (c11 & 255) - 128;
                                        arrayList.add(String.format("%06x", Integer.valueOf(d0.h(((i131 * 17790) / 10000) + i129, 0, 255) | (d0.h((i129 - ((i131 * 3455) / 10000)) - ((i130 * 7169) / 10000), 0, 255) << 8) | (d0.h(((i130 * 14075) / 10000) + i129, 0, 255) << 16))));
                                        i128 += 4;
                                        bArr11 = bArr12;
                                        i34 = i34;
                                    }
                                    i31 = i34;
                                    StringBuilder k10 = e2.k("size: ", i126, "x", i127, "\npalette: ");
                                    d9.f fVar3 = new d9.f(", ");
                                    Iterator it = arrayList.iterator();
                                    StringBuilder sb2 = new StringBuilder();
                                    fVar3.a(sb2, it);
                                    k10.append(sb2.toString());
                                    k10.append("\n");
                                    String sb3 = k10.toString();
                                    String str17 = d0.a;
                                    a1Var = i0.z(sb3.getBytes(StandardCharsets.UTF_8));
                                    str5 = "application/vobsub";
                                }
                            } else {
                                i31 = i34;
                                str5 = null;
                                a1Var = null;
                            }
                            str16 = str5;
                        }
                        j3 = Long.MAX_VALUE;
                        if (str16 != null) {
                            b2.r rVar2 = new b2.r();
                            rVar2.a = Integer.toString(i32);
                            rVar2.q = r0.n(str16);
                            rVar2.d = str6;
                            rVar2.v = j3;
                            rVar2.t = a1Var;
                            a0Var2.d = new s(rVar2);
                        }
                        vVar2 = vVar;
                        i14 = j11;
                        i10 = i33;
                        i12 = i32;
                        i13 = j10;
                        i11 = i31;
                    }
                    i31 = i34;
                    j3 = j19;
                    a1Var = null;
                    if (str16 != null) {
                    }
                    vVar2 = vVar;
                    i14 = j11;
                    i10 = i33;
                    i12 = i32;
                    i13 = j10;
                    i11 = i31;
                } else if (j12 == 1835365492) {
                    vVar2.J(i34 + 16);
                    if (j12 == 1835365492) {
                        vVar2.s();
                        String s10 = vVar2.s();
                        if (s10 != null) {
                            b2.r rVar3 = new b2.r();
                            rVar3.a = Integer.toString(i32);
                            rVar3.q = r0.n(s10);
                            a0Var2.d = new s(rVar3);
                        }
                    }
                } else if (j12 == 1667329389) {
                    b2.r rVar4 = new b2.r();
                    rVar4.a = Integer.toString(i32);
                    rVar4.q = r0.n("application/x-camera-motion");
                    a0Var2.d = new s(rVar4);
                }
                i11 = i34;
                i14 = j11;
                i10 = i33;
                i12 = i32;
                i13 = j10;
            }
            vVar2.J(i11 + i14);
            i33 = i10 + 1;
            g1Var2 = g1Var;
            i32 = i12;
            j10 = i13;
        }
        return a0Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:318:0x00e3, code lost:
    
        if (r23 == 0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:221:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0625 A[ADDED_TO_REGION, LOOP:15: B:264:0x0625->B:267:0x062f, LOOP_START, PHI: r26
      0x0625: PHI (r26v3 int) = (r26v2 int), (r26v4 int) binds: [B:263:0x0623, B:267:0x062f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0611 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0976 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x06ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList j(f2.d dVar, w wVar, long j3, b2.o oVar, boolean z10, boolean z11, d9.e eVar) {
        long j10;
        long j11;
        ArrayList arrayList;
        int i10;
        long j12;
        long j13;
        long Y;
        int i11;
        int i12;
        int i13;
        String str;
        f2.e j14;
        int i14;
        long[] jArr;
        long[] jArr2;
        s sVar;
        s sVar2;
        d9.e eVar2;
        o oVar2;
        f2.d i15;
        Pair create;
        int i16;
        long j15;
        b bVar;
        boolean z12;
        int i17;
        int i18;
        int i19;
        int a2;
        v vVar;
        long[] jArr3;
        int[] iArr;
        int i20;
        ArrayList arrayList2;
        int i21;
        long j16;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int[] iArr2;
        long[] jArr4;
        long[] jArr5;
        int[] iArr3;
        int i28;
        long j17;
        boolean z13;
        long[] jArr6;
        int[] iArr4;
        int i29;
        int[] iArr5;
        long[] jArr7;
        int[] iArr6;
        long j18;
        int i30;
        int i31;
        long[] jArr8;
        long j19;
        long[] jArr9;
        long[] jArr10;
        int i32;
        ArrayList arrayList3;
        r rVar;
        int[] iArr7;
        int i33;
        int i34;
        r rVar2;
        f2.d dVar2 = dVar;
        ArrayList arrayList4 = new ArrayList();
        int i35 = 0;
        for (ArrayList arrayList5 = dVar2.e; i35 < arrayList5.size(); arrayList5 = arrayList) {
            f2.d dVar3 = (f2.d) arrayList5.get(i35);
            if (dVar3.b != 1953653099) {
                arrayList = arrayList5;
                arrayList3 = arrayList4;
                i14 = i35;
            } else {
                f2.e j20 = dVar2.j(1836476516);
                j20.getClass();
                f2.d i36 = dVar3.i(1835297121);
                i36.getClass();
                f2.e j21 = i36.j(1751411826);
                j21.getClass();
                v vVar2 = j21.c;
                vVar2.J(16);
                int j22 = vVar2.j();
                int i37 = j22 == 1936684398 ? 1 : j22 == 1986618469 ? 2 : (j22 == 1952807028 || j22 == 1935832172 || j22 == 1937072756 || j22 == 1668047728 || j22 == 1937072752) ? 3 : j22 == 1835365473 ? 5 : -1;
                if (i37 == -1) {
                    arrayList = arrayList5;
                    i14 = i35;
                    oVar2 = null;
                    eVar2 = eVar;
                } else {
                    f2.e j23 = dVar3.j(1953196132);
                    j23.getClass();
                    v vVar3 = j23.c;
                    vVar3.J(8);
                    int e7 = e(vVar3.j());
                    vVar3.K(e7 != 0 ? 16 : 8);
                    int j24 = vVar3.j();
                    vVar3.K(4);
                    int i38 = vVar3.b;
                    int i39 = e7 == 0 ? 4 : 8;
                    int i40 = 0;
                    while (true) {
                        j10 = -9223372036854775807L;
                        if (i40 >= i39) {
                            vVar3.K(i39);
                            break;
                        }
                        if (vVar3.a[i38 + i40] != -1) {
                            j11 = e7 == 0 ? vVar3.z() : vVar3.C();
                        } else {
                            i40++;
                        }
                    }
                    j11 = -9223372036854775807L;
                    vVar3.K(10);
                    int D = vVar3.D();
                    vVar3.K(4);
                    int j25 = vVar3.j();
                    int j26 = vVar3.j();
                    vVar3.K(4);
                    int j27 = vVar3.j();
                    int j28 = vVar3.j();
                    if (j25 == 0 && j26 == 65536) {
                        arrayList = arrayList5;
                        if ((j27 == -65536 || j27 == 65536) && j28 == 0) {
                            i10 = 90;
                            vVar3.K(16);
                            short u10 = vVar3.u();
                            vVar3.K(2);
                            short u11 = vVar3.u();
                            g1 g1Var = new g1();
                            g1Var.a = j24;
                            g1Var.b = D;
                            g1Var.c = i10;
                            g1Var.d = u10;
                            g1Var.e = u11;
                            j12 = j3 != -9223372036854775807L ? j11 : j3;
                            long j29 = g(j20.c).c;
                            if (j12 != -9223372036854775807L) {
                                j13 = j29;
                                Y = -9223372036854775807L;
                            } else {
                                String str2 = d0.a;
                                j13 = j29;
                                Y = d0.Y(j12, 1000000L, j13, RoundingMode.DOWN);
                            }
                            f2.d i41 = i36.i(1835626086);
                            i41.getClass();
                            f2.d i42 = i41.i(1937007212);
                            i42.getClass();
                            f2.e j30 = i36.j(1835296868);
                            j30.getClass();
                            v vVar4 = j30.c;
                            vVar4.J(8);
                            int e10 = e(vVar4.j());
                            vVar4.K(e10 != 0 ? 8 : 16);
                            long z14 = vVar4.z();
                            int i43 = vVar4.b;
                            i11 = e10 != 0 ? 4 : 8;
                            i12 = 0;
                            while (true) {
                                if (i12 < i11) {
                                    vVar4.K(i11);
                                    break;
                                }
                                if (vVar4.a[i43 + i12] != -1) {
                                    long z15 = e10 == 0 ? vVar4.z() : vVar4.C();
                                    if (z15 != 0) {
                                        String str3 = d0.a;
                                        j10 = d0.Y(z15, 1000000L, z14, RoundingMode.DOWN);
                                    }
                                } else {
                                    i12++;
                                }
                            }
                            long j31 = j10;
                            int D2 = vVar4.D();
                            char[] cArr = {(char) (((D2 >> 10) & 31) + 96), (char) (((D2 >> 5) & 31) + 96), (char) ((D2 & 31) + 96)};
                            for (i13 = 0; i13 < 3; i13++) {
                                char c10 = cArr[i13];
                                if (c10 < 'a' || c10 > 'z') {
                                    str = null;
                                    break;
                                }
                            }
                            str = new String(cArr);
                            j14 = i42.j(1937011556);
                            if (j14 != null) {
                                throw s0.a(null, "Malformed sample table (stbl) missing sample description (stsd)");
                            }
                            a0 i44 = i(j14.c, g1Var, str, oVar, z11);
                            if (z10 || (i15 = dVar3.i(1701082227)) == null) {
                                i14 = i35;
                            } else {
                                f2.e j32 = i15.j(1701606260);
                                if (j32 == null) {
                                    i14 = i35;
                                    create = null;
                                } else {
                                    v vVar5 = j32.c;
                                    vVar5.J(8);
                                    int e11 = e(vVar5.j());
                                    int B = vVar5.B();
                                    long[] jArr11 = new long[B];
                                    long[] jArr12 = new long[B];
                                    int i45 = 0;
                                    while (i45 < B) {
                                        jArr11[i45] = e11 == 1 ? vVar5.C() : vVar5.z();
                                        if (e11 == 1) {
                                            j15 = vVar5.r();
                                            i16 = i35;
                                        } else {
                                            i16 = i35;
                                            j15 = vVar5.j();
                                        }
                                        jArr12[i45] = j15;
                                        if (vVar5.u() != 1) {
                                            throw new IllegalArgumentException("Unsupported media rate.");
                                        }
                                        vVar5.K(2);
                                        i45++;
                                        i35 = i16;
                                    }
                                    i14 = i35;
                                    create = Pair.create(jArr11, jArr12);
                                }
                                if (create != null) {
                                    long[] jArr13 = (long[]) create.first;
                                    jArr2 = (long[]) create.second;
                                    jArr = jArr13;
                                    sVar = (s) i44.d;
                                    if (sVar != null) {
                                        eVar2 = eVar;
                                        oVar2 = null;
                                    } else {
                                        int i46 = g1Var.b;
                                        if (i46 != 0) {
                                            f2.c cVar = new f2.c(i46);
                                            b2.r a10 = sVar.a();
                                            p0 p0Var = ((s) i44.d).l;
                                            a10.k = p0Var != null ? p0Var.a(cVar) : new p0(cVar);
                                            sVar2 = new s(a10);
                                        } else {
                                            sVar2 = sVar;
                                        }
                                        eVar2 = eVar;
                                        oVar2 = new o(g1Var.a, i37, z14, j13, Y, j31, sVar2, i44.b, (p[]) i44.c, i44.a, jArr, jArr2);
                                    }
                                }
                            }
                            jArr = null;
                            jArr2 = null;
                            sVar = (s) i44.d;
                            if (sVar != null) {
                            }
                        }
                    } else {
                        arrayList = arrayList5;
                    }
                    i10 = (j25 == 0 && j26 == -65536 && (j27 == 65536 || j27 == -65536) && j28 == 0) ? 270 : ((j25 == -65536 || j25 == 65536) && j26 == 0 && j27 == 0 && j28 == -65536) ? 180 : 0;
                    vVar3.K(16);
                    short u102 = vVar3.u();
                    vVar3.K(2);
                    short u112 = vVar3.u();
                    g1 g1Var2 = new g1();
                    g1Var2.a = j24;
                    g1Var2.b = D;
                    g1Var2.c = i10;
                    g1Var2.d = u102;
                    g1Var2.e = u112;
                    if (j3 != -9223372036854775807L) {
                    }
                    long j292 = g(j20.c).c;
                    if (j12 != -9223372036854775807L) {
                    }
                    f2.d i412 = i36.i(1835626086);
                    i412.getClass();
                    f2.d i422 = i412.i(1937007212);
                    i422.getClass();
                    f2.e j302 = i36.j(1835296868);
                    j302.getClass();
                    v vVar42 = j302.c;
                    vVar42.J(8);
                    int e102 = e(vVar42.j());
                    vVar42.K(e102 != 0 ? 8 : 16);
                    long z142 = vVar42.z();
                    int i432 = vVar42.b;
                    if (e102 != 0) {
                    }
                    i12 = 0;
                    while (true) {
                        if (i12 < i11) {
                        }
                        i12++;
                    }
                    long j312 = j10;
                    int D22 = vVar42.D();
                    char[] cArr2 = {(char) (((D22 >> 10) & 31) + 96), (char) (((D22 >> 5) & 31) + 96), (char) ((D22 & 31) + 96)};
                    while (i13 < 3) {
                    }
                    str = new String(cArr2);
                    j14 = i422.j(1937011556);
                    if (j14 != null) {
                    }
                }
                o oVar3 = (o) eVar2.apply(oVar2);
                if (oVar3 == null) {
                    arrayList3 = arrayList4;
                } else {
                    s sVar3 = oVar3.g;
                    f2.d i47 = dVar3.i(1835297121);
                    i47.getClass();
                    f2.d i48 = i47.i(1835626086);
                    i48.getClass();
                    f2.d i49 = i48.i(1937007212);
                    i49.getClass();
                    f2.e j33 = i49.j(1937011578);
                    if (j33 != null) {
                        bVar = new b4.d(j33, sVar3);
                    } else {
                        f2.e j34 = i49.j(1937013298);
                        if (j34 == null) {
                            throw s0.a(null, "Track has no sample table size information");
                        }
                        e2.q qVar = new e2.q();
                        v vVar6 = j34.c;
                        qVar.e = vVar6;
                        vVar6.J(12);
                        qVar.b = vVar6.B() & 255;
                        qVar.a = vVar6.B();
                        bVar = qVar;
                    }
                    int b10 = bVar.b();
                    if (b10 == 0) {
                        arrayList3 = arrayList4;
                        rVar = new r(oVar3, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                    } else {
                        if (oVar3.b == 2) {
                            long j35 = oVar3.f;
                            if (j35 > 0) {
                                b2.r a11 = sVar3.a();
                                a11.B = b10 / (j35 / 1000000.0f);
                                oVar3 = oVar3.a(new s(a11));
                            }
                        }
                        s sVar4 = oVar3.g;
                        f2.e j36 = i49.j(1937007471);
                        if (j36 == null) {
                            j36 = i49.j(1668232756);
                            j36.getClass();
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        v vVar7 = j36.c;
                        f2.e j37 = i49.j(1937011555);
                        j37.getClass();
                        v vVar8 = j37.c;
                        f2.e j38 = i49.j(1937011827);
                        j38.getClass();
                        v vVar9 = j38.c;
                        f2.e j39 = i49.j(1937011571);
                        v vVar10 = j39 != null ? j39.c : null;
                        f2.e j40 = i49.j(1668576371);
                        v vVar11 = j40 != null ? j40.c : null;
                        a aVar = new a(vVar8, vVar7, z12);
                        vVar9.J(12);
                        int B2 = vVar9.B() - 1;
                        int B3 = vVar9.B();
                        int B4 = vVar9.B();
                        if (vVar11 != null) {
                            vVar11.J(12);
                            i17 = vVar11.B();
                        } else {
                            i17 = 0;
                        }
                        if (vVar10 != null) {
                            vVar10.J(12);
                            i18 = vVar10.B();
                            if (i18 > 0) {
                                i19 = vVar10.B() - 1;
                                a2 = bVar.a();
                                vVar = vVar11;
                                String str4 = sVar4.r;
                                if (a2 == -1 && (("audio/raw".equals(str4) || "audio/g711-mlaw".equals(str4) || "audio/g711-alaw".equals(str4)) && B2 == 0 && i17 == 0 && i18 == 0)) {
                                    int i50 = aVar.a;
                                    long[] jArr14 = new long[i50];
                                    int[] iArr8 = new int[i50];
                                    while (aVar.a()) {
                                        int i51 = aVar.b;
                                        jArr14[i51] = aVar.d;
                                        iArr8[i51] = aVar.c;
                                    }
                                    long j41 = B4;
                                    int i52 = 8192 / a2;
                                    int i53 = 0;
                                    for (int i54 = 0; i54 < i50; i54++) {
                                        i53 += d0.f(iArr8[i54], i52);
                                    }
                                    long[] jArr15 = new long[i53];
                                    int[] iArr9 = new int[i53];
                                    jArr4 = new long[i53];
                                    int[] iArr10 = new int[i53];
                                    int i55 = 0;
                                    int i56 = 0;
                                    int i57 = 0;
                                    int i58 = 0;
                                    int i59 = 0;
                                    while (i55 < i50) {
                                        int i60 = iArr8[i55];
                                        long j42 = jArr14[i55];
                                        int i61 = i59;
                                        int i62 = i55;
                                        int i63 = i58;
                                        int i64 = i61;
                                        int i65 = i50;
                                        int i66 = i60;
                                        while (i66 > 0) {
                                            int min = Math.min(i52, i66);
                                            jArr15[i64] = j42;
                                            int i67 = i66;
                                            int i68 = a2 * min;
                                            iArr9[i64] = i68;
                                            int i69 = i57 + i68;
                                            i63 = Math.max(i63, i68);
                                            jArr4[i64] = i56 * j41;
                                            iArr10[i64] = 1;
                                            j42 += iArr9[i64];
                                            i56 += min;
                                            i64++;
                                            iArr8 = iArr8;
                                            i66 = i67 - min;
                                            i57 = i69;
                                        }
                                        int[] iArr11 = iArr8;
                                        int i70 = i62 + 1;
                                        i59 = i64;
                                        i58 = i63;
                                        i55 = i70;
                                        iArr8 = iArr11;
                                        i50 = i65;
                                    }
                                    j17 = j41 * i56;
                                    j18 = i57;
                                    arrayList2 = arrayList4;
                                    jArr7 = jArr15;
                                    iArr5 = iArr10;
                                    iArr6 = iArr9;
                                    i29 = i58;
                                } else {
                                    jArr3 = new long[b10];
                                    iArr = new int[b10];
                                    long[] jArr16 = new long[b10];
                                    int[] iArr12 = new int[b10];
                                    i20 = B2;
                                    int i71 = B4;
                                    arrayList2 = arrayList4;
                                    v vVar12 = vVar10;
                                    int i72 = i17;
                                    i21 = i19;
                                    long j43 = 0;
                                    long j44 = 0;
                                    j16 = 0;
                                    int i73 = 0;
                                    i22 = 0;
                                    i23 = 0;
                                    b bVar2 = bVar;
                                    i24 = B3;
                                    i25 = 0;
                                    int i74 = 0;
                                    while (true) {
                                        if (i25 < b10) {
                                            int i75 = b10;
                                            i26 = i18;
                                            i27 = i24;
                                            long[] jArr17 = jArr3;
                                            iArr2 = iArr;
                                            jArr4 = jArr16;
                                            jArr5 = jArr17;
                                            iArr3 = iArr12;
                                            b10 = i75;
                                            break;
                                        }
                                        boolean z16 = true;
                                        while (i22 == 0) {
                                            z16 = aVar.a();
                                            if (!z16) {
                                                break;
                                            }
                                            int i76 = i18;
                                            long j45 = aVar.d;
                                            i22 = aVar.c;
                                            j16 = j45;
                                            i18 = i76;
                                            i24 = i24;
                                            b10 = b10;
                                        }
                                        i30 = b10;
                                        i26 = i18;
                                        i27 = i24;
                                        if (!z16) {
                                            e2.a.n("BoxParsers", "Unexpected end of chunk data");
                                            jArr5 = Arrays.copyOf(jArr3, i25);
                                            iArr2 = Arrays.copyOf(iArr, i25);
                                            long[] copyOf = Arrays.copyOf(jArr16, i25);
                                            iArr3 = Arrays.copyOf(iArr12, i25);
                                            jArr4 = copyOf;
                                            b10 = i25;
                                            break;
                                        }
                                        if (vVar != null) {
                                            int i77 = i23;
                                            while (i77 == 0 && i72 > 0) {
                                                i77 = vVar.B();
                                                i74 = vVar.j();
                                                i72--;
                                            }
                                            i23 = i77 - 1;
                                        }
                                        jArr3[i25] = j16;
                                        int c11 = bVar2.c();
                                        iArr[i25] = c11;
                                        j43 += c11;
                                        if (c11 > i73) {
                                            i73 = c11;
                                        }
                                        jArr16[i25] = j44 + i74;
                                        iArr12[i25] = vVar12 == null ? 1 : 0;
                                        if (i25 == i21) {
                                            iArr12[i25] = 1;
                                            i18 = i26 - 1;
                                            if (i18 > 0) {
                                                vVar12.getClass();
                                                i21 = vVar12.B() - 1;
                                            }
                                            i31 = i21;
                                            jArr8 = jArr3;
                                        } else {
                                            i31 = i21;
                                            jArr8 = jArr3;
                                            i18 = i26;
                                        }
                                        j44 += i71;
                                        int i78 = i27 - 1;
                                        if (i78 == 0 && i20 > 0) {
                                            i78 = vVar9.B();
                                            i20--;
                                            i71 = vVar9.j();
                                        }
                                        int i79 = i78;
                                        j16 += iArr[i25];
                                        i22--;
                                        i25++;
                                        jArr3 = jArr8;
                                        i21 = i31;
                                        i24 = i79;
                                        b10 = i30;
                                    }
                                    i28 = i22;
                                    j17 = j44 + i74;
                                    if (vVar != null) {
                                        while (i72 > 0) {
                                            if (vVar.B() != 0) {
                                                z13 = false;
                                                break;
                                            }
                                            vVar.j();
                                            i72--;
                                        }
                                    }
                                    z13 = true;
                                    if (i26 != 0 && i27 == 0 && i28 == 0 && i20 == 0 && i23 == 0 && z13) {
                                        jArr6 = jArr5;
                                        iArr4 = iArr2;
                                    } else {
                                        StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                                        jArr6 = jArr5;
                                        iArr4 = iArr2;
                                        i2.g.v(sb2, oVar3.a, ": remainingSynchronizationSamples ", i26, ", remainingSamplesAtTimestampDelta ");
                                        i2.g.v(sb2, i27, ", remainingSamplesInChunk ", i28, ", remainingTimestampDeltaChanges ");
                                        sb2.append(i20);
                                        sb2.append(", remainingSamplesAtTimestampOffset ");
                                        sb2.append(i23);
                                        sb2.append(z13 ? ", ctts invalid" : "");
                                        e2.a.n("BoxParsers", sb2.toString());
                                    }
                                    i29 = i73;
                                    iArr5 = iArr3;
                                    jArr7 = jArr6;
                                    iArr6 = iArr4;
                                    j18 = j43;
                                }
                                long j46 = j17;
                                j19 = oVar3.f;
                                if (j19 > 0) {
                                    long Y2 = d0.Y(j18 * 8, 1000000L, j19, RoundingMode.HALF_DOWN);
                                    if (Y2 > 0 && Y2 < 2147483647L) {
                                        b2.r a12 = sVar4.a();
                                        a12.h = (int) Y2;
                                        oVar3 = oVar3.a(new s(a12));
                                    }
                                }
                                long j47 = oVar3.c;
                                s sVar5 = oVar3.g;
                                int i80 = oVar3.b;
                                long[] jArr18 = oVar3.j;
                                jArr9 = oVar3.i;
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long Y3 = d0.Y(j46, 1000000L, j47, roundingMode);
                                if (jArr9 != null) {
                                    d0.X(jArr4, j47);
                                    rVar2 = new r(oVar3, jArr7, iArr6, i29, jArr4, iArr5, Y3);
                                } else {
                                    if (jArr9.length == 1 && i80 == 1 && jArr4.length >= 2) {
                                        jArr18.getClass();
                                        long j48 = jArr18[0];
                                        i32 = b10;
                                        long Y4 = d0.Y(jArr9[0], oVar3.c, oVar3.d, roundingMode) + j48;
                                        int length = jArr4.length - 1;
                                        jArr10 = jArr18;
                                        int h = d0.h(4, 0, length);
                                        int h10 = d0.h(jArr4.length - 4, 0, length);
                                        long j49 = jArr4[0];
                                        if (j49 <= j48 && j48 < jArr4[h] && jArr4[h10] < Y4 && Y4 <= j46) {
                                            long Y5 = d0.Y(j48 - j49, sVar5.K, oVar3.c, roundingMode);
                                            long Y6 = d0.Y(j46 - Y4, sVar5.K, oVar3.c, roundingMode);
                                            if ((Y5 != 0 || Y6 != 0) && Y5 <= 2147483647L && Y6 <= 2147483647L) {
                                                wVar.a = (int) Y5;
                                                wVar.b = (int) Y6;
                                                d0.X(jArr4, j47);
                                                rVar2 = new r(oVar3, jArr7, iArr6, i29, jArr4, iArr5, d0.Y(jArr9[0], 1000000L, oVar3.d, roundingMode));
                                            }
                                        }
                                    } else {
                                        jArr10 = jArr18;
                                        i32 = b10;
                                    }
                                    int i81 = 1;
                                    if (jArr9.length == 1) {
                                        if (jArr9[0] == 0) {
                                            jArr10.getClass();
                                            long j50 = jArr10[0];
                                            for (int i82 = 0; i82 < jArr4.length; i82++) {
                                                jArr4[i82] = d0.Y(jArr4[i82] - j50, 1000000L, oVar3.c, RoundingMode.DOWN);
                                            }
                                            r rVar3 = new r(oVar3, jArr7, iArr6, i29, jArr4, iArr5, d0.Y(j46 - j50, 1000000L, oVar3.c, RoundingMode.DOWN));
                                            arrayList3 = arrayList2;
                                            rVar = rVar3;
                                            arrayList3.add(rVar);
                                        } else {
                                            i81 = 1;
                                        }
                                    }
                                    long[] jArr19 = jArr7;
                                    int[] iArr13 = iArr6;
                                    int[] iArr14 = iArr5;
                                    boolean z17 = i80 == i81;
                                    int[] iArr15 = new int[jArr9.length];
                                    int[] iArr16 = new int[jArr9.length];
                                    jArr10.getClass();
                                    int i83 = 0;
                                    boolean z18 = false;
                                    int i84 = 0;
                                    int i85 = 0;
                                    while (i83 < jArr9.length) {
                                        int[] iArr17 = iArr15;
                                        int[] iArr18 = iArr16;
                                        long j51 = jArr10[i83];
                                        if (j51 != -1) {
                                            i33 = i83;
                                            boolean z19 = z18;
                                            long Y7 = d0.Y(jArr9[i83], oVar3.c, oVar3.d, RoundingMode.DOWN);
                                            iArr7 = iArr17;
                                            iArr7[i33] = d0.e(jArr4, j51, true);
                                            long j52 = j51 + Y7;
                                            iArr18[i33] = d0.a(jArr4, j52, z17);
                                            int i86 = iArr7[i33];
                                            while (true) {
                                                i34 = iArr7[i33];
                                                if (i34 < 0 || (iArr14[i34] & 1) != 0) {
                                                    break;
                                                }
                                                iArr7[i33] = i34 - 1;
                                            }
                                            if (i34 < 0) {
                                                iArr7[i33] = i86;
                                                while (true) {
                                                    int i87 = iArr7[i33];
                                                    if (i87 >= iArr18[i33] || (iArr14[i87] & 1) != 0) {
                                                        break;
                                                    }
                                                    iArr7[i33] = i87 + 1;
                                                }
                                            }
                                            if (i80 == 2 && iArr7[i33] != iArr18[i33]) {
                                                while (true) {
                                                    int i88 = iArr18[i33];
                                                    if (i88 >= jArr4.length - 1) {
                                                        break;
                                                    }
                                                    int i89 = i88 + 1;
                                                    if (jArr4[i89] > j52) {
                                                        break;
                                                    }
                                                    iArr18[i33] = i89;
                                                }
                                            }
                                            int i90 = iArr18[i33];
                                            int i91 = iArr7[i33];
                                            int i92 = (i90 - i91) + i84;
                                            boolean z20 = i85 != i91;
                                            i85 = i90;
                                            z18 = z19 | z20;
                                            i84 = i92;
                                        } else {
                                            iArr7 = iArr17;
                                            i33 = i83;
                                        }
                                        i83 = i33 + 1;
                                        iArr16 = iArr18;
                                        iArr15 = iArr7;
                                    }
                                    int[] iArr19 = iArr15;
                                    int[] iArr20 = iArr16;
                                    boolean z21 = z18 | (i84 != i32);
                                    long[] jArr20 = z21 ? new long[i84] : jArr19;
                                    int[] iArr21 = z21 ? new int[i84] : iArr13;
                                    if (z21) {
                                        i29 = 0;
                                    }
                                    int[] iArr22 = z21 ? new int[i84] : iArr14;
                                    long[] jArr21 = new long[i84];
                                    int i93 = i29;
                                    long j53 = 0;
                                    int i94 = 0;
                                    boolean z22 = false;
                                    int i95 = 0;
                                    while (i94 < jArr9.length) {
                                        long j54 = jArr10[i94];
                                        int i96 = iArr19[i94];
                                        boolean z23 = z21;
                                        int i97 = iArr20[i94];
                                        if (z23) {
                                            int i98 = i97 - i96;
                                            System.arraycopy(jArr19, i96, jArr20, i95, i98);
                                            System.arraycopy(iArr13, i96, iArr21, i95, i98);
                                            System.arraycopy(iArr14, i96, iArr22, i95, i98);
                                        }
                                        int i99 = i93;
                                        while (i96 < i97) {
                                            int i100 = i97;
                                            long[] jArr22 = jArr20;
                                            long j55 = oVar3.d;
                                            RoundingMode roundingMode2 = RoundingMode.DOWN;
                                            long Y8 = d0.Y(j53, 1000000L, j55, roundingMode2);
                                            long Y9 = d0.Y(jArr4[i96] - j54, 1000000L, oVar3.c, roundingMode2);
                                            if (Y9 < 0) {
                                                z22 = true;
                                            }
                                            jArr21[i95] = Y8 + Y9;
                                            if (z23 && iArr21[i95] > i99) {
                                                i99 = iArr13[i96];
                                            }
                                            i95++;
                                            i96++;
                                            i97 = i100;
                                            jArr20 = jArr22;
                                        }
                                        j53 += jArr9[i94];
                                        i94++;
                                        i93 = i99;
                                        z21 = z23;
                                        jArr20 = jArr20;
                                    }
                                    long[] jArr23 = jArr20;
                                    long Y10 = d0.Y(j53, 1000000L, oVar3.d, RoundingMode.DOWN);
                                    if (z22) {
                                        b2.r a13 = sVar5.a();
                                        a13.w = true;
                                        oVar3 = oVar3.a(new s(a13));
                                    }
                                    arrayList3 = arrayList2;
                                    rVar = new r(oVar3, jArr23, iArr21, i93, jArr21, iArr22, Y10);
                                    arrayList3.add(rVar);
                                }
                                arrayList3 = arrayList2;
                                rVar = rVar2;
                            } else {
                                vVar10 = null;
                            }
                        } else {
                            i18 = 0;
                        }
                        i19 = -1;
                        a2 = bVar.a();
                        vVar = vVar11;
                        String str42 = sVar4.r;
                        if (a2 == -1) {
                        }
                        jArr3 = new long[b10];
                        iArr = new int[b10];
                        long[] jArr162 = new long[b10];
                        int[] iArr122 = new int[b10];
                        i20 = B2;
                        int i712 = B4;
                        arrayList2 = arrayList4;
                        v vVar122 = vVar10;
                        int i722 = i17;
                        i21 = i19;
                        long j432 = 0;
                        long j442 = 0;
                        j16 = 0;
                        int i732 = 0;
                        i22 = 0;
                        i23 = 0;
                        b bVar22 = bVar;
                        i24 = B3;
                        i25 = 0;
                        int i742 = 0;
                        while (true) {
                            if (i25 < b10) {
                            }
                            int i792 = i78;
                            j16 += iArr[i25];
                            i22--;
                            i25++;
                            jArr3 = jArr8;
                            i21 = i31;
                            i24 = i792;
                            b10 = i30;
                        }
                        i28 = i22;
                        j17 = j442 + i742;
                        if (vVar != null) {
                        }
                        z13 = true;
                        if (i26 != 0) {
                        }
                        StringBuilder sb22 = new StringBuilder("Inconsistent stbl box for track ");
                        jArr6 = jArr5;
                        iArr4 = iArr2;
                        i2.g.v(sb22, oVar3.a, ": remainingSynchronizationSamples ", i26, ", remainingSamplesAtTimestampDelta ");
                        i2.g.v(sb22, i27, ", remainingSamplesInChunk ", i28, ", remainingTimestampDeltaChanges ");
                        sb22.append(i20);
                        sb22.append(", remainingSamplesAtTimestampOffset ");
                        sb22.append(i23);
                        sb22.append(z13 ? ", ctts invalid" : "");
                        e2.a.n("BoxParsers", sb22.toString());
                        i29 = i732;
                        iArr5 = iArr3;
                        jArr7 = jArr6;
                        iArr6 = iArr4;
                        j18 = j432;
                        long j462 = j17;
                        j19 = oVar3.f;
                        if (j19 > 0) {
                        }
                        long j472 = oVar3.c;
                        s sVar52 = oVar3.g;
                        int i802 = oVar3.b;
                        long[] jArr182 = oVar3.j;
                        jArr9 = oVar3.i;
                        RoundingMode roundingMode3 = RoundingMode.DOWN;
                        long Y32 = d0.Y(j462, 1000000L, j472, roundingMode3);
                        if (jArr9 != null) {
                        }
                        arrayList3 = arrayList2;
                        rVar = rVar2;
                    }
                    arrayList3.add(rVar);
                }
            }
            i35 = i14 + 1;
            dVar2 = dVar;
            arrayList4 = arrayList3;
        }
        return arrayList4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ba, code lost:
    
        r1.J(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01a3, code lost:
    
        r1.J(r9);
        r1.K(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b6, code lost:
    
        r9 = new q3.l(r0, r8, r1.t(r10 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x023d, code lost:
    
        e2.a.d("MetadataUtil", "Skipped unknown metadata entry: " + dd.k.b(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0250, code lost:
    
        r1.J(r15);
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0079, code lost:
    
        r0 = q3.k.a(w3.n.h(r1) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0082, code lost:
    
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0084, code lost:
    
        r9 = new q3.o("TCON", r12, e9.i0.z(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x008e, code lost:
    
        e2.a.n("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0093, code lost:
    
        r9 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00a8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0270, code lost:
    
        r1.J(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0273, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01c4, code lost:
    
        r0 = 16777215 & r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01cb, code lost:
    
        if (r0 != 6516084) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01cd, code lost:
    
        r9 = w3.n.e(r13, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01d5, code lost:
    
        if (r0 == 7233901) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01da, code lost:
    
        if (r0 != 7631467) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01e1, code lost:
    
        if (r0 == 6516589) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01e6, code lost:
    
        if (r0 != 7828084) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01ed, code lost:
    
        if (r0 != 6578553) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01ef, code lost:
    
        r9 = w3.n.l(r13, r1, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01f9, code lost:
    
        if (r0 != 4280916) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01fb, code lost:
    
        r9 = w3.n.l(r13, r1, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        r1.J(r7);
        r7 = r7 + r13;
        r1.K(r0);
        r6 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0205, code lost:
    
        if (r0 != 7630703) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0207, code lost:
    
        r9 = w3.n.l(r13, r1, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0211, code lost:
    
        if (r0 != 6384738) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0213, code lost:
    
        r9 = w3.n.l(r13, r1, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x021d, code lost:
    
        if (r0 != 7108978) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x021f, code lost:
    
        r9 = w3.n.l(r13, r1, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0229, code lost:
    
        if (r0 != 6776174) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        r13 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x022b, code lost:
    
        r9 = w3.n.l(r13, r1, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0233, code lost:
    
        if (r0 != 6779504) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0235, code lost:
    
        r9 = w3.n.l(r13, r1, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0255, code lost:
    
        r9 = w3.n.l(r13, r1, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x025d, code lost:
    
        r9 = w3.n.l(r13, r1, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x027a, code lost:
    
        if (r6.isEmpty() == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        if (r13 >= r7) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x027e, code lost:
    
        r12 = new b2.p0(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        r15 = r1.j() + r13;
        r13 = r1.j();
        r0 = (r13 >> 24) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        if (r0 == 169) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (r0 != 253) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        if (r13 != 1735291493) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009f, code lost:
    
        if (r13 != 1684632427) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a1, code lost:
    
        r9 = w3.n.g(r13, r1, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        r1.J(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0265, code lost:
    
        if (r9 == null) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0267, code lost:
    
        r6.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x026a, code lost:
    
        r3 = false;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ae, code lost:
    
        if (r13 != 1953655662) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b0, code lost:
    
        r9 = w3.n.g(r13, r1, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
    
        if (r13 != 1953329263) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bc, code lost:
    
        r9 = w3.n.i(r13, "TBPM", r1, true, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
    
        if (r13 != 1668311404) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
    
        r9 = w3.n.i(r13, "TCMP", r1, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d2, code lost:
    
        if (r13 != 1668249202) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d4, code lost:
    
        r9 = w3.n.f(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dc, code lost:
    
        if (r13 != 1631670868) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00de, code lost:
    
        r9 = w3.n.l(r13, r1, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e8, code lost:
    
        if (r13 != 1936682605) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ea, code lost:
    
        r9 = w3.n.l(r13, r1, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f4, code lost:
    
        if (r13 != 1936679276) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f6, code lost:
    
        r9 = w3.n.l(r13, r1, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0100, code lost:
    
        if (r13 != 1936679282) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0102, code lost:
    
        r9 = w3.n.l(r13, r1, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010c, code lost:
    
        if (r13 != 1936679265) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010e, code lost:
    
        r9 = w3.n.l(r13, r1, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0119, code lost:
    
        if (r13 != 1936679791) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011b, code lost:
    
        r9 = w3.n.l(r13, r1, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0126, code lost:
    
        if (r13 != 1920233063) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0128, code lost:
    
        r9 = w3.n.i(r13, "ITUNESADVISORY", r1, r3, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0133, code lost:
    
        if (r13 != 1885823344) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0135, code lost:
    
        r9 = w3.n.i(r13, "ITUNESGAPLESS", r1, r3, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0140, code lost:
    
        if (r13 != 1936683886) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0142, code lost:
    
        r9 = w3.n.l(r13, r1, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014d, code lost:
    
        if (r13 != 1953919848) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014f, code lost:
    
        r9 = w3.n.l(r13, r1, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015a, code lost:
    
        if (r13 != 757935405) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015c, code lost:
    
        r0 = r12;
        r8 = r0;
        r9 = -1;
        r10 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0160, code lost:
    
        r13 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0162, code lost:
    
        if (r13 >= r15) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0164, code lost:
    
        r14 = r1.j();
        r12 = r1.j();
        r1.K(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0175, code lost:
    
        if (r12 != 1835360622) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0177, code lost:
    
        r0 = r1.t(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0181, code lost:
    
        if (r12 != 1851878757) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0183, code lost:
    
        r8 = r1.t(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x018d, code lost:
    
        if (r12 != 1684108385) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x018f, code lost:
    
        r9 = r13;
        r10 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0191, code lost:
    
        r1.K(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x019b, code lost:
    
        if (r0 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x019d, code lost:
    
        if (r8 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01a0, code lost:
    
        if (r9 != (-1)) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b9, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0328  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static p0 k(f2.e eVar) {
        p0 p0Var;
        p0 b10;
        p0 p0Var2;
        int i10;
        v vVar = eVar.c;
        int i11 = 8;
        vVar.J(8);
        boolean z10 = false;
        p0 p0Var3 = new p0(new o0[0]);
        while (vVar.a() >= i11) {
            int i12 = vVar.b;
            int j3 = vVar.j();
            int j10 = vVar.j();
            String str = null;
            if (j10 == 1835365473) {
                vVar.J(i12);
                int i13 = i12 + j3;
                vVar.K(i11);
                a(vVar);
                while (true) {
                    int i14 = vVar.b;
                    if (i14 >= i13) {
                        break;
                    }
                    int j11 = vVar.j();
                    if (vVar.j() == 1768715124) {
                        break;
                    }
                    vVar.J(i14 + j11);
                    i11 = 8;
                    z10 = false;
                    str = null;
                }
                p0 p0Var4 = null;
                p0Var3 = p0Var3.b(p0Var4);
            } else {
                if (j10 == 1936553057) {
                    vVar.J(i12);
                    int i15 = i12 + j3;
                    vVar.K(12);
                    while (true) {
                        int i16 = vVar.b;
                        if (i16 >= i15) {
                            break;
                        }
                        int j12 = vVar.j();
                        if (vVar.j() != 1935766900) {
                            vVar.J(i16 + j12);
                        } else if (j12 < 16) {
                            p0Var2 = null;
                        } else {
                            vVar.K(4);
                            int i17 = 0;
                            int i18 = -1;
                            for (int i19 = 0; i19 < 2; i19++) {
                                int x10 = vVar.x();
                                int x11 = vVar.x();
                                if (x10 == 0) {
                                    i18 = x11;
                                } else if (x10 == 1) {
                                    i17 = x11;
                                }
                            }
                            if (i18 == 12) {
                                i10 = 240;
                            } else if (i18 == 13) {
                                i10 = 120;
                            } else if (i18 != 21) {
                                i10 = -2147483647;
                            } else {
                                if (vVar.a() >= 8 && vVar.b + 8 <= i15) {
                                    int j13 = vVar.j();
                                    int j14 = vVar.j();
                                    if (j13 >= 12 && j14 == 1936877170) {
                                        i10 = vVar.y();
                                        if (i10 != -2147483647) {
                                            p0Var2 = new p0(new r3.d(i10, i17));
                                        }
                                    }
                                }
                                i10 = -2147483647;
                                if (i10 != -2147483647) {
                                }
                            }
                            if (i10 != -2147483647) {
                            }
                        }
                    }
                    p0Var2 = null;
                    b10 = p0Var3.b(p0Var2);
                } else if (j10 == -1451722374) {
                    short u10 = vVar.u();
                    vVar.K(2);
                    String v = vVar.v(u10, StandardCharsets.UTF_8);
                    int max = Math.max(v.lastIndexOf(43), v.lastIndexOf(45));
                    try {
                        f2.f fVar = new f2.f(Float.parseFloat(v.substring(0, max)), Float.parseFloat(v.substring(max, v.length() - 1)));
                        o0[] o0VarArr = new o0[1];
                        try {
                            o0VarArr[0] = fVar;
                            p0Var = new p0(o0VarArr);
                        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                            p0Var = null;
                            b10 = p0Var3.b(p0Var);
                            p0Var3 = b10;
                            vVar.J(i12 + j3);
                            i11 = 8;
                            z10 = false;
                        }
                    } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                    }
                    b10 = p0Var3.b(p0Var);
                }
                p0Var3 = b10;
            }
            vVar.J(i12 + j3);
            i11 = 8;
            z10 = false;
        }
        return p0Var3;
    }
}
