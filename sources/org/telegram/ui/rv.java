package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class rv implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ uy b;

    public /* synthetic */ rv(uy uyVar, int i10) {
        this.a = i10;
        this.b = uyVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                uy.j0(this.b);
                break;
            case 1:
                uy uyVar = this.b;
                if (uyVar.R3 != null) {
                    uyVar.getMessagesController().removeSuggestion(0L, uyVar.R3);
                    uyVar.R3 = null;
                    uyVar.L4();
                    break;
                }
                break;
            case 2:
                this.b.b4(true);
                break;
            default:
                this.b.b4(true);
                break;
        }
    }
}
