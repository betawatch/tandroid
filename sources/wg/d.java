package wg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import w7.a6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public class d extends c {
    public static final /* synthetic */ int v = 0;
    public int s;

    public d(Context context, c6 c6Var) {
        super(context, c6Var);
        this.d.setTypeface(AndroidUtilities.bold());
    }

    @Override // wg.c
    public boolean b() {
        return !(this instanceof e);
    }

    @Override // wg.c
    public void d() {
        this.c.setLayoutParams(a6.a(40.0f, 57.0f, 0.0f, 57.0f, 0.0f, 40, (LocaleController.isRTL ? 5 : 3) | 16));
        boolean z10 = LocaleController.isRTL;
        this.d.setLayoutParams(a6.a(-2.0f, z10 ? 20.0f : 109.0f, 0.0f, z10 ? 109.0f : 20.0f, 0.0f, -1, (z10 ? 5 : 3) | 16));
        boolean z11 = LocaleController.isRTL;
        this.e.setLayoutParams(a6.a(-2.0f, z11 ? 20.0f : 109.0f, 0.0f, z11 ? 109.0f : 20.0f, 0.0f, -1, (z11 ? 5 : 3) | 16));
        this.f.setLayoutParams(a6.a(22.0f, 16.0f, 0.0f, 15.0f, 0.0f, 22, (LocaleController.isRTL ? 5 : 3) | 16));
    }

    public int getSelectedType() {
        return this.s;
    }
}
