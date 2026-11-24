// default package

import android.util.Pair;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rb3 {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final dbc c = new dbc();
    public k44 d;
    public byte e;
    public int f;
    public long g;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x0653, code lost:
    
        if (r4 == 0) goto L436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0688, code lost:
    
        r27 = r0;
        r18 = r3;
        r5 = r4;
        r16 = r6;
        r21 = r7;
        r38 = r13;
        r3 = -1;
        r4 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0686, code lost:
    
        if (r4 != 0) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x0a6b, code lost:
    
        if (r3.u() == r12.getLeastSignificantBits()) goto L547;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0ac2  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0ae4  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0af8  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0ce5  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0cf9  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0cfc  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0b08  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0ae7  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0ad8  */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r5v126, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v129 */
    /* JADX WARN: Type inference failed for: r5v130, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r5v131 */
    /* JADX WARN: Type inference failed for: r5v137 */
    /* JADX WARN: Type inference failed for: r5v139 */
    /* JADX WARN: Type inference failed for: r5v145 */
    /* JADX WARN: Type inference failed for: r5v146, types: [java.lang.Exception] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(vb3 vb3Var) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        String str;
        int i3;
        int b;
        String str2;
        char c;
        int i4;
        SparseArray sparseArray;
        String str3;
        tl6 tl6Var;
        List singletonList;
        int i5;
        ?? r5;
        String str4;
        int i6;
        String str5;
        String str6;
        int i7;
        long r;
        Pair pair;
        String str7;
        String str8;
        String str9;
        int i8;
        int i9;
        List list;
        int i10;
        int i11;
        int i12;
        String str10;
        int i13;
        int i14;
        int i15;
        List u;
        int C;
        int F;
        int i16;
        String str11;
        fo4 fo4Var;
        int i17;
        int i18;
        byte[] bArr;
        int i19;
        int i20;
        String str12;
        int i21;
        this.d.getClass();
        while (true) {
            ArrayDeque arrayDeque = this.b;
            qb3 qb3Var = (qb3) arrayDeque.peek();
            if (qb3Var != null) {
                i = 8;
                if (vb3Var.d >= qb3Var.b) {
                    k44 k44Var = this.d;
                    int i22 = ((qb3) arrayDeque.pop()).a;
                    tl6 tl6Var2 = (tl6) k44Var.b;
                    Map map = tl6.w0;
                    SparseArray sparseArray2 = tl6Var2.F;
                    SparseArray sparseArray3 = tl6Var2.c;
                    tl6Var2.q0.getClass();
                    if (i22 == 128) {
                        pl6 pl6Var = tl6Var2.A;
                        pl6Var.getClass();
                        if (pl6Var.f != null || (str2 = pl6Var.h) == null) {
                            return true;
                        }
                        pl6Var.f = str2;
                        String str13 = pl6Var.i;
                        if (str13 == null) {
                            return true;
                        }
                        pl6Var.g = str13;
                        return true;
                    }
                    if (i22 != 160) {
                        if (i22 == 174) {
                            sl6 sl6Var = tl6Var2.B;
                            sl6Var.getClass();
                            String str14 = sl6Var.c;
                            if (str14 == null) {
                                throw bx7.a("CodecId is missing in TrackEntry element", null);
                            }
                            switch (str14) {
                                case "V_MPEG4/ISO/AP":
                                case "V_MPEG4/ISO/SP":
                                case "A_MS/ACM":
                                case "A_TRUEHD":
                                case "A_VORBIS":
                                case "A_MPEG/L2":
                                case "A_MPEG/L3":
                                case "V_MS/VFW/FOURCC":
                                case "S_DVBSUB":
                                case "V_MPEG4/ISO/ASP":
                                case "V_MPEG4/ISO/AVC":
                                case "S_VOBSUB":
                                case "A_DTS/LOSSLESS":
                                case "A_AAC":
                                case "A_AC3":
                                case "A_DTS":
                                case "V_AV1":
                                case "V_VP8":
                                case "V_VP9":
                                case "S_HDMV/PGS":
                                case "V_THEORA":
                                case "A_DTS/EXPRESS":
                                case "A_PCM/FLOAT/IEEE":
                                case "A_PCM/INT/BIG":
                                case "A_PCM/INT/LIT":
                                case "S_TEXT/ASS":
                                case "S_TEXT/SSA":
                                case "V_MPEGH/ISO/HEVC":
                                case "S_TEXT/WEBVTT":
                                case "S_TEXT/UTF8":
                                case "V_MPEG2":
                                case "A_ALAC":
                                case "A_EAC3":
                                case "A_FLAC":
                                case "A_OPUS":
                                    int i23 = sl6Var.d;
                                    switch (str14.hashCode()) {
                                        case -2095576542:
                                            if (str14.equals("V_MPEG4/ISO/AP")) {
                                                c = 0;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -2095575984:
                                            if (str14.equals("V_MPEG4/ISO/SP")) {
                                                c = 1;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1985379776:
                                            if (str14.equals("A_MS/ACM")) {
                                                c = 2;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1784763192:
                                            if (str14.equals("A_TRUEHD")) {
                                                c = 3;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1730367663:
                                            if (str14.equals("A_VORBIS")) {
                                                c = 4;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1482641358:
                                            if (str14.equals("A_MPEG/L2")) {
                                                c = 5;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1482641357:
                                            if (str14.equals("A_MPEG/L3")) {
                                                c = 6;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1373388978:
                                            if (str14.equals("V_MS/VFW/FOURCC")) {
                                                c = 7;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -933872740:
                                            if (str14.equals("S_DVBSUB")) {
                                                c = '\b';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -538363189:
                                            if (str14.equals("V_MPEG4/ISO/ASP")) {
                                                c = '\t';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -538363109:
                                            if (str14.equals("V_MPEG4/ISO/AVC")) {
                                                c = '\n';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -425012669:
                                            if (str14.equals("S_VOBSUB")) {
                                                c = 11;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -356037306:
                                            if (str14.equals("A_DTS/LOSSLESS")) {
                                                c = '\f';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 62923557:
                                            if (str14.equals("A_AAC")) {
                                                c = '\r';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 62923603:
                                            if (str14.equals("A_AC3")) {
                                                c = 14;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 62927045:
                                            if (str14.equals("A_DTS")) {
                                                c = 15;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 82318131:
                                            if (str14.equals("V_AV1")) {
                                                c = 16;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 82338133:
                                            if (str14.equals("V_VP8")) {
                                                c = 17;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 82338134:
                                            if (str14.equals("V_VP9")) {
                                                c = 18;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 99146302:
                                            if (str14.equals("S_HDMV/PGS")) {
                                                c = 19;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 444813526:
                                            if (str14.equals("V_THEORA")) {
                                                c = 20;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 542569478:
                                            if (str14.equals("A_DTS/EXPRESS")) {
                                                c = 21;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 635596514:
                                            if (str14.equals("A_PCM/FLOAT/IEEE")) {
                                                c = 22;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 725948237:
                                            if (str14.equals("A_PCM/INT/BIG")) {
                                                c = 23;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 725957860:
                                            if (str14.equals("A_PCM/INT/LIT")) {
                                                c = 24;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 738597099:
                                            if (str14.equals("S_TEXT/ASS")) {
                                                c = 25;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 738614379:
                                            if (str14.equals("S_TEXT/SSA")) {
                                                c = 26;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 855502857:
                                            if (str14.equals("V_MPEGH/ISO/HEVC")) {
                                                c = 27;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1045209816:
                                            if (str14.equals("S_TEXT/WEBVTT")) {
                                                c = 28;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1422270023:
                                            if (str14.equals("S_TEXT/UTF8")) {
                                                c = 29;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1809237540:
                                            if (str14.equals("V_MPEG2")) {
                                                c = 30;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1950640843:
                                            if (str14.equals("A_ALAC")) {
                                                c = 31;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1950749482:
                                            if (str14.equals("A_EAC3")) {
                                                c = ' ';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1950789798:
                                            if (str14.equals("A_FLAC")) {
                                                c = '!';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1951062397:
                                            if (str14.equals("A_OPUS")) {
                                                c = '\"';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        default:
                                            c = 65535;
                                            break;
                                    }
                                    String str15 = "video/x-unknown";
                                    char c2 = c;
                                    ?? r52 = "MatroskaExtractor";
                                    switch (c2) {
                                        case 0:
                                        case 1:
                                        case '\t':
                                            i4 = i23;
                                            sparseArray = sparseArray3;
                                            str3 = "video/webm";
                                            byte[] bArr2 = sl6Var.m;
                                            str15 = "video/mp4v-es";
                                            tl6Var = tl6Var2;
                                            singletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                                            str6 = str15;
                                            i7 = -1;
                                            i6 = -1;
                                            i5 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            i15 = -1;
                                            str8 = null;
                                            if (sl6Var.P == null) {
                                                i16 = i6;
                                                du2 a = du2.a(new yw7(sl6Var.P));
                                                if (a != null) {
                                                    str11 = "video/dolby-vision";
                                                    str8 = a.b;
                                                    int i24 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                                    fo4Var = new fo4();
                                                    if (wf7.i(str11)) {
                                                        fo4Var.M = sl6Var.Q;
                                                        fo4Var.N = sl6Var.S;
                                                        fo4Var.O = sl6Var.T;
                                                        fo4Var.P = i5;
                                                    } else if (wf7.m(str11)) {
                                                        if (sl6Var.t == 0) {
                                                            int i25 = sl6Var.r;
                                                            i17 = -1;
                                                            if (i25 == -1) {
                                                                i25 = sl6Var.o;
                                                            }
                                                            sl6Var.r = i25;
                                                            int i26 = sl6Var.s;
                                                            if (i26 == -1) {
                                                                i26 = sl6Var.p;
                                                            }
                                                            sl6Var.s = i26;
                                                        } else {
                                                            i17 = -1;
                                                        }
                                                        float f = (sl6Var.r == i17 || (i20 = sl6Var.s) == i17) ? -1.0f : (sl6Var.p * r5) / (sl6Var.o * i20);
                                                        if (i8 == -1 && i13 == -1) {
                                                            if (i14 == -1 || sl6Var.C != -1) {
                                                                i8 = sl6Var.A;
                                                                i13 = sl6Var.B;
                                                                i14 = sl6Var.C;
                                                            } else {
                                                                i8 = sl6Var.A;
                                                                i13 = sl6Var.B;
                                                            }
                                                        }
                                                        int i27 = i13;
                                                        int i28 = i14;
                                                        int i29 = i8;
                                                        int i30 = (i7 == -1 && (i7 = sl6Var.q) == -1) ? 8 : i7;
                                                        if (i15 != -1) {
                                                            i18 = i15;
                                                        } else {
                                                            int i31 = sl6Var.q;
                                                            i18 = i31 != -1 ? i31 : 8;
                                                        }
                                                        if (sl6Var.F == -1.0f || sl6Var.G == -1.0f || sl6Var.H == -1.0f || sl6Var.I == -1.0f || sl6Var.J == -1.0f || sl6Var.K == -1.0f || sl6Var.L == -1.0f || sl6Var.M == -1.0f || sl6Var.N == -1.0f || sl6Var.O == -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            byte[] bArr3 = new byte[25];
                                                            ByteBuffer order = ByteBuffer.wrap(bArr3).order(ByteOrder.LITTLE_ENDIAN);
                                                            order.put((byte) 0);
                                                            order.putShort((short) ((sl6Var.F * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((sl6Var.G * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((sl6Var.H * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((sl6Var.I * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((sl6Var.J * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((sl6Var.K * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((sl6Var.L * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((sl6Var.M * 50000.0f) + 0.5f));
                                                            order.putShort((short) (sl6Var.N + 0.5f));
                                                            order.putShort((short) (sl6Var.O + 0.5f));
                                                            order.putShort((short) sl6Var.D);
                                                            order.putShort((short) sl6Var.E);
                                                            bArr = bArr3;
                                                        }
                                                        tm2 tm2Var = new tm2(i29, i28, i27, bArr, i30, i18);
                                                        String str16 = sl6Var.b;
                                                        int intValue = (str16 == null || !map.containsKey(str16)) ? -1 : ((Integer) map.get(sl6Var.b)).intValue();
                                                        if (sl6Var.u == 0 && Float.compare(sl6Var.v, 0.0f) == 0 && Float.compare(sl6Var.w, 0.0f) == 0) {
                                                            if (Float.compare(sl6Var.x, 0.0f) == 0) {
                                                                i19 = 0;
                                                            } else if (Float.compare(sl6Var.x, 90.0f) == 0) {
                                                                i19 = 90;
                                                            } else if (Float.compare(sl6Var.x, -180.0f) == 0 || Float.compare(sl6Var.x, 180.0f) == 0) {
                                                                i19 = nm7.J2;
                                                            } else if (Float.compare(sl6Var.x, -90.0f) == 0) {
                                                                i19 = nm7.s4;
                                                            }
                                                            fo4Var.z = sl6Var.o;
                                                            fo4Var.A = sl6Var.p;
                                                            fo4Var.H = f;
                                                            fo4Var.F = i19;
                                                            fo4Var.I = sl6Var.y;
                                                            fo4Var.J = sl6Var.z;
                                                            fo4Var.K = tm2Var;
                                                        }
                                                        i19 = intValue;
                                                        fo4Var.z = sl6Var.o;
                                                        fo4Var.A = sl6Var.p;
                                                        fo4Var.H = f;
                                                        fo4Var.F = i19;
                                                        fo4Var.I = sl6Var.y;
                                                        fo4Var.J = sl6Var.z;
                                                        fo4Var.K = tm2Var;
                                                    } else if (!"application/x-subrip".equals(str11) && !"text/x-ssa".equals(str11) && !"text/vtt".equals(str11) && !"application/vobsub".equals(str11) && !"application/pgs".equals(str11) && !"application/dvbsubs".equals(str11)) {
                                                        throw bx7.a("Unexpected MIME type.", null);
                                                    }
                                                    str12 = sl6Var.b;
                                                    if (str12 != null && !map.containsKey(str12)) {
                                                        fo4Var.b = sl6Var.b;
                                                    }
                                                    fo4Var.a = Integer.toString(i4);
                                                    fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                                    fo4Var.s = wf7.n(str11);
                                                    fo4Var.t = i16;
                                                    fo4Var.d = sl6Var.c0;
                                                    fo4Var.e = i24;
                                                    fo4Var.v = singletonList;
                                                    fo4Var.k = str8;
                                                    fo4Var.w = sl6Var.n;
                                                    sl6Var.e0 = new go4(fo4Var);
                                                    tl6Var2 = tl6Var;
                                                    sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                                    sparseArray.put(sl6Var.d, sl6Var);
                                                    break;
                                                }
                                            } else {
                                                i16 = i6;
                                            }
                                            str11 = str6;
                                            int i242 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                            fo4Var = new fo4();
                                            if (wf7.i(str11)) {
                                            }
                                            str12 = sl6Var.b;
                                            if (str12 != null) {
                                                fo4Var.b = sl6Var.b;
                                            }
                                            fo4Var.a = Integer.toString(i4);
                                            fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                            fo4Var.s = wf7.n(str11);
                                            fo4Var.t = i16;
                                            fo4Var.d = sl6Var.c0;
                                            fo4Var.e = i242;
                                            fo4Var.v = singletonList;
                                            fo4Var.k = str8;
                                            fo4Var.w = sl6Var.n;
                                            sl6Var.e0 = new go4(fo4Var);
                                            tl6Var2 = tl6Var;
                                            sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                            sparseArray.put(sl6Var.d, sl6Var);
                                            break;
                                        case 2:
                                            i4 = i23;
                                            sparseArray = sparseArray3;
                                            str3 = "video/webm";
                                            yw7 yw7Var = new yw7(sl6Var.a(sl6Var.c));
                                            try {
                                                int t = yw7Var.t();
                                                if (t != 1) {
                                                    if (t == 65534) {
                                                        yw7Var.N(20);
                                                        int s = yw7Var.s();
                                                        if ((s >> 18) == 0 && (s == 0 || Integer.bitCount(s) == sl6Var.Q)) {
                                                            sl6Var.S = s == 0 ? -1 : s << 2;
                                                        }
                                                        long u2 = yw7Var.u();
                                                        UUID uuid = tl6.v0;
                                                        if (u2 == uuid.getMostSignificantBits()) {
                                                            break;
                                                        }
                                                    }
                                                    ncd.f("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                    tl6Var = tl6Var2;
                                                    str6 = "audio/x-unknown";
                                                    i7 = -1;
                                                    i6 = -1;
                                                    i5 = -1;
                                                    i13 = -1;
                                                    i14 = -1;
                                                    i8 = -1;
                                                    i15 = -1;
                                                    str8 = null;
                                                    singletonList = null;
                                                    if (sl6Var.P == null) {
                                                    }
                                                    str11 = str6;
                                                    int i2422 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                                    fo4Var = new fo4();
                                                    if (wf7.i(str11)) {
                                                    }
                                                    str12 = sl6Var.b;
                                                    if (str12 != null) {
                                                    }
                                                    fo4Var.a = Integer.toString(i4);
                                                    fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                                    fo4Var.s = wf7.n(str11);
                                                    fo4Var.t = i16;
                                                    fo4Var.d = sl6Var.c0;
                                                    fo4Var.e = i2422;
                                                    fo4Var.v = singletonList;
                                                    fo4Var.k = str8;
                                                    fo4Var.w = sl6Var.n;
                                                    sl6Var.e0 = new go4(fo4Var);
                                                    tl6Var2 = tl6Var;
                                                    sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                                    sparseArray.put(sl6Var.d, sl6Var);
                                                    break;
                                                }
                                                int i32 = sl6Var.R;
                                                String str17 = hac.a;
                                                int F2 = hac.F(i32, ByteOrder.LITTLE_ENDIAN);
                                                if (F2 == 0) {
                                                    ncd.f("MatroskaExtractor", "Unsupported PCM bit depth: " + sl6Var.R + ". Setting mimeType to audio/x-unknown");
                                                    tl6Var = tl6Var2;
                                                    str6 = "audio/x-unknown";
                                                    i7 = -1;
                                                    i6 = -1;
                                                    i5 = -1;
                                                    i13 = -1;
                                                    i14 = -1;
                                                    i8 = -1;
                                                    i15 = -1;
                                                    str8 = null;
                                                    singletonList = null;
                                                    if (sl6Var.P == null) {
                                                    }
                                                    str11 = str6;
                                                    int i24222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                                    fo4Var = new fo4();
                                                    if (wf7.i(str11)) {
                                                    }
                                                    str12 = sl6Var.b;
                                                    if (str12 != null) {
                                                    }
                                                    fo4Var.a = Integer.toString(i4);
                                                    fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                                    fo4Var.s = wf7.n(str11);
                                                    fo4Var.t = i16;
                                                    fo4Var.d = sl6Var.c0;
                                                    fo4Var.e = i24222;
                                                    fo4Var.v = singletonList;
                                                    fo4Var.k = str8;
                                                    fo4Var.w = sl6Var.n;
                                                    sl6Var.e0 = new go4(fo4Var);
                                                    tl6Var2 = tl6Var;
                                                    sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                                    sparseArray.put(sl6Var.d, sl6Var);
                                                } else {
                                                    tl6Var = tl6Var2;
                                                    i5 = F2;
                                                    str6 = "audio/raw";
                                                    i7 = -1;
                                                    i6 = -1;
                                                    i13 = -1;
                                                    i14 = -1;
                                                    i8 = -1;
                                                    i15 = -1;
                                                    str8 = null;
                                                    singletonList = null;
                                                    if (sl6Var.P == null) {
                                                    }
                                                    str11 = str6;
                                                    int i242222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                                    fo4Var = new fo4();
                                                    if (wf7.i(str11)) {
                                                    }
                                                    str12 = sl6Var.b;
                                                    if (str12 != null) {
                                                    }
                                                    fo4Var.a = Integer.toString(i4);
                                                    fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                                    fo4Var.s = wf7.n(str11);
                                                    fo4Var.t = i16;
                                                    fo4Var.d = sl6Var.c0;
                                                    fo4Var.e = i242222;
                                                    fo4Var.v = singletonList;
                                                    fo4Var.k = str8;
                                                    fo4Var.w = sl6Var.n;
                                                    sl6Var.e0 = new go4(fo4Var);
                                                    tl6Var2 = tl6Var;
                                                    sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                                    sparseArray.put(sl6Var.d, sl6Var);
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                throw bx7.a("Error parsing MS/ACM codec private", null);
                                            }
                                            break;
                                        case 3:
                                            i4 = i23;
                                            sparseArray = sparseArray3;
                                            str3 = "video/webm";
                                            sl6Var.W = new g4c();
                                            str15 = "audio/true-hd";
                                            tl6Var = tl6Var2;
                                            str6 = str15;
                                            i7 = -1;
                                            i6 = -1;
                                            i5 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            i15 = -1;
                                            str8 = null;
                                            singletonList = null;
                                            if (sl6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i2422222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                            fo4Var = new fo4();
                                            if (wf7.i(str11)) {
                                            }
                                            str12 = sl6Var.b;
                                            if (str12 != null) {
                                            }
                                            fo4Var.a = Integer.toString(i4);
                                            fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                            fo4Var.s = wf7.n(str11);
                                            fo4Var.t = i16;
                                            fo4Var.d = sl6Var.c0;
                                            fo4Var.e = i2422222;
                                            fo4Var.v = singletonList;
                                            fo4Var.k = str8;
                                            fo4Var.w = sl6Var.n;
                                            sl6Var.e0 = new go4(fo4Var);
                                            tl6Var2 = tl6Var;
                                            sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                            sparseArray.put(sl6Var.d, sl6Var);
                                            break;
                                        case 4:
                                            str3 = "video/webm";
                                            byte[] a2 = sl6Var.a(str14);
                                            try {
                                                r5 = a2[0];
                                            } catch (ArrayIndexOutOfBoundsException unused2) {
                                                r5 = 0;
                                            }
                                            try {
                                                if (r5 != 2) {
                                                    throw bx7.a("Error parsing vorbis codec private", null);
                                                }
                                                int i33 = 0;
                                                int i34 = 1;
                                                while (true) {
                                                    i4 = i23;
                                                    int i35 = a2[i34] & nm7.d4;
                                                    if (i35 != 255) {
                                                        int i36 = i34 + 1;
                                                        int i37 = i33 + i35;
                                                        int i38 = 0;
                                                        while (true) {
                                                            int i39 = i36;
                                                            int i40 = a2[i39] & nm7.d4;
                                                            if (i40 != 255) {
                                                                int i41 = i39 + 1;
                                                                int i42 = i38 + i40;
                                                                if (a2[i41] != 1) {
                                                                    throw bx7.a("Error parsing vorbis codec private", null);
                                                                }
                                                                byte[] bArr4 = new byte[i37];
                                                                System.arraycopy(a2, i41, bArr4, 0, i37);
                                                                int i43 = i41 + i37;
                                                                if (a2[i43] != 3) {
                                                                    throw bx7.a("Error parsing vorbis codec private", null);
                                                                }
                                                                int i44 = i43 + i42;
                                                                if (a2[i44] != 5) {
                                                                    throw bx7.a("Error parsing vorbis codec private", null);
                                                                }
                                                                byte[] bArr5 = new byte[a2.length - i44];
                                                                sparseArray = sparseArray3;
                                                                System.arraycopy(a2, i44, bArr5, 0, a2.length - i44);
                                                                ArrayList arrayList = new ArrayList(2);
                                                                arrayList.add(bArr4);
                                                                arrayList.add(bArr5);
                                                                str4 = "audio/vorbis";
                                                                i6 = TLObject.FLAG_13;
                                                                tl6Var = tl6Var2;
                                                                singletonList = arrayList;
                                                                str6 = str4;
                                                                i7 = -1;
                                                                i5 = -1;
                                                                i13 = -1;
                                                                i14 = -1;
                                                                i8 = -1;
                                                                i15 = -1;
                                                                str8 = null;
                                                                if (sl6Var.P == null) {
                                                                }
                                                                str11 = str6;
                                                                int i24222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                                                fo4Var = new fo4();
                                                                if (wf7.i(str11)) {
                                                                }
                                                                str12 = sl6Var.b;
                                                                if (str12 != null) {
                                                                }
                                                                fo4Var.a = Integer.toString(i4);
                                                                fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                                                fo4Var.s = wf7.n(str11);
                                                                fo4Var.t = i16;
                                                                fo4Var.d = sl6Var.c0;
                                                                fo4Var.e = i24222222;
                                                                fo4Var.v = singletonList;
                                                                fo4Var.k = str8;
                                                                fo4Var.w = sl6Var.n;
                                                                sl6Var.e0 = new go4(fo4Var);
                                                                tl6Var2 = tl6Var;
                                                                sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                                                sparseArray.put(sl6Var.d, sl6Var);
                                                                break;
                                                            } else {
                                                                i38 += nm7.d4;
                                                                i36 = i39 + 1;
                                                            }
                                                        }
                                                    } else {
                                                        i33 += nm7.d4;
                                                        i34++;
                                                        i23 = i4;
                                                    }
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                                throw bx7.a("Error parsing vorbis codec private", r5);
                                            }
                                            break;
                                        case 5:
                                            str3 = "video/webm";
                                            str5 = "audio/mpeg-L2";
                                            tl6Var = tl6Var2;
                                            i4 = i23;
                                            sparseArray = sparseArray3;
                                            str6 = str5;
                                            i7 = -1;
                                            i6 = TLObject.FLAG_12;
                                            i5 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            i15 = -1;
                                            str8 = null;
                                            singletonList = null;
                                            if (sl6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i242222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                            fo4Var = new fo4();
                                            if (wf7.i(str11)) {
                                            }
                                            str12 = sl6Var.b;
                                            if (str12 != null) {
                                            }
                                            fo4Var.a = Integer.toString(i4);
                                            fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                            fo4Var.s = wf7.n(str11);
                                            fo4Var.t = i16;
                                            fo4Var.d = sl6Var.c0;
                                            fo4Var.e = i242222222;
                                            fo4Var.v = singletonList;
                                            fo4Var.k = str8;
                                            fo4Var.w = sl6Var.n;
                                            sl6Var.e0 = new go4(fo4Var);
                                            tl6Var2 = tl6Var;
                                            sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                            sparseArray.put(sl6Var.d, sl6Var);
                                            break;
                                        case 6:
                                            str3 = "video/webm";
                                            str5 = "audio/mpeg";
                                            tl6Var = tl6Var2;
                                            i4 = i23;
                                            sparseArray = sparseArray3;
                                            str6 = str5;
                                            i7 = -1;
                                            i6 = TLObject.FLAG_12;
                                            i5 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            i15 = -1;
                                            str8 = null;
                                            singletonList = null;
                                            if (sl6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i2422222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                            fo4Var = new fo4();
                                            if (wf7.i(str11)) {
                                            }
                                            str12 = sl6Var.b;
                                            if (str12 != null) {
                                            }
                                            fo4Var.a = Integer.toString(i4);
                                            fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                            fo4Var.s = wf7.n(str11);
                                            fo4Var.t = i16;
                                            fo4Var.d = sl6Var.c0;
                                            fo4Var.e = i2422222222;
                                            fo4Var.v = singletonList;
                                            fo4Var.k = str8;
                                            fo4Var.w = sl6Var.n;
                                            sl6Var.e0 = new go4(fo4Var);
                                            tl6Var2 = tl6Var;
                                            sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                            sparseArray.put(sl6Var.d, sl6Var);
                                            break;
                                        case 7:
                                            str3 = "video/webm";
                                            yw7 yw7Var2 = new yw7(sl6Var.a(sl6Var.c));
                                            try {
                                                yw7Var2.O(16);
                                                r = yw7Var2.r();
                                            } catch (ArrayIndexOutOfBoundsException unused4) {
                                                r52 = 0;
                                            }
                                            try {
                                                if (r == 1482049860) {
                                                    pair = new Pair("video/divx", null);
                                                } else if (r == 859189832) {
                                                    pair = new Pair("video/3gpp", null);
                                                } else {
                                                    if (r == 826496599) {
                                                        byte[] bArr6 = yw7Var2.a;
                                                        for (int i45 = yw7Var2.b + 20; i45 < bArr6.length - 4; i45++) {
                                                            if (bArr6[i45] == 0 && bArr6[i45 + 1] == 0 && bArr6[i45 + 2] == 1 && bArr6[i45 + 3] == 15) {
                                                                pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr6, i45, bArr6.length)));
                                                            }
                                                        }
                                                        throw bx7.a("Failed to find FourCC VC1 initialization data", null);
                                                    }
                                                    ncd.f("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                    str7 = null;
                                                    pair = new Pair("video/x-unknown", null);
                                                    tl6Var = tl6Var2;
                                                    str8 = str7;
                                                    i4 = i23;
                                                    sparseArray = sparseArray3;
                                                    str6 = (String) pair.first;
                                                    singletonList = (List) pair.second;
                                                    i7 = -1;
                                                    i6 = -1;
                                                    i5 = -1;
                                                    i13 = -1;
                                                    i14 = -1;
                                                    i8 = -1;
                                                    i15 = -1;
                                                    if (sl6Var.P == null) {
                                                    }
                                                    str11 = str6;
                                                    int i24222222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                                    fo4Var = new fo4();
                                                    if (wf7.i(str11)) {
                                                    }
                                                    str12 = sl6Var.b;
                                                    if (str12 != null) {
                                                    }
                                                    fo4Var.a = Integer.toString(i4);
                                                    fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                                    fo4Var.s = wf7.n(str11);
                                                    fo4Var.t = i16;
                                                    fo4Var.d = sl6Var.c0;
                                                    fo4Var.e = i24222222222;
                                                    fo4Var.v = singletonList;
                                                    fo4Var.k = str8;
                                                    fo4Var.w = sl6Var.n;
                                                    sl6Var.e0 = new go4(fo4Var);
                                                    tl6Var2 = tl6Var;
                                                    sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                                    sparseArray.put(sl6Var.d, sl6Var);
                                                    break;
                                                }
                                                str7 = null;
                                                tl6Var = tl6Var2;
                                                str8 = str7;
                                                i4 = i23;
                                                sparseArray = sparseArray3;
                                                str6 = (String) pair.first;
                                                singletonList = (List) pair.second;
                                                i7 = -1;
                                                i6 = -1;
                                                i5 = -1;
                                                i13 = -1;
                                                i14 = -1;
                                                i8 = -1;
                                                i15 = -1;
                                                if (sl6Var.P == null) {
                                                }
                                                str11 = str6;
                                                int i242222222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                                fo4Var = new fo4();
                                                if (wf7.i(str11)) {
                                                }
                                                str12 = sl6Var.b;
                                                if (str12 != null) {
                                                }
                                                fo4Var.a = Integer.toString(i4);
                                                fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                                fo4Var.s = wf7.n(str11);
                                                fo4Var.t = i16;
                                                fo4Var.d = sl6Var.c0;
                                                fo4Var.e = i242222222222;
                                                fo4Var.v = singletonList;
                                                fo4Var.k = str8;
                                                fo4Var.w = sl6Var.n;
                                                sl6Var.e0 = new go4(fo4Var);
                                                tl6Var2 = tl6Var;
                                                sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                                sparseArray.put(sl6Var.d, sl6Var);
                                            } catch (ArrayIndexOutOfBoundsException unused5) {
                                                throw bx7.a("Error parsing FourCC private data", r52);
                                            }
                                            break;
                                        case '\b':
                                            str3 = "video/webm";
                                            byte[] bArr7 = new byte[4];
                                            System.arraycopy(sl6Var.a(str14), 0, bArr7, 0, 4);
                                            tl6Var = tl6Var2;
                                            singletonList = mo5.u(bArr7);
                                            i4 = i23;
                                            sparseArray = sparseArray3;
                                            str6 = "application/dvbsubs";
                                            i7 = -1;
                                            i6 = -1;
                                            i5 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            i15 = -1;
                                            str8 = null;
                                            if (sl6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i2422222222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                            fo4Var = new fo4();
                                            if (wf7.i(str11)) {
                                            }
                                            str12 = sl6Var.b;
                                            if (str12 != null) {
                                            }
                                            fo4Var.a = Integer.toString(i4);
                                            fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                            fo4Var.s = wf7.n(str11);
                                            fo4Var.t = i16;
                                            fo4Var.d = sl6Var.c0;
                                            fo4Var.e = i2422222222222;
                                            fo4Var.v = singletonList;
                                            fo4Var.k = str8;
                                            fo4Var.w = sl6Var.n;
                                            sl6Var.e0 = new go4(fo4Var);
                                            tl6Var2 = tl6Var;
                                            sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                            sparseArray.put(sl6Var.d, sl6Var);
                                            break;
                                        case '\n':
                                            str3 = "video/webm";
                                            kd0 a3 = kd0.a(new yw7(sl6Var.a(sl6Var.c)));
                                            ArrayList arrayList2 = a3.a;
                                            sl6Var.f0 = a3.b;
                                            str9 = a3.l;
                                            i8 = a3.g;
                                            i9 = a3.i;
                                            list = arrayList2;
                                            i10 = a3.h;
                                            i11 = a3.e;
                                            i12 = a3.f;
                                            str10 = "video/avc";
                                            tl6Var = tl6Var2;
                                            sparseArray = sparseArray3;
                                            i14 = i10;
                                            str6 = str10;
                                            str8 = str9;
                                            singletonList = list;
                                            i5 = -1;
                                            i4 = i23;
                                            i13 = i9;
                                            i15 = i12;
                                            i7 = i11;
                                            i6 = -1;
                                            if (sl6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i24222222222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                            fo4Var = new fo4();
                                            if (wf7.i(str11)) {
                                            }
                                            str12 = sl6Var.b;
                                            if (str12 != null) {
                                            }
                                            fo4Var.a = Integer.toString(i4);
                                            fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                            fo4Var.s = wf7.n(str11);
                                            fo4Var.t = i16;
                                            fo4Var.d = sl6Var.c0;
                                            fo4Var.e = i24222222222222;
                                            fo4Var.v = singletonList;
                                            fo4Var.k = str8;
                                            fo4Var.w = sl6Var.n;
                                            sl6Var.e0 = new go4(fo4Var);
                                            tl6Var2 = tl6Var;
                                            sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                            sparseArray.put(sl6Var.d, sl6Var);
                                            break;
                                        case 11:
                                            str3 = "video/webm";
                                            tl6Var = tl6Var2;
                                            singletonList = mo5.u(sl6Var.a(str14));
                                            i4 = i23;
                                            sparseArray = sparseArray3;
                                            str6 = "application/vobsub";
                                            i7 = -1;
                                            i6 = -1;
                                            i5 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            i15 = -1;
                                            str8 = null;
                                            if (sl6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i242222222222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                            fo4Var = new fo4();
                                            if (wf7.i(str11)) {
                                            }
                                            str12 = sl6Var.b;
                                            if (str12 != null) {
                                            }
                                            fo4Var.a = Integer.toString(i4);
                                            fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                            fo4Var.s = wf7.n(str11);
                                            fo4Var.t = i16;
                                            fo4Var.d = sl6Var.c0;
                                            fo4Var.e = i242222222222222;
                                            fo4Var.v = singletonList;
                                            fo4Var.k = str8;
                                            fo4Var.w = sl6Var.n;
                                            sl6Var.e0 = new go4(fo4Var);
                                            tl6Var2 = tl6Var;
                                            sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                            sparseArray.put(sl6Var.d, sl6Var);
                                            break;
                                        case '\f':
                                            str3 = "video/webm";
                                            str15 = "audio/vnd.dts.hd";
                                            tl6Var = tl6Var2;
                                            i4 = i23;
                                            sparseArray = sparseArray3;
                                            str6 = str15;
                                            i7 = -1;
                                            i6 = -1;
                                            i5 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            i15 = -1;
                                            str8 = null;
                                            singletonList = null;
                                            if (sl6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i2422222222222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                            fo4Var = new fo4();
                                            if (wf7.i(str11)) {
                                            }
                                            str12 = sl6Var.b;
                                            if (str12 != null) {
                                            }
                                            fo4Var.a = Integer.toString(i4);
                                            fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                            fo4Var.s = wf7.n(str11);
                                            fo4Var.t = i16;
                                            fo4Var.d = sl6Var.c0;
                                            fo4Var.e = i2422222222222222;
                                            fo4Var.v = singletonList;
                                            fo4Var.k = str8;
                                            fo4Var.w = sl6Var.n;
                                            sl6Var.e0 = new go4(fo4Var);
                                            tl6Var2 = tl6Var;
                                            sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                            sparseArray.put(sl6Var.d, sl6Var);
                                            break;
                                        case '\r':
                                            str3 = "video/webm";
                                            List singletonList2 = Collections.singletonList(sl6Var.a(str14));
                                            byte[] bArr8 = sl6Var.m;
                                            g1 j = bo2.j(new ye1(bArr8.length, bArr8), false);
                                            sl6Var.T = j.a;
                                            sl6Var.Q = j.b;
                                            tl6Var = tl6Var2;
                                            singletonList = singletonList2;
                                            str8 = j.c;
                                            i4 = i23;
                                            sparseArray = sparseArray3;
                                            str6 = "audio/mp4a-latm";
                                            i7 = -1;
                                            i6 = -1;
                                            i5 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            i15 = -1;
                                            if (sl6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i24222222222222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                            fo4Var = new fo4();
                                            if (wf7.i(str11)) {
                                            }
                                            str12 = sl6Var.b;
                                            if (str12 != null) {
                                            }
                                            fo4Var.a = Integer.toString(i4);
                                            fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                            fo4Var.s = wf7.n(str11);
                                            fo4Var.t = i16;
                                            fo4Var.d = sl6Var.c0;
                                            fo4Var.e = i24222222222222222;
                                            fo4Var.v = singletonList;
                                            fo4Var.k = str8;
                                            fo4Var.w = sl6Var.n;
                                            sl6Var.e0 = new go4(fo4Var);
                                            tl6Var2 = tl6Var;
                                            sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                            sparseArray.put(sl6Var.d, sl6Var);
                                            break;
                                        case 14:
                                            str3 = "video/webm";
                                            str15 = "audio/ac3";
                                            tl6Var = tl6Var2;
                                            i4 = i23;
                                            sparseArray = sparseArray3;
                                            str6 = str15;
                                            i7 = -1;
                                            i6 = -1;
                                            i5 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            i15 = -1;
                                            str8 = null;
                                            singletonList = null;
                                            if (sl6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i242222222222222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                            fo4Var = new fo4();
                                            if (wf7.i(str11)) {
                                            }
                                            str12 = sl6Var.b;
                                            if (str12 != null) {
                                            }
                                            fo4Var.a = Integer.toString(i4);
                                            fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                            fo4Var.s = wf7.n(str11);
                                            fo4Var.t = i16;
                                            fo4Var.d = sl6Var.c0;
                                            fo4Var.e = i242222222222222222;
                                            fo4Var.v = singletonList;
                                            fo4Var.k = str8;
                                            fo4Var.w = sl6Var.n;
                                            sl6Var.e0 = new go4(fo4Var);
                                            tl6Var2 = tl6Var;
                                            sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                            sparseArray.put(sl6Var.d, sl6Var);
                                            break;
                                        case 15:
                                            str3 = "video/webm";
                                            sl6Var.X = true;
                                            str15 = "audio/vnd.dts";
                                            tl6Var = tl6Var2;
                                            i4 = i23;
                                            sparseArray = sparseArray3;
                                            str6 = str15;
                                            i7 = -1;
                                            i6 = -1;
                                            i5 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            i15 = -1;
                                            str8 = null;
                                            singletonList = null;
                                            if (sl6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i2422222222222222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                            fo4Var = new fo4();
                                            if (wf7.i(str11)) {
                                            }
                                            str12 = sl6Var.b;
                                            if (str12 != null) {
                                            }
                                            fo4Var.a = Integer.toString(i4);
                                            fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                            fo4Var.s = wf7.n(str11);
                                            fo4Var.t = i16;
                                            fo4Var.d = sl6Var.c0;
                                            fo4Var.e = i2422222222222222222;
                                            fo4Var.v = singletonList;
                                            fo4Var.k = str8;
                                            fo4Var.w = sl6Var.n;
                                            sl6Var.e0 = new go4(fo4Var);
                                            tl6Var2 = tl6Var;
                                            sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                            sparseArray.put(sl6Var.d, sl6Var);
                                            break;
                                        case 16:
                                            str3 = "video/webm";
                                            byte[] bArr9 = sl6Var.m;
                                            str15 = "video/av01";
                                            if (bArr9 != null) {
                                                u = mo5.u(bArr9);
                                                ub0 b2 = ub0.b(sl6Var.m);
                                                if (b2 != null) {
                                                    int i46 = b2.b;
                                                    int i47 = b2.d;
                                                    int i48 = b2.c;
                                                    i7 = b2.a;
                                                    singletonList = u;
                                                    tl6Var = tl6Var2;
                                                    str8 = b2.e;
                                                    sparseArray = sparseArray3;
                                                    str6 = "video/av01";
                                                    i14 = i48;
                                                    i6 = -1;
                                                    i15 = i7;
                                                    i4 = i23;
                                                    i13 = i47;
                                                    i8 = i46;
                                                    i5 = -1;
                                                    if (sl6Var.P == null) {
                                                    }
                                                    str11 = str6;
                                                    int i24222222222222222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                                    fo4Var = new fo4();
                                                    if (wf7.i(str11)) {
                                                    }
                                                    str12 = sl6Var.b;
                                                    if (str12 != null) {
                                                    }
                                                    fo4Var.a = Integer.toString(i4);
                                                    fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                                    fo4Var.s = wf7.n(str11);
                                                    fo4Var.t = i16;
                                                    fo4Var.d = sl6Var.c0;
                                                    fo4Var.e = i24222222222222222222;
                                                    fo4Var.v = singletonList;
                                                    fo4Var.k = str8;
                                                    fo4Var.w = sl6Var.n;
                                                    sl6Var.e0 = new go4(fo4Var);
                                                    tl6Var2 = tl6Var;
                                                    sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                                    sparseArray.put(sl6Var.d, sl6Var);
                                                    break;
                                                }
                                                tl6Var = tl6Var2;
                                                singletonList = u;
                                                i4 = i23;
                                                sparseArray = sparseArray3;
                                                str6 = str15;
                                                i7 = -1;
                                                i6 = -1;
                                                i5 = -1;
                                                i13 = -1;
                                                i14 = -1;
                                                i8 = -1;
                                                i15 = -1;
                                                str8 = null;
                                                if (sl6Var.P == null) {
                                                }
                                                str11 = str6;
                                                int i242222222222222222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                                fo4Var = new fo4();
                                                if (wf7.i(str11)) {
                                                }
                                                str12 = sl6Var.b;
                                                if (str12 != null) {
                                                }
                                                fo4Var.a = Integer.toString(i4);
                                                fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                                fo4Var.s = wf7.n(str11);
                                                fo4Var.t = i16;
                                                fo4Var.d = sl6Var.c0;
                                                fo4Var.e = i242222222222222222222;
                                                fo4Var.v = singletonList;
                                                fo4Var.k = str8;
                                                fo4Var.w = sl6Var.n;
                                                sl6Var.e0 = new go4(fo4Var);
                                                tl6Var2 = tl6Var;
                                                sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                                sparseArray.put(sl6Var.d, sl6Var);
                                            }
                                            tl6Var = tl6Var2;
                                            i4 = i23;
                                            sparseArray = sparseArray3;
                                            str6 = str15;
                                            i7 = -1;
                                            i6 = -1;
                                            i5 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            i15 = -1;
                                            str8 = null;
                                            singletonList = null;
                                            if (sl6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i2422222222222222222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                            fo4Var = new fo4();
                                            if (wf7.i(str11)) {
                                            }
                                            str12 = sl6Var.b;
                                            if (str12 != null) {
                                            }
                                            fo4Var.a = Integer.toString(i4);
                                            fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                            fo4Var.s = wf7.n(str11);
                                            fo4Var.t = i16;
                                            fo4Var.d = sl6Var.c0;
                                            fo4Var.e = i2422222222222222222222;
                                            fo4Var.v = singletonList;
                                            fo4Var.k = str8;
                                            fo4Var.w = sl6Var.n;
                                            sl6Var.e0 = new go4(fo4Var);
                                            tl6Var2 = tl6Var;
                                            sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                            sparseArray.put(sl6Var.d, sl6Var);
                                            break;
                                        case 17:
                                            str3 = "video/webm";
                                            str15 = "video/x-vnd.on2.vp8";
                                            tl6Var = tl6Var2;
                                            i4 = i23;
                                            sparseArray = sparseArray3;
                                            str6 = str15;
                                            i7 = -1;
                                            i6 = -1;
                                            i5 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            i15 = -1;
                                            str8 = null;
                                            singletonList = null;
                                            if (sl6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i24222222222222222222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                            fo4Var = new fo4();
                                            if (wf7.i(str11)) {
                                            }
                                            str12 = sl6Var.b;
                                            if (str12 != null) {
                                            }
                                            fo4Var.a = Integer.toString(i4);
                                            fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                            fo4Var.s = wf7.n(str11);
                                            fo4Var.t = i16;
                                            fo4Var.d = sl6Var.c0;
                                            fo4Var.e = i24222222222222222222222;
                                            fo4Var.v = singletonList;
                                            fo4Var.k = str8;
                                            fo4Var.w = sl6Var.n;
                                            sl6Var.e0 = new go4(fo4Var);
                                            tl6Var2 = tl6Var;
                                            sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                            sparseArray.put(sl6Var.d, sl6Var);
                                            break;
                                        case 18:
                                            str3 = "video/webm";
                                            byte[] bArr10 = sl6Var.m;
                                            u = bArr10 == null ? null : mo5.u(bArr10);
                                            str15 = "video/x-vnd.on2.vp9";
                                            tl6Var = tl6Var2;
                                            singletonList = u;
                                            i4 = i23;
                                            sparseArray = sparseArray3;
                                            str6 = str15;
                                            i7 = -1;
                                            i6 = -1;
                                            i5 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            i15 = -1;
                                            str8 = null;
                                            if (sl6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i242222222222222222222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                            fo4Var = new fo4();
                                            if (wf7.i(str11)) {
                                            }
                                            str12 = sl6Var.b;
                                            if (str12 != null) {
                                            }
                                            fo4Var.a = Integer.toString(i4);
                                            fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                            fo4Var.s = wf7.n(str11);
                                            fo4Var.t = i16;
                                            fo4Var.d = sl6Var.c0;
                                            fo4Var.e = i242222222222222222222222;
                                            fo4Var.v = singletonList;
                                            fo4Var.k = str8;
                                            fo4Var.w = sl6Var.n;
                                            sl6Var.e0 = new go4(fo4Var);
                                            tl6Var2 = tl6Var;
                                            sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                            sparseArray.put(sl6Var.d, sl6Var);
                                            break;
                                        case 19:
                                            str3 = "video/webm";
                                            tl6Var = tl6Var2;
                                            i4 = i23;
                                            sparseArray = sparseArray3;
                                            str6 = "application/pgs";
                                            i7 = -1;
                                            i6 = -1;
                                            i5 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            i15 = -1;
                                            str8 = null;
                                            singletonList = null;
                                            if (sl6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i2422222222222222222222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                            fo4Var = new fo4();
                                            if (wf7.i(str11)) {
                                            }
                                            str12 = sl6Var.b;
                                            if (str12 != null) {
                                            }
                                            fo4Var.a = Integer.toString(i4);
                                            fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                            fo4Var.s = wf7.n(str11);
                                            fo4Var.t = i16;
                                            fo4Var.d = sl6Var.c0;
                                            fo4Var.e = i2422222222222222222222222;
                                            fo4Var.v = singletonList;
                                            fo4Var.k = str8;
                                            fo4Var.w = sl6Var.n;
                                            sl6Var.e0 = new go4(fo4Var);
                                            tl6Var2 = tl6Var;
                                            sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                            sparseArray.put(sl6Var.d, sl6Var);
                                            break;
                                        case 20:
                                            str3 = "video/webm";
                                            tl6Var = tl6Var2;
                                            i4 = i23;
                                            sparseArray = sparseArray3;
                                            str6 = str15;
                                            i7 = -1;
                                            i6 = -1;
                                            i5 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            i15 = -1;
                                            str8 = null;
                                            singletonList = null;
                                            if (sl6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i24222222222222222222222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                            fo4Var = new fo4();
                                            if (wf7.i(str11)) {
                                            }
                                            str12 = sl6Var.b;
                                            if (str12 != null) {
                                            }
                                            fo4Var.a = Integer.toString(i4);
                                            fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                            fo4Var.s = wf7.n(str11);
                                            fo4Var.t = i16;
                                            fo4Var.d = sl6Var.c0;
                                            fo4Var.e = i24222222222222222222222222;
                                            fo4Var.v = singletonList;
                                            fo4Var.k = str8;
                                            fo4Var.w = sl6Var.n;
                                            sl6Var.e0 = new go4(fo4Var);
                                            tl6Var2 = tl6Var;
                                            sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                            sparseArray.put(sl6Var.d, sl6Var);
                                            break;
                                        case 21:
                                            str3 = "video/webm";
                                            str15 = "audio/vnd.dts.hd;profile=lbr";
                                            tl6Var = tl6Var2;
                                            i4 = i23;
                                            sparseArray = sparseArray3;
                                            str6 = str15;
                                            i7 = -1;
                                            i6 = -1;
                                            i5 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            i15 = -1;
                                            str8 = null;
                                            singletonList = null;
                                            if (sl6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i242222222222222222222222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                            fo4Var = new fo4();
                                            if (wf7.i(str11)) {
                                            }
                                            str12 = sl6Var.b;
                                            if (str12 != null) {
                                            }
                                            fo4Var.a = Integer.toString(i4);
                                            fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                            fo4Var.s = wf7.n(str11);
                                            fo4Var.t = i16;
                                            fo4Var.d = sl6Var.c0;
                                            fo4Var.e = i242222222222222222222222222;
                                            fo4Var.v = singletonList;
                                            fo4Var.k = str8;
                                            fo4Var.w = sl6Var.n;
                                            sl6Var.e0 = new go4(fo4Var);
                                            tl6Var2 = tl6Var;
                                            sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                            sparseArray.put(sl6Var.d, sl6Var);
                                            break;
                                        case 22:
                                            str3 = "video/webm";
                                            int i49 = sl6Var.R;
                                            String str18 = hac.a;
                                            C = hac.C(i49, ByteOrder.LITTLE_ENDIAN);
                                            if (C == 0) {
                                                ncd.f("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + sl6Var.R + ". Setting mimeType to audio/x-unknown");
                                                tl6Var = tl6Var2;
                                                i4 = i23;
                                                sparseArray = sparseArray3;
                                                str6 = "audio/x-unknown";
                                                i7 = -1;
                                                i6 = -1;
                                                i5 = -1;
                                                i13 = -1;
                                                i14 = -1;
                                                i8 = -1;
                                                i15 = -1;
                                                str8 = null;
                                                singletonList = null;
                                                if (sl6Var.P == null) {
                                                }
                                                str11 = str6;
                                                int i2422222222222222222222222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                                fo4Var = new fo4();
                                                if (wf7.i(str11)) {
                                                }
                                                str12 = sl6Var.b;
                                                if (str12 != null) {
                                                }
                                                fo4Var.a = Integer.toString(i4);
                                                fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                                fo4Var.s = wf7.n(str11);
                                                fo4Var.t = i16;
                                                fo4Var.d = sl6Var.c0;
                                                fo4Var.e = i2422222222222222222222222222;
                                                fo4Var.v = singletonList;
                                                fo4Var.k = str8;
                                                fo4Var.w = sl6Var.n;
                                                sl6Var.e0 = new go4(fo4Var);
                                                tl6Var2 = tl6Var;
                                                sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                                sparseArray.put(sl6Var.d, sl6Var);
                                                break;
                                            }
                                            tl6Var = tl6Var2;
                                            i5 = C;
                                            i4 = i23;
                                            sparseArray = sparseArray3;
                                            str6 = "audio/raw";
                                            i7 = -1;
                                            i6 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            i15 = -1;
                                            str8 = null;
                                            singletonList = null;
                                            if (sl6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i24222222222222222222222222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                            fo4Var = new fo4();
                                            if (wf7.i(str11)) {
                                            }
                                            str12 = sl6Var.b;
                                            if (str12 != null) {
                                            }
                                            fo4Var.a = Integer.toString(i4);
                                            fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                            fo4Var.s = wf7.n(str11);
                                            fo4Var.t = i16;
                                            fo4Var.d = sl6Var.c0;
                                            fo4Var.e = i24222222222222222222222222222;
                                            fo4Var.v = singletonList;
                                            fo4Var.k = str8;
                                            fo4Var.w = sl6Var.n;
                                            sl6Var.e0 = new go4(fo4Var);
                                            tl6Var2 = tl6Var;
                                            sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                            sparseArray.put(sl6Var.d, sl6Var);
                                            break;
                                        case 23:
                                            str3 = "video/webm";
                                            C = hac.F(sl6Var.R, ByteOrder.BIG_ENDIAN);
                                            if (C == 0) {
                                                ncd.f("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + sl6Var.R + ". Setting mimeType to audio/x-unknown");
                                                tl6Var = tl6Var2;
                                                i4 = i23;
                                                sparseArray = sparseArray3;
                                                str6 = "audio/x-unknown";
                                                i7 = -1;
                                                i6 = -1;
                                                i5 = -1;
                                                i13 = -1;
                                                i14 = -1;
                                                i8 = -1;
                                                i15 = -1;
                                                str8 = null;
                                                singletonList = null;
                                                if (sl6Var.P == null) {
                                                }
                                                str11 = str6;
                                                int i242222222222222222222222222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                                fo4Var = new fo4();
                                                if (wf7.i(str11)) {
                                                }
                                                str12 = sl6Var.b;
                                                if (str12 != null) {
                                                }
                                                fo4Var.a = Integer.toString(i4);
                                                fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                                fo4Var.s = wf7.n(str11);
                                                fo4Var.t = i16;
                                                fo4Var.d = sl6Var.c0;
                                                fo4Var.e = i242222222222222222222222222222;
                                                fo4Var.v = singletonList;
                                                fo4Var.k = str8;
                                                fo4Var.w = sl6Var.n;
                                                sl6Var.e0 = new go4(fo4Var);
                                                tl6Var2 = tl6Var;
                                                sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                                sparseArray.put(sl6Var.d, sl6Var);
                                                break;
                                            }
                                            tl6Var = tl6Var2;
                                            i5 = C;
                                            i4 = i23;
                                            sparseArray = sparseArray3;
                                            str6 = "audio/raw";
                                            i7 = -1;
                                            i6 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            i15 = -1;
                                            str8 = null;
                                            singletonList = null;
                                            if (sl6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i2422222222222222222222222222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                            fo4Var = new fo4();
                                            if (wf7.i(str11)) {
                                            }
                                            str12 = sl6Var.b;
                                            if (str12 != null) {
                                            }
                                            fo4Var.a = Integer.toString(i4);
                                            fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                            fo4Var.s = wf7.n(str11);
                                            fo4Var.t = i16;
                                            fo4Var.d = sl6Var.c0;
                                            fo4Var.e = i2422222222222222222222222222222;
                                            fo4Var.v = singletonList;
                                            fo4Var.k = str8;
                                            fo4Var.w = sl6Var.n;
                                            sl6Var.e0 = new go4(fo4Var);
                                            tl6Var2 = tl6Var;
                                            sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                            sparseArray.put(sl6Var.d, sl6Var);
                                            break;
                                        case 24:
                                            str3 = "video/webm";
                                            int i50 = sl6Var.R;
                                            String str19 = hac.a;
                                            C = hac.F(i50, ByteOrder.LITTLE_ENDIAN);
                                            if (C == 0) {
                                                ncd.f("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + sl6Var.R + ". Setting mimeType to audio/x-unknown");
                                                tl6Var = tl6Var2;
                                                i4 = i23;
                                                sparseArray = sparseArray3;
                                                str6 = "audio/x-unknown";
                                                i7 = -1;
                                                i6 = -1;
                                                i5 = -1;
                                                i13 = -1;
                                                i14 = -1;
                                                i8 = -1;
                                                i15 = -1;
                                                str8 = null;
                                                singletonList = null;
                                                if (sl6Var.P == null) {
                                                }
                                                str11 = str6;
                                                int i24222222222222222222222222222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                                fo4Var = new fo4();
                                                if (wf7.i(str11)) {
                                                }
                                                str12 = sl6Var.b;
                                                if (str12 != null) {
                                                }
                                                fo4Var.a = Integer.toString(i4);
                                                fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                                fo4Var.s = wf7.n(str11);
                                                fo4Var.t = i16;
                                                fo4Var.d = sl6Var.c0;
                                                fo4Var.e = i24222222222222222222222222222222;
                                                fo4Var.v = singletonList;
                                                fo4Var.k = str8;
                                                fo4Var.w = sl6Var.n;
                                                sl6Var.e0 = new go4(fo4Var);
                                                tl6Var2 = tl6Var;
                                                sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                                sparseArray.put(sl6Var.d, sl6Var);
                                                break;
                                            }
                                            tl6Var = tl6Var2;
                                            i5 = C;
                                            i4 = i23;
                                            sparseArray = sparseArray3;
                                            str6 = "audio/raw";
                                            i7 = -1;
                                            i6 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            i15 = -1;
                                            str8 = null;
                                            singletonList = null;
                                            if (sl6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i242222222222222222222222222222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                            fo4Var = new fo4();
                                            if (wf7.i(str11)) {
                                            }
                                            str12 = sl6Var.b;
                                            if (str12 != null) {
                                            }
                                            fo4Var.a = Integer.toString(i4);
                                            fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                            fo4Var.s = wf7.n(str11);
                                            fo4Var.t = i16;
                                            fo4Var.d = sl6Var.c0;
                                            fo4Var.e = i242222222222222222222222222222222;
                                            fo4Var.v = singletonList;
                                            fo4Var.k = str8;
                                            fo4Var.w = sl6Var.n;
                                            sl6Var.e0 = new go4(fo4Var);
                                            tl6Var2 = tl6Var;
                                            sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                            sparseArray.put(sl6Var.d, sl6Var);
                                            break;
                                        case 25:
                                        case 26:
                                            str3 = "video/webm";
                                            tl6Var = tl6Var2;
                                            singletonList = mo5.v(tl6.s0, sl6Var.a(str14));
                                            i4 = i23;
                                            sparseArray = sparseArray3;
                                            str6 = "text/x-ssa";
                                            i7 = -1;
                                            i6 = -1;
                                            i5 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            i15 = -1;
                                            str8 = null;
                                            if (sl6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i2422222222222222222222222222222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                            fo4Var = new fo4();
                                            if (wf7.i(str11)) {
                                            }
                                            str12 = sl6Var.b;
                                            if (str12 != null) {
                                            }
                                            fo4Var.a = Integer.toString(i4);
                                            fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                            fo4Var.s = wf7.n(str11);
                                            fo4Var.t = i16;
                                            fo4Var.d = sl6Var.c0;
                                            fo4Var.e = i2422222222222222222222222222222222;
                                            fo4Var.v = singletonList;
                                            fo4Var.k = str8;
                                            fo4Var.w = sl6Var.n;
                                            sl6Var.e0 = new go4(fo4Var);
                                            tl6Var2 = tl6Var;
                                            sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                            sparseArray.put(sl6Var.d, sl6Var);
                                            break;
                                        case 27:
                                            str3 = "video/webm";
                                            xf5 a4 = xf5.a(new yw7(sl6Var.a(sl6Var.c)), false, null);
                                            List list2 = a4.a;
                                            sl6Var.f0 = a4.b;
                                            str9 = a4.n;
                                            i8 = a4.h;
                                            i9 = a4.j;
                                            list = list2;
                                            i10 = a4.i;
                                            i11 = a4.f;
                                            i12 = a4.g;
                                            str10 = "video/hevc";
                                            tl6Var = tl6Var2;
                                            sparseArray = sparseArray3;
                                            i14 = i10;
                                            str6 = str10;
                                            str8 = str9;
                                            singletonList = list;
                                            i5 = -1;
                                            i4 = i23;
                                            i13 = i9;
                                            i15 = i12;
                                            i7 = i11;
                                            i6 = -1;
                                            if (sl6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i24222222222222222222222222222222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                            fo4Var = new fo4();
                                            if (wf7.i(str11)) {
                                            }
                                            str12 = sl6Var.b;
                                            if (str12 != null) {
                                            }
                                            fo4Var.a = Integer.toString(i4);
                                            fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                            fo4Var.s = wf7.n(str11);
                                            fo4Var.t = i16;
                                            fo4Var.d = sl6Var.c0;
                                            fo4Var.e = i24222222222222222222222222222222222;
                                            fo4Var.v = singletonList;
                                            fo4Var.k = str8;
                                            fo4Var.w = sl6Var.n;
                                            sl6Var.e0 = new go4(fo4Var);
                                            tl6Var2 = tl6Var;
                                            sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                            sparseArray.put(sl6Var.d, sl6Var);
                                            break;
                                        case 28:
                                            str3 = "video/webm";
                                            tl6Var = tl6Var2;
                                            i4 = i23;
                                            sparseArray = sparseArray3;
                                            str6 = "text/vtt";
                                            i7 = -1;
                                            i6 = -1;
                                            i5 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            i15 = -1;
                                            str8 = null;
                                            singletonList = null;
                                            if (sl6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i242222222222222222222222222222222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                            fo4Var = new fo4();
                                            if (wf7.i(str11)) {
                                            }
                                            str12 = sl6Var.b;
                                            if (str12 != null) {
                                            }
                                            fo4Var.a = Integer.toString(i4);
                                            fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                            fo4Var.s = wf7.n(str11);
                                            fo4Var.t = i16;
                                            fo4Var.d = sl6Var.c0;
                                            fo4Var.e = i242222222222222222222222222222222222;
                                            fo4Var.v = singletonList;
                                            fo4Var.k = str8;
                                            fo4Var.w = sl6Var.n;
                                            sl6Var.e0 = new go4(fo4Var);
                                            tl6Var2 = tl6Var;
                                            sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                            sparseArray.put(sl6Var.d, sl6Var);
                                            break;
                                        case 29:
                                            str3 = "video/webm";
                                            tl6Var = tl6Var2;
                                            i4 = i23;
                                            sparseArray = sparseArray3;
                                            str6 = "application/x-subrip";
                                            i7 = -1;
                                            i6 = -1;
                                            i5 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            i15 = -1;
                                            str8 = null;
                                            singletonList = null;
                                            if (sl6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i2422222222222222222222222222222222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                            fo4Var = new fo4();
                                            if (wf7.i(str11)) {
                                            }
                                            str12 = sl6Var.b;
                                            if (str12 != null) {
                                            }
                                            fo4Var.a = Integer.toString(i4);
                                            fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                            fo4Var.s = wf7.n(str11);
                                            fo4Var.t = i16;
                                            fo4Var.d = sl6Var.c0;
                                            fo4Var.e = i2422222222222222222222222222222222222;
                                            fo4Var.v = singletonList;
                                            fo4Var.k = str8;
                                            fo4Var.w = sl6Var.n;
                                            sl6Var.e0 = new go4(fo4Var);
                                            tl6Var2 = tl6Var;
                                            sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                            sparseArray.put(sl6Var.d, sl6Var);
                                            break;
                                        case nm7.S /* 30 */:
                                            str3 = "video/webm";
                                            str15 = "video/mpeg2";
                                            tl6Var = tl6Var2;
                                            i4 = i23;
                                            sparseArray = sparseArray3;
                                            str6 = str15;
                                            i7 = -1;
                                            i6 = -1;
                                            i5 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            i15 = -1;
                                            str8 = null;
                                            singletonList = null;
                                            if (sl6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i24222222222222222222222222222222222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                            fo4Var = new fo4();
                                            if (wf7.i(str11)) {
                                            }
                                            str12 = sl6Var.b;
                                            if (str12 != null) {
                                            }
                                            fo4Var.a = Integer.toString(i4);
                                            fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                            fo4Var.s = wf7.n(str11);
                                            fo4Var.t = i16;
                                            fo4Var.d = sl6Var.c0;
                                            fo4Var.e = i24222222222222222222222222222222222222;
                                            fo4Var.v = singletonList;
                                            fo4Var.k = str8;
                                            fo4Var.w = sl6Var.n;
                                            sl6Var.e0 = new go4(fo4Var);
                                            tl6Var2 = tl6Var;
                                            sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                            sparseArray.put(sl6Var.d, sl6Var);
                                            break;
                                        case 31:
                                            str3 = "video/webm";
                                            u = Collections.singletonList(sl6Var.a(str14));
                                            int i51 = sl6Var.R;
                                            String str20 = hac.a;
                                            F = hac.F(i51, ByteOrder.LITTLE_ENDIAN);
                                            str15 = "audio/alac";
                                            break;
                                        case ' ':
                                            str3 = "video/webm";
                                            str15 = "audio/eac3";
                                            tl6Var = tl6Var2;
                                            i4 = i23;
                                            sparseArray = sparseArray3;
                                            str6 = str15;
                                            i7 = -1;
                                            i6 = -1;
                                            i5 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            i15 = -1;
                                            str8 = null;
                                            singletonList = null;
                                            if (sl6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i242222222222222222222222222222222222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                            fo4Var = new fo4();
                                            if (wf7.i(str11)) {
                                            }
                                            str12 = sl6Var.b;
                                            if (str12 != null) {
                                            }
                                            fo4Var.a = Integer.toString(i4);
                                            fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                            fo4Var.s = wf7.n(str11);
                                            fo4Var.t = i16;
                                            fo4Var.d = sl6Var.c0;
                                            fo4Var.e = i242222222222222222222222222222222222222;
                                            fo4Var.v = singletonList;
                                            fo4Var.k = str8;
                                            fo4Var.w = sl6Var.n;
                                            sl6Var.e0 = new go4(fo4Var);
                                            tl6Var2 = tl6Var;
                                            sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                            sparseArray.put(sl6Var.d, sl6Var);
                                            break;
                                        case '!':
                                            str3 = "video/webm";
                                            u = Collections.singletonList(sl6Var.a(str14));
                                            int i52 = sl6Var.R;
                                            String str21 = hac.a;
                                            F = hac.F(i52, ByteOrder.LITTLE_ENDIAN);
                                            str15 = "audio/flac";
                                            break;
                                        case '\"':
                                            ArrayList arrayList3 = new ArrayList(3);
                                            arrayList3.add(sl6Var.a(sl6Var.c));
                                            ByteBuffer allocate = ByteBuffer.allocate(8);
                                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                            str3 = "video/webm";
                                            arrayList3.add(allocate.order(byteOrder).putLong(sl6Var.U).array());
                                            arrayList3.add(ByteBuffer.allocate(8).order(byteOrder).putLong(sl6Var.V).array());
                                            str4 = "audio/opus";
                                            i6 = 5760;
                                            tl6Var = tl6Var2;
                                            singletonList = arrayList3;
                                            i4 = i23;
                                            sparseArray = sparseArray3;
                                            str6 = str4;
                                            i7 = -1;
                                            i5 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            i15 = -1;
                                            str8 = null;
                                            if (sl6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i2422222222222222222222222222222222222222 = (sl6Var.b0 ? 1 : 0) | (sl6Var.a0 ? 2 : 0);
                                            fo4Var = new fo4();
                                            if (wf7.i(str11)) {
                                            }
                                            str12 = sl6Var.b;
                                            if (str12 != null) {
                                            }
                                            fo4Var.a = Integer.toString(i4);
                                            fo4Var.r = wf7.n(sl6Var.a ? str3 : "video/x-matroska");
                                            fo4Var.s = wf7.n(str11);
                                            fo4Var.t = i16;
                                            fo4Var.d = sl6Var.c0;
                                            fo4Var.e = i2422222222222222222222222222222222222222;
                                            fo4Var.v = singletonList;
                                            fo4Var.k = str8;
                                            fo4Var.w = sl6Var.n;
                                            sl6Var.e0 = new go4(fo4Var);
                                            tl6Var2 = tl6Var;
                                            sl6Var.d0 = tl6Var2.q0.c0(sl6Var.d, sl6Var.f);
                                            sparseArray.put(sl6Var.d, sl6Var);
                                            break;
                                        default:
                                            throw bx7.a("Unrecognized codec identifier.", null);
                                    }
                            }
                            tl6Var2.B = null;
                            return true;
                        }
                        if (i22 == 17849) {
                            for (int i53 = 0; i53 < sparseArray3.size(); i53++) {
                                tl6Var2.q((sl6) sparseArray3.valueAt(i53));
                            }
                        } else {
                            if (i22 == 19899) {
                                int i54 = tl6Var2.D;
                                if (i54 != -1) {
                                    long j2 = tl6Var2.E;
                                    if (j2 != -1) {
                                        if (i54 == 475249515) {
                                            tl6Var2.N = j2;
                                            return true;
                                        }
                                        if (i54 == 374648427) {
                                            tl6Var2.P = j2;
                                            return true;
                                        }
                                    }
                                }
                                throw bx7.a("Mandatory element SeekID or SeekPosition not found", null);
                            }
                            if (i22 == 25152) {
                                tl6Var2.h(i22);
                                sl6 sl6Var2 = tl6Var2.B;
                                if (sl6Var2.j) {
                                    xzb xzbVar = sl6Var2.l;
                                    if (xzbVar == null) {
                                        throw bx7.a("Encrypted Track found but ContentEncKeyID was not found", null);
                                    }
                                    sl6Var2.n = new as3(null, true, new zr3(n61.b, null, "video/webm", xzbVar.b));
                                    return true;
                                }
                            } else if (i22 == 28032) {
                                tl6Var2.h(i22);
                                sl6 sl6Var3 = tl6Var2.B;
                                if (sl6Var3.j && sl6Var3.k != null) {
                                    throw bx7.a("Combining encryption and compression is not supported", null);
                                }
                            } else if (i22 == 357149030) {
                                if (tl6Var2.v == -9223372036854775807L) {
                                    tl6Var2.v = 1000000L;
                                }
                                long j3 = tl6Var2.w;
                                if (j3 != -9223372036854775807L) {
                                    tl6Var2.x = tl6Var2.p(j3);
                                    return true;
                                }
                            } else {
                                if (i22 == 374648427) {
                                    if (sparseArray3.size() == 0) {
                                        throw bx7.a("No valid tracks were found", null);
                                    }
                                    boolean z3 = !tl6Var2.e || tl6Var2.N == -1 || tl6Var2.C;
                                    int i55 = -1;
                                    int i56 = -1;
                                    int i57 = -1;
                                    int i58 = -1;
                                    for (int i59 = 0; i59 < sparseArray3.size(); i59++) {
                                        sl6 sl6Var4 = (sl6) sparseArray3.valueAt(i59);
                                        int i60 = sl6Var4.f;
                                        if (i60 == 2) {
                                            if (sl6Var4.b0) {
                                                i55 = sl6Var4.d;
                                            }
                                            if (i56 == -1) {
                                                i56 = sl6Var4.d;
                                            }
                                        } else if (i60 == 1) {
                                            if (sl6Var4.b0) {
                                                i57 = sl6Var4.d;
                                            }
                                            if (i58 == -1) {
                                                i58 = sl6Var4.d;
                                            }
                                        }
                                        if (z3 && !sl6Var4.X) {
                                            tl6Var2.q(sl6Var4);
                                            sl6Var4.d0.getClass();
                                            yzb yzbVar = sl6Var4.d0;
                                            go4 go4Var = sl6Var4.e0;
                                            go4Var.getClass();
                                            yzbVar.g(go4Var);
                                        }
                                    }
                                    if (i55 != -1) {
                                        tl6Var2.L = i55;
                                    } else if (i56 != -1) {
                                        tl6Var2.L = i56;
                                    } else if (i57 != -1) {
                                        tl6Var2.L = i57;
                                    } else if (i58 != -1) {
                                        tl6Var2.L = i58;
                                    } else {
                                        tl6Var2.L = sparseArray3.size() > 0 ? ((sl6) sparseArray3.valueAt(0)).d : -1;
                                    }
                                    tl6Var2.S = true;
                                    if (tl6Var2.R != -1) {
                                        tl6Var2.m();
                                    }
                                    if (!z3) {
                                        return true;
                                    }
                                    tl6Var2.l();
                                    return true;
                                }
                                if (i22 != 475249515) {
                                    if (i22 == 182) {
                                        pl6 pl6Var2 = tl6Var2.A;
                                        pl6Var2.getClass();
                                        long j4 = pl6Var2.a;
                                        if (j4 != 0) {
                                            tl6Var2.d.put(j4, pl6Var2);
                                        }
                                        tl6Var2.A = null;
                                        return true;
                                    }
                                    if (i22 == 183 && !tl6Var2.C) {
                                        tl6Var2.g(i22);
                                        if (tl6Var2.H != -9223372036854775807L && (i21 = tl6Var2.I) != -1 && tl6Var2.J != -1) {
                                            List list3 = (List) sparseArray2.get(i21);
                                            if (list3 == null) {
                                                list3 = new ArrayList();
                                                sparseArray2.put(tl6Var2.I, list3);
                                            }
                                            list3.add(new ql6(tl6Var2.H, tl6Var2.u + tl6Var2.J, tl6Var2.K));
                                            return true;
                                        }
                                    }
                                    return true;
                                }
                                if (!tl6Var2.C) {
                                    int i61 = 0;
                                    while (true) {
                                        if (i61 < sparseArray2.size()) {
                                            if (((List) sparseArray2.valueAt(i61)).isEmpty()) {
                                                i61++;
                                            } else if (tl6Var2.x != -9223372036854775807L) {
                                                for (int i62 = 0; i62 < sparseArray2.size(); i62++) {
                                                    Collections.sort((List) sparseArray2.valueAt(i62));
                                                }
                                                tl6Var2.q0.f0(new rl6(sparseArray2, tl6Var2.x, tl6Var2.L, tl6Var2.u, tl6Var2.t));
                                            }
                                        }
                                    }
                                    tl6Var2.q0.f0(new od0(tl6Var2.x));
                                    tl6Var2.C = true;
                                    tl6Var2.G = false;
                                    for (int i63 = 0; i63 < sparseArray3.size(); i63++) {
                                        sl6 sl6Var5 = (sl6) sparseArray3.valueAt(i63);
                                        if (!sl6Var5.X) {
                                            tl6Var2.q(sl6Var5);
                                            sl6Var5.d0.getClass();
                                            yzb yzbVar2 = sl6Var5.d0;
                                            go4 go4Var2 = sl6Var5.e0;
                                            go4Var2.getClass();
                                            yzbVar2.g(go4Var2);
                                        }
                                    }
                                    tl6Var2.l();
                                    return true;
                                }
                            }
                        }
                    } else if (tl6Var2.V == 2) {
                        sl6 sl6Var6 = (sl6) sparseArray3.get(tl6Var2.b0);
                        sl6Var6.d0.getClass();
                        if (tl6Var2.g0 > 0 && "A_OPUS".equals(sl6Var6.c)) {
                            yw7 yw7Var3 = tl6Var2.r;
                            byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(tl6Var2.g0).array();
                            yw7Var3.getClass();
                            yw7Var3.L(array.length, array);
                        }
                        int i64 = 0;
                        for (int i65 = 0; i65 < tl6Var2.Z; i65++) {
                            i64 += tl6Var2.a0[i65];
                        }
                        int i66 = 0;
                        while (i66 < tl6Var2.Z) {
                            long j5 = tl6Var2.W + ((sl6Var6.g * i66) / 1000);
                            int i67 = tl6Var2.d0;
                            if (i66 == 0 && !tl6Var2.f0) {
                                i67 |= 1;
                            }
                            int i68 = tl6Var2.a0[i66];
                            int i69 = i64 - i68;
                            tl6Var2.i(sl6Var6, j5, i67, i68, i69);
                            i66++;
                            i64 = i69;
                        }
                        tl6Var2.V = (byte) 0;
                        return true;
                    }
                    return true;
                }
                z = true;
            } else {
                z = true;
                i = 8;
            }
            byte b3 = this.e;
            dbc dbcVar = this.c;
            if (b3 == 0) {
                int i70 = 4;
                int i71 = 0;
                long d = dbcVar.d(vb3Var, z, false, 4);
                if (d == -2) {
                    vb3Var.i();
                    while (true) {
                        byte[] bArr11 = this.a;
                        vb3Var.b(i71, i70, bArr11);
                        byte b4 = bArr11[i71];
                        int i72 = i;
                        int i73 = 0;
                        while (true) {
                            if (i73 >= i72) {
                                i3 = -1;
                            } else if ((dbc.d[i73] & b4) != 0) {
                                i3 = i73 + 1;
                            } else {
                                i73++;
                                i72 = 8;
                            }
                        }
                        if (i3 != -1 && i3 <= 4) {
                            b = (int) dbc.b(i3, false, bArr11);
                            Object obj = this.d.b;
                            if (b == 357149030 || b == 272869232 || b == 524531317 || b == 475249515 || b == 374648427) {
                            }
                        }
                        vb3Var.k(1);
                        i70 = 4;
                        i71 = 0;
                        i = 8;
                    }
                    vb3Var.k(i3);
                    d = b;
                }
                z = true;
                z2 = false;
                if (d == -1) {
                    return false;
                }
                this.f = (int) d;
                this.e = (byte) 1;
                b3 = 1;
            } else {
                z2 = false;
            }
            if (b3 == z) {
                this.g = dbcVar.d(vb3Var, z2, z, 8);
                this.e = (byte) 2;
            }
            k44 k44Var2 = this.d;
            int i74 = this.f;
            Object obj2 = k44Var2.b;
            switch (i74) {
                case 128:
                case nm7.Y1 /* 143 */:
                case nm7.p2 /* 160 */:
                case nm7.v2 /* 166 */:
                case nm7.D2 /* 174 */:
                case nm7.L2 /* 182 */:
                case nm7.M2 /* 183 */:
                case nm7.Q2 /* 187 */:
                case nm7.A3 /* 224 */:
                case nm7.B3 /* 225 */:
                case 16868:
                case 17849:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 272869232:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    i2 = 1;
                    break;
                case nm7.O1 /* 131 */:
                case nm7.R1 /* 136 */:
                case nm7.S1 /* 137 */:
                case nm7.a2 /* 145 */:
                case nm7.b2 /* 146 */:
                case nm7.h2 /* 152 */:
                case nm7.k2 /* 155 */:
                case nm7.o2 /* 159 */:
                case nm7.F2 /* 176 */:
                case nm7.I2 /* 179 */:
                case nm7.P2 /* 186 */:
                case nm7.r3 /* 215 */:
                case nm7.G3 /* 231 */:
                case nm7.M3 /* 238 */:
                case nm7.O3 /* 240 */:
                case nm7.P3 /* 241 */:
                case nm7.V3 /* 247 */:
                case nm7.Z3 /* 251 */:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21938:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 29636:
                case 29637:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    i2 = 2;
                    break;
                case nm7.Q1 /* 133 */:
                case 134:
                case 17026:
                case 17276:
                case 21358:
                case 2274716:
                    i2 = 3;
                    break;
                case nm7.q2 /* 161 */:
                case nm7.s2 /* 163 */:
                case nm7.u2 /* 165 */:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    i2 = 4;
                    break;
                case nm7.K2 /* 181 */:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    i2 = 5;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i2 != 0) {
                if (i2 == 1) {
                    long position = vb3Var.getPosition();
                    arrayDeque.push(new qb3(this.f, this.g + position));
                    this.d.V(position, this.f, this.g);
                    this.e = (byte) 0;
                    return true;
                }
                if (i2 == 2) {
                    long j6 = this.g;
                    if (j6 <= 8) {
                        k44Var2.B(i74, b(vb3Var, (int) j6));
                        this.e = (byte) 0;
                        return true;
                    }
                    throw bx7.a("Invalid integer size: " + this.g, null);
                }
                if (i2 == 3) {
                    byte b5 = 0;
                    long j7 = this.g;
                    if (j7 > 2147483647L) {
                        throw bx7.a("String element size: " + this.g, null);
                    }
                    int i75 = (int) j7;
                    if (i75 == 0) {
                        str = "";
                    } else {
                        byte[] bArr12 = new byte[i75];
                        vb3Var.readFully(bArr12, 0, i75);
                        while (i75 > 0 && bArr12[i75 - 1] == 0) {
                            i75--;
                        }
                        b5 = 0;
                        str = new String(bArr12, 0, i75);
                    }
                    k44Var2.W(i74, str);
                    this.e = b5;
                    return true;
                }
                if (i2 == 4) {
                    k44Var2.b(i74, (int) this.g, vb3Var);
                    this.e = (byte) 0;
                    return true;
                }
                if (i2 != 5) {
                    throw bx7.a("Invalid element type " + i2, null);
                }
                long j8 = this.g;
                if (j8 != 4 && j8 != 8) {
                    throw bx7.a("Invalid float size: " + this.g, null);
                }
                int i76 = (int) j8;
                double intBitsToFloat = i76 == 4 ? Float.intBitsToFloat((int) r5) : Double.longBitsToDouble(b(vb3Var, i76));
                tl6 tl6Var3 = (tl6) k44Var2.b;
                if (i74 == 181) {
                    tl6Var3.h(i74);
                    tl6Var3.B.T = (int) intBitsToFloat;
                } else if (i74 != 17545) {
                    switch (i74) {
                        case 21969:
                            tl6Var3.h(i74);
                            tl6Var3.B.F = (float) intBitsToFloat;
                            break;
                        case 21970:
                            tl6Var3.h(i74);
                            tl6Var3.B.G = (float) intBitsToFloat;
                            break;
                        case 21971:
                            tl6Var3.h(i74);
                            tl6Var3.B.H = (float) intBitsToFloat;
                            break;
                        case 21972:
                            tl6Var3.h(i74);
                            tl6Var3.B.I = (float) intBitsToFloat;
                            break;
                        case 21973:
                            tl6Var3.h(i74);
                            tl6Var3.B.J = (float) intBitsToFloat;
                            break;
                        case 21974:
                            tl6Var3.h(i74);
                            tl6Var3.B.K = (float) intBitsToFloat;
                            break;
                        case 21975:
                            tl6Var3.h(i74);
                            tl6Var3.B.L = (float) intBitsToFloat;
                            break;
                        case 21976:
                            tl6Var3.h(i74);
                            tl6Var3.B.M = (float) intBitsToFloat;
                            break;
                        case 21977:
                            tl6Var3.h(i74);
                            tl6Var3.B.N = (float) intBitsToFloat;
                            break;
                        case 21978:
                            tl6Var3.h(i74);
                            tl6Var3.B.O = (float) intBitsToFloat;
                            break;
                        default:
                            switch (i74) {
                                case 30323:
                                    tl6Var3.h(i74);
                                    tl6Var3.B.v = (float) intBitsToFloat;
                                    break;
                                case 30324:
                                    tl6Var3.h(i74);
                                    tl6Var3.B.w = (float) intBitsToFloat;
                                    break;
                                case 30325:
                                    tl6Var3.h(i74);
                                    tl6Var3.B.x = (float) intBitsToFloat;
                                    break;
                            }
                    }
                } else {
                    tl6Var3.w = (long) intBitsToFloat;
                }
                this.e = (byte) 0;
                return true;
            }
            vb3Var.k((int) this.g);
            this.e = (byte) 0;
        }
    }

    public final long b(vb3 vb3Var, int i) {
        vb3Var.c(this.a, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (r5[i2] & 255);
        }
        return j;
    }
}
