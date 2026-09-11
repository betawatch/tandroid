package ug;

import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import bi.r4;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.w1;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.b2;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.co;
import org.telegram.ui.oj0;
import yh.m2;
import zh.a4;
import zh.j5;
import zh.n8;
import zh.r5;
import zh.s5;
import zh.w3;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yc a02;
        int i10;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.TL_messageReactions tL_messageReactions2;
        int i12 = this.a;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                ((w) obj2).run((TLRPC.TL_error) obj);
                break;
            case 1:
                ((oj0) obj2).run((ArrayList) obj);
                break;
            case 2:
                Utilities.Callback callback = (Utilities.Callback) obj;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) obj2).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new b2(callback, smallGroupsParticipantsCount, 1));
                    break;
                }
                break;
            case 3:
                qc M = yc.a0((co) obj2).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) obj).stars)), R.raw.stars_send);
                M.j = 5000;
                M.k(true);
                break;
            case 4:
                b0 b0Var = (b0) obj2;
                b0Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, b0Var.b0, Boolean.TRUE, (TL_stories.PrepaidGiveaway) obj);
                break;
            case 5:
                n1.P((n1) obj2, (TLObject) obj);
                break;
            case 6:
                vh.i iVar = (vh.i) obj2;
                iVar.b.add((String) obj);
                iVar.invalidate();
                break;
            case 7:
                ((org.telegram.ui.web.b1) obj2).run((TLRPC.Chat) obj);
                break;
            case 8:
                xh.n nVar = (xh.n) obj2;
                f5 f5Var = (f5) obj;
                int i13 = nVar.k;
                n2 n2Var = nVar.g;
                TLRPC.TL_chatInviteImporter importer = f5Var.getImporter();
                nVar.r = importer;
                LongSparseArray longSparseArray = nVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    n2Var.getMessagesController().putUser(user, false);
                    Point point = AndroidUtilities.displaySize;
                    boolean z10 = point.x > point.y;
                    if (user.photo != null && !z10) {
                        if (nVar.s == null) {
                            xh.m mVar = new xh.m(nVar, n2Var.getParentActivity(), (ll0) f5Var.getParent(), n2Var.getResourceProvider(), nVar.a);
                            nVar.s = mVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = nVar.r;
                            x9 avatarImageView = f5Var.getAvatarImageView();
                            mVar.r = tL_chatInviteImporter;
                            mVar.v = avatarImageView;
                            TLRPC.User user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i13, user2, 0);
                            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i13, user2, 1);
                            if (MessagesController.getInstance(i13).getUserFull(tL_chatInviteImporter.user_id) == null) {
                                MessagesController.getInstance(i13).loadUserInfo(user2, false, 0);
                            }
                            oh0 oh0Var = mVar.h;
                            oh0Var.setParentAvatarImage(avatarImageView);
                            oh0Var.M(tL_chatInviteImporter.user_id, true);
                            oh0Var.H(null, forUserOrChat, forUserOrChat2, true);
                            mVar.d.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            String str = tL_chatInviteImporter.about;
                            TextView textView = mVar.e;
                            textView.setText(str);
                            textView.setVisibility(TextUtils.isEmpty(tL_chatInviteImporter.about) ? 8 : 0);
                            mVar.y.requestLayout();
                            nVar.s.setOnDismissListener(new r4(nVar, 11));
                            nVar.s.show();
                            break;
                        }
                    } else {
                        nVar.b = true;
                        n2Var.dismissCurrentDialog();
                        Bundle bundle = new Bundle();
                        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                        bundle.putLong("user_id", user.id);
                        bundle.putBoolean("removeFragmentOnChatOpen", false);
                        n2Var.presentFragment(profileActivity);
                        break;
                    }
                }
                break;
            case 9:
                yh.b bVar = (yh.b) obj2;
                bVar.getClass();
                ((View.OnClickListener) obj).onClick(bVar);
                break;
            case 10:
                ((yh.b1) obj2).getBulletinFactory().d0((TLRPC.TL_error) obj, false);
                break;
            case 11:
                yh.h1 h1Var = (yh.h1) obj2;
                h1Var.getClass();
                if (!((TL_stars.SavedStarGift) obj).unsaved) {
                    h1Var.F.setVisibility(8);
                    break;
                }
                break;
            case 12:
                nr0 nr0Var = (nr0) obj2;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                nr0Var.h(tL_starGiftCollection.title, new oj0(15, nr0Var, tL_starGiftCollection));
                break;
            case 13:
                AndroidUtilities.addToClipboard((String) obj);
                yc.a0(((m2) obj2).a.a).k(false).j();
                break;
            case 14:
                zh.l lVar = (zh.l) obj2;
                TLObject tLObject = (TLObject) obj;
                int i14 = lVar.a;
                ArrayList arrayList2 = lVar.e;
                lVar.i = 0;
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    MessagesController.getInstance(i14).putUsers(connectedstarrefbots.users, false);
                    if (lVar.c <= 0) {
                        arrayList2.clear();
                    }
                    lVar.c = connectedstarrefbots.count;
                    arrayList2.addAll(connectedstarrefbots.connected_bots);
                    lVar.d = connectedstarrefbots.connected_bots.isEmpty() || arrayList2.size() >= lVar.c;
                } else {
                    lVar.h = true;
                    lVar.d = true;
                }
                lVar.g = false;
                NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(lVar.b));
                break;
            case 15:
                zh.m mVar2 = (zh.m) obj2;
                TLObject tLObject2 = (TLObject) obj;
                int i15 = mVar2.a;
                ArrayList arrayList3 = mVar2.e;
                if (tLObject2 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject2;
                    MessagesController.getInstance(i15).putUsers(suggestedstarrefbots.users, false);
                    if (mVar2.c <= 0) {
                        arrayList3.clear();
                    }
                    mVar2.c = suggestedstarrefbots.count;
                    arrayList3.addAll(suggestedstarrefbots.suggested_bots);
                    mVar2.j = suggestedstarrefbots.next_offset;
                    mVar2.d = suggestedstarrefbots.suggested_bots.isEmpty() || arrayList3.size() >= mVar2.c;
                } else {
                    mVar2.i = true;
                    mVar2.d = true;
                }
                mVar2.h = false;
                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(mVar2.b));
                break;
            case 16:
                w3.U0((w3) obj2, (Long) obj);
                break;
            case 17:
                w3 w3Var = (w3) obj2;
                if (!((s5) obj).e) {
                    qc Q = w3Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.t = true;
                    Q.j();
                    break;
                } else {
                    w3Var.j0.setLoading(false);
                    w3Var.w1();
                    break;
                }
            case 18:
                ((w3) obj2).getBulletinFactory().d0((TLRPC.TL_error) obj, false);
                break;
            case 19:
                MessagesController.getInstance(((w3) obj2).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) obj), false);
                break;
            case 20:
                w3 w3Var2 = (w3) obj2;
                w3Var2.getClass();
                ((boolean[]) obj)[0] = true;
                w3Var2.j0.setLoading(false);
                w3Var2.w1();
                break;
            case 21:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                ((w3) obj2).getBulletinFactory().Q(R.raw.ic_delete, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftRemovedDescription, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                break;
            case 22:
                w3 w3Var3 = (w3) obj2;
                yc.a0((co) obj).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(w3Var3.X))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new zh.b1(w3Var3, r3)).k(true);
                break;
            case 23:
                ((w3) obj2).n2((CharSequence) obj);
                break;
            case 24:
                w3.I0((w3) obj2, (TL_stars.TL_payments_uniqueStarGift) obj);
                break;
            case 25:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((org.telegram.ui.ActionBar.b2) obj2).dismiss();
                n2 U = LaunchActivity.U();
                if (U != null) {
                    if (tL_error == null || !"STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        a02 = yc.a0(U);
                        i10 = R.raw.error;
                        i11 = R.string.UniqueGiftNotFound;
                    } else {
                        a02 = yc.a0(U);
                        i10 = R.raw.fire_on;
                        i11 = R.string.UniqueGiftNotFoundBurned;
                    }
                    w1.o(i11, a02, i10, 36);
                    break;
                }
                break;
            case 26:
                a4 a4Var = (a4) obj2;
                co coVar = (co) obj;
                org.telegram.ui.Cells.a0 a0Var = a4Var.b;
                if (a0Var != null) {
                    try {
                        a0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    a4Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.a0 a0Var2 = a4Var.b;
                    if (a0Var2 instanceof t1) {
                        messageObject = ((t1) a0Var2).getPrimaryMessageObject();
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
                    ArrayList<TLRPC.MessageReactor> arrayList4 = arrayList;
                    r5 r5Var = s5.y(messageObject.currentAccount, false).B;
                    if (r5Var != null) {
                        r5Var.b();
                    }
                    TLRPC.ChatFull chatFull = coVar.Z7;
                    MessageObject messageObject2 = messageObject;
                    n8 n8Var = new n8(a4Var.getContext(), coVar.getCurrentAccount(), coVar.a(), coVar, messageObject2, arrayList4, chatFull == null || chatFull.paid_reactions_available, false, 0L, coVar.getResourceProvider());
                    messageObject2.getId();
                    org.telegram.ui.Cells.a0 a0Var3 = a4Var.b;
                    n8Var.T = coVar;
                    n8Var.U = a0Var3;
                    n8Var.show();
                    break;
                }
                break;
            case 27:
                TLObject tLObject3 = (TLObject) obj2;
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj;
                if (!(tLObject3 instanceof TL_stars.StarGifts)) {
                    b1Var.run(null);
                    break;
                } else {
                    b1Var.run((TL_stars.StarGifts) tLObject3);
                    break;
                }
            case 28:
                boolean[] zArr = (boolean[]) obj2;
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj;
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                    break;
                }
                break;
            default:
                j5 j5Var = (j5) obj2;
                TLObject tLObject4 = (TLObject) obj;
                ArrayList arrayList5 = j5Var.l;
                int i16 = j5Var.a;
                if (tLObject4 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject4;
                    MessagesController.getInstance(i16).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i16).putChats(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i17 = 0;
                        while (i17 < arrayList5.size() && ((TL_stars.SavedStarGift) arrayList5.get(i17)).pinned_to_top) {
                            i17++;
                        }
                        arrayList5.add(i17, savedStarGift);
                        NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(j5Var.b), j5Var);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ r(s5 s5Var, boolean[] zArr, Utilities.Callback2 callback2) {
        this.a = 28;
        this.b = zArr;
        this.c = callback2;
    }
}
