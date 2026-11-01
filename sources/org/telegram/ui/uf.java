package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ uf(un unVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = unVar;
        this.c = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                un unVar = this.b;
                si siVar = new si(unVar, unVar, unVar.getParentActivity(), unVar.xa, this.c);
                boolean O9 = unVar.O9();
                siVar.h0 = O9;
                siVar.n = O9;
                siVar.o0 = false;
                unVar.M7(false);
                unVar.showDialog(siVar);
                break;
            default:
                un unVar2 = this.b;
                if (unVar2.getParentActivity() != null && unVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.cv(unVar2, unVar2.getParentActivity(), unVar2.xa, this.c).show();
                    unVar2.M7(true);
                    break;
                }
                break;
        }
    }
}
