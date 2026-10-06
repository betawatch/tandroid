package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
