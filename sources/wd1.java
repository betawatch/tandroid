// default package

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class wd1 extends de1 {
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
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, jn7.B3, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, jn7.I3, 93, 237, jn7.R3, jn7.Y3, 97, 98, 99, 100, 101, jn7.m1, jn7.n1, jn7.o1, jn7.p1, jn7.q1, jn7.r1, jn7.s1, jn7.t1, jn7.u1, jn7.v1, jn7.w1, jn7.x1, jn7.y1, jn7.z1, jn7.A1, jn7.B1, jn7.C1, jn7.D1, jn7.E1, 121, jn7.F1, jn7.G3, jn7.V3, jn7.m3, jn7.P3, 9632};
    public static final int[] D = {jn7.D2, jn7.F2, jn7.S2, jn7.U2, 8482, jn7.r2, jn7.s2, 9834, jn7.A3, 32, jn7.H3, jn7.C3, jn7.J3, jn7.M3, jn7.S3, jn7.Z3};
    public static final int[] E = {jn7.W2, jn7.e3, 211, jn7.u3, jn7.w3, jn7.a4, 8216, jn7.q2, 42, 39, 8212, jn7.y2, 8480, 8226, 8220, 8221, jn7.V2, jn7.X2, jn7.c3, jn7.d3, jn7.f3, 203, 235, jn7.j3, jn7.k3, jn7.N3, jn7.o3, jn7.t3, jn7.X3, jn7.v3, jn7.A2, jn7.Q2};
    public static final int[] F = {jn7.Y2, jn7.D3, jn7.i3, jn7.h3, jn7.L3, jn7.n3, jn7.Q3, jn7.p3, jn7.T3, jn7.G1, jn7.I1, 92, 94, 95, jn7.H1, jn7.J1, jn7.Z2, jn7.E3, jn7.q3, jn7.U3, jn7.z3, jn7.u2, jn7.t2, 9474, jn7.a3, jn7.F3, jn7.s3, jn7.W3, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final ey7 h = new ey7();
    public final ArrayList m = new ArrayList();
    public vd1 n = new vd1(0, 4);
    public int w = 0;
    public final long l = 16000000;

    public wd1(String str, int i) {
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
            efd.f("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
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

    @Override // de1
    public final wz4 f() {
        List list = this.o;
        this.p = list;
        list.getClass();
        return new wz4(list);
    }

    @Override // de1, n93
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
    @Override // de1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(be1 be1Var) {
        boolean z2;
        ByteBuffer byteBuffer = be1Var.c;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        ey7 ey7Var = this.h;
        ey7Var.L(limit, array);
        boolean z3 = false;
        while (true) {
            int a = ey7Var.a();
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
            int A2 = b == 2 ? -4 : ey7Var.A();
            int A3 = ey7Var.A();
            int A4 = ey7Var.A();
            if ((A2 & 2) == 0 && (A2 & 1) == this.j) {
                byte b3 = (byte) (A3 & jn7.K1);
                byte b4 = (byte) (A4 & jn7.K1);
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
                                                    vd1 vd1Var = this.n;
                                                    vd1Var.a.add(new ud1((b4 >> 1) & 7, vd1Var.c.length(), z5));
                                                } else if ((b3 & 240) == 16 && (b4 & 192) == 64) {
                                                    int i5 = z[b3 & 7];
                                                    if ((b4 & 32) != 0) {
                                                        i5++;
                                                    }
                                                    vd1 vd1Var2 = this.n;
                                                    if (i5 != vd1Var2.d) {
                                                        if (this.q != 1 && !vd1Var2.e()) {
                                                            vd1 vd1Var3 = new vd1(this.q, this.r);
                                                            this.n = vd1Var3;
                                                            this.m.add(vd1Var3);
                                                        }
                                                        vd1Var2 = this.n;
                                                        vd1Var2.d = i5;
                                                    }
                                                    boolean z6 = (b4 & 16) == 16;
                                                    boolean z7 = (b4 & 1) == 1;
                                                    int i6 = (b4 >> 1) & 7;
                                                    vd1Var2.a.add(new ud1(z6 ? 8 : i6, vd1Var2.c.length(), z7));
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
                                                                                    vd1 vd1Var4 = this.n;
                                                                                    ArrayList arrayList = vd1Var4.b;
                                                                                    arrayList.add(vd1Var4.d());
                                                                                    vd1Var4.c.setLength(0);
                                                                                    vd1Var4.a.clear();
                                                                                    int min = Math.min((int) vd1Var4.h, vd1Var4.d);
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
                                            vd1 vd1Var5 = this.n;
                                            int[] iArr = C;
                                            vd1Var5.a((char) iArr[(b3 & Byte.MAX_VALUE) - 32]);
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

    @Override // n93
    public final String getName() {
        return "Cea608Decoder";
    }

    @Override // de1, n93
    /* renamed from: h */
    public final oeb c() {
        oeb oebVar;
        oeb c = super.c();
        if (c != null) {
            return c;
        }
        long j = this.l;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j2 = this.y;
        if (j2 == -9223372036854775807L || this.e - j2 < j || (oebVar = (oeb) this.b.pollFirst()) == null) {
            return null;
        }
        this.o = Collections.EMPTY_LIST;
        this.y = -9223372036854775807L;
        wz4 f = f();
        long j3 = this.e;
        oebVar.timeUs = j3;
        oebVar.a = f;
        oebVar.b = j3;
        return oebVar;
    }

    @Override // de1
    public final boolean i() {
        return this.o != this.p;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            m43 c = ((vd1) arrayList.get(i2)).c(TLObject.FLAG_31);
            arrayList2.add(c);
            if (c != null) {
                i = Math.min(i, c.i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            m43 m43Var = (m43) arrayList2.get(i3);
            if (m43Var != null) {
                if (m43Var.i != i) {
                    m43Var = ((vd1) arrayList.get(i3)).c(i);
                    m43Var.getClass();
                }
                arrayList3.add(m43Var);
            }
        }
        return arrayList3;
    }

    public final void k() {
        vd1 vd1Var = this.n;
        vd1Var.g = this.q;
        vd1Var.a.clear();
        vd1Var.b.clear();
        vd1Var.c.setLength(0);
        vd1Var.d = 15;
        vd1Var.e = 0;
        vd1Var.f = 0;
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
            ((vd1) arrayList.get(i2)).g = i;
            i2++;
        }
    }

    @Override // de1, n93
    public final void release() {
    }
}
