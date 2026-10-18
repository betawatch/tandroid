package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ uf(sn snVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = snVar;
        this.c = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                sn snVar = this.b;
                ji jiVar = new ji(snVar, snVar, snVar.getParentActivity(), snVar.ea, this.c);
                jiVar.setCalcMandatoryInsets(snVar.C9());
                jiVar.setDimBehind(false);
                snVar.D7(false);
                snVar.showDialog(jiVar);
                break;
            default:
                sn snVar2 = this.b;
                if (snVar2.getParentActivity() != null && snVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.aw(snVar2, snVar2.getParentActivity(), snVar2.ea, this.c).show();
                    snVar2.D7(true);
                    break;
                }
                break;
        }
    }
}
