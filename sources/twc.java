// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class twc implements Runnable {
    public final /* synthetic */ uc7 a;
    public final /* synthetic */ TLRPC.User[] b;
    public final /* synthetic */ double c;
    public final /* synthetic */ double d;
    public final /* synthetic */ int[] e;
    public final /* synthetic */ ConnectionsManager f;
    public final /* synthetic */ e52 h;
    public final /* synthetic */ String n;

    public /* synthetic */ twc(uc7 uc7Var, TLRPC.User[] userArr, double d, double d2, int[] iArr, ConnectionsManager connectionsManager, e52 e52Var, String str) {
        this.a = uc7Var;
        this.b = userArr;
        this.c = d;
        this.d = d2;
        this.e = iArr;
        this.f = connectionsManager;
        this.h = e52Var;
        this.n = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = this.a.q1(this.b[0]);
        tL_messages_getInlineBotResults.query = "";
        tL_messages_getInlineBotResults.offset = "";
        tL_messages_getInlineBotResults.flags |= 1;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
        final double d = this.c;
        tL_inputGeoPoint.lat = d;
        final double d2 = this.d;
        tL_inputGeoPoint._long = d2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        final int[] iArr = this.e;
        final e52 e52Var = this.h;
        final String str = this.n;
        iArr[0] = this.f.sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() { // from class: swc
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final int[] iArr2 = iArr;
                final e52 e52Var2 = e52Var;
                final double d3 = d;
                final double d4 = d2;
                final String str2 = str;
                hl.c3(new Runnable() { // from class: rwc
                    @Override // java.lang.Runnable
                    public final void run() {
                        iArr2[0] = 0;
                        TLObject tLObject2 = tLObject;
                        boolean z = tLObject2 instanceof TLRPC.messages_BotResults;
                        e52 e52Var3 = e52Var2;
                        if (z) {
                            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                            if (!messages_botresults.results.isEmpty()) {
                                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(0);
                                String str3 = botInlineResult.title;
                                try {
                                    float parseFloat = Float.parseFloat(botInlineResult.description);
                                    vwc vwcVar = new vwc();
                                    vwcVar.a = d3;
                                    vwcVar.b = d4;
                                    vwcVar.c = str3;
                                    vwcVar.d = parseFloat;
                                    wwc.a = str2;
                                    wwc.b = vwcVar;
                                    e52Var3.a(vwcVar);
                                    return;
                                } catch (Exception unused) {
                                    e52Var3.a(null);
                                    return;
                                }
                            }
                        }
                        e52Var3.a(null);
                    }
                });
            }
        });
    }
}
