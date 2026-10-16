package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.logging.Logger;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.zc;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yw0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
        this.e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Uri fromFile;
        int indexOf;
        int i10;
        TLRPC.Updates updates;
        int i11;
        org.telegram.ui.web.c1 c1Var;
        int a2;
        int i12 = 2;
        switch (this.a) {
            case 0:
                zw0.U((zw0) this.d, (TLRPC.TL_error) this.b, (TLObject) this.c, (TL_stars.updatePaidMessagesPrice) this.e);
                return;
            case 1:
                PrivacyControlActivity.V((PrivacyControlActivity) this.d, (TLRPC.TL_error) this.b, (TLObject) this.c, (boolean[]) this.e);
                return;
            case 2:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.d;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.b;
                TLObject tLObject = (TLObject) this.c;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) this.e;
                privacySettingsActivity.getClass();
                try {
                    a2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    privacySettingsActivity.Q = true;
                    privacySettingsActivity.getContactsController().setDeleteAccountTTL(setaccountttl.ttl.days);
                    privacySettingsActivity.a.l();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) this.d;
                boolean[] zArr = (boolean[]) this.b;
                Activity activity = (Activity) this.c;
                File file = (File) this.e;
                try {
                    a2Var2.dismiss();
                } catch (Exception unused) {
                }
                if (!zArr[0]) {
                    if (activity != null) {
                        Toast.makeText(activity, LocaleController.getString(R.string.ErrorOccurred), 0).show();
                        return;
                    }
                    return;
                }
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 24) {
                    fromFile = FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", file);
                } else {
                    fromFile = Uri.fromFile(file);
                }
                Intent intent = new Intent("android.intent.action.SEND");
                if (i13 >= 24) {
                    intent.addFlags(1);
                }
                intent.setType("message/rfc822");
                intent.putExtra("android.intent.extra.EMAIL", "");
                intent.putExtra("android.intent.extra.SUBJECT", "Logs from " + LocaleController.getInstance().getFormatterStats().format(System.currentTimeMillis()));
                intent.putExtra("android.intent.extra.STREAM", fromFile);
                if (activity != null) {
                    try {
                        activity.startActivityForResult(Intent.createChooser(intent, "Select email application."), 500);
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                return;
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) this.d;
                TLObject tLObject2 = (TLObject) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                int[] iArr = (int[]) this.e;
                if (!(tLObject2 instanceof TLRPC.TL_boolTrue)) {
                    profileActivity.getClass();
                    org.telegram.ui.Components.zc.a0(profileActivity).f0(tL_error, false);
                }
                if (profileActivity.o4 == iArr[0]) {
                    profileActivity.o4 = 0;
                    return;
                }
                return;
            case 5:
                ProfileActivity profileActivity2 = (ProfileActivity) this.d;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.e;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                if (tLObject3 instanceof TL_fragment.TL_collectibleInfo) {
                    m20.a(profileActivity2.getParentActivity(), 0, tL_username.username, profileActivity2.e1 != 0 ? profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.e1)) : profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.f1)), (TL_fragment.TL_collectibleInfo) tLObject3, profileActivity2.z0);
                    return;
                } else {
                    org.telegram.ui.Components.zc.d0(tL_error2);
                    return;
                }
            case 6:
                ProfileActivity profileActivity3 = (ProfileActivity) this.d;
                String[] strArr = (String[]) this.b;
                String str = (String) this.c;
                String str2 = (String) this.e;
                if (AndroidUtilities.isContextSafe(profileActivity3.getParentActivity())) {
                    org.telegram.ui.Components.x41.L(profileActivity3.getParentActivity(), profileActivity3, strArr[0], str, str2, new q20(profileActivity3, 2), null);
                    return;
                }
                return;
            case 7:
                ProfileActivity.n0((ProfileActivity) this.d, (TLRPC.TL_error) this.b, (TLObject) this.c, (String) this.e);
                return;
            case 8:
                m01 m01Var = (m01) this.d;
                TLObject tLObject4 = (TLObject) this.c;
                UserConfig userConfig = (UserConfig) this.b;
                TLRPC.Photo photo = (TLRPC.Photo) this.e;
                ProfileActivity profileActivity4 = m01Var.b;
                profileActivity4.n0.c1--;
                if (tLObject4 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject4;
                    profileActivity4.getMessagesController().putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = profileActivity4.getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
                    TLRPC.Photo photo2 = tL_photos_photo.photo;
                    if (photo2 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList = profileActivity4.n0.V0;
                        if (!arrayList.isEmpty() && (indexOf = arrayList.indexOf(photo)) >= 0) {
                            arrayList.set(indexOf, photo2);
                        }
                        if (user != null) {
                            user.photo.photo_id = tL_photos_photo.photo.id;
                            userConfig.setCurrentUser(user);
                            userConfig.saveConfig(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                x01 x01Var = (x01) this.d;
                TLObject tLObject5 = (TLObject) this.c;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.e;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                ProfileActivity profileActivity5 = x01Var.c.e;
                profileActivity5.M4(null);
                if (!(tLObject5 instanceof TL_fragment.TL_collectibleInfo)) {
                    org.telegram.ui.Components.zc.d0(tL_error3);
                    return;
                }
                TLObject user2 = profileActivity5.e1 != 0 ? profileActivity5.getMessagesController().getUser(Long.valueOf(profileActivity5.e1)) : profileActivity5.getMessagesController().getChat(Long.valueOf(profileActivity5.f1));
                if (profileActivity5.getParentActivity() == null) {
                    return;
                }
                m20.a(profileActivity5.getParentActivity(), 0, tL_username2.username, user2, (TL_fragment.TL_collectibleInfo) tLObject5, profileActivity5.z0);
                return;
            case 10:
                SessionsActivity sessionsActivity = (SessionsActivity) this.d;
                org.telegram.ui.ActionBar.a2 a2Var3 = (org.telegram.ui.ActionBar.a2) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.b;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) this.e;
                sessionsActivity.getClass();
                try {
                    a2Var3.dismiss();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tL_error4 == null) {
                    sessionsActivity.e.remove(tL_webAuthorization);
                    sessionsActivity.m0();
                    a91 a91Var = sessionsActivity.a;
                    if (a91Var != null) {
                        a91Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                SessionsActivity sessionsActivity2 = (SessionsActivity) this.d;
                org.telegram.ui.ActionBar.a2 a2Var4 = (org.telegram.ui.ActionBar.a2) this.c;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.e;
                sessionsActivity2.getClass();
                try {
                    a2Var4.dismiss();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (tL_error5 == null) {
                    sessionsActivity2.e.remove(tL_authorization);
                    sessionsActivity2.f.remove(tL_authorization);
                    sessionsActivity2.m0();
                    a91 a91Var2 = sessionsActivity2.a;
                    if (a91Var2 != null) {
                        a91Var2.l();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                z81 z81Var = (z81) this.d;
                TLObject tLObject6 = (TLObject) this.c;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.b;
                o9 o9Var = (o9) this.e;
                z81Var.a = tLObject6;
                z81Var.b = tL_error6;
                o9Var.run();
                return;
            case 13:
                o91.c0((o91) this.d, (TLRPC.TL_error) this.b, (TLObject) this.c, (String) this.e);
                return;
            case 14:
                sa1 sa1Var = (sa1) this.d;
                kg.b bVar = (kg.b) this.b;
                String str3 = (String) this.c;
                gb1 gb1Var = (gb1) this.e;
                hb1 hb1Var = sa1Var.w;
                if (bVar != null) {
                    hb1Var.V.put(str3, bVar);
                }
                if (bVar != null && !gb1Var.b && (i10 = gb1Var.a) >= 0) {
                    View m10 = hb1Var.U.m(i10);
                    if (m10 instanceof sa1) {
                        sa1Var.r.e = bVar;
                        sa1 sa1Var2 = (sa1) m10;
                        sa1Var2.b.t0.d(false, false);
                        sa1Var2.g(false);
                    }
                }
                hb1.Z(hb1Var);
                return;
            case 15:
                ta1 ta1Var = (ta1) this.d;
                kg.b bVar2 = (kg.b) this.b;
                String str4 = (String) this.c;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) this.e;
                ta1Var.k = false;
                ta1Var.d = bVar2;
                ta1Var.g = str4;
                ra1 ra1Var = (ra1) callback0Return.run();
                if (ra1Var != null) {
                    ra1Var.e(ta1Var, true);
                    return;
                }
                return;
            case 16:
                cf1 cf1Var = (cf1) this.d;
                TLObject tLObject7 = (TLObject) this.c;
                String str5 = (String) this.b;
                org.telegram.ui.ActionBar.a2 a2Var5 = (org.telegram.ui.ActionBar.a2) this.e;
                gf1 gf1Var = cf1Var.a;
                if (tLObject7 != null) {
                    TLRPC.Updates updates2 = (TLRPC.Updates) tLObject7;
                    int i14 = 0;
                    while (i14 < updates2.updates.size()) {
                        if (updates2.updates.get(i14) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates2.updates.get(i14);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str5;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = gf1Var.getMessagesController().getPeer(gf1Var.a);
                            tL_messageService.dialog_id = gf1Var.a;
                            tL_messageService.id = tL_updateMessageID.id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList2 = new ArrayList();
                            i11 = ((org.telegram.ui.ActionBar.m2) gf1Var).currentAccount;
                            arrayList2.add(new MessageObject(i11, tL_messageService, false, false));
                            TLRPC.Chat chat = gf1Var.getMessagesController().getChat(Long.valueOf(-gf1Var.a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.id = tL_updateMessageID.id;
                            long j10 = gf1Var.b;
                            if (j10 != 0) {
                                tL_forumTopic.icon_emoji_id = j10;
                                tL_forumTopic.flags |= 1;
                            }
                            tL_forumTopic.my = true;
                            tL_forumTopic.flags |= i12;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str5;
                            tL_forumTopic.top_message = tL_messageService.id;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = gf1Var.getMessagesController().getPeer(gf1Var.getUserConfig().clientUserId);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = gf1Var.E;
                            fo foVar = gf1Var.y;
                            if (foVar != null) {
                                foVar.Pa();
                                foVar.Ta();
                                foVar.tb(arrayList2, chat, tL_messageService.id, 1, 1, tL_forumTopic);
                                foVar.c = true;
                                foVar.v8();
                                foVar.Rc(true);
                                foVar.a1.n(true);
                                foVar.Xc();
                                foVar.R1.setCurrentTopic(foVar.d());
                                foVar.Uc(true);
                                foVar.lc(true);
                                foVar.j9(true);
                                foVar.D6(true, true);
                                foVar.Ia();
                                gf1Var.getMessagesController().getTopicsController().onTopicCreated(gf1Var.a, tL_forumTopic, true);
                                gf1Var.finishFragment();
                                updates = updates2;
                            } else {
                                Bundle bundle = new Bundle();
                                updates = updates2;
                                bundle.putLong("chat_id", -gf1Var.a);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                fo foVar2 = new fo(bundle);
                                foVar2.tb(arrayList2, chat, tL_messageService.id, 1, 1, tL_forumTopic);
                                foVar2.c = true;
                                gf1Var.getMessagesController().getTopicsController().onTopicCreated(gf1Var.a, tL_forumTopic, true);
                                gf1Var.presentFragment(foVar2);
                            }
                        } else {
                            updates = updates2;
                        }
                        i14++;
                        updates2 = updates;
                        i12 = 2;
                    }
                }
                a2Var5.dismiss();
                return;
            case 17:
                TwoStepVerificationActivity.e0((TwoStepVerificationActivity) this.d, (byte[]) this.b, (TLObject) this.c, (byte[]) this.e);
                return;
            case 18:
                oh1 oh1Var = (oh1) this.d;
                TLObject tLObject8 = (TLObject) this.c;
                String str6 = (String) this.e;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.b;
                if (tLObject8 instanceof TLRPC.TL_boolTrue) {
                    oh1Var.u0(new wg1(i12, oh1Var, str6));
                    return;
                }
                if (tL_error7 == null || tL_error7.text.startsWith("CODE_INVALID")) {
                    oh1Var.y0();
                    return;
                } else if (!tL_error7.text.startsWith("FLOOD_WAIT")) {
                    oh1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error7.text);
                    return;
                } else {
                    int intValue = Utilities.parseInt((CharSequence) tL_error7.text).intValue();
                    oh1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                    return;
                }
            case 19:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.d;
                bi.n9 n9Var = (bi.n9) this.b;
                String str7 = (String) this.c;
                JSONObject jSONObject = (JSONObject) this.e;
                if (z0Var.c && ((c1Var = z0Var.Q) == null || !c1Var.o(n9Var))) {
                    FileLog.d("notifyEvent " + str7 + " dropped after document change");
                    return;
                }
                z0Var.d("window.Telegram.WebView.receiveEvent('" + str7 + "', " + jSONObject + ");");
                return;
            case 20:
                pi.e eVar = (pi.e) this.d;
                ((ArrayDeque) eVar.a).addLast(new pi.d((ji.m5) this.b, (pi.a) this.c, (RequestTimeDelegate) this.e));
                eVar.B();
                return;
            case 21:
                q5.a aVar = (q5.a) this.d;
                l5.i iVar = (l5.i) this.b;
                String str8 = iVar.a;
                i5.g gVar = (i5.g) this.c;
                l5.h hVar = (l5.h) this.e;
                aVar.getClass();
                Logger logger = q5.a.f;
                try {
                    m5.e a10 = aVar.c.a(str8);
                    if (a10 == null) {
                        String str9 = "Transport backend '" + str8 + "' is not registered";
                        logger.warning(str9);
                        gVar.b(new IllegalArgumentException(str9));
                    } else {
                        ((s5.g) aVar.e).f(new org.telegram.ui.Components.nz(aVar, iVar, ((j5.c) a10).a(hVar), 6));
                        gVar.b(null);
                    }
                    return;
                } catch (Exception e12) {
                    logger.warning("Error scheduling event " + e12.getMessage());
                    gVar.b(e12);
                    return;
                }
            case 22:
                rg.p2 p2Var = (rg.p2) this.d;
                ArrayList arrayList3 = (ArrayList) this.b;
                tr0 tr0Var = (tr0) this.c;
                rg.m2 m2Var = (rg.m2) this.e;
                p2Var.G = true;
                p2Var.H = (rg.m2[]) arrayList3.toArray(new rg.m2[0]);
                tr0Var.run(m2Var);
                return;
            case 23:
                rg.p2 p2Var2 = (rg.p2) this.d;
                TLObject tLObject9 = (TLObject) this.c;
                rg.n2 n2Var = (rg.n2) this.e;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.b;
                if (!(tLObject9 instanceof TLRPC.TL_messageMediaDocument)) {
                    p2Var2.h();
                    p2Var2.n(tL_error8);
                    return;
                }
                p2Var2.getClass();
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject9;
                n2Var.e = MediaDataController.getInputStickerSetItem(tL_messageMediaDocument.document, n2Var.c);
                n2Var.f = tL_messageMediaDocument;
                p2Var2.a();
                return;
            case 24:
                ri.s sVar = (ri.s) this.d;
                ri.k0 k0Var = (ri.k0) this.b;
                ri.k0 k0Var2 = (ri.k0) this.c;
                Handler handler = (Handler) this.e;
                if (sVar.r0 && sVar.W == 0 && sVar.T) {
                    sVar.N.g(sVar.L, sVar.D, false);
                    sVar.U = false;
                    sVar.V = false;
                    sVar.c0 = 0.0f;
                    sVar.W = 1;
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    sVar.X = elapsedRealtimeNanos;
                    sVar.Y = elapsedRealtimeNanos;
                    sVar.d0 = k0Var;
                    sVar.e0 = k0Var2;
                    String[] strArr2 = ri.s0.a;
                    synchronized (ri.s0.class) {
                        ri.s0.b();
                        if (k0Var == k0Var2) {
                            throw new IllegalArgumentException("Camera switch direction must change");
                        }
                        a2 = ri.s0.a(k0Var == ri.k0.b ? 0 : 1);
                    }
                    sVar.b0 = a2;
                    sVar.Z = ((Math.max(210, Math.min(300, 300 - ((Math.max(0, a2 - 400) * 3) / 20))) * 45) / 100) * 1000000;
                    sVar.a0 = (r5 - r6) * 1000000;
                    sVar.i.b("synthetic camera switch started: from=" + k0Var + ", to=" + k0Var2 + ", expectedWaitMs=" + sVar.b0 + ", targetBlurRadiusPx=" + (((sVar.N.a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((sVar.Z + sVar.a0) / 1000000));
                    sVar.Q = -1L;
                    handler.removeCallbacks(sVar.x0);
                    handler.post(sVar.x0);
                    return;
                }
                return;
            case 25:
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                TLObject tLObject10 = (TLObject) this.c;
                Utilities.Callback callback2 = (Utilities.Callback) this.e;
                if (tL_error9 != null) {
                    callback.run(tL_error9);
                    return;
                } else {
                    if (tLObject10 instanceof TLRPC.payments_GiveawayInfo) {
                        callback2.run((TLRPC.payments_GiveawayInfo) tLObject10);
                        return;
                    }
                    return;
                }
            case 26:
                final yh.m2 m2Var2 = (yh.m2) this.d;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.b;
                yh.h1 h1Var = (yh.h1) this.c;
                final View view = (View) this.e;
                org.telegram.ui.Components.ns0 ns0Var = m2Var2.a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    h1Var.h(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = m2Var2.e.g(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(m2Var2.b).sendRequest(savestargift, null, 64);
                }
                boolean z10 = savedStarGift.pinned_to_top;
                final boolean z11 = !z10;
                if (m2Var2.e.m(savedStarGift, z11, false)) {
                    new yh.p2(m2Var2.getContext(), ns0Var.c, savedStarGift, m2Var2.c, new Utilities.Callback0Return() { // from class: yh.f2
                        @Override // org.telegram.messenger.Utilities.Callback0Return
                        public final Object run() {
                            ((h1) view).c(z11, true);
                            m2 m2Var3 = m2.this;
                            m2Var3.f.u0(0);
                            return zc.a0(m2Var3.a.a);
                        }
                    }).show();
                    return;
                }
                if (z10) {
                    org.telegram.messenger.g0.q(R.string.Gift2Unpinned, org.telegram.ui.Components.zc.a0(ns0Var.a), R.raw.ic_unpin, 36);
                } else {
                    org.telegram.ui.Components.zc.a0(ns0Var.a).M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
                }
                ((yh.h1) view).c(z11, true);
                m2Var2.f.u0(0);
                return;
            case 27:
                org.telegram.ui.ActionBar.m2 m2Var3 = (org.telegram.ui.ActionBar.m2) this.d;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) this.b;
                pf.c cVar = (pf.c) this.c;
                org.telegram.ui.ActionBar.a2 a2Var6 = (org.telegram.ui.ActionBar.a2) this.e;
                if (m2Var3 != null && tL_error10 != null) {
                    org.telegram.ui.Components.zc.a0(m2Var3).f0(tL_error10, false);
                }
                if ((m2Var3 instanceof fo) && tL_error10 == null) {
                    ((fo) m2Var3).cc();
                }
                cVar.b();
                a2Var6.dismiss();
                return;
            case 28:
                zh.r3.a0((zh.r3) this.d, (boolean[]) this.b, (TL_stars.StarGiftAttribute) this.c, (org.telegram.ui.Components.bd[]) this.e);
                return;
            default:
                zh.r3.S0((zh.r3) this.d, (TLObject) this.c, (pi.g) this.e, (TLRPC.TL_error) this.b);
                return;
        }
    }

    public /* synthetic */ yw0(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.b = obj3;
        this.e = obj4;
    }

    public /* synthetic */ yw0(Object obj, TLObject tLObject, Object obj2, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = tLObject;
        this.e = obj2;
        this.b = tL_error;
    }

    public /* synthetic */ yw0(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, Utilities.Callback callback2) {
        this.a = 25;
        this.b = tL_error;
        this.d = callback;
        this.c = tLObject;
        this.e = callback2;
    }
}
