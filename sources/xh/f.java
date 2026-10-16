package xh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ze;
import zh.r3;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f(l lVar, boolean z10, e eVar, String str, boolean z11) {
        this.d = lVar;
        this.b = z10;
        this.e = eVar;
        this.f = str;
        this.c = z11;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ze((l) this.d, this.b, (Runnable) this.e, (String) this.f, tL_error, tLObject, this.c));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ze((r3) this.d, tLObject, this.b, (TLRPC.Document) this.e, this.c, tL_error, (TL_stars.saveStarGift) this.f));
                break;
        }
    }

    public /* synthetic */ f(r3 r3Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = r3Var;
        this.b = z10;
        this.e = document;
        this.c = z11;
        this.f = savestargift;
    }
}
