package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sv implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wy b;

    public /* synthetic */ sv(wy wyVar, int i10) {
        this.a = i10;
        this.b = wyVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                wy.j0(this.b);
                break;
            case 1:
                wy wyVar = this.b;
                if (wyVar.R3 != null) {
                    wyVar.getMessagesController().removeSuggestion(0L, wyVar.R3);
                    wyVar.R3 = null;
                    wyVar.L4();
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
