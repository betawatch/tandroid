package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zf implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ zf(qn qnVar, int i9) {
        this.a = i9;
        this.b = qnVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                qn.A0(this.b);
                break;
            case 1:
                this.b.g8(false, true, 0.0f);
                break;
            case 2:
                this.b.g8(false, true, 0.0f);
                break;
            case 3:
                this.b.g8(false, true, 0.0f);
                break;
            case 4:
                this.b.g8(false, true, 0.0f);
                break;
            case 5:
                this.b.g8(false, true, 0.0f);
                break;
            case 6:
                this.b.g8(false, true, 0.0f);
                break;
            case 7:
                this.b.Cb = null;
                break;
            default:
                vj vjVar = this.b.T1;
                if (vjVar != null) {
                    vjVar.c(false);
                    break;
                }
                break;
        }
    }
}
