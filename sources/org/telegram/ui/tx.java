package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ux b;

    public /* synthetic */ tx(ux uxVar, int i10) {
        this.a = i10;
        this.b = uxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                ux uxVar = this.b;
                cy cyVar = uxVar.E0;
                Context context = uxVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
                cyVar.showDialog(new sg.k0(3, i10, context, cyVar, null));
                break;
            default:
                cy cyVar2 = this.b.E0;
                yw ywVar = cyVar2.M0;
                if (ywVar != null) {
                    ywVar.dismiss();
                    cyVar2.M0 = null;
                    break;
                }
                break;
        }
    }
}
