package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w10 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b50 b;

    public /* synthetic */ w10(b50 b50Var, int i10) {
        this.a = i10;
        this.b = b50Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (this.b.o2 && (T instanceof un)) {
                    ((un) T).ja(true, true);
                    break;
                }
                break;
            case 1:
                this.b.dismiss();
                break;
            case 2:
                this.b.v3 = null;
                break;
            default:
                this.b.i2 = null;
                break;
        }
    }
}
