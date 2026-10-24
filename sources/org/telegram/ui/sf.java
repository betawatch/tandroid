package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class sf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ sf(sn snVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = snVar;
        this.c = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                sn snVar = this.b;
                hi hiVar = new hi(snVar, snVar, snVar.getParentActivity(), snVar.qa, this.c);
                hiVar.setCalcMandatoryInsets(snVar.C9());
                hiVar.setDimBehind(false);
                snVar.D7(false);
                snVar.showDialog(hiVar);
                break;
            default:
                sn snVar2 = this.b;
                if (snVar2.getParentActivity() != null && snVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.aw(snVar2, snVar2.getParentActivity(), snVar2.qa, this.c).show();
                    snVar2.D7(true);
                    break;
                }
                break;
        }
    }
}
