package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c51 b;

    public /* synthetic */ y41(c51 c51Var, int i10) {
        this.a = i10;
        this.b = c51Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                c51 c51Var = this.b;
                if (c51Var.Y == null) {
                    c51Var.dismiss();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
