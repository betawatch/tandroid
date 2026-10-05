package yh;

import android.view.View;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f3[] b;

    public /* synthetic */ d6(org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.a = i10;
        this.b = f3VarArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b[0].dismiss();
                break;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = this.b[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    break;
                }
                break;
            default:
                this.b[0].dismiss();
                break;
        }
    }
}
