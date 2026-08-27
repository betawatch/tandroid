package s3;

import android.util.Pair;
import android.util.SparseArray;
import d5.g0;
import d5.q;
import d5.y;
import d5.z;
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
import m3.w;
import m3.x;
import n2.b0;
import n2.v;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e implements k {
    public static final byte[] c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] d0;
    public static final byte[] e0;
    public static final byte[] f0;
    public static final UUID g0;
    public static final Map h0;
    public long A;
    public long B;
    public v C;
    public v D;
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
    public final f b;
    public m b0;
    public final SparseArray c;
    public final boolean d;
    public final z e;
    public final z f;
    public final z g;
    public final z h;
    public final z i;
    public final z j;
    public final z k;
    public final z l;
    public final z m;
    public final z n;
    public ByteBuffer o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public d u;
    public boolean v;
    public int w;
    public long x;
    public boolean y;
    public long z;

    static {
        int i10 = g0.a;
        d0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(o8.d.c);
        e0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        g0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        c.i(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        c.i(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        h0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    public e(int i10) {
        b bVar = new b();
        this.q = -1L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.a = bVar;
        bVar.d = new b0(this, 21);
        this.d = (i10 & 1) == 0;
        this.b = new f();
        this.c = new SparseArray();
        this.g = new z(4);
        this.h = new z(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new z(4);
        this.e = new z(d5.a.d);
        this.f = new z(4);
        this.j = new z();
        this.k = new z();
        this.l = new z(8);
        this.m = new z();
        this.n = new z();
        this.L = new int[1];
    }

    public static byte[] h(long j10, long j11, String str) {
        d5.a.f(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (i10 * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (i11 * 60000000);
        int i12 = (int) (j13 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11)));
        int i13 = g0.a;
        return format.getBytes(o8.d.c);
    }

    public final void a(int i10) {
        if (this.C == null || this.D == null) {
            throw t1.a("Element " + i10 + " must be in a Cues", null);
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
        int i10;
        boolean z11;
        String str;
        ?? r62;
        int i11;
        int a2;
        e eVar;
        char c10;
        m mVar;
        List singletonList;
        int u10;
        ArrayList arrayList;
        int i12;
        Exception exc;
        Pair pair;
        String str2;
        String str3;
        List list;
        List list2;
        String str4;
        s0 s0Var;
        boolean h;
        int i13;
        int i14;
        e5.b bVar;
        byte[] bArr;
        int i15;
        String str5;
        com.google.android.gms.internal.clearcut.e a3;
        t oVar;
        int i16;
        e eVar2 = this;
        eVar2.F = false;
        boolean z12 = true;
        boolean z13 = true;
        while (z13 && !eVar2.F) {
            b bVar2 = eVar2.a;
            f fVar = bVar2.c;
            ArrayDeque arrayDeque = bVar2.b;
            d5.a.j(bVar2.d);
            int i17 = z12;
            while (true) {
                a aVar = (a) arrayDeque.peek();
                if (aVar == null || ((h) lVar).d < aVar.b) {
                    ?? r22 = 0;
                    if (bVar2.e == 0) {
                        lVar2 = lVar;
                        int i18 = 4;
                        long b10 = fVar.b(lVar2, true, false, 4);
                        if (b10 == -2) {
                            byte[] bArr2 = bVar2.a;
                            ((h) lVar2).f = 0;
                            while (true) {
                                r62 = (h) lVar2;
                                r62.g(bArr2, r22, i18, r22);
                                byte b11 = bArr2[r22];
                                int i19 = 0;
                                while (true) {
                                    if (i19 >= 8) {
                                        i11 = -1;
                                    } else if ((f.d[i19] & b11) != 0) {
                                        i11 = i19 + 1;
                                    } else {
                                        i19++;
                                    }
                                }
                                if (i11 != -1 && i11 <= 4) {
                                    a2 = (int) f.a(i11, false, bArr2);
                                    Object obj = bVar2.d.b;
                                    if (a2 == 357149030 || a2 == 524531317 || a2 == 475249515 || a2 == 374648427) {
                                    }
                                }
                                r62.t(1);
                                r22 = 0;
                                i18 = 4;
                            }
                            r62.t(i11);
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
                        bVar2.g = fVar.b(lVar2, false, z10, 8);
                        bVar2.e = 2;
                    }
                    b0 b0Var = bVar2.d;
                    int i20 = bVar2.f;
                    Object obj2 = b0Var.b;
                    switch (i20) {
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
                            i10 = 2;
                            break;
                        case 134:
                        case 17026:
                        case 21358:
                        case 2274716:
                            i10 = 3;
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
                            i10 = 1;
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
                            i10 = 4;
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
                            i10 = 5;
                            break;
                        default:
                            i10 = 0;
                            break;
                    }
                    if (i10 != 0) {
                        if (i10 == 1) {
                            long j10 = ((h) lVar2).d;
                            arrayDeque.push(new a(i20, bVar2.g + j10));
                            b0 b0Var2 = bVar2.d;
                            int i21 = bVar2.f;
                            long j11 = bVar2.g;
                            e eVar3 = (e) b0Var2.b;
                            d5.a.j(eVar3.b0);
                            if (i21 != 160) {
                                if (i21 == 174) {
                                    d dVar = new d();
                                    dVar.m = -1;
                                    dVar.n = -1;
                                    dVar.o = -1;
                                    dVar.p = -1;
                                    dVar.q = 0;
                                    dVar.r = -1;
                                    dVar.s = 0.0f;
                                    dVar.t = 0.0f;
                                    dVar.u = 0.0f;
                                    dVar.v = null;
                                    dVar.w = -1;
                                    dVar.x = false;
                                    dVar.y = -1;
                                    dVar.z = -1;
                                    dVar.A = -1;
                                    dVar.B = MediaDataController.MAX_STYLE_RUNS_COUNT;
                                    dVar.C = 200;
                                    dVar.D = -1.0f;
                                    dVar.E = -1.0f;
                                    dVar.F = -1.0f;
                                    dVar.G = -1.0f;
                                    dVar.H = -1.0f;
                                    dVar.I = -1.0f;
                                    dVar.J = -1.0f;
                                    dVar.K = -1.0f;
                                    dVar.L = -1.0f;
                                    dVar.M = -1.0f;
                                    dVar.O = 1;
                                    dVar.P = -1;
                                    dVar.Q = 8000;
                                    dVar.R = 0L;
                                    dVar.S = 0L;
                                    dVar.V = true;
                                    dVar.W = "eng";
                                    eVar3.u = dVar;
                                } else if (i21 == 187) {
                                    z11 = false;
                                    eVar3.E = false;
                                } else if (i21 == 19899) {
                                    eVar3.w = -1;
                                    eVar3.x = -1L;
                                } else if (i21 == 20533) {
                                    eVar3.d(i21);
                                    eVar3.u.h = true;
                                } else if (i21 == 21968) {
                                    eVar3.d(i21);
                                    eVar3.u.x = true;
                                } else if (i21 == 408125543) {
                                    long j12 = eVar3.q;
                                    if (j12 != -1 && j12 != j10) {
                                        throw t1.a("Multiple Segment elements not supported", null);
                                    }
                                    eVar3.q = j10;
                                    eVar3.p = j11;
                                } else if (i21 == 475249515) {
                                    eVar3.C = new v(3, (byte) 0);
                                    eVar3.D = new v(3, (byte) 0);
                                } else if (i21 == 524531317 && !eVar3.v) {
                                    if (!eVar3.d || eVar3.z == -1) {
                                        eVar3.b0.n(new o(eVar3.t));
                                        eVar3.v = true;
                                    } else {
                                        eVar3.y = true;
                                    }
                                }
                                z11 = false;
                            } else {
                                z11 = false;
                                eVar3.Q = false;
                                eVar3.R = 0L;
                            }
                            bVar2.e = z11 ? 1 : 0;
                        } else if (i10 == 2) {
                            long j13 = bVar2.g;
                            if (j13 > 8) {
                                throw t1.a("Invalid integer size: " + bVar2.g, null);
                            }
                            b0Var.j(i20, bVar2.a(lVar2, (int) j13));
                            z11 = false;
                            bVar2.e = 0;
                        } else if (i10 == 3) {
                            long j14 = bVar2.g;
                            if (j14 > 2147483647L) {
                                throw t1.a("String element size: " + bVar2.g, null);
                            }
                            int i22 = (int) j14;
                            if (i22 == 0) {
                                str = "";
                            } else {
                                byte[] bArr3 = new byte[i22];
                                ((h) lVar2).d(bArr3, 0, i22, false);
                                while (i22 > 0 && bArr3[i22 - 1] == 0) {
                                    i22--;
                                }
                                str = new String(bArr3, 0, i22);
                            }
                            e eVar4 = (e) b0Var.b;
                            if (i20 == 134) {
                                eVar4.d(i20);
                                eVar4.u.b = str;
                            } else if (i20 != 17026) {
                                if (i20 == 21358) {
                                    eVar4.d(i20);
                                    eVar4.u.a = str;
                                } else if (i20 == 2274716) {
                                    eVar4.d(i20);
                                    eVar4.u.W = str;
                                }
                            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                                throw t1.a("DocType " + str + " not supported", null);
                            }
                            z11 = false;
                            bVar2.e = 0;
                        } else if (i10 == 4) {
                            b0Var.e(i20, (int) bVar2.g, lVar2);
                            z11 = false;
                            bVar2.e = 0;
                        } else {
                            if (i10 != 5) {
                                throw t1.a("Invalid element type " + i10, null);
                            }
                            long j15 = bVar2.g;
                            if (j15 != 4 && j15 != 8) {
                                throw t1.a("Invalid float size: " + bVar2.g, null);
                            }
                            int i23 = (int) j15;
                            double intBitsToFloat = i23 == 4 ? Float.intBitsToFloat((int) r5) : Double.longBitsToDouble(bVar2.a(lVar2, i23));
                            e eVar5 = (e) b0Var.b;
                            if (i20 == 181) {
                                eVar5.d(i20);
                                eVar5.u.Q = (int) intBitsToFloat;
                            } else if (i20 != 17545) {
                                switch (i20) {
                                    case 21969:
                                        eVar5.d(i20);
                                        eVar5.u.D = (float) intBitsToFloat;
                                        break;
                                    case 21970:
                                        eVar5.d(i20);
                                        eVar5.u.E = (float) intBitsToFloat;
                                        break;
                                    case 21971:
                                        eVar5.d(i20);
                                        eVar5.u.F = (float) intBitsToFloat;
                                        break;
                                    case 21972:
                                        eVar5.d(i20);
                                        eVar5.u.G = (float) intBitsToFloat;
                                        break;
                                    case 21973:
                                        eVar5.d(i20);
                                        eVar5.u.H = (float) intBitsToFloat;
                                        break;
                                    case 21974:
                                        eVar5.d(i20);
                                        eVar5.u.I = (float) intBitsToFloat;
                                        break;
                                    case 21975:
                                        eVar5.d(i20);
                                        eVar5.u.J = (float) intBitsToFloat;
                                        break;
                                    case 21976:
                                        eVar5.d(i20);
                                        eVar5.u.K = (float) intBitsToFloat;
                                        break;
                                    case 21977:
                                        eVar5.d(i20);
                                        eVar5.u.L = (float) intBitsToFloat;
                                        break;
                                    case 21978:
                                        eVar5.d(i20);
                                        eVar5.u.M = (float) intBitsToFloat;
                                        break;
                                    default:
                                        switch (i20) {
                                            case 30323:
                                                eVar5.d(i20);
                                                eVar5.u.s = (float) intBitsToFloat;
                                                break;
                                            case 30324:
                                                eVar5.d(i20);
                                                eVar5.u.t = (float) intBitsToFloat;
                                                break;
                                            case 30325:
                                                eVar5.d(i20);
                                                eVar5.u.u = (float) intBitsToFloat;
                                                break;
                                        }
                                }
                            } else {
                                eVar5.s = (long) intBitsToFloat;
                            }
                            z11 = false;
                            bVar2.e = 0;
                        }
                        z13 = true;
                    } else {
                        ((h) lVar2).t((int) bVar2.g);
                        bVar2.e = 0;
                        i17 = 1;
                    }
                } else {
                    b0 b0Var3 = bVar2.d;
                    int i24 = ((a) arrayDeque.pop()).a;
                    e eVar6 = (e) b0Var3.b;
                    SparseArray sparseArray = eVar6.c;
                    d5.a.j(eVar6.b0);
                    if (i24 != 160) {
                        if (i24 == 174) {
                            d dVar2 = eVar6.u;
                            d5.a.j(dVar2);
                            String str6 = dVar2.b;
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
                                    m mVar2 = eVar6.b0;
                                    int i25 = dVar2.c;
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
                                            byte[] bArr4 = dVar2.k;
                                            singletonList = bArr4 == null ? null : Collections.singletonList(bArr4);
                                            str7 = "video/mp4v-es";
                                            list = singletonList;
                                            u10 = -1;
                                            i12 = -1;
                                            str3 = null;
                                            if (dVar2.N != null && (a3 = com.google.android.gms.internal.clearcut.e.a(new z(dVar2.N))) != null) {
                                                str3 = a3.a;
                                                str7 = "video/dolby-vision";
                                            }
                                            int i26 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map = h0;
                                            if (h) {
                                                s0Var.B = dVar2.O;
                                                s0Var.C = dVar2.Q;
                                                s0Var.D = u10;
                                                i13 = 1;
                                            } else if (q.j(str7)) {
                                                if (dVar2.q == 0) {
                                                    int i27 = dVar2.o;
                                                    i14 = -1;
                                                    if (i27 == -1) {
                                                        i27 = dVar2.m;
                                                    }
                                                    dVar2.o = i27;
                                                    int i28 = dVar2.p;
                                                    if (i28 == -1) {
                                                        i28 = dVar2.n;
                                                    }
                                                    dVar2.p = i28;
                                                } else {
                                                    i14 = -1;
                                                }
                                                float f10 = (dVar2.o == i14 || (i15 = dVar2.p) == i14) ? -1.0f : (dVar2.n * r1) / (dVar2.m * i15);
                                                if (dVar2.x) {
                                                    if (dVar2.D == -1.0f || dVar2.E == -1.0f || dVar2.F == -1.0f || dVar2.G == -1.0f || dVar2.H == -1.0f || dVar2.I == -1.0f || dVar2.J == -1.0f || dVar2.K == -1.0f || dVar2.L == -1.0f || dVar2.M == -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = new byte[25];
                                                        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                                        order.put((byte) 0);
                                                        order.putShort((short) ((dVar2.D * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((dVar2.E * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((dVar2.F * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((dVar2.G * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((dVar2.H * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((dVar2.I * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((dVar2.J * 50000.0f) + 0.5f));
                                                        order.putShort((short) ((dVar2.K * 50000.0f) + 0.5f));
                                                        order.putShort((short) (dVar2.L + 0.5f));
                                                        order.putShort((short) (dVar2.M + 0.5f));
                                                        order.putShort((short) dVar2.B);
                                                        order.putShort((short) dVar2.C);
                                                    }
                                                    bVar = new e5.b(dVar2.y, dVar2.A, dVar2.z, bArr);
                                                } else {
                                                    bVar = null;
                                                }
                                                String str8 = dVar2.a;
                                                int intValue = (str8 == null || !map.containsKey(str8)) ? -1 : ((Integer) map.get(dVar2.a)).intValue();
                                                if (dVar2.r == 0 && Float.compare(dVar2.s, 0.0f) == 0 && Float.compare(dVar2.t, 0.0f) == 0) {
                                                    if (Float.compare(dVar2.u, 0.0f) == 0) {
                                                        intValue = 0;
                                                    } else if (Float.compare(dVar2.t, 90.0f) == 0) {
                                                        intValue = 90;
                                                    } else if (Float.compare(dVar2.t, -180.0f) == 0 || Float.compare(dVar2.t, 180.0f) == 0) {
                                                        intValue = 180;
                                                    } else if (Float.compare(dVar2.t, -90.0f) == 0) {
                                                        intValue = 270;
                                                    }
                                                }
                                                s0Var.t = dVar2.m;
                                                s0Var.u = dVar2.n;
                                                s0Var.x = f10;
                                                s0Var.w = intValue;
                                                s0Var.y = dVar2.v;
                                                s0Var.z = dVar2.w;
                                                s0Var.A = bVar;
                                                i13 = 2;
                                            } else {
                                                if (!"application/x-subrip".equals(str7) && !"text/x-ssa".equals(str7) && !"text/vtt".equals(str7) && !"application/vobsub".equals(str7) && !"application/pgs".equals(str7) && !"application/dvbsubs".equals(str7)) {
                                                    throw t1.a("Unexpected MIME type.", null);
                                                }
                                                i13 = 3;
                                            }
                                            str5 = dVar2.a;
                                            if (str5 != null && !map.containsKey(str5)) {
                                                s0Var.b = dVar2.a;
                                            }
                                            s0Var.a = Integer.toString(i25);
                                            s0Var.o = str7;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i26;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var = new t0(s0Var);
                                            w C = mVar.C(dVar2.c, i13);
                                            dVar2.X = C;
                                            C.c(t0Var);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar6 = eVar6;
                                            break;
                                        case 2:
                                            mVar = mVar2;
                                            z zVar = new z(dVar2.a(dVar2.b));
                                            try {
                                                int k10 = zVar.k();
                                                if (k10 != 1) {
                                                    if (k10 == 65534) {
                                                        zVar.C(24);
                                                        long l10 = zVar.l();
                                                        UUID uuid = g0;
                                                        if (l10 == uuid.getMostSignificantBits()) {
                                                            break;
                                                        }
                                                    }
                                                    d5.a.K("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                    str7 = "audio/x-unknown";
                                                    u10 = -1;
                                                    i12 = -1;
                                                    list = null;
                                                    str3 = null;
                                                    if (dVar2.N != null) {
                                                        str3 = a3.a;
                                                        str7 = "video/dolby-vision";
                                                        break;
                                                    }
                                                    int i262 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                                    s0Var = new s0();
                                                    h = q.h(str7);
                                                    Map map2 = h0;
                                                    if (h) {
                                                    }
                                                    str5 = dVar2.a;
                                                    if (str5 != null) {
                                                        s0Var.b = dVar2.a;
                                                        break;
                                                    }
                                                    s0Var.a = Integer.toString(i25);
                                                    s0Var.o = str7;
                                                    s0Var.p = i12;
                                                    s0Var.c = dVar2.W;
                                                    s0Var.d = i262;
                                                    s0Var.q = list;
                                                    s0Var.h = str3;
                                                    s0Var.r = dVar2.l;
                                                    t0 t0Var2 = new t0(s0Var);
                                                    w C2 = mVar.C(dVar2.c, i13);
                                                    dVar2.X = C2;
                                                    C2.c(t0Var2);
                                                    sparseArray.put(dVar2.c, dVar2);
                                                    eVar6 = eVar6;
                                                }
                                                u10 = g0.u(dVar2.P);
                                                if (u10 == 0) {
                                                    d5.a.K("MatroskaExtractor", "Unsupported PCM bit depth: " + dVar2.P + ". Setting mimeType to audio/x-unknown");
                                                    str7 = "audio/x-unknown";
                                                    u10 = -1;
                                                    i12 = -1;
                                                    list = null;
                                                    str3 = null;
                                                    if (dVar2.N != null) {
                                                    }
                                                    int i2622 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                                    s0Var = new s0();
                                                    h = q.h(str7);
                                                    Map map22 = h0;
                                                    if (h) {
                                                    }
                                                    str5 = dVar2.a;
                                                    if (str5 != null) {
                                                    }
                                                    s0Var.a = Integer.toString(i25);
                                                    s0Var.o = str7;
                                                    s0Var.p = i12;
                                                    s0Var.c = dVar2.W;
                                                    s0Var.d = i2622;
                                                    s0Var.q = list;
                                                    s0Var.h = str3;
                                                    s0Var.r = dVar2.l;
                                                    t0 t0Var22 = new t0(s0Var);
                                                    w C22 = mVar.C(dVar2.c, i13);
                                                    dVar2.X = C22;
                                                    C22.c(t0Var22);
                                                    sparseArray.put(dVar2.c, dVar2);
                                                    eVar6 = eVar6;
                                                }
                                                str7 = "audio/raw";
                                                i12 = -1;
                                                list = null;
                                                str3 = null;
                                                if (dVar2.N != null) {
                                                }
                                                int i26222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                                s0Var = new s0();
                                                h = q.h(str7);
                                                Map map222 = h0;
                                                if (h) {
                                                }
                                                str5 = dVar2.a;
                                                if (str5 != null) {
                                                }
                                                s0Var.a = Integer.toString(i25);
                                                s0Var.o = str7;
                                                s0Var.p = i12;
                                                s0Var.c = dVar2.W;
                                                s0Var.d = i26222;
                                                s0Var.q = list;
                                                s0Var.h = str3;
                                                s0Var.r = dVar2.l;
                                                t0 t0Var222 = new t0(s0Var);
                                                w C222 = mVar.C(dVar2.c, i13);
                                                dVar2.X = C222;
                                                C222.c(t0Var222);
                                                sparseArray.put(dVar2.c, dVar2);
                                                eVar6 = eVar6;
                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                throw t1.a("Error parsing MS/ACM codec private", null);
                                            }
                                            break;
                                        case 3:
                                            mVar = mVar2;
                                            dVar2.T = new x();
                                            str7 = "audio/true-hd";
                                            u10 = -1;
                                            i12 = -1;
                                            list = null;
                                            str3 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i262222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map2222 = h0;
                                            if (h) {
                                            }
                                            str5 = dVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i25);
                                            s0Var.o = str7;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i262222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var2222 = new t0(s0Var);
                                            w C2222 = mVar.C(dVar2.c, i13);
                                            dVar2.X = C2222;
                                            C2222.c(t0Var2222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar6 = eVar6;
                                            break;
                                        case 4:
                                            mVar = mVar2;
                                            byte[] a10 = dVar2.a(str6);
                                            try {
                                            } catch (ArrayIndexOutOfBoundsException unused2) {
                                                a10 = 0;
                                            }
                                            try {
                                                if (a10[0] != 2) {
                                                    throw t1.a("Error parsing vorbis codec private", null);
                                                }
                                                int i29 = 0;
                                                int i30 = 1;
                                                while (true) {
                                                    int i31 = a10[i30] & 255;
                                                    if (i31 == 255) {
                                                        i29 += 255;
                                                        i30++;
                                                    } else {
                                                        int i32 = i30 + 1;
                                                        int i33 = i29 + i31;
                                                        int i34 = 0;
                                                        while (true) {
                                                            int i35 = a10[i32] & 255;
                                                            if (i35 == 255) {
                                                                i34 += 255;
                                                                i32++;
                                                            } else {
                                                                int i36 = i32 + 1;
                                                                int i37 = i34 + i35;
                                                                if (a10[i36] != 1) {
                                                                    throw t1.a("Error parsing vorbis codec private", null);
                                                                }
                                                                byte[] bArr5 = new byte[i33];
                                                                System.arraycopy(a10, i36, bArr5, 0, i33);
                                                                int i38 = i36 + i33;
                                                                if (a10[i38] != 3) {
                                                                    throw t1.a("Error parsing vorbis codec private", null);
                                                                }
                                                                int i39 = i38 + i37;
                                                                if (a10[i39] != 5) {
                                                                    throw t1.a("Error parsing vorbis codec private", null);
                                                                }
                                                                byte[] bArr6 = new byte[a10.length - i39];
                                                                System.arraycopy(a10, i39, bArr6, 0, a10.length - i39);
                                                                arrayList = new ArrayList(2);
                                                                arrayList.add(bArr5);
                                                                arrayList.add(bArr6);
                                                                str7 = "audio/vorbis";
                                                                i12 = 8192;
                                                                list = arrayList;
                                                                u10 = -1;
                                                                str3 = null;
                                                                if (dVar2.N != null) {
                                                                }
                                                                int i2622222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                                                s0Var = new s0();
                                                                h = q.h(str7);
                                                                Map map22222 = h0;
                                                                if (h) {
                                                                }
                                                                str5 = dVar2.a;
                                                                if (str5 != null) {
                                                                }
                                                                s0Var.a = Integer.toString(i25);
                                                                s0Var.o = str7;
                                                                s0Var.p = i12;
                                                                s0Var.c = dVar2.W;
                                                                s0Var.d = i2622222;
                                                                s0Var.q = list;
                                                                s0Var.h = str3;
                                                                s0Var.r = dVar2.l;
                                                                t0 t0Var22222 = new t0(s0Var);
                                                                w C22222 = mVar.C(dVar2.c, i13);
                                                                dVar2.X = C22222;
                                                                C22222.c(t0Var22222);
                                                                sparseArray.put(dVar2.c, dVar2);
                                                                eVar6 = eVar6;
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
                                            i12 = 4096;
                                            list = null;
                                            str3 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i26222222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map222222 = h0;
                                            if (h) {
                                            }
                                            str5 = dVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i25);
                                            s0Var.o = str7;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i26222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var222222 = new t0(s0Var);
                                            w C222222 = mVar.C(dVar2.c, i13);
                                            dVar2.X = C222222;
                                            C222222.c(t0Var222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar6 = eVar6;
                                            break;
                                        case 6:
                                            mVar = mVar2;
                                            str7 = "audio/mpeg";
                                            u10 = -1;
                                            i12 = 4096;
                                            list = null;
                                            str3 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i262222222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map2222222 = h0;
                                            if (h) {
                                            }
                                            str5 = dVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i25);
                                            s0Var.o = str7;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i262222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var2222222 = new t0(s0Var);
                                            w C2222222 = mVar.C(dVar2.c, i13);
                                            dVar2.X = C2222222;
                                            C2222222.c(t0Var2222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar6 = eVar6;
                                            break;
                                        case 7:
                                            mVar = mVar2;
                                            z zVar2 = new z(dVar2.a(dVar2.b));
                                            try {
                                                zVar2.D(16);
                                                long i40 = zVar2.i();
                                                if (i40 == 1482049860) {
                                                    exc = null;
                                                    try {
                                                        pair = new Pair("video/divx", null);
                                                    } catch (ArrayIndexOutOfBoundsException unused4) {
                                                        throw t1.a("Error parsing FourCC private data", exc);
                                                    }
                                                } else if (i40 == 859189832) {
                                                    pair = new Pair("video/3gpp", null);
                                                } else {
                                                    if (i40 == 826496599) {
                                                        byte[] bArr7 = zVar2.a;
                                                        for (int i41 = zVar2.b + 20; i41 < bArr7.length - 4; i41++) {
                                                            if (bArr7[i41] == 0 && bArr7[i41 + 1] == 0 && bArr7[i41 + 2] == 1) {
                                                                if (bArr7[i41 + 3] == 15) {
                                                                    pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr7, i41, bArr7.length)));
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
                                                    i12 = -1;
                                                    if (dVar2.N != null) {
                                                    }
                                                    int i2622222222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                                    s0Var = new s0();
                                                    h = q.h(str7);
                                                    Map map22222222 = h0;
                                                    if (h) {
                                                    }
                                                    str5 = dVar2.a;
                                                    if (str5 != null) {
                                                    }
                                                    s0Var.a = Integer.toString(i25);
                                                    s0Var.o = str7;
                                                    s0Var.p = i12;
                                                    s0Var.c = dVar2.W;
                                                    s0Var.d = i2622222222;
                                                    s0Var.q = list;
                                                    s0Var.h = str3;
                                                    s0Var.r = dVar2.l;
                                                    t0 t0Var22222222 = new t0(s0Var);
                                                    w C22222222 = mVar.C(dVar2.c, i13);
                                                    dVar2.X = C22222222;
                                                    C22222222.c(t0Var22222222);
                                                    sparseArray.put(dVar2.c, dVar2);
                                                    eVar6 = eVar6;
                                                }
                                                str2 = null;
                                                str7 = (String) pair.first;
                                                str3 = str2;
                                                list = (List) pair.second;
                                                u10 = -1;
                                                i12 = -1;
                                                if (dVar2.N != null) {
                                                }
                                                int i26222222222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                                s0Var = new s0();
                                                h = q.h(str7);
                                                Map map222222222 = h0;
                                                if (h) {
                                                }
                                                str5 = dVar2.a;
                                                if (str5 != null) {
                                                }
                                                s0Var.a = Integer.toString(i25);
                                                s0Var.o = str7;
                                                s0Var.p = i12;
                                                s0Var.c = dVar2.W;
                                                s0Var.d = i26222222222;
                                                s0Var.q = list;
                                                s0Var.h = str3;
                                                s0Var.r = dVar2.l;
                                                t0 t0Var222222222 = new t0(s0Var);
                                                w C222222222 = mVar.C(dVar2.c, i13);
                                                dVar2.X = C222222222;
                                                C222222222.c(t0Var222222222);
                                                sparseArray.put(dVar2.c, dVar2);
                                                eVar6 = eVar6;
                                            } catch (ArrayIndexOutOfBoundsException unused6) {
                                                exc = null;
                                            }
                                            break;
                                        case '\b':
                                            mVar = mVar2;
                                            byte[] bArr8 = new byte[4];
                                            System.arraycopy(dVar2.a(str6), 0, bArr8, 0, 4);
                                            list = p8.z.y(bArr8);
                                            str7 = "application/dvbsubs";
                                            u10 = -1;
                                            i12 = -1;
                                            str3 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i262222222222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map2222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = dVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i25);
                                            s0Var.o = str7;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i262222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var2222222222 = new t0(s0Var);
                                            w C2222222222 = mVar.C(dVar2.c, i13);
                                            dVar2.X = C2222222222;
                                            C2222222222.c(t0Var2222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar6 = eVar6;
                                            break;
                                        case '\n':
                                            mVar = mVar2;
                                            e5.a a11 = e5.a.a(new z(dVar2.a(dVar2.b)));
                                            list2 = a11.a;
                                            dVar2.Y = a11.b;
                                            str4 = a11.f;
                                            str7 = MediaController.VIDEO_MIME_TYPE;
                                            str3 = str4;
                                            list = list2;
                                            u10 = -1;
                                            i12 = -1;
                                            if (dVar2.N != null) {
                                            }
                                            int i2622222222222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map22222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = dVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i25);
                                            s0Var.o = str7;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i2622222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var22222222222 = new t0(s0Var);
                                            w C22222222222 = mVar.C(dVar2.c, i13);
                                            dVar2.X = C22222222222;
                                            C22222222222.c(t0Var22222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar6 = eVar6;
                                            break;
                                        case 11:
                                            mVar = mVar2;
                                            list = p8.z.y(dVar2.a(str6));
                                            str7 = "application/vobsub";
                                            u10 = -1;
                                            i12 = -1;
                                            str3 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i26222222222222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = dVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i25);
                                            s0Var.o = str7;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i26222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var222222222222 = new t0(s0Var);
                                            w C222222222222 = mVar.C(dVar2.c, i13);
                                            dVar2.X = C222222222222;
                                            C222222222222.c(t0Var222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar6 = eVar6;
                                            break;
                                        case '\f':
                                            mVar = mVar2;
                                            str7 = "audio/vnd.dts.hd";
                                            u10 = -1;
                                            i12 = -1;
                                            list = null;
                                            str3 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i262222222222222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map2222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = dVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i25);
                                            s0Var.o = str7;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i262222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var2222222222222 = new t0(s0Var);
                                            w C2222222222222 = mVar.C(dVar2.c, i13);
                                            dVar2.X = C2222222222222;
                                            C2222222222222.c(t0Var2222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar6 = eVar6;
                                            break;
                                        case '\r':
                                            mVar = mVar2;
                                            List singletonList2 = Collections.singletonList(dVar2.a(str6));
                                            byte[] bArr9 = dVar2.k;
                                            j3.a h10 = j3.b.h(new y(bArr9, bArr9.length), false);
                                            dVar2.Q = h10.a;
                                            dVar2.O = h10.b;
                                            String str9 = h10.c;
                                            str7 = MediaController.AUDIO_MIME_TYPE;
                                            list = singletonList2;
                                            str3 = str9;
                                            u10 = -1;
                                            i12 = -1;
                                            if (dVar2.N != null) {
                                            }
                                            int i2622222222222222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map22222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = dVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i25);
                                            s0Var.o = str7;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i2622222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var22222222222222 = new t0(s0Var);
                                            w C22222222222222 = mVar.C(dVar2.c, i13);
                                            dVar2.X = C22222222222222;
                                            C22222222222222.c(t0Var22222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar6 = eVar6;
                                            break;
                                        case 14:
                                            mVar = mVar2;
                                            str7 = "audio/ac3";
                                            u10 = -1;
                                            i12 = -1;
                                            list = null;
                                            str3 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i26222222222222222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = dVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i25);
                                            s0Var.o = str7;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i26222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var222222222222222 = new t0(s0Var);
                                            w C222222222222222 = mVar.C(dVar2.c, i13);
                                            dVar2.X = C222222222222222;
                                            C222222222222222.c(t0Var222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar6 = eVar6;
                                            break;
                                        case 15:
                                        case 21:
                                            mVar = mVar2;
                                            str7 = "audio/vnd.dts";
                                            u10 = -1;
                                            i12 = -1;
                                            list = null;
                                            str3 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i262222222222222222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map2222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = dVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i25);
                                            s0Var.o = str7;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i262222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var2222222222222222 = new t0(s0Var);
                                            w C2222222222222222 = mVar.C(dVar2.c, i13);
                                            dVar2.X = C2222222222222222;
                                            C2222222222222222.c(t0Var2222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar6 = eVar6;
                                            break;
                                        case 16:
                                            mVar = mVar2;
                                            str7 = "video/av01";
                                            u10 = -1;
                                            i12 = -1;
                                            list = null;
                                            str3 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i2622222222222222222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map22222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = dVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i25);
                                            s0Var.o = str7;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i2622222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var22222222222222222 = new t0(s0Var);
                                            w C22222222222222222 = mVar.C(dVar2.c, i13);
                                            dVar2.X = C22222222222222222;
                                            C22222222222222222.c(t0Var22222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar6 = eVar6;
                                            break;
                                        case 17:
                                            mVar = mVar2;
                                            str7 = "video/x-vnd.on2.vp8";
                                            u10 = -1;
                                            i12 = -1;
                                            list = null;
                                            str3 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i26222222222222222222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map222222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = dVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i25);
                                            s0Var.o = str7;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i26222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var222222222222222222 = new t0(s0Var);
                                            w C222222222222222222 = mVar.C(dVar2.c, i13);
                                            dVar2.X = C222222222222222222;
                                            C222222222222222222.c(t0Var222222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar6 = eVar6;
                                            break;
                                        case 18:
                                            mVar = mVar2;
                                            str7 = "video/x-vnd.on2.vp9";
                                            u10 = -1;
                                            i12 = -1;
                                            list = null;
                                            str3 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i262222222222222222222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map2222222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = dVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i25);
                                            s0Var.o = str7;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i262222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var2222222222222222222 = new t0(s0Var);
                                            w C2222222222222222222 = mVar.C(dVar2.c, i13);
                                            dVar2.X = C2222222222222222222;
                                            C2222222222222222222.c(t0Var2222222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar6 = eVar6;
                                            break;
                                        case 19:
                                            mVar = mVar2;
                                            str7 = "application/pgs";
                                            u10 = -1;
                                            i12 = -1;
                                            list = null;
                                            str3 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i2622222222222222222222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map22222222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = dVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i25);
                                            s0Var.o = str7;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i2622222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var22222222222222222222 = new t0(s0Var);
                                            w C22222222222222222222 = mVar.C(dVar2.c, i13);
                                            dVar2.X = C22222222222222222222;
                                            C22222222222222222222.c(t0Var22222222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar6 = eVar6;
                                            break;
                                        case 20:
                                            mVar = mVar2;
                                            u10 = -1;
                                            i12 = -1;
                                            list = null;
                                            str3 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i26222222222222222222222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map222222222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = dVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i25);
                                            s0Var.o = str7;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i26222222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var222222222222222222222 = new t0(s0Var);
                                            w C222222222222222222222 = mVar.C(dVar2.c, i13);
                                            dVar2.X = C222222222222222222222;
                                            C222222222222222222222.c(t0Var222222222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar6 = eVar6;
                                            break;
                                        case 22:
                                            mVar = mVar2;
                                            if (dVar2.P == 32) {
                                                str7 = "audio/raw";
                                                u10 = 4;
                                                i12 = -1;
                                                list = null;
                                                str3 = null;
                                                if (dVar2.N != null) {
                                                }
                                                int i262222222222222222222222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                                s0Var = new s0();
                                                h = q.h(str7);
                                                Map map2222222222222222222222 = h0;
                                                if (h) {
                                                }
                                                str5 = dVar2.a;
                                                if (str5 != null) {
                                                }
                                                s0Var.a = Integer.toString(i25);
                                                s0Var.o = str7;
                                                s0Var.p = i12;
                                                s0Var.c = dVar2.W;
                                                s0Var.d = i262222222222222222222222;
                                                s0Var.q = list;
                                                s0Var.h = str3;
                                                s0Var.r = dVar2.l;
                                                t0 t0Var2222222222222222222222 = new t0(s0Var);
                                                w C2222222222222222222222 = mVar.C(dVar2.c, i13);
                                                dVar2.X = C2222222222222222222222;
                                                C2222222222222222222222.c(t0Var2222222222222222222222);
                                                sparseArray.put(dVar2.c, dVar2);
                                                eVar6 = eVar6;
                                            } else {
                                                d5.a.K("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + dVar2.P + ". Setting mimeType to audio/x-unknown");
                                                str7 = "audio/x-unknown";
                                                u10 = -1;
                                                i12 = -1;
                                                list = null;
                                                str3 = null;
                                                if (dVar2.N != null) {
                                                }
                                                int i2622222222222222222222222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                                s0Var = new s0();
                                                h = q.h(str7);
                                                Map map22222222222222222222222 = h0;
                                                if (h) {
                                                }
                                                str5 = dVar2.a;
                                                if (str5 != null) {
                                                }
                                                s0Var.a = Integer.toString(i25);
                                                s0Var.o = str7;
                                                s0Var.p = i12;
                                                s0Var.c = dVar2.W;
                                                s0Var.d = i2622222222222222222222222;
                                                s0Var.q = list;
                                                s0Var.h = str3;
                                                s0Var.r = dVar2.l;
                                                t0 t0Var22222222222222222222222 = new t0(s0Var);
                                                w C22222222222222222222222 = mVar.C(dVar2.c, i13);
                                                dVar2.X = C22222222222222222222222;
                                                C22222222222222222222222.c(t0Var22222222222222222222222);
                                                sparseArray.put(dVar2.c, dVar2);
                                                eVar6 = eVar6;
                                            }
                                            break;
                                        case 23:
                                            mVar = mVar2;
                                            int i42 = dVar2.P;
                                            if (i42 == 8) {
                                                str7 = "audio/raw";
                                                u10 = 3;
                                                i12 = -1;
                                                list = null;
                                                str3 = null;
                                                if (dVar2.N != null) {
                                                }
                                                int i26222222222222222222222222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                                s0Var = new s0();
                                                h = q.h(str7);
                                                Map map222222222222222222222222 = h0;
                                                if (h) {
                                                }
                                                str5 = dVar2.a;
                                                if (str5 != null) {
                                                }
                                                s0Var.a = Integer.toString(i25);
                                                s0Var.o = str7;
                                                s0Var.p = i12;
                                                s0Var.c = dVar2.W;
                                                s0Var.d = i26222222222222222222222222;
                                                s0Var.q = list;
                                                s0Var.h = str3;
                                                s0Var.r = dVar2.l;
                                                t0 t0Var222222222222222222222222 = new t0(s0Var);
                                                w C222222222222222222222222 = mVar.C(dVar2.c, i13);
                                                dVar2.X = C222222222222222222222222;
                                                C222222222222222222222222.c(t0Var222222222222222222222222);
                                                sparseArray.put(dVar2.c, dVar2);
                                                eVar6 = eVar6;
                                            } else if (i42 == 16) {
                                                u10 = TLObject.FLAG_28;
                                                str7 = "audio/raw";
                                                i12 = -1;
                                                list = null;
                                                str3 = null;
                                                if (dVar2.N != null) {
                                                }
                                                int i262222222222222222222222222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                                s0Var = new s0();
                                                h = q.h(str7);
                                                Map map2222222222222222222222222 = h0;
                                                if (h) {
                                                }
                                                str5 = dVar2.a;
                                                if (str5 != null) {
                                                }
                                                s0Var.a = Integer.toString(i25);
                                                s0Var.o = str7;
                                                s0Var.p = i12;
                                                s0Var.c = dVar2.W;
                                                s0Var.d = i262222222222222222222222222;
                                                s0Var.q = list;
                                                s0Var.h = str3;
                                                s0Var.r = dVar2.l;
                                                t0 t0Var2222222222222222222222222 = new t0(s0Var);
                                                w C2222222222222222222222222 = mVar.C(dVar2.c, i13);
                                                dVar2.X = C2222222222222222222222222;
                                                C2222222222222222222222222.c(t0Var2222222222222222222222222);
                                                sparseArray.put(dVar2.c, dVar2);
                                                eVar6 = eVar6;
                                            } else {
                                                d5.a.K("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + dVar2.P + ". Setting mimeType to audio/x-unknown");
                                                str7 = "audio/x-unknown";
                                                u10 = -1;
                                                i12 = -1;
                                                list = null;
                                                str3 = null;
                                                if (dVar2.N != null) {
                                                }
                                                int i2622222222222222222222222222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                                s0Var = new s0();
                                                h = q.h(str7);
                                                Map map22222222222222222222222222 = h0;
                                                if (h) {
                                                }
                                                str5 = dVar2.a;
                                                if (str5 != null) {
                                                }
                                                s0Var.a = Integer.toString(i25);
                                                s0Var.o = str7;
                                                s0Var.p = i12;
                                                s0Var.c = dVar2.W;
                                                s0Var.d = i2622222222222222222222222222;
                                                s0Var.q = list;
                                                s0Var.h = str3;
                                                s0Var.r = dVar2.l;
                                                t0 t0Var22222222222222222222222222 = new t0(s0Var);
                                                w C22222222222222222222222222 = mVar.C(dVar2.c, i13);
                                                dVar2.X = C22222222222222222222222222;
                                                C22222222222222222222222222.c(t0Var22222222222222222222222222);
                                                sparseArray.put(dVar2.c, dVar2);
                                                eVar6 = eVar6;
                                            }
                                            break;
                                        case 24:
                                            mVar = mVar2;
                                            u10 = g0.u(dVar2.P);
                                            if (u10 == 0) {
                                                d5.a.K("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + dVar2.P + ". Setting mimeType to audio/x-unknown");
                                                str7 = "audio/x-unknown";
                                                u10 = -1;
                                                i12 = -1;
                                                list = null;
                                                str3 = null;
                                                if (dVar2.N != null) {
                                                }
                                                int i26222222222222222222222222222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                                s0Var = new s0();
                                                h = q.h(str7);
                                                Map map222222222222222222222222222 = h0;
                                                if (h) {
                                                }
                                                str5 = dVar2.a;
                                                if (str5 != null) {
                                                }
                                                s0Var.a = Integer.toString(i25);
                                                s0Var.o = str7;
                                                s0Var.p = i12;
                                                s0Var.c = dVar2.W;
                                                s0Var.d = i26222222222222222222222222222;
                                                s0Var.q = list;
                                                s0Var.h = str3;
                                                s0Var.r = dVar2.l;
                                                t0 t0Var222222222222222222222222222 = new t0(s0Var);
                                                w C222222222222222222222222222 = mVar.C(dVar2.c, i13);
                                                dVar2.X = C222222222222222222222222222;
                                                C222222222222222222222222222.c(t0Var222222222222222222222222222);
                                                sparseArray.put(dVar2.c, dVar2);
                                                eVar6 = eVar6;
                                            }
                                            str7 = "audio/raw";
                                            i12 = -1;
                                            list = null;
                                            str3 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i262222222222222222222222222222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map2222222222222222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = dVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i25);
                                            s0Var.o = str7;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i262222222222222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var2222222222222222222222222222 = new t0(s0Var);
                                            w C2222222222222222222222222222 = mVar.C(dVar2.c, i13);
                                            dVar2.X = C2222222222222222222222222222;
                                            C2222222222222222222222222222.c(t0Var2222222222222222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar6 = eVar6;
                                            break;
                                        case 25:
                                            mVar = mVar2;
                                            list = p8.z.t(d0, dVar2.a(str6));
                                            str7 = "text/x-ssa";
                                            u10 = -1;
                                            i12 = -1;
                                            str3 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i2622222222222222222222222222222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map22222222222222222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = dVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i25);
                                            s0Var.o = str7;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i2622222222222222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var22222222222222222222222222222 = new t0(s0Var);
                                            w C22222222222222222222222222222 = mVar.C(dVar2.c, i13);
                                            dVar2.X = C22222222222222222222222222222;
                                            C22222222222222222222222222222.c(t0Var22222222222222222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar6 = eVar6;
                                            break;
                                        case 26:
                                            mVar = mVar2;
                                            e5.e a12 = e5.e.a(new z(dVar2.a(dVar2.b)));
                                            list2 = a12.a;
                                            dVar2.Y = a12.b;
                                            str4 = a12.d;
                                            str7 = "video/hevc";
                                            str3 = str4;
                                            list = list2;
                                            u10 = -1;
                                            i12 = -1;
                                            if (dVar2.N != null) {
                                            }
                                            int i26222222222222222222222222222222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map222222222222222222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = dVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i25);
                                            s0Var.o = str7;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i26222222222222222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var222222222222222222222222222222 = new t0(s0Var);
                                            w C222222222222222222222222222222 = mVar.C(dVar2.c, i13);
                                            dVar2.X = C222222222222222222222222222222;
                                            C222222222222222222222222222222.c(t0Var222222222222222222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar6 = eVar6;
                                            break;
                                        case 27:
                                            mVar = mVar2;
                                            str7 = "text/vtt";
                                            u10 = -1;
                                            i12 = -1;
                                            list = null;
                                            str3 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i262222222222222222222222222222222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map2222222222222222222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = dVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i25);
                                            s0Var.o = str7;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i262222222222222222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var2222222222222222222222222222222 = new t0(s0Var);
                                            w C2222222222222222222222222222222 = mVar.C(dVar2.c, i13);
                                            dVar2.X = C2222222222222222222222222222222;
                                            C2222222222222222222222222222222.c(t0Var2222222222222222222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar6 = eVar6;
                                            break;
                                        case 28:
                                            mVar = mVar2;
                                            str7 = "application/x-subrip";
                                            u10 = -1;
                                            i12 = -1;
                                            list = null;
                                            str3 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i2622222222222222222222222222222222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map22222222222222222222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = dVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i25);
                                            s0Var.o = str7;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i2622222222222222222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var22222222222222222222222222222222 = new t0(s0Var);
                                            w C22222222222222222222222222222222 = mVar.C(dVar2.c, i13);
                                            dVar2.X = C22222222222222222222222222222222;
                                            C22222222222222222222222222222222.c(t0Var22222222222222222222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar6 = eVar6;
                                            break;
                                        case 29:
                                            mVar = mVar2;
                                            str7 = "video/mpeg2";
                                            u10 = -1;
                                            i12 = -1;
                                            list = null;
                                            str3 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i26222222222222222222222222222222222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map222222222222222222222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = dVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i25);
                                            s0Var.o = str7;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i26222222222222222222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var222222222222222222222222222222222 = new t0(s0Var);
                                            w C222222222222222222222222222222222 = mVar.C(dVar2.c, i13);
                                            dVar2.X = C222222222222222222222222222222222;
                                            C222222222222222222222222222222222.c(t0Var222222222222222222222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar6 = eVar6;
                                            break;
                                        case MessageObject.TYPE_GIFT_STARS /* 30 */:
                                            mVar = mVar2;
                                            str7 = "audio/eac3";
                                            u10 = -1;
                                            i12 = -1;
                                            list = null;
                                            str3 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i262222222222222222222222222222222222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map2222222222222222222222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = dVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i25);
                                            s0Var.o = str7;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i262222222222222222222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var2222222222222222222222222222222222 = new t0(s0Var);
                                            w C2222222222222222222222222222222222 = mVar.C(dVar2.c, i13);
                                            dVar2.X = C2222222222222222222222222222222222;
                                            C2222222222222222222222222222222222.c(t0Var2222222222222222222222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar6 = eVar6;
                                            break;
                                        case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                                            mVar = mVar2;
                                            singletonList = Collections.singletonList(dVar2.a(str6));
                                            str7 = "audio/flac";
                                            list = singletonList;
                                            u10 = -1;
                                            i12 = -1;
                                            str3 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i2622222222222222222222222222222222222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map22222222222222222222222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = dVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i25);
                                            s0Var.o = str7;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i2622222222222222222222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var22222222222222222222222222222222222 = new t0(s0Var);
                                            w C22222222222222222222222222222222222 = mVar.C(dVar2.c, i13);
                                            dVar2.X = C22222222222222222222222222222222222;
                                            C22222222222222222222222222222222222.c(t0Var22222222222222222222222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar6 = eVar6;
                                            break;
                                        case ' ':
                                            arrayList = new ArrayList(3);
                                            arrayList.add(dVar2.a(dVar2.b));
                                            ByteBuffer allocate = ByteBuffer.allocate(8);
                                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                            mVar = mVar2;
                                            arrayList.add(allocate.order(byteOrder).putLong(dVar2.R).array());
                                            arrayList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(dVar2.S).array());
                                            str7 = "audio/opus";
                                            i12 = 5760;
                                            list = arrayList;
                                            u10 = -1;
                                            str3 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i26222222222222222222222222222222222222 = (dVar2.V ? 1 : 0) | (dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = q.h(str7);
                                            Map map222222222222222222222222222222222222 = h0;
                                            if (h) {
                                            }
                                            str5 = dVar2.a;
                                            if (str5 != null) {
                                            }
                                            s0Var.a = Integer.toString(i25);
                                            s0Var.o = str7;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i26222222222222222222222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str3;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var222222222222222222222222222222222222 = new t0(s0Var);
                                            w C222222222222222222222222222222222222 = mVar.C(dVar2.c, i13);
                                            dVar2.X = C222222222222222222222222222222222222;
                                            C222222222222222222222222222222222222.c(t0Var222222222222222222222222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar6 = eVar6;
                                            break;
                                        default:
                                            throw t1.a("Unrecognized codec identifier.", null);
                                    }
                                default:
                                    eVar6.u = null;
                                    break;
                            }
                        } else {
                            if (i24 == 19899) {
                                int i43 = eVar6.w;
                                if (i43 != -1) {
                                    long j16 = eVar6.x;
                                    if (j16 != -1) {
                                        if (i43 == 475249515) {
                                            eVar6.z = j16;
                                        }
                                    }
                                }
                                throw t1.a("Mandatory element SeekID or SeekPosition not found", null);
                            }
                            if (i24 == 25152) {
                                eVar6.d(i24);
                                d dVar3 = eVar6.u;
                                if (dVar3.h) {
                                    m3.v vVar = dVar3.j;
                                    if (vVar == null) {
                                        throw t1.a("Encrypted Track found but ContentEncKeyID was not found", null);
                                    }
                                    l3.c cVar = new l3.c(h3.h.a, null, "video/webm", vVar.b);
                                    l3.c[] cVarArr = new l3.c[i17];
                                    cVarArr[0] = cVar;
                                    dVar3.l = new l3.d(null, i17, cVarArr);
                                }
                            } else if (i24 == 28032) {
                                eVar6.d(i24);
                                d dVar4 = eVar6.u;
                                if (dVar4.h && dVar4.i != null) {
                                    throw t1.a("Combining encryption and compression is not supported", null);
                                }
                            } else if (i24 == 357149030) {
                                if (eVar6.r == -9223372036854775807L) {
                                    eVar6.r = 1000000L;
                                }
                                long j17 = eVar6.s;
                                if (j17 != -9223372036854775807L) {
                                    eVar6.t = eVar6.k(j17);
                                }
                            } else if (i24 == 374648427) {
                                if (sparseArray.size() == 0) {
                                    throw t1.a("No valid tracks were found", null);
                                }
                                eVar6.b0.A();
                            } else if (i24 == 475249515) {
                                if (!eVar6.v) {
                                    m mVar3 = eVar6.b0;
                                    v vVar2 = eVar6.C;
                                    v vVar3 = eVar6.D;
                                    if (eVar6.q == -1 || eVar6.t == -9223372036854775807L || vVar2 == null || (i16 = vVar2.b) == 0 || vVar3 == null || vVar3.b != i16) {
                                        oVar = new o(eVar6.t);
                                    } else {
                                        int[] iArr = new int[i16];
                                        long[] jArr = new long[i16];
                                        long[] jArr2 = new long[i16];
                                        long[] jArr3 = new long[i16];
                                        for (int i44 = 0; i44 < i16; i44++) {
                                            jArr3[i44] = vVar2.f(i44);
                                            jArr[i44] = vVar3.f(i44) + eVar6.q;
                                        }
                                        int i45 = 0;
                                        while (true) {
                                            int i46 = i16 - 1;
                                            if (i45 < i46) {
                                                int i47 = i45 + 1;
                                                iArr[i45] = (int) (jArr[i47] - jArr[i45]);
                                                jArr2[i45] = jArr3[i47] - jArr3[i45];
                                                i45 = i47;
                                            } else {
                                                iArr[i46] = (int) ((eVar6.q + eVar6.p) - jArr[i46]);
                                                long j18 = eVar6.t - jArr3[i46];
                                                jArr2[i46] = j18;
                                                if (j18 <= 0) {
                                                    d5.a.K("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j18);
                                                    iArr = Arrays.copyOf(iArr, i46);
                                                    jArr = Arrays.copyOf(jArr, i46);
                                                    jArr2 = Arrays.copyOf(jArr2, i46);
                                                    jArr3 = Arrays.copyOf(jArr3, i46);
                                                }
                                                oVar = new m3.f(iArr, jArr, jArr2, jArr3);
                                            }
                                        }
                                    }
                                    mVar3.n(oVar);
                                    eVar6.v = i17;
                                }
                                eVar6.C = null;
                                eVar6.D = null;
                            }
                        }
                    } else if (eVar6.G == 2) {
                        d dVar5 = (d) sparseArray.get(eVar6.M);
                        dVar5.X.getClass();
                        if (eVar6.R > 0 && "A_OPUS".equals(dVar5.b)) {
                            z zVar3 = eVar6.n;
                            byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(eVar6.R).array();
                            zVar3.getClass();
                            zVar3.A(array.length, array);
                        }
                        int i48 = 0;
                        for (int i49 = 0; i49 < eVar6.K; i49++) {
                            i48 += eVar6.L[i49];
                        }
                        int i50 = 0;
                        while (i50 < eVar6.K) {
                            long j19 = eVar6.H + ((dVar5.e * i50) / MediaDataController.MAX_STYLE_RUNS_COUNT);
                            int i51 = eVar6.O;
                            if (i50 == 0 && !eVar6.Q) {
                                i51 |= 1;
                            }
                            int i52 = eVar6.L[i50];
                            int i53 = i48 - i52;
                            eVar6.e(dVar5, j19, i51, i52, i53);
                            i50++;
                            i48 = i53;
                        }
                        eVar6.G = 0;
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
                eVar = this;
                if (eVar.y) {
                    eVar.A = j20;
                    nVar.a = eVar.z;
                    eVar.y = z11;
                    return 1;
                }
                if (eVar.v) {
                    long j21 = eVar.A;
                    if (j21 != -1) {
                        nVar.a = j21;
                        eVar.A = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            } else {
                eVar = this;
            }
            eVar2 = eVar;
            z12 = true;
        }
        e eVar7 = eVar2;
        if (z13) {
            return 0;
        }
        int i54 = 0;
        while (true) {
            SparseArray sparseArray2 = eVar7.c;
            if (i54 >= sparseArray2.size()) {
                return -1;
            }
            d dVar6 = (d) sparseArray2.valueAt(i54);
            dVar6.X.getClass();
            x xVar = dVar6.T;
            if (xVar != null) {
                xVar.a(dVar6.X, dVar6.j);
            }
            i54++;
        }
    }

    @Override // m3.k
    public final void c(m mVar) {
        this.b0 = mVar;
    }

    public final void d(int i10) {
        if (this.u != null) {
            return;
        }
        throw t1.a("Element " + i10 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(d dVar, long j10, int i10, int i11, int i12) {
        byte[] h;
        int i13;
        int i14;
        x xVar = dVar.T;
        if (xVar != null) {
            xVar.b(dVar.X, j10, i10, i11, i12, dVar.j);
        } else {
            if ("S_TEXT/UTF8".equals(dVar.b) || "S_TEXT/ASS".equals(dVar.b) || "S_TEXT/WEBVTT".equals(dVar.b)) {
                if (this.K > 1) {
                    d5.a.K("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.I;
                    if (j11 == -9223372036854775807L) {
                        d5.a.K("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = dVar.b;
                        z zVar = this.k;
                        byte[] bArr = zVar.a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                                h = h(j11, 10000L, "%01d:%02d:%02d:%02d");
                                i13 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                h = h(j11, 1000L, "%02d:%02d:%02d.%03d");
                                i13 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                h = h(j11, 1000L, "%02d:%02d:%02d,%03d");
                                i13 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(h, 0, bArr, i13, h.length);
                        int i15 = zVar.b;
                        while (true) {
                            if (i15 < zVar.c) {
                                if (zVar.a[i15] == 0) {
                                    zVar.B(i15);
                                } else {
                                    i15++;
                                }
                            }
                        }
                        dVar.X.a(zVar.c, zVar);
                        i14 = i11 + zVar.c;
                        if ((i10 & TLObject.FLAG_28) != 0) {
                            int i16 = this.K;
                            z zVar2 = this.n;
                            if (i16 > 1) {
                                zVar2.z(0);
                            } else {
                                int i17 = zVar2.c;
                                dVar.X.d(i17, zVar2);
                                i14 += i17;
                            }
                        }
                        dVar.X.e(j10, i10, i14, i12, dVar.j);
                    }
                }
            }
            i14 = i11;
            if ((i10 & TLObject.FLAG_28) != 0) {
            }
            dVar.X.e(j10, i10, i14, i12, dVar.j);
        }
        this.F = true;
    }

    @Override // m3.k
    public final boolean f(l lVar) {
        v vVar = new v(10, (byte) 0);
        z zVar = (z) vVar.c;
        h hVar = (h) lVar;
        long j10 = hVar.c;
        long j11 = 1024;
        if (j10 != -1 && j10 <= 1024) {
            j11 = j10;
        }
        int i10 = (int) j11;
        hVar.g(zVar.a, 0, 4, false);
        long s10 = zVar.s();
        vVar.b = 4;
        while (true) {
            if (s10 != 440786851) {
                int i11 = vVar.b + 1;
                vVar.b = i11;
                if (i11 == i10) {
                    break;
                }
                hVar.g(zVar.a, 0, 1, false);
                s10 = ((s10 << 8) & (-256)) | (zVar.a[0] & 255);
            } else {
                long h = vVar.h(hVar);
                long j12 = vVar.b;
                if (h != Long.MIN_VALUE && (j10 == -1 || j12 + h < j10)) {
                    while (true) {
                        long j13 = vVar.b;
                        long j14 = j12 + h;
                        if (j13 < j14) {
                            if (vVar.h(hVar) != Long.MIN_VALUE) {
                                long h10 = vVar.h(hVar);
                                if (h10 < 0 || h10 > 2147483647L) {
                                    break;
                                }
                                if (h10 != 0) {
                                    int i12 = (int) h10;
                                    hVar.a(i12, false);
                                    vVar.b += i12;
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
        f fVar = bVar.c;
        fVar.b = 0;
        fVar.c = 0;
        f fVar2 = this.b;
        fVar2.b = 0;
        fVar2.c = 0;
        j();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i10 >= sparseArray.size()) {
                return;
            }
            x xVar = ((d) sparseArray.valueAt(i10)).T;
            if (xVar != null) {
                xVar.b = false;
                xVar.c = 0;
            }
            i10++;
        }
    }

    public final void i(l lVar, int i10) {
        z zVar = this.g;
        if (zVar.c >= i10) {
            return;
        }
        byte[] bArr = zVar.a;
        if (bArr.length < i10) {
            zVar.b(Math.max(bArr.length * 2, i10));
        }
        byte[] bArr2 = zVar.a;
        int i11 = zVar.c;
        lVar.readFully(bArr2, i11, i10 - i11);
        zVar.B(i10);
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
            return g0.O(j10, j11, 1000L);
        }
        throw t1.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public final int l(l lVar, d dVar, int i10, boolean z10) {
        int b10;
        int b11;
        int i11;
        if ("S_TEXT/UTF8".equals(dVar.b)) {
            m(lVar, c0, i10);
            int i12 = this.T;
            j();
            return i12;
        }
        if ("S_TEXT/ASS".equals(dVar.b)) {
            m(lVar, e0, i10);
            int i13 = this.T;
            j();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(dVar.b)) {
            m(lVar, f0, i10);
            int i14 = this.T;
            j();
            return i14;
        }
        w wVar = dVar.X;
        boolean z11 = this.V;
        z zVar = this.j;
        if (!z11) {
            boolean z12 = dVar.h;
            z zVar2 = this.g;
            if (z12) {
                this.O &= -1073741825;
                if (!this.W) {
                    lVar.readFully(zVar2.a, 0, 1);
                    this.S++;
                    byte b12 = zVar2.a[0];
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
                        z zVar3 = this.l;
                        lVar.readFully(zVar3.a, 0, 8);
                        this.S += 8;
                        this.a0 = true;
                        zVar2.a[0] = (byte) ((z13 ? 128 : 0) | 8);
                        zVar2.C(0);
                        wVar.d(1, zVar2);
                        this.T++;
                        zVar3.C(0);
                        wVar.d(8, zVar3);
                        this.T += 8;
                    }
                    if (z13) {
                        if (!this.X) {
                            lVar.readFully(zVar2.a, 0, 1);
                            this.S++;
                            zVar2.C(0);
                            this.Y = zVar2.r();
                            this.X = true;
                        }
                        int i15 = this.Y * 4;
                        zVar2.z(i15);
                        lVar.readFully(zVar2.a, 0, i15);
                        this.S += i15;
                        short s10 = (short) ((this.Y / 2) + 1);
                        int i16 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.o;
                        if (byteBuffer == null || byteBuffer.capacity() < i16) {
                            this.o = ByteBuffer.allocate(i16);
                        }
                        this.o.position(0);
                        this.o.putShort(s10);
                        int i17 = 0;
                        int i18 = 0;
                        while (true) {
                            i11 = this.Y;
                            if (i17 >= i11) {
                                break;
                            }
                            int u10 = zVar2.u();
                            if (i17 % 2 == 0) {
                                this.o.putShort((short) (u10 - i18));
                            } else {
                                this.o.putInt(u10 - i18);
                            }
                            i17++;
                            i18 = u10;
                        }
                        int i19 = (i10 - this.S) - i18;
                        if (i11 % 2 == 1) {
                            this.o.putInt(i19);
                        } else {
                            this.o.putShort((short) i19);
                            this.o.putInt(0);
                        }
                        byte[] array = this.o.array();
                        z zVar4 = this.m;
                        zVar4.A(i16, array);
                        wVar.d(i16, zVar4);
                        this.T += i16;
                    }
                }
            } else {
                byte[] bArr = dVar.i;
                if (bArr != null) {
                    zVar.A(bArr.length, bArr);
                }
            }
            if ("A_OPUS".equals(dVar.b) ? z10 : dVar.f > 0) {
                this.O |= TLObject.FLAG_28;
                this.n.z(0);
                int i20 = (zVar.c + i10) - this.S;
                zVar2.z(4);
                byte[] bArr2 = zVar2.a;
                bArr2[0] = (byte) ((i20 >> 24) & 255);
                bArr2[1] = (byte) ((i20 >> 16) & 255);
                bArr2[2] = (byte) ((i20 >> 8) & 255);
                bArr2[3] = (byte) (i20 & 255);
                wVar.d(4, zVar2);
                this.T += 4;
            }
            this.V = true;
        }
        int i21 = i10 + zVar.c;
        if (!"V_MPEG4/ISO/AVC".equals(dVar.b) && !"V_MPEGH/ISO/HEVC".equals(dVar.b)) {
            if (dVar.T != null) {
                d5.a.i(zVar.c == 0);
                dVar.T.c(lVar);
            }
            while (true) {
                int i22 = this.S;
                if (i22 >= i21) {
                    break;
                }
                int i23 = i21 - i22;
                int a2 = zVar.a();
                if (a2 > 0) {
                    b11 = Math.min(i23, a2);
                    wVar.a(b11, zVar);
                } else {
                    b11 = wVar.b(lVar, i23, false);
                }
                this.S += b11;
                this.T += b11;
            }
        } else {
            z zVar5 = this.f;
            byte[] bArr3 = zVar5.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i24 = dVar.Y;
            int i25 = 4 - i24;
            while (this.S < i21) {
                int i26 = this.U;
                if (i26 == 0) {
                    int min = Math.min(i24, zVar.a());
                    lVar.readFully(bArr3, i25 + min, i24 - min);
                    if (min > 0) {
                        zVar.c(i25, min, bArr3);
                    }
                    this.S += i24;
                    zVar5.C(0);
                    this.U = zVar5.u();
                    z zVar6 = this.e;
                    zVar6.C(0);
                    wVar.a(4, zVar6);
                    this.T += 4;
                } else {
                    int a3 = zVar.a();
                    if (a3 > 0) {
                        b10 = Math.min(i26, a3);
                        wVar.a(b10, zVar);
                    } else {
                        b10 = wVar.b(lVar, i26, false);
                    }
                    this.S += b10;
                    this.T += b10;
                    this.U -= b10;
                }
            }
        }
        if ("A_VORBIS".equals(dVar.b)) {
            z zVar7 = this.h;
            zVar7.C(0);
            wVar.a(4, zVar7);
            this.T += 4;
        }
        int i27 = this.T;
        j();
        return i27;
    }

    public final void m(l lVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        z zVar = this.k;
        byte[] bArr2 = zVar.a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i10);
            zVar.getClass();
            zVar.A(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        lVar.readFully(zVar.a, bArr.length, i10);
        zVar.C(0);
        zVar.B(length);
    }

    @Override // m3.k
    public final void release() {
    }
}
