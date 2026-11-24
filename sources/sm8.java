// default package

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
            gl.e3(new ll8(this, vf6Var, i, (byte) 10), 250L);
        }
    }
}
