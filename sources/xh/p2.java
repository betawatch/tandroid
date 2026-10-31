package xh;

import android.content.Context;
import android.location.Location;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class p2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z2.z0((z2) this.b, (Context) this.c, (TLRPC.User) this.d, (TL_payments.connectedBotStarRef) this.e);
                break;
            case 1:
                TLObject tLObject = (TLObject) this.b;
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.d;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.e;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    userFull.bot_can_manage_emoji_status = true;
                    if (!zArr[0]) {
                        zArr[0] = true;
                        oVar.a(Boolean.TRUE, "allowed");
                        break;
                    }
                } else if (!zArr[0]) {
                    zArr[0] = true;
                    oVar.a(Boolean.TRUE, "cancelled");
                    break;
                }
                break;
            case 2:
                zf.c cVar = (zf.c) this.b;
                Location location = (Location) this.c;
                String str = (String) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                ArrayList arrayList2 = cVar.r;
                cVar.n = false;
                if (location == null) {
                    cVar.F = 0;
                    cVar.h = false;
                    cVar.s.clear();
                    cVar.J = false;
                    cVar.y = str;
                }
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                cVar.f();
                break;
            default:
                zf.c cVar2 = (zf.c) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                String str2 = (String) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                ArrayList arrayList3 = cVar2.s;
                if (tL_error == null) {
                    cVar2.F = 0;
                    cVar2.h = false;
                    arrayList3.clear();
                    cVar2.J = false;
                    cVar2.y = str2;
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                    int size = messages_botresults.results.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i10);
                        if ("venue".equals(botInlineResult.type)) {
                            TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
                            if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) {
                                TLRPC.TL_botInlineMessageMediaVenue tL_botInlineMessageMediaVenue = (TLRPC.TL_botInlineMessageMediaVenue) botInlineMessage;
                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                tL_messageMediaVenue.geo = tL_botInlineMessageMediaVenue.geo;
                                tL_messageMediaVenue.address = tL_botInlineMessageMediaVenue.address;
                                tL_messageMediaVenue.title = tL_botInlineMessageMediaVenue.title;
                                tL_messageMediaVenue.icon = a1.g.r(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), tL_botInlineMessageMediaVenue.venue_type, "_64.png");
                                tL_messageMediaVenue.venue_type = tL_botInlineMessageMediaVenue.venue_type;
                                tL_messageMediaVenue.venue_id = tL_botInlineMessageMediaVenue.venue_id;
                                tL_messageMediaVenue.provider = tL_botInlineMessageMediaVenue.provider;
                                tL_messageMediaVenue.query_id = messages_botresults.query_id;
                                tL_messageMediaVenue.result_id = botInlineResult.id;
                                arrayList3.add(tL_messageMediaVenue);
                            }
                        }
                    }
                }
                zf.b bVar = cVar2.D;
                if (bVar != null) {
                    bVar.b(arrayList3);
                }
                cVar2.f();
                break;
        }
    }
}
