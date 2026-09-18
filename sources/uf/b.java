package uf;

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
import org.telegram.messenger.q;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.a0;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.zh0;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.nj0;
import org.telegram.ui.web.b1;
import org.telegram.ui.zn;
import uh.i;
import wh.m;
import wh.n;
import xh.c1;
import xh.j1;
import xh.o2;
import yh.c4;
import yh.l;
import yh.l5;
import yh.o8;
import yh.s5;
import yh.t5;
import yh.y3;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
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
        int i13 = 2;
        switch (this.a) {
            case 0:
                d dVar = (d) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    if (tLObject instanceof TL_account.TL_savedRingtonesNotModified) {
                        dVar.f(true);
                    } else if (tLObject instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject;
                        ArrayList<TLRPC.Document> arrayList2 = tL_savedRingtones.ringtones;
                        ArrayList arrayList3 = dVar.e;
                        if (!dVar.f) {
                            dVar.f(false);
                            dVar.f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList3.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj = arrayList3.get(i14);
                            i14++;
                            c cVar = (c) obj;
                            if (cVar.b != null && (document = cVar.a) != null) {
                                hashMap.put(Long.valueOf(document.id), cVar.b);
                            }
                        }
                        arrayList3.clear();
                        SharedPreferences d = dVar.d();
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
                            c cVar2 = new c();
                            cVar2.a = document3;
                            cVar2.b = str;
                            int i16 = dVar.d;
                            dVar.d = i16 + 1;
                            cVar2.c = i16;
                            arrayList3.add(cVar2);
                        }
                        edit.apply();
                        NotificationCenter.getInstance(dVar.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        SharedPreferences.Editor edit2 = dVar.d().edit();
                        long j3 = tL_savedRingtones.hash;
                        d.g = j3;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j3);
                        long currentTimeMillis = System.currentTimeMillis();
                        d.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    dVar.b();
                    break;
                }
                break;
            case 1:
                d dVar2 = (d) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                    c cVar3 = (c) arrayList4.get(i17);
                    if (cVar3 != null && ((TextUtils.isEmpty(cVar3.b) || !new File(cVar3.b).exists()) && (document2 = cVar3.a) != null && ((pathToAttach = FileLoader.getInstance(dVar2.c).getPathToAttach(document2)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new b(i13, dVar2, document2));
                    }
                }
                break;
            case 2:
                d dVar3 = (d) this.b;
                TLRPC.Document document4 = (TLRPC.Document) this.c;
                FileLoader.getInstance(dVar3.c).loadFile(document4, document4, 0, 0);
                break;
            case 3:
                e eVar = (e) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                int i18 = eVar.a;
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
            case 4:
                i iVar = (i) this.b;
                iVar.b.add((String) this.c);
                iVar.invalidate();
                break;
            case 5:
                ((b1) this.b).run((TLRPC.Chat) this.c);
                break;
            case 6:
                n nVar = (n) this.b;
                g5 g5Var = (g5) this.c;
                int i19 = nVar.k;
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
                            m mVar = new m(nVar, n2Var.getParentActivity(), (wl0) g5Var.getParent(), n2Var.getResourceProvider(), nVar.a);
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
                            nVar.s.setOnDismissListener(new ai.g5(nVar, 11));
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
            case 7:
                xh.b bVar = (xh.b) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                bVar.getClass();
                onClickListener.onClick(bVar);
                break;
            case 8:
                ((c1) this.b).getBulletinFactory().d0((TLRPC.TL_error) this.c, false);
                break;
            case 9:
                j1 j1Var = (j1) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                j1Var.getClass();
                if (!savedStarGift.unsaved) {
                    j1Var.F.setVisibility(8);
                    break;
                }
                break;
            case 10:
                zr0 zr0Var = (zr0) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c;
                zr0Var.h(tL_starGiftCollection.title, new nj0(15, zr0Var, tL_starGiftCollection));
                break;
            case 11:
                o2 o2Var = (o2) this.b;
                AndroidUtilities.addToClipboard((String) this.c);
                xc.a0(o2Var.a.a).k(false).j();
                break;
            case 12:
                l lVar = (l) this.b;
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
            case 13:
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
            case 14:
                y3.U0((y3) this.b, (Long) this.c);
                break;
            case 15:
                y3 y3Var = (y3) this.b;
                if (((t5) this.c).e) {
                    y3Var.j0.setLoading(false);
                    y3Var.w1();
                    break;
                } else {
                    qc Q = y3Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.t = true;
                    Q.j();
                    break;
                }
            case 16:
                ((y3) this.b).getBulletinFactory().d0((TLRPC.TL_error) this.c, false);
                break;
            case 17:
                MessagesController.getInstance(((y3) this.b).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) this.c), false);
                break;
            case 18:
                y3 y3Var2 = (y3) this.b;
                boolean[] zArr = (boolean[]) this.c;
                y3Var2.getClass();
                zArr[0] = true;
                y3Var2.j0.setLoading(false);
                y3Var2.w1();
                break;
            case 19:
                y3 y3Var3 = (y3) this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.c;
                y3Var3.getBulletinFactory().Q(R.raw.ic_delete, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftRemovedDescription, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                break;
            case 20:
                y3 y3Var4 = (y3) this.b;
                xc.a0((zn) this.c).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(y3Var4.X))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new yh.b1(y3Var4, i12)).k(true);
                break;
            case 21:
                ((y3) this.b).n2((CharSequence) this.c);
                break;
            case 22:
                y3.I0((y3) this.b, (TL_stars.TL_payments_uniqueStarGift) this.c);
                break;
            case 23:
                b2 b2Var = (b2) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                b2Var.dismiss();
                n2 U = LaunchActivity.U();
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
                    q.q(i11, a02, i10, 36);
                    break;
                }
                break;
            case 24:
                c4 c4Var = (c4) this.b;
                zn znVar = (zn) this.c;
                a0 a0Var = c4Var.b;
                if (a0Var != null) {
                    try {
                        a0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    c4Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    a0 a0Var2 = c4Var.b;
                    if (a0Var2 instanceof u1) {
                        messageObject = ((u1) a0Var2).getPrimaryMessageObject();
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
                    MessageObject messageObject2 = messageObject;
                    ArrayList<TLRPC.MessageReactor> arrayList7 = arrayList;
                    s5 s5Var = t5.y(messageObject2.currentAccount, false).B;
                    if (s5Var != null) {
                        s5Var.b();
                    }
                    TLRPC.ChatFull chatFull = znVar.Z7;
                    o8 o8Var = new o8(c4Var.getContext(), znVar.getCurrentAccount(), znVar.a(), znVar, messageObject2, arrayList7, chatFull == null || chatFull.paid_reactions_available, false, 0L, znVar.getResourceProvider());
                    messageObject2.getId();
                    a0 a0Var3 = c4Var.b;
                    o8Var.T = znVar;
                    o8Var.U = a0Var3;
                    o8Var.show();
                    break;
                }
                break;
            case 25:
                TLObject tLObject4 = (TLObject) this.c;
                b1 b1Var = (b1) this.b;
                if (tLObject4 instanceof TL_stars.StarGifts) {
                    b1Var.run((TL_stars.StarGifts) tLObject4);
                    break;
                } else {
                    b1Var.run(null);
                    break;
                }
            case 26:
                boolean[] zArr2 = (boolean[]) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
                if (!zArr2[0]) {
                    callback2.run("cancelled", 0L);
                    zArr2[0] = true;
                    break;
                }
                break;
            case 27:
                l5 l5Var = (l5) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                ArrayList arrayList8 = l5Var.l;
                int i22 = l5Var.a;
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
                        NotificationCenter.getInstance(i22).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(l5Var.b), l5Var);
                        break;
                    }
                }
                break;
            case 28:
                ((MessagesController) this.b).processUpdates((TLRPC.Updates) ((TLObject) this.c), false);
                break;
            default:
                new xc(((f3[]) this.b)[0].topBulletinContainer, (e6) this.c).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                break;
        }
    }

    public /* synthetic */ b(TLObject tLObject, b1 b1Var) {
        this.a = 25;
        this.c = tLObject;
        this.b = b1Var;
    }

    public /* synthetic */ b(t5 t5Var, boolean[] zArr, Utilities.Callback2 callback2) {
        this.a = 26;
        this.b = zArr;
        this.c = callback2;
    }
}
