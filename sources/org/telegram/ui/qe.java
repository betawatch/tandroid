package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ qe(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                gk gkVar = this.b.l2;
                if (gkVar != null) {
                    gkVar.c(false);
                    break;
                }
                break;
            case 1:
                un.Y0(this.b);
                break;
            case 2:
                this.b.o8(false, true, 0.0f);
                break;
            case 3:
                this.b.o8(false, true, 0.0f);
                break;
            case 4:
                this.b.o8(false, true, 0.0f);
                break;
            case 5:
                this.b.o8(false, true, 0.0f);
                break;
            case 6:
                this.b.o8(false, true, 0.0f);
                break;
            case 7:
                this.b.o8(false, true, 0.0f);
                break;
            default:
                this.b.bc = null;
                break;
        }
    }
}
