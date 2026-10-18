package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z31 b;

    public /* synthetic */ v31(z31 z31Var, int i10) {
        this.a = i10;
        this.b = z31Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                z31 z31Var = this.b;
                if (z31Var.Y == null) {
                    z31Var.dismiss();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
