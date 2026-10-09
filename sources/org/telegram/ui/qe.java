package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ qe(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ik ikVar = this.b.X1;
                if (ikVar != null) {
                    ikVar.c(false);
                    break;
                }
                break;
            case 1:
                zn.a1(this.b);
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
