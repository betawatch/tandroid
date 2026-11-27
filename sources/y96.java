// default package

import android.provider.Settings;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y96 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ba6 b;

    public /* synthetic */ y96(ba6 ba6Var, byte b) {
        this.a = b;
        this.b = ba6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        me8 me8Var;
        LaunchActivity launchActivity;
        byte b = this.a;
        ba6 ba6Var = this.b;
        switch (b) {
            case 0:
                me8 me8Var2 = ba6Var.a;
                if (me8Var2 != null) {
                    me8Var2.e();
                    break;
                }
                break;
            default:
                lcb lcbVar = ba6Var.c;
                if (lcbVar != null && ba6Var.Q() && (me8Var = ba6Var.a) != null && me8Var.c == 0 && (launchActivity = LaunchActivity.H1) != null && Settings.canDrawOverlays(launchActivity)) {
                    lcbVar.S();
                    break;
                }
                break;
        }
    }
}
