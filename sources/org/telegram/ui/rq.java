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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rq(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:309:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x079b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2;
        a0.h hVar;
        ArrayList arrayList3;
        int size;
        int i11;
        TLRPC.Chat chat;
        TLRPC.ChatFull chatFull;
        TLRPC.UserFull userFull;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = this.a;
        int i17 = 2;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i16) {
            case 0:
                pr prVar = (pr) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                a0.h hVar2 = prVar.I;
                a0.h hVar3 = prVar.J;
                int i18 = prVar.b1;
                a0.h hVar4 = prVar.H;
                int i19 = prVar.L;
                ArrayList arrayList6 = prVar.C;
                int i20 = 0;
                int i21 = 0;
                while (i21 < arrayList4.size()) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) arrayList4.get(i21);
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) arrayList5.get(i21);
                    if (tL_channels_getParticipants == null || tL_channels_channelParticipants == null) {
                        arrayList = arrayList4;
                        i10 = i21;
                        arrayList2 = arrayList5;
                    } else {
                        if (i19 == 1) {
                            i10 = i21;
                            arrayList2 = arrayList5;
                            prVar.getMessagesController().processLoadedAdminsResponse(prVar.K, tL_channels_channelParticipants);
                        } else {
                            i10 = i21;
                            arrayList2 = arrayList5;
                        }
                        prVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
                        prVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
                        long clientUserId = prVar.getUserConfig().getClientUserId();
                        if (i18 != 0) {
                            int i22 = 0;
                            while (true) {
                                if (i22 < tL_channels_channelParticipants.participants.size()) {
                                    if (MessageObject.getPeerId(tL_channels_channelParticipants.participants.get(i22).peer) == clientUserId) {
                                        tL_channels_channelParticipants.participants.remove(i22);
                                    } else {
                                        i22++;
                                    }
                                }
                            }
                        }
                        if (i19 == 2) {
                            prVar.h1--;
                            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = tL_channels_getParticipants.filter;
                            if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsContacts) {
                                arrayList3 = prVar.E;
                                hVar = hVar3;
                            } else if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsBots) {
                                arrayList3 = prVar.D;
                                hVar = hVar2;
                            }
                            arrayList3.clear();
                            arrayList3.addAll(tL_channels_channelParticipants.participants);
                            size = tL_channels_channelParticipants.participants.size();
                            i11 = 0;
                            while (i11 < size) {
                                ArrayList arrayList7 = arrayList4;
                                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i11);
                                long j10 = clientUserId;
                                if (channelParticipant.user_id == j10) {
                                    arrayList3.remove(channelParticipant);
                                } else {
                                    hVar.k(channelParticipant, MessageObject.getPeerId(channelParticipant.peer));
                                }
                                i11++;
                                arrayList4 = arrayList7;
                                clientUserId = j10;
                            }
                            arrayList = arrayList4;
                            int size2 = arrayList3.size() + i20;
                            if (i19 == 2) {
                                int size3 = arrayList6.size();
                                int i23 = 0;
                                while (i23 < size3) {
                                    TLObject tLObject = (TLObject) arrayList6.get(i23);
                                    if (tLObject instanceof TLRPC.ChannelParticipant) {
                                        long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
                                        if (hVar3.f(peerId) != null || hVar2.f(peerId) != null || (i18 == 1 && peerId > 0 && UserObject.isDeleted(prVar.getMessagesController().getUser(Long.valueOf(peerId))))) {
                                            arrayList6.remove(i23);
                                            hVar4.l(peerId);
                                        }
                                        i23++;
                                    } else {
                                        arrayList6.remove(i23);
                                    }
                                    i23--;
                                    size3--;
                                    i23++;
                                }
                            }
                            if ((i19 != 0 || i19 == 3 || i19 == 2) && (chat = prVar.r) != null && chat.megagroup) {
                                chatFull = prVar.s;
                                if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants_count <= 200) {
                                    prVar.z0(arrayList3);
                                    i20 = size2;
                                }
                            }
                            if (i19 == 1) {
                                try {
                                    try {
                                        Collections.sort(arrayList6, new nh.e4(15));
                                    } catch (Exception e) {
                                        e = e;
                                        FileLog.e(e);
                                        i20 = size2;
                                        i21 = i10 + 1;
                                        arrayList5 = arrayList2;
                                        arrayList4 = arrayList;
                                    }
                                } catch (Exception e6) {
                                    e = e6;
                                }
                                i20 = size2;
                            }
                            i20 = size2;
                        } else {
                            hVar4.b();
                        }
                        hVar = hVar4;
                        arrayList3 = arrayList6;
                        arrayList3.clear();
                        arrayList3.addAll(tL_channels_channelParticipants.participants);
                        size = tL_channels_channelParticipants.participants.size();
                        i11 = 0;
                        while (i11 < size) {
                        }
                        arrayList = arrayList4;
                        int size22 = arrayList3.size() + i20;
                        if (i19 == 2) {
                        }
                        if (i19 != 0) {
                        }
                        chatFull = prVar.s;
                        if (chatFull instanceof TLRPC.TL_channelFull) {
                            prVar.z0(arrayList3);
                            i20 = size22;
                        }
                        if (i19 == 1) {
                        }
                        i20 = size22;
                    }
                    i21 = i10 + 1;
                    arrayList5 = arrayList2;
                    arrayList4 = arrayList;
                }
                if (i19 != 2 || prVar.h1 <= 0) {
                    lr lrVar = prVar.a;
                    prVar.y0(lrVar != null ? lrVar.d.a1 : 0);
                    prVar.N = false;
                    prVar.O = true;
                    org.telegram.ui.ActionBar.w0 w0Var = prVar.f;
                    if (w0Var != null) {
                        w0Var.setVisibility((i19 != 0 || i20 > 5) ? 0 : 8);
                    }
                }
                prVar.B0();
                lr lrVar2 = prVar.a;
                if (lrVar2 != null) {
                    lh.e1 e1Var = prVar.c;
                    e1Var.V1 = prVar.y1;
                    e1Var.W1 = 0;
                    lrVar2.l();
                    org.telegram.ui.Components.zw0 zw0Var = prVar.b;
                    if (zw0Var != null && prVar.a.d.a1 == 0 && prVar.O) {
                        zw0Var.e(false, true);
                    }
                }
                prVar.resumeDelayedFragmentAnimation();
                break;
            case 1:
                ((oy) obj3).removeSelfFromStack();
                ((nd) obj2).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.p2) obj).finishFragment();
                break;
            case 2:
                oy oyVar = (oy) obj3;
                int length = ((Object[]) obj).length;
                oyVar.u4((ny) obj2);
                nw nwVar = oyVar.w0;
                if (nwVar != null && nwVar.getVisibility() == 0) {
                    oyVar.w0.c();
                    break;
                }
                break;
            case 3:
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                oy oyVar2 = ((ow) obj3).b;
                if (!((boolean[]) obj2)[0]) {
                    o00.S(oyVar2, dialogFilter, null);
                    break;
                } else {
                    oyVar2.presentFragment(new yz(dialogFilter, null));
                    break;
                }
            case 4:
                bz bzVar = (bz) obj3;
                bzVar.getClass();
                bzVar.p((TLRPC.TL_messages_stickerSet) ((TLObject) obj2), (MessageObject) obj);
                break;
            case 5:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj3;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ArrayList arrayList8 = ExternalActionActivity.x;
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
                b10 b10Var = (b10) obj3;
                TLObject tLObject2 = (TLObject) obj;
                b10.r0((TLRPC.TL_error) obj2, b10Var, org.telegram.ui.Components.qc.a0(b10Var));
                if (tLObject2 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    b10Var.getMessagesController().loadRemoteFilters(true);
                    TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = (TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject2;
                    yz yzVar = new yz(b10Var.r, tL_chatlists_exportedChatlistInvite.invite);
                    yzVar.y = new b00(b10Var, 1);
                    yzVar.x = new b00(b10Var, i17);
                    b10Var.presentFragment(yzVar);
                    AndroidUtilities.runOnUIThread(new g00(0, b10Var, tL_chatlists_exportedChatlistInvite), 200L);
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
                    p2Var.presentFragment(new yz(o00Var.U, ((TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject3).invite));
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
                FiltersSetupActivity filtersSetupActivity = ((z10) obj3).e;
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
                w60 w60Var = (w60) obj3;
                ArrayList arrayList9 = (ArrayList) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                y60 y60Var = w60Var.F;
                tf.k1 k1Var = w60Var.f;
                if (w60Var.n) {
                    w60Var.h = null;
                    w60Var.d = arrayList9;
                    w60Var.e = arrayList10;
                    k1Var.f(arrayList9, null);
                    y60Var.q0(w60Var.E);
                    w60Var.l();
                    if (w60Var.n && !k1Var.e() && w60Var.h() == 0) {
                        y60Var.s.e(false, true);
                        break;
                    }
                }
                break;
            case 11:
                u70 u70Var = (u70) obj3;
                TLRPC.TL_langPackString tL_langPackString = (TLRPC.TL_langPackString) obj2;
                String str = (String) obj;
                if (!u70Var.J) {
                    u70Var.f.setText(tL_langPackString.value);
                    MessagesController.getGlobalMainSettings().edit().putString("language_showed2", str.toLowerCase()).apply();
                    break;
                }
                break;
            case 12:
                y70 y70Var = (y70) obj3;
                ArrayList arrayList11 = (ArrayList) obj2;
                ArrayList arrayList12 = (ArrayList) obj;
                if (y70Var.h) {
                    y70Var.d = arrayList11;
                    y70Var.e = arrayList12;
                    y70Var.l();
                    y70Var.n.r.e(false, true);
                    break;
                }
                break;
            case 13:
                TLRPC.User user = (TLRPC.User) obj2;
                Pattern pattern = LaunchActivity.y1;
                MessagesController.getInstance(((LaunchActivity) obj3).L).putUser(user, true);
                ((w90) obj).run(user);
                break;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                g00 g00Var = (g00) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                Pattern pattern2 = LaunchActivity.y1;
                try {
                    g00Var.run();
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
                g00 g00Var2 = (g00) obj2;
                TLObject tLObject4 = (TLObject) obj;
                Pattern pattern3 = LaunchActivity.y1;
                try {
                    g00Var2.run();
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
                AndroidUtilities.runOnUIThread(new x80((LaunchActivity) obj3, 7));
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
                int i24 = iArr[0] - 1;
                iArr[0] = i24;
                if (i24 == 0) {
                    NotificationCenter.getInstance(launchActivity4.L).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    launchActivity4.l0(jArr, false);
                    break;
                }
                break;
            case 19:
                wb0 wb0Var = (wb0) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                String str2 = (String) obj;
                wb0Var.a();
                if (tLObject6 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.z4.x0(wb0Var.a, LocaleController.getString(R.string.UpdateAppAlert), true);
                    }
                    qb0 qb0Var = new qb0(wb0Var, str2, 0);
                    if (!password.has_password) {
                        og1 og1Var = new og1(TextUtils.isEmpty(password.email_unconfirmed_pattern) ? 6 : 5, password);
                        og1Var.g0 = qb0Var;
                        wb0Var.n(og1Var, false);
                        break;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.F = password;
                        twoStepVerificationActivity.G = false;
                        wb0Var.n(twoStepVerificationActivity, false);
                        qb0Var.run();
                        break;
                    }
                }
                break;
            case 20:
                tb0 tb0Var = (tb0) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tLObject7 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject7;
                    tb0Var.getMessagesController().putUsers(tL_users_userFull.users, false);
                    tb0Var.getMessagesController().putChats(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.voip.f2.n(user2, false, userFull != null && userFull.video_calls_available, tb0Var.getParentActivity(), userFull, tb0Var.getAccountInstance());
                break;
            case 21:
                ad0 ad0Var = (ad0) obj3;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) obj;
                ImageView imageView = new ImageView(ad0Var.getParentActivity());
                imageView.setImageBitmap((Bitmap) obj2);
                ViewGroup viewGroup = (ViewGroup) gLSurfaceView.getParent();
                try {
                    viewGroup.addView(imageView, viewGroup.indexOfChild(gLSurfaceView));
                } catch (Exception e14) {
                    FileLog.e(e14);
                }
                AndroidUtilities.runOnUIThread(new rq(ad0Var, viewGroup, gLSurfaceView, 22), 100L);
                break;
            case 22:
                ad0 ad0Var2 = (ad0) obj3;
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                GLSurfaceView gLSurfaceView2 = (GLSurfaceView) obj;
                ad0Var2.getClass();
                try {
                    viewGroup2.removeView(gLSurfaceView2);
                } catch (Exception e15) {
                    FileLog.e(e15);
                }
                ad0Var2.J = true;
                ad0Var2.finishFragment();
                break;
            case 23:
                ad0 ad0Var3 = (ad0) obj3;
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) obj2;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) obj;
                ad0Var3.getClass();
                try {
                    d2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                d2VarArr[0] = null;
                ad0Var3.C0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                ad0Var3.finishFragment();
                break;
            case 24:
                ng0 ng0Var = (ng0) obj3;
                ng0Var.getClass();
                ng0Var.g1((Bundle) obj2, (TLRPC.auth_SentCode) ((TLObject) obj), true);
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
                ng0 ng0Var2 = ((yd0) obj3).T;
                if (!(tLObject8 instanceof TL_account.TL_emailVerified) || ng0Var2.C != 3) {
                    if (!(tLObject8 instanceof TL_account.TL_emailVerifiedLogin)) {
                        if (tLObject8 instanceof TLRPC.TL_auth_authorization) {
                            ng0Var2.o1((TLRPC.TL_auth_authorization) tLObject8, false);
                            break;
                        }
                    } else {
                        ng0Var2.g1(bundle, ((TL_account.TL_emailVerifiedLogin) tLObject8).sent_code, true);
                        break;
                    }
                } else {
                    ng0Var2.finishFragment();
                    ng0Var2.a0.run();
                    break;
                }
                break;
            case 27:
                ze0 ze0Var = (ze0) obj3;
                TLObject tLObject9 = (TLObject) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                ng0 ng0Var3 = ze0Var.L;
                ze0Var.E = false;
                if (!(tLObject9 instanceof TLRPC.TL_auth_authorization)) {
                    ng0Var3.k1(false, true);
                    if (!tL_error3.text.contains("PHONE_NUMBER_INVALID")) {
                        if (!tL_error3.text.contains("PHONE_CODE_EMPTY") && !tL_error3.text.contains("PHONE_CODE_INVALID")) {
                            if (!tL_error3.text.contains("PHONE_CODE_EXPIRED")) {
                                if (!tL_error3.text.contains("FIRSTNAME_INVALID")) {
                                    if (!tL_error3.text.contains("LASTNAME_INVALID")) {
                                        ng0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                        break;
                                    } else {
                                        ng0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidLastName", R.string.InvalidLastName));
                                        break;
                                    }
                                } else {
                                    ng0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidFirstName", R.string.InvalidFirstName));
                                    break;
                                }
                            } else {
                                ze0Var.c(true);
                                ng0Var3.u1(0, true, null, true);
                                ng0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                break;
                            }
                        } else {
                            ng0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                            break;
                        }
                    } else {
                        ng0Var3.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                        break;
                    }
                } else {
                    ze0Var.o();
                    ng0Var3.v1(false, true);
                    ze0Var.postDelayed(new fe0(i17, ze0Var, tLObject9), 150L);
                    break;
                }
                break;
            case 28:
                ze0 ze0Var2 = (ze0) obj3;
                TLRPC.FileLocation fileLocation = ((TLRPC.PhotoSize) obj2).location;
                ze0Var2.J = fileLocation;
                ze0Var2.K = ((TLRPC.PhotoSize) obj).location;
                ze0Var2.e.h(ImageLocation.getForLocal(fileLocation), "50_50", ze0Var2.f, null);
                break;
            default:
                rf0 rf0Var = (rf0) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                TL_account.confirmPhone confirmphone = (TL_account.confirmPhone) obj;
                int i25 = rf0Var.c0;
                ng0 ng0Var4 = rf0Var.p0;
                rf0Var.z(false);
                rf0Var.a0 = false;
                if (tL_error4 != null) {
                    rf0Var.b0 = tL_error4.text;
                    if ((i25 == 3 && ((i15 = rf0Var.d0) == 4 || i15 == 2 || i15 == 17 || i15 == 16)) || ((i25 == 2 && ((i13 = rf0Var.d0) == 4 || i13 == 3)) || (i25 == 4 && ((i12 = rf0Var.d0) == 2 || i12 == 17 || i12 == 16)))) {
                        rf0Var.t();
                    }
                    if (i25 == 15) {
                        NotificationCenter.getGlobalInstance().addObserver(rf0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i25 == 2) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(rf0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i25 == 3) {
                        AndroidUtilities.setWaitingForCall(true);
                        NotificationCenter.getGlobalInstance().addObserver(rf0Var, NotificationCenter.didReceiveCall);
                    }
                    rf0Var.W = true;
                    if (i25 != 3) {
                        i14 = ((org.telegram.ui.ActionBar.p2) ng0Var4).currentAccount;
                        org.telegram.ui.Components.z4.f0(i14, tL_error4, ng0Var4, confirmphone, new Object[0]);
                    }
                    if (!tL_error4.text.contains("PHONE_CODE_EMPTY") && !tL_error4.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error4.text.contains("PHONE_CODE_EXPIRED")) {
                            rf0Var.c(true);
                            ng0Var4.u1(0, true, null, true);
                            break;
                        }
                    } else {
                        rf0Var.y();
                        break;
                    }
                } else {
                    Activity parentActivity = ng0Var4.getParentActivity();
                    if (parentActivity != null) {
                        rf0Var.q(new fe0(r9, rf0Var, parentActivity));
                        break;
                    }
                }
                break;
        }
    }
}
