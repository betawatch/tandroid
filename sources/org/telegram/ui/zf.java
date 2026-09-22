package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ zf(bo boVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = boVar;
        this.c = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                bo boVar = this.b;
                pi piVar = new pi(boVar, boVar, boVar.getParentActivity(), boVar.ea, this.c);
                piVar.setCalcMandatoryInsets(boVar.x9());
                piVar.setDimBehind(false);
                boVar.A7(false);
                boVar.showDialog(piVar);
                break;
            default:
                bo boVar2 = this.b;
                if (boVar2.getParentActivity() != null && boVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.sv(boVar2, boVar2.getParentActivity(), boVar2.ea, this.c).show();
                    boVar2.A7(true);
                    break;
                }
                break;
        }
    }
}
