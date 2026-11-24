// default package

import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class yb8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ac8 b;

    public /* synthetic */ yb8(ac8 ac8Var, byte b) {
        this.a = b;
        this.b = ac8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ac8 ac8Var = this.b;
        switch (b) {
            case 0:
                ya8 ya8Var = ac8Var.a;
                RadialProgressView radialProgressView = ya8Var.n;
                a8 a8Var = ya8Var.r;
                radialProgressView.setVisibility(4);
                if (ya8Var.G) {
                    ya8Var.G = false;
                    ya8Var.setPlaybackSpeed(ya8Var.F);
                }
                a8Var.setEnabled(true);
                a8Var.setAlpha(1.0f);
                PhotoViewer photoViewer = ya8Var.b;
                if (photoViewer != null) {
                    photoViewer.s();
                    break;
                }
                break;
            default:
                ac8Var.a.h.setVisibility(4);
                break;
        }
    }
}
