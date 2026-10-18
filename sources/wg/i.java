package wg;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j5;
import w7.z5;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class i extends c {
    public final j5 s;
    public Object v;

    public i(Context context, d6 d6Var) {
        super(context, d6Var);
        this.c.setVisibility(8);
        j5 j5Var = this.e;
        int i10 = h6.B6;
        j5Var.setTextColor(h6.w0(i10, d6Var));
        j5 j5Var2 = new j5(context);
        this.s = j5Var2;
        j5Var2.setTextSize(16);
        j5Var2.setTextColor(h6.w0(i10, d6Var));
        j5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(j5Var2);
        boolean z10 = LocaleController.isRTL;
        j5Var2.setLayoutParams(z5.d(-1, -2.0f, (z10 ? 3 : 5) | 16, z10 ? 20.0f : 0.0f, 0.0f, z10 ? 0.0f : 20.0f, 0.0f));
    }

    @Override // wg.c
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.v;
    }
}
