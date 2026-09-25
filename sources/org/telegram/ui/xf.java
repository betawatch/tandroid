package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ xf(wn wnVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = wnVar;
        this.c = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                wn wnVar = this.b;
                mi miVar = new mi(wnVar, wnVar, wnVar.getParentActivity(), wnVar.ea, this.c);
                miVar.setCalcMandatoryInsets(wnVar.x9());
                miVar.setDimBehind(false);
                wnVar.A7(false);
                wnVar.showDialog(miVar);
                break;
            default:
                wn wnVar2 = this.b;
                if (wnVar2.getParentActivity() != null && wnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.tv(wnVar2, wnVar2.getParentActivity(), wnVar2.ea, this.c).show();
                    wnVar2.A7(true);
                    break;
                }
                break;
        }
    }
}
