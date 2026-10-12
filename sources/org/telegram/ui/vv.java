package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class vv implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy b;

    public /* synthetic */ vv(yy yyVar, int i10) {
        this.a = i10;
        this.b = yyVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                yy.h0(this.b);
                break;
            case 1:
                yy yyVar = this.b;
                if (yyVar.R3 != null) {
                    yyVar.getMessagesController().removeSuggestion(0L, yyVar.R3);
                    yyVar.R3 = null;
                    yyVar.I4();
                    break;
                }
                break;
            case 2:
                this.b.Y3(true);
                break;
            default:
                this.b.Y3(true);
                break;
        }
    }
}
