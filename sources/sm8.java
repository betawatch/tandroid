// default package

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class sm8 extends taa {
    public final /* synthetic */ tm8 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm8(tm8 tm8Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.U2 = tm8Var;
    }

    @Override // taa
    public final void L0(vf6 vf6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (z) {
            gl.d3(new ll8(this, vf6Var, i, (byte) 10), 250L);
        }
    }
}
