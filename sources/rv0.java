// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class rv0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ow0 b;

    public /* synthetic */ rv0(ow0 ow0Var, byte b) {
        this.a = b;
        this.b = ow0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        ow0 ow0Var = this.b;
        switch (b) {
            case 0:
                cv0 webView = ow0Var.E.getWebView();
                if (webView != null) {
                    webView.reload();
                    break;
                }
                break;
            default:
                ow0Var.w();
                break;
        }
    }
}
