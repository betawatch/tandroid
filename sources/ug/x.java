package ug;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.wr;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class x extends m4 {
    public final o6 r;

    public x(Context context, f6 f6Var) {
        super(context, f6Var);
        o6 o6Var = new o6(context, true, true, true);
        this.r = o6Var;
        o6Var.b(0.45f, 240L, wr.h);
        o6Var.setGravity(LocaleController.isRTL ? 3 : 5);
        o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setTextColor(j6.v0(j6.L6, f6Var));
        addView(o6Var, a6.d(-2, 24.0f, (LocaleController.isRTL ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        setBackgroundColor(j6.v0(j6.h5, f6Var));
    }
}
