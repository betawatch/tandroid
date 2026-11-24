// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pu0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qu0 b;

    public /* synthetic */ pu0(qu0 qu0Var, byte b) {
        this.a = b;
        this.b = qu0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qu0 qu0Var = this.b;
        switch (b) {
            case 0:
                cv0 cv0Var = qu0Var.e;
                hv0 hv0Var = cv0Var.R;
                if (hv0Var != null) {
                    cv0Var.h = false;
                    hv0Var.B(false, null);
                    break;
                }
                break;
            case 1:
                hv0 hv0Var2 = qu0Var.e.R;
                if (hv0Var2 != null) {
                    hv0Var2.G(!r2.canGoBack(), !r2.canGoForward());
                    break;
                }
                break;
            default:
                d01.t(qu0Var.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
        }
    }
}
