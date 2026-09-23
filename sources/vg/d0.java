package vg;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.f9;
import org.telegram.ui.Components.qq;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class d0 extends f9 {
    public final d6 v;

    public d0(Context context, d6 d6Var) {
        super(context, d6Var);
        this.v = d6Var;
    }

    public void setBackground(boolean z10) {
        Context context = getContext();
        int i10 = z10 ? R.drawable.greydivider_bottom : R.drawable.greydivider;
        int i11 = h6.b7;
        d6 d6Var = this.v;
        qq qqVar = new qq(new ColorDrawable(h6.v0(h6.a7, d6Var)), h6.U0(context, i10, h6.v0(i11, d6Var)), 0, 0);
        qqVar.w = true;
        setBackground(qqVar);
    }
}
