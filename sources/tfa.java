// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tfa extends tca {
    public final /* synthetic */ d U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfa(Context context, String str, String str2, ylb ylbVar, d dVar) {
        super(context, null, str, false, str2, false, ylbVar);
        this.U2 = dVar;
    }

    @Override // tca
    public final void L0(vh6 vh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        gm.d3(new v99(this.U2, vh6Var, i, (byte) 7), 100L);
    }
}
