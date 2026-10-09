package w3;

import a3.z;
import android.util.Pair;
import b2.o0;
import b2.p0;
import b2.r0;
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
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;
import s4.i1;
import u2.x0;
import v7.v7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class e {
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

    /* JADX WARN: Code restructure failed: missing block: B:319:0x05a0, code lost:
    
        if (r14 == 2) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x018f, code lost:
    
        if (r11 == (-1)) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:227:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0835 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x09e5 A[LOOP:18: B:459:0x09e5->B:469:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0a22  */
    /* JADX WARN: Removed duplicated region for block: B:471:? A[LOOP:17: B:454:0x09ce->B:471:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:472:? A[LOOP:16: B:451:0x09c6->B:472:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:473:? A[LOOP:15: B:447:0x09ac->B:473:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(v vVar, int i10, int i11, int i12, int i13, String str, boolean z10, b2.o oVar, a0 a0Var, int i14) {
        int i15;
        int i16;
        int i17;
        int y3;
        int j3;
        int i18;
        int i19;
        int i20;
        b2.o oVar2;
        String str2;
        String str3;
        List list;
        int i21;
        int i22;
        int i23;
        String str4;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        x0 x0Var;
        String str5;
        String str6;
        x0 x0Var2;
        int i30;
        int i31;
        int i32;
        int i33;
        v vVar2;
        String v;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        boolean h;
        int i42;
        int i43;
        int i44;
        int i45;
        boolean z11;
        int i46;
        boolean h10;
        int i47;
        boolean z12;
        String str7;
        String format;
        int i48;
        v vVar3 = vVar;
        int i49 = i10;
        int i50 = i12;
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
        int i51 = 0;
        if (i15 == 0 || i15 == 1) {
            i16 = 2;
            i17 = 4;
            int D = vVar3.D();
            vVar3.K(6);
            y3 = vVar3.y();
            vVar3.J(vVar3.b - 4);
            j3 = vVar3.j();
            if (i15 == 1) {
                vVar3.K(16);
            }
            i18 = D;
            i19 = -1;
        } else {
            if (i15 != 2) {
                return;
            }
            vVar3.K(16);
            i16 = 2;
            int round = (int) Math.round(Double.longBitsToDouble(vVar3.r()));
            i18 = vVar3.B();
            vVar3.K(4);
            i17 = 4;
            int B = vVar3.B();
            int B2 = vVar3.B();
            boolean z13 = (B2 & 1) != 0;
            boolean z14 = (B2 & 2) != 0;
            if (z13) {
                if (B == 32) {
                    i48 = 4;
                    vVar3.K(8);
                    y3 = round;
                    i19 = i48;
                    j3 = 0;
                }
                i48 = -1;
                vVar3.K(8);
                y3 = round;
                i19 = i48;
                j3 = 0;
            } else {
                if (B == 8) {
                    i48 = 3;
                } else if (B == 16) {
                    i48 = z14 ? TLObject.FLAG_28 : 2;
                } else if (B == 24) {
                    i48 = z14 ? 1342177280 : 21;
                } else {
                    if (B == 32) {
                        i48 = z14 ? 1610612736 : 22;
                    }
                    i48 = -1;
                }
                vVar3.K(8);
                y3 = round;
                i19 = i48;
                j3 = 0;
            }
        }
        if (i49 == 1767992678) {
            i18 = -1;
            y3 = -1;
        } else {
            if (i49 != 1935764850) {
                i20 = i49 == 1935767394 ? androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE : 8000;
            }
            y3 = i20;
            i18 = 1;
        }
        int i52 = vVar3.b;
        if (i49 == 1701733217) {
            Pair h11 = h(vVar3, i11, i50);
            if (h11 != null) {
                i49 = ((Integer) h11.first).intValue();
                oVar2 = oVar == null ? null : oVar.a(((r) h11.second).b);
                ((r[]) a0Var.d)[i14] = (r) h11.second;
            } else {
                oVar2 = oVar;
            }
            vVar3.J(i52);
        } else {
            oVar2 = oVar;
        }
        String str8 = "audio/mhm1";
        if (i49 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i49 == 1700998451) {
            str2 = "audio/eac3";
        } else if (i49 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i49 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (i49 == 1685353320 || i49 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (i49 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i49 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i49 == 1935764850) {
            str2 = "audio/3gpp";
        } else if (i49 == 1935767394) {
            str2 = "audio/amr-wb";
        } else {
            if (i49 != 1936684916) {
                if (i49 == 1953984371) {
                    str2 = "audio/raw";
                    i19 = TLObject.FLAG_28;
                } else if (i49 != 1819304813) {
                    str2 = (i49 == 778924082 || i49 == 778924083) ? "audio/mpeg" : i49 == 1835557169 ? "audio/mha1" : i49 == 1835560241 ? "audio/mhm1" : i49 == 1634492771 ? "audio/alac" : i49 == 1634492791 ? "audio/g711-alaw" : i49 == 1970037111 ? "audio/g711-mlaw" : i49 == 1332770163 ? "audio/opus" : i49 == 1716281667 ? "audio/flac" : i49 == 1835823201 ? "audio/true-hd" : i49 == 1767992678 ? "audio/iamf" : null;
                }
            }
            i19 = i16;
            str2 = "audio/raw";
        }
        x0 x0Var3 = null;
        String str9 = null;
        List list2 = null;
        z zVar = null;
        while (i52 - i11 < i50) {
            vVar3.J(i52);
            int j10 = vVar3.j();
            int i53 = i19;
            c3.b.c("childAtomSize must be positive", j10 > 0 ? 1 : i51);
            int j11 = vVar3.j();
            String str10 = str9;
            if (j11 == 1835557187) {
                vVar3.J(i52 + 8);
                vVar3.K(1);
                int x10 = vVar3.x();
                vVar3.K(1);
                if (Objects.equals(str2, str8)) {
                    Object[] objArr = new Object[1];
                    objArr[i51] = Integer.valueOf(x10);
                    format = String.format("mhm1.%02X", objArr);
                } else {
                    Object[] objArr2 = new Object[1];
                    objArr2[i51] = Integer.valueOf(x10);
                    format = String.format("mha1.%02X", objArr2);
                }
                int D2 = vVar3.D();
                byte[] bArr = new byte[D2];
                String str11 = format;
                int i54 = i51;
                vVar3.h(i54, D2, bArr);
                list2 = list2 == null ? i0.z(bArr) : i0.A(bArr, (byte[]) list2.get(i54));
                x0Var = x0Var3;
                str9 = str11;
                str6 = str2;
                i28 = i52;
                str4 = str8;
                i19 = i53;
            } else if (j11 == 1835557200) {
                vVar3.J(i52 + 8);
                int x11 = vVar3.x();
                if (x11 > 0) {
                    byte[] bArr2 = new byte[x11];
                    vVar3.h(0, x11, bArr2);
                    list2 = list2 == null ? i0.z(bArr2) : i0.A((byte[]) list2.get(0), bArr2);
                }
                x0Var = x0Var3;
                str6 = str2;
                i28 = i52;
                str4 = str8;
                i19 = i53;
                str9 = str10;
            } else {
                if (j11 == 1702061171) {
                    str3 = str2;
                    list = list2;
                    i21 = j10;
                    i22 = i52;
                    i23 = i18;
                    str4 = str8;
                    i24 = i49;
                    i25 = y3;
                    i26 = 1702061171;
                } else if (z10 && j11 == 2002876005) {
                    str3 = str2;
                    list = list2;
                    i21 = j10;
                    i22 = i52;
                    i23 = i18;
                    str4 = str8;
                    i26 = 1702061171;
                    i24 = i49;
                    i25 = y3;
                } else if (j11 == 1651798644) {
                    vVar3.J(i52 + 8);
                    vVar3.K(i17);
                    z zVar2 = new z(vVar3.z(), vVar3.z());
                    x0Var = x0Var3;
                    str6 = str2;
                    i28 = i52;
                    zVar = zVar2;
                    str4 = str8;
                    i19 = i53;
                    str9 = str10;
                    j10 = j10;
                    list2 = list2;
                } else {
                    List list3 = list2;
                    if (j11 == 1684103987) {
                        vVar3.J(i52 + 8);
                        String num = Integer.toString(i13);
                        a4.g gVar = new a4.g();
                        gVar.p(vVar3);
                        int i55 = iArr2[gVar.i(i16)];
                        gVar.t(8);
                        int i56 = iArr[gVar.i(3)];
                        if (gVar.i(1) != 0) {
                            i56++;
                        }
                        int i57 = c3.b.g[gVar.i(5)] * MediaDataController.MAX_STYLE_RUNS_COUNT;
                        gVar.c();
                        vVar3.J(gVar.f());
                        b2.r rVar = new b2.r();
                        rVar.a = num;
                        rVar.q = r0.n("audio/ac3");
                        rVar.I = i56;
                        rVar.J = i55;
                        rVar.u = oVar2;
                        rVar.d = str;
                        rVar.h = i57;
                        rVar.i = i57;
                        a0Var.e = new b2.s(rVar);
                        str6 = str2;
                        i30 = i52;
                        i31 = i18;
                        str4 = str8;
                    } else if (j11 == 1684366131) {
                        vVar3.J(i52 + 8);
                        String num2 = Integer.toString(i13);
                        a4.g gVar2 = new a4.g();
                        gVar2.p(vVar3);
                        int i58 = gVar2.i(13) * MediaDataController.MAX_STYLE_RUNS_COUNT;
                        gVar2.t(3);
                        int i59 = iArr2[gVar2.i(2)];
                        gVar2.t(10);
                        int i60 = iArr[gVar2.i(3)];
                        if (gVar2.i(1) != 0) {
                            i60++;
                        }
                        int i61 = i60;
                        gVar2.t(3);
                        int i62 = gVar2.i(4);
                        gVar2.t(1);
                        if (i62 > 0) {
                            str6 = str2;
                            gVar2.t(6);
                            if (gVar2.i(1) != 0) {
                                i61 += 2;
                            }
                            gVar2.t(1);
                        } else {
                            str6 = str2;
                        }
                        int i63 = i61;
                        str4 = str8;
                        if (gVar2.b() > 7) {
                            gVar2.t(7);
                            if (gVar2.i(1) != 0) {
                                str7 = "audio/eac3-joc";
                                gVar2.c();
                                vVar3.J(gVar2.f());
                                b2.r rVar2 = new b2.r();
                                rVar2.a = num2;
                                rVar2.q = r0.n(str7);
                                rVar2.I = i63;
                                rVar2.J = i59;
                                rVar2.u = oVar2;
                                rVar2.d = str;
                                rVar2.i = i58;
                                a0Var.e = new b2.s(rVar2);
                                i30 = i52;
                                i31 = i18;
                            }
                        }
                        str7 = "audio/eac3";
                        gVar2.c();
                        vVar3.J(gVar2.f());
                        b2.r rVar22 = new b2.r();
                        rVar22.a = num2;
                        rVar22.q = r0.n(str7);
                        rVar22.I = i63;
                        rVar22.J = i59;
                        rVar22.u = oVar2;
                        rVar22.d = str;
                        rVar22.i = i58;
                        a0Var.e = new b2.s(rVar22);
                        i30 = i52;
                        i31 = i18;
                    } else {
                        str6 = str2;
                        str4 = str8;
                        if (j11 == 1684103988) {
                            vVar3.J(i52 + 8);
                            String num3 = Integer.toString(i13);
                            a4.g gVar3 = new a4.g();
                            gVar3.p(vVar3);
                            int b10 = gVar3.b();
                            int i64 = gVar3.i(3);
                            if (i64 > 1) {
                                throw s0.c("Unsupported AC-4 DSI version: " + i64);
                            }
                            int i65 = gVar3.i(7);
                            int i66 = gVar3.h() ? 48000 : 44100;
                            gVar3.t(4);
                            int i67 = gVar3.i(9);
                            if (i65 > 1) {
                                if (i64 == 0) {
                                    throw s0.c("Invalid AC-4 DSI version: " + i64);
                                }
                                if (gVar3.h()) {
                                    gVar3.t(16);
                                    if (gVar3.h()) {
                                        gVar3.t(128);
                                    }
                                }
                            }
                            if (i64 == 1) {
                                i34 = i65;
                                if (gVar3.b() < 66) {
                                    throw s0.c("Invalid AC-4 DSI bitrate.");
                                }
                                gVar3.t(66);
                                gVar3.c();
                            } else {
                                i34 = i65;
                            }
                            c3.c cVar = new c3.c();
                            cVar.a = true;
                            cVar.b = -1;
                            cVar.c = -1;
                            cVar.d = true;
                            i30 = i52;
                            cVar.e = 2;
                            cVar.f = 1;
                            cVar.g = 0;
                            int i68 = 0;
                            while (i68 < i67) {
                                if (i64 == 0) {
                                    h = gVar3.h();
                                    i37 = y3;
                                    i42 = gVar3.i(5);
                                    i43 = gVar3.i(5);
                                    i44 = 0;
                                    i45 = 0;
                                    z11 = false;
                                } else {
                                    int i69 = i67;
                                    int i70 = gVar3.i(8);
                                    i37 = y3;
                                    int i71 = gVar3.i(8);
                                    int i72 = i71 == 255 ? gVar3.i(16) + i71 : i71;
                                    if (i70 > 2) {
                                        gVar3.t(i72 * 8);
                                        i68++;
                                        i67 = i69;
                                        y3 = i37;
                                    } else {
                                        int b11 = (b10 - gVar3.b()) / 8;
                                        i42 = gVar3.i(5);
                                        z11 = i42 == 31;
                                        i43 = i70;
                                        i45 = b11;
                                        i44 = i72;
                                        h = false;
                                    }
                                }
                                cVar.f = i43;
                                i36 = i18;
                                if (h || z11 || i42 != 6) {
                                    i35 = i49;
                                    cVar.g = gVar3.i(3);
                                    if (gVar3.h()) {
                                        gVar3.t(5);
                                    }
                                    gVar3.t(2);
                                    if (i64 == 1 && (i43 == 1 || i43 == 2)) {
                                        gVar3.t(2);
                                    }
                                    gVar3.t(5);
                                    gVar3.t(10);
                                    if (i64 == 1) {
                                        if (i43 > 0) {
                                            cVar.a = gVar3.h();
                                        }
                                        if (cVar.a) {
                                            if (i43 != 1) {
                                                i47 = 2;
                                            }
                                            int i73 = gVar3.i(5);
                                            if (i73 >= 0 && i73 <= 15) {
                                                cVar.b = i73;
                                            }
                                            if (i73 < 11 || i73 > 14) {
                                                i47 = 2;
                                            } else {
                                                cVar.d = gVar3.h();
                                                i47 = 2;
                                                cVar.e = gVar3.i(2);
                                            }
                                            gVar3.t(24);
                                        } else {
                                            i47 = 2;
                                        }
                                        if (i43 == 1 || i43 == i47) {
                                            if (gVar3.h() && gVar3.h()) {
                                                gVar3.t(i47);
                                            }
                                            if (gVar3.h()) {
                                                gVar3.s();
                                                int i74 = 8;
                                                int i75 = gVar3.i(8);
                                                i46 = i43;
                                                int i76 = 0;
                                                while (i76 < i75) {
                                                    gVar3.t(i74);
                                                    i76++;
                                                    i74 = 8;
                                                }
                                                if (h && !z11) {
                                                    gVar3.s();
                                                    if (i42 == 0 || i42 == 1 || i42 == 2) {
                                                        if (i46 == 0) {
                                                            for (int i77 = 0; i77 < 2; i77++) {
                                                                c3.b.o(gVar3, cVar);
                                                            }
                                                        } else {
                                                            for (int i78 = 0; i78 < 2; i78++) {
                                                                c3.b.p(gVar3, cVar);
                                                            }
                                                        }
                                                    } else if (i42 == 3 || i42 == 4) {
                                                        if (i46 == 0) {
                                                            for (int i79 = 0; i79 < 3; i79++) {
                                                                c3.b.o(gVar3, cVar);
                                                            }
                                                        } else {
                                                            for (int i80 = 0; i80 < 3; i80++) {
                                                                c3.b.p(gVar3, cVar);
                                                            }
                                                        }
                                                    } else if (i42 != 5) {
                                                        int i81 = gVar3.i(7);
                                                        for (int i82 = 0; i82 < i81; i82++) {
                                                            gVar3.t(8);
                                                        }
                                                    } else if (i46 == 0) {
                                                        c3.b.o(gVar3, cVar);
                                                    } else {
                                                        int i83 = gVar3.i(3);
                                                        for (int i84 = 0; i84 < i83 + 2; i84++) {
                                                            c3.b.p(gVar3, cVar);
                                                        }
                                                    }
                                                } else if (i46 != 0) {
                                                    c3.b.o(gVar3, cVar);
                                                } else {
                                                    c3.b.p(gVar3, cVar);
                                                }
                                                gVar3.s();
                                                h10 = gVar3.h();
                                            }
                                        }
                                    }
                                    i46 = i43;
                                    if (h) {
                                    }
                                    if (i46 != 0) {
                                    }
                                    gVar3.s();
                                    h10 = gVar3.h();
                                } else {
                                    i35 = i49;
                                    i46 = i43;
                                    h10 = true;
                                }
                                if (h10) {
                                    int i85 = gVar3.i(7);
                                    for (int i86 = 0; i86 < i85; i86++) {
                                        gVar3.t(15);
                                    }
                                }
                                if (i46 > 0) {
                                    if (gVar3.h()) {
                                        if (gVar3.b() < 66) {
                                            z12 = false;
                                        } else {
                                            gVar3.t(66);
                                            z12 = true;
                                        }
                                        if (!z12) {
                                            throw s0.c("Can't parse bitrate DSI.");
                                        }
                                    }
                                    if (gVar3.h()) {
                                        gVar3.c();
                                        gVar3.u(gVar3.i(16));
                                        int i87 = gVar3.i(5);
                                        for (int i88 = 0; i88 < i87; i88++) {
                                            gVar3.t(3);
                                            gVar3.t(8);
                                        }
                                        i38 = 8;
                                        gVar3.c();
                                        if (i64 == 1) {
                                            int b12 = ((b10 - gVar3.b()) / 8) - i45;
                                            if (i44 < b12) {
                                                throw s0.c("pres_bytes is smaller than presentation bytes read.");
                                            }
                                            gVar3.u(i44 - b12);
                                        }
                                        if (cVar.a && cVar.b == -1) {
                                            throw s0.c("Can't determine channel mode of presentation " + i68);
                                        }
                                        i39 = 12;
                                        if (cVar.a) {
                                            int i89 = cVar.b;
                                            boolean z15 = cVar.d;
                                            int i90 = cVar.e;
                                            switch (i89) {
                                                case 0:
                                                    i40 = 11;
                                                    i41 = 1;
                                                    break;
                                                case 1:
                                                    i40 = 11;
                                                    i41 = 2;
                                                    break;
                                                case 2:
                                                    i40 = 11;
                                                    i41 = 3;
                                                    break;
                                                case 3:
                                                    i40 = 11;
                                                    i41 = 5;
                                                    break;
                                                case 4:
                                                    i40 = 11;
                                                    i41 = 6;
                                                    break;
                                                case 5:
                                                case 7:
                                                case 9:
                                                    i40 = 11;
                                                    i41 = 7;
                                                    break;
                                                case 6:
                                                case 8:
                                                case 10:
                                                    i41 = i38;
                                                    i40 = 11;
                                                    break;
                                                case 11:
                                                    i40 = 11;
                                                    i41 = 11;
                                                    break;
                                                case 12:
                                                    i41 = 12;
                                                    i40 = 11;
                                                    break;
                                                case 13:
                                                    i40 = 11;
                                                    i41 = 13;
                                                    break;
                                                case 14:
                                                    i40 = 11;
                                                    i41 = 14;
                                                    break;
                                                case 15:
                                                    i40 = 11;
                                                    i41 = 24;
                                                    break;
                                                default:
                                                    i40 = 11;
                                                    i41 = -1;
                                                    break;
                                            }
                                            if (i89 == i40 || i89 == 12 || i89 == 13 || i89 == 14) {
                                                if (!z15) {
                                                    i41 -= 2;
                                                }
                                                if (i90 == 0) {
                                                    i41 -= 4;
                                                } else if (i90 == 1) {
                                                    i41 -= 2;
                                                }
                                            }
                                            i39 = i41;
                                        } else {
                                            int i91 = cVar.c;
                                            if (i91 > 0) {
                                                int i92 = i91 + 1;
                                                if (cVar.g == 4 && i92 == 17) {
                                                    i92 = 21;
                                                }
                                                i39 = i92;
                                            } else {
                                                int i93 = cVar.g;
                                                if (i93 != 0) {
                                                    if (i93 == 1) {
                                                        i39 = 6;
                                                    } else if (i93 == 2) {
                                                        i39 = i38;
                                                    } else if (i93 == 3) {
                                                        i39 = 10;
                                                    } else if (i93 != 4) {
                                                        e2.a.n("Ac4Util", "AC-4 level " + cVar.g + " has not been defined.");
                                                    }
                                                }
                                                i39 = 2;
                                            }
                                        }
                                        if (i39 <= 0) {
                                            throw s0.c("Cannot determine channel count of presentation.");
                                        }
                                        Object[] objArr3 = {Integer.valueOf(i34), Integer.valueOf(cVar.f), Integer.valueOf(cVar.g)};
                                        String str12 = d0.a;
                                        String format2 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr3);
                                        b2.r rVar3 = new b2.r();
                                        rVar3.a = num3;
                                        rVar3.q = r0.n("audio/ac4");
                                        rVar3.I = i39;
                                        rVar3.J = i66;
                                        rVar3.u = oVar2;
                                        rVar3.d = str;
                                        rVar3.j = format2;
                                        a0Var.e = new b2.s(rVar3);
                                        i32 = i37;
                                        i31 = i36;
                                        i24 = i35;
                                        i16 = 2;
                                    }
                                }
                                i38 = 8;
                                gVar3.c();
                                if (i64 == 1) {
                                }
                                if (cVar.a) {
                                    throw s0.c("Can't determine channel mode of presentation " + i68);
                                }
                                i39 = 12;
                                if (cVar.a) {
                                }
                                if (i39 <= 0) {
                                }
                            }
                            i35 = i49;
                            i36 = i18;
                            i37 = y3;
                            i38 = 8;
                            i39 = 12;
                            if (cVar.a) {
                            }
                            if (i39 <= 0) {
                            }
                        } else {
                            int i94 = i49;
                            i30 = i52;
                            int i95 = i18;
                            int i96 = y3;
                            if (j11 == 1684892784) {
                                if (j3 <= 0) {
                                    throw s0.a(null, "Invalid sample rate for Dolby TrueHD MLP stream: " + j3);
                                }
                                x0Var = x0Var3;
                                y3 = j3;
                                i19 = i53;
                                str9 = str10;
                                j10 = j10;
                                list2 = list3;
                                i28 = i30;
                                i24 = i94;
                                i29 = 0;
                                i18 = 2;
                            } else if (j11 == 1684305011 || j11 == 1969517683) {
                                i24 = i94;
                                i16 = 2;
                                b2.r rVar4 = new b2.r();
                                rVar4.a = Integer.toString(i13);
                                rVar4.q = r0.n(str6);
                                i31 = i95;
                                rVar4.I = i31;
                                i32 = i96;
                                rVar4.J = i32;
                                rVar4.u = oVar2;
                                rVar4.d = str;
                                a0Var.e = new b2.s(rVar4);
                            } else {
                                if (j11 == 1682927731) {
                                    int i97 = j10 - 8;
                                    byte[] bArr3 = a;
                                    byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + i97);
                                    vVar3.J(i30 + 8);
                                    vVar3.h(bArr3.length, i97, copyOf);
                                    list2 = c3.b.a(copyOf);
                                } else if (j11 == 1684425825) {
                                    byte[] bArr4 = new byte[j10 - 8];
                                    bArr4[0] = 102;
                                    bArr4[1] = 76;
                                    bArr4[2] = 97;
                                    bArr4[3] = 67;
                                    vVar3.J(i30 + 12);
                                    vVar3.h(4, j10 - 12, bArr4);
                                    list2 = i0.z(bArr4);
                                } else {
                                    if (j11 == 1634492771) {
                                        int i98 = j10 - 12;
                                        byte[] bArr5 = new byte[i98];
                                        vVar3.J(i30 + 12);
                                        vVar3.h(0, i98, bArr5);
                                        byte[] bArr6 = e2.e.a;
                                        v vVar4 = new v(bArr5);
                                        vVar4.J(9);
                                        int x12 = vVar4.x();
                                        vVar4.J(20);
                                        Pair create = Pair.create(Integer.valueOf(vVar4.B()), Integer.valueOf(x12));
                                        int intValue = ((Integer) create.first).intValue();
                                        x0Var = x0Var3;
                                        i18 = ((Integer) create.second).intValue();
                                        y3 = intValue;
                                        i19 = i53;
                                        str9 = str10;
                                        j10 = j10;
                                        i28 = i30;
                                        i24 = i94;
                                        i16 = 2;
                                        list2 = i0.z(bArr5);
                                    } else if (j11 == 1767990114) {
                                        vVar3.J(i30 + 9);
                                        long j12 = 0;
                                        for (int i99 = 0; i99 < 9; i99++) {
                                            if (vVar3.b == vVar3.c) {
                                                throw new IllegalStateException("Attempting to read a byte over the limit.");
                                            }
                                            long x13 = vVar3.x();
                                            j12 |= (x13 & 127) << (i99 * 7);
                                            if ((x13 & 128) == 0) {
                                                int b13 = v7.b(j12);
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
                                                    a4.g gVar4 = new a4.g();
                                                    gVar4.p(vVar2);
                                                    int i100 = gVar4.i(5);
                                                    if (i100 == 31) {
                                                        i100 = gVar4.i(6) + 32;
                                                    }
                                                    v = v + ".40." + i100;
                                                }
                                                i16 = 2;
                                                Object[] objArr4 = {Integer.valueOf(x14), Integer.valueOf(x15), v};
                                                String str13 = d0.a;
                                                String format3 = String.format(Locale.US, "iamf.%03X.%03X.%s", objArr4);
                                                x0Var = x0Var3;
                                                list2 = i0.z(bArr7);
                                                i19 = i53;
                                                j10 = j10;
                                                i28 = i30;
                                                y3 = i96;
                                                i18 = i95;
                                                i24 = i94;
                                                i29 = 0;
                                                str9 = format3;
                                                int i101 = i24;
                                                i52 = i28 + j10;
                                                i49 = i101;
                                                x0Var3 = x0Var;
                                                i51 = i29;
                                                str2 = str6;
                                                str8 = str4;
                                                i17 = 4;
                                                vVar3 = vVar;
                                                i50 = i12;
                                            }
                                        }
                                        int b132 = v7.b(j12);
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
                                        i16 = 2;
                                        Object[] objArr42 = {Integer.valueOf(x142), Integer.valueOf(x152), v};
                                        String str132 = d0.a;
                                        String format32 = String.format(Locale.US, "iamf.%03X.%03X.%s", objArr42);
                                        x0Var = x0Var3;
                                        list2 = i0.z(bArr72);
                                        i19 = i53;
                                        j10 = j10;
                                        i28 = i30;
                                        y3 = i96;
                                        i18 = i95;
                                        i24 = i94;
                                        i29 = 0;
                                        str9 = format32;
                                        int i1012 = i24;
                                        i52 = i28 + j10;
                                        i49 = i1012;
                                        x0Var3 = x0Var;
                                        i51 = i29;
                                        str2 = str6;
                                        str8 = str4;
                                        i17 = 4;
                                        vVar3 = vVar;
                                        i50 = i12;
                                    } else {
                                        i16 = 2;
                                        if (j11 == 1885564227) {
                                            vVar3.J(i30 + 12);
                                            ByteOrder byteOrder = (vVar3.x() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                            int x16 = vVar3.x();
                                            i24 = i94;
                                            if (i24 == 1768973165) {
                                                i19 = d0.A(x16, byteOrder);
                                                i33 = -1;
                                            } else {
                                                i19 = (i24 == 1718641517 && x16 == 32 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) ? 4 : i53;
                                                i33 = -1;
                                            }
                                            x0Var = x0Var3;
                                            str9 = str10;
                                            if (i19 != i33) {
                                                str6 = "audio/raw";
                                            }
                                            j10 = j10;
                                            list2 = list3;
                                            i28 = i30;
                                            y3 = i96;
                                            i18 = i95;
                                        } else {
                                            i24 = i94;
                                            i32 = i96;
                                            i31 = i95;
                                        }
                                    }
                                    i29 = 0;
                                    int i10122 = i24;
                                    i52 = i28 + j10;
                                    i49 = i10122;
                                    x0Var3 = x0Var;
                                    i51 = i29;
                                    str2 = str6;
                                    str8 = str4;
                                    i17 = 4;
                                    vVar3 = vVar;
                                    i50 = i12;
                                }
                                x0Var = x0Var3;
                                i19 = i53;
                                str9 = str10;
                                j10 = j10;
                                i28 = i30;
                                y3 = i96;
                                i18 = i95;
                                i24 = i94;
                                i29 = 0;
                            }
                            i16 = 2;
                            int i101222 = i24;
                            i52 = i28 + j10;
                            i49 = i101222;
                            x0Var3 = x0Var;
                            i51 = i29;
                            str2 = str6;
                            str8 = str4;
                            i17 = 4;
                            vVar3 = vVar;
                            i50 = i12;
                        }
                        x0Var = x0Var3;
                        i18 = i31;
                        y3 = i32;
                        i19 = i53;
                        str9 = str10;
                        j10 = j10;
                        list2 = list3;
                        i28 = i30;
                        i29 = 0;
                        int i1012222 = i24;
                        i52 = i28 + j10;
                        i49 = i1012222;
                        x0Var3 = x0Var;
                        i51 = i29;
                        str2 = str6;
                        str8 = str4;
                        i17 = 4;
                        vVar3 = vVar;
                        i50 = i12;
                    }
                    i32 = y3;
                    i16 = 2;
                    i24 = i49;
                    x0Var = x0Var3;
                    i18 = i31;
                    y3 = i32;
                    i19 = i53;
                    str9 = str10;
                    j10 = j10;
                    list2 = list3;
                    i28 = i30;
                    i29 = 0;
                    int i10122222 = i24;
                    i52 = i28 + j10;
                    i49 = i10122222;
                    x0Var3 = x0Var;
                    i51 = i29;
                    str2 = str6;
                    str8 = str4;
                    i17 = 4;
                    vVar3 = vVar;
                    i50 = i12;
                }
                if (j11 == i26) {
                    j10 = i21;
                    i27 = i22;
                    i28 = i27;
                } else {
                    i27 = vVar3.b;
                    i28 = i22;
                    c3.b.c(null, i27 >= i28);
                    while (true) {
                        j10 = i21;
                        if (i27 - i28 < j10) {
                            vVar3.J(i27);
                            int j13 = vVar3.j();
                            c3.b.c("childAtomSize must be positive", j13 > 0);
                            if (vVar3.j() != 1702061171) {
                                i27 += j13;
                                i21 = j10;
                            }
                        } else {
                            i27 = -1;
                        }
                    }
                }
                if (i27 != -1) {
                    x0 c10 = c(i27, vVar3);
                    str5 = (String) c10.c;
                    byte[] bArr9 = (byte[]) c10.d;
                    if (bArr9 != null) {
                        if ("audio/vorbis".equals(str5)) {
                            v vVar5 = new v(bArr9);
                            vVar5.K(1);
                            int i102 = 0;
                            while (vVar5.a() > 0 && (vVar5.a[vVar5.b] & 255) == 255) {
                                i102 += 255;
                                vVar5.K(1);
                            }
                            int x17 = vVar5.x() + i102;
                            int i103 = 0;
                            while (true) {
                                if (vVar5.a() > 0) {
                                    x0Var2 = c10;
                                    if ((vVar5.a[vVar5.b] & 255) == 255) {
                                        i103 += 255;
                                        vVar5.K(1);
                                        c10 = x0Var2;
                                    }
                                } else {
                                    x0Var2 = c10;
                                }
                            }
                            int x18 = vVar5.x() + i103;
                            byte[] bArr10 = new byte[x17];
                            int i104 = vVar5.b;
                            i29 = 0;
                            System.arraycopy(bArr9, i104, bArr10, 0, x17);
                            int i105 = i104 + x17 + x18;
                            int length = bArr9.length - i105;
                            byte[] bArr11 = new byte[length];
                            System.arraycopy(bArr9, i105, bArr11, 0, length);
                            list = i0.A(bArr10, bArr11);
                            y3 = i25;
                            i18 = i23;
                            str9 = str10;
                        } else {
                            x0Var2 = c10;
                            i29 = 0;
                            if (MediaController.AUDIO_MIME_TYPE.equals(str5)) {
                                c3.a n10 = c3.b.n(new a4.g(bArr9, bArr9.length), false);
                                y3 = n10.b;
                                i18 = n10.c;
                                str9 = n10.a;
                            } else {
                                y3 = i25;
                                i18 = i23;
                                str9 = str10;
                            }
                            list = i0.z(bArr9);
                        }
                        x0Var = x0Var2;
                    } else {
                        i29 = 0;
                        x0Var = c10;
                        y3 = i25;
                        i18 = i23;
                        str9 = str10;
                    }
                } else {
                    i29 = 0;
                    x0Var = x0Var3;
                    y3 = i25;
                    i18 = i23;
                    str9 = str10;
                    str5 = str3;
                }
                str6 = str5;
                i19 = i53;
                list2 = list;
                int i101222222 = i24;
                i52 = i28 + j10;
                i49 = i101222222;
                x0Var3 = x0Var;
                i51 = i29;
                str2 = str6;
                str8 = str4;
                i17 = 4;
                vVar3 = vVar;
                i50 = i12;
            }
            i29 = 0;
            i24 = i49;
            int i1012222222 = i24;
            i52 = i28 + j10;
            i49 = i1012222222;
            x0Var3 = x0Var;
            i51 = i29;
            str2 = str6;
            str8 = str4;
            i17 = 4;
            vVar3 = vVar;
            i50 = i12;
        }
        String str14 = str9;
        String str15 = str2;
        List list4 = list2;
        int i106 = i19;
        int i107 = i18;
        int i108 = y3;
        if (((b2.s) a0Var.e) != null || str15 == null) {
            return;
        }
        b2.r rVar5 = new b2.r();
        rVar5.a = Integer.toString(i13);
        rVar5.q = r0.n(str15);
        rVar5.j = str14;
        rVar5.I = i107;
        rVar5.J = i108;
        rVar5.K = i106;
        rVar5.t = list4;
        rVar5.u = oVar2;
        rVar5.d = str;
        if (x0Var3 != null) {
            x0 x0Var4 = x0Var3;
            rVar5.h = v7.e(x0Var4.a);
            rVar5.i = v7.e(x0Var4.b);
        } else {
            z zVar3 = zVar;
            if (zVar3 != null) {
                rVar5.h = v7.e(zVar3.a);
                rVar5.i = v7.e(zVar3.b);
            }
        }
        a0Var.e = new b2.s(rVar5);
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
        f2.e e7 = dVar.e(1751411826);
        f2.e e10 = dVar.e(1801812339);
        f2.e e11 = dVar.e(1768715124);
        if (e7 != null && e10 != null && e11 != null) {
            v vVar = e7.c;
            vVar.J(16);
            if (vVar.j() == 1835299937) {
                v vVar2 = e10.c;
                vVar2.J(12);
                int j3 = vVar2.j();
                String[] strArr = new String[j3];
                for (int i10 = 0; i10 < j3; i10++) {
                    int j10 = vVar2.j();
                    vVar2.K(4);
                    strArr[i10] = vVar2.v(j10 - 8, StandardCharsets.UTF_8);
                }
                v vVar3 = e11.c;
                vVar3.J(8);
                ArrayList arrayList = new ArrayList();
                while (vVar3.a() > 8) {
                    int i11 = vVar3.b;
                    int j11 = vVar3.j();
                    int j12 = vVar3.j() - 1;
                    if (j12 < 0 || j12 >= j3) {
                        e2.m(j12, "Skipped metadata with unknown key index: ", "BoxParsers");
                    } else {
                        String str = strArr[j12];
                        int i12 = i11 + j11;
                        while (true) {
                            int i13 = vVar3.b;
                            if (i13 >= i12) {
                                bVar = null;
                                break;
                            }
                            int j13 = vVar3.j();
                            if (vVar3.j() == 1684108385) {
                                int j14 = vVar3.j();
                                int j15 = vVar3.j();
                                int i14 = j13 - 16;
                                byte[] bArr = new byte[i14];
                                vVar3.h(0, i14, bArr);
                                bVar = new f2.b(str, bArr, j15, j14);
                                break;
                            }
                            vVar3.J(i13 + j13);
                        }
                        if (bVar != null) {
                            arrayList.add(bVar);
                        }
                    }
                    vVar3.J(i11 + j11);
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
        r rVar;
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
                int i16 = 0;
                int i17 = -1;
                Integer num3 = null;
                String str = null;
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
                        i17 = i15;
                        i16 = j10;
                    }
                    i15 += j10;
                }
                byte[] bArr = null;
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    c3.b.c("frma atom is mandatory", num3 != null);
                    c3.b.c("schi atom is mandatory", i17 != -1);
                    int i18 = i17 + 8;
                    while (true) {
                        if (i18 - i17 >= i16) {
                            num = num3;
                            rVar = null;
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
                            rVar = new r(z10, str, x11, bArr2, i13, i12, bArr);
                        } else {
                            i18 += j12;
                        }
                    }
                    c3.b.c("tenc atom is mandatory", rVar != null);
                    String str2 = d0.a;
                    create = Pair.create(num, rVar);
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

    /* JADX WARN: Removed duplicated region for block: B:131:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0cda  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0ce0  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0973  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0976  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a0 i(v vVar, i1 i1Var, String str, b2.o oVar, boolean z10) {
        int i10;
        int i11;
        b2.o oVar2;
        int i12;
        String str2;
        String str3;
        int i13;
        int i14;
        int i15;
        int i16;
        String str4;
        char c10;
        int i17;
        int i18;
        String str5;
        a0 a0Var;
        oi.f fVar;
        int i19;
        byte b10;
        int i20;
        String str6;
        String str7;
        String str8;
        byte[] bArr;
        int i21;
        int i22;
        int i23;
        int i24;
        char c11;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        b2.j jVar;
        int i30;
        int i31;
        b2.j jVar2;
        int i32;
        int i33;
        int i34;
        String str9;
        int i35;
        b bVar;
        int i36;
        b2.o oVar3;
        int i37;
        String str10;
        a1 a1Var;
        long j3;
        v vVar2 = vVar;
        i1 i1Var2 = i1Var;
        String str11 = str;
        int i38 = i1Var2.a;
        vVar2.J(12);
        int j10 = vVar2.j();
        a0 a0Var2 = new a0(j10);
        int i39 = 0;
        while (i39 < j10) {
            int i40 = vVar2.b;
            int j11 = vVar2.j();
            String str12 = "childAtomSize must be positive";
            c3.b.c("childAtomSize must be positive", j11 > 0);
            int j12 = vVar2.j();
            byte b11 = 3;
            int i41 = 8;
            if (j12 == 1635148593 || j12 == 1635148595 || j12 == 1701733238 || j12 == 1831958048 || j12 == 1836070006 || j12 == 1752589105 || j12 == 1751479857 || j12 == 1932670515 || j12 == 1211250227 || j12 == 1748121139 || j12 == 1987063864 || j12 == 1987063865 || j12 == 1635135537 || j12 == 1685479798 || j12 == 1685479729 || j12 == 1685481573 || j12 == 1685481521 || j12 == 1634760241 || j12 == 1634743416 || j12 == 1634743400 || j12 == 1634755432 || j12 == 1634755438 || j12 == 1634755443 || j12 == 1634755439) {
                int i42 = i1Var2.c;
                vVar2.J(i40 + 16);
                vVar2.K(16);
                int D = vVar2.D();
                int D2 = vVar2.D();
                vVar2.K(50);
                int i43 = vVar2.b;
                i10 = i39;
                if (j12 == 1701733238) {
                    Pair h = h(vVar2, i40, j11);
                    if (h != null) {
                        int intValue = ((Integer) h.first).intValue();
                        if (oVar == null) {
                            i36 = intValue;
                            oVar3 = null;
                        } else {
                            i36 = intValue;
                            oVar3 = oVar.a(((r) h.second).b);
                        }
                        ((r[]) a0Var2.d)[i10] = (r) h.second;
                    } else {
                        i36 = j12;
                        oVar3 = oVar;
                    }
                    vVar2.J(i43);
                    i11 = i36;
                    oVar2 = oVar3;
                } else {
                    i11 = j12;
                    oVar2 = oVar;
                }
                i12 = i40;
                if (i11 == 1831958048) {
                    str2 = "video/mpeg";
                } else {
                    if (i11 == 1211250227) {
                        str3 = "video/3gpp";
                    } else if (i11 == 1634743416 || i11 == 1634743400 || i11 == 1634755432 || i11 == 1634755438 || i11 == 1634755443 || i11 == 1634755439) {
                        str2 = "video/prores";
                    } else {
                        str3 = null;
                    }
                    b2.o oVar4 = oVar2;
                    i13 = i38;
                    i14 = i43;
                    i15 = j10;
                    int i44 = 8;
                    int i45 = 8;
                    String str13 = str3;
                    float f7 = 1.0f;
                    int i46 = -1;
                    int i47 = -1;
                    int i48 = -1;
                    List list = null;
                    int i49 = -1;
                    oi.f fVar2 = null;
                    boolean z11 = false;
                    ByteBuffer byteBuffer = null;
                    int i50 = -1;
                    byte[] bArr2 = null;
                    int i51 = -1;
                    int i52 = -1;
                    int i53 = -1;
                    String str14 = null;
                    z zVar = null;
                    x0 x0Var = null;
                    while (i14 - i12 < j11) {
                        vVar2.J(i14);
                        int i54 = vVar2.b;
                        int i55 = i14;
                        int j13 = vVar2.j();
                        if (j13 == 0 && vVar2.b - i12 == j11) {
                            break;
                        }
                        c3.b.c(str12, j13 > 0);
                        int j14 = vVar2.j();
                        int i56 = j11;
                        if (j14 == 1635148611) {
                            c3.b.c(null, str13 == null);
                            vVar2.J(i54 + 8);
                            c3.d a2 = c3.d.a(vVar2);
                            list = a2.a;
                            a0Var2.b = a2.b;
                            float f10 = !z11 ? a2.k : f7;
                            String str15 = a2.l;
                            int i57 = a2.j;
                            i46 = a2.g;
                            int i58 = a2.h;
                            i49 = a2.i;
                            int i59 = a2.e;
                            int i60 = a2.f;
                            i50 = i57;
                            str7 = MediaController.VIDEO_MIME_TYPE;
                            i19 = i60;
                            i18 = i47;
                            str5 = str12;
                            f7 = f10;
                            a0Var = a0Var2;
                            i17 = i11;
                            str14 = str15;
                            i48 = i58;
                            fVar = fVar2;
                            i44 = i59;
                        } else {
                            i17 = i11;
                            if (j14 == 1752589123) {
                                c3.b.c(null, str13 == null);
                                vVar2.J(i54 + 8);
                                x a10 = x.a(vVar2, false, null);
                                list = a10.a;
                                a0Var2.b = a10.b;
                                float f11 = !z11 ? a10.l : f7;
                                int i61 = a10.m;
                                int i62 = a10.c;
                                String str16 = a10.n;
                                int i63 = a10.k;
                                if (i63 != -1) {
                                    i47 = i63;
                                }
                                int i64 = a10.d;
                                int i65 = a10.e;
                                int i66 = a10.h;
                                int i67 = a10.i;
                                i50 = i61;
                                int i68 = a10.j;
                                int i69 = a10.f;
                                int i70 = a10.g;
                                fVar = a10.o;
                                i19 = i70;
                                i18 = i47;
                                str5 = str12;
                                a0Var = a0Var2;
                                str7 = "video/hevc";
                                str14 = str16;
                                i53 = i64;
                                i52 = i65;
                                b10 = b11;
                                i20 = i41;
                                i49 = i68;
                                i44 = i69;
                                i51 = i62;
                                f7 = f11;
                                i46 = i66;
                                i48 = i67;
                            } else {
                                i18 = i47;
                                if (j14 == 1818785347) {
                                    c3.b.c("lhvC must follow hvcC atom", "video/hevc".equals(str13));
                                    c3.b.c("must have at least two layers", fVar2 != null && ((i0) fVar2.a).size() >= 2);
                                    vVar2.J(i54 + 8);
                                    fVar2.getClass();
                                    x a11 = x.a(vVar2, true, fVar2);
                                    c3.b.c("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", a0Var2.b == a11.b);
                                    int i71 = a11.h;
                                    if (i71 != -1) {
                                        c3.b.c("colorSpace must be the same for both views", i46 == i71);
                                    }
                                    int i72 = a11.i;
                                    if (i72 != -1) {
                                        c3.b.c("colorRange must be the same for both views", i48 == i72);
                                    }
                                    int i73 = a11.j;
                                    if (i73 != -1) {
                                        c3.b.c("colorTransfer must be the same for both views", i49 == i73);
                                    }
                                    c3.b.c("bitdepthLuma must be the same for both views", i44 == a11.f);
                                    c3.b.c("bitdepthChroma must be the same for both views", i45 == a11.g);
                                    if (list != null) {
                                        f0 u10 = i0.u();
                                        u10.d(list);
                                        u10.d(a11.a);
                                        list = u10.i();
                                    } else {
                                        c3.b.c("initializationData must be already set from hvcC atom", false);
                                    }
                                    str7 = "video/mv-hevc";
                                    str5 = str12;
                                    a0Var = a0Var2;
                                    str14 = a11.n;
                                    fVar = fVar2;
                                    i19 = i45;
                                } else {
                                    if (j14 == 1986361461) {
                                        vVar2.J(i54 + 8);
                                        int i74 = vVar2.b;
                                        b bVar2 = null;
                                        while (i74 - i54 < j13) {
                                            vVar2.J(i74);
                                            int j15 = vVar2.j();
                                            c3.b.c(str12, j15 > 0);
                                            int i75 = i44;
                                            if (vVar2.j() == 1702454643) {
                                                vVar2.J(i74 + 8);
                                                int i76 = vVar2.b;
                                                while (true) {
                                                    if (i76 - i74 >= j15) {
                                                        i34 = i74;
                                                        str9 = str12;
                                                        i35 = i48;
                                                        bVar = null;
                                                        break;
                                                    }
                                                    vVar2.J(i76);
                                                    int j16 = vVar2.j();
                                                    c3.b.c(str12, j16 > 0);
                                                    int i77 = i76;
                                                    if (vVar2.j() == 1937011305) {
                                                        vVar2.K(4);
                                                        int x10 = vVar2.x();
                                                        i34 = i74;
                                                        str9 = str12;
                                                        i35 = i48;
                                                        bVar = new b(new ac.d((x10 & 1) == 1, (x10 & 2) == 2, (x10 & 8) == i41));
                                                    } else {
                                                        i76 = i77 + j16;
                                                        i41 = 8;
                                                    }
                                                }
                                                bVar2 = bVar;
                                            } else {
                                                i34 = i74;
                                                str9 = str12;
                                                i35 = i48;
                                            }
                                            i74 = i34 + j15;
                                            i44 = i75;
                                            str12 = str9;
                                            i48 = i35;
                                            i41 = 8;
                                        }
                                        int i78 = i44;
                                        str5 = str12;
                                        int i79 = i48;
                                        d dVar = bVar2 == null ? null : new d(bVar2);
                                        if (dVar != null) {
                                            ac.d dVar2 = (ac.d) ((b) dVar.a).a;
                                            boolean z12 = dVar2.c;
                                            if (fVar2 == null || ((i0) fVar2.a).size() < 2) {
                                                i32 = i18;
                                                if (i32 == -1) {
                                                    i33 = z12 ? 5 : 4;
                                                    i18 = i33;
                                                    a0Var = a0Var2;
                                                    str7 = str13;
                                                    fVar = fVar2;
                                                    i19 = i45;
                                                    b10 = b11;
                                                    i44 = i78;
                                                    i48 = i79;
                                                }
                                                i33 = i32;
                                                i18 = i33;
                                                a0Var = a0Var2;
                                                str7 = str13;
                                                fVar = fVar2;
                                                i19 = i45;
                                                b10 = b11;
                                                i44 = i78;
                                                i48 = i79;
                                            } else {
                                                c3.b.c("both eye views must be marked as available", dVar2.a && dVar2.b);
                                                c3.b.c("for MV-HEVC, eye_views_reversed must be set to false", !z12);
                                            }
                                        }
                                        i32 = i18;
                                        i33 = i32;
                                        i18 = i33;
                                        a0Var = a0Var2;
                                        str7 = str13;
                                        fVar = fVar2;
                                        i19 = i45;
                                        b10 = b11;
                                        i44 = i78;
                                        i48 = i79;
                                    } else {
                                        int i80 = i44;
                                        str5 = str12;
                                        int i81 = i48;
                                        int i82 = i18;
                                        if (j14 == 1685480259 || j14 == 1685485123 || j14 == 1685485379) {
                                            a0Var = a0Var2;
                                            String str17 = str13;
                                            fVar = fVar2;
                                            i19 = i45;
                                            b10 = b11;
                                            i20 = 8;
                                            int i83 = j13 - 8;
                                            byte[] bArr3 = new byte[i83];
                                            vVar2.h(0, i83, bArr3);
                                            if (list != null) {
                                                f0 u11 = i0.u();
                                                u11.d(list);
                                                u11.b(bArr3);
                                                list = u11.i();
                                            } else {
                                                c3.b.c("initializationData must already be set from hvcC or avcC atom", false);
                                            }
                                            vVar2.J(i54 + 8);
                                            f2.a a12 = f2.a.a(vVar2);
                                            if (a12 != null) {
                                                str6 = a12.a;
                                                str17 = "video/dolby-vision";
                                            } else {
                                                str6 = str14;
                                            }
                                            str14 = str6;
                                            str7 = str17;
                                            i48 = i81;
                                        } else if (j14 == 1987076931) {
                                            c3.b.c(null, str13 == null);
                                            String str18 = i17 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                            vVar2.J(i54 + 12);
                                            byte x11 = (byte) vVar2.x();
                                            byte x12 = (byte) vVar2.x();
                                            int x13 = vVar2.x();
                                            int i84 = x13 >> 4;
                                            byte b12 = (byte) ((x13 >> 1) & 7);
                                            if (str18.equals("video/x-vnd.on2.vp9")) {
                                                byte[] bArr4 = e2.e.a;
                                                byte[] bArr5 = new byte[12];
                                                bArr5[0] = 1;
                                                bArr5[1] = 1;
                                                bArr5[2] = x11;
                                                bArr5[b11] = 2;
                                                bArr5[4] = 1;
                                                bArr5[5] = x12;
                                                bArr5[6] = b11;
                                                bArr5[7] = 1;
                                                bArr5[8] = (byte) i84;
                                                bArr5[9] = 4;
                                                bArr5[10] = 1;
                                                bArr5[11] = b12;
                                                list = i0.z(bArr5);
                                            }
                                            boolean z13 = (x13 & 1) != 0;
                                            int x14 = vVar2.x();
                                            int x15 = vVar2.x();
                                            int f12 = b2.j.f(x14);
                                            int i85 = z13 ? 1 : 2;
                                            i49 = b2.j.g(x15);
                                            i18 = i82;
                                            i17 = i17;
                                            i46 = f12;
                                            i44 = i84;
                                            i19 = i44;
                                            a0Var = a0Var2;
                                            str7 = str18;
                                            fVar = fVar2;
                                            b10 = b11;
                                            i48 = i85;
                                        } else {
                                            int i86 = 11;
                                            if (j14 == 1635135811) {
                                                int i87 = j13 - 8;
                                                byte[] bArr6 = new byte[i87];
                                                vVar2.h(0, i87, bArr6);
                                                list = i0.z(bArr6);
                                                vVar2.J(i54 + 8);
                                                byte[] bArr7 = vVar2.a;
                                                a4.g gVar = new a4.g(bArr7, bArr7.length);
                                                gVar.q(vVar2.b * 8);
                                                gVar.u(1);
                                                int i88 = gVar.i(b11);
                                                gVar.t(6);
                                                boolean h10 = gVar.h();
                                                boolean h11 = gVar.h();
                                                int i89 = -1;
                                                if (i88 == 2 && h10) {
                                                    int i90 = h11 ? 12 : 10;
                                                    i23 = h11 ? 12 : 10;
                                                    i21 = i90;
                                                } else if (i88 <= 2) {
                                                    int i91 = h10 ? 10 : 8;
                                                    i23 = h10 ? 10 : 8;
                                                    i21 = i91;
                                                } else {
                                                    i21 = -1;
                                                    i22 = -1;
                                                    gVar.t(13);
                                                    gVar.s();
                                                    i24 = gVar.i(4);
                                                    if (i24 == 1) {
                                                        e2.a.i("BoxParsers", "Unsupported obu_type: " + i24);
                                                        jVar2 = new b2.j(-1, -1, -1, null, i21, i22);
                                                    } else if (gVar.h()) {
                                                        e2.a.i("BoxParsers", "Unsupported obu_extension_flag");
                                                        jVar2 = new b2.j(-1, -1, -1, null, i21, i22);
                                                    } else {
                                                        boolean h12 = gVar.h();
                                                        gVar.s();
                                                        if (!h12 || gVar.i(8) <= 127) {
                                                            int i92 = gVar.i(3);
                                                            gVar.s();
                                                            if (gVar.h()) {
                                                                e2.a.i("BoxParsers", "Unsupported reduced_still_picture_header");
                                                                jVar2 = new b2.j(-1, -1, -1, null, i21, i22);
                                                            } else if (gVar.h()) {
                                                                e2.a.i("BoxParsers", "Unsupported timing_info_present_flag");
                                                                jVar2 = new b2.j(-1, -1, -1, null, i21, i22);
                                                            } else if (gVar.h()) {
                                                                e2.a.i("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                                jVar2 = new b2.j(-1, -1, -1, null, i21, i22);
                                                            } else {
                                                                int i93 = gVar.i(5);
                                                                for (int i94 = 0; i94 <= i93; i94++) {
                                                                    gVar.t(12);
                                                                    if (gVar.i(5) > 7) {
                                                                        gVar.s();
                                                                    }
                                                                }
                                                                c11 = '\f';
                                                                int i95 = gVar.i(4);
                                                                int i96 = gVar.i(4);
                                                                gVar.t(i95 + 1);
                                                                gVar.t(i96 + 1);
                                                                if (gVar.h()) {
                                                                    gVar.t(7);
                                                                }
                                                                gVar.t(7);
                                                                boolean h13 = gVar.h();
                                                                if (h13) {
                                                                    gVar.t(2);
                                                                }
                                                                if (gVar.h()) {
                                                                    i26 = 2;
                                                                    i25 = 1;
                                                                } else {
                                                                    i25 = 1;
                                                                    i26 = gVar.i(1);
                                                                }
                                                                if (i26 > 0 && !gVar.h()) {
                                                                    gVar.t(i25);
                                                                }
                                                                if (h13) {
                                                                    gVar.t(3);
                                                                }
                                                                gVar.t(3);
                                                                boolean h14 = gVar.h();
                                                                if (i92 == 2 && h14) {
                                                                    gVar.s();
                                                                }
                                                                boolean z14 = i92 != 1 && gVar.h();
                                                                if (gVar.h()) {
                                                                    int i97 = gVar.i(8);
                                                                    int i98 = gVar.i(8);
                                                                    int i99 = gVar.i(8);
                                                                    if (z14) {
                                                                        i30 = 1;
                                                                    } else {
                                                                        i30 = 1;
                                                                        if (i97 == 1 && i98 == 13 && i99 == 0) {
                                                                            i31 = 1;
                                                                            int f13 = b2.j.f(i97);
                                                                            int i100 = i31 != i30 ? 1 : 2;
                                                                            i27 = f13;
                                                                            i28 = i21;
                                                                            i29 = b2.j.g(i98);
                                                                            i89 = i100;
                                                                        }
                                                                    }
                                                                    i31 = gVar.i(i30);
                                                                    int f132 = b2.j.f(i97);
                                                                    if (i31 != i30) {
                                                                    }
                                                                    i27 = f132;
                                                                    i28 = i21;
                                                                    i29 = b2.j.g(i98);
                                                                    i89 = i100;
                                                                } else {
                                                                    i27 = -1;
                                                                    i28 = i21;
                                                                    i29 = -1;
                                                                }
                                                                jVar = new b2.j(i27, i89, i29, null, i28, i22);
                                                                int i101 = jVar.e;
                                                                int i102 = jVar.f;
                                                                int i103 = jVar.a;
                                                                int i104 = jVar.b;
                                                                i18 = i82;
                                                                i17 = i17;
                                                                str7 = "video/av01";
                                                                i44 = i101;
                                                                a0Var = a0Var2;
                                                                fVar = fVar2;
                                                                i19 = i102;
                                                                b10 = 3;
                                                                i20 = 8;
                                                                i49 = jVar.c;
                                                                i46 = i103;
                                                                i48 = i104;
                                                                i14 = i55 + j13;
                                                                b11 = b10;
                                                                i41 = i20;
                                                                i11 = i17;
                                                                i47 = i18;
                                                                fVar2 = fVar;
                                                                i45 = i19;
                                                                str12 = str5;
                                                                a0Var2 = a0Var;
                                                                str13 = str7;
                                                                j11 = i56;
                                                            }
                                                        } else {
                                                            e2.a.i("BoxParsers", "Excessive obu_size");
                                                            jVar2 = new b2.j(-1, -1, -1, null, i21, i22);
                                                        }
                                                    }
                                                    jVar = jVar2;
                                                    c11 = '\f';
                                                    int i1012 = jVar.e;
                                                    int i1022 = jVar.f;
                                                    int i1032 = jVar.a;
                                                    int i1042 = jVar.b;
                                                    i18 = i82;
                                                    i17 = i17;
                                                    str7 = "video/av01";
                                                    i44 = i1012;
                                                    a0Var = a0Var2;
                                                    fVar = fVar2;
                                                    i19 = i1022;
                                                    b10 = 3;
                                                    i20 = 8;
                                                    i49 = jVar.c;
                                                    i46 = i1032;
                                                    i48 = i1042;
                                                    i14 = i55 + j13;
                                                    b11 = b10;
                                                    i41 = i20;
                                                    i11 = i17;
                                                    i47 = i18;
                                                    fVar2 = fVar;
                                                    i45 = i19;
                                                    str12 = str5;
                                                    a0Var2 = a0Var;
                                                    str13 = str7;
                                                    j11 = i56;
                                                }
                                                i22 = i23;
                                                gVar.t(13);
                                                gVar.s();
                                                i24 = gVar.i(4);
                                                if (i24 == 1) {
                                                }
                                                jVar = jVar2;
                                                c11 = '\f';
                                                int i10122 = jVar.e;
                                                int i10222 = jVar.f;
                                                int i10322 = jVar.a;
                                                int i10422 = jVar.b;
                                                i18 = i82;
                                                i17 = i17;
                                                str7 = "video/av01";
                                                i44 = i10122;
                                                a0Var = a0Var2;
                                                fVar = fVar2;
                                                i19 = i10222;
                                                b10 = 3;
                                                i20 = 8;
                                                i49 = jVar.c;
                                                i46 = i10322;
                                                i48 = i10422;
                                                i14 = i55 + j13;
                                                b11 = b10;
                                                i41 = i20;
                                                i11 = i17;
                                                i47 = i18;
                                                fVar2 = fVar;
                                                i45 = i19;
                                                str12 = str5;
                                                a0Var2 = a0Var;
                                                str13 = str7;
                                                j11 = i56;
                                            } else {
                                                if (j14 == 1668050025) {
                                                    if (byteBuffer == null) {
                                                        byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                    }
                                                    ByteBuffer byteBuffer2 = byteBuffer;
                                                    byteBuffer2.position(21);
                                                    byteBuffer2.putShort(vVar2.u());
                                                    byteBuffer2.putShort(vVar2.u());
                                                    i18 = i82;
                                                    i17 = i17;
                                                    byteBuffer = byteBuffer2;
                                                    a0Var = a0Var2;
                                                    str7 = str13;
                                                    fVar = fVar2;
                                                    i19 = i45;
                                                } else {
                                                    if (j14 == 1835295606) {
                                                        if (byteBuffer == null) {
                                                            byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                        }
                                                        ByteBuffer byteBuffer3 = byteBuffer;
                                                        short u12 = vVar2.u();
                                                        short u13 = vVar2.u();
                                                        short u14 = vVar2.u();
                                                        short u15 = vVar2.u();
                                                        i17 = i17;
                                                        short u16 = vVar2.u();
                                                        str8 = str13;
                                                        short u17 = vVar2.u();
                                                        fVar = fVar2;
                                                        short u18 = vVar2.u();
                                                        i19 = i45;
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
                                                        byteBuffer = byteBuffer3;
                                                    } else {
                                                        i17 = i17;
                                                        a0Var = a0Var2;
                                                        str8 = str13;
                                                        fVar = fVar2;
                                                        i19 = i45;
                                                        if (j14 == 1681012275) {
                                                            c3.b.c(null, str8 == null);
                                                            i18 = i82;
                                                            str7 = "video/3gpp";
                                                        } else if (j14 == 1702061171) {
                                                            c3.b.c(null, str8 == null);
                                                            x0 c12 = c(i54, vVar2);
                                                            String str19 = (String) c12.c;
                                                            byte[] bArr8 = (byte[]) c12.d;
                                                            if (bArr8 != null) {
                                                                list = i0.z(bArr8);
                                                            }
                                                            i18 = i82;
                                                            x0Var = c12;
                                                            str7 = str19;
                                                        } else if (j14 == 1651798644) {
                                                            vVar2.J(i54 + 8);
                                                            vVar2.K(4);
                                                            zVar = new z(vVar2.z(), vVar2.z());
                                                        } else if (j14 == 1885434736) {
                                                            vVar2.J(i54 + 8);
                                                            f7 = vVar2.B() / vVar2.B();
                                                            str7 = str8;
                                                            i48 = i81;
                                                            b10 = 3;
                                                            i20 = 8;
                                                            z11 = true;
                                                        } else if (j14 == 1937126244) {
                                                            int i105 = i54 + 8;
                                                            while (true) {
                                                                if (i105 - i54 >= j13) {
                                                                    bArr = null;
                                                                    break;
                                                                }
                                                                vVar2.J(i105);
                                                                int j17 = vVar2.j();
                                                                if (vVar2.j() == 1886547818) {
                                                                    bArr = Arrays.copyOfRange(vVar2.a, i105, j17 + i105);
                                                                    break;
                                                                }
                                                                i105 += j17;
                                                            }
                                                            bArr2 = bArr;
                                                        } else if (j14 == 1936995172) {
                                                            int x16 = vVar2.x();
                                                            b10 = 3;
                                                            vVar2.K(3);
                                                            if (x16 == 0) {
                                                                int x17 = vVar2.x();
                                                                if (x17 == 0) {
                                                                    i82 = 0;
                                                                } else if (x17 == 1) {
                                                                    i82 = 1;
                                                                } else if (x17 == 2) {
                                                                    i82 = 2;
                                                                } else if (x17 == 3) {
                                                                    i82 = 3;
                                                                }
                                                            }
                                                            str7 = str8;
                                                            i48 = i81;
                                                            i20 = 8;
                                                        } else {
                                                            b10 = 3;
                                                            if (j14 == 1634760259) {
                                                                int i106 = j13 - 12;
                                                                byte[] bArr9 = new byte[i106];
                                                                vVar2.J(i54 + 12);
                                                                vVar2.h(0, i106, bArr9);
                                                                list = i0.z(bArr9);
                                                                v vVar3 = new v(bArr9);
                                                                a4.g gVar2 = new a4.g(bArr9, i106);
                                                                i20 = 8;
                                                                gVar2.q(vVar3.b * 8);
                                                                gVar2.u(1);
                                                                int i107 = gVar2.i(8);
                                                                int i108 = -1;
                                                                int i109 = -1;
                                                                int i110 = 0;
                                                                int i111 = -1;
                                                                int i112 = -1;
                                                                int i113 = -1;
                                                                while (i110 < i107) {
                                                                    gVar2.u(1);
                                                                    int i114 = gVar2.i(8);
                                                                    int i115 = i113;
                                                                    int i116 = i112;
                                                                    int i117 = i111;
                                                                    int i118 = i109;
                                                                    int i119 = i108;
                                                                    int i120 = 0;
                                                                    while (i120 < i114) {
                                                                        gVar2.t(6);
                                                                        boolean h15 = gVar2.h();
                                                                        gVar2.s();
                                                                        gVar2.u(i86);
                                                                        gVar2.t(4);
                                                                        i115 = gVar2.i(4) + 8;
                                                                        gVar2.u(1);
                                                                        if (h15) {
                                                                            int i121 = gVar2.i(8);
                                                                            int i122 = gVar2.i(8);
                                                                            gVar2.u(1);
                                                                            boolean h16 = gVar2.h();
                                                                            int f14 = b2.j.f(i121);
                                                                            i117 = h16 ? 1 : 2;
                                                                            i116 = b2.j.g(i122);
                                                                            i118 = f14;
                                                                        }
                                                                        i120++;
                                                                        i119 = i115;
                                                                        i86 = 11;
                                                                    }
                                                                    i110++;
                                                                    i108 = i119;
                                                                    i109 = i118;
                                                                    i111 = i117;
                                                                    i112 = i116;
                                                                    i113 = i115;
                                                                    i86 = 11;
                                                                }
                                                                str7 = "video/apv";
                                                                i18 = i82;
                                                                i44 = i108;
                                                                i46 = i109;
                                                                i48 = i111;
                                                                i49 = i112;
                                                                i19 = i113;
                                                                i14 = i55 + j13;
                                                                b11 = b10;
                                                                i41 = i20;
                                                                i11 = i17;
                                                                i47 = i18;
                                                                fVar2 = fVar;
                                                                i45 = i19;
                                                                str12 = str5;
                                                                a0Var2 = a0Var;
                                                                str13 = str7;
                                                                j11 = i56;
                                                            } else {
                                                                i20 = 8;
                                                                if (j14 == 1668246642 && i46 == -1 && i49 == -1) {
                                                                    int j18 = vVar2.j();
                                                                    if (j18 == 1852009592 || j18 == 1852009571) {
                                                                        int D3 = vVar2.D();
                                                                        int D4 = vVar2.D();
                                                                        vVar2.K(2);
                                                                        boolean z17 = j13 == 19 && (vVar2.x() & 128) != 0;
                                                                        int f15 = b2.j.f(D3);
                                                                        int i123 = z17 ? 1 : 2;
                                                                        i49 = b2.j.g(D4);
                                                                        i46 = f15;
                                                                        i48 = i123;
                                                                        str7 = str8;
                                                                    } else {
                                                                        e2.a.n("BoxParsers", "Unsupported color type: " + ed.k.a(j18));
                                                                    }
                                                                }
                                                                str7 = str8;
                                                                i48 = i81;
                                                            }
                                                        }
                                                    }
                                                    str7 = str8;
                                                    i48 = i81;
                                                    b10 = 3;
                                                    i20 = 8;
                                                }
                                                i44 = i80;
                                                i48 = i81;
                                                b10 = 3;
                                                i20 = 8;
                                            }
                                        }
                                        i18 = i82;
                                        i44 = i80;
                                        i14 = i55 + j13;
                                        b11 = b10;
                                        i41 = i20;
                                        i11 = i17;
                                        i47 = i18;
                                        fVar2 = fVar;
                                        i45 = i19;
                                        str12 = str5;
                                        a0Var2 = a0Var;
                                        str13 = str7;
                                        j11 = i56;
                                    }
                                    i20 = 8;
                                    i14 = i55 + j13;
                                    b11 = b10;
                                    i41 = i20;
                                    i11 = i17;
                                    i47 = i18;
                                    fVar2 = fVar;
                                    i45 = i19;
                                    str12 = str5;
                                    a0Var2 = a0Var;
                                    str13 = str7;
                                    j11 = i56;
                                }
                            }
                            i14 = i55 + j13;
                            b11 = b10;
                            i41 = i20;
                            i11 = i17;
                            i47 = i18;
                            fVar2 = fVar;
                            i45 = i19;
                            str12 = str5;
                            a0Var2 = a0Var;
                            str13 = str7;
                            j11 = i56;
                        }
                        b10 = b11;
                        i20 = i41;
                        i14 = i55 + j13;
                        b11 = b10;
                        i41 = i20;
                        i11 = i17;
                        i47 = i18;
                        fVar2 = fVar;
                        i45 = i19;
                        str12 = str5;
                        a0Var2 = a0Var;
                        str13 = str7;
                        j11 = i56;
                    }
                    int i124 = i44;
                    i16 = j11;
                    int i125 = i47;
                    int i126 = i48;
                    a0 a0Var3 = a0Var2;
                    str4 = str13;
                    int i127 = i45;
                    c10 = '\f';
                    if (str4 != null) {
                        str11 = str;
                        a0Var2 = a0Var3;
                    } else {
                        b2.r rVar = new b2.r();
                        rVar.a = Integer.toString(i13);
                        rVar.q = r0.n(str4);
                        rVar.j = str14;
                        rVar.x = D;
                        rVar.y = D2;
                        rVar.z = i53;
                        rVar.A = i52;
                        rVar.D = f7;
                        rVar.C = i42;
                        rVar.E = bArr2;
                        rVar.F = i125;
                        rVar.t = list;
                        rVar.s = i50;
                        rVar.H = i51;
                        rVar.u = oVar4;
                        str11 = str;
                        rVar.d = str11;
                        rVar.G = new b2.j(i46, i126, i49, byteBuffer != null ? byteBuffer.array() : null, i124, i127);
                        z zVar2 = zVar;
                        if (zVar2 != null) {
                            rVar.h = v7.e(zVar2.a);
                            rVar.i = v7.e(zVar2.b);
                        } else {
                            x0 x0Var2 = x0Var;
                            if (x0Var2 != null) {
                                rVar.h = v7.e(x0Var2.a);
                                rVar.i = v7.e(x0Var2.b);
                            }
                        }
                        a0Var2 = a0Var3;
                        a0Var2.e = new b2.s(rVar);
                    }
                }
                str3 = str2;
                b2.o oVar42 = oVar2;
                i13 = i38;
                i14 = i43;
                i15 = j10;
                int i442 = 8;
                int i452 = 8;
                String str132 = str3;
                float f72 = 1.0f;
                int i462 = -1;
                int i472 = -1;
                int i482 = -1;
                List list2 = null;
                int i492 = -1;
                oi.f fVar22 = null;
                boolean z112 = false;
                ByteBuffer byteBuffer4 = null;
                int i502 = -1;
                byte[] bArr22 = null;
                int i512 = -1;
                int i522 = -1;
                int i532 = -1;
                String str142 = null;
                z zVar3 = null;
                x0 x0Var3 = null;
                while (i14 - i12 < j11) {
                }
                int i1242 = i442;
                i16 = j11;
                int i1252 = i472;
                int i1262 = i482;
                a0 a0Var32 = a0Var2;
                str4 = str132;
                int i1272 = i452;
                c10 = '\f';
                if (str4 != null) {
                }
            } else {
                if (j12 == 1836069985 || j12 == 1701733217 || j12 == 1633889587 || j12 == 1700998451 || j12 == 1633889588 || j12 == 1835823201 || j12 == 1685353315 || j12 == 1685353317 || j12 == 1685353320 || j12 == 1685353324 || j12 == 1685353336 || j12 == 1935764850 || j12 == 1935767394 || j12 == 1819304813 || j12 == 1936684916 || j12 == 1953984371 || j12 == 778924082 || j12 == 778924083 || j12 == 1835557169 || j12 == 1835560241 || j12 == 1634492771 || j12 == 1634492791 || j12 == 1970037111 || j12 == 1332770163 || j12 == 1716281667 || j12 == 1767992678 || j12 == 1768973165 || j12 == 1718641517) {
                    vVar2 = vVar;
                    i40 = i40;
                    b(vVar2, j12, i40, j11, i1Var2.a, str11, z10, oVar, a0Var2, i39);
                    str11 = str;
                } else if (j12 == 1414810956 || j12 == 1954034535 || j12 == 2004251764 || j12 == 1937010800 || j12 == 1664495672 || j12 == 1836070003) {
                    vVar2.J(i40 + 16);
                    String str20 = "application/ttml+xml";
                    long j19 = Long.MAX_VALUE;
                    if (j12 != 1414810956) {
                        if (j12 == 1954034535) {
                            int i128 = j11 - 16;
                            byte[] bArr10 = new byte[i128];
                            vVar2.h(0, i128, bArr10);
                            a1Var = i0.z(bArr10);
                            str20 = "application/x-quicktime-tx3g";
                            i37 = i40;
                        } else if (j12 == 2004251764) {
                            str20 = "application/x-mp4-vtt";
                        } else if (j12 == 1937010800) {
                            j19 = 0;
                        } else if (j12 == 1664495672) {
                            a0Var2.c = 1;
                            str20 = "application/x-mp4-cea-608";
                        } else {
                            if (j12 != 1836070003) {
                                throw new IllegalStateException();
                            }
                            int i129 = vVar2.b;
                            vVar2.K(4);
                            if (vVar2.j() == 1702061171) {
                                byte[] bArr11 = (byte[]) c(i129, vVar2).d;
                                if (bArr11 == null || bArr11.length != 64) {
                                    i37 = i40;
                                    c10 = '\f';
                                    vVar2 = vVar;
                                    i16 = j11;
                                    i10 = i39;
                                    i13 = i38;
                                    i15 = j10;
                                    i12 = i37;
                                } else {
                                    int i130 = i1Var2.d;
                                    int i131 = i1Var2.e;
                                    e2.d.g(bArr11.length == 64);
                                    ArrayList arrayList = new ArrayList(16);
                                    int i132 = 0;
                                    while (i132 < bArr11.length - 3) {
                                        byte[] bArr12 = bArr11;
                                        int c13 = v7.c(bArr11[i132], bArr11[i132 + 1], bArr11[i132 + 2], bArr12[i132 + 3]);
                                        int i133 = (c13 >> 16) & 255;
                                        int i134 = ((c13 >> 8) & 255) - 128;
                                        int i135 = (c13 & 255) - 128;
                                        arrayList.add(String.format("%06x", Integer.valueOf(d0.h(((i135 * 17790) / 10000) + i133, 0, 255) | (d0.h((i133 - ((i135 * 3455) / 10000)) - ((i134 * 7169) / 10000), 0, 255) << 8) | (d0.h(((i134 * 14075) / 10000) + i133, 0, 255) << 16))));
                                        i132 += 4;
                                        bArr11 = bArr12;
                                        i40 = i40;
                                    }
                                    i37 = i40;
                                    StringBuilder k10 = hg.c.k("size: ", i130, "x", i131, "\npalette: ");
                                    d9.f fVar3 = new d9.f(", ", 0);
                                    Iterator it = arrayList.iterator();
                                    StringBuilder sb2 = new StringBuilder();
                                    fVar3.a(sb2, it);
                                    k10.append(sb2.toString());
                                    k10.append("\n");
                                    String sb3 = k10.toString();
                                    String str21 = d0.a;
                                    a1Var = i0.z(sb3.getBytes(StandardCharsets.UTF_8));
                                    str10 = "application/vobsub";
                                }
                            } else {
                                i37 = i40;
                                str10 = null;
                                a1Var = null;
                            }
                            str20 = str10;
                        }
                        j3 = Long.MAX_VALUE;
                        if (str20 != null) {
                            b2.r rVar2 = new b2.r();
                            rVar2.a = Integer.toString(i38);
                            rVar2.q = r0.n(str20);
                            rVar2.d = str11;
                            rVar2.v = j3;
                            rVar2.t = a1Var;
                            a0Var2.e = new b2.s(rVar2);
                        }
                        c10 = '\f';
                        vVar2 = vVar;
                        i16 = j11;
                        i10 = i39;
                        i13 = i38;
                        i15 = j10;
                        i12 = i37;
                    }
                    i37 = i40;
                    j3 = j19;
                    a1Var = null;
                    if (str20 != null) {
                    }
                    c10 = '\f';
                    vVar2 = vVar;
                    i16 = j11;
                    i10 = i39;
                    i13 = i38;
                    i15 = j10;
                    i12 = i37;
                } else if (j12 == 1835365492) {
                    vVar2.J(i40 + 16);
                    if (j12 == 1835365492) {
                        vVar2.s();
                        String s10 = vVar2.s();
                        if (s10 != null) {
                            b2.r rVar3 = new b2.r();
                            rVar3.a = Integer.toString(i38);
                            rVar3.q = r0.n(s10);
                            a0Var2.e = new b2.s(rVar3);
                        }
                    }
                } else if (j12 == 1667329389) {
                    b2.r rVar4 = new b2.r();
                    rVar4.a = Integer.toString(i38);
                    rVar4.q = r0.n("application/x-camera-motion");
                    a0Var2.e = new b2.s(rVar4);
                }
                i12 = i40;
                i16 = j11;
                i10 = i39;
                i13 = i38;
                i15 = j10;
                c10 = '\f';
            }
            vVar2.J(i12 + i16);
            i39 = i10 + 1;
            i1Var2 = i1Var;
            i38 = i13;
            j10 = i15;
        }
        return a0Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:318:0x00e3, code lost:
    
        if (r23 == 0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0628 A[ADDED_TO_REGION, LOOP:15: B:264:0x0628->B:267:0x0632, LOOP_START, PHI: r26
      0x0628: PHI (r26v3 int) = (r26v2 int), (r26v4 int) binds: [B:263:0x0626, B:267:0x0632] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0614 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x097f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x06ed  */
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
        long X;
        int i11;
        int i12;
        int i13;
        String str;
        f2.e e7;
        int i14;
        long[] jArr;
        long[] jArr2;
        b2.s sVar;
        b2.s sVar2;
        d9.e eVar2;
        q qVar;
        f2.d d;
        Pair create;
        int i15;
        long j14;
        c cVar;
        boolean z12;
        int i16;
        int i17;
        int i18;
        int a2;
        v vVar;
        long[] jArr3;
        int[] iArr;
        int i19;
        ArrayList arrayList2;
        int i20;
        long j15;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int[] iArr2;
        long[] jArr4;
        long[] jArr5;
        int[] iArr3;
        int i27;
        long j16;
        boolean z13;
        long[] jArr6;
        int[] iArr4;
        int i28;
        int[] iArr5;
        long[] jArr7;
        int[] iArr6;
        long j17;
        int i29;
        int i30;
        long[] jArr8;
        long j18;
        long[] jArr9;
        long[] jArr10;
        int i31;
        ArrayList arrayList3;
        t tVar;
        int[] iArr7;
        int i32;
        int i33;
        t tVar2;
        f2.d dVar2 = dVar;
        ArrayList arrayList4 = new ArrayList();
        int i34 = 0;
        for (ArrayList arrayList5 = dVar2.e; i34 < arrayList5.size(); arrayList5 = arrayList) {
            f2.d dVar3 = (f2.d) arrayList5.get(i34);
            if (dVar3.b != 1953653099) {
                arrayList = arrayList5;
                arrayList3 = arrayList4;
                i14 = i34;
            } else {
                f2.e e10 = dVar2.e(1836476516);
                e10.getClass();
                f2.d d10 = dVar3.d(1835297121);
                d10.getClass();
                f2.e e11 = d10.e(1751411826);
                e11.getClass();
                v vVar2 = e11.c;
                vVar2.J(16);
                int j19 = vVar2.j();
                int i35 = j19 == 1936684398 ? 1 : j19 == 1986618469 ? 2 : (j19 == 1952807028 || j19 == 1935832172 || j19 == 1937072756 || j19 == 1668047728 || j19 == 1937072752) ? 3 : j19 == 1835365473 ? 5 : -1;
                int i36 = 1;
                if (i35 == -1) {
                    arrayList = arrayList5;
                    i14 = i34;
                    qVar = null;
                    eVar2 = eVar;
                } else {
                    f2.e e12 = dVar3.e(1953196132);
                    e12.getClass();
                    v vVar3 = e12.c;
                    vVar3.J(8);
                    int e13 = e(vVar3.j());
                    vVar3.K(e13 != 0 ? 16 : 8);
                    int j20 = vVar3.j();
                    vVar3.K(4);
                    int i37 = vVar3.b;
                    int i38 = e13 == 0 ? 4 : 8;
                    int i39 = 0;
                    while (true) {
                        j10 = -9223372036854775807L;
                        if (i39 >= i38) {
                            vVar3.K(i38);
                            break;
                        }
                        if (vVar3.a[i37 + i39] != -1) {
                            j11 = e13 == 0 ? vVar3.z() : vVar3.C();
                        } else {
                            i39++;
                        }
                    }
                    j11 = -9223372036854775807L;
                    vVar3.K(10);
                    int D = vVar3.D();
                    vVar3.K(4);
                    int j21 = vVar3.j();
                    int j22 = vVar3.j();
                    vVar3.K(4);
                    int j23 = vVar3.j();
                    int j24 = vVar3.j();
                    if (j21 == 0 && j22 == 65536) {
                        arrayList = arrayList5;
                        if ((j23 == -65536 || j23 == 65536) && j24 == 0) {
                            i10 = 90;
                            vVar3.K(16);
                            short u10 = vVar3.u();
                            vVar3.K(2);
                            short u11 = vVar3.u();
                            i1 i1Var = new i1();
                            i1Var.a = j20;
                            i1Var.b = D;
                            i1Var.c = i10;
                            i1Var.d = u10;
                            i1Var.e = u11;
                            j12 = j3 != -9223372036854775807L ? j11 : j3;
                            long j25 = g(e10.c).c;
                            if (j12 != -9223372036854775807L) {
                                j13 = j25;
                                X = -9223372036854775807L;
                            } else {
                                String str2 = d0.a;
                                j13 = j25;
                                X = d0.X(j12, 1000000L, j13, RoundingMode.DOWN);
                            }
                            f2.d d11 = d10.d(1835626086);
                            d11.getClass();
                            f2.d d12 = d11.d(1937007212);
                            d12.getClass();
                            f2.e e14 = d10.e(1835296868);
                            e14.getClass();
                            v vVar4 = e14.c;
                            vVar4.J(8);
                            int e15 = e(vVar4.j());
                            vVar4.K(e15 != 0 ? 8 : 16);
                            long z14 = vVar4.z();
                            int i40 = vVar4.b;
                            i11 = e15 != 0 ? 4 : 8;
                            i12 = 0;
                            while (true) {
                                if (i12 < i11) {
                                    vVar4.K(i11);
                                    break;
                                }
                                if (vVar4.a[i40 + i12] != -1) {
                                    long z15 = e15 == 0 ? vVar4.z() : vVar4.C();
                                    if (z15 != 0) {
                                        String str3 = d0.a;
                                        j10 = d0.X(z15, 1000000L, z14, RoundingMode.DOWN);
                                    }
                                } else {
                                    i12++;
                                }
                            }
                            long j26 = j10;
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
                            e7 = d12.e(1937011556);
                            if (e7 != null) {
                                throw s0.a(null, "Malformed sample table (stbl) missing sample description (stsd)");
                            }
                            a0 i41 = i(e7.c, i1Var, str, oVar, z11);
                            if (z10 || (d = dVar3.d(1701082227)) == null) {
                                i14 = i34;
                            } else {
                                f2.e e16 = d.e(1701606260);
                                if (e16 == null) {
                                    i14 = i34;
                                    create = null;
                                } else {
                                    v vVar5 = e16.c;
                                    vVar5.J(8);
                                    int e17 = e(vVar5.j());
                                    int B = vVar5.B();
                                    long[] jArr11 = new long[B];
                                    long[] jArr12 = new long[B];
                                    int i42 = 0;
                                    while (i42 < B) {
                                        int i43 = i36;
                                        jArr11[i42] = e17 == i43 ? vVar5.C() : vVar5.z();
                                        if (e17 == i43) {
                                            j14 = vVar5.r();
                                            i15 = i34;
                                        } else {
                                            i15 = i34;
                                            j14 = vVar5.j();
                                        }
                                        jArr12[i42] = j14;
                                        if (vVar5.u() != 1) {
                                            throw new IllegalArgumentException("Unsupported media rate.");
                                        }
                                        vVar5.K(2);
                                        i42++;
                                        i34 = i15;
                                        i36 = 1;
                                    }
                                    i14 = i34;
                                    create = Pair.create(jArr11, jArr12);
                                }
                                if (create != null) {
                                    long[] jArr13 = (long[]) create.first;
                                    jArr2 = (long[]) create.second;
                                    jArr = jArr13;
                                    sVar = (b2.s) i41.e;
                                    if (sVar != null) {
                                        eVar2 = eVar;
                                        qVar = null;
                                    } else {
                                        int i44 = i1Var.b;
                                        if (i44 != 0) {
                                            f2.c cVar2 = new f2.c(i44);
                                            b2.r a10 = sVar.a();
                                            p0 p0Var = ((b2.s) i41.e).l;
                                            a10.k = p0Var != null ? p0Var.a(cVar2) : new p0(cVar2);
                                            sVar2 = new b2.s(a10);
                                        } else {
                                            sVar2 = sVar;
                                        }
                                        eVar2 = eVar;
                                        qVar = new q(i1Var.a, i35, z14, j13, X, j26, sVar2, i41.c, (r[]) i41.d, i41.b, jArr, jArr2);
                                    }
                                }
                            }
                            jArr = null;
                            jArr2 = null;
                            sVar = (b2.s) i41.e;
                            if (sVar != null) {
                            }
                        }
                    } else {
                        arrayList = arrayList5;
                    }
                    i10 = (j21 == 0 && j22 == -65536 && (j23 == 65536 || j23 == -65536) && j24 == 0) ? 270 : ((j21 == -65536 || j21 == 65536) && j22 == 0 && j23 == 0 && j24 == -65536) ? 180 : 0;
                    vVar3.K(16);
                    short u102 = vVar3.u();
                    vVar3.K(2);
                    short u112 = vVar3.u();
                    i1 i1Var2 = new i1();
                    i1Var2.a = j20;
                    i1Var2.b = D;
                    i1Var2.c = i10;
                    i1Var2.d = u102;
                    i1Var2.e = u112;
                    if (j3 != -9223372036854775807L) {
                    }
                    long j252 = g(e10.c).c;
                    if (j12 != -9223372036854775807L) {
                    }
                    f2.d d112 = d10.d(1835626086);
                    d112.getClass();
                    f2.d d122 = d112.d(1937007212);
                    d122.getClass();
                    f2.e e142 = d10.e(1835296868);
                    e142.getClass();
                    v vVar42 = e142.c;
                    vVar42.J(8);
                    int e152 = e(vVar42.j());
                    vVar42.K(e152 != 0 ? 8 : 16);
                    long z142 = vVar42.z();
                    int i402 = vVar42.b;
                    if (e152 != 0) {
                    }
                    i12 = 0;
                    while (true) {
                        if (i12 < i11) {
                        }
                        i12++;
                    }
                    long j262 = j10;
                    int D22 = vVar42.D();
                    char[] cArr2 = {(char) (((D22 >> 10) & 31) + 96), (char) (((D22 >> 5) & 31) + 96), (char) ((D22 & 31) + 96)};
                    while (i13 < 3) {
                    }
                    str = new String(cArr2);
                    e7 = d122.e(1937011556);
                    if (e7 != null) {
                    }
                }
                q qVar2 = (q) eVar2.apply(qVar);
                if (qVar2 == null) {
                    arrayList3 = arrayList4;
                } else {
                    b2.s sVar3 = qVar2.g;
                    f2.d d13 = dVar3.d(1835297121);
                    d13.getClass();
                    f2.d d14 = d13.d(1835626086);
                    d14.getClass();
                    f2.d d15 = d14.d(1937007212);
                    d15.getClass();
                    f2.e e18 = d15.e(1937011578);
                    if (e18 != null) {
                        cVar = new b4.d(e18, sVar3);
                    } else {
                        f2.e e19 = d15.e(1937013298);
                        if (e19 == null) {
                            throw s0.a(null, "Track has no sample table size information");
                        }
                        e2.q qVar3 = new e2.q();
                        v vVar6 = e19.c;
                        qVar3.e = vVar6;
                        vVar6.J(12);
                        qVar3.b = vVar6.B() & 255;
                        qVar3.a = vVar6.B();
                        cVar = qVar3;
                    }
                    int b10 = cVar.b();
                    if (b10 == 0) {
                        arrayList3 = arrayList4;
                        tVar = new t(qVar2, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                    } else {
                        if (qVar2.b == 2) {
                            long j27 = qVar2.f;
                            if (j27 > 0) {
                                b2.r a11 = sVar3.a();
                                a11.B = b10 / (j27 / 1000000.0f);
                                qVar2 = qVar2.a(new b2.s(a11));
                            }
                        }
                        b2.s sVar4 = qVar2.g;
                        f2.e e20 = d15.e(1937007471);
                        if (e20 == null) {
                            e20 = d15.e(1668232756);
                            e20.getClass();
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        v vVar7 = e20.c;
                        f2.e e21 = d15.e(1937011555);
                        e21.getClass();
                        v vVar8 = e21.c;
                        f2.e e22 = d15.e(1937011827);
                        e22.getClass();
                        v vVar9 = e22.c;
                        f2.e e23 = d15.e(1937011571);
                        v vVar10 = e23 != null ? e23.c : null;
                        f2.e e24 = d15.e(1668576371);
                        v vVar11 = e24 != null ? e24.c : null;
                        a aVar = new a(vVar8, vVar7, z12);
                        vVar9.J(12);
                        int B2 = vVar9.B() - 1;
                        int B3 = vVar9.B();
                        int B4 = vVar9.B();
                        if (vVar11 != null) {
                            vVar11.J(12);
                            i16 = vVar11.B();
                        } else {
                            i16 = 0;
                        }
                        if (vVar10 != null) {
                            vVar10.J(12);
                            i17 = vVar10.B();
                            if (i17 > 0) {
                                i18 = vVar10.B() - 1;
                                a2 = cVar.a();
                                vVar = vVar11;
                                String str4 = sVar4.r;
                                if (a2 == -1 && (("audio/raw".equals(str4) || "audio/g711-mlaw".equals(str4) || "audio/g711-alaw".equals(str4)) && B2 == 0 && i16 == 0 && i17 == 0)) {
                                    int i45 = aVar.a;
                                    long[] jArr14 = new long[i45];
                                    int[] iArr8 = new int[i45];
                                    while (aVar.a()) {
                                        int i46 = aVar.b;
                                        jArr14[i46] = aVar.d;
                                        iArr8[i46] = aVar.c;
                                    }
                                    long j28 = B4;
                                    int i47 = 8192 / a2;
                                    int i48 = 0;
                                    for (int i49 = 0; i49 < i45; i49++) {
                                        i48 += d0.f(iArr8[i49], i47);
                                    }
                                    long[] jArr15 = new long[i48];
                                    int[] iArr9 = new int[i48];
                                    jArr4 = new long[i48];
                                    int[] iArr10 = new int[i48];
                                    int i50 = 0;
                                    int i51 = 0;
                                    int i52 = 0;
                                    int i53 = 0;
                                    int i54 = 0;
                                    while (i50 < i45) {
                                        int i55 = iArr8[i50];
                                        long j29 = jArr14[i50];
                                        int i56 = i54;
                                        int i57 = i50;
                                        int i58 = i53;
                                        int i59 = i56;
                                        int i60 = i45;
                                        int i61 = i55;
                                        while (i61 > 0) {
                                            int min = Math.min(i47, i61);
                                            jArr15[i59] = j29;
                                            int i62 = i61;
                                            int i63 = a2 * min;
                                            iArr9[i59] = i63;
                                            int i64 = i52 + i63;
                                            i58 = Math.max(i58, i63);
                                            jArr4[i59] = i51 * j28;
                                            iArr10[i59] = 1;
                                            j29 += iArr9[i59];
                                            i51 += min;
                                            i59++;
                                            iArr8 = iArr8;
                                            i61 = i62 - min;
                                            i52 = i64;
                                        }
                                        int[] iArr11 = iArr8;
                                        int i65 = i57 + 1;
                                        i54 = i59;
                                        i53 = i58;
                                        i50 = i65;
                                        iArr8 = iArr11;
                                        i45 = i60;
                                    }
                                    j16 = j28 * i51;
                                    j17 = i52;
                                    arrayList2 = arrayList4;
                                    jArr7 = jArr15;
                                    iArr5 = iArr10;
                                    iArr6 = iArr9;
                                    i28 = i53;
                                } else {
                                    jArr3 = new long[b10];
                                    iArr = new int[b10];
                                    long[] jArr16 = new long[b10];
                                    int[] iArr12 = new int[b10];
                                    i19 = B2;
                                    int i66 = B4;
                                    arrayList2 = arrayList4;
                                    v vVar12 = vVar10;
                                    int i67 = i16;
                                    i20 = i18;
                                    long j30 = 0;
                                    long j31 = 0;
                                    j15 = 0;
                                    int i68 = 0;
                                    i21 = 0;
                                    i22 = 0;
                                    c cVar3 = cVar;
                                    i23 = B3;
                                    i24 = 0;
                                    int i69 = 0;
                                    while (true) {
                                        if (i24 < b10) {
                                            int i70 = b10;
                                            i25 = i17;
                                            i26 = i23;
                                            long[] jArr17 = jArr3;
                                            iArr2 = iArr;
                                            jArr4 = jArr16;
                                            jArr5 = jArr17;
                                            iArr3 = iArr12;
                                            b10 = i70;
                                            break;
                                        }
                                        boolean z16 = true;
                                        while (i21 == 0) {
                                            z16 = aVar.a();
                                            if (!z16) {
                                                break;
                                            }
                                            int i71 = i17;
                                            long j32 = aVar.d;
                                            i21 = aVar.c;
                                            j15 = j32;
                                            i17 = i71;
                                            i23 = i23;
                                            b10 = b10;
                                        }
                                        i29 = b10;
                                        i25 = i17;
                                        i26 = i23;
                                        if (!z16) {
                                            e2.a.n("BoxParsers", "Unexpected end of chunk data");
                                            jArr5 = Arrays.copyOf(jArr3, i24);
                                            iArr2 = Arrays.copyOf(iArr, i24);
                                            long[] copyOf = Arrays.copyOf(jArr16, i24);
                                            iArr3 = Arrays.copyOf(iArr12, i24);
                                            jArr4 = copyOf;
                                            b10 = i24;
                                            break;
                                        }
                                        if (vVar != null) {
                                            int i72 = i22;
                                            while (i72 == 0 && i67 > 0) {
                                                i72 = vVar.B();
                                                i69 = vVar.j();
                                                i67--;
                                            }
                                            i22 = i72 - 1;
                                        }
                                        jArr3[i24] = j15;
                                        int c11 = cVar3.c();
                                        iArr[i24] = c11;
                                        j30 += c11;
                                        if (c11 > i68) {
                                            i68 = c11;
                                        }
                                        jArr16[i24] = j31 + i69;
                                        iArr12[i24] = vVar12 == null ? 1 : 0;
                                        if (i24 == i20) {
                                            iArr12[i24] = 1;
                                            i17 = i25 - 1;
                                            if (i17 > 0) {
                                                vVar12.getClass();
                                                i20 = vVar12.B() - 1;
                                            }
                                            i30 = i20;
                                            jArr8 = jArr3;
                                        } else {
                                            i30 = i20;
                                            jArr8 = jArr3;
                                            i17 = i25;
                                        }
                                        j31 += i66;
                                        int i73 = i26 - 1;
                                        if (i73 == 0 && i19 > 0) {
                                            i73 = vVar9.B();
                                            i19--;
                                            i66 = vVar9.j();
                                        }
                                        int i74 = i73;
                                        j15 += iArr[i24];
                                        i21--;
                                        i24++;
                                        jArr3 = jArr8;
                                        i20 = i30;
                                        i23 = i74;
                                        b10 = i29;
                                    }
                                    i27 = i21;
                                    j16 = j31 + i69;
                                    if (vVar != null) {
                                        while (i67 > 0) {
                                            if (vVar.B() != 0) {
                                                z13 = false;
                                                break;
                                            }
                                            vVar.j();
                                            i67--;
                                        }
                                    }
                                    z13 = true;
                                    if (i25 != 0 && i26 == 0 && i27 == 0 && i19 == 0 && i22 == 0 && z13) {
                                        jArr6 = jArr5;
                                        iArr4 = iArr2;
                                    } else {
                                        StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                                        jArr6 = jArr5;
                                        iArr4 = iArr2;
                                        hg.c.u(sb2, qVar2.a, ": remainingSynchronizationSamples ", i25, ", remainingSamplesAtTimestampDelta ");
                                        hg.c.u(sb2, i26, ", remainingSamplesInChunk ", i27, ", remainingTimestampDeltaChanges ");
                                        sb2.append(i19);
                                        sb2.append(", remainingSamplesAtTimestampOffset ");
                                        sb2.append(i22);
                                        sb2.append(z13 ? ", ctts invalid" : "");
                                        e2.a.n("BoxParsers", sb2.toString());
                                    }
                                    i28 = i68;
                                    iArr5 = iArr3;
                                    jArr7 = jArr6;
                                    iArr6 = iArr4;
                                    j17 = j30;
                                }
                                long j33 = j16;
                                j18 = qVar2.f;
                                if (j18 > 0) {
                                    long X2 = d0.X(j17 * 8, 1000000L, j18, RoundingMode.HALF_DOWN);
                                    if (X2 > 0 && X2 < 2147483647L) {
                                        b2.r a12 = sVar4.a();
                                        a12.h = (int) X2;
                                        qVar2 = qVar2.a(new b2.s(a12));
                                    }
                                }
                                long j34 = qVar2.c;
                                b2.s sVar5 = qVar2.g;
                                int i75 = qVar2.b;
                                long[] jArr18 = qVar2.j;
                                jArr9 = qVar2.i;
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long X3 = d0.X(j33, 1000000L, j34, roundingMode);
                                if (jArr9 != null) {
                                    d0.W(jArr4, j34);
                                    tVar2 = new t(qVar2, jArr7, iArr6, i28, jArr4, iArr5, X3);
                                } else {
                                    if (jArr9.length == 1 && i75 == 1 && jArr4.length >= 2) {
                                        jArr18.getClass();
                                        long j35 = jArr18[0];
                                        i31 = b10;
                                        long X4 = d0.X(jArr9[0], qVar2.c, qVar2.d, roundingMode) + j35;
                                        int length = jArr4.length - 1;
                                        jArr10 = jArr18;
                                        int h = d0.h(4, 0, length);
                                        int h10 = d0.h(jArr4.length - 4, 0, length);
                                        long j36 = jArr4[0];
                                        if (j36 <= j35 && j35 < jArr4[h] && jArr4[h10] < X4 && X4 <= j33) {
                                            long X5 = d0.X(j35 - j36, sVar5.K, qVar2.c, roundingMode);
                                            long X6 = d0.X(j33 - X4, sVar5.K, qVar2.c, roundingMode);
                                            if ((X5 != 0 || X6 != 0) && X5 <= 2147483647L && X6 <= 2147483647L) {
                                                wVar.a = (int) X5;
                                                wVar.b = (int) X6;
                                                d0.W(jArr4, j34);
                                                tVar2 = new t(qVar2, jArr7, iArr6, i28, jArr4, iArr5, d0.X(jArr9[0], 1000000L, qVar2.d, roundingMode));
                                            }
                                        }
                                    } else {
                                        jArr10 = jArr18;
                                        i31 = b10;
                                    }
                                    int i76 = 1;
                                    if (jArr9.length == 1) {
                                        if (jArr9[0] == 0) {
                                            jArr10.getClass();
                                            long j37 = jArr10[0];
                                            for (int i77 = 0; i77 < jArr4.length; i77++) {
                                                jArr4[i77] = d0.X(jArr4[i77] - j37, 1000000L, qVar2.c, RoundingMode.DOWN);
                                            }
                                            t tVar3 = new t(qVar2, jArr7, iArr6, i28, jArr4, iArr5, d0.X(j33 - j37, 1000000L, qVar2.c, RoundingMode.DOWN));
                                            arrayList3 = arrayList2;
                                            tVar = tVar3;
                                            arrayList3.add(tVar);
                                        } else {
                                            i76 = 1;
                                        }
                                    }
                                    long[] jArr19 = jArr7;
                                    int[] iArr13 = iArr6;
                                    int[] iArr14 = iArr5;
                                    boolean z17 = i75 == i76;
                                    int[] iArr15 = new int[jArr9.length];
                                    int[] iArr16 = new int[jArr9.length];
                                    jArr10.getClass();
                                    int i78 = 0;
                                    boolean z18 = false;
                                    int i79 = 0;
                                    int i80 = 0;
                                    while (i78 < jArr9.length) {
                                        int[] iArr17 = iArr15;
                                        int[] iArr18 = iArr16;
                                        long j38 = jArr10[i78];
                                        if (j38 != -1) {
                                            i32 = i78;
                                            boolean z19 = z18;
                                            long X7 = d0.X(jArr9[i78], qVar2.c, qVar2.d, RoundingMode.DOWN);
                                            iArr7 = iArr17;
                                            iArr7[i32] = d0.e(jArr4, j38, true);
                                            long j39 = j38 + X7;
                                            iArr18[i32] = d0.a(jArr4, j39, z17);
                                            int i81 = iArr7[i32];
                                            while (true) {
                                                i33 = iArr7[i32];
                                                if (i33 < 0 || (iArr14[i33] & 1) != 0) {
                                                    break;
                                                }
                                                iArr7[i32] = i33 - 1;
                                            }
                                            if (i33 < 0) {
                                                iArr7[i32] = i81;
                                                while (true) {
                                                    int i82 = iArr7[i32];
                                                    if (i82 >= iArr18[i32] || (iArr14[i82] & 1) != 0) {
                                                        break;
                                                    }
                                                    iArr7[i32] = i82 + 1;
                                                }
                                            }
                                            if (i75 == 2 && iArr7[i32] != iArr18[i32]) {
                                                while (true) {
                                                    int i83 = iArr18[i32];
                                                    if (i83 >= jArr4.length - 1) {
                                                        break;
                                                    }
                                                    int i84 = i83 + 1;
                                                    if (jArr4[i84] > j39) {
                                                        break;
                                                    }
                                                    iArr18[i32] = i84;
                                                }
                                            }
                                            int i85 = iArr18[i32];
                                            int i86 = iArr7[i32];
                                            int i87 = (i85 - i86) + i79;
                                            boolean z20 = i80 != i86;
                                            i80 = i85;
                                            z18 = z19 | z20;
                                            i79 = i87;
                                        } else {
                                            iArr7 = iArr17;
                                            i32 = i78;
                                        }
                                        i78 = i32 + 1;
                                        iArr16 = iArr18;
                                        iArr15 = iArr7;
                                    }
                                    int[] iArr19 = iArr15;
                                    int[] iArr20 = iArr16;
                                    boolean z21 = z18 | (i79 != i31);
                                    long[] jArr20 = z21 ? new long[i79] : jArr19;
                                    int[] iArr21 = z21 ? new int[i79] : iArr13;
                                    if (z21) {
                                        i28 = 0;
                                    }
                                    int[] iArr22 = z21 ? new int[i79] : iArr14;
                                    long[] jArr21 = new long[i79];
                                    int i88 = 0;
                                    boolean z22 = false;
                                    int i89 = 0;
                                    int i90 = i28;
                                    long j40 = 0;
                                    while (i88 < jArr9.length) {
                                        long j41 = jArr10[i88];
                                        int i91 = iArr19[i88];
                                        boolean z23 = z21;
                                        int i92 = iArr20[i88];
                                        if (z23) {
                                            int i93 = i92 - i91;
                                            System.arraycopy(jArr19, i91, jArr20, i89, i93);
                                            System.arraycopy(iArr13, i91, iArr21, i89, i93);
                                            System.arraycopy(iArr14, i91, iArr22, i89, i93);
                                        }
                                        int i94 = i90;
                                        while (i91 < i92) {
                                            int i95 = i92;
                                            long[] jArr22 = jArr20;
                                            long j42 = qVar2.d;
                                            RoundingMode roundingMode2 = RoundingMode.DOWN;
                                            long X8 = d0.X(j40, 1000000L, j42, roundingMode2);
                                            long X9 = d0.X(jArr4[i91] - j41, 1000000L, qVar2.c, roundingMode2);
                                            if (X9 < 0) {
                                                z22 = true;
                                            }
                                            jArr21[i89] = X8 + X9;
                                            if (z23 && iArr21[i89] > i94) {
                                                i94 = iArr13[i91];
                                            }
                                            i89++;
                                            i91++;
                                            i92 = i95;
                                            jArr20 = jArr22;
                                        }
                                        j40 += jArr9[i88];
                                        i88++;
                                        i90 = i94;
                                        z21 = z23;
                                        jArr20 = jArr20;
                                    }
                                    long[] jArr23 = jArr20;
                                    long X10 = d0.X(j40, 1000000L, qVar2.d, RoundingMode.DOWN);
                                    if (z22) {
                                        b2.r a13 = sVar5.a();
                                        a13.w = true;
                                        qVar2 = qVar2.a(new b2.s(a13));
                                    }
                                    arrayList3 = arrayList2;
                                    tVar = new t(qVar2, jArr23, iArr21, i90, jArr21, iArr22, X10);
                                    arrayList3.add(tVar);
                                }
                                arrayList3 = arrayList2;
                                tVar = tVar2;
                            } else {
                                vVar10 = null;
                            }
                        } else {
                            i17 = 0;
                        }
                        i18 = -1;
                        a2 = cVar.a();
                        vVar = vVar11;
                        String str42 = sVar4.r;
                        if (a2 == -1) {
                        }
                        jArr3 = new long[b10];
                        iArr = new int[b10];
                        long[] jArr162 = new long[b10];
                        int[] iArr122 = new int[b10];
                        i19 = B2;
                        int i662 = B4;
                        arrayList2 = arrayList4;
                        v vVar122 = vVar10;
                        int i672 = i16;
                        i20 = i18;
                        long j302 = 0;
                        long j312 = 0;
                        j15 = 0;
                        int i682 = 0;
                        i21 = 0;
                        i22 = 0;
                        c cVar32 = cVar;
                        i23 = B3;
                        i24 = 0;
                        int i692 = 0;
                        while (true) {
                            if (i24 < b10) {
                            }
                            int i742 = i73;
                            j15 += iArr[i24];
                            i21--;
                            i24++;
                            jArr3 = jArr8;
                            i20 = i30;
                            i23 = i742;
                            b10 = i29;
                        }
                        i27 = i21;
                        j16 = j312 + i692;
                        if (vVar != null) {
                        }
                        z13 = true;
                        if (i25 != 0) {
                        }
                        StringBuilder sb22 = new StringBuilder("Inconsistent stbl box for track ");
                        jArr6 = jArr5;
                        iArr4 = iArr2;
                        hg.c.u(sb22, qVar2.a, ": remainingSynchronizationSamples ", i25, ", remainingSamplesAtTimestampDelta ");
                        hg.c.u(sb22, i26, ", remainingSamplesInChunk ", i27, ", remainingTimestampDeltaChanges ");
                        sb22.append(i19);
                        sb22.append(", remainingSamplesAtTimestampOffset ");
                        sb22.append(i22);
                        sb22.append(z13 ? ", ctts invalid" : "");
                        e2.a.n("BoxParsers", sb22.toString());
                        i28 = i682;
                        iArr5 = iArr3;
                        jArr7 = jArr6;
                        iArr6 = iArr4;
                        j17 = j302;
                        long j332 = j16;
                        j18 = qVar2.f;
                        if (j18 > 0) {
                        }
                        long j342 = qVar2.c;
                        b2.s sVar52 = qVar2.g;
                        int i752 = qVar2.b;
                        long[] jArr182 = qVar2.j;
                        jArr9 = qVar2.i;
                        RoundingMode roundingMode3 = RoundingMode.DOWN;
                        long X32 = d0.X(j332, 1000000L, j342, roundingMode3);
                        if (jArr9 != null) {
                        }
                        arrayList3 = arrayList2;
                        tVar = tVar2;
                    }
                    arrayList3.add(tVar);
                }
            }
            i34 = i14 + 1;
            dVar2 = dVar;
            arrayList4 = arrayList3;
        }
        return arrayList4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01bb, code lost:
    
        r1.J(r15);
        r16 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01a4, code lost:
    
        r1.J(r9);
        r1.K(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b7, code lost:
    
        r9 = new q3.l(r0, r8, r1.t(r10 - 16));
        r16 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c0, code lost:
    
        r16 = r3 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x023e, code lost:
    
        e2.a.d("MetadataUtil", "Skipped unknown metadata entry: " + ed.k.a(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0251, code lost:
    
        r1.J(r15);
        r9 = null;
        r16 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0079, code lost:
    
        r0 = q3.k.a(w3.p.h(r1) - 1);
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
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0272, code lost:
    
        r1.J(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0275, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x006f, code lost:
    
        r16 = r3 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01c5, code lost:
    
        r0 = 16777215 & r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01cc, code lost:
    
        if (r0 != 6516084) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01ce, code lost:
    
        r9 = w3.p.e(r13, r1);
        r16 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01d6, code lost:
    
        if (r0 == 7233901) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01db, code lost:
    
        if (r0 != 7631467) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01e2, code lost:
    
        if (r0 == 6516589) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01e7, code lost:
    
        if (r0 != 7828084) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01ee, code lost:
    
        if (r0 != 6578553) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01f0, code lost:
    
        r9 = w3.p.l(r13, r1, "TDRC");
        r16 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01fa, code lost:
    
        if (r0 != 4280916) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01fc, code lost:
    
        r9 = w3.p.l(r13, r1, "TPE1");
        r16 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        r1.J(r7);
        r7 = r7 + r13;
        r1.K(r0);
        r6 = new java.util.ArrayList();
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0206, code lost:
    
        if (r0 != 7630703) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0208, code lost:
    
        r9 = w3.p.l(r13, r1, "TSSE");
        r16 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0212, code lost:
    
        if (r0 != 6384738) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0214, code lost:
    
        r9 = w3.p.l(r13, r1, "TALB");
        r16 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x021e, code lost:
    
        if (r0 != 7108978) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0220, code lost:
    
        r9 = w3.p.l(r13, r1, "USLT");
        r16 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x022a, code lost:
    
        if (r0 != 6776174) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        r13 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x022c, code lost:
    
        r9 = w3.p.l(r13, r1, "TCON");
        r16 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0231, code lost:
    
        r16 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0234, code lost:
    
        if (r0 != 6779504) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0236, code lost:
    
        r9 = w3.p.l(r13, r1, "TIT1");
        r16 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0256, code lost:
    
        r9 = w3.p.l(r13, r1, "TCOM");
        r16 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x025e, code lost:
    
        r9 = w3.p.l(r13, r1, "TIT2");
        r16 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0276, code lost:
    
        r16 = r3 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x027c, code lost:
    
        if (r6.isEmpty() == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        if (r13 >= r7) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0280, code lost:
    
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
    
        r9 = w3.p.g(r13, r1, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        r1.J(r15);
        r16 = r3 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0266, code lost:
    
        if (r9 == null) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0268, code lost:
    
        r6.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x026b, code lost:
    
        r3 = r16;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ae, code lost:
    
        if (r13 != 1953655662) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b0, code lost:
    
        r9 = w3.p.g(r13, r1, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
    
        if (r13 != 1953329263) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bc, code lost:
    
        r9 = w3.p.i(r13, "TBPM", r1, true, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
    
        if (r13 != 1668311404) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
    
        r9 = w3.p.i(r13, "TCMP", r1, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d2, code lost:
    
        if (r13 != 1668249202) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d4, code lost:
    
        r9 = w3.p.f(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dc, code lost:
    
        if (r13 != 1631670868) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00de, code lost:
    
        r9 = w3.p.l(r13, r1, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e8, code lost:
    
        if (r13 != 1936682605) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ea, code lost:
    
        r9 = w3.p.l(r13, r1, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f4, code lost:
    
        if (r13 != 1936679276) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f6, code lost:
    
        r9 = w3.p.l(r13, r1, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0100, code lost:
    
        if (r13 != 1936679282) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0102, code lost:
    
        r9 = w3.p.l(r13, r1, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010c, code lost:
    
        if (r13 != 1936679265) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010e, code lost:
    
        r9 = w3.p.l(r13, r1, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0119, code lost:
    
        if (r13 != 1936679791) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011b, code lost:
    
        r9 = w3.p.l(r13, r1, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0126, code lost:
    
        if (r13 != 1920233063) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0128, code lost:
    
        r9 = w3.p.i(r13, "ITUNESADVISORY", r1, r3, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0133, code lost:
    
        if (r13 != 1885823344) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0135, code lost:
    
        r9 = w3.p.i(r13, "ITUNESGAPLESS", r1, r3, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0140, code lost:
    
        if (r13 != 1936683886) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0142, code lost:
    
        r9 = w3.p.l(r13, r1, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014d, code lost:
    
        if (r13 != 1953919848) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014f, code lost:
    
        r9 = w3.p.l(r13, r1, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015a, code lost:
    
        if (r13 != 757935405) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015c, code lost:
    
        r0 = r12;
        r8 = r0;
        r9 = -1;
        r10 = -1;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0160, code lost:
    
        r13 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0162, code lost:
    
        if (r13 >= r15) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0164, code lost:
    
        r14 = r1.j();
        r12 = r1.j();
        r16 = r3;
        r1.K(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0175, code lost:
    
        if (r12 != 1835360622) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0177, code lost:
    
        r0 = r1.t(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0196, code lost:
    
        r3 = r16;
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
    /* JADX WARN: Code restructure failed: missing block: B:93:0x019a, code lost:
    
        r16 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x019c, code lost:
    
        if (r0 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x019e, code lost:
    
        if (r8 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01a1, code lost:
    
        if (r9 != (-1)) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ba, code lost:
    
        r9 = null;
        r16 = r16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0328  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static p0 k(f2.e eVar) {
        int i10;
        int i11;
        p0 p0Var;
        p0 b10;
        f2.f fVar;
        o0[] o0VarArr;
        p0 p0Var2;
        int i12;
        v vVar = eVar.c;
        int i13 = 8;
        vVar.J(8);
        int i14 = 0;
        p0 p0Var3 = new p0(new o0[0]);
        while (vVar.a() >= i13) {
            int i15 = vVar.b;
            int j3 = vVar.j();
            int j10 = vVar.j();
            String str = null;
            if (j10 == 1835365473) {
                vVar.J(i15);
                int i16 = i15 + j3;
                vVar.K(i13);
                a(vVar);
                int i17 = i14;
                while (true) {
                    int i18 = vVar.b;
                    if (i18 >= i16) {
                        i10 = i17 == true ? 1 : 0;
                        break;
                    }
                    int j11 = vVar.j();
                    if (vVar.j() == 1768715124) {
                        break;
                    }
                    int i19 = i17 == true ? 1 : 0;
                    vVar.J(i18 + j11);
                    i17 = i19;
                    i13 = 8;
                    str = null;
                }
                p0 p0Var4 = null;
                p0Var3 = p0Var3.b(p0Var4);
                i11 = 8;
            } else {
                i10 = i14 == true ? 1 : 0;
                if (j10 == 1936553057) {
                    vVar.J(i15);
                    int i20 = i15 + j3;
                    vVar.K(12);
                    while (true) {
                        int i21 = vVar.b;
                        if (i21 >= i20) {
                            i11 = 8;
                            break;
                        }
                        int j12 = vVar.j();
                        if (vVar.j() != 1935766900) {
                            vVar.J(i21 + j12);
                        } else if (j12 < 16) {
                            p0Var2 = null;
                            i11 = 8;
                        } else {
                            vVar.K(4);
                            int i22 = -1;
                            int i23 = i10;
                            int i24 = i23;
                            while (i23 < 2) {
                                int x10 = vVar.x();
                                int x11 = vVar.x();
                                if (x10 == 0) {
                                    i22 = x11;
                                } else if (x10 == 1) {
                                    i24 = x11;
                                }
                                i23++;
                            }
                            if (i22 == 12) {
                                i12 = 240;
                            } else if (i22 == 13) {
                                i12 = 120;
                            } else if (i22 != 21) {
                                i12 = -2147483647;
                            } else {
                                i11 = 8;
                                if (vVar.a() >= 8 && vVar.b + 8 <= i20) {
                                    int j13 = vVar.j();
                                    int j14 = vVar.j();
                                    if (j13 >= 12 && j14 == 1936877170) {
                                        i12 = vVar.y();
                                        if (i12 != -2147483647) {
                                            r3.d dVar = new r3.d(i12, i24);
                                            o0[] o0VarArr2 = new o0[1];
                                            o0VarArr2[i10] = dVar;
                                            p0Var2 = new p0(o0VarArr2);
                                        }
                                    }
                                }
                                i12 = -2147483647;
                                if (i12 != -2147483647) {
                                }
                            }
                            i11 = 8;
                            if (i12 != -2147483647) {
                            }
                        }
                    }
                    p0Var2 = null;
                    b10 = p0Var3.b(p0Var2);
                } else {
                    i11 = 8;
                    if (j10 == -1451722374) {
                        short u10 = vVar.u();
                        vVar.K(2);
                        String v = vVar.v(u10, StandardCharsets.UTF_8);
                        int max = Math.max(v.lastIndexOf(43), v.lastIndexOf(45));
                        try {
                            try {
                                fVar = new f2.f(Float.parseFloat(v.substring(i10, max)), Float.parseFloat(v.substring(max, v.length() - 1)));
                                o0VarArr = new o0[1];
                                i10 = 0;
                            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                i10 = 0;
                            }
                            try {
                                o0VarArr[0] = fVar;
                                p0Var = new p0(o0VarArr);
                            } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                                p0Var = null;
                                b10 = p0Var3.b(p0Var);
                                p0Var3 = b10;
                                vVar.J(i15 + j3);
                                i13 = i11;
                                i14 = i10;
                            }
                        } catch (IndexOutOfBoundsException | NumberFormatException unused3) {
                            i10 = i10;
                        }
                        b10 = p0Var3.b(p0Var);
                    }
                }
                p0Var3 = b10;
            }
            vVar.J(i15 + j3);
            i13 = i11;
            i14 = i10;
        }
        return p0Var3;
    }
}
