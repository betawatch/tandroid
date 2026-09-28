package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
