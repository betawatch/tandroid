package vg;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.f9;
import org.telegram.ui.Components.pq;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class d0 extends f9 {
    public final f6 v;

    public d0(Context context, f6 f6Var) {
        super(context, f6Var);
        this.v = f6Var;
    }

    public void setBackground(boolean z10) {
        Context context = getContext();
        int i10 = z10 ? R.drawable.greydivider_bottom : R.drawable.greydivider;
        int i11 = j6.b7;
        f6 f6Var = this.v;
        pq pqVar = new pq(new ColorDrawable(j6.v0(j6.a7, f6Var)), j6.U0(context, i10, j6.v0(i11, f6Var)), 0, 0);
        pqVar.w = true;
        setBackground(pqVar);
    }
}
