package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vs(int i10, Object obj, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.b = i10;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v1, types: [org.telegram.ui.ht] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.String] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.Document document;
        ArrayList arrayList;
        ArrayList arrayList2;
        JSONObject jSONObject;
        int i10 = 2;
        f8.c cVar = null;
        ArrayList arrayList3 = null;
        boolean z10 = true;
        switch (this.a) {
            case 0:
                ?? r10 = (ht) this.d;
                org.telegram.ui.Components.jl0 jl0Var = (org.telegram.ui.Components.jl0) this.e;
                int i11 = this.b;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.c;
                if (r10.j == null) {
                    return;
                }
                jl0Var.setOnItemClickListener((org.telegram.ui.Components.zk0) null);
                jl0Var.requestDisallowInterceptTouchEvent(true);
                r10.j = null;
                r10.w(AndroidUtilities.findActivity(jl0Var.getContext()));
                r10.i = false;
                View view = r10.h;
                if (view instanceof org.telegram.ui.Cells.b8) {
                    org.telegram.ui.Cells.b8 b8Var = (org.telegram.ui.Cells.b8) view;
                    TLRPC.Document sticker = b8Var.getSticker();
                    SendMessagesHelper.ImportingSticker stickerPath = b8Var.getStickerPath();
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(b8Var.getSticker(), null, Integer.valueOf(r10.r));
                    ft ftVar = r10.l;
                    r10.t(sticker, stickerPath, findAnimatedEmojiEmoticon, ftVar != null ? ftVar.E(false) : null, null, i11, b8Var.y, b8Var.getParentObject(), r10.c0, 0);
                    b8Var.setScaled(true);
                } else if (view instanceof org.telegram.ui.Cells.z7) {
                    org.telegram.ui.Cells.z7 z7Var = (org.telegram.ui.Cells.z7) view;
                    TLRPC.Document sticker2 = z7Var.getSticker();
                    ft ftVar2 = r10.l;
                    r10.t(sticker2, null, null, ftVar2 != null ? ftVar2.E(false) : null, null, i11, false, z7Var.getParentObject(), c6Var, 0);
                    z7Var.setScaled(true);
                    r10.i = z7Var.h;
                } else if (view instanceof org.telegram.ui.Cells.d2) {
                    org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
                    TLRPC.Document document2 = d2Var.getDocument();
                    ft ftVar3 = r10.l;
                    r10.t(document2, null, null, ftVar3 != null ? ftVar3.E(true) : null, d2Var.getBotInlineResult(), i11, false, d2Var.getBotInlineResult() != null ? d2Var.getInlineBot() : d2Var.getParentObject(), c6Var, 0);
                    if (i11 != 1 || r10.m) {
                        d2Var.setScaled(true);
                    }
                } else if (view instanceof org.telegram.ui.Components.av) {
                    TLRPC.Document document3 = ((org.telegram.ui.Components.av) view).getDocument();
                    if (document3 == null) {
                        return;
                    } else {
                        r10.t(document3, null, MessageObject.findAnimatedEmojiEmoticon(document3, null, Integer.valueOf(r10.r)), null, null, i11, false, null, c6Var, 0);
                    }
                } else if (view instanceof org.telegram.ui.Components.ny) {
                    org.telegram.ui.Components.y5 span = ((org.telegram.ui.Components.ny) view).getSpan();
                    if (span != null) {
                        TLRPC.Document document4 = span.document;
                        if (document4 == null) {
                            document4 = org.telegram.ui.Components.p5.f(r10.r, span.getDocumentId());
                        }
                        document = document4;
                    } else {
                        document = null;
                    }
                    if (document == null) {
                        return;
                    } else {
                        r10.t(document, null, MessageObject.findAnimatedEmojiEmoticon(document, null, Integer.valueOf(r10.r)), null, null, i11, false, null, c6Var, 0);
                    }
                } else {
                    if (!(view instanceof org.telegram.ui.Components.ey0)) {
                        return;
                    }
                    Drawable drawable = ((org.telegram.ui.Components.ey0) view).b;
                    TLRPC.Document document5 = drawable instanceof org.telegram.ui.Components.p5 ? ((org.telegram.ui.Components.p5) drawable).e : null;
                    if (document5 == null) {
                        return;
                    } else {
                        r10.t(document5, null, MessageObject.findAnimatedEmojiEmoticon(document5, null, Integer.valueOf(r10.r)), null, null, i11, false, null, c6Var, 0);
                    }
                }
                try {
                    r10.h.performHapticFeedback(0, 2);
                } catch (Exception unused) {
                }
                ft ftVar4 = r10.l;
                if (ftVar4 != null) {
                    ftVar4.s();
                    return;
                }
                return;
            case 1:
                String str = (String) this.d;
                int i12 = this.b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.e;
                org.telegram.ui.ActionBar.c6 c6Var2 = (org.telegram.ui.ActionBar.c6) this.c;
                AndroidUtilities.addToClipboard(str);
                if (i12 == 1) {
                    b.n(R.string.PhoneCopied, new org.telegram.ui.Components.tc(f3Var.getContainer(), c6Var2));
                    return;
                } else {
                    new org.telegram.ui.Components.tc(f3Var.getContainer(), c6Var2).k(false).j();
                    return;
                }
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                int i13 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                fy fyVar = (fy) this.c;
                Pattern pattern = LaunchActivity.x1;
                launchActivity.getClass();
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putBoolean("scrollToTopOnResume", true);
                bundle.putLong("chat_id", chat.id);
                if (MessagesController.getInstance(launchActivity.K).checkCanOpenChat(bundle, fyVar)) {
                    launchActivity.q0(new tn(bundle), true, false);
                    return;
                }
                return;
            case 3:
                mb0 mb0Var = (mb0) this.d;
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                int i14 = this.b;
                String str2 = (String) this.c;
                mb0Var.a();
                if (i14 == 1) {
                    arrayList = notificationsSettingsActivity.d;
                } else {
                    if (i14 != 0) {
                        if (i14 == 4) {
                            notificationsSettingsActivity.getClass();
                            arrayList2 = null;
                        } else if (i14 == 3) {
                            arrayList3 = notificationsSettingsActivity.h;
                            arrayList2 = notificationsSettingsActivity.n;
                        } else {
                            arrayList = notificationsSettingsActivity.f;
                        }
                        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = new NotificationsCustomSettingsActivity(i14, arrayList3, arrayList2, false);
                        notificationsCustomSettingsActivity.C = true;
                        notificationsCustomSettingsActivity.l0(false);
                        mb0Var.n(notificationsCustomSettingsActivity, false);
                        if ("show".equalsIgnoreCase(str2)) {
                            mb0Var.o("showRow");
                        }
                        if ("new".equalsIgnoreCase(str2)) {
                            mb0Var.o("newRow");
                        }
                        if ("important".equalsIgnoreCase(str2)) {
                            mb0Var.o("importantRow");
                        }
                        if ("messages".equalsIgnoreCase(str2)) {
                            mb0Var.o("messagesRow");
                        }
                        if ("stories".equalsIgnoreCase(str2)) {
                            mb0Var.o("storiesRow");
                        }
                        if ("preview".equalsIgnoreCase(str2)) {
                            mb0Var.o("previewRow");
                        }
                        if ("show-sender".equalsIgnoreCase(str2)) {
                            mb0Var.o("showSenderRow");
                        }
                        if ("sound".equalsIgnoreCase(str2)) {
                            mb0Var.o("soundRow");
                        }
                        if ("add-exception".equalsIgnoreCase(str2)) {
                            mb0Var.o("addExceptionRow");
                        }
                        if ("delete-exceptions".equalsIgnoreCase(str2)) {
                            mb0Var.o("deleteExceptionsRow");
                        }
                        if ("light-color".equalsIgnoreCase(str2)) {
                            mb0Var.o("lightColorRow");
                        }
                        if ("vibrate".equalsIgnoreCase(str2)) {
                            mb0Var.o("vibrateRow");
                        }
                        if ("popup".equalsIgnoreCase(str2)) {
                            mb0Var.o("popupRow");
                        }
                        if ("priority".equalsIgnoreCase(str2)) {
                            return;
                        }
                        mb0Var.o("priorityRow");
                        return;
                    }
                    arrayList = notificationsSettingsActivity.e;
                }
                arrayList3 = arrayList;
                arrayList2 = null;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = new NotificationsCustomSettingsActivity(i14, arrayList3, arrayList2, false);
                notificationsCustomSettingsActivity2.C = true;
                notificationsCustomSettingsActivity2.l0(false);
                mb0Var.n(notificationsCustomSettingsActivity2, false);
                if ("show".equalsIgnoreCase(str2)) {
                }
                if ("new".equalsIgnoreCase(str2)) {
                }
                if ("important".equalsIgnoreCase(str2)) {
                }
                if ("messages".equalsIgnoreCase(str2)) {
                }
                if ("stories".equalsIgnoreCase(str2)) {
                }
                if ("preview".equalsIgnoreCase(str2)) {
                }
                if ("show-sender".equalsIgnoreCase(str2)) {
                }
                if ("sound".equalsIgnoreCase(str2)) {
                }
                if ("add-exception".equalsIgnoreCase(str2)) {
                }
                if ("delete-exceptions".equalsIgnoreCase(str2)) {
                }
                if ("light-color".equalsIgnoreCase(str2)) {
                }
                if ("vibrate".equalsIgnoreCase(str2)) {
                }
                if ("popup".equalsIgnoreCase(str2)) {
                }
                if ("priority".equalsIgnoreCase(str2)) {
                }
            case 4:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = (NotificationsCustomSettingsActivity) this.d;
                View view2 = (View) this.e;
                String str3 = (String) this.c;
                int i15 = this.b;
                ArrayList arrayList4 = notificationsCustomSettingsActivity3.E;
                int[] iArr = notificationsCustomSettingsActivity3.y;
                if (!(view2 instanceof org.telegram.ui.Cells.y9)) {
                    notificationsCustomSettingsActivity3.l0(true);
                    return;
                }
                String string = LocaleController.getString(iArr[Utilities.clamp(notificationsCustomSettingsActivity3.getNotificationsSettings().getInt(str3, 0), iArr.length - 1, 0)]);
                if (i15 >= 0 && i15 < arrayList4.size()) {
                    ((vj0) arrayList4.get(i15)).f = string;
                }
                ((org.telegram.ui.Cells.y9) view2).c(LocaleController.getString("Vibrate", R.string.Vibrate), string, true, true);
                return;
            case 5:
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.e;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.c;
                int i16 = this.b;
                pk0.a = null;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                if (z0Var != null) {
                    boolean z11 = org.telegram.ui.web.z0.I0;
                    try {
                        jSONObject = new JSONObject();
                    } catch (Exception unused2) {
                        jSONObject = null;
                    }
                    z0Var.v("oauth_result_failed", jSONObject);
                }
                if (tL_messages_requestUrlAuth == null || TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                    return;
                }
                TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                ConnectionsManager.getInstance(i16).sendRequest(tL_messages_declineUrlAuth, null);
                return;
            case 6:
                PasskeysActivity passkeysActivity = (PasskeysActivity) this.d;
                TL_account.Passkey passkey = (TL_account.Passkey) this.e;
                String str4 = (String) this.c;
                int i17 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                alertDialog$Builder.a.N = LocaleController.getString(R.string.PasskeyDeleteTitle);
                alertDialog$Builder.a.P = LocaleController.getString(R.string.PasskeyDeleteText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new eg.b0(passkeysActivity, passkey, str4, i17, 8));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 7:
                PhotoViewer photoViewer = (PhotoViewer) this.d;
                ImageReceiver.BitmapHolder bitmapHolder = (ImageReceiver.BitmapHolder) this.e;
                int i18 = this.b;
                String str5 = (String) this.c;
                Drawable[] drawableArr = PhotoViewer.P8;
                try {
                    try {
                        f8.b bVar = new f8.b(ApplicationLoader.applicationContext);
                        bVar.c(0);
                        bVar.b(0);
                        bVar.c = false;
                        cVar = bVar.a();
                        if (cVar.c.k()) {
                            androidx.biometric.e eVar = new androidx.biometric.e(5);
                            Bitmap bitmap = bitmapHolder.bitmap;
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            eVar.d = bitmap;
                            c8.a aVar = (c8.a) eVar.b;
                            aVar.a = width;
                            aVar.b = height;
                            aVar.c = i18;
                            if (cVar.Q(eVar).size() == 0) {
                                z10 = false;
                            }
                            AndroidUtilities.runOnUIThread(new mp0(photoViewer, str5, z10, i10));
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("face detection is not operational");
                            }
                            AndroidUtilities.runOnUIThread(new xe0(photoViewer, bitmapHolder, str5, 17));
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        if (0 == 0) {
                            return;
                        }
                    }
                    cVar.N();
                    return;
                } catch (Throwable th2) {
                    if (0 != 0) {
                        r7.N();
                    }
                    throw th2;
                }
            case 8:
                cs0 cs0Var = (cs0) this.d;
                FrameLayout frameLayout = (FrameLayout) this.e;
                a0.h hVar = (a0.h) this.c;
                org.telegram.ui.Components.tc.v(cs0Var.Z0.y, null, frameLayout, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, this.b, -115203550, -1, 1500, false, null).j();
                return;
            case 9:
                org.telegram.ui.Components.c5.f0(this.b, (TLRPC.TL_error) this.d, (org.telegram.ui.ActionBar.o2) this.e, (TLRPC.TL_payments_assignPlayMarketTransaction) this.c, new Object[0]);
                return;
            case 10:
                fd1 fd1Var = (fd1) this.d;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.e;
                int i19 = this.b;
                tn tnVar = (tn) this.c;
                fd1Var.getClass();
                int i20 = 0;
                while (i20 < tL_messageMediaToDo.todo.list.size()) {
                    if (tL_messageMediaToDo.todo.list.get(i20).id == i19) {
                        tL_messageMediaToDo.todo.list.remove(i20);
                        i20--;
                    }
                    i20++;
                }
                int i21 = 0;
                while (i21 < tL_messageMediaToDo.completions.size()) {
                    if (tL_messageMediaToDo.completions.get(i21).id == i19) {
                        tL_messageMediaToDo.completions.remove(i21);
                        if (tL_messageMediaToDo.completions.isEmpty()) {
                            tL_messageMediaToDo.flags &= -2;
                        }
                        i21--;
                    }
                    i21++;
                }
                fd1Var.C.messageOwner.media = tL_messageMediaToDo;
                tnVar.getSendMessagesHelper().editMessage(fd1Var.C, null, null, null, null, null, null, false, false, null);
                tnVar.Wc(false);
                fd1Var.c(false);
                return;
            case 11:
                ld1 ld1Var = (ld1) this.d;
                int i22 = this.b;
                ArrayList arrayList5 = (ArrayList) this.e;
                ArrayList arrayList6 = (ArrayList) this.c;
                md1 md1Var = ld1Var.h;
                ArrayList arrayList7 = ld1Var.d;
                ArrayList arrayList8 = ld1Var.c;
                if (i22 != ld1Var.f) {
                    return;
                }
                arrayList8.clear();
                arrayList7.clear();
                if (arrayList5 != null) {
                    arrayList8.addAll(arrayList5);
                    arrayList7.addAll(arrayList6);
                }
                ld1Var.l();
                if (arrayList8.isEmpty()) {
                    md1Var.r.setVisibility(0);
                    return;
                } else {
                    md1Var.r.setVisibility(8);
                    return;
                }
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.yw0(MessagesStorage.getInstance(this.b).getUsers((ArrayList) this.d), (HashMap) this.e, (Utilities.Callback) this.c, 19));
                return;
            case 13:
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.d;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.e;
                int i23 = this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                if (userFull == null) {
                    sVar.run(Boolean.FALSE, "cancelled");
                    return;
                } else {
                    ph.w3.b(i23, user, userFull, sVar);
                    return;
                }
            case 14:
                rf.a0 a0Var = (rf.a0) this.d;
                ArrayList arrayList9 = (ArrayList) this.e;
                int i24 = this.b;
                org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) this.c;
                ArrayList arrayList10 = a0Var.G;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - a0Var.j0 < 300) {
                    return;
                }
                a0Var.j0 = elapsedRealtime;
                int size = arrayList10.size();
                int size2 = arrayList9.size();
                int i25 = (arrayList9.isEmpty() && arrayList10.isEmpty()) ? 0 : size2 + size;
                int min = Math.min(3, size2) + size;
                int h = a0Var.h();
                boolean z12 = a0Var.C0;
                boolean z13 = h > ((z12 ? min : i25) + i24) + 1;
                f2.l lVar = a0Var.e0;
                if (lVar != null) {
                    lVar.c = z13 ? 45L : 200L;
                    lVar.d = z13 ? 80L : 200L;
                    lVar.l = z13 ? 270L : 0L;
                }
                a0Var.C0 = !z12;
                s3Var.setRightTextMargin(16);
                String string2 = LocaleController.getString(a0Var.C0 ? R.string.ShowMore : R.string.ShowLess);
                boolean z14 = a0Var.C0;
                org.telegram.ui.Cells.r3 r3Var = s3Var.b;
                r3Var.c(string2, true, z14);
                r3Var.setVisibility(0);
                a0Var.k0 = null;
                View view3 = (View) s3Var.getParent();
                if (view3 instanceof RecyclerView) {
                    RecyclerView recyclerView = (RecyclerView) view3;
                    int i26 = (!a0Var.C0 ? i24 + min : i25 + i24) + 1;
                    int i27 = 0;
                    while (true) {
                        if (i27 < recyclerView.getChildCount()) {
                            View childAt = recyclerView.getChildAt(i27);
                            if (RecyclerView.R(childAt) == i26) {
                                a0Var.k0 = childAt;
                            } else {
                                i27++;
                            }
                        }
                    }
                }
                int i28 = i24 + min;
                int i29 = i28 + 1;
                int max = Math.max(0, size2 - 3);
                if (a0Var.C0) {
                    a0Var.t(i29, max);
                    if (z13) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i8(a0Var, i28, 29), 350L);
                    } else {
                        a0Var.m(i28);
                    }
                } else {
                    a0Var.m(i28);
                    a0Var.s(i29, max);
                }
                org.telegram.ui.web.y yVar = a0Var.l0;
                if (yVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(yVar);
                }
                if (!z13) {
                    a0Var.i0 = false;
                    return;
                }
                a0Var.i0 = true;
                org.telegram.ui.web.y yVar2 = new org.telegram.ui.web.y(22, a0Var, view3);
                a0Var.l0 = yVar2;
                AndroidUtilities.runOnUIThread(yVar2, 400L);
                return;
            case 15:
                rf.a0 a0Var2 = (rf.a0) this.d;
                int i30 = this.b;
                TLObject tLObject = (TLObject) this.e;
                String str6 = (String) this.c;
                int i31 = a0Var2.o0;
                if (i30 == a0Var2.Z && (tLObject instanceof TLRPC.messages_Messages)) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    a0Var2.v = messages_messages instanceof TLRPC.TL_messages_messages ? ((TLRPC.TL_messages_messages) messages_messages).messages.size() : messages_messages instanceof TLRPC.TL_messages_messagesSlice ? ((TLRPC.TL_messages_messagesSlice) messages_messages).count : 0;
                    a0Var2.w = messages_messages.next_rate;
                    a0Var2.y = str6;
                    MessagesController.getInstance(i31).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i31).putChats(messages_messages.chats, false);
                    for (int i32 = 0; i32 < messages_messages.messages.size(); i32++) {
                        a0Var2.x.add(new MessageObject(i31, messages_messages.messages.get(i32), false, true));
                    }
                    qx qxVar = a0Var2.Q;
                    if (qxVar != null) {
                        qxVar.d(a0Var2.z0 > 0, true);
                    }
                    a0Var2.l();
                    return;
                }
                return;
            default:
                sf.s1 s1Var = (sf.s1) this.d;
                ArrayList arrayList11 = s1Var.b;
                TLRPC.Message message = (TLRPC.Message) this.e;
                String str7 = (String) this.c;
                int i33 = this.b;
                int i34 = s1Var.a;
                if ((message.flags & TLObject.FLAG_30) != 0) {
                    sf.r1 c3 = s1Var.c(message.quick_reply_shortcut_id);
                    if (c3 == null) {
                        sf.r1 r1Var = new sf.r1();
                        r1Var.a = message.quick_reply_shortcut_id;
                        r1Var.d = message.id;
                        MessageObject messageObject = new MessageObject(i34, message, false, true);
                        r1Var.e = messageObject;
                        messageObject.generateThumbs(false);
                        if (str7 != null) {
                            r1Var.b = str7;
                            s1Var.a(str7);
                        }
                        r1Var.e.applyQuickReply(str7, i33);
                        r1Var.f = 1;
                        arrayList11.add(r1Var);
                        for (int i35 = 0; i35 < arrayList11.size(); i35++) {
                            ((sf.r1) arrayList11.get(i35)).c = i35;
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i34);
                        messagesStorage.getStorageQueue().postRunnable(new sf.o1(0, messagesStorage, r1Var));
                        NotificationCenter.getInstance(i34).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                    } else {
                        int i36 = c3.d;
                        int i37 = message.id;
                        if (i36 == i37) {
                            c3.d = i37;
                            MessageObject messageObject2 = new MessageObject(i34, message, false, true);
                            c3.e = messageObject2;
                            messageObject2.generateThumbs(false);
                            s1Var.l();
                            NotificationCenter.getInstance(i34).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        } else if ((message.flags & 32768) == 0) {
                            c3.f++;
                            s1Var.l();
                            NotificationCenter.getInstance(i34).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        }
                    }
                }
                if (str7 == null && i33 == 0) {
                    ArrayList<TLRPC.Message> arrayList12 = new ArrayList<>();
                    arrayList12.add(message);
                    MessagesStorage.getInstance(i34).putMessages(arrayList12, true, true, false, DownloadController.getInstance(i34).getAutodownloadMask(), 5, message.quick_reply_shortcut_id);
                    long clientUserId = UserConfig.getInstance(i34).getClientUserId();
                    ArrayList<MessageObject> arrayList13 = new ArrayList<>();
                    arrayList13.add(new MessageObject(i34, message, true, true));
                    MessagesController.getInstance(i34).updateInterfaceWithMessages(clientUserId, arrayList13, 5);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ vs(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.e = obj2;
        this.c = obj3;
    }

    public /* synthetic */ vs(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.c = obj3;
    }

    public /* synthetic */ vs(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.b = i10;
    }
}
