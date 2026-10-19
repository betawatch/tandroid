package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class sf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ sf(qn qnVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = qnVar;
        this.c = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                qn qnVar = this.b;
                hi hiVar = new hi(qnVar, qnVar, qnVar.getParentActivity(), qnVar.ea, this.c);
                hiVar.setCalcMandatoryInsets(qnVar.C9());
                hiVar.setDimBehind(false);
                qnVar.D7(false);
                qnVar.showDialog(hiVar);
                break;
            default:
                qn qnVar2 = this.b;
                if (qnVar2.getParentActivity() != null && qnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.aw(qnVar2, qnVar2.getParentActivity(), qnVar2.ea, this.c).show();
                    qnVar2.D7(true);
                    break;
                }
                break;
        }
    }
}
