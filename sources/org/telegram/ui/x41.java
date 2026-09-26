package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b51 b;

    public /* synthetic */ x41(b51 b51Var, int i10) {
        this.a = i10;
        this.b = b51Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                b51 b51Var = this.b;
                if (b51Var.Y == null) {
                    b51Var.dismiss();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
