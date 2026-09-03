package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n4 b;

    public /* synthetic */ x(n4 n4Var, int i10) {
        this.a = i10;
        this.b = n4Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.c.d(true);
                break;
            default:
                this.b.h0 = null;
                break;
        }
    }
}
