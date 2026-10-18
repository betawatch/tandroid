package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ qe(sn snVar, int i10) {
        this.a = i10;
        this.b = snVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                bk bkVar = this.b.X1;
                if (bkVar != null) {
                    bkVar.c(false);
                    break;
                }
                break;
            case 1:
                sn.a1(this.b);
                break;
            case 2:
                this.b.j8(false, true, 0.0f);
                break;
            case 3:
                this.b.j8(false, true, 0.0f);
                break;
            case 4:
                this.b.j8(false, true, 0.0f);
                break;
            case 5:
                this.b.j8(false, true, 0.0f);
                break;
            case 6:
                this.b.j8(false, true, 0.0f);
                break;
            case 7:
                this.b.j8(false, true, 0.0f);
                break;
            default:
                this.b.Gb = null;
                break;
        }
    }
}
