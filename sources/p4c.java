// default package

import android.content.Context;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class p4c implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p4c(Object obj, long j, TLObject tLObject, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
        this.d = tLObject;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    @Override // pcc
    public final void a(Object obj) {
        ?? r0;
        byte b = this.a;
        boolean z = true;
        long j = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                a5c a5cVar = (a5c) obj3;
                r47 r47Var = (r47) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = r47Var.k;
                message.summaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                a5cVar.getMessagesStorage().U1(j, r47Var.k);
                jn7.f(a5cVar.currentAccount).k(jn7.M1, r47Var, Boolean.TRUE);
                break;
            case 1:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj3;
                Long l = (Long) obj;
                hl.r((b73) obj2);
                if (!dataSettingsActivity.W && System.currentTimeMillis() - j <= 120) {
                    z = false;
                }
                dataSettingsActivity.W = z;
                dataSettingsActivity.Y = l.longValue();
                dataSettingsActivity.X = false;
                if (dataSettingsActivity.a != null && (r0 = dataSettingsActivity.s) >= 0) {
                    dataSettingsActivity.r0(r0 == true ? 1 : 0);
                    break;
                }
                break;
            case 2:
                Runnable runnable = (Runnable) obj;
                ((id) obj2).q(150L);
                uj3 uj3Var = ((qi3) obj3).b;
                Boolean bool = uj3Var.H.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    uj3Var.getMessagesController().k(this.b, uj3Var.getMessagesController().X1(Long.valueOf(uj3Var.I)), null, uj3Var, false, runnable, new td(runnable, (byte) 12));
                    break;
                } else {
                    runnable.run();
                    break;
                }
                break;
            case 3:
                ov4 ov4Var = (ov4) obj3;
                ov4Var.d(j).c = (ArrayList) obj;
                ov4Var.f(j, (TL_payments.TL_StarGiftAuctionState) obj2);
                break;
            case 4:
                ((pcc) obj2).a(j == ((k35) obj3).l() ? (c35) obj : null);
                break;
            case 5:
                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) obj2;
                ((fd7) obj3).run();
                if (!((Boolean) obj).booleanValue()) {
                    vs7.g(j);
                    vs7.s(2131749512, tL_messageActionStarGiftOnchainOffer.gift);
                    break;
                }
                break;
            case 6:
                String str = (String) obj2;
                it7.v((TL_stars.TL_starGiftUnique) obj3, ((Boolean) obj).booleanValue() ? ob6.a0(null, null, 2131749504, str, it7.l(j)) : ob6.a0(null, null, 2131749581, str));
                break;
            case 7:
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) obj3).v2((Context) obj2, j, (TL_payments.connectedBotStarRef) obj);
                break;
            default:
                wua wuaVar = (wua) obj3;
                uc7 uc7Var = (uc7) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < uc7Var.k4.f2.f()) {
                    xg1 G0 = uc7Var.G0();
                    long j2 = this.b;
                    G0.b(j2, tL_premium_boostsStatus, new r4c((Object) wuaVar, (Object) tL_premium_boostsStatus, j2, (Object) uc7Var, (byte) 8));
                    break;
                } else {
                    wuaVar.f2.setLoading(false);
                    wuaVar.B2(true);
                    break;
                }
        }
    }

    public /* synthetic */ p4c(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }
}
