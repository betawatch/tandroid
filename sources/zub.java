// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class zub extends jr5 {
    public final /* synthetic */ long u2;
    public final /* synthetic */ bvb v2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zub(bvb bvbVar, Context context, int i, vf6 vf6Var, long j, d dVar, long j2) {
        super(context, i, vf6Var, j, dVar, null);
        this.v2 = bvbVar;
        this.u2 = j2;
    }

    @Override // jr5
    public final boolean M0() {
        TLRPC.Chat K0 = this.v2.b.getMessagesController().K0(Long.valueOf(this.u2));
        return K0 != null && hc2.y(3, K0);
    }
}
