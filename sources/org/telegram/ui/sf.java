package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ sf(un unVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = unVar;
        this.c = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                un unVar = this.b;
                ii iiVar = new ii(unVar, unVar, unVar.getParentActivity(), unVar.qa, this.c);
                iiVar.setCalcMandatoryInsets(unVar.F9());
                iiVar.setDimBehind(false);
                unVar.H7(false);
                unVar.showDialog(iiVar);
                break;
            default:
                un unVar2 = this.b;
                if (unVar2.getParentActivity() != null && unVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.aw(unVar2, unVar2.getParentActivity(), unVar2.qa, this.c).show();
                    unVar2.H7(true);
                    break;
                }
                break;
        }
    }
}
