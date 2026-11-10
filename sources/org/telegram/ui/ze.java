package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ze implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;

    public /* synthetic */ ze(cn cnVar, int i7) {
        this.a = i7;
        this.b = cnVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.tc(false);
                break;
            default:
                this.b.tc(false);
                break;
        }
    }
}
