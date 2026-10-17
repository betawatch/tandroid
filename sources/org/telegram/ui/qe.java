package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
