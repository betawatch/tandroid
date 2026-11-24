// default package

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class x9c {
    public static final int[] e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};
    public static final x9c[] f = a();
    public final byte a;
    public final int[] b;
    public final nfd[] c;
    public final int d;

    /* JADX WARN: Multi-variable type inference failed */
    public x9c(int i, int[] iArr, nfd... nfdVarArr) {
        this.a = i;
        this.b = iArr;
        this.c = nfdVarArr;
        nfd nfdVar = nfdVarArr[0];
        byte b = nfdVar.a;
        int i2 = 0;
        for (w9c w9cVar : (w9c[]) nfdVar.b) {
            i2 += (w9cVar.b + b) * w9cVar.a;
        }
        this.d = i2;
    }

    public static x9c[] a() {
        int i = 10;
        x9c x9cVar = new x9c(1, new int[0], new nfd(7, new w9c[]{new w9c(1, 19)}), new nfd(i, new w9c[]{new w9c(1, 16)}), new nfd(13, new w9c[]{new w9c(1, 13)}), new nfd(17, new w9c[]{new w9c(1, 9)}));
        int i2 = 22;
        x9c x9cVar2 = new x9c(2, new int[]{6, 18}, new nfd(i, new w9c[]{new w9c(1, 34)}), new nfd(16, new w9c[]{new w9c(1, 28)}), new nfd(i2, new w9c[]{new w9c(1, 22)}), new nfd(28, new w9c[]{new w9c(1, 16)}));
        int i3 = 26;
        x9c x9cVar3 = new x9c(3, new int[]{6, 22}, new nfd(15, new w9c[]{new w9c(1, 55)}), new nfd(i3, new w9c[]{new w9c(1, 44)}), new nfd(18, new w9c[]{new w9c(2, 17)}), new nfd(i2, new w9c[]{new w9c(2, 13)}));
        x9c x9cVar4 = new x9c(4, new int[]{6, 26}, new nfd(20, new w9c[]{new w9c(1, 80)}), new nfd(18, new w9c[]{new w9c(2, 32)}), new nfd(i3, new w9c[]{new w9c(2, 24)}), new nfd(16, new w9c[]{new w9c(4, 9)}));
        x9c x9cVar5 = new x9c(5, new int[]{6, 30}, new nfd(i3, new w9c[]{new w9c(1, kk7.s1)}), new nfd(24, new w9c[]{new w9c(2, 43)}), new nfd(18, new w9c[]{new w9c(2, 15), new w9c(2, 16)}), new nfd(22, new w9c[]{new w9c(2, 11), new w9c(2, 12)}));
        x9c x9cVar6 = new x9c(6, new int[]{6, 34}, new nfd(18, new w9c[]{new w9c(2, 68)}), new nfd(16, new w9c[]{new w9c(4, 27)}), new nfd(24, new w9c[]{new w9c(4, 19)}), new nfd(28, new w9c[]{new w9c(4, 15)}));
        x9c x9cVar7 = new x9c(7, new int[]{6, 22, 38}, new nfd(20, new w9c[]{new w9c(2, 78)}), new nfd(18, new w9c[]{new w9c(4, 31)}), new nfd(18, new w9c[]{new w9c(2, 14), new w9c(4, 15)}), new nfd(26, new w9c[]{new w9c(4, 13), new w9c(1, 14)}));
        int i4 = 22;
        x9c x9cVar8 = new x9c(8, new int[]{6, 24, 42}, new nfd(24, new w9c[]{new w9c(2, 97)}), new nfd(i4, new w9c[]{new w9c(2, 38), new w9c(2, 39)}), new nfd(i4, new w9c[]{new w9c(4, 18), new w9c(2, 19)}), new nfd(26, new w9c[]{new w9c(4, 14), new w9c(2, 15)}));
        x9c x9cVar9 = new x9c(9, new int[]{6, 26, 46}, new nfd(30, new w9c[]{new w9c(2, kk7.A1)}), new nfd(22, new w9c[]{new w9c(3, 36), new w9c(2, 37)}), new nfd(20, new w9c[]{new w9c(4, 16), new w9c(4, 17)}), new nfd(24, new w9c[]{new w9c(4, 12), new w9c(4, 13)}));
        x9c x9cVar10 = new x9c(10, new int[]{6, 28, 50}, new nfd(18, new w9c[]{new w9c(2, 68), new w9c(2, 69)}), new nfd(26, new w9c[]{new w9c(4, 43), new w9c(1, 44)}), new nfd(24, new w9c[]{new w9c(6, 19), new w9c(2, 20)}), new nfd(28, new w9c[]{new w9c(6, 15), new w9c(2, 16)}));
        x9c x9cVar11 = new x9c(11, new int[]{6, 30, 54}, new nfd(20, new w9c[]{new w9c(4, 81)}), new nfd(30, new w9c[]{new w9c(1, 50), new w9c(4, 51)}), new nfd(28, new w9c[]{new w9c(4, 22), new w9c(4, 23)}), new nfd(24, new w9c[]{new w9c(3, 12), new w9c(8, 13)}));
        x9c x9cVar12 = new x9c(12, new int[]{6, 32, 58}, new nfd(24, new w9c[]{new w9c(2, 92), new w9c(2, 93)}), new nfd(22, new w9c[]{new w9c(6, 36), new w9c(2, 37)}), new nfd(26, new w9c[]{new w9c(4, 20), new w9c(6, 21)}), new nfd(28, new w9c[]{new w9c(7, 14), new w9c(4, 15)}));
        x9c x9cVar13 = new x9c(13, new int[]{6, 34, 62}, new nfd(26, new w9c[]{new w9c(4, kk7.r1)}), new nfd(22, new w9c[]{new w9c(8, 37), new w9c(1, 38)}), new nfd(24, new w9c[]{new w9c(8, 20), new w9c(4, 21)}), new nfd(22, new w9c[]{new w9c(12, 11), new w9c(4, 12)}));
        x9c x9cVar14 = new x9c(14, new int[]{6, 26, 46, 66}, new nfd(30, new w9c[]{new w9c(3, kk7.z1), new w9c(1, kk7.A1)}), new nfd(24, new w9c[]{new w9c(4, 40), new w9c(5, 41)}), new nfd(20, new w9c[]{new w9c(11, 16), new w9c(5, 17)}), new nfd(24, new w9c[]{new w9c(11, 12), new w9c(5, 13)}));
        x9c x9cVar15 = new x9c(15, new int[]{6, 26, 48, 70}, new nfd(22, new w9c[]{new w9c(5, 87), new w9c(1, 88)}), new nfd(24, new w9c[]{new w9c(5, 41), new w9c(5, 42)}), new nfd(30, new w9c[]{new w9c(5, 24), new w9c(7, 25)}), new nfd(24, new w9c[]{new w9c(11, 12), new w9c(7, 13)}));
        x9c x9cVar16 = new x9c(16, new int[]{6, 26, 50, 74}, new nfd(24, new w9c[]{new w9c(5, 98), new w9c(1, 99)}), new nfd(28, new w9c[]{new w9c(7, 45), new w9c(3, 46)}), new nfd(24, new w9c[]{new w9c(15, 19), new w9c(2, 20)}), new nfd(30, new w9c[]{new w9c(3, 15), new w9c(13, 16)}));
        x9c x9cVar17 = new x9c(17, new int[]{6, 30, 54, 78}, new nfd(28, new w9c[]{new w9c(1, kk7.r1), new w9c(5, kk7.s1)}), new nfd(28, new w9c[]{new w9c(10, 46), new w9c(1, 47)}), new nfd(28, new w9c[]{new w9c(1, 22), new w9c(15, 23)}), new nfd(28, new w9c[]{new w9c(2, 14), new w9c(17, 15)}));
        x9c x9cVar18 = new x9c(18, new int[]{6, 30, 56, 82}, new nfd(30, new w9c[]{new w9c(5, 120), new w9c(1, kk7.E1)}), new nfd(26, new w9c[]{new w9c(9, 43), new w9c(4, 44)}), new nfd(28, new w9c[]{new w9c(17, 22), new w9c(1, 23)}), new nfd(28, new w9c[]{new w9c(2, 14), new w9c(19, 15)}));
        x9c x9cVar19 = new x9c(19, new int[]{6, 30, 58, 86}, new nfd(28, new w9c[]{new w9c(3, kk7.x1), new w9c(4, kk7.y1)}), new nfd(26, new w9c[]{new w9c(3, 44), new w9c(11, 45)}), new nfd(26, new w9c[]{new w9c(17, 21), new w9c(4, 22)}), new nfd(26, new w9c[]{new w9c(9, 13), new w9c(16, 14)}));
        int i5 = 28;
        x9c x9cVar20 = new x9c(20, new int[]{6, 34, 62, 90}, new nfd(28, new w9c[]{new w9c(3, kk7.r1), new w9c(5, kk7.s1)}), new nfd(26, new w9c[]{new w9c(3, 41), new w9c(13, 42)}), new nfd(30, new w9c[]{new w9c(15, 24), new w9c(5, 25)}), new nfd(i5, new w9c[]{new w9c(15, 15), new w9c(10, 16)}));
        x9c x9cVar21 = new x9c(21, new int[]{6, 28, 50, 72, 94}, new nfd(i5, new w9c[]{new w9c(4, kk7.A1), new w9c(4, kk7.B1)}), new nfd(26, new w9c[]{new w9c(17, 42)}), new nfd(28, new w9c[]{new w9c(17, 22), new w9c(6, 23)}), new nfd(30, new w9c[]{new w9c(19, 16), new w9c(6, 17)}));
        int i6 = 28;
        int i7 = 28;
        return new x9c[]{x9cVar, x9cVar2, x9cVar3, x9cVar4, x9cVar5, x9cVar6, x9cVar7, x9cVar8, x9cVar9, x9cVar10, x9cVar11, x9cVar12, x9cVar13, x9cVar14, x9cVar15, x9cVar16, x9cVar17, x9cVar18, x9cVar19, x9cVar20, x9cVar21, new x9c(22, new int[]{6, 26, 50, 74, 98}, new nfd(i6, new w9c[]{new w9c(2, kk7.v1), new w9c(7, kk7.w1)}), new nfd(i6, new w9c[]{new w9c(17, 46)}), new nfd(30, new w9c[]{new w9c(7, 24), new w9c(16, 25)}), new nfd(24, new w9c[]{new w9c(34, 13)})), new x9c(23, new int[]{6, 30, 54, 78, kk7.m1}, new nfd(30, new w9c[]{new w9c(4, kk7.E1), new w9c(5, kk7.F1)}), new nfd(28, new w9c[]{new w9c(4, 47), new w9c(14, 48)}), new nfd(30, new w9c[]{new w9c(11, 24), new w9c(14, 25)}), new nfd(30, new w9c[]{new w9c(16, 15), new w9c(14, 16)})), new x9c(24, new int[]{6, 28, 54, 80, kk7.q1}, new nfd(30, new w9c[]{new w9c(6, kk7.B1), new w9c(4, kk7.C1)}), new nfd(28, new w9c[]{new w9c(6, 45), new w9c(14, 46)}), new nfd(30, new w9c[]{new w9c(11, 24), new w9c(16, 25)}), new nfd(30, new w9c[]{new w9c(30, 16), new w9c(2, 17)})), new x9c(25, new int[]{6, 32, 58, 84, kk7.u1}, new nfd(26, new w9c[]{new w9c(8, kk7.q1), new w9c(4, kk7.r1)}), new nfd(28, new w9c[]{new w9c(8, 47), new w9c(13, 48)}), new nfd(30, new w9c[]{new w9c(7, 24), new w9c(22, 25)}), new nfd(30, new w9c[]{new w9c(22, 15), new w9c(13, 16)})), new x9c(26, new int[]{6, 30, 58, 86, kk7.y1}, new nfd(i7, new w9c[]{new w9c(10, kk7.y1), new w9c(2, kk7.z1)}), new nfd(i7, new w9c[]{new w9c(19, 46), new w9c(4, 47)}), new nfd(28, new w9c[]{new w9c(28, 22), new w9c(6, 23)}), new nfd(30, new w9c[]{new w9c(33, 16), new w9c(4, 17)})), new x9c(27, new int[]{6, 34, 62, 90, kk7.C1}, new nfd(30, new w9c[]{new w9c(8, kk7.F1), new w9c(4, kk7.G1)}), new nfd(28, new w9c[]{new w9c(22, 45), new w9c(3, 46)}), new nfd(30, new w9c[]{new w9c(8, 23), new w9c(26, 24)}), new nfd(30, new w9c[]{new w9c(12, 15), new w9c(28, 16)})), new x9c(28, new int[]{6, 26, 50, 74, 98, kk7.F1}, new nfd(30, new w9c[]{new w9c(3, kk7.B1), new w9c(10, kk7.C1)}), new nfd(28, new w9c[]{new w9c(3, 45), new w9c(23, 46)}), new nfd(30, new w9c[]{new w9c(4, 24), new w9c(31, 25)}), new nfd(30, new w9c[]{new w9c(11, 15), new w9c(31, 16)})), new x9c(29, new int[]{6, 30, 54, 78, kk7.m1, kk7.J1}, new nfd(30, new w9c[]{new w9c(7, kk7.A1), new w9c(7, kk7.B1)}), new nfd(28, new w9c[]{new w9c(21, 45), new w9c(7, 46)}), new nfd(30, new w9c[]{new w9c(1, 23), new w9c(37, 24)}), new nfd(30, new w9c[]{new w9c(19, 15), new w9c(26, 16)})), new x9c(30, new int[]{6, 26, 52, 78, kk7.o1, kk7.N1}, new nfd(30, new w9c[]{new w9c(5, kk7.z1), new w9c(10, kk7.A1)}), new nfd(28, new w9c[]{new w9c(19, 47), new w9c(10, 48)}), new nfd(30, new w9c[]{new w9c(15, 24), new w9c(25, 25)}), new nfd(30, new w9c[]{new w9c(23, 15), new w9c(25, 16)})), new x9c(31, new int[]{6, 30, 56, 82, kk7.s1, 134}, new nfd(30, new w9c[]{new w9c(13, kk7.z1), new w9c(3, kk7.A1)}), new nfd(28, new w9c[]{new w9c(2, 46), new w9c(29, 47)}), new nfd(30, new w9c[]{new w9c(42, 24), new w9c(1, 25)}), new nfd(30, new w9c[]{new w9c(23, 15), new w9c(28, 16)})), new x9c(32, new int[]{6, 34, 60, 86, kk7.w1, kk7.T1}, new nfd(30, new w9c[]{new w9c(17, kk7.z1)}), new nfd(28, new w9c[]{new w9c(10, 46), new w9c(23, 47)}), new nfd(30, new w9c[]{new w9c(10, 24), new w9c(35, 25)}), new nfd(30, new w9c[]{new w9c(19, 15), new w9c(35, 16)})), new x9c(33, new int[]{6, 30, 58, 86, kk7.y1, kk7.X1}, new nfd(30, new w9c[]{new w9c(17, kk7.z1), new w9c(1, kk7.A1)}), new nfd(28, new w9c[]{new w9c(14, 46), new w9c(21, 47)}), new nfd(30, new w9c[]{new w9c(29, 24), new w9c(19, 25)}), new nfd(30, new w9c[]{new w9c(11, 15), new w9c(46, 16)})), new x9c(34, new int[]{6, 34, 62, 90, kk7.C1, kk7.b2}, new nfd(30, new w9c[]{new w9c(13, kk7.z1), new w9c(6, kk7.A1)}), new nfd(28, new w9c[]{new w9c(14, 46), new w9c(23, 47)}), new nfd(30, new w9c[]{new w9c(44, 24), new w9c(7, 25)}), new nfd(30, new w9c[]{new w9c(59, 16), new w9c(1, 17)})), new x9c(35, new int[]{6, 30, 54, 78, kk7.m1, kk7.J1, kk7.f2}, new nfd(30, new w9c[]{new w9c(12, kk7.E1), new w9c(7, kk7.F1)}), new nfd(28, new w9c[]{new w9c(12, 47), new w9c(26, 48)}), new nfd(30, new w9c[]{new w9c(39, 24), new w9c(14, 25)}), new nfd(30, new w9c[]{new w9c(22, 15), new w9c(41, 16)})), new x9c(36, new int[]{6, 24, 50, 76, kk7.m1, 128, kk7.j2}, new nfd(30, new w9c[]{new w9c(6, kk7.E1), new w9c(14, kk7.F1)}), new nfd(28, new w9c[]{new w9c(6, 47), new w9c(34, 48)}), new nfd(30, new w9c[]{new w9c(46, 24), new w9c(10, 25)}), new nfd(30, new w9c[]{new w9c(2, 15), new w9c(64, 16)})), new x9c(37, new int[]{6, 28, 54, 80, kk7.q1, kk7.P1, kk7.n2}, new nfd(30, new w9c[]{new w9c(17, kk7.F1), new w9c(4, kk7.G1)}), new nfd(28, new w9c[]{new w9c(29, 46), new w9c(14, 47)}), new nfd(30, new w9c[]{new w9c(49, 24), new w9c(10, 25)}), new nfd(30, new w9c[]{new w9c(24, 15), new w9c(46, 16)})), new x9c(38, new int[]{6, 32, 58, 84, kk7.u1, kk7.R1, kk7.r2}, new nfd(30, new w9c[]{new w9c(4, kk7.F1), new w9c(18, kk7.G1)}), new nfd(28, new w9c[]{new w9c(13, 46), new w9c(32, 47)}), new nfd(30, new w9c[]{new w9c(48, 24), new w9c(14, 25)}), new nfd(30, new w9c[]{new w9c(42, 15), new w9c(32, 16)})), new x9c(39, new int[]{6, 26, 54, 82, kk7.u1, kk7.T1, kk7.v2}, new nfd(30, new w9c[]{new w9c(20, kk7.B1), new w9c(4, kk7.C1)}), new nfd(28, new w9c[]{new w9c(40, 47), new w9c(7, 48)}), new nfd(30, new w9c[]{new w9c(43, 24), new w9c(22, 25)}), new nfd(30, new w9c[]{new w9c(10, 15), new w9c(67, 16)})), new x9c(40, new int[]{6, 30, 58, 86, kk7.y1, kk7.X1, kk7.z2}, new nfd(30, new w9c[]{new w9c(19, kk7.C1), new w9c(6, kk7.D1)}), new nfd(28, new w9c[]{new w9c(18, 47), new w9c(31, 48)}), new nfd(30, new w9c[]{new w9c(34, 24), new w9c(34, 25)}), new nfd(30, new w9c[]{new w9c(20, 15), new w9c(61, 16)}))};
    }

    public static x9c b(int i) {
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

    public static x9c c(int i) {
        if (i >= 1 && i <= 40) {
            return f[i - 1];
        }
        sc8.e();
        return null;
    }

    public final String toString() {
        return String.valueOf((int) this.a);
    }
}
