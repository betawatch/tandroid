package wg;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import w7.x5;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class i extends c {
    public final j5 r;
    public Object s;

    public i(Context context, f6 f6Var) {
        super(context, f6Var);
        this.c.setVisibility(8);
        j5 j5Var = this.e;
        int i10 = j6.B6;
        j5Var.setTextColor(j6.v0(i10, f6Var));
        j5 j5Var2 = new j5(context);
        this.r = j5Var2;
        j5Var2.setTextSize(16);
        j5Var2.setTextColor(j6.v0(i10, f6Var));
        j5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(j5Var2);
        boolean z10 = LocaleController.isRTL;
        j5Var2.setLayoutParams(x5.d(-1, -2.0f, (z10 ? 3 : 5) | 16, z10 ? 20.0f : 0.0f, 0.0f, z10 ? 0.0f : 20.0f, 0.0f));
    }

    @Override // wg.c
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.s;
    }
}
