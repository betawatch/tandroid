package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                if (c41Var.Y == null) {
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
