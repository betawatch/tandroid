package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.widget.EditText;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotGuardHelper;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z10(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i10;
        int i11 = this.a;
        int i12 = 2;
        int i13 = 4;
        int i14 = 10;
        int i15 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = ((a20) obj2).e;
                filtersSetupActivity.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = ((d60) obj2).V1;
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    if (((org.telegram.ui.Components.voip.u) arrayList2.get(i16)).w != null) {
                        arrayList.remove(((org.telegram.ui.Components.voip.u) arrayList2.get(i16)).w);
                    }
                }
                while (i15 < arrayList.size()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i15);
                    if (videoParticipant.participant.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, videoParticipant.presentation);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
                    }
                    i15++;
                }
                break;
            case 2:
                d60 d60Var = (d60) obj2;
                d60Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                d60Var.dismiss();
                break;
            case 3:
                z5 z5Var = (z5) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.t2) obj).e.getBitmap(100, 100);
                    if (bitmap == null) {
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new z10(i13, z5Var, qh.g0.b(bitmap, true)));
                        break;
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 4:
                ((d60) ((z5) obj2).b).R0.setNewColors((int[]) obj);
                break;
            case 5:
                n70.V((n70) obj2, (TLRPC.TL_error) obj);
                break;
            case 6:
                j70 j70Var = (j70) obj2;
                String str = (String) obj;
                k70 k70Var = j70Var.a;
                k70Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                k70Var.c = k70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new lo(24, j70Var, str), 66);
                break;
            case 7:
                TLObject tLObject = (TLObject) obj;
                k70 k70Var2 = ((j70) obj2).a;
                if (tLObject != null) {
                    n70.a0(k70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject);
                    break;
                } else {
                    n70.a0(k70Var2.h, null);
                    break;
                }
            case 8:
                m70 m70Var = (m70) obj2;
                String str2 = (String) obj;
                m70Var.h = str2;
                n70 n70Var = m70Var.r;
                if (n70Var.K) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                m70Var.n = n70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new ba(m70Var, str2, str2, 14), 66);
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.h(18, (e80) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                break;
            case 10:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.e = (ArrayList) obj;
                languageSelectActivity.c.l();
                break;
            case 11:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) obj2;
                String str3 = (String) obj;
                if (str3.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new z10(i14, languageSelectActivity2, new ArrayList()));
                    break;
                } else {
                    System.currentTimeMillis();
                    ArrayList arrayList3 = new ArrayList();
                    int size = languageSelectActivity2.h.size();
                    for (int i17 = 0; i17 < size; i17++) {
                        LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) languageSelectActivity2.h.get(i17);
                        if (localeInfo.name.toLowerCase().startsWith(str3) || localeInfo.nameEnglish.toLowerCase().startsWith(str3)) {
                            arrayList3.add(localeInfo);
                        }
                    }
                    int size2 = languageSelectActivity2.f.size();
                    while (i15 < size2) {
                        LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity2.f.get(i15);
                        if (localeInfo2.name.toLowerCase().startsWith(str3) || localeInfo2.nameEnglish.toLowerCase().startsWith(str3)) {
                            arrayList3.add(localeInfo2);
                        }
                        i15++;
                    }
                    AndroidUtilities.runOnUIThread(new z10(i14, languageSelectActivity2, arrayList3));
                    break;
                }
                break;
            case 12:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject2 = (TLObject) obj;
                Pattern pattern = LaunchActivity.y1;
                if (tLObject2 instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject2;
                    MessagesController.getInstance(launchActivity.L).putUsers(resolvedbusinesschatlinks.users, false);
                    MessagesController.getInstance(launchActivity.L).putChats(resolvedbusinesschatlinks.chats, false);
                    MessagesStorage.getInstance(launchActivity.L).putUsersAndChats(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
                    Bundle bundle = new Bundle();
                    TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        bundle.putLong("user_id", peer.user_id);
                    } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                        bundle.putLong("chat_id", peer.channel_id);
                    }
                    xn xnVar = new xn(bundle);
                    xnVar.fa = resolvedbusinesschatlinks;
                    launchActivity.q0(xnVar, false, true);
                    break;
                } else {
                    launchActivity.B0(org.telegram.ui.Components.z4.N(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                    break;
                }
            case 13:
                LaunchActivity launchActivity2 = (LaunchActivity) obj2;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) obj;
                Pattern pattern2 = LaunchActivity.y1;
                MessagesController.getInstance(launchActivity2.L).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.L);
                long j10 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j10, j10, tL_chatInviteJoinResultWebView.query_id);
                break;
            case 14:
                Pattern pattern3 = LaunchActivity.y1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb = new StringBuilder();
                b.i(R.string.ErrorOccurred, "\n", sb);
                sb.append(((TLRPC.TL_error) obj).text);
                org.telegram.ui.Components.z4.u0((i) obj2, string, sb.toString(), null);
                break;
            case 15:
                LaunchActivity launchActivity3 = (LaunchActivity) obj2;
                String str4 = (String) obj;
                if (!launchActivity3.n0.getFragmentStack().isEmpty()) {
                    launchActivity3.n0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str4).getQueryParameter("ref")));
                    break;
                }
                break;
            case 16:
                Pattern pattern4 = LaunchActivity.y1;
                ((LaunchActivity) obj2).j0((TL_account.Password) obj);
                break;
            case 17:
                LaunchActivity launchActivity4 = (LaunchActivity) obj2;
                Runnable runnable = (Runnable) obj;
                launchActivity4.n0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity4.o0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.o0.getView().getVisibility() == 0) {
                        launchActivity4.o0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.p0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.p0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 18:
                org.telegram.ui.Components.ic icVar = (org.telegram.ui.Components.ic) obj;
                if (!((LaunchActivity) obj2).N && LaunchActivity.B1) {
                    icVar.j();
                    break;
                }
                break;
            case 19:
                Pattern pattern5 = LaunchActivity.y1;
                ((LaunchActivity) obj2).p0((jd1) obj);
                break;
            case 20:
                LaunchActivity launchActivity5 = (LaunchActivity) obj2;
                af.f fVar = (af.f) obj;
                launchActivity5.M0 = null;
                launchActivity5.N0 = null;
                launchActivity5.O0 = null;
                launchActivity5.P0 = null;
                launchActivity5.S0 = null;
                launchActivity5.Q0 = null;
                if (fVar != null) {
                    fVar.b();
                    break;
                }
                break;
            case 21:
                af.f fVar2 = (af.f) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                Pattern pattern6 = LaunchActivity.y1;
                if (fVar2 != null) {
                    fVar2.b();
                }
                if (d2Var != null) {
                    d2Var.dismiss();
                    break;
                }
                break;
            case 22:
                xb0 xb0Var = (xb0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                xb0Var.a();
                if (tLObject3 != null) {
                    xb0Var.a.j0((TL_account.Password) tLObject3);
                    break;
                }
                break;
            case 23:
                ((FiltersSetupActivity) obj).X(((xb0) obj2).a.O());
                break;
            case 24:
                bd0 bd0Var = (bd0) obj2;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) obj;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    AndroidUtilities.runOnUIThread(new sq(bd0Var, createBitmap2, gLSurfaceView, 21));
                    break;
                }
                break;
            case 25:
                bd0 bd0Var2 = (bd0) obj2;
                bd0Var2.c.setImageResource(R.drawable.msg_location_alert2);
                bd0Var2.e0(((LocationController.SharingLocationInfo) obj).proximityMeters);
                bd0Var2.D = false;
                break;
            case 26:
                ((EditText) obj2).removeTextChangedListener((dg.b0) obj);
                break;
            case 27:
                Runnable runnable2 = (Runnable) obj;
                wd0 wd0Var = ((zd0) obj2).a;
                int i18 = 0;
                while (true) {
                    cs[] csVarArr = wd0Var.f;
                    if (i18 >= csVarArr.length) {
                        runnable2.run();
                        wd0Var.e = false;
                        break;
                    } else {
                        csVarArr[i18].l(0.0f);
                        i18++;
                    }
                }
            case 28:
                he0 he0Var = (he0) obj2;
                og0 og0Var = he0Var.y;
                og0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(he0Var.a);
                og0Var.o1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                break;
            default:
                he0 he0Var2 = (he0) obj2;
                String str5 = (String) obj;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = he0Var2.n.current_algo;
                boolean z4 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                byte[] x10 = z4 ? SRPHelper.getX(AndroidUtilities.getStringBytes(str5), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
                fe0 fe0Var = new fe0(he0Var2, i12);
                if (z4) {
                    TL_account.Password password = he0Var2.n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x10, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        fe0Var.run(null, tL_error);
                        break;
                    } else {
                        TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                        tL_auth_checkPassword.password = startCheck;
                        i10 = ((org.telegram.ui.ActionBar.p2) he0Var2.y).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, fe0Var, 10);
                        break;
                    }
                }
                break;
        }
    }
}
