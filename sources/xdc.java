// default package

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class xdc {
    public static final int[] e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};
    public static final xdc[] f = a();
    public final byte a;
    public final int[] b;
    public final ekd[] c;
    public final int d;

    /* JADX WARN: Multi-variable type inference failed */
    public xdc(int i, int[] iArr, ekd... ekdVarArr) {
        this.a = i;
        this.b = iArr;
        this.c = ekdVarArr;
        ekd ekdVar = ekdVarArr[0];
        byte b = ekdVar.a;
        int i2 = 0;
        for (wdc wdcVar : (wdc[]) ekdVar.b) {
            i2 += (wdcVar.b + b) * wdcVar.a;
        }
        this.d = i2;
    }

    public static xdc[] a() {
        int i = 10;
        xdc xdcVar = new xdc(1, new int[0], new ekd(7, new wdc[]{new wdc(1, 19)}), new ekd(i, new wdc[]{new wdc(1, 16)}), new ekd(13, new wdc[]{new wdc(1, 13)}), new ekd(17, new wdc[]{new wdc(1, 9)}));
        int i2 = 22;
        xdc xdcVar2 = new xdc(2, new int[]{6, 18}, new ekd(i, new wdc[]{new wdc(1, 34)}), new ekd(16, new wdc[]{new wdc(1, 28)}), new ekd(i2, new wdc[]{new wdc(1, 22)}), new ekd(28, new wdc[]{new wdc(1, 16)}));
        int i3 = 26;
        xdc xdcVar3 = new xdc(3, new int[]{6, 22}, new ekd(15, new wdc[]{new wdc(1, 55)}), new ekd(i3, new wdc[]{new wdc(1, 44)}), new ekd(18, new wdc[]{new wdc(2, 17)}), new ekd(i2, new wdc[]{new wdc(2, 13)}));
        xdc xdcVar4 = new xdc(4, new int[]{6, 26}, new ekd(20, new wdc[]{new wdc(1, 80)}), new ekd(18, new wdc[]{new wdc(2, 32)}), new ekd(i3, new wdc[]{new wdc(2, 24)}), new ekd(16, new wdc[]{new wdc(4, 9)}));
        xdc xdcVar5 = new xdc(5, new int[]{6, 30}, new ekd(i3, new wdc[]{new wdc(1, jn7.s1)}), new ekd(24, new wdc[]{new wdc(2, 43)}), new ekd(18, new wdc[]{new wdc(2, 15), new wdc(2, 16)}), new ekd(22, new wdc[]{new wdc(2, 11), new wdc(2, 12)}));
        xdc xdcVar6 = new xdc(6, new int[]{6, 34}, new ekd(18, new wdc[]{new wdc(2, 68)}), new ekd(16, new wdc[]{new wdc(4, 27)}), new ekd(24, new wdc[]{new wdc(4, 19)}), new ekd(28, new wdc[]{new wdc(4, 15)}));
        xdc xdcVar7 = new xdc(7, new int[]{6, 22, 38}, new ekd(20, new wdc[]{new wdc(2, 78)}), new ekd(18, new wdc[]{new wdc(4, 31)}), new ekd(18, new wdc[]{new wdc(2, 14), new wdc(4, 15)}), new ekd(26, new wdc[]{new wdc(4, 13), new wdc(1, 14)}));
        int i4 = 22;
        xdc xdcVar8 = new xdc(8, new int[]{6, 24, 42}, new ekd(24, new wdc[]{new wdc(2, 97)}), new ekd(i4, new wdc[]{new wdc(2, 38), new wdc(2, 39)}), new ekd(i4, new wdc[]{new wdc(4, 18), new wdc(2, 19)}), new ekd(26, new wdc[]{new wdc(4, 14), new wdc(2, 15)}));
        xdc xdcVar9 = new xdc(9, new int[]{6, 26, 46}, new ekd(30, new wdc[]{new wdc(2, jn7.A1)}), new ekd(22, new wdc[]{new wdc(3, 36), new wdc(2, 37)}), new ekd(20, new wdc[]{new wdc(4, 16), new wdc(4, 17)}), new ekd(24, new wdc[]{new wdc(4, 12), new wdc(4, 13)}));
        xdc xdcVar10 = new xdc(10, new int[]{6, 28, 50}, new ekd(18, new wdc[]{new wdc(2, 68), new wdc(2, 69)}), new ekd(26, new wdc[]{new wdc(4, 43), new wdc(1, 44)}), new ekd(24, new wdc[]{new wdc(6, 19), new wdc(2, 20)}), new ekd(28, new wdc[]{new wdc(6, 15), new wdc(2, 16)}));
        xdc xdcVar11 = new xdc(11, new int[]{6, 30, 54}, new ekd(20, new wdc[]{new wdc(4, 81)}), new ekd(30, new wdc[]{new wdc(1, 50), new wdc(4, 51)}), new ekd(28, new wdc[]{new wdc(4, 22), new wdc(4, 23)}), new ekd(24, new wdc[]{new wdc(3, 12), new wdc(8, 13)}));
        xdc xdcVar12 = new xdc(12, new int[]{6, 32, 58}, new ekd(24, new wdc[]{new wdc(2, 92), new wdc(2, 93)}), new ekd(22, new wdc[]{new wdc(6, 36), new wdc(2, 37)}), new ekd(26, new wdc[]{new wdc(4, 20), new wdc(6, 21)}), new ekd(28, new wdc[]{new wdc(7, 14), new wdc(4, 15)}));
        xdc xdcVar13 = new xdc(13, new int[]{6, 34, 62}, new ekd(26, new wdc[]{new wdc(4, jn7.r1)}), new ekd(22, new wdc[]{new wdc(8, 37), new wdc(1, 38)}), new ekd(24, new wdc[]{new wdc(8, 20), new wdc(4, 21)}), new ekd(22, new wdc[]{new wdc(12, 11), new wdc(4, 12)}));
        xdc xdcVar14 = new xdc(14, new int[]{6, 26, 46, 66}, new ekd(30, new wdc[]{new wdc(3, jn7.z1), new wdc(1, jn7.A1)}), new ekd(24, new wdc[]{new wdc(4, 40), new wdc(5, 41)}), new ekd(20, new wdc[]{new wdc(11, 16), new wdc(5, 17)}), new ekd(24, new wdc[]{new wdc(11, 12), new wdc(5, 13)}));
        xdc xdcVar15 = new xdc(15, new int[]{6, 26, 48, 70}, new ekd(22, new wdc[]{new wdc(5, 87), new wdc(1, 88)}), new ekd(24, new wdc[]{new wdc(5, 41), new wdc(5, 42)}), new ekd(30, new wdc[]{new wdc(5, 24), new wdc(7, 25)}), new ekd(24, new wdc[]{new wdc(11, 12), new wdc(7, 13)}));
        xdc xdcVar16 = new xdc(16, new int[]{6, 26, 50, 74}, new ekd(24, new wdc[]{new wdc(5, 98), new wdc(1, 99)}), new ekd(28, new wdc[]{new wdc(7, 45), new wdc(3, 46)}), new ekd(24, new wdc[]{new wdc(15, 19), new wdc(2, 20)}), new ekd(30, new wdc[]{new wdc(3, 15), new wdc(13, 16)}));
        xdc xdcVar17 = new xdc(17, new int[]{6, 30, 54, 78}, new ekd(28, new wdc[]{new wdc(1, jn7.r1), new wdc(5, jn7.s1)}), new ekd(28, new wdc[]{new wdc(10, 46), new wdc(1, 47)}), new ekd(28, new wdc[]{new wdc(1, 22), new wdc(15, 23)}), new ekd(28, new wdc[]{new wdc(2, 14), new wdc(17, 15)}));
        xdc xdcVar18 = new xdc(18, new int[]{6, 30, 56, 82}, new ekd(30, new wdc[]{new wdc(5, jn7.E1), new wdc(1, 121)}), new ekd(26, new wdc[]{new wdc(9, 43), new wdc(4, 44)}), new ekd(28, new wdc[]{new wdc(17, 22), new wdc(1, 23)}), new ekd(28, new wdc[]{new wdc(2, 14), new wdc(19, 15)}));
        xdc xdcVar19 = new xdc(19, new int[]{6, 30, 58, 86}, new ekd(28, new wdc[]{new wdc(3, jn7.x1), new wdc(4, jn7.y1)}), new ekd(26, new wdc[]{new wdc(3, 44), new wdc(11, 45)}), new ekd(26, new wdc[]{new wdc(17, 21), new wdc(4, 22)}), new ekd(26, new wdc[]{new wdc(9, 13), new wdc(16, 14)}));
        int i5 = 28;
        xdc xdcVar20 = new xdc(20, new int[]{6, 34, 62, 90}, new ekd(28, new wdc[]{new wdc(3, jn7.r1), new wdc(5, jn7.s1)}), new ekd(26, new wdc[]{new wdc(3, 41), new wdc(13, 42)}), new ekd(30, new wdc[]{new wdc(15, 24), new wdc(5, 25)}), new ekd(i5, new wdc[]{new wdc(15, 15), new wdc(10, 16)}));
        xdc xdcVar21 = new xdc(21, new int[]{6, 28, 50, 72, 94}, new ekd(i5, new wdc[]{new wdc(4, jn7.A1), new wdc(4, jn7.B1)}), new ekd(26, new wdc[]{new wdc(17, 42)}), new ekd(28, new wdc[]{new wdc(17, 22), new wdc(6, 23)}), new ekd(30, new wdc[]{new wdc(19, 16), new wdc(6, 17)}));
        int i6 = 28;
        int i7 = 28;
        return new xdc[]{xdcVar, xdcVar2, xdcVar3, xdcVar4, xdcVar5, xdcVar6, xdcVar7, xdcVar8, xdcVar9, xdcVar10, xdcVar11, xdcVar12, xdcVar13, xdcVar14, xdcVar15, xdcVar16, xdcVar17, xdcVar18, xdcVar19, xdcVar20, xdcVar21, new xdc(22, new int[]{6, 26, 50, 74, 98}, new ekd(i6, new wdc[]{new wdc(2, jn7.v1), new wdc(7, jn7.w1)}), new ekd(i6, new wdc[]{new wdc(17, 46)}), new ekd(30, new wdc[]{new wdc(7, 24), new wdc(16, 25)}), new ekd(24, new wdc[]{new wdc(34, 13)})), new xdc(23, new int[]{6, 30, 54, 78, jn7.m1}, new ekd(30, new wdc[]{new wdc(4, 121), new wdc(5, jn7.F1)}), new ekd(28, new wdc[]{new wdc(4, 47), new wdc(14, 48)}), new ekd(30, new wdc[]{new wdc(11, 24), new wdc(14, 25)}), new ekd(30, new wdc[]{new wdc(16, 15), new wdc(14, 16)})), new xdc(24, new int[]{6, 28, 54, 80, jn7.q1}, new ekd(30, new wdc[]{new wdc(6, jn7.B1), new wdc(4, jn7.C1)}), new ekd(28, new wdc[]{new wdc(6, 45), new wdc(14, 46)}), new ekd(30, new wdc[]{new wdc(11, 24), new wdc(16, 25)}), new ekd(30, new wdc[]{new wdc(30, 16), new wdc(2, 17)})), new xdc(25, new int[]{6, 32, 58, 84, jn7.u1}, new ekd(26, new wdc[]{new wdc(8, jn7.q1), new wdc(4, jn7.r1)}), new ekd(28, new wdc[]{new wdc(8, 47), new wdc(13, 48)}), new ekd(30, new wdc[]{new wdc(7, 24), new wdc(22, 25)}), new ekd(30, new wdc[]{new wdc(22, 15), new wdc(13, 16)})), new xdc(26, new int[]{6, 30, 58, 86, jn7.y1}, new ekd(i7, new wdc[]{new wdc(10, jn7.y1), new wdc(2, jn7.z1)}), new ekd(i7, new wdc[]{new wdc(19, 46), new wdc(4, 47)}), new ekd(28, new wdc[]{new wdc(28, 22), new wdc(6, 23)}), new ekd(30, new wdc[]{new wdc(33, 16), new wdc(4, 17)})), new xdc(27, new int[]{6, 34, 62, 90, jn7.C1}, new ekd(30, new wdc[]{new wdc(8, jn7.F1), new wdc(4, jn7.G1)}), new ekd(28, new wdc[]{new wdc(22, 45), new wdc(3, 46)}), new ekd(30, new wdc[]{new wdc(8, 23), new wdc(26, 24)}), new ekd(30, new wdc[]{new wdc(12, 15), new wdc(28, 16)})), new xdc(28, new int[]{6, 26, 50, 74, 98, jn7.F1}, new ekd(30, new wdc[]{new wdc(3, jn7.B1), new wdc(10, jn7.C1)}), new ekd(28, new wdc[]{new wdc(3, 45), new wdc(23, 46)}), new ekd(30, new wdc[]{new wdc(4, 24), new wdc(31, 25)}), new ekd(30, new wdc[]{new wdc(11, 15), new wdc(31, 16)})), new xdc(29, new int[]{6, 30, 54, 78, jn7.m1, jn7.J1}, new ekd(30, new wdc[]{new wdc(7, jn7.A1), new wdc(7, jn7.B1)}), new ekd(28, new wdc[]{new wdc(21, 45), new wdc(7, 46)}), new ekd(30, new wdc[]{new wdc(1, 23), new wdc(37, 24)}), new ekd(30, new wdc[]{new wdc(19, 15), new wdc(26, 16)})), new xdc(30, new int[]{6, 26, 52, 78, jn7.o1, jn7.N1}, new ekd(30, new wdc[]{new wdc(5, jn7.z1), new wdc(10, jn7.A1)}), new ekd(28, new wdc[]{new wdc(19, 47), new wdc(10, 48)}), new ekd(30, new wdc[]{new wdc(15, 24), new wdc(25, 25)}), new ekd(30, new wdc[]{new wdc(23, 15), new wdc(25, 16)})), new xdc(31, new int[]{6, 30, 56, 82, jn7.s1, 134}, new ekd(30, new wdc[]{new wdc(13, jn7.z1), new wdc(3, jn7.A1)}), new ekd(28, new wdc[]{new wdc(2, 46), new wdc(29, 47)}), new ekd(30, new wdc[]{new wdc(42, 24), new wdc(1, 25)}), new ekd(30, new wdc[]{new wdc(23, 15), new wdc(28, 16)})), new xdc(32, new int[]{6, 34, 60, 86, jn7.w1, jn7.T1}, new ekd(30, new wdc[]{new wdc(17, jn7.z1)}), new ekd(28, new wdc[]{new wdc(10, 46), new wdc(23, 47)}), new ekd(30, new wdc[]{new wdc(10, 24), new wdc(35, 25)}), new ekd(30, new wdc[]{new wdc(19, 15), new wdc(35, 16)})), new xdc(33, new int[]{6, 30, 58, 86, jn7.y1, jn7.X1}, new ekd(30, new wdc[]{new wdc(17, jn7.z1), new wdc(1, jn7.A1)}), new ekd(28, new wdc[]{new wdc(14, 46), new wdc(21, 47)}), new ekd(30, new wdc[]{new wdc(29, 24), new wdc(19, 25)}), new ekd(30, new wdc[]{new wdc(11, 15), new wdc(46, 16)})), new xdc(34, new int[]{6, 34, 62, 90, jn7.C1, jn7.b2}, new ekd(30, new wdc[]{new wdc(13, jn7.z1), new wdc(6, jn7.A1)}), new ekd(28, new wdc[]{new wdc(14, 46), new wdc(23, 47)}), new ekd(30, new wdc[]{new wdc(44, 24), new wdc(7, 25)}), new ekd(30, new wdc[]{new wdc(59, 16), new wdc(1, 17)})), new xdc(35, new int[]{6, 30, 54, 78, jn7.m1, jn7.J1, jn7.f2}, new ekd(30, new wdc[]{new wdc(12, 121), new wdc(7, jn7.F1)}), new ekd(28, new wdc[]{new wdc(12, 47), new wdc(26, 48)}), new ekd(30, new wdc[]{new wdc(39, 24), new wdc(14, 25)}), new ekd(30, new wdc[]{new wdc(22, 15), new wdc(41, 16)})), new xdc(36, new int[]{6, 24, 50, 76, jn7.m1, 128, jn7.j2}, new ekd(30, new wdc[]{new wdc(6, 121), new wdc(14, jn7.F1)}), new ekd(28, new wdc[]{new wdc(6, 47), new wdc(34, 48)}), new ekd(30, new wdc[]{new wdc(46, 24), new wdc(10, 25)}), new ekd(30, new wdc[]{new wdc(2, 15), new wdc(64, 16)})), new xdc(37, new int[]{6, 28, 54, 80, jn7.q1, jn7.P1, jn7.n2}, new ekd(30, new wdc[]{new wdc(17, jn7.F1), new wdc(4, jn7.G1)}), new ekd(28, new wdc[]{new wdc(29, 46), new wdc(14, 47)}), new ekd(30, new wdc[]{new wdc(49, 24), new wdc(10, 25)}), new ekd(30, new wdc[]{new wdc(24, 15), new wdc(46, 16)})), new xdc(38, new int[]{6, 32, 58, 84, jn7.u1, jn7.R1, jn7.r2}, new ekd(30, new wdc[]{new wdc(4, jn7.F1), new wdc(18, jn7.G1)}), new ekd(28, new wdc[]{new wdc(13, 46), new wdc(32, 47)}), new ekd(30, new wdc[]{new wdc(48, 24), new wdc(14, 25)}), new ekd(30, new wdc[]{new wdc(42, 15), new wdc(32, 16)})), new xdc(39, new int[]{6, 26, 54, 82, jn7.u1, jn7.T1, jn7.v2}, new ekd(30, new wdc[]{new wdc(20, jn7.B1), new wdc(4, jn7.C1)}), new ekd(28, new wdc[]{new wdc(40, 47), new wdc(7, 48)}), new ekd(30, new wdc[]{new wdc(43, 24), new wdc(22, 25)}), new ekd(30, new wdc[]{new wdc(10, 15), new wdc(67, 16)})), new xdc(40, new int[]{6, 30, 58, 86, jn7.y1, jn7.X1, jn7.z2}, new ekd(30, new wdc[]{new wdc(19, jn7.C1), new wdc(6, jn7.D1)}), new ekd(28, new wdc[]{new wdc(18, 47), new wdc(31, 48)}), new ekd(30, new wdc[]{new wdc(34, 24), new wdc(34, 25)}), new ekd(30, new wdc[]{new wdc(20, 15), new wdc(61, 16)}))};
    }

    public static xdc b(int i) {
        int i2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i3 = 0;
        for (int i4 = 0; i4 < 34; i4++) {
            int i5 = e[i4];
            if (i5 == i) {
                return c(i4 + 7);
            }
            int bitCount = Integer.bitCount(i5 ^ i);
            if (bitCount < i2) {
                i3 = i4 + 7;
                i2 = bitCount;
            }
        }
        if (i2 <= 3) {
            return c(i3);
        }
        return null;
    }

    public static xdc c(int i) {
        if (i >= 1 && i <= 40) {
            return f[i - 1];
        }
        iy8.d();
        return null;
    }

    public final String toString() {
        return String.valueOf((int) this.a);
    }
}
