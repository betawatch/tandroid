package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                yy.Y(this.b);
                break;
            case 1:
                yy yyVar = this.b;
                if (yyVar.S3 != null) {
                    yyVar.getMessagesController().removeSuggestion(0L, yyVar.S3);
                    yyVar.S3 = null;
                    yyVar.J4();
                    break;
                }
                break;
            case 2:
                this.b.Z3(true);
                break;
            default:
                this.b.Z3(true);
                break;
        }
    }
}
