package s9;

import android.content.SharedPreferences;
import android.graphics.Point;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.TextView;
import bi.t4;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import ji.p1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.b2;
import org.telegram.ui.Components.ga0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.z9;
import org.telegram.ui.Components.zc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.z6;
import org.telegram.ui.fo;
import org.telegram.ui.mt;
import s4.b0;
import sg.a2;
import sg.h0;
import sg.i0;
import sg.j0;
import tg.p;
import tg.r;
import u2.w0;
import ug.a0;
import ug.m1;
import ug.v;
import yh.b1;
import yh.h1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
        int i10;
        TLRPC.Document document;
        TLRPC.Document document2;
        File pathToAttach;
        int i11 = 4;
        switch (this.a) {
            case 0:
                Callable callable = (Callable) this.b;
                i iVar = (i) ((m.h) this.c).b;
                try {
                    iVar.k(callable.call());
                    return;
                } catch (Exception e) {
                    iVar.l(e);
                    return;
                }
            case 1:
                j0 j0Var = (j0) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList = j0Var.i0;
                mm0 mm0Var = j0Var.d;
                if (tLObject != null) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    j0Var.I0 = false;
                    j0Var.J0.b(j0Var.n0 + 4);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= mm0Var.getChildCount()) {
                            i10 = 0;
                        } else if (mm0Var.getChildAt(i12) instanceof i0) {
                            i10 = mm0Var.getChildAt(i12).getTop();
                        } else {
                            i12++;
                        }
                    }
                    j0Var.N1();
                    if (j0Var.l0 >= 0 && i10 != 0) {
                        ((b0) mm0Var.getLayoutManager()).h1(j0Var.l0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList.size(), j0Var.M0.b);
                j0Var.x0.g(max, false);
                j0Var.x0.setBagePosition(max / j0Var.M0.c);
                h0 h0Var = j0Var.x0;
                h0Var.H = true;
                h0Var.requestLayout();
                return;
            case 2:
                ((j0) this.b).n1((ga0) this.c, true);
                return;
            case 3:
                a2 a2Var = (a2) this.b;
                AndroidUtilities.runOnUIThread(new b(i11, a2Var, FileLoader.getInstance(a2Var.s).getPathToAttach((TLRPC.Document) this.c)));
                return;
            case 4:
                a2 a2Var2 = (a2) this.b;
                a2Var2.e = (File) this.c;
                a2Var2.a();
                return;
            case 5:
                ((tg.f) this.b).c((ArrayList) this.c);
                return;
            case 6:
                p pVar = (p) this.b;
                r rVar = (r) this.c;
                pVar.getClass();
                try {
                    EGLDisplay eGLDisplay = pVar.i;
                    if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface = pVar.k;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, pVar.j);
                        EGLSurface eGLSurface2 = rVar.h;
                        if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                            EGL14.eglDestroySurface(pVar.i, eGLSurface2);
                        }
                        rVar.h = EGL14.EGL_NO_SURFACE;
                        if (pVar.f.length == 0) {
                            pVar.b();
                        }
                    }
                    rVar.b.release();
                    return;
                } catch (Throwable th2) {
                    rVar.b.release();
                    throw th2;
                }
            case 7:
                ((e2.j) this.b).accept(this.c);
                return;
            case 8:
                ((w0) this.b).z((c3.b0) this.c);
                return;
            case 9:
                com.google.android.gms.internal.cast.p pVar2 = (com.google.android.gms.internal.cast.p) this.b;
                tf.b bVar = (tf.b) this.c;
                if (((AtomicBoolean) pVar2.e).compareAndSet(false, true)) {
                    bVar.a(true);
                    return;
                }
                return;
            case 10:
                ((ug.w0) this.b).run((ArrayList) this.c);
                return;
            case 11:
                ((v) this.b).run((TLRPC.TL_error) this.c);
                return;
            case 12:
                ((mt) this.b).run((ArrayList) this.c);
                return;
            case 13:
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = messagesStorage.getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount == null || smallGroupsParticipantsCount.isEmpty()) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new b2(callback, smallGroupsParticipantsCount, 1));
                return;
            case 14:
                sc M = zc.a0((fo) this.b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.c).stars)), R.raw.stars_send);
                M.j = 5000;
                M.k(true);
                return;
            case 15:
                a0 a0Var = (a0) this.b;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) this.c;
                a0Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, a0Var.b0, Boolean.TRUE, prepaidGiveaway);
                return;
            case 16:
                m1.Q((m1) this.b, (TLObject) this.c);
                return;
            case 17:
                vh.i iVar2 = (vh.i) this.b;
                iVar2.b.add((String) this.c);
                iVar2.invalidate();
                return;
            case 18:
                wf.c cVar = (wf.c) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 != null) {
                    if (tLObject2 instanceof TL_account.TL_savedRingtonesNotModified) {
                        cVar.f(true);
                    } else if (tLObject2 instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject2;
                        ArrayList<TLRPC.Document> arrayList2 = tL_savedRingtones.ringtones;
                        ArrayList arrayList3 = cVar.e;
                        if (!cVar.f) {
                            cVar.f(false);
                            cVar.f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList3.get(i13);
                            i13++;
                            wf.b bVar2 = (wf.b) obj;
                            if (bVar2.b != null && (document = bVar2.a) != null) {
                                hashMap.put(Long.valueOf(document.id), bVar2.b);
                            }
                        }
                        arrayList3.clear();
                        SharedPreferences d = cVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt(NotificationBadge.NewHtcHomeBadger.COUNT, arrayList2.size());
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            TLRPC.Document document3 = arrayList2.get(i14);
                            String str = (String) hashMap.get(Long.valueOf(document3.id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i14, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i14, str);
                            }
                            wf.b bVar3 = new wf.b();
                            bVar3.a = document3;
                            bVar3.b = str;
                            int i15 = cVar.d;
                            cVar.d = i15 + 1;
                            bVar3.c = i15;
                            arrayList3.add(bVar3);
                        }
                        edit.apply();
                        NotificationCenter.getInstance(cVar.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        SharedPreferences.Editor edit2 = cVar.d().edit();
                        long j10 = tL_savedRingtones.hash;
                        wf.c.g = j10;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j10);
                        long currentTimeMillis = System.currentTimeMillis();
                        wf.c.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    cVar.b();
                    return;
                }
                return;
            case 19:
                wf.c cVar2 = (wf.c) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    wf.b bVar4 = (wf.b) arrayList4.get(i16);
                    if (bVar4 != null && ((TextUtils.isEmpty(bVar4.b) || !new File(bVar4.b).exists()) && (document2 = bVar4.a) != null && ((pathToAttach = FileLoader.getInstance(cVar2.c).getPathToAttach(document2)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new b(20, cVar2, document2));
                    }
                }
                return;
            case 20:
                wf.c cVar3 = (wf.c) this.b;
                TLRPC.Document document4 = (TLRPC.Document) this.c;
                FileLoader.getInstance(cVar3.c).loadFile(document4, document4, 0, 0);
                return;
            case 21:
                wf.d dVar = (wf.d) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                int i17 = dVar.a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(i17).ringtoneDurationMax)));
                    return;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(i17).ringtoneSizeMax / 1024)));
                    return;
                } else {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat));
                    return;
                }
            case 22:
                ((p1) this.b).run((TLRPC.Chat) this.c);
                return;
            case 23:
                xh.l lVar = (xh.l) this.b;
                g5 g5Var = (g5) this.c;
                int i18 = lVar.k;
                m2 m2Var = lVar.g;
                TLRPC.TL_chatInviteImporter importer = g5Var.getImporter();
                lVar.r = importer;
                LongSparseArray longSparseArray = lVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user == null) {
                    return;
                }
                m2Var.getMessagesController().putUser(user, false);
                Point point = AndroidUtilities.displaySize;
                boolean z10 = point.x > point.y;
                if (user.photo == null || z10) {
                    lVar.b = true;
                    m2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    m2Var.presentFragment(profileActivity);
                    return;
                }
                if (lVar.s == null) {
                    xh.k kVar = new xh.k(lVar, m2Var.getParentActivity(), (mm0) g5Var.getParent(), m2Var.getResourceProvider(), lVar.a);
                    lVar.s = kVar;
                    TLRPC.TL_chatInviteImporter tL_chatInviteImporter = lVar.r;
                    z9 avatarImageView = g5Var.getAvatarImageView();
                    TextView textView = kVar.e;
                    pi0 pi0Var = kVar.h;
                    kVar.r = tL_chatInviteImporter;
                    kVar.v = avatarImageView;
                    TLRPC.User user2 = MessagesController.getInstance(i18).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                    ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i18, user2, 0);
                    ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i18, user2, 1);
                    if (MessagesController.getInstance(i18).getUserFull(tL_chatInviteImporter.user_id) == null) {
                        MessagesController.getInstance(i18).loadUserInfo(user2, false, 0);
                    }
                    pi0Var.setParentAvatarImage(avatarImageView);
                    pi0Var.M(tL_chatInviteImporter.user_id, true);
                    pi0Var.H(null, forUserOrChat, forUserOrChat2, true);
                    kVar.d.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                    textView.setText(tL_chatInviteImporter.about);
                    textView.setVisibility(TextUtils.isEmpty(tL_chatInviteImporter.about) ? 8 : 0);
                    kVar.y.requestLayout();
                    lVar.s.setOnDismissListener(new t4(lVar, 11));
                    lVar.s.show();
                    return;
                }
                return;
            case 24:
                yh.c cVar4 = (yh.c) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                cVar4.getClass();
                onClickListener.onClick(cVar4);
                return;
            case 25:
                ((b1) this.b).getBulletinFactory().f0((TLRPC.TL_error) this.c, false);
                return;
            case 26:
                h1 h1Var = (h1) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                h1Var.getClass();
                if (savedStarGift.unsaved) {
                    return;
                }
                h1Var.F.setVisibility(8);
                return;
            case 27:
                ns0 ns0Var = (ns0) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c;
                ns0Var.h(tL_starGiftCollection.title, new z6(10, ns0Var, tL_starGiftCollection));
                return;
            case 28:
                yh.m2 m2Var2 = (yh.m2) this.b;
                AndroidUtilities.addToClipboard((String) this.c);
                zc.a0(m2Var2.a.a).k(false).j();
                return;
            default:
                zh.l lVar2 = (zh.l) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                int i19 = lVar2.a;
                ArrayList arrayList5 = lVar2.e;
                lVar2.i = 0;
                if (tLObject3 instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject3;
                    MessagesController.getInstance(i19).putUsers(connectedstarrefbots.users, false);
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
                NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(lVar2.b));
                return;
        }
    }
}
