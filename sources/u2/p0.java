package u2;

import ai.f5;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.zh0;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bt;
import org.telegram.ui.wn;
import xh.o2;
import yh.b4;
import yh.k5;
import yh.o8;
import yh.r5;
import yh.s5;
import yh.x3;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Document document;
        TLRPC.Document document2;
        File pathToAttach;
        xc a02;
        int i10;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.TL_messageReactions tL_messageReactions2;
        int i12 = 8;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        int i13 = 3;
        switch (this.a) {
            case 0:
                ((u0) this.b).A((c3.b0) this.c);
                break;
            case 1:
                uf.c cVar = (uf.c) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    if (tLObject instanceof TL_account.TL_savedRingtonesNotModified) {
                        cVar.f(true);
                    } else if (tLObject instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject;
                        ArrayList<TLRPC.Document> arrayList2 = tL_savedRingtones.ringtones;
                        ArrayList arrayList3 = cVar.e;
                        if (!cVar.f) {
                            cVar.f(false);
                            cVar.f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList3.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj = arrayList3.get(i14);
                            i14++;
                            uf.b bVar = (uf.b) obj;
                            if (bVar.b != null && (document = bVar.a) != null) {
                                hashMap.put(Long.valueOf(document.id), bVar.b);
                            }
                        }
                        arrayList3.clear();
                        SharedPreferences d = cVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt(NotificationBadge.NewHtcHomeBadger.COUNT, arrayList2.size());
                        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                            TLRPC.Document document3 = arrayList2.get(i15);
                            String str = (String) hashMap.get(Long.valueOf(document3.id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i15, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i15, str);
                            }
                            uf.b bVar2 = new uf.b();
                            bVar2.a = document3;
                            bVar2.b = str;
                            int i16 = cVar.d;
                            cVar.d = i16 + 1;
                            bVar2.c = i16;
                            arrayList3.add(bVar2);
                        }
                        edit.apply();
                        NotificationCenter.getInstance(cVar.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        SharedPreferences.Editor edit2 = cVar.d().edit();
                        long j3 = tL_savedRingtones.hash;
                        uf.c.g = j3;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j3);
                        long currentTimeMillis = System.currentTimeMillis();
                        uf.c.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    cVar.b();
                    break;
                }
                break;
            case 2:
                uf.c cVar2 = (uf.c) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                    uf.b bVar3 = (uf.b) arrayList4.get(i17);
                    if (bVar3 != null && ((TextUtils.isEmpty(bVar3.b) || !new File(bVar3.b).exists()) && (document2 = bVar3.a) != null && ((pathToAttach = FileLoader.getInstance(cVar2.c).getPathToAttach(document2)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new p0(i13, cVar2, document2));
                    }
                }
                break;
            case 3:
                uf.c cVar3 = (uf.c) this.b;
                TLRPC.Document document4 = (TLRPC.Document) this.c;
                FileLoader.getInstance(cVar3.c).loadFile(document4, document4, 0, 0);
                break;
            case 4:
                uf.d dVar = (uf.d) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                int i18 = dVar.a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(i18).ringtoneDurationMax)));
                    break;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(i18).ringtoneSizeMax / 1024)));
                    break;
                } else {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat));
                    break;
                }
            case 5:
                uh.i iVar = (uh.i) this.b;
                iVar.b.add((String) this.c);
                iVar.invalidate();
                break;
            case 6:
                ((ii.q1) this.b).run((TLRPC.Chat) this.c);
                break;
            case 7:
                wh.n nVar = (wh.n) this.b;
                g5 g5Var = (g5) this.c;
                int i19 = nVar.k;
                m2 m2Var = nVar.g;
                TLRPC.TL_chatInviteImporter importer = g5Var.getImporter();
                nVar.r = importer;
                LongSparseArray longSparseArray = nVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    m2Var.getMessagesController().putUser(user, false);
                    Point point = AndroidUtilities.displaySize;
                    boolean z10 = point.x > point.y;
                    if (user.photo != null && !z10) {
                        if (nVar.s == null) {
                            wh.m mVar = new wh.m(nVar, m2Var.getParentActivity(), (wl0) g5Var.getParent(), m2Var.getResourceProvider(), nVar.a);
                            nVar.s = mVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = nVar.r;
                            w9 avatarImageView = g5Var.getAvatarImageView();
                            TextView textView = mVar.e;
                            zh0 zh0Var = mVar.h;
                            mVar.r = tL_chatInviteImporter;
                            mVar.v = avatarImageView;
                            TLRPC.User user2 = MessagesController.getInstance(i19).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i19, user2, 0);
                            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i19, user2, 1);
                            if (MessagesController.getInstance(i19).getUserFull(tL_chatInviteImporter.user_id) == null) {
                                MessagesController.getInstance(i19).loadUserInfo(user2, false, 0);
                            }
                            zh0Var.setParentAvatarImage(avatarImageView);
                            zh0Var.M(tL_chatInviteImporter.user_id, true);
                            zh0Var.H(null, forUserOrChat, forUserOrChat2, true);
                            mVar.d.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            textView.setText(tL_chatInviteImporter.about);
                            textView.setVisibility(TextUtils.isEmpty(tL_chatInviteImporter.about) ? 8 : 0);
                            mVar.y.requestLayout();
                            nVar.s.setOnDismissListener(new f5(nVar, 11));
                            nVar.s.show();
                            break;
                        }
                    } else {
                        nVar.b = true;
                        m2Var.dismissCurrentDialog();
                        Bundle bundle = new Bundle();
                        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                        bundle.putLong("user_id", user.id);
                        bundle.putBoolean("removeFragmentOnChatOpen", false);
                        m2Var.presentFragment(profileActivity);
                        break;
                    }
                }
                break;
            case 8:
                xh.b bVar4 = (xh.b) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                bVar4.getClass();
                onClickListener.onClick(bVar4);
                break;
            case 9:
                ((xh.c1) this.b).getBulletinFactory().d0((TLRPC.TL_error) this.c, false);
                break;
            case 10:
                xh.j1 j1Var = (xh.j1) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                j1Var.getClass();
                if (!savedStarGift.unsaved) {
                    j1Var.F.setVisibility(8);
                    break;
                }
                break;
            case 11:
                zr0 zr0Var = (zr0) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c;
                zr0Var.h(tL_starGiftCollection.title, new bt(24, zr0Var, tL_starGiftCollection));
                break;
            case 12:
                o2 o2Var = (o2) this.b;
                AndroidUtilities.addToClipboard((String) this.c);
                xc.a0(o2Var.a.a).k(false).j();
                break;
            case 13:
                yh.l lVar = (yh.l) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                int i20 = lVar.a;
                ArrayList arrayList5 = lVar.e;
                lVar.i = 0;
                if (tLObject2 instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject2;
                    MessagesController.getInstance(i20).putUsers(connectedstarrefbots.users, false);
                    if (lVar.c <= 0) {
                        arrayList5.clear();
                    }
                    lVar.c = connectedstarrefbots.count;
                    arrayList5.addAll(connectedstarrefbots.connected_bots);
                    lVar.d = connectedstarrefbots.connected_bots.isEmpty() || arrayList5.size() >= lVar.c;
                } else {
                    lVar.h = true;
                    lVar.d = true;
                }
                lVar.g = false;
                NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(lVar.b));
                break;
            case 14:
                yh.m mVar2 = (yh.m) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                int i21 = mVar2.a;
                ArrayList arrayList6 = mVar2.e;
                if (tLObject3 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject3;
                    MessagesController.getInstance(i21).putUsers(suggestedstarrefbots.users, false);
                    if (mVar2.c <= 0) {
                        arrayList6.clear();
                    }
                    mVar2.c = suggestedstarrefbots.count;
                    arrayList6.addAll(suggestedstarrefbots.suggested_bots);
                    mVar2.j = suggestedstarrefbots.next_offset;
                    mVar2.d = suggestedstarrefbots.suggested_bots.isEmpty() || arrayList6.size() >= mVar2.c;
                } else {
                    mVar2.i = true;
                    mVar2.d = true;
                }
                mVar2.h = false;
                NotificationCenter.getInstance(i21).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(mVar2.b));
                break;
            case 15:
                x3.U0((x3) this.b, (Long) this.c);
                break;
            case 16:
                x3 x3Var = (x3) this.b;
                if (((s5) this.c).e) {
                    x3Var.j0.setLoading(false);
                    x3Var.w1();
                    break;
                } else {
                    qc Q = x3Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.t = true;
                    Q.j();
                    break;
                }
            case 17:
                ((x3) this.b).getBulletinFactory().d0((TLRPC.TL_error) this.c, false);
                break;
            case 18:
                MessagesController.getInstance(((x3) this.b).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) this.c), false);
                break;
            case 19:
                x3 x3Var2 = (x3) this.b;
                boolean[] zArr = (boolean[]) this.c;
                x3Var2.getClass();
                zArr[0] = true;
                x3Var2.j0.setLoading(false);
                x3Var2.w1();
                break;
            case 20:
                x3 x3Var3 = (x3) this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.c;
                x3Var3.getBulletinFactory().Q(R.raw.ic_delete, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftRemovedDescription, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                break;
            case 21:
                x3 x3Var4 = (x3) this.b;
                xc.a0((wn) this.c).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(x3Var4.X))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new yh.b1(x3Var4, i12)).k(true);
                break;
            case 22:
                ((x3) this.b).n2((CharSequence) this.c);
                break;
            case 23:
                x3.I0((x3) this.b, (TL_stars.TL_payments_uniqueStarGift) this.c);
                break;
            case 24:
                a2 a2Var = (a2) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                a2Var.dismiss();
                m2 U = LaunchActivity.U();
                if (U != null) {
                    if (tL_error2 == null || !"STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error2.text)) {
                        a02 = xc.a0(U);
                        i10 = R.raw.error;
                        i11 = R.string.UniqueGiftNotFound;
                    } else {
                        a02 = xc.a0(U);
                        i10 = R.raw.fire_on;
                        i11 = R.string.UniqueGiftNotFoundBurned;
                    }
                    org.telegram.messenger.f0.p(i11, a02, i10, 36);
                    break;
                }
                break;
            case 25:
                b4 b4Var = (b4) this.b;
                wn wnVar = (wn) this.c;
                org.telegram.ui.Cells.a0 a0Var = b4Var.b;
                if (a0Var != null) {
                    try {
                        a0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    b4Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.a0 a0Var2 = b4Var.b;
                    if (a0Var2 instanceof u1) {
                        messageObject = ((u1) a0Var2).getPrimaryMessageObject();
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
                    ArrayList<TLRPC.MessageReactor> arrayList7 = arrayList;
                    r5 r5Var = s5.y(messageObject2.currentAccount, false).B;
                    if (r5Var != null) {
                        r5Var.b();
                    }
                    TLRPC.ChatFull chatFull = wnVar.Z7;
                    o8 o8Var = new o8(b4Var.getContext(), wnVar.getCurrentAccount(), wnVar.a(), wnVar, messageObject2, arrayList7, chatFull == null || chatFull.paid_reactions_available, false, 0L, wnVar.getResourceProvider());
                    messageObject2.getId();
                    org.telegram.ui.Cells.a0 a0Var3 = b4Var.b;
                    o8Var.T = wnVar;
                    o8Var.U = a0Var3;
                    o8Var.show();
                    break;
                }
                break;
            case 26:
                TLObject tLObject4 = (TLObject) this.b;
                ii.q1 q1Var = (ii.q1) this.c;
                if (tLObject4 instanceof TL_stars.StarGifts) {
                    q1Var.run((TL_stars.StarGifts) tLObject4);
                    break;
                } else {
                    q1Var.run(null);
                    break;
                }
            case 27:
                boolean[] zArr2 = (boolean[]) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
                if (!zArr2[0]) {
                    callback2.run("cancelled", 0L);
                    zArr2[0] = true;
                    break;
                }
                break;
            case 28:
                k5 k5Var = (k5) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                ArrayList arrayList8 = k5Var.l;
                int i22 = k5Var.a;
                if (tLObject5 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject5;
                    MessagesController.getInstance(i22).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i22).putChats(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift2 = tL_payments_savedStarGifts.gifts.get(0);
                        int i23 = 0;
                        while (i23 < arrayList8.size() && ((TL_stars.SavedStarGift) arrayList8.get(i23)).pinned_to_top) {
                            i23++;
                        }
                        arrayList8.add(i23, savedStarGift2);
                        NotificationCenter.getInstance(i22).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(k5Var.b), k5Var);
                        break;
                    }
                }
                break;
            default:
                ((MessagesController) this.b).processUpdates((TLRPC.Updates) ((TLObject) this.c), false);
                break;
        }
    }

    public /* synthetic */ p0(s5 s5Var, boolean[] zArr, Utilities.Callback2 callback2) {
        this.a = 27;
        this.b = zArr;
        this.c = callback2;
    }
}
