// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class ud3 {
    public static final int[] a = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
    public static final int[] b = {1, 2, 3, 6};
    public static final int[] c = {48000, 44100, 32000};
    public static final int[] d = {24000, 22050, oc1.AUDIO_CONTENT_SAMPLING_RATE};
    public static final int[] e = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] f = {32, 40, 48, 56, 64, 80, 96, jn7.w1, 128, jn7.p2, jn7.V2, jn7.A3, 256, jn7.q5, 384, 448, 512, 576, 640};
    public static final int[] g = {69, 87, jn7.o1, 121, jn7.U1, jn7.D2, jn7.l3, jn7.R3, jn7.A4, jn7.S5, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = c[i];
        if (i4 == 44100) {
            return ((i2 % 2) + g[i3]) << 1;
        }
        int i5 = f[i3];
        return i4 == 32000 ? i5 * 6 : i5 << 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[LOOP:1: B:16:0x0050->B:17:0x0052, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(ed edVar, int[] iArr, int[] iArr2, jq jqVar) {
        int i;
        int o0;
        int o02;
        int i2;
        int i3 = 0;
        while (i3 < iArr2.length) {
            int m = jqVar.m(edVar, iArr);
            if (m < 0 || m > 15) {
                switch (m) {
                    case 16:
                        i = iArr2[i3 - 1];
                        o0 = edVar.o0(iArr, 2) + 3;
                        for (i2 = 0; i2 < o0; i2++) {
                            iArr2[i3 + i2] = i;
                        }
                        i3 += o0 - 1;
                        break;
                    case 17:
                        o02 = edVar.o0(iArr, 3) + 3;
                        o0 = o02;
                        i = 0;
                        while (i2 < o0) {
                        }
                        i3 += o0 - 1;
                        break;
                    case 18:
                        o02 = edVar.o0(iArr, 7) + 11;
                        o0 = o02;
                        i = 0;
                        while (i2 < o0) {
                        }
                        i3 += o0 - 1;
                        break;
                    default:
                        throw new w30(String.format("[%s] Bad code length '%d' at the bit index '%d'.", ud3.class.getSimpleName(), Integer.valueOf(m), iArr));
                }
            } else {
                iArr2[i3] = m;
            }
            i3++;
        }
    }

    public static int c(ed edVar, int[] iArr, jq jqVar) {
        int i;
        int m = jqVar.m(edVar, iArr);
        int i2 = 2;
        int i3 = 5;
        switch (m) {
            case 0:
            case 1:
            case 2:
            case 3:
                return m + 1;
            case 4:
                i2 = 1;
                return edVar.o0(iArr, i2) + i3;
            case 5:
                i2 = 1;
                i3 = 7;
                return edVar.o0(iArr, i2) + i3;
            case 6:
                i3 = 9;
                return edVar.o0(iArr, i2) + i3;
            case 7:
                i3 = 13;
                return edVar.o0(iArr, i2) + i3;
            case 8:
                i3 = 17;
                i2 = 3;
                return edVar.o0(iArr, i2) + i3;
            case 9:
                i3 = 25;
                i2 = 3;
                return edVar.o0(iArr, i2) + i3;
            case 10:
                i3 = 33;
                i2 = 4;
                return edVar.o0(iArr, i2) + i3;
            case 11:
                i3 = 49;
                i2 = 4;
                return edVar.o0(iArr, i2) + i3;
            case 12:
                i = 65;
                i2 = 5;
                i3 = i;
                return edVar.o0(iArr, i2) + i3;
            case 13:
                i = 97;
                i2 = 5;
                i3 = i;
                return edVar.o0(iArr, i2) + i3;
            case 14:
                i3 = jn7.M1;
                i2 = 6;
                return edVar.o0(iArr, i2) + i3;
            case 15:
                i3 = jn7.W2;
                i2 = 6;
                return edVar.o0(iArr, i2) + i3;
            case 16:
                i3 = jn7.f4;
                i2 = 7;
                return edVar.o0(iArr, i2) + i3;
            case 17:
                i3 = 385;
                i2 = 7;
                return edVar.o0(iArr, i2) + i3;
            case 18:
                i3 = 513;
                i2 = 8;
                return edVar.o0(iArr, i2) + i3;
            case 19:
                i3 = 769;
                i2 = 8;
                return edVar.o0(iArr, i2) + i3;
            case 20:
                i3 = 1025;
                i2 = 9;
                return edVar.o0(iArr, i2) + i3;
            case 21:
                i3 = 1537;
                i2 = 9;
                return edVar.o0(iArr, i2) + i3;
            case 22:
                i3 = 2049;
                i2 = 10;
                return edVar.o0(iArr, i2) + i3;
            case 23:
                i3 = 3073;
                i2 = 10;
                return edVar.o0(iArr, i2) + i3;
            case 24:
                i3 = 4097;
                i2 = 11;
                return edVar.o0(iArr, i2) + i3;
            case 25:
                i3 = 6145;
                i2 = 11;
                return edVar.o0(iArr, i2) + i3;
            case 26:
                i3 = 8193;
                i2 = 12;
                return edVar.o0(iArr, i2) + i3;
            case 27:
                i3 = 12289;
                i2 = 12;
                return edVar.o0(iArr, i2) + i3;
            case 28:
                i3 = 16385;
                i2 = 13;
                return edVar.o0(iArr, i2) + i3;
            case 29:
                i3 = 24577;
                i2 = 13;
                return edVar.o0(iArr, i2) + i3;
            default:
                throw new w30(String.format("[%s] Bad distance code '%d' at the bit index '%d'.", ud3.class.getSimpleName(), Integer.valueOf(m), Integer.valueOf(iArr[0])));
        }
    }

    public static void d(ed edVar, int[] iArr, jq[] jqVarArr) {
        int o0 = edVar.o0(iArr, 5) + jn7.f4;
        int o02 = edVar.o0(iArr, 5) + 1;
        int o03 = edVar.o0(iArr, 4) + 4;
        int[] iArr2 = new int[19];
        for (int i = 0; i < o03; i++) {
            iArr2[a[i]] = (byte) edVar.o0(iArr, 3);
        }
        jq jqVar = new jq(iArr2);
        int[] iArr3 = new int[o0];
        b(edVar, iArr, iArr3, jqVar);
        jq jqVar2 = new jq(iArr3);
        int[] iArr4 = new int[o02];
        b(edVar, iArr, iArr4, jqVar);
        jq jqVar3 = new jq(iArr4);
        jqVarArr[0] = jqVar2;
        jqVarArr[1] = jqVar3;
    }

    public static int e(ed edVar, int[] iArr, int i) {
        int i2;
        int i3 = 1;
        switch (i) {
            case jn7.f4 /* 257 */:
            case jn7.g4 /* 258 */:
            case jn7.h4 /* 259 */:
            case jn7.i4 /* 260 */:
            case jn7.j4 /* 261 */:
            case jn7.k4 /* 262 */:
            case jn7.l4 /* 263 */:
            case jn7.m4 /* 264 */:
                return i - 254;
            case jn7.n4 /* 265 */:
                i2 = 11;
                return edVar.o0(iArr, i3) + i2;
            case jn7.o4 /* 266 */:
                i2 = 13;
                return edVar.o0(iArr, i3) + i2;
            case jn7.p4 /* 267 */:
                i2 = 15;
                return edVar.o0(iArr, i3) + i2;
            case jn7.q4 /* 268 */:
                i2 = 17;
                return edVar.o0(iArr, i3) + i2;
            case jn7.r4 /* 269 */:
                i2 = 19;
                i3 = 2;
                return edVar.o0(iArr, i3) + i2;
            case jn7.s4 /* 270 */:
                i2 = 23;
                i3 = 2;
                return edVar.o0(iArr, i3) + i2;
            case jn7.t4 /* 271 */:
                i2 = 27;
                i3 = 2;
                return edVar.o0(iArr, i3) + i2;
            case jn7.u4 /* 272 */:
                i2 = 31;
                i3 = 2;
                return edVar.o0(iArr, i3) + i2;
            case jn7.v4 /* 273 */:
                i2 = 35;
                i3 = 3;
                return edVar.o0(iArr, i3) + i2;
            case jn7.w4 /* 274 */:
                i2 = 43;
                i3 = 3;
                return edVar.o0(iArr, i3) + i2;
            case jn7.x4 /* 275 */:
                i2 = 51;
                i3 = 3;
                return edVar.o0(iArr, i3) + i2;
            case jn7.y4 /* 276 */:
                i2 = 59;
                i3 = 3;
                return edVar.o0(iArr, i3) + i2;
            case jn7.z4 /* 277 */:
                i2 = 67;
                i3 = 4;
                return edVar.o0(iArr, i3) + i2;
            case jn7.A4 /* 278 */:
                i2 = 83;
                i3 = 4;
                return edVar.o0(iArr, i3) + i2;
            case jn7.B4 /* 279 */:
                i2 = 99;
                i3 = 4;
                return edVar.o0(iArr, i3) + i2;
            case jn7.C4 /* 280 */:
                i2 = jn7.z1;
                i3 = 4;
                return edVar.o0(iArr, i3) + i2;
            case jn7.D4 /* 281 */:
                i2 = jn7.O1;
                i3 = 5;
                return edVar.o0(iArr, i3) + i2;
            case jn7.E4 /* 282 */:
                i2 = jn7.s2;
                i3 = 5;
                return edVar.o0(iArr, i3) + i2;
            case jn7.F4 /* 283 */:
                i2 = jn7.Y2;
                i3 = 5;
                return edVar.o0(iArr, i3) + i2;
            case jn7.G4 /* 284 */:
                i2 = jn7.D3;
                i3 = 5;
                return edVar.o0(iArr, i3) + i2;
            case jn7.H4 /* 285 */:
                return jn7.g4;
            default:
                throw new w30(String.format("[%s] Bad literal/length code '%d' at the bit index '%d'.", ud3.class.getSimpleName(), Integer.valueOf(i), Integer.valueOf(iArr[0])));
        }
    }
}
