package uf;

import ai.bb;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.google.android.gms.internal.cast.p;
import ig.l0;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.b2;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.js0;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.x;
import org.telegram.ui.qn;
import org.telegram.ui.sp0;
import ug.m1;
import ug.u;
import ug.v0;
import ug.z;
import vh.i;
import wf.d;
import xh.j;
import xh.k;
import yh.a1;
import yh.g1;
import yh.l2;
import zh.b0;
import zh.c1;
import zh.e;
import zh.f;
import zh.m0;
import zh.r;
import zh.s;
import zh.y;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0222, code lost:
    
        if (r9 == null) goto L110;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.Document document;
        TLRPC.Document document2;
        File pathToAttach;
        RLottieNative rLottieNative;
        e eVar;
        Bitmap bitmap = null;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        switch (this.a) {
            case 0:
                p pVar = (p) this.b;
                tf.b bVar = (tf.b) this.c;
                if (((AtomicBoolean) pVar.e).compareAndSet(false, true)) {
                    bVar.a(true);
                    return;
                }
                return;
            case 1:
                ((v0) this.b).run((ArrayList) this.c);
                return;
            case 2:
                ((u) this.b).run((TLRPC.TL_error) this.c);
                return;
            case 3:
                ((qy) this.b).run((ArrayList) this.c);
                return;
            case 4:
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = messagesStorage.getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount == null || smallGroupsParticipantsCount.isEmpty()) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new b2(callback, smallGroupsParticipantsCount, 1));
                return;
            case 5:
                qc M = xc.a0((qn) this.b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.c).stars)), R.raw.stars_send);
                M.j = 5000;
                M.k(true);
                return;
            case 6:
                z zVar = (z) this.b;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) this.c;
                zVar.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, zVar.b0, Boolean.TRUE, prepaidGiveaway);
                return;
            case 7:
                m1.Q((m1) this.b, (TLObject) this.c);
                return;
            case 8:
                i iVar = (i) this.b;
                iVar.b.add((String) this.c);
                iVar.invalidate();
                return;
            case 9:
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
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList2.get(i10);
                            i10++;
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
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            TLRPC.Document document3 = arrayList.get(i11);
                            String str = (String) hashMap.get(Long.valueOf(document3.id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i11, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i11, str);
                            }
                            wf.b bVar3 = new wf.b();
                            bVar3.a = document3;
                            bVar3.b = str;
                            int i12 = cVar.d;
                            cVar.d = i12 + 1;
                            bVar3.c = i12;
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
            case 10:
                wf.c cVar2 = (wf.c) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    wf.b bVar4 = (wf.b) arrayList3.get(i13);
                    if (bVar4 != null && ((TextUtils.isEmpty(bVar4.b) || !new File(bVar4.b).exists()) && (document2 = bVar4.a) != null && ((pathToAttach = FileLoader.getInstance(cVar2.c).getPathToAttach(document2)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new c(11, cVar2, document2));
                    }
                }
                return;
            case 11:
                wf.c cVar3 = (wf.c) this.b;
                TLRPC.Document document4 = (TLRPC.Document) this.c;
                FileLoader.getInstance(cVar3.c).loadFile(document4, document4, 0, 0);
                return;
            case 12:
                d dVar = (d) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                int i14 = dVar.a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(i14).ringtoneDurationMax)));
                    return;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(i14).ringtoneSizeMax / 1024)));
                    return;
                } else {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat));
                    return;
                }
            case 13:
                ((l0) this.b).run((TLRPC.Chat) this.c);
                return;
            case 14:
                k kVar = (k) this.b;
                f5 f5Var = (f5) this.c;
                int i15 = kVar.k;
                n2 n2Var = kVar.g;
                TLRPC.TL_chatInviteImporter importer = f5Var.getImporter();
                kVar.r = importer;
                LongSparseArray longSparseArray = kVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user == null) {
                    return;
                }
                n2Var.getMessagesController().putUser(user, false);
                Point point = AndroidUtilities.displaySize;
                Object[] objArr = point.x > point.y;
                if (user.photo == null || objArr == true) {
                    kVar.b = true;
                    n2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    n2Var.presentFragment(profileActivity);
                    return;
                }
                if (kVar.s == null) {
                    j jVar = new j(kVar, n2Var.getParentActivity(), (im0) f5Var.getParent(), n2Var.getResourceProvider(), kVar.a);
                    kVar.s = jVar;
                    TLRPC.TL_chatInviteImporter tL_chatInviteImporter = kVar.r;
                    w9 avatarImageView = f5Var.getAvatarImageView();
                    TextView textView = jVar.e;
                    ki0 ki0Var = jVar.h;
                    jVar.r = tL_chatInviteImporter;
                    jVar.v = avatarImageView;
                    TLRPC.User user2 = MessagesController.getInstance(i15).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                    ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i15, user2, 0);
                    ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i15, user2, 1);
                    if (MessagesController.getInstance(i15).getUserFull(tL_chatInviteImporter.user_id) == null) {
                        MessagesController.getInstance(i15).loadUserInfo(user2, false, 0);
                    }
                    ki0Var.setParentAvatarImage(avatarImageView);
                    ki0Var.M(tL_chatInviteImporter.user_id, true);
                    ki0Var.H(null, forUserOrChat, forUserOrChat2, true);
                    jVar.d.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                    textView.setText(tL_chatInviteImporter.about);
                    textView.setVisibility(TextUtils.isEmpty(tL_chatInviteImporter.about) ? 8 : 0);
                    jVar.y.requestLayout();
                    kVar.s.setOnDismissListener(new bb(kVar, 14));
                    kVar.s.show();
                    return;
                }
                return;
            case 15:
                yh.b bVar5 = (yh.b) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                bVar5.getClass();
                onClickListener.onClick(bVar5);
                return;
            case 16:
                ((a1) this.b).getBulletinFactory().f0((TLRPC.TL_error) this.c, false);
                return;
            case 17:
                g1 g1Var = (g1) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                g1Var.getClass();
                if (savedStarGift.unsaved) {
                    return;
                }
                g1Var.F.setVisibility(8);
                return;
            case 18:
                js0 js0Var = (js0) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c;
                js0Var.h(tL_starGiftCollection.title, new x(17, js0Var, tL_starGiftCollection));
                return;
            case 19:
                l2 l2Var = (l2) this.b;
                AndroidUtilities.addToClipboard((String) this.c);
                xc.a0(l2Var.a.a).k(false).j();
                return;
            case 20:
                r rVar = (r) this.b;
                if (((TLRPC.Document) this.c) != null) {
                    rVar.e();
                    return;
                } else {
                    rVar.getClass();
                    return;
                }
            case 21:
                s sVar = (s) this.b;
                File file = (File) this.c;
                int i16 = sVar.c;
                try {
                    rLottieNative = RLottieNative.a(file.getAbsolutePath(), null, null, null, 0, null);
                    if (rLottieNative != null) {
                        try {
                            Bitmap.Config config = Bitmap.Config.ARGB_8888;
                            Bitmap createBitmap = Bitmap.createBitmap(i16, i16, config);
                            rLottieNative.c(0, createBitmap, true);
                            Bitmap createBitmap2 = Bitmap.createBitmap(i16, i16, config);
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
                AndroidUtilities.runOnUIThread(new c(22, sVar, bitmap));
                return;
            case 22:
                s sVar2 = (s) this.b;
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
            case 23:
                b0 b0Var = (b0) this.b;
                xf.c cVar4 = (xf.c) this.c;
                if (b0Var.V) {
                    return;
                }
                b0Var.e();
                b0Var.a.a((String) cVar4.a);
                return;
            case 24:
                zh.z zVar2 = (zh.z) this.b;
                xf.c cVar5 = (xf.c) this.c;
                b0 b0Var2 = zVar2.a;
                if (b0Var2.l0 || b0Var2.V || b0Var2.U) {
                    return;
                }
                b0Var2.l0 = true;
                b0Var2.h0 = false;
                b0Var2.performHapticFeedback(3, 2);
                PointF[] pointFArr = (PointF[]) cVar5.b;
                r7 = pointFArr.length < 3 ? 0 : 1;
                if (r7 != 0) {
                    b0Var2.m0 = pointFArr;
                    b0Var2.invalidate();
                }
                AndroidUtilities.runOnUIThread(new c(23, b0Var2, cVar5), r7 != 0 ? 450L : 0L);
                return;
            case 25:
                m0.U((m0) this.b, (AnimatorSet) this.c);
                return;
            case 26:
                m0 m0Var = (m0) this.b;
                Bitmap bitmap3 = (Bitmap) this.c;
                File file2 = new File(AndroidUtilities.getCacheDir(), "qr_code_" + System.currentTimeMillis() + ".png");
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        z10 = bitmap3.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.close();
                    } finally {
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                bitmap3.recycle();
                if (z10) {
                    AndroidUtilities.runOnUIThread(new c(28, m0Var, file2));
                    return;
                }
                return;
            case 27:
                final m0 m0Var2 = (m0) this.b;
                b0 b0Var3 = (b0) this.c;
                if (b0.d(m0Var2.getParentActivity())) {
                    b0Var3.e();
                    gi.c cVar6 = new gi.c(13);
                    final int i17 = false ? 1 : 0;
                    Utilities.Callback callback2 = new Utilities.Callback() { // from class: zh.f0
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj2) {
                            switch (i17) {
                                case 0:
                                    String str2 = (String) obj2;
                                    m0 m0Var3 = m0Var2;
                                    if (m0Var3.getParentActivity() != null) {
                                        pf.d.r(m0Var3.getParentActivity(), str2);
                                        break;
                                    }
                                    break;
                                default:
                                    m0 m0Var4 = m0Var2;
                                    c1 c1Var = m0Var4.d;
                                    if (c1Var != null && !m0Var4.isFinished) {
                                        c1Var.d1(R.drawable.msg_download, LocaleController.getString(R.string.QrSavedToGallery), null);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    sp0 sp0Var = new sp0(10, false, false, null);
                    sp0Var.G = 1;
                    sp0Var.H = false;
                    sp0Var.x = false;
                    sp0Var.V = new y(cVar6, m0Var2, callback2);
                    m0Var2.presentFragment(sp0Var);
                    return;
                }
                return;
            case 28:
                final m0 m0Var3 = (m0) this.b;
                File file3 = (File) this.c;
                Activity parentActivity = m0Var3.getParentActivity();
                if (parentActivity == null) {
                    return;
                }
                MediaController.saveFile(file3.getAbsolutePath(), parentActivity, 0, file3.getName(), "image/png", new Utilities.Callback() { // from class: zh.f0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj2) {
                        switch (r2) {
                            case 0:
                                String str2 = (String) obj2;
                                m0 m0Var32 = m0Var3;
                                if (m0Var32.getParentActivity() != null) {
                                    pf.d.r(m0Var32.getParentActivity(), str2);
                                    break;
                                }
                                break;
                            default:
                                m0 m0Var4 = m0Var3;
                                c1 c1Var = m0Var4.d;
                                if (c1Var != null && !m0Var4.isFinished) {
                                    c1Var.d1(R.drawable.msg_download, LocaleController.getString(R.string.QrSavedToGallery), null);
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                return;
            default:
                c1 c1Var = (c1) this.b;
                e eVar2 = (e) this.c;
                f fVar = c1Var.s0;
                if (fVar.q == 2 && fVar.o < 1.0f) {
                    fVar.m = eVar2;
                    c1Var.invalidate();
                    return;
                }
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                c1Var.p2 = c1.j(c1Var.n2, 0.03f, 0.005f);
                c1Var.n2 = currentAnimationTimeMillis;
                e eVar3 = fVar.m;
                if (eVar3 == null) {
                    fVar.m = eVar2;
                    fVar.n = null;
                    fVar.o = 1.0f;
                    return;
                }
                int i18 = (Build.VERSION.SDK_INT >= 29 ? 1 : 0) ^ 1;
                if (fVar.o < 1.0f && (eVar = fVar.n) != null) {
                    eVar3 = eVar;
                }
                fVar.n = eVar3;
                fVar.m = eVar2;
                fVar.o = 0.0f;
                fVar.q = i18;
                fVar.p = System.currentTimeMillis();
                boolean[] zArr = fVar.s;
                if (zArr != null) {
                    int length = zArr.length;
                    int i19 = fVar.n.e;
                    if (length >= i19 * i19) {
                        Arrays.fill(zArr, false);
                        fVar.G = i18 == 1;
                        return;
                    }
                }
                int i20 = fVar.n.e;
                fVar.s = new boolean[i20 * i20];
                fVar.G = i18 == 1;
                return;
        }
    }
}
