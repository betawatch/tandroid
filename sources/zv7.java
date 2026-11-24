// default package

import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class zv7 extends yv7 {
    public final /* synthetic */ aw7 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv7(aw7 aw7Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.k0 = aw7Var;
    }

    @Override // yv7
    public final void h(float f) {
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        mq3 mq3Var = launchActivity.y0;
        mq3Var.setScaleX(gl.R1(1.0f, 1.25f, f));
        mq3Var.setScaleY(gl.R1(1.0f, 1.25f, f));
    }

    @Override // yv7
    public final void j() {
        super/*android.app.Dialog*/.dismiss();
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        mq3 mq3Var = launchActivity.y0;
        mq3Var.setScaleX(1.0f);
        mq3Var.setScaleY(1.0f);
    }
}
