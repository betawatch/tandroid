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
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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

    /* JADX WARN: Removed duplicated region for block: B:308:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0796 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        ArrayList arrayList;
        int i11;
        char c10;
        int i12;
        int i13;
        a0.i iVar;
        ArrayList arrayList2;
        int size;
        int i14;
        TLRPC.Chat chat;
        TLRPC.ChatFull chatFull;
        TLRPC.UserFull userFull;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = this.a;
        int i20 = 2;
        int i21 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i19) {
            case 0:
                tr trVar = (tr) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                a0.i iVar2 = trVar.L;
                a0.i iVar3 = trVar.M;
                int i22 = trVar.e1;
                a0.i iVar4 = trVar.K;
                int i23 = trVar.O;
                ArrayList arrayList5 = trVar.F;
                int i24 = 0;
                int i25 = 0;
                while (i25 < arrayList3.size()) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) arrayList3.get(i25);
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) arrayList4.get(i25);
                    if (tL_channels_getParticipants == null || tL_channels_channelParticipants == null) {
                        i10 = i25;
                        arrayList = arrayList3;
                        i11 = i23;
                        c10 = 3;
                    } else {
                        if (i23 == i21) {
                            i13 = i21;
                            i12 = i23;
                            trVar.getMessagesController().processLoadedAdminsResponse(trVar.N, tL_channels_channelParticipants);
                        } else {
                            i12 = i23;
                            i13 = i21;
                        }
                        trVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
                        trVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
                        long clientUserId = trVar.getUserConfig().getClientUserId();
                        if (i22 != 0) {
                            int i26 = 0;
                            while (true) {
                                if (i26 < tL_channels_channelParticipants.participants.size()) {
                                    if (MessageObject.getPeerId(tL_channels_channelParticipants.participants.get(i26).peer) == clientUserId) {
                                        tL_channels_channelParticipants.participants.remove(i26);
                                    } else {
                                        i26++;
                                    }
                                }
                            }
                        }
                        i11 = i12;
                        if (i11 == 2) {
                            trVar.k1--;
                            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = tL_channels_getParticipants.filter;
                            if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsContacts) {
                                arrayList2 = trVar.H;
                                iVar = iVar3;
                            } else if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsBots) {
                                arrayList2 = trVar.G;
                                iVar = iVar2;
                            }
                            arrayList2.clear();
                            i10 = i25;
                            arrayList2.addAll(tL_channels_channelParticipants.participants);
                            size = tL_channels_channelParticipants.participants.size();
                            arrayList = arrayList3;
                            i14 = 0;
                            while (i14 < size) {
                                int i27 = size;
                                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i14);
                                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants2 = tL_channels_channelParticipants;
                                long j3 = clientUserId;
                                if (channelParticipant.user_id == j3) {
                                    arrayList2.remove(channelParticipant);
                                } else {
                                    iVar.k(channelParticipant, MessageObject.getPeerId(channelParticipant.peer));
                                }
                                i14++;
                                size = i27;
                                tL_channels_channelParticipants = tL_channels_channelParticipants2;
                                clientUserId = j3;
                            }
                            int size2 = arrayList2.size() + i24;
                            if (i11 == 2) {
                                int size3 = arrayList5.size();
                                int i28 = 0;
                                while (i28 < size3) {
                                    TLObject tLObject = (TLObject) arrayList5.get(i28);
                                    if (tLObject instanceof TLRPC.ChannelParticipant) {
                                        long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
                                        if (iVar3.f(peerId) != null || iVar2.f(peerId) != null || (i22 == i13 && peerId > 0 && UserObject.isDeleted(trVar.getMessagesController().getUser(Long.valueOf(peerId))))) {
                                            arrayList5.remove(i28);
                                            iVar4.l(peerId);
                                            i28--;
                                            size3--;
                                        }
                                    } else {
                                        arrayList5.remove(i28);
                                        i28--;
                                        size3--;
                                    }
                                    i28++;
                                    i13 = 1;
                                }
                            }
                            c10 = 3;
                            if ((i11 != 0 || i11 == 3 || i11 == 2) && (chat = trVar.r) != null && chat.megagroup) {
                                chatFull = trVar.s;
                                if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants_count <= 200) {
                                    trVar.z0(arrayList2);
                                    i24 = size2;
                                }
                            }
                            if (i11 == 1) {
                                try {
                                    try {
                                        Collections.sort(arrayList5, new gf(4));
                                    } catch (Exception e7) {
                                        e = e7;
                                        FileLog.e(e);
                                        i24 = size2;
                                        i25 = i10 + 1;
                                        i23 = i11;
                                        arrayList3 = arrayList;
                                        i20 = 2;
                                        i21 = 1;
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                }
                                i24 = size2;
                            }
                            i24 = size2;
                        } else {
                            iVar4.b();
                        }
                        iVar = iVar4;
                        arrayList2 = arrayList5;
                        arrayList2.clear();
                        i10 = i25;
                        arrayList2.addAll(tL_channels_channelParticipants.participants);
                        size = tL_channels_channelParticipants.participants.size();
                        arrayList = arrayList3;
                        i14 = 0;
                        while (i14 < size) {
                        }
                        int size22 = arrayList2.size() + i24;
                        if (i11 == 2) {
                        }
                        c10 = 3;
                        if (i11 != 0) {
                        }
                        chatFull = trVar.s;
                        if (chatFull instanceof TLRPC.TL_channelFull) {
                            trVar.z0(arrayList2);
                            i24 = size22;
                        }
                        if (i11 == 1) {
                        }
                        i24 = size22;
                    }
                    i25 = i10 + 1;
                    i23 = i11;
                    arrayList3 = arrayList;
                    i20 = 2;
                    i21 = 1;
                }
                int i29 = i23;
                if (i29 != i20 || trVar.k1 <= 0) {
                    pr prVar = trVar.a;
                    trVar.y0(prVar != null ? prVar.d.d1 : 0);
                    trVar.Q = false;
                    trVar.R = true;
                    org.telegram.ui.ActionBar.v0 v0Var = trVar.f;
                    if (v0Var != null) {
                        v0Var.setVisibility((i29 != 0 || i24 > 5) ? 0 : 8);
                    }
                }
                trVar.B0();
                pr prVar2 = trVar.a;
                if (prVar2 != null) {
                    ai.w0 w0Var = trVar.c;
                    w0Var.W1 = trVar.B1;
                    w0Var.X1 = 0;
                    prVar2.l();
                    org.telegram.ui.Components.ay0 ay0Var = trVar.b;
                    if (ay0Var != null && trVar.a.d.d1 == 0 && trVar.R) {
                        ay0Var.e(false, true);
                    }
                }
                trVar.resumeDelayedFragmentAnimation();
                break;
            case 1:
                ((ty) obj3).removeSelfFromStack();
                ((md) obj2).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.n2) obj).finishFragment();
                break;
            case 2:
                ty tyVar = (ty) obj3;
                int length = ((Object[]) obj).length;
                tyVar.r4((sy) obj2);
                qw qwVar = tyVar.z0;
                if (qwVar != null && qwVar.getVisibility() == 0) {
                    tyVar.z0.c();
                    break;
                }
                break;
            case 3:
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                ty tyVar2 = ((sw) obj3).b;
                if (!((boolean[]) obj2)[0]) {
                    r00.T(tyVar2, dialogFilter, null);
                    break;
                } else {
                    tyVar2.presentFragment(new c00(dialogFilter, null));
                    break;
                }
            case 4:
                fz fzVar = (fz) obj3;
                fzVar.getClass();
                fzVar.o((TLRPC.TL_messages_stickerSet) ((TLObject) obj2), (MessageObject) obj);
                break;
            case 5:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj3;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ArrayList arrayList6 = ExternalActionActivity.x;
                try {
                    b2Var.dismiss();
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.ActionBar.b2 w02 = org.telegram.ui.Components.g5.w0(externalActionActivity, LocaleController.getString(R.string.UpdateAppAlert), true);
                        if (w02 != null) {
                            w02.setOnDismissListener(new ei.e0(8, externalActionActivity, tL_error));
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
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 6:
                f10 f10Var = (f10) obj3;
                TLObject tLObject2 = (TLObject) obj;
                f10.r0((TLRPC.TL_error) obj2, f10Var, org.telegram.ui.Components.ad.a0(f10Var));
                if (tLObject2 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    f10Var.getMessagesController().loadRemoteFilters(true);
                    TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = (TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject2;
                    c00 c00Var = new c00(f10Var.r, tL_chatlists_exportedChatlistInvite.invite);
                    c00Var.y = new f00(f10Var, i21);
                    c00Var.x = new f00(f10Var, i20);
                    f10Var.presentFragment(c00Var);
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ea1(23, f10Var, tL_chatlists_exportedChatlistInvite), 200L);
                    break;
                }
                break;
            case 7:
                r00 r00Var = (r00) obj3;
                TLObject tLObject3 = (TLObject) obj;
                org.telegram.ui.ActionBar.n2 n2Var = r00Var.n;
                f10.r0((TLRPC.TL_error) obj2, n2Var, new org.telegram.ui.Components.ad(r00Var.Z, null));
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
                    org.telegram.ui.Components.ad.a0(y00Var.a).t(LocaleController.getString(R.string.UnknownError), null).j();
                    AndroidUtilities.cancelRunOnUIThread(x00Var);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = ((c20) obj3).e;
                if (b2Var2 != null) {
                    try {
                        b2Var2.dismiss();
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                }
                filtersSetupActivity.getMessagesController().removeFilter(dialogFilter2);
                filtersSetupActivity.getMessagesStorage().deleteDialogFilter(dialogFilter2);
                break;
            case 10:
                a70 a70Var = (a70) obj3;
                ArrayList arrayList7 = (ArrayList) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                c70 c70Var = a70Var.I;
                gg.b2 b2Var3 = a70Var.f;
                if (a70Var.n) {
                    a70Var.h = null;
                    a70Var.d = arrayList7;
                    a70Var.e = arrayList8;
                    b2Var3.f(arrayList7, null);
                    c70Var.q0(a70Var.H);
                    a70Var.l();
                    if (a70Var.n && !b2Var3.e() && a70Var.h() == 0) {
                        c70Var.s.e(false, true);
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
                ((ea0) obj).run(user);
                break;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                m70 m70Var = (m70) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                Pattern pattern2 = LaunchActivity.B1;
                try {
                    m70Var.run();
                    if ("APP_VERSION_OUTDATED".equals(tL_error2.text)) {
                        org.telegram.ui.Components.g5.w0(launchActivity, LocaleController.getString(R.string.UpdateAppAlert), true);
                    } else {
                        launchActivity.B0(org.telegram.ui.Components.g5.M(launchActivity, null, LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error2.text));
                    }
                    break;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    return;
                }
            case 15:
                LaunchActivity launchActivity2 = (LaunchActivity) obj3;
                m70 m70Var2 = (m70) obj2;
                TLObject tLObject4 = (TLObject) obj;
                Pattern pattern3 = LaunchActivity.B1;
                try {
                    m70Var2.run();
                } catch (Exception e14) {
                    FileLog.e(e14);
                }
                if (tLObject4 instanceof TLRPC.TL_help_deepLinkInfo) {
                    TLRPC.TL_help_deepLinkInfo tL_help_deepLinkInfo = (TLRPC.TL_help_deepLinkInfo) tLObject4;
                    org.telegram.ui.Components.g5.w0(launchActivity2, tL_help_deepLinkInfo.message, tL_help_deepLinkInfo.update_app);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj2;
                Pattern pattern4 = LaunchActivity.B1;
                h6Var.d((File) obj, h6Var.c);
                AndroidUtilities.runOnUIThread(new f90((LaunchActivity) obj3, 7));
                break;
            case 17:
                LaunchActivity launchActivity3 = (LaunchActivity) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) obj;
                if (!(tLObject5 instanceof TLRPC.TL_wallPaper)) {
                    Pattern pattern5 = LaunchActivity.B1;
                    launchActivity3.h0();
                    break;
                } else {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject5;
                    launchActivity3.S0 = h6Var2;
                    launchActivity3.Q0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                    launchActivity3.R0 = tL_wallPaper;
                    FileLoader.getInstance(h6Var2.E).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    break;
                }
            case 18:
                LaunchActivity launchActivity4 = (LaunchActivity) obj3;
                int[] iArr = (int[]) obj2;
                long[] jArr = (long[]) obj;
                Pattern pattern6 = LaunchActivity.B1;
                launchActivity4.getClass();
                int i30 = iArr[0] - 1;
                iArr[0] = i30;
                if (i30 == 0) {
                    NotificationCenter.getInstance(launchActivity4.O).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    launchActivity4.l0(jArr, false);
                    break;
                }
                break;
            case 19:
                ec0 ec0Var = (ec0) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                String str2 = (String) obj;
                ec0Var.c();
                if (tLObject6 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.g5.w0(ec0Var.a, LocaleController.getString(R.string.UpdateAppAlert), true);
                    }
                    zb0 zb0Var = new zb0(ec0Var, str2, 2);
                    if (!password.has_password) {
                        ih1 ih1Var = new ih1(TextUtils.isEmpty(password.email_unconfirmed_pattern) ? 6 : 5, password);
                        ih1Var.j0 = zb0Var;
                        ec0Var.u(ih1Var, false);
                        break;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.I = password;
                        twoStepVerificationActivity.J = false;
                        ec0Var.u(twoStepVerificationActivity, false);
                        zb0Var.run();
                        break;
                    }
                }
                break;
            case 20:
                bc0 bc0Var = (bc0) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tLObject7 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject7;
                    bc0Var.getMessagesController().putUsers(tL_users_userFull.users, false);
                    bc0Var.getMessagesController().putChats(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.voip.f2.m(user2, false, userFull != null && userFull.video_calls_available, bc0Var.getParentActivity(), userFull, bc0Var.getAccountInstance());
                break;
            case 21:
                hd0 hd0Var = (hd0) obj3;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) obj;
                ImageView imageView = new ImageView(hd0Var.getParentActivity());
                imageView.setImageBitmap((Bitmap) obj2);
                ViewGroup viewGroup = (ViewGroup) gLSurfaceView.getParent();
                try {
                    viewGroup.addView(imageView, viewGroup.indexOfChild(gLSurfaceView));
                } catch (Exception e15) {
                    FileLog.e(e15);
                }
                AndroidUtilities.runOnUIThread(new vq(hd0Var, viewGroup, gLSurfaceView, 22), 100L);
                break;
            case 22:
                hd0 hd0Var2 = (hd0) obj3;
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                GLSurfaceView gLSurfaceView2 = (GLSurfaceView) obj;
                hd0Var2.getClass();
                try {
                    viewGroup2.removeView(gLSurfaceView2);
                } catch (Exception e16) {
                    FileLog.e(e16);
                }
                hd0Var2.M = true;
                hd0Var2.finishFragment();
                break;
            case 23:
                hd0 hd0Var3 = (hd0) obj3;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) obj2;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) obj;
                hd0Var3.getClass();
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                hd0Var3.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                hd0Var3.finishFragment();
                break;
            case 24:
                wg0 wg0Var = (wg0) obj3;
                wg0Var.getClass();
                wg0Var.g1((Bundle) obj2, (TLRPC.auth_SentCode) ((TLObject) obj), true);
                break;
            case 25:
                org.telegram.ui.Components.ho hoVar = (org.telegram.ui.Components.ho) obj3;
                EditText editText = (EditText) obj2;
                AtomicReference atomicReference = (AtomicReference) obj;
                hoVar.getClass();
                editText.removeTextChangedListener(hoVar);
                editText.removeCallbacks((Runnable) atomicReference.get());
                ((Runnable) atomicReference.get()).run();
                break;
            case 26:
                TLObject tLObject8 = (TLObject) obj2;
                Bundle bundle = (Bundle) obj;
                wg0 wg0Var2 = ((fe0) obj3).W;
                if (!(tLObject8 instanceof TL_account.TL_emailVerified) || wg0Var2.F != 3) {
                    if (!(tLObject8 instanceof TL_account.TL_emailVerifiedLogin)) {
                        if (tLObject8 instanceof TLRPC.TL_auth_authorization) {
                            wg0Var2.o1((TLRPC.TL_auth_authorization) tLObject8, false);
                            break;
                        }
                    } else {
                        wg0Var2.g1(bundle, ((TL_account.TL_emailVerifiedLogin) tLObject8).sent_code, true);
                        break;
                    }
                } else {
                    wg0Var2.finishFragment();
                    wg0Var2.d0.run();
                    break;
                }
                break;
            case 27:
                gf0 gf0Var = (gf0) obj3;
                TLObject tLObject9 = (TLObject) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                wg0 wg0Var3 = gf0Var.O;
                gf0Var.H = false;
                if (!(tLObject9 instanceof TLRPC.TL_auth_authorization)) {
                    wg0Var3.k1(false, true);
                    if (!tL_error3.text.contains("PHONE_NUMBER_INVALID")) {
                        if (!tL_error3.text.contains("PHONE_CODE_EMPTY") && !tL_error3.text.contains("PHONE_CODE_INVALID")) {
                            if (!tL_error3.text.contains("PHONE_CODE_EXPIRED")) {
                                if (!tL_error3.text.contains("FIRSTNAME_INVALID")) {
                                    if (!tL_error3.text.contains("LASTNAME_INVALID")) {
                                        wg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                        break;
                                    } else {
                                        wg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidLastName", R.string.InvalidLastName));
                                        break;
                                    }
                                } else {
                                    wg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidFirstName", R.string.InvalidFirstName));
                                    break;
                                }
                            } else {
                                gf0Var.c(true);
                                wg0Var3.u1(0, true, null, true);
                                wg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                break;
                            }
                        } else {
                            wg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                            break;
                        }
                    } else {
                        wg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                        break;
                    }
                } else {
                    gf0Var.o();
                    wg0Var3.v1(false, true);
                    gf0Var.postDelayed(new m70(25, gf0Var, tLObject9), 150L);
                    break;
                }
                break;
            case 28:
                gf0 gf0Var2 = (gf0) obj3;
                TLRPC.FileLocation fileLocation = ((TLRPC.PhotoSize) obj2).location;
                gf0Var2.M = fileLocation;
                gf0Var2.N = ((TLRPC.PhotoSize) obj).location;
                gf0Var2.e.h(ImageLocation.getForLocal(fileLocation), "50_50", gf0Var2.f, null);
                break;
            default:
                zf0 zf0Var = (zf0) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                TL_account.confirmPhone confirmphone = (TL_account.confirmPhone) obj;
                int i31 = zf0Var.f0;
                wg0 wg0Var4 = zf0Var.s0;
                zf0Var.z(false);
                zf0Var.d0 = false;
                if (tL_error4 != null) {
                    zf0Var.e0 = tL_error4.text;
                    if ((i31 == 3 && ((i18 = zf0Var.g0) == 4 || i18 == 2 || i18 == 17 || i18 == 16)) || ((i31 == 2 && ((i16 = zf0Var.g0) == 4 || i16 == 3)) || (i31 == 4 && ((i15 = zf0Var.g0) == 2 || i15 == 17 || i15 == 16)))) {
                        zf0Var.t();
                    }
                    if (i31 == 15) {
                        NotificationCenter.getGlobalInstance().addObserver(zf0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i31 == 2) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(zf0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i31 == 3) {
                        AndroidUtilities.setWaitingForCall(true);
                        NotificationCenter.getGlobalInstance().addObserver(zf0Var, NotificationCenter.didReceiveCall);
                    }
                    zf0Var.c0 = true;
                    if (i31 != 3) {
                        i17 = ((org.telegram.ui.ActionBar.n2) wg0Var4).currentAccount;
                        org.telegram.ui.Components.g5.e0(i17, tL_error4, wg0Var4, confirmphone, new Object[0]);
                    }
                    if (!tL_error4.text.contains("PHONE_CODE_EMPTY") && !tL_error4.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error4.text.contains("PHONE_CODE_EXPIRED")) {
                            zf0Var.c(true);
                            wg0Var4.u1(0, true, null, true);
                            break;
                        }
                    } else {
                        zf0Var.y();
                        break;
                    }
                } else {
                    Activity parentActivity = wg0Var4.getParentActivity();
                    if (parentActivity != null) {
                        zf0Var.q(new m70(28, zf0Var, parentActivity));
                        break;
                    }
                }
                break;
        }
    }
}
