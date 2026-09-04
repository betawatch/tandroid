package wg;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Components.oq;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        oq oqVar = new oq(new ColorDrawable(j6.v0(j6.a7, f6Var)), j6.U0(context, i10, j6.v0(i11, f6Var)), 0, 0);
        oqVar.w = true;
        setBackground(oqVar);
    }
}
