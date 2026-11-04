package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rf implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rf(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                wm wmVar = (wm) this.b;
                wmVar.q9 = true;
                wmVar.o9 = 0;
                wmVar.Rb = 0;
                wmVar.a5 = 0;
                wmVar.M9();
                wmVar.qc(false);
                break;
            case 1:
                ln lnVar = (ln) this.b;
                lnVar.N0 = false;
                lnVar.b = null;
                lnVar.O0 = false;
                break;
            case 2:
                ((qo) this.b).n = null;
                break;
            default:
                ((m90) this.b).b();
                break;
        }
    }
}
