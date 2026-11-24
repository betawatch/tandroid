// default package

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ve1 extends cf1 {
    public final byte i;
    public final boolean j;
    public final boolean k;
    public List o;
    public List p;
    public byte q;
    public byte r;
    public boolean s;
    public boolean t;
    public byte u;
    public byte v;
    public boolean x;
    public long y;
    public static final int[] z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, nm7.B3, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, nm7.I3, 93, 237, nm7.R3, nm7.Y3, 97, 98, 99, 100, 101, nm7.m1, nm7.n1, nm7.o1, nm7.p1, nm7.q1, nm7.r1, nm7.s1, nm7.t1, nm7.u1, nm7.v1, nm7.w1, nm7.x1, nm7.y1, nm7.z1, nm7.A1, nm7.B1, nm7.C1, nm7.D1, nm7.E1, 121, nm7.F1, nm7.G3, nm7.V3, nm7.m3, nm7.P3, 9632};
    public static final int[] D = {nm7.D2, nm7.F2, nm7.S2, nm7.U2, 8482, nm7.r2, nm7.s2, 9834, nm7.A3, 32, nm7.H3, nm7.C3, nm7.J3, nm7.M3, nm7.S3, nm7.Z3};
    public static final int[] E = {nm7.W2, nm7.e3, 211, nm7.u3, nm7.w3, nm7.a4, 8216, nm7.q2, 42, 39, 8212, nm7.y2, 8480, 8226, 8220, 8221, nm7.V2, nm7.X2, nm7.c3, nm7.d3, nm7.f3, 203, 235, nm7.j3, nm7.k3, nm7.N3, nm7.o3, nm7.t3, nm7.X3, nm7.v3, nm7.A2, nm7.Q2};
    public static final int[] F = {nm7.Y2, nm7.D3, nm7.i3, nm7.h3, nm7.L3, nm7.n3, nm7.Q3, nm7.p3, nm7.T3, nm7.G1, nm7.I1, 92, 94, 95, nm7.H1, nm7.J1, nm7.Z2, nm7.E3, nm7.q3, nm7.U3, nm7.z3, nm7.u2, nm7.t2, 9474, nm7.a3, nm7.F3, nm7.s3, nm7.W3, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final yw7 h = new yw7();
    public final ArrayList m = new ArrayList();
    public ue1 n = new ue1(0, 4);
    public int w = 0;
    public final long l = 16000000;

    public ve1(String str, int i) {
        this.i = "application/x-mp4-cea-608".equals(str) ? (byte) 2 : (byte) 3;
        if (i == 1) {
            this.k = false;
            this.j = false;
        } else if (i == 2) {
            this.k = true;
            this.j = false;
        } else if (i == 3) {
            this.k = false;
            this.j = true;
        } else if (i != 4) {
            ncd.f("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.k = false;
            this.j = false;
        } else {
            this.k = true;
            this.j = true;
        }
        l(0);
        k();
        this.x = true;
        this.y = -9223372036854775807L;
    }

    @Override // cf1
    public final sz4 f() {
        List list = this.o;
        this.p = list;
        list.getClass();
        return new sz4(list);
    }

    @Override // cf1, ga3
    public final void flush() {
        super.flush();
        this.o = null;
        this.p = null;
        l(0);
        this.r = (byte) 4;
        this.n.h = (byte) 4;
        k();
        this.s = false;
        this.t = false;
        this.u = (byte) 0;
        this.v = (byte) 0;
        this.w = 0;
        this.x = true;
        this.y = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x007b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082 A[SYNTHETIC] */
    @Override // cf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(af1 af1Var) {
        boolean z2;
        ByteBuffer byteBuffer = af1Var.c;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        yw7 yw7Var = this.h;
        yw7Var.L(limit, array);
        boolean z3 = false;
        while (true) {
            int a = yw7Var.a();
            byte b = this.i;
            if (a < b) {
                if (z3) {
                    byte b2 = this.q;
                    if (b2 == 1 || b2 == 3) {
                        this.o = j();
                        this.y = this.e;
                        return;
                    }
                    return;
                }
                return;
            }
            int A2 = b == 2 ? -4 : yw7Var.A();
            int A3 = yw7Var.A();
            int A4 = yw7Var.A();
            if ((A2 & 2) == 0 && (A2 & 1) == this.j) {
                byte b3 = (byte) (A3 & nm7.K1);
                byte b4 = (byte) (A4 & nm7.K1);
                if (b3 != 0 || b4 != 0) {
                    boolean z4 = this.s;
                    if ((A2 & 4) == 4) {
                        boolean[] zArr = G;
                        if (zArr[A3] && zArr[A4]) {
                            z2 = true;
                            this.s = z2;
                            if (z2 || (b3 & 240) != 16) {
                                this.t = false;
                            } else if (this.t && this.u == b3 && this.v == b4) {
                                this.t = false;
                            } else {
                                this.t = true;
                                this.u = b3;
                                this.v = b4;
                            }
                            if (!z2) {
                                if (1 <= b3 && b3 <= 15) {
                                    this.x = false;
                                } else if ((b3 & 246) == 20) {
                                    if (b4 != 32 && b4 != 47) {
                                        switch (b4) {
                                            default:
                                                switch (b4) {
                                                    case 42:
                                                    case 43:
                                                        this.x = false;
                                                        break;
                                                }
                                            case 37:
                                            case 38:
                                            case 39:
                                                this.x = true;
                                                break;
                                        }
                                    }
                                    this.x = true;
                                }
                                if (this.x) {
                                    int i = b3 & 224;
                                    if (i == 0) {
                                        this.w = (b3 >> 3) & 1;
                                    }
                                    if (this.w == this.k) {
                                        if (i == 0) {
                                            int i2 = b3 & 247;
                                            if (i2 == 17 && (b4 & 240) == 48) {
                                                this.n.a((char) D[b4 & 15]);
                                            } else {
                                                int i3 = b3 & 246;
                                                if (i3 == 18 && (b4 & 224) == 32) {
                                                    this.n.b();
                                                    int i4 = b4 & 31;
                                                    this.n.a((char) ((b3 & 1) == 0 ? E[i4] : F[i4]));
                                                } else if (i2 == 17 && (b4 & 240) == 32) {
                                                    this.n.a(' ');
                                                    boolean z5 = (b4 & 1) == 1;
                                                    ue1 ue1Var = this.n;
                                                    ue1Var.a.add(new te1((b4 >> 1) & 7, ue1Var.c.length(), z5));
                                                } else if ((b3 & 240) == 16 && (b4 & 192) == 64) {
                                                    int i5 = z[b3 & 7];
                                                    if ((b4 & 32) != 0) {
                                                        i5++;
                                                    }
                                                    ue1 ue1Var2 = this.n;
                                                    if (i5 != ue1Var2.d) {
                                                        if (this.q != 1 && !ue1Var2.e()) {
                                                            ue1 ue1Var3 = new ue1(this.q, this.r);
                                                            this.n = ue1Var3;
                                                            this.m.add(ue1Var3);
                                                        }
                                                        ue1Var2 = this.n;
                                                        ue1Var2.d = i5;
                                                    }
                                                    boolean z6 = (b4 & 16) == 16;
                                                    boolean z7 = (b4 & 1) == 1;
                                                    int i6 = (b4 >> 1) & 7;
                                                    ue1Var2.a.add(new te1(z6 ? 8 : i6, ue1Var2.c.length(), z7));
                                                    if (z6) {
                                                        this.n.e = A[i6];
                                                    }
                                                } else if (i2 == 23 && b4 >= 33 && b4 <= 35) {
                                                    this.n.f = b4 - 32;
                                                } else if (i3 == 20 && (b4 & 240) == 32) {
                                                    if (b4 == 32) {
                                                        l(2);
                                                    } else if (b4 != 41) {
                                                        switch (b4) {
                                                            case 37:
                                                                l(1);
                                                                this.r = (byte) 2;
                                                                this.n.h = (byte) 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.r = (byte) 3;
                                                                this.n.h = (byte) 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.r = (byte) 4;
                                                                this.n.h = (byte) 4;
                                                                break;
                                                            default:
                                                                byte b5 = this.q;
                                                                if (b5 != 0) {
                                                                    if (b4 == 33) {
                                                                        this.n.b();
                                                                        break;
                                                                    } else {
                                                                        switch (b4) {
                                                                            case 44:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (b5 == 1 || b5 == 3) {
                                                                                    k();
                                                                                    break;
                                                                                }
                                                                            case 45:
                                                                                if (b5 == 1 && !this.n.e()) {
                                                                                    ue1 ue1Var4 = this.n;
                                                                                    ArrayList arrayList = ue1Var4.b;
                                                                                    arrayList.add(ue1Var4.d());
                                                                                    ue1Var4.c.setLength(0);
                                                                                    ue1Var4.a.clear();
                                                                                    int min = Math.min((int) ue1Var4.h, ue1Var4.d);
                                                                                    while (arrayList.size() >= min) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            }
                                        } else {
                                            ue1 ue1Var5 = this.n;
                                            int[] iArr = C;
                                            ue1Var5.a((char) iArr[(b3 & Byte.MAX_VALUE) - 32]);
                                            if ((b4 & 224) != 0) {
                                                this.n.a((char) iArr[(b4 & Byte.MAX_VALUE) - 32]);
                                            }
                                        }
                                        z3 = true;
                                    }
                                }
                            } else if (z4) {
                                k();
                                z3 = true;
                            }
                        }
                    }
                    z2 = false;
                    this.s = z2;
                    if (z2) {
                    }
                    this.t = false;
                    if (!z2) {
                    }
                }
            }
        }
    }

    @Override // ga3
    public final String getName() {
        return "Cea608Decoder";
    }

    @Override // cf1, ga3
    /* renamed from: h */
    public final scb c() {
        scb scbVar;
        scb c = super.c();
        if (c != null) {
            return c;
        }
        long j = this.l;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j2 = this.y;
        if (j2 == -9223372036854775807L || this.e - j2 < j || (scbVar = (scb) this.b.pollFirst()) == null) {
            return null;
        }
        this.o = Collections.EMPTY_LIST;
        this.y = -9223372036854775807L;
        sz4 f = f();
        long j3 = this.e;
        scbVar.timeUs = j3;
        scbVar.a = f;
        scbVar.b = j3;
        return scbVar;
    }

    @Override // cf1
    public final boolean i() {
        return this.o != this.p;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            f53 c = ((ue1) arrayList.get(i2)).c(TLObject.FLAG_31);
            arrayList2.add(c);
            if (c != null) {
                i = Math.min(i, c.i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            f53 f53Var = (f53) arrayList2.get(i3);
            if (f53Var != null) {
                if (f53Var.i != i) {
                    f53Var = ((ue1) arrayList.get(i3)).c(i);
                    f53Var.getClass();
                }
                arrayList3.add(f53Var);
            }
        }
        return arrayList3;
    }

    public final void k() {
        ue1 ue1Var = this.n;
        ue1Var.g = this.q;
        ue1Var.a.clear();
        ue1Var.b.clear();
        ue1Var.c.setLength(0);
        ue1Var.d = 15;
        ue1Var.e = 0;
        ue1Var.f = 0;
        ArrayList arrayList = this.m;
        arrayList.clear();
        arrayList.add(this.n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(int i) {
        byte b = this.q;
        if (b == i) {
            return;
        }
        this.q = i;
        if (i != 3) {
            k();
            if (b == 3 || i == 1 || i == 0) {
                this.o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((ue1) arrayList.get(i2)).g = i;
            i2++;
        }
    }

    @Override // cf1, ga3
    public final void release() {
    }
}
