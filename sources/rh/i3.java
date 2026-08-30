package rh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i3 implements org.telegram.ui.ActionBar.c2, m3, GenericProvider {
    public final /* synthetic */ o3 a;

    public /* synthetic */ i3(o3 o3Var) {
        this.a = o3Var;
    }

    @Override // rh.m3
    public void g(boolean z4) {
        o3 o3Var = this.a;
        if (o3Var.J()) {
            return;
        }
        o3Var.G.e(0.0f);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.a.b.dismiss();
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Boolean.valueOf(this.a.b.o1.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }
}
