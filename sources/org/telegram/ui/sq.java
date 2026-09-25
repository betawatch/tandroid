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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sq(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:311:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0788 A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
        int i16 = 22;
        int i17 = 17;
        int i18 = 2;
        boolean z10 = false;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i15) {
            case 0:
                pr prVar = (pr) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                a0.i iVar2 = prVar.L;
                a0.i iVar3 = prVar.M;
                int i19 = prVar.e1;
                a0.i iVar4 = prVar.K;
                int i20 = prVar.O;
                ArrayList arrayList6 = prVar.F;
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
                            arrayList = arrayList5;
                            prVar.getMessagesController().processLoadedAdminsResponse(prVar.N, tL_channels_channelParticipants);
                        } else {
                            arrayList = arrayList5;
                        }
                        prVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, z10);
                        prVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, z10);
                        long clientUserId = prVar.getUserConfig().getClientUserId();
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
                            prVar.k1--;
                            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = tL_channels_getParticipants.filter;
                            if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsContacts) {
                                arrayList3 = prVar.H;
                                iVar = iVar3;
                            } else if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsBots) {
                                arrayList3 = prVar.G;
                                iVar = iVar2;
                            }
                            arrayList3.clear();
                            arrayList3.addAll(tL_channels_channelParticipants.participants);
                            size = tL_channels_channelParticipants.participants.size();
                            i10 = 0;
                            while (i10 < size) {
                                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i10);
                                ArrayList arrayList7 = arrayList4;
                                int i24 = size;
                                if (channelParticipant.user_id == clientUserId) {
                                    arrayList3.remove(channelParticipant);
                                } else {
                                    iVar.k(channelParticipant, MessageObject.getPeerId(channelParticipant.peer));
                                }
                                i10++;
                                arrayList4 = arrayList7;
                                size = i24;
                            }
                            arrayList2 = arrayList4;
                            int size2 = arrayList3.size() + i21;
                            if (i20 == 2) {
                                int size3 = arrayList6.size();
                                int i25 = 0;
                                while (i25 < size3) {
                                    TLObject tLObject = (TLObject) arrayList6.get(i25);
                                    if (tLObject instanceof TLRPC.ChannelParticipant) {
                                        long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
                                        if (iVar3.f(peerId) != null || iVar2.f(peerId) != null || (i19 == 1 && peerId > 0 && UserObject.isDeleted(prVar.getMessagesController().getUser(Long.valueOf(peerId))))) {
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
                            if ((i20 != 0 || i20 == 3 || i20 == 2) && (chat = prVar.r) != null && chat.megagroup) {
                                chatFull = prVar.s;
                                if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants_count <= 200) {
                                    prVar.z0(arrayList3);
                                    i21 = size2;
                                }
                            }
                            if (i20 == 1) {
                                try {
                                } catch (Exception e) {
                                    e = e;
                                }
                                try {
                                    Collections.sort(arrayList6, new cf(4));
                                } catch (Exception e7) {
                                    e = e7;
                                    FileLog.e(e);
                                    i21 = size2;
                                    i22++;
                                    arrayList5 = arrayList;
                                    arrayList4 = arrayList2;
                                    i18 = 2;
                                    z10 = false;
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
                        i10 = 0;
                        while (i10 < size) {
                        }
                        arrayList2 = arrayList4;
                        int size22 = arrayList3.size() + i21;
                        if (i20 == 2) {
                        }
                        if (i20 != 0) {
                        }
                        chatFull = prVar.s;
                        if (chatFull instanceof TLRPC.TL_channelFull) {
                            prVar.z0(arrayList3);
                            i21 = size22;
                        }
                        if (i20 == 1) {
                        }
                        i21 = size22;
                    }
                    i22++;
                    arrayList5 = arrayList;
                    arrayList4 = arrayList2;
                    i18 = 2;
                    z10 = false;
                }
                if (i20 != i18 || prVar.k1 <= 0) {
                    lr lrVar = prVar.a;
                    prVar.y0(lrVar != null ? lrVar.d.d1 : 0);
                    prVar.Q = false;
                    prVar.R = true;
                    org.telegram.ui.ActionBar.u0 u0Var = prVar.f;
                    if (u0Var != null) {
                        u0Var.setVisibility((i20 != 0 || i21 > 5) ? 0 : 8);
                    }
                }
                prVar.B0();
                lr lrVar2 = prVar.a;
                if (lrVar2 != null) {
                    ai.w0 w0Var = prVar.c;
                    w0Var.Y1 = prVar.B1;
                    w0Var.Z1 = 0;
                    lrVar2.l();
                    org.telegram.ui.Components.ix0 ix0Var = prVar.b;
                    if (ix0Var != null && prVar.a.d.d1 == 0 && prVar.R) {
                        ix0Var.e(false, true);
                    }
                }
                prVar.resumeDelayedFragmentAnimation();
                break;
            case 1:
                ((qy) obj3).removeSelfFromStack();
                ((ld) obj2).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.m2) obj).finishFragment();
                break;
            case 2:
                qy qyVar = (qy) obj3;
                int length = ((Object[]) obj).length;
                qyVar.u4((py) obj2);
                nw nwVar = qyVar.z0;
                if (nwVar != null && nwVar.getVisibility() == 0) {
                    qyVar.z0.c();
                    break;
                }
                break;
            case 3:
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                qy qyVar2 = ((pw) obj3).b;
                if (!((boolean[]) obj2)[0]) {
                    n00.S(qyVar2, dialogFilter, null);
                    break;
                } else {
                    qyVar2.presentFragment(new yz(dialogFilter, null));
                    break;
                }
            case 4:
                cz czVar = (cz) obj3;
                czVar.getClass();
                czVar.p((TLRPC.TL_messages_stickerSet) ((TLObject) obj2), (MessageObject) obj);
                break;
            case 5:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj3;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ArrayList arrayList8 = ExternalActionActivity.x;
                try {
                    a2Var.dismiss();
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.ActionBar.a2 x02 = org.telegram.ui.Components.e5.x0(externalActionActivity, LocaleController.getString(R.string.UpdateAppAlert), true);
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
            case 6:
                b10 b10Var = (b10) obj3;
                TLObject tLObject2 = (TLObject) obj;
                b10.r0((TLRPC.TL_error) obj2, b10Var, org.telegram.ui.Components.xc.a0(b10Var));
                if (tLObject2 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    b10Var.getMessagesController().loadRemoteFilters(true);
                    TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = (TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject2;
                    yz yzVar = new yz(b10Var.r, tL_chatlists_exportedChatlistInvite.invite);
                    yzVar.y = new b00(b10Var, 1);
                    yzVar.x = new b00(b10Var, i18);
                    b10Var.presentFragment(yzVar);
                    AndroidUtilities.runOnUIThread(new tt(i17, b10Var, tL_chatlists_exportedChatlistInvite), 200L);
                    break;
                }
                break;
            case 7:
                n00 n00Var = (n00) obj3;
                TLObject tLObject3 = (TLObject) obj;
                org.telegram.ui.ActionBar.m2 m2Var = n00Var.n;
                b10.r0((TLRPC.TL_error) obj2, m2Var, new org.telegram.ui.Components.xc(n00Var.Z, null));
                if (tLObject3 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    n00Var.dismiss();
                    m2Var.getMessagesController().loadRemoteFilters(true);
                    m2Var.presentFragment(new yz(n00Var.X, ((TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject3).invite));
                    break;
                }
                break;
            case 8:
                u00 u00Var = (u00) obj3;
                t00 t00Var = (t00) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    org.telegram.ui.Components.xc.a0(u00Var.a).t(LocaleController.getString(R.string.UnknownError), null).j();
                    AndroidUtilities.cancelRunOnUIThread(t00Var);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = ((z10) obj3).e;
                if (a2Var2 != null) {
                    try {
                        a2Var2.dismiss();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                }
                filtersSetupActivity.getMessagesController().removeFilter(dialogFilter2);
                filtersSetupActivity.getMessagesStorage().deleteDialogFilter(dialogFilter2);
                break;
            case 10:
                x60 x60Var = (x60) obj3;
                ArrayList arrayList9 = (ArrayList) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                z60 z60Var = x60Var.I;
                gg.c2 c2Var = x60Var.f;
                if (x60Var.n) {
                    x60Var.h = null;
                    x60Var.d = arrayList9;
                    x60Var.e = arrayList10;
                    c2Var.f(arrayList9, null);
                    z60Var.q0(x60Var.H);
                    x60Var.l();
                    if (x60Var.n && !c2Var.e() && x60Var.h() == 0) {
                        z60Var.s.e(false, true);
                        break;
                    }
                }
                break;
            case 11:
                y70 y70Var = (y70) obj3;
                TLRPC.TL_langPackString tL_langPackString = (TLRPC.TL_langPackString) obj2;
                String str = (String) obj;
                if (!y70Var.M) {
                    y70Var.f.setText(tL_langPackString.value);
                    MessagesController.getGlobalMainSettings().edit().putString("language_showed2", str.toLowerCase()).apply();
                    break;
                }
                break;
            case 12:
                c80 c80Var = (c80) obj3;
                ArrayList arrayList11 = (ArrayList) obj2;
                ArrayList arrayList12 = (ArrayList) obj;
                if (c80Var.h) {
                    c80Var.d = arrayList11;
                    c80Var.e = arrayList12;
                    c80Var.l();
                    c80Var.n.r.e(false, true);
                    break;
                }
                break;
            case 13:
                TLRPC.User user = (TLRPC.User) obj2;
                Pattern pattern = LaunchActivity.B1;
                MessagesController.getInstance(((LaunchActivity) obj3).O).putUser(user, true);
                ((aa0) obj).run(user);
                break;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                n80 n80Var = (n80) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                Pattern pattern2 = LaunchActivity.B1;
                try {
                    n80Var.run();
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
                n80 n80Var2 = (n80) obj2;
                TLObject tLObject4 = (TLObject) obj;
                Pattern pattern3 = LaunchActivity.B1;
                try {
                    n80Var2.run();
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
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj2;
                Pattern pattern4 = LaunchActivity.B1;
                g6Var.d((File) obj, g6Var.c);
                AndroidUtilities.runOnUIThread(new b90((LaunchActivity) obj3, 7));
                break;
            case 17:
                LaunchActivity launchActivity3 = (LaunchActivity) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) obj;
                if (!(tLObject5 instanceof TLRPC.TL_wallPaper)) {
                    Pattern pattern5 = LaunchActivity.B1;
                    launchActivity3.h0();
                    break;
                } else {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject5;
                    launchActivity3.S0 = g6Var2;
                    launchActivity3.Q0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                    launchActivity3.R0 = tL_wallPaper;
                    FileLoader.getInstance(g6Var2.E).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
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
                zb0 zb0Var = (zb0) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                String str2 = (String) obj;
                zb0Var.a();
                if (tLObject6 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.e5.x0(zb0Var.a, LocaleController.getString(R.string.UpdateAppAlert), true);
                    }
                    ub0 ub0Var = new ub0(zb0Var, str2, 0);
                    if (!password.has_password) {
                        zg1 zg1Var = new zg1(TextUtils.isEmpty(password.email_unconfirmed_pattern) ? 6 : 5, password);
                        zg1Var.j0 = ub0Var;
                        zb0Var.n(zg1Var, false);
                        break;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.I = password;
                        twoStepVerificationActivity.J = false;
                        zb0Var.n(twoStepVerificationActivity, false);
                        ub0Var.run();
                        break;
                    }
                }
                break;
            case 20:
                wb0 wb0Var = (wb0) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tLObject7 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject7;
                    wb0Var.getMessagesController().putUsers(tL_users_userFull.users, false);
                    wb0Var.getMessagesController().putChats(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.voip.g2.m(user2, false, userFull != null && userFull.video_calls_available, wb0Var.getParentActivity(), userFull, wb0Var.getAccountInstance());
                break;
            case 21:
                cd0 cd0Var = (cd0) obj3;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) obj;
                ImageView imageView = new ImageView(cd0Var.getParentActivity());
                imageView.setImageBitmap((Bitmap) obj2);
                ViewGroup viewGroup = (ViewGroup) gLSurfaceView.getParent();
                try {
                    viewGroup.addView(imageView, viewGroup.indexOfChild(gLSurfaceView));
                } catch (Exception e14) {
                    FileLog.e(e14);
                }
                AndroidUtilities.runOnUIThread(new sq(cd0Var, viewGroup, gLSurfaceView, i16), 100L);
                break;
            case 22:
                cd0 cd0Var2 = (cd0) obj3;
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                GLSurfaceView gLSurfaceView2 = (GLSurfaceView) obj;
                cd0Var2.getClass();
                try {
                    viewGroup2.removeView(gLSurfaceView2);
                } catch (Exception e15) {
                    FileLog.e(e15);
                }
                cd0Var2.M = true;
                cd0Var2.finishFragment();
                break;
            case 23:
                cd0 cd0Var3 = (cd0) obj3;
                org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) obj2;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) obj;
                cd0Var3.getClass();
                try {
                    a2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                a2VarArr[0] = null;
                cd0Var3.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                cd0Var3.finishFragment();
                break;
            case 24:
                qg0 qg0Var = (qg0) obj3;
                qg0Var.getClass();
                qg0Var.g1((Bundle) obj2, (TLRPC.auth_SentCode) ((TLObject) obj), true);
                break;
            case 25:
                org.telegram.ui.Components.rn rnVar = (org.telegram.ui.Components.rn) obj3;
                EditText editText = (EditText) obj2;
                AtomicReference atomicReference = (AtomicReference) obj;
                rnVar.getClass();
                editText.removeTextChangedListener(rnVar);
                editText.removeCallbacks((Runnable) atomicReference.get());
                ((Runnable) atomicReference.get()).run();
                break;
            case 26:
                TLObject tLObject8 = (TLObject) obj2;
                Bundle bundle = (Bundle) obj;
                qg0 qg0Var2 = ((ae0) obj3).W;
                if (!(tLObject8 instanceof TL_account.TL_emailVerified) || qg0Var2.F != 3) {
                    if (!(tLObject8 instanceof TL_account.TL_emailVerifiedLogin)) {
                        if (tLObject8 instanceof TLRPC.TL_auth_authorization) {
                            qg0Var2.o1((TLRPC.TL_auth_authorization) tLObject8, false);
                            break;
                        }
                    } else {
                        qg0Var2.g1(bundle, ((TL_account.TL_emailVerifiedLogin) tLObject8).sent_code, true);
                        break;
                    }
                } else {
                    qg0Var2.finishFragment();
                    qg0Var2.d0.run();
                    break;
                }
                break;
            case 27:
                bf0 bf0Var = (bf0) obj3;
                TLObject tLObject9 = (TLObject) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                qg0 qg0Var3 = bf0Var.O;
                bf0Var.H = false;
                if (!(tLObject9 instanceof TLRPC.TL_auth_authorization)) {
                    qg0Var3.k1(false, true);
                    if (!tL_error3.text.contains("PHONE_NUMBER_INVALID")) {
                        if (!tL_error3.text.contains("PHONE_CODE_EMPTY") && !tL_error3.text.contains("PHONE_CODE_INVALID")) {
                            if (!tL_error3.text.contains("PHONE_CODE_EXPIRED")) {
                                if (!tL_error3.text.contains("FIRSTNAME_INVALID")) {
                                    if (!tL_error3.text.contains("LASTNAME_INVALID")) {
                                        qg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                        break;
                                    } else {
                                        qg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidLastName", R.string.InvalidLastName));
                                        break;
                                    }
                                } else {
                                    qg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidFirstName", R.string.InvalidFirstName));
                                    break;
                                }
                            } else {
                                bf0Var.c(true);
                                qg0Var3.u1(0, true, null, true);
                                qg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                break;
                            }
                        } else {
                            qg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                            break;
                        }
                    } else {
                        qg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                        break;
                    }
                } else {
                    bf0Var.o();
                    qg0Var3.v1(false, true);
                    bf0Var.postDelayed(new n80(19, bf0Var, tLObject9), 150L);
                    break;
                }
                break;
            case 28:
                bf0 bf0Var2 = (bf0) obj3;
                TLRPC.FileLocation fileLocation = ((TLRPC.PhotoSize) obj2).location;
                bf0Var2.M = fileLocation;
                bf0Var2.N = ((TLRPC.PhotoSize) obj).location;
                bf0Var2.e.h(ImageLocation.getForLocal(fileLocation), "50_50", bf0Var2.f, null);
                break;
            default:
                tf0 tf0Var = (tf0) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                TL_account.confirmPhone confirmphone = (TL_account.confirmPhone) obj;
                int i27 = tf0Var.f0;
                qg0 qg0Var4 = tf0Var.s0;
                tf0Var.z(false);
                tf0Var.d0 = false;
                if (tL_error4 != null) {
                    tf0Var.e0 = tL_error4.text;
                    if ((i27 == 3 && ((i14 = tf0Var.g0) == 4 || i14 == 2 || i14 == 17 || i14 == 16)) || ((i27 == 2 && ((i12 = tf0Var.g0) == 4 || i12 == 3)) || (i27 == 4 && ((i11 = tf0Var.g0) == 2 || i11 == 17 || i11 == 16)))) {
                        tf0Var.u();
                    }
                    if (i27 == 15) {
                        NotificationCenter.getGlobalInstance().addObserver(tf0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i27 == 2) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(tf0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i27 == 3) {
                        AndroidUtilities.setWaitingForCall(true);
                        NotificationCenter.getGlobalInstance().addObserver(tf0Var, NotificationCenter.didReceiveCall);
                    }
                    tf0Var.c0 = true;
                    if (i27 != 3) {
                        i13 = ((org.telegram.ui.ActionBar.m2) qg0Var4).currentAccount;
                        org.telegram.ui.Components.e5.f0(i13, tL_error4, qg0Var4, confirmphone, new Object[0]);
                    }
                    if (!tL_error4.text.contains("PHONE_CODE_EMPTY") && !tL_error4.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error4.text.contains("PHONE_CODE_EXPIRED")) {
                            tf0Var.c(true);
                            qg0Var4.u1(0, true, null, true);
                            break;
                        }
                    } else {
                        tf0Var.y();
                        break;
                    }
                } else {
                    Activity parentActivity = qg0Var4.getParentActivity();
                    if (parentActivity != null) {
                        tf0Var.q(new n80(i16, tf0Var, parentActivity));
                        break;
                    }
                }
                break;
        }
    }
}
