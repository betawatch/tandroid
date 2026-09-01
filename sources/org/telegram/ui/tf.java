package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ tf(xn xnVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = xnVar;
        this.c = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                xn xnVar = this.b;
                li liVar = new li(xnVar, xnVar, xnVar.getParentActivity(), xnVar.ba, this.c);
                liVar.setCalcMandatoryInsets(xnVar.x9());
                liVar.setDimBehind(false);
                xnVar.A7(false);
                xnVar.showDialog(liVar);
                break;
            default:
                xn xnVar2 = this.b;
                if (xnVar2.getParentActivity() != null && xnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.ov(xnVar2, xnVar2.getParentActivity(), xnVar2.ba, this.c).show();
                    xnVar2.A7(true);
                    break;
                }
                break;
        }
    }
}
