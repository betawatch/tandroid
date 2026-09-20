package vg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.qr;
import w7.y5;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class x extends n4 {
    public final o6 r;

    public x(Context context, f6 f6Var) {
        super(context, f6Var);
        o6 o6Var = new o6(context, true, true, true);
        this.r = o6Var;
        o6Var.b(0.45f, 240L, qr.h);
        o6Var.setGravity(LocaleController.isRTL ? 3 : 5);
        o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setTextColor(j6.v0(j6.L6, f6Var));
        addView(o6Var, y5.d(-2, 24.0f, (LocaleController.isRTL ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        setBackgroundColor(j6.v0(j6.h5, f6Var));
    }
}
