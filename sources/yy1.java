// default package

import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class yy1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ yy1(FrameLayout frameLayout, byte b) {
        this.a = b;
        this.b = frameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                gm.B2(frameLayout);
                break;
            default:
                gm.B2(frameLayout);
                break;
        }
    }
}
