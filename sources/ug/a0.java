package ug;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class a0 implements View.OnClickListener {
    public final /* synthetic */ b0 a;

    public a0(b0 b0Var) {
        this.a = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view.getParent();
        ArrayList arrayList = new ArrayList();
        arrayList.add(nVar.getCurrentChannel());
        i0 i0Var = this.a.c;
        int i7 = i0.R2;
        i0Var.x1(arrayList);
    }
}
