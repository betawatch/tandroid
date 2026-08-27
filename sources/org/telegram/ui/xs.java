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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xs(int i10, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.a = 9;
        this.b = i10;
        this.d = tL_error;
        this.e = n2Var;
        this.c = tL_payments_assignPlayMarketTransaction;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:284:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v1, types: [org.telegram.ui.kt] */
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
        e8.c cVar = null;
        ArrayList arrayList3 = null;
        boolean z10 = true;
        switch (this.a) {
            case 0:
                ?? r10 = (kt) this.d;
                org.telegram.ui.Components.zk0 zk0Var = (org.telegram.ui.Components.zk0) this.e;
                int i11 = this.b;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.c;
                if (r10.j == null) {
                    return;
                }
                zk0Var.setOnItemClickListener((org.telegram.ui.Components.pk0) null);
                zk0Var.requestDisallowInterceptTouchEvent(true);
                r10.j = null;
                r10.w(AndroidUtilities.findActivity(zk0Var.getContext()));
                r10.i = false;
                View view = r10.h;
                if (view instanceof org.telegram.ui.Cells.a8) {
                    org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view;
                    TLRPC.Document sticker = a8Var.getSticker();
                    SendMessagesHelper.ImportingSticker stickerPath = a8Var.getStickerPath();
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(a8Var.getSticker(), null, Integer.valueOf(r10.r));
                    ht htVar = r10.l;
                    r10.t(sticker, stickerPath, findAnimatedEmojiEmoticon, htVar != null ? htVar.F(false) : null, null, i11, a8Var.y, a8Var.getParentObject(), r10.c0, 0);
                    a8Var.setScaled(true);
                } else if (view instanceof org.telegram.ui.Cells.y7) {
                    org.telegram.ui.Cells.y7 y7Var = (org.telegram.ui.Cells.y7) view;
                    TLRPC.Document sticker2 = y7Var.getSticker();
                    ht htVar2 = r10.l;
                    r10.t(sticker2, null, null, htVar2 != null ? htVar2.F(false) : null, null, i11, false, y7Var.getParentObject(), c6Var, 0);
                    y7Var.setScaled(true);
                    r10.i = y7Var.h;
                } else if (view instanceof org.telegram.ui.Cells.d2) {
                    org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
                    TLRPC.Document document2 = d2Var.getDocument();
                    ht htVar3 = r10.l;
                    r10.t(document2, null, null, htVar3 != null ? htVar3.F(true) : null, d2Var.getBotInlineResult(), i11, false, d2Var.getBotInlineResult() != null ? d2Var.getInlineBot() : d2Var.getParentObject(), c6Var, 0);
                    if (i11 != 1 || r10.m) {
                        d2Var.setScaled(true);
                    }
                } else if (view instanceof org.telegram.ui.Components.tu) {
                    TLRPC.Document document3 = ((org.telegram.ui.Components.tu) view).getDocument();
                    if (document3 == null) {
                        return;
                    } else {
                        r10.t(document3, null, MessageObject.findAnimatedEmojiEmoticon(document3, null, Integer.valueOf(r10.r)), null, null, i11, false, null, c6Var, 0);
                    }
                } else if (view instanceof org.telegram.ui.Components.gy) {
                    org.telegram.ui.Components.t5 span = ((org.telegram.ui.Components.gy) view).getSpan();
                    if (span != null) {
                        TLRPC.Document document4 = span.document;
                        if (document4 == null) {
                            document4 = org.telegram.ui.Components.k5.f(r10.r, span.getDocumentId());
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
                    if (!(view instanceof org.telegram.ui.Components.vx0)) {
                        return;
                    }
                    Drawable drawable = ((org.telegram.ui.Components.vx0) view).b;
                    TLRPC.Document document5 = drawable instanceof org.telegram.ui.Components.k5 ? ((org.telegram.ui.Components.k5) drawable).e : null;
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
                ht htVar4 = r10.l;
                if (htVar4 != null) {
                    htVar4.s();
                    return;
                }
                return;
            case 1:
                String str = (String) this.d;
                int i12 = this.b;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.e;
                org.telegram.ui.ActionBar.c6 c6Var2 = (org.telegram.ui.ActionBar.c6) this.c;
                AndroidUtilities.addToClipboard(str);
                if (i12 == 1) {
                    org.telegram.messenger.rl.m(R.string.PhoneCopied, new org.telegram.ui.Components.mc(e3Var.getContainer(), c6Var2));
                    return;
                } else {
                    new org.telegram.ui.Components.mc(e3Var.getContainer(), c6Var2).k(false).j();
                    return;
                }
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                int i13 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                gy gyVar = (gy) this.c;
                Pattern pattern = LaunchActivity.x1;
                launchActivity.getClass();
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putBoolean("scrollToTopOnResume", true);
                bundle.putLong("chat_id", chat.id);
                if (MessagesController.getInstance(launchActivity.K).checkCanOpenChat(bundle, gyVar)) {
                    launchActivity.q0(new rn(bundle), true, false);
                    return;
                }
                return;
            case 3:
                ob0 ob0Var = (ob0) this.d;
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                int i14 = this.b;
                String str2 = (String) this.c;
                ob0Var.a();
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
                        ob0Var.n(notificationsCustomSettingsActivity, false);
                        if ("show".equalsIgnoreCase(str2)) {
                            ob0Var.o("showRow");
                        }
                        if ("new".equalsIgnoreCase(str2)) {
                            ob0Var.o("newRow");
                        }
                        if ("important".equalsIgnoreCase(str2)) {
                            ob0Var.o("importantRow");
                        }
                        if ("messages".equalsIgnoreCase(str2)) {
                            ob0Var.o("messagesRow");
                        }
                        if ("stories".equalsIgnoreCase(str2)) {
                            ob0Var.o("storiesRow");
                        }
                        if ("preview".equalsIgnoreCase(str2)) {
                            ob0Var.o("previewRow");
                        }
                        if ("show-sender".equalsIgnoreCase(str2)) {
                            ob0Var.o("showSenderRow");
                        }
                        if ("sound".equalsIgnoreCase(str2)) {
                            ob0Var.o("soundRow");
                        }
                        if ("add-exception".equalsIgnoreCase(str2)) {
                            ob0Var.o("addExceptionRow");
                        }
                        if ("delete-exceptions".equalsIgnoreCase(str2)) {
                            ob0Var.o("deleteExceptionsRow");
                        }
                        if ("light-color".equalsIgnoreCase(str2)) {
                            ob0Var.o("lightColorRow");
                        }
                        if ("vibrate".equalsIgnoreCase(str2)) {
                            ob0Var.o("vibrateRow");
                        }
                        if ("popup".equalsIgnoreCase(str2)) {
                            ob0Var.o("popupRow");
                        }
                        if ("priority".equalsIgnoreCase(str2)) {
                            return;
                        }
                        ob0Var.o("priorityRow");
                        return;
                    }
                    arrayList = notificationsSettingsActivity.e;
                }
                arrayList3 = arrayList;
                arrayList2 = null;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = new NotificationsCustomSettingsActivity(i14, arrayList3, arrayList2, false);
                notificationsCustomSettingsActivity2.C = true;
                notificationsCustomSettingsActivity2.l0(false);
                ob0Var.n(notificationsCustomSettingsActivity2, false);
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
                if (!(view2 instanceof org.telegram.ui.Cells.x9)) {
                    notificationsCustomSettingsActivity3.l0(true);
                    return;
                }
                String string = LocaleController.getString(iArr[Utilities.clamp(notificationsCustomSettingsActivity3.getNotificationsSettings().getInt(str3, 0), iArr.length - 1, 0)]);
                if (i15 >= 0 && i15 < arrayList4.size()) {
                    ((zj0) arrayList4.get(i15)).f = string;
                }
                ((org.telegram.ui.Cells.x9) view2).c(LocaleController.getString("Vibrate", R.string.Vibrate), string, true, true);
                return;
            case 5:
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.e;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.c;
                int i16 = this.b;
                tk0.a = null;
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
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new cg.a0(passkeysActivity, passkey, str4, i17, 8));
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
                        e8.b bVar = new e8.b(ApplicationLoader.applicationContext);
                        bVar.c(0);
                        bVar.b(0);
                        bVar.c = false;
                        cVar = bVar.a();
                        if (cVar.c.k()) {
                            a5.n nVar = new a5.n(5);
                            Bitmap bitmap = bitmapHolder.bitmap;
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            nVar.d = bitmap;
                            b8.b bVar2 = (b8.b) nVar.b;
                            bVar2.a = width;
                            bVar2.b = height;
                            bVar2.c = i18;
                            if (cVar.Q(nVar).size() == 0) {
                                z10 = false;
                            }
                            AndroidUtilities.runOnUIThread(new op0(photoViewer, str5, z10, i10));
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("face detection is not operational");
                            }
                            AndroidUtilities.runOnUIThread(new bf0(photoViewer, bitmapHolder, str5, 17));
                        }
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        if (0 == 0) {
                            return;
                        }
                    }
                    cVar.N();
                    return;
                } catch (Throwable th) {
                    if (0 != 0) {
                        r7.N();
                    }
                    throw th;
                }
            case 8:
                es0 es0Var = (es0) this.d;
                FrameLayout frameLayout = (FrameLayout) this.e;
                a0.h hVar = (a0.h) this.c;
                org.telegram.ui.Components.mc.v(es0Var.Z0.y, null, frameLayout, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, this.b, -115203550, -1, 1500, false, null).j();
                return;
            case 9:
                org.telegram.ui.Components.y4.f0(this.b, (TLRPC.TL_error) this.d, (org.telegram.ui.ActionBar.n2) this.e, (TLRPC.TL_payments_assignPlayMarketTransaction) this.c, new Object[0]);
                return;
            case 10:
                dd1 dd1Var = (dd1) this.d;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.e;
                int i19 = this.b;
                rn rnVar = (rn) this.c;
                dd1Var.getClass();
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
                dd1Var.C.messageOwner.media = tL_messageMediaToDo;
                rnVar.getSendMessagesHelper().editMessage(dd1Var.C, null, null, null, null, null, null, false, false, null);
                rnVar.Wc(false);
                dd1Var.c(false);
                return;
            case 11:
                kd1 kd1Var = (kd1) this.d;
                int i22 = this.b;
                ArrayList arrayList5 = (ArrayList) this.e;
                ArrayList arrayList6 = (ArrayList) this.c;
                ld1 ld1Var = kd1Var.h;
                ArrayList arrayList7 = kd1Var.d;
                ArrayList arrayList8 = kd1Var.c;
                if (i22 != kd1Var.f) {
                    return;
                }
                arrayList8.clear();
                arrayList7.clear();
                if (arrayList5 != null) {
                    arrayList8.addAll(arrayList5);
                    arrayList7.addAll(arrayList6);
                }
                kd1Var.l();
                if (arrayList8.isEmpty()) {
                    ld1Var.r.setVisibility(0);
                    return;
                } else {
                    ld1Var.r.setVisibility(8);
                    return;
                }
            case 12:
                pf.z zVar = (pf.z) this.d;
                ArrayList arrayList9 = (ArrayList) this.e;
                int i23 = this.b;
                org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) this.c;
                ArrayList arrayList10 = zVar.G;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - zVar.j0 < 300) {
                    return;
                }
                zVar.j0 = elapsedRealtime;
                int size = arrayList10.size();
                int size2 = arrayList9.size();
                int i24 = (arrayList9.isEmpty() && arrayList10.isEmpty()) ? 0 : size2 + size;
                int min = Math.min(3, size2) + size;
                int h = zVar.h();
                boolean z12 = zVar.C0;
                boolean z13 = h > ((z12 ? min : i24) + i23) + 1;
                f2.l lVar = zVar.e0;
                if (lVar != null) {
                    lVar.c = z13 ? 45L : 200L;
                    lVar.d = z13 ? 80L : 200L;
                    lVar.l = z13 ? 270L : 0L;
                }
                zVar.C0 = !z12;
                s3Var.setRightTextMargin(16);
                String string2 = LocaleController.getString(zVar.C0 ? R.string.ShowMore : R.string.ShowLess);
                boolean z14 = zVar.C0;
                org.telegram.ui.Cells.r3 r3Var = s3Var.b;
                r3Var.c(string2, true, z14);
                r3Var.setVisibility(0);
                zVar.k0 = null;
                View view3 = (View) s3Var.getParent();
                if (view3 instanceof RecyclerView) {
                    RecyclerView recyclerView = (RecyclerView) view3;
                    int i25 = (!zVar.C0 ? i23 + min : i24 + i23) + 1;
                    int i26 = 0;
                    while (true) {
                        if (i26 < recyclerView.getChildCount()) {
                            View childAt = recyclerView.getChildAt(i26);
                            if (RecyclerView.R(childAt) == i25) {
                                zVar.k0 = childAt;
                            } else {
                                i26++;
                            }
                        }
                    }
                }
                int i27 = i23 + min;
                int i28 = i27 + 1;
                int max = Math.max(0, size2 - 3);
                if (zVar.C0) {
                    zVar.t(i28, max);
                    if (z13) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.xl(zVar, i27, 26), 350L);
                    } else {
                        zVar.m(i27);
                    }
                } else {
                    zVar.m(i27);
                    zVar.s(i28, max);
                }
                zh1 zh1Var = zVar.l0;
                if (zh1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(zh1Var);
                }
                if (!z13) {
                    zVar.i0 = false;
                    return;
                }
                zVar.i0 = true;
                zh1 zh1Var2 = new zh1(14, zVar, view3);
                zVar.l0 = zh1Var2;
                AndroidUtilities.runOnUIThread(zh1Var2, 400L);
                return;
            case 13:
                pf.z zVar2 = (pf.z) this.d;
                int i29 = this.b;
                TLObject tLObject = (TLObject) this.e;
                String str6 = (String) this.c;
                int i30 = zVar2.o0;
                if (i29 == zVar2.Z && (tLObject instanceof TLRPC.messages_Messages)) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    zVar2.v = messages_messages instanceof TLRPC.TL_messages_messages ? ((TLRPC.TL_messages_messages) messages_messages).messages.size() : messages_messages instanceof TLRPC.TL_messages_messagesSlice ? ((TLRPC.TL_messages_messagesSlice) messages_messages).count : 0;
                    zVar2.w = messages_messages.next_rate;
                    zVar2.y = str6;
                    MessagesController.getInstance(i30).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i30).putChats(messages_messages.chats, false);
                    for (int i31 = 0; i31 < messages_messages.messages.size(); i31++) {
                        zVar2.x.add(new MessageObject(i30, messages_messages.messages.get(i31), false, true));
                    }
                    rx rxVar = zVar2.Q;
                    if (rxVar != null) {
                        rxVar.d(zVar2.z0 > 0, true);
                    }
                    zVar2.l();
                    return;
                }
                return;
            case 14:
                qf.q1 q1Var = (qf.q1) this.d;
                ArrayList arrayList11 = q1Var.b;
                TLRPC.Message message = (TLRPC.Message) this.e;
                String str7 = (String) this.c;
                int i32 = this.b;
                int i33 = q1Var.a;
                if ((message.flags & TLObject.FLAG_30) != 0) {
                    qf.p1 c10 = q1Var.c(message.quick_reply_shortcut_id);
                    if (c10 == null) {
                        qf.p1 p1Var = new qf.p1();
                        p1Var.a = message.quick_reply_shortcut_id;
                        p1Var.d = message.id;
                        MessageObject messageObject = new MessageObject(i33, message, false, true);
                        p1Var.e = messageObject;
                        messageObject.generateThumbs(false);
                        if (str7 != null) {
                            p1Var.b = str7;
                            q1Var.a(str7);
                        }
                        p1Var.e.applyQuickReply(str7, i32);
                        p1Var.f = 1;
                        arrayList11.add(p1Var);
                        for (int i34 = 0; i34 < arrayList11.size(); i34++) {
                            ((qf.p1) arrayList11.get(i34)).c = i34;
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i33);
                        messagesStorage.getStorageQueue().postRunnable(new zh1(22, messagesStorage, p1Var));
                        NotificationCenter.getInstance(i33).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                    } else {
                        int i35 = c10.d;
                        int i36 = message.id;
                        if (i35 == i36) {
                            c10.d = i36;
                            MessageObject messageObject2 = new MessageObject(i33, message, false, true);
                            c10.e = messageObject2;
                            messageObject2.generateThumbs(false);
                            q1Var.l();
                            NotificationCenter.getInstance(i33).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        } else if ((message.flags & 32768) == 0) {
                            c10.f++;
                            q1Var.l();
                            NotificationCenter.getInstance(i33).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        }
                    }
                }
                if (str7 == null && i32 == 0) {
                    ArrayList<TLRPC.Message> arrayList12 = new ArrayList<>();
                    arrayList12.add(message);
                    MessagesStorage.getInstance(i33).putMessages(arrayList12, true, true, false, DownloadController.getInstance(i33).getAutodownloadMask(), 5, message.quick_reply_shortcut_id);
                    long clientUserId = UserConfig.getInstance(i33).getClientUserId();
                    ArrayList<MessageObject> arrayList13 = new ArrayList<>();
                    arrayList13.add(new MessageObject(i33, message, true, true));
                    MessagesController.getInstance(i33).updateInterfaceWithMessages(clientUserId, arrayList13, 5);
                    return;
                }
                return;
            case 15:
                yf.j1 j1Var = (yf.j1) this.d;
                yf.e1 e1Var = (yf.e1) this.e;
                int i37 = this.b;
                ArrayList arrayList14 = (ArrayList) this.c;
                ArrayList arrayList15 = j1Var.c;
                boolean z15 = e1Var != null;
                j1Var.d = z15;
                if (!z15 || i37 < 0 || i37 >= arrayList15.size()) {
                    j1Var.i = arrayList14;
                } else {
                    j1Var.a++;
                    ((yf.i1) arrayList15.get(i37)).c++;
                    j1Var.g.edit().putInt(i0.a.k(i37, "score"), ((yf.i1) arrayList15.get(i37)).c).putInt("scoreall", j1Var.a).apply();
                    j1Var.i = null;
                }
                j1Var.e.run(e1Var);
                return;
            default:
                zf.n2 n2Var = (zf.n2) this.d;
                n2Var.m((Bitmap) this.e, this.b, n2Var.P, n2Var.Q, (nq0) this.c);
                return;
        }
    }

    public /* synthetic */ xs(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.e = obj2;
        this.c = obj3;
    }

    public /* synthetic */ xs(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.c = obj3;
    }

    public /* synthetic */ xs(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.b = i10;
    }
}
