package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class xe implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;

    public /* synthetic */ xe(bn bnVar, int i7) {
        this.a = i7;
        this.b = bnVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.uc(false);
                break;
            default:
                this.b.uc(false);
                break;
        }
    }
}
