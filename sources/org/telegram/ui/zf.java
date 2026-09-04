package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
