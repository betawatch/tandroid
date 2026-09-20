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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class r80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r80(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12 = 21;
        int i13 = 0;
        switch (this.a) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.b;
                languageSelectActivity.e = (ArrayList) this.c;
                languageSelectActivity.c.l();
                break;
            case 1:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) this.b;
                String str = (String) this.c;
                if (str.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new r80(i13, languageSelectActivity2, new ArrayList()));
                    break;
                } else {
                    System.currentTimeMillis();
                    ArrayList arrayList = new ArrayList();
                    int size = languageSelectActivity2.h.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) languageSelectActivity2.h.get(i14);
                        if (localeInfo.name.toLowerCase().startsWith(str) || localeInfo.nameEnglish.toLowerCase().startsWith(str)) {
                            arrayList.add(localeInfo);
                        }
                    }
                    int size2 = languageSelectActivity2.f.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity2.f.get(i15);
                        if (localeInfo2.name.toLowerCase().startsWith(str) || localeInfo2.nameEnglish.toLowerCase().startsWith(str)) {
                            arrayList.add(localeInfo2);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new r80(i13, languageSelectActivity2, arrayList));
                    break;
                }
                break;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                TLObject tLObject = (TLObject) this.c;
                Pattern pattern = LaunchActivity.B1;
                if (tLObject instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject;
                    MessagesController.getInstance(launchActivity.O).putUsers(resolvedbusinesschatlinks.users, false);
                    MessagesController.getInstance(launchActivity.O).putChats(resolvedbusinesschatlinks.chats, false);
                    MessagesStorage.getInstance(launchActivity.O).putUsersAndChats(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
                    Bundle bundle = new Bundle();
                    TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        bundle.putLong("user_id", peer.user_id);
                    } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                        bundle.putLong("chat_id", peer.channel_id);
                    }
                    zn znVar = new zn(bundle);
                    znVar.ia = resolvedbusinesschatlinks;
                    launchActivity.q0(znVar, false, true);
                    break;
                } else {
                    launchActivity.B0(org.telegram.ui.Components.d5.N(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                    break;
                }
            case 3:
                LaunchActivity launchActivity2 = (LaunchActivity) this.b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.c;
                Pattern pattern2 = LaunchActivity.B1;
                MessagesController.getInstance(launchActivity2.O).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.O);
                long j3 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j3, j3, tL_chatInviteJoinResultWebView.query_id);
                break;
            case 4:
                h hVar = (h) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                Pattern pattern3 = LaunchActivity.B1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.o(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(tL_error.text);
                org.telegram.ui.Components.d5.u0(hVar, string, sb2.toString(), null);
                break;
            case 5:
                LaunchActivity launchActivity3 = (LaunchActivity) this.b;
                String str2 = (String) this.c;
                if (!launchActivity3.q0.getFragmentStack().isEmpty()) {
                    launchActivity3.q0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str2).getQueryParameter("ref")));
                    break;
                }
                break;
            case 6:
                LaunchActivity launchActivity4 = (LaunchActivity) this.b;
                TL_account.Password password = (TL_account.Password) this.c;
                Pattern pattern4 = LaunchActivity.B1;
                launchActivity4.j0(password);
                break;
            case 7:
                LaunchActivity launchActivity5 = (LaunchActivity) this.b;
                Runnable runnable = (Runnable) this.c;
                launchActivity5.q0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity5.r0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity5.r0.getView().getVisibility() == 0) {
                        launchActivity5.r0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity5.s0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity5.s0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 8:
                LaunchActivity launchActivity6 = (LaunchActivity) this.b;
                org.telegram.ui.Components.pc pcVar = (org.telegram.ui.Components.pc) this.c;
                if (!launchActivity6.Q && LaunchActivity.E1) {
                    pcVar.j();
                    break;
                }
                break;
            case 9:
                LaunchActivity launchActivity7 = (LaunchActivity) this.b;
                xd1 xd1Var = (xd1) this.c;
                Pattern pattern5 = LaunchActivity.B1;
                launchActivity7.p0(xd1Var);
                break;
            case 10:
                LaunchActivity launchActivity8 = (LaunchActivity) this.b;
                nf.e eVar = (nf.e) this.c;
                launchActivity8.P0 = null;
                launchActivity8.Q0 = null;
                launchActivity8.R0 = null;
                launchActivity8.S0 = null;
                launchActivity8.V0 = null;
                launchActivity8.T0 = null;
                if (eVar != null) {
                    eVar.b();
                    break;
                }
                break;
            case 11:
                nf.e eVar2 = (nf.e) this.b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.c;
                Pattern pattern6 = LaunchActivity.B1;
                if (eVar2 != null) {
                    eVar2.b();
                }
                if (b2Var != null) {
                    b2Var.dismiss();
                    break;
                }
                break;
            case 12:
                hc0 hc0Var = (hc0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                hc0Var.a();
                if (tLObject2 != null) {
                    hc0Var.a.j0((TL_account.Password) tLObject2);
                    break;
                }
                break;
            case 13:
                ((FiltersSetupActivity) this.c).X(((hc0) this.b).a.O());
                break;
            case 14:
                kd0 kd0Var = (kd0) this.b;
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
                    AndroidUtilities.runOnUIThread(new vq(kd0Var, createBitmap2, gLSurfaceView, i12));
                    break;
                }
                break;
            case 15:
                kd0 kd0Var2 = (kd0) this.b;
                LocationController.SharingLocationInfo sharingLocationInfo = (LocationController.SharingLocationInfo) this.c;
                kd0Var2.c.setImageResource(R.drawable.msg_location_alert2);
                kd0Var2.e0(sharingLocationInfo.proximityMeters);
                kd0Var2.G = false;
                break;
            case 16:
                ((EditText) this.b).removeTextChangedListener((org.telegram.ui.Components.qn) this.c);
                break;
            case 17:
                ie0 ie0Var = (ie0) this.b;
                Runnable runnable2 = (Runnable) this.c;
                fe0 fe0Var = ie0Var.a;
                int i16 = 0;
                while (true) {
                    gs[] gsVarArr = fe0Var.f;
                    if (i16 >= gsVarArr.length) {
                        runnable2.run();
                        fe0Var.e = false;
                        break;
                    } else {
                        gsVarArr[i16].l(0.0f);
                        i16++;
                    }
                }
            case 18:
                re0 re0Var = (re0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                yg0 yg0Var = re0Var.y;
                yg0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(re0Var.a);
                yg0Var.o1((TLRPC.TL_auth_authorization) tLObject3, false);
                break;
            case 19:
                re0 re0Var2 = (re0) this.b;
                String str3 = (String) this.c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = re0Var2.n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                byte[] x10 = z10 ? SRPHelper.getX(AndroidUtilities.getStringBytes(str3), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
                pe0 pe0Var = new pe0(re0Var2, 2);
                if (z10) {
                    TL_account.Password password2 = re0Var2.n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x10, password2.srp_id, password2.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                        tL_error2.text = "PASSWORD_HASH_INVALID";
                        pe0Var.run(null, tL_error2);
                        break;
                    } else {
                        TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                        tL_auth_checkPassword.password = startCheck;
                        i10 = ((org.telegram.ui.ActionBar.n2) re0Var2.y).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, pe0Var, 10);
                        break;
                    }
                }
                break;
            case 20:
                jf0 jf0Var = (jf0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                jf0Var.O.k1(false, false);
                AndroidUtilities.hideKeyboard(jf0Var.O.fragmentView.findFocus());
                jf0Var.O.o1((TLRPC.TL_auth_authorization) tLObject4, true);
                TLRPC.FileLocation fileLocation = jf0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new r80(i12, jf0Var, fileLocation));
                    break;
                }
                break;
            case 21:
                jf0 jf0Var2 = (jf0) this.b;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.c;
                i11 = ((org.telegram.ui.ActionBar.n2) jf0Var2.O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar(fileLocation2);
                break;
            case 22:
                kf0 kf0Var = (kf0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                yg0 yg0Var2 = kf0Var.E;
                yg0Var2.k1(false, true);
                if (tL_error3 == null) {
                    if (kf0Var.r != null && kf0Var.s != null && kf0Var.v != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", kf0Var.r);
                        bundle2.putString("phoneHash", kf0Var.s);
                        bundle2.putString("code", kf0Var.v);
                        yg0Var2.u1(5, true, bundle2, false);
                        break;
                    } else {
                        yg0Var2.u1(0, true, null, true);
                        break;
                    }
                } else if (tL_error3.text.equals("2FA_RECENT_CONFIRM")) {
                    yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    break;
                } else {
                    yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                    break;
                }
                break;
            case 23:
                bg0 bg0Var = (bg0) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.c);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.rk.h(new StringBuilder("+"), bg0Var.b, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.a.setOnDismissListener(new xf0(bg0Var, i13));
                alertDialog$Builder.o();
                break;
            case 24:
                bg0 bg0Var2 = (bg0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                bg0Var2.getClass();
                bg0Var2.e0 = tL_error4.text;
                break;
            case 25:
                ((bg0) this.b).s0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.c), false);
                break;
            case 26:
                bg0 bg0Var3 = (bg0) this.b;
                Runnable runnable3 = (Runnable) this.c;
                ds dsVar = bg0Var3.f;
                int i17 = 0;
                while (true) {
                    gs[] gsVarArr2 = dsVar.f;
                    if (i17 >= gsVarArr2.length) {
                        runnable3.run();
                        dsVar.e = false;
                        break;
                    } else {
                        gsVarArr2[i17].l(0.0f);
                        i17++;
                    }
                }
            case 27:
                ((s3) this.b).run((String) this.c);
                break;
            case 28:
                ai0 ai0Var = (ai0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                ai0Var.c0 = false;
                if (tL_error5 == null) {
                    rh0 f02 = ai0Var.f0();
                    ai0Var.j0.clear();
                    ai0Var.h0(f02);
                    break;
                }
                break;
            default:
                qh0 qh0Var = (qh0) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                ai0 ai0Var2 = qh0Var.a;
                rh0 f03 = ai0Var2.f0();
                ai0Var2.i0.add(0, (TLRPC.TL_chatInviteExported) tLObject5);
                TLRPC.ChatFull chatFull = ai0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    ai0Var2.getMessagesStorage().saveChatLinksCount(ai0Var2.n, ai0Var2.d.invitesCount);
                }
                ai0Var2.h0(f03);
                break;
        }
    }
}
