package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class zf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ zf(yn ynVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = ynVar;
        this.c = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                yn ynVar = this.b;
                ni niVar = new ni(ynVar, ynVar, ynVar.getParentActivity(), ynVar.ca, this.c);
                niVar.setCalcMandatoryInsets(ynVar.w9());
                niVar.setDimBehind(false);
                ynVar.A7(false);
                ynVar.showDialog(niVar);
                break;
            default:
                yn ynVar2 = this.b;
                if (ynVar2.getParentActivity() != null && ynVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.wv(ynVar2, ynVar2.getParentActivity(), ynVar2.ca, this.c).show();
                    ynVar2.A7(true);
                    break;
                }
                break;
        }
    }
}
