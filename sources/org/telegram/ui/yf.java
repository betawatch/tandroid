package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class yf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ yf(xn xnVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = xnVar;
        this.c = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                xn xnVar = this.b;
                mi miVar = new mi(xnVar, xnVar, xnVar.getParentActivity(), xnVar.ea, this.c);
                miVar.setCalcMandatoryInsets(xnVar.x9());
                miVar.setDimBehind(false);
                xnVar.A7(false);
                xnVar.showDialog(miVar);
                break;
            default:
                xn xnVar2 = this.b;
                if (xnVar2.getParentActivity() != null && xnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.tv(xnVar2, xnVar2.getParentActivity(), xnVar2.ea, this.c).show();
                    xnVar2.A7(true);
                    break;
                }
                break;
        }
    }
}
