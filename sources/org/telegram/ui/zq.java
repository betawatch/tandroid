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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class zq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zq(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:310:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0796 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        int i10;
        a0.i iVar;
        ArrayList arrayList2;
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
        int i17 = 15;
        int i18 = 17;
        int i19 = 2;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i16) {
            case 0:
                wr wrVar = (wr) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                a0.i iVar2 = wrVar.L;
                a0.i iVar3 = wrVar.M;
                int i20 = wrVar.e1;
                a0.i iVar4 = wrVar.K;
                int i21 = wrVar.O;
                ArrayList arrayList5 = wrVar.F;
                int i22 = 0;
                int i23 = 0;
                while (i23 < arrayList3.size()) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) arrayList3.get(i23);
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) arrayList4.get(i23);
                    if (tL_channels_getParticipants == null || tL_channels_channelParticipants == null) {
                        arrayList = arrayList3;
                        i10 = i23;
                    } else {
                        if (i21 == 1) {
                            arrayList = arrayList3;
                            wrVar.getMessagesController().processLoadedAdminsResponse(wrVar.N, tL_channels_channelParticipants);
                        } else {
                            arrayList = arrayList3;
                        }
                        wrVar.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
                        wrVar.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
                        long clientUserId = wrVar.getUserConfig().getClientUserId();
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
                        }
                        if (i21 == 2) {
                            wrVar.k1--;
                            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = tL_channels_getParticipants.filter;
                            if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsContacts) {
                                arrayList2 = wrVar.H;
                                iVar = iVar3;
                            } else if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsBots) {
                                arrayList2 = wrVar.G;
                                iVar = iVar2;
                            }
                            arrayList2.clear();
                            arrayList2.addAll(tL_channels_channelParticipants.participants);
                            size = tL_channels_channelParticipants.participants.size();
                            i11 = 0;
                            while (i11 < size) {
                                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i11);
                                int i25 = i23;
                                int i26 = size;
                                if (channelParticipant.user_id == clientUserId) {
                                    arrayList2.remove(channelParticipant);
                                } else {
                                    iVar.k(channelParticipant, MessageObject.getPeerId(channelParticipant.peer));
                                }
                                i11++;
                                i23 = i25;
                                size = i26;
                            }
                            i10 = i23;
                            int size2 = arrayList2.size() + i22;
                            if (i21 == 2) {
                                int size3 = arrayList5.size();
                                int i27 = 0;
                                while (i27 < size3) {
                                    TLObject tLObject = (TLObject) arrayList5.get(i27);
                                    if (tLObject instanceof TLRPC.ChannelParticipant) {
                                        long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
                                        if (iVar3.f(peerId) != null || iVar2.f(peerId) != null || (i20 == 1 && peerId > 0 && UserObject.isDeleted(wrVar.getMessagesController().getUser(Long.valueOf(peerId))))) {
                                            arrayList5.remove(i27);
                                            iVar4.l(peerId);
                                        }
                                        i27++;
                                    } else {
                                        arrayList5.remove(i27);
                                    }
                                    i27--;
                                    size3--;
                                    i27++;
                                }
                            }
                            if ((i21 != 0 || i21 == 3 || i21 == 2) && (chat = wrVar.r) != null && chat.megagroup) {
                                chatFull = wrVar.s;
                                if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants_count <= 200) {
                                    wrVar.z0(arrayList2);
                                    i22 = size2;
                                }
                            }
                            if (i21 == 1) {
                                try {
                                    Collections.sort(arrayList5, new a4.e(27));
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
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
                        i11 = 0;
                        while (i11 < size) {
                        }
                        i10 = i23;
                        int size22 = arrayList2.size() + i22;
                        if (i21 == 2) {
                        }
                        if (i21 != 0) {
                        }
                        chatFull = wrVar.s;
                        if (chatFull instanceof TLRPC.TL_channelFull) {
                            wrVar.z0(arrayList2);
                            i22 = size22;
                        }
                        if (i21 == 1) {
                        }
                        i22 = size22;
                    }
                    i23 = i10 + 1;
                    arrayList3 = arrayList;
                }
                if (i21 != 2 || wrVar.k1 <= 0) {
                    sr srVar = wrVar.a;
                    wrVar.y0(srVar != null ? srVar.d.d1 : 0);
                    wrVar.Q = false;
                    wrVar.R = true;
                    org.telegram.ui.ActionBar.w0 w0Var = wrVar.f;
                    if (w0Var != null) {
                        w0Var.setVisibility((i21 != 0 || i22 > 5) ? 0 : 8);
                    }
                }
                wrVar.B0();
                sr srVar2 = wrVar.a;
                if (srVar2 != null) {
                    bi.y1 y1Var = wrVar.c;
                    y1Var.Y1 = wrVar.B1;
                    y1Var.Z1 = 0;
                    srVar2.l();
                    org.telegram.ui.Components.jx0 jx0Var = wrVar.b;
                    if (jx0Var != null && wrVar.a.d.d1 == 0 && wrVar.R) {
                        jx0Var.e(false, true);
                    }
                }
                wrVar.resumeDelayedFragmentAnimation();
                break;
            case 1:
                ((wy) obj3).removeSelfFromStack();
                ((nd) obj2).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.p2) obj).finishFragment();
                break;
            case 2:
                wy wyVar = (wy) obj3;
                int length = ((Object[]) obj).length;
                wyVar.u4((vy) obj2);
                uw uwVar = wyVar.z0;
                if (uwVar != null && uwVar.getVisibility() == 0) {
                    wyVar.z0.c();
                    break;
                }
                break;
            case 3:
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                wy wyVar2 = ((vw) obj3).b;
                if (!((boolean[]) obj2)[0]) {
                    t00.S(wyVar2, dialogFilter, null);
                    break;
                } else {
                    wyVar2.presentFragment(new e00(dialogFilter, null));
                    break;
                }
            case 4:
                iz izVar = (iz) obj3;
                izVar.getClass();
                izVar.p((TLRPC.TL_messages_stickerSet) ((TLObject) obj2), (MessageObject) obj);
                break;
            case 5:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj3;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ArrayList arrayList6 = ExternalActionActivity.x;
                try {
                    d2Var.dismiss();
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.ActionBar.d2 x02 = org.telegram.ui.Components.d5.x0(externalActionActivity, LocaleController.getString(R.string.UpdateAppAlert), true);
                        if (x02 != null) {
                            x02.setOnDismissListener(new di.h0(8, externalActionActivity, tL_error));
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
                break;
            case 6:
                h10 h10Var = (h10) obj3;
                TLObject tLObject2 = (TLObject) obj;
                h10.r0((TLRPC.TL_error) obj2, h10Var, org.telegram.ui.Components.wc.a0(h10Var));
                if (tLObject2 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    h10Var.getMessagesController().loadRemoteFilters(true);
                    TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = (TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject2;
                    e00 e00Var = new e00(h10Var.r, tL_chatlists_exportedChatlistInvite.invite);
                    e00Var.y = new h00(h10Var, 1);
                    e00Var.x = new h00(h10Var, i19);
                    h10Var.presentFragment(e00Var);
                    AndroidUtilities.runOnUIThread(new uv(i17, h10Var, tL_chatlists_exportedChatlistInvite), 200L);
                    break;
                }
                break;
            case 7:
                t00 t00Var = (t00) obj3;
                TLObject tLObject3 = (TLObject) obj;
                org.telegram.ui.ActionBar.p2 p2Var = t00Var.n;
                h10.r0((TLRPC.TL_error) obj2, p2Var, new org.telegram.ui.Components.wc(t00Var.Z, null));
                if (tLObject3 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    t00Var.dismiss();
                    p2Var.getMessagesController().loadRemoteFilters(true);
                    p2Var.presentFragment(new e00(t00Var.X, ((TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject3).invite));
                    break;
                }
                break;
            case 8:
                a10 a10Var = (a10) obj3;
                z00 z00Var = (z00) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    org.telegram.ui.Components.wc.a0(a10Var.a).t(LocaleController.getString(R.string.UnknownError), null).j();
                    AndroidUtilities.cancelRunOnUIThread(z00Var);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = ((f20) obj3).e;
                if (d2Var2 != null) {
                    try {
                        d2Var2.dismiss();
                    } catch (Exception e10) {
                        FileLog.e(e10);
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
                fg.d2 d2Var3 = c70Var.f;
                if (c70Var.n) {
                    c70Var.h = null;
                    c70Var.d = arrayList7;
                    c70Var.e = arrayList8;
                    d2Var3.f(arrayList7, null);
                    e70Var.q0(c70Var.H);
                    c70Var.l();
                    if (c70Var.n && !d2Var3.e() && c70Var.h() == 0) {
                        e70Var.s.e(false, true);
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
                ArrayList arrayList9 = (ArrayList) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                if (g80Var.h) {
                    g80Var.d = arrayList9;
                    g80Var.e = arrayList10;
                    g80Var.l();
                    g80Var.n.r.e(false, true);
                    break;
                }
                break;
            case 13:
                TLRPC.User user = (TLRPC.User) obj2;
                Pattern pattern = LaunchActivity.B1;
                MessagesController.getInstance(((LaunchActivity) obj3).O).putUser(user, true);
                ((fa0) obj).run(user);
                break;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                h90 h90Var = (h90) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                Pattern pattern2 = LaunchActivity.B1;
                try {
                    h90Var.run();
                    if ("APP_VERSION_OUTDATED".equals(tL_error2.text)) {
                        org.telegram.ui.Components.d5.x0(launchActivity, LocaleController.getString(R.string.UpdateAppAlert), true);
                    } else {
                        launchActivity.B0(org.telegram.ui.Components.d5.N(launchActivity, null, LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error2.text));
                    }
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 15:
                LaunchActivity launchActivity2 = (LaunchActivity) obj3;
                h90 h90Var2 = (h90) obj2;
                TLObject tLObject4 = (TLObject) obj;
                Pattern pattern3 = LaunchActivity.B1;
                try {
                    h90Var2.run();
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                if (tLObject4 instanceof TLRPC.TL_help_deepLinkInfo) {
                    TLRPC.TL_help_deepLinkInfo tL_help_deepLinkInfo = (TLRPC.TL_help_deepLinkInfo) tLObject4;
                    org.telegram.ui.Components.d5.x0(launchActivity2, tL_help_deepLinkInfo.message, tL_help_deepLinkInfo.update_app);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj2;
                Pattern pattern4 = LaunchActivity.B1;
                i6Var.d((File) obj, i6Var.c);
                AndroidUtilities.runOnUIThread(new f90((LaunchActivity) obj3, 7));
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
                int i28 = iArr[0] - 1;
                iArr[0] = i28;
                if (i28 == 0) {
                    NotificationCenter.getInstance(launchActivity4.O).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    launchActivity4.l0(jArr, false);
                    break;
                }
                break;
            case 19:
                fc0 fc0Var = (fc0) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                String str2 = (String) obj;
                fc0Var.a();
                if (tLObject6 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.d5.x0(fc0Var.a, LocaleController.getString(R.string.UpdateAppAlert), true);
                    }
                    bc0 bc0Var = new bc0(fc0Var, str2, 0);
                    if (!password.has_password) {
                        mh1 mh1Var = new mh1(TextUtils.isEmpty(password.email_unconfirmed_pattern) ? 6 : 5, password);
                        mh1Var.j0 = bc0Var;
                        fc0Var.n(mh1Var, false);
                        break;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.I = password;
                        twoStepVerificationActivity.J = false;
                        fc0Var.n(twoStepVerificationActivity, false);
                        bc0Var.run();
                        break;
                    }
                }
                break;
            case 20:
                cc0 cc0Var = (cc0) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tLObject7 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject7;
                    cc0Var.getMessagesController().putUsers(tL_users_userFull.users, false);
                    cc0Var.getMessagesController().putChats(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.voip.e2.m(user2, false, userFull != null && userFull.video_calls_available, cc0Var.getParentActivity(), userFull, cc0Var.getAccountInstance());
                break;
            case 21:
                id0 id0Var = (id0) obj3;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) obj;
                ImageView imageView = new ImageView(id0Var.getParentActivity());
                imageView.setImageBitmap((Bitmap) obj2);
                ViewGroup viewGroup = (ViewGroup) gLSurfaceView.getParent();
                try {
                    viewGroup.addView(imageView, viewGroup.indexOfChild(gLSurfaceView));
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
                AndroidUtilities.runOnUIThread(new zq(id0Var, viewGroup, gLSurfaceView, 22), 100L);
                break;
            case 22:
                id0 id0Var2 = (id0) obj3;
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                GLSurfaceView gLSurfaceView2 = (GLSurfaceView) obj;
                id0Var2.getClass();
                try {
                    viewGroup2.removeView(gLSurfaceView2);
                } catch (Exception e14) {
                    FileLog.e(e14);
                }
                id0Var2.M = true;
                id0Var2.finishFragment();
                break;
            case 23:
                id0 id0Var3 = (id0) obj3;
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) obj2;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) obj;
                id0Var3.getClass();
                try {
                    d2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                d2VarArr[0] = null;
                id0Var3.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                id0Var3.finishFragment();
                break;
            case 24:
                xg0 xg0Var = (xg0) obj3;
                xg0Var.getClass();
                xg0Var.g1((Bundle) obj2, (TLRPC.auth_SentCode) ((TLObject) obj), true);
                break;
            case 25:
                og.x xVar = (og.x) obj3;
                EditText editText = (EditText) obj2;
                AtomicReference atomicReference = (AtomicReference) obj;
                xVar.getClass();
                editText.removeTextChangedListener(xVar);
                editText.removeCallbacks((Runnable) atomicReference.get());
                ((Runnable) atomicReference.get()).run();
                break;
            case 26:
                TLObject tLObject8 = (TLObject) obj2;
                Bundle bundle = (Bundle) obj;
                xg0 xg0Var2 = ((ge0) obj3).W;
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
                hf0 hf0Var = (hf0) obj3;
                TLObject tLObject9 = (TLObject) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                xg0 xg0Var3 = hf0Var.O;
                hf0Var.H = false;
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
                                hf0Var.c(true);
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
                    hf0Var.o();
                    xg0Var3.v1(false, true);
                    hf0Var.postDelayed(new h90(i18, hf0Var, tLObject9), 150L);
                    break;
                }
                break;
            case 28:
                hf0 hf0Var2 = (hf0) obj3;
                TLRPC.FileLocation fileLocation = ((TLRPC.PhotoSize) obj2).location;
                hf0Var2.M = fileLocation;
                hf0Var2.N = ((TLRPC.PhotoSize) obj).location;
                hf0Var2.e.h(ImageLocation.getForLocal(fileLocation), "50_50", hf0Var2.f, null);
                break;
            default:
                zf0 zf0Var = (zf0) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                TL_account.confirmPhone confirmphone = (TL_account.confirmPhone) obj;
                int i29 = zf0Var.f0;
                xg0 xg0Var4 = zf0Var.s0;
                zf0Var.z(false);
                zf0Var.d0 = false;
                if (tL_error4 != null) {
                    zf0Var.e0 = tL_error4.text;
                    if ((i29 == 3 && ((i15 = zf0Var.g0) == 4 || i15 == 2 || i15 == 17 || i15 == 16)) || ((i29 == 2 && ((i13 = zf0Var.g0) == 4 || i13 == 3)) || (i29 == 4 && ((i12 = zf0Var.g0) == 2 || i12 == 17 || i12 == 16)))) {
                        zf0Var.u();
                    }
                    if (i29 == 15) {
                        NotificationCenter.getGlobalInstance().addObserver(zf0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i29 == 2) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(zf0Var, NotificationCenter.didReceiveSmsCode);
                    } else if (i29 == 3) {
                        AndroidUtilities.setWaitingForCall(true);
                        NotificationCenter.getGlobalInstance().addObserver(zf0Var, NotificationCenter.didReceiveCall);
                    }
                    zf0Var.c0 = true;
                    if (i29 != 3) {
                        i14 = ((org.telegram.ui.ActionBar.p2) xg0Var4).currentAccount;
                        org.telegram.ui.Components.d5.f0(i14, tL_error4, xg0Var4, confirmphone, new Object[0]);
                    }
                    if (!tL_error4.text.contains("PHONE_CODE_EMPTY") && !tL_error4.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error4.text.contains("PHONE_CODE_EXPIRED")) {
                            zf0Var.c(true);
                            xg0Var4.u1(0, true, null, true);
                            break;
                        }
                    } else {
                        zf0Var.y();
                        break;
                    }
                } else {
                    Activity parentActivity = xg0Var4.getParentActivity();
                    if (parentActivity != null) {
                        zf0Var.q(new h90(20, zf0Var, parentActivity));
                        break;
                    }
                }
                break;
        }
    }
}
