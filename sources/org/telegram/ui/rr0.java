package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Logger;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.ad;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rr0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int indexOf;
        int i10;
        int i11;
        org.telegram.ui.web.b1 b1Var;
        int i12 = this.a;
        int i13 = 2;
        Object obj = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (i12) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj3;
                String str = (String) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (photoEntry.coverPath != null) {
                    try {
                        new File(photoEntry.coverPath).delete();
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                photoEntry.coverSavedPosition = -1L;
                photoEntry.coverPath = str;
                photoEntry.coverPhoto = null;
                photoEntry.coverPhotoParentObject = null;
                photoViewer.q5.b.setLoading(false);
                cv0 cv0Var = photoViewer.d;
                if (cv0Var != null) {
                    cv0Var.W(photoViewer.P4);
                }
                zs0 zs0Var = photoViewer.g1;
                if (zs0Var != null) {
                    zs0Var.setImage(bitmap);
                }
                photoViewer.e3(0);
                CheckBox checkBox = photoViewer.N0;
                if (!checkBox.x) {
                    checkBox.callOnClick();
                    break;
                }
                break;
            case 1:
                PhotoViewer photoViewer2 = (PhotoViewer) obj4;
                Bitmap bitmap2 = (Bitmap) obj;
                boolean[] zArr = (boolean[]) obj3;
                es0 es0Var = (es0) obj2;
                ImageView imageView = photoViewer2.x3;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap2);
                    photoViewer2.x3.setVisibility(0);
                    SurfaceView surfaceView = photoViewer2.C2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    if (!zArr[0]) {
                        zArr[0] = true;
                        es0Var.run();
                        break;
                    }
                }
                break;
            case 2:
                TLObject tLObject = (TLObject) obj3;
                UserConfig userConfig = (UserConfig) obj2;
                TLRPC.Photo photo = (TLRPC.Photo) obj;
                PhotoViewer photoViewer3 = ((ss0) obj4).b;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    int i14 = photoViewer3.T;
                    ArrayList arrayList = photoViewer3.f7;
                    MessagesController.getInstance(i14).putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = MessagesController.getInstance(photoViewer3.T).getUser(Long.valueOf(userConfig.clientUserId));
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        int indexOf2 = arrayList.indexOf(photo);
                        if (indexOf2 >= 0) {
                            arrayList.set(indexOf2, tL_photos_photo.photo);
                        }
                        if (user != null) {
                            user.photo.photo_id = tL_photos_photo.photo.id;
                            userConfig.setCurrentUser(user);
                            userConfig.saveConfig(true);
                            break;
                        }
                    }
                }
                break;
            case 3:
                tw0.U((tw0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TL_stars.updatePaidMessagesPrice) obj);
                break;
            case 4:
                PrivacyControlActivity.V((PrivacyControlActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (boolean[]) obj);
                break;
            case 5:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj4;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) obj;
                privacySettingsActivity.getClass();
                try {
                    b2Var.dismiss();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    privacySettingsActivity.Q = true;
                    privacySettingsActivity.getContactsController().setDeleteAccountTTL(setaccountttl.ttl.days);
                    privacySettingsActivity.a.l();
                    break;
                }
                break;
            case 6:
                boolean[] zArr2 = (boolean[]) obj3;
                Activity activity = (Activity) obj2;
                File file = (File) obj;
                try {
                    ((org.telegram.ui.ActionBar.b2) obj4).dismiss();
                } catch (Exception unused) {
                }
                if (zArr2[0]) {
                    int i15 = Build.VERSION.SDK_INT;
                    Uri d = i15 >= 24 ? FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", file) : Uri.fromFile(file);
                    Intent intent = new Intent("android.intent.action.SEND");
                    if (i15 >= 24) {
                        intent.addFlags(1);
                    }
                    intent.setType("message/rfc822");
                    intent.putExtra("android.intent.extra.EMAIL", "");
                    intent.putExtra("android.intent.extra.SUBJECT", "Logs from " + LocaleController.getInstance().getFormatterStats().format(System.currentTimeMillis()));
                    intent.putExtra("android.intent.extra.STREAM", d);
                    if (activity != null) {
                        try {
                            activity.startActivityForResult(Intent.createChooser(intent, "Select email application."), 500);
                            break;
                        } catch (Exception e11) {
                            FileLog.e(e11);
                            return;
                        }
                    }
                } else if (activity != null) {
                    Toast.makeText(activity, LocaleController.getString(R.string.ErrorOccurred), 0).show();
                    break;
                }
                break;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int[] iArr = (int[]) obj;
                if (!(((TLObject) obj3) instanceof TLRPC.TL_boolTrue)) {
                    profileActivity.getClass();
                    org.telegram.ui.Components.ad.a0(profileActivity).f0(tL_error, false);
                }
                if (profileActivity.o4 == iArr[0]) {
                    profileActivity.o4 = 0;
                    break;
                }
                break;
            case 8:
                ProfileActivity profileActivity2 = (ProfileActivity) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (tLObject3 instanceof TL_fragment.TL_collectibleInfo) {
                    g20.a(profileActivity2.getParentActivity(), 0, tL_username.username, profileActivity2.e1 != 0 ? profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.e1)) : profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.f1)), (TL_fragment.TL_collectibleInfo) tLObject3, profileActivity2.z0);
                    break;
                } else {
                    org.telegram.ui.Components.ad.d0(tL_error2);
                    break;
                }
            case 9:
                ProfileActivity profileActivity3 = (ProfileActivity) obj4;
                String[] strArr = (String[]) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                if (AndroidUtilities.isContextSafe(profileActivity3.getParentActivity())) {
                    org.telegram.ui.Components.b51.L(profileActivity3.getParentActivity(), profileActivity3, strArr[0], str2, str3, new k20(profileActivity3, i13), null);
                    break;
                }
                break;
            case 10:
                ProfileActivity.n0((ProfileActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj, (String) obj2);
                break;
            case 11:
                TLObject tLObject4 = (TLObject) obj3;
                UserConfig userConfig2 = (UserConfig) obj2;
                TLRPC.Photo photo2 = (TLRPC.Photo) obj;
                ProfileActivity profileActivity4 = ((g01) obj4).b;
                profileActivity4.n0.c1--;
                if (tLObject4 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject4;
                    profileActivity4.getMessagesController().putUsers(tL_photos_photo2.users, false);
                    TLRPC.User user2 = profileActivity4.getMessagesController().getUser(Long.valueOf(userConfig2.clientUserId));
                    TLRPC.Photo photo3 = tL_photos_photo2.photo;
                    if (photo3 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList2 = profileActivity4.n0.V0;
                        if (!arrayList2.isEmpty() && (indexOf = arrayList2.indexOf(photo2)) >= 0) {
                            arrayList2.set(indexOf, photo3);
                        }
                        if (user2 != null) {
                            user2.photo.photo_id = tL_photos_photo2.photo.id;
                            userConfig2.setCurrentUser(user2);
                            userConfig2.saveConfig(true);
                            break;
                        }
                    }
                }
                break;
            case 12:
                TLObject tLObject5 = (TLObject) obj3;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                ProfileActivity profileActivity5 = ((r01) obj4).c.e;
                profileActivity5.M4(null);
                if (!(tLObject5 instanceof TL_fragment.TL_collectibleInfo)) {
                    org.telegram.ui.Components.ad.d0(tL_error3);
                    break;
                } else {
                    TLObject user3 = profileActivity5.e1 != 0 ? profileActivity5.getMessagesController().getUser(Long.valueOf(profileActivity5.e1)) : profileActivity5.getMessagesController().getChat(Long.valueOf(profileActivity5.f1));
                    if (profileActivity5.getParentActivity() != null) {
                        g20.a(profileActivity5.getParentActivity(), 0, tL_username2.username, user3, (TL_fragment.TL_collectibleInfo) tLObject5, profileActivity5.z0);
                        break;
                    }
                }
                break;
            case 13:
                SessionsActivity sessionsActivity = (SessionsActivity) obj4;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) obj;
                sessionsActivity.getClass();
                try {
                    b2Var2.dismiss();
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                if (tL_error4 == null) {
                    sessionsActivity.e.remove(tL_webAuthorization);
                    sessionsActivity.m0();
                    u81 u81Var = sessionsActivity.a;
                    if (u81Var != null) {
                        u81Var.l();
                        break;
                    }
                }
                break;
            case 14:
                SessionsActivity sessionsActivity2 = (SessionsActivity) obj4;
                org.telegram.ui.ActionBar.b2 b2Var3 = (org.telegram.ui.ActionBar.b2) obj3;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                sessionsActivity2.getClass();
                try {
                    b2Var3.dismiss();
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
                if (tL_error5 == null) {
                    sessionsActivity2.e.remove(tL_authorization);
                    sessionsActivity2.f.remove(tL_authorization);
                    sessionsActivity2.m0();
                    u81 u81Var2 = sessionsActivity2.a;
                    if (u81Var2 != null) {
                        u81Var2.l();
                        break;
                    }
                }
                break;
            case 15:
                t81 t81Var = (t81) obj4;
                t81Var.a = (TLObject) obj3;
                t81Var.b = (TLRPC.TL_error) obj2;
                ((k9) obj).run();
                break;
            case 16:
                i91.c0((i91) obj4, (TLRPC.TL_error) obj3, (TLObject) obj, (String) obj2);
                break;
            case 17:
                ma1 ma1Var = (ma1) obj4;
                jg.b bVar = (jg.b) obj3;
                String str4 = (String) obj2;
                ab1 ab1Var = (ab1) obj;
                bb1 bb1Var = ma1Var.w;
                if (bVar != null) {
                    bb1Var.V.put(str4, bVar);
                }
                if (bVar != null && !ab1Var.b && (i10 = ab1Var.a) >= 0) {
                    View m10 = bb1Var.U.m(i10);
                    if (m10 instanceof ma1) {
                        ma1Var.r.e = bVar;
                        ma1 ma1Var2 = (ma1) m10;
                        ma1Var2.b.t0.d(false, false);
                        ma1Var2.g(false);
                    }
                }
                bb1.Z(bb1Var);
                break;
            case 18:
                na1 na1Var = (na1) obj4;
                na1Var.k = false;
                na1Var.d = (jg.b) obj3;
                na1Var.g = (String) obj2;
                la1 la1Var = (la1) ((Utilities.Callback0Return) obj).run();
                if (la1Var != null) {
                    la1Var.e(na1Var, true);
                    break;
                }
                break;
            case 19:
                TLObject tLObject6 = (TLObject) obj3;
                String str5 = (String) obj2;
                org.telegram.ui.ActionBar.b2 b2Var4 = (org.telegram.ui.ActionBar.b2) obj;
                bf1 bf1Var = ((xe1) obj4).a;
                if (tLObject6 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject6;
                    for (int i16 = 0; i16 < updates.updates.size(); i16++) {
                        if (updates.updates.get(i16) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i16);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str5;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = bf1Var.getMessagesController().getPeer(bf1Var.a);
                            tL_messageService.dialog_id = bf1Var.a;
                            tL_messageService.id = tL_updateMessageID.id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList3 = new ArrayList();
                            i11 = ((org.telegram.ui.ActionBar.n2) bf1Var).currentAccount;
                            arrayList3.add(new MessageObject(i11, tL_messageService, false, false));
                            TLRPC.Chat chat = bf1Var.getMessagesController().getChat(Long.valueOf(-bf1Var.a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.id = tL_updateMessageID.id;
                            long j3 = bf1Var.b;
                            if (j3 != 0) {
                                tL_forumTopic.icon_emoji_id = j3;
                                tL_forumTopic.flags |= 1;
                            }
                            tL_forumTopic.my = true;
                            tL_forumTopic.flags |= 2;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str5;
                            tL_forumTopic.top_message = tL_messageService.id;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = bf1Var.getMessagesController().getPeer(bf1Var.getUserConfig().clientUserId);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = bf1Var.E;
                            zn znVar = bf1Var.y;
                            if (znVar != null) {
                                znVar.Pa();
                                znVar.Ta();
                                znVar.tb(arrayList3, chat, tL_messageService.id, 1, 1, tL_forumTopic);
                                znVar.c = true;
                                znVar.v8();
                                znVar.Rc(true);
                                znVar.a1.o(true);
                                znVar.Xc();
                                znVar.R1.setCurrentTopic(znVar.d());
                                znVar.Uc(true);
                                znVar.lc(true);
                                znVar.j9(true);
                                znVar.D6(true, true);
                                znVar.Ia();
                                bf1Var.getMessagesController().getTopicsController().onTopicCreated(bf1Var.a, tL_forumTopic, true);
                                bf1Var.finishFragment();
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -bf1Var.a);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                zn znVar2 = new zn(bundle);
                                znVar2.tb(arrayList3, chat, tL_messageService.id, 1, 1, tL_forumTopic);
                                znVar2.c = true;
                                bf1Var.getMessagesController().getTopicsController().onTopicCreated(bf1Var.a, tL_forumTopic, true);
                                bf1Var.presentFragment(znVar2);
                            }
                        }
                    }
                }
                b2Var4.dismiss();
                break;
            case 20:
                TwoStepVerificationActivity.e0((TwoStepVerificationActivity) obj4, (byte[]) obj3, (TLObject) obj2, (byte[]) obj);
                break;
            case 21:
                ih1 ih1Var = (ih1) obj4;
                String str6 = (String) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    ih1Var.u0(new n31(26, ih1Var, str6));
                    break;
                } else if (tL_error6 != null && !tL_error6.text.startsWith("CODE_INVALID")) {
                    if (tL_error6.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error6.text).intValue();
                        ih1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                        break;
                    } else {
                        ih1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error6.text);
                        break;
                    }
                } else {
                    ih1Var.y0();
                    break;
                }
            case 22:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj4;
                ai.ea eaVar = (ai.ea) obj3;
                String str7 = (String) obj2;
                JSONObject jSONObject = (JSONObject) obj;
                if (!y0Var.c || ((b1Var = y0Var.Q) != null && b1Var.o(eaVar))) {
                    y0Var.d("window.Telegram.WebView.receiveEvent('" + str7 + "', " + jSONObject + ");");
                    break;
                } else {
                    FileLog.d("notifyEvent " + str7 + " dropped after document change");
                    break;
                }
            case 23:
                q5.a aVar = (q5.a) obj4;
                l5.i iVar = (l5.i) obj3;
                String str8 = iVar.a;
                i5.g gVar = (i5.g) obj2;
                l5.h hVar = (l5.h) obj;
                aVar.getClass();
                Logger logger = q5.a.f;
                try {
                    m5.e a2 = aVar.c.a(str8);
                    if (a2 == null) {
                        String str9 = "Transport backend '" + str8 + "' is not registered";
                        logger.warning(str9);
                        gVar.a(new IllegalArgumentException(str9));
                    } else {
                        ((s5.g) aVar.e).f(new org.telegram.ui.Components.rz(aVar, iVar, ((j5.b) a2).a(hVar), 6));
                        gVar.a(null);
                    }
                    break;
                } catch (Exception e14) {
                    logger.warning("Error scheduling event " + e14.getMessage());
                    gVar.a(e14);
                    return;
                }
            case 24:
                qg.o2 o2Var = (qg.o2) obj4;
                o2Var.G = true;
                o2Var.H = (qg.l2[]) ((ArrayList) obj3).toArray(new qg.l2[0]);
                ((or0) obj2).run((qg.l2) obj);
                break;
            case 25:
                qg.o2 o2Var2 = (qg.o2) obj4;
                TLObject tLObject7 = (TLObject) obj3;
                qg.m2 m2Var = (qg.m2) obj2;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                if (tLObject7 instanceof TLRPC.TL_messageMediaDocument) {
                    o2Var2.getClass();
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject7;
                    m2Var.e = MediaDataController.getInputStickerSetItem(tL_messageMediaDocument.document, m2Var.c);
                    m2Var.f = tL_messageMediaDocument;
                    o2Var2.a();
                    break;
                } else {
                    o2Var2.h();
                    o2Var2.n(tL_error7);
                    break;
                }
            case 26:
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj4;
                Utilities.Callback callback = (Utilities.Callback) obj3;
                TLObject tLObject8 = (TLObject) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (tL_error8 != null) {
                    callback.run(tL_error8);
                    break;
                } else if (tLObject8 instanceof TLRPC.payments_GiveawayInfo) {
                    callback2.run((TLRPC.payments_GiveawayInfo) tLObject8);
                    break;
                }
                break;
            case 27:
                final xh.o2 o2Var3 = (xh.o2) obj4;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                xh.j1 j1Var = (xh.j1) obj2;
                final View view = (View) obj;
                org.telegram.ui.Components.rs0 rs0Var = o2Var3.a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    j1Var.h(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = o2Var3.e.g(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(o2Var3.b).sendRequest(savestargift, null, 64);
                }
                boolean z10 = savedStarGift.pinned_to_top;
                final boolean z11 = !z10;
                if (o2Var3.e.m(savedStarGift, z11, false)) {
                    new xh.r2(o2Var3.getContext(), rs0Var.c, savedStarGift, o2Var3.c, new Utilities.Callback0Return() { // from class: xh.h2
                        @Override // org.telegram.messenger.Utilities.Callback0Return
                        public final Object run() {
                            ((j1) view).c(z11, true);
                            o2 o2Var4 = o2.this;
                            o2Var4.f.u0(0);
                            return ad.a0(o2Var4.a.a);
                        }
                    }).show();
                    break;
                } else {
                    if (z10) {
                        org.telegram.messenger.q.q(R.string.Gift2Unpinned, org.telegram.ui.Components.ad.a0(rs0Var.a), R.raw.ic_unpin, 36);
                    } else {
                        org.telegram.ui.Components.ad.a0(rs0Var.a).M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
                    }
                    ((xh.j1) view).c(z11, true);
                    o2Var3.f.u0(0);
                    break;
                }
            case 28:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj4;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj3;
                of.e eVar = (of.e) obj2;
                org.telegram.ui.ActionBar.b2 b2Var5 = (org.telegram.ui.ActionBar.b2) obj;
                if (n2Var != null && tL_error9 != null) {
                    org.telegram.ui.Components.ad.a0(n2Var).f0(tL_error9, false);
                }
                if ((n2Var instanceof zn) && tL_error9 == null) {
                    ((zn) n2Var).cc();
                }
                eVar.b();
                b2Var5.dismiss();
                break;
            default:
                yh.s3.a0((yh.s3) obj4, (boolean[]) obj3, (TL_stars.StarGiftAttribute) obj2, (org.telegram.ui.Components.cd[]) obj);
                break;
        }
    }

    public /* synthetic */ rr0(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, int i10) {
        this.a = i10;
        this.b = n2Var;
        this.d = tL_error;
        this.c = tLObject;
        this.e = str;
    }

    public /* synthetic */ rr0(PhotoViewer photoViewer, Bitmap bitmap, boolean[] zArr, es0 es0Var) {
        this.a = 1;
        this.b = photoViewer;
        this.c = bitmap;
        this.d = zArr;
        this.e = es0Var;
    }
}
