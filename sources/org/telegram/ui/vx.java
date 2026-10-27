package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wx b;

    public /* synthetic */ vx(wx wxVar, int i10) {
        this.a = i10;
        this.b = wxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                wx wxVar = this.b;
                ey eyVar = wxVar.t0;
                Context context = wxVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.r2) eyVar).currentAccount;
                eyVar.showDialog(new tg.j0(3, i10, context, eyVar, null));
                break;
            default:
                ey eyVar2 = this.b.t0;
                xw xwVar = eyVar2.M0;
                if (xwVar != null) {
                    xwVar.dismiss();
                    eyVar2.M0 = null;
                    break;
                }
                break;
        }
    }
}
