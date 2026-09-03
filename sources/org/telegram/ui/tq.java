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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tq(Object obj, Object obj2, Object obj3, int i10) {
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
                rr rrVar = (rr) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                a0.h hVar2 = rrVar.I;
                a0.h hVar3 = rrVar.J;
                int i19 = rrVar.b1;
                a0.h hVar4 = rrVar.H;
                int i20 = rrVar.L;
                ArrayList arrayList7 = rrVar.C;
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
                            rrVar.getMessagesController().processLoadedAdminsResponse(rrVar.K, tL_channels_channelParticipants);
                        } else {
                            arrayList3 = arrayList7;
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
                            rrVar.h1--;
                            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = tL_channels_getParticipants.filter;
                            if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsContacts) {
                                arrayList4 = rrVar.E;
                                hVar = hVar3;
                            } else if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsBots) {
                                arrayList4 = rrVar.D;
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
                            if ((i20 != 0 || i20 == 3 || i20 == 2) && (chat = rrVar.r) != null && chat.megagroup) {
                                chatFull = rrVar.s;
                                if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants_count <= 200) {
                                    rrVar.z0(arrayList4);
                                    i21 = size2;
                                }
                            }
                            if (i20 == 1) {
                                try {
                                    try {
                                        Collections.sort(arrayList2, new nh.e4(15));
                                    } catch (Exception e) {
                                        e = e;
                                        FileLog.e(e);
                                        i21 = size2;
                                        i22 = i10 + 1;
                                        arrayList7 = arrayList2;
                                        arrayList5 = arrayList;
                                    }
                                } catch (Exception e6) {
                                    e = e6;
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
                        chatFull = rrVar.s;
                        if (chatFull instanceof TLRPC.TL_channelFull) {
                            rrVar.z0(arrayList4);
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
                if (i20 != 2 || rrVar.h1 <= 0) {
                    nr nrVar = rrVar.a;
                    rrVar.y0(nrVar != null ? nrVar.d.a1 : 0);
                    rrVar.N = false;
                    rrVar.O = true;
                    org.telegram.ui.ActionBar.w0 w0Var = rrVar.f;
                    if (w0Var != null) {
                        w0Var.setVisibility((i20 != 0 || i21 > 5) ? 0 : 8);
                    }
                }
                rrVar.B0();
                nr nrVar2 = rrVar.a;
                if (nrVar2 != null) {
                    lh.e1 e1Var = rrVar.c;
                    e1Var.V1 = rrVar.y1;
                    e1Var.W1 = 0;
                    nrVar2.l();
                    org.telegram.ui.Components.zw0 zw0Var = rrVar.b;
                    if (zw0Var != null && rrVar.a.d.a1 == 0 && rrVar.O) {
                        zw0Var.e(false, true);
                    }
                }
                rrVar.resumeDelayedFragmentAnimation();
                break;
            case 1:
                ((qy) obj3).removeSelfFromStack();
                ((pd) obj2).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.p2) obj).finishFragment();
                break;
            case 2:
                qy qyVar = (qy) obj3;
                int length = ((Object[]) obj).length;
                qyVar.u4((py) obj2);
                pw pwVar = qyVar.w0;
                if (pwVar != null && pwVar.getVisibility() == 0) {
                    qyVar.w0.c();
                    break;
                }
                break;
            case 3:
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                qy qyVar2 = ((qw) obj3).b;
                if (!((boolean[]) obj2)[0]) {
                    p00.S(qyVar2, dialogFilter, null);
                    break;
                } else {
                    qyVar2.presentFragment(new a00(dialogFilter, null));
                    break;
                }
            case 4:
                dz dzVar = (dz) obj3;
                dzVar.getClass();
                dzVar.p((TLRPC.TL_messages_stickerSet) ((TLObject) obj2), (MessageObject) obj);
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
                            x02.setOnDismissListener(new gg.g(7, externalActionActivity, tL_error));
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
                c10 c10Var = (c10) obj3;
                TLObject tLObject2 = (TLObject) obj;
                c10.r0((TLRPC.TL_error) obj2, c10Var, org.telegram.ui.Components.qc.a0(c10Var));
                if (tLObject2 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    c10Var.getMessagesController().loadRemoteFilters(true);
                    TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = (TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject2;
                    a00 a00Var = new a00(c10Var.r, tL_chatlists_exportedChatlistInvite.invite);
                    a00Var.y = new d00(c10Var, 1);
                    a00Var.x = new d00(c10Var, i18);
                    c10Var.presentFragment(a00Var);
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k41(29, c10Var, tL_chatlists_exportedChatlistInvite), 200L);
                    break;
                }
                break;
            case 7:
                p00 p00Var = (p00) obj3;
                TLObject tLObject3 = (TLObject) obj;
                org.telegram.ui.ActionBar.p2 p2Var = p00Var.n;
                c10.r0((TLRPC.TL_error) obj2, p2Var, new org.telegram.ui.Components.qc(p00Var.W, null));
                if (tLObject3 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    p00Var.dismiss();
                    p2Var.getMessagesController().loadRemoteFilters(true);
                    p2Var.presentFragment(new a00(p00Var.U, ((TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject3).invite));
                    break;
                }
                break;
            case 8:
                v00 v00Var = (v00) obj3;
                u00 u00Var = (u00) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    org.telegram.ui.Components.qc.a0(v00Var.a).t(LocaleController.getString(R.string.UnknownError), null).j();
                    AndroidUtilities.cancelRunOnUIThread(u00Var);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = ((b20) obj3).e;
                if (d2Var2 != null) {
                    try {
                        d2Var2.dismiss();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                }
                filtersSetupActivity.getMessagesController().removeFilter(dialogFilter2);
                filtersSetupActivity.getMessagesStorage().deleteDialogFilter(dialogFilter2);
                break;
            case 10:
                y60 y60Var = (y60) obj3;
                ArrayList arrayList10 = (ArrayList) obj2;
                ArrayList arrayList11 = (ArrayList) obj;
                a70 a70Var = y60Var.F;
                tf.j1 j1Var = y60Var.f;
                if (y60Var.n) {
                    y60Var.h = null;
                    y60Var.d = arrayList10;
                    y60Var.e = arrayList11;
                    j1Var.f(arrayList10, null);
                    a70Var.q0(y60Var.E);
                    y60Var.l();
                    if (y60Var.n && !j1Var.e() && y60Var.h() == 0) {
                        a70Var.s.e(false, true);
                        break;
                    }
                }
                break;
            case 11:
                w70 w70Var = (w70) obj3;
                TLRPC.TL_langPackString tL_langPackString = (TLRPC.TL_langPackString) obj2;
                String str = (String) obj;
                if (!w70Var.J) {
                    w70Var.f.setText(tL_langPackString.value);
                    MessagesController.getGlobalMainSettings().edit().putString("language_showed2", str.toLowerCase()).apply();
                    break;
                }
                break;
            case 12:
                a80 a80Var = (a80) obj3;
                ArrayList arrayList12 = (ArrayList) obj2;
                ArrayList arrayList13 = (ArrayList) obj;
                if (a80Var.h) {
                    a80Var.d = arrayList12;
                    a80Var.e = arrayList13;
                    a80Var.l();
                    a80Var.n.r.e(false, true);
                    break;
                }
                break;
            case 13:
                TLRPC.User user = (TLRPC.User) obj2;
                Pattern pattern = LaunchActivity.y1;
                MessagesController.getInstance(((LaunchActivity) obj3).L).putUser(user, true);
                ((y90) obj).run(user);
                break;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                w10 w10Var = (w10) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                Pattern pattern2 = LaunchActivity.y1;
                try {
                    w10Var.run();
                    if ("APP_VERSION_OUTDATED".equals(tL_error2.text)) {
                        org.telegram.ui.Components.z4.x0(launchActivity, LocaleController.getString(R.string.UpdateAppAlert), true);
                    } else {
                        launchActivity.B0(org.telegram.ui.Components.z4.N(launchActivity, null, LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error2.text));
                    }
                    break;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            case 15:
                LaunchActivity launchActivity2 = (LaunchActivity) obj3;
                w10 w10Var2 = (w10) obj2;
                TLObject tLObject4 = (TLObject) obj;
                Pattern pattern3 = LaunchActivity.y1;
                try {
                    w10Var2.run();
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
                if (tLObject4 instanceof TLRPC.TL_help_deepLinkInfo) {
                    TLRPC.TL_help_deepLinkInfo tL_help_deepLinkInfo = (TLRPC.TL_help_deepLinkInfo) tLObject4;
                    org.telegram.ui.Components.z4.x0(launchActivity2, tL_help_deepLinkInfo.message, tL_help_deepLinkInfo.update_app);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj2;
                Pattern pattern4 = LaunchActivity.y1;
                i6Var.d((File) obj, i6Var.c);
                AndroidUtilities.runOnUIThread(new z80((LaunchActivity) obj3, 7));
                break;
            case 17:
                LaunchActivity launchActivity3 = (LaunchActivity) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) obj;
                if (!(tLObject5 instanceof TLRPC.TL_wallPaper)) {
                    Pattern pattern5 = LaunchActivity.y1;
                    launchActivity3.h0();
                    break;
                } else {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject5;
                    launchActivity3.P0 = i6Var2;
                    launchActivity3.N0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                    launchActivity3.O0 = tL_wallPaper;
                    FileLoader.getInstance(i6Var2.B).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
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
                yb0 yb0Var = (yb0) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                String str2 = (String) obj;
                yb0Var.a();
                if (tLObject6 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.z4.x0(yb0Var.a, LocaleController.getString(R.string.UpdateAppAlert), true);
                    }
                    sb0 sb0Var = new sb0(yb0Var, str2, 0);
                    if (!password.has_password) {
                        wg1 wg1Var = new wg1(TextUtils.isEmpty(password.email_unconfirmed_pattern) ? 6 : 5, password);
                        wg1Var.g0 = sb0Var;
                        yb0Var.n(wg1Var, false);
                        break;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.F = password;
                        twoStepVerificationActivity.G = false;
                        yb0Var.n(twoStepVerificationActivity, false);
                        sb0Var.run();
                        break;
                    }
                }
                break;
            case 20:
                vb0 vb0Var = (vb0) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tLObject7 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject7;
                    vb0Var.getMessagesController().putUsers(tL_users_userFull.users, false);
                    vb0Var.getMessagesController().putChats(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.voip.f2.m(user2, false, userFull != null && userFull.video_calls_available, vb0Var.getParentActivity(), userFull, vb0Var.getAccountInstance());
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
                AndroidUtilities.runOnUIThread(new tq(cd0Var, viewGroup, gLSurfaceView, 22), 100L);
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
                cd0Var2.J = true;
                cd0Var2.finishFragment();
                break;
            case 23:
                cd0 cd0Var3 = (cd0) obj3;
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) obj2;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) obj;
                cd0Var3.getClass();
                try {
                    d2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                d2VarArr[0] = null;
                cd0Var3.C0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                cd0Var3.finishFragment();
                break;
            case 24:
                pg0 pg0Var = (pg0) obj3;
                pg0Var.getClass();
                pg0Var.g1((Bundle) obj2, (TLRPC.auth_SentCode) ((TLObject) obj), true);
                break;
            case 25:
                cg.b0 b0Var = (cg.b0) obj3;
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
                pg0 pg0Var2 = ((ae0) obj3).T;
                if (!(tLObject8 instanceof TL_account.TL_emailVerified) || pg0Var2.C != 3) {
                    if (!(tLObject8 instanceof TL_account.TL_emailVerifiedLogin)) {
                        if (tLObject8 instanceof TLRPC.TL_auth_authorization) {
                            pg0Var2.o1((TLRPC.TL_auth_authorization) tLObject8, false);
                            break;
                        }
                    } else {
                        pg0Var2.g1(bundle, ((TL_account.TL_emailVerifiedLogin) tLObject8).sent_code, true);
                        break;
                    }
                } else {
                    pg0Var2.finishFragment();
                    pg0Var2.a0.run();
                    break;
                }
                break;
            case 27:
                bf0 bf0Var = (bf0) obj3;
                TLObject tLObject9 = (TLObject) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                pg0 pg0Var3 = bf0Var.L;
                bf0Var.E = false;
                if (!(tLObject9 instanceof TLRPC.TL_auth_authorization)) {
                    pg0Var3.k1(false, true);
                    if (!tL_error3.text.contains("PHONE_NUMBER_INVALID")) {
                        if (!tL_error3.text.contains("PHONE_CODE_EMPTY") && !tL_error3.text.contains("PHONE_CODE_INVALID")) {
                            if (!tL_error3.text.contains("PHONE_CODE_EXPIRED")) {
                                if (!tL_error3.text.contains("FIRSTNAME_INVALID")) {
                                    if (!tL_error3.text.contains("LASTNAME_INVALID")) {
                                        pg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                        break;
                                    } else {
                                        pg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidLastName", R.string.InvalidLastName));
                                        break;
                                    }
                                } else {
                                    pg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidFirstName", R.string.InvalidFirstName));
                                    break;
                                }
                            } else {
                                bf0Var.c(true);
                                pg0Var3.u1(0, true, null, true);
                                pg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                break;
                            }
                        } else {
                            pg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                            break;
                        }
                    } else {
                        pg0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                        break;
                    }
                } else {
                    bf0Var.o();
                    pg0Var3.v1(false, true);
                    bf0Var.postDelayed(new ie0(1, bf0Var, tLObject9), 150L);
                    break;
                }
                break;
            case 28:
                bf0 bf0Var2 = (bf0) obj3;
                TLRPC.FileLocation fileLocation = ((TLRPC.PhotoSize) obj2).location;
                bf0Var2.J = fileLocation;
                bf0Var2.K = ((TLRPC.PhotoSize) obj).location;
                bf0Var2.e.h(ImageLocation.getForLocal(fileLocation), "50_50", bf0Var2.f, null);
                break;
            default:
                tf0 tf0Var = (tf0) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                TL_account.confirmPhone confirmphone = (TL_account.confirmPhone) obj;
                int i28 = tf0Var.c0;
                pg0 pg0Var4 = tf0Var.p0;
                tf0Var.z(false);
                tf0Var.a0 = false;
                int i29 = 4;
                if (tL_error4 != null) {
                    tf0Var.b0 = tL_error4.text;
                    if ((i28 == 3 && ((i16 = tf0Var.d0) == 4 || i16 == 2 || i16 == 17 || i16 == 16)) || ((i28 == 2 && ((i14 = tf0Var.d0) == 4 || i14 == 3)) || (i28 == 4 && ((i13 = tf0Var.d0) == 2 || i13 == 17 || i13 == 16)))) {
                        tf0Var.t();
                    }
                    if (i28 == 15) {
                        NotificationCenter.getGlobalInstance().addObserver(tf0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i28 == 2) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(tf0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i28 == 3) {
                        AndroidUtilities.setWaitingForCall(true);
                        NotificationCenter.getGlobalInstance().addObserver(tf0Var, NotificationCenter.didReceiveCall);
                    }
                    tf0Var.W = true;
                    if (i28 != 3) {
                        i15 = ((org.telegram.ui.ActionBar.p2) pg0Var4).currentAccount;
                        org.telegram.ui.Components.z4.f0(i15, tL_error4, pg0Var4, confirmphone, new Object[0]);
                    }
                    if (!tL_error4.text.contains("PHONE_CODE_EMPTY") && !tL_error4.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error4.text.contains("PHONE_CODE_EXPIRED")) {
                            tf0Var.c(true);
                            pg0Var4.u1(0, true, null, true);
                            break;
                        }
                    } else {
                        tf0Var.y();
                        break;
                    }
                } else {
                    Activity parentActivity = pg0Var4.getParentActivity();
                    if (parentActivity != null) {
                        tf0Var.q(new ie0(i29, tf0Var, parentActivity));
                        break;
                    }
                }
                break;
        }
    }
}
