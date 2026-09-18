package vg;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;
import w7.x5;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class i extends c {
    public final k5 r;
    public Object s;

    public i(Context context, f6 f6Var) {
        super(context, f6Var);
        this.c.setVisibility(8);
        k5 k5Var = this.e;
        int i10 = j6.B6;
        k5Var.setTextColor(j6.v0(i10, f6Var));
        k5 k5Var2 = new k5(context);
        this.r = k5Var2;
        k5Var2.setTextSize(16);
        k5Var2.setTextColor(j6.v0(i10, f6Var));
        k5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(k5Var2);
        boolean z10 = LocaleController.isRTL;
        k5Var2.setLayoutParams(x5.d(-1, -2.0f, (z10 ? 3 : 5) | 16, z10 ? 20.0f : 0.0f, 0.0f, z10 ? 0.0f : 20.0f, 0.0f));
    }

    @Override // vg.c
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.s;
    }
}
