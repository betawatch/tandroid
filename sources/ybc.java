// default package

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ybc {
    public static final int[] e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};
    public static final ybc[] f = a();
    public final byte a;
    public final int[] b;
    public final ohd[] c;
    public final int d;

    /* JADX WARN: Multi-variable type inference failed */
    public ybc(int i, int[] iArr, ohd... ohdVarArr) {
        this.a = i;
        this.b = iArr;
        this.c = ohdVarArr;
        ohd ohdVar = ohdVarArr[0];
        byte b = ohdVar.a;
        int i2 = 0;
        for (xbc xbcVar : (xbc[]) ohdVar.b) {
            i2 += (xbcVar.b + b) * xbcVar.a;
        }
        this.d = i2;
    }

    public static ybc[] a() {
        int i = 10;
        ybc ybcVar = new ybc(1, new int[0], new ohd(7, new xbc[]{new xbc(1, 19)}), new ohd(i, new xbc[]{new xbc(1, 16)}), new ohd(13, new xbc[]{new xbc(1, 13)}), new ohd(17, new xbc[]{new xbc(1, 9)}));
        int i2 = 22;
        ybc ybcVar2 = new ybc(2, new int[]{6, 18}, new ohd(i, new xbc[]{new xbc(1, 34)}), new ohd(16, new xbc[]{new xbc(1, 28)}), new ohd(i2, new xbc[]{new xbc(1, 22)}), new ohd(28, new xbc[]{new xbc(1, 16)}));
        int i3 = 26;
        ybc ybcVar3 = new ybc(3, new int[]{6, 22}, new ohd(15, new xbc[]{new xbc(1, 55)}), new ohd(i3, new xbc[]{new xbc(1, 44)}), new ohd(18, new xbc[]{new xbc(2, 17)}), new ohd(i2, new xbc[]{new xbc(2, 13)}));
        ybc ybcVar4 = new ybc(4, new int[]{6, 26}, new ohd(20, new xbc[]{new xbc(1, 80)}), new ohd(18, new xbc[]{new xbc(2, 32)}), new ohd(i3, new xbc[]{new xbc(2, 24)}), new ohd(16, new xbc[]{new xbc(4, 9)}));
        ybc ybcVar5 = new ybc(5, new int[]{6, 30}, new ohd(i3, new xbc[]{new xbc(1, nm7.s1)}), new ohd(24, new xbc[]{new xbc(2, 43)}), new ohd(18, new xbc[]{new xbc(2, 15), new xbc(2, 16)}), new ohd(22, new xbc[]{new xbc(2, 11), new xbc(2, 12)}));
        ybc ybcVar6 = new ybc(6, new int[]{6, 34}, new ohd(18, new xbc[]{new xbc(2, 68)}), new ohd(16, new xbc[]{new xbc(4, 27)}), new ohd(24, new xbc[]{new xbc(4, 19)}), new ohd(28, new xbc[]{new xbc(4, 15)}));
        ybc ybcVar7 = new ybc(7, new int[]{6, 22, 38}, new ohd(20, new xbc[]{new xbc(2, 78)}), new ohd(18, new xbc[]{new xbc(4, 31)}), new ohd(18, new xbc[]{new xbc(2, 14), new xbc(4, 15)}), new ohd(26, new xbc[]{new xbc(4, 13), new xbc(1, 14)}));
        int i4 = 22;
        ybc ybcVar8 = new ybc(8, new int[]{6, 24, 42}, new ohd(24, new xbc[]{new xbc(2, 97)}), new ohd(i4, new xbc[]{new xbc(2, 38), new xbc(2, 39)}), new ohd(i4, new xbc[]{new xbc(4, 18), new xbc(2, 19)}), new ohd(26, new xbc[]{new xbc(4, 14), new xbc(2, 15)}));
        ybc ybcVar9 = new ybc(9, new int[]{6, 26, 46}, new ohd(30, new xbc[]{new xbc(2, nm7.A1)}), new ohd(22, new xbc[]{new xbc(3, 36), new xbc(2, 37)}), new ohd(20, new xbc[]{new xbc(4, 16), new xbc(4, 17)}), new ohd(24, new xbc[]{new xbc(4, 12), new xbc(4, 13)}));
        ybc ybcVar10 = new ybc(10, new int[]{6, 28, 50}, new ohd(18, new xbc[]{new xbc(2, 68), new xbc(2, 69)}), new ohd(26, new xbc[]{new xbc(4, 43), new xbc(1, 44)}), new ohd(24, new xbc[]{new xbc(6, 19), new xbc(2, 20)}), new ohd(28, new xbc[]{new xbc(6, 15), new xbc(2, 16)}));
        ybc ybcVar11 = new ybc(11, new int[]{6, 30, 54}, new ohd(20, new xbc[]{new xbc(4, 81)}), new ohd(30, new xbc[]{new xbc(1, 50), new xbc(4, 51)}), new ohd(28, new xbc[]{new xbc(4, 22), new xbc(4, 23)}), new ohd(24, new xbc[]{new xbc(3, 12), new xbc(8, 13)}));
        ybc ybcVar12 = new ybc(12, new int[]{6, 32, 58}, new ohd(24, new xbc[]{new xbc(2, 92), new xbc(2, 93)}), new ohd(22, new xbc[]{new xbc(6, 36), new xbc(2, 37)}), new ohd(26, new xbc[]{new xbc(4, 20), new xbc(6, 21)}), new ohd(28, new xbc[]{new xbc(7, 14), new xbc(4, 15)}));
        ybc ybcVar13 = new ybc(13, new int[]{6, 34, 62}, new ohd(26, new xbc[]{new xbc(4, nm7.r1)}), new ohd(22, new xbc[]{new xbc(8, 37), new xbc(1, 38)}), new ohd(24, new xbc[]{new xbc(8, 20), new xbc(4, 21)}), new ohd(22, new xbc[]{new xbc(12, 11), new xbc(4, 12)}));
        ybc ybcVar14 = new ybc(14, new int[]{6, 26, 46, 66}, new ohd(30, new xbc[]{new xbc(3, nm7.z1), new xbc(1, nm7.A1)}), new ohd(24, new xbc[]{new xbc(4, 40), new xbc(5, 41)}), new ohd(20, new xbc[]{new xbc(11, 16), new xbc(5, 17)}), new ohd(24, new xbc[]{new xbc(11, 12), new xbc(5, 13)}));
        ybc ybcVar15 = new ybc(15, new int[]{6, 26, 48, 70}, new ohd(22, new xbc[]{new xbc(5, 87), new xbc(1, 88)}), new ohd(24, new xbc[]{new xbc(5, 41), new xbc(5, 42)}), new ohd(30, new xbc[]{new xbc(5, 24), new xbc(7, 25)}), new ohd(24, new xbc[]{new xbc(11, 12), new xbc(7, 13)}));
        ybc ybcVar16 = new ybc(16, new int[]{6, 26, 50, 74}, new ohd(24, new xbc[]{new xbc(5, 98), new xbc(1, 99)}), new ohd(28, new xbc[]{new xbc(7, 45), new xbc(3, 46)}), new ohd(24, new xbc[]{new xbc(15, 19), new xbc(2, 20)}), new ohd(30, new xbc[]{new xbc(3, 15), new xbc(13, 16)}));
        ybc ybcVar17 = new ybc(17, new int[]{6, 30, 54, 78}, new ohd(28, new xbc[]{new xbc(1, nm7.r1), new xbc(5, nm7.s1)}), new ohd(28, new xbc[]{new xbc(10, 46), new xbc(1, 47)}), new ohd(28, new xbc[]{new xbc(1, 22), new xbc(15, 23)}), new ohd(28, new xbc[]{new xbc(2, 14), new xbc(17, 15)}));
        ybc ybcVar18 = new ybc(18, new int[]{6, 30, 56, 82}, new ohd(30, new xbc[]{new xbc(5, nm7.E1), new xbc(1, 121)}), new ohd(26, new xbc[]{new xbc(9, 43), new xbc(4, 44)}), new ohd(28, new xbc[]{new xbc(17, 22), new xbc(1, 23)}), new ohd(28, new xbc[]{new xbc(2, 14), new xbc(19, 15)}));
        ybc ybcVar19 = new ybc(19, new int[]{6, 30, 58, 86}, new ohd(28, new xbc[]{new xbc(3, nm7.x1), new xbc(4, nm7.y1)}), new ohd(26, new xbc[]{new xbc(3, 44), new xbc(11, 45)}), new ohd(26, new xbc[]{new xbc(17, 21), new xbc(4, 22)}), new ohd(26, new xbc[]{new xbc(9, 13), new xbc(16, 14)}));
        int i5 = 28;
        ybc ybcVar20 = new ybc(20, new int[]{6, 34, 62, 90}, new ohd(28, new xbc[]{new xbc(3, nm7.r1), new xbc(5, nm7.s1)}), new ohd(26, new xbc[]{new xbc(3, 41), new xbc(13, 42)}), new ohd(30, new xbc[]{new xbc(15, 24), new xbc(5, 25)}), new ohd(i5, new xbc[]{new xbc(15, 15), new xbc(10, 16)}));
        ybc ybcVar21 = new ybc(21, new int[]{6, 28, 50, 72, 94}, new ohd(i5, new xbc[]{new xbc(4, nm7.A1), new xbc(4, nm7.B1)}), new ohd(26, new xbc[]{new xbc(17, 42)}), new ohd(28, new xbc[]{new xbc(17, 22), new xbc(6, 23)}), new ohd(30, new xbc[]{new xbc(19, 16), new xbc(6, 17)}));
        int i6 = 28;
        int i7 = 28;
        return new ybc[]{ybcVar, ybcVar2, ybcVar3, ybcVar4, ybcVar5, ybcVar6, ybcVar7, ybcVar8, ybcVar9, ybcVar10, ybcVar11, ybcVar12, ybcVar13, ybcVar14, ybcVar15, ybcVar16, ybcVar17, ybcVar18, ybcVar19, ybcVar20, ybcVar21, new ybc(22, new int[]{6, 26, 50, 74, 98}, new ohd(i6, new xbc[]{new xbc(2, nm7.v1), new xbc(7, nm7.w1)}), new ohd(i6, new xbc[]{new xbc(17, 46)}), new ohd(30, new xbc[]{new xbc(7, 24), new xbc(16, 25)}), new ohd(24, new xbc[]{new xbc(34, 13)})), new ybc(23, new int[]{6, 30, 54, 78, nm7.m1}, new ohd(30, new xbc[]{new xbc(4, 121), new xbc(5, nm7.F1)}), new ohd(28, new xbc[]{new xbc(4, 47), new xbc(14, 48)}), new ohd(30, new xbc[]{new xbc(11, 24), new xbc(14, 25)}), new ohd(30, new xbc[]{new xbc(16, 15), new xbc(14, 16)})), new ybc(24, new int[]{6, 28, 54, 80, nm7.q1}, new ohd(30, new xbc[]{new xbc(6, nm7.B1), new xbc(4, nm7.C1)}), new ohd(28, new xbc[]{new xbc(6, 45), new xbc(14, 46)}), new ohd(30, new xbc[]{new xbc(11, 24), new xbc(16, 25)}), new ohd(30, new xbc[]{new xbc(30, 16), new xbc(2, 17)})), new ybc(25, new int[]{6, 32, 58, 84, nm7.u1}, new ohd(26, new xbc[]{new xbc(8, nm7.q1), new xbc(4, nm7.r1)}), new ohd(28, new xbc[]{new xbc(8, 47), new xbc(13, 48)}), new ohd(30, new xbc[]{new xbc(7, 24), new xbc(22, 25)}), new ohd(30, new xbc[]{new xbc(22, 15), new xbc(13, 16)})), new ybc(26, new int[]{6, 30, 58, 86, nm7.y1}, new ohd(i7, new xbc[]{new xbc(10, nm7.y1), new xbc(2, nm7.z1)}), new ohd(i7, new xbc[]{new xbc(19, 46), new xbc(4, 47)}), new ohd(28, new xbc[]{new xbc(28, 22), new xbc(6, 23)}), new ohd(30, new xbc[]{new xbc(33, 16), new xbc(4, 17)})), new ybc(27, new int[]{6, 34, 62, 90, nm7.C1}, new ohd(30, new xbc[]{new xbc(8, nm7.F1), new xbc(4, nm7.G1)}), new ohd(28, new xbc[]{new xbc(22, 45), new xbc(3, 46)}), new ohd(30, new xbc[]{new xbc(8, 23), new xbc(26, 24)}), new ohd(30, new xbc[]{new xbc(12, 15), new xbc(28, 16)})), new ybc(28, new int[]{6, 26, 50, 74, 98, nm7.F1}, new ohd(30, new xbc[]{new xbc(3, nm7.B1), new xbc(10, nm7.C1)}), new ohd(28, new xbc[]{new xbc(3, 45), new xbc(23, 46)}), new ohd(30, new xbc[]{new xbc(4, 24), new xbc(31, 25)}), new ohd(30, new xbc[]{new xbc(11, 15), new xbc(31, 16)})), new ybc(29, new int[]{6, 30, 54, 78, nm7.m1, nm7.J1}, new ohd(30, new xbc[]{new xbc(7, nm7.A1), new xbc(7, nm7.B1)}), new ohd(28, new xbc[]{new xbc(21, 45), new xbc(7, 46)}), new ohd(30, new xbc[]{new xbc(1, 23), new xbc(37, 24)}), new ohd(30, new xbc[]{new xbc(19, 15), new xbc(26, 16)})), new ybc(30, new int[]{6, 26, 52, 78, nm7.o1, nm7.N1}, new ohd(30, new xbc[]{new xbc(5, nm7.z1), new xbc(10, nm7.A1)}), new ohd(28, new xbc[]{new xbc(19, 47), new xbc(10, 48)}), new ohd(30, new xbc[]{new xbc(15, 24), new xbc(25, 25)}), new ohd(30, new xbc[]{new xbc(23, 15), new xbc(25, 16)})), new ybc(31, new int[]{6, 30, 56, 82, nm7.s1, 134}, new ohd(30, new xbc[]{new xbc(13, nm7.z1), new xbc(3, nm7.A1)}), new ohd(28, new xbc[]{new xbc(2, 46), new xbc(29, 47)}), new ohd(30, new xbc[]{new xbc(42, 24), new xbc(1, 25)}), new ohd(30, new xbc[]{new xbc(23, 15), new xbc(28, 16)})), new ybc(32, new int[]{6, 34, 60, 86, nm7.w1, nm7.T1}, new ohd(30, new xbc[]{new xbc(17, nm7.z1)}), new ohd(28, new xbc[]{new xbc(10, 46), new xbc(23, 47)}), new ohd(30, new xbc[]{new xbc(10, 24), new xbc(35, 25)}), new ohd(30, new xbc[]{new xbc(19, 15), new xbc(35, 16)})), new ybc(33, new int[]{6, 30, 58, 86, nm7.y1, nm7.X1}, new ohd(30, new xbc[]{new xbc(17, nm7.z1), new xbc(1, nm7.A1)}), new ohd(28, new xbc[]{new xbc(14, 46), new xbc(21, 47)}), new ohd(30, new xbc[]{new xbc(29, 24), new xbc(19, 25)}), new ohd(30, new xbc[]{new xbc(11, 15), new xbc(46, 16)})), new ybc(34, new int[]{6, 34, 62, 90, nm7.C1, nm7.b2}, new ohd(30, new xbc[]{new xbc(13, nm7.z1), new xbc(6, nm7.A1)}), new ohd(28, new xbc[]{new xbc(14, 46), new xbc(23, 47)}), new ohd(30, new xbc[]{new xbc(44, 24), new xbc(7, 25)}), new ohd(30, new xbc[]{new xbc(59, 16), new xbc(1, 17)})), new ybc(35, new int[]{6, 30, 54, 78, nm7.m1, nm7.J1, nm7.f2}, new ohd(30, new xbc[]{new xbc(12, 121), new xbc(7, nm7.F1)}), new ohd(28, new xbc[]{new xbc(12, 47), new xbc(26, 48)}), new ohd(30, new xbc[]{new xbc(39, 24), new xbc(14, 25)}), new ohd(30, new xbc[]{new xbc(22, 15), new xbc(41, 16)})), new ybc(36, new int[]{6, 24, 50, 76, nm7.m1, 128, nm7.j2}, new ohd(30, new xbc[]{new xbc(6, 121), new xbc(14, nm7.F1)}), new ohd(28, new xbc[]{new xbc(6, 47), new xbc(34, 48)}), new ohd(30, new xbc[]{new xbc(46, 24), new xbc(10, 25)}), new ohd(30, new xbc[]{new xbc(2, 15), new xbc(64, 16)})), new ybc(37, new int[]{6, 28, 54, 80, nm7.q1, nm7.P1, nm7.n2}, new ohd(30, new xbc[]{new xbc(17, nm7.F1), new xbc(4, nm7.G1)}), new ohd(28, new xbc[]{new xbc(29, 46), new xbc(14, 47)}), new ohd(30, new xbc[]{new xbc(49, 24), new xbc(10, 25)}), new ohd(30, new xbc[]{new xbc(24, 15), new xbc(46, 16)})), new ybc(38, new int[]{6, 32, 58, 84, nm7.u1, nm7.R1, nm7.r2}, new ohd(30, new xbc[]{new xbc(4, nm7.F1), new xbc(18, nm7.G1)}), new ohd(28, new xbc[]{new xbc(13, 46), new xbc(32, 47)}), new ohd(30, new xbc[]{new xbc(48, 24), new xbc(14, 25)}), new ohd(30, new xbc[]{new xbc(42, 15), new xbc(32, 16)})), new ybc(39, new int[]{6, 26, 54, 82, nm7.u1, nm7.T1, nm7.v2}, new ohd(30, new xbc[]{new xbc(20, nm7.B1), new xbc(4, nm7.C1)}), new ohd(28, new xbc[]{new xbc(40, 47), new xbc(7, 48)}), new ohd(30, new xbc[]{new xbc(43, 24), new xbc(22, 25)}), new ohd(30, new xbc[]{new xbc(10, 15), new xbc(67, 16)})), new ybc(40, new int[]{6, 30, 58, 86, nm7.y1, nm7.X1, nm7.z2}, new ohd(30, new xbc[]{new xbc(19, nm7.C1), new xbc(6, nm7.D1)}), new ohd(28, new xbc[]{new xbc(18, 47), new xbc(31, 48)}), new ohd(30, new xbc[]{new xbc(34, 24), new xbc(34, 25)}), new ohd(30, new xbc[]{new xbc(20, 15), new xbc(61, 16)}))};
    }

    public static ybc b(int i) {
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

    public static ybc c(int i) {
        if (i >= 1 && i <= 40) {
            return f[i - 1];
        }
        i98.g();
        return null;
    }

    public final String toString() {
        return String.valueOf((int) this.a);
    }
}
