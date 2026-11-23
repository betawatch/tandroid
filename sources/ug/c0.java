package ug;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class c0 implements View.OnClickListener {
    public final /* synthetic */ d0 a;

    public c0(d0 d0Var) {
        this.a = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view.getParent();
        ArrayList arrayList = new ArrayList();
        arrayList.add(nVar.getCurrentChannel());
        k0 k0Var = this.a.c;
        int i7 = k0.S2;
        k0Var.y1(arrayList);
    }
}
