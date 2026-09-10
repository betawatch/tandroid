package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class qf implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo b;

    public /* synthetic */ qf(eo eoVar, int i10) {
        this.a = i10;
        this.b = eoVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.Nb(false);
                break;
            default:
                this.b.Nb(false);
                break;
        }
    }
}
