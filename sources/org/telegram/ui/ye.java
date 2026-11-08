package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ye implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ ye(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.qc(false);
                break;
            default:
                this.b.qc(false);
                break;
        }
    }
}
