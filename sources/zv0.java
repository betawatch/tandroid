// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class zv0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ aw0 b;

    public /* synthetic */ zv0(aw0 aw0Var, byte b) {
        this.a = b;
        this.b = aw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        aw0 aw0Var = this.b;
        switch (b) {
            case 0:
                mw0 mw0Var = aw0Var.e;
                qw0 qw0Var = mw0Var.R;
                if (qw0Var != null) {
                    mw0Var.h = false;
                    qw0Var.B(false, null);
                    break;
                }
                break;
            case 1:
                qw0 qw0Var2 = aw0Var.e.R;
                if (qw0Var2 != null) {
                    qw0Var2.G(!r2.canGoBack(), !r2.canGoForward());
                    break;
                }
                break;
            default:
                l11.u(aw0Var.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
        }
    }
}
