package ug;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class d0 implements View.OnClickListener {
    public final /* synthetic */ e0 a;

    public d0(e0 e0Var) {
        this.a = e0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view.getParent();
        ArrayList arrayList = new ArrayList();
        arrayList.add(nVar.getCurrentChannel());
        l0 l0Var = this.a.c;
        int i7 = l0.S2;
        l0Var.y1(arrayList);
    }
}
