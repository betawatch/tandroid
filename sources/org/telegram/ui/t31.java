package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x31 b;

    public /* synthetic */ t31(x31 x31Var, int i10) {
        this.a = i10;
        this.b = x31Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                x31 x31Var = this.b;
                if (x31Var.Y == null) {
                    x31Var.dismiss();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
