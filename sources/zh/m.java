package zh;

import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fo;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zc a02;
        int i10;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.TL_messageReactions tL_messageReactions2;
        int i12 = this.a;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        int i13 = 2;
        int i14 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                n nVar = (n) obj2;
                TLObject tLObject = (TLObject) obj;
                int i15 = nVar.a;
                ArrayList arrayList2 = nVar.e;
                if (tLObject instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject;
                    MessagesController.getInstance(i15).putUsers(suggestedstarrefbots.users, false);
                    if (nVar.c <= 0) {
                        arrayList2.clear();
                    }
                    nVar.c = suggestedstarrefbots.count;
                    arrayList2.addAll(suggestedstarrefbots.suggested_bots);
                    nVar.j = suggestedstarrefbots.next_offset;
                    nVar.d = suggestedstarrefbots.suggested_bots.isEmpty() || arrayList2.size() >= nVar.c;
                } else {
                    nVar.i = true;
                    nVar.d = true;
                }
                nVar.h = false;
                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(nVar.b));
                break;
            case 1:
                r3.V0((r3) obj2, (Long) obj);
                break;
            case 2:
                r3 r3Var = (r3) obj2;
                if (!((n5) obj).e) {
                    sc Q = r3Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.t = true;
                    Q.j();
                    break;
                } else {
                    r3Var.k0.setLoading(false);
                    r3Var.x1();
                    break;
                }
            case 3:
                ((r3) obj2).getBulletinFactory().f0((TLRPC.TL_error) obj, false);
                break;
            case 4:
                MessagesController.getInstance(((r3) obj2).currentAccount).lambda$processUpdates$377((TLRPC.Updates) ((TLObject) obj), false);
                break;
            case 5:
                r3 r3Var2 = (r3) obj2;
                r3Var2.getClass();
                ((boolean[]) obj)[0] = true;
                r3Var2.k0.setLoading(false);
                r3Var2.x1();
                break;
            case 6:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                ((r3) obj2).getBulletinFactory().Q(R.raw.ic_delete, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftRemovedDescription, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                break;
            case 7:
                r3 r3Var3 = (r3) obj2;
                zc.a0((fo) obj).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(r3Var3.X))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new a1(r3Var3, 8)).k(true);
                break;
            case 8:
                ((r3) obj2).p2((CharSequence) obj);
                break;
            case 9:
                r3.J0((r3) obj2, (TL_stars.TL_payments_uniqueStarGift) obj);
                break;
            case 10:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((org.telegram.ui.ActionBar.a2) obj2).dismiss();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    if (tL_error == null || !"STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        a02 = zc.a0(U);
                        i10 = R.raw.error;
                        i11 = R.string.UniqueGiftNotFound;
                    } else {
                        a02 = zc.a0(U);
                        i10 = R.raw.fire_on;
                        i11 = R.string.UniqueGiftNotFoundBurned;
                    }
                    org.telegram.messenger.g0.q(i11, a02, i10, 36);
                    break;
                }
                break;
            case 11:
                v3 v3Var = (v3) obj2;
                fo foVar = (fo) obj;
                org.telegram.ui.Cells.a0 a0Var = v3Var.b;
                if (a0Var != null) {
                    try {
                        a0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    v3Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.a0 a0Var2 = v3Var.b;
                    if (a0Var2 instanceof org.telegram.ui.Cells.u1) {
                        messageObject = ((org.telegram.ui.Cells.u1) a0Var2).getPrimaryMessageObject();
                        if (messageObject != null) {
                            TLRPC.Message message = messageObject.messageOwner;
                            if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                                arrayList = tL_messageReactions2.top_reactors;
                            }
                        }
                    } else if ((a0Var2 instanceof org.telegram.ui.Cells.w0) && (messageObject = ((org.telegram.ui.Cells.w0) a0Var2).getMessageObject()) != null) {
                        TLRPC.Message message2 = messageObject.messageOwner;
                        if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                            arrayList = tL_messageReactions.top_reactors;
                        }
                    }
                    MessageObject messageObject2 = messageObject;
                    ArrayList<TLRPC.MessageReactor> arrayList3 = arrayList;
                    m5 m5Var = n5.y(messageObject2.currentAccount, false).B;
                    if (m5Var != null) {
                        m5Var.b();
                    }
                    TLRPC.ChatFull chatFull = foVar.Z7;
                    h8 h8Var = new h8(v3Var.getContext(), foVar.getCurrentAccount(), foVar.a(), foVar, messageObject2, arrayList3, chatFull == null || chatFull.paid_reactions_available, false, 0L, foVar.getResourceProvider());
                    messageObject2.getId();
                    org.telegram.ui.Cells.a0 a0Var3 = v3Var.b;
                    h8Var.U = foVar;
                    h8Var.V = a0Var3;
                    h8Var.show();
                    break;
                }
                break;
            case 12:
                TLObject tLObject2 = (TLObject) obj;
                ji.p1 p1Var = (ji.p1) obj2;
                if (!(tLObject2 instanceof TL_stars.StarGifts)) {
                    p1Var.run(null);
                    break;
                } else {
                    p1Var.run((TL_stars.StarGifts) tLObject2);
                    break;
                }
            case 13:
                boolean[] zArr = (boolean[]) obj2;
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj;
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                    break;
                }
                break;
            case 14:
                f5 f5Var = (f5) obj2;
                TLObject tLObject3 = (TLObject) obj;
                ArrayList arrayList4 = f5Var.l;
                int i16 = f5Var.a;
                if (tLObject3 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject3;
                    MessagesController.getInstance(i16).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i16).putChats(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i17 = 0;
                        while (i17 < arrayList4.size() && ((TL_stars.SavedStarGift) arrayList4.get(i17)).pinned_to_top) {
                            i17++;
                        }
                        arrayList4.add(i17, savedStarGift);
                        NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(f5Var.b), f5Var);
                        break;
                    }
                }
                break;
            case 15:
                ((MessagesController) obj2).lambda$processUpdates$377((TLRPC.Updates) ((TLObject) obj), false);
                break;
            case 16:
                new zc(((org.telegram.ui.ActionBar.e3[]) obj2)[0].topBulletinContainer, (org.telegram.ui.ActionBar.c6) obj).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                break;
            default:
                h8 h8Var2 = (h8) obj2;
                h8Var2.S = true;
                h8Var2.q(new k5((m5) obj, i13));
                AndroidUtilities.runOnUIThread(new q7(h8Var2, i14), 240L);
                break;
        }
    }

    public /* synthetic */ m(TLObject tLObject, ji.p1 p1Var) {
        this.a = 12;
        this.c = tLObject;
        this.b = p1Var;
    }

    public /* synthetic */ m(n5 n5Var, boolean[] zArr, Utilities.Callback2 callback2) {
        this.a = 13;
        this.b = zArr;
        this.c = callback2;
    }
}
