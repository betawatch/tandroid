package rh;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.z2[] b;

    public /* synthetic */ p6(org.telegram.ui.ActionBar.z2[] z2VarArr, int i10) {
        this.a = i10;
        this.b = z2VarArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b[0].dismiss();
                break;
            case 1:
                org.telegram.ui.ActionBar.z2 z2Var = this.b[0];
                if (z2Var != null) {
                    z2Var.dismiss();
                    break;
                }
                break;
            default:
                this.b[0].dismiss();
                break;
        }
    }
}
