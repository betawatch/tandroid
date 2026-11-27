// default package

import android.os.SystemClock;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class s59 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u59 b;

    public /* synthetic */ s59(u59 u59Var, byte b) {
        this.a = b;
        this.b = u59Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        u59 u59Var = this.b;
        switch (b) {
            case 0:
                u59Var.s0 = false;
                u59Var.A0 = false;
                u59Var.w0 = SystemClock.elapsedRealtime();
                u59Var.v0 = true;
                u59Var.x0 = false;
                u59Var.K.c(false);
                u59Var.L.c(false);
                u59Var.M.c(false);
                ((rab) u59Var.a).e(true);
                break;
            case 1:
                u59Var.R = System.currentTimeMillis();
                u59Var.S = 0L;
                u59Var.s0 = true;
                ((rab) u59Var.a).a.K0.a(0L, true);
                break;
            case 2:
                if (!u59Var.s0 && !u59Var.b()) {
                    if (!((rab) u59Var.a).a.Y()) {
                        u59Var.x0 = false;
                        u59Var.K.c(false);
                        u59Var.L.c(false);
                        u59Var.M.c(false);
                        break;
                    } else {
                        u59Var.A0 = true;
                        u59Var.B0 = true;
                        ((rab) u59Var.a).f(new s59(u59Var, (byte) 4), true);
                        break;
                    }
                }
                break;
            case 3:
                if (!u59Var.s0 && !u59Var.b()) {
                    wab wabVar = ((rab) u59Var.a).a.C0;
                    if (wabVar != null) {
                        wabVar.toggleDual();
                    }
                    u59Var.d(360.0f);
                    u59Var.x0 = false;
                    u59Var.K.c(false);
                    u59Var.L.c(false);
                    u59Var.M.c(false);
                    break;
                }
                break;
            default:
                u59Var.R = System.currentTimeMillis();
                u59Var.s0 = true;
                t59 t59Var = u59Var.a;
                u59Var.S = 0L;
                ((rab) t59Var).a.K0.a(0L, true);
                break;
        }
    }
}
