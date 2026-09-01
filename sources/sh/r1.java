package sh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r1 implements l3, GenericProvider, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ p2 a;

    public /* synthetic */ r1(p2 p2Var) {
        this.a = p2Var;
    }

    @Override // sh.l3
    public void g(boolean z4) {
        p2 p2Var = this.a;
        if (p2Var.a0 && z4) {
            return;
        }
        p2Var.k(true);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.a.k(false);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Boolean.valueOf(this.a.e.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }
}
