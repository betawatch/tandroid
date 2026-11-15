package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class we implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ we(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
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
