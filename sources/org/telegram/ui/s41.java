package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w41 b;

    public /* synthetic */ s41(w41 w41Var, int i10) {
        this.a = i10;
        this.b = w41Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                w41 w41Var = this.b;
                if (w41Var.V == null) {
                    w41Var.dismiss();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
