package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c41 b;

    public /* synthetic */ y31(c41 c41Var, int i10) {
        this.a = i10;
        this.b = c41Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                c41 c41Var = this.b;
                if (c41Var.U == null) {
                    c41Var.dismiss();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
