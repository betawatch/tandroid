package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qv implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ uy b;

    public /* synthetic */ qv(uy uyVar, int i10) {
        this.a = i10;
        this.b = uyVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                uy.i0(this.b);
                break;
            case 1:
                uy uyVar = this.b;
                if (uyVar.R3 != null) {
                    uyVar.getMessagesController().removeSuggestion(0L, uyVar.R3);
                    uyVar.R3 = null;
                    uyVar.U4();
                    break;
                }
                break;
            case 2:
                this.b.k4(true);
                break;
            default:
                this.b.k4(true);
                break;
        }
    }
}
