package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u20 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d60 b;

    public /* synthetic */ u20(d60 d60Var, int i10) {
        this.a = i10;
        this.b = d60Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (this.b.x0 && (U instanceof wn)) {
                    ((wn) U).T9(true, true);
                    break;
                }
                break;
            case 1:
                this.b.dismiss();
                break;
            case 2:
                this.b.E1 = null;
                break;
            default:
                this.b.r0 = null;
                break;
        }
    }
}
