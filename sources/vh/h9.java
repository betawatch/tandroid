package vh;

import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ll;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h9 implements Runnable {
    public final /* synthetic */ vp a;
    public final /* synthetic */ TLRPC.User[] b;
    public final /* synthetic */ double c;
    public final /* synthetic */ double d;
    public final /* synthetic */ int[] e;
    public final /* synthetic */ ConnectionsManager f;
    public final /* synthetic */ ll h;
    public final /* synthetic */ String n;

    public /* synthetic */ h9(vp vpVar, TLRPC.User[] userArr, double d, double d10, int[] iArr, ConnectionsManager connectionsManager, ll llVar, String str) {
        this.a = vpVar;
        this.b = userArr;
        this.c = d;
        this.d = d10;
        this.e = iArr;
        this.f = connectionsManager;
        this.h = llVar;
        this.n = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = this.a.p1(this.b[0]);
        tL_messages_getInlineBotResults.query = "";
        tL_messages_getInlineBotResults.offset = "";
        tL_messages_getInlineBotResults.flags |= 1;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
        final double d = this.c;
        tL_inputGeoPoint.lat = d;
        final double d10 = this.d;
        tL_inputGeoPoint._long = d10;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        final int[] iArr = this.e;
        final ll llVar = this.h;
        final String str = this.n;
        iArr[0] = this.f.sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() { // from class: vh.g9
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final int[] iArr2 = iArr;
                final ll llVar2 = llVar;
                final double d11 = d;
                final double d12 = d10;
                final String str2 = str;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: vh.f9
                    @Override // java.lang.Runnable
                    public final void run() {
                        iArr2[0] = 0;
                        TLObject tLObject2 = tLObject;
                        boolean z10 = tLObject2 instanceof TLRPC.messages_BotResults;
                        ll llVar3 = llVar2;
                        if (z10) {
                            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                            if (!messages_botresults.results.isEmpty()) {
                                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(0);
                                String str3 = botInlineResult.title;
                                try {
                                    float parseFloat = Float.parseFloat(botInlineResult.description);
                                    k9 k9Var = new k9();
                                    k9Var.a = d11;
                                    k9Var.b = d12;
                                    k9Var.c = str3;
                                    k9Var.d = parseFloat;
                                    l9.a = str2;
                                    l9.b = k9Var;
                                    llVar3.a(k9Var);
                                    return;
                                } catch (Exception unused) {
                                    llVar3.a(null);
                                    return;
                                }
                            }
                        }
                        llVar3.a(null);
                    }
                });
            }
        });
    }
}
