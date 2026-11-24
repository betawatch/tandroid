// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class uda extends hfa {
    public final /* synthetic */ nfa h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uda(nfa nfaVar, Context context) {
        super(nfaVar, context);
        this.h = nfaVar;
    }

    @Override // w39
    public final void f() {
        super.f();
        nfa nfaVar = this.h;
        iea P = nfaVar.P(0);
        if (P == null || P.n.getVisibility() != 0) {
            return;
        }
        nfaVar.L.f();
    }
}
