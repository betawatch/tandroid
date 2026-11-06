package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
