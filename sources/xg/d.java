package xg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public class d extends c {
    public static final /* synthetic */ int v = 0;
    public int s;

    public d(Context context, u6 u6Var) {
        super(context, u6Var);
        this.d.setTypeface(AndroidUtilities.bold());
    }

    @Override // xg.c
    public boolean b() {
        return !(this instanceof e);
    }

    @Override // xg.c
    public void d() {
        this.c.setLayoutParams(kb1.h(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 16, 57.0f, 0.0f, 57.0f, 0.0f));
        boolean z10 = LocaleController.isRTL;
        this.d.setLayoutParams(kb1.h(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 20.0f : 109.0f, 0.0f, z10 ? 109.0f : 20.0f, 0.0f));
        boolean z11 = LocaleController.isRTL;
        this.e.setLayoutParams(kb1.h(-1, -2.0f, (z11 ? 5 : 3) | 16, z11 ? 20.0f : 109.0f, 0.0f, z11 ? 109.0f : 20.0f, 0.0f));
        this.f.setLayoutParams(kb1.h(22, 22.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 15.0f, 0.0f));
    }

    public int getSelectedType() {
        return this.s;
    }
}
