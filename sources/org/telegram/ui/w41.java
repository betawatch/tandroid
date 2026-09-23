package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class w41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a51 b;

    public /* synthetic */ w41(a51 a51Var, int i10) {
        this.a = i10;
        this.b = a51Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                a51 a51Var = this.b;
                if (a51Var.Y == null) {
                    a51Var.dismiss();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
