package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;

    public /* synthetic */ w(i4 i4Var, int i10) {
        this.a = i10;
        this.b = i4Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.c.d(true);
                break;
            default:
                this.b.k0 = null;
                break;
        }
    }
}
