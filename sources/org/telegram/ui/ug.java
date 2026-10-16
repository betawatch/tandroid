package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                ((ic0) this.b).b();
                break;
        }
    }
}
