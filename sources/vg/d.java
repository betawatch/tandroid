package vg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.e6;
import w7.x5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class d extends c {
    public static final /* synthetic */ int v = 0;
    public int s;

    public d(Context context, e6 e6Var) {
        super(context, e6Var);
        this.d.setTypeface(AndroidUtilities.bold());
    }

    @Override // vg.c
    public boolean b() {
        return !(this instanceof e);
    }

    @Override // vg.c
    public void d() {
        this.c.setLayoutParams(x5.a(40.0f, 57.0f, 0.0f, 57.0f, 0.0f, 40, (LocaleController.isRTL ? 5 : 3) | 16));
        boolean z10 = LocaleController.isRTL;
        this.d.setLayoutParams(x5.a(-2.0f, z10 ? 20.0f : 109.0f, 0.0f, z10 ? 109.0f : 20.0f, 0.0f, -1, (z10 ? 5 : 3) | 16));
        boolean z11 = LocaleController.isRTL;
        this.e.setLayoutParams(x5.a(-2.0f, z11 ? 20.0f : 109.0f, 0.0f, z11 ? 109.0f : 20.0f, 0.0f, -1, (z11 ? 5 : 3) | 16));
        this.f.setLayoutParams(x5.a(22.0f, 16.0f, 0.0f, 15.0f, 0.0f, 22, (LocaleController.isRTL ? 5 : 3) | 16));
    }

    public int getSelectedType() {
        return this.s;
    }
}
