package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class vq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vq(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:334:0x074f, code lost:
    
        if (org.telegram.messenger.UserObject.isDeleted(r13.getMessagesController().getUser(java.lang.Long.valueOf(r11))) != false) goto L303;
     */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0792 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        a0.i iVar;
        ArrayList arrayList2;
        int size;
        int i10;
        TLRPC.Chat chat;
        TLRPC.ChatFull chatFull;
        int i11;
        TLRPC.UserFull userFull;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = this.a;
        int i17 = 16;
        int i18 = 2;
        int i19 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i16) {
            case 0:
                sr srVar = (sr) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                a0.i iVar2 = srVar.L;
                a0.i iVar3 = srVar.M;
                int i20 = srVar.e1;
                a0.i iVar4 = srVar.K;
                int i21 = srVar.O;
                ArrayList arrayList5 = srVar.F;
                int i22 = 0;
                int i23 = 0;
                while (i23 < arrayList3.size()) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) arrayList3.get(i23);
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) arrayList4.get(i23);
                    if (tL_channels_getParticipants == null || tL_channels_channelParticipants == null) {
                        arrayList = arrayList3;
                        i22 = i22;
                    } else {
                        if (i21 == i19) {
                            arrayList = arrayList3;
                            srVar.getMessagesController().processLoadedAdminsResponse(srVar.N, tL_channels_channelParticipants);
                        } else {
                            arrayList = arrayList3;
                        }
                        srVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
                        srVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
                        long clientUserId = srVar.getUserConfig().getClientUserId();
                        if (i20 != 0) {
                            int i24 = 0;
                            while (true) {
                                if (i24 < tL_channels_channelParticipants.participants.size()) {
                                    if (MessageObject.getPeerId(tL_channels_channelParticipants.participants.get(i24).peer) == clientUserId) {
                                        tL_channels_channelParticipants.participants.remove(i24);
                                    } else {
                                        i24++;
                                    }
                                }
                            }
                            i18 = 2;
                        }
                        if (i21 == i18) {
                            srVar.k1--;
                            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = tL_channels_getParticipants.filter;
                            if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsContacts) {
                                arrayList2 = srVar.H;
                                iVar = iVar3;
                            } else if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsBots) {
                                arrayList2 = srVar.G;
                                iVar = iVar2;
                            }
                            arrayList2.clear();
                            arrayList2.addAll(tL_channels_channelParticipants.participants);
                            size = tL_channels_channelParticipants.participants.size();
                            i10 = 0;
                            while (i10 < size) {
                                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i10);
                                int i25 = i22;
                                int i26 = i10;
                                if (channelParticipant.user_id == clientUserId) {
                                    arrayList2.remove(channelParticipant);
                                } else {
                                    iVar.k(channelParticipant, MessageObject.getPeerId(channelParticipant.peer));
                                }
                                i10 = i26 + 1;
                                i22 = i25;
                            }
                            int size2 = arrayList2.size() + i22;
                            if (i21 == 2) {
                                int size3 = arrayList5.size();
                                int i27 = 0;
                                while (i27 < size3) {
                                    TLObject tLObject = (TLObject) arrayList5.get(i27);
                                    if (tLObject instanceof TLRPC.ChannelParticipant) {
                                        long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
                                        if (iVar3.f(peerId) == null && iVar2.f(peerId) == null) {
                                            if (i20 == 1 && peerId > 0) {
                                                i11 = size3;
                                                break;
                                            } else {
                                                i11 = size3;
                                            }
                                            size3 = i11;
                                        } else {
                                            i11 = size3;
                                        }
                                        arrayList5.remove(i27);
                                        iVar4.l(peerId);
                                        i27--;
                                        size3 = i11 - 1;
                                    } else {
                                        arrayList5.remove(i27);
                                        i27--;
                                        size3--;
                                    }
                                    i27++;
                                }
                            }
                            if ((i21 != 0 || i21 == 3 || i21 == 2) && (chat = srVar.r) != null && chat.megagroup) {
                                chatFull = srVar.s;
                                if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants_count <= 200) {
                                    srVar.z0(arrayList2);
                                    i22 = size2;
                                }
                            }
                            if (i21 == 1) {
                                try {
                                } catch (Exception e) {
                                    e = e;
                                }
                                try {
                                    Collections.sort(arrayList5, new df(4));
                                } catch (Exception e7) {
                                    e = e7;
                                    FileLog.e(e);
                                    i22 = size2;
                                    i23++;
                                    arrayList3 = arrayList;
                                    i18 = 2;
                                    i19 = 1;
                                }
                                i22 = size2;
                            }
                            i22 = size2;
                        } else {
                            iVar4.b();
                        }
                        iVar = iVar4;
                        arrayList2 = arrayList5;
                        arrayList2.clear();
                        arrayList2.addAll(tL_channels_channelParticipants.participants);
                        size = tL_channels_channelParticipants.participants.size();
                        i10 = 0;
                        while (i10 < size) {
                        }
                        int size22 = arrayList2.size() + i22;
                        if (i21 == 2) {
                        }
                        if (i21 != 0) {
                        }
                        chatFull = srVar.s;
                        if (chatFull instanceof TLRPC.TL_channelFull) {
                            srVar.z0(arrayList2);
                            i22 = size22;
                        }
                        if (i21 == 1) {
                        }
                        i22 = size22;
                    }
                    i23++;
                    arrayList3 = arrayList;
                    i18 = 2;
                    i19 = 1;
                }
                int i28 = i22;
                if (i21 != i18 || srVar.k1 <= 0) {
                    or orVar = srVar.a;
                    srVar.y0(orVar != null ? orVar.d.d1 : 0);
                    srVar.Q = false;
                    srVar.R = true;
                    org.telegram.ui.ActionBar.v0 v0Var = srVar.f;
                    if (v0Var != null) {
                        v0Var.setVisibility((i21 != 0 || i28 > 5) ? 0 : 8);
                    }
                }
                srVar.B0();
                or orVar2 = srVar.a;
                if (orVar2 != null) {
                    ai.w0 w0Var = srVar.c;
                    w0Var.Y1 = srVar.B1;
                    w0Var.Z1 = 0;
                    orVar2.l();
                    org.telegram.ui.Components.kx0 kx0Var = srVar.b;
                    if (kx0Var != null && srVar.a.d.d1 == 0 && srVar.R) {
                        kx0Var.e(false, true);
                    }
                }
                srVar.resumeDelayedFragmentAnimation();
                break;
            case 1:
                ((uy) obj3).removeSelfFromStack();
                ((md) obj2).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.n2) obj).finishFragment();
                break;
            case 2:
                uy uyVar = (uy) obj3;
                int length = ((Object[]) obj).length;
                uyVar.u4((ty) obj2);
                sw swVar = uyVar.z0;
                if (swVar != null && swVar.getVisibility() == 0) {
                    uyVar.z0.c();
                    break;
                }
                break;
            case 3:
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                uy uyVar2 = ((tw) obj3).b;
                if (!((boolean[]) obj2)[0]) {
                    r00.S(uyVar2, dialogFilter, null);
                    break;
                } else {
                    uyVar2.presentFragment(new c00(dialogFilter, null));
                    break;
                }
            case 4:
                gz gzVar = (gz) obj3;
                gzVar.getClass();
                gzVar.p((TLRPC.TL_messages_stickerSet) ((TLObject) obj2), (MessageObject) obj);
                break;
            case 5:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj3;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ArrayList arrayList6 = ExternalActionActivity.x;
                try {
                    b2Var.dismiss();
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.ActionBar.b2 x02 = org.telegram.ui.Components.e5.x0(externalActionActivity, LocaleController.getString(R.string.UpdateAppAlert), true);
                        if (x02 != null) {
                            x02.setOnDismissListener(new ei.e0(8, externalActionActivity, tL_error));
                        } else {
                            externalActionActivity.setResult(1, new Intent().putExtra("error", tL_error.text));
                            externalActionActivity.finish();
                        }
                    } else {
                        if (!"BOT_INVALID".equals(tL_error.text) && !"PUBLIC_KEY_REQUIRED".equals(tL_error.text) && !"PUBLIC_KEY_INVALID".equals(tL_error.text) && !"SCOPE_EMPTY".equals(tL_error.text) && !"PAYLOAD_EMPTY".equals(tL_error.text)) {
                            externalActionActivity.setResult(0);
                            externalActionActivity.finish();
                        }
                        externalActionActivity.setResult(1, new Intent().putExtra("error", tL_error.text));
                        externalActionActivity.finish();
                    }
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
            case 6:
                f10 f10Var = (f10) obj3;
                TLObject tLObject2 = (TLObject) obj;
                f10.r0((TLRPC.TL_error) obj2, f10Var, org.telegram.ui.Components.xc.a0(f10Var));
                if (tLObject2 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    f10Var.getMessagesController().loadRemoteFilters(true);
                    TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = (TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject2;
                    c00 c00Var = new c00(f10Var.r, tL_chatlists_exportedChatlistInvite.invite);
                    c00Var.y = new f00(f10Var, i19);
                    c00Var.x = new f00(f10Var, i18);
                    f10Var.presentFragment(c00Var);
                    AndroidUtilities.runOnUIThread(new cu(i17, f10Var, tL_chatlists_exportedChatlistInvite), 200L);
                    break;
                }
                break;
            case 7:
                r00 r00Var = (r00) obj3;
                TLObject tLObject3 = (TLObject) obj;
                org.telegram.ui.ActionBar.n2 n2Var = r00Var.n;
                f10.r0((TLRPC.TL_error) obj2, n2Var, new org.telegram.ui.Components.xc(r00Var.Z, null));
                if (tLObject3 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    r00Var.dismiss();
                    n2Var.getMessagesController().loadRemoteFilters(true);
                    n2Var.presentFragment(new c00(r00Var.X, ((TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject3).invite));
                    break;
                }
                break;
            case 8:
                y00 y00Var = (y00) obj3;
                x00 x00Var = (x00) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    org.telegram.ui.Components.xc.a0(y00Var.a).t(LocaleController.getString(R.string.UnknownError), null).j();
                    AndroidUtilities.cancelRunOnUIThread(x00Var);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = ((e20) obj3).e;
                if (b2Var2 != null) {
                    try {
                        b2Var2.dismiss();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                }
                filtersSetupActivity.getMessagesController().removeFilter(dialogFilter2);
                filtersSetupActivity.getMessagesStorage().deleteDialogFilter(dialogFilter2);
                break;
            case 10:
                c70 c70Var = (c70) obj3;
                ArrayList arrayList7 = (ArrayList) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                e70 e70Var = c70Var.I;
                gg.c2 c2Var = c70Var.f;
                if (c70Var.n) {
                    c70Var.h = null;
                    c70Var.d = arrayList7;
                    c70Var.e = arrayList8;
                    c2Var.f(arrayList7, null);
                    e70Var.q0(c70Var.H);
                    c70Var.l();
                    if (c70Var.n && !c2Var.e() && c70Var.h() == 0) {
                        e70Var.s.e(false, true);
                        break;
                    }
                }
                break;
            case 11:
                d80 d80Var = (d80) obj3;
                TLRPC.TL_langPackString tL_langPackString = (TLRPC.TL_langPackString) obj2;
                String str = (String) obj;
                if (!d80Var.M) {
                    d80Var.f.setText(tL_langPackString.value);
                    MessagesController.getGlobalMainSettings().edit().putString("language_showed2", str.toLowerCase()).apply();
                    break;
                }
                break;
            case 12:
                h80 h80Var = (h80) obj3;
                ArrayList arrayList9 = (ArrayList) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                if (h80Var.h) {
                    h80Var.d = arrayList9;
                    h80Var.e = arrayList10;
                    h80Var.l();
                    h80Var.n.r.e(false, true);
                    break;
                }
                break;
            case 13:
                TLRPC.User user = (TLRPC.User) obj2;
                Pattern pattern = LaunchActivity.B1;
                MessagesController.getInstance(((LaunchActivity) obj3).O).putUser(user, true);
                ((ga0) obj).run(user);
                break;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                y80 y80Var = (y80) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                Pattern pattern2 = LaunchActivity.B1;
                try {
                    y80Var.run();
                    if ("APP_VERSION_OUTDATED".equals(tL_error2.text)) {
                        org.telegram.ui.Components.e5.x0(launchActivity, LocaleController.getString(R.string.UpdateAppAlert), true);
                    } else {
                        launchActivity.B0(org.telegram.ui.Components.e5.N(launchActivity, null, LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error2.text));
                    }
                    break;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            case 15:
                LaunchActivity launchActivity2 = (LaunchActivity) obj3;
                y80 y80Var2 = (y80) obj2;
                TLObject tLObject4 = (TLObject) obj;
                Pattern pattern3 = LaunchActivity.B1;
                try {
                    y80Var2.run();
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
                if (tLObject4 instanceof TLRPC.TL_help_deepLinkInfo) {
                    TLRPC.TL_help_deepLinkInfo tL_help_deepLinkInfo = (TLRPC.TL_help_deepLinkInfo) tLObject4;
                    org.telegram.ui.Components.e5.x0(launchActivity2, tL_help_deepLinkInfo.message, tL_help_deepLinkInfo.update_app);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj2;
                Pattern pattern4 = LaunchActivity.B1;
                i6Var.d((File) obj, i6Var.c);
                AndroidUtilities.runOnUIThread(new g90((LaunchActivity) obj3, 7));
                break;
            case 17:
                LaunchActivity launchActivity3 = (LaunchActivity) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) obj;
                if (!(tLObject5 instanceof TLRPC.TL_wallPaper)) {
                    Pattern pattern5 = LaunchActivity.B1;
                    launchActivity3.h0();
                    break;
                } else {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject5;
                    launchActivity3.S0 = i6Var2;
                    launchActivity3.Q0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                    launchActivity3.R0 = tL_wallPaper;
                    FileLoader.getInstance(i6Var2.E).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    break;
                }
            case 18:
                LaunchActivity launchActivity4 = (LaunchActivity) obj3;
                int[] iArr = (int[]) obj2;
                long[] jArr = (long[]) obj;
                Pattern pattern6 = LaunchActivity.B1;
                launchActivity4.getClass();
                int i29 = iArr[0] - 1;
                iArr[0] = i29;
                if (i29 == 0) {
                    NotificationCenter.getInstance(launchActivity4.O).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    launchActivity4.l0(jArr, false);
                    break;
                }
                break;
            case 19:
                gc0 gc0Var = (gc0) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                String str2 = (String) obj;
                gc0Var.a();
                if (tLObject6 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.e5.x0(gc0Var.a, LocaleController.getString(R.string.UpdateAppAlert), true);
                    }
                    bc0 bc0Var = new bc0(gc0Var, str2, 0);
                    if (!password.has_password) {
                        gh1 gh1Var = new gh1(TextUtils.isEmpty(password.email_unconfirmed_pattern) ? 6 : 5, password);
                        gh1Var.j0 = bc0Var;
                        gc0Var.n(gh1Var, false);
                        break;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.I = password;
                        twoStepVerificationActivity.J = false;
                        gc0Var.n(twoStepVerificationActivity, false);
                        bc0Var.run();
                        break;
                    }
                }
                break;
            case 20:
                dc0 dc0Var = (dc0) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tLObject7 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject7;
                    dc0Var.getMessagesController().putUsers(tL_users_userFull.users, false);
                    dc0Var.getMessagesController().putChats(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.voip.f2.m(user2, false, userFull != null && userFull.video_calls_available, dc0Var.getParentActivity(), userFull, dc0Var.getAccountInstance());
                break;
            case 21:
                jd0 jd0Var = (jd0) obj3;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) obj;
                ImageView imageView = new ImageView(jd0Var.getParentActivity());
                imageView.setImageBitmap((Bitmap) obj2);
                ViewGroup viewGroup = (ViewGroup) gLSurfaceView.getParent();
                try {
                    viewGroup.addView(imageView, viewGroup.indexOfChild(gLSurfaceView));
                } catch (Exception e14) {
                    FileLog.e(e14);
                }
                AndroidUtilities.runOnUIThread(new vq(jd0Var, viewGroup, gLSurfaceView, 22), 100L);
                break;
            case 22:
                jd0 jd0Var2 = (jd0) obj3;
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                GLSurfaceView gLSurfaceView2 = (GLSurfaceView) obj;
                jd0Var2.getClass();
                try {
                    viewGroup2.removeView(gLSurfaceView2);
                } catch (Exception e15) {
                    FileLog.e(e15);
                }
                jd0Var2.M = true;
                jd0Var2.finishFragment();
                break;
            case 23:
                jd0 jd0Var3 = (jd0) obj3;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) obj2;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) obj;
                jd0Var3.getClass();
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                jd0Var3.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                jd0Var3.finishFragment();
                break;
            case 24:
                xg0 xg0Var = (xg0) obj3;
                xg0Var.getClass();
                xg0Var.g1((Bundle) obj2, (TLRPC.auth_SentCode) ((TLObject) obj), true);
                break;
            case 25:
                org.telegram.ui.Components.qn qnVar = (org.telegram.ui.Components.qn) obj3;
                EditText editText = (EditText) obj2;
                AtomicReference atomicReference = (AtomicReference) obj;
                qnVar.getClass();
                editText.removeTextChangedListener(qnVar);
                editText.removeCallbacks((Runnable) atomicReference.get());
                ((Runnable) atomicReference.get()).run();
                break;
            case 26:
                TLObject tLObject8 = (TLObject) obj2;
                Bundle bundle = (Bundle) obj;
                xg0 xg0Var2 = ((he0) obj3).W;
                if (!(tLObject8 instanceof TL_account.TL_emailVerified) || xg0Var2.F != 3) {
                    if (!(tLObject8 instanceof TL_account.TL_emailVerifiedLogin)) {
                        if (tLObject8 instanceof TLRPC.TL_auth_authorization) {
                            xg0Var2.o1((TLRPC.TL_auth_authorization) tLObject8, false);
                            break;
                        }
                    } else {
                        xg0Var2.g1(bundle, ((TL_account.TL_emailVerifiedLogin) tLObject8).sent_code, true);
                        break;
                    }
                } else {
                    xg0Var2.finishFragment();
                    xg0Var2.d0.run();
                    break;
                }
                break;
            case 27:
                if0 if0Var = (if0) obj3;
                TLObject tLObject9 = (TLObject) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                xg0 xg0Var3 = if0Var.O;
                if0Var.H = false;
                if (!(tLObject9 instanceof TLRPC.TL_auth_authorization)) {
                    xg0Var3.k1(false, true);
                    if (!tL_error3.text.contains("PHONE_NUMBER_INVALID")) {
                        if (!tL_error3.text.contains("PHONE_CODE_EMPTY") && !tL_error3.text.contains("PHONE_CODE_INVALID")) {
                            if (!tL_error3.text.contains("PHONE_CODE_EXPIRED")) {
                                if (!tL_error3.text.contains("FIRSTNAME_INVALID")) {
                                    if (!tL_error3.text.contains("LASTNAME_INVALID")) {
                                        xg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                        break;
                                    } else {
                                        xg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidLastName", R.string.InvalidLastName));
                                        break;
                                    }
                                } else {
                                    xg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidFirstName", R.string.InvalidFirstName));
                                    break;
                                }
                            } else {
                                if0Var.c(true);
                                xg0Var3.u1(0, true, null, true);
                                xg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                break;
                            }
                        } else {
                            xg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                            break;
                        }
                    } else {
                        xg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                        break;
                    }
                } else {
                    if0Var.o();
                    xg0Var3.v1(false, true);
                    if0Var.postDelayed(new y80(18, if0Var, tLObject9), 150L);
                    break;
                }
                break;
            case 28:
                if0 if0Var2 = (if0) obj3;
                TLRPC.FileLocation fileLocation = ((TLRPC.PhotoSize) obj2).location;
                if0Var2.M = fileLocation;
                if0Var2.N = ((TLRPC.PhotoSize) obj).location;
                if0Var2.e.h(ImageLocation.getForLocal(fileLocation), "50_50", if0Var2.f, null);
                break;
            default:
                ag0 ag0Var = (ag0) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                TL_account.confirmPhone confirmphone = (TL_account.confirmPhone) obj;
                int i30 = ag0Var.f0;
                xg0 xg0Var4 = ag0Var.s0;
                ag0Var.z(false);
                ag0Var.d0 = false;
                if (tL_error4 != null) {
                    ag0Var.e0 = tL_error4.text;
                    if ((i30 == 3 && ((i15 = ag0Var.g0) == 4 || i15 == 2 || i15 == 17 || i15 == 16)) || ((i30 == 2 && ((i13 = ag0Var.g0) == 4 || i13 == 3)) || (i30 == 4 && ((i12 = ag0Var.g0) == 2 || i12 == 17 || i12 == 16)))) {
                        ag0Var.u();
                    }
                    if (i30 == 15) {
                        NotificationCenter.getGlobalInstance().addObserver(ag0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i30 == 2) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(ag0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i30 == 3) {
                        AndroidUtilities.setWaitingForCall(true);
                        NotificationCenter.getGlobalInstance().addObserver(ag0Var, NotificationCenter.didReceiveCall);
                    }
                    ag0Var.c0 = true;
                    if (i30 != 3) {
                        i14 = ((org.telegram.ui.ActionBar.n2) xg0Var4).currentAccount;
                        org.telegram.ui.Components.e5.f0(i14, tL_error4, xg0Var4, confirmphone, new Object[0]);
                    }
                    if (!tL_error4.text.contains("PHONE_CODE_EMPTY") && !tL_error4.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error4.text.contains("PHONE_CODE_EXPIRED")) {
                            ag0Var.c(true);
                            xg0Var4.u1(0, true, null, true);
                            break;
                        }
                    } else {
                        ag0Var.y();
                        break;
                    }
                } else {
                    Activity parentActivity = xg0Var4.getParentActivity();
                    if (parentActivity != null) {
                        ag0Var.q(new y80(21, ag0Var, parentActivity));
                        break;
                    }
                }
                break;
        }
    }
}
