package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
