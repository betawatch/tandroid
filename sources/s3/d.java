package s3;

import android.util.Pair;
import android.util.SparseArray;
import d5.f0;
import d5.q;
import d5.y;
import e5.f;
import h3.s0;
import h3.t0;
import h3.t1;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import m3.h;
import m3.k;
import m3.l;
import m3.m;
import m3.n;
import m3.o;
import m3.t;
import m3.v;
import m3.x;
import n2.p;
import n2.w;
import o8.z;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.j2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d implements k {
    public static final byte[] c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] d0;
    public static final byte[] e0;
    public static final byte[] f0;
    public static final UUID g0;
    public static final Map h0;
    public long A;
    public long B;
    public w C;
    public w D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public long R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public byte Z;
    public final b a;
    public boolean a0;
    public final e b;
    public m b0;
    public final SparseArray c;
    public final boolean d;
    public final y e;
    public final y f;
    public final y g;
    public final y h;
    public final y i;
    public final y j;
    public final y k;
    public final y l;
    public final y m;
    public final y n;
    public ByteBuffer o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public c u;
    public boolean v;
    public int w;
    public long x;
    public boolean y;
    public long z;

    static {
        int i9 = f0.a;
        d0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(n8.d.c);
        e0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        g0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        j2.n(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        j2.n(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        h0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    public d(int i9) {
        b bVar = new b();
        this.q = -1L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.a = bVar;
        bVar.d = new p(this, 20);
        this.d = (i9 & 1) == 0;
        this.b = new e();
        this.c = new SparseArray();
        this.g = new y(4);
        this.h = new y(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new y(4);
        this.e = new y(d5.a.d);
        this.f = new y(4);
        this.j = new y();
        this.k = new y();
        this.l = new y(8);
        this.m = new y();
        this.n = new y();
        this.L = new int[1];
    }

    public static byte[] h(long j10, long j11, String str) {
        d5.a.f(j10 != -9223372036854775807L);
        int i9 = (int) (j10 / 3600000000L);
        long j12 = j10 - (i9 * 3600000000L);
        int i10 = (int) (j12 / 60000000);
        long j13 = j12 - (i10 * 60000000);
        int i11 = (int) (j13 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf((int) ((j13 - (i11 * 1000000)) / j11)));
        int i12 = f0.a;
        return format.getBytes(n8.d.c);
    }

    public final void a(int i9) {
        if (this.C == null || this.D == null) {
            throw t1.a("Element " + i9 + " must be in a Cues", null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0883, code lost:
    
        if (r1.l() == r12.getLeastSignificantBits()) goto L496;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x08c9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x08e1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0aba  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0901  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x08e3  */
    /* JADX WARN: Type inference failed for: r1v104 */
    /* JADX WARN: Type inference failed for: r1v105, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v43, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r6v3, types: [m3.h] */
    @Override // m3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(l lVar, n nVar) {
        l lVar2;
        boolean z10;
        int i9;
        boolean z11;
        String str;
        ?? r62;
        int i10;
        int a2;
        d dVar;
        char c10;
        m mVar;
        List singletonList;
        int u10;
        ArrayList arrayList;
        int i11;
        Exception exc;
        Pair pair;
        String str2;
        String str3;
        List list;
        List list2;
        String str4;
        s0 s0Var;
        boolean h;
        int i12;
        int i13;
        e5.b bVar;
        byte[] bArr;
        int i14;
        String str5;
        e5.c a3;
        t oVar;
        int i15;
        d dVar2 = this;
        dVar2.F = false;
        boolean z12 = true;
        boolean z13 = true;
        while (z13 && !dVar2.F) {
            b bVar2 = dVar2.a;
            e eVar = bVar2.c;
            ArrayDeque arrayDeque = bVar2.b;
            d5.a.j(bVar2.d);
            int i16 = z12;
            while (true) {
                a aVar = (a) arrayDeque.peek();
                if (aVar == null || ((h) lVar).d < aVar.b) {
                    ?? r22 = 0;
                    if (bVar2.e == 0) {
                        lVar2 = lVar;
                        int i17 = 4;
                        long b10 = eVar.b(lVar2, true, false, 4);
                        if (b10 == -2) {
                            byte[] bArr2 = bVar2.a;
                            ((h) lVar2).f = 0;
                            while (true) {
                                r62 = (h) lVar2;
                                r62.g(bArr2, r22, i17, r22);
                                byte b11 = bArr2[r22];
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= 8) {
                                        i10 = -1;
                                    } else if ((e.d[i18] & b11) != 0) {
                                        i10 = i18 + 1;
                                    } else {
                                        i18++;
                                    }
                                }
                                if (i10 != -1 && i10 <= 4) {
                                    a2 = (int) e.a(i10, false, bArr2);
                                    Object obj = bVar2.d.b;
                                    if (a2 == 357149030 || a2 == 524531317 || a2 == 475249515 || a2 == 374648427) {
                                    }
                                }
                                r62.u(1);
                                r22 = 0;
                                i17 = 4;
                            }
                            r62.u(i10);
                            b10 = a2;
                        }
                        z10 = true;
                        if (b10 == -1) {
                            z13 = false;
                        } else {
                            bVar2.f = (int) b10;
                            bVar2.e = 1;
                        }
                    } else {
                        lVar2 = lVar;
                        z10 = true;
                    }
                    if (bVar2.e == z10) {
                        bVar2.g = eVar.b(lVar2, false, z10, 8);
                        bVar2.e = 2;
                    }
                    p pVar = bVar2.d;
                    int i19 = bVar2.f;
                    Object obj2 = pVar.b;
                    switch (i19) {
                        case 131:
                        case 136:
                        case 155:
                        case 159:
                        case 176:
                        case 179:
                        case 186:
                        case 215:
                        case 231:
                        case 238:
                        case 241:
                        case 251:
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
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 21998:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 30114:
                        case 30321:
                        case 2352003:
                        case 2807729:
                            i9 = 2;
                            break;
                        case 134:
                        case 17026:
                        case 21358:
                        case 2274716:
                            i9 = 3;
                            break;
                        case 160:
                        case 166:
                        case 174:
                        case 183:
                        case 187:
                        case 224:
                        case 225:
                        case 16868:
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
                        case 290298740:
                        case 357149030:
                        case 374648427:
                        case 408125543:
                        case 440786851:
                        case 475249515:
                        case 524531317:
                            i9 = 1;
                            break;
                        case 161:
                        case 163:
                        case 165:
                        case 16877:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322:
                            i9 = 4;
                            break;
                        case 181:
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
                            i9 = 5;
                            break;
                        default:
                            i9 = 0;
                            break;
                    }
                    if (i9 != 0) {
                        if (i9 == 1) {
                            long j10 = ((h) lVar2).d;
                            arrayDeque.push(new a(i19, bVar2.g + j10));
                            p pVar2 = bVar2.d;
                            int i20 = bVar2.f;
                            long j11 = bVar2.g;
                            d dVar3 = (d) pVar2.b;
                            d5.a.j(dVar3.b0);
                            if (i20 != 160) {
                                if (i20 == 174) {
                                    c cVar = new c();
                                    cVar.m = -1;
                                    cVar.n = -1;
                                    cVar.o = -1;
                                    cVar.p = -1;
                                    cVar.q = 0;
                                    cVar.r = -1;
                                    cVar.s = 0.0f;
                                    cVar.t = 0.0f;
                                    cVar.u = 0.0f;
                                    cVar.v = null;
                                    cVar.w = -1;
                                    cVar.x = false;
                                    cVar.y = -1;
                                    cVar.z = -1;
                                    cVar.A = -1;
                                    cVar.B = MediaDataController.MAX_STYLE_RUNS_COUNT;
                                    cVar.C = 200;
                                    cVar.D = -1.0f;
                                    cVar.E = -1.0f;
                                    cVar.F = -1.0f;
                                    cVar.G = -1.0f;
                                    cVar.H = -1.0f;
                                    cVar.I = -1.0f;
                                    cVar.J = -1.0f;
                                    cVar.K = -1.0f;
                                    cVar.L = -1.0f;
                                    cVar.M = -1.0f;
                                    cVar.O = 1;
                                    cVar.P = -1;
                                    cVar.Q = 8000;
                                    cVar.R = 0L;
                                    cVar.S = 0L;
                                    cVar.V = true;
                                    cVar.W = "eng";
                                    dVar3.u = cVar;
                                } else if (i20 == 187) {
                                    z11 = false;
                                    dVar3.E = false;
                                } else if (i20 == 19899) {
                                    dVar3.w = -1;
                                    dVar3.x = -1L;
                                } else if (i20 == 20533) {
                                    dVar3.d(i20);
                                    dVar3.u.h = true;
                                } else if (i20 == 21968) {
                                    dVar3.d(i20);
                                    dVar3.u.x = true;
                                } else if (i20 == 408125543) {
                                    long j12 = dVar3.q;
                                    if (j12 != -1 && j12 != j10) {
                                        throw t1.a("Multiple Segment elements not supported", null);
                                    }
                                    dVar3.q = j10;
                                    dVar3.p = j11;
                                } else if (i20 == 475249515) {
                                    dVar3.C = new w(3, (byte) 0);
                                    dVar3.D = new w(3, (byte) 0);
                                } else if (i20 == 524531317 && !dVar3.v) {
                                    if (!dVar3.d || dVar3.z == -1) {
                                        dVar3.b0.y(new o(dVar3.t));
                                        dVar3.v = true;
                                    } else {
                                        dVar3.y = true;
                                    }
                                }
                                z11 = false;
                            } else {
                                z11 = false;
                                dVar3.Q = false;
                                dVar3.R = 0L;
                            }
                            bVar2.e = z11 ? 1 : 0;
                        } else if (i9 == 2) {
                            long j13 = bVar2.g;
                            if (j13 > 8) {
                                throw t1.a("Invalid integer size: " + bVar2.g, null);
                            }
                            pVar.w(i19, bVar2.a(lVar2, (int) j13));
                            z11 = false;
                            bVar2.e = 0;
                        } else if (i9 == 3) {
                            long j14 = bVar2.g;
                            if (j14 > 2147483647L) {
                                throw t1.a("String element size: " + bVar2.g, null);
                            }
                            int i21 = (int) j14;
                            if (i21 == 0) {
                                str = "";
                            } else {
                                byte[] bArr3 = new byte[i21];
                                ((h) lVar2).d(bArr3, 0, i21, false);
                                while (i21 > 0 && bArr3[i21 - 1] == 0) {
                                    i21--;
                                }
                                str = new String(bArr3, 0, i21);
                            }
                            d dVar4 = (d) pVar.b;
                            if (i19 == 134) {
                                dVar4.d(i19);
                                dVar4.u.b = str;
                            } else if (i19 != 17026) {
                                if (i19 == 21358) {
                                    dVar4.d(i19);
                                    dVar4.u.a = str;
                                } else if (i19 == 2274716) {
                                    dVar4.d(i19);
                                    dVar4.u.W = str;
                                }
                            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                                throw t1.a("DocType " + str + " not supported", null);
                            }
                            z11 = false;
                            bVar2.e = 0;
                        } else if (i9 == 4) {
                            pVar.n(i19, (int) bVar2.g, lVar2);
                            z11 = false;
                            bVar2.e = 0;
                        } else {
                            if (i9 != 5) {
                                throw t1.a("Invalid element type " + i9, null);
                            }
                            long j15 = bVar2.g;
                            if (j15 != 4 && j15 != 8) {
                                throw t1.a("Invalid float size: " + bVar2.g, null);
                            }
                            int i22 = (int) j15;
                            double intBitsToFloat = i22 == 4 ? Float.intBitsToFloat((int) r5) : Double.longBitsToDouble(bVar2.a(lVar2, i22));
                            d dVar5 = (d) pVar.b;
                            if (i19 == 181) {
                                dVar5.d(i19);
                                dVar5.u.Q = (int) intBitsToFloat;
                            } else if (i19 != 17545) {
                                switch (i19) {
                                    case 21969:
                                        dVar5.d(i19);
                                        dVar5.u.D = (float) intBitsToFloat;
                                        break;
                                    case 21970:
                                        dVar5.d(i19);
                                        dVar5.u.E = (float) intBitsToFloat;
                                        break;
                                    case 21971:
                                        dVar5.d(i19);
                                        dVar5.u.F = (float) intBitsToFloat;
                                        break;
                                    case 21972:
                                        dVar5.d(i19);
                                        dVar5.u.G = (float) intBitsToFloat;
                                        break;
                                    case 21973:
                                        dVar5.d(i19);
                                        dVar5.u.H = (float) intBitsToFloat;
                                        break;
                                    case 21974:
                                        dVar5.d(i19);
                                        dVar5.u.I = (float) intBitsToFloat;
                                        break;
                                    case 21975:
                                        dVar5.d(i19);
                                        dVar5.u.J = (float) intBitsToFloat;
                                        break;
                                    case 21976:
                                        dVar5.d(i19);
                                        dVar5.u.K = (float) intBitsToFloat;
                                        break;
                                    case 21977:
                                        dVar5.d(i19);
                                        dVar5.u.L = (float) intBitsToFloat;
                                        break;
                                    case 21978:
                                        dVar5.d(i19);
                                        dVar5.u.M = (float) intBitsToFloat;
                                        break;
                                    default:
                                        switch (i19) {
                                            case 30323:
                                                dVar5.d(i19);
                                                dVar5.u.s = (float) intBitsToFloat;
                                                break;
                                            case 30324:
                                                dVar5.d(i19);
                                                dVar5.u.t = (float) intBitsToFloat;
                                                break;
                                            case 30325:
                                                dVar5.d(i19);
                                                dVar5.u.u = (float) intBitsToFloat;
                                                break;
                                        }
                                }
                            } else {
                                dVar5.s = (long) intBitsToFloat;
                            }
                            z11 = false;
                            bVar2.e = 0;
                        }
                        z13 = true;
                    } else {
                        ((h) lVar2).u((int) bVar2.g);
                        bVar2.e = 0;
                        i16 = 1;
                    }
                } else {
                    p pVar3 = bVar2.d;
                    int i23 = ((a) arrayDeque.pop()).a;
                    d dVar6 = (d) pVar3.b;
                    SparseArray sparseArray = dVar6.c;
                    d5.a.j(dVar6.b0);
                    if (i23 != 160) {
                        if (i23 == 174) {
                            c cVar2 = dVar6.u;
                            d5.a.j(cVar2);
                            String str6 = cVar2.b;
                            if (str6 == null) {
                                throw t1.a("CodecId is missing in TrackEntry element", null);
                            }
                            switch (str6) {
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
                                case "V_MPEGH/ISO/HEVC":
                                case "S_TEXT/WEBVTT":
                                case "S_TEXT/UTF8":
                                case "V_MPEG2":
                                case "A_EAC3":
                                case "A_FLAC":
                                case "A_OPUS":
                                    m mVar2 = dVar6.b0;
                                    int i24 = cVar2.c;
                                    switch (str6.hashCode()) {
                                        case -2095576542:
                                            if (str6.equals("V_MPEG4/ISO/AP")) {
                                                c10 = 0;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -2095575984:
                                            if (str6.equals("V_MPEG4/ISO/SP")) {
                                                c10 = 1;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1985379776:
                                            if (str6.equals("A_MS/ACM")) {
                                                c10 = 2;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1784763192:
                                            if (str6.equals("A_TRUEHD")) {
                                                c10 = 3;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1730367663:
                                            if (str6.equals("A_VORBIS")) {
                                                c10 = 4;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1482641358:
                                            if (str6.equals("A_MPEG/L2")) {
                                                c10 = 5;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1482641357:
                                            if (str6.equals("A_MPEG/L3")) {
                                                c10 = 6;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1373388978:
                                            if (str6.equals("V_MS/VFW/FOURCC")) {
                                                c10 = 7;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -933872740:
                                            if (str6.equals("S_DVBSUB")) {
                                                c10 = '\b';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -538363189:
                                            if (str6.equals("V_MPEG4/ISO/ASP")) {
                                                c10 = '\t';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -538363109:
                                            if (str6.equals("V_MPEG4/ISO/AVC")) {
                                                c10 = '\n';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -425012669:
                                            if (str6.equals("S_VOBSUB")) {
                                                c10 = 11;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -356037306:
                                            if (str6.equals("A_DTS/LOSSLESS")) {
                                                c10 = '\f';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 62923557:
                                            if (str6.equals("A_AAC")) {
                                                c10 = '\r';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 62923603:
                                            if (str6.equals("A_AC3")) {
                                                c10 = 14;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 62927045:
                                            if (str6.equals("A_DTS")) {
                                                c10 = 15;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 82318131:
                                            if (str6.equals("V_AV1")) {
                                                c10 = 16;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 82338133:
                                            if (str6.equals("V_VP8")) {
                                                c10 = 17;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 82338134:
                                            if (str6.equals("V_VP9")) {
                                                c10 = 18;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 99146302:
                                            if (str6.equals("S_HDMV/PGS")) {
                                                c10 = 19;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 444813526:
                                            if (str6.equals("V_THEORA")) {
                                                c10 = 20;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 542569478:
                                            if (str6.equals("A_DTS/EXPRESS")) {
                                                c10 = 21;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 635596514:
                                            if (str6.equals("A_PCM/FLOAT/IEEE")) {
                                                c10 = 22;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 725948237:
                                            if (str6.equals("A_PCM/INT/BIG")) {
                                                c10 = 23;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 725957860:
                                            if (str6.equals("A_PCM/INT/LIT")) {
                                                c10 = 24;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 738597099:
                                            if (str6.equals("S_TEXT/ASS")) {
                                                c10 = 25;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 855502857:
                                            if (str6.equals("V_MPEGH/ISO/HEVC")) {
                                                c10 = 26;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1045209816:
                                            if (str6.equals("S_TEXT/WEBVTT")) {
                                                c10 = 27;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1422270023:
                                            if (str6.equals("S_TEXT/UTF8")) {
                                                c10 = 28;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1809237540:
                                            if (str6.equals("V_MPEG2")) {
                                                c10 = 29;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1950749482:
                                            if (str6.equals("A_EAC3")) {
                                                c10 = 30;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1950789798:
                                            if (str6.equals("A_FLAC")) {
                                                c10 = 31;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1951062397:
                                            if (str6.equals("A_OPUS")) {
                                                c10 = ' ';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        default:
                                            c10 = 65535;
                                            break;
                                    }
                                    String str7 = "video/x-unknown";
                                    switch (c10) {
                                        case 0:
                                        case 1:
                                        case '\t':
                                            mVar = mVar2;
                                            byte[] bArr4 = cVar2.k;
                                            singletonList = bArr4 == null ? null : Collections.singletonList(bArr4);
                                            str7 = "video/mp4v-es";
                                            list = singletonList;
                                            u10 = -1;
                                            i11 = -1;
                                            str3 = null;
                                            if (cVar2.N != null && (a3 = e5.c.a(new y(cVar2.N))) != null) {
                                                str3 = a3.b;
                                                str7 = "video/dolby-vision";
                                            }
                                            int i25 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map = h0;
                                            if (h) {
                                                s0Var.B = cVar2.O;
                                                s0Var.C = cVar2.Q;
                                                s0Var.D = u10;
                                                i12 = 1;
                                            } else if (q.j(str7)) {
                                                if (cVar2.q == 0) {
                                                    int i26 = cVar2.o;
                                                    i13 = -1;
                                                    if (i26 == -1) {
                                                        i26 = cVar2.m;
                                                    }
                                                    cVar2.o = i26;
                                                    int i27 = cVar2.p;
                                                    if (i27 == -1) {
                                                        i27 = cVar2.n;
                                                    }
                                                    cVar2.p = i27;
                                                } else {
                                                    i13 = -1;
                                                }
                                                float f10 = (cVar2.o == i13 || (i14 = cVar2.p) == i13) ? -1.0f : (cVar2.n * r1) / (cVar2.m * i14);
                                                if (cVar2.x) {
                                                    if (cVar2.D == -1.0f || cVar2.E == -1.0f || cVar2.F == -1.0f || cVar2.G == -1.0f || cVar2.H == -1.0f || cVar2.I == -1.0f || cVar2.J == -1.0f || cVar2.K == -1.0f || cVar2.L == -1.0f || cVar2.M == -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = new byte[25];
                                                        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                                        order.put((byte) 0);
                                                        order.putShort((short) ((cVar2.D * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((cVar2.E * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((cVar2.F * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((cVar2.G * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((cVar2.H * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((cVar2.I * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((cVar2.J * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((cVar2.K * 50000.0f) + 0.5f));
                                                        order.putShort((short) (cVar2.L + 0.5f));
                                                        order.putShort((short) (cVar2.M + 0.5f));
                                                        order.putShort((short) cVar2.B);
                                                        order.putShort((short) cVar2.C);
                                                    }
                                                    bVar = new e5.b(cVar2.y, cVar2.A, cVar2.z, bArr);
                                                } else {
                                                    bVar = null;
                                                }
                                                String str8 = cVar2.a;
                                                int intValue = (str8 == null || !map.containsKey(str8)) ? -1 : ((Integer) map.get(cVar2.a)).intValue();
                                                if (cVar2.r == 0 && Float.compare(cVar2.s, 0.0f) == 0 && Float.compare(cVar2.t, 0.0f) == 0) {
                                                    if (Float.compare(cVar2.u, 0.0f) == 0) {
                                                        intValue = 0;
                                                    } else if (Float.compare(cVar2.t, 90.0f) == 0) {
                                                        intValue = 90;
                                                    } else if (Float.compare(cVar2.t, -180.0f) == 0 || Float.compare(cVar2.t, 180.0f) == 0) {
                                                        intValue = 180;
                                                    } else if (Float.compare(cVar2.t, -90.0f) == 0) {
                                                        intValue = 270;
                                                    }
                                                }
                                                s0Var.t = cVar2.m;
                                                s0Var.u = cVar2.n;
                                                s0Var.x = f10;
                                                s0Var.w = intValue;
                                                s0Var.y = cVar2.v;
                                                s0Var.z = cVar2.w;
                                                s0Var.A = bVar;
                                                i12 = 2;
                                            } else {
                                                if (!"application/x-subrip".equals(str7) && !"text/x-ssa".equals(str7) && !"text/vtt".equals(str7) && !"application/vobsub".equals(str7) && !"application/pgs".equals(str7) && !"application/dvbsubs".equals(str7)) {
                                                    throw t1.a("Unexpected MIME type.", null);
                                                }
                                                i12 = 3;
                                            }
                                            str5 = cVar2.a;
                                            if (str5 != null && !map.containsKey(str5)) {
                                                s0Var.b = cVar2.a;
                                            }
                                            s0Var.a = Integer.toString(i24);
                                            s0Var.o = str7;
                                            s0Var.p = i11;
                                            s0Var.c = cVar2.W;
                                            s0Var.d = i25;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = cVar2.l;
                                            t0 t0Var = new t0(s0Var);
                                            m3.w I = mVar.I(cVar2.c, i12);
                                            cVar2.X = I;
                                            I.c(t0Var);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar6 = dVar6;
                                            break;
                                        case 2:
                                            mVar = mVar2;
                                            y yVar = new y(cVar2.a(cVar2.b));
                                            try {
                                                int k10 = yVar.k();
                                                if (k10 != 1) {
                                                    if (k10 == 65534) {
                                                        yVar.C(24);
                                                        long l10 = yVar.l();
                                                        UUID uuid = g0;
                                                        if (l10 == uuid.getMostSignificantBits()) {
                                                            break;
                                                        }
                                                    }
                                                    d5.a.K("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                    str7 = "audio/x-unknown";
                                                    u10 = -1;
                                                    i11 = -1;
                                                    list = null;
                                                    str3 = null;
                                                    if (cVar2.N != null) {
                                                        str3 = a3.b;
                                                        str7 = "video/dolby-vision";
                                                        break;
                                                    }
                                                    int i252 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                                    s0Var = new s0();
                                                    h = q.h(str7);
                                                    Map map2 = h0;
                                                    if (h) {
                                                    }
                                                    str5 = cVar2.a;
                                                    if (str5 != null) {
                                                        s0Var.b = cVar2.a;
                                                        break;
                                                    }
                                                    s0Var.a = Integer.toString(i24);
                                                    s0Var.o = str7;
                                                    s0Var.p = i11;
                                                    s0Var.c = cVar2.W;
                                                    s0Var.d = i252;
                                                    s0Var.q = list;
                                                    s0Var.h = str3;
                                                    s0Var.r = cVar2.l;
                                                    t0 t0Var2 = new t0(s0Var);
                                                    m3.w I2 = mVar.I(cVar2.c, i12);
                                                    cVar2.X = I2;
                                                    I2.c(t0Var2);
                                                    sparseArray.put(cVar2.c, cVar2);
                                                    dVar6 = dVar6;
                                                }
                                                u10 = f0.u(cVar2.P);
                                                if (u10 == 0) {
                                                    d5.a.K("MatroskaExtractor", "Unsupported PCM bit depth: " + cVar2.P + ". Setting mimeType to audio/x-unknown");
                                                    str7 = "audio/x-unknown";
                                                    u10 = -1;
                                                    i11 = -1;
                                                    list = null;
                                                    str3 = null;
                                                    if (cVar2.N != null) {
                                                    }
                                                    int i2522 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                                    s0Var = new s0();
                                                    h = q.h(str7);
                                                    Map map22 = h0;
                                                    if (h) {
                                                    }
                                                    str5 = cVar2.a;
                                                    if (str5 != null) {
                                                    }
                                                    s0Var.a = Integer.toString(i24);
                                                    s0Var.o = str7;
                                                    s0Var.p = i11;
                                                    s0Var.c = cVar2.W;
                                                    s0Var.d = i2522;
                                                    s0Var.q = list;
                                                    s0Var.h = str3;
                                                    s0Var.r = cVar2.l;
                                                    t0 t0Var22 = new t0(s0Var);
                                                    m3.w I22 = mVar.I(cVar2.c, i12);
                                                    cVar2.X = I22;
                                                    I22.c(t0Var22);
                                                    sparseArray.put(cVar2.c, cVar2);
                                                    dVar6 = dVar6;
                                                }
                                                str7 = "audio/raw";
                                                i11 = -1;
                                                list = null;
                                                str3 = null;
                                                if (cVar2.N != null) {
                                                }
                                                int i25222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                                s0Var = new s0();
                                                h = q.h(str7);
                                                Map map222 = h0;
                                                if (h) {
                                                }
                                                str5 = cVar2.a;
                                                if (str5 != null) {
                                                }
                                                s0Var.a = Integer.toString(i24);
                                                s0Var.o = str7;
                                                s0Var.p = i11;
                                                s0Var.c = cVar2.W;
                                                s0Var.d = i25222;
                                                s0Var.q = list;
                                                s0Var.h = str3;
                                                s0Var.r = cVar2.l;
                                                t0 t0Var222 = new t0(s0Var);
                                                m3.w I222 = mVar.I(cVar2.c, i12);
                                                cVar2.X = I222;
                                                I222.c(t0Var222);
                                                sparseArray.put(cVar2.c, cVar2);
                                                dVar6 = dVar6;
                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                throw t1.a("Error parsing MS/ACM codec private", null);
                                            }
                                            break;
                                        case 3:
                                            mVar = mVar2;
                                            cVar2.T = new x();
                                            str7 = "audio/true-hd";
                                            u10 = -1;
                                            i11 = -1;
                                            list = null;
                                            str3 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i252222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map2222 = h0;
                                            if (h) {
                                            }
                                            str5 = cVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i24);
                                            s0Var.o = str7;
                                            s0Var.p = i11;
                                            s0Var.c = cVar2.W;
                                            s0Var.d = i252222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = cVar2.l;
                                            t0 t0Var2222 = new t0(s0Var);
                                            m3.w I2222 = mVar.I(cVar2.c, i12);
                                            cVar2.X = I2222;
                                            I2222.c(t0Var2222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar6 = dVar6;
                                            break;
                                        case 4:
                                            mVar = mVar2;
                                            byte[] a10 = cVar2.a(str6);
                                            try {
                                            } catch (ArrayIndexOutOfBoundsException unused2) {
                                                a10 = 0;
                                            }
                                            try {
                                                if (a10[0] != 2) {
                                                    throw t1.a("Error parsing vorbis codec private", null);
                                                }
                                                int i28 = 0;
                                                int i29 = 1;
                                                while (true) {
                                                    int i30 = a10[i29] & 255;
                                                    if (i30 == 255) {
                                                        i28 += 255;
                                                        i29++;
                                                    } else {
                                                        int i31 = i29 + 1;
                                                        int i32 = i28 + i30;
                                                        int i33 = 0;
                                                        while (true) {
                                                            int i34 = a10[i31] & 255;
                                                            if (i34 == 255) {
                                                                i33 += 255;
                                                                i31++;
                                                            } else {
                                                                int i35 = i31 + 1;
                                                                int i36 = i33 + i34;
                                                                if (a10[i35] != 1) {
                                                                    throw t1.a("Error parsing vorbis codec private", null);
                                                                }
                                                                byte[] bArr5 = new byte[i32];
                                                                System.arraycopy(a10, i35, bArr5, 0, i32);
                                                                int i37 = i35 + i32;
                                                                if (a10[i37] != 3) {
                                                                    throw t1.a("Error parsing vorbis codec private", null);
                                                                }
                                                                int i38 = i37 + i36;
                                                                if (a10[i38] != 5) {
                                                                    throw t1.a("Error parsing vorbis codec private", null);
                                                                }
                                                                byte[] bArr6 = new byte[a10.length - i38];
                                                                System.arraycopy(a10, i38, bArr6, 0, a10.length - i38);
                                                                arrayList = new ArrayList(2);
                                                                arrayList.add(bArr5);
                                                                arrayList.add(bArr6);
                                                                str7 = "audio/vorbis";
                                                                i11 = 8192;
                                                                list = arrayList;
                                                                u10 = -1;
                                                                str3 = null;
                                                                if (cVar2.N != null) {
                                                                }
                                                                int i2522222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                                                s0Var = new s0();
                                                                h = q.h(str7);
                                                                Map map22222 = h0;
                                                                if (h) {
                                                                }
                                                                str5 = cVar2.a;
                                                                if (str5 != null) {
                                                                }
                                                                s0Var.a = Integer.toString(i24);
                                                                s0Var.o = str7;
                                                                s0Var.p = i11;
                                                                s0Var.c = cVar2.W;
                                                                s0Var.d = i2522222;
                                                                s0Var.q = list;
                                                                s0Var.h = str3;
                                                                s0Var.r = cVar2.l;
                                                                t0 t0Var22222 = new t0(s0Var);
                                                                m3.w I22222 = mVar.I(cVar2.c, i12);
                                                                cVar2.X = I22222;
                                                                I22222.c(t0Var22222);
                                                                sparseArray.put(cVar2.c, cVar2);
                                                                dVar6 = dVar6;
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                                throw t1.a("Error parsing vorbis codec private", a10);
                                            }
                                            break;
                                        case 5:
                                            mVar = mVar2;
                                            str7 = "audio/mpeg-L2";
                                            u10 = -1;
                                            i11 = 4096;
                                            list = null;
                                            str3 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i25222222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map222222 = h0;
                                            if (h) {
                                            }
                                            str5 = cVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i24);
                                            s0Var.o = str7;
                                            s0Var.p = i11;
                                            s0Var.c = cVar2.W;
                                            s0Var.d = i25222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = cVar2.l;
                                            t0 t0Var222222 = new t0(s0Var);
                                            m3.w I222222 = mVar.I(cVar2.c, i12);
                                            cVar2.X = I222222;
                                            I222222.c(t0Var222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar6 = dVar6;
                                            break;
                                        case 6:
                                            mVar = mVar2;
                                            str7 = "audio/mpeg";
                                            u10 = -1;
                                            i11 = 4096;
                                            list = null;
                                            str3 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i252222222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map2222222 = h0;
                                            if (h) {
                                            }
                                            str5 = cVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i24);
                                            s0Var.o = str7;
                                            s0Var.p = i11;
                                            s0Var.c = cVar2.W;
                                            s0Var.d = i252222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = cVar2.l;
                                            t0 t0Var2222222 = new t0(s0Var);
                                            m3.w I2222222 = mVar.I(cVar2.c, i12);
                                            cVar2.X = I2222222;
                                            I2222222.c(t0Var2222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar6 = dVar6;
                                            break;
                                        case 7:
                                            mVar = mVar2;
                                            y yVar2 = new y(cVar2.a(cVar2.b));
                                            try {
                                                yVar2.D(16);
                                                long i39 = yVar2.i();
                                                if (i39 == 1482049860) {
                                                    exc = null;
                                                    try {
                                                        pair = new Pair("video/divx", null);
                                                    } catch (ArrayIndexOutOfBoundsException unused4) {
                                                        throw t1.a("Error parsing FourCC private data", exc);
                                                    }
                                                } else if (i39 == 859189832) {
                                                    pair = new Pair("video/3gpp", null);
                                                } else {
                                                    if (i39 == 826496599) {
                                                        byte[] bArr7 = yVar2.a;
                                                        for (int i40 = yVar2.b + 20; i40 < bArr7.length - 4; i40++) {
                                                            if (bArr7[i40] == 0 && bArr7[i40 + 1] == 0 && bArr7[i40 + 2] == 1) {
                                                                if (bArr7[i40 + 3] == 15) {
                                                                    pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr7, i40, bArr7.length)));
                                                                }
                                                            }
                                                        }
                                                        try {
                                                            throw t1.a("Failed to find FourCC VC1 initialization data", null);
                                                        } catch (ArrayIndexOutOfBoundsException unused5) {
                                                            exc = null;
                                                            throw t1.a("Error parsing FourCC private data", exc);
                                                        }
                                                    }
                                                    d5.a.K("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                    str2 = null;
                                                    pair = new Pair("video/x-unknown", null);
                                                    str7 = (String) pair.first;
                                                    str3 = str2;
                                                    list = (List) pair.second;
                                                    u10 = -1;
                                                    i11 = -1;
                                                    if (cVar2.N != null) {
                                                    }
                                                    int i2522222222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                                    s0Var = new s0();
                                                    h = q.h(str7);
                                                    Map map22222222 = h0;
                                                    if (h) {
                                                    }
                                                    str5 = cVar2.a;
                                                    if (str5 != null) {
                                                    }
                                                    s0Var.a = Integer.toString(i24);
                                                    s0Var.o = str7;
                                                    s0Var.p = i11;
                                                    s0Var.c = cVar2.W;
                                                    s0Var.d = i2522222222;
                                                    s0Var.q = list;
                                                    s0Var.h = str3;
                                                    s0Var.r = cVar2.l;
                                                    t0 t0Var22222222 = new t0(s0Var);
                                                    m3.w I22222222 = mVar.I(cVar2.c, i12);
                                                    cVar2.X = I22222222;
                                                    I22222222.c(t0Var22222222);
                                                    sparseArray.put(cVar2.c, cVar2);
                                                    dVar6 = dVar6;
                                                }
                                                str2 = null;
                                                str7 = (String) pair.first;
                                                str3 = str2;
                                                list = (List) pair.second;
                                                u10 = -1;
                                                i11 = -1;
                                                if (cVar2.N != null) {
                                                }
                                                int i25222222222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                                s0Var = new s0();
                                                h = q.h(str7);
                                                Map map222222222 = h0;
                                                if (h) {
                                                }
                                                str5 = cVar2.a;
                                                if (str5 != null) {
                                                }
                                                s0Var.a = Integer.toString(i24);
                                                s0Var.o = str7;
                                                s0Var.p = i11;
                                                s0Var.c = cVar2.W;
                                                s0Var.d = i25222222222;
                                                s0Var.q = list;
                                                s0Var.h = str3;
                                                s0Var.r = cVar2.l;
                                                t0 t0Var222222222 = new t0(s0Var);
                                                m3.w I222222222 = mVar.I(cVar2.c, i12);
                                                cVar2.X = I222222222;
                                                I222222222.c(t0Var222222222);
                                                sparseArray.put(cVar2.c, cVar2);
                                                dVar6 = dVar6;
                                            } catch (ArrayIndexOutOfBoundsException unused6) {
                                                exc = null;
                                            }
                                            break;
                                        case '\b':
                                            mVar = mVar2;
                                            byte[] bArr8 = new byte[4];
                                            System.arraycopy(cVar2.a(str6), 0, bArr8, 0, 4);
                                            list = z.y(bArr8);
                                            str7 = "application/dvbsubs";
                                            u10 = -1;
                                            i11 = -1;
                                            str3 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i252222222222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map2222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = cVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i24);
                                            s0Var.o = str7;
                                            s0Var.p = i11;
                                            s0Var.c = cVar2.W;
                                            s0Var.d = i252222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = cVar2.l;
                                            t0 t0Var2222222222 = new t0(s0Var);
                                            m3.w I2222222222 = mVar.I(cVar2.c, i12);
                                            cVar2.X = I2222222222;
                                            I2222222222.c(t0Var2222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar6 = dVar6;
                                            break;
                                        case '\n':
                                            mVar = mVar2;
                                            e5.a a11 = e5.a.a(new y(cVar2.a(cVar2.b)));
                                            list2 = a11.a;
                                            cVar2.Y = a11.b;
                                            str4 = a11.f;
                                            str7 = MediaController.VIDEO_MIME_TYPE;
                                            str3 = str4;
                                            list = list2;
                                            u10 = -1;
                                            i11 = -1;
                                            if (cVar2.N != null) {
                                            }
                                            int i2522222222222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map22222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = cVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i24);
                                            s0Var.o = str7;
                                            s0Var.p = i11;
                                            s0Var.c = cVar2.W;
                                            s0Var.d = i2522222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = cVar2.l;
                                            t0 t0Var22222222222 = new t0(s0Var);
                                            m3.w I22222222222 = mVar.I(cVar2.c, i12);
                                            cVar2.X = I22222222222;
                                            I22222222222.c(t0Var22222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar6 = dVar6;
                                            break;
                                        case 11:
                                            mVar = mVar2;
                                            list = z.y(cVar2.a(str6));
                                            str7 = "application/vobsub";
                                            u10 = -1;
                                            i11 = -1;
                                            str3 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i25222222222222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = cVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i24);
                                            s0Var.o = str7;
                                            s0Var.p = i11;
                                            s0Var.c = cVar2.W;
                                            s0Var.d = i25222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = cVar2.l;
                                            t0 t0Var222222222222 = new t0(s0Var);
                                            m3.w I222222222222 = mVar.I(cVar2.c, i12);
                                            cVar2.X = I222222222222;
                                            I222222222222.c(t0Var222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar6 = dVar6;
                                            break;
                                        case '\f':
                                            mVar = mVar2;
                                            str7 = "audio/vnd.dts.hd";
                                            u10 = -1;
                                            i11 = -1;
                                            list = null;
                                            str3 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i252222222222222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map2222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = cVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i24);
                                            s0Var.o = str7;
                                            s0Var.p = i11;
                                            s0Var.c = cVar2.W;
                                            s0Var.d = i252222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = cVar2.l;
                                            t0 t0Var2222222222222 = new t0(s0Var);
                                            m3.w I2222222222222 = mVar.I(cVar2.c, i12);
                                            cVar2.X = I2222222222222;
                                            I2222222222222.c(t0Var2222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar6 = dVar6;
                                            break;
                                        case '\r':
                                            mVar = mVar2;
                                            List singletonList2 = Collections.singletonList(cVar2.a(str6));
                                            byte[] bArr9 = cVar2.k;
                                            j3.a h10 = j3.b.h(new d5.x(bArr9, bArr9.length), false);
                                            cVar2.Q = h10.a;
                                            cVar2.O = h10.b;
                                            String str9 = h10.c;
                                            str7 = MediaController.AUDIO_MIME_TYPE;
                                            list = singletonList2;
                                            str3 = str9;
                                            u10 = -1;
                                            i11 = -1;
                                            if (cVar2.N != null) {
                                            }
                                            int i2522222222222222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map22222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = cVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i24);
                                            s0Var.o = str7;
                                            s0Var.p = i11;
                                            s0Var.c = cVar2.W;
                                            s0Var.d = i2522222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = cVar2.l;
                                            t0 t0Var22222222222222 = new t0(s0Var);
                                            m3.w I22222222222222 = mVar.I(cVar2.c, i12);
                                            cVar2.X = I22222222222222;
                                            I22222222222222.c(t0Var22222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar6 = dVar6;
                                            break;
                                        case 14:
                                            mVar = mVar2;
                                            str7 = "audio/ac3";
                                            u10 = -1;
                                            i11 = -1;
                                            list = null;
                                            str3 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i25222222222222222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = cVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i24);
                                            s0Var.o = str7;
                                            s0Var.p = i11;
                                            s0Var.c = cVar2.W;
                                            s0Var.d = i25222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = cVar2.l;
                                            t0 t0Var222222222222222 = new t0(s0Var);
                                            m3.w I222222222222222 = mVar.I(cVar2.c, i12);
                                            cVar2.X = I222222222222222;
                                            I222222222222222.c(t0Var222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar6 = dVar6;
                                            break;
                                        case 15:
                                        case 21:
                                            mVar = mVar2;
                                            str7 = "audio/vnd.dts";
                                            u10 = -1;
                                            i11 = -1;
                                            list = null;
                                            str3 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i252222222222222222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map2222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = cVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i24);
                                            s0Var.o = str7;
                                            s0Var.p = i11;
                                            s0Var.c = cVar2.W;
                                            s0Var.d = i252222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = cVar2.l;
                                            t0 t0Var2222222222222222 = new t0(s0Var);
                                            m3.w I2222222222222222 = mVar.I(cVar2.c, i12);
                                            cVar2.X = I2222222222222222;
                                            I2222222222222222.c(t0Var2222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar6 = dVar6;
                                            break;
                                        case 16:
                                            mVar = mVar2;
                                            str7 = "video/av01";
                                            u10 = -1;
                                            i11 = -1;
                                            list = null;
                                            str3 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i2522222222222222222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map22222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = cVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i24);
                                            s0Var.o = str7;
                                            s0Var.p = i11;
                                            s0Var.c = cVar2.W;
                                            s0Var.d = i2522222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = cVar2.l;
                                            t0 t0Var22222222222222222 = new t0(s0Var);
                                            m3.w I22222222222222222 = mVar.I(cVar2.c, i12);
                                            cVar2.X = I22222222222222222;
                                            I22222222222222222.c(t0Var22222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar6 = dVar6;
                                            break;
                                        case 17:
                                            mVar = mVar2;
                                            str7 = "video/x-vnd.on2.vp8";
                                            u10 = -1;
                                            i11 = -1;
                                            list = null;
                                            str3 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i25222222222222222222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map222222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = cVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i24);
                                            s0Var.o = str7;
                                            s0Var.p = i11;
                                            s0Var.c = cVar2.W;
                                            s0Var.d = i25222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = cVar2.l;
                                            t0 t0Var222222222222222222 = new t0(s0Var);
                                            m3.w I222222222222222222 = mVar.I(cVar2.c, i12);
                                            cVar2.X = I222222222222222222;
                                            I222222222222222222.c(t0Var222222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar6 = dVar6;
                                            break;
                                        case 18:
                                            mVar = mVar2;
                                            str7 = "video/x-vnd.on2.vp9";
                                            u10 = -1;
                                            i11 = -1;
                                            list = null;
                                            str3 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i252222222222222222222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map2222222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = cVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i24);
                                            s0Var.o = str7;
                                            s0Var.p = i11;
                                            s0Var.c = cVar2.W;
                                            s0Var.d = i252222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = cVar2.l;
                                            t0 t0Var2222222222222222222 = new t0(s0Var);
                                            m3.w I2222222222222222222 = mVar.I(cVar2.c, i12);
                                            cVar2.X = I2222222222222222222;
                                            I2222222222222222222.c(t0Var2222222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar6 = dVar6;
                                            break;
                                        case 19:
                                            mVar = mVar2;
                                            str7 = "application/pgs";
                                            u10 = -1;
                                            i11 = -1;
                                            list = null;
                                            str3 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i2522222222222222222222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map22222222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = cVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i24);
                                            s0Var.o = str7;
                                            s0Var.p = i11;
                                            s0Var.c = cVar2.W;
                                            s0Var.d = i2522222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = cVar2.l;
                                            t0 t0Var22222222222222222222 = new t0(s0Var);
                                            m3.w I22222222222222222222 = mVar.I(cVar2.c, i12);
                                            cVar2.X = I22222222222222222222;
                                            I22222222222222222222.c(t0Var22222222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar6 = dVar6;
                                            break;
                                        case 20:
                                            mVar = mVar2;
                                            u10 = -1;
                                            i11 = -1;
                                            list = null;
                                            str3 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i25222222222222222222222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map222222222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = cVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i24);
                                            s0Var.o = str7;
                                            s0Var.p = i11;
                                            s0Var.c = cVar2.W;
                                            s0Var.d = i25222222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = cVar2.l;
                                            t0 t0Var222222222222222222222 = new t0(s0Var);
                                            m3.w I222222222222222222222 = mVar.I(cVar2.c, i12);
                                            cVar2.X = I222222222222222222222;
                                            I222222222222222222222.c(t0Var222222222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar6 = dVar6;
                                            break;
                                        case 22:
                                            mVar = mVar2;
                                            if (cVar2.P == 32) {
                                                str7 = "audio/raw";
                                                u10 = 4;
                                                i11 = -1;
                                                list = null;
                                                str3 = null;
                                                if (cVar2.N != null) {
                                                }
                                                int i252222222222222222222222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                                s0Var = new s0();
                                                h = q.h(str7);
                                                Map map2222222222222222222222 = h0;
                                                if (h) {
                                                }
                                                str5 = cVar2.a;
                                                if (str5 != null) {
                                                }
                                                s0Var.a = Integer.toString(i24);
                                                s0Var.o = str7;
                                                s0Var.p = i11;
                                                s0Var.c = cVar2.W;
                                                s0Var.d = i252222222222222222222222;
                                                s0Var.q = list;
                                                s0Var.h = str3;
                                                s0Var.r = cVar2.l;
                                                t0 t0Var2222222222222222222222 = new t0(s0Var);
                                                m3.w I2222222222222222222222 = mVar.I(cVar2.c, i12);
                                                cVar2.X = I2222222222222222222222;
                                                I2222222222222222222222.c(t0Var2222222222222222222222);
                                                sparseArray.put(cVar2.c, cVar2);
                                                dVar6 = dVar6;
                                            } else {
                                                d5.a.K("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + cVar2.P + ". Setting mimeType to audio/x-unknown");
                                                str7 = "audio/x-unknown";
                                                u10 = -1;
                                                i11 = -1;
                                                list = null;
                                                str3 = null;
                                                if (cVar2.N != null) {
                                                }
                                                int i2522222222222222222222222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                                s0Var = new s0();
                                                h = q.h(str7);
                                                Map map22222222222222222222222 = h0;
                                                if (h) {
                                                }
                                                str5 = cVar2.a;
                                                if (str5 != null) {
                                                }
                                                s0Var.a = Integer.toString(i24);
                                                s0Var.o = str7;
                                                s0Var.p = i11;
                                                s0Var.c = cVar2.W;
                                                s0Var.d = i2522222222222222222222222;
                                                s0Var.q = list;
                                                s0Var.h = str3;
                                                s0Var.r = cVar2.l;
                                                t0 t0Var22222222222222222222222 = new t0(s0Var);
                                                m3.w I22222222222222222222222 = mVar.I(cVar2.c, i12);
                                                cVar2.X = I22222222222222222222222;
                                                I22222222222222222222222.c(t0Var22222222222222222222222);
                                                sparseArray.put(cVar2.c, cVar2);
                                                dVar6 = dVar6;
                                            }
                                            break;
                                        case 23:
                                            mVar = mVar2;
                                            int i41 = cVar2.P;
                                            if (i41 == 8) {
                                                str7 = "audio/raw";
                                                u10 = 3;
                                                i11 = -1;
                                                list = null;
                                                str3 = null;
                                                if (cVar2.N != null) {
                                                }
                                                int i25222222222222222222222222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                                s0Var = new s0();
                                                h = q.h(str7);
                                                Map map222222222222222222222222 = h0;
                                                if (h) {
                                                }
                                                str5 = cVar2.a;
                                                if (str5 != null) {
                                                }
                                                s0Var.a = Integer.toString(i24);
                                                s0Var.o = str7;
                                                s0Var.p = i11;
                                                s0Var.c = cVar2.W;
                                                s0Var.d = i25222222222222222222222222;
                                                s0Var.q = list;
                                                s0Var.h = str3;
                                                s0Var.r = cVar2.l;
                                                t0 t0Var222222222222222222222222 = new t0(s0Var);
                                                m3.w I222222222222222222222222 = mVar.I(cVar2.c, i12);
                                                cVar2.X = I222222222222222222222222;
                                                I222222222222222222222222.c(t0Var222222222222222222222222);
                                                sparseArray.put(cVar2.c, cVar2);
                                                dVar6 = dVar6;
                                            } else if (i41 == 16) {
                                                u10 = TLObject.FLAG_28;
                                                str7 = "audio/raw";
                                                i11 = -1;
                                                list = null;
                                                str3 = null;
                                                if (cVar2.N != null) {
                                                }
                                                int i252222222222222222222222222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                                s0Var = new s0();
                                                h = q.h(str7);
                                                Map map2222222222222222222222222 = h0;
                                                if (h) {
                                                }
                                                str5 = cVar2.a;
                                                if (str5 != null) {
                                                }
                                                s0Var.a = Integer.toString(i24);
                                                s0Var.o = str7;
                                                s0Var.p = i11;
                                                s0Var.c = cVar2.W;
                                                s0Var.d = i252222222222222222222222222;
                                                s0Var.q = list;
                                                s0Var.h = str3;
                                                s0Var.r = cVar2.l;
                                                t0 t0Var2222222222222222222222222 = new t0(s0Var);
                                                m3.w I2222222222222222222222222 = mVar.I(cVar2.c, i12);
                                                cVar2.X = I2222222222222222222222222;
                                                I2222222222222222222222222.c(t0Var2222222222222222222222222);
                                                sparseArray.put(cVar2.c, cVar2);
                                                dVar6 = dVar6;
                                            } else {
                                                d5.a.K("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + cVar2.P + ". Setting mimeType to audio/x-unknown");
                                                str7 = "audio/x-unknown";
                                                u10 = -1;
                                                i11 = -1;
                                                list = null;
                                                str3 = null;
                                                if (cVar2.N != null) {
                                                }
                                                int i2522222222222222222222222222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                                s0Var = new s0();
                                                h = q.h(str7);
                                                Map map22222222222222222222222222 = h0;
                                                if (h) {
                                                }
                                                str5 = cVar2.a;
                                                if (str5 != null) {
                                                }
                                                s0Var.a = Integer.toString(i24);
                                                s0Var.o = str7;
                                                s0Var.p = i11;
                                                s0Var.c = cVar2.W;
                                                s0Var.d = i2522222222222222222222222222;
                                                s0Var.q = list;
                                                s0Var.h = str3;
                                                s0Var.r = cVar2.l;
                                                t0 t0Var22222222222222222222222222 = new t0(s0Var);
                                                m3.w I22222222222222222222222222 = mVar.I(cVar2.c, i12);
                                                cVar2.X = I22222222222222222222222222;
                                                I22222222222222222222222222.c(t0Var22222222222222222222222222);
                                                sparseArray.put(cVar2.c, cVar2);
                                                dVar6 = dVar6;
                                            }
                                            break;
                                        case 24:
                                            mVar = mVar2;
                                            u10 = f0.u(cVar2.P);
                                            if (u10 == 0) {
                                                d5.a.K("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + cVar2.P + ". Setting mimeType to audio/x-unknown");
                                                str7 = "audio/x-unknown";
                                                u10 = -1;
                                                i11 = -1;
                                                list = null;
                                                str3 = null;
                                                if (cVar2.N != null) {
                                                }
                                                int i25222222222222222222222222222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                                s0Var = new s0();
                                                h = q.h(str7);
                                                Map map222222222222222222222222222 = h0;
                                                if (h) {
                                                }
                                                str5 = cVar2.a;
                                                if (str5 != null) {
                                                }
                                                s0Var.a = Integer.toString(i24);
                                                s0Var.o = str7;
                                                s0Var.p = i11;
                                                s0Var.c = cVar2.W;
                                                s0Var.d = i25222222222222222222222222222;
                                                s0Var.q = list;
                                                s0Var.h = str3;
                                                s0Var.r = cVar2.l;
                                                t0 t0Var222222222222222222222222222 = new t0(s0Var);
                                                m3.w I222222222222222222222222222 = mVar.I(cVar2.c, i12);
                                                cVar2.X = I222222222222222222222222222;
                                                I222222222222222222222222222.c(t0Var222222222222222222222222222);
                                                sparseArray.put(cVar2.c, cVar2);
                                                dVar6 = dVar6;
                                            }
                                            str7 = "audio/raw";
                                            i11 = -1;
                                            list = null;
                                            str3 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i252222222222222222222222222222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map2222222222222222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = cVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i24);
                                            s0Var.o = str7;
                                            s0Var.p = i11;
                                            s0Var.c = cVar2.W;
                                            s0Var.d = i252222222222222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = cVar2.l;
                                            t0 t0Var2222222222222222222222222222 = new t0(s0Var);
                                            m3.w I2222222222222222222222222222 = mVar.I(cVar2.c, i12);
                                            cVar2.X = I2222222222222222222222222222;
                                            I2222222222222222222222222222.c(t0Var2222222222222222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar6 = dVar6;
                                            break;
                                        case 25:
                                            mVar = mVar2;
                                            list = z.t(d0, cVar2.a(str6));
                                            str7 = "text/x-ssa";
                                            u10 = -1;
                                            i11 = -1;
                                            str3 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i2522222222222222222222222222222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map22222222222222222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = cVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i24);
                                            s0Var.o = str7;
                                            s0Var.p = i11;
                                            s0Var.c = cVar2.W;
                                            s0Var.d = i2522222222222222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = cVar2.l;
                                            t0 t0Var22222222222222222222222222222 = new t0(s0Var);
                                            m3.w I22222222222222222222222222222 = mVar.I(cVar2.c, i12);
                                            cVar2.X = I22222222222222222222222222222;
                                            I22222222222222222222222222222.c(t0Var22222222222222222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar6 = dVar6;
                                            break;
                                        case 26:
                                            mVar = mVar2;
                                            f a12 = f.a(new y(cVar2.a(cVar2.b)));
                                            list2 = a12.a;
                                            cVar2.Y = a12.b;
                                            str4 = a12.d;
                                            str7 = "video/hevc";
                                            str3 = str4;
                                            list = list2;
                                            u10 = -1;
                                            i11 = -1;
                                            if (cVar2.N != null) {
                                            }
                                            int i25222222222222222222222222222222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map222222222222222222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = cVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i24);
                                            s0Var.o = str7;
                                            s0Var.p = i11;
                                            s0Var.c = cVar2.W;
                                            s0Var.d = i25222222222222222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = cVar2.l;
                                            t0 t0Var222222222222222222222222222222 = new t0(s0Var);
                                            m3.w I222222222222222222222222222222 = mVar.I(cVar2.c, i12);
                                            cVar2.X = I222222222222222222222222222222;
                                            I222222222222222222222222222222.c(t0Var222222222222222222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar6 = dVar6;
                                            break;
                                        case 27:
                                            mVar = mVar2;
                                            str7 = "text/vtt";
                                            u10 = -1;
                                            i11 = -1;
                                            list = null;
                                            str3 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i252222222222222222222222222222222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map2222222222222222222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = cVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i24);
                                            s0Var.o = str7;
                                            s0Var.p = i11;
                                            s0Var.c = cVar2.W;
                                            s0Var.d = i252222222222222222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = cVar2.l;
                                            t0 t0Var2222222222222222222222222222222 = new t0(s0Var);
                                            m3.w I2222222222222222222222222222222 = mVar.I(cVar2.c, i12);
                                            cVar2.X = I2222222222222222222222222222222;
                                            I2222222222222222222222222222222.c(t0Var2222222222222222222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar6 = dVar6;
                                            break;
                                        case 28:
                                            mVar = mVar2;
                                            str7 = "application/x-subrip";
                                            u10 = -1;
                                            i11 = -1;
                                            list = null;
                                            str3 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i2522222222222222222222222222222222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map22222222222222222222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = cVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i24);
                                            s0Var.o = str7;
                                            s0Var.p = i11;
                                            s0Var.c = cVar2.W;
                                            s0Var.d = i2522222222222222222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = cVar2.l;
                                            t0 t0Var22222222222222222222222222222222 = new t0(s0Var);
                                            m3.w I22222222222222222222222222222222 = mVar.I(cVar2.c, i12);
                                            cVar2.X = I22222222222222222222222222222222;
                                            I22222222222222222222222222222222.c(t0Var22222222222222222222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar6 = dVar6;
                                            break;
                                        case 29:
                                            mVar = mVar2;
                                            str7 = "video/mpeg2";
                                            u10 = -1;
                                            i11 = -1;
                                            list = null;
                                            str3 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i25222222222222222222222222222222222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map222222222222222222222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = cVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i24);
                                            s0Var.o = str7;
                                            s0Var.p = i11;
                                            s0Var.c = cVar2.W;
                                            s0Var.d = i25222222222222222222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = cVar2.l;
                                            t0 t0Var222222222222222222222222222222222 = new t0(s0Var);
                                            m3.w I222222222222222222222222222222222 = mVar.I(cVar2.c, i12);
                                            cVar2.X = I222222222222222222222222222222222;
                                            I222222222222222222222222222222222.c(t0Var222222222222222222222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar6 = dVar6;
                                            break;
                                        case MessageObject.TYPE_GIFT_STARS /* 30 */:
                                            mVar = mVar2;
                                            str7 = "audio/eac3";
                                            u10 = -1;
                                            i11 = -1;
                                            list = null;
                                            str3 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i252222222222222222222222222222222222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map2222222222222222222222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = cVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i24);
                                            s0Var.o = str7;
                                            s0Var.p = i11;
                                            s0Var.c = cVar2.W;
                                            s0Var.d = i252222222222222222222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = cVar2.l;
                                            t0 t0Var2222222222222222222222222222222222 = new t0(s0Var);
                                            m3.w I2222222222222222222222222222222222 = mVar.I(cVar2.c, i12);
                                            cVar2.X = I2222222222222222222222222222222222;
                                            I2222222222222222222222222222222222.c(t0Var2222222222222222222222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar6 = dVar6;
                                            break;
                                        case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                                            mVar = mVar2;
                                            singletonList = Collections.singletonList(cVar2.a(str6));
                                            str7 = "audio/flac";
                                            list = singletonList;
                                            u10 = -1;
                                            i11 = -1;
                                            str3 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i2522222222222222222222222222222222222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map22222222222222222222222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = cVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i24);
                                            s0Var.o = str7;
                                            s0Var.p = i11;
                                            s0Var.c = cVar2.W;
                                            s0Var.d = i2522222222222222222222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = cVar2.l;
                                            t0 t0Var22222222222222222222222222222222222 = new t0(s0Var);
                                            m3.w I22222222222222222222222222222222222 = mVar.I(cVar2.c, i12);
                                            cVar2.X = I22222222222222222222222222222222222;
                                            I22222222222222222222222222222222222.c(t0Var22222222222222222222222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar6 = dVar6;
                                            break;
                                        case ' ':
                                            arrayList = new ArrayList(3);
                                            arrayList.add(cVar2.a(cVar2.b));
                                            ByteBuffer allocate = ByteBuffer.allocate(8);
                                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                            mVar = mVar2;
                                            arrayList.add(allocate.order(byteOrder).putLong(cVar2.R).array());
                                            arrayList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(cVar2.S).array());
                                            str7 = "audio/opus";
                                            i11 = 5760;
                                            list = arrayList;
                                            u10 = -1;
                                            str3 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i25222222222222222222222222222222222222 = (cVar2.V ? 1 : 0) | (cVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map222222222222222222222222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = cVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i24);
                                            s0Var.o = str7;
                                            s0Var.p = i11;
                                            s0Var.c = cVar2.W;
                                            s0Var.d = i25222222222222222222222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = cVar2.l;
                                            t0 t0Var222222222222222222222222222222222222 = new t0(s0Var);
                                            m3.w I222222222222222222222222222222222222 = mVar.I(cVar2.c, i12);
                                            cVar2.X = I222222222222222222222222222222222222;
                                            I222222222222222222222222222222222222.c(t0Var222222222222222222222222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar6 = dVar6;
                                            break;
                                        default:
                                            throw t1.a("Unrecognized codec identifier.", null);
                                    }
                                default:
                                    dVar6.u = null;
                                    break;
                            }
                        } else {
                            if (i23 == 19899) {
                                int i42 = dVar6.w;
                                if (i42 != -1) {
                                    long j16 = dVar6.x;
                                    if (j16 != -1) {
                                        if (i42 == 475249515) {
                                            dVar6.z = j16;
                                        }
                                    }
                                }
                                throw t1.a("Mandatory element SeekID or SeekPosition not found", null);
                            }
                            if (i23 == 25152) {
                                dVar6.d(i23);
                                c cVar3 = dVar6.u;
                                if (cVar3.h) {
                                    v vVar = cVar3.j;
                                    if (vVar == null) {
                                        throw t1.a("Encrypted Track found but ContentEncKeyID was not found", null);
                                    }
                                    l3.b bVar3 = new l3.b(h3.h.a, null, "video/webm", vVar.b);
                                    l3.b[] bVarArr = new l3.b[i16];
                                    bVarArr[0] = bVar3;
                                    cVar3.l = new l3.c(null, i16, bVarArr);
                                }
                            } else if (i23 == 28032) {
                                dVar6.d(i23);
                                c cVar4 = dVar6.u;
                                if (cVar4.h && cVar4.i != null) {
                                    throw t1.a("Combining encryption and compression is not supported", null);
                                }
                            } else if (i23 == 357149030) {
                                if (dVar6.r == -9223372036854775807L) {
                                    dVar6.r = 1000000L;
                                }
                                long j17 = dVar6.s;
                                if (j17 != -9223372036854775807L) {
                                    dVar6.t = dVar6.k(j17);
                                }
                            } else if (i23 == 374648427) {
                                if (sparseArray.size() == 0) {
                                    throw t1.a("No valid tracks were found", null);
                                }
                                dVar6.b0.B();
                            } else if (i23 == 475249515) {
                                if (!dVar6.v) {
                                    m mVar3 = dVar6.b0;
                                    w wVar = dVar6.C;
                                    w wVar2 = dVar6.D;
                                    if (dVar6.q == -1 || dVar6.t == -9223372036854775807L || wVar == null || (i15 = wVar.b) == 0 || wVar2 == null || wVar2.b != i15) {
                                        oVar = new o(dVar6.t);
                                    } else {
                                        int[] iArr = new int[i15];
                                        long[] jArr = new long[i15];
                                        long[] jArr2 = new long[i15];
                                        long[] jArr3 = new long[i15];
                                        for (int i43 = 0; i43 < i15; i43++) {
                                            jArr3[i43] = wVar.e(i43);
                                            jArr[i43] = wVar2.e(i43) + dVar6.q;
                                        }
                                        int i44 = 0;
                                        while (true) {
                                            int i45 = i15 - 1;
                                            if (i44 < i45) {
                                                int i46 = i44 + 1;
                                                iArr[i44] = (int) (jArr[i46] - jArr[i44]);
                                                jArr2[i44] = jArr3[i46] - jArr3[i44];
                                                i44 = i46;
                                            } else {
                                                iArr[i45] = (int) ((dVar6.q + dVar6.p) - jArr[i45]);
                                                long j18 = dVar6.t - jArr3[i45];
                                                jArr2[i45] = j18;
                                                if (j18 <= 0) {
                                                    d5.a.K("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j18);
                                                    iArr = Arrays.copyOf(iArr, i45);
                                                    jArr = Arrays.copyOf(jArr, i45);
                                                    jArr2 = Arrays.copyOf(jArr2, i45);
                                                    jArr3 = Arrays.copyOf(jArr3, i45);
                                                }
                                                oVar = new m3.f(iArr, jArr, jArr2, jArr3);
                                            }
                                        }
                                    }
                                    mVar3.y(oVar);
                                    dVar6.v = i16;
                                }
                                dVar6.C = null;
                                dVar6.D = null;
                            }
                        }
                    } else if (dVar6.G == 2) {
                        c cVar5 = (c) sparseArray.get(dVar6.M);
                        cVar5.X.getClass();
                        if (dVar6.R > 0 && "A_OPUS".equals(cVar5.b)) {
                            y yVar3 = dVar6.n;
                            byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(dVar6.R).array();
                            yVar3.getClass();
                            yVar3.A(array.length, array);
                        }
                        int i47 = 0;
                        for (int i48 = 0; i48 < dVar6.K; i48++) {
                            i47 += dVar6.L[i48];
                        }
                        int i49 = 0;
                        while (i49 < dVar6.K) {
                            long j19 = dVar6.H + ((cVar5.e * i49) / MediaDataController.MAX_STYLE_RUNS_COUNT);
                            int i50 = dVar6.O;
                            if (i49 == 0 && !dVar6.Q) {
                                i50 |= 1;
                            }
                            int i51 = dVar6.L[i49];
                            int i52 = i47 - i51;
                            dVar6.e(cVar5, j19, i50, i51, i52);
                            i49++;
                            i47 = i52;
                        }
                        dVar6.G = 0;
                        lVar2 = lVar;
                        z13 = true;
                    }
                    lVar2 = lVar;
                    z13 = true;
                }
            }
            z11 = false;
            if (z13) {
                long j20 = ((h) lVar2).d;
                dVar = this;
                if (dVar.y) {
                    dVar.A = j20;
                    nVar.a = dVar.z;
                    dVar.y = z11;
                    return 1;
                }
                if (dVar.v) {
                    long j21 = dVar.A;
                    if (j21 != -1) {
                        nVar.a = j21;
                        dVar.A = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            } else {
                dVar = this;
            }
            dVar2 = dVar;
            z12 = true;
        }
        d dVar7 = dVar2;
        if (z13) {
            return 0;
        }
        int i53 = 0;
        while (true) {
            SparseArray sparseArray2 = dVar7.c;
            if (i53 >= sparseArray2.size()) {
                return -1;
            }
            c cVar6 = (c) sparseArray2.valueAt(i53);
            cVar6.X.getClass();
            x xVar = cVar6.T;
            if (xVar != null) {
                xVar.a(cVar6.X, cVar6.j);
            }
            i53++;
        }
    }

    @Override // m3.k
    public final void c(m mVar) {
        this.b0 = mVar;
    }

    public final void d(int i9) {
        if (this.u != null) {
            return;
        }
        throw t1.a("Element " + i9 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(c cVar, long j10, int i9, int i10, int i11) {
        byte[] h;
        int i12;
        int i13;
        x xVar = cVar.T;
        if (xVar != null) {
            xVar.b(cVar.X, j10, i9, i10, i11, cVar.j);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.b) || "S_TEXT/ASS".equals(cVar.b) || "S_TEXT/WEBVTT".equals(cVar.b)) {
                if (this.K > 1) {
                    d5.a.K("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.I;
                    if (j11 == -9223372036854775807L) {
                        d5.a.K("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = cVar.b;
                        y yVar = this.k;
                        byte[] bArr = yVar.a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                                h = h(j11, 10000L, "%01d:%02d:%02d:%02d");
                                i12 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                h = h(j11, 1000L, "%02d:%02d:%02d.%03d");
                                i12 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                h = h(j11, 1000L, "%02d:%02d:%02d,%03d");
                                i12 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(h, 0, bArr, i12, h.length);
                        int i14 = yVar.b;
                        while (true) {
                            if (i14 < yVar.c) {
                                if (yVar.a[i14] == 0) {
                                    yVar.B(i14);
                                } else {
                                    i14++;
                                }
                            }
                        }
                        cVar.X.a(yVar.c, yVar);
                        i13 = i10 + yVar.c;
                        if ((i9 & TLObject.FLAG_28) != 0) {
                            int i15 = this.K;
                            y yVar2 = this.n;
                            if (i15 > 1) {
                                yVar2.z(0);
                            } else {
                                int i16 = yVar2.c;
                                cVar.X.d(i16, yVar2);
                                i13 += i16;
                            }
                        }
                        cVar.X.e(j10, i9, i13, i11, cVar.j);
                    }
                }
            }
            i13 = i10;
            if ((i9 & TLObject.FLAG_28) != 0) {
            }
            cVar.X.e(j10, i9, i13, i11, cVar.j);
        }
        this.F = true;
    }

    @Override // m3.k
    public final boolean f(l lVar) {
        w wVar = new w(10, (byte) 0);
        y yVar = (y) wVar.c;
        h hVar = (h) lVar;
        long j10 = hVar.c;
        long j11 = 1024;
        if (j10 != -1 && j10 <= 1024) {
            j11 = j10;
        }
        int i9 = (int) j11;
        hVar.g(yVar.a, 0, 4, false);
        long s10 = yVar.s();
        wVar.b = 4;
        while (true) {
            if (s10 != 440786851) {
                int i10 = wVar.b + 1;
                wVar.b = i10;
                if (i10 == i9) {
                    break;
                }
                hVar.g(yVar.a, 0, 1, false);
                s10 = ((s10 << 8) & (-256)) | (yVar.a[0] & 255);
            } else {
                long g10 = wVar.g(hVar);
                long j12 = wVar.b;
                if (g10 != Long.MIN_VALUE && (j10 == -1 || j12 + g10 < j10)) {
                    while (true) {
                        long j13 = wVar.b;
                        long j14 = j12 + g10;
                        if (j13 < j14) {
                            if (wVar.g(hVar) != Long.MIN_VALUE) {
                                long g11 = wVar.g(hVar);
                                if (g11 < 0 || g11 > 2147483647L) {
                                    break;
                                }
                                if (g11 != 0) {
                                    int i11 = (int) g11;
                                    hVar.a(i11, false);
                                    wVar.b += i11;
                                }
                            } else {
                                break;
                            }
                        } else if (j13 == j14) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // m3.k
    public final void g(long j10, long j11) {
        this.B = -9223372036854775807L;
        this.G = 0;
        b bVar = this.a;
        bVar.e = 0;
        bVar.b.clear();
        e eVar = bVar.c;
        eVar.b = 0;
        eVar.c = 0;
        e eVar2 = this.b;
        eVar2.b = 0;
        eVar2.c = 0;
        j();
        int i9 = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i9 >= sparseArray.size()) {
                return;
            }
            x xVar = ((c) sparseArray.valueAt(i9)).T;
            if (xVar != null) {
                xVar.b = false;
                xVar.c = 0;
            }
            i9++;
        }
    }

    public final void i(l lVar, int i9) {
        y yVar = this.g;
        if (yVar.c >= i9) {
            return;
        }
        byte[] bArr = yVar.a;
        if (bArr.length < i9) {
            yVar.b(Math.max(bArr.length * 2, i9));
        }
        byte[] bArr2 = yVar.a;
        int i10 = yVar.c;
        lVar.readFully(bArr2, i10, i9 - i10);
        yVar.B(i9);
    }

    public final void j() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.a0 = false;
        this.j.z(0);
    }

    public final long k(long j10) {
        long j11 = this.r;
        if (j11 != -9223372036854775807L) {
            return f0.O(j10, j11, 1000L);
        }
        throw t1.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public final int l(l lVar, c cVar, int i9, boolean z10) {
        int b10;
        int b11;
        int i10;
        if ("S_TEXT/UTF8".equals(cVar.b)) {
            m(lVar, c0, i9);
            int i11 = this.T;
            j();
            return i11;
        }
        if ("S_TEXT/ASS".equals(cVar.b)) {
            m(lVar, e0, i9);
            int i12 = this.T;
            j();
            return i12;
        }
        if ("S_TEXT/WEBVTT".equals(cVar.b)) {
            m(lVar, f0, i9);
            int i13 = this.T;
            j();
            return i13;
        }
        m3.w wVar = cVar.X;
        boolean z11 = this.V;
        y yVar = this.j;
        if (!z11) {
            boolean z12 = cVar.h;
            y yVar2 = this.g;
            if (z12) {
                this.O &= -1073741825;
                if (!this.W) {
                    lVar.readFully(yVar2.a, 0, 1);
                    this.S++;
                    byte b12 = yVar2.a[0];
                    if ((b12 & 128) == 128) {
                        throw t1.a("Extension bit is set in signal byte", null);
                    }
                    this.Z = b12;
                    this.W = true;
                }
                byte b13 = this.Z;
                if ((b13 & 1) == 1) {
                    boolean z13 = (b13 & 2) == 2;
                    this.O |= TLObject.FLAG_30;
                    if (!this.a0) {
                        y yVar3 = this.l;
                        lVar.readFully(yVar3.a, 0, 8);
                        this.S += 8;
                        this.a0 = true;
                        yVar2.a[0] = (byte) ((z13 ? 128 : 0) | 8);
                        yVar2.C(0);
                        wVar.d(1, yVar2);
                        this.T++;
                        yVar3.C(0);
                        wVar.d(8, yVar3);
                        this.T += 8;
                    }
                    if (z13) {
                        if (!this.X) {
                            lVar.readFully(yVar2.a, 0, 1);
                            this.S++;
                            yVar2.C(0);
                            this.Y = yVar2.r();
                            this.X = true;
                        }
                        int i14 = this.Y * 4;
                        yVar2.z(i14);
                        lVar.readFully(yVar2.a, 0, i14);
                        this.S += i14;
                        short s10 = (short) ((this.Y / 2) + 1);
                        int i15 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.o;
                        if (byteBuffer == null || byteBuffer.capacity() < i15) {
                            this.o = ByteBuffer.allocate(i15);
                        }
                        this.o.position(0);
                        this.o.putShort(s10);
                        int i16 = 0;
                        int i17 = 0;
                        while (true) {
                            i10 = this.Y;
                            if (i16 >= i10) {
                                break;
                            }
                            int u10 = yVar2.u();
                            if (i16 % 2 == 0) {
                                this.o.putShort((short) (u10 - i17));
                            } else {
                                this.o.putInt(u10 - i17);
                            }
                            i16++;
                            i17 = u10;
                        }
                        int i18 = (i9 - this.S) - i17;
                        if (i10 % 2 == 1) {
                            this.o.putInt(i18);
                        } else {
                            this.o.putShort((short) i18);
                            this.o.putInt(0);
                        }
                        byte[] array = this.o.array();
                        y yVar4 = this.m;
                        yVar4.A(i15, array);
                        wVar.d(i15, yVar4);
                        this.T += i15;
                    }
                }
            } else {
                byte[] bArr = cVar.i;
                if (bArr != null) {
                    yVar.A(bArr.length, bArr);
                }
            }
            if ("A_OPUS".equals(cVar.b) ? z10 : cVar.f > 0) {
                this.O |= TLObject.FLAG_28;
                this.n.z(0);
                int i19 = (yVar.c + i9) - this.S;
                yVar2.z(4);
                byte[] bArr2 = yVar2.a;
                bArr2[0] = (byte) ((i19 >> 24) & 255);
                bArr2[1] = (byte) ((i19 >> 16) & 255);
                bArr2[2] = (byte) ((i19 >> 8) & 255);
                bArr2[3] = (byte) (i19 & 255);
                wVar.d(4, yVar2);
                this.T += 4;
            }
            this.V = true;
        }
        int i20 = i9 + yVar.c;
        if (!"V_MPEG4/ISO/AVC".equals(cVar.b) && !"V_MPEGH/ISO/HEVC".equals(cVar.b)) {
            if (cVar.T != null) {
                d5.a.i(yVar.c == 0);
                cVar.T.c(lVar);
            }
            while (true) {
                int i21 = this.S;
                if (i21 >= i20) {
                    break;
                }
                int i22 = i20 - i21;
                int a2 = yVar.a();
                if (a2 > 0) {
                    b11 = Math.min(i22, a2);
                    wVar.a(b11, yVar);
                } else {
                    b11 = wVar.b(lVar, i22, false);
                }
                this.S += b11;
                this.T += b11;
            }
        } else {
            y yVar5 = this.f;
            byte[] bArr3 = yVar5.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i23 = cVar.Y;
            int i24 = 4 - i23;
            while (this.S < i20) {
                int i25 = this.U;
                if (i25 == 0) {
                    int min = Math.min(i23, yVar.a());
                    lVar.readFully(bArr3, i24 + min, i23 - min);
                    if (min > 0) {
                        yVar.c(i24, min, bArr3);
                    }
                    this.S += i23;
                    yVar5.C(0);
                    this.U = yVar5.u();
                    y yVar6 = this.e;
                    yVar6.C(0);
                    wVar.a(4, yVar6);
                    this.T += 4;
                } else {
                    int a3 = yVar.a();
                    if (a3 > 0) {
                        b10 = Math.min(i25, a3);
                        wVar.a(b10, yVar);
                    } else {
                        b10 = wVar.b(lVar, i25, false);
                    }
                    this.S += b10;
                    this.T += b10;
                    this.U -= b10;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.b)) {
            y yVar7 = this.h;
            yVar7.C(0);
            wVar.a(4, yVar7);
            this.T += 4;
        }
        int i26 = this.T;
        j();
        return i26;
    }

    public final void m(l lVar, byte[] bArr, int i9) {
        int length = bArr.length + i9;
        y yVar = this.k;
        byte[] bArr2 = yVar.a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i9);
            yVar.getClass();
            yVar.A(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        lVar.readFully(yVar.a, bArr.length, i9);
        yVar.C(0);
        yVar.B(length);
    }

    @Override // m3.k
    public final void release() {
    }
}
