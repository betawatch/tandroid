// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zu0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ av0 b;

    public /* synthetic */ zu0(av0 av0Var, byte b) {
        this.a = b;
        this.b = av0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        av0 av0Var = this.b;
        switch (b) {
            case 0:
                nv0 nv0Var = av0Var.e;
                rv0 rv0Var = nv0Var.R;
                if (rv0Var != null) {
                    nv0Var.h = false;
                    rv0Var.B(false, null);
                    break;
                }
                break;
            case 1:
                rv0 rv0Var2 = av0Var.e.R;
                if (rv0Var2 != null) {
                    rv0Var2.G(!r2.canGoBack(), !r2.canGoForward());
                    break;
                }
                break;
            default:
                m01.u(av0Var.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
        }
    }
}
