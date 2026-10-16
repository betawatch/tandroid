package wg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import w7.z5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
        this.c.setLayoutParams(z5.a(40.0f, 57.0f, 0.0f, 57.0f, 0.0f, 40, (LocaleController.isRTL ? 5 : 3) | 16));
        boolean z10 = LocaleController.isRTL;
        this.d.setLayoutParams(z5.a(-2.0f, z10 ? 20.0f : 109.0f, 0.0f, z10 ? 109.0f : 20.0f, 0.0f, -1, (z10 ? 5 : 3) | 16));
        boolean z11 = LocaleController.isRTL;
        this.e.setLayoutParams(z5.a(-2.0f, z11 ? 20.0f : 109.0f, 0.0f, z11 ? 109.0f : 20.0f, 0.0f, -1, (z11 ? 5 : 3) | 16));
        this.f.setLayoutParams(z5.a(22.0f, 16.0f, 0.0f, 15.0f, 0.0f, 22, (LocaleController.isRTL ? 5 : 3) | 16));
    }

    public int getSelectedType() {
        return this.s;
    }
}
