// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class uuc extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new uuc());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        vuc vucVar = (vuc) view;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) b8cVar.H;
        vucVar.getClass();
        TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
        if (tonconnectmanifest != null) {
            TLRPC.WebDocument webDocument = tonconnectmanifest.icon;
            if (webDocument != null) {
                vucVar.b.p(jn5.p(jxc.c(webDocument)), "28_28", null, tonconnectsession.manifest);
            }
            vucVar.c.setText(tonconnectsession.manifest.name);
            vucVar.d.setText(hl.J0(tonconnectsession.manifest.url, false));
        }
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new vuc(context, vnbVar);
    }
}
