package uh;

import ai.f5;
import android.graphics.Point;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import ii.q1;
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
import org.telegram.messenger.z0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.a0;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.z5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dt;
import org.telegram.ui.xn;
import wh.m;
import wh.n;
import xh.c1;
import xh.j1;
import xh.o2;
import yh.b1;
import yh.c4;
import yh.l;
import yh.l5;
import yh.o8;
import yh.q5;
import yh.s5;
import yh.t5;
import yh.x7;
import yh.y3;
import zg.o;
import zg.p;
import zg.q;
import zg.r0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xc a02;
        int i10;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.TL_messageReactions tL_messageReactions2;
        int i12 = this.a;
        int i13 = 2;
        int i14 = 8;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        int i15 = 1;
        int i16 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                j jVar = (j) obj2;
                jVar.b.add((String) obj);
                jVar.invalidate();
                break;
            case 1:
                ((q1) obj2).run((TLRPC.Chat) obj);
                break;
            case 2:
                n nVar = (n) obj2;
                g5 g5Var = (g5) obj;
                int i17 = nVar.k;
                n2 n2Var = nVar.g;
                TLRPC.TL_chatInviteImporter importer = g5Var.getImporter();
                nVar.r = importer;
                LongSparseArray longSparseArray = nVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    n2Var.getMessagesController().putUser(user, false);
                    Point point = AndroidUtilities.displaySize;
                    boolean z10 = point.x > point.y;
                    if (user.photo != null && !z10) {
                        if (nVar.s == null) {
                            m mVar = new m(nVar, n2Var.getParentActivity(), (ml0) g5Var.getParent(), n2Var.getResourceProvider(), nVar.a);
                            nVar.s = mVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = nVar.r;
                            w9 avatarImageView = g5Var.getAvatarImageView();
                            mVar.r = tL_chatInviteImporter;
                            mVar.v = avatarImageView;
                            TLRPC.User user2 = MessagesController.getInstance(i17).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i17, user2, 0);
                            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i17, user2, 1);
                            if (MessagesController.getInstance(i17).getUserFull(tL_chatInviteImporter.user_id) == null) {
                                MessagesController.getInstance(i17).loadUserInfo(user2, false, 0);
                            }
                            ph0 ph0Var = mVar.h;
                            ph0Var.setParentAvatarImage(avatarImageView);
                            ph0Var.M(tL_chatInviteImporter.user_id, true);
                            ph0Var.H(null, forUserOrChat, forUserOrChat2, true);
                            mVar.d.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            String str = tL_chatInviteImporter.about;
                            TextView textView = mVar.e;
                            textView.setText(str);
                            textView.setVisibility(TextUtils.isEmpty(tL_chatInviteImporter.about) ? 8 : 0);
                            mVar.y.requestLayout();
                            nVar.s.setOnDismissListener(new f5(nVar, 11));
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
            case 3:
                xh.b bVar = (xh.b) obj2;
                bVar.getClass();
                ((View.OnClickListener) obj).onClick(bVar);
                break;
            case 4:
                ((c1) obj2).getBulletinFactory().d0((TLRPC.TL_error) obj, false);
                break;
            case 5:
                j1 j1Var = (j1) obj2;
                j1Var.getClass();
                if (!((TL_stars.SavedStarGift) obj).unsaved) {
                    j1Var.F.setVisibility(8);
                    break;
                }
                break;
            case 6:
                nr0 nr0Var = (nr0) obj2;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                nr0Var.h(tL_starGiftCollection.title, new dt(24, nr0Var, tL_starGiftCollection));
                break;
            case 7:
                AndroidUtilities.addToClipboard((String) obj);
                xc.a0(((o2) obj2).a.a).k(false).j();
                break;
            case 8:
                l lVar = (l) obj2;
                TLObject tLObject = (TLObject) obj;
                int i18 = lVar.a;
                ArrayList arrayList2 = lVar.e;
                lVar.i = 0;
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    MessagesController.getInstance(i18).putUsers(connectedstarrefbots.users, false);
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
                NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(lVar.b));
                break;
            case 9:
                yh.m mVar2 = (yh.m) obj2;
                TLObject tLObject2 = (TLObject) obj;
                int i19 = mVar2.a;
                ArrayList arrayList3 = mVar2.e;
                if (tLObject2 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject2;
                    MessagesController.getInstance(i19).putUsers(suggestedstarrefbots.users, false);
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
                NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(mVar2.b));
                break;
            case 10:
                y3.U0((y3) obj2, (Long) obj);
                break;
            case 11:
                y3 y3Var = (y3) obj2;
                if (!((t5) obj).e) {
                    qc Q = y3Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.t = true;
                    Q.j();
                    break;
                } else {
                    y3Var.j0.setLoading(false);
                    y3Var.w1();
                    break;
                }
            case 12:
                ((y3) obj2).getBulletinFactory().d0((TLRPC.TL_error) obj, false);
                break;
            case 13:
                MessagesController.getInstance(((y3) obj2).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) obj), false);
                break;
            case 14:
                y3 y3Var2 = (y3) obj2;
                y3Var2.getClass();
                ((boolean[]) obj)[0] = true;
                y3Var2.j0.setLoading(false);
                y3Var2.w1();
                break;
            case 15:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                ((y3) obj2).getBulletinFactory().Q(R.raw.ic_delete, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftRemovedDescription, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                break;
            case 16:
                y3 y3Var3 = (y3) obj2;
                xc.a0((xn) obj).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(y3Var3.X))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new b1(y3Var3, i14)).k(true);
                break;
            case 17:
                ((y3) obj2).n2((CharSequence) obj);
                break;
            case 18:
                y3.I0((y3) obj2, (TL_stars.TL_payments_uniqueStarGift) obj);
                break;
            case 19:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((b2) obj2).dismiss();
                n2 U = LaunchActivity.U();
                if (U != null) {
                    if (tL_error == null || !"STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        a02 = xc.a0(U);
                        i10 = R.raw.error;
                        i11 = R.string.UniqueGiftNotFound;
                    } else {
                        a02 = xc.a0(U);
                        i10 = R.raw.fire_on;
                        i11 = R.string.UniqueGiftNotFoundBurned;
                    }
                    z0.o(i11, a02, i10, 36);
                    break;
                }
                break;
            case 20:
                c4 c4Var = (c4) obj2;
                xn xnVar = (xn) obj;
                a0 a0Var = c4Var.b;
                if (a0Var != null) {
                    try {
                        a0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    c4Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    a0 a0Var2 = c4Var.b;
                    if (a0Var2 instanceof t1) {
                        messageObject = ((t1) a0Var2).getPrimaryMessageObject();
                        if (messageObject != null) {
                            TLRPC.Message message = messageObject.messageOwner;
                            if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                                arrayList = tL_messageReactions2.top_reactors;
                            }
                        }
                    } else if ((a0Var2 instanceof w0) && (messageObject = ((w0) a0Var2).getMessageObject()) != null) {
                        TLRPC.Message message2 = messageObject.messageOwner;
                        if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                            arrayList = tL_messageReactions.top_reactors;
                        }
                    }
                    ArrayList<TLRPC.MessageReactor> arrayList4 = arrayList;
                    s5 s5Var = t5.y(messageObject.currentAccount, false).B;
                    if (s5Var != null) {
                        s5Var.b();
                    }
                    TLRPC.ChatFull chatFull = xnVar.Z7;
                    MessageObject messageObject2 = messageObject;
                    o8 o8Var = new o8(c4Var.getContext(), xnVar.getCurrentAccount(), xnVar.a(), xnVar, messageObject2, arrayList4, chatFull == null || chatFull.paid_reactions_available, false, 0L, xnVar.getResourceProvider());
                    messageObject2.getId();
                    a0 a0Var3 = c4Var.b;
                    o8Var.T = xnVar;
                    o8Var.U = a0Var3;
                    o8Var.show();
                    break;
                }
                break;
            case 21:
                TLObject tLObject3 = (TLObject) obj2;
                q1 q1Var = (q1) obj;
                if (!(tLObject3 instanceof TL_stars.StarGifts)) {
                    q1Var.run(null);
                    break;
                } else {
                    q1Var.run((TL_stars.StarGifts) tLObject3);
                    break;
                }
            case 22:
                boolean[] zArr = (boolean[]) obj2;
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj;
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                    break;
                }
                break;
            case 23:
                l5 l5Var = (l5) obj2;
                TLObject tLObject4 = (TLObject) obj;
                ArrayList arrayList5 = l5Var.l;
                int i20 = l5Var.a;
                if (tLObject4 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject4;
                    MessagesController.getInstance(i20).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i20).putChats(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i21 = 0;
                        while (i21 < arrayList5.size() && ((TL_stars.SavedStarGift) arrayList5.get(i21)).pinned_to_top) {
                            i21++;
                        }
                        arrayList5.add(i21, savedStarGift);
                        NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(l5Var.b), l5Var);
                        break;
                    }
                }
                break;
            case 24:
                ((MessagesController) obj2).processUpdates((TLRPC.Updates) ((TLObject) obj), false);
                break;
            case 25:
                new xc(((f3[]) obj2)[0].topBulletinContainer, (d6) obj).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                break;
            case 26:
                o8 o8Var2 = (o8) obj2;
                o8Var2.R = true;
                o8Var2.o(new q5((s5) obj, i13));
                AndroidUtilities.runOnUIThread(new x7(o8Var2, i15), 240L);
                break;
            case 27:
                q qVar = (q) obj2;
                z5 z5Var = (z5) obj;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qVar.n.getText());
                z5[] z5VarArr = (z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z5.class);
                int length = z5VarArr.length;
                while (i16 < length) {
                    z5 z5Var2 = z5VarArr[i16];
                    if (z5Var2 == z5Var) {
                        int editTextSelectionEnd = qVar.n.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(z5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(z5Var2);
                        qVar.n.getText().delete(spanStart, spanEnd);
                        int i22 = spanEnd - spanStart;
                        o oVar = qVar.n;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i22;
                        }
                        oVar.setSelection(editTextSelectionEnd);
                        break;
                    } else {
                        i16++;
                    }
                }
                break;
            case 28:
                q qVar2 = (q) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (qVar2.Q != null && tL_error2.text.equals("BOOSTS_REQUIRED")) {
                    r0.f(-qVar2.M, qVar2.R, qVar2.Q);
                    break;
                } else {
                    String str2 = tL_error2.text;
                    if (str2.equals("REACTIONS_TOO_MANY")) {
                        str2 = LocaleController.formatPluralString("ReactionMaxCountError", qVar2.J, new Object[0]);
                    }
                    xc.a0(qVar2).t(str2, null).j();
                    break;
                }
                break;
            default:
                z5 z5Var3 = (z5) obj;
                q qVar3 = ((p) obj2).e2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(qVar3.n.getText());
                z5[] z5VarArr2 = (z5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), z5.class);
                int length2 = z5VarArr2.length;
                while (i16 < length2) {
                    z5 z5Var4 = z5VarArr2[i16];
                    if (z5Var4 == z5Var3) {
                        int editTextSelectionEnd2 = qVar3.n.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(z5Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(z5Var4);
                        qVar3.n.getText().delete(spanStart2, spanEnd2);
                        int i23 = spanEnd2 - spanStart2;
                        o oVar2 = qVar3.n;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i23;
                        }
                        oVar2.setSelection(editTextSelectionEnd2);
                        break;
                    } else {
                        i16++;
                    }
                }
                break;
        }
    }

    public /* synthetic */ i(t5 t5Var, boolean[] zArr, Utilities.Callback2 callback2) {
        this.a = 22;
        this.b = zArr;
        this.c = callback2;
    }
}
