package wg;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Components.cr;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class d0 extends e9 {
    public final c6 v;

    public d0(Context context, c6 c6Var) {
        super(context, c6Var);
        this.v = c6Var;
    }

    public void setBackground(boolean z10) {
        Context context = getContext();
        int i10 = z10 ? R.drawable.greydivider_bottom : R.drawable.greydivider;
        int i11 = g6.b7;
        c6 c6Var = this.v;
        cr crVar = new cr(new ColorDrawable(g6.w0(g6.a7, c6Var)), g6.V0(context, i10, g6.w0(i11, c6Var)), 0, 0);
        crVar.w = true;
        setBackground(crVar);
    }
}
