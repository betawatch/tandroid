package u2;

import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import ii.q1;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.ti0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.z6;
import org.telegram.ui.zn;
import xh.o2;
import yh.e5;
import yh.h8;
import yh.l5;
import yh.m5;
import yh.s3;
import yh.w3;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        ad a02;
        int i10;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.TL_messageReactions tL_messageReactions2;
        int i12 = 4;
        int i13 = 8;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        switch (this.a) {
            case 0:
                ((u0) this.b).x((c3.b0) this.c);
                break;
            case 1:
                uh.i iVar = (uh.i) this.b;
                iVar.b.add((String) this.c);
                iVar.invalidate();
                break;
            case 2:
                vf.c cVar = (vf.c) this.b;
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
                            vf.b bVar = (vf.b) obj;
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
                            vf.b bVar2 = new vf.b();
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
                        vf.c.g = j3;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j3);
                        long currentTimeMillis = System.currentTimeMillis();
                        vf.c.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    cVar.b();
                    break;
                }
                break;
            case 3:
                vf.c cVar2 = (vf.c) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                    vf.b bVar3 = (vf.b) arrayList4.get(i17);
                    if (bVar3 != null && ((TextUtils.isEmpty(bVar3.b) || !new File(bVar3.b).exists()) && (document2 = bVar3.a) != null && ((pathToAttach = FileLoader.getInstance(cVar2.c).getPathToAttach(document2)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new p0(i12, cVar2, document2));
                    }
                }
                break;
            case 4:
                vf.c cVar3 = (vf.c) this.b;
                TLRPC.Document document4 = (TLRPC.Document) this.c;
                FileLoader.getInstance(cVar3.c).loadFile(document4, document4, 0, 0);
                break;
            case 5:
                vf.d dVar = (vf.d) this.b;
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
            case 6:
                ((q1) this.b).run((TLRPC.Chat) this.c);
                break;
            case 7:
                wh.l lVar = (wh.l) this.b;
                g5 g5Var = (g5) this.c;
                int i19 = lVar.k;
                n2 n2Var = lVar.g;
                TLRPC.TL_chatInviteImporter importer = g5Var.getImporter();
                lVar.r = importer;
                LongSparseArray longSparseArray = lVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    n2Var.getMessagesController().putUser(user, false);
                    Point point = AndroidUtilities.displaySize;
                    boolean z10 = point.x > point.y;
                    if (user.photo != null && !z10) {
                        if (lVar.s == null) {
                            wh.k kVar = new wh.k(lVar, n2Var.getParentActivity(), (qm0) g5Var.getParent(), n2Var.getResourceProvider(), lVar.a);
                            lVar.s = kVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = lVar.r;
                            y9 avatarImageView = g5Var.getAvatarImageView();
                            TextView textView = kVar.e;
                            ti0 ti0Var = kVar.h;
                            kVar.r = tL_chatInviteImporter;
                            kVar.v = avatarImageView;
                            TLRPC.User user2 = MessagesController.getInstance(i19).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i19, user2, 0);
                            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i19, user2, 1);
                            if (MessagesController.getInstance(i19).getUserFull(tL_chatInviteImporter.user_id) == null) {
                                MessagesController.getInstance(i19).loadUserInfo(user2, false, 0);
                            }
                            ti0Var.setParentAvatarImage(avatarImageView);
                            ti0Var.M(tL_chatInviteImporter.user_id, true);
                            ti0Var.H(null, forUserOrChat, forUserOrChat2, true);
                            kVar.d.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            textView.setText(tL_chatInviteImporter.about);
                            textView.setVisibility(TextUtils.isEmpty(tL_chatInviteImporter.about) ? 8 : 0);
                            kVar.y.requestLayout();
                            lVar.s.setOnDismissListener(new ai.g5(lVar, 11));
                            lVar.s.show();
                            break;
                        }
                    } else {
                        lVar.b = true;
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
            case 8:
                xh.c cVar4 = (xh.c) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                cVar4.getClass();
                onClickListener.onClick(cVar4);
                break;
            case 9:
                ((xh.d1) this.b).getBulletinFactory().f0((TLRPC.TL_error) this.c, false);
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
                rs0 rs0Var = (rs0) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c;
                rs0Var.h(tL_starGiftCollection.title, new z6(10, rs0Var, tL_starGiftCollection));
                break;
            case 12:
                o2 o2Var = (o2) this.b;
                AndroidUtilities.addToClipboard((String) this.c);
                ad.a0(o2Var.a.a).k(false).j();
                break;
            case 13:
                yh.l lVar2 = (yh.l) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                int i20 = lVar2.a;
                ArrayList arrayList5 = lVar2.e;
                lVar2.i = 0;
                if (tLObject2 instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject2;
                    MessagesController.getInstance(i20).putUsers(connectedstarrefbots.users, false);
                    if (lVar2.c <= 0) {
                        arrayList5.clear();
                    }
                    lVar2.c = connectedstarrefbots.count;
                    arrayList5.addAll(connectedstarrefbots.connected_bots);
                    lVar2.d = connectedstarrefbots.connected_bots.isEmpty() || arrayList5.size() >= lVar2.c;
                } else {
                    lVar2.h = true;
                    lVar2.d = true;
                }
                lVar2.g = false;
                NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(lVar2.b));
                break;
            case 14:
                yh.m mVar = (yh.m) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                int i21 = mVar.a;
                ArrayList arrayList6 = mVar.e;
                if (tLObject3 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject3;
                    MessagesController.getInstance(i21).putUsers(suggestedstarrefbots.users, false);
                    if (mVar.c <= 0) {
                        arrayList6.clear();
                    }
                    mVar.c = suggestedstarrefbots.count;
                    arrayList6.addAll(suggestedstarrefbots.suggested_bots);
                    mVar.j = suggestedstarrefbots.next_offset;
                    mVar.d = suggestedstarrefbots.suggested_bots.isEmpty() || arrayList6.size() >= mVar.c;
                } else {
                    mVar.i = true;
                    mVar.d = true;
                }
                mVar.h = false;
                NotificationCenter.getInstance(i21).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(mVar.b));
                break;
            case 15:
                s3.V0((s3) this.b, (Long) this.c);
                break;
            case 16:
                s3 s3Var = (s3) this.b;
                if (((m5) this.c).e) {
                    s3Var.k0.setLoading(false);
                    s3Var.x1();
                    break;
                } else {
                    tc Q = s3Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.t = true;
                    Q.j();
                    break;
                }
            case 17:
                ((s3) this.b).getBulletinFactory().f0((TLRPC.TL_error) this.c, false);
                break;
            case 18:
                MessagesController.getInstance(((s3) this.b).currentAccount).lambda$processUpdates$377((TLRPC.Updates) ((TLObject) this.c), false);
                break;
            case 19:
                s3 s3Var2 = (s3) this.b;
                boolean[] zArr = (boolean[]) this.c;
                s3Var2.getClass();
                zArr[0] = true;
                s3Var2.k0.setLoading(false);
                s3Var2.x1();
                break;
            case 20:
                s3 s3Var3 = (s3) this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.c;
                s3Var3.getBulletinFactory().Q(R.raw.ic_delete, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftRemovedDescription, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                break;
            case 21:
                s3 s3Var4 = (s3) this.b;
                ad.a0((zn) this.c).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(s3Var4.X))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new yh.a1(s3Var4, i13)).k(true);
                break;
            case 22:
                ((s3) this.b).p2((CharSequence) this.c);
                break;
            case 23:
                s3.J0((s3) this.b, (TL_stars.TL_payments_uniqueStarGift) this.c);
                break;
            case 24:
                b2 b2Var = (b2) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                b2Var.dismiss();
                n2 U = LaunchActivity.U();
                if (U != null) {
                    if (tL_error2 == null || !"STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error2.text)) {
                        a02 = ad.a0(U);
                        i10 = R.raw.error;
                        i11 = R.string.UniqueGiftNotFound;
                    } else {
                        a02 = ad.a0(U);
                        i10 = R.raw.fire_on;
                        i11 = R.string.UniqueGiftNotFoundBurned;
                    }
                    org.telegram.messenger.q.q(i11, a02, i10, 36);
                    break;
                }
                break;
            case 25:
                w3 w3Var = (w3) this.b;
                zn znVar = (zn) this.c;
                org.telegram.ui.Cells.a0 a0Var = w3Var.b;
                if (a0Var != null) {
                    try {
                        a0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    w3Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.a0 a0Var2 = w3Var.b;
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
                    l5 l5Var = m5.y(messageObject2.currentAccount, false).B;
                    if (l5Var != null) {
                        l5Var.b();
                    }
                    TLRPC.ChatFull chatFull = znVar.Z7;
                    h8 h8Var = new h8(w3Var.getContext(), znVar.getCurrentAccount(), znVar.a(), znVar, messageObject2, arrayList7, chatFull == null || chatFull.paid_reactions_available, false, 0L, znVar.getResourceProvider());
                    messageObject2.getId();
                    org.telegram.ui.Cells.a0 a0Var3 = w3Var.b;
                    h8Var.U = znVar;
                    h8Var.V = a0Var3;
                    h8Var.show();
                    break;
                }
                break;
            case 26:
                TLObject tLObject4 = (TLObject) this.b;
                q1 q1Var = (q1) this.c;
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
                e5 e5Var = (e5) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                ArrayList arrayList8 = e5Var.l;
                int i22 = e5Var.a;
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
                        NotificationCenter.getInstance(i22).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(e5Var.b), e5Var);
                        break;
                    }
                }
                break;
            default:
                ((MessagesController) this.b).lambda$processUpdates$377((TLRPC.Updates) ((TLObject) this.c), false);
                break;
        }
    }

    public /* synthetic */ p0(m5 m5Var, boolean[] zArr, Utilities.Callback2 callback2) {
        this.a = 27;
        this.b = zArr;
        this.c = callback2;
    }
}
