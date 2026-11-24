// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class vsd {
    public static void a(long j, yw7 yw7Var, yzb[] yzbVarArr) {
        int i;
        while (true) {
            if (yw7Var.a() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (yw7Var.a() == 0) {
                    i = -1;
                    break;
                }
                int A = yw7Var.A();
                i2 += A;
                if (A != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            while (true) {
                if (yw7Var.a() == 0) {
                    i3 = -1;
                    break;
                }
                int A2 = yw7Var.A();
                i3 += A2;
                if (A2 != 255) {
                    break;
                }
            }
            int i4 = yw7Var.b + i3;
            if (i3 == -1 || i3 > yw7Var.a()) {
                ncd.f("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i4 = yw7Var.c;
            } else if (i == 4 && i3 >= 8) {
                int A3 = yw7Var.A();
                int H = yw7Var.H();
                int m = H == 49 ? yw7Var.m() : 0;
                int A4 = yw7Var.A();
                if (H == 47) {
                    yw7Var.O(1);
                }
                boolean z = A3 == 181 && (H == 49 || H == 47) && A4 == 3;
                if (H == 49) {
                    z &= m == 1195456820;
                }
                if (z) {
                    b(j, yw7Var, yzbVarArr);
                }
            }
            yw7Var.N(i4);
        }
    }

    public static void b(long j, yw7 yw7Var, yzb[] yzbVarArr) {
        int A = yw7Var.A();
        if ((A & 64) != 0) {
            yw7Var.O(1);
            int i = (A & 31) * 3;
            int i2 = yw7Var.b;
            for (yzb yzbVar : yzbVarArr) {
                yw7Var.N(i2);
                yzbVar.e(i, yw7Var);
                jte.p(j != -9223372036854775807L);
                yzbVar.a(j, 1, i, 0, null);
            }
        }
    }
}
