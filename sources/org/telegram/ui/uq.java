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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class uq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uq(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:310:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0797 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        a0.i iVar;
        ArrayList arrayList3;
        int size;
        int i10;
        TLRPC.Chat chat;
        TLRPC.ChatFull chatFull;
        TLRPC.UserFull userFull;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.a;
        int i16 = 15;
        int i17 = 17;
        int i18 = 2;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i15) {
            case 0:
                rr rrVar = (rr) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                a0.i iVar2 = rrVar.L;
                a0.i iVar3 = rrVar.M;
                int i19 = rrVar.e1;
                a0.i iVar4 = rrVar.K;
                int i20 = rrVar.O;
                ArrayList arrayList6 = rrVar.F;
                int i21 = 0;
                int i22 = 0;
                while (i22 < arrayList4.size()) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) arrayList4.get(i22);
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) arrayList5.get(i22);
                    if (tL_channels_getParticipants == null || tL_channels_channelParticipants == null) {
                        arrayList = arrayList5;
                        arrayList2 = arrayList4;
                    } else {
                        if (i20 == 1) {
                            arrayList2 = arrayList4;
                            rrVar.getMessagesController().processLoadedAdminsResponse(rrVar.N, tL_channels_channelParticipants);
                        } else {
                            arrayList2 = arrayList4;
                        }
                        rrVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
                        rrVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
                        long clientUserId = rrVar.getUserConfig().getClientUserId();
                        if (i19 != 0) {
                            int i23 = 0;
                            while (true) {
                                if (i23 < tL_channels_channelParticipants.participants.size()) {
                                    if (MessageObject.getPeerId(tL_channels_channelParticipants.participants.get(i23).peer) == clientUserId) {
                                        tL_channels_channelParticipants.participants.remove(i23);
                                    } else {
                                        i23++;
                                    }
                                }
                            }
                        }
                        if (i20 == 2) {
                            rrVar.k1--;
                            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = tL_channels_getParticipants.filter;
                            if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsContacts) {
                                arrayList3 = rrVar.H;
                                iVar = iVar3;
                            } else if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsBots) {
                                arrayList3 = rrVar.G;
                                iVar = iVar2;
                            }
                            arrayList3.clear();
                            arrayList3.addAll(tL_channels_channelParticipants.participants);
                            size = tL_channels_channelParticipants.participants.size();
                            arrayList = arrayList5;
                            i10 = 0;
                            while (i10 < size) {
                                long j3 = clientUserId;
                                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i10);
                                int i24 = size;
                                if (channelParticipant.user_id == j3) {
                                    arrayList3.remove(channelParticipant);
                                } else {
                                    iVar.k(channelParticipant, MessageObject.getPeerId(channelParticipant.peer));
                                }
                                i10++;
                                clientUserId = j3;
                                size = i24;
                            }
                            int size2 = arrayList3.size() + i21;
                            if (i20 == 2) {
                                int size3 = arrayList6.size();
                                int i25 = 0;
                                while (i25 < size3) {
                                    TLObject tLObject = (TLObject) arrayList6.get(i25);
                                    if (tLObject instanceof TLRPC.ChannelParticipant) {
                                        long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
                                        if (iVar3.f(peerId) != null || iVar2.f(peerId) != null || (i19 == 1 && peerId > 0 && UserObject.isDeleted(rrVar.getMessagesController().getUser(Long.valueOf(peerId))))) {
                                            arrayList6.remove(i25);
                                            iVar4.l(peerId);
                                        }
                                        i25++;
                                    } else {
                                        arrayList6.remove(i25);
                                    }
                                    i25--;
                                    size3--;
                                    i25++;
                                }
                            }
                            if ((i20 != 0 || i20 == 3 || i20 == 2) && (chat = rrVar.r) != null && chat.megagroup) {
                                chatFull = rrVar.s;
                                if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants_count <= 200) {
                                    rrVar.z0(arrayList3);
                                    i21 = size2;
                                }
                            }
                            if (i20 == 1) {
                                try {
                                } catch (Exception e7) {
                                    e = e7;
                                }
                                try {
                                    Collections.sort(arrayList6, new ff(4));
                                } catch (Exception e10) {
                                    e = e10;
                                    FileLog.e(e);
                                    i21 = size2;
                                    i22++;
                                    arrayList4 = arrayList2;
                                    arrayList5 = arrayList;
                                }
                                i21 = size2;
                            }
                            i21 = size2;
                        } else {
                            iVar4.b();
                        }
                        iVar = iVar4;
                        arrayList3 = arrayList6;
                        arrayList3.clear();
                        arrayList3.addAll(tL_channels_channelParticipants.participants);
                        size = tL_channels_channelParticipants.participants.size();
                        arrayList = arrayList5;
                        i10 = 0;
                        while (i10 < size) {
                        }
                        int size22 = arrayList3.size() + i21;
                        if (i20 == 2) {
                        }
                        if (i20 != 0) {
                        }
                        chatFull = rrVar.s;
                        if (chatFull instanceof TLRPC.TL_channelFull) {
                            rrVar.z0(arrayList3);
                            i21 = size22;
                        }
                        if (i20 == 1) {
                        }
                        i21 = size22;
                    }
                    i22++;
                    arrayList4 = arrayList2;
                    arrayList5 = arrayList;
                }
                if (i20 != 2 || rrVar.k1 <= 0) {
                    nr nrVar = rrVar.a;
                    rrVar.y0(nrVar != null ? nrVar.d.d1 : 0);
                    rrVar.Q = false;
                    rrVar.R = true;
                    org.telegram.ui.ActionBar.v0 v0Var = rrVar.f;
                    if (v0Var != null) {
                        v0Var.setVisibility((i20 != 0 || i21 > 5) ? 0 : 8);
                    }
                }
                rrVar.B0();
                nr nrVar2 = rrVar.a;
                if (nrVar2 != null) {
                    ai.w0 w0Var = rrVar.c;
                    w0Var.Y1 = rrVar.B1;
                    w0Var.Z1 = 0;
                    nrVar2.l();
                    org.telegram.ui.Components.tx0 tx0Var = rrVar.b;
                    if (tx0Var != null && rrVar.a.d.d1 == 0 && rrVar.R) {
                        tx0Var.e(false, true);
                    }
                }
                rrVar.resumeDelayedFragmentAnimation();
                break;
            case 1:
                ((uy) obj3).removeSelfFromStack();
                ((nd) obj2).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.n2) obj).finishFragment();
                break;
            case 2:
                uy uyVar = (uy) obj3;
                int length = ((Object[]) obj).length;
                uyVar.D4((ty) obj2);
                ky kyVar = uyVar.z0;
                if (kyVar != null && kyVar.getVisibility() == 0) {
                    uyVar.z0.c();
                    break;
                }
                break;
            case 3:
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                uy uyVar2 = ((ly) obj3).b;
                if (!((boolean[]) obj2)[0]) {
                    r00.Q(uyVar2, dialogFilter, null);
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
                ArrayList arrayList7 = ExternalActionActivity.x;
                try {
                    b2Var.dismiss();
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.ActionBar.b2 x02 = org.telegram.ui.Components.e5.x0(externalActionActivity, LocaleController.getString(R.string.UpdateAppAlert), true);
                        if (x02 != null) {
                            x02.setOnDismissListener(new ei.f0(8, externalActionActivity, tL_error));
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
                break;
            case 6:
                f10 f10Var = (f10) obj3;
                TLObject tLObject2 = (TLObject) obj;
                f10.r0((TLRPC.TL_error) obj2, f10Var, org.telegram.ui.Components.yc.a0(f10Var));
                if (tLObject2 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    f10Var.getMessagesController().loadRemoteFilters(true);
                    TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = (TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject2;
                    c00 c00Var = new c00(f10Var.r, tL_chatlists_exportedChatlistInvite.invite);
                    c00Var.y = new f00(f10Var, 1);
                    c00Var.x = new f00(f10Var, i18);
                    f10Var.presentFragment(c00Var);
                    AndroidUtilities.runOnUIThread(new cu(i16, f10Var, tL_chatlists_exportedChatlistInvite), 200L);
                    break;
                }
                break;
            case 7:
                r00 r00Var = (r00) obj3;
                TLObject tLObject3 = (TLObject) obj;
                org.telegram.ui.ActionBar.n2 n2Var = r00Var.n;
                f10.r0((TLRPC.TL_error) obj2, n2Var, new org.telegram.ui.Components.yc(r00Var.Z, null));
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
                    org.telegram.ui.Components.yc.a0(y00Var.a).t(LocaleController.getString(R.string.UnknownError), null).j();
                    AndroidUtilities.cancelRunOnUIThread(x00Var);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = ((d20) obj3).e;
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
                b70 b70Var = (b70) obj3;
                ArrayList arrayList8 = (ArrayList) obj2;
                ArrayList arrayList9 = (ArrayList) obj;
                d70 d70Var = b70Var.I;
                gg.c2 c2Var = b70Var.f;
                if (b70Var.n) {
                    b70Var.h = null;
                    b70Var.d = arrayList8;
                    b70Var.e = arrayList9;
                    c2Var.f(arrayList8, null);
                    d70Var.q0(b70Var.H);
                    b70Var.l();
                    if (b70Var.n && !c2Var.e() && b70Var.h() == 0) {
                        d70Var.s.e(false, true);
                        break;
                    }
                }
                break;
            case 11:
                c80 c80Var = (c80) obj3;
                TLRPC.TL_langPackString tL_langPackString = (TLRPC.TL_langPackString) obj2;
                String str = (String) obj;
                if (!c80Var.M) {
                    c80Var.f.setText(tL_langPackString.value);
                    MessagesController.getGlobalMainSettings().edit().putString("language_showed2", str.toLowerCase()).apply();
                    break;
                }
                break;
            case 12:
                g80 g80Var = (g80) obj3;
                ArrayList arrayList10 = (ArrayList) obj2;
                ArrayList arrayList11 = (ArrayList) obj;
                if (g80Var.h) {
                    g80Var.d = arrayList10;
                    g80Var.e = arrayList11;
                    g80Var.l();
                    g80Var.n.r.e(false, true);
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
                h90 h90Var = (h90) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                Pattern pattern2 = LaunchActivity.B1;
                try {
                    h90Var.run();
                    if ("APP_VERSION_OUTDATED".equals(tL_error2.text)) {
                        org.telegram.ui.Components.e5.x0(launchActivity, LocaleController.getString(R.string.UpdateAppAlert), true);
                    } else {
                        launchActivity.B0(org.telegram.ui.Components.e5.N(launchActivity, null, LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error2.text));
                    }
                    break;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    return;
                }
            case 15:
                LaunchActivity launchActivity2 = (LaunchActivity) obj3;
                h90 h90Var2 = (h90) obj2;
                TLObject tLObject4 = (TLObject) obj;
                Pattern pattern3 = LaunchActivity.B1;
                try {
                    h90Var2.run();
                } catch (Exception e14) {
                    FileLog.e(e14);
                }
                if (tLObject4 instanceof TLRPC.TL_help_deepLinkInfo) {
                    TLRPC.TL_help_deepLinkInfo tL_help_deepLinkInfo = (TLRPC.TL_help_deepLinkInfo) tLObject4;
                    org.telegram.ui.Components.e5.x0(launchActivity2, tL_help_deepLinkInfo.message, tL_help_deepLinkInfo.update_app);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj2;
                Pattern pattern4 = LaunchActivity.B1;
                h6Var.d((File) obj, h6Var.c);
                AndroidUtilities.runOnUIThread(new e90((LaunchActivity) obj3, 7));
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
                int i26 = iArr[0] - 1;
                iArr[0] = i26;
                if (i26 == 0) {
                    NotificationCenter.getInstance(launchActivity4.O).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    launchActivity4.l0(jArr, false);
                    break;
                }
                break;
            case 19:
                dc0 dc0Var = (dc0) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                String str2 = (String) obj;
                dc0Var.a();
                if (tLObject6 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.e5.x0(dc0Var.a, LocaleController.getString(R.string.UpdateAppAlert), true);
                    }
                    yb0 yb0Var = new yb0(dc0Var, str2, 0);
                    if (!password.has_password) {
                        bh1 bh1Var = new bh1(TextUtils.isEmpty(password.email_unconfirmed_pattern) ? 6 : 5, password);
                        bh1Var.j0 = yb0Var;
                        dc0Var.n(bh1Var, false);
                        break;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.I = password;
                        twoStepVerificationActivity.J = false;
                        dc0Var.n(twoStepVerificationActivity, false);
                        yb0Var.run();
                        break;
                    }
                }
                break;
            case 20:
                ac0 ac0Var = (ac0) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tLObject7 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject7;
                    ac0Var.getMessagesController().putUsers(tL_users_userFull.users, false);
                    ac0Var.getMessagesController().putChats(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.voip.g2.m(user2, false, userFull != null && userFull.video_calls_available, ac0Var.getParentActivity(), userFull, ac0Var.getAccountInstance());
                break;
            case 21:
                gd0 gd0Var = (gd0) obj3;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) obj;
                ImageView imageView = new ImageView(gd0Var.getParentActivity());
                imageView.setImageBitmap((Bitmap) obj2);
                ViewGroup viewGroup = (ViewGroup) gLSurfaceView.getParent();
                try {
                    viewGroup.addView(imageView, viewGroup.indexOfChild(gLSurfaceView));
                } catch (Exception e15) {
                    FileLog.e(e15);
                }
                AndroidUtilities.runOnUIThread(new uq(gd0Var, viewGroup, gLSurfaceView, 22), 100L);
                break;
            case 22:
                gd0 gd0Var2 = (gd0) obj3;
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                GLSurfaceView gLSurfaceView2 = (GLSurfaceView) obj;
                gd0Var2.getClass();
                try {
                    viewGroup2.removeView(gLSurfaceView2);
                } catch (Exception e16) {
                    FileLog.e(e16);
                }
                gd0Var2.M = true;
                gd0Var2.finishFragment();
                break;
            case 23:
                gd0 gd0Var3 = (gd0) obj3;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) obj2;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) obj;
                gd0Var3.getClass();
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                gd0Var3.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                gd0Var3.finishFragment();
                break;
            case 24:
                ug0 ug0Var = (ug0) obj3;
                ug0Var.getClass();
                ug0Var.g1((Bundle) obj2, (TLRPC.auth_SentCode) ((TLObject) obj), true);
                break;
            case 25:
                org.telegram.ui.Components.tn tnVar = (org.telegram.ui.Components.tn) obj3;
                EditText editText = (EditText) obj2;
                AtomicReference atomicReference = (AtomicReference) obj;
                tnVar.getClass();
                editText.removeTextChangedListener(tnVar);
                editText.removeCallbacks((Runnable) atomicReference.get());
                ((Runnable) atomicReference.get()).run();
                break;
            case 26:
                TLObject tLObject8 = (TLObject) obj2;
                Bundle bundle = (Bundle) obj;
                ug0 ug0Var2 = ((ee0) obj3).W;
                if (!(tLObject8 instanceof TL_account.TL_emailVerified) || ug0Var2.F != 3) {
                    if (!(tLObject8 instanceof TL_account.TL_emailVerifiedLogin)) {
                        if (tLObject8 instanceof TLRPC.TL_auth_authorization) {
                            ug0Var2.o1((TLRPC.TL_auth_authorization) tLObject8, false);
                            break;
                        }
                    } else {
                        ug0Var2.g1(bundle, ((TL_account.TL_emailVerifiedLogin) tLObject8).sent_code, true);
                        break;
                    }
                } else {
                    ug0Var2.finishFragment();
                    ug0Var2.d0.run();
                    break;
                }
                break;
            case 27:
                ff0 ff0Var = (ff0) obj3;
                TLObject tLObject9 = (TLObject) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                ug0 ug0Var3 = ff0Var.O;
                ff0Var.H = false;
                if (!(tLObject9 instanceof TLRPC.TL_auth_authorization)) {
                    ug0Var3.k1(false, true);
                    if (!tL_error3.text.contains("PHONE_NUMBER_INVALID")) {
                        if (!tL_error3.text.contains("PHONE_CODE_EMPTY") && !tL_error3.text.contains("PHONE_CODE_INVALID")) {
                            if (!tL_error3.text.contains("PHONE_CODE_EXPIRED")) {
                                if (!tL_error3.text.contains("FIRSTNAME_INVALID")) {
                                    if (!tL_error3.text.contains("LASTNAME_INVALID")) {
                                        ug0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                        break;
                                    } else {
                                        ug0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidLastName", R.string.InvalidLastName));
                                        break;
                                    }
                                } else {
                                    ug0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidFirstName", R.string.InvalidFirstName));
                                    break;
                                }
                            } else {
                                ff0Var.c(true);
                                ug0Var3.u1(0, true, null, true);
                                ug0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                break;
                            }
                        } else {
                            ug0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                            break;
                        }
                    } else {
                        ug0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                        break;
                    }
                } else {
                    ff0Var.o();
                    ug0Var3.v1(false, true);
                    ff0Var.postDelayed(new h90(i17, ff0Var, tLObject9), 150L);
                    break;
                }
                break;
            case 28:
                ff0 ff0Var2 = (ff0) obj3;
                TLRPC.FileLocation fileLocation = ((TLRPC.PhotoSize) obj2).location;
                ff0Var2.M = fileLocation;
                ff0Var2.N = ((TLRPC.PhotoSize) obj).location;
                ff0Var2.e.h(ImageLocation.getForLocal(fileLocation), "50_50", ff0Var2.f, null);
                break;
            default:
                xf0 xf0Var = (xf0) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                TL_account.confirmPhone confirmphone = (TL_account.confirmPhone) obj;
                int i27 = xf0Var.f0;
                ug0 ug0Var4 = xf0Var.s0;
                xf0Var.z(false);
                xf0Var.d0 = false;
                if (tL_error4 != null) {
                    xf0Var.e0 = tL_error4.text;
                    if ((i27 == 3 && ((i14 = xf0Var.g0) == 4 || i14 == 2 || i14 == 17 || i14 == 16)) || ((i27 == 2 && ((i12 = xf0Var.g0) == 4 || i12 == 3)) || (i27 == 4 && ((i11 = xf0Var.g0) == 2 || i11 == 17 || i11 == 16)))) {
                        xf0Var.u();
                    }
                    if (i27 == 15) {
                        NotificationCenter.getGlobalInstance().addObserver(xf0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i27 == 2) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(xf0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i27 == 3) {
                        AndroidUtilities.setWaitingForCall(true);
                        NotificationCenter.getGlobalInstance().addObserver(xf0Var, NotificationCenter.didReceiveCall);
                    }
                    xf0Var.c0 = true;
                    if (i27 != 3) {
                        i13 = ((org.telegram.ui.ActionBar.n2) ug0Var4).currentAccount;
                        org.telegram.ui.Components.e5.f0(i13, tL_error4, ug0Var4, confirmphone, new Object[0]);
                    }
                    if (!tL_error4.text.contains("PHONE_CODE_EMPTY") && !tL_error4.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error4.text.contains("PHONE_CODE_EXPIRED")) {
                            xf0Var.c(true);
                            ug0Var4.u1(0, true, null, true);
                            break;
                        }
                    } else {
                        xf0Var.y();
                        break;
                    }
                } else {
                    Activity parentActivity = ug0Var4.getParentActivity();
                    if (parentActivity != null) {
                        xf0Var.q(new h90(20, xf0Var, parentActivity));
                        break;
                    }
                }
                break;
        }
    }
}
