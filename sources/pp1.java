// default package

import android.os.SystemClock;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class pp1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv1 b;

    public /* synthetic */ pp1(yv1 yv1Var, byte b) {
        this.a = b;
        this.b = yv1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hg5 hg5Var;
        byte b = this.a;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                yv1Var.O7();
                yv1Var.Q7();
                yv1Var.E5();
                yv1Var.G5();
                break;
            case 1:
                ps1 ps1Var = yv1Var.g3;
                if ((ps1Var == null || ps1Var.getVisibility() != 0) && (hg5Var = yv1Var.L1) != null) {
                    hg5Var.v();
                    break;
                }
                break;
            case 2:
                yv1Var.x5();
                break;
            case 3:
                yv1Var.gd(0, yv1Var.h6 != 0 && SystemClock.elapsedRealtime() >= yv1Var.h6 + 150);
                break;
            case 4:
                yv1Var.n5(false);
                break;
            case 5:
                int i = yv1.xd;
                yv1Var.m5();
                break;
            case 6:
                int i2 = yv1.xd;
                yv1Var.m5();
                break;
            case 7:
                int i3 = yv1.xd;
                yv1Var.U4();
                break;
            case 8:
                int i4 = yv1.xd;
                yv1Var.U4();
                break;
            case 9:
                int i5 = yv1.xd;
                yv1Var.gb();
                break;
            case 10:
                int i6 = yv1.xd;
                yv1Var.gb();
                break;
            case 11:
                int i7 = yv1.xd;
                yv1Var.gb();
                break;
            case 12:
                int i8 = yv1.xd;
                yv1Var.gb();
                break;
            case 13:
                int i9 = yv1.xd;
                yv1Var.gb();
                break;
            case 14:
                int i10 = yv1.xd;
                yv1Var.gb();
                break;
            case 15:
                int i11 = yv1.xd;
                yv1Var.gb();
                break;
            case 16:
                int i12 = yv1.xd;
                yv1Var.gb();
                break;
            default:
                if (yv1Var.getParentLayout() != null) {
                    sxb.M0(yv1Var);
                    break;
                }
                break;
        }
    }
}
