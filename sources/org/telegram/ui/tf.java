package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
