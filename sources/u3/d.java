package u3;

import a4.h;
import android.util.Pair;
import android.util.SparseArray;
import b2.i;
import b2.j;
import b2.n;
import b2.r;
import b2.r0;
import b2.s0;
import c3.h0;
import c3.i0;
import c3.l;
import c3.o;
import c3.q;
import c3.s;
import c3.t;
import c3.x;
import c5.b0;
import com.google.android.gms.internal.vision.e2;
import com.google.firebase.messaging.m;
import e2.d0;
import e2.v;
import e9.a1;
import e9.g0;
import f2.p;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import z3.k;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class d implements o {
    public static final byte[] f0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] g0;
    public static final byte[] h0;
    public static final byte[] i0;
    public static final UUID j0;
    public static final Map k0;
    public long A;
    public boolean B;
    public long C;
    public long D;
    public long E;
    public b0 F;
    public b0 G;
    public boolean H;
    public boolean I;
    public int J;
    public long K;
    public long L;
    public int M;
    public int N;
    public int[] O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public long U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public boolean Z;
    public final b a;
    public boolean a0;
    public final e b;
    public int b0;
    public final SparseArray c;
    public byte c0;
    public final boolean d;
    public boolean d0;
    public final boolean e;
    public q e0;
    public final k f;
    public final v g;
    public final v h;
    public final v i;
    public final v j;
    public final v k;
    public final v l;
    public final v m;
    public final v n;
    public final v o;
    public final v p;
    public ByteBuffer q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public c x;
    public boolean y;
    public int z;

    static {
        String str = d0.a;
        g0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        h0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        i0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        j0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        e2.o(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        e2.o(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        k0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    public d(k kVar, int i10) {
        b bVar = new b();
        this.s = -1L;
        this.t = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.C = -1L;
        this.D = -1L;
        this.E = -9223372036854775807L;
        this.a = bVar;
        bVar.d = new l.d(this, 28);
        this.f = kVar;
        this.d = (i10 & 1) == 0;
        this.e = (i10 & 2) == 0;
        this.b = new e();
        this.c = new SparseArray();
        this.i = new v(4);
        this.j = new v(ByteBuffer.allocate(4).putInt(-1).array());
        this.k = new v(4);
        this.g = new v(p.a);
        this.h = new v(4);
        this.l = new v();
        this.m = new v();
        this.n = new v(8);
        this.o = new v();
        this.p = new v();
        this.O = new int[1];
    }

    public static byte[] f(long j3, long j10, String str) {
        e2.d.b(j3 != -9223372036854775807L);
        int i10 = (int) (j3 / 3600000000L);
        long j11 = j3 - (i10 * 3600000000L);
        int i11 = (int) (j11 / 60000000);
        long j12 = j11 - (i11 * 60000000);
        int i12 = (int) (j12 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j12 - (i12 * 1000000)) / j10)));
        String str2 = d0.a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    public final void a(int i10) {
        if (this.F == null || this.G == null) {
            throw s0.a(null, "Element " + i10 + " must be in a Cues");
        }
    }

    @Override // c3.o
    public final boolean b(c3.p pVar) {
        b0 b0Var = new b0(8, (byte) 0);
        v vVar = (v) b0Var.c;
        l lVar = (l) pVar;
        long j3 = lVar.c;
        long j10 = 1024;
        if (j3 != -1 && j3 <= 1024) {
            j10 = j3;
        }
        int i10 = (int) j10;
        lVar.j(vVar.a, 0, 4, false);
        long z10 = vVar.z();
        b0Var.b = 4;
        while (true) {
            if (z10 != 440786851) {
                int i11 = b0Var.b + 1;
                b0Var.b = i11;
                if (i11 == i10) {
                    break;
                }
                lVar.j(vVar.a, 0, 1, false);
                z10 = ((z10 << 8) & (-256)) | (vVar.a[0] & 255);
            } else {
                long h = b0Var.h(lVar);
                long j11 = b0Var.b;
                if (h != Long.MIN_VALUE && (j3 == -1 || j11 + h < j3)) {
                    while (true) {
                        long j12 = b0Var.b;
                        long j13 = j11 + h;
                        if (j12 < j13) {
                            if (b0Var.h(lVar) != Long.MIN_VALUE) {
                                long h10 = b0Var.h(lVar);
                                if (h10 < 0 || h10 > 2147483647L) {
                                    break;
                                }
                                if (h10 != 0) {
                                    int i12 = (int) h10;
                                    lVar.v(i12, false);
                                    b0Var.b += i12;
                                }
                            } else {
                                break;
                            }
                        } else if (j12 == j13) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void d(int i10) {
        if (this.x != null) {
            return;
        }
        throw s0.a(null, "Element " + i10 + " must be in a TrackEntry");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(c cVar, long j3, int i10, int i11, int i12) {
        byte[] f7;
        int i13;
        int i14;
        i0 i0Var = cVar.V;
        if (i0Var != null) {
            i0Var.b(cVar.Z, j3, i10, i11, i12, cVar.k);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.c) || "S_TEXT/ASS".equals(cVar.c) || "S_TEXT/SSA".equals(cVar.c) || "S_TEXT/WEBVTT".equals(cVar.c)) {
                if (this.N > 1) {
                    e2.a.n("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j10 = this.L;
                    if (j10 == -9223372036854775807L) {
                        e2.a.n("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = cVar.c;
                        v vVar = this.m;
                        byte[] bArr = vVar.a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                            case "S_TEXT/SSA":
                                f7 = f(j10, 10000L, "%01d:%02d:%02d:%02d");
                                i13 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                f7 = f(j10, 1000L, "%02d:%02d:%02d.%03d");
                                i13 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                f7 = f(j10, 1000L, "%02d:%02d:%02d,%03d");
                                i13 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(f7, 0, bArr, i13, f7.length);
                        int i15 = vVar.b;
                        while (true) {
                            if (i15 < vVar.c) {
                                if (vVar.a[i15] == 0) {
                                    vVar.I(i15);
                                } else {
                                    i15++;
                                }
                            }
                        }
                        cVar.Z.d(vVar.c, vVar);
                        i14 = i11 + vVar.c;
                        if ((i10 & TLObject.FLAG_28) != 0) {
                            int i16 = this.N;
                            v vVar2 = this.p;
                            if (i16 > 1) {
                                vVar2.G(0);
                            } else {
                                int i17 = vVar2.c;
                                cVar.Z.f(vVar2, i17, 2);
                                i14 += i17;
                            }
                        }
                        cVar.Z.c(j3, i10, i14, i12, cVar.k);
                    }
                }
            }
            i14 = i11;
            if ((i10 & TLObject.FLAG_28) != 0) {
            }
            cVar.Z.c(j3, i10, i14, i12, cVar.k);
        }
        this.I = true;
    }

    @Override // c3.o
    public final void g(q qVar) {
        if (this.e) {
            qVar = new m(qVar, this.f);
        }
        this.e0 = qVar;
    }

    @Override // c3.o
    public final void h(long j3, long j10) {
        this.E = -9223372036854775807L;
        this.J = 0;
        b bVar = this.a;
        bVar.e = 0;
        bVar.b.clear();
        e eVar = bVar.c;
        eVar.b = 0;
        eVar.c = 0;
        e eVar2 = this.b;
        eVar2.b = 0;
        eVar2.c = 0;
        k();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i10 >= sparseArray.size()) {
                return;
            }
            i0 i0Var = ((c) sparseArray.valueAt(i10)).V;
            if (i0Var != null) {
                i0Var.b = false;
                i0Var.c = 0;
            }
            i10++;
        }
    }

    @Override // c3.o
    public final List i() {
        g0 g0Var = e9.i0.b;
        return a1.e;
    }

    public final void j(c3.p pVar, int i10) {
        v vVar = this.i;
        if (vVar.c >= i10) {
            return;
        }
        byte[] bArr = vVar.a;
        if (bArr.length < i10) {
            vVar.c(Math.max(bArr.length * 2, i10));
        }
        byte[] bArr2 = vVar.a;
        int i11 = vVar.c;
        pVar.readFully(bArr2, i11, i10 - i11);
        vVar.I(i10);
    }

    public final void k() {
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = false;
        this.Z = false;
        this.a0 = false;
        this.b0 = 0;
        this.c0 = (byte) 0;
        this.d0 = false;
        this.l.G(0);
    }

    public final long l(long j3) {
        long j10 = this.t;
        if (j10 == -9223372036854775807L) {
            throw s0.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        String str = d0.a;
        return d0.Y(j3, j10, 1000L, RoundingMode.DOWN);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01bc, code lost:
    
        throw b2.s0.a(null, "Mandatory element SeekID or SeekPosition not found");
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x08d1, code lost:
    
        if (r1.r() == r11.getLeastSignificantBits()) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0c08, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:844:0x0fdb, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:845:0x0fdc, code lost:
    
        if (r5 != false) goto L874;
     */
    /* JADX WARN: Code restructure failed: missing block: B:846:0x0fde, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:847:0x0fdf, code lost:
    
        r0 = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:848:0x0fe5, code lost:
    
        if (r3 >= r0.size()) goto L939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:849:0x0fe7, code lost:
    
        r0 = (u3.c) r0.valueAt(r3);
        r0.Z.getClass();
        r1 = r0.V;
     */
    /* JADX WARN: Code restructure failed: missing block: B:850:0x0ff4, code lost:
    
        if (r1 == null) goto L941;
     */
    /* JADX WARN: Code restructure failed: missing block: B:851:0x0ff6, code lost:
    
        r1.a(r0.Z, r0.k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:853:0x0ffd, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:856:0x1000, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:857:0x1003, code lost:
    
        return 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x091f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0937  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x094a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0b27  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0b3b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0b3e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0957  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0939  */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.lang.Object, u3.c] */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52, types: [java.lang.RuntimeException] */
    @Override // c3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(c3.p pVar, s sVar) {
        c3.p pVar2;
        boolean z10;
        int i10;
        boolean z11;
        String str;
        long j3;
        boolean z12;
        int i11;
        int a2;
        d dVar;
        char c10;
        d dVar2;
        List singletonList;
        int i12;
        String str2;
        int i13;
        RuntimeException runtimeException;
        Pair pair;
        String str3;
        String str4;
        List z13;
        r rVar;
        boolean i14;
        int i15;
        int i16;
        j jVar;
        int i17;
        byte[] bArr;
        int i18;
        String str5;
        f2.a a10;
        c3.b0 tVar;
        int i19;
        long[] jArr;
        d dVar3 = this;
        dVar3.I = false;
        boolean z14 = true;
        while (true) {
            int i20 = -1;
            if (z14 && !dVar3.I) {
                b bVar = dVar3.a;
                e eVar = bVar.c;
                ArrayDeque arrayDeque = bVar.b;
                e2.d.h(bVar.d);
                while (true) {
                    a aVar = (a) arrayDeque.peek();
                    if (aVar == null || pVar.getPosition() < aVar.b) {
                        int i21 = 0;
                        if (bVar.e == 0) {
                            pVar2 = pVar;
                            int i22 = 4;
                            long b10 = eVar.b(pVar2, true, false, 4);
                            if (b10 == -2) {
                                byte[] bArr2 = bVar.a;
                                pVar2.q();
                                while (true) {
                                    pVar2.b(i21, i22, bArr2);
                                    byte b11 = bArr2[i21];
                                    int i23 = 0;
                                    while (true) {
                                        if (i23 >= 8) {
                                            i11 = -1;
                                        } else if ((e.d[i23] & b11) != 0) {
                                            i11 = i23 + 1;
                                        } else {
                                            i23++;
                                        }
                                    }
                                    if (i11 != -1 && i11 <= 4) {
                                        a2 = (int) e.a(i11, false, bArr2);
                                        Object obj = bVar.d.b;
                                        if (a2 == 357149030 || a2 == 524531317 || a2 == 475249515 || a2 == 374648427) {
                                        }
                                    }
                                    pVar2.r(1);
                                    i22 = 4;
                                    i21 = 0;
                                }
                                pVar2.r(i11);
                                j3 = a2;
                            } else {
                                j3 = b10;
                            }
                            z10 = true;
                            if (j3 == -1) {
                                z12 = false;
                                z11 = false;
                            } else {
                                bVar.f = (int) j3;
                                bVar.e = 1;
                            }
                        } else {
                            pVar2 = pVar;
                            z10 = true;
                        }
                        if (bVar.e == z10) {
                            bVar.g = eVar.b(pVar2, false, z10, 8);
                            bVar.e = 2;
                        }
                        l.d dVar4 = bVar.d;
                        int i24 = bVar.f;
                        Object obj2 = dVar4.b;
                        switch (i24) {
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
                        if (i10 == 0) {
                            pVar2.r((int) bVar.g);
                            bVar.e = 0;
                            i20 = -1;
                        } else if (i10 == 1) {
                            long position = pVar2.getPosition();
                            arrayDeque.push(new a(bVar.f, bVar.g + position));
                            l.d dVar5 = bVar.d;
                            int i25 = bVar.f;
                            long j10 = bVar.g;
                            d dVar6 = (d) dVar5.b;
                            e2.d.h(dVar6.e0);
                            if (i25 != 160) {
                                if (i25 == 174) {
                                    c cVar = new c();
                                    cVar.n = -1;
                                    cVar.o = -1;
                                    cVar.p = -1;
                                    cVar.q = -1;
                                    cVar.r = -1;
                                    cVar.s = 0;
                                    cVar.t = -1;
                                    cVar.u = 0.0f;
                                    cVar.v = 0.0f;
                                    cVar.w = 0.0f;
                                    cVar.x = null;
                                    cVar.y = -1;
                                    cVar.z = false;
                                    cVar.A = -1;
                                    cVar.B = -1;
                                    cVar.C = -1;
                                    cVar.D = MediaDataController.MAX_STYLE_RUNS_COUNT;
                                    cVar.E = 200;
                                    cVar.F = -1.0f;
                                    cVar.G = -1.0f;
                                    cVar.H = -1.0f;
                                    cVar.I = -1.0f;
                                    cVar.J = -1.0f;
                                    cVar.K = -1.0f;
                                    cVar.L = -1.0f;
                                    cVar.M = -1.0f;
                                    cVar.N = -1.0f;
                                    cVar.O = -1.0f;
                                    cVar.Q = 1;
                                    cVar.R = -1;
                                    cVar.S = 8000;
                                    cVar.T = 0L;
                                    cVar.U = 0L;
                                    cVar.X = true;
                                    cVar.Y = "eng";
                                    dVar6.x = cVar;
                                    cVar.a = dVar6.w;
                                } else if (i25 == 187) {
                                    dVar6.H = false;
                                } else if (i25 == 19899) {
                                    dVar6.z = -1;
                                    dVar6.A = -1L;
                                } else if (i25 == 20533) {
                                    dVar6.d(i25);
                                    dVar6.x.i = true;
                                } else if (i25 == 21968) {
                                    dVar6.d(i25);
                                    dVar6.x.z = true;
                                } else if (i25 == 408125543) {
                                    long j11 = dVar6.s;
                                    if (j11 != -1 && j11 != position) {
                                        throw s0.a(null, "Multiple Segment elements not supported");
                                    }
                                    dVar6.s = position;
                                    dVar6.r = j10;
                                } else if (i25 == 475249515) {
                                    dVar6.F = new b0(2, (byte) 0);
                                    dVar6.G = new b0(2, (byte) 0);
                                } else if (i25 == 524531317 && !dVar6.y) {
                                    if (!dVar6.d || dVar6.C == -1) {
                                        dVar6.e0.P1(new t(dVar6.v));
                                        dVar6.y = true;
                                    } else {
                                        dVar6.B = true;
                                    }
                                }
                                z11 = false;
                            } else {
                                z11 = false;
                                dVar6.T = false;
                                dVar6.U = 0L;
                            }
                            bVar.e = z11 ? 1 : 0;
                        } else if (i10 == 2) {
                            long j12 = bVar.g;
                            if (j12 > 8) {
                                throw s0.a(null, "Invalid integer size: " + bVar.g);
                            }
                            dVar4.q(i24, bVar.a(pVar2, (int) j12));
                            z11 = false;
                            bVar.e = 0;
                        } else if (i10 == 3) {
                            long j13 = bVar.g;
                            if (j13 > 2147483647L) {
                                throw s0.a(null, "String element size: " + bVar.g);
                            }
                            int i26 = (int) j13;
                            if (i26 == 0) {
                                str = "";
                            } else {
                                byte[] bArr3 = new byte[i26];
                                pVar2.readFully(bArr3, 0, i26);
                                while (i26 > 0 && bArr3[i26 - 1] == 0) {
                                    i26--;
                                }
                                str = new String(bArr3, 0, i26);
                            }
                            d dVar7 = (d) dVar4.b;
                            if (i24 == 134) {
                                dVar7.d(i24);
                                dVar7.x.c = str;
                            } else if (i24 == 17026) {
                                if (!"webm".equals(str) && !"matroska".equals(str)) {
                                    throw s0.a(null, "DocType " + str + " not supported");
                                }
                                dVar7.w = str.equals("webm");
                            } else if (i24 == 21358) {
                                dVar7.d(i24);
                                dVar7.x.b = str;
                            } else if (i24 == 2274716) {
                                dVar7.d(i24);
                                dVar7.x.Y = str;
                            }
                            z11 = false;
                            bVar.e = 0;
                        } else if (i10 == 4) {
                            dVar4.c(i24, (int) bVar.g, pVar2);
                            z11 = false;
                            bVar.e = 0;
                        } else {
                            if (i10 != 5) {
                                throw s0.a(null, "Invalid element type " + i10);
                            }
                            long j14 = bVar.g;
                            if (j14 != 4 && j14 != 8) {
                                throw s0.a(null, "Invalid float size: " + bVar.g);
                            }
                            int i27 = (int) j14;
                            double intBitsToFloat = i27 == 4 ? Float.intBitsToFloat((int) r5) : Double.longBitsToDouble(bVar.a(pVar2, i27));
                            d dVar8 = (d) dVar4.b;
                            if (i24 == 181) {
                                dVar8.d(i24);
                                dVar8.x.S = (int) intBitsToFloat;
                            } else if (i24 != 17545) {
                                switch (i24) {
                                    case 21969:
                                        dVar8.d(i24);
                                        dVar8.x.F = (float) intBitsToFloat;
                                        break;
                                    case 21970:
                                        dVar8.d(i24);
                                        dVar8.x.G = (float) intBitsToFloat;
                                        break;
                                    case 21971:
                                        dVar8.d(i24);
                                        dVar8.x.H = (float) intBitsToFloat;
                                        break;
                                    case 21972:
                                        dVar8.d(i24);
                                        dVar8.x.I = (float) intBitsToFloat;
                                        break;
                                    case 21973:
                                        dVar8.d(i24);
                                        dVar8.x.J = (float) intBitsToFloat;
                                        break;
                                    case 21974:
                                        dVar8.d(i24);
                                        dVar8.x.K = (float) intBitsToFloat;
                                        break;
                                    case 21975:
                                        dVar8.d(i24);
                                        dVar8.x.L = (float) intBitsToFloat;
                                        break;
                                    case 21976:
                                        dVar8.d(i24);
                                        dVar8.x.M = (float) intBitsToFloat;
                                        break;
                                    case 21977:
                                        dVar8.d(i24);
                                        dVar8.x.N = (float) intBitsToFloat;
                                        break;
                                    case 21978:
                                        dVar8.d(i24);
                                        dVar8.x.O = (float) intBitsToFloat;
                                        break;
                                    default:
                                        switch (i24) {
                                            case 30323:
                                                dVar8.d(i24);
                                                dVar8.x.u = (float) intBitsToFloat;
                                                break;
                                            case 30324:
                                                dVar8.d(i24);
                                                dVar8.x.v = (float) intBitsToFloat;
                                                break;
                                            case 30325:
                                                dVar8.d(i24);
                                                dVar8.x.w = (float) intBitsToFloat;
                                                break;
                                        }
                                }
                            } else {
                                dVar8.u = (long) intBitsToFloat;
                            }
                            z11 = false;
                            bVar.e = 0;
                        }
                    } else {
                        l.d dVar9 = bVar.d;
                        int i28 = ((a) arrayDeque.pop()).a;
                        d dVar10 = (d) dVar9.b;
                        SparseArray sparseArray = dVar10.c;
                        e2.d.h(dVar10.e0);
                        if (i28 != 160) {
                            if (i28 == 174) {
                                ?? r32 = dVar10.x;
                                e2.d.h(r32);
                                String str6 = r32.c;
                                if (str6 == null) {
                                    throw s0.a(null, "CodecId is missing in TrackEntry element");
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
                                    case "S_TEXT/SSA":
                                    case "V_MPEGH/ISO/HEVC":
                                    case "S_TEXT/WEBVTT":
                                    case "S_TEXT/UTF8":
                                    case "V_MPEG2":
                                    case "A_EAC3":
                                    case "A_FLAC":
                                    case "A_OPUS":
                                        q qVar = dVar10.e0;
                                        int i29 = r32.d;
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
                                            case 738614379:
                                                if (str6.equals("S_TEXT/SSA")) {
                                                    c10 = 26;
                                                    break;
                                                }
                                                c10 = 65535;
                                                break;
                                            case 855502857:
                                                if (str6.equals("V_MPEGH/ISO/HEVC")) {
                                                    c10 = 27;
                                                    break;
                                                }
                                                c10 = 65535;
                                                break;
                                            case 1045209816:
                                                if (str6.equals("S_TEXT/WEBVTT")) {
                                                    c10 = 28;
                                                    break;
                                                }
                                                c10 = 65535;
                                                break;
                                            case 1422270023:
                                                if (str6.equals("S_TEXT/UTF8")) {
                                                    c10 = 29;
                                                    break;
                                                }
                                                c10 = 65535;
                                                break;
                                            case 1809237540:
                                                if (str6.equals("V_MPEG2")) {
                                                    c10 = 30;
                                                    break;
                                                }
                                                c10 = 65535;
                                                break;
                                            case 1950749482:
                                                if (str6.equals("A_EAC3")) {
                                                    c10 = 31;
                                                    break;
                                                }
                                                c10 = 65535;
                                                break;
                                            case 1950789798:
                                                if (str6.equals("A_FLAC")) {
                                                    c10 = ' ';
                                                    break;
                                                }
                                                c10 = 65535;
                                                break;
                                            case 1951062397:
                                                if (str6.equals("A_OPUS")) {
                                                    c10 = '!';
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
                                                dVar2 = dVar10;
                                                byte[] bArr4 = r32.l;
                                                str7 = "video/mp4v-es";
                                                singletonList = bArr4 == null ? null : Collections.singletonList(bArr4);
                                                i12 = -1;
                                                str2 = null;
                                                i13 = -1;
                                                if (r32.P != null && (a10 = f2.a.a(new v(r32.P))) != null) {
                                                    str2 = a10.a;
                                                    str7 = "video/dolby-vision";
                                                }
                                                int i30 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                rVar = new r();
                                                i14 = r0.i(str7);
                                                Map map = k0;
                                                if (i14) {
                                                    rVar.I = r32.Q;
                                                    rVar.J = r32.S;
                                                    rVar.K = i12;
                                                    i15 = 1;
                                                } else if (r0.m(str7)) {
                                                    if (r32.s == 0) {
                                                        int i31 = r32.q;
                                                        i16 = -1;
                                                        if (i31 == -1) {
                                                            i31 = r32.n;
                                                        }
                                                        r32.q = i31;
                                                        int i32 = r32.r;
                                                        if (i32 == -1) {
                                                            i32 = r32.o;
                                                        }
                                                        r32.r = i32;
                                                    } else {
                                                        i16 = -1;
                                                    }
                                                    float f7 = (r32.q == i16 || (i18 = r32.r) == i16) ? -1.0f : (r32.o * r0) / (r32.n * i18);
                                                    if (r32.z) {
                                                        if (r32.F == -1.0f || r32.G == -1.0f || r32.H == -1.0f || r32.I == -1.0f || r32.J == -1.0f || r32.K == -1.0f || r32.L == -1.0f || r32.M == -1.0f || r32.N == -1.0f || r32.O == -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            byte[] bArr5 = new byte[25];
                                                            ByteBuffer order = ByteBuffer.wrap(bArr5).order(ByteOrder.LITTLE_ENDIAN);
                                                            order.put((byte) 0);
                                                            order.putShort((short) ((r32.F * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((r32.G * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((r32.H * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((r32.I * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((r32.J * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((r32.K * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((r32.L * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((r32.M * 50000.0f) + 0.5f));
                                                            order.putShort((short) (r32.N + 0.5f));
                                                            order.putShort((short) (r32.O + 0.5f));
                                                            order.putShort((short) r32.D);
                                                            order.putShort((short) r32.E);
                                                            bArr = bArr5;
                                                        }
                                                        int i33 = r32.A;
                                                        int i34 = r32.C;
                                                        int i35 = r32.B;
                                                        int i36 = r32.p;
                                                        jVar = new j(i33, i34, i35, bArr, i36, i36);
                                                    } else {
                                                        jVar = null;
                                                    }
                                                    String str8 = r32.b;
                                                    int intValue = (str8 == null || !map.containsKey(str8)) ? -1 : ((Integer) map.get(r32.b)).intValue();
                                                    if (r32.t == 0 && Float.compare(r32.u, 0.0f) == 0 && Float.compare(r32.v, 0.0f) == 0) {
                                                        if (Float.compare(r32.w, 0.0f) == 0) {
                                                            i17 = 0;
                                                        } else if (Float.compare(r32.w, 90.0f) == 0) {
                                                            i17 = 90;
                                                        } else if (Float.compare(r32.w, -180.0f) == 0 || Float.compare(r32.w, 180.0f) == 0) {
                                                            i17 = 180;
                                                        } else if (Float.compare(r32.w, -90.0f) == 0) {
                                                            i17 = 270;
                                                        }
                                                        rVar.x = r32.n;
                                                        rVar.y = r32.o;
                                                        rVar.D = f7;
                                                        rVar.C = i17;
                                                        rVar.E = r32.x;
                                                        rVar.F = r32.y;
                                                        rVar.G = jVar;
                                                        i15 = 2;
                                                    }
                                                    i17 = intValue;
                                                    rVar.x = r32.n;
                                                    rVar.y = r32.o;
                                                    rVar.D = f7;
                                                    rVar.C = i17;
                                                    rVar.E = r32.x;
                                                    rVar.F = r32.y;
                                                    rVar.G = jVar;
                                                    i15 = 2;
                                                } else {
                                                    if (!"application/x-subrip".equals(str7) && !"text/x-ssa".equals(str7) && !"text/vtt".equals(str7) && !"application/vobsub".equals(str7) && !"application/pgs".equals(str7) && !"application/dvbsubs".equals(str7)) {
                                                        throw s0.a(null, "Unexpected MIME type.");
                                                    }
                                                    i15 = 3;
                                                }
                                                str5 = r32.b;
                                                if (str5 != null && !map.containsKey(str5)) {
                                                    rVar.b = r32.b;
                                                }
                                                rVar.a = Integer.toString(i29);
                                                rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                rVar.q = r0.n(str7);
                                                rVar.r = i13;
                                                rVar.d = r32.Y;
                                                rVar.e = i30;
                                                rVar.t = singletonList;
                                                rVar.j = str2;
                                                rVar.u = r32.m;
                                                b2.s sVar2 = new b2.s(rVar);
                                                h0 R1 = qVar.R1(r32.d, i15);
                                                r32.Z = R1;
                                                R1.b(sVar2);
                                                sparseArray.put(r32.d, r32);
                                                dVar10 = dVar2;
                                                break;
                                            case 2:
                                                dVar2 = dVar10;
                                                v vVar = new v(r32.a(r32.c));
                                                try {
                                                    int q6 = vVar.q();
                                                    if (q6 != 1) {
                                                        if (q6 == 65534) {
                                                            vVar.J(24);
                                                            long r10 = vVar.r();
                                                            UUID uuid = j0;
                                                            if (r10 == uuid.getMostSignificantBits()) {
                                                                break;
                                                            }
                                                        }
                                                        e2.a.n("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                        str7 = "audio/x-unknown";
                                                        i12 = -1;
                                                        str2 = null;
                                                        i13 = -1;
                                                        singletonList = null;
                                                        if (r32.P != null) {
                                                            str2 = a10.a;
                                                            str7 = "video/dolby-vision";
                                                            break;
                                                        }
                                                        int i302 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                        rVar = new r();
                                                        i14 = r0.i(str7);
                                                        Map map2 = k0;
                                                        if (i14) {
                                                        }
                                                        str5 = r32.b;
                                                        if (str5 != null) {
                                                            rVar.b = r32.b;
                                                            break;
                                                        }
                                                        rVar.a = Integer.toString(i29);
                                                        rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                        rVar.q = r0.n(str7);
                                                        rVar.r = i13;
                                                        rVar.d = r32.Y;
                                                        rVar.e = i302;
                                                        rVar.t = singletonList;
                                                        rVar.j = str2;
                                                        rVar.u = r32.m;
                                                        b2.s sVar22 = new b2.s(rVar);
                                                        h0 R12 = qVar.R1(r32.d, i15);
                                                        r32.Z = R12;
                                                        R12.b(sVar22);
                                                        sparseArray.put(r32.d, r32);
                                                        dVar10 = dVar2;
                                                    }
                                                    int i37 = r32.R;
                                                    String str9 = d0.a;
                                                    int B = d0.B(i37, ByteOrder.LITTLE_ENDIAN);
                                                    if (B == 0) {
                                                        e2.a.n("MatroskaExtractor", "Unsupported PCM bit depth: " + r32.R + ". Setting mimeType to audio/x-unknown");
                                                        str7 = "audio/x-unknown";
                                                        i12 = -1;
                                                        str2 = null;
                                                        i13 = -1;
                                                        singletonList = null;
                                                        if (r32.P != null) {
                                                        }
                                                        int i3022 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                        rVar = new r();
                                                        i14 = r0.i(str7);
                                                        Map map22 = k0;
                                                        if (i14) {
                                                        }
                                                        str5 = r32.b;
                                                        if (str5 != null) {
                                                        }
                                                        rVar.a = Integer.toString(i29);
                                                        rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                        rVar.q = r0.n(str7);
                                                        rVar.r = i13;
                                                        rVar.d = r32.Y;
                                                        rVar.e = i3022;
                                                        rVar.t = singletonList;
                                                        rVar.j = str2;
                                                        rVar.u = r32.m;
                                                        b2.s sVar222 = new b2.s(rVar);
                                                        h0 R122 = qVar.R1(r32.d, i15);
                                                        r32.Z = R122;
                                                        R122.b(sVar222);
                                                        sparseArray.put(r32.d, r32);
                                                        dVar10 = dVar2;
                                                    } else {
                                                        i12 = B;
                                                        str7 = "audio/raw";
                                                        str2 = null;
                                                        i13 = -1;
                                                        singletonList = null;
                                                        if (r32.P != null) {
                                                        }
                                                        int i30222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                        rVar = new r();
                                                        i14 = r0.i(str7);
                                                        Map map222 = k0;
                                                        if (i14) {
                                                        }
                                                        str5 = r32.b;
                                                        if (str5 != null) {
                                                        }
                                                        rVar.a = Integer.toString(i29);
                                                        rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                        rVar.q = r0.n(str7);
                                                        rVar.r = i13;
                                                        rVar.d = r32.Y;
                                                        rVar.e = i30222;
                                                        rVar.t = singletonList;
                                                        rVar.j = str2;
                                                        rVar.u = r32.m;
                                                        b2.s sVar2222 = new b2.s(rVar);
                                                        h0 R1222 = qVar.R1(r32.d, i15);
                                                        r32.Z = R1222;
                                                        R1222.b(sVar2222);
                                                        sparseArray.put(r32.d, r32);
                                                        dVar10 = dVar2;
                                                    }
                                                } catch (ArrayIndexOutOfBoundsException unused) {
                                                    throw s0.a(null, "Error parsing MS/ACM codec private");
                                                }
                                                break;
                                            case 3:
                                                dVar2 = dVar10;
                                                r32.V = new i0();
                                                str7 = "audio/true-hd";
                                                i12 = -1;
                                                str2 = null;
                                                i13 = -1;
                                                singletonList = null;
                                                if (r32.P != null) {
                                                }
                                                int i302222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                rVar = new r();
                                                i14 = r0.i(str7);
                                                Map map2222 = k0;
                                                if (i14) {
                                                }
                                                str5 = r32.b;
                                                if (str5 != null) {
                                                }
                                                rVar.a = Integer.toString(i29);
                                                rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                rVar.q = r0.n(str7);
                                                rVar.r = i13;
                                                rVar.d = r32.Y;
                                                rVar.e = i302222;
                                                rVar.t = singletonList;
                                                rVar.j = str2;
                                                rVar.u = r32.m;
                                                b2.s sVar22222 = new b2.s(rVar);
                                                h0 R12222 = qVar.R1(r32.d, i15);
                                                r32.Z = R12222;
                                                R12222.b(sVar22222);
                                                sparseArray.put(r32.d, r32);
                                                dVar10 = dVar2;
                                                break;
                                            case 4:
                                                byte[] a11 = r32.a(str6);
                                                try {
                                                    try {
                                                        if (a11[0] != 2) {
                                                            throw s0.a(null, "Error parsing vorbis codec private");
                                                        }
                                                        int i38 = 0;
                                                        int i39 = 1;
                                                        while (true) {
                                                            int i40 = i39;
                                                            int i41 = a11[i39] & 255;
                                                            if (i41 == 255) {
                                                                i38 += 255;
                                                                i39 = i40 + 1;
                                                            } else {
                                                                int i42 = i40 + 1;
                                                                int i43 = i38 + i41;
                                                                int i44 = 0;
                                                                while (true) {
                                                                    int i45 = a11[i42] & 255;
                                                                    if (i45 == 255) {
                                                                        i44 += 255;
                                                                        i42++;
                                                                    } else {
                                                                        int i46 = i42 + 1;
                                                                        int i47 = i44 + i45;
                                                                        if (a11[i46] != 1) {
                                                                            throw s0.a(null, "Error parsing vorbis codec private");
                                                                        }
                                                                        byte[] bArr6 = new byte[i43];
                                                                        System.arraycopy(a11, i46, bArr6, 0, i43);
                                                                        int i48 = i46 + i43;
                                                                        if (a11[i48] != 3) {
                                                                            throw s0.a(null, "Error parsing vorbis codec private");
                                                                        }
                                                                        int i49 = i48 + i47;
                                                                        if (a11[i49] != 5) {
                                                                            throw s0.a(null, "Error parsing vorbis codec private");
                                                                        }
                                                                        byte[] bArr7 = new byte[a11.length - i49];
                                                                        dVar2 = dVar10;
                                                                        System.arraycopy(a11, i49, bArr7, 0, a11.length - i49);
                                                                        ArrayList arrayList = new ArrayList(2);
                                                                        arrayList.add(bArr6);
                                                                        arrayList.add(bArr7);
                                                                        str7 = "audio/vorbis";
                                                                        singletonList = arrayList;
                                                                        i12 = -1;
                                                                        str2 = null;
                                                                        i13 = 8192;
                                                                        if (r32.P != null) {
                                                                        }
                                                                        int i3022222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                                        rVar = new r();
                                                                        i14 = r0.i(str7);
                                                                        Map map22222 = k0;
                                                                        if (i14) {
                                                                        }
                                                                        str5 = r32.b;
                                                                        if (str5 != null) {
                                                                        }
                                                                        rVar.a = Integer.toString(i29);
                                                                        rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                                        rVar.q = r0.n(str7);
                                                                        rVar.r = i13;
                                                                        rVar.d = r32.Y;
                                                                        rVar.e = i3022222;
                                                                        rVar.t = singletonList;
                                                                        rVar.j = str2;
                                                                        rVar.u = r32.m;
                                                                        b2.s sVar222222 = new b2.s(rVar);
                                                                        h0 R122222 = qVar.R1(r32.d, i15);
                                                                        r32.Z = R122222;
                                                                        R122222.b(sVar222222);
                                                                        sparseArray.put(r32.d, r32);
                                                                        dVar10 = dVar2;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } catch (ArrayIndexOutOfBoundsException unused2) {
                                                        throw s0.a(r32, "Error parsing vorbis codec private");
                                                    }
                                                } catch (ArrayIndexOutOfBoundsException unused3) {
                                                    r32 = 0;
                                                }
                                                break;
                                            case 5:
                                                str7 = "audio/mpeg-L2";
                                                dVar2 = dVar10;
                                                i12 = -1;
                                                str2 = null;
                                                i13 = 4096;
                                                singletonList = null;
                                                if (r32.P != null) {
                                                }
                                                int i30222222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                rVar = new r();
                                                i14 = r0.i(str7);
                                                Map map222222 = k0;
                                                if (i14) {
                                                }
                                                str5 = r32.b;
                                                if (str5 != null) {
                                                }
                                                rVar.a = Integer.toString(i29);
                                                rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                rVar.q = r0.n(str7);
                                                rVar.r = i13;
                                                rVar.d = r32.Y;
                                                rVar.e = i30222222;
                                                rVar.t = singletonList;
                                                rVar.j = str2;
                                                rVar.u = r32.m;
                                                b2.s sVar2222222 = new b2.s(rVar);
                                                h0 R1222222 = qVar.R1(r32.d, i15);
                                                r32.Z = R1222222;
                                                R1222222.b(sVar2222222);
                                                sparseArray.put(r32.d, r32);
                                                dVar10 = dVar2;
                                                break;
                                            case 6:
                                                str7 = "audio/mpeg";
                                                dVar2 = dVar10;
                                                i12 = -1;
                                                str2 = null;
                                                i13 = 4096;
                                                singletonList = null;
                                                if (r32.P != null) {
                                                }
                                                int i302222222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                rVar = new r();
                                                i14 = r0.i(str7);
                                                Map map2222222 = k0;
                                                if (i14) {
                                                }
                                                str5 = r32.b;
                                                if (str5 != null) {
                                                }
                                                rVar.a = Integer.toString(i29);
                                                rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                rVar.q = r0.n(str7);
                                                rVar.r = i13;
                                                rVar.d = r32.Y;
                                                rVar.e = i302222222;
                                                rVar.t = singletonList;
                                                rVar.j = str2;
                                                rVar.u = r32.m;
                                                b2.s sVar22222222 = new b2.s(rVar);
                                                h0 R12222222 = qVar.R1(r32.d, i15);
                                                r32.Z = R12222222;
                                                R12222222.b(sVar22222222);
                                                sparseArray.put(r32.d, r32);
                                                dVar10 = dVar2;
                                                break;
                                            case 7:
                                                v vVar2 = new v(r32.a(r32.c));
                                                try {
                                                    vVar2.K(16);
                                                    long o9 = vVar2.o();
                                                    if (o9 == 1482049860) {
                                                        try {
                                                            pair = new Pair("video/divx", null);
                                                        } catch (ArrayIndexOutOfBoundsException unused4) {
                                                            runtimeException = null;
                                                            throw s0.a(runtimeException, "Error parsing FourCC private data");
                                                        }
                                                    } else if (o9 == 859189832) {
                                                        pair = new Pair("video/3gpp", null);
                                                    } else {
                                                        if (o9 == 826496599) {
                                                            byte[] bArr8 = vVar2.a;
                                                            for (int i50 = vVar2.b + 20; i50 < bArr8.length - 4; i50++) {
                                                                if (bArr8[i50] == 0 && bArr8[i50 + 1] == 0 && bArr8[i50 + 2] == 1) {
                                                                    if (bArr8[i50 + 3] == 15) {
                                                                        pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr8, i50, bArr8.length)));
                                                                    }
                                                                }
                                                            }
                                                            try {
                                                                throw s0.a(null, "Failed to find FourCC VC1 initialization data");
                                                            } catch (ArrayIndexOutOfBoundsException unused5) {
                                                                runtimeException = null;
                                                                throw s0.a(runtimeException, "Error parsing FourCC private data");
                                                            }
                                                        }
                                                        e2.a.n("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                        str3 = null;
                                                        pair = new Pair("video/x-unknown", null);
                                                        str7 = (String) pair.first;
                                                        dVar2 = dVar10;
                                                        str2 = str3;
                                                        singletonList = (List) pair.second;
                                                        i12 = -1;
                                                        i13 = -1;
                                                        if (r32.P != null) {
                                                        }
                                                        int i3022222222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                        rVar = new r();
                                                        i14 = r0.i(str7);
                                                        Map map22222222 = k0;
                                                        if (i14) {
                                                        }
                                                        str5 = r32.b;
                                                        if (str5 != null) {
                                                        }
                                                        rVar.a = Integer.toString(i29);
                                                        rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                        rVar.q = r0.n(str7);
                                                        rVar.r = i13;
                                                        rVar.d = r32.Y;
                                                        rVar.e = i3022222222;
                                                        rVar.t = singletonList;
                                                        rVar.j = str2;
                                                        rVar.u = r32.m;
                                                        b2.s sVar222222222 = new b2.s(rVar);
                                                        h0 R122222222 = qVar.R1(r32.d, i15);
                                                        r32.Z = R122222222;
                                                        R122222222.b(sVar222222222);
                                                        sparseArray.put(r32.d, r32);
                                                        dVar10 = dVar2;
                                                    }
                                                    str3 = null;
                                                    str7 = (String) pair.first;
                                                    dVar2 = dVar10;
                                                    str2 = str3;
                                                    singletonList = (List) pair.second;
                                                    i12 = -1;
                                                    i13 = -1;
                                                    if (r32.P != null) {
                                                    }
                                                    int i30222222222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                    rVar = new r();
                                                    i14 = r0.i(str7);
                                                    Map map222222222 = k0;
                                                    if (i14) {
                                                    }
                                                    str5 = r32.b;
                                                    if (str5 != null) {
                                                    }
                                                    rVar.a = Integer.toString(i29);
                                                    rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                    rVar.q = r0.n(str7);
                                                    rVar.r = i13;
                                                    rVar.d = r32.Y;
                                                    rVar.e = i30222222222;
                                                    rVar.t = singletonList;
                                                    rVar.j = str2;
                                                    rVar.u = r32.m;
                                                    b2.s sVar2222222222 = new b2.s(rVar);
                                                    h0 R1222222222 = qVar.R1(r32.d, i15);
                                                    r32.Z = R1222222222;
                                                    R1222222222.b(sVar2222222222);
                                                    sparseArray.put(r32.d, r32);
                                                    dVar10 = dVar2;
                                                } catch (ArrayIndexOutOfBoundsException unused6) {
                                                    runtimeException = null;
                                                }
                                                break;
                                            case '\b':
                                                byte[] bArr9 = new byte[4];
                                                System.arraycopy(r32.a(str6), 0, bArr9, 0, 4);
                                                singletonList = e9.i0.z(bArr9);
                                                dVar2 = dVar10;
                                                str7 = "application/dvbsubs";
                                                i12 = -1;
                                                str2 = null;
                                                i13 = -1;
                                                if (r32.P != null) {
                                                }
                                                int i302222222222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                rVar = new r();
                                                i14 = r0.i(str7);
                                                Map map2222222222 = k0;
                                                if (i14) {
                                                }
                                                str5 = r32.b;
                                                if (str5 != null) {
                                                }
                                                rVar.a = Integer.toString(i29);
                                                rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                rVar.q = r0.n(str7);
                                                rVar.r = i13;
                                                rVar.d = r32.Y;
                                                rVar.e = i302222222222;
                                                rVar.t = singletonList;
                                                rVar.j = str2;
                                                rVar.u = r32.m;
                                                b2.s sVar22222222222 = new b2.s(rVar);
                                                h0 R12222222222 = qVar.R1(r32.d, i15);
                                                r32.Z = R12222222222;
                                                R12222222222.b(sVar22222222222);
                                                sparseArray.put(r32.d, r32);
                                                dVar10 = dVar2;
                                                break;
                                            case '\n':
                                                c3.d a12 = c3.d.a(new v(r32.a(r32.c)));
                                                singletonList = a12.a;
                                                r32.a0 = a12.b;
                                                str4 = a12.l;
                                                str7 = MediaController.VIDEO_MIME_TYPE;
                                                str2 = str4;
                                                dVar2 = dVar10;
                                                i12 = -1;
                                                i13 = -1;
                                                if (r32.P != null) {
                                                }
                                                int i3022222222222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                rVar = new r();
                                                i14 = r0.i(str7);
                                                Map map22222222222 = k0;
                                                if (i14) {
                                                }
                                                str5 = r32.b;
                                                if (str5 != null) {
                                                }
                                                rVar.a = Integer.toString(i29);
                                                rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                rVar.q = r0.n(str7);
                                                rVar.r = i13;
                                                rVar.d = r32.Y;
                                                rVar.e = i3022222222222;
                                                rVar.t = singletonList;
                                                rVar.j = str2;
                                                rVar.u = r32.m;
                                                b2.s sVar222222222222 = new b2.s(rVar);
                                                h0 R122222222222 = qVar.R1(r32.d, i15);
                                                r32.Z = R122222222222;
                                                R122222222222.b(sVar222222222222);
                                                sparseArray.put(r32.d, r32);
                                                dVar10 = dVar2;
                                                break;
                                            case 11:
                                                singletonList = e9.i0.z(r32.a(str6));
                                                dVar2 = dVar10;
                                                str7 = "application/vobsub";
                                                i12 = -1;
                                                str2 = null;
                                                i13 = -1;
                                                if (r32.P != null) {
                                                }
                                                int i30222222222222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                rVar = new r();
                                                i14 = r0.i(str7);
                                                Map map222222222222 = k0;
                                                if (i14) {
                                                }
                                                str5 = r32.b;
                                                if (str5 != null) {
                                                }
                                                rVar.a = Integer.toString(i29);
                                                rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                rVar.q = r0.n(str7);
                                                rVar.r = i13;
                                                rVar.d = r32.Y;
                                                rVar.e = i30222222222222;
                                                rVar.t = singletonList;
                                                rVar.j = str2;
                                                rVar.u = r32.m;
                                                b2.s sVar2222222222222 = new b2.s(rVar);
                                                h0 R1222222222222 = qVar.R1(r32.d, i15);
                                                r32.Z = R1222222222222;
                                                R1222222222222.b(sVar2222222222222);
                                                sparseArray.put(r32.d, r32);
                                                dVar10 = dVar2;
                                                break;
                                            case '\f':
                                                str7 = "audio/vnd.dts.hd";
                                                dVar2 = dVar10;
                                                i12 = -1;
                                                str2 = null;
                                                i13 = -1;
                                                singletonList = null;
                                                if (r32.P != null) {
                                                }
                                                int i302222222222222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                rVar = new r();
                                                i14 = r0.i(str7);
                                                Map map2222222222222 = k0;
                                                if (i14) {
                                                }
                                                str5 = r32.b;
                                                if (str5 != null) {
                                                }
                                                rVar.a = Integer.toString(i29);
                                                rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                rVar.q = r0.n(str7);
                                                rVar.r = i13;
                                                rVar.d = r32.Y;
                                                rVar.e = i302222222222222;
                                                rVar.t = singletonList;
                                                rVar.j = str2;
                                                rVar.u = r32.m;
                                                b2.s sVar22222222222222 = new b2.s(rVar);
                                                h0 R12222222222222 = qVar.R1(r32.d, i15);
                                                r32.Z = R12222222222222;
                                                R12222222222222.b(sVar22222222222222);
                                                sparseArray.put(r32.d, r32);
                                                dVar10 = dVar2;
                                                break;
                                            case '\r':
                                                List singletonList2 = Collections.singletonList(r32.a(str6));
                                                byte[] bArr10 = r32.l;
                                                c3.a n10 = c3.b.n(new h(bArr10, bArr10.length), false);
                                                r32.S = n10.b;
                                                r32.Q = n10.c;
                                                String str10 = n10.a;
                                                str7 = MediaController.AUDIO_MIME_TYPE;
                                                dVar2 = dVar10;
                                                str2 = str10;
                                                i13 = -1;
                                                singletonList = singletonList2;
                                                i12 = -1;
                                                if (r32.P != null) {
                                                }
                                                int i3022222222222222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                rVar = new r();
                                                i14 = r0.i(str7);
                                                Map map22222222222222 = k0;
                                                if (i14) {
                                                }
                                                str5 = r32.b;
                                                if (str5 != null) {
                                                }
                                                rVar.a = Integer.toString(i29);
                                                rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                rVar.q = r0.n(str7);
                                                rVar.r = i13;
                                                rVar.d = r32.Y;
                                                rVar.e = i3022222222222222;
                                                rVar.t = singletonList;
                                                rVar.j = str2;
                                                rVar.u = r32.m;
                                                b2.s sVar222222222222222 = new b2.s(rVar);
                                                h0 R122222222222222 = qVar.R1(r32.d, i15);
                                                r32.Z = R122222222222222;
                                                R122222222222222.b(sVar222222222222222);
                                                sparseArray.put(r32.d, r32);
                                                dVar10 = dVar2;
                                                break;
                                            case 14:
                                                str7 = "audio/ac3";
                                                dVar2 = dVar10;
                                                i12 = -1;
                                                str2 = null;
                                                i13 = -1;
                                                singletonList = null;
                                                if (r32.P != null) {
                                                }
                                                int i30222222222222222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                rVar = new r();
                                                i14 = r0.i(str7);
                                                Map map222222222222222 = k0;
                                                if (i14) {
                                                }
                                                str5 = r32.b;
                                                if (str5 != null) {
                                                }
                                                rVar.a = Integer.toString(i29);
                                                rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                rVar.q = r0.n(str7);
                                                rVar.r = i13;
                                                rVar.d = r32.Y;
                                                rVar.e = i30222222222222222;
                                                rVar.t = singletonList;
                                                rVar.j = str2;
                                                rVar.u = r32.m;
                                                b2.s sVar2222222222222222 = new b2.s(rVar);
                                                h0 R1222222222222222 = qVar.R1(r32.d, i15);
                                                r32.Z = R1222222222222222;
                                                R1222222222222222.b(sVar2222222222222222);
                                                sparseArray.put(r32.d, r32);
                                                dVar10 = dVar2;
                                                break;
                                            case 15:
                                            case 21:
                                                str7 = "audio/vnd.dts";
                                                dVar2 = dVar10;
                                                i12 = -1;
                                                str2 = null;
                                                i13 = -1;
                                                singletonList = null;
                                                if (r32.P != null) {
                                                }
                                                int i302222222222222222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                rVar = new r();
                                                i14 = r0.i(str7);
                                                Map map2222222222222222 = k0;
                                                if (i14) {
                                                }
                                                str5 = r32.b;
                                                if (str5 != null) {
                                                }
                                                rVar.a = Integer.toString(i29);
                                                rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                rVar.q = r0.n(str7);
                                                rVar.r = i13;
                                                rVar.d = r32.Y;
                                                rVar.e = i302222222222222222;
                                                rVar.t = singletonList;
                                                rVar.j = str2;
                                                rVar.u = r32.m;
                                                b2.s sVar22222222222222222 = new b2.s(rVar);
                                                h0 R12222222222222222 = qVar.R1(r32.d, i15);
                                                r32.Z = R12222222222222222;
                                                R12222222222222222.b(sVar22222222222222222);
                                                sparseArray.put(r32.d, r32);
                                                dVar10 = dVar2;
                                                break;
                                            case 16:
                                                byte[] bArr11 = r32.l;
                                                z13 = bArr11 == null ? null : e9.i0.z(bArr11);
                                                str7 = "video/av01";
                                                singletonList = z13;
                                                dVar2 = dVar10;
                                                i12 = -1;
                                                str2 = null;
                                                i13 = -1;
                                                if (r32.P != null) {
                                                }
                                                int i3022222222222222222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                rVar = new r();
                                                i14 = r0.i(str7);
                                                Map map22222222222222222 = k0;
                                                if (i14) {
                                                }
                                                str5 = r32.b;
                                                if (str5 != null) {
                                                }
                                                rVar.a = Integer.toString(i29);
                                                rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                rVar.q = r0.n(str7);
                                                rVar.r = i13;
                                                rVar.d = r32.Y;
                                                rVar.e = i3022222222222222222;
                                                rVar.t = singletonList;
                                                rVar.j = str2;
                                                rVar.u = r32.m;
                                                b2.s sVar222222222222222222 = new b2.s(rVar);
                                                h0 R122222222222222222 = qVar.R1(r32.d, i15);
                                                r32.Z = R122222222222222222;
                                                R122222222222222222.b(sVar222222222222222222);
                                                sparseArray.put(r32.d, r32);
                                                dVar10 = dVar2;
                                                break;
                                            case 17:
                                                str7 = "video/x-vnd.on2.vp8";
                                                dVar2 = dVar10;
                                                i12 = -1;
                                                str2 = null;
                                                i13 = -1;
                                                singletonList = null;
                                                if (r32.P != null) {
                                                }
                                                int i30222222222222222222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                rVar = new r();
                                                i14 = r0.i(str7);
                                                Map map222222222222222222 = k0;
                                                if (i14) {
                                                }
                                                str5 = r32.b;
                                                if (str5 != null) {
                                                }
                                                rVar.a = Integer.toString(i29);
                                                rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                rVar.q = r0.n(str7);
                                                rVar.r = i13;
                                                rVar.d = r32.Y;
                                                rVar.e = i30222222222222222222;
                                                rVar.t = singletonList;
                                                rVar.j = str2;
                                                rVar.u = r32.m;
                                                b2.s sVar2222222222222222222 = new b2.s(rVar);
                                                h0 R1222222222222222222 = qVar.R1(r32.d, i15);
                                                r32.Z = R1222222222222222222;
                                                R1222222222222222222.b(sVar2222222222222222222);
                                                sparseArray.put(r32.d, r32);
                                                dVar10 = dVar2;
                                                break;
                                            case 18:
                                                byte[] bArr12 = r32.l;
                                                z13 = bArr12 == null ? null : e9.i0.z(bArr12);
                                                str7 = "video/x-vnd.on2.vp9";
                                                singletonList = z13;
                                                dVar2 = dVar10;
                                                i12 = -1;
                                                str2 = null;
                                                i13 = -1;
                                                if (r32.P != null) {
                                                }
                                                int i302222222222222222222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                rVar = new r();
                                                i14 = r0.i(str7);
                                                Map map2222222222222222222 = k0;
                                                if (i14) {
                                                }
                                                str5 = r32.b;
                                                if (str5 != null) {
                                                }
                                                rVar.a = Integer.toString(i29);
                                                rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                rVar.q = r0.n(str7);
                                                rVar.r = i13;
                                                rVar.d = r32.Y;
                                                rVar.e = i302222222222222222222;
                                                rVar.t = singletonList;
                                                rVar.j = str2;
                                                rVar.u = r32.m;
                                                b2.s sVar22222222222222222222 = new b2.s(rVar);
                                                h0 R12222222222222222222 = qVar.R1(r32.d, i15);
                                                r32.Z = R12222222222222222222;
                                                R12222222222222222222.b(sVar22222222222222222222);
                                                sparseArray.put(r32.d, r32);
                                                dVar10 = dVar2;
                                                break;
                                            case 19:
                                                dVar2 = dVar10;
                                                str7 = "application/pgs";
                                                i12 = -1;
                                                str2 = null;
                                                i13 = -1;
                                                singletonList = null;
                                                if (r32.P != null) {
                                                }
                                                int i3022222222222222222222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                rVar = new r();
                                                i14 = r0.i(str7);
                                                Map map22222222222222222222 = k0;
                                                if (i14) {
                                                }
                                                str5 = r32.b;
                                                if (str5 != null) {
                                                }
                                                rVar.a = Integer.toString(i29);
                                                rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                rVar.q = r0.n(str7);
                                                rVar.r = i13;
                                                rVar.d = r32.Y;
                                                rVar.e = i3022222222222222222222;
                                                rVar.t = singletonList;
                                                rVar.j = str2;
                                                rVar.u = r32.m;
                                                b2.s sVar222222222222222222222 = new b2.s(rVar);
                                                h0 R122222222222222222222 = qVar.R1(r32.d, i15);
                                                r32.Z = R122222222222222222222;
                                                R122222222222222222222.b(sVar222222222222222222222);
                                                sparseArray.put(r32.d, r32);
                                                dVar10 = dVar2;
                                                break;
                                            case 20:
                                                dVar2 = dVar10;
                                                i12 = -1;
                                                str2 = null;
                                                i13 = -1;
                                                singletonList = null;
                                                if (r32.P != null) {
                                                }
                                                int i30222222222222222222222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                rVar = new r();
                                                i14 = r0.i(str7);
                                                Map map222222222222222222222 = k0;
                                                if (i14) {
                                                }
                                                str5 = r32.b;
                                                if (str5 != null) {
                                                }
                                                rVar.a = Integer.toString(i29);
                                                rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                rVar.q = r0.n(str7);
                                                rVar.r = i13;
                                                rVar.d = r32.Y;
                                                rVar.e = i30222222222222222222222;
                                                rVar.t = singletonList;
                                                rVar.j = str2;
                                                rVar.u = r32.m;
                                                b2.s sVar2222222222222222222222 = new b2.s(rVar);
                                                h0 R1222222222222222222222 = qVar.R1(r32.d, i15);
                                                r32.Z = R1222222222222222222222;
                                                R1222222222222222222222.b(sVar2222222222222222222222);
                                                sparseArray.put(r32.d, r32);
                                                dVar10 = dVar2;
                                                break;
                                            case 22:
                                                if (r32.R == 32) {
                                                    dVar2 = dVar10;
                                                    str7 = "audio/raw";
                                                    i12 = 4;
                                                    str2 = null;
                                                    i13 = -1;
                                                    singletonList = null;
                                                    if (r32.P != null) {
                                                    }
                                                    int i302222222222222222222222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                    rVar = new r();
                                                    i14 = r0.i(str7);
                                                    Map map2222222222222222222222 = k0;
                                                    if (i14) {
                                                    }
                                                    str5 = r32.b;
                                                    if (str5 != null) {
                                                    }
                                                    rVar.a = Integer.toString(i29);
                                                    rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                    rVar.q = r0.n(str7);
                                                    rVar.r = i13;
                                                    rVar.d = r32.Y;
                                                    rVar.e = i302222222222222222222222;
                                                    rVar.t = singletonList;
                                                    rVar.j = str2;
                                                    rVar.u = r32.m;
                                                    b2.s sVar22222222222222222222222 = new b2.s(rVar);
                                                    h0 R12222222222222222222222 = qVar.R1(r32.d, i15);
                                                    r32.Z = R12222222222222222222222;
                                                    R12222222222222222222222.b(sVar22222222222222222222222);
                                                    sparseArray.put(r32.d, r32);
                                                    dVar10 = dVar2;
                                                } else {
                                                    e2.a.n("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + r32.R + ". Setting mimeType to audio/x-unknown");
                                                    dVar2 = dVar10;
                                                    str7 = "audio/x-unknown";
                                                    i12 = -1;
                                                    str2 = null;
                                                    i13 = -1;
                                                    singletonList = null;
                                                    if (r32.P != null) {
                                                    }
                                                    int i3022222222222222222222222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                    rVar = new r();
                                                    i14 = r0.i(str7);
                                                    Map map22222222222222222222222 = k0;
                                                    if (i14) {
                                                    }
                                                    str5 = r32.b;
                                                    if (str5 != null) {
                                                    }
                                                    rVar.a = Integer.toString(i29);
                                                    rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                    rVar.q = r0.n(str7);
                                                    rVar.r = i13;
                                                    rVar.d = r32.Y;
                                                    rVar.e = i3022222222222222222222222;
                                                    rVar.t = singletonList;
                                                    rVar.j = str2;
                                                    rVar.u = r32.m;
                                                    b2.s sVar222222222222222222222222 = new b2.s(rVar);
                                                    h0 R122222222222222222222222 = qVar.R1(r32.d, i15);
                                                    r32.Z = R122222222222222222222222;
                                                    R122222222222222222222222.b(sVar222222222222222222222222);
                                                    sparseArray.put(r32.d, r32);
                                                    dVar10 = dVar2;
                                                }
                                                break;
                                            case 23:
                                                int i51 = r32.R;
                                                if (i51 == 8) {
                                                    dVar2 = dVar10;
                                                    str7 = "audio/raw";
                                                    i12 = 3;
                                                    str2 = null;
                                                    i13 = -1;
                                                    singletonList = null;
                                                    if (r32.P != null) {
                                                    }
                                                    int i30222222222222222222222222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                    rVar = new r();
                                                    i14 = r0.i(str7);
                                                    Map map222222222222222222222222 = k0;
                                                    if (i14) {
                                                    }
                                                    str5 = r32.b;
                                                    if (str5 != null) {
                                                    }
                                                    rVar.a = Integer.toString(i29);
                                                    rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                    rVar.q = r0.n(str7);
                                                    rVar.r = i13;
                                                    rVar.d = r32.Y;
                                                    rVar.e = i30222222222222222222222222;
                                                    rVar.t = singletonList;
                                                    rVar.j = str2;
                                                    rVar.u = r32.m;
                                                    b2.s sVar2222222222222222222222222 = new b2.s(rVar);
                                                    h0 R1222222222222222222222222 = qVar.R1(r32.d, i15);
                                                    r32.Z = R1222222222222222222222222;
                                                    R1222222222222222222222222.b(sVar2222222222222222222222222);
                                                    sparseArray.put(r32.d, r32);
                                                    dVar10 = dVar2;
                                                } else {
                                                    if (i51 == 16) {
                                                        i12 = TLObject.FLAG_28;
                                                    } else if (i51 == 24) {
                                                        i12 = 1342177280;
                                                    } else if (i51 == 32) {
                                                        i12 = 1610612736;
                                                    } else {
                                                        e2.a.n("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + r32.R + ". Setting mimeType to audio/x-unknown");
                                                        dVar2 = dVar10;
                                                        str7 = "audio/x-unknown";
                                                        i12 = -1;
                                                        str2 = null;
                                                        i13 = -1;
                                                        singletonList = null;
                                                        if (r32.P != null) {
                                                        }
                                                        int i302222222222222222222222222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                        rVar = new r();
                                                        i14 = r0.i(str7);
                                                        Map map2222222222222222222222222 = k0;
                                                        if (i14) {
                                                        }
                                                        str5 = r32.b;
                                                        if (str5 != null) {
                                                        }
                                                        rVar.a = Integer.toString(i29);
                                                        rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                        rVar.q = r0.n(str7);
                                                        rVar.r = i13;
                                                        rVar.d = r32.Y;
                                                        rVar.e = i302222222222222222222222222;
                                                        rVar.t = singletonList;
                                                        rVar.j = str2;
                                                        rVar.u = r32.m;
                                                        b2.s sVar22222222222222222222222222 = new b2.s(rVar);
                                                        h0 R12222222222222222222222222 = qVar.R1(r32.d, i15);
                                                        r32.Z = R12222222222222222222222222;
                                                        R12222222222222222222222222.b(sVar22222222222222222222222222);
                                                        sparseArray.put(r32.d, r32);
                                                        dVar10 = dVar2;
                                                    }
                                                    dVar2 = dVar10;
                                                    str7 = "audio/raw";
                                                    str2 = null;
                                                    i13 = -1;
                                                    singletonList = null;
                                                    if (r32.P != null) {
                                                    }
                                                    int i3022222222222222222222222222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                    rVar = new r();
                                                    i14 = r0.i(str7);
                                                    Map map22222222222222222222222222 = k0;
                                                    if (i14) {
                                                    }
                                                    str5 = r32.b;
                                                    if (str5 != null) {
                                                    }
                                                    rVar.a = Integer.toString(i29);
                                                    rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                    rVar.q = r0.n(str7);
                                                    rVar.r = i13;
                                                    rVar.d = r32.Y;
                                                    rVar.e = i3022222222222222222222222222;
                                                    rVar.t = singletonList;
                                                    rVar.j = str2;
                                                    rVar.u = r32.m;
                                                    b2.s sVar222222222222222222222222222 = new b2.s(rVar);
                                                    h0 R122222222222222222222222222 = qVar.R1(r32.d, i15);
                                                    r32.Z = R122222222222222222222222222;
                                                    R122222222222222222222222222.b(sVar222222222222222222222222222);
                                                    sparseArray.put(r32.d, r32);
                                                    dVar10 = dVar2;
                                                }
                                                break;
                                            case 24:
                                                int i52 = r32.R;
                                                String str11 = d0.a;
                                                int B2 = d0.B(i52, ByteOrder.LITTLE_ENDIAN);
                                                if (B2 == 0) {
                                                    e2.a.n("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + r32.R + ". Setting mimeType to audio/x-unknown");
                                                    dVar2 = dVar10;
                                                    str7 = "audio/x-unknown";
                                                    i12 = -1;
                                                    str2 = null;
                                                    i13 = -1;
                                                    singletonList = null;
                                                    if (r32.P != null) {
                                                    }
                                                    int i30222222222222222222222222222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                    rVar = new r();
                                                    i14 = r0.i(str7);
                                                    Map map222222222222222222222222222 = k0;
                                                    if (i14) {
                                                    }
                                                    str5 = r32.b;
                                                    if (str5 != null) {
                                                    }
                                                    rVar.a = Integer.toString(i29);
                                                    rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                    rVar.q = r0.n(str7);
                                                    rVar.r = i13;
                                                    rVar.d = r32.Y;
                                                    rVar.e = i30222222222222222222222222222;
                                                    rVar.t = singletonList;
                                                    rVar.j = str2;
                                                    rVar.u = r32.m;
                                                    b2.s sVar2222222222222222222222222222 = new b2.s(rVar);
                                                    h0 R1222222222222222222222222222 = qVar.R1(r32.d, i15);
                                                    r32.Z = R1222222222222222222222222222;
                                                    R1222222222222222222222222222.b(sVar2222222222222222222222222222);
                                                    sparseArray.put(r32.d, r32);
                                                    dVar10 = dVar2;
                                                } else {
                                                    dVar2 = dVar10;
                                                    i12 = B2;
                                                    str7 = "audio/raw";
                                                    str2 = null;
                                                    i13 = -1;
                                                    singletonList = null;
                                                    if (r32.P != null) {
                                                    }
                                                    int i302222222222222222222222222222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                    rVar = new r();
                                                    i14 = r0.i(str7);
                                                    Map map2222222222222222222222222222 = k0;
                                                    if (i14) {
                                                    }
                                                    str5 = r32.b;
                                                    if (str5 != null) {
                                                    }
                                                    rVar.a = Integer.toString(i29);
                                                    rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                    rVar.q = r0.n(str7);
                                                    rVar.r = i13;
                                                    rVar.d = r32.Y;
                                                    rVar.e = i302222222222222222222222222222;
                                                    rVar.t = singletonList;
                                                    rVar.j = str2;
                                                    rVar.u = r32.m;
                                                    b2.s sVar22222222222222222222222222222 = new b2.s(rVar);
                                                    h0 R12222222222222222222222222222 = qVar.R1(r32.d, i15);
                                                    r32.Z = R12222222222222222222222222222;
                                                    R12222222222222222222222222222.b(sVar22222222222222222222222222222);
                                                    sparseArray.put(r32.d, r32);
                                                    dVar10 = dVar2;
                                                }
                                                break;
                                            case 25:
                                            case 26:
                                                singletonList = e9.i0.A(g0, r32.a(str6));
                                                dVar2 = dVar10;
                                                str7 = "text/x-ssa";
                                                i12 = -1;
                                                str2 = null;
                                                i13 = -1;
                                                if (r32.P != null) {
                                                }
                                                int i3022222222222222222222222222222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                rVar = new r();
                                                i14 = r0.i(str7);
                                                Map map22222222222222222222222222222 = k0;
                                                if (i14) {
                                                }
                                                str5 = r32.b;
                                                if (str5 != null) {
                                                }
                                                rVar.a = Integer.toString(i29);
                                                rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                rVar.q = r0.n(str7);
                                                rVar.r = i13;
                                                rVar.d = r32.Y;
                                                rVar.e = i3022222222222222222222222222222;
                                                rVar.t = singletonList;
                                                rVar.j = str2;
                                                rVar.u = r32.m;
                                                b2.s sVar222222222222222222222222222222 = new b2.s(rVar);
                                                h0 R122222222222222222222222222222 = qVar.R1(r32.d, i15);
                                                r32.Z = R122222222222222222222222222222;
                                                R122222222222222222222222222222.b(sVar222222222222222222222222222222);
                                                sparseArray.put(r32.d, r32);
                                                dVar10 = dVar2;
                                                break;
                                            case 27:
                                                x a13 = x.a(new v(r32.a(r32.c)), false, null);
                                                singletonList = a13.a;
                                                r32.a0 = a13.b;
                                                str4 = a13.n;
                                                str7 = "video/hevc";
                                                str2 = str4;
                                                dVar2 = dVar10;
                                                i12 = -1;
                                                i13 = -1;
                                                if (r32.P != null) {
                                                }
                                                int i30222222222222222222222222222222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                rVar = new r();
                                                i14 = r0.i(str7);
                                                Map map222222222222222222222222222222 = k0;
                                                if (i14) {
                                                }
                                                str5 = r32.b;
                                                if (str5 != null) {
                                                }
                                                rVar.a = Integer.toString(i29);
                                                rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                rVar.q = r0.n(str7);
                                                rVar.r = i13;
                                                rVar.d = r32.Y;
                                                rVar.e = i30222222222222222222222222222222;
                                                rVar.t = singletonList;
                                                rVar.j = str2;
                                                rVar.u = r32.m;
                                                b2.s sVar2222222222222222222222222222222 = new b2.s(rVar);
                                                h0 R1222222222222222222222222222222 = qVar.R1(r32.d, i15);
                                                r32.Z = R1222222222222222222222222222222;
                                                R1222222222222222222222222222222.b(sVar2222222222222222222222222222222);
                                                sparseArray.put(r32.d, r32);
                                                dVar10 = dVar2;
                                                break;
                                            case 28:
                                                dVar2 = dVar10;
                                                str7 = "text/vtt";
                                                i12 = -1;
                                                str2 = null;
                                                i13 = -1;
                                                singletonList = null;
                                                if (r32.P != null) {
                                                }
                                                int i302222222222222222222222222222222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                rVar = new r();
                                                i14 = r0.i(str7);
                                                Map map2222222222222222222222222222222 = k0;
                                                if (i14) {
                                                }
                                                str5 = r32.b;
                                                if (str5 != null) {
                                                }
                                                rVar.a = Integer.toString(i29);
                                                rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                rVar.q = r0.n(str7);
                                                rVar.r = i13;
                                                rVar.d = r32.Y;
                                                rVar.e = i302222222222222222222222222222222;
                                                rVar.t = singletonList;
                                                rVar.j = str2;
                                                rVar.u = r32.m;
                                                b2.s sVar22222222222222222222222222222222 = new b2.s(rVar);
                                                h0 R12222222222222222222222222222222 = qVar.R1(r32.d, i15);
                                                r32.Z = R12222222222222222222222222222222;
                                                R12222222222222222222222222222222.b(sVar22222222222222222222222222222222);
                                                sparseArray.put(r32.d, r32);
                                                dVar10 = dVar2;
                                                break;
                                            case 29:
                                                dVar2 = dVar10;
                                                str7 = "application/x-subrip";
                                                i12 = -1;
                                                str2 = null;
                                                i13 = -1;
                                                singletonList = null;
                                                if (r32.P != null) {
                                                }
                                                int i3022222222222222222222222222222222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                rVar = new r();
                                                i14 = r0.i(str7);
                                                Map map22222222222222222222222222222222 = k0;
                                                if (i14) {
                                                }
                                                str5 = r32.b;
                                                if (str5 != null) {
                                                }
                                                rVar.a = Integer.toString(i29);
                                                rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                rVar.q = r0.n(str7);
                                                rVar.r = i13;
                                                rVar.d = r32.Y;
                                                rVar.e = i3022222222222222222222222222222222;
                                                rVar.t = singletonList;
                                                rVar.j = str2;
                                                rVar.u = r32.m;
                                                b2.s sVar222222222222222222222222222222222 = new b2.s(rVar);
                                                h0 R122222222222222222222222222222222 = qVar.R1(r32.d, i15);
                                                r32.Z = R122222222222222222222222222222222;
                                                R122222222222222222222222222222222.b(sVar222222222222222222222222222222222);
                                                sparseArray.put(r32.d, r32);
                                                dVar10 = dVar2;
                                                break;
                                            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                                                str7 = "video/mpeg2";
                                                dVar2 = dVar10;
                                                i12 = -1;
                                                str2 = null;
                                                i13 = -1;
                                                singletonList = null;
                                                if (r32.P != null) {
                                                }
                                                int i30222222222222222222222222222222222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                rVar = new r();
                                                i14 = r0.i(str7);
                                                Map map222222222222222222222222222222222 = k0;
                                                if (i14) {
                                                }
                                                str5 = r32.b;
                                                if (str5 != null) {
                                                }
                                                rVar.a = Integer.toString(i29);
                                                rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                rVar.q = r0.n(str7);
                                                rVar.r = i13;
                                                rVar.d = r32.Y;
                                                rVar.e = i30222222222222222222222222222222222;
                                                rVar.t = singletonList;
                                                rVar.j = str2;
                                                rVar.u = r32.m;
                                                b2.s sVar2222222222222222222222222222222222 = new b2.s(rVar);
                                                h0 R1222222222222222222222222222222222 = qVar.R1(r32.d, i15);
                                                r32.Z = R1222222222222222222222222222222222;
                                                R1222222222222222222222222222222222.b(sVar2222222222222222222222222222222222);
                                                sparseArray.put(r32.d, r32);
                                                dVar10 = dVar2;
                                                break;
                                            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                                                str7 = "audio/eac3";
                                                dVar2 = dVar10;
                                                i12 = -1;
                                                str2 = null;
                                                i13 = -1;
                                                singletonList = null;
                                                if (r32.P != null) {
                                                }
                                                int i302222222222222222222222222222222222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                rVar = new r();
                                                i14 = r0.i(str7);
                                                Map map2222222222222222222222222222222222 = k0;
                                                if (i14) {
                                                }
                                                str5 = r32.b;
                                                if (str5 != null) {
                                                }
                                                rVar.a = Integer.toString(i29);
                                                rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                rVar.q = r0.n(str7);
                                                rVar.r = i13;
                                                rVar.d = r32.Y;
                                                rVar.e = i302222222222222222222222222222222222;
                                                rVar.t = singletonList;
                                                rVar.j = str2;
                                                rVar.u = r32.m;
                                                b2.s sVar22222222222222222222222222222222222 = new b2.s(rVar);
                                                h0 R12222222222222222222222222222222222 = qVar.R1(r32.d, i15);
                                                r32.Z = R12222222222222222222222222222222222;
                                                R12222222222222222222222222222222222.b(sVar22222222222222222222222222222222222);
                                                sparseArray.put(r32.d, r32);
                                                dVar10 = dVar2;
                                                break;
                                            case ' ':
                                                z13 = Collections.singletonList(r32.a(str6));
                                                str7 = "audio/flac";
                                                singletonList = z13;
                                                dVar2 = dVar10;
                                                i12 = -1;
                                                str2 = null;
                                                i13 = -1;
                                                if (r32.P != null) {
                                                }
                                                int i3022222222222222222222222222222222222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                rVar = new r();
                                                i14 = r0.i(str7);
                                                Map map22222222222222222222222222222222222 = k0;
                                                if (i14) {
                                                }
                                                str5 = r32.b;
                                                if (str5 != null) {
                                                }
                                                rVar.a = Integer.toString(i29);
                                                rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                rVar.q = r0.n(str7);
                                                rVar.r = i13;
                                                rVar.d = r32.Y;
                                                rVar.e = i3022222222222222222222222222222222222;
                                                rVar.t = singletonList;
                                                rVar.j = str2;
                                                rVar.u = r32.m;
                                                b2.s sVar222222222222222222222222222222222222 = new b2.s(rVar);
                                                h0 R122222222222222222222222222222222222 = qVar.R1(r32.d, i15);
                                                r32.Z = R122222222222222222222222222222222222;
                                                R122222222222222222222222222222222222.b(sVar222222222222222222222222222222222222);
                                                sparseArray.put(r32.d, r32);
                                                dVar10 = dVar2;
                                                break;
                                            case '!':
                                                ArrayList arrayList2 = new ArrayList(3);
                                                arrayList2.add(r32.a(r32.c));
                                                ByteBuffer allocate = ByteBuffer.allocate(8);
                                                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                                arrayList2.add(allocate.order(byteOrder).putLong(r32.T).array());
                                                arrayList2.add(ByteBuffer.allocate(8).order(byteOrder).putLong(r32.U).array());
                                                str7 = "audio/opus";
                                                singletonList = arrayList2;
                                                dVar2 = dVar10;
                                                i12 = -1;
                                                str2 = null;
                                                i13 = 5760;
                                                if (r32.P != null) {
                                                }
                                                int i30222222222222222222222222222222222222 = (r32.X ? 1 : 0) | (r32.W ? 2 : 0);
                                                rVar = new r();
                                                i14 = r0.i(str7);
                                                Map map222222222222222222222222222222222222 = k0;
                                                if (i14) {
                                                }
                                                str5 = r32.b;
                                                if (str5 != null) {
                                                }
                                                rVar.a = Integer.toString(i29);
                                                rVar.p = r0.n(r32.a ? "video/webm" : "video/x-matroska");
                                                rVar.q = r0.n(str7);
                                                rVar.r = i13;
                                                rVar.d = r32.Y;
                                                rVar.e = i30222222222222222222222222222222222222;
                                                rVar.t = singletonList;
                                                rVar.j = str2;
                                                rVar.u = r32.m;
                                                b2.s sVar2222222222222222222222222222222222222 = new b2.s(rVar);
                                                h0 R1222222222222222222222222222222222222 = qVar.R1(r32.d, i15);
                                                r32.Z = R1222222222222222222222222222222222222;
                                                R1222222222222222222222222222222222222.b(sVar2222222222222222222222222222222222222);
                                                sparseArray.put(r32.d, r32);
                                                dVar10 = dVar2;
                                                break;
                                            default:
                                                throw s0.a(null, "Unrecognized codec identifier.");
                                        }
                                    default:
                                        dVar10.x = null;
                                        break;
                                }
                            } else if (i28 == 19899) {
                                int i53 = dVar10.z;
                                if (i53 != i20) {
                                    long j15 = dVar10.A;
                                    if (j15 != -1) {
                                        if (i53 == 475249515) {
                                            dVar10.C = j15;
                                        }
                                    }
                                }
                            } else if (i28 == 25152) {
                                dVar10.d(i28);
                                c cVar2 = dVar10.x;
                                if (cVar2.i) {
                                    c3.g0 g0Var = cVar2.k;
                                    if (g0Var == null) {
                                        throw s0.a(null, "Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                    cVar2.m = new b2.o(null, true, new n(i.a, null, "video/webm", g0Var.b));
                                }
                            } else if (i28 == 28032) {
                                dVar10.d(i28);
                                c cVar3 = dVar10.x;
                                if (cVar3.i && cVar3.j != null) {
                                    throw s0.a(null, "Combining encryption and compression is not supported");
                                }
                            } else if (i28 == 357149030) {
                                if (dVar10.t == -9223372036854775807L) {
                                    dVar10.t = 1000000L;
                                }
                                long j16 = dVar10.u;
                                if (j16 != -9223372036854775807L) {
                                    dVar10.v = dVar10.l(j16);
                                }
                            } else if (i28 == 374648427) {
                                if (sparseArray.size() == 0) {
                                    throw s0.a(null, "No valid tracks were found");
                                }
                                dVar10.e0.Z0();
                            } else if (i28 == 475249515) {
                                if (!dVar10.y) {
                                    q qVar2 = dVar10.e0;
                                    b0 b0Var = dVar10.F;
                                    b0 b0Var2 = dVar10.G;
                                    if (dVar10.s == -1 || dVar10.v == -9223372036854775807L || b0Var == null || (i19 = b0Var.b) == 0 || b0Var2 == null || b0Var2.b != i19) {
                                        tVar = new t(dVar10.v);
                                    } else {
                                        int[] iArr = new int[i19];
                                        long[] jArr2 = new long[i19];
                                        long[] jArr3 = new long[i19];
                                        long[] jArr4 = new long[i19];
                                        int i54 = 0;
                                        while (i54 < i19) {
                                            jArr4[i54] = b0Var.f(i54);
                                            jArr2[i54] = b0Var2.f(i54) + dVar10.s;
                                            i54++;
                                            jArr4 = jArr4;
                                        }
                                        long[] jArr5 = jArr4;
                                        int i55 = 0;
                                        while (true) {
                                            int i56 = i19 - 1;
                                            if (i55 < i56) {
                                                int i57 = i55 + 1;
                                                iArr[i55] = (int) (jArr2[i57] - jArr2[i55]);
                                                jArr3[i55] = jArr5[i57] - jArr5[i55];
                                                i55 = i57;
                                            } else {
                                                int i58 = i56;
                                                while (i58 > 0 && jArr5[i58] > dVar10.v) {
                                                    i58--;
                                                }
                                                iArr[i58] = (int) ((dVar10.s + dVar10.r) - jArr2[i58]);
                                                jArr3[i58] = dVar10.v - jArr5[i58];
                                                if (i58 < i56) {
                                                    e2.a.n("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration");
                                                    int i59 = i58 + 1;
                                                    iArr = Arrays.copyOf(iArr, i59);
                                                    jArr2 = Arrays.copyOf(jArr2, i59);
                                                    jArr3 = Arrays.copyOf(jArr3, i59);
                                                    jArr = Arrays.copyOf(jArr5, i59);
                                                } else {
                                                    jArr = jArr5;
                                                }
                                                tVar = new c3.j(iArr, jArr2, jArr3, jArr);
                                            }
                                        }
                                    }
                                    qVar2.P1(tVar);
                                    dVar10.y = true;
                                }
                                dVar10.F = null;
                                dVar10.G = null;
                            }
                        } else if (dVar10.J == 2) {
                            c cVar4 = (c) sparseArray.get(dVar10.P);
                            cVar4.Z.getClass();
                            if (dVar10.U > 0 && "A_OPUS".equals(cVar4.c)) {
                                v vVar3 = dVar10.p;
                                byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(dVar10.U).array();
                                vVar3.getClass();
                                vVar3.H(array.length, array);
                            }
                            int i60 = 0;
                            for (int i61 = 0; i61 < dVar10.N; i61++) {
                                i60 += dVar10.O[i61];
                            }
                            int i62 = 0;
                            while (i62 < dVar10.N) {
                                long j17 = dVar10.K + ((cVar4.f * i62) / MediaDataController.MAX_STYLE_RUNS_COUNT);
                                int i63 = dVar10.R;
                                if (i62 == 0 && !dVar10.T) {
                                    i63 |= 1;
                                }
                                int i64 = dVar10.O[i62];
                                int i65 = i60 - i64;
                                dVar10.e(cVar4, j17, i63, i64, i65);
                                i62++;
                                i60 = i65;
                            }
                            z11 = false;
                            dVar10.J = 0;
                            pVar2 = pVar;
                        }
                        z11 = false;
                        pVar2 = pVar;
                    }
                }
                if (z12) {
                    long position2 = pVar2.getPosition();
                    dVar = this;
                    if (dVar.B) {
                        dVar.D = position2;
                        sVar.a = dVar.C;
                        dVar.B = z11;
                        return 1;
                    }
                    if (dVar.y) {
                        long j18 = dVar.D;
                        if (j18 != -1) {
                            sVar.a = j18;
                            dVar.D = -1L;
                            return 1;
                        }
                    } else {
                        continue;
                    }
                } else {
                    dVar = this;
                }
                z14 = z12;
                dVar3 = dVar;
            }
        }
    }

    public final int n(c3.p pVar, c cVar, int i10, boolean z10) {
        int a2;
        int a10;
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.c)) {
            o(pVar, f0, i10);
            int i12 = this.W;
            k();
            return i12;
        }
        if ("S_TEXT/ASS".equals(cVar.c) || "S_TEXT/SSA".equals(cVar.c)) {
            o(pVar, h0, i10);
            int i13 = this.W;
            k();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(cVar.c)) {
            o(pVar, i0, i10);
            int i14 = this.W;
            k();
            return i14;
        }
        h0 h0Var = cVar.Z;
        boolean z11 = this.Y;
        v vVar = this.l;
        if (!z11) {
            boolean z12 = cVar.i;
            v vVar2 = this.i;
            if (z12) {
                this.R &= -1073741825;
                if (!this.Z) {
                    pVar.readFully(vVar2.a, 0, 1);
                    this.V++;
                    byte b10 = vVar2.a[0];
                    if ((b10 & 128) == 128) {
                        throw s0.a(null, "Extension bit is set in signal byte");
                    }
                    this.c0 = b10;
                    this.Z = true;
                }
                byte b11 = this.c0;
                if ((b11 & 1) == 1) {
                    boolean z13 = (b11 & 2) == 2;
                    this.R |= TLObject.FLAG_30;
                    if (!this.d0) {
                        v vVar3 = this.n;
                        pVar.readFully(vVar3.a, 0, 8);
                        this.V += 8;
                        this.d0 = true;
                        vVar2.a[0] = (byte) ((z13 ? 128 : 0) | 8);
                        vVar2.J(0);
                        h0Var.f(vVar2, 1, 1);
                        this.W++;
                        vVar3.J(0);
                        h0Var.f(vVar3, 8, 1);
                        this.W += 8;
                    }
                    if (z13) {
                        if (!this.a0) {
                            pVar.readFully(vVar2.a, 0, 1);
                            this.V++;
                            vVar2.J(0);
                            this.b0 = vVar2.x();
                            this.a0 = true;
                        }
                        int i15 = this.b0 * 4;
                        vVar2.G(i15);
                        pVar.readFully(vVar2.a, 0, i15);
                        this.V += i15;
                        short s10 = (short) ((this.b0 / 2) + 1);
                        int i16 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.q;
                        if (byteBuffer == null || byteBuffer.capacity() < i16) {
                            this.q = ByteBuffer.allocate(i16);
                        }
                        this.q.position(0);
                        this.q.putShort(s10);
                        int i17 = 0;
                        int i18 = 0;
                        while (true) {
                            i11 = this.b0;
                            if (i17 >= i11) {
                                break;
                            }
                            int B = vVar2.B();
                            if (i17 % 2 == 0) {
                                this.q.putShort((short) (B - i18));
                            } else {
                                this.q.putInt(B - i18);
                            }
                            i17++;
                            i18 = B;
                        }
                        int i19 = (i10 - this.V) - i18;
                        if (i11 % 2 == 1) {
                            this.q.putInt(i19);
                        } else {
                            this.q.putShort((short) i19);
                            this.q.putInt(0);
                        }
                        byte[] array = this.q.array();
                        v vVar4 = this.o;
                        vVar4.H(i16, array);
                        h0Var.f(vVar4, i16, 1);
                        this.W += i16;
                    }
                }
            } else {
                byte[] bArr = cVar.j;
                if (bArr != null) {
                    vVar.H(bArr.length, bArr);
                }
            }
            if ("A_OPUS".equals(cVar.c) ? z10 : cVar.g > 0) {
                this.R |= TLObject.FLAG_28;
                this.p.G(0);
                int i20 = (vVar.c + i10) - this.V;
                vVar2.G(4);
                byte[] bArr2 = vVar2.a;
                bArr2[0] = (byte) ((i20 >> 24) & 255);
                bArr2[1] = (byte) ((i20 >> 16) & 255);
                bArr2[2] = (byte) ((i20 >> 8) & 255);
                bArr2[3] = (byte) (i20 & 255);
                h0Var.f(vVar2, 4, 2);
                this.W += 4;
            }
            this.Y = true;
        }
        int i21 = i10 + vVar.c;
        if (!"V_MPEG4/ISO/AVC".equals(cVar.c) && !"V_MPEGH/ISO/HEVC".equals(cVar.c)) {
            if (cVar.V != null) {
                e2.d.g(vVar.c == 0);
                cVar.V.c(pVar);
            }
            while (true) {
                int i22 = this.V;
                if (i22 >= i21) {
                    break;
                }
                int i23 = i21 - i22;
                int a11 = vVar.a();
                if (a11 > 0) {
                    a10 = Math.min(i23, a11);
                    h0Var.d(a10, vVar);
                } else {
                    a10 = h0Var.a(pVar, i23, false);
                }
                this.V += a10;
                this.W += a10;
            }
        } else {
            v vVar5 = this.h;
            byte[] bArr3 = vVar5.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i24 = cVar.a0;
            int i25 = 4 - i24;
            while (this.V < i21) {
                int i26 = this.X;
                if (i26 == 0) {
                    int min = Math.min(i24, vVar.a());
                    pVar.readFully(bArr3, i25 + min, i24 - min);
                    if (min > 0) {
                        vVar.h(i25, min, bArr3);
                    }
                    this.V += i24;
                    vVar5.J(0);
                    this.X = vVar5.B();
                    v vVar6 = this.g;
                    vVar6.J(0);
                    h0Var.d(4, vVar6);
                    this.W += 4;
                } else {
                    int a12 = vVar.a();
                    if (a12 > 0) {
                        a2 = Math.min(i26, a12);
                        h0Var.d(a2, vVar);
                    } else {
                        a2 = h0Var.a(pVar, i26, false);
                    }
                    this.V += a2;
                    this.W += a2;
                    this.X -= a2;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.c)) {
            v vVar7 = this.j;
            vVar7.J(0);
            h0Var.d(4, vVar7);
            this.W += 4;
        }
        int i27 = this.W;
        k();
        return i27;
    }

    public final void o(c3.p pVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        v vVar = this.m;
        byte[] bArr2 = vVar.a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i10);
            vVar.getClass();
            vVar.H(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        pVar.readFully(vVar.a, bArr.length, i10);
        vVar.J(0);
        vVar.I(length);
    }

    @Override // c3.o
    public final o c() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
