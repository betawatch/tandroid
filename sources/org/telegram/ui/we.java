package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class we implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;

    public /* synthetic */ we(fo foVar, int i10) {
        this.a = i10;
        this.b = foVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                mk mkVar = this.b.X1;
                if (mkVar != null) {
                    mkVar.c(false);
                    break;
                }
                break;
            case 1:
                fo.a1(this.b);
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
