// default package

import android.text.Layout;
import android.text.SpannableStringBuilder;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class rd1 extends ud1 {
    public final xu7 h = new xu7();
    public final qd1 i = new qd1();
    public int j = -1;
    public final int k;
    public final pd1[] l;
    public pd1 m;
    public List n;
    public List o;
    public qd1 p;
    public int q;

    public rd1(int i, List list) {
        this.k = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = wj2.a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.l = new pd1[8];
        int i2 = 0;
        while (true) {
            pd1[] pd1VarArr = this.l;
            if (i2 >= 8) {
                this.m = pd1VarArr[0];
                return;
            } else {
                pd1VarArr[i2] = new pd1();
                i2++;
            }
        }
    }

    @Override // ud1
    public final qx4 f() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new qx4(list);
    }

    @Override // ud1, u83
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = this.l[0];
        l();
        this.p = null;
    }

    @Override // ud1
    public final void g(sd1 sd1Var) {
        qd1 qd1Var;
        ByteBuffer byteBuffer = sd1Var.c;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        xu7 xu7Var = this.h;
        xu7Var.L(limit, array);
        while (xu7Var.a() >= 3) {
            int A = xu7Var.A();
            int i = A & 3;
            boolean z = (A & 4) == 4;
            byte A2 = (byte) xu7Var.A();
            byte A3 = (byte) xu7Var.A();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        j();
                        int i2 = (A2 & 192) >> 6;
                        int i3 = this.j;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            l();
                            lad.f("Cea708Decoder", "Sequence number discontinuity. previous=" + this.j + " current=" + i2);
                        }
                        this.j = i2;
                        int i4 = A2 & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        qd1Var = new qd1(i2, i4);
                        this.p = qd1Var;
                        byte[] bArr = qd1Var.b;
                        qd1Var.e = 1;
                        bArr[0] = A3;
                    } else {
                        gre.f(i == 2);
                        qd1 qd1Var2 = this.p;
                        if (qd1Var2 == null) {
                            lad.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = qd1Var2.b;
                            int i5 = qd1Var2.e;
                            int i6 = i5 + 1;
                            qd1Var2.e = i6;
                            bArr2[i5] = A2;
                            qd1Var2.e = i5 + 2;
                            bArr2[i6] = A3;
                            qd1Var = qd1Var2;
                        }
                    }
                    if (qd1Var.e == (qd1Var.d << 1) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override // u83
    public final String getName() {
        return "Cea708Decoder";
    }

    @Override // ud1
    public final boolean i() {
        return this.n != this.o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void j() {
        boolean z;
        int i;
        int i2;
        qd1 qd1Var = this.p;
        if (qd1Var == null) {
            return;
        }
        if (qd1Var.e != (qd1Var.d << 1) - 1) {
            lad.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.p.d << 1) - 1) + ", but current index is " + this.p.e + " (sequence number " + this.p.c + ");");
        }
        qd1 qd1Var2 = this.p;
        byte[] bArr = qd1Var2.b;
        int i3 = qd1Var2.e;
        qd1 qd1Var3 = this.i;
        qd1Var3.j(i3, bArr);
        boolean z2 = false;
        while (true) {
            if (qd1Var3.b() > 0) {
                int i4 = 3;
                int f = qd1Var3.f(3);
                int f2 = qd1Var3.f(5);
                int i5 = 2;
                if (f == 7) {
                    qd1Var3.n(2);
                    f = qd1Var3.f(6);
                    if (f < 7) {
                        b00.o(f, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (f2 == 0) {
                    if (f != 0) {
                        lad.f("Cea708Decoder", "serviceNumber is non-zero (" + f + ") when blockSize is 0");
                    }
                } else if (f != this.k) {
                    qd1Var3.o(f2);
                } else {
                    int i6 = (qd1Var3.c << 3) + qd1Var3.d + (f2 << 3);
                    while ((qd1Var3.c << i4) + qd1Var3.d < i6) {
                        int f3 = qd1Var3.f(8);
                        if (f3 == 16) {
                            z = true;
                            int f4 = qd1Var3.f(8);
                            if (f4 <= 31) {
                                if (f4 > 7) {
                                    if (f4 <= 15) {
                                        qd1Var3.n(8);
                                    } else if (f4 <= 23) {
                                        qd1Var3.n(16);
                                    } else if (f4 <= 31) {
                                        qd1Var3.n(24);
                                    }
                                }
                            } else if (f4 <= 127) {
                                if (f4 == 32) {
                                    this.m.a(' ');
                                } else if (f4 == 33) {
                                    this.m.a((char) 160);
                                } else if (f4 == 37) {
                                    this.m.a((char) 8230);
                                } else if (f4 == 42) {
                                    this.m.a((char) 352);
                                } else if (f4 == 44) {
                                    this.m.a((char) 338);
                                } else if (f4 == 63) {
                                    this.m.a((char) 376);
                                } else if (f4 == 57) {
                                    this.m.a((char) 8482);
                                } else if (f4 == 58) {
                                    this.m.a((char) 353);
                                } else if (f4 == 60) {
                                    this.m.a((char) 339);
                                } else if (f4 != 61) {
                                    switch (f4) {
                                        case 48:
                                            this.m.a((char) 9608);
                                            break;
                                        case 49:
                                            this.m.a((char) 8216);
                                            break;
                                        case 50:
                                            this.m.a((char) 8217);
                                            break;
                                        case kk7.n0 /* 51 */:
                                            this.m.a((char) 8220);
                                            break;
                                        case kk7.o0 /* 52 */:
                                            this.m.a((char) 8221);
                                            break;
                                        case kk7.p0 /* 53 */:
                                            this.m.a((char) 8226);
                                            break;
                                        default:
                                            switch (f4) {
                                                case kk7.C1 /* 118 */:
                                                    this.m.a((char) 8539);
                                                    break;
                                                case kk7.D1 /* 119 */:
                                                    this.m.a((char) 8540);
                                                    break;
                                                case 120:
                                                    this.m.a((char) 8541);
                                                    break;
                                                case kk7.E1 /* 121 */:
                                                    this.m.a((char) 8542);
                                                    break;
                                                case kk7.F1 /* 122 */:
                                                    this.m.a((char) 9474);
                                                    break;
                                                case kk7.G1 /* 123 */:
                                                    this.m.a((char) 9488);
                                                    break;
                                                case kk7.H1 /* 124 */:
                                                    this.m.a((char) 9492);
                                                    break;
                                                case kk7.I1 /* 125 */:
                                                    this.m.a((char) 9472);
                                                    break;
                                                case kk7.J1 /* 126 */:
                                                    this.m.a((char) 9496);
                                                    break;
                                                case kk7.K1 /* 127 */:
                                                    this.m.a((char) 9484);
                                                    break;
                                                default:
                                                    b00.o(f4, "Invalid G2 character: ", "Cea708Decoder");
                                                    break;
                                            }
                                    }
                                } else {
                                    this.m.a((char) 8480);
                                }
                                z2 = z;
                            } else if (f4 > 159) {
                                i = 2;
                                i2 = 3;
                                if (f4 <= 255) {
                                    if (f4 == 160) {
                                        this.m.a((char) 13252);
                                    } else {
                                        b00.o(f4, "Invalid G3 character: ", "Cea708Decoder");
                                        this.m.a('_');
                                    }
                                    z2 = true;
                                } else {
                                    b00.o(f4, "Invalid extended command: ", "Cea708Decoder");
                                }
                            } else if (f4 <= 135) {
                                qd1Var3.n(32);
                            } else if (f4 <= 143) {
                                qd1Var3.n(40);
                            } else if (f4 <= 159) {
                                i = 2;
                                qd1Var3.n(2);
                                i2 = 3;
                                qd1Var3.n(qd1Var3.f(6) << 3);
                            }
                            i = 2;
                            i2 = 3;
                        } else if (f3 <= 31) {
                            if (f3 != 0) {
                                if (f3 == i4) {
                                    this.n = k();
                                } else if (f3 != 8) {
                                    switch (f3) {
                                        case 12:
                                            l();
                                            break;
                                        case 13:
                                            this.m.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (f3 < 17 || f3 > 23) {
                                                if (f3 < 24 || f3 > 31) {
                                                    b00.o(f3, "Invalid C0 command: ", "Cea708Decoder");
                                                    break;
                                                } else {
                                                    lad.f("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + f3);
                                                    qd1Var3.n(16);
                                                    break;
                                                }
                                            } else {
                                                lad.f("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + f3);
                                                qd1Var3.n(8);
                                                break;
                                            }
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = this.m.b;
                                    int length = spannableStringBuilder.length();
                                    if (length > 0) {
                                        spannableStringBuilder.delete(length - 1, length);
                                    }
                                }
                            }
                            i2 = i4;
                            i = i5;
                        } else if (f3 <= 127) {
                            pd1 pd1Var = this.m;
                            if (f3 == 127) {
                                pd1Var.a((char) 9835);
                            } else {
                                pd1Var.a((char) (f3 & kk7.d4));
                            }
                            i2 = i4;
                            i = i5;
                            z2 = true;
                        } else {
                            if (f3 <= 159) {
                                pd1[] pd1VarArr = this.l;
                                switch (f3) {
                                    case 128:
                                    case kk7.M1 /* 129 */:
                                    case kk7.N1 /* 130 */:
                                    case kk7.O1 /* 131 */:
                                    case kk7.P1 /* 132 */:
                                    case 133:
                                    case 134:
                                    case kk7.Q1 /* 135 */:
                                        z = true;
                                        int i7 = f3 - 128;
                                        if (this.q != i7) {
                                            this.q = i7;
                                            this.m = pd1VarArr[i7];
                                            break;
                                        }
                                        break;
                                    case kk7.R1 /* 136 */:
                                        z = true;
                                        for (int i8 = 1; i8 <= 8; i8++) {
                                            if (qd1Var3.e()) {
                                                pd1 pd1Var2 = pd1VarArr[8 - i8];
                                                pd1Var2.a.clear();
                                                pd1Var2.b.clear();
                                                pd1Var2.o = -1;
                                                pd1Var2.p = -1;
                                                pd1Var2.q = -1;
                                                pd1Var2.s = -1;
                                                pd1Var2.u = 0;
                                            }
                                        }
                                        break;
                                    case kk7.S1 /* 137 */:
                                        for (int i9 = 1; i9 <= 8; i9++) {
                                            if (qd1Var3.e()) {
                                                pd1VarArr[8 - i9].d = true;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case kk7.T1 /* 138 */:
                                        for (int i10 = 1; i10 <= 8; i10++) {
                                            if (qd1Var3.e()) {
                                                pd1VarArr[8 - i10].d = false;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case kk7.U1 /* 139 */:
                                        for (int i11 = 1; i11 <= 8; i11++) {
                                            if (qd1Var3.e()) {
                                                pd1VarArr[8 - i11].d = !r1.d;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case kk7.V1 /* 140 */:
                                        for (int i12 = 1; i12 <= 8; i12++) {
                                            if (qd1Var3.e()) {
                                                pd1VarArr[8 - i12].d();
                                            }
                                        }
                                        z = true;
                                        break;
                                    case kk7.W1 /* 141 */:
                                        qd1Var3.n(8);
                                        z = true;
                                        break;
                                    case kk7.X1 /* 142 */:
                                        z = true;
                                        break;
                                    case kk7.Y1 /* 143 */:
                                        l();
                                        z = true;
                                        break;
                                    case kk7.Z1 /* 144 */:
                                        int i13 = i5;
                                        if (this.m.c) {
                                            qd1Var3.f(4);
                                            qd1Var3.f(i13);
                                            qd1Var3.f(i13);
                                            boolean e = qd1Var3.e();
                                            boolean e2 = qd1Var3.e();
                                            qd1Var3.f(3);
                                            qd1Var3.f(3);
                                            this.m.e(e, e2);
                                        } else {
                                            qd1Var3.n(16);
                                        }
                                        z = true;
                                        break;
                                    case kk7.a2 /* 145 */:
                                        if (this.m.c) {
                                            int c = pd1.c(qd1Var3.f(2), qd1Var3.f(2), qd1Var3.f(2), qd1Var3.f(2));
                                            int c2 = pd1.c(qd1Var3.f(2), qd1Var3.f(2), qd1Var3.f(2), qd1Var3.f(2));
                                            qd1Var3.n(2);
                                            pd1.c(qd1Var3.f(2), qd1Var3.f(2), qd1Var3.f(2), 0);
                                            this.m.f(c, c2);
                                        } else {
                                            qd1Var3.n(24);
                                        }
                                        z = true;
                                        break;
                                    case kk7.b2 /* 146 */:
                                        if (this.m.c) {
                                            qd1Var3.n(4);
                                            int f5 = qd1Var3.f(4);
                                            qd1Var3.n(2);
                                            qd1Var3.f(6);
                                            pd1 pd1Var3 = this.m;
                                            if (pd1Var3.u != f5) {
                                                pd1Var3.a('\n');
                                            }
                                            pd1Var3.u = f5;
                                        } else {
                                            qd1Var3.n(16);
                                        }
                                        z = true;
                                        break;
                                    case kk7.c2 /* 147 */:
                                    case kk7.d2 /* 148 */:
                                    case kk7.e2 /* 149 */:
                                    case kk7.f2 /* 150 */:
                                    default:
                                        b00.o(f3, "Invalid C1 command: ", "Cea708Decoder");
                                        z = true;
                                        break;
                                    case kk7.g2 /* 151 */:
                                        if (this.m.c) {
                                            int c3 = pd1.c(qd1Var3.f(2), qd1Var3.f(2), qd1Var3.f(2), qd1Var3.f(2));
                                            qd1Var3.f(2);
                                            pd1.c(qd1Var3.f(2), qd1Var3.f(2), qd1Var3.f(2), 0);
                                            qd1Var3.e();
                                            qd1Var3.e();
                                            qd1Var3.f(2);
                                            qd1Var3.f(2);
                                            int f6 = qd1Var3.f(2);
                                            qd1Var3.n(8);
                                            pd1 pd1Var4 = this.m;
                                            pd1Var4.n = c3;
                                            pd1Var4.k = f6;
                                        } else {
                                            qd1Var3.n(32);
                                        }
                                        z = true;
                                        break;
                                    case kk7.h2 /* 152 */:
                                    case kk7.i2 /* 153 */:
                                    case kk7.j2 /* 154 */:
                                    case kk7.k2 /* 155 */:
                                    case kk7.l2 /* 156 */:
                                    case kk7.m2 /* 157 */:
                                    case kk7.n2 /* 158 */:
                                    case kk7.o2 /* 159 */:
                                        int i14 = f3 - 152;
                                        pd1 pd1Var5 = pd1VarArr[i14];
                                        qd1Var3.n(i5);
                                        boolean e3 = qd1Var3.e();
                                        qd1Var3.n(i5);
                                        int f7 = qd1Var3.f(i4);
                                        boolean e4 = qd1Var3.e();
                                        int f8 = qd1Var3.f(7);
                                        int f9 = qd1Var3.f(8);
                                        int f10 = qd1Var3.f(4);
                                        int f11 = qd1Var3.f(4);
                                        qd1Var3.n(i5);
                                        qd1Var3.n(6);
                                        qd1Var3.n(i5);
                                        int f12 = qd1Var3.f(3);
                                        int f13 = qd1Var3.f(3);
                                        ArrayList arrayList = pd1Var5.a;
                                        pd1Var5.c = true;
                                        pd1Var5.d = e3;
                                        pd1Var5.e = f7;
                                        pd1Var5.f = e4;
                                        pd1Var5.g = f8;
                                        pd1Var5.h = f9;
                                        pd1Var5.i = f10;
                                        int i15 = f11 + 1;
                                        if (pd1Var5.j != i15) {
                                            pd1Var5.j = i15;
                                            while (true) {
                                                if (arrayList.size() >= pd1Var5.j || arrayList.size() >= 15) {
                                                    arrayList.remove(0);
                                                }
                                            }
                                        }
                                        if (f12 != 0 && pd1Var5.l != f12) {
                                            pd1Var5.l = f12;
                                            int i16 = f12 - 1;
                                            int i17 = pd1.B[i16];
                                            boolean z3 = pd1.A[i16];
                                            int i18 = pd1.y[i16];
                                            int i19 = pd1.z[i16];
                                            int i20 = pd1.x[i16];
                                            pd1Var5.n = i17;
                                            pd1Var5.k = i20;
                                        }
                                        if (f13 != 0 && pd1Var5.m != f13) {
                                            pd1Var5.m = f13;
                                            int i21 = f13 - 1;
                                            int i22 = pd1.D[i21];
                                            int i23 = pd1.C[i21];
                                            pd1Var5.e(false, false);
                                            pd1Var5.f(pd1.v, pd1.E[i21]);
                                        }
                                        if (this.q != i14) {
                                            this.q = i14;
                                            this.m = pd1VarArr[i14];
                                        }
                                        z = true;
                                        break;
                                }
                            } else {
                                z = true;
                                if (f3 <= 255) {
                                    this.m.a((char) (f3 & kk7.d4));
                                } else {
                                    b00.o(f3, "Invalid base command: ", "Cea708Decoder");
                                    i = 2;
                                    i2 = 3;
                                }
                            }
                            z2 = z;
                            i = 2;
                            i2 = 3;
                        }
                        i5 = i;
                        i4 = i2;
                    }
                }
            }
        }
        if (z2) {
            this.n = k();
        }
        this.p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List k() {
        Layout.Alignment alignment;
        boolean z;
        float f;
        float f2;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            pd1[] pd1VarArr = this.l;
            pd1 pd1Var = pd1VarArr[i];
            if (pd1Var.c && (!pd1Var.a.isEmpty() || pd1Var.b.length() != 0)) {
                pd1 pd1Var2 = pd1VarArr[i];
                if (pd1Var2.d) {
                    ArrayList arrayList2 = pd1Var2.a;
                    od1 od1Var = null;
                    if (pd1Var2.c && (!arrayList2.isEmpty() || pd1Var2.b.length() != 0)) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i2));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) pd1Var2.b());
                        int i3 = pd1Var2.k;
                        if (i3 != 0) {
                            if (i3 == 1) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else if (i3 == 2) {
                                alignment = Layout.Alignment.ALIGN_CENTER;
                            } else if (i3 != 3) {
                                wn4.g(pd1Var2.k, "Unexpected justification value: ");
                                return null;
                            }
                            Layout.Alignment alignment2 = alignment;
                            z = pd1Var2.f;
                            int i4 = pd1Var2.h;
                            int i5 = pd1Var2.g;
                            if (z) {
                                f = i4 / 209.0f;
                                f2 = i5 / 74.0f;
                            } else {
                                f = i4 / 99.0f;
                                f2 = i5 / 99.0f;
                            }
                            float f3 = (f * 0.9f) + 0.05f;
                            float f4 = (f2 * 0.9f) + 0.05f;
                            int i6 = pd1Var2.i;
                            int i7 = i6 / 3;
                            int i8 = i7 != 0 ? 0 : i7 == 1 ? 1 : 2;
                            int i9 = i6 % 3;
                            int i10 = i9 != 0 ? 0 : i9 == 1 ? 1 : 2;
                            int i11 = pd1Var2.n;
                            od1Var = new od1(spannableStringBuilder, alignment2, f4, i8, f3, i10, i11 == pd1.w, i11, pd1Var2.e);
                        }
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        Layout.Alignment alignment22 = alignment;
                        z = pd1Var2.f;
                        int i42 = pd1Var2.h;
                        int i52 = pd1Var2.g;
                        if (z) {
                        }
                        float f32 = (f * 0.9f) + 0.05f;
                        float f42 = (f2 * 0.9f) + 0.05f;
                        int i62 = pd1Var2.i;
                        int i72 = i62 / 3;
                        if (i72 != 0) {
                        }
                        int i92 = i62 % 3;
                        if (i92 != 0) {
                        }
                        int i112 = pd1Var2.n;
                        od1Var = new od1(spannableStringBuilder, alignment22, f42, i8, f32, i10, i112 == pd1.w, i112, pd1Var2.e);
                    }
                    if (od1Var != null) {
                        arrayList.add(od1Var);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, od1.c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList3.add(((od1) arrayList.get(i12)).a);
        }
        return DesugarCollections.unmodifiableList(arrayList3);
    }

    public final void l() {
        for (int i = 0; i < 8; i++) {
            this.l[i].d();
        }
    }
}
