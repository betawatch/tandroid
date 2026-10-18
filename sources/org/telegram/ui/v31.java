package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
