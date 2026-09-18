package vg;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Components.pq;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class d0 extends e9 {
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
