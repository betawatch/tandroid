package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                bk bkVar = this.b.j2;
                if (bkVar != null) {
                    bkVar.c(false);
                    break;
                }
                break;
            case 1:
                un.j1(this.b);
                break;
            case 2:
                this.b.n8(false, true, 0.0f);
                break;
            case 3:
                this.b.n8(false, true, 0.0f);
                break;
            case 4:
                this.b.n8(false, true, 0.0f);
                break;
            case 5:
                this.b.n8(false, true, 0.0f);
                break;
            case 6:
                this.b.n8(false, true, 0.0f);
                break;
            case 7:
                this.b.n8(false, true, 0.0f);
                break;
            default:
                this.b.cc = null;
                break;
        }
    }
}
