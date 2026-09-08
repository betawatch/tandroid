package sg;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        int i10 = k0.V0;
        k0Var.D1(arrayList);
    }
}
