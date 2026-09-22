package vg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import w7.y5;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public class d extends c {
    public static final /* synthetic */ int s = 0;
    public int r;

    public d(Context context, f6 f6Var) {
        super(context, f6Var);
        this.d.setTypeface(AndroidUtilities.bold());
    }

    @Override // vg.c
    public boolean b() {
        return !(this instanceof e);
    }

    @Override // vg.c
    public void d() {
        this.c.setLayoutParams(y5.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 16, 57.0f, 0.0f, 57.0f, 0.0f));
        boolean z10 = LocaleController.isRTL;
        this.d.setLayoutParams(y5.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 20.0f : 109.0f, 0.0f, z10 ? 109.0f : 20.0f, 0.0f));
        boolean z11 = LocaleController.isRTL;
        this.e.setLayoutParams(y5.d(-1, -2.0f, (z11 ? 5 : 3) | 16, z11 ? 20.0f : 109.0f, 0.0f, z11 ? 109.0f : 20.0f, 0.0f));
        this.f.setLayoutParams(y5.d(22, 22.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 15.0f, 0.0f));
    }

    public int getSelectedType() {
        return this.r;
    }
}
