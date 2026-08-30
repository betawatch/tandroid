package rh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements m3, GenericProvider, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ q2 a;

    public /* synthetic */ s1(q2 q2Var) {
        this.a = q2Var;
    }

    @Override // rh.m3
    public void g(boolean z4) {
        q2 q2Var = this.a;
        if (q2Var.a0 && z4) {
            return;
        }
        q2Var.k(true);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.a.k(false);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Boolean.valueOf(this.a.e.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }
}
