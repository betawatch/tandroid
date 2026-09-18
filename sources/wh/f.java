package wh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.se;
import yh.a4;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f(n nVar, boolean z10, e eVar, String str, boolean z11) {
        this.d = nVar;
        this.b = z10;
        this.e = eVar;
        this.f = str;
        this.c = z11;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new se((n) this.d, this.b, (Runnable) this.e, (String) this.f, tL_error, tLObject, this.c));
                break;
            default:
                AndroidUtilities.runOnUIThread(new se((a4) this.d, tLObject, this.b, (TLRPC.Document) this.e, this.c, tL_error, (TL_stars.saveStarGift) this.f));
                break;
        }
    }

    public /* synthetic */ f(a4 a4Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = a4Var;
        this.b = z10;
        this.e = document;
        this.c = z11;
        this.f = savestargift;
    }
}
