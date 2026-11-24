// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class sqd {
    public static void a(long j, xu7 xu7Var, wxb[] wxbVarArr) {
        int i;
        while (true) {
            if (xu7Var.a() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (xu7Var.a() == 0) {
                    i = -1;
                    break;
                }
                int A = xu7Var.A();
                i2 += A;
                if (A != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            while (true) {
                if (xu7Var.a() == 0) {
                    i3 = -1;
                    break;
                }
                int A2 = xu7Var.A();
                i3 += A2;
                if (A2 != 255) {
                    break;
                }
            }
            int i4 = xu7Var.b + i3;
            if (i3 == -1 || i3 > xu7Var.a()) {
                lad.f("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i4 = xu7Var.c;
            } else if (i == 4 && i3 >= 8) {
                int A3 = xu7Var.A();
                int H = xu7Var.H();
                int m = H == 49 ? xu7Var.m() : 0;
                int A4 = xu7Var.A();
                if (H == 47) {
                    xu7Var.O(1);
                }
                boolean z = A3 == 181 && (H == 49 || H == 47) && A4 == 3;
                if (H == 49) {
                    z &= m == 1195456820;
                }
                if (z) {
                    b(j, xu7Var, wxbVarArr);
                }
            }
            xu7Var.N(i4);
        }
    }

    public static void b(long j, xu7 xu7Var, wxb[] wxbVarArr) {
        int A = xu7Var.A();
        if ((A & 64) != 0) {
            xu7Var.O(1);
            int i = (A & 31) * 3;
            int i2 = xu7Var.b;
            for (wxb wxbVar : wxbVarArr) {
                xu7Var.N(i2);
                wxbVar.e(i, xu7Var);
                gre.p(j != -9223372036854775807L);
                wxbVar.a(j, 1, i, 0, null);
            }
        }
    }
}
