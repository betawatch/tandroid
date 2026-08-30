package x3;

import android.util.Pair;
import android.util.SparseArray;
import h5.d0;
import h5.o;
import i5.f;
import j$.util.DesugarCollections;
import j3.m0;
import j3.n0;
import j3.r1;
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
import l3.p0;
import o3.g;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.qk0;
import p2.w;
import r3.h;
import r3.k;
import r3.l;
import r3.m;
import r3.n;
import r3.s;
import r3.u;
import r3.v;
import s8.t;
import vh.v2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
    public final h5.w e;
    public final h5.w f;
    public final h5.w g;
    public final h5.w h;
    public final h5.w i;
    public final h5.w j;
    public final h5.w k;
    public final h5.w l;
    public final h5.w m;
    public final h5.w n;
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
        int i10 = d0.a;
        d0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(r8.d.c);
        e0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        g0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        v2.i(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        v2.i(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        h0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    public d(int i10) {
        b bVar = new b();
        this.q = -1L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.a = bVar;
        bVar.d = new qk0(this, 20);
        this.d = (i10 & 1) == 0;
        this.b = new e();
        this.c = new SparseArray();
        this.g = new h5.w(4);
        this.h = new h5.w(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new h5.w(4);
        this.e = new h5.w(h5.a.d);
        this.f = new h5.w(4);
        this.j = new h5.w();
        this.k = new h5.w();
        this.l = new h5.w(8);
        this.m = new h5.w();
        this.n = new h5.w();
        this.L = new int[1];
    }

    public static byte[] f(long j10, long j11, String str) {
        h5.a.f(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (i10 * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (i11 * 60000000);
        int i12 = (int) (j13 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11)));
        int i13 = d0.a;
        return format.getBytes(r8.d.c);
    }

    public final void a(int i10) {
        if (this.C == null || this.D == null) {
            throw r1.a("Element " + i10 + " must be in a Cues", null);
        }
    }

    public final void b(int i10) {
        if (this.u != null) {
            return;
        }
        throw r1.a("Element " + i10 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(c cVar, long j10, int i10, int i11, int i12) {
        byte[] f10;
        int i13;
        int i14;
        r3.w wVar = cVar.T;
        if (wVar != null) {
            wVar.b(cVar.X, j10, i10, i11, i12, cVar.j);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.b) || "S_TEXT/ASS".equals(cVar.b) || "S_TEXT/WEBVTT".equals(cVar.b)) {
                if (this.K > 1) {
                    h5.a.K("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.I;
                    if (j11 == -9223372036854775807L) {
                        h5.a.K("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = cVar.b;
                        h5.w wVar2 = this.k;
                        byte[] bArr = wVar2.a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                                f10 = f(j11, 10000L, "%01d:%02d:%02d:%02d");
                                i13 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                f10 = f(j11, 1000L, "%02d:%02d:%02d.%03d");
                                i13 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                f10 = f(j11, 1000L, "%02d:%02d:%02d,%03d");
                                i13 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(f10, 0, bArr, i13, f10.length);
                        int i15 = wVar2.b;
                        while (true) {
                            if (i15 < wVar2.c) {
                                if (wVar2.a[i15] == 0) {
                                    wVar2.E(i15);
                                } else {
                                    i15++;
                                }
                            }
                        }
                        cVar.X.d(wVar2.c, wVar2);
                        i14 = i11 + wVar2.c;
                        if ((i10 & TLObject.FLAG_28) != 0) {
                            int i16 = this.K;
                            h5.w wVar3 = this.n;
                            if (i16 > 1) {
                                wVar3.C(0);
                            } else {
                                int i17 = wVar3.c;
                                cVar.X.a(i17, wVar3);
                                i14 += i17;
                            }
                        }
                        cVar.X.c(j10, i10, i14, i12, cVar.j);
                    }
                }
            }
            i14 = i11;
            if ((i10 & TLObject.FLAG_28) != 0) {
            }
            cVar.X.c(j10, i10, i14, i12, cVar.j);
        }
        this.F = true;
    }

    @Override // r3.k
    public final void d(long j10, long j11) {
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
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i10 >= sparseArray.size()) {
                return;
            }
            r3.w wVar = ((c) sparseArray.valueAt(i10)).T;
            if (wVar != null) {
                wVar.b = false;
                wVar.c = 0;
            }
            i10++;
        }
    }

    @Override // r3.k
    public final void e(m mVar) {
        this.b0 = mVar;
    }

    public final void g(l lVar, int i10) {
        h5.w wVar = this.g;
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
        wVar.E(i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x08a3, code lost:
    
        if (r1.o() == r2.getLeastSignificantBits()) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0bac, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0f38, code lost:
    
        if (r5 == false) goto L829;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0f3a, code lost:
    
        r1 = ((r3.h) r0).d;
        r3 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0f43, code lost:
    
        if (r3.y == false) goto L823;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0f58, code lost:
    
        if (r3.v == false) goto L880;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0f5a, code lost:
    
        r6 = r3.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0f60, code lost:
    
        if (r6 == (-1)) goto L881;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0f62, code lost:
    
        r39.a = r6;
        r3.A = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0f66, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0f6d, code lost:
    
        r0 = r3;
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0f6d, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0f45, code lost:
    
        r3.A = r1;
        r39.a = r3.z;
        r3.y = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0f51, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0f67, code lost:
    
        r3 = r37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x08e9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0901  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0914  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0ae0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0903  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v135 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v34, types: [r3.h] */
    @Override // r3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(l lVar, jb jbVar) {
        l lVar2;
        boolean z4;
        int i10;
        boolean z10;
        String str;
        ?? r52;
        int i11;
        int a2;
        char c3;
        m mVar;
        List singletonList;
        int v;
        ?? r32;
        List list;
        int i12;
        Exception exc;
        Pair pair;
        String str2;
        List list2;
        String str3;
        m0 m0Var;
        boolean h;
        int i13;
        int i14;
        i5.b bVar;
        int i15;
        byte[] bArr;
        int i16;
        String str4;
        i5.c a10;
        s nVar;
        int i17;
        long[] jArr;
        d dVar = this;
        dVar.F = false;
        boolean z11 = true;
        boolean z12 = true;
        while (z12 && !dVar.F) {
            b bVar2 = dVar.a;
            e eVar = bVar2.c;
            ArrayDeque arrayDeque = bVar2.b;
            h5.a.j(bVar2.d);
            int i18 = z11;
            while (true) {
                a aVar = (a) arrayDeque.peek();
                if (aVar == null || ((h) lVar).d < aVar.b) {
                    ?? r13 = 0;
                    if (bVar2.e == 0) {
                        lVar2 = lVar;
                        int i19 = 4;
                        long b10 = eVar.b(lVar2, true, false, 4);
                        if (b10 == -2) {
                            byte[] bArr2 = bVar2.a;
                            ((h) lVar2).f = 0;
                            while (true) {
                                r52 = (h) lVar2;
                                r52.h(bArr2, r13, i19, r13);
                                byte b11 = bArr2[r13];
                                int i20 = 0;
                                while (true) {
                                    if (i20 >= 8) {
                                        i11 = -1;
                                    } else if ((e.d[i20] & b11) != 0) {
                                        i11 = i20 + 1;
                                    } else {
                                        i20++;
                                    }
                                }
                                if (i11 != -1 && i11 <= 4) {
                                    a2 = (int) e.a(i11, false, bArr2);
                                    Object obj = bVar2.d.b;
                                    if (a2 == 357149030 || a2 == 524531317 || a2 == 475249515 || a2 == 374648427) {
                                    }
                                }
                                r52.u(1);
                                i19 = 4;
                                r13 = 0;
                            }
                            r52.u(i11);
                            b10 = a2;
                        }
                        z4 = true;
                        if (b10 == -1) {
                            z12 = false;
                            z10 = false;
                        } else {
                            bVar2.f = (int) b10;
                            bVar2.e = 1;
                        }
                    } else {
                        lVar2 = lVar;
                        z4 = true;
                    }
                    if (bVar2.e == z4) {
                        bVar2.g = eVar.b(lVar2, false, z4, 8);
                        bVar2.e = 2;
                    }
                    qk0 qk0Var = bVar2.d;
                    int i21 = bVar2.f;
                    Object obj2 = qk0Var.b;
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
                    if (i10 == 0) {
                        ((h) lVar2).u((int) bVar2.g);
                        bVar2.e = 0;
                        i18 = 1;
                    } else if (i10 == 1) {
                        long j10 = ((h) lVar2).d;
                        arrayDeque.push(new a(i21, bVar2.g + j10));
                        qk0 qk0Var2 = bVar2.d;
                        int i22 = bVar2.f;
                        long j11 = bVar2.g;
                        d dVar2 = (d) qk0Var2.b;
                        h5.a.j(dVar2.b0);
                        if (i22 != 160) {
                            if (i22 == 174) {
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
                                dVar2.u = cVar;
                            } else if (i22 == 187) {
                                z10 = false;
                                dVar2.E = false;
                            } else if (i22 == 19899) {
                                dVar2.w = -1;
                                dVar2.x = -1L;
                            } else if (i22 == 20533) {
                                dVar2.b(i22);
                                dVar2.u.h = true;
                            } else if (i22 == 21968) {
                                dVar2.b(i22);
                                dVar2.u.x = true;
                            } else if (i22 == 408125543) {
                                long j12 = dVar2.q;
                                if (j12 != -1 && j12 != j10) {
                                    throw r1.a("Multiple Segment elements not supported", null);
                                }
                                dVar2.q = j10;
                                dVar2.p = j11;
                            } else if (i22 == 475249515) {
                                dVar2.C = new w(5, (byte) 0);
                                dVar2.D = new w(5, (byte) 0);
                            } else if (i22 == 524531317 && !dVar2.v) {
                                if (!dVar2.d || dVar2.z == -1) {
                                    dVar2.b0.g2(new n(dVar2.t));
                                    dVar2.v = true;
                                } else {
                                    dVar2.y = true;
                                }
                            }
                            z10 = false;
                        } else {
                            z10 = false;
                            dVar2.Q = false;
                            dVar2.R = 0L;
                        }
                        bVar2.e = z10 ? 1 : 0;
                    } else if (i10 == 2) {
                        long j13 = bVar2.g;
                        if (j13 > 8) {
                            throw r1.a("Invalid integer size: " + bVar2.g, null);
                        }
                        qk0Var.e(i21, bVar2.a(lVar2, (int) j13));
                        z10 = false;
                        bVar2.e = 0;
                    } else if (i10 == 3) {
                        long j14 = bVar2.g;
                        if (j14 > 2147483647L) {
                            throw r1.a("String element size: " + bVar2.g, null);
                        }
                        int i23 = (int) j14;
                        if (i23 == 0) {
                            str = "";
                        } else {
                            byte[] bArr3 = new byte[i23];
                            ((h) lVar2).d(bArr3, 0, i23, false);
                            while (i23 > 0 && bArr3[i23 - 1] == 0) {
                                i23--;
                            }
                            str = new String(bArr3, 0, i23);
                        }
                        d dVar3 = (d) qk0Var.b;
                        if (i21 == 134) {
                            dVar3.b(i21);
                            dVar3.u.b = str;
                        } else if (i21 != 17026) {
                            if (i21 == 21358) {
                                dVar3.b(i21);
                                dVar3.u.a = str;
                            } else if (i21 == 2274716) {
                                dVar3.b(i21);
                                dVar3.u.W = str;
                            }
                        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                            throw r1.a("DocType " + str + " not supported", null);
                        }
                        z10 = false;
                        bVar2.e = 0;
                    } else if (i10 == 4) {
                        qk0Var.a(i21, (int) bVar2.g, lVar2);
                        z10 = false;
                        bVar2.e = 0;
                    } else {
                        if (i10 != 5) {
                            throw r1.a("Invalid element type " + i10, null);
                        }
                        long j15 = bVar2.g;
                        if (j15 != 4 && j15 != 8) {
                            throw r1.a("Invalid float size: " + bVar2.g, null);
                        }
                        int i24 = (int) j15;
                        double intBitsToFloat = i24 == 4 ? Float.intBitsToFloat((int) r5) : Double.longBitsToDouble(bVar2.a(lVar2, i24));
                        d dVar4 = (d) qk0Var.b;
                        if (i21 == 181) {
                            dVar4.b(i21);
                            dVar4.u.Q = (int) intBitsToFloat;
                        } else if (i21 != 17545) {
                            switch (i21) {
                                case 21969:
                                    dVar4.b(i21);
                                    dVar4.u.D = (float) intBitsToFloat;
                                    break;
                                case 21970:
                                    dVar4.b(i21);
                                    dVar4.u.E = (float) intBitsToFloat;
                                    break;
                                case 21971:
                                    dVar4.b(i21);
                                    dVar4.u.F = (float) intBitsToFloat;
                                    break;
                                case 21972:
                                    dVar4.b(i21);
                                    dVar4.u.G = (float) intBitsToFloat;
                                    break;
                                case 21973:
                                    dVar4.b(i21);
                                    dVar4.u.H = (float) intBitsToFloat;
                                    break;
                                case 21974:
                                    dVar4.b(i21);
                                    dVar4.u.I = (float) intBitsToFloat;
                                    break;
                                case 21975:
                                    dVar4.b(i21);
                                    dVar4.u.J = (float) intBitsToFloat;
                                    break;
                                case 21976:
                                    dVar4.b(i21);
                                    dVar4.u.K = (float) intBitsToFloat;
                                    break;
                                case 21977:
                                    dVar4.b(i21);
                                    dVar4.u.L = (float) intBitsToFloat;
                                    break;
                                case 21978:
                                    dVar4.b(i21);
                                    dVar4.u.M = (float) intBitsToFloat;
                                    break;
                                default:
                                    switch (i21) {
                                        case 30323:
                                            dVar4.b(i21);
                                            dVar4.u.s = (float) intBitsToFloat;
                                            break;
                                        case 30324:
                                            dVar4.b(i21);
                                            dVar4.u.t = (float) intBitsToFloat;
                                            break;
                                        case 30325:
                                            dVar4.b(i21);
                                            dVar4.u.u = (float) intBitsToFloat;
                                            break;
                                    }
                            }
                        } else {
                            dVar4.s = (long) intBitsToFloat;
                        }
                        z10 = false;
                        bVar2.e = 0;
                    }
                } else {
                    qk0 qk0Var3 = bVar2.d;
                    int i25 = ((a) arrayDeque.pop()).a;
                    d dVar5 = (d) qk0Var3.b;
                    SparseArray sparseArray = dVar5.c;
                    h5.a.j(dVar5.b0);
                    if (i25 != 160) {
                        if (i25 == 174) {
                            c cVar2 = dVar5.u;
                            h5.a.j(cVar2);
                            String str5 = cVar2.b;
                            if (str5 == null) {
                                throw r1.a("CodecId is missing in TrackEntry element", null);
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
                                    m mVar2 = dVar5.b0;
                                    int i26 = cVar2.c;
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
                                            byte[] bArr4 = cVar2.k;
                                            singletonList = bArr4 == null ? null : Collections.singletonList(bArr4);
                                            str6 = "video/mp4v-es";
                                            list = singletonList;
                                            i12 = -1;
                                            v = -1;
                                            str2 = null;
                                            if (cVar2.N != null && (a10 = i5.c.a(new h5.w(cVar2.N))) != null) {
                                                str2 = a10.b;
                                                str6 = "video/dolby-vision";
                                            }
                                            int i27 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                            m0Var = new m0();
                                            h = o.h(str6);
                                            Map map = h0;
                                            if (!h) {
                                                m0Var.B = cVar2.O;
                                                m0Var.C = cVar2.Q;
                                                m0Var.D = v;
                                                i13 = 1;
                                            } else if (o.j(str6)) {
                                                if (cVar2.q == 0) {
                                                    int i28 = cVar2.o;
                                                    i14 = -1;
                                                    if (i28 == -1) {
                                                        i28 = cVar2.m;
                                                    }
                                                    cVar2.o = i28;
                                                    int i29 = cVar2.p;
                                                    if (i29 == -1) {
                                                        i29 = cVar2.n;
                                                    }
                                                    cVar2.p = i29;
                                                } else {
                                                    i14 = -1;
                                                }
                                                float f10 = (cVar2.o == i14 || (i16 = cVar2.p) == i14) ? -1.0f : (cVar2.n * r1) / (cVar2.m * i16);
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
                                                    bVar = new i5.b(cVar2.y, cVar2.A, cVar2.z, bArr);
                                                } else {
                                                    bVar = null;
                                                }
                                                String str7 = cVar2.a;
                                                int intValue = (str7 == null || !map.containsKey(str7)) ? -1 : ((Integer) map.get(cVar2.a)).intValue();
                                                if (cVar2.r == 0 && Float.compare(cVar2.s, 0.0f) == 0 && Float.compare(cVar2.t, 0.0f) == 0) {
                                                    if (Float.compare(cVar2.u, 0.0f) == 0) {
                                                        i15 = 0;
                                                    } else if (Float.compare(cVar2.t, 90.0f) == 0) {
                                                        i15 = 90;
                                                    } else if (Float.compare(cVar2.t, -180.0f) == 0 || Float.compare(cVar2.t, 180.0f) == 0) {
                                                        i15 = 180;
                                                    } else if (Float.compare(cVar2.t, -90.0f) == 0) {
                                                        i15 = 270;
                                                    }
                                                    m0Var.t = cVar2.m;
                                                    m0Var.u = cVar2.n;
                                                    m0Var.x = f10;
                                                    m0Var.w = i15;
                                                    m0Var.y = cVar2.v;
                                                    m0Var.z = cVar2.w;
                                                    m0Var.A = bVar;
                                                    i13 = 2;
                                                }
                                                i15 = intValue;
                                                m0Var.t = cVar2.m;
                                                m0Var.u = cVar2.n;
                                                m0Var.x = f10;
                                                m0Var.w = i15;
                                                m0Var.y = cVar2.v;
                                                m0Var.z = cVar2.w;
                                                m0Var.A = bVar;
                                                i13 = 2;
                                            } else {
                                                if (!"application/x-subrip".equals(str6) && !"text/x-ssa".equals(str6) && !"text/vtt".equals(str6) && !"application/vobsub".equals(str6) && !"application/pgs".equals(str6) && !"application/dvbsubs".equals(str6)) {
                                                    throw r1.a("Unexpected MIME type.", null);
                                                }
                                                i13 = 3;
                                            }
                                            str4 = cVar2.a;
                                            if (str4 != null && !map.containsKey(str4)) {
                                                m0Var.b = cVar2.a;
                                            }
                                            m0Var.a = Integer.toString(i26);
                                            m0Var.o = str6;
                                            m0Var.p = i12;
                                            m0Var.c = cVar2.W;
                                            m0Var.d = i27;
                                            m0Var.q = list;
                                            m0Var.h = str2;
                                            m0Var.r = cVar2.l;
                                            n0 n0Var = new n0(m0Var);
                                            v c22 = mVar.c2(cVar2.c, i13);
                                            cVar2.X = c22;
                                            c22.b(n0Var);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar5 = dVar5;
                                            break;
                                        case 2:
                                            mVar = mVar2;
                                            h5.w wVar = new h5.w(cVar2.a(cVar2.b));
                                            try {
                                                int n10 = wVar.n();
                                                if (n10 != 1) {
                                                    if (n10 == 65534) {
                                                        wVar.F(24);
                                                        long o10 = wVar.o();
                                                        UUID uuid = g0;
                                                        if (o10 == uuid.getMostSignificantBits()) {
                                                            break;
                                                        }
                                                    }
                                                    h5.a.K("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                    str6 = "audio/x-unknown";
                                                    i12 = -1;
                                                    v = -1;
                                                    list = null;
                                                    str2 = null;
                                                    if (cVar2.N != null) {
                                                        str2 = a10.b;
                                                        str6 = "video/dolby-vision";
                                                        break;
                                                    }
                                                    int i272 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                                    m0Var = new m0();
                                                    h = o.h(str6);
                                                    Map map2 = h0;
                                                    if (!h) {
                                                    }
                                                    str4 = cVar2.a;
                                                    if (str4 != null) {
                                                        m0Var.b = cVar2.a;
                                                        break;
                                                    }
                                                    m0Var.a = Integer.toString(i26);
                                                    m0Var.o = str6;
                                                    m0Var.p = i12;
                                                    m0Var.c = cVar2.W;
                                                    m0Var.d = i272;
                                                    m0Var.q = list;
                                                    m0Var.h = str2;
                                                    m0Var.r = cVar2.l;
                                                    n0 n0Var2 = new n0(m0Var);
                                                    v c222 = mVar.c2(cVar2.c, i13);
                                                    cVar2.X = c222;
                                                    c222.b(n0Var2);
                                                    sparseArray.put(cVar2.c, cVar2);
                                                    dVar5 = dVar5;
                                                }
                                                v = d0.v(cVar2.P);
                                                if (v == 0) {
                                                    h5.a.K("MatroskaExtractor", "Unsupported PCM bit depth: " + cVar2.P + ". Setting mimeType to audio/x-unknown");
                                                    str6 = "audio/x-unknown";
                                                    i12 = -1;
                                                    v = -1;
                                                    list = null;
                                                    str2 = null;
                                                    if (cVar2.N != null) {
                                                    }
                                                    int i2722 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                                    m0Var = new m0();
                                                    h = o.h(str6);
                                                    Map map22 = h0;
                                                    if (!h) {
                                                    }
                                                    str4 = cVar2.a;
                                                    if (str4 != null) {
                                                    }
                                                    m0Var.a = Integer.toString(i26);
                                                    m0Var.o = str6;
                                                    m0Var.p = i12;
                                                    m0Var.c = cVar2.W;
                                                    m0Var.d = i2722;
                                                    m0Var.q = list;
                                                    m0Var.h = str2;
                                                    m0Var.r = cVar2.l;
                                                    n0 n0Var22 = new n0(m0Var);
                                                    v c2222 = mVar.c2(cVar2.c, i13);
                                                    cVar2.X = c2222;
                                                    c2222.b(n0Var22);
                                                    sparseArray.put(cVar2.c, cVar2);
                                                    dVar5 = dVar5;
                                                }
                                                str6 = "audio/raw";
                                                i12 = -1;
                                                list = null;
                                                str2 = null;
                                                if (cVar2.N != null) {
                                                }
                                                int i27222 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                                m0Var = new m0();
                                                h = o.h(str6);
                                                Map map222 = h0;
                                                if (!h) {
                                                }
                                                str4 = cVar2.a;
                                                if (str4 != null) {
                                                }
                                                m0Var.a = Integer.toString(i26);
                                                m0Var.o = str6;
                                                m0Var.p = i12;
                                                m0Var.c = cVar2.W;
                                                m0Var.d = i27222;
                                                m0Var.q = list;
                                                m0Var.h = str2;
                                                m0Var.r = cVar2.l;
                                                n0 n0Var222 = new n0(m0Var);
                                                v c22222 = mVar.c2(cVar2.c, i13);
                                                cVar2.X = c22222;
                                                c22222.b(n0Var222);
                                                sparseArray.put(cVar2.c, cVar2);
                                                dVar5 = dVar5;
                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                throw r1.a("Error parsing MS/ACM codec private", null);
                                            }
                                            break;
                                        case 3:
                                            mVar = mVar2;
                                            cVar2.T = new r3.w();
                                            str6 = "audio/true-hd";
                                            i12 = -1;
                                            v = -1;
                                            list = null;
                                            str2 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i272222 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                            m0Var = new m0();
                                            h = o.h(str6);
                                            Map map2222 = h0;
                                            if (!h) {
                                            }
                                            str4 = cVar2.a;
                                            if (str4 != null) {
                                            }
                                            m0Var.a = Integer.toString(i26);
                                            m0Var.o = str6;
                                            m0Var.p = i12;
                                            m0Var.c = cVar2.W;
                                            m0Var.d = i272222;
                                            m0Var.q = list;
                                            m0Var.h = str2;
                                            m0Var.r = cVar2.l;
                                            n0 n0Var2222 = new n0(m0Var);
                                            v c222222 = mVar.c2(cVar2.c, i13);
                                            cVar2.X = c222222;
                                            c222222.b(n0Var2222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar5 = dVar5;
                                            break;
                                        case 4:
                                            mVar = mVar2;
                                            byte[] a11 = cVar2.a(str5);
                                            try {
                                                r32 = 2;
                                            } catch (ArrayIndexOutOfBoundsException unused2) {
                                                r32 = 0;
                                            }
                                            try {
                                                if (a11[0] != 2) {
                                                    throw r1.a("Error parsing vorbis codec private", null);
                                                }
                                                int i30 = 0;
                                                int i31 = 1;
                                                while (true) {
                                                    int i32 = a11[i31] & 255;
                                                    if (i32 == 255) {
                                                        i30 += 255;
                                                        i31++;
                                                    } else {
                                                        int i33 = i31 + 1;
                                                        int i34 = i30 + i32;
                                                        int i35 = 0;
                                                        while (true) {
                                                            int i36 = a11[i33] & 255;
                                                            if (i36 == 255) {
                                                                i35 += 255;
                                                                i33++;
                                                            } else {
                                                                int i37 = i33 + 1;
                                                                int i38 = i35 + i36;
                                                                if (a11[i37] != 1) {
                                                                    throw r1.a("Error parsing vorbis codec private", null);
                                                                }
                                                                byte[] bArr5 = new byte[i34];
                                                                System.arraycopy(a11, i37, bArr5, 0, i34);
                                                                int i39 = i37 + i34;
                                                                if (a11[i39] != 3) {
                                                                    throw r1.a("Error parsing vorbis codec private", null);
                                                                }
                                                                int i40 = i39 + i38;
                                                                if (a11[i40] != 5) {
                                                                    throw r1.a("Error parsing vorbis codec private", null);
                                                                }
                                                                byte[] bArr6 = new byte[a11.length - i40];
                                                                System.arraycopy(a11, i40, bArr6, 0, a11.length - i40);
                                                                ArrayList arrayList = new ArrayList(2);
                                                                arrayList.add(bArr5);
                                                                arrayList.add(bArr6);
                                                                str6 = "audio/vorbis";
                                                                list = arrayList;
                                                                i12 = 8192;
                                                                v = -1;
                                                                str2 = null;
                                                                if (cVar2.N != null) {
                                                                }
                                                                int i2722222 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                                                m0Var = new m0();
                                                                h = o.h(str6);
                                                                Map map22222 = h0;
                                                                if (!h) {
                                                                }
                                                                str4 = cVar2.a;
                                                                if (str4 != null) {
                                                                }
                                                                m0Var.a = Integer.toString(i26);
                                                                m0Var.o = str6;
                                                                m0Var.p = i12;
                                                                m0Var.c = cVar2.W;
                                                                m0Var.d = i2722222;
                                                                m0Var.q = list;
                                                                m0Var.h = str2;
                                                                m0Var.r = cVar2.l;
                                                                n0 n0Var22222 = new n0(m0Var);
                                                                v c2222222 = mVar.c2(cVar2.c, i13);
                                                                cVar2.X = c2222222;
                                                                c2222222.b(n0Var22222);
                                                                sparseArray.put(cVar2.c, cVar2);
                                                                dVar5 = dVar5;
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                                throw r1.a("Error parsing vorbis codec private", r32);
                                            }
                                            break;
                                        case 5:
                                            mVar = mVar2;
                                            str6 = "audio/mpeg-L2";
                                            i12 = 4096;
                                            v = -1;
                                            list = null;
                                            str2 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i27222222 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                            m0Var = new m0();
                                            h = o.h(str6);
                                            Map map222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = cVar2.a;
                                            if (str4 != null) {
                                            }
                                            m0Var.a = Integer.toString(i26);
                                            m0Var.o = str6;
                                            m0Var.p = i12;
                                            m0Var.c = cVar2.W;
                                            m0Var.d = i27222222;
                                            m0Var.q = list;
                                            m0Var.h = str2;
                                            m0Var.r = cVar2.l;
                                            n0 n0Var222222 = new n0(m0Var);
                                            v c22222222 = mVar.c2(cVar2.c, i13);
                                            cVar2.X = c22222222;
                                            c22222222.b(n0Var222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar5 = dVar5;
                                            break;
                                        case 6:
                                            mVar = mVar2;
                                            str6 = "audio/mpeg";
                                            i12 = 4096;
                                            v = -1;
                                            list = null;
                                            str2 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i272222222 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                            m0Var = new m0();
                                            h = o.h(str6);
                                            Map map2222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = cVar2.a;
                                            if (str4 != null) {
                                            }
                                            m0Var.a = Integer.toString(i26);
                                            m0Var.o = str6;
                                            m0Var.p = i12;
                                            m0Var.c = cVar2.W;
                                            m0Var.d = i272222222;
                                            m0Var.q = list;
                                            m0Var.h = str2;
                                            m0Var.r = cVar2.l;
                                            n0 n0Var2222222 = new n0(m0Var);
                                            v c222222222 = mVar.c2(cVar2.c, i13);
                                            cVar2.X = c222222222;
                                            c222222222.b(n0Var2222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar5 = dVar5;
                                            break;
                                        case 7:
                                            mVar = mVar2;
                                            h5.w wVar2 = new h5.w(cVar2.a(cVar2.b));
                                            try {
                                                wVar2.G(16);
                                                long l10 = wVar2.l();
                                                if (l10 == 1482049860) {
                                                    exc = null;
                                                    try {
                                                        pair = new Pair("video/divx", null);
                                                        str2 = null;
                                                    } catch (ArrayIndexOutOfBoundsException unused4) {
                                                        throw r1.a("Error parsing FourCC private data", exc);
                                                    }
                                                } else {
                                                    if (l10 == 859189832) {
                                                        pair = new Pair("video/3gpp", null);
                                                    } else {
                                                        if (l10 == 826496599) {
                                                            byte[] bArr7 = wVar2.a;
                                                            for (int i41 = wVar2.b + 20; i41 < bArr7.length - 4; i41++) {
                                                                if (bArr7[i41] == 0 && bArr7[i41 + 1] == 0 && bArr7[i41 + 2] == 1) {
                                                                    if (bArr7[i41 + 3] == 15) {
                                                                        pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr7, i41, bArr7.length)));
                                                                    }
                                                                }
                                                            }
                                                            exc = null;
                                                            throw r1.a("Failed to find FourCC VC1 initialization data", null);
                                                        }
                                                        h5.a.K("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                        str2 = null;
                                                        pair = new Pair("video/x-unknown", null);
                                                    }
                                                    str2 = null;
                                                }
                                                str6 = (String) pair.first;
                                                list = (List) pair.second;
                                                i12 = -1;
                                                v = -1;
                                                if (cVar2.N != null) {
                                                }
                                                int i2722222222 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                                m0Var = new m0();
                                                h = o.h(str6);
                                                Map map22222222 = h0;
                                                if (!h) {
                                                }
                                                str4 = cVar2.a;
                                                if (str4 != null) {
                                                }
                                                m0Var.a = Integer.toString(i26);
                                                m0Var.o = str6;
                                                m0Var.p = i12;
                                                m0Var.c = cVar2.W;
                                                m0Var.d = i2722222222;
                                                m0Var.q = list;
                                                m0Var.h = str2;
                                                m0Var.r = cVar2.l;
                                                n0 n0Var22222222 = new n0(m0Var);
                                                v c2222222222 = mVar.c2(cVar2.c, i13);
                                                cVar2.X = c2222222222;
                                                c2222222222.b(n0Var22222222);
                                                sparseArray.put(cVar2.c, cVar2);
                                                dVar5 = dVar5;
                                            } catch (ArrayIndexOutOfBoundsException unused5) {
                                                exc = null;
                                            }
                                            break;
                                        case '\b':
                                            mVar = mVar2;
                                            byte[] bArr8 = new byte[4];
                                            System.arraycopy(cVar2.a(str5), 0, bArr8, 0, 4);
                                            list = s8.v.x(bArr8);
                                            str6 = "application/dvbsubs";
                                            i12 = -1;
                                            v = -1;
                                            str2 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i27222222222 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                            m0Var = new m0();
                                            h = o.h(str6);
                                            Map map222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = cVar2.a;
                                            if (str4 != null) {
                                            }
                                            m0Var.a = Integer.toString(i26);
                                            m0Var.o = str6;
                                            m0Var.p = i12;
                                            m0Var.c = cVar2.W;
                                            m0Var.d = i27222222222;
                                            m0Var.q = list;
                                            m0Var.h = str2;
                                            m0Var.r = cVar2.l;
                                            n0 n0Var222222222 = new n0(m0Var);
                                            v c22222222222 = mVar.c2(cVar2.c, i13);
                                            cVar2.X = c22222222222;
                                            c22222222222.b(n0Var222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar5 = dVar5;
                                            break;
                                        case '\n':
                                            mVar = mVar2;
                                            i5.a a12 = i5.a.a(new h5.w(cVar2.a(cVar2.b)));
                                            list2 = a12.a;
                                            cVar2.Y = a12.b;
                                            str3 = a12.i;
                                            str6 = MediaController.VIDEO_MIME_TYPE;
                                            str2 = str3;
                                            list = list2;
                                            i12 = -1;
                                            v = -1;
                                            if (cVar2.N != null) {
                                            }
                                            int i272222222222 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                            m0Var = new m0();
                                            h = o.h(str6);
                                            Map map2222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = cVar2.a;
                                            if (str4 != null) {
                                            }
                                            m0Var.a = Integer.toString(i26);
                                            m0Var.o = str6;
                                            m0Var.p = i12;
                                            m0Var.c = cVar2.W;
                                            m0Var.d = i272222222222;
                                            m0Var.q = list;
                                            m0Var.h = str2;
                                            m0Var.r = cVar2.l;
                                            n0 n0Var2222222222 = new n0(m0Var);
                                            v c222222222222 = mVar.c2(cVar2.c, i13);
                                            cVar2.X = c222222222222;
                                            c222222222222.b(n0Var2222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar5 = dVar5;
                                            break;
                                        case 11:
                                            mVar = mVar2;
                                            list = s8.v.x(cVar2.a(str5));
                                            str6 = "application/vobsub";
                                            i12 = -1;
                                            v = -1;
                                            str2 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i2722222222222 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                            m0Var = new m0();
                                            h = o.h(str6);
                                            Map map22222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = cVar2.a;
                                            if (str4 != null) {
                                            }
                                            m0Var.a = Integer.toString(i26);
                                            m0Var.o = str6;
                                            m0Var.p = i12;
                                            m0Var.c = cVar2.W;
                                            m0Var.d = i2722222222222;
                                            m0Var.q = list;
                                            m0Var.h = str2;
                                            m0Var.r = cVar2.l;
                                            n0 n0Var22222222222 = new n0(m0Var);
                                            v c2222222222222 = mVar.c2(cVar2.c, i13);
                                            cVar2.X = c2222222222222;
                                            c2222222222222.b(n0Var22222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar5 = dVar5;
                                            break;
                                        case '\f':
                                            mVar = mVar2;
                                            str6 = "audio/vnd.dts.hd";
                                            i12 = -1;
                                            v = -1;
                                            list = null;
                                            str2 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i27222222222222 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                            m0Var = new m0();
                                            h = o.h(str6);
                                            Map map222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = cVar2.a;
                                            if (str4 != null) {
                                            }
                                            m0Var.a = Integer.toString(i26);
                                            m0Var.o = str6;
                                            m0Var.p = i12;
                                            m0Var.c = cVar2.W;
                                            m0Var.d = i27222222222222;
                                            m0Var.q = list;
                                            m0Var.h = str2;
                                            m0Var.r = cVar2.l;
                                            n0 n0Var222222222222 = new n0(m0Var);
                                            v c22222222222222 = mVar.c2(cVar2.c, i13);
                                            cVar2.X = c22222222222222;
                                            c22222222222222.b(n0Var222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar5 = dVar5;
                                            break;
                                        case '\r':
                                            mVar = mVar2;
                                            List singletonList2 = Collections.singletonList(cVar2.a(str5));
                                            byte[] bArr9 = cVar2.k;
                                            p0 h9 = l3.a.h(new h5.v(bArr9, bArr9.length), false);
                                            cVar2.Q = h9.a;
                                            cVar2.O = h9.b;
                                            String str8 = (String) h9.c;
                                            str6 = MediaController.AUDIO_MIME_TYPE;
                                            list = singletonList2;
                                            str2 = str8;
                                            i12 = -1;
                                            v = -1;
                                            if (cVar2.N != null) {
                                            }
                                            int i272222222222222 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                            m0Var = new m0();
                                            h = o.h(str6);
                                            Map map2222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = cVar2.a;
                                            if (str4 != null) {
                                            }
                                            m0Var.a = Integer.toString(i26);
                                            m0Var.o = str6;
                                            m0Var.p = i12;
                                            m0Var.c = cVar2.W;
                                            m0Var.d = i272222222222222;
                                            m0Var.q = list;
                                            m0Var.h = str2;
                                            m0Var.r = cVar2.l;
                                            n0 n0Var2222222222222 = new n0(m0Var);
                                            v c222222222222222 = mVar.c2(cVar2.c, i13);
                                            cVar2.X = c222222222222222;
                                            c222222222222222.b(n0Var2222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar5 = dVar5;
                                            break;
                                        case 14:
                                            mVar = mVar2;
                                            str6 = "audio/ac3";
                                            i12 = -1;
                                            v = -1;
                                            list = null;
                                            str2 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i2722222222222222 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                            m0Var = new m0();
                                            h = o.h(str6);
                                            Map map22222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = cVar2.a;
                                            if (str4 != null) {
                                            }
                                            m0Var.a = Integer.toString(i26);
                                            m0Var.o = str6;
                                            m0Var.p = i12;
                                            m0Var.c = cVar2.W;
                                            m0Var.d = i2722222222222222;
                                            m0Var.q = list;
                                            m0Var.h = str2;
                                            m0Var.r = cVar2.l;
                                            n0 n0Var22222222222222 = new n0(m0Var);
                                            v c2222222222222222 = mVar.c2(cVar2.c, i13);
                                            cVar2.X = c2222222222222222;
                                            c2222222222222222.b(n0Var22222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar5 = dVar5;
                                            break;
                                        case 15:
                                        case 21:
                                            mVar = mVar2;
                                            str6 = "audio/vnd.dts";
                                            i12 = -1;
                                            v = -1;
                                            list = null;
                                            str2 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i27222222222222222 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                            m0Var = new m0();
                                            h = o.h(str6);
                                            Map map222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = cVar2.a;
                                            if (str4 != null) {
                                            }
                                            m0Var.a = Integer.toString(i26);
                                            m0Var.o = str6;
                                            m0Var.p = i12;
                                            m0Var.c = cVar2.W;
                                            m0Var.d = i27222222222222222;
                                            m0Var.q = list;
                                            m0Var.h = str2;
                                            m0Var.r = cVar2.l;
                                            n0 n0Var222222222222222 = new n0(m0Var);
                                            v c22222222222222222 = mVar.c2(cVar2.c, i13);
                                            cVar2.X = c22222222222222222;
                                            c22222222222222222.b(n0Var222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar5 = dVar5;
                                            break;
                                        case 16:
                                            mVar = mVar2;
                                            str6 = "video/av01";
                                            i12 = -1;
                                            v = -1;
                                            list = null;
                                            str2 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i272222222222222222 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                            m0Var = new m0();
                                            h = o.h(str6);
                                            Map map2222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = cVar2.a;
                                            if (str4 != null) {
                                            }
                                            m0Var.a = Integer.toString(i26);
                                            m0Var.o = str6;
                                            m0Var.p = i12;
                                            m0Var.c = cVar2.W;
                                            m0Var.d = i272222222222222222;
                                            m0Var.q = list;
                                            m0Var.h = str2;
                                            m0Var.r = cVar2.l;
                                            n0 n0Var2222222222222222 = new n0(m0Var);
                                            v c222222222222222222 = mVar.c2(cVar2.c, i13);
                                            cVar2.X = c222222222222222222;
                                            c222222222222222222.b(n0Var2222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar5 = dVar5;
                                            break;
                                        case 17:
                                            mVar = mVar2;
                                            str6 = "video/x-vnd.on2.vp8";
                                            i12 = -1;
                                            v = -1;
                                            list = null;
                                            str2 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i2722222222222222222 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                            m0Var = new m0();
                                            h = o.h(str6);
                                            Map map22222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = cVar2.a;
                                            if (str4 != null) {
                                            }
                                            m0Var.a = Integer.toString(i26);
                                            m0Var.o = str6;
                                            m0Var.p = i12;
                                            m0Var.c = cVar2.W;
                                            m0Var.d = i2722222222222222222;
                                            m0Var.q = list;
                                            m0Var.h = str2;
                                            m0Var.r = cVar2.l;
                                            n0 n0Var22222222222222222 = new n0(m0Var);
                                            v c2222222222222222222 = mVar.c2(cVar2.c, i13);
                                            cVar2.X = c2222222222222222222;
                                            c2222222222222222222.b(n0Var22222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar5 = dVar5;
                                            break;
                                        case 18:
                                            mVar = mVar2;
                                            str6 = "video/x-vnd.on2.vp9";
                                            i12 = -1;
                                            v = -1;
                                            list = null;
                                            str2 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i27222222222222222222 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                            m0Var = new m0();
                                            h = o.h(str6);
                                            Map map222222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = cVar2.a;
                                            if (str4 != null) {
                                            }
                                            m0Var.a = Integer.toString(i26);
                                            m0Var.o = str6;
                                            m0Var.p = i12;
                                            m0Var.c = cVar2.W;
                                            m0Var.d = i27222222222222222222;
                                            m0Var.q = list;
                                            m0Var.h = str2;
                                            m0Var.r = cVar2.l;
                                            n0 n0Var222222222222222222 = new n0(m0Var);
                                            v c22222222222222222222 = mVar.c2(cVar2.c, i13);
                                            cVar2.X = c22222222222222222222;
                                            c22222222222222222222.b(n0Var222222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar5 = dVar5;
                                            break;
                                        case 19:
                                            mVar = mVar2;
                                            str6 = "application/pgs";
                                            i12 = -1;
                                            v = -1;
                                            list = null;
                                            str2 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i272222222222222222222 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                            m0Var = new m0();
                                            h = o.h(str6);
                                            Map map2222222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = cVar2.a;
                                            if (str4 != null) {
                                            }
                                            m0Var.a = Integer.toString(i26);
                                            m0Var.o = str6;
                                            m0Var.p = i12;
                                            m0Var.c = cVar2.W;
                                            m0Var.d = i272222222222222222222;
                                            m0Var.q = list;
                                            m0Var.h = str2;
                                            m0Var.r = cVar2.l;
                                            n0 n0Var2222222222222222222 = new n0(m0Var);
                                            v c222222222222222222222 = mVar.c2(cVar2.c, i13);
                                            cVar2.X = c222222222222222222222;
                                            c222222222222222222222.b(n0Var2222222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar5 = dVar5;
                                            break;
                                        case 20:
                                            mVar = mVar2;
                                            i12 = -1;
                                            v = -1;
                                            list = null;
                                            str2 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i2722222222222222222222 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                            m0Var = new m0();
                                            h = o.h(str6);
                                            Map map22222222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = cVar2.a;
                                            if (str4 != null) {
                                            }
                                            m0Var.a = Integer.toString(i26);
                                            m0Var.o = str6;
                                            m0Var.p = i12;
                                            m0Var.c = cVar2.W;
                                            m0Var.d = i2722222222222222222222;
                                            m0Var.q = list;
                                            m0Var.h = str2;
                                            m0Var.r = cVar2.l;
                                            n0 n0Var22222222222222222222 = new n0(m0Var);
                                            v c2222222222222222222222 = mVar.c2(cVar2.c, i13);
                                            cVar2.X = c2222222222222222222222;
                                            c2222222222222222222222.b(n0Var22222222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar5 = dVar5;
                                            break;
                                        case 22:
                                            mVar = mVar2;
                                            if (cVar2.P == 32) {
                                                str6 = "audio/raw";
                                                i12 = -1;
                                                v = 4;
                                                list = null;
                                                str2 = null;
                                                if (cVar2.N != null) {
                                                }
                                                int i27222222222222222222222 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                                m0Var = new m0();
                                                h = o.h(str6);
                                                Map map222222222222222222222 = h0;
                                                if (!h) {
                                                }
                                                str4 = cVar2.a;
                                                if (str4 != null) {
                                                }
                                                m0Var.a = Integer.toString(i26);
                                                m0Var.o = str6;
                                                m0Var.p = i12;
                                                m0Var.c = cVar2.W;
                                                m0Var.d = i27222222222222222222222;
                                                m0Var.q = list;
                                                m0Var.h = str2;
                                                m0Var.r = cVar2.l;
                                                n0 n0Var222222222222222222222 = new n0(m0Var);
                                                v c22222222222222222222222 = mVar.c2(cVar2.c, i13);
                                                cVar2.X = c22222222222222222222222;
                                                c22222222222222222222222.b(n0Var222222222222222222222);
                                                sparseArray.put(cVar2.c, cVar2);
                                                dVar5 = dVar5;
                                            } else {
                                                h5.a.K("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + cVar2.P + ". Setting mimeType to audio/x-unknown");
                                                str6 = "audio/x-unknown";
                                                i12 = -1;
                                                v = -1;
                                                list = null;
                                                str2 = null;
                                                if (cVar2.N != null) {
                                                }
                                                int i272222222222222222222222 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                                m0Var = new m0();
                                                h = o.h(str6);
                                                Map map2222222222222222222222 = h0;
                                                if (!h) {
                                                }
                                                str4 = cVar2.a;
                                                if (str4 != null) {
                                                }
                                                m0Var.a = Integer.toString(i26);
                                                m0Var.o = str6;
                                                m0Var.p = i12;
                                                m0Var.c = cVar2.W;
                                                m0Var.d = i272222222222222222222222;
                                                m0Var.q = list;
                                                m0Var.h = str2;
                                                m0Var.r = cVar2.l;
                                                n0 n0Var2222222222222222222222 = new n0(m0Var);
                                                v c222222222222222222222222 = mVar.c2(cVar2.c, i13);
                                                cVar2.X = c222222222222222222222222;
                                                c222222222222222222222222.b(n0Var2222222222222222222222);
                                                sparseArray.put(cVar2.c, cVar2);
                                                dVar5 = dVar5;
                                            }
                                            break;
                                        case 23:
                                            mVar = mVar2;
                                            int i42 = cVar2.P;
                                            if (i42 == 8) {
                                                str6 = "audio/raw";
                                                i12 = -1;
                                                v = 3;
                                            } else if (i42 == 16) {
                                                str6 = "audio/raw";
                                                i12 = -1;
                                                v = TLObject.FLAG_28;
                                            } else {
                                                h5.a.K("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + cVar2.P + ". Setting mimeType to audio/x-unknown");
                                                str6 = "audio/x-unknown";
                                                i12 = -1;
                                                v = -1;
                                            }
                                            list = null;
                                            str2 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i2722222222222222222222222 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                            m0Var = new m0();
                                            h = o.h(str6);
                                            Map map22222222222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = cVar2.a;
                                            if (str4 != null) {
                                            }
                                            m0Var.a = Integer.toString(i26);
                                            m0Var.o = str6;
                                            m0Var.p = i12;
                                            m0Var.c = cVar2.W;
                                            m0Var.d = i2722222222222222222222222;
                                            m0Var.q = list;
                                            m0Var.h = str2;
                                            m0Var.r = cVar2.l;
                                            n0 n0Var22222222222222222222222 = new n0(m0Var);
                                            v c2222222222222222222222222 = mVar.c2(cVar2.c, i13);
                                            cVar2.X = c2222222222222222222222222;
                                            c2222222222222222222222222.b(n0Var22222222222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar5 = dVar5;
                                            break;
                                        case 24:
                                            mVar = mVar2;
                                            v = d0.v(cVar2.P);
                                            if (v == 0) {
                                                h5.a.K("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + cVar2.P + ". Setting mimeType to audio/x-unknown");
                                                str6 = "audio/x-unknown";
                                                i12 = -1;
                                                v = -1;
                                                list = null;
                                                str2 = null;
                                                if (cVar2.N != null) {
                                                }
                                                int i27222222222222222222222222 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                                m0Var = new m0();
                                                h = o.h(str6);
                                                Map map222222222222222222222222 = h0;
                                                if (!h) {
                                                }
                                                str4 = cVar2.a;
                                                if (str4 != null) {
                                                }
                                                m0Var.a = Integer.toString(i26);
                                                m0Var.o = str6;
                                                m0Var.p = i12;
                                                m0Var.c = cVar2.W;
                                                m0Var.d = i27222222222222222222222222;
                                                m0Var.q = list;
                                                m0Var.h = str2;
                                                m0Var.r = cVar2.l;
                                                n0 n0Var222222222222222222222222 = new n0(m0Var);
                                                v c22222222222222222222222222 = mVar.c2(cVar2.c, i13);
                                                cVar2.X = c22222222222222222222222222;
                                                c22222222222222222222222222.b(n0Var222222222222222222222222);
                                                sparseArray.put(cVar2.c, cVar2);
                                                dVar5 = dVar5;
                                            }
                                            str6 = "audio/raw";
                                            i12 = -1;
                                            list = null;
                                            str2 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i272222222222222222222222222 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                            m0Var = new m0();
                                            h = o.h(str6);
                                            Map map2222222222222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = cVar2.a;
                                            if (str4 != null) {
                                            }
                                            m0Var.a = Integer.toString(i26);
                                            m0Var.o = str6;
                                            m0Var.p = i12;
                                            m0Var.c = cVar2.W;
                                            m0Var.d = i272222222222222222222222222;
                                            m0Var.q = list;
                                            m0Var.h = str2;
                                            m0Var.r = cVar2.l;
                                            n0 n0Var2222222222222222222222222 = new n0(m0Var);
                                            v c222222222222222222222222222 = mVar.c2(cVar2.c, i13);
                                            cVar2.X = c222222222222222222222222222;
                                            c222222222222222222222222222.b(n0Var2222222222222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar5 = dVar5;
                                            break;
                                        case 25:
                                            mVar = mVar2;
                                            byte[] a13 = cVar2.a(str5);
                                            t tVar = s8.v.b;
                                            Object[] objArr = {d0, a13};
                                            s8.l.b(2, objArr);
                                            list = s8.v.s(2, objArr);
                                            str6 = "text/x-ssa";
                                            i12 = -1;
                                            v = -1;
                                            str2 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i2722222222222222222222222222 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                            m0Var = new m0();
                                            h = o.h(str6);
                                            Map map22222222222222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = cVar2.a;
                                            if (str4 != null) {
                                            }
                                            m0Var.a = Integer.toString(i26);
                                            m0Var.o = str6;
                                            m0Var.p = i12;
                                            m0Var.c = cVar2.W;
                                            m0Var.d = i2722222222222222222222222222;
                                            m0Var.q = list;
                                            m0Var.h = str2;
                                            m0Var.r = cVar2.l;
                                            n0 n0Var22222222222222222222222222 = new n0(m0Var);
                                            v c2222222222222222222222222222 = mVar.c2(cVar2.c, i13);
                                            cVar2.X = c2222222222222222222222222222;
                                            c2222222222222222222222222222.b(n0Var22222222222222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar5 = dVar5;
                                            break;
                                        case 26:
                                            mVar = mVar2;
                                            f a14 = f.a(new h5.w(cVar2.a(cVar2.b)));
                                            list2 = a14.a;
                                            cVar2.Y = a14.b;
                                            str3 = a14.g;
                                            str6 = "video/hevc";
                                            str2 = str3;
                                            list = list2;
                                            i12 = -1;
                                            v = -1;
                                            if (cVar2.N != null) {
                                            }
                                            int i27222222222222222222222222222 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                            m0Var = new m0();
                                            h = o.h(str6);
                                            Map map222222222222222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = cVar2.a;
                                            if (str4 != null) {
                                            }
                                            m0Var.a = Integer.toString(i26);
                                            m0Var.o = str6;
                                            m0Var.p = i12;
                                            m0Var.c = cVar2.W;
                                            m0Var.d = i27222222222222222222222222222;
                                            m0Var.q = list;
                                            m0Var.h = str2;
                                            m0Var.r = cVar2.l;
                                            n0 n0Var222222222222222222222222222 = new n0(m0Var);
                                            v c22222222222222222222222222222 = mVar.c2(cVar2.c, i13);
                                            cVar2.X = c22222222222222222222222222222;
                                            c22222222222222222222222222222.b(n0Var222222222222222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar5 = dVar5;
                                            break;
                                        case 27:
                                            mVar = mVar2;
                                            str6 = "text/vtt";
                                            i12 = -1;
                                            v = -1;
                                            list = null;
                                            str2 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i272222222222222222222222222222 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                            m0Var = new m0();
                                            h = o.h(str6);
                                            Map map2222222222222222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = cVar2.a;
                                            if (str4 != null) {
                                            }
                                            m0Var.a = Integer.toString(i26);
                                            m0Var.o = str6;
                                            m0Var.p = i12;
                                            m0Var.c = cVar2.W;
                                            m0Var.d = i272222222222222222222222222222;
                                            m0Var.q = list;
                                            m0Var.h = str2;
                                            m0Var.r = cVar2.l;
                                            n0 n0Var2222222222222222222222222222 = new n0(m0Var);
                                            v c222222222222222222222222222222 = mVar.c2(cVar2.c, i13);
                                            cVar2.X = c222222222222222222222222222222;
                                            c222222222222222222222222222222.b(n0Var2222222222222222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar5 = dVar5;
                                            break;
                                        case 28:
                                            mVar = mVar2;
                                            str6 = "application/x-subrip";
                                            i12 = -1;
                                            v = -1;
                                            list = null;
                                            str2 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i2722222222222222222222222222222 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                            m0Var = new m0();
                                            h = o.h(str6);
                                            Map map22222222222222222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = cVar2.a;
                                            if (str4 != null) {
                                            }
                                            m0Var.a = Integer.toString(i26);
                                            m0Var.o = str6;
                                            m0Var.p = i12;
                                            m0Var.c = cVar2.W;
                                            m0Var.d = i2722222222222222222222222222222;
                                            m0Var.q = list;
                                            m0Var.h = str2;
                                            m0Var.r = cVar2.l;
                                            n0 n0Var22222222222222222222222222222 = new n0(m0Var);
                                            v c2222222222222222222222222222222 = mVar.c2(cVar2.c, i13);
                                            cVar2.X = c2222222222222222222222222222222;
                                            c2222222222222222222222222222222.b(n0Var22222222222222222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar5 = dVar5;
                                            break;
                                        case 29:
                                            mVar = mVar2;
                                            str6 = "video/mpeg2";
                                            i12 = -1;
                                            v = -1;
                                            list = null;
                                            str2 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i27222222222222222222222222222222 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                            m0Var = new m0();
                                            h = o.h(str6);
                                            Map map222222222222222222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = cVar2.a;
                                            if (str4 != null) {
                                            }
                                            m0Var.a = Integer.toString(i26);
                                            m0Var.o = str6;
                                            m0Var.p = i12;
                                            m0Var.c = cVar2.W;
                                            m0Var.d = i27222222222222222222222222222222;
                                            m0Var.q = list;
                                            m0Var.h = str2;
                                            m0Var.r = cVar2.l;
                                            n0 n0Var222222222222222222222222222222 = new n0(m0Var);
                                            v c22222222222222222222222222222222 = mVar.c2(cVar2.c, i13);
                                            cVar2.X = c22222222222222222222222222222222;
                                            c22222222222222222222222222222222.b(n0Var222222222222222222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar5 = dVar5;
                                            break;
                                        case MessageObject.TYPE_GIFT_STARS /* 30 */:
                                            mVar = mVar2;
                                            str6 = "audio/eac3";
                                            i12 = -1;
                                            v = -1;
                                            list = null;
                                            str2 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i272222222222222222222222222222222 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                            m0Var = new m0();
                                            h = o.h(str6);
                                            Map map2222222222222222222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = cVar2.a;
                                            if (str4 != null) {
                                            }
                                            m0Var.a = Integer.toString(i26);
                                            m0Var.o = str6;
                                            m0Var.p = i12;
                                            m0Var.c = cVar2.W;
                                            m0Var.d = i272222222222222222222222222222222;
                                            m0Var.q = list;
                                            m0Var.h = str2;
                                            m0Var.r = cVar2.l;
                                            n0 n0Var2222222222222222222222222222222 = new n0(m0Var);
                                            v c222222222222222222222222222222222 = mVar.c2(cVar2.c, i13);
                                            cVar2.X = c222222222222222222222222222222222;
                                            c222222222222222222222222222222222.b(n0Var2222222222222222222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar5 = dVar5;
                                            break;
                                        case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                                            mVar = mVar2;
                                            singletonList = Collections.singletonList(cVar2.a(str5));
                                            str6 = "audio/flac";
                                            list = singletonList;
                                            i12 = -1;
                                            v = -1;
                                            str2 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i2722222222222222222222222222222222 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                            m0Var = new m0();
                                            h = o.h(str6);
                                            Map map22222222222222222222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = cVar2.a;
                                            if (str4 != null) {
                                            }
                                            m0Var.a = Integer.toString(i26);
                                            m0Var.o = str6;
                                            m0Var.p = i12;
                                            m0Var.c = cVar2.W;
                                            m0Var.d = i2722222222222222222222222222222222;
                                            m0Var.q = list;
                                            m0Var.h = str2;
                                            m0Var.r = cVar2.l;
                                            n0 n0Var22222222222222222222222222222222 = new n0(m0Var);
                                            v c2222222222222222222222222222222222 = mVar.c2(cVar2.c, i13);
                                            cVar2.X = c2222222222222222222222222222222222;
                                            c2222222222222222222222222222222222.b(n0Var22222222222222222222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar5 = dVar5;
                                            break;
                                        case ' ':
                                            ArrayList arrayList2 = new ArrayList(3);
                                            arrayList2.add(cVar2.a(cVar2.b));
                                            ByteBuffer allocate = ByteBuffer.allocate(8);
                                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                            mVar = mVar2;
                                            arrayList2.add(allocate.order(byteOrder).putLong(cVar2.R).array());
                                            arrayList2.add(ByteBuffer.allocate(8).order(byteOrder).putLong(cVar2.S).array());
                                            str6 = "audio/opus";
                                            list = arrayList2;
                                            i12 = 5760;
                                            v = -1;
                                            str2 = null;
                                            if (cVar2.N != null) {
                                            }
                                            int i27222222222222222222222222222222222 = (cVar2.V ? 1 : 0) | (!cVar2.U ? 2 : 0);
                                            m0Var = new m0();
                                            h = o.h(str6);
                                            Map map222222222222222222222222222222222 = h0;
                                            if (!h) {
                                            }
                                            str4 = cVar2.a;
                                            if (str4 != null) {
                                            }
                                            m0Var.a = Integer.toString(i26);
                                            m0Var.o = str6;
                                            m0Var.p = i12;
                                            m0Var.c = cVar2.W;
                                            m0Var.d = i27222222222222222222222222222222222;
                                            m0Var.q = list;
                                            m0Var.h = str2;
                                            m0Var.r = cVar2.l;
                                            n0 n0Var222222222222222222222222222222222 = new n0(m0Var);
                                            v c22222222222222222222222222222222222 = mVar.c2(cVar2.c, i13);
                                            cVar2.X = c22222222222222222222222222222222222;
                                            c22222222222222222222222222222222222.b(n0Var222222222222222222222222222222222);
                                            sparseArray.put(cVar2.c, cVar2);
                                            dVar5 = dVar5;
                                            break;
                                        default:
                                            throw r1.a("Unrecognized codec identifier.", null);
                                    }
                                default:
                                    dVar5.u = null;
                                    break;
                            }
                        } else {
                            if (i25 == 19899) {
                                int i43 = dVar5.w;
                                if (i43 != -1) {
                                    long j16 = dVar5.x;
                                    if (j16 != -1) {
                                        if (i43 == 475249515) {
                                            dVar5.z = j16;
                                        }
                                    }
                                }
                                throw r1.a("Mandatory element SeekID or SeekPosition not found", null);
                            }
                            if (i25 == 25152) {
                                dVar5.b(i25);
                                c cVar3 = dVar5.u;
                                if (cVar3.h) {
                                    u uVar = cVar3.j;
                                    if (uVar == null) {
                                        throw r1.a("Encrypted Track found but ContentEncKeyID was not found", null);
                                    }
                                    o3.f fVar = new o3.f(j3.h.a, null, "video/webm", uVar.b);
                                    o3.f[] fVarArr = new o3.f[i18];
                                    fVarArr[0] = fVar;
                                    cVar3.l = new g(null, i18, fVarArr);
                                }
                            } else if (i25 == 28032) {
                                dVar5.b(i25);
                                c cVar4 = dVar5.u;
                                if (cVar4.h && cVar4.i != null) {
                                    throw r1.a("Combining encryption and compression is not supported", null);
                                }
                            } else if (i25 == 357149030) {
                                if (dVar5.r == -9223372036854775807L) {
                                    dVar5.r = 1000000L;
                                }
                                long j17 = dVar5.s;
                                if (j17 != -9223372036854775807L) {
                                    dVar5.t = dVar5.k(j17);
                                }
                            } else if (i25 == 374648427) {
                                if (sparseArray.size() == 0) {
                                    throw r1.a("No valid tracks were found", null);
                                }
                                dVar5.b0.f1();
                            } else if (i25 == 475249515) {
                                if (!dVar5.v) {
                                    m mVar3 = dVar5.b0;
                                    w wVar3 = dVar5.C;
                                    w wVar4 = dVar5.D;
                                    if (dVar5.q == -1 || dVar5.t == -9223372036854775807L || wVar3 == null || (i17 = wVar3.b) == 0 || wVar4 == null || wVar4.b != i17) {
                                        nVar = new n(dVar5.t);
                                    } else {
                                        int[] iArr = new int[i17];
                                        long[] jArr2 = new long[i17];
                                        long[] jArr3 = new long[i17];
                                        long[] jArr4 = new long[i17];
                                        int i44 = 0;
                                        while (i44 < i17) {
                                            jArr4[i44] = wVar3.e(i44);
                                            long[] jArr5 = jArr2;
                                            jArr5[i44] = wVar4.e(i44) + dVar5.q;
                                            i44++;
                                            jArr2 = jArr5;
                                        }
                                        long[] jArr6 = jArr2;
                                        int i45 = 0;
                                        while (true) {
                                            int i46 = i17 - 1;
                                            if (i45 < i46) {
                                                int i47 = i45 + 1;
                                                iArr[i45] = (int) (jArr6[i47] - jArr6[i45]);
                                                jArr3[i45] = jArr4[i47] - jArr4[i45];
                                                i45 = i47;
                                            } else {
                                                iArr[i46] = (int) ((dVar5.q + dVar5.p) - jArr6[i46]);
                                                long j18 = dVar5.t - jArr4[i46];
                                                jArr3[i46] = j18;
                                                if (j18 <= 0) {
                                                    h5.a.K("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j18);
                                                    iArr = Arrays.copyOf(iArr, i46);
                                                    jArr = Arrays.copyOf(jArr6, i46);
                                                    jArr3 = Arrays.copyOf(jArr3, i46);
                                                    jArr4 = Arrays.copyOf(jArr4, i46);
                                                } else {
                                                    jArr = jArr6;
                                                }
                                                nVar = new r3.f(iArr, jArr, jArr3, jArr4);
                                            }
                                        }
                                    }
                                    mVar3.g2(nVar);
                                    dVar5.v = i18;
                                }
                                dVar5.C = null;
                                dVar5.D = null;
                            }
                        }
                    } else if (dVar5.G == 2) {
                        c cVar5 = (c) sparseArray.get(dVar5.M);
                        cVar5.X.getClass();
                        if (dVar5.R > 0 && "A_OPUS".equals(cVar5.b)) {
                            h5.w wVar5 = dVar5.n;
                            byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(dVar5.R).array();
                            wVar5.getClass();
                            wVar5.D(array.length, array);
                        }
                        int i48 = 0;
                        for (int i49 = 0; i49 < dVar5.K; i49++) {
                            i48 += dVar5.L[i49];
                        }
                        int i50 = 0;
                        while (i50 < dVar5.K) {
                            long j19 = dVar5.H + ((cVar5.e * i50) / MediaDataController.MAX_STYLE_RUNS_COUNT);
                            int i51 = dVar5.O;
                            if (i50 == 0 && !dVar5.Q) {
                                i51 |= 1;
                            }
                            int i52 = dVar5.L[i50];
                            int i53 = i48 - i52;
                            dVar5.c(cVar5, j19, i51, i52, i53);
                            i50++;
                            i48 = i53;
                        }
                        z10 = false;
                        dVar5.G = 0;
                        lVar2 = lVar;
                    }
                    z10 = false;
                    lVar2 = lVar;
                }
            }
        }
        d dVar6 = dVar;
        if (z12) {
            return 0;
        }
        int i54 = 0;
        while (true) {
            SparseArray sparseArray2 = dVar6.c;
            if (i54 >= sparseArray2.size()) {
                return -1;
            }
            c cVar6 = (c) sparseArray2.valueAt(i54);
            cVar6.X.getClass();
            r3.w wVar6 = cVar6.T;
            if (wVar6 != null) {
                wVar6.a(cVar6.X, cVar6.j);
            }
            i54++;
        }
    }

    @Override // r3.k
    public final boolean i(l lVar) {
        w wVar = new w(11, (byte) 0);
        h5.w wVar2 = (h5.w) wVar.c;
        h hVar = (h) lVar;
        long j10 = hVar.c;
        long j11 = 1024;
        if (j10 != -1 && j10 <= 1024) {
            j11 = j10;
        }
        int i10 = (int) j11;
        hVar.h(wVar2.a, 0, 4, false);
        long v = wVar2.v();
        wVar.b = 4;
        while (true) {
            if (v != 440786851) {
                int i11 = wVar.b + 1;
                wVar.b = i11;
                if (i11 == i10) {
                    break;
                }
                hVar.h(wVar2.a, 0, 1, false);
                v = ((v << 8) & (-256)) | (wVar2.a[0] & 255);
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
                                    int i12 = (int) g11;
                                    hVar.a(i12, false);
                                    wVar.b += i12;
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
        this.j.C(0);
    }

    public final long k(long j10) {
        long j11 = this.r;
        if (j11 != -9223372036854775807L) {
            return d0.N(j10, j11, 1000L);
        }
        throw r1.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public final int l(l lVar, c cVar, int i10, boolean z4) {
        int e;
        int e6;
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.b)) {
            m(lVar, c0, i10);
            int i12 = this.T;
            j();
            return i12;
        }
        if ("S_TEXT/ASS".equals(cVar.b)) {
            m(lVar, e0, i10);
            int i13 = this.T;
            j();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(cVar.b)) {
            m(lVar, f0, i10);
            int i14 = this.T;
            j();
            return i14;
        }
        v vVar = cVar.X;
        boolean z10 = this.V;
        h5.w wVar = this.j;
        if (!z10) {
            boolean z11 = cVar.h;
            h5.w wVar2 = this.g;
            if (z11) {
                this.O &= -1073741825;
                if (!this.W) {
                    lVar.readFully(wVar2.a, 0, 1);
                    this.S++;
                    byte b10 = wVar2.a[0];
                    if ((b10 & 128) == 128) {
                        throw r1.a("Extension bit is set in signal byte", null);
                    }
                    this.Z = b10;
                    this.W = true;
                }
                byte b11 = this.Z;
                if ((b11 & 1) == 1) {
                    boolean z12 = (b11 & 2) == 2;
                    this.O |= TLObject.FLAG_30;
                    if (!this.a0) {
                        h5.w wVar3 = this.l;
                        lVar.readFully(wVar3.a, 0, 8);
                        this.S += 8;
                        this.a0 = true;
                        wVar2.a[0] = (byte) ((z12 ? 128 : 0) | 8);
                        wVar2.F(0);
                        vVar.a(1, wVar2);
                        this.T++;
                        wVar3.F(0);
                        vVar.a(8, wVar3);
                        this.T += 8;
                    }
                    if (z12) {
                        if (!this.X) {
                            lVar.readFully(wVar2.a, 0, 1);
                            this.S++;
                            wVar2.F(0);
                            this.Y = wVar2.u();
                            this.X = true;
                        }
                        int i15 = this.Y * 4;
                        wVar2.C(i15);
                        lVar.readFully(wVar2.a, 0, i15);
                        this.S += i15;
                        short s6 = (short) ((this.Y / 2) + 1);
                        int i16 = (s6 * 6) + 2;
                        ByteBuffer byteBuffer = this.o;
                        if (byteBuffer == null || byteBuffer.capacity() < i16) {
                            this.o = ByteBuffer.allocate(i16);
                        }
                        this.o.position(0);
                        this.o.putShort(s6);
                        int i17 = 0;
                        int i18 = 0;
                        while (true) {
                            i11 = this.Y;
                            if (i17 >= i11) {
                                break;
                            }
                            int x10 = wVar2.x();
                            if (i17 % 2 == 0) {
                                this.o.putShort((short) (x10 - i18));
                            } else {
                                this.o.putInt(x10 - i18);
                            }
                            i17++;
                            i18 = x10;
                        }
                        int i19 = (i10 - this.S) - i18;
                        if (i11 % 2 == 1) {
                            this.o.putInt(i19);
                        } else {
                            this.o.putShort((short) i19);
                            this.o.putInt(0);
                        }
                        byte[] array = this.o.array();
                        h5.w wVar4 = this.m;
                        wVar4.D(i16, array);
                        vVar.a(i16, wVar4);
                        this.T += i16;
                    }
                }
            } else {
                byte[] bArr = cVar.i;
                if (bArr != null) {
                    wVar.D(bArr.length, bArr);
                }
            }
            if ("A_OPUS".equals(cVar.b) ? z4 : cVar.f > 0) {
                this.O |= TLObject.FLAG_28;
                this.n.C(0);
                int i20 = (wVar.c + i10) - this.S;
                wVar2.C(4);
                byte[] bArr2 = wVar2.a;
                bArr2[0] = (byte) ((i20 >> 24) & 255);
                bArr2[1] = (byte) ((i20 >> 16) & 255);
                bArr2[2] = (byte) ((i20 >> 8) & 255);
                bArr2[3] = (byte) (i20 & 255);
                vVar.a(4, wVar2);
                this.T += 4;
            }
            this.V = true;
        }
        int i21 = i10 + wVar.c;
        if (!"V_MPEG4/ISO/AVC".equals(cVar.b) && !"V_MPEGH/ISO/HEVC".equals(cVar.b)) {
            if (cVar.T != null) {
                h5.a.i(wVar.c == 0);
                cVar.T.c(lVar);
            }
            while (true) {
                int i22 = this.S;
                if (i22 >= i21) {
                    break;
                }
                int i23 = i21 - i22;
                int a2 = wVar.a();
                if (a2 > 0) {
                    e6 = Math.min(i23, a2);
                    vVar.d(e6, wVar);
                } else {
                    e6 = vVar.e(lVar, i23, false);
                }
                this.S += e6;
                this.T += e6;
            }
        } else {
            h5.w wVar5 = this.f;
            byte[] bArr3 = wVar5.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i24 = cVar.Y;
            int i25 = 4 - i24;
            while (this.S < i21) {
                int i26 = this.U;
                if (i26 == 0) {
                    int min = Math.min(i24, wVar.a());
                    lVar.readFully(bArr3, i25 + min, i24 - min);
                    if (min > 0) {
                        wVar.e(i25, min, bArr3);
                    }
                    this.S += i24;
                    wVar5.F(0);
                    this.U = wVar5.x();
                    h5.w wVar6 = this.e;
                    wVar6.F(0);
                    vVar.d(4, wVar6);
                    this.T += 4;
                } else {
                    int a10 = wVar.a();
                    if (a10 > 0) {
                        e = Math.min(i26, a10);
                        vVar.d(e, wVar);
                    } else {
                        e = vVar.e(lVar, i26, false);
                    }
                    this.S += e;
                    this.T += e;
                    this.U -= e;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.b)) {
            h5.w wVar7 = this.h;
            wVar7.F(0);
            vVar.d(4, wVar7);
            this.T += 4;
        }
        int i27 = this.T;
        j();
        return i27;
    }

    public final void m(l lVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        h5.w wVar = this.k;
        byte[] bArr2 = wVar.a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i10);
            wVar.getClass();
            wVar.D(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        lVar.readFully(wVar.a, bArr.length, i10);
        wVar.F(0);
        wVar.E(length);
    }

    @Override // r3.k
    public final void release() {
    }
}
