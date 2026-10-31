package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h4 b;

    public /* synthetic */ t(h4 h4Var, int i10) {
        this.a = i10;
        this.b = h4Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.c.f(true);
                break;
            default:
                this.b.k0 = null;
                break;
        }
    }
}
