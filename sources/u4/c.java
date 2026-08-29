package u4;

import androidx.car.app.navigation.model.Maneuver;
import f5.w;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import t4.k;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c extends i {
    public final int h;
    public final int i;
    public final int j;
    public List n;
    public List o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;
    public byte t;
    public byte u;
    public boolean w;
    public long x;
    public static final int[] y = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, MediaDataController.MAX_LINKS_COUNT, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, TLRPC.LAYER, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final w g = new w();
    public final ArrayList l = new ArrayList();
    public b m = new b(0, 4);
    public int v = 0;
    public final long k = 16000000;

    public c(String str, int i10) {
        this.h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.j = 0;
            this.i = 0;
        } else if (i10 == 2) {
            this.j = 1;
            this.i = 0;
        } else if (i10 == 3) {
            this.j = 0;
            this.i = 1;
        } else if (i10 != 4) {
            f5.a.K("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.j = 0;
            this.i = 0;
        } else {
            this.j = 1;
            this.i = 1;
        }
        h(0);
        g();
        this.w = true;
        this.x = -9223372036854775807L;
    }

    @Override // u4.i
    public final j b() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new j(0, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[SYNTHETIC] */
    @Override // u4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(g gVar) {
        boolean z10;
        ByteBuffer byteBuffer = gVar.b;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        w wVar = this.g;
        wVar.A(limit, array);
        boolean z11 = false;
        while (true) {
            int a2 = wVar.a();
            int i10 = this.h;
            if (a2 < i10) {
                if (z11) {
                    int i11 = this.p;
                    if (i11 == 1 || i11 == 3) {
                        this.n = f();
                        this.x = this.e;
                        return;
                    }
                    return;
                }
                return;
            }
            int r6 = i10 == 2 ? -4 : wVar.r();
            int r9 = wVar.r();
            int r10 = wVar.r();
            if ((r6 & 2) == 0 && (r6 & 1) == this.i) {
                byte b10 = (byte) (r9 & 127);
                byte b11 = (byte) (r10 & 127);
                if (b10 != 0 || b11 != 0) {
                    boolean z12 = this.r;
                    if ((r6 & 4) == 4) {
                        boolean[] zArr = F;
                        if (zArr[r9] && zArr[r10]) {
                            z10 = true;
                            this.r = z10;
                            if (z10 || (b10 & 240) != 16) {
                                this.s = false;
                            } else if (this.s && this.t == b10 && this.u == b11) {
                                this.s = false;
                            } else {
                                this.s = true;
                                this.t = b10;
                                this.u = b11;
                            }
                            if (!z10) {
                                if (1 <= b10 && b10 <= 15) {
                                    this.w = false;
                                } else if ((b10 & 246) == 20) {
                                    if (b11 != 32 && b11 != 47) {
                                        switch (b11) {
                                            default:
                                                switch (b11) {
                                                    case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                                                        this.w = false;
                                                        break;
                                                }
                                            case 37:
                                            case 38:
                                            case Maneuver.TYPE_DESTINATION /* 39 */:
                                                this.w = true;
                                                break;
                                        }
                                    }
                                    this.w = true;
                                }
                                if (this.w) {
                                    int i12 = b10 & 224;
                                    if (i12 == 0) {
                                        this.v = (b10 >> 3) & 1;
                                    }
                                    if (this.v == this.j) {
                                        if (i12 == 0) {
                                            int i13 = b10 & 247;
                                            if (i13 == 17 && (b11 & 240) == 48) {
                                                this.m.a((char) C[b11 & 15]);
                                            } else {
                                                int i14 = b10 & 246;
                                                if (i14 == 18 && (b11 & 224) == 32) {
                                                    this.m.b();
                                                    this.m.a((char) ((b10 & 1) == 0 ? D[b11 & 31] : E[b11 & 31]));
                                                } else if (i13 == 17 && (b11 & 240) == 32) {
                                                    this.m.a(' ');
                                                    boolean z13 = (b11 & 1) == 1;
                                                    b bVar = this.m;
                                                    bVar.a.add(new a((b11 >> 1) & 7, z13, bVar.c.length()));
                                                } else if ((b10 & 240) == 16 && (b11 & 192) == 64) {
                                                    int i15 = y[b10 & 7];
                                                    if ((b11 & 32) != 0) {
                                                        i15++;
                                                    }
                                                    b bVar2 = this.m;
                                                    if (i15 != bVar2.d) {
                                                        if (this.p != 1 && !bVar2.e()) {
                                                            b bVar3 = new b(this.p, this.q);
                                                            this.m = bVar3;
                                                            this.l.add(bVar3);
                                                        }
                                                        this.m.d = i15;
                                                    }
                                                    boolean z14 = (b11 & 16) == 16;
                                                    boolean z15 = (b11 & 1) == 1;
                                                    int i16 = (b11 >> 1) & 7;
                                                    b bVar4 = this.m;
                                                    bVar4.a.add(new a(z14 ? 8 : i16, z15, bVar4.c.length()));
                                                    if (z14) {
                                                        this.m.e = z[i16];
                                                    }
                                                } else if (i13 == 23 && b11 >= 33 && b11 <= 35) {
                                                    this.m.f = b11 - 32;
                                                } else if (i14 == 20 && (b11 & 240) == 32) {
                                                    if (b11 == 32) {
                                                        h(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                h(1);
                                                                this.q = 2;
                                                                this.m.h = 2;
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                this.q = 3;
                                                                this.m.h = 3;
                                                                break;
                                                            case Maneuver.TYPE_DESTINATION /* 39 */:
                                                                h(1);
                                                                this.q = 4;
                                                                this.m.h = 4;
                                                                break;
                                                            default:
                                                                int i17 = this.p;
                                                                if (i17 != 0) {
                                                                    if (b11 == 33) {
                                                                        this.m.b();
                                                                        break;
                                                                    } else {
                                                                        switch (b11) {
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                this.n = Collections.EMPTY_LIST;
                                                                                if (i17 == 1 || i17 == 3) {
                                                                                    g();
                                                                                    break;
                                                                                }
                                                                            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                if (i17 == 1 && !this.m.e()) {
                                                                                    b bVar5 = this.m;
                                                                                    ArrayList arrayList = bVar5.b;
                                                                                    arrayList.add(bVar5.d());
                                                                                    bVar5.c.setLength(0);
                                                                                    bVar5.a.clear();
                                                                                    int min = Math.min(bVar5.h, bVar5.d);
                                                                                    while (arrayList.size() >= min) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                g();
                                                                                break;
                                                                            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                                                                this.n = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            }
                                        } else {
                                            b bVar6 = this.m;
                                            int[] iArr = B;
                                            bVar6.a((char) iArr[(b10 & Byte.MAX_VALUE) - 32]);
                                            if ((b11 & 224) != 0) {
                                                this.m.a((char) iArr[(b11 & Byte.MAX_VALUE) - 32]);
                                            }
                                        }
                                        z11 = true;
                                    }
                                }
                            } else if (z12) {
                                g();
                                z11 = true;
                            }
                        }
                    }
                    z10 = false;
                    this.r = z10;
                    if (z10) {
                    }
                    this.s = false;
                    if (!z10) {
                    }
                }
            }
        }
    }

    @Override // u4.i, m3.e
    /* renamed from: d */
    public final k dequeueOutputBuffer() {
        k kVar;
        k dequeueOutputBuffer = super.dequeueOutputBuffer();
        if (dequeueOutputBuffer != null) {
            return dequeueOutputBuffer;
        }
        long j10 = this.k;
        if (j10 == -9223372036854775807L) {
            return null;
        }
        long j11 = this.x;
        if (j11 == -9223372036854775807L || this.e - j11 < j10 || (kVar = (k) this.b.pollFirst()) == null) {
            return null;
        }
        this.n = Collections.EMPTY_LIST;
        this.x = -9223372036854775807L;
        kVar.a(this.e, b(), Long.MAX_VALUE);
        return kVar;
    }

    @Override // u4.i
    public final boolean e() {
        return this.n != this.o;
    }

    public final ArrayList f() {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            t4.b c3 = ((b) arrayList.get(i11)).c(TLObject.FLAG_31);
            arrayList2.add(c3);
            if (c3 != null) {
                i10 = Math.min(i10, c3.r);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            t4.b bVar = (t4.b) arrayList2.get(i12);
            if (bVar != null) {
                if (bVar.r != i10) {
                    bVar = ((b) arrayList.get(i12)).c(i10);
                    bVar.getClass();
                }
                arrayList3.add(bVar);
            }
        }
        return arrayList3;
    }

    @Override // u4.i, m3.e
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        h(0);
        this.q = 4;
        this.m.h = 4;
        g();
        this.r = false;
        this.s = false;
        this.t = (byte) 0;
        this.u = (byte) 0;
        this.v = 0;
        this.w = true;
        this.x = -9223372036854775807L;
    }

    public final void g() {
        b bVar = this.m;
        bVar.g = this.p;
        bVar.a.clear();
        bVar.b.clear();
        bVar.c.setLength(0);
        bVar.d = 15;
        bVar.e = 0;
        bVar.f = 0;
        ArrayList arrayList = this.l;
        arrayList.clear();
        arrayList.add(this.m);
    }

    @Override // m3.e
    public final String getName() {
        return "Cea608Decoder";
    }

    public final void h(int i10) {
        int i11 = this.p;
        if (i11 == i10) {
            return;
        }
        this.p = i10;
        if (i10 != 3) {
            g();
            if (i11 == 3 || i10 == 1 || i10 == 0) {
                this.n = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i12 >= arrayList.size()) {
                return;
            }
            ((b) arrayList.get(i12)).g = i10;
            i12++;
        }
    }

    @Override // u4.i, m3.e
    public final void release() {
    }
}
