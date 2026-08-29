package org.telegram.ui;

import android.app.Activity;
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
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x60(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i10;
        int i11;
        int i12 = 0;
        switch (this.a) {
            case 0:
                y60 y60Var = (y60) this.b;
                TLObject tLObject = (TLObject) this.c;
                z60 z60Var = y60Var.a;
                if (tLObject != null) {
                    c70.a0(z60Var.h, (TLRPC.TL_messages_stickerSet) tLObject);
                    break;
                } else {
                    c70.a0(z60Var.h, null);
                    break;
                }
            case 1:
                b70 b70Var = (b70) this.b;
                String str = (String) this.c;
                b70Var.h = str;
                c70 c70Var = b70Var.r;
                if (c70Var.J) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.q = str;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.q = str;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                b70Var.n = c70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new x9(b70Var, str, str, 14), 66);
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c(11, (u70) this.b, (CacheByChatsController.KeepMediaException) this.c), 150L);
                break;
            case 3:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.b;
                languageSelectActivity.e = (ArrayList) this.c;
                languageSelectActivity.c.l();
                break;
            case 4:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) this.b;
                String str2 = (String) this.c;
                int i13 = 3;
                if (str2.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new x60(i13, languageSelectActivity2, new ArrayList()));
                    break;
                } else {
                    System.currentTimeMillis();
                    ArrayList arrayList = new ArrayList();
                    int size = languageSelectActivity2.h.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) languageSelectActivity2.h.get(i14);
                        if (localeInfo.name.toLowerCase().startsWith(str2) || localeInfo.nameEnglish.toLowerCase().startsWith(str2)) {
                            arrayList.add(localeInfo);
                        }
                    }
                    int size2 = languageSelectActivity2.f.size();
                    while (i12 < size2) {
                        LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity2.f.get(i12);
                        if (localeInfo2.name.toLowerCase().startsWith(str2) || localeInfo2.nameEnglish.toLowerCase().startsWith(str2)) {
                            arrayList.add(localeInfo2);
                        }
                        i12++;
                    }
                    AndroidUtilities.runOnUIThread(new x60(i13, languageSelectActivity2, arrayList));
                    break;
                }
                break;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                Pattern pattern = LaunchActivity.x1;
                if (tLObject2 instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject2;
                    MessagesController.getInstance(launchActivity.K).putUsers(resolvedbusinesschatlinks.users, false);
                    MessagesController.getInstance(launchActivity.K).putChats(resolvedbusinesschatlinks.chats, false);
                    MessagesStorage.getInstance(launchActivity.K).putUsersAndChats(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
                    Bundle bundle = new Bundle();
                    TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        bundle.putLong("user_id", peer.user_id);
                    } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                        bundle.putLong("chat_id", peer.channel_id);
                    }
                    tn tnVar = new tn(bundle);
                    tnVar.ea = resolvedbusinesschatlinks;
                    launchActivity.q0(tnVar, false, true);
                    break;
                } else {
                    launchActivity.B0(org.telegram.ui.Components.c5.N(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                    break;
                }
                break;
            case 6:
                LaunchActivity launchActivity2 = (LaunchActivity) this.b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.c;
                Pattern pattern2 = LaunchActivity.x1;
                MessagesController.getInstance(launchActivity2.K).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.K);
                long j10 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j10, j10, tL_chatInviteJoinResultWebView.query_id);
                break;
            case 7:
                i iVar = (i) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                Pattern pattern3 = LaunchActivity.x1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb2 = new StringBuilder();
                b.j(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(tL_error.text);
                org.telegram.ui.Components.c5.u0(iVar, string, sb2.toString(), null);
                break;
            case 8:
                LaunchActivity launchActivity3 = (LaunchActivity) this.b;
                String str3 = (String) this.c;
                if (!launchActivity3.m0.getFragmentStack().isEmpty()) {
                    launchActivity3.m0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str3).getQueryParameter("ref")));
                    break;
                }
                break;
            case 9:
                LaunchActivity launchActivity4 = (LaunchActivity) this.b;
                TL_account.Password password = (TL_account.Password) this.c;
                Pattern pattern4 = LaunchActivity.x1;
                launchActivity4.j0(password);
                break;
            case 10:
                LaunchActivity launchActivity5 = (LaunchActivity) this.b;
                Runnable runnable = (Runnable) this.c;
                launchActivity5.m0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity5.n0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity5.n0.getView().getVisibility() == 0) {
                        launchActivity5.n0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity5.o0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity5.o0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 11:
                LaunchActivity launchActivity6 = (LaunchActivity) this.b;
                org.telegram.ui.Components.mc mcVar = (org.telegram.ui.Components.mc) this.c;
                if (!launchActivity6.M && LaunchActivity.A1) {
                    mcVar.j();
                    break;
                }
                break;
            case 12:
                LaunchActivity launchActivity7 = (LaunchActivity) this.b;
                qc1 qc1Var = (qc1) this.c;
                Pattern pattern5 = LaunchActivity.x1;
                launchActivity7.p0(qc1Var);
                break;
            case 13:
                LaunchActivity launchActivity8 = (LaunchActivity) this.b;
                ye.c cVar = (ye.c) this.c;
                launchActivity8.L0 = null;
                launchActivity8.M0 = null;
                launchActivity8.N0 = null;
                launchActivity8.O0 = null;
                launchActivity8.R0 = null;
                launchActivity8.P0 = null;
                if (cVar != null) {
                    cVar.b();
                    break;
                }
                break;
            case 14:
                ye.c cVar2 = (ye.c) this.b;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.c;
                Pattern pattern6 = LaunchActivity.x1;
                if (cVar2 != null) {
                    cVar2.b();
                }
                if (c2Var != null) {
                    c2Var.dismiss();
                    break;
                }
                break;
            case 15:
                mb0 mb0Var = (mb0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                mb0Var.a();
                if (tLObject3 != null) {
                    mb0Var.a.j0((TL_account.Password) tLObject3);
                    break;
                }
                break;
            case 16:
                ((FiltersSetupActivity) this.c).X(((mb0) this.b).a.O());
                break;
            case 17:
                rc0 rc0Var = (rc0) this.b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    AndroidUtilities.runOnUIThread(new lq(rc0Var, createBitmap2, gLSurfaceView, 21));
                    break;
                }
                break;
            case 18:
                rc0 rc0Var2 = (rc0) this.b;
                LocationController.SharingLocationInfo sharingLocationInfo = (LocationController.SharingLocationInfo) this.c;
                rc0Var2.c.setImageResource(R.drawable.msg_location_alert2);
                rc0Var2.e0(sharingLocationInfo.proximityMeters);
                rc0Var2.C = false;
                break;
            case 19:
                ((EditText) this.b).removeTextChangedListener((ag.c0) this.c);
                break;
            case 20:
                pd0 pd0Var = (pd0) this.b;
                Runnable runnable2 = (Runnable) this.c;
                md0 md0Var = pd0Var.a;
                int i15 = 0;
                while (true) {
                    ur[] urVarArr = md0Var.f;
                    if (i15 >= urVarArr.length) {
                        runnable2.run();
                        md0Var.e = false;
                        break;
                    } else {
                        urVarArr[i15].l(0.0f);
                        i15++;
                    }
                }
            case 21:
                xd0 xd0Var = (xd0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                fg0 fg0Var = xd0Var.y;
                fg0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(xd0Var.a);
                fg0Var.o1((TLRPC.TL_auth_authorization) tLObject4, false);
                break;
            case 22:
                xd0 xd0Var2 = (xd0) this.b;
                String str4 = (String) this.c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = xd0Var2.n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                byte[] x4 = z10 ? SRPHelper.getX(AndroidUtilities.getStringBytes(str4), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
                vd0 vd0Var = new vd0(xd0Var2, 2);
                if (z10) {
                    TL_account.Password password2 = xd0Var2.n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x4, password2.srp_id, password2.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                        tL_error2.text = "PASSWORD_HASH_INVALID";
                        vd0Var.run(null, tL_error2);
                        break;
                    } else {
                        TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                        tL_auth_checkPassword.password = startCheck;
                        i10 = ((org.telegram.ui.ActionBar.o2) xd0Var2.y).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, vd0Var, 10);
                        break;
                    }
                }
                break;
            case 23:
                pe0 pe0Var = (pe0) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                pe0Var.K.k1(false, false);
                AndroidUtilities.hideKeyboard(pe0Var.K.fragmentView.findFocus());
                pe0Var.K.o1((TLRPC.TL_auth_authorization) tLObject5, true);
                TLRPC.FileLocation fileLocation = pe0Var.J;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new x60(24, pe0Var, fileLocation));
                    break;
                }
                break;
            case 24:
                pe0 pe0Var2 = (pe0) this.b;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.c;
                i11 = ((org.telegram.ui.ActionBar.o2) pe0Var2.K).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar(fileLocation2);
                break;
            case 25:
                qe0 qe0Var = (qe0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                fg0 fg0Var2 = qe0Var.A;
                fg0Var2.k1(false, true);
                if (tL_error3 == null) {
                    if (qe0Var.r != null && qe0Var.s != null && qe0Var.v != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", qe0Var.r);
                        bundle2.putString("phoneHash", qe0Var.s);
                        bundle2.putString("code", qe0Var.v);
                        fg0Var2.u1(5, true, bundle2, false);
                        break;
                    } else {
                        fg0Var2.u1(0, true, null, true);
                        break;
                    }
                } else if (tL_error3.text.equals("2FA_RECENT_CONFIRM")) {
                    fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    break;
                } else {
                    fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                    break;
                }
            case 26:
                if0 if0Var = (if0) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.c);
                alertDialog$Builder.a.N = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.a.P = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.x3.k(new StringBuilder("+"), if0Var.b, qe.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.a.setOnDismissListener(new df0(if0Var, i12));
                alertDialog$Builder.o();
                break;
            case 27:
                if0 if0Var2 = (if0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                if0Var2.getClass();
                if0Var2.a0 = tL_error4.text;
                break;
            case 28:
                ((if0) this.b).o0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.c), false);
                break;
            default:
                if0 if0Var3 = (if0) this.b;
                Runnable runnable3 = (Runnable) this.c;
                sr srVar = if0Var3.f;
                int i16 = 0;
                while (true) {
                    ur[] urVarArr2 = srVar.f;
                    if (i16 >= urVarArr2.length) {
                        runnable3.run();
                        srVar.e = false;
                        break;
                    } else {
                        urVarArr2[i16].l(0.0f);
                        i16++;
                    }
                }
        }
    }
}
