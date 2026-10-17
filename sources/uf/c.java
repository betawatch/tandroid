package uf;

import ai.ab;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
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
import java.util.Iterator;
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
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.b2;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.is0;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.x;
import org.telegram.ui.sn;
import p4.s0;
import ug.l1;
import ug.t;
import ug.u0;
import ug.y;
import vh.i;
import wf.d;
import xh.j;
import xh.k;
import yh.b1;
import yh.h1;
import yh.m2;
import zh.a0;
import zh.d0;
import zh.e;
import zh.e1;
import zh.g;
import zh.h;
import zh.l;
import zh.m;
import zh.m0;
import zh.z;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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

    /* JADX WARN: Code restructure failed: missing block: B:328:0x03b4, code lost:
    
        r22.recycle();
     */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04b7 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04bd A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04ca A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04e4 A[LOOP:3: B:188:0x04de->B:190:0x04e4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03ce A[Catch: all -> 0x041b, TRY_LEAVE, TryCatch #7 {all -> 0x041b, blocks: (B:304:0x03ca, B:306:0x03ce), top: B:303:0x03ca }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.Document document;
        TLRPC.Document document2;
        File pathToAttach;
        l lVar;
        Iterator it;
        AnimatedFileNative[] animatedFileNativeArr;
        RLottieNative[] rLottieNativeArr;
        Bitmap bitmap;
        int[] iArr;
        int[] iArr2;
        int i10;
        boolean z10;
        int b10;
        int max;
        Bitmap a2;
        int i11;
        int[][] iArr3;
        Bitmap bitmap2;
        int i12;
        int[] iArr4;
        int i13;
        Bitmap bitmap3;
        int i14;
        Bitmap bitmap4;
        FileOutputStream fileOutputStream;
        g gVar;
        boolean z11 = false;
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
                ((u0) this.b).run((ArrayList) this.c);
                return;
            case 2:
                ((t) this.b).run((TLRPC.TL_error) this.c);
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
                qc M = xc.a0((sn) this.b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.c).stars)), R.raw.stars_send);
                M.j = 5000;
                M.k(true);
                return;
            case 6:
                y yVar = (y) this.b;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) this.c;
                yVar.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, yVar.b0, Boolean.TRUE, prepaidGiveaway);
                return;
            case 7:
                l1.Q((l1) this.b, (TLObject) this.c);
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
                        int i15 = 0;
                        while (i15 < size) {
                            Object obj = arrayList2.get(i15);
                            i15++;
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
                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                            TLRPC.Document document3 = arrayList.get(i16);
                            String str = (String) hashMap.get(Long.valueOf(document3.id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i16, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i16, str);
                            }
                            wf.b bVar3 = new wf.b();
                            bVar3.a = document3;
                            bVar3.b = str;
                            int i17 = cVar.d;
                            cVar.d = i17 + 1;
                            bVar3.c = i17;
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
                for (int i18 = 0; i18 < arrayList3.size(); i18++) {
                    wf.b bVar4 = (wf.b) arrayList3.get(i18);
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
                int i19 = dVar.a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(i19).ringtoneDurationMax)));
                    return;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(i19).ringtoneSizeMax / 1024)));
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
                int i20 = kVar.k;
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
                boolean z12 = point.x > point.y;
                if (user.photo == null || z12) {
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
                    TLRPC.User user2 = MessagesController.getInstance(i20).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                    ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i20, user2, 0);
                    ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i20, user2, 1);
                    if (MessagesController.getInstance(i20).getUserFull(tL_chatInviteImporter.user_id) == null) {
                        MessagesController.getInstance(i20).loadUserInfo(user2, false, 0);
                    }
                    ki0Var.setParentAvatarImage(avatarImageView);
                    ki0Var.M(tL_chatInviteImporter.user_id, true);
                    ki0Var.H(null, forUserOrChat, forUserOrChat2, true);
                    jVar.d.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                    textView.setText(tL_chatInviteImporter.about);
                    textView.setVisibility(TextUtils.isEmpty(tL_chatInviteImporter.about) ? 8 : 0);
                    jVar.y.requestLayout();
                    kVar.s.setOnDismissListener(new ab(kVar, 14));
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
                ((b1) this.b).getBulletinFactory().f0((TLRPC.TL_error) this.c, false);
                return;
            case 17:
                h1 h1Var = (h1) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                h1Var.getClass();
                if (savedStarGift.unsaved) {
                    return;
                }
                h1Var.F.setVisibility(8);
                return;
            case 18:
                is0 is0Var = (is0) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c;
                is0Var.h(tL_starGiftCollection.title, new x(17, is0Var, tL_starGiftCollection));
                return;
            case 19:
                m2 m2Var = (m2) this.b;
                AndroidUtilities.addToClipboard((String) this.c);
                xc.a0(m2Var.a.a).k(false).j();
                return;
            case 20:
                zh.j jVar2 = (zh.j) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                int i21 = jVar2.e;
                boolean z13 = jVar2.f;
                int size2 = arrayList4.size();
                RLottieNative[] rLottieNativeArr2 = new RLottieNative[size2];
                AnimatedFileNative[] animatedFileNativeArr2 = new AnimatedFileNative[size2];
                int[][] iArr5 = new int[size2][];
                try {
                    iArr = new int[size2];
                    iArr2 = new int[size2];
                    int i22 = 0;
                    i10 = 0;
                    while (i22 < size2) {
                        try {
                            boolean z14 = z11;
                            zh.k kVar2 = (zh.k) arrayList4.get(i22);
                            iArr2[i22] = r7;
                            iArr[i22] = r7;
                            int i23 = r7;
                            File file = kVar2.b;
                            if (file != null && kVar2.c) {
                                int[] iArr6 = new int[8];
                                AnimatedFileNative a10 = AnimatedFileNative.a(file.getAbsolutePath(), iArr6, 0, 0L, null, false);
                                if (a10 != null && iArr6[z14 ? 1 : 0] > 0 && iArr6[i23] > 0 && iArr6[4] > 0) {
                                    animatedFileNativeArr2[i22] = a10;
                                    iArr5[i22] = iArr6;
                                    int i24 = iArr6[5];
                                    if (i24 <= 0) {
                                        i24 = 30;
                                    }
                                    iArr2[i22] = i24;
                                    iArr[i22] = z13 ? Math.max(i23, (int) Math.ceil((iArr6[4] * i24) / 1000.0f)) : 1;
                                } else if (a10 != null) {
                                    a10.f();
                                }
                            } else if (file != null) {
                                RLottieNative a11 = RLottieNative.a(file.getAbsolutePath(), null, null, null, 0, null);
                                rLottieNativeArr2[i22] = a11;
                                if (a11 != null) {
                                    iArr[i22] = z13 ? Math.max(1, a11.a[z14 ? 1 : 0]) : 1;
                                    iArr2[i22] = Math.max(1, rLottieNativeArr2[i22].a[1]);
                                }
                            }
                            i10 += iArr[i22];
                            i22++;
                            z11 = z14 ? 1 : 0;
                            r7 = 1;
                        } catch (Throwable th2) {
                            th = th2;
                            rLottieNativeArr = rLottieNativeArr2;
                            animatedFileNativeArr = animatedFileNativeArr2;
                            bitmap = null;
                            try {
                                FileLog.e(th);
                                lVar = null;
                                it = jVar2.c.values().iterator();
                                while (it.hasNext()) {
                                }
                                AndroidUtilities.runOnUIThread(new c(21, jVar2, lVar));
                                return;
                            } finally {
                                if (bitmap != null) {
                                    bitmap.recycle();
                                }
                                for (int i25 = 0; i25 < size2; i25++) {
                                    RLottieNative rLottieNative = rLottieNativeArr[i25];
                                    if (rLottieNative != null) {
                                        rLottieNative.d();
                                    }
                                }
                                for (int i26 = 0; i26 < size2; i26++) {
                                    AnimatedFileNative animatedFileNative = animatedFileNativeArr[i26];
                                    if (animatedFileNative != null) {
                                        animatedFileNative.f();
                                    }
                                }
                            }
                        }
                    }
                    z10 = z11;
                    b10 = e1.b(i10, i21, 48);
                } catch (Throwable th3) {
                    th = th3;
                }
                if (b10 == 0) {
                    for (int i27 = z10 ? 1 : 0; i27 < size2; i27++) {
                        RLottieNative rLottieNative2 = rLottieNativeArr2[i27];
                        if (rLottieNative2 != null) {
                            rLottieNative2.d();
                        }
                    }
                    for (int i28 = z10 ? 1 : 0; i28 < size2; i28++) {
                        AnimatedFileNative animatedFileNative2 = animatedFileNativeArr2[i28];
                        if (animatedFileNative2 != null) {
                            animatedFileNative2.f();
                        }
                    }
                } else {
                    int i29 = b10 + 4;
                    try {
                        max = Math.max(1, (int) Math.ceil(Math.sqrt(Math.max(1, i10))));
                        long j11 = b10;
                        a2 = e.a(max * i29, (((i10 + max) - 1) / max) * i29, j11 * j11 * 4);
                    } catch (Throwable th4) {
                        th = th4;
                        rLottieNativeArr = rLottieNativeArr2;
                        animatedFileNativeArr = animatedFileNativeArr2;
                        bitmap = null;
                        FileLog.e(th);
                        lVar = null;
                        it = jVar2.c.values().iterator();
                        while (it.hasNext()) {
                        }
                        AndroidUtilities.runOnUIThread(new c(21, jVar2, lVar));
                        return;
                    }
                    if (a2 != null) {
                        a2.setHasMipMap(z10);
                        Canvas canvas = new Canvas(a2);
                        Bitmap createBitmap = Bitmap.createBitmap(b10, b10, Bitmap.Config.ARGB_8888);
                        Paint paint = new Paint(2);
                        Rect rect = new Rect();
                        HashMap hashMap2 = new HashMap();
                        rLottieNativeArr = rLottieNativeArr2;
                        int i30 = 0;
                        int i31 = 0;
                        bitmap = null;
                        while (i30 < size2) {
                            try {
                                ArrayList arrayList5 = arrayList4;
                                zh.k kVar3 = (zh.k) arrayList4.get(i30);
                                if (rLottieNativeArr[i30] != null) {
                                    i11 = i30;
                                    animatedFileNativeArr = animatedFileNativeArr2;
                                    int i32 = 0;
                                    while (i32 < iArr[i11]) {
                                        try {
                                            int i33 = i31 + i32;
                                            rLottieNativeArr[i11].c(i32, createBitmap, true);
                                            canvas.drawBitmap(createBitmap, ((i33 % max) * i29) + 2, ((i33 / max) * i29) + 2, (Paint) null);
                                            i32++;
                                            iArr5 = iArr5;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            FileLog.e(th);
                                            lVar = null;
                                            it = jVar2.c.values().iterator();
                                            while (it.hasNext()) {
                                            }
                                            AndroidUtilities.runOnUIThread(new c(21, jVar2, lVar));
                                            return;
                                        }
                                    }
                                    iArr3 = iArr5;
                                    bitmap2 = createBitmap;
                                    i12 = i32;
                                } else {
                                    i11 = i30;
                                    animatedFileNativeArr = animatedFileNativeArr2;
                                    iArr3 = iArr5;
                                    if (animatedFileNativeArr[i11] != null) {
                                        int[] iArr7 = iArr3[i11];
                                        if (bitmap != null && bitmap.getWidth() == iArr7[0] && bitmap.getHeight() == iArr7[1]) {
                                            iArr4 = iArr7;
                                            Bitmap bitmap5 = bitmap;
                                            int i34 = -1;
                                            i13 = 0;
                                            while (i13 < iArr[i11]) {
                                                try {
                                                    bitmap2 = createBitmap;
                                                    bitmap3 = bitmap5;
                                                    if (animatedFileNativeArr[i11].c(bitmap5, false, 0.0f, 0.0f, false) != 0) {
                                                        if (i13 > 0) {
                                                            try {
                                                                if (iArr4[3] <= i34) {
                                                                }
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                bitmap = bitmap3;
                                                                FileLog.e(th);
                                                                lVar = null;
                                                                it = jVar2.c.values().iterator();
                                                                while (it.hasNext()) {
                                                                }
                                                                AndroidUtilities.runOnUIThread(new c(21, jVar2, lVar));
                                                                return;
                                                            }
                                                        }
                                                        int i35 = iArr4[3];
                                                        int i36 = i31 + i13;
                                                        int i37 = ((i36 % max) * i29) + 2;
                                                        int i38 = ((i36 / max) * i29) + 2;
                                                        int i39 = i13;
                                                        rect.set(i37, i38, i37 + b10, i38 + b10);
                                                        canvas.drawBitmap(bitmap3, (Rect) null, rect, paint);
                                                        i13 = i39 + 1;
                                                        i34 = i35;
                                                        bitmap5 = bitmap3;
                                                        createBitmap = bitmap2;
                                                    }
                                                    i14 = i13;
                                                    i12 = i14;
                                                    bitmap = bitmap3;
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    bitmap3 = bitmap5;
                                                }
                                            }
                                            bitmap2 = createBitmap;
                                            i14 = i13;
                                            bitmap3 = bitmap5;
                                            i12 = i14;
                                            bitmap = bitmap3;
                                        }
                                        iArr4 = iArr7;
                                        bitmap = Bitmap.createBitmap(iArr7[0], iArr7[1], Bitmap.Config.ARGB_8888);
                                        Bitmap bitmap52 = bitmap;
                                        int i342 = -1;
                                        i13 = 0;
                                        while (i13 < iArr[i11]) {
                                        }
                                        bitmap2 = createBitmap;
                                        i14 = i13;
                                        bitmap3 = bitmap52;
                                        i12 = i14;
                                        bitmap = bitmap3;
                                    } else {
                                        bitmap2 = createBitmap;
                                        i12 = 0;
                                    }
                                }
                                if (i12 == 0 && (bitmap4 = kVar3.d) != null && !bitmap4.isRecycled()) {
                                    int i40 = ((i31 % max) * i29) + 2;
                                    int i41 = ((i31 / max) * i29) + 2;
                                    rect.set(i40, i41, i40 + b10, i41 + b10);
                                    canvas.drawBitmap(kVar3.d, (Rect) null, rect, paint);
                                }
                                hashMap2.put(Long.valueOf(kVar3.a), new zh.i(i31, Math.max(1, i12), i12 > 1 ? iArr2[i11] : 1));
                                i31 += iArr[i11];
                                i30 = i11 + 1;
                                arrayList4 = arrayList5;
                                animatedFileNativeArr2 = animatedFileNativeArr;
                                iArr5 = iArr3;
                                createBitmap = bitmap2;
                            } catch (Throwable th8) {
                                th = th8;
                                animatedFileNativeArr = animatedFileNativeArr2;
                            }
                        }
                        animatedFileNativeArr = animatedFileNativeArr2;
                        createBitmap.recycle();
                        l lVar2 = new l(a2, b10, max, hashMap2);
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        for (int i42 = 0; i42 < size2; i42++) {
                            RLottieNative rLottieNative3 = rLottieNativeArr[i42];
                            if (rLottieNative3 != null) {
                                rLottieNative3.d();
                            }
                        }
                        for (int i43 = 0; i43 < size2; i43++) {
                            AnimatedFileNative animatedFileNative3 = animatedFileNativeArr[i43];
                            if (animatedFileNative3 != null) {
                                animatedFileNative3.f();
                            }
                        }
                        lVar = lVar2;
                        it = jVar2.c.values().iterator();
                        while (it.hasNext()) {
                            ((Bitmap) it.next()).recycle();
                        }
                        AndroidUtilities.runOnUIThread(new c(21, jVar2, lVar));
                        return;
                    }
                    for (int i44 = z10 ? 1 : 0; i44 < size2; i44++) {
                        RLottieNative rLottieNative4 = rLottieNativeArr2[i44];
                        if (rLottieNative4 != null) {
                            rLottieNative4.d();
                        }
                    }
                    for (int i45 = z10 ? 1 : 0; i45 < size2; i45++) {
                        AnimatedFileNative animatedFileNative4 = animatedFileNativeArr2[i45];
                        if (animatedFileNative4 != null) {
                            animatedFileNative4.f();
                        }
                    }
                }
                lVar = null;
                it = jVar2.c.values().iterator();
                while (it.hasNext()) {
                }
                AndroidUtilities.runOnUIThread(new c(21, jVar2, lVar));
                return;
            case 21:
                zh.j jVar3 = (zh.j) this.b;
                l lVar3 = (l) this.c;
                if (!jVar3.n) {
                    jVar3.h.run(lVar3);
                    return;
                } else {
                    if (lVar3 != null) {
                        e.c(lVar3.a);
                        return;
                    }
                    return;
                }
            case 22:
                zh.x xVar = (zh.x) this.b;
                if (((TLRPC.Document) this.c) != null) {
                    xVar.e();
                    return;
                } else {
                    xVar.getClass();
                    return;
                }
            case 23:
                z zVar = (z) this.b;
                a0 a0Var = (a0) this.c;
                zVar.w = true;
                if (!zVar.n) {
                    zVar.h.run(a0Var);
                    return;
                } else {
                    if (a0Var != null) {
                        e.c(a0Var.a);
                        return;
                    }
                    return;
                }
            case 24:
                z zVar2 = (z) this.b;
                Bitmap bitmap6 = (Bitmap) this.c;
                zVar2.v = true;
                if (zVar2.n) {
                    if (bitmap6 != null) {
                        bitmap6.recycle();
                        return;
                    }
                    return;
                } else {
                    if (bitmap6 != null) {
                        zVar2.f.run(bitmap6);
                        return;
                    }
                    return;
                }
            case 25:
                d0 d0Var = (d0) this.b;
                xf.c cVar4 = (xf.c) this.c;
                if (d0Var.S) {
                    return;
                }
                d0Var.d();
                le.b bVar6 = d0Var.a;
                String str2 = (String) cVar4.a;
                m0 m0Var = (m0) bVar6.b;
                if (m0Var.getParentActivity() != null) {
                    pf.d.r(m0Var.getParentActivity(), str2);
                    return;
                }
                return;
            case 26:
                s0 s0Var = (s0) this.b;
                xf.c cVar5 = (xf.c) this.c;
                d0 d0Var2 = (d0) s0Var.b;
                if (d0Var2.h0 || d0Var2.S || d0Var2.R) {
                    return;
                }
                d0Var2.h0 = true;
                d0Var2.d0 = false;
                d0Var2.performHapticFeedback(3, 2);
                PointF[] pointFArr = (PointF[]) cVar5.b;
                r7 = pointFArr.length < 3 ? 0 : 1;
                if (r7 != 0) {
                    d0Var2.i0 = pointFArr;
                    d0Var2.invalidate();
                }
                AndroidUtilities.runOnUIThread(new c(25, d0Var2, cVar5), r7 != 0 ? 450L : 0L);
                return;
            case 27:
                m0 m0Var2 = (m0) this.b;
                Bitmap bitmap7 = (Bitmap) this.c;
                File file2 = new File(AndroidUtilities.getCacheDir(), "qr_code_" + System.currentTimeMillis() + ".png");
                try {
                    fileOutputStream = new FileOutputStream(file2);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                try {
                    z11 = bitmap7.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.close();
                    bitmap7.recycle();
                    if (z11) {
                        AndroidUtilities.runOnUIThread(new c(28, m0Var2, file2));
                        return;
                    }
                    return;
                } finally {
                }
            case 28:
                m0 m0Var3 = (m0) this.b;
                File file3 = (File) this.c;
                Activity parentActivity = m0Var3.getParentActivity();
                if (parentActivity == null) {
                    return;
                }
                MediaController.saveFile(file3.getAbsolutePath(), parentActivity, 0, file3.getName(), "image/png", new m(m0Var3, r7), false);
                return;
            default:
                zh.b1 b1Var = (zh.b1) this.b;
                g gVar2 = (g) this.c;
                h hVar = b1Var.s0;
                if (hVar.q == 2 && hVar.o < 1.0f) {
                    hVar.m = gVar2;
                    b1Var.invalidate();
                    return;
                }
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                b1Var.p2 = zh.b1.i(0.03f, 0.005f, b1Var.n2);
                b1Var.n2 = currentAnimationTimeMillis;
                g gVar3 = hVar.m;
                if (gVar3 == null) {
                    hVar.m = gVar2;
                    hVar.n = null;
                    hVar.o = 1.0f;
                    return;
                }
                if (hVar.o < 1.0f && (gVar = hVar.n) != null) {
                    gVar3 = gVar;
                }
                hVar.n = gVar3;
                hVar.m = gVar2;
                hVar.o = 0.0f;
                hVar.q = 0;
                hVar.p = System.currentTimeMillis();
                boolean[] zArr = hVar.s;
                if (zArr != null) {
                    int length = zArr.length;
                    int i46 = hVar.n.b;
                    if (length >= i46 * i46) {
                        Arrays.fill(zArr, false);
                        hVar.G = false;
                        return;
                    }
                }
                int i47 = hVar.n.b;
                hVar.s = new boolean[i47 * i47];
                hVar.G = false;
                return;
        }
    }
}
