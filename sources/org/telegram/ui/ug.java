package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ug(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                fo foVar = (fo) this.b;
                foVar.b9 = true;
                foVar.Z8 = 0;
                foVar.qb = 0;
                foVar.N4 = 0;
                foVar.w9();
                foVar.Rb(false);
                break;
            case 1:
                zo zoVar = (zo) this.b;
                zoVar.M0 = false;
                zoVar.b = null;
                zoVar.N0 = false;
                break;
            case 2:
                ((aq) this.b).n = null;
                break;
            default:
                ((jc0) this.b).b();
                break;
        }
    }
}
