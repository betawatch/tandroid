// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class w16 extends ah8 {
    public final /* synthetic */ h26 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w16(h26 h26Var, Context context, wjb wjbVar) {
        super(wjbVar, context, true);
        this.S = h26Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.S.a2) {
            return;
        }
        super.invalidate();
    }
}
