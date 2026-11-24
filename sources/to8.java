// default package

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class to8 extends tca {
    public final /* synthetic */ uo8 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to8(uo8 uo8Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.U2 = uo8Var;
    }

    @Override // tca
    public final void L0(vh6 vh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (z) {
            gm.d3(new mn8(this, vh6Var, i, (byte) 12), 250L);
        }
    }
}
