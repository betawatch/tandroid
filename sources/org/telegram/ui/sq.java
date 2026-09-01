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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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

    /* JADX WARN: Code restructure failed: missing block: B:336:0x076a, code lost:
    
        if (org.telegram.messenger.UserObject.isDeleted(r4.getMessagesController().getUser(java.lang.Long.valueOf(r12))) != false) goto L304;
     */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x07af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        ArrayList arrayList3;
        a0.h hVar;
        ArrayList arrayList4;
        int size;
        int i11;
        TLRPC.Chat chat;
        TLRPC.ChatFull chatFull;
        int i12;
        TLRPC.UserFull userFull;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = this.a;
        int i18 = 2;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i17) {
            case 0:
                qr qrVar = (qr) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                a0.h hVar2 = qrVar.I;
                a0.h hVar3 = qrVar.J;
                int i19 = qrVar.b1;
                a0.h hVar4 = qrVar.H;
                int i20 = qrVar.L;
                ArrayList arrayList7 = qrVar.C;
                int i21 = 0;
                int i22 = 0;
                while (i22 < arrayList5.size()) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) arrayList5.get(i22);
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) arrayList6.get(i22);
                    if (tL_channels_getParticipants == null || tL_channels_channelParticipants == null) {
                        arrayList = arrayList5;
                        arrayList2 = arrayList7;
                        i10 = i22;
                    } else {
                        if (i20 == 1) {
                            arrayList3 = arrayList7;
                            qrVar.getMessagesController().processLoadedAdminsResponse(qrVar.K, tL_channels_channelParticipants);
                        } else {
                            arrayList3 = arrayList7;
                        }
                        qrVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
                        qrVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
                        long clientUserId = qrVar.getUserConfig().getClientUserId();
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
                            qrVar.h1--;
                            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = tL_channels_getParticipants.filter;
                            if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsContacts) {
                                arrayList4 = qrVar.E;
                                hVar = hVar3;
                            } else if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsBots) {
                                arrayList4 = qrVar.D;
                                hVar = hVar2;
                            }
                            arrayList4.clear();
                            arrayList4.addAll(tL_channels_channelParticipants.participants);
                            size = tL_channels_channelParticipants.participants.size();
                            arrayList = arrayList5;
                            i11 = 0;
                            while (i11 < size) {
                                long j10 = clientUserId;
                                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i11);
                                int i24 = i22;
                                int i25 = size;
                                if (channelParticipant.user_id == j10) {
                                    arrayList4.remove(channelParticipant);
                                } else {
                                    hVar.k(channelParticipant, MessageObject.getPeerId(channelParticipant.peer));
                                }
                                i11++;
                                i22 = i24;
                                clientUserId = j10;
                                size = i25;
                            }
                            i10 = i22;
                            int size2 = arrayList4.size() + i21;
                            if (i20 == 2) {
                                int size3 = arrayList3.size();
                                int i26 = 0;
                                while (i26 < size3) {
                                    ArrayList arrayList8 = arrayList3;
                                    TLObject tLObject = (TLObject) arrayList8.get(i26);
                                    if (tLObject instanceof TLRPC.ChannelParticipant) {
                                        long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
                                        if (hVar3.f(peerId) == null && hVar2.f(peerId) == null) {
                                            if (i19 == 1 && peerId > 0) {
                                                i12 = size3;
                                                break;
                                            } else {
                                                i12 = size3;
                                            }
                                            size3 = i12;
                                        } else {
                                            i12 = size3;
                                        }
                                        arrayList8.remove(i26);
                                        hVar4.l(peerId);
                                        i26--;
                                        size3 = i12 - 1;
                                    } else {
                                        arrayList8.remove(i26);
                                        i26--;
                                        size3--;
                                    }
                                    i26++;
                                    arrayList3 = arrayList8;
                                }
                            }
                            arrayList2 = arrayList3;
                            if ((i20 != 0 || i20 == 3 || i20 == 2) && (chat = qrVar.r) != null && chat.megagroup) {
                                chatFull = qrVar.s;
                                if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants_count <= 200) {
                                    qrVar.z0(arrayList4);
                                    i21 = size2;
                                }
                            }
                            if (i20 == 1) {
                                try {
                                    try {
                                        Collections.sort(arrayList2, new oh.k0(15));
                                    } catch (Exception e6) {
                                        e = e6;
                                        FileLog.e(e);
                                        i21 = size2;
                                        i22 = i10 + 1;
                                        arrayList7 = arrayList2;
                                        arrayList5 = arrayList;
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                }
                                i21 = size2;
                            }
                            i21 = size2;
                        } else {
                            hVar4.b();
                        }
                        hVar = hVar4;
                        arrayList4 = arrayList3;
                        arrayList4.clear();
                        arrayList4.addAll(tL_channels_channelParticipants.participants);
                        size = tL_channels_channelParticipants.participants.size();
                        arrayList = arrayList5;
                        i11 = 0;
                        while (i11 < size) {
                        }
                        i10 = i22;
                        int size22 = arrayList4.size() + i21;
                        if (i20 == 2) {
                        }
                        arrayList2 = arrayList3;
                        if (i20 != 0) {
                        }
                        chatFull = qrVar.s;
                        if (chatFull instanceof TLRPC.TL_channelFull) {
                            qrVar.z0(arrayList4);
                            i21 = size22;
                        }
                        if (i20 == 1) {
                        }
                        i21 = size22;
                    }
                    i22 = i10 + 1;
                    arrayList7 = arrayList2;
                    arrayList5 = arrayList;
                }
                if (i20 != 2 || qrVar.h1 <= 0) {
                    mr mrVar = qrVar.a;
                    qrVar.y0(mrVar != null ? mrVar.d.a1 : 0);
                    qrVar.N = false;
                    qrVar.O = true;
                    org.telegram.ui.ActionBar.w0 w0Var = qrVar.f;
                    if (w0Var != null) {
                        w0Var.setVisibility((i20 != 0 || i21 > 5) ? 0 : 8);
                    }
                }
                qrVar.B0();
                mr mrVar2 = qrVar.a;
                if (mrVar2 != null) {
                    mh.d1 d1Var = qrVar.c;
                    d1Var.V1 = qrVar.y1;
                    d1Var.W1 = 0;
                    mrVar2.l();
                    org.telegram.ui.Components.ax0 ax0Var = qrVar.b;
                    if (ax0Var != null && qrVar.a.d.a1 == 0 && qrVar.O) {
                        ax0Var.e(false, true);
                    }
                }
                qrVar.resumeDelayedFragmentAnimation();
                break;
            case 1:
                ((py) obj3).removeSelfFromStack();
                ((nd) obj2).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.p2) obj).finishFragment();
                break;
            case 2:
                py pyVar = (py) obj3;
                int length = ((Object[]) obj).length;
                pyVar.u4((oy) obj2);
                ow owVar = pyVar.w0;
                if (owVar != null && owVar.getVisibility() == 0) {
                    pyVar.w0.c();
                    break;
                }
                break;
            case 3:
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                py pyVar2 = ((pw) obj3).b;
                if (!((boolean[]) obj2)[0]) {
                    o00.S(pyVar2, dialogFilter, null);
                    break;
                } else {
                    pyVar2.presentFragment(new zz(dialogFilter, null));
                    break;
                }
            case 4:
                cz czVar = (cz) obj3;
                czVar.getClass();
                czVar.p((TLRPC.TL_messages_stickerSet) ((TLObject) obj2), (MessageObject) obj);
                break;
            case 5:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj3;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ArrayList arrayList9 = ExternalActionActivity.x;
                try {
                    d2Var.dismiss();
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.ActionBar.d2 x02 = org.telegram.ui.Components.z4.x0(externalActionActivity, LocaleController.getString(R.string.UpdateAppAlert), true);
                        if (x02 != null) {
                            x02.setOnDismissListener(new hg.g(7, externalActionActivity, tL_error));
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
                b10 b10Var = (b10) obj3;
                TLObject tLObject2 = (TLObject) obj;
                b10.r0((TLRPC.TL_error) obj2, b10Var, org.telegram.ui.Components.qc.a0(b10Var));
                if (tLObject2 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    b10Var.getMessagesController().loadRemoteFilters(true);
                    TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = (TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject2;
                    zz zzVar = new zz(b10Var.r, tL_chatlists_exportedChatlistInvite.invite);
                    zzVar.y = new c00(b10Var, 1);
                    zzVar.x = new c00(b10Var, i18);
                    b10Var.presentFragment(zzVar);
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l41(29, b10Var, tL_chatlists_exportedChatlistInvite), 200L);
                    break;
                }
                break;
            case 7:
                o00 o00Var = (o00) obj3;
                TLObject tLObject3 = (TLObject) obj;
                org.telegram.ui.ActionBar.p2 p2Var = o00Var.n;
                b10.r0((TLRPC.TL_error) obj2, p2Var, new org.telegram.ui.Components.qc(o00Var.W, null));
                if (tLObject3 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    o00Var.dismiss();
                    p2Var.getMessagesController().loadRemoteFilters(true);
                    p2Var.presentFragment(new zz(o00Var.U, ((TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject3).invite));
                    break;
                }
                break;
            case 8:
                u00 u00Var = (u00) obj3;
                t00 t00Var = (t00) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    org.telegram.ui.Components.qc.a0(u00Var.a).t(LocaleController.getString(R.string.UnknownError), null).j();
                    AndroidUtilities.cancelRunOnUIThread(t00Var);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = ((a20) obj3).e;
                if (d2Var2 != null) {
                    try {
                        d2Var2.dismiss();
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                }
                filtersSetupActivity.getMessagesController().removeFilter(dialogFilter2);
                filtersSetupActivity.getMessagesStorage().deleteDialogFilter(dialogFilter2);
                break;
            case 10:
                x60 x60Var = (x60) obj3;
                ArrayList arrayList10 = (ArrayList) obj2;
                ArrayList arrayList11 = (ArrayList) obj;
                z60 z60Var = x60Var.F;
                uf.k1 k1Var = x60Var.f;
                if (x60Var.n) {
                    x60Var.h = null;
                    x60Var.d = arrayList10;
                    x60Var.e = arrayList11;
                    k1Var.f(arrayList10, null);
                    z60Var.q0(x60Var.E);
                    x60Var.l();
                    if (x60Var.n && !k1Var.e() && x60Var.h() == 0) {
                        z60Var.s.e(false, true);
                        break;
                    }
                }
                break;
            case 11:
                v70 v70Var = (v70) obj3;
                TLRPC.TL_langPackString tL_langPackString = (TLRPC.TL_langPackString) obj2;
                String str = (String) obj;
                if (!v70Var.J) {
                    v70Var.f.setText(tL_langPackString.value);
                    MessagesController.getGlobalMainSettings().edit().putString("language_showed2", str.toLowerCase()).apply();
                    break;
                }
                break;
            case 12:
                z70 z70Var = (z70) obj3;
                ArrayList arrayList12 = (ArrayList) obj2;
                ArrayList arrayList13 = (ArrayList) obj;
                if (z70Var.h) {
                    z70Var.d = arrayList12;
                    z70Var.e = arrayList13;
                    z70Var.l();
                    z70Var.n.r.e(false, true);
                    break;
                }
                break;
            case 13:
                TLRPC.User user = (TLRPC.User) obj2;
                Pattern pattern = LaunchActivity.y1;
                MessagesController.getInstance(((LaunchActivity) obj3).L).putUser(user, true);
                ((x90) obj).run(user);
                break;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                v10 v10Var = (v10) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                Pattern pattern2 = LaunchActivity.y1;
                try {
                    v10Var.run();
                    if ("APP_VERSION_OUTDATED".equals(tL_error2.text)) {
                        org.telegram.ui.Components.z4.x0(launchActivity, LocaleController.getString(R.string.UpdateAppAlert), true);
                    } else {
                        launchActivity.B0(org.telegram.ui.Components.z4.N(launchActivity, null, LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error2.text));
                    }
                    break;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    return;
                }
            case 15:
                LaunchActivity launchActivity2 = (LaunchActivity) obj3;
                v10 v10Var2 = (v10) obj2;
                TLObject tLObject4 = (TLObject) obj;
                Pattern pattern3 = LaunchActivity.y1;
                try {
                    v10Var2.run();
                } catch (Exception e14) {
                    FileLog.e(e14);
                }
                if (tLObject4 instanceof TLRPC.TL_help_deepLinkInfo) {
                    TLRPC.TL_help_deepLinkInfo tL_help_deepLinkInfo = (TLRPC.TL_help_deepLinkInfo) tLObject4;
                    org.telegram.ui.Components.z4.x0(launchActivity2, tL_help_deepLinkInfo.message, tL_help_deepLinkInfo.update_app);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) obj2;
                Pattern pattern4 = LaunchActivity.y1;
                j6Var.d((File) obj, j6Var.c);
                AndroidUtilities.runOnUIThread(new y80((LaunchActivity) obj3, 7));
                break;
            case 17:
                LaunchActivity launchActivity3 = (LaunchActivity) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) obj;
                if (!(tLObject5 instanceof TLRPC.TL_wallPaper)) {
                    Pattern pattern5 = LaunchActivity.y1;
                    launchActivity3.h0();
                    break;
                } else {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject5;
                    launchActivity3.P0 = j6Var2;
                    launchActivity3.N0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                    launchActivity3.O0 = tL_wallPaper;
                    FileLoader.getInstance(j6Var2.B).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    break;
                }
            case 18:
                LaunchActivity launchActivity4 = (LaunchActivity) obj3;
                int[] iArr = (int[]) obj2;
                long[] jArr = (long[]) obj;
                Pattern pattern6 = LaunchActivity.y1;
                launchActivity4.getClass();
                int i27 = iArr[0] - 1;
                iArr[0] = i27;
                if (i27 == 0) {
                    NotificationCenter.getInstance(launchActivity4.L).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    launchActivity4.l0(jArr, false);
                    break;
                }
                break;
            case 19:
                xb0 xb0Var = (xb0) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                String str2 = (String) obj;
                xb0Var.a();
                if (tLObject6 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.z4.x0(xb0Var.a, LocaleController.getString(R.string.UpdateAppAlert), true);
                    }
                    rb0 rb0Var = new rb0(xb0Var, str2, 0);
                    if (!password.has_password) {
                        qg1 qg1Var = new qg1(TextUtils.isEmpty(password.email_unconfirmed_pattern) ? 6 : 5, password);
                        qg1Var.g0 = rb0Var;
                        xb0Var.n(qg1Var, false);
                        break;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.F = password;
                        twoStepVerificationActivity.G = false;
                        xb0Var.n(twoStepVerificationActivity, false);
                        rb0Var.run();
                        break;
                    }
                }
                break;
            case 20:
                ub0 ub0Var = (ub0) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tLObject7 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject7;
                    ub0Var.getMessagesController().putUsers(tL_users_userFull.users, false);
                    ub0Var.getMessagesController().putChats(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.voip.g2.n(user2, false, userFull != null && userFull.video_calls_available, ub0Var.getParentActivity(), userFull, ub0Var.getAccountInstance());
                break;
            case 21:
                bd0 bd0Var = (bd0) obj3;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) obj;
                ImageView imageView = new ImageView(bd0Var.getParentActivity());
                imageView.setImageBitmap((Bitmap) obj2);
                ViewGroup viewGroup = (ViewGroup) gLSurfaceView.getParent();
                try {
                    viewGroup.addView(imageView, viewGroup.indexOfChild(gLSurfaceView));
                } catch (Exception e15) {
                    FileLog.e(e15);
                }
                AndroidUtilities.runOnUIThread(new sq(bd0Var, viewGroup, gLSurfaceView, 22), 100L);
                break;
            case 22:
                bd0 bd0Var2 = (bd0) obj3;
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                GLSurfaceView gLSurfaceView2 = (GLSurfaceView) obj;
                bd0Var2.getClass();
                try {
                    viewGroup2.removeView(gLSurfaceView2);
                } catch (Exception e16) {
                    FileLog.e(e16);
                }
                bd0Var2.J = true;
                bd0Var2.finishFragment();
                break;
            case 23:
                bd0 bd0Var3 = (bd0) obj3;
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) obj2;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) obj;
                bd0Var3.getClass();
                try {
                    d2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                d2VarArr[0] = null;
                bd0Var3.C0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                bd0Var3.finishFragment();
                break;
            case 24:
                og0 og0Var = (og0) obj3;
                og0Var.getClass();
                og0Var.g1((Bundle) obj2, (TLRPC.auth_SentCode) ((TLObject) obj), true);
                break;
            case 25:
                dg.b0 b0Var = (dg.b0) obj3;
                EditText editText = (EditText) obj2;
                AtomicReference atomicReference = (AtomicReference) obj;
                b0Var.getClass();
                editText.removeTextChangedListener(b0Var);
                editText.removeCallbacks((Runnable) atomicReference.get());
                ((Runnable) atomicReference.get()).run();
                break;
            case 26:
                TLObject tLObject8 = (TLObject) obj2;
                Bundle bundle = (Bundle) obj;
                og0 og0Var2 = ((zd0) obj3).T;
                if (!(tLObject8 instanceof TL_account.TL_emailVerified) || og0Var2.C != 3) {
                    if (!(tLObject8 instanceof TL_account.TL_emailVerifiedLogin)) {
                        if (tLObject8 instanceof TLRPC.TL_auth_authorization) {
                            og0Var2.o1((TLRPC.TL_auth_authorization) tLObject8, false);
                            break;
                        }
                    } else {
                        og0Var2.g1(bundle, ((TL_account.TL_emailVerifiedLogin) tLObject8).sent_code, true);
                        break;
                    }
                } else {
                    og0Var2.finishFragment();
                    og0Var2.a0.run();
                    break;
                }
                break;
            case 27:
                af0 af0Var = (af0) obj3;
                TLObject tLObject9 = (TLObject) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                og0 og0Var3 = af0Var.L;
                af0Var.E = false;
                if (!(tLObject9 instanceof TLRPC.TL_auth_authorization)) {
                    og0Var3.k1(false, true);
                    if (!tL_error3.text.contains("PHONE_NUMBER_INVALID")) {
                        if (!tL_error3.text.contains("PHONE_CODE_EMPTY") && !tL_error3.text.contains("PHONE_CODE_INVALID")) {
                            if (!tL_error3.text.contains("PHONE_CODE_EXPIRED")) {
                                if (!tL_error3.text.contains("FIRSTNAME_INVALID")) {
                                    if (!tL_error3.text.contains("LASTNAME_INVALID")) {
                                        og0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                        break;
                                    } else {
                                        og0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidLastName", R.string.InvalidLastName));
                                        break;
                                    }
                                } else {
                                    og0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidFirstName", R.string.InvalidFirstName));
                                    break;
                                }
                            } else {
                                af0Var.c(true);
                                og0Var3.u1(0, true, null, true);
                                og0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                break;
                            }
                        } else {
                            og0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                            break;
                        }
                    } else {
                        og0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                        break;
                    }
                } else {
                    af0Var.o();
                    og0Var3.v1(false, true);
                    af0Var.postDelayed(new he0(1, af0Var, tLObject9), 150L);
                    break;
                }
                break;
            case 28:
                af0 af0Var2 = (af0) obj3;
                TLRPC.FileLocation fileLocation = ((TLRPC.PhotoSize) obj2).location;
                af0Var2.J = fileLocation;
                af0Var2.K = ((TLRPC.PhotoSize) obj).location;
                af0Var2.e.h(ImageLocation.getForLocal(fileLocation), "50_50", af0Var2.f, null);
                break;
            default:
                sf0 sf0Var = (sf0) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                TL_account.confirmPhone confirmphone = (TL_account.confirmPhone) obj;
                int i28 = sf0Var.c0;
                og0 og0Var4 = sf0Var.p0;
                sf0Var.z(false);
                sf0Var.a0 = false;
                int i29 = 4;
                if (tL_error4 != null) {
                    sf0Var.b0 = tL_error4.text;
                    if ((i28 == 3 && ((i16 = sf0Var.d0) == 4 || i16 == 2 || i16 == 17 || i16 == 16)) || ((i28 == 2 && ((i14 = sf0Var.d0) == 4 || i14 == 3)) || (i28 == 4 && ((i13 = sf0Var.d0) == 2 || i13 == 17 || i13 == 16)))) {
                        sf0Var.t();
                    }
                    if (i28 == 15) {
                        NotificationCenter.getGlobalInstance().addObserver(sf0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i28 == 2) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(sf0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i28 == 3) {
                        AndroidUtilities.setWaitingForCall(true);
                        NotificationCenter.getGlobalInstance().addObserver(sf0Var, NotificationCenter.didReceiveCall);
                    }
                    sf0Var.W = true;
                    if (i28 != 3) {
                        i15 = ((org.telegram.ui.ActionBar.p2) og0Var4).currentAccount;
                        org.telegram.ui.Components.z4.f0(i15, tL_error4, og0Var4, confirmphone, new Object[0]);
                    }
                    if (!tL_error4.text.contains("PHONE_CODE_EMPTY") && !tL_error4.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error4.text.contains("PHONE_CODE_EXPIRED")) {
                            sf0Var.c(true);
                            og0Var4.u1(0, true, null, true);
                            break;
                        }
                    } else {
                        sf0Var.y();
                        break;
                    }
                } else {
                    Activity parentActivity = og0Var4.getParentActivity();
                    if (parentActivity != null) {
                        sf0Var.q(new he0(i29, sf0Var, parentActivity));
                        break;
                    }
                }
                break;
        }
    }
}
