package vg;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Components.pq;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
        int i11 = j6.b7;
        e6 e6Var = this.v;
        pq pqVar = new pq(new ColorDrawable(j6.v0(j6.a7, e6Var)), j6.U0(context, i10, j6.v0(i11, e6Var)), 0, 0);
        pqVar.w = true;
        setBackground(pqVar);
    }
}
