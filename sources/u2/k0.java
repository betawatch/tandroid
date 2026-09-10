package u2;

import android.graphics.Point;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.yh0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.eo;
import org.telegram.ui.nj0;
import org.telegram.ui.web.y1;
import wh.m2;
import xh.a8;
import xh.b4;
import xh.n5;
import xh.r8;
import xh.s5;
import xh.u5;
import xh.v5;
import xh.x3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wc a02;
        int i10;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.TL_messageReactions tL_messageReactions2;
        int i12 = this.a;
        int i13 = 2;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        int i14 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                ((e2.h) obj2).accept(obj);
                break;
            case 1:
                ((w0) obj2).A((c3.b0) obj);
                break;
            case 2:
                ((y1) obj2).run((TLRPC.Chat) obj);
                break;
            case 3:
                vh.p pVar = (vh.p) obj2;
                g5 g5Var = (g5) obj;
                int i15 = pVar.k;
                p2 p2Var = pVar.g;
                TLRPC.TL_chatInviteImporter importer = g5Var.getImporter();
                pVar.r = importer;
                LongSparseArray longSparseArray = pVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    p2Var.getMessagesController().putUser(user, false);
                    Point point = AndroidUtilities.displaySize;
                    boolean z10 = point.x > point.y;
                    if (user.photo != null && !z10) {
                        if (pVar.s == null) {
                            vh.o oVar = new vh.o(pVar, p2Var.getParentActivity(), (vl0) g5Var.getParent(), p2Var.getResourceProvider(), pVar.a);
                            pVar.s = oVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = pVar.r;
                            w9 avatarImageView = g5Var.getAvatarImageView();
                            oVar.r = tL_chatInviteImporter;
                            oVar.v = avatarImageView;
                            TLRPC.User user2 = MessagesController.getInstance(i15).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i15, user2, 0);
                            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i15, user2, 1);
                            if (MessagesController.getInstance(i15).getUserFull(tL_chatInviteImporter.user_id) == null) {
                                MessagesController.getInstance(i15).loadUserInfo(user2, false, 0);
                            }
                            yh0 yh0Var = oVar.h;
                            yh0Var.setParentAvatarImage(avatarImageView);
                            yh0Var.M(tL_chatInviteImporter.user_id, true);
                            yh0Var.H(null, forUserOrChat, forUserOrChat2, true);
                            oVar.d.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            String str = tL_chatInviteImporter.about;
                            TextView textView = oVar.e;
                            textView.setText(str);
                            textView.setVisibility(TextUtils.isEmpty(tL_chatInviteImporter.about) ? 8 : 0);
                            oVar.y.requestLayout();
                            pVar.s.setOnDismissListener(new gg.o(pVar, 9));
                            pVar.s.show();
                            break;
                        }
                    } else {
                        pVar.b = true;
                        p2Var.dismissCurrentDialog();
                        Bundle bundle = new Bundle();
                        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                        bundle.putLong("user_id", user.id);
                        bundle.putBoolean("removeFragmentOnChatOpen", false);
                        p2Var.presentFragment(profileActivity);
                        break;
                    }
                }
                break;
            case 4:
                wh.b bVar = (wh.b) obj2;
                bVar.getClass();
                ((View.OnClickListener) obj).onClick(bVar);
                break;
            case 5:
                ((wh.b1) obj2).getBulletinFactory().d0((TLRPC.TL_error) obj, false);
                break;
            case 6:
                wh.h1 h1Var = (wh.h1) obj2;
                h1Var.getClass();
                if (!((TL_stars.SavedStarGift) obj).unsaved) {
                    h1Var.F.setVisibility(8);
                    break;
                }
                break;
            case 7:
                wr0 wr0Var = (wr0) obj2;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                wr0Var.h(tL_starGiftCollection.title, new nj0(15, wr0Var, tL_starGiftCollection));
                break;
            case 8:
                AndroidUtilities.addToClipboard((String) obj);
                wc.a0(((m2) obj2).a.a).k(false).j();
                break;
            case 9:
                xh.m mVar = (xh.m) obj2;
                TLObject tLObject = (TLObject) obj;
                int i16 = mVar.a;
                ArrayList arrayList2 = mVar.e;
                mVar.i = 0;
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    MessagesController.getInstance(i16).putUsers(connectedstarrefbots.users, false);
                    if (mVar.c <= 0) {
                        arrayList2.clear();
                    }
                    mVar.c = connectedstarrefbots.count;
                    arrayList2.addAll(connectedstarrefbots.connected_bots);
                    mVar.d = connectedstarrefbots.connected_bots.isEmpty() || arrayList2.size() >= mVar.c;
                } else {
                    mVar.h = true;
                    mVar.d = true;
                }
                mVar.g = false;
                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(mVar.b));
                break;
            case 10:
                xh.n nVar = (xh.n) obj2;
                TLObject tLObject2 = (TLObject) obj;
                int i17 = nVar.a;
                ArrayList arrayList3 = nVar.e;
                if (tLObject2 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject2;
                    MessagesController.getInstance(i17).putUsers(suggestedstarrefbots.users, false);
                    if (nVar.c <= 0) {
                        arrayList3.clear();
                    }
                    nVar.c = suggestedstarrefbots.count;
                    arrayList3.addAll(suggestedstarrefbots.suggested_bots);
                    nVar.j = suggestedstarrefbots.next_offset;
                    nVar.d = suggestedstarrefbots.suggested_bots.isEmpty() || arrayList3.size() >= nVar.c;
                } else {
                    nVar.i = true;
                    nVar.d = true;
                }
                nVar.h = false;
                NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(nVar.b));
                break;
            case 11:
                x3.U0((x3) obj2, (Long) obj);
                break;
            case 12:
                x3 x3Var = (x3) obj2;
                if (((v5) obj).e) {
                    x3Var.j0.setLoading(false);
                    x3Var.w1();
                    break;
                } else {
                    pc Q = x3Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.t = true;
                    Q.j();
                    break;
                }
            case 13:
                ((x3) obj2).getBulletinFactory().d0((TLRPC.TL_error) obj, false);
                break;
            case 14:
                MessagesController.getInstance(((x3) obj2).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) obj), false);
                break;
            case 15:
                x3 x3Var2 = (x3) obj2;
                x3Var2.getClass();
                ((boolean[]) obj)[0] = true;
                x3Var2.j0.setLoading(false);
                x3Var2.w1();
                break;
            case 16:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                ((x3) obj2).getBulletinFactory().Q(R.raw.ic_delete, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftRemovedDescription, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                break;
            case 17:
                x3 x3Var3 = (x3) obj2;
                wc.a0((eo) obj).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(x3Var3.X))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new xh.b1(x3Var3, r3)).k(true);
                break;
            case 18:
                ((x3) obj2).n2((CharSequence) obj);
                break;
            case 19:
                x3.I0((x3) obj2, (TL_stars.TL_payments_uniqueStarGift) obj);
                break;
            case 20:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((d2) obj2).dismiss();
                p2 U = LaunchActivity.U();
                if (U != null) {
                    if (tL_error == null || !"STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        a02 = wc.a0(U);
                        i10 = R.raw.error;
                        i11 = R.string.UniqueGiftNotFound;
                    } else {
                        a02 = wc.a0(U);
                        i10 = R.raw.fire_on;
                        i11 = R.string.UniqueGiftNotFoundBurned;
                    }
                    a2.o(i11, a02, i10, 36);
                    break;
                }
                break;
            case 21:
                b4 b4Var = (b4) obj2;
                eo eoVar = (eo) obj;
                org.telegram.ui.Cells.a0 a0Var = b4Var.b;
                if (a0Var != null) {
                    try {
                        a0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    b4Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.a0 a0Var2 = b4Var.b;
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
                    u5 u5Var = v5.y(messageObject.currentAccount, false).B;
                    if (u5Var != null) {
                        u5Var.b();
                    }
                    TLRPC.ChatFull chatFull = eoVar.Z7;
                    MessageObject messageObject2 = messageObject;
                    r8 r8Var = new r8(b4Var.getContext(), eoVar.getCurrentAccount(), eoVar.a(), eoVar, messageObject2, arrayList4, chatFull == null || chatFull.paid_reactions_available, false, 0L, eoVar.getResourceProvider());
                    messageObject2.getId();
                    org.telegram.ui.Cells.a0 a0Var3 = b4Var.b;
                    r8Var.T = eoVar;
                    r8Var.U = a0Var3;
                    r8Var.show();
                    break;
                }
                break;
            case 22:
                TLObject tLObject3 = (TLObject) obj2;
                y1 y1Var = (y1) obj;
                if (tLObject3 instanceof TL_stars.StarGifts) {
                    y1Var.run((TL_stars.StarGifts) tLObject3);
                    break;
                } else {
                    y1Var.run(null);
                    break;
                }
            case 23:
                boolean[] zArr = (boolean[]) obj2;
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj;
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                    break;
                }
                break;
            case 24:
                n5 n5Var = (n5) obj2;
                TLObject tLObject4 = (TLObject) obj;
                ArrayList arrayList5 = n5Var.l;
                int i18 = n5Var.a;
                if (tLObject4 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject4;
                    MessagesController.getInstance(i18).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i18).putChats(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i19 = 0;
                        while (i19 < arrayList5.size() && ((TL_stars.SavedStarGift) arrayList5.get(i19)).pinned_to_top) {
                            i19++;
                        }
                        arrayList5.add(i19, savedStarGift);
                        NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(n5Var.b), n5Var);
                        break;
                    }
                }
                break;
            case 25:
                ((MessagesController) obj2).processUpdates((TLRPC.Updates) ((TLObject) obj), false);
                break;
            case 26:
                new wc(((h3[]) obj2)[0].topBulletinContainer, (f6) obj).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                break;
            case 27:
                r8 r8Var2 = (r8) obj2;
                r8Var2.R = true;
                r8Var2.o(new s5((u5) obj, i13));
                AndroidUtilities.runOnUIThread(new a8(r8Var2, i14), 240L);
                break;
            case 28:
                yg.s sVar = (yg.s) obj2;
                y5 y5Var = (y5) obj;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sVar.n.getText());
                for (y5 y5Var2 : (y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), y5.class)) {
                    if (y5Var2 == y5Var) {
                        int editTextSelectionEnd = sVar.n.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(y5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(y5Var2);
                        sVar.n.getText().delete(spanStart, spanEnd);
                        int i20 = spanEnd - spanStart;
                        yg.p pVar2 = sVar.n;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i20;
                        }
                        pVar2.setSelection(editTextSelectionEnd);
                        break;
                    }
                }
                break;
            default:
                yg.s sVar2 = (yg.s) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (sVar2.Q == null || !tL_error2.text.equals("BOOSTS_REQUIRED")) {
                    String str2 = tL_error2.text;
                    if (str2.equals("REACTIONS_TOO_MANY")) {
                        str2 = LocaleController.formatPluralString("ReactionMaxCountError", sVar2.J, new Object[0]);
                    }
                    wc.a0(sVar2).t(str2, null).j();
                    break;
                } else {
                    yg.r0.f(-sVar2.M, sVar2.R, sVar2.Q);
                    break;
                }
        }
    }

    public /* synthetic */ k0(v5 v5Var, boolean[] zArr, Utilities.Callback2 callback2) {
        this.a = 23;
        this.b = zArr;
        this.c = callback2;
    }
}
