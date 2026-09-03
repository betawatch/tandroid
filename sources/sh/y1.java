package sh;

import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p2 b;

    public /* synthetic */ y1(p2 p2Var, int i10) {
        this.a = i10;
        this.b = p2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                org.telegram.ui.web.x0 webView = this.b.x.getWebView();
                if (webView != null) {
                    webView.reload();
                    break;
                }
                break;
            default:
                this.b.r();
                break;
        }
    }
}
