package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
