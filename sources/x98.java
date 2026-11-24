// default package

import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class x98 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z98 b;

    public /* synthetic */ x98(z98 z98Var, byte b) {
        this.a = b;
        this.b = z98Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        z98 z98Var = this.b;
        switch (b) {
            case 0:
                x88 x88Var = z98Var.a;
                RadialProgressView radialProgressView = x88Var.n;
                a8 a8Var = x88Var.r;
                radialProgressView.setVisibility(4);
                if (x88Var.G) {
                    x88Var.G = false;
                    x88Var.setPlaybackSpeed(x88Var.F);
                }
                a8Var.setEnabled(true);
                a8Var.setAlpha(1.0f);
                PhotoViewer photoViewer = x88Var.b;
                if (photoViewer != null) {
                    photoViewer.u();
                    break;
                }
                break;
            default:
                z98Var.a.h.setVisibility(4);
                break;
        }
    }
}
