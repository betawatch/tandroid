package u3;

import android.util.Pair;
import android.util.SparseArray;
import f5.d0;
import f5.v;
import f5.w;
import j$.util.DesugarCollections;
import j3.s0;
import j3.t0;
import j3.t1;
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
import o3.h;
import o3.k;
import o3.l;
import o3.m;
import o3.n;
import o3.o;
import o3.t;
import o3.x;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import p2.u;
import q8.z;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
    public u C;
    public u D;
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
    public final w e;
    public final w f;
    public final w g;
    public final w h;
    public final w i;
    public final w j;
    public final w k;
    public final w l;
    public final w m;
    public final w n;
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
        int i10 = d0.a;
        d0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(p8.d.c);
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
        bVar.d = new o1.a(this, 26);
        this.d = (i10 & 1) == 0;
        this.b = new f();
        this.c = new SparseArray();
        this.g = new w(4);
        this.h = new w(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new w(4);
        this.e = new w(f5.a.d);
        this.f = new w(4);
        this.j = new w();
        this.k = new w();
        this.l = new w(8);
        this.m = new w();
        this.n = new w();
        this.L = new int[1];
    }

    public static byte[] g(long j10, long j11, String str) {
        f5.a.f(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (i10 * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (i11 * 60000000);
        int i12 = (int) (j13 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11)));
        int i13 = d0.a;
        return format.getBytes(p8.d.c);
    }

    public final void a(int i10) {
        if (this.C == null || this.D == null) {
            throw t1.a("Element " + i10 + " must be in a Cues", null);
        }
    }

    public final void b(int i10) {
        if (this.u != null) {
            return;
        }
        throw t1.a("Element " + i10 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(d dVar, long j10, int i10, int i11, int i12) {
        byte[] g10;
        int i13;
        int i14;
        x xVar = dVar.T;
        if (xVar != null) {
            xVar.b(dVar.X, j10, i10, i11, i12, dVar.j);
        } else {
            if ("S_TEXT/UTF8".equals(dVar.b) || "S_TEXT/ASS".equals(dVar.b) || "S_TEXT/WEBVTT".equals(dVar.b)) {
                if (this.K > 1) {
                    f5.a.K("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.I;
                    if (j11 == -9223372036854775807L) {
                        f5.a.K("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = dVar.b;
                        w wVar = this.k;
                        byte[] bArr = wVar.a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                                g10 = g(j11, 10000L, "%01d:%02d:%02d:%02d");
                                i13 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                g10 = g(j11, 1000L, "%02d:%02d:%02d.%03d");
                                i13 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                g10 = g(j11, 1000L, "%02d:%02d:%02d,%03d");
                                i13 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(g10, 0, bArr, i13, g10.length);
                        int i15 = wVar.b;
                        while (true) {
                            if (i15 < wVar.c) {
                                if (wVar.a[i15] == 0) {
                                    wVar.B(i15);
                                } else {
                                    i15++;
                                }
                            }
                        }
                        dVar.X.e(wVar.c, wVar);
                        i14 = i11 + wVar.c;
                        if ((i10 & TLObject.FLAG_28) != 0) {
                            int i16 = this.K;
                            w wVar2 = this.n;
                            if (i16 > 1) {
                                wVar2.z(0);
                            } else {
                                int i17 = wVar2.c;
                                dVar.X.d(i17, wVar2);
                                i14 += i17;
                            }
                        }
                        dVar.X.c(j10, i10, i14, i12, dVar.j);
                    }
                }
            }
            i14 = i11;
            if ((i10 & TLObject.FLAG_28) != 0) {
            }
            dVar.X.c(j10, i10, i14, i12, dVar.j);
        }
        this.F = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0895, code lost:
    
        if (r1.l() == r2.getLeastSignificantBits()) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0b9f, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0f27, code lost:
    
        if (r5 == false) goto L825;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0f29, code lost:
    
        r1 = ((o3.h) r0).d;
        r3 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0f32, code lost:
    
        if (r3.y == false) goto L819;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0f47, code lost:
    
        if (r3.v == false) goto L876;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0f49, code lost:
    
        r6 = r3.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0f4f, code lost:
    
        if (r6 == (-1)) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0f51, code lost:
    
        r38.a = r6;
        r3.A = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0f55, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0f5c, code lost:
    
        r0 = r3;
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0f5c, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0f34, code lost:
    
        r3.A = r1;
        r38.a = r3.z;
        r3.y = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0f40, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0f56, code lost:
    
        r3 = r36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x08db  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x08f3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0ad2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x08f5  */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v53, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v147 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v32, types: [o3.h] */
    @Override // o3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(l lVar, n nVar) {
        l lVar2;
        boolean z10;
        int i10;
        boolean z11;
        String str;
        ?? r52;
        int i11;
        int a2;
        char c3;
        m mVar;
        List singletonList;
        int u10;
        ?? r32;
        List list;
        int i12;
        Exception exc;
        Pair pair;
        String str2;
        List list2;
        String str3;
        s0 s0Var;
        boolean h;
        int i13;
        int i14;
        g5.b bVar;
        int i15;
        byte[] bArr;
        int i16;
        String str4;
        g5.c d;
        t oVar;
        int i17;
        e eVar = this;
        eVar.F = false;
        boolean z12 = true;
        boolean z13 = true;
        while (z13 && !eVar.F) {
            b bVar2 = eVar.a;
            f fVar = bVar2.c;
            ArrayDeque arrayDeque = bVar2.b;
            f5.a.j(bVar2.d);
            int i18 = z12;
            while (true) {
                a aVar = (a) arrayDeque.peek();
                if (aVar == null || ((h) lVar).d < aVar.b) {
                    ?? r12 = 0;
                    if (bVar2.e == 0) {
                        lVar2 = lVar;
                        int i19 = 4;
                        long b10 = fVar.b(lVar2, true, false, 4);
                        if (b10 == -2) {
                            byte[] bArr2 = bVar2.a;
                            ((h) lVar2).f = 0;
                            while (true) {
                                r52 = (h) lVar2;
                                r52.f(bArr2, r12, i19, r12);
                                byte b11 = bArr2[r12];
                                int i20 = 0;
                                while (true) {
                                    if (i20 >= 8) {
                                        i11 = -1;
                                    } else if ((f.d[i20] & b11) != 0) {
                                        i11 = i20 + 1;
                                    } else {
                                        i20++;
                                    }
                                }
                                if (i11 != -1 && i11 <= 4) {
                                    a2 = (int) f.a(i11, false, bArr2);
                                    Object obj = bVar2.d.b;
                                    if (a2 == 357149030 || a2 == 524531317 || a2 == 475249515 || a2 == 374648427) {
                                    }
                                }
                                r52.t(1);
                                r12 = 0;
                                i19 = 4;
                            }
                            r52.t(i11);
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
                    o1.a aVar2 = bVar2.d;
                    int i21 = bVar2.f;
                    Object obj2 = aVar2.b;
                    switch (i21) {
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
                            arrayDeque.push(new a(i21, bVar2.g + j10));
                            o1.a aVar3 = bVar2.d;
                            int i22 = bVar2.f;
                            long j11 = bVar2.g;
                            e eVar2 = (e) aVar3.b;
                            f5.a.j(eVar2.b0);
                            if (i22 != 160) {
                                if (i22 == 174) {
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
                                    eVar2.u = dVar;
                                } else if (i22 == 187) {
                                    z11 = false;
                                    eVar2.E = false;
                                } else if (i22 == 19899) {
                                    eVar2.w = -1;
                                    eVar2.x = -1L;
                                } else if (i22 == 20533) {
                                    eVar2.b(i22);
                                    eVar2.u.h = true;
                                } else if (i22 == 21968) {
                                    eVar2.b(i22);
                                    eVar2.u.x = true;
                                } else if (i22 == 408125543) {
                                    long j12 = eVar2.q;
                                    if (j12 != -1 && j12 != j10) {
                                        throw t1.a("Multiple Segment elements not supported", null);
                                    }
                                    eVar2.q = j10;
                                    eVar2.p = j11;
                                } else if (i22 == 475249515) {
                                    eVar2.C = new u(4, (byte) 0);
                                    eVar2.D = new u(4, (byte) 0);
                                } else if (i22 == 524531317 && !eVar2.v) {
                                    if (!eVar2.d || eVar2.z == -1) {
                                        eVar2.b0.D1(new o(eVar2.t));
                                        eVar2.v = true;
                                    } else {
                                        eVar2.y = true;
                                    }
                                }
                                z11 = false;
                            } else {
                                z11 = false;
                                eVar2.Q = false;
                                eVar2.R = 0L;
                            }
                            bVar2.e = z11 ? 1 : 0;
                        } else if (i10 == 2) {
                            long j13 = bVar2.g;
                            if (j13 > 8) {
                                throw t1.a("Invalid integer size: " + bVar2.g, null);
                            }
                            aVar2.C(i21, bVar2.a(lVar2, (int) j13));
                            z11 = false;
                            bVar2.e = 0;
                        } else if (i10 == 3) {
                            long j14 = bVar2.g;
                            if (j14 > 2147483647L) {
                                throw t1.a("String element size: " + bVar2.g, null);
                            }
                            int i23 = (int) j14;
                            if (i23 == 0) {
                                str = "";
                            } else {
                                byte[] bArr3 = new byte[i23];
                                ((h) lVar2).c(bArr3, 0, i23, false);
                                while (i23 > 0 && bArr3[i23 - 1] == 0) {
                                    i23--;
                                }
                                str = new String(bArr3, 0, i23);
                            }
                            e eVar3 = (e) aVar2.b;
                            if (i21 == 134) {
                                eVar3.b(i21);
                                eVar3.u.b = str;
                            } else if (i21 != 17026) {
                                if (i21 == 21358) {
                                    eVar3.b(i21);
                                    eVar3.u.a = str;
                                } else if (i21 == 2274716) {
                                    eVar3.b(i21);
                                    eVar3.u.W = str;
                                }
                            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                                throw t1.a("DocType " + str + " not supported", null);
                            }
                            z11 = false;
                            bVar2.e = 0;
                        } else if (i10 == 4) {
                            aVar2.u(i21, (int) bVar2.g, lVar2);
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
                            int i24 = (int) j15;
                            double intBitsToFloat = i24 == 4 ? Float.intBitsToFloat((int) r5) : Double.longBitsToDouble(bVar2.a(lVar2, i24));
                            e eVar4 = (e) aVar2.b;
                            if (i21 == 181) {
                                eVar4.b(i21);
                                eVar4.u.Q = (int) intBitsToFloat;
                            } else if (i21 != 17545) {
                                switch (i21) {
                                    case 21969:
                                        eVar4.b(i21);
                                        eVar4.u.D = (float) intBitsToFloat;
                                        break;
                                    case 21970:
                                        eVar4.b(i21);
                                        eVar4.u.E = (float) intBitsToFloat;
                                        break;
                                    case 21971:
                                        eVar4.b(i21);
                                        eVar4.u.F = (float) intBitsToFloat;
                                        break;
                                    case 21972:
                                        eVar4.b(i21);
                                        eVar4.u.G = (float) intBitsToFloat;
                                        break;
                                    case 21973:
                                        eVar4.b(i21);
                                        eVar4.u.H = (float) intBitsToFloat;
                                        break;
                                    case 21974:
                                        eVar4.b(i21);
                                        eVar4.u.I = (float) intBitsToFloat;
                                        break;
                                    case 21975:
                                        eVar4.b(i21);
                                        eVar4.u.J = (float) intBitsToFloat;
                                        break;
                                    case 21976:
                                        eVar4.b(i21);
                                        eVar4.u.K = (float) intBitsToFloat;
                                        break;
                                    case 21977:
                                        eVar4.b(i21);
                                        eVar4.u.L = (float) intBitsToFloat;
                                        break;
                                    case 21978:
                                        eVar4.b(i21);
                                        eVar4.u.M = (float) intBitsToFloat;
                                        break;
                                    default:
                                        switch (i21) {
                                            case 30323:
                                                eVar4.b(i21);
                                                eVar4.u.s = (float) intBitsToFloat;
                                                break;
                                            case 30324:
                                                eVar4.b(i21);
                                                eVar4.u.t = (float) intBitsToFloat;
                                                break;
                                            case 30325:
                                                eVar4.b(i21);
                                                eVar4.u.u = (float) intBitsToFloat;
                                                break;
                                        }
                                }
                            } else {
                                eVar4.s = (long) intBitsToFloat;
                            }
                            z11 = false;
                            bVar2.e = 0;
                        }
                        z13 = true;
                    } else {
                        ((h) lVar2).t((int) bVar2.g);
                        bVar2.e = 0;
                        i18 = 1;
                    }
                } else {
                    o1.a aVar4 = bVar2.d;
                    int i25 = ((a) arrayDeque.pop()).a;
                    e eVar5 = (e) aVar4.b;
                    SparseArray sparseArray = eVar5.c;
                    f5.a.j(eVar5.b0);
                    if (i25 != 160) {
                        if (i25 == 174) {
                            d dVar2 = eVar5.u;
                            f5.a.j(dVar2);
                            String str5 = dVar2.b;
                            if (str5 == null) {
                                throw t1.a("CodecId is missing in TrackEntry element", null);
                            }
                            switch (str5) {
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
                                    m mVar2 = eVar5.b0;
                                    int i26 = dVar2.c;
                                    switch (str5.hashCode()) {
                                        case -2095576542:
                                            if (str5.equals("V_MPEG4/ISO/AP")) {
                                                c3 = 0;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case -2095575984:
                                            if (str5.equals("V_MPEG4/ISO/SP")) {
                                                c3 = 1;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case -1985379776:
                                            if (str5.equals("A_MS/ACM")) {
                                                c3 = 2;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case -1784763192:
                                            if (str5.equals("A_TRUEHD")) {
                                                c3 = 3;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case -1730367663:
                                            if (str5.equals("A_VORBIS")) {
                                                c3 = 4;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case -1482641358:
                                            if (str5.equals("A_MPEG/L2")) {
                                                c3 = 5;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case -1482641357:
                                            if (str5.equals("A_MPEG/L3")) {
                                                c3 = 6;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case -1373388978:
                                            if (str5.equals("V_MS/VFW/FOURCC")) {
                                                c3 = 7;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case -933872740:
                                            if (str5.equals("S_DVBSUB")) {
                                                c3 = '\b';
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case -538363189:
                                            if (str5.equals("V_MPEG4/ISO/ASP")) {
                                                c3 = '\t';
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case -538363109:
                                            if (str5.equals("V_MPEG4/ISO/AVC")) {
                                                c3 = '\n';
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case -425012669:
                                            if (str5.equals("S_VOBSUB")) {
                                                c3 = 11;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case -356037306:
                                            if (str5.equals("A_DTS/LOSSLESS")) {
                                                c3 = '\f';
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 62923557:
                                            if (str5.equals("A_AAC")) {
                                                c3 = '\r';
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 62923603:
                                            if (str5.equals("A_AC3")) {
                                                c3 = 14;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 62927045:
                                            if (str5.equals("A_DTS")) {
                                                c3 = 15;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 82318131:
                                            if (str5.equals("V_AV1")) {
                                                c3 = 16;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 82338133:
                                            if (str5.equals("V_VP8")) {
                                                c3 = 17;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 82338134:
                                            if (str5.equals("V_VP9")) {
                                                c3 = 18;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 99146302:
                                            if (str5.equals("S_HDMV/PGS")) {
                                                c3 = 19;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 444813526:
                                            if (str5.equals("V_THEORA")) {
                                                c3 = 20;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 542569478:
                                            if (str5.equals("A_DTS/EXPRESS")) {
                                                c3 = 21;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 635596514:
                                            if (str5.equals("A_PCM/FLOAT/IEEE")) {
                                                c3 = 22;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 725948237:
                                            if (str5.equals("A_PCM/INT/BIG")) {
                                                c3 = 23;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 725957860:
                                            if (str5.equals("A_PCM/INT/LIT")) {
                                                c3 = 24;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 738597099:
                                            if (str5.equals("S_TEXT/ASS")) {
                                                c3 = 25;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 855502857:
                                            if (str5.equals("V_MPEGH/ISO/HEVC")) {
                                                c3 = 26;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 1045209816:
                                            if (str5.equals("S_TEXT/WEBVTT")) {
                                                c3 = 27;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 1422270023:
                                            if (str5.equals("S_TEXT/UTF8")) {
                                                c3 = 28;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 1809237540:
                                            if (str5.equals("V_MPEG2")) {
                                                c3 = 29;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 1950749482:
                                            if (str5.equals("A_EAC3")) {
                                                c3 = 30;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 1950789798:
                                            if (str5.equals("A_FLAC")) {
                                                c3 = 31;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 1951062397:
                                            if (str5.equals("A_OPUS")) {
                                                c3 = ' ';
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        default:
                                            c3 = 65535;
                                            break;
                                    }
                                    String str6 = "video/x-unknown";
                                    switch (c3) {
                                        case 0:
                                        case 1:
                                        case '\t':
                                            mVar = mVar2;
                                            byte[] bArr4 = dVar2.k;
                                            singletonList = bArr4 == null ? null : Collections.singletonList(bArr4);
                                            str6 = "video/mp4v-es";
                                            list = singletonList;
                                            i12 = -1;
                                            u10 = -1;
                                            str2 = null;
                                            if (dVar2.N != null && (d = g5.c.d(new w(dVar2.N))) != null) {
                                                str2 = d.a;
                                                str6 = "video/dolby-vision";
                                            }
                                            int i27 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = f5.o.h(str6);
                                            Map map = h0;
                                            if (!h) {
                                                s0Var.B = dVar2.O;
                                                s0Var.C = dVar2.Q;
                                                s0Var.D = u10;
                                                i13 = 1;
                                            } else if (f5.o.j(str6)) {
                                                if (dVar2.q == 0) {
                                                    int i28 = dVar2.o;
                                                    i14 = -1;
                                                    if (i28 == -1) {
                                                        i28 = dVar2.m;
                                                    }
                                                    dVar2.o = i28;
                                                    int i29 = dVar2.p;
                                                    if (i29 == -1) {
                                                        i29 = dVar2.n;
                                                    }
                                                    dVar2.p = i29;
                                                } else {
                                                    i14 = -1;
                                                }
                                                float f9 = (dVar2.o == i14 || (i16 = dVar2.p) == i14) ? -1.0f : (dVar2.n * r1) / (dVar2.m * i16);
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
                                                    bVar = new g5.b(dVar2.y, dVar2.A, dVar2.z, bArr);
                                                } else {
                                                    bVar = null;
                                                }
                                                String str7 = dVar2.a;
                                                int intValue = (str7 == null || !map.containsKey(str7)) ? -1 : ((Integer) map.get(dVar2.a)).intValue();
                                                if (dVar2.r == 0 && Float.compare(dVar2.s, 0.0f) == 0 && Float.compare(dVar2.t, 0.0f) == 0) {
                                                    if (Float.compare(dVar2.u, 0.0f) == 0) {
                                                        i15 = 0;
                                                    } else if (Float.compare(dVar2.t, 90.0f) == 0) {
                                                        i15 = 90;
                                                    } else if (Float.compare(dVar2.t, -180.0f) == 0 || Float.compare(dVar2.t, 180.0f) == 0) {
                                                        i15 = 180;
                                                    } else if (Float.compare(dVar2.t, -90.0f) == 0) {
                                                        i15 = 270;
                                                    }
                                                    s0Var.t = dVar2.m;
                                                    s0Var.u = dVar2.n;
                                                    s0Var.x = f9;
                                                    s0Var.w = i15;
                                                    s0Var.y = dVar2.v;
                                                    s0Var.z = dVar2.w;
                                                    s0Var.A = bVar;
                                                    i13 = 2;
                                                }
                                                i15 = intValue;
                                                s0Var.t = dVar2.m;
                                                s0Var.u = dVar2.n;
                                                s0Var.x = f9;
                                                s0Var.w = i15;
                                                s0Var.y = dVar2.v;
                                                s0Var.z = dVar2.w;
                                                s0Var.A = bVar;
                                                i13 = 2;
                                            } else {
                                                if (!"application/x-subrip".equals(str6) && !"text/x-ssa".equals(str6) && !"text/vtt".equals(str6) && !"application/vobsub".equals(str6) && !"application/pgs".equals(str6) && !"application/dvbsubs".equals(str6)) {
                                                    throw t1.a("Unexpected MIME type.", null);
                                                }
                                                i13 = 3;
                                            }
                                            str4 = dVar2.a;
                                            if (str4 != null && !map.containsKey(str4)) {
                                                s0Var.b = dVar2.a;
                                            }
                                            s0Var.a = Integer.toString(i26);
                                            s0Var.o = str6;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i27;
                                            s0Var.q = list;
                                            s0Var.h = str2;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var = new t0(s0Var);
                                            o3.w Z1 = mVar.Z1(dVar2.c, i13);
                                            dVar2.X = Z1;
                                            Z1.b(t0Var);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar5 = eVar5;
                                            break;
                                        case 2:
                                            mVar = mVar2;
                                            w wVar = new w(dVar2.a(dVar2.b));
                                            try {
                                                int k9 = wVar.k();
                                                if (k9 != 1) {
                                                    if (k9 == 65534) {
                                                        wVar.C(24);
                                                        long l10 = wVar.l();
                                                        UUID uuid = g0;
                                                        if (l10 == uuid.getMostSignificantBits()) {
                                                            break;
                                                        }
                                                    }
                                                    f5.a.K("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                    str6 = "audio/x-unknown";
                                                    i12 = -1;
                                                    u10 = -1;
                                                    list = null;
                                                    str2 = null;
                                                    if (dVar2.N != null) {
                                                        str2 = d.a;
                                                        str6 = "video/dolby-vision";
                                                        break;
                                                    }
                                                    int i272 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                                    s0Var = new s0();
                                                    h = f5.o.h(str6);
                                                    Map map2 = h0;
                                                    if (!h) {
                                                    }
                                                    str4 = dVar2.a;
                                                    if (str4 != null) {
                                                        s0Var.b = dVar2.a;
                                                        break;
                                                    }
                                                    s0Var.a = Integer.toString(i26);
                                                    s0Var.o = str6;
                                                    s0Var.p = i12;
                                                    s0Var.c = dVar2.W;
                                                    s0Var.d = i272;
                                                    s0Var.q = list;
                                                    s0Var.h = str2;
                                                    s0Var.r = dVar2.l;
                                                    t0 t0Var2 = new t0(s0Var);
                                                    o3.w Z12 = mVar.Z1(dVar2.c, i13);
                                                    dVar2.X = Z12;
                                                    Z12.b(t0Var2);
                                                    sparseArray.put(dVar2.c, dVar2);
                                                    eVar5 = eVar5;
                                                }
                                                u10 = d0.u(dVar2.P);
                                                if (u10 == 0) {
                                                    f5.a.K("MatroskaExtractor", "Unsupported PCM bit depth: " + dVar2.P + ". Setting mimeType to audio/x-unknown");
                                                    str6 = "audio/x-unknown";
                                                    i12 = -1;
                                                    u10 = -1;
                                                    list = null;
                                                    str2 = null;
                                                    if (dVar2.N != null) {
                                                    }
                                                    int i2722 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                                    s0Var = new s0();
                                                    h = f5.o.h(str6);
                                                    Map map22 = h0;
                                                    if (!h) {
                                                    }
                                                    str4 = dVar2.a;
                                                    if (str4 != null) {
                                                    }
                                                    s0Var.a = Integer.toString(i26);
                                                    s0Var.o = str6;
                                                    s0Var.p = i12;
                                                    s0Var.c = dVar2.W;
                                                    s0Var.d = i2722;
                                                    s0Var.q = list;
                                                    s0Var.h = str2;
                                                    s0Var.r = dVar2.l;
                                                    t0 t0Var22 = new t0(s0Var);
                                                    o3.w Z122 = mVar.Z1(dVar2.c, i13);
                                                    dVar2.X = Z122;
                                                    Z122.b(t0Var22);
                                                    sparseArray.put(dVar2.c, dVar2);
                                                    eVar5 = eVar5;
                                                }
                                                str6 = "audio/raw";
                                                i12 = -1;
                                                list = null;
                                                str2 = null;
                                                if (dVar2.N != null) {
                                                }
                                                int i27222 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                                s0Var = new s0();
                                                h = f5.o.h(str6);
                                                Map map222 = h0;
                                                if (!h) {
                                                }
                                                str4 = dVar2.a;
                                                if (str4 != null) {
                                                }
                                                s0Var.a = Integer.toString(i26);
                                                s0Var.o = str6;
                                                s0Var.p = i12;
                                                s0Var.c = dVar2.W;
                                                s0Var.d = i27222;
                                                s0Var.q = list;
                                                s0Var.h = str2;
                                                s0Var.r = dVar2.l;
                                                t0 t0Var222 = new t0(s0Var);
                                                o3.w Z1222 = mVar.Z1(dVar2.c, i13);
                                                dVar2.X = Z1222;
                                                Z1222.b(t0Var222);
                                                sparseArray.put(dVar2.c, dVar2);
                                                eVar5 = eVar5;
                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                throw t1.a("Error parsing MS/ACM codec private", null);
                                            }
                                            break;
                                        case 3:
                                            mVar = mVar2;
                                            dVar2.T = new x();
                                            str6 = "audio/true-hd";
                                            i12 = -1;
                                            u10 = -1;
                                            list = null;
                                            str2 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i272222 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = f5.o.h(str6);
                                            Map map2222 = h0;
                                            if (!h) {
                                            }
                                            str4 = dVar2.a;
                                            if (str4 != null) {
                                            }
                                            s0Var.a = Integer.toString(i26);
                                            s0Var.o = str6;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i272222;
                                            s0Var.q = list;
                                            s0Var.h = str2;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var2222 = new t0(s0Var);
                                            o3.w Z12222 = mVar.Z1(dVar2.c, i13);
                                            dVar2.X = Z12222;
                                            Z12222.b(t0Var2222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar5 = eVar5;
                                            break;
                                        case 4:
                                            mVar = mVar2;
                                            byte[] a10 = dVar2.a(str5);
                                            try {
                                                r32 = 2;
                                            } catch (ArrayIndexOutOfBoundsException unused2) {
                                                r32 = 0;
                                            }
                                            try {
                                                if (a10[0] != 2) {
                                                    throw t1.a("Error parsing vorbis codec private", null);
                                                }
                                                int i30 = 0;
                                                int i31 = 1;
                                                while (true) {
                                                    int i32 = a10[i31] & 255;
                                                    if (i32 == 255) {
                                                        i30 += 255;
                                                        i31++;
                                                    } else {
                                                        int i33 = i31 + 1;
                                                        int i34 = i30 + i32;
                                                        int i35 = 0;
                                                        while (true) {
                                                            int i36 = a10[i33] & 255;
                                                            if (i36 == 255) {
                                                                i35 += 255;
                                                                i33++;
                                                            } else {
                                                                int i37 = i33 + 1;
                                                                int i38 = i35 + i36;
                                                                if (a10[i37] != 1) {
                                                                    throw t1.a("Error parsing vorbis codec private", null);
                                                                }
                                                                byte[] bArr5 = new byte[i34];
                                                                System.arraycopy(a10, i37, bArr5, 0, i34);
                                                                int i39 = i37 + i34;
                                                                if (a10[i39] != 3) {
                                                                    throw t1.a("Error parsing vorbis codec private", null);
                                                                }
                                                                int i40 = i39 + i38;
                                                                if (a10[i40] != 5) {
                                                                    throw t1.a("Error parsing vorbis codec private", null);
                                                                }
                                                                byte[] bArr6 = new byte[a10.length - i40];
                                                                System.arraycopy(a10, i40, bArr6, 0, a10.length - i40);
                                                                ArrayList arrayList = new ArrayList(2);
                                                                arrayList.add(bArr5);
                                                                arrayList.add(bArr6);
                                                                str6 = "audio/vorbis";
                                                                list = arrayList;
                                                                i12 = 8192;
                                                                u10 = -1;
                                                                str2 = null;
                                                                if (dVar2.N != null) {
                                                                }
                                                                int i2722222 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                                                s0Var = new s0();
                                                                h = f5.o.h(str6);
                                                                Map map22222 = h0;
                                                                if (!h) {
                                                                }
                                                                str4 = dVar2.a;
                                                                if (str4 != null) {
                                                                }
                                                                s0Var.a = Integer.toString(i26);
                                                                s0Var.o = str6;
                                                                s0Var.p = i12;
                                                                s0Var.c = dVar2.W;
                                                                s0Var.d = i2722222;
                                                                s0Var.q = list;
                                                                s0Var.h = str2;
                                                                s0Var.r = dVar2.l;
                                                                t0 t0Var22222 = new t0(s0Var);
                                                                o3.w Z122222 = mVar.Z1(dVar2.c, i13);
                                                                dVar2.X = Z122222;
                                                                Z122222.b(t0Var22222);
                                                                sparseArray.put(dVar2.c, dVar2);
                                                                eVar5 = eVar5;
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                                throw t1.a("Error parsing vorbis codec private", r32);
                                            }
                                            break;
                                        case 5:
                                            mVar = mVar2;
                                            str6 = "audio/mpeg-L2";
                                            i12 = 4096;
                                            u10 = -1;
                                            list = null;
                                            str2 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i27222222 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = f5.o.h(str6);
                                            Map map222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = dVar2.a;
                                            if (str4 != null) {
                                            }
                                            s0Var.a = Integer.toString(i26);
                                            s0Var.o = str6;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i27222222;
                                            s0Var.q = list;
                                            s0Var.h = str2;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var222222 = new t0(s0Var);
                                            o3.w Z1222222 = mVar.Z1(dVar2.c, i13);
                                            dVar2.X = Z1222222;
                                            Z1222222.b(t0Var222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar5 = eVar5;
                                            break;
                                        case 6:
                                            mVar = mVar2;
                                            str6 = "audio/mpeg";
                                            i12 = 4096;
                                            u10 = -1;
                                            list = null;
                                            str2 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i272222222 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = f5.o.h(str6);
                                            Map map2222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = dVar2.a;
                                            if (str4 != null) {
                                            }
                                            s0Var.a = Integer.toString(i26);
                                            s0Var.o = str6;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i272222222;
                                            s0Var.q = list;
                                            s0Var.h = str2;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var2222222 = new t0(s0Var);
                                            o3.w Z12222222 = mVar.Z1(dVar2.c, i13);
                                            dVar2.X = Z12222222;
                                            Z12222222.b(t0Var2222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar5 = eVar5;
                                            break;
                                        case 7:
                                            mVar = mVar2;
                                            w wVar2 = new w(dVar2.a(dVar2.b));
                                            try {
                                                wVar2.D(16);
                                                long i41 = wVar2.i();
                                                if (i41 == 1482049860) {
                                                    exc = null;
                                                    try {
                                                        pair = new Pair("video/divx", null);
                                                        str2 = null;
                                                    } catch (ArrayIndexOutOfBoundsException unused4) {
                                                        throw t1.a("Error parsing FourCC private data", exc);
                                                    }
                                                } else {
                                                    if (i41 == 859189832) {
                                                        pair = new Pair("video/3gpp", null);
                                                    } else {
                                                        if (i41 == 826496599) {
                                                            byte[] bArr7 = wVar2.a;
                                                            for (int i42 = wVar2.b + 20; i42 < bArr7.length - 4; i42++) {
                                                                if (bArr7[i42] == 0 && bArr7[i42 + 1] == 0 && bArr7[i42 + 2] == 1) {
                                                                    if (bArr7[i42 + 3] == 15) {
                                                                        pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr7, i42, bArr7.length)));
                                                                    }
                                                                }
                                                            }
                                                            exc = null;
                                                            throw t1.a("Failed to find FourCC VC1 initialization data", null);
                                                        }
                                                        f5.a.K("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                        str2 = null;
                                                        pair = new Pair("video/x-unknown", null);
                                                    }
                                                    str2 = null;
                                                }
                                                str6 = (String) pair.first;
                                                list = (List) pair.second;
                                                i12 = -1;
                                                u10 = -1;
                                                if (dVar2.N != null) {
                                                }
                                                int i2722222222 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                                s0Var = new s0();
                                                h = f5.o.h(str6);
                                                Map map22222222 = h0;
                                                if (!h) {
                                                }
                                                str4 = dVar2.a;
                                                if (str4 != null) {
                                                }
                                                s0Var.a = Integer.toString(i26);
                                                s0Var.o = str6;
                                                s0Var.p = i12;
                                                s0Var.c = dVar2.W;
                                                s0Var.d = i2722222222;
                                                s0Var.q = list;
                                                s0Var.h = str2;
                                                s0Var.r = dVar2.l;
                                                t0 t0Var22222222 = new t0(s0Var);
                                                o3.w Z122222222 = mVar.Z1(dVar2.c, i13);
                                                dVar2.X = Z122222222;
                                                Z122222222.b(t0Var22222222);
                                                sparseArray.put(dVar2.c, dVar2);
                                                eVar5 = eVar5;
                                            } catch (ArrayIndexOutOfBoundsException unused5) {
                                                exc = null;
                                            }
                                            break;
                                        case '\b':
                                            mVar = mVar2;
                                            byte[] bArr8 = new byte[4];
                                            System.arraycopy(dVar2.a(str5), 0, bArr8, 0, 4);
                                            list = z.y(bArr8);
                                            str6 = "application/dvbsubs";
                                            i12 = -1;
                                            u10 = -1;
                                            str2 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i27222222222 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = f5.o.h(str6);
                                            Map map222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = dVar2.a;
                                            if (str4 != null) {
                                            }
                                            s0Var.a = Integer.toString(i26);
                                            s0Var.o = str6;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i27222222222;
                                            s0Var.q = list;
                                            s0Var.h = str2;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var222222222 = new t0(s0Var);
                                            o3.w Z1222222222 = mVar.Z1(dVar2.c, i13);
                                            dVar2.X = Z1222222222;
                                            Z1222222222.b(t0Var222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar5 = eVar5;
                                            break;
                                        case '\n':
                                            mVar = mVar2;
                                            g5.a a11 = g5.a.a(new w(dVar2.a(dVar2.b)));
                                            list2 = a11.a;
                                            dVar2.Y = a11.b;
                                            str3 = a11.f;
                                            str6 = MediaController.VIDEO_MIME_TYPE;
                                            str2 = str3;
                                            list = list2;
                                            i12 = -1;
                                            u10 = -1;
                                            if (dVar2.N != null) {
                                            }
                                            int i272222222222 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = f5.o.h(str6);
                                            Map map2222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = dVar2.a;
                                            if (str4 != null) {
                                            }
                                            s0Var.a = Integer.toString(i26);
                                            s0Var.o = str6;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i272222222222;
                                            s0Var.q = list;
                                            s0Var.h = str2;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var2222222222 = new t0(s0Var);
                                            o3.w Z12222222222 = mVar.Z1(dVar2.c, i13);
                                            dVar2.X = Z12222222222;
                                            Z12222222222.b(t0Var2222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar5 = eVar5;
                                            break;
                                        case 11:
                                            mVar = mVar2;
                                            list = z.y(dVar2.a(str5));
                                            str6 = "application/vobsub";
                                            i12 = -1;
                                            u10 = -1;
                                            str2 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i2722222222222 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = f5.o.h(str6);
                                            Map map22222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = dVar2.a;
                                            if (str4 != null) {
                                            }
                                            s0Var.a = Integer.toString(i26);
                                            s0Var.o = str6;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i2722222222222;
                                            s0Var.q = list;
                                            s0Var.h = str2;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var22222222222 = new t0(s0Var);
                                            o3.w Z122222222222 = mVar.Z1(dVar2.c, i13);
                                            dVar2.X = Z122222222222;
                                            Z122222222222.b(t0Var22222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar5 = eVar5;
                                            break;
                                        case '\f':
                                            mVar = mVar2;
                                            str6 = "audio/vnd.dts.hd";
                                            i12 = -1;
                                            u10 = -1;
                                            list = null;
                                            str2 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i27222222222222 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = f5.o.h(str6);
                                            Map map222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = dVar2.a;
                                            if (str4 != null) {
                                            }
                                            s0Var.a = Integer.toString(i26);
                                            s0Var.o = str6;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i27222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str2;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var222222222222 = new t0(s0Var);
                                            o3.w Z1222222222222 = mVar.Z1(dVar2.c, i13);
                                            dVar2.X = Z1222222222222;
                                            Z1222222222222.b(t0Var222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar5 = eVar5;
                                            break;
                                        case '\r':
                                            mVar = mVar2;
                                            List singletonList2 = Collections.singletonList(dVar2.a(str5));
                                            byte[] bArr9 = dVar2.k;
                                            l3.a h10 = l3.b.h(new v(bArr9, bArr9.length), false);
                                            dVar2.Q = h10.a;
                                            dVar2.O = h10.b;
                                            String str8 = h10.c;
                                            str6 = MediaController.AUDIO_MIME_TYPE;
                                            list = singletonList2;
                                            str2 = str8;
                                            i12 = -1;
                                            u10 = -1;
                                            if (dVar2.N != null) {
                                            }
                                            int i272222222222222 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = f5.o.h(str6);
                                            Map map2222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = dVar2.a;
                                            if (str4 != null) {
                                            }
                                            s0Var.a = Integer.toString(i26);
                                            s0Var.o = str6;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i272222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str2;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var2222222222222 = new t0(s0Var);
                                            o3.w Z12222222222222 = mVar.Z1(dVar2.c, i13);
                                            dVar2.X = Z12222222222222;
                                            Z12222222222222.b(t0Var2222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar5 = eVar5;
                                            break;
                                        case 14:
                                            mVar = mVar2;
                                            str6 = "audio/ac3";
                                            i12 = -1;
                                            u10 = -1;
                                            list = null;
                                            str2 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i2722222222222222 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = f5.o.h(str6);
                                            Map map22222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = dVar2.a;
                                            if (str4 != null) {
                                            }
                                            s0Var.a = Integer.toString(i26);
                                            s0Var.o = str6;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i2722222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str2;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var22222222222222 = new t0(s0Var);
                                            o3.w Z122222222222222 = mVar.Z1(dVar2.c, i13);
                                            dVar2.X = Z122222222222222;
                                            Z122222222222222.b(t0Var22222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar5 = eVar5;
                                            break;
                                        case 15:
                                        case 21:
                                            mVar = mVar2;
                                            str6 = "audio/vnd.dts";
                                            i12 = -1;
                                            u10 = -1;
                                            list = null;
                                            str2 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i27222222222222222 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = f5.o.h(str6);
                                            Map map222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = dVar2.a;
                                            if (str4 != null) {
                                            }
                                            s0Var.a = Integer.toString(i26);
                                            s0Var.o = str6;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i27222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str2;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var222222222222222 = new t0(s0Var);
                                            o3.w Z1222222222222222 = mVar.Z1(dVar2.c, i13);
                                            dVar2.X = Z1222222222222222;
                                            Z1222222222222222.b(t0Var222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar5 = eVar5;
                                            break;
                                        case 16:
                                            mVar = mVar2;
                                            str6 = "video/av01";
                                            i12 = -1;
                                            u10 = -1;
                                            list = null;
                                            str2 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i272222222222222222 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = f5.o.h(str6);
                                            Map map2222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = dVar2.a;
                                            if (str4 != null) {
                                            }
                                            s0Var.a = Integer.toString(i26);
                                            s0Var.o = str6;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i272222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str2;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var2222222222222222 = new t0(s0Var);
                                            o3.w Z12222222222222222 = mVar.Z1(dVar2.c, i13);
                                            dVar2.X = Z12222222222222222;
                                            Z12222222222222222.b(t0Var2222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar5 = eVar5;
                                            break;
                                        case 17:
                                            mVar = mVar2;
                                            str6 = "video/x-vnd.on2.vp8";
                                            i12 = -1;
                                            u10 = -1;
                                            list = null;
                                            str2 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i2722222222222222222 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = f5.o.h(str6);
                                            Map map22222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = dVar2.a;
                                            if (str4 != null) {
                                            }
                                            s0Var.a = Integer.toString(i26);
                                            s0Var.o = str6;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i2722222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str2;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var22222222222222222 = new t0(s0Var);
                                            o3.w Z122222222222222222 = mVar.Z1(dVar2.c, i13);
                                            dVar2.X = Z122222222222222222;
                                            Z122222222222222222.b(t0Var22222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar5 = eVar5;
                                            break;
                                        case 18:
                                            mVar = mVar2;
                                            str6 = "video/x-vnd.on2.vp9";
                                            i12 = -1;
                                            u10 = -1;
                                            list = null;
                                            str2 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i27222222222222222222 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = f5.o.h(str6);
                                            Map map222222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = dVar2.a;
                                            if (str4 != null) {
                                            }
                                            s0Var.a = Integer.toString(i26);
                                            s0Var.o = str6;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i27222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str2;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var222222222222222222 = new t0(s0Var);
                                            o3.w Z1222222222222222222 = mVar.Z1(dVar2.c, i13);
                                            dVar2.X = Z1222222222222222222;
                                            Z1222222222222222222.b(t0Var222222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar5 = eVar5;
                                            break;
                                        case 19:
                                            mVar = mVar2;
                                            str6 = "application/pgs";
                                            i12 = -1;
                                            u10 = -1;
                                            list = null;
                                            str2 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i272222222222222222222 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = f5.o.h(str6);
                                            Map map2222222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = dVar2.a;
                                            if (str4 != null) {
                                            }
                                            s0Var.a = Integer.toString(i26);
                                            s0Var.o = str6;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i272222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str2;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var2222222222222222222 = new t0(s0Var);
                                            o3.w Z12222222222222222222 = mVar.Z1(dVar2.c, i13);
                                            dVar2.X = Z12222222222222222222;
                                            Z12222222222222222222.b(t0Var2222222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar5 = eVar5;
                                            break;
                                        case 20:
                                            mVar = mVar2;
                                            i12 = -1;
                                            u10 = -1;
                                            list = null;
                                            str2 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i2722222222222222222222 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = f5.o.h(str6);
                                            Map map22222222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = dVar2.a;
                                            if (str4 != null) {
                                            }
                                            s0Var.a = Integer.toString(i26);
                                            s0Var.o = str6;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i2722222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str2;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var22222222222222222222 = new t0(s0Var);
                                            o3.w Z122222222222222222222 = mVar.Z1(dVar2.c, i13);
                                            dVar2.X = Z122222222222222222222;
                                            Z122222222222222222222.b(t0Var22222222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar5 = eVar5;
                                            break;
                                        case 22:
                                            mVar = mVar2;
                                            if (dVar2.P == 32) {
                                                str6 = "audio/raw";
                                                i12 = -1;
                                                u10 = 4;
                                                list = null;
                                                str2 = null;
                                                if (dVar2.N != null) {
                                                }
                                                int i27222222222222222222222 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                                s0Var = new s0();
                                                h = f5.o.h(str6);
                                                Map map222222222222222222222 = h0;
                                                if (!h) {
                                                }
                                                str4 = dVar2.a;
                                                if (str4 != null) {
                                                }
                                                s0Var.a = Integer.toString(i26);
                                                s0Var.o = str6;
                                                s0Var.p = i12;
                                                s0Var.c = dVar2.W;
                                                s0Var.d = i27222222222222222222222;
                                                s0Var.q = list;
                                                s0Var.h = str2;
                                                s0Var.r = dVar2.l;
                                                t0 t0Var222222222222222222222 = new t0(s0Var);
                                                o3.w Z1222222222222222222222 = mVar.Z1(dVar2.c, i13);
                                                dVar2.X = Z1222222222222222222222;
                                                Z1222222222222222222222.b(t0Var222222222222222222222);
                                                sparseArray.put(dVar2.c, dVar2);
                                                eVar5 = eVar5;
                                            } else {
                                                f5.a.K("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + dVar2.P + ". Setting mimeType to audio/x-unknown");
                                                str6 = "audio/x-unknown";
                                                i12 = -1;
                                                u10 = -1;
                                                list = null;
                                                str2 = null;
                                                if (dVar2.N != null) {
                                                }
                                                int i272222222222222222222222 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                                s0Var = new s0();
                                                h = f5.o.h(str6);
                                                Map map2222222222222222222222 = h0;
                                                if (!h) {
                                                }
                                                str4 = dVar2.a;
                                                if (str4 != null) {
                                                }
                                                s0Var.a = Integer.toString(i26);
                                                s0Var.o = str6;
                                                s0Var.p = i12;
                                                s0Var.c = dVar2.W;
                                                s0Var.d = i272222222222222222222222;
                                                s0Var.q = list;
                                                s0Var.h = str2;
                                                s0Var.r = dVar2.l;
                                                t0 t0Var2222222222222222222222 = new t0(s0Var);
                                                o3.w Z12222222222222222222222 = mVar.Z1(dVar2.c, i13);
                                                dVar2.X = Z12222222222222222222222;
                                                Z12222222222222222222222.b(t0Var2222222222222222222222);
                                                sparseArray.put(dVar2.c, dVar2);
                                                eVar5 = eVar5;
                                            }
                                            break;
                                        case 23:
                                            mVar = mVar2;
                                            int i43 = dVar2.P;
                                            if (i43 == 8) {
                                                str6 = "audio/raw";
                                                i12 = -1;
                                                u10 = 3;
                                            } else if (i43 == 16) {
                                                str6 = "audio/raw";
                                                i12 = -1;
                                                u10 = TLObject.FLAG_28;
                                            } else {
                                                f5.a.K("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + dVar2.P + ". Setting mimeType to audio/x-unknown");
                                                str6 = "audio/x-unknown";
                                                i12 = -1;
                                                u10 = -1;
                                            }
                                            list = null;
                                            str2 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i2722222222222222222222222 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = f5.o.h(str6);
                                            Map map22222222222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = dVar2.a;
                                            if (str4 != null) {
                                            }
                                            s0Var.a = Integer.toString(i26);
                                            s0Var.o = str6;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i2722222222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str2;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var22222222222222222222222 = new t0(s0Var);
                                            o3.w Z122222222222222222222222 = mVar.Z1(dVar2.c, i13);
                                            dVar2.X = Z122222222222222222222222;
                                            Z122222222222222222222222.b(t0Var22222222222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar5 = eVar5;
                                            break;
                                        case 24:
                                            mVar = mVar2;
                                            u10 = d0.u(dVar2.P);
                                            if (u10 == 0) {
                                                f5.a.K("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + dVar2.P + ". Setting mimeType to audio/x-unknown");
                                                str6 = "audio/x-unknown";
                                                i12 = -1;
                                                u10 = -1;
                                                list = null;
                                                str2 = null;
                                                if (dVar2.N != null) {
                                                }
                                                int i27222222222222222222222222 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                                s0Var = new s0();
                                                h = f5.o.h(str6);
                                                Map map222222222222222222222222 = h0;
                                                if (!h) {
                                                }
                                                str4 = dVar2.a;
                                                if (str4 != null) {
                                                }
                                                s0Var.a = Integer.toString(i26);
                                                s0Var.o = str6;
                                                s0Var.p = i12;
                                                s0Var.c = dVar2.W;
                                                s0Var.d = i27222222222222222222222222;
                                                s0Var.q = list;
                                                s0Var.h = str2;
                                                s0Var.r = dVar2.l;
                                                t0 t0Var222222222222222222222222 = new t0(s0Var);
                                                o3.w Z1222222222222222222222222 = mVar.Z1(dVar2.c, i13);
                                                dVar2.X = Z1222222222222222222222222;
                                                Z1222222222222222222222222.b(t0Var222222222222222222222222);
                                                sparseArray.put(dVar2.c, dVar2);
                                                eVar5 = eVar5;
                                            }
                                            str6 = "audio/raw";
                                            i12 = -1;
                                            list = null;
                                            str2 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i272222222222222222222222222 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = f5.o.h(str6);
                                            Map map2222222222222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = dVar2.a;
                                            if (str4 != null) {
                                            }
                                            s0Var.a = Integer.toString(i26);
                                            s0Var.o = str6;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i272222222222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str2;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var2222222222222222222222222 = new t0(s0Var);
                                            o3.w Z12222222222222222222222222 = mVar.Z1(dVar2.c, i13);
                                            dVar2.X = Z12222222222222222222222222;
                                            Z12222222222222222222222222.b(t0Var2222222222222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar5 = eVar5;
                                            break;
                                        case 25:
                                            mVar = mVar2;
                                            list = z.t(d0, dVar2.a(str5));
                                            str6 = "text/x-ssa";
                                            i12 = -1;
                                            u10 = -1;
                                            str2 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i2722222222222222222222222222 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = f5.o.h(str6);
                                            Map map22222222222222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = dVar2.a;
                                            if (str4 != null) {
                                            }
                                            s0Var.a = Integer.toString(i26);
                                            s0Var.o = str6;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i2722222222222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str2;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var22222222222222222222222222 = new t0(s0Var);
                                            o3.w Z122222222222222222222222222 = mVar.Z1(dVar2.c, i13);
                                            dVar2.X = Z122222222222222222222222222;
                                            Z122222222222222222222222222.b(t0Var22222222222222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar5 = eVar5;
                                            break;
                                        case 26:
                                            mVar = mVar2;
                                            g5.f a12 = g5.f.a(new w(dVar2.a(dVar2.b)));
                                            list2 = a12.a;
                                            dVar2.Y = a12.b;
                                            str3 = a12.d;
                                            str6 = "video/hevc";
                                            str2 = str3;
                                            list = list2;
                                            i12 = -1;
                                            u10 = -1;
                                            if (dVar2.N != null) {
                                            }
                                            int i27222222222222222222222222222 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = f5.o.h(str6);
                                            Map map222222222222222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = dVar2.a;
                                            if (str4 != null) {
                                            }
                                            s0Var.a = Integer.toString(i26);
                                            s0Var.o = str6;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i27222222222222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str2;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var222222222222222222222222222 = new t0(s0Var);
                                            o3.w Z1222222222222222222222222222 = mVar.Z1(dVar2.c, i13);
                                            dVar2.X = Z1222222222222222222222222222;
                                            Z1222222222222222222222222222.b(t0Var222222222222222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar5 = eVar5;
                                            break;
                                        case 27:
                                            mVar = mVar2;
                                            str6 = "text/vtt";
                                            i12 = -1;
                                            u10 = -1;
                                            list = null;
                                            str2 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i272222222222222222222222222222 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = f5.o.h(str6);
                                            Map map2222222222222222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = dVar2.a;
                                            if (str4 != null) {
                                            }
                                            s0Var.a = Integer.toString(i26);
                                            s0Var.o = str6;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i272222222222222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str2;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var2222222222222222222222222222 = new t0(s0Var);
                                            o3.w Z12222222222222222222222222222 = mVar.Z1(dVar2.c, i13);
                                            dVar2.X = Z12222222222222222222222222222;
                                            Z12222222222222222222222222222.b(t0Var2222222222222222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar5 = eVar5;
                                            break;
                                        case 28:
                                            mVar = mVar2;
                                            str6 = "application/x-subrip";
                                            i12 = -1;
                                            u10 = -1;
                                            list = null;
                                            str2 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i2722222222222222222222222222222 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = f5.o.h(str6);
                                            Map map22222222222222222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = dVar2.a;
                                            if (str4 != null) {
                                            }
                                            s0Var.a = Integer.toString(i26);
                                            s0Var.o = str6;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i2722222222222222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str2;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var22222222222222222222222222222 = new t0(s0Var);
                                            o3.w Z122222222222222222222222222222 = mVar.Z1(dVar2.c, i13);
                                            dVar2.X = Z122222222222222222222222222222;
                                            Z122222222222222222222222222222.b(t0Var22222222222222222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar5 = eVar5;
                                            break;
                                        case 29:
                                            mVar = mVar2;
                                            str6 = "video/mpeg2";
                                            i12 = -1;
                                            u10 = -1;
                                            list = null;
                                            str2 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i27222222222222222222222222222222 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = f5.o.h(str6);
                                            Map map222222222222222222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = dVar2.a;
                                            if (str4 != null) {
                                            }
                                            s0Var.a = Integer.toString(i26);
                                            s0Var.o = str6;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i27222222222222222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str2;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var222222222222222222222222222222 = new t0(s0Var);
                                            o3.w Z1222222222222222222222222222222 = mVar.Z1(dVar2.c, i13);
                                            dVar2.X = Z1222222222222222222222222222222;
                                            Z1222222222222222222222222222222.b(t0Var222222222222222222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar5 = eVar5;
                                            break;
                                        case MessageObject.TYPE_GIFT_STARS /* 30 */:
                                            mVar = mVar2;
                                            str6 = "audio/eac3";
                                            i12 = -1;
                                            u10 = -1;
                                            list = null;
                                            str2 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i272222222222222222222222222222222 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = f5.o.h(str6);
                                            Map map2222222222222222222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = dVar2.a;
                                            if (str4 != null) {
                                            }
                                            s0Var.a = Integer.toString(i26);
                                            s0Var.o = str6;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i272222222222222222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str2;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var2222222222222222222222222222222 = new t0(s0Var);
                                            o3.w Z12222222222222222222222222222222 = mVar.Z1(dVar2.c, i13);
                                            dVar2.X = Z12222222222222222222222222222222;
                                            Z12222222222222222222222222222222.b(t0Var2222222222222222222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar5 = eVar5;
                                            break;
                                        case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                                            mVar = mVar2;
                                            singletonList = Collections.singletonList(dVar2.a(str5));
                                            str6 = "audio/flac";
                                            list = singletonList;
                                            i12 = -1;
                                            u10 = -1;
                                            str2 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i2722222222222222222222222222222222 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = f5.o.h(str6);
                                            Map map22222222222222222222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = dVar2.a;
                                            if (str4 != null) {
                                            }
                                            s0Var.a = Integer.toString(i26);
                                            s0Var.o = str6;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i2722222222222222222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str2;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var22222222222222222222222222222222 = new t0(s0Var);
                                            o3.w Z122222222222222222222222222222222 = mVar.Z1(dVar2.c, i13);
                                            dVar2.X = Z122222222222222222222222222222222;
                                            Z122222222222222222222222222222222.b(t0Var22222222222222222222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar5 = eVar5;
                                            break;
                                        case ' ':
                                            ArrayList arrayList2 = new ArrayList(3);
                                            arrayList2.add(dVar2.a(dVar2.b));
                                            ByteBuffer allocate = ByteBuffer.allocate(8);
                                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                            mVar = mVar2;
                                            arrayList2.add(allocate.order(byteOrder).putLong(dVar2.R).array());
                                            arrayList2.add(ByteBuffer.allocate(8).order(byteOrder).putLong(dVar2.S).array());
                                            str6 = "audio/opus";
                                            list = arrayList2;
                                            i12 = 5760;
                                            u10 = -1;
                                            str2 = null;
                                            if (dVar2.N != null) {
                                            }
                                            int i27222222222222222222222222222222222 = (dVar2.V ? 1 : 0) | (!dVar2.U ? 2 : 0);
                                            s0Var = new s0();
                                            h = f5.o.h(str6);
                                            Map map222222222222222222222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = dVar2.a;
                                            if (str4 != null) {
                                            }
                                            s0Var.a = Integer.toString(i26);
                                            s0Var.o = str6;
                                            s0Var.p = i12;
                                            s0Var.c = dVar2.W;
                                            s0Var.d = i27222222222222222222222222222222222;
                                            s0Var.q = list;
                                            s0Var.h = str2;
                                            s0Var.r = dVar2.l;
                                            t0 t0Var222222222222222222222222222222222 = new t0(s0Var);
                                            o3.w Z1222222222222222222222222222222222 = mVar.Z1(dVar2.c, i13);
                                            dVar2.X = Z1222222222222222222222222222222222;
                                            Z1222222222222222222222222222222222.b(t0Var222222222222222222222222222222222);
                                            sparseArray.put(dVar2.c, dVar2);
                                            eVar5 = eVar5;
                                            break;
                                        default:
                                            throw t1.a("Unrecognized codec identifier.", null);
                                    }
                                default:
                                    eVar5.u = null;
                                    break;
                            }
                        } else {
                            if (i25 == 19899) {
                                int i44 = eVar5.w;
                                if (i44 != -1) {
                                    long j16 = eVar5.x;
                                    if (j16 != -1) {
                                        if (i44 == 475249515) {
                                            eVar5.z = j16;
                                        }
                                    }
                                }
                                throw t1.a("Mandatory element SeekID or SeekPosition not found", null);
                            }
                            if (i25 == 25152) {
                                eVar5.b(i25);
                                d dVar3 = eVar5.u;
                                if (dVar3.h) {
                                    o3.v vVar = dVar3.j;
                                    if (vVar == null) {
                                        throw t1.a("Encrypted Track found but ContentEncKeyID was not found", null);
                                    }
                                    n3.b bVar3 = new n3.b(j3.h.a, null, "video/webm", vVar.b);
                                    n3.b[] bVarArr = new n3.b[i18];
                                    bVarArr[0] = bVar3;
                                    dVar3.l = new n3.c(null, i18, bVarArr);
                                }
                            } else if (i25 == 28032) {
                                eVar5.b(i25);
                                d dVar4 = eVar5.u;
                                if (dVar4.h && dVar4.i != null) {
                                    throw t1.a("Combining encryption and compression is not supported", null);
                                }
                            } else if (i25 == 357149030) {
                                if (eVar5.r == -9223372036854775807L) {
                                    eVar5.r = 1000000L;
                                }
                                long j17 = eVar5.s;
                                if (j17 != -9223372036854775807L) {
                                    eVar5.t = eVar5.k(j17);
                                }
                            } else if (i25 == 374648427) {
                                if (sparseArray.size() == 0) {
                                    throw t1.a("No valid tracks were found", null);
                                }
                                eVar5.b0.e1();
                            } else if (i25 == 475249515) {
                                if (!eVar5.v) {
                                    m mVar3 = eVar5.b0;
                                    u uVar = eVar5.C;
                                    u uVar2 = eVar5.D;
                                    if (eVar5.q == -1 || eVar5.t == -9223372036854775807L || uVar == null || (i17 = uVar.b) == 0 || uVar2 == null || uVar2.b != i17) {
                                        oVar = new o(eVar5.t);
                                    } else {
                                        int[] iArr = new int[i17];
                                        long[] jArr = new long[i17];
                                        long[] jArr2 = new long[i17];
                                        long[] jArr3 = new long[i17];
                                        int i45 = 0;
                                        while (i45 < i17) {
                                            jArr3[i45] = uVar.e(i45);
                                            jArr[i45] = uVar2.e(i45) + eVar5.q;
                                            i45++;
                                            uVar = uVar;
                                            i17 = i17;
                                        }
                                        int i46 = i17;
                                        int i47 = 0;
                                        while (true) {
                                            int i48 = i46 - 1;
                                            if (i47 < i48) {
                                                int i49 = i47 + 1;
                                                iArr[i47] = (int) (jArr[i49] - jArr[i47]);
                                                jArr2[i47] = jArr3[i49] - jArr3[i47];
                                                i47 = i49;
                                            } else {
                                                iArr[i48] = (int) ((eVar5.p + eVar5.q) - jArr[i48]);
                                                long j18 = eVar5.t - jArr3[i48];
                                                jArr2[i48] = j18;
                                                if (j18 <= 0) {
                                                    f5.a.K("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j18);
                                                    iArr = Arrays.copyOf(iArr, i48);
                                                    jArr = Arrays.copyOf(jArr, i48);
                                                    jArr2 = Arrays.copyOf(jArr2, i48);
                                                    jArr3 = Arrays.copyOf(jArr3, i48);
                                                }
                                                oVar = new o3.f(iArr, jArr, jArr2, jArr3);
                                            }
                                        }
                                    }
                                    mVar3.D1(oVar);
                                    eVar5.v = i18;
                                }
                                eVar5.C = null;
                                eVar5.D = null;
                            }
                        }
                    } else if (eVar5.G == 2) {
                        d dVar5 = (d) sparseArray.get(eVar5.M);
                        dVar5.X.getClass();
                        if (eVar5.R > 0 && "A_OPUS".equals(dVar5.b)) {
                            w wVar3 = eVar5.n;
                            byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(eVar5.R).array();
                            wVar3.getClass();
                            wVar3.A(array.length, array);
                        }
                        int i50 = 0;
                        for (int i51 = 0; i51 < eVar5.K; i51++) {
                            i50 += eVar5.L[i51];
                        }
                        int i52 = 0;
                        while (i52 < eVar5.K) {
                            long j19 = eVar5.H + ((dVar5.e * i52) / MediaDataController.MAX_STYLE_RUNS_COUNT);
                            int i53 = eVar5.O;
                            if (i52 == 0 && !eVar5.Q) {
                                i53 |= 1;
                            }
                            int i54 = eVar5.L[i52];
                            int i55 = i50 - i54;
                            eVar5.c(dVar5, j19, i53, i54, i55);
                            i52++;
                            i50 = i55;
                        }
                        eVar5.G = 0;
                        lVar2 = lVar;
                        z13 = true;
                    }
                    lVar2 = lVar;
                    z13 = true;
                }
            }
        }
        e eVar6 = eVar;
        if (z13) {
            return 0;
        }
        int i56 = 0;
        while (true) {
            SparseArray sparseArray2 = eVar6.c;
            if (i56 >= sparseArray2.size()) {
                return -1;
            }
            d dVar6 = (d) sparseArray2.valueAt(i56);
            dVar6.X.getClass();
            x xVar = dVar6.T;
            if (xVar != null) {
                xVar.a(dVar6.X, dVar6.j);
            }
            i56++;
        }
    }

    @Override // o3.k
    public final boolean e(l lVar) {
        u uVar = new u(11, (byte) 0);
        w wVar = (w) uVar.c;
        h hVar = (h) lVar;
        long j10 = hVar.c;
        long j11 = 1024;
        if (j10 != -1 && j10 <= 1024) {
            j11 = j10;
        }
        int i10 = (int) j11;
        hVar.f(wVar.a, 0, 4, false);
        long s10 = wVar.s();
        uVar.b = 4;
        while (true) {
            if (s10 != 440786851) {
                int i11 = uVar.b + 1;
                uVar.b = i11;
                if (i11 == i10) {
                    break;
                }
                hVar.f(wVar.a, 0, 1, false);
                s10 = ((s10 << 8) & (-256)) | (wVar.a[0] & 255);
            } else {
                long g10 = uVar.g(hVar);
                long j12 = uVar.b;
                if (g10 != Long.MIN_VALUE && (j10 == -1 || j12 + g10 < j10)) {
                    while (true) {
                        long j13 = uVar.b;
                        long j14 = j12 + g10;
                        if (j13 < j14) {
                            if (uVar.g(hVar) != Long.MIN_VALUE) {
                                long g11 = uVar.g(hVar);
                                if (g11 < 0 || g11 > 2147483647L) {
                                    break;
                                }
                                if (g11 != 0) {
                                    int i12 = (int) g11;
                                    hVar.b(i12, false);
                                    uVar.b += i12;
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

    @Override // o3.k
    public final void f(long j10, long j11) {
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

    public final void h(l lVar, int i10) {
        w wVar = this.g;
        if (wVar.c >= i10) {
            return;
        }
        byte[] bArr = wVar.a;
        if (bArr.length < i10) {
            wVar.b(Math.max(bArr.length * 2, i10));
        }
        byte[] bArr2 = wVar.a;
        int i11 = wVar.c;
        lVar.readFully(bArr2, i11, i10 - i11);
        wVar.B(i10);
    }

    @Override // o3.k
    public final void i(m mVar) {
        this.b0 = mVar;
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
            return d0.O(j10, j11, 1000L);
        }
        throw t1.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public final int l(l lVar, d dVar, int i10, boolean z10) {
        int a2;
        int a10;
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
        o3.w wVar = dVar.X;
        boolean z11 = this.V;
        w wVar2 = this.j;
        if (!z11) {
            boolean z12 = dVar.h;
            w wVar3 = this.g;
            if (z12) {
                this.O &= -1073741825;
                if (!this.W) {
                    lVar.readFully(wVar3.a, 0, 1);
                    this.S++;
                    byte b10 = wVar3.a[0];
                    if ((b10 & 128) == 128) {
                        throw t1.a("Extension bit is set in signal byte", null);
                    }
                    this.Z = b10;
                    this.W = true;
                }
                byte b11 = this.Z;
                if ((b11 & 1) == 1) {
                    boolean z13 = (b11 & 2) == 2;
                    this.O |= TLObject.FLAG_30;
                    if (!this.a0) {
                        w wVar4 = this.l;
                        lVar.readFully(wVar4.a, 0, 8);
                        this.S += 8;
                        this.a0 = true;
                        wVar3.a[0] = (byte) ((z13 ? 128 : 0) | 8);
                        wVar3.C(0);
                        wVar.d(1, wVar3);
                        this.T++;
                        wVar4.C(0);
                        wVar.d(8, wVar4);
                        this.T += 8;
                    }
                    if (z13) {
                        if (!this.X) {
                            lVar.readFully(wVar3.a, 0, 1);
                            this.S++;
                            wVar3.C(0);
                            this.Y = wVar3.r();
                            this.X = true;
                        }
                        int i15 = this.Y * 4;
                        wVar3.z(i15);
                        lVar.readFully(wVar3.a, 0, i15);
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
                            int u10 = wVar3.u();
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
                        w wVar5 = this.m;
                        wVar5.A(i16, array);
                        wVar.d(i16, wVar5);
                        this.T += i16;
                    }
                }
            } else {
                byte[] bArr = dVar.i;
                if (bArr != null) {
                    wVar2.A(bArr.length, bArr);
                }
            }
            if ("A_OPUS".equals(dVar.b) ? z10 : dVar.f > 0) {
                this.O |= TLObject.FLAG_28;
                this.n.z(0);
                int i20 = (wVar2.c + i10) - this.S;
                wVar3.z(4);
                byte[] bArr2 = wVar3.a;
                bArr2[0] = (byte) ((i20 >> 24) & 255);
                bArr2[1] = (byte) ((i20 >> 16) & 255);
                bArr2[2] = (byte) ((i20 >> 8) & 255);
                bArr2[3] = (byte) (i20 & 255);
                wVar.d(4, wVar3);
                this.T += 4;
            }
            this.V = true;
        }
        int i21 = i10 + wVar2.c;
        if (!"V_MPEG4/ISO/AVC".equals(dVar.b) && !"V_MPEGH/ISO/HEVC".equals(dVar.b)) {
            if (dVar.T != null) {
                f5.a.i(wVar2.c == 0);
                dVar.T.c(lVar);
            }
            while (true) {
                int i22 = this.S;
                if (i22 >= i21) {
                    break;
                }
                int i23 = i21 - i22;
                int a11 = wVar2.a();
                if (a11 > 0) {
                    a10 = Math.min(i23, a11);
                    wVar.e(a10, wVar2);
                } else {
                    a10 = wVar.a(lVar, i23, false);
                }
                this.S += a10;
                this.T += a10;
            }
        } else {
            w wVar6 = this.f;
            byte[] bArr3 = wVar6.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i24 = dVar.Y;
            int i25 = 4 - i24;
            while (this.S < i21) {
                int i26 = this.U;
                if (i26 == 0) {
                    int min = Math.min(i24, wVar2.a());
                    lVar.readFully(bArr3, i25 + min, i24 - min);
                    if (min > 0) {
                        wVar2.c(i25, min, bArr3);
                    }
                    this.S += i24;
                    wVar6.C(0);
                    this.U = wVar6.u();
                    w wVar7 = this.e;
                    wVar7.C(0);
                    wVar.e(4, wVar7);
                    this.T += 4;
                } else {
                    int a12 = wVar2.a();
                    if (a12 > 0) {
                        a2 = Math.min(i26, a12);
                        wVar.e(a2, wVar2);
                    } else {
                        a2 = wVar.a(lVar, i26, false);
                    }
                    this.S += a2;
                    this.T += a2;
                    this.U -= a2;
                }
            }
        }
        if ("A_VORBIS".equals(dVar.b)) {
            w wVar8 = this.h;
            wVar8.C(0);
            wVar.e(4, wVar8);
            this.T += 4;
        }
        int i27 = this.T;
        j();
        return i27;
    }

    public final void m(l lVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        w wVar = this.k;
        byte[] bArr2 = wVar.a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i10);
            wVar.getClass();
            wVar.A(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        lVar.readFully(wVar.a, bArr.length, i10);
        wVar.C(0);
        wVar.B(length);
    }

    @Override // o3.k
    public final void release() {
    }
}
