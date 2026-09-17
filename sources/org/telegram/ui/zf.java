package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ zf(co coVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = coVar;
        this.c = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                co coVar = this.b;
                pi piVar = new pi(coVar, coVar, coVar.getParentActivity(), coVar.ea, this.c);
                piVar.setCalcMandatoryInsets(coVar.x9());
                piVar.setDimBehind(false);
                coVar.A7(false);
                coVar.showDialog(piVar);
                break;
            default:
                co coVar2 = this.b;
                if (coVar2.getParentActivity() != null && coVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.rv(coVar2, coVar2.getParentActivity(), coVar2.ea, this.c).show();
                    coVar2.A7(true);
                    break;
                }
                break;
        }
    }
}
