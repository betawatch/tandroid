// default package

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class vr1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;

    public /* synthetic */ vr1(zu1 zu1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wz1 wz1Var;
        FrameLayout frameLayout;
        byte b = this.a;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = zu1Var.sa;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    zu1Var.sa.start();
                    break;
                }
                break;
            default:
                if (zu1Var.d3 == this && (wz1Var = zu1Var.b1) != null && (frameLayout = zu1Var.c3) != null) {
                    wz1Var.j(frameLayout, false, true);
                    break;
                }
                break;
        }
    }
}
