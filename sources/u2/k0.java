package u2;

import ai.cb;
import android.animation.AnimatorSet;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
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
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.a2;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.sn;
import org.telegram.ui.vp0;
import yh.l2;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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

    /* JADX WARN: Code restructure failed: missing block: B:89:0x017f, code lost:
    
        if (r5 == null) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.Document document;
        TLRPC.Document document2;
        File pathToAttach;
        RLottieNative rLottieNative;
        boolean z10;
        int i10 = 13;
        Bitmap bitmap = null;
        int i11 = 0;
        switch (this.a) {
            case 0:
                ((e2.j) this.b).accept(this.c);
                return;
            case 1:
                ((y0) this.b).B((c3.e0) this.c);
                return;
            case 2:
                com.google.android.gms.internal.cast.p pVar = (com.google.android.gms.internal.cast.p) this.b;
                tf.b bVar = (tf.b) this.c;
                if (((AtomicBoolean) pVar.e).compareAndSet(false, true)) {
                    bVar.a(true);
                    return;
                }
                return;
            case 3:
                ((ug.u0) this.b).run((ArrayList) this.c);
                return;
            case 4:
                ((ug.t) this.b).run((TLRPC.TL_error) this.c);
                return;
            case 5:
                ((qy) this.b).run((ArrayList) this.c);
                return;
            case 6:
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = messagesStorage.getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount == null || smallGroupsParticipantsCount.isEmpty()) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new a2(callback, smallGroupsParticipantsCount, 1));
                return;
            case 7:
                qc M = xc.a0((sn) this.b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.c).stars)), R.raw.stars_send);
                M.j = 5000;
                M.k(true);
                return;
            case 8:
                ug.y yVar = (ug.y) this.b;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) this.c;
                yVar.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, yVar.b0, Boolean.TRUE, prepaidGiveaway);
                return;
            case 9:
                ug.l1.P((ug.l1) this.b, (TLObject) this.c);
                return;
            case 10:
                vh.i iVar = (vh.i) this.b;
                iVar.b.add((String) this.c);
                iVar.invalidate();
                return;
            case 11:
                wf.c cVar = (wf.c) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    if (tLObject instanceof TL_account.TL_savedRingtonesNotModified) {
                        cVar.f(true);
                    } else if (tLObject instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject;
                        ArrayList<TLRPC.Document> arrayList = tL_savedRingtones.ringtones;
                        ArrayList arrayList2 = cVar.e;
                        if (!cVar.f) {
                            cVar.f(false);
                            cVar.f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList2.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList2.get(i12);
                            i12++;
                            wf.b bVar2 = (wf.b) obj;
                            if (bVar2.b != null && (document = bVar2.a) != null) {
                                hashMap.put(Long.valueOf(document.id), bVar2.b);
                            }
                        }
                        arrayList2.clear();
                        SharedPreferences d = cVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt(NotificationBadge.NewHtcHomeBadger.COUNT, arrayList.size());
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            TLRPC.Document document3 = arrayList.get(i13);
                            String str = (String) hashMap.get(Long.valueOf(document3.id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i13, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i13, str);
                            }
                            wf.b bVar3 = new wf.b();
                            bVar3.a = document3;
                            bVar3.b = str;
                            int i14 = cVar.d;
                            cVar.d = i14 + 1;
                            bVar3.c = i14;
                            arrayList2.add(bVar3);
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
            case 12:
                wf.c cVar2 = (wf.c) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    wf.b bVar4 = (wf.b) arrayList3.get(i15);
                    if (bVar4 != null && ((TextUtils.isEmpty(bVar4.b) || !new File(bVar4.b).exists()) && (document2 = bVar4.a) != null && ((pathToAttach = FileLoader.getInstance(cVar2.c).getPathToAttach(document2)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new k0(i10, cVar2, document2));
                    }
                }
                return;
            case 13:
                wf.c cVar3 = (wf.c) this.b;
                TLRPC.Document document4 = (TLRPC.Document) this.c;
                FileLoader.getInstance(cVar3.c).loadFile(document4, document4, 0, 0);
                return;
            case 14:
                wf.d dVar = (wf.d) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                int i16 = dVar.a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(i16).ringtoneDurationMax)));
                    return;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(i16).ringtoneSizeMax / 1024)));
                    return;
                } else {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat));
                    return;
                }
            case 15:
                ((ig.k0) this.b).run((TLRPC.Chat) this.c);
                return;
            case 16:
                xh.k kVar = (xh.k) this.b;
                f5 f5Var = (f5) this.c;
                int i17 = kVar.k;
                o2 o2Var = kVar.g;
                TLRPC.TL_chatInviteImporter importer = f5Var.getImporter();
                kVar.r = importer;
                LongSparseArray longSparseArray = kVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user == null) {
                    return;
                }
                o2Var.getMessagesController().putUser(user, false);
                Point point = AndroidUtilities.displaySize;
                boolean z11 = point.x > point.y;
                if (user.photo == null || z11) {
                    kVar.b = true;
                    o2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    o2Var.presentFragment(profileActivity);
                    return;
                }
                if (kVar.s == null) {
                    xh.j jVar = new xh.j(kVar, o2Var.getParentActivity(), (mm0) f5Var.getParent(), o2Var.getResourceProvider(), kVar.a);
                    kVar.s = jVar;
                    TLRPC.TL_chatInviteImporter tL_chatInviteImporter = kVar.r;
                    w9 avatarImageView = f5Var.getAvatarImageView();
                    TextView textView = jVar.e;
                    oi0 oi0Var = jVar.h;
                    jVar.r = tL_chatInviteImporter;
                    jVar.v = avatarImageView;
                    TLRPC.User user2 = MessagesController.getInstance(i17).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                    ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i17, user2, 0);
                    ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i17, user2, 1);
                    if (MessagesController.getInstance(i17).getUserFull(tL_chatInviteImporter.user_id) == null) {
                        MessagesController.getInstance(i17).loadUserInfo(user2, false, 0);
                    }
                    oi0Var.setParentAvatarImage(avatarImageView);
                    oi0Var.M(tL_chatInviteImporter.user_id, true);
                    oi0Var.H(null, forUserOrChat, forUserOrChat2, true);
                    jVar.d.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                    textView.setText(tL_chatInviteImporter.about);
                    textView.setVisibility(TextUtils.isEmpty(tL_chatInviteImporter.about) ? 8 : 0);
                    jVar.y.requestLayout();
                    kVar.s.setOnDismissListener(new cb(kVar, 14));
                    kVar.s.show();
                    return;
                }
                return;
            case 17:
                yh.b bVar5 = (yh.b) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                bVar5.getClass();
                onClickListener.onClick(bVar5);
                return;
            case 18:
                ((yh.a1) this.b).getBulletinFactory().f0((TLRPC.TL_error) this.c, false);
                return;
            case 19:
                yh.g1 g1Var = (yh.g1) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                g1Var.getClass();
                if (savedStarGift.unsaved) {
                    return;
                }
                g1Var.F.setVisibility(8);
                return;
            case 20:
                ns0 ns0Var = (ns0) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c;
                ns0Var.h(tL_starGiftCollection.title, new org.telegram.ui.Wallet.w(17, ns0Var, tL_starGiftCollection));
                return;
            case 21:
                l2 l2Var = (l2) this.b;
                AndroidUtilities.addToClipboard((String) this.c);
                xc.a0(l2Var.a.a).k(false).j();
                return;
            case 22:
                zh.r rVar = (zh.r) this.b;
                if (((TLRPC.Document) this.c) != null) {
                    rVar.e();
                    return;
                } else {
                    rVar.getClass();
                    return;
                }
            case 23:
                zh.s sVar = (zh.s) this.b;
                File file = (File) this.c;
                int i18 = sVar.c;
                try {
                    rLottieNative = RLottieNative.a(file.getAbsolutePath(), null, null, null, 0, null);
                    if (rLottieNative != null) {
                        try {
                            Bitmap.Config config = Bitmap.Config.ARGB_8888;
                            Bitmap createBitmap = Bitmap.createBitmap(i18, i18, config);
                            rLottieNative.c(0, createBitmap, true);
                            Bitmap createBitmap2 = Bitmap.createBitmap(i18, i18, config);
                            Paint paint = new Paint(2);
                            paint.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                            new Canvas(createBitmap2).drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                            createBitmap.recycle();
                            createBitmap2.setHasMipMap(true);
                            rLottieNative.d();
                            bitmap = createBitmap2;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                FileLog.e(th);
                                break;
                            } finally {
                                if (rLottieNative != null) {
                                    rLottieNative.d();
                                }
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    rLottieNative = null;
                }
                AndroidUtilities.runOnUIThread(new k0(24, sVar, bitmap));
                return;
            case 24:
                zh.s sVar2 = (zh.s) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                sVar2.h = true;
                if (sVar2.e) {
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        return;
                    }
                    return;
                } else {
                    if (bitmap2 != null) {
                        sVar2.d.run(bitmap2);
                        return;
                    }
                    return;
                }
            case 25:
                zh.b0 b0Var = (zh.b0) this.b;
                z4.b bVar6 = (z4.b) this.c;
                if (b0Var.V) {
                    return;
                }
                b0Var.e();
                b0Var.a.a((String) bVar6.a);
                return;
            case 26:
                zh.z zVar = (zh.z) this.b;
                z4.b bVar7 = (z4.b) this.c;
                zh.b0 b0Var2 = zVar.a;
                if (b0Var2.l0 || b0Var2.V || b0Var2.U) {
                    return;
                }
                b0Var2.l0 = true;
                b0Var2.h0 = false;
                b0Var2.performHapticFeedback(3, 2);
                PointF[] pointFArr = (PointF[]) bVar7.b;
                boolean z12 = pointFArr.length >= 3;
                if (z12) {
                    b0Var2.m0 = pointFArr;
                    b0Var2.invalidate();
                }
                AndroidUtilities.runOnUIThread(new k0(25, b0Var2, bVar7), z12 ? 450L : 0L);
                return;
            case 27:
                zh.n0.U((zh.n0) this.b, (AnimatorSet) this.c);
                return;
            case 28:
                zh.n0 n0Var = (zh.n0) this.b;
                Bitmap bitmap3 = (Bitmap) this.c;
                File file2 = new File(AndroidUtilities.getCacheDir(), "qr_code_" + System.currentTimeMillis() + ".png");
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        z10 = bitmap3.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        try {
                            fileOutputStream.close();
                        } catch (Exception e) {
                            e = e;
                            FileLog.e(e);
                            bitmap3.recycle();
                            if (z10) {
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            fileOutputStream.close();
                            throw th4;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                            throw th4;
                        }
                    }
                } catch (Exception e7) {
                    e = e7;
                    z10 = false;
                }
                bitmap3.recycle();
                if (z10) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new zh.h0(i11, n0Var, file2));
                return;
            default:
                zh.n0 n0Var2 = (zh.n0) this.b;
                zh.b0 b0Var3 = (zh.b0) this.c;
                if (zh.b0.d(n0Var2.getParentActivity())) {
                    b0Var3.e();
                    gi.c cVar4 = new gi.c(i10);
                    zh.f0 f0Var = new zh.f0(n0Var2, i11);
                    vp0 vp0Var = new vp0(10, false, false, null);
                    vp0Var.G = 1;
                    vp0Var.H = false;
                    vp0Var.x = false;
                    vp0Var.V = new zh.y(cVar4, n0Var2, f0Var);
                    n0Var2.presentFragment(vp0Var);
                    return;
                }
                return;
        }
    }
}
