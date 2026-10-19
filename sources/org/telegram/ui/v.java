package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l4 b;

    public /* synthetic */ v(l4 l4Var, int i10) {
        this.a = i10;
        this.b = l4Var;
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
