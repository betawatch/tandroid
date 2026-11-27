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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ya3 {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final cdc c = new cdc();
    public v34 d;
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
    public final boolean a(cb3 cb3Var) {
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
        vl6 vl6Var;
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
        jo4 jo4Var;
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
            xa3 xa3Var = (xa3) arrayDeque.peek();
            if (xa3Var != null) {
                i = 8;
                if (cb3Var.d >= xa3Var.b) {
                    v34 v34Var = this.d;
                    int i22 = ((xa3) arrayDeque.pop()).a;
                    vl6 vl6Var2 = (vl6) v34Var.b;
                    Map map = vl6.w0;
                    SparseArray sparseArray2 = vl6Var2.F;
                    SparseArray sparseArray3 = vl6Var2.c;
                    vl6Var2.q0.getClass();
                    if (i22 == 128) {
                        rl6 rl6Var = vl6Var2.A;
                        rl6Var.getClass();
                        if (rl6Var.f != null || (str2 = rl6Var.h) == null) {
                            return true;
                        }
                        rl6Var.f = str2;
                        String str13 = rl6Var.i;
                        if (str13 == null) {
                            return true;
                        }
                        rl6Var.g = str13;
                        return true;
                    }
                    if (i22 != 160) {
                        if (i22 == 174) {
                            ul6 ul6Var = vl6Var2.B;
                            ul6Var.getClass();
                            String str14 = ul6Var.c;
                            if (str14 == null) {
                                throw hy7.a("CodecId is missing in TrackEntry element", null);
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
                                    int i23 = ul6Var.d;
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
                                            byte[] bArr2 = ul6Var.m;
                                            str15 = "video/mp4v-es";
                                            vl6Var = vl6Var2;
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
                                            if (ul6Var.P == null) {
                                                i16 = i6;
                                                mt2 c3 = mt2.c(new ey7(ul6Var.P));
                                                if (c3 != null) {
                                                    str11 = "video/dolby-vision";
                                                    str8 = c3.b;
                                                    int i24 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                                    jo4Var = new jo4();
                                                    if (eg7.i(str11)) {
                                                        jo4Var.M = ul6Var.Q;
                                                        jo4Var.N = ul6Var.S;
                                                        jo4Var.O = ul6Var.T;
                                                        jo4Var.P = i5;
                                                    } else if (eg7.m(str11)) {
                                                        if (ul6Var.t == 0) {
                                                            int i25 = ul6Var.r;
                                                            i17 = -1;
                                                            if (i25 == -1) {
                                                                i25 = ul6Var.o;
                                                            }
                                                            ul6Var.r = i25;
                                                            int i26 = ul6Var.s;
                                                            if (i26 == -1) {
                                                                i26 = ul6Var.p;
                                                            }
                                                            ul6Var.s = i26;
                                                        } else {
                                                            i17 = -1;
                                                        }
                                                        float f = (ul6Var.r == i17 || (i20 = ul6Var.s) == i17) ? -1.0f : (ul6Var.p * r5) / (ul6Var.o * i20);
                                                        if (i8 == -1 && i13 == -1) {
                                                            if (i14 == -1 || ul6Var.C != -1) {
                                                                i8 = ul6Var.A;
                                                                i13 = ul6Var.B;
                                                                i14 = ul6Var.C;
                                                            } else {
                                                                i8 = ul6Var.A;
                                                                i13 = ul6Var.B;
                                                            }
                                                        }
                                                        int i27 = i13;
                                                        int i28 = i14;
                                                        int i29 = i8;
                                                        int i30 = (i7 == -1 && (i7 = ul6Var.q) == -1) ? 8 : i7;
                                                        if (i15 != -1) {
                                                            i18 = i15;
                                                        } else {
                                                            int i31 = ul6Var.q;
                                                            i18 = i31 != -1 ? i31 : 8;
                                                        }
                                                        if (ul6Var.F == -1.0f || ul6Var.G == -1.0f || ul6Var.H == -1.0f || ul6Var.I == -1.0f || ul6Var.J == -1.0f || ul6Var.K == -1.0f || ul6Var.L == -1.0f || ul6Var.M == -1.0f || ul6Var.N == -1.0f || ul6Var.O == -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            byte[] bArr3 = new byte[25];
                                                            ByteBuffer order = ByteBuffer.wrap(bArr3).order(ByteOrder.LITTLE_ENDIAN);
                                                            order.put((byte) 0);
                                                            order.putShort((short) ((ul6Var.F * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((ul6Var.G * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((ul6Var.H * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((ul6Var.I * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((ul6Var.J * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((ul6Var.K * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((ul6Var.L * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((ul6Var.M * 50000.0f) + 0.5f));
                                                            order.putShort((short) (ul6Var.N + 0.5f));
                                                            order.putShort((short) (ul6Var.O + 0.5f));
                                                            order.putShort((short) ul6Var.D);
                                                            order.putShort((short) ul6Var.E);
                                                            bArr = bArr3;
                                                        }
                                                        bm2 bm2Var = new bm2(i29, i28, i27, bArr, i30, i18);
                                                        String str16 = ul6Var.b;
                                                        int intValue = (str16 == null || !map.containsKey(str16)) ? -1 : ((Integer) map.get(ul6Var.b)).intValue();
                                                        if (ul6Var.u == 0 && Float.compare(ul6Var.v, 0.0f) == 0 && Float.compare(ul6Var.w, 0.0f) == 0) {
                                                            if (Float.compare(ul6Var.x, 0.0f) == 0) {
                                                                i19 = 0;
                                                            } else if (Float.compare(ul6Var.x, 90.0f) == 0) {
                                                                i19 = 90;
                                                            } else if (Float.compare(ul6Var.x, -180.0f) == 0 || Float.compare(ul6Var.x, 180.0f) == 0) {
                                                                i19 = jn7.J2;
                                                            } else if (Float.compare(ul6Var.x, -90.0f) == 0) {
                                                                i19 = jn7.s4;
                                                            }
                                                            jo4Var.z = ul6Var.o;
                                                            jo4Var.A = ul6Var.p;
                                                            jo4Var.H = f;
                                                            jo4Var.F = i19;
                                                            jo4Var.I = ul6Var.y;
                                                            jo4Var.J = ul6Var.z;
                                                            jo4Var.K = bm2Var;
                                                        }
                                                        i19 = intValue;
                                                        jo4Var.z = ul6Var.o;
                                                        jo4Var.A = ul6Var.p;
                                                        jo4Var.H = f;
                                                        jo4Var.F = i19;
                                                        jo4Var.I = ul6Var.y;
                                                        jo4Var.J = ul6Var.z;
                                                        jo4Var.K = bm2Var;
                                                    } else if (!"application/x-subrip".equals(str11) && !"text/x-ssa".equals(str11) && !"text/vtt".equals(str11) && !"application/vobsub".equals(str11) && !"application/pgs".equals(str11) && !"application/dvbsubs".equals(str11)) {
                                                        throw hy7.a("Unexpected MIME type.", null);
                                                    }
                                                    str12 = ul6Var.b;
                                                    if (str12 != null && !map.containsKey(str12)) {
                                                        jo4Var.b = ul6Var.b;
                                                    }
                                                    jo4Var.a = Integer.toString(i4);
                                                    jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                                    jo4Var.s = eg7.n(str11);
                                                    jo4Var.t = i16;
                                                    jo4Var.d = ul6Var.c0;
                                                    jo4Var.e = i24;
                                                    jo4Var.v = singletonList;
                                                    jo4Var.k = str8;
                                                    jo4Var.w = ul6Var.n;
                                                    ul6Var.e0 = new ko4(jo4Var);
                                                    vl6Var2 = vl6Var;
                                                    ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                                    sparseArray.put(ul6Var.d, ul6Var);
                                                    break;
                                                }
                                            } else {
                                                i16 = i6;
                                            }
                                            str11 = str6;
                                            int i242 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                            jo4Var = new jo4();
                                            if (eg7.i(str11)) {
                                            }
                                            str12 = ul6Var.b;
                                            if (str12 != null) {
                                                jo4Var.b = ul6Var.b;
                                            }
                                            jo4Var.a = Integer.toString(i4);
                                            jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                            jo4Var.s = eg7.n(str11);
                                            jo4Var.t = i16;
                                            jo4Var.d = ul6Var.c0;
                                            jo4Var.e = i242;
                                            jo4Var.v = singletonList;
                                            jo4Var.k = str8;
                                            jo4Var.w = ul6Var.n;
                                            ul6Var.e0 = new ko4(jo4Var);
                                            vl6Var2 = vl6Var;
                                            ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                            sparseArray.put(ul6Var.d, ul6Var);
                                            break;
                                        case 2:
                                            i4 = i23;
                                            sparseArray = sparseArray3;
                                            str3 = "video/webm";
                                            ey7 ey7Var = new ey7(ul6Var.a(ul6Var.c));
                                            try {
                                                int t = ey7Var.t();
                                                if (t != 1) {
                                                    if (t == 65534) {
                                                        ey7Var.N(20);
                                                        int s = ey7Var.s();
                                                        if ((s >> 18) == 0 && (s == 0 || Integer.bitCount(s) == ul6Var.Q)) {
                                                            ul6Var.S = s == 0 ? -1 : s << 2;
                                                        }
                                                        long u2 = ey7Var.u();
                                                        UUID uuid = vl6.v0;
                                                        if (u2 == uuid.getMostSignificantBits()) {
                                                            break;
                                                        }
                                                    }
                                                    efd.f("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                    vl6Var = vl6Var2;
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
                                                    if (ul6Var.P == null) {
                                                    }
                                                    str11 = str6;
                                                    int i2422 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                                    jo4Var = new jo4();
                                                    if (eg7.i(str11)) {
                                                    }
                                                    str12 = ul6Var.b;
                                                    if (str12 != null) {
                                                    }
                                                    jo4Var.a = Integer.toString(i4);
                                                    jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                                    jo4Var.s = eg7.n(str11);
                                                    jo4Var.t = i16;
                                                    jo4Var.d = ul6Var.c0;
                                                    jo4Var.e = i2422;
                                                    jo4Var.v = singletonList;
                                                    jo4Var.k = str8;
                                                    jo4Var.w = ul6Var.n;
                                                    ul6Var.e0 = new ko4(jo4Var);
                                                    vl6Var2 = vl6Var;
                                                    ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                                    sparseArray.put(ul6Var.d, ul6Var);
                                                    break;
                                                }
                                                int i32 = ul6Var.R;
                                                String str17 = gcc.a;
                                                int F2 = gcc.F(i32, ByteOrder.LITTLE_ENDIAN);
                                                if (F2 == 0) {
                                                    efd.f("MatroskaExtractor", "Unsupported PCM bit depth: " + ul6Var.R + ". Setting mimeType to audio/x-unknown");
                                                    vl6Var = vl6Var2;
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
                                                    if (ul6Var.P == null) {
                                                    }
                                                    str11 = str6;
                                                    int i24222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                                    jo4Var = new jo4();
                                                    if (eg7.i(str11)) {
                                                    }
                                                    str12 = ul6Var.b;
                                                    if (str12 != null) {
                                                    }
                                                    jo4Var.a = Integer.toString(i4);
                                                    jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                                    jo4Var.s = eg7.n(str11);
                                                    jo4Var.t = i16;
                                                    jo4Var.d = ul6Var.c0;
                                                    jo4Var.e = i24222;
                                                    jo4Var.v = singletonList;
                                                    jo4Var.k = str8;
                                                    jo4Var.w = ul6Var.n;
                                                    ul6Var.e0 = new ko4(jo4Var);
                                                    vl6Var2 = vl6Var;
                                                    ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                                    sparseArray.put(ul6Var.d, ul6Var);
                                                } else {
                                                    vl6Var = vl6Var2;
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
                                                    if (ul6Var.P == null) {
                                                    }
                                                    str11 = str6;
                                                    int i242222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                                    jo4Var = new jo4();
                                                    if (eg7.i(str11)) {
                                                    }
                                                    str12 = ul6Var.b;
                                                    if (str12 != null) {
                                                    }
                                                    jo4Var.a = Integer.toString(i4);
                                                    jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                                    jo4Var.s = eg7.n(str11);
                                                    jo4Var.t = i16;
                                                    jo4Var.d = ul6Var.c0;
                                                    jo4Var.e = i242222;
                                                    jo4Var.v = singletonList;
                                                    jo4Var.k = str8;
                                                    jo4Var.w = ul6Var.n;
                                                    ul6Var.e0 = new ko4(jo4Var);
                                                    vl6Var2 = vl6Var;
                                                    ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                                    sparseArray.put(ul6Var.d, ul6Var);
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                throw hy7.a("Error parsing MS/ACM codec private", null);
                                            }
                                            break;
                                        case 3:
                                            i4 = i23;
                                            sparseArray = sparseArray3;
                                            str3 = "video/webm";
                                            ul6Var.W = new g6c();
                                            str15 = "audio/true-hd";
                                            vl6Var = vl6Var2;
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
                                            if (ul6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i2422222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                            jo4Var = new jo4();
                                            if (eg7.i(str11)) {
                                            }
                                            str12 = ul6Var.b;
                                            if (str12 != null) {
                                            }
                                            jo4Var.a = Integer.toString(i4);
                                            jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                            jo4Var.s = eg7.n(str11);
                                            jo4Var.t = i16;
                                            jo4Var.d = ul6Var.c0;
                                            jo4Var.e = i2422222;
                                            jo4Var.v = singletonList;
                                            jo4Var.k = str8;
                                            jo4Var.w = ul6Var.n;
                                            ul6Var.e0 = new ko4(jo4Var);
                                            vl6Var2 = vl6Var;
                                            ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                            sparseArray.put(ul6Var.d, ul6Var);
                                            break;
                                        case 4:
                                            str3 = "video/webm";
                                            byte[] a = ul6Var.a(str14);
                                            try {
                                                r5 = a[0];
                                            } catch (ArrayIndexOutOfBoundsException unused2) {
                                                r5 = 0;
                                            }
                                            try {
                                                if (r5 != 2) {
                                                    throw hy7.a("Error parsing vorbis codec private", null);
                                                }
                                                int i33 = 0;
                                                int i34 = 1;
                                                while (true) {
                                                    i4 = i23;
                                                    int i35 = a[i34] & jn7.d4;
                                                    if (i35 != 255) {
                                                        int i36 = i34 + 1;
                                                        int i37 = i33 + i35;
                                                        int i38 = 0;
                                                        while (true) {
                                                            int i39 = i36;
                                                            int i40 = a[i39] & jn7.d4;
                                                            if (i40 != 255) {
                                                                int i41 = i39 + 1;
                                                                int i42 = i38 + i40;
                                                                if (a[i41] != 1) {
                                                                    throw hy7.a("Error parsing vorbis codec private", null);
                                                                }
                                                                byte[] bArr4 = new byte[i37];
                                                                System.arraycopy(a, i41, bArr4, 0, i37);
                                                                int i43 = i41 + i37;
                                                                if (a[i43] != 3) {
                                                                    throw hy7.a("Error parsing vorbis codec private", null);
                                                                }
                                                                int i44 = i43 + i42;
                                                                if (a[i44] != 5) {
                                                                    throw hy7.a("Error parsing vorbis codec private", null);
                                                                }
                                                                byte[] bArr5 = new byte[a.length - i44];
                                                                sparseArray = sparseArray3;
                                                                System.arraycopy(a, i44, bArr5, 0, a.length - i44);
                                                                ArrayList arrayList = new ArrayList(2);
                                                                arrayList.add(bArr4);
                                                                arrayList.add(bArr5);
                                                                str4 = "audio/vorbis";
                                                                i6 = TLObject.FLAG_13;
                                                                vl6Var = vl6Var2;
                                                                singletonList = arrayList;
                                                                str6 = str4;
                                                                i7 = -1;
                                                                i5 = -1;
                                                                i13 = -1;
                                                                i14 = -1;
                                                                i8 = -1;
                                                                i15 = -1;
                                                                str8 = null;
                                                                if (ul6Var.P == null) {
                                                                }
                                                                str11 = str6;
                                                                int i24222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                                                jo4Var = new jo4();
                                                                if (eg7.i(str11)) {
                                                                }
                                                                str12 = ul6Var.b;
                                                                if (str12 != null) {
                                                                }
                                                                jo4Var.a = Integer.toString(i4);
                                                                jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                                                jo4Var.s = eg7.n(str11);
                                                                jo4Var.t = i16;
                                                                jo4Var.d = ul6Var.c0;
                                                                jo4Var.e = i24222222;
                                                                jo4Var.v = singletonList;
                                                                jo4Var.k = str8;
                                                                jo4Var.w = ul6Var.n;
                                                                ul6Var.e0 = new ko4(jo4Var);
                                                                vl6Var2 = vl6Var;
                                                                ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                                                sparseArray.put(ul6Var.d, ul6Var);
                                                                break;
                                                            } else {
                                                                i38 += jn7.d4;
                                                                i36 = i39 + 1;
                                                            }
                                                        }
                                                    } else {
                                                        i33 += jn7.d4;
                                                        i34++;
                                                        i23 = i4;
                                                    }
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                                throw hy7.a("Error parsing vorbis codec private", r5);
                                            }
                                            break;
                                        case 5:
                                            str3 = "video/webm";
                                            str5 = "audio/mpeg-L2";
                                            vl6Var = vl6Var2;
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
                                            if (ul6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i242222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                            jo4Var = new jo4();
                                            if (eg7.i(str11)) {
                                            }
                                            str12 = ul6Var.b;
                                            if (str12 != null) {
                                            }
                                            jo4Var.a = Integer.toString(i4);
                                            jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                            jo4Var.s = eg7.n(str11);
                                            jo4Var.t = i16;
                                            jo4Var.d = ul6Var.c0;
                                            jo4Var.e = i242222222;
                                            jo4Var.v = singletonList;
                                            jo4Var.k = str8;
                                            jo4Var.w = ul6Var.n;
                                            ul6Var.e0 = new ko4(jo4Var);
                                            vl6Var2 = vl6Var;
                                            ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                            sparseArray.put(ul6Var.d, ul6Var);
                                            break;
                                        case 6:
                                            str3 = "video/webm";
                                            str5 = "audio/mpeg";
                                            vl6Var = vl6Var2;
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
                                            if (ul6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i2422222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                            jo4Var = new jo4();
                                            if (eg7.i(str11)) {
                                            }
                                            str12 = ul6Var.b;
                                            if (str12 != null) {
                                            }
                                            jo4Var.a = Integer.toString(i4);
                                            jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                            jo4Var.s = eg7.n(str11);
                                            jo4Var.t = i16;
                                            jo4Var.d = ul6Var.c0;
                                            jo4Var.e = i2422222222;
                                            jo4Var.v = singletonList;
                                            jo4Var.k = str8;
                                            jo4Var.w = ul6Var.n;
                                            ul6Var.e0 = new ko4(jo4Var);
                                            vl6Var2 = vl6Var;
                                            ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                            sparseArray.put(ul6Var.d, ul6Var);
                                            break;
                                        case 7:
                                            str3 = "video/webm";
                                            ey7 ey7Var2 = new ey7(ul6Var.a(ul6Var.c));
                                            try {
                                                ey7Var2.O(16);
                                                r = ey7Var2.r();
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
                                                        byte[] bArr6 = ey7Var2.a;
                                                        for (int i45 = ey7Var2.b + 20; i45 < bArr6.length - 4; i45++) {
                                                            if (bArr6[i45] == 0 && bArr6[i45 + 1] == 0 && bArr6[i45 + 2] == 1 && bArr6[i45 + 3] == 15) {
                                                                pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr6, i45, bArr6.length)));
                                                            }
                                                        }
                                                        throw hy7.a("Failed to find FourCC VC1 initialization data", null);
                                                    }
                                                    efd.f("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                    str7 = null;
                                                    pair = new Pair("video/x-unknown", null);
                                                    vl6Var = vl6Var2;
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
                                                    if (ul6Var.P == null) {
                                                    }
                                                    str11 = str6;
                                                    int i24222222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                                    jo4Var = new jo4();
                                                    if (eg7.i(str11)) {
                                                    }
                                                    str12 = ul6Var.b;
                                                    if (str12 != null) {
                                                    }
                                                    jo4Var.a = Integer.toString(i4);
                                                    jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                                    jo4Var.s = eg7.n(str11);
                                                    jo4Var.t = i16;
                                                    jo4Var.d = ul6Var.c0;
                                                    jo4Var.e = i24222222222;
                                                    jo4Var.v = singletonList;
                                                    jo4Var.k = str8;
                                                    jo4Var.w = ul6Var.n;
                                                    ul6Var.e0 = new ko4(jo4Var);
                                                    vl6Var2 = vl6Var;
                                                    ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                                    sparseArray.put(ul6Var.d, ul6Var);
                                                    break;
                                                }
                                                str7 = null;
                                                vl6Var = vl6Var2;
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
                                                if (ul6Var.P == null) {
                                                }
                                                str11 = str6;
                                                int i242222222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                                jo4Var = new jo4();
                                                if (eg7.i(str11)) {
                                                }
                                                str12 = ul6Var.b;
                                                if (str12 != null) {
                                                }
                                                jo4Var.a = Integer.toString(i4);
                                                jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                                jo4Var.s = eg7.n(str11);
                                                jo4Var.t = i16;
                                                jo4Var.d = ul6Var.c0;
                                                jo4Var.e = i242222222222;
                                                jo4Var.v = singletonList;
                                                jo4Var.k = str8;
                                                jo4Var.w = ul6Var.n;
                                                ul6Var.e0 = new ko4(jo4Var);
                                                vl6Var2 = vl6Var;
                                                ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                                sparseArray.put(ul6Var.d, ul6Var);
                                            } catch (ArrayIndexOutOfBoundsException unused5) {
                                                throw hy7.a("Error parsing FourCC private data", r52);
                                            }
                                            break;
                                        case '\b':
                                            str3 = "video/webm";
                                            byte[] bArr7 = new byte[4];
                                            System.arraycopy(ul6Var.a(str14), 0, bArr7, 0, 4);
                                            vl6Var = vl6Var2;
                                            singletonList = po5.u(bArr7);
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
                                            if (ul6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i2422222222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                            jo4Var = new jo4();
                                            if (eg7.i(str11)) {
                                            }
                                            str12 = ul6Var.b;
                                            if (str12 != null) {
                                            }
                                            jo4Var.a = Integer.toString(i4);
                                            jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                            jo4Var.s = eg7.n(str11);
                                            jo4Var.t = i16;
                                            jo4Var.d = ul6Var.c0;
                                            jo4Var.e = i2422222222222;
                                            jo4Var.v = singletonList;
                                            jo4Var.k = str8;
                                            jo4Var.w = ul6Var.n;
                                            ul6Var.e0 = new ko4(jo4Var);
                                            vl6Var2 = vl6Var;
                                            ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                            sparseArray.put(ul6Var.d, ul6Var);
                                            break;
                                        case '\n':
                                            str3 = "video/webm";
                                            mc0 a2 = mc0.a(new ey7(ul6Var.a(ul6Var.c)));
                                            ArrayList arrayList2 = a2.a;
                                            ul6Var.f0 = a2.b;
                                            str9 = a2.l;
                                            i8 = a2.g;
                                            i9 = a2.i;
                                            list = arrayList2;
                                            i10 = a2.h;
                                            i11 = a2.e;
                                            i12 = a2.f;
                                            str10 = "video/avc";
                                            vl6Var = vl6Var2;
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
                                            if (ul6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i24222222222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                            jo4Var = new jo4();
                                            if (eg7.i(str11)) {
                                            }
                                            str12 = ul6Var.b;
                                            if (str12 != null) {
                                            }
                                            jo4Var.a = Integer.toString(i4);
                                            jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                            jo4Var.s = eg7.n(str11);
                                            jo4Var.t = i16;
                                            jo4Var.d = ul6Var.c0;
                                            jo4Var.e = i24222222222222;
                                            jo4Var.v = singletonList;
                                            jo4Var.k = str8;
                                            jo4Var.w = ul6Var.n;
                                            ul6Var.e0 = new ko4(jo4Var);
                                            vl6Var2 = vl6Var;
                                            ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                            sparseArray.put(ul6Var.d, ul6Var);
                                            break;
                                        case 11:
                                            str3 = "video/webm";
                                            vl6Var = vl6Var2;
                                            singletonList = po5.u(ul6Var.a(str14));
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
                                            if (ul6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i242222222222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                            jo4Var = new jo4();
                                            if (eg7.i(str11)) {
                                            }
                                            str12 = ul6Var.b;
                                            if (str12 != null) {
                                            }
                                            jo4Var.a = Integer.toString(i4);
                                            jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                            jo4Var.s = eg7.n(str11);
                                            jo4Var.t = i16;
                                            jo4Var.d = ul6Var.c0;
                                            jo4Var.e = i242222222222222;
                                            jo4Var.v = singletonList;
                                            jo4Var.k = str8;
                                            jo4Var.w = ul6Var.n;
                                            ul6Var.e0 = new ko4(jo4Var);
                                            vl6Var2 = vl6Var;
                                            ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                            sparseArray.put(ul6Var.d, ul6Var);
                                            break;
                                        case '\f':
                                            str3 = "video/webm";
                                            str15 = "audio/vnd.dts.hd";
                                            vl6Var = vl6Var2;
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
                                            if (ul6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i2422222222222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                            jo4Var = new jo4();
                                            if (eg7.i(str11)) {
                                            }
                                            str12 = ul6Var.b;
                                            if (str12 != null) {
                                            }
                                            jo4Var.a = Integer.toString(i4);
                                            jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                            jo4Var.s = eg7.n(str11);
                                            jo4Var.t = i16;
                                            jo4Var.d = ul6Var.c0;
                                            jo4Var.e = i2422222222222222;
                                            jo4Var.v = singletonList;
                                            jo4Var.k = str8;
                                            jo4Var.w = ul6Var.n;
                                            ul6Var.e0 = new ko4(jo4Var);
                                            vl6Var2 = vl6Var;
                                            ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                            sparseArray.put(ul6Var.d, ul6Var);
                                            break;
                                        case '\r':
                                            str3 = "video/webm";
                                            List singletonList2 = Collections.singletonList(ul6Var.a(str14));
                                            byte[] bArr8 = ul6Var.m;
                                            h1 j = jn2.j(new zd1(bArr8.length, bArr8), false);
                                            ul6Var.T = j.a;
                                            ul6Var.Q = j.b;
                                            vl6Var = vl6Var2;
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
                                            if (ul6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i24222222222222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                            jo4Var = new jo4();
                                            if (eg7.i(str11)) {
                                            }
                                            str12 = ul6Var.b;
                                            if (str12 != null) {
                                            }
                                            jo4Var.a = Integer.toString(i4);
                                            jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                            jo4Var.s = eg7.n(str11);
                                            jo4Var.t = i16;
                                            jo4Var.d = ul6Var.c0;
                                            jo4Var.e = i24222222222222222;
                                            jo4Var.v = singletonList;
                                            jo4Var.k = str8;
                                            jo4Var.w = ul6Var.n;
                                            ul6Var.e0 = new ko4(jo4Var);
                                            vl6Var2 = vl6Var;
                                            ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                            sparseArray.put(ul6Var.d, ul6Var);
                                            break;
                                        case 14:
                                            str3 = "video/webm";
                                            str15 = "audio/ac3";
                                            vl6Var = vl6Var2;
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
                                            if (ul6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i242222222222222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                            jo4Var = new jo4();
                                            if (eg7.i(str11)) {
                                            }
                                            str12 = ul6Var.b;
                                            if (str12 != null) {
                                            }
                                            jo4Var.a = Integer.toString(i4);
                                            jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                            jo4Var.s = eg7.n(str11);
                                            jo4Var.t = i16;
                                            jo4Var.d = ul6Var.c0;
                                            jo4Var.e = i242222222222222222;
                                            jo4Var.v = singletonList;
                                            jo4Var.k = str8;
                                            jo4Var.w = ul6Var.n;
                                            ul6Var.e0 = new ko4(jo4Var);
                                            vl6Var2 = vl6Var;
                                            ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                            sparseArray.put(ul6Var.d, ul6Var);
                                            break;
                                        case 15:
                                            str3 = "video/webm";
                                            ul6Var.X = true;
                                            str15 = "audio/vnd.dts";
                                            vl6Var = vl6Var2;
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
                                            if (ul6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i2422222222222222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                            jo4Var = new jo4();
                                            if (eg7.i(str11)) {
                                            }
                                            str12 = ul6Var.b;
                                            if (str12 != null) {
                                            }
                                            jo4Var.a = Integer.toString(i4);
                                            jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                            jo4Var.s = eg7.n(str11);
                                            jo4Var.t = i16;
                                            jo4Var.d = ul6Var.c0;
                                            jo4Var.e = i2422222222222222222;
                                            jo4Var.v = singletonList;
                                            jo4Var.k = str8;
                                            jo4Var.w = ul6Var.n;
                                            ul6Var.e0 = new ko4(jo4Var);
                                            vl6Var2 = vl6Var;
                                            ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                            sparseArray.put(ul6Var.d, ul6Var);
                                            break;
                                        case 16:
                                            str3 = "video/webm";
                                            byte[] bArr9 = ul6Var.m;
                                            str15 = "video/av01";
                                            if (bArr9 != null) {
                                                u = po5.u(bArr9);
                                                wa0 b2 = wa0.b(ul6Var.m);
                                                if (b2 != null) {
                                                    int i46 = b2.b;
                                                    int i47 = b2.d;
                                                    int i48 = b2.c;
                                                    i7 = b2.a;
                                                    singletonList = u;
                                                    vl6Var = vl6Var2;
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
                                                    if (ul6Var.P == null) {
                                                    }
                                                    str11 = str6;
                                                    int i24222222222222222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                                    jo4Var = new jo4();
                                                    if (eg7.i(str11)) {
                                                    }
                                                    str12 = ul6Var.b;
                                                    if (str12 != null) {
                                                    }
                                                    jo4Var.a = Integer.toString(i4);
                                                    jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                                    jo4Var.s = eg7.n(str11);
                                                    jo4Var.t = i16;
                                                    jo4Var.d = ul6Var.c0;
                                                    jo4Var.e = i24222222222222222222;
                                                    jo4Var.v = singletonList;
                                                    jo4Var.k = str8;
                                                    jo4Var.w = ul6Var.n;
                                                    ul6Var.e0 = new ko4(jo4Var);
                                                    vl6Var2 = vl6Var;
                                                    ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                                    sparseArray.put(ul6Var.d, ul6Var);
                                                    break;
                                                }
                                                vl6Var = vl6Var2;
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
                                                if (ul6Var.P == null) {
                                                }
                                                str11 = str6;
                                                int i242222222222222222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                                jo4Var = new jo4();
                                                if (eg7.i(str11)) {
                                                }
                                                str12 = ul6Var.b;
                                                if (str12 != null) {
                                                }
                                                jo4Var.a = Integer.toString(i4);
                                                jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                                jo4Var.s = eg7.n(str11);
                                                jo4Var.t = i16;
                                                jo4Var.d = ul6Var.c0;
                                                jo4Var.e = i242222222222222222222;
                                                jo4Var.v = singletonList;
                                                jo4Var.k = str8;
                                                jo4Var.w = ul6Var.n;
                                                ul6Var.e0 = new ko4(jo4Var);
                                                vl6Var2 = vl6Var;
                                                ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                                sparseArray.put(ul6Var.d, ul6Var);
                                            }
                                            vl6Var = vl6Var2;
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
                                            if (ul6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i2422222222222222222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                            jo4Var = new jo4();
                                            if (eg7.i(str11)) {
                                            }
                                            str12 = ul6Var.b;
                                            if (str12 != null) {
                                            }
                                            jo4Var.a = Integer.toString(i4);
                                            jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                            jo4Var.s = eg7.n(str11);
                                            jo4Var.t = i16;
                                            jo4Var.d = ul6Var.c0;
                                            jo4Var.e = i2422222222222222222222;
                                            jo4Var.v = singletonList;
                                            jo4Var.k = str8;
                                            jo4Var.w = ul6Var.n;
                                            ul6Var.e0 = new ko4(jo4Var);
                                            vl6Var2 = vl6Var;
                                            ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                            sparseArray.put(ul6Var.d, ul6Var);
                                            break;
                                        case 17:
                                            str3 = "video/webm";
                                            str15 = "video/x-vnd.on2.vp8";
                                            vl6Var = vl6Var2;
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
                                            if (ul6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i24222222222222222222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                            jo4Var = new jo4();
                                            if (eg7.i(str11)) {
                                            }
                                            str12 = ul6Var.b;
                                            if (str12 != null) {
                                            }
                                            jo4Var.a = Integer.toString(i4);
                                            jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                            jo4Var.s = eg7.n(str11);
                                            jo4Var.t = i16;
                                            jo4Var.d = ul6Var.c0;
                                            jo4Var.e = i24222222222222222222222;
                                            jo4Var.v = singletonList;
                                            jo4Var.k = str8;
                                            jo4Var.w = ul6Var.n;
                                            ul6Var.e0 = new ko4(jo4Var);
                                            vl6Var2 = vl6Var;
                                            ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                            sparseArray.put(ul6Var.d, ul6Var);
                                            break;
                                        case 18:
                                            str3 = "video/webm";
                                            byte[] bArr10 = ul6Var.m;
                                            u = bArr10 == null ? null : po5.u(bArr10);
                                            str15 = "video/x-vnd.on2.vp9";
                                            vl6Var = vl6Var2;
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
                                            if (ul6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i242222222222222222222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                            jo4Var = new jo4();
                                            if (eg7.i(str11)) {
                                            }
                                            str12 = ul6Var.b;
                                            if (str12 != null) {
                                            }
                                            jo4Var.a = Integer.toString(i4);
                                            jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                            jo4Var.s = eg7.n(str11);
                                            jo4Var.t = i16;
                                            jo4Var.d = ul6Var.c0;
                                            jo4Var.e = i242222222222222222222222;
                                            jo4Var.v = singletonList;
                                            jo4Var.k = str8;
                                            jo4Var.w = ul6Var.n;
                                            ul6Var.e0 = new ko4(jo4Var);
                                            vl6Var2 = vl6Var;
                                            ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                            sparseArray.put(ul6Var.d, ul6Var);
                                            break;
                                        case 19:
                                            str3 = "video/webm";
                                            vl6Var = vl6Var2;
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
                                            if (ul6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i2422222222222222222222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                            jo4Var = new jo4();
                                            if (eg7.i(str11)) {
                                            }
                                            str12 = ul6Var.b;
                                            if (str12 != null) {
                                            }
                                            jo4Var.a = Integer.toString(i4);
                                            jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                            jo4Var.s = eg7.n(str11);
                                            jo4Var.t = i16;
                                            jo4Var.d = ul6Var.c0;
                                            jo4Var.e = i2422222222222222222222222;
                                            jo4Var.v = singletonList;
                                            jo4Var.k = str8;
                                            jo4Var.w = ul6Var.n;
                                            ul6Var.e0 = new ko4(jo4Var);
                                            vl6Var2 = vl6Var;
                                            ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                            sparseArray.put(ul6Var.d, ul6Var);
                                            break;
                                        case 20:
                                            str3 = "video/webm";
                                            vl6Var = vl6Var2;
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
                                            if (ul6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i24222222222222222222222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                            jo4Var = new jo4();
                                            if (eg7.i(str11)) {
                                            }
                                            str12 = ul6Var.b;
                                            if (str12 != null) {
                                            }
                                            jo4Var.a = Integer.toString(i4);
                                            jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                            jo4Var.s = eg7.n(str11);
                                            jo4Var.t = i16;
                                            jo4Var.d = ul6Var.c0;
                                            jo4Var.e = i24222222222222222222222222;
                                            jo4Var.v = singletonList;
                                            jo4Var.k = str8;
                                            jo4Var.w = ul6Var.n;
                                            ul6Var.e0 = new ko4(jo4Var);
                                            vl6Var2 = vl6Var;
                                            ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                            sparseArray.put(ul6Var.d, ul6Var);
                                            break;
                                        case 21:
                                            str3 = "video/webm";
                                            str15 = "audio/vnd.dts.hd;profile=lbr";
                                            vl6Var = vl6Var2;
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
                                            if (ul6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i242222222222222222222222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                            jo4Var = new jo4();
                                            if (eg7.i(str11)) {
                                            }
                                            str12 = ul6Var.b;
                                            if (str12 != null) {
                                            }
                                            jo4Var.a = Integer.toString(i4);
                                            jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                            jo4Var.s = eg7.n(str11);
                                            jo4Var.t = i16;
                                            jo4Var.d = ul6Var.c0;
                                            jo4Var.e = i242222222222222222222222222;
                                            jo4Var.v = singletonList;
                                            jo4Var.k = str8;
                                            jo4Var.w = ul6Var.n;
                                            ul6Var.e0 = new ko4(jo4Var);
                                            vl6Var2 = vl6Var;
                                            ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                            sparseArray.put(ul6Var.d, ul6Var);
                                            break;
                                        case 22:
                                            str3 = "video/webm";
                                            int i49 = ul6Var.R;
                                            String str18 = gcc.a;
                                            C = gcc.C(i49, ByteOrder.LITTLE_ENDIAN);
                                            if (C == 0) {
                                                efd.f("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + ul6Var.R + ". Setting mimeType to audio/x-unknown");
                                                vl6Var = vl6Var2;
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
                                                if (ul6Var.P == null) {
                                                }
                                                str11 = str6;
                                                int i2422222222222222222222222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                                jo4Var = new jo4();
                                                if (eg7.i(str11)) {
                                                }
                                                str12 = ul6Var.b;
                                                if (str12 != null) {
                                                }
                                                jo4Var.a = Integer.toString(i4);
                                                jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                                jo4Var.s = eg7.n(str11);
                                                jo4Var.t = i16;
                                                jo4Var.d = ul6Var.c0;
                                                jo4Var.e = i2422222222222222222222222222;
                                                jo4Var.v = singletonList;
                                                jo4Var.k = str8;
                                                jo4Var.w = ul6Var.n;
                                                ul6Var.e0 = new ko4(jo4Var);
                                                vl6Var2 = vl6Var;
                                                ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                                sparseArray.put(ul6Var.d, ul6Var);
                                                break;
                                            }
                                            vl6Var = vl6Var2;
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
                                            if (ul6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i24222222222222222222222222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                            jo4Var = new jo4();
                                            if (eg7.i(str11)) {
                                            }
                                            str12 = ul6Var.b;
                                            if (str12 != null) {
                                            }
                                            jo4Var.a = Integer.toString(i4);
                                            jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                            jo4Var.s = eg7.n(str11);
                                            jo4Var.t = i16;
                                            jo4Var.d = ul6Var.c0;
                                            jo4Var.e = i24222222222222222222222222222;
                                            jo4Var.v = singletonList;
                                            jo4Var.k = str8;
                                            jo4Var.w = ul6Var.n;
                                            ul6Var.e0 = new ko4(jo4Var);
                                            vl6Var2 = vl6Var;
                                            ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                            sparseArray.put(ul6Var.d, ul6Var);
                                            break;
                                        case 23:
                                            str3 = "video/webm";
                                            C = gcc.F(ul6Var.R, ByteOrder.BIG_ENDIAN);
                                            if (C == 0) {
                                                efd.f("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + ul6Var.R + ". Setting mimeType to audio/x-unknown");
                                                vl6Var = vl6Var2;
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
                                                if (ul6Var.P == null) {
                                                }
                                                str11 = str6;
                                                int i242222222222222222222222222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                                jo4Var = new jo4();
                                                if (eg7.i(str11)) {
                                                }
                                                str12 = ul6Var.b;
                                                if (str12 != null) {
                                                }
                                                jo4Var.a = Integer.toString(i4);
                                                jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                                jo4Var.s = eg7.n(str11);
                                                jo4Var.t = i16;
                                                jo4Var.d = ul6Var.c0;
                                                jo4Var.e = i242222222222222222222222222222;
                                                jo4Var.v = singletonList;
                                                jo4Var.k = str8;
                                                jo4Var.w = ul6Var.n;
                                                ul6Var.e0 = new ko4(jo4Var);
                                                vl6Var2 = vl6Var;
                                                ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                                sparseArray.put(ul6Var.d, ul6Var);
                                                break;
                                            }
                                            vl6Var = vl6Var2;
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
                                            if (ul6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i2422222222222222222222222222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                            jo4Var = new jo4();
                                            if (eg7.i(str11)) {
                                            }
                                            str12 = ul6Var.b;
                                            if (str12 != null) {
                                            }
                                            jo4Var.a = Integer.toString(i4);
                                            jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                            jo4Var.s = eg7.n(str11);
                                            jo4Var.t = i16;
                                            jo4Var.d = ul6Var.c0;
                                            jo4Var.e = i2422222222222222222222222222222;
                                            jo4Var.v = singletonList;
                                            jo4Var.k = str8;
                                            jo4Var.w = ul6Var.n;
                                            ul6Var.e0 = new ko4(jo4Var);
                                            vl6Var2 = vl6Var;
                                            ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                            sparseArray.put(ul6Var.d, ul6Var);
                                            break;
                                        case 24:
                                            str3 = "video/webm";
                                            int i50 = ul6Var.R;
                                            String str19 = gcc.a;
                                            C = gcc.F(i50, ByteOrder.LITTLE_ENDIAN);
                                            if (C == 0) {
                                                efd.f("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + ul6Var.R + ". Setting mimeType to audio/x-unknown");
                                                vl6Var = vl6Var2;
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
                                                if (ul6Var.P == null) {
                                                }
                                                str11 = str6;
                                                int i24222222222222222222222222222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                                jo4Var = new jo4();
                                                if (eg7.i(str11)) {
                                                }
                                                str12 = ul6Var.b;
                                                if (str12 != null) {
                                                }
                                                jo4Var.a = Integer.toString(i4);
                                                jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                                jo4Var.s = eg7.n(str11);
                                                jo4Var.t = i16;
                                                jo4Var.d = ul6Var.c0;
                                                jo4Var.e = i24222222222222222222222222222222;
                                                jo4Var.v = singletonList;
                                                jo4Var.k = str8;
                                                jo4Var.w = ul6Var.n;
                                                ul6Var.e0 = new ko4(jo4Var);
                                                vl6Var2 = vl6Var;
                                                ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                                sparseArray.put(ul6Var.d, ul6Var);
                                                break;
                                            }
                                            vl6Var = vl6Var2;
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
                                            if (ul6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i242222222222222222222222222222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                            jo4Var = new jo4();
                                            if (eg7.i(str11)) {
                                            }
                                            str12 = ul6Var.b;
                                            if (str12 != null) {
                                            }
                                            jo4Var.a = Integer.toString(i4);
                                            jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                            jo4Var.s = eg7.n(str11);
                                            jo4Var.t = i16;
                                            jo4Var.d = ul6Var.c0;
                                            jo4Var.e = i242222222222222222222222222222222;
                                            jo4Var.v = singletonList;
                                            jo4Var.k = str8;
                                            jo4Var.w = ul6Var.n;
                                            ul6Var.e0 = new ko4(jo4Var);
                                            vl6Var2 = vl6Var;
                                            ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                            sparseArray.put(ul6Var.d, ul6Var);
                                            break;
                                        case 25:
                                        case 26:
                                            str3 = "video/webm";
                                            vl6Var = vl6Var2;
                                            singletonList = po5.v(vl6.s0, ul6Var.a(str14));
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
                                            if (ul6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i2422222222222222222222222222222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                            jo4Var = new jo4();
                                            if (eg7.i(str11)) {
                                            }
                                            str12 = ul6Var.b;
                                            if (str12 != null) {
                                            }
                                            jo4Var.a = Integer.toString(i4);
                                            jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                            jo4Var.s = eg7.n(str11);
                                            jo4Var.t = i16;
                                            jo4Var.d = ul6Var.c0;
                                            jo4Var.e = i2422222222222222222222222222222222;
                                            jo4Var.v = singletonList;
                                            jo4Var.k = str8;
                                            jo4Var.w = ul6Var.n;
                                            ul6Var.e0 = new ko4(jo4Var);
                                            vl6Var2 = vl6Var;
                                            ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                            sparseArray.put(ul6Var.d, ul6Var);
                                            break;
                                        case 27:
                                            str3 = "video/webm";
                                            ag5 a3 = ag5.a(new ey7(ul6Var.a(ul6Var.c)), false, null);
                                            List list2 = a3.a;
                                            ul6Var.f0 = a3.b;
                                            str9 = a3.n;
                                            i8 = a3.h;
                                            i9 = a3.j;
                                            list = list2;
                                            i10 = a3.i;
                                            i11 = a3.f;
                                            i12 = a3.g;
                                            str10 = "video/hevc";
                                            vl6Var = vl6Var2;
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
                                            if (ul6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i24222222222222222222222222222222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                            jo4Var = new jo4();
                                            if (eg7.i(str11)) {
                                            }
                                            str12 = ul6Var.b;
                                            if (str12 != null) {
                                            }
                                            jo4Var.a = Integer.toString(i4);
                                            jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                            jo4Var.s = eg7.n(str11);
                                            jo4Var.t = i16;
                                            jo4Var.d = ul6Var.c0;
                                            jo4Var.e = i24222222222222222222222222222222222;
                                            jo4Var.v = singletonList;
                                            jo4Var.k = str8;
                                            jo4Var.w = ul6Var.n;
                                            ul6Var.e0 = new ko4(jo4Var);
                                            vl6Var2 = vl6Var;
                                            ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                            sparseArray.put(ul6Var.d, ul6Var);
                                            break;
                                        case 28:
                                            str3 = "video/webm";
                                            vl6Var = vl6Var2;
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
                                            if (ul6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i242222222222222222222222222222222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                            jo4Var = new jo4();
                                            if (eg7.i(str11)) {
                                            }
                                            str12 = ul6Var.b;
                                            if (str12 != null) {
                                            }
                                            jo4Var.a = Integer.toString(i4);
                                            jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                            jo4Var.s = eg7.n(str11);
                                            jo4Var.t = i16;
                                            jo4Var.d = ul6Var.c0;
                                            jo4Var.e = i242222222222222222222222222222222222;
                                            jo4Var.v = singletonList;
                                            jo4Var.k = str8;
                                            jo4Var.w = ul6Var.n;
                                            ul6Var.e0 = new ko4(jo4Var);
                                            vl6Var2 = vl6Var;
                                            ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                            sparseArray.put(ul6Var.d, ul6Var);
                                            break;
                                        case 29:
                                            str3 = "video/webm";
                                            vl6Var = vl6Var2;
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
                                            if (ul6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i2422222222222222222222222222222222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                            jo4Var = new jo4();
                                            if (eg7.i(str11)) {
                                            }
                                            str12 = ul6Var.b;
                                            if (str12 != null) {
                                            }
                                            jo4Var.a = Integer.toString(i4);
                                            jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                            jo4Var.s = eg7.n(str11);
                                            jo4Var.t = i16;
                                            jo4Var.d = ul6Var.c0;
                                            jo4Var.e = i2422222222222222222222222222222222222;
                                            jo4Var.v = singletonList;
                                            jo4Var.k = str8;
                                            jo4Var.w = ul6Var.n;
                                            ul6Var.e0 = new ko4(jo4Var);
                                            vl6Var2 = vl6Var;
                                            ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                            sparseArray.put(ul6Var.d, ul6Var);
                                            break;
                                        case jn7.S /* 30 */:
                                            str3 = "video/webm";
                                            str15 = "video/mpeg2";
                                            vl6Var = vl6Var2;
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
                                            if (ul6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i24222222222222222222222222222222222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                            jo4Var = new jo4();
                                            if (eg7.i(str11)) {
                                            }
                                            str12 = ul6Var.b;
                                            if (str12 != null) {
                                            }
                                            jo4Var.a = Integer.toString(i4);
                                            jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                            jo4Var.s = eg7.n(str11);
                                            jo4Var.t = i16;
                                            jo4Var.d = ul6Var.c0;
                                            jo4Var.e = i24222222222222222222222222222222222222;
                                            jo4Var.v = singletonList;
                                            jo4Var.k = str8;
                                            jo4Var.w = ul6Var.n;
                                            ul6Var.e0 = new ko4(jo4Var);
                                            vl6Var2 = vl6Var;
                                            ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                            sparseArray.put(ul6Var.d, ul6Var);
                                            break;
                                        case 31:
                                            str3 = "video/webm";
                                            u = Collections.singletonList(ul6Var.a(str14));
                                            int i51 = ul6Var.R;
                                            String str20 = gcc.a;
                                            F = gcc.F(i51, ByteOrder.LITTLE_ENDIAN);
                                            str15 = "audio/alac";
                                            break;
                                        case ' ':
                                            str3 = "video/webm";
                                            str15 = "audio/eac3";
                                            vl6Var = vl6Var2;
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
                                            if (ul6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i242222222222222222222222222222222222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                            jo4Var = new jo4();
                                            if (eg7.i(str11)) {
                                            }
                                            str12 = ul6Var.b;
                                            if (str12 != null) {
                                            }
                                            jo4Var.a = Integer.toString(i4);
                                            jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                            jo4Var.s = eg7.n(str11);
                                            jo4Var.t = i16;
                                            jo4Var.d = ul6Var.c0;
                                            jo4Var.e = i242222222222222222222222222222222222222;
                                            jo4Var.v = singletonList;
                                            jo4Var.k = str8;
                                            jo4Var.w = ul6Var.n;
                                            ul6Var.e0 = new ko4(jo4Var);
                                            vl6Var2 = vl6Var;
                                            ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                            sparseArray.put(ul6Var.d, ul6Var);
                                            break;
                                        case '!':
                                            str3 = "video/webm";
                                            u = Collections.singletonList(ul6Var.a(str14));
                                            int i52 = ul6Var.R;
                                            String str21 = gcc.a;
                                            F = gcc.F(i52, ByteOrder.LITTLE_ENDIAN);
                                            str15 = "audio/flac";
                                            break;
                                        case '\"':
                                            ArrayList arrayList3 = new ArrayList(3);
                                            arrayList3.add(ul6Var.a(ul6Var.c));
                                            ByteBuffer allocate = ByteBuffer.allocate(8);
                                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                            str3 = "video/webm";
                                            arrayList3.add(allocate.order(byteOrder).putLong(ul6Var.U).array());
                                            arrayList3.add(ByteBuffer.allocate(8).order(byteOrder).putLong(ul6Var.V).array());
                                            str4 = "audio/opus";
                                            i6 = 5760;
                                            vl6Var = vl6Var2;
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
                                            if (ul6Var.P == null) {
                                            }
                                            str11 = str6;
                                            int i2422222222222222222222222222222222222222 = (ul6Var.b0 ? 1 : 0) | (ul6Var.a0 ? 2 : 0);
                                            jo4Var = new jo4();
                                            if (eg7.i(str11)) {
                                            }
                                            str12 = ul6Var.b;
                                            if (str12 != null) {
                                            }
                                            jo4Var.a = Integer.toString(i4);
                                            jo4Var.r = eg7.n(ul6Var.a ? str3 : "video/x-matroska");
                                            jo4Var.s = eg7.n(str11);
                                            jo4Var.t = i16;
                                            jo4Var.d = ul6Var.c0;
                                            jo4Var.e = i2422222222222222222222222222222222222222;
                                            jo4Var.v = singletonList;
                                            jo4Var.k = str8;
                                            jo4Var.w = ul6Var.n;
                                            ul6Var.e0 = new ko4(jo4Var);
                                            vl6Var2 = vl6Var;
                                            ul6Var.d0 = vl6Var2.q0.e0(ul6Var.d, ul6Var.f);
                                            sparseArray.put(ul6Var.d, ul6Var);
                                            break;
                                        default:
                                            throw hy7.a("Unrecognized codec identifier.", null);
                                    }
                            }
                            vl6Var2.B = null;
                            return true;
                        }
                        if (i22 == 17849) {
                            for (int i53 = 0; i53 < sparseArray3.size(); i53++) {
                                vl6Var2.q((ul6) sparseArray3.valueAt(i53));
                            }
                        } else {
                            if (i22 == 19899) {
                                int i54 = vl6Var2.D;
                                if (i54 != -1) {
                                    long j2 = vl6Var2.E;
                                    if (j2 != -1) {
                                        if (i54 == 475249515) {
                                            vl6Var2.N = j2;
                                            return true;
                                        }
                                        if (i54 == 374648427) {
                                            vl6Var2.P = j2;
                                            return true;
                                        }
                                    }
                                }
                                throw hy7.a("Mandatory element SeekID or SeekPosition not found", null);
                            }
                            if (i22 == 25152) {
                                vl6Var2.h(i22);
                                ul6 ul6Var2 = vl6Var2.B;
                                if (ul6Var2.j) {
                                    w1c w1cVar = ul6Var2.l;
                                    if (w1cVar == null) {
                                        throw hy7.a("Encrypted Track found but ContentEncKeyID was not found", null);
                                    }
                                    ul6Var2.n = new hr3(null, true, new gr3(o51.b, null, "video/webm", w1cVar.b));
                                    return true;
                                }
                            } else if (i22 == 28032) {
                                vl6Var2.h(i22);
                                ul6 ul6Var3 = vl6Var2.B;
                                if (ul6Var3.j && ul6Var3.k != null) {
                                    throw hy7.a("Combining encryption and compression is not supported", null);
                                }
                            } else if (i22 == 357149030) {
                                if (vl6Var2.v == -9223372036854775807L) {
                                    vl6Var2.v = 1000000L;
                                }
                                long j3 = vl6Var2.w;
                                if (j3 != -9223372036854775807L) {
                                    vl6Var2.x = vl6Var2.p(j3);
                                    return true;
                                }
                            } else {
                                if (i22 == 374648427) {
                                    if (sparseArray3.size() == 0) {
                                        throw hy7.a("No valid tracks were found", null);
                                    }
                                    boolean z3 = !vl6Var2.e || vl6Var2.N == -1 || vl6Var2.C;
                                    int i55 = -1;
                                    int i56 = -1;
                                    int i57 = -1;
                                    int i58 = -1;
                                    for (int i59 = 0; i59 < sparseArray3.size(); i59++) {
                                        ul6 ul6Var4 = (ul6) sparseArray3.valueAt(i59);
                                        int i60 = ul6Var4.f;
                                        if (i60 == 2) {
                                            if (ul6Var4.b0) {
                                                i55 = ul6Var4.d;
                                            }
                                            if (i56 == -1) {
                                                i56 = ul6Var4.d;
                                            }
                                        } else if (i60 == 1) {
                                            if (ul6Var4.b0) {
                                                i57 = ul6Var4.d;
                                            }
                                            if (i58 == -1) {
                                                i58 = ul6Var4.d;
                                            }
                                        }
                                        if (z3 && !ul6Var4.X) {
                                            vl6Var2.q(ul6Var4);
                                            ul6Var4.d0.getClass();
                                            x1c x1cVar = ul6Var4.d0;
                                            ko4 ko4Var = ul6Var4.e0;
                                            ko4Var.getClass();
                                            x1cVar.g(ko4Var);
                                        }
                                    }
                                    if (i55 != -1) {
                                        vl6Var2.L = i55;
                                    } else if (i56 != -1) {
                                        vl6Var2.L = i56;
                                    } else if (i57 != -1) {
                                        vl6Var2.L = i57;
                                    } else if (i58 != -1) {
                                        vl6Var2.L = i58;
                                    } else {
                                        vl6Var2.L = sparseArray3.size() > 0 ? ((ul6) sparseArray3.valueAt(0)).d : -1;
                                    }
                                    vl6Var2.S = true;
                                    if (vl6Var2.R != -1) {
                                        vl6Var2.m();
                                    }
                                    if (!z3) {
                                        return true;
                                    }
                                    vl6Var2.l();
                                    return true;
                                }
                                if (i22 != 475249515) {
                                    if (i22 == 182) {
                                        rl6 rl6Var2 = vl6Var2.A;
                                        rl6Var2.getClass();
                                        long j4 = rl6Var2.a;
                                        if (j4 != 0) {
                                            vl6Var2.d.put(j4, rl6Var2);
                                        }
                                        vl6Var2.A = null;
                                        return true;
                                    }
                                    if (i22 == 183 && !vl6Var2.C) {
                                        vl6Var2.g(i22);
                                        if (vl6Var2.H != -9223372036854775807L && (i21 = vl6Var2.I) != -1 && vl6Var2.J != -1) {
                                            List list3 = (List) sparseArray2.get(i21);
                                            if (list3 == null) {
                                                list3 = new ArrayList();
                                                sparseArray2.put(vl6Var2.I, list3);
                                            }
                                            list3.add(new sl6(vl6Var2.H, vl6Var2.u + vl6Var2.J, vl6Var2.K));
                                            return true;
                                        }
                                    }
                                    return true;
                                }
                                if (!vl6Var2.C) {
                                    int i61 = 0;
                                    while (true) {
                                        if (i61 < sparseArray2.size()) {
                                            if (((List) sparseArray2.valueAt(i61)).isEmpty()) {
                                                i61++;
                                            } else if (vl6Var2.x != -9223372036854775807L) {
                                                for (int i62 = 0; i62 < sparseArray2.size(); i62++) {
                                                    Collections.sort((List) sparseArray2.valueAt(i62));
                                                }
                                                vl6Var2.q0.m0(new tl6(sparseArray2, vl6Var2.x, vl6Var2.L, vl6Var2.u, vl6Var2.t));
                                            }
                                        }
                                    }
                                    vl6Var2.q0.m0(new qc0(vl6Var2.x));
                                    vl6Var2.C = true;
                                    vl6Var2.G = false;
                                    for (int i63 = 0; i63 < sparseArray3.size(); i63++) {
                                        ul6 ul6Var5 = (ul6) sparseArray3.valueAt(i63);
                                        if (!ul6Var5.X) {
                                            vl6Var2.q(ul6Var5);
                                            ul6Var5.d0.getClass();
                                            x1c x1cVar2 = ul6Var5.d0;
                                            ko4 ko4Var2 = ul6Var5.e0;
                                            ko4Var2.getClass();
                                            x1cVar2.g(ko4Var2);
                                        }
                                    }
                                    vl6Var2.l();
                                    return true;
                                }
                            }
                        }
                    } else if (vl6Var2.V == 2) {
                        ul6 ul6Var6 = (ul6) sparseArray3.get(vl6Var2.b0);
                        ul6Var6.d0.getClass();
                        if (vl6Var2.g0 > 0 && "A_OPUS".equals(ul6Var6.c)) {
                            ey7 ey7Var3 = vl6Var2.r;
                            byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(vl6Var2.g0).array();
                            ey7Var3.getClass();
                            ey7Var3.L(array.length, array);
                        }
                        int i64 = 0;
                        for (int i65 = 0; i65 < vl6Var2.Z; i65++) {
                            i64 += vl6Var2.a0[i65];
                        }
                        int i66 = 0;
                        while (i66 < vl6Var2.Z) {
                            long j5 = vl6Var2.W + ((ul6Var6.g * i66) / 1000);
                            int i67 = vl6Var2.d0;
                            if (i66 == 0 && !vl6Var2.f0) {
                                i67 |= 1;
                            }
                            int i68 = vl6Var2.a0[i66];
                            int i69 = i64 - i68;
                            vl6Var2.i(ul6Var6, j5, i67, i68, i69);
                            i66++;
                            i64 = i69;
                        }
                        vl6Var2.V = (byte) 0;
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
            cdc cdcVar = this.c;
            if (b3 == 0) {
                int i70 = 4;
                int i71 = 0;
                long d = cdcVar.d(cb3Var, z, false, 4);
                if (d == -2) {
                    cb3Var.h();
                    while (true) {
                        byte[] bArr11 = this.a;
                        cb3Var.b(i71, i70, bArr11);
                        byte b4 = bArr11[i71];
                        int i72 = i;
                        int i73 = 0;
                        while (true) {
                            if (i73 >= i72) {
                                i3 = -1;
                            } else if ((cdc.d[i73] & b4) != 0) {
                                i3 = i73 + 1;
                            } else {
                                i73++;
                                i72 = 8;
                            }
                        }
                        if (i3 != -1 && i3 <= 4) {
                            b = (int) cdc.b(i3, false, bArr11);
                            Object obj = this.d.b;
                            if (b == 357149030 || b == 272869232 || b == 524531317 || b == 475249515 || b == 374648427) {
                            }
                        }
                        cb3Var.n(1);
                        i70 = 4;
                        i71 = 0;
                        i = 8;
                    }
                    cb3Var.n(i3);
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
                this.g = cdcVar.d(cb3Var, z2, z, 8);
                this.e = (byte) 2;
            }
            v34 v34Var2 = this.d;
            int i74 = this.f;
            Object obj2 = v34Var2.b;
            switch (i74) {
                case 128:
                case jn7.Y1 /* 143 */:
                case jn7.p2 /* 160 */:
                case jn7.v2 /* 166 */:
                case jn7.D2 /* 174 */:
                case jn7.L2 /* 182 */:
                case jn7.M2 /* 183 */:
                case jn7.Q2 /* 187 */:
                case jn7.A3 /* 224 */:
                case jn7.B3 /* 225 */:
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
                case jn7.O1 /* 131 */:
                case jn7.R1 /* 136 */:
                case jn7.S1 /* 137 */:
                case jn7.a2 /* 145 */:
                case jn7.b2 /* 146 */:
                case jn7.h2 /* 152 */:
                case jn7.k2 /* 155 */:
                case jn7.o2 /* 159 */:
                case jn7.F2 /* 176 */:
                case jn7.I2 /* 179 */:
                case jn7.P2 /* 186 */:
                case jn7.r3 /* 215 */:
                case jn7.G3 /* 231 */:
                case jn7.M3 /* 238 */:
                case jn7.O3 /* 240 */:
                case jn7.P3 /* 241 */:
                case jn7.V3 /* 247 */:
                case jn7.Z3 /* 251 */:
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
                case jn7.Q1 /* 133 */:
                case 134:
                case 17026:
                case 17276:
                case 21358:
                case 2274716:
                    i2 = 3;
                    break;
                case jn7.q2 /* 161 */:
                case jn7.s2 /* 163 */:
                case jn7.u2 /* 165 */:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    i2 = 4;
                    break;
                case jn7.K2 /* 181 */:
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
                    long position = cb3Var.getPosition();
                    arrayDeque.push(new xa3(this.f, this.g + position));
                    this.d.T(position, this.f, this.g);
                    this.e = (byte) 0;
                    return true;
                }
                if (i2 == 2) {
                    long j6 = this.g;
                    if (j6 <= 8) {
                        v34Var2.K(i74, b(cb3Var, (int) j6));
                        this.e = (byte) 0;
                        return true;
                    }
                    throw hy7.a("Invalid integer size: " + this.g, null);
                }
                if (i2 == 3) {
                    byte b5 = 0;
                    long j7 = this.g;
                    if (j7 > 2147483647L) {
                        throw hy7.a("String element size: " + this.g, null);
                    }
                    int i75 = (int) j7;
                    if (i75 == 0) {
                        str = "";
                    } else {
                        byte[] bArr12 = new byte[i75];
                        cb3Var.readFully(bArr12, 0, i75);
                        while (i75 > 0 && bArr12[i75 - 1] == 0) {
                            i75--;
                        }
                        b5 = 0;
                        str = new String(bArr12, 0, i75);
                    }
                    v34Var2.U(i74, str);
                    this.e = b5;
                    return true;
                }
                if (i2 == 4) {
                    v34Var2.H(i74, (int) this.g, cb3Var);
                    this.e = (byte) 0;
                    return true;
                }
                if (i2 != 5) {
                    throw hy7.a("Invalid element type " + i2, null);
                }
                long j8 = this.g;
                if (j8 != 4 && j8 != 8) {
                    throw hy7.a("Invalid float size: " + this.g, null);
                }
                int i76 = (int) j8;
                double intBitsToFloat = i76 == 4 ? Float.intBitsToFloat((int) r5) : Double.longBitsToDouble(b(cb3Var, i76));
                vl6 vl6Var3 = (vl6) v34Var2.b;
                if (i74 == 181) {
                    vl6Var3.h(i74);
                    vl6Var3.B.T = (int) intBitsToFloat;
                } else if (i74 != 17545) {
                    switch (i74) {
                        case 21969:
                            vl6Var3.h(i74);
                            vl6Var3.B.F = (float) intBitsToFloat;
                            break;
                        case 21970:
                            vl6Var3.h(i74);
                            vl6Var3.B.G = (float) intBitsToFloat;
                            break;
                        case 21971:
                            vl6Var3.h(i74);
                            vl6Var3.B.H = (float) intBitsToFloat;
                            break;
                        case 21972:
                            vl6Var3.h(i74);
                            vl6Var3.B.I = (float) intBitsToFloat;
                            break;
                        case 21973:
                            vl6Var3.h(i74);
                            vl6Var3.B.J = (float) intBitsToFloat;
                            break;
                        case 21974:
                            vl6Var3.h(i74);
                            vl6Var3.B.K = (float) intBitsToFloat;
                            break;
                        case 21975:
                            vl6Var3.h(i74);
                            vl6Var3.B.L = (float) intBitsToFloat;
                            break;
                        case 21976:
                            vl6Var3.h(i74);
                            vl6Var3.B.M = (float) intBitsToFloat;
                            break;
                        case 21977:
                            vl6Var3.h(i74);
                            vl6Var3.B.N = (float) intBitsToFloat;
                            break;
                        case 21978:
                            vl6Var3.h(i74);
                            vl6Var3.B.O = (float) intBitsToFloat;
                            break;
                        default:
                            switch (i74) {
                                case 30323:
                                    vl6Var3.h(i74);
                                    vl6Var3.B.v = (float) intBitsToFloat;
                                    break;
                                case 30324:
                                    vl6Var3.h(i74);
                                    vl6Var3.B.w = (float) intBitsToFloat;
                                    break;
                                case 30325:
                                    vl6Var3.h(i74);
                                    vl6Var3.B.x = (float) intBitsToFloat;
                                    break;
                            }
                    }
                } else {
                    vl6Var3.w = (long) intBitsToFloat;
                }
                this.e = (byte) 0;
                return true;
            }
            cb3Var.n((int) this.g);
            this.e = (byte) 0;
        }
    }

    public final long b(cb3 cb3Var, int i) {
        cb3Var.c(this.a, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (r5[i2] & 255);
        }
        return j;
    }
}
