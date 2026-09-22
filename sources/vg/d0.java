package vg;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Components.pq;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class d0 extends e9 {
    public final e6 v;

    public d0(Context context, e6 e6Var) {
        super(context, e6Var);
        this.v = e6Var;
    }

    public void setBackground(boolean z10) {
        Context context = getContext();
        int i10 = z10 ? R.drawable.greydivider_bottom : R.drawable.greydivider;
        int i11 = i6.b7;
        e6 e6Var = this.v;
        pq pqVar = new pq(new ColorDrawable(i6.v0(i6.a7, e6Var)), i6.U0(context, i10, i6.v0(i11, e6Var)), 0, 0);
        pqVar.w = true;
        setBackground(pqVar);
    }
}
