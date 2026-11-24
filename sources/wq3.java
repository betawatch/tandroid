// default package

import android.view.ViewGroup;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class wq3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xq3 b;

    public /* synthetic */ wq3(xq3 xq3Var, byte b) {
        this.a = b;
        this.b = xq3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        xq3 xq3Var = this.b;
        switch (b) {
            case 0:
                if (xq3Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) xq3Var.getParent()).removeView(xq3Var);
                    break;
                }
                break;
            default:
                xq3Var.a();
                break;
        }
    }
}
