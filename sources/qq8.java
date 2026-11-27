// default package

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class qq8 extends n1a {
    public final /* synthetic */ d1a[] f2;
    public final /* synthetic */ ProfileActivity g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq8(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i, vnb vnbVar, int i2, d1a[] d1aVarArr) {
        super(profileActivity2, activity, true, num, i, true, vnbVar, i2);
        this.g2 = profileActivity;
        this.f2 = d1aVarArr;
    }

    @Override // n1a
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i = ((e) this.g2).currentAccount;
        return jxa.v(i, false).k(tL_starGiftUnique.id) == null || uc7.e1().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // n1a
    public final long getDialogId() {
        return this.g2.a();
    }

    @Override // n1a
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.EmojiStatus emojiStatus;
        int i;
        int i2;
        int i3;
        d1a[] d1aVarArr = this.f2;
        ProfileActivity profileActivity = this.g2;
        if (tL_starGiftUnique != null) {
            i = ((e) profileActivity).currentAccount;
            TL_stars.SavedStarGift k = jxa.v(i, false).k(tL_starGiftUnique.id);
            if (k != null && uc7.e1().getInt("statusgiftpage", 0) < 2) {
                uc7.e1().edit().putInt("statusgiftpage", uc7.e1().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i2 = ((e) profileActivity).currentAccount;
                i3 = ((e) profileActivity).currentAccount;
                wua wuaVar = new wua(context, i2, yac.h(i3).e(), profileActivity.A0, null);
                wuaVar.o2(k, null);
                wuaVar.t2();
                wuaVar.show();
                d1a d1aVar = d1aVarArr[0];
                if (d1aVar != null) {
                    profileActivity.T5 = null;
                    d1aVar.dismiss();
                    return;
                }
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.id;
            emojiStatus = tL_inputEmojiStatusCollectible;
            if (num != null) {
                tL_inputEmojiStatusCollectible.flags |= 1;
                tL_inputEmojiStatusCollectible.until = num.intValue();
                emojiStatus = tL_inputEmojiStatusCollectible;
            }
        } else if (l == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = l.longValue();
            emojiStatus = tL_emojiStatus;
            if (num != null) {
                tL_emojiStatus.flags |= 1;
                tL_emojiStatus.until = num.intValue();
                emojiStatus = tL_emojiStatus;
            }
        }
        profileActivity.F = tL_starGiftUnique != null ? Long.valueOf(tL_starGiftUnique.id) : null;
        uc7 messagesController = profileActivity.getMessagesController();
        TLRPC.Chat chat = profileActivity.F2;
        messagesController.u5(chat == null ? 0L : -chat.id, emojiStatus, tL_starGiftUnique);
        ul ulVar = profileActivity.G;
        if (ulVar != null) {
            if (l != null) {
                ulVar.j(l.longValue(), true);
            } else if (profileActivity.F2 == null) {
                ulVar.g(profileActivity.i2(), true);
            } else {
                ulVar.g(null, true);
            }
            profileActivity.G.m(tL_starGiftUnique != null, true);
        }
        if (l != null) {
            zm zmVar = profileActivity.e0;
            w49 w49Var = new w49();
            long longValue = l.longValue();
            w49Var.g = longValue;
            w49Var.h = longValue;
            zmVar.a(w49Var);
        }
        profileActivity.M3();
        profileActivity.O3();
        d1a d1aVar2 = d1aVarArr[0];
        if (d1aVar2 != null) {
            profileActivity.T5 = null;
            d1aVar2.dismiss();
        }
    }
}
