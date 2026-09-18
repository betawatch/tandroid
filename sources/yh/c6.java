package yh;

import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.g3[] b;

    public /* synthetic */ c6(org.telegram.ui.ActionBar.g3[] g3VarArr, int i10) {
        this.a = i10;
        this.b = g3VarArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b[0].dismiss();
                break;
            case 1:
                org.telegram.ui.ActionBar.g3 g3Var = this.b[0];
                if (g3Var != null) {
                    g3Var.dismiss();
                    break;
                }
                break;
            default:
                this.b[0].dismiss();
                break;
        }
    }
}
