package xg;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class i extends c {
    public final b6 s;
    public Object v;

    public i(Context context, u6 u6Var) {
        super(context, u6Var);
        this.c.setVisibility(8);
        b6 b6Var = this.e;
        int i10 = y6.B6;
        f7.Y(b6Var, i10, u6Var);
        b6 b6Var2 = new b6(context);
        this.s = b6Var2;
        b6Var2.setTextSize(16);
        f7.Y(b6Var2, i10, u6Var);
        b6Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(b6Var2);
        boolean z10 = LocaleController.isRTL;
        b6Var2.setLayoutParams(gb1.h(-1, -2.0f, (z10 ? 3 : 5) | 16, z10 ? 20.0f : 0.0f, 0.0f, z10 ? 0.0f : 20.0f, 0.0f));
    }

    @Override // xg.c
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.v;
    }
}
