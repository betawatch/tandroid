package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qr implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.fh0 b;

    public /* synthetic */ qr(org.telegram.ui.Components.fh0 fh0Var, int i10) {
        this.a = i10;
        this.b = fh0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.b(true);
                break;
            default:
                this.b.b(true);
                break;
        }
    }
}
