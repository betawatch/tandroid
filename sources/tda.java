// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class tda extends taa {
    public final /* synthetic */ d U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tda(Context context, String str, String str2, wjb wjbVar, d dVar) {
        super(context, null, str, false, str2, false, wjbVar);
        this.U2 = dVar;
    }

    @Override // taa
    public final void L0(vf6 vf6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        gl.e3(new t79(this.U2, vf6Var, i, (byte) 7), 100L);
    }
}
