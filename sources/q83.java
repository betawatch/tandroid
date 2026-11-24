// default package

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class q83 extends taa {
    public final /* synthetic */ r83 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q83(r83 r83Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.U2 = r83Var;
    }

    @Override // taa
    public final void L0(vf6 vf6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (z) {
            gl.d3(new gu2(this, vf6Var, i), 250L);
        }
    }
}
