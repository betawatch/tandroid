package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ vf(zn znVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = znVar;
        this.c = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                zn znVar = this.b;
                ni niVar = new ni(znVar, znVar, znVar.getParentActivity(), znVar.ba, this.c);
                niVar.setCalcMandatoryInsets(znVar.x9());
                niVar.setDimBehind(false);
                znVar.A7(false);
                znVar.showDialog(niVar);
                break;
            default:
                zn znVar2 = this.b;
                if (znVar2.getParentActivity() != null && znVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.lv(znVar2, znVar2.getParentActivity(), znVar2.ba, this.c).show();
                    znVar2.A7(true);
                    break;
                }
                break;
        }
    }
}
