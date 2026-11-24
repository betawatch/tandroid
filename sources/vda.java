// default package

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class vda extends uu1 {
    public final /* synthetic */ nfa f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vda(nfa nfaVar, Context context, ui5 ui5Var, Bundle bundle) {
        super(context, ui5Var, bundle);
        this.f = nfaVar;
    }

    @Override // uu1
    public final void b(boolean z) {
        r7 r7Var = this.f.q0;
        if (r7Var != null) {
            r7Var.setShowSearchProgress(z);
        }
    }
}
