package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class qy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ry b;

    public /* synthetic */ qy(ry ryVar, int i10) {
        this.a = i10;
        this.b = ryVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                ry ryVar = this.b;
                yy yyVar = ryVar.E0;
                Context context = ryVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                yyVar.showDialog(new sg.j0(3, i10, context, yyVar, null));
                break;
            default:
                yy yyVar2 = this.b.E0;
                ux uxVar = yyVar2.M0;
                if (uxVar != null) {
                    uxVar.dismiss();
                    yyVar2.M0 = null;
                    break;
                }
                break;
        }
    }
}
