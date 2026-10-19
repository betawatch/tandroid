package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class z70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z70(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12 = 0;
        switch (this.a) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.b;
                String str = (String) this.c;
                int i13 = 29;
                if (str.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new lt(i13, languageSelectActivity, new ArrayList()));
                    break;
                } else {
                    System.currentTimeMillis();
                    ArrayList arrayList = new ArrayList();
                    int size = languageSelectActivity.h.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.h.get(i14);
                        if (localeInfo.name.toLowerCase().startsWith(str) || localeInfo.nameEnglish.toLowerCase().startsWith(str)) {
                            arrayList.add(localeInfo);
                        }
                    }
                    int size2 = languageSelectActivity.f.size();
                    while (i12 < size2) {
                        LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity.f.get(i12);
                        if (localeInfo2.name.toLowerCase().startsWith(str) || localeInfo2.nameEnglish.toLowerCase().startsWith(str)) {
                            arrayList.add(localeInfo2);
                        }
                        i12++;
                    }
                    AndroidUtilities.runOnUIThread(new lt(i13, languageSelectActivity, arrayList));
                    break;
                }
                break;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                TLObject tLObject = (TLObject) this.c;
                Pattern pattern = LaunchActivity.C1;
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
                    qn qnVar = new qn(bundle);
                    qnVar.ia = resolvedbusinesschatlinks;
                    launchActivity.u0(qnVar, false, true);
                    break;
                } else {
                    launchActivity.F0(org.telegram.ui.Components.f5.M(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                    break;
                }
            case 2:
                LaunchActivity launchActivity2 = (LaunchActivity) this.b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.c;
                Pattern pattern2 = LaunchActivity.C1;
                MessagesController.getInstance(launchActivity2.O).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.O);
                long j10 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j10, j10, tL_chatInviteJoinResultWebView.query_id);
                break;
            case 3:
                h hVar = (h) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                Pattern pattern3 = LaunchActivity.C1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.n(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(tL_error.text);
                org.telegram.ui.Components.f5.t0(hVar, string, sb2.toString(), null);
                break;
            case 4:
                LaunchActivity launchActivity3 = (LaunchActivity) this.b;
                String str2 = (String) this.c;
                if (!launchActivity3.q0.getFragmentStack().isEmpty()) {
                    launchActivity3.q0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str2).getQueryParameter("ref")));
                    break;
                }
                break;
            case 5:
                LaunchActivity launchActivity4 = (LaunchActivity) this.b;
                TL_account.Password password = (TL_account.Password) this.c;
                Pattern pattern4 = LaunchActivity.C1;
                launchActivity4.k0(password);
                break;
            case 6:
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
            case 7:
                LaunchActivity launchActivity6 = (LaunchActivity) this.b;
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) this.c;
                if (!launchActivity6.Q && LaunchActivity.F1) {
                    qcVar.j();
                    break;
                }
                break;
            case 8:
                LaunchActivity launchActivity7 = (LaunchActivity) this.b;
                kc1 kc1Var = (kc1) this.c;
                Pattern pattern5 = LaunchActivity.C1;
                launchActivity7.t0(kc1Var);
                break;
            case 9:
                LaunchActivity launchActivity8 = (LaunchActivity) this.b;
                pf.c cVar = (pf.c) this.c;
                launchActivity8.P0 = null;
                launchActivity8.Q0 = null;
                launchActivity8.R0 = null;
                launchActivity8.S0 = null;
                launchActivity8.V0 = null;
                launchActivity8.T0 = null;
                if (cVar != null) {
                    cVar.b();
                    break;
                }
                break;
            case 10:
                pf.c cVar2 = (pf.c) this.b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.c;
                Pattern pattern6 = LaunchActivity.C1;
                if (cVar2 != null) {
                    cVar2.b();
                }
                if (b2Var != null) {
                    b2Var.dismiss();
                    break;
                }
                break;
            case 11:
                ib0 ib0Var = (ib0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ib0Var.c();
                if (tLObject2 != null) {
                    ib0Var.a.k0((TL_account.Password) tLObject2);
                    break;
                }
                break;
            case 12:
                ((FiltersSetupActivity) this.c).X(((ib0) this.b).a.O());
                break;
            case 13:
                nc0 nc0Var = (nc0) this.b;
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
                    AndroidUtilities.runOnUIThread(new jq(nc0Var, createBitmap2, gLSurfaceView, 22));
                    break;
                }
                break;
            case 14:
                nc0 nc0Var2 = (nc0) this.b;
                LocationController.SharingLocationInfo sharingLocationInfo = (LocationController.SharingLocationInfo) this.c;
                nc0Var2.c.setImageResource(R.drawable.msg_location_alert2);
                nc0Var2.d0(sharingLocationInfo.proximityMeters);
                nc0Var2.G = false;
                break;
            case 15:
                ((EditText) this.b).removeTextChangedListener((org.telegram.ui.Components.ao) this.c);
                break;
            case 16:
                md0 md0Var = (md0) this.b;
                Runnable runnable2 = (Runnable) this.c;
                id0 id0Var = md0Var.a;
                int i15 = 0;
                while (true) {
                    tr[] trVarArr = id0Var.f;
                    if (i15 >= trVarArr.length) {
                        runnable2.run();
                        id0Var.e = false;
                        break;
                    } else {
                        trVarArr[i15].l(0.0f);
                        i15++;
                    }
                }
            case 17:
                vd0 vd0Var = (vd0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                dg0 dg0Var = vd0Var.y;
                dg0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(vd0Var.a);
                dg0Var.o1((TLRPC.TL_auth_authorization) tLObject3, false);
                break;
            case 18:
                vd0 vd0Var2 = (vd0) this.b;
                String str3 = (String) this.c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = vd0Var2.n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                byte[] x10 = z10 ? SRPHelper.getX(AndroidUtilities.getStringBytes(str3), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
                td0 td0Var = new td0(vd0Var2, 2);
                if (z10) {
                    TL_account.Password password2 = vd0Var2.n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x10, password2.srp_id, password2.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                        tL_error2.text = "PASSWORD_HASH_INVALID";
                        td0Var.run(null, tL_error2);
                        break;
                    } else {
                        TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                        tL_auth_checkPassword.password = startCheck;
                        i10 = ((org.telegram.ui.ActionBar.n2) vd0Var2.y).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, td0Var, 10);
                        break;
                    }
                }
                break;
            case 19:
                ne0 ne0Var = (ne0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                ne0Var.O.k1(false, false);
                AndroidUtilities.hideKeyboard(ne0Var.O.fragmentView.findFocus());
                ne0Var.O.o1((TLRPC.TL_auth_authorization) tLObject4, true);
                TLRPC.FileLocation fileLocation = ne0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new z70(20, ne0Var, fileLocation));
                    break;
                }
                break;
            case 20:
                ne0 ne0Var2 = (ne0) this.b;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.c;
                i11 = ((org.telegram.ui.ActionBar.n2) ne0Var2.O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar(fileLocation2);
                break;
            case 21:
                oe0 oe0Var = (oe0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                dg0 dg0Var2 = oe0Var.E;
                dg0Var2.k1(false, true);
                if (tL_error3 == null) {
                    if (oe0Var.r != null && oe0Var.s != null && oe0Var.v != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", oe0Var.r);
                        bundle2.putString("phoneHash", oe0Var.s);
                        bundle2.putString("code", oe0Var.v);
                        dg0Var2.u1(5, true, bundle2, false);
                        break;
                    } else {
                        dg0Var2.u1(0, true, null, true);
                        break;
                    }
                } else if (tL_error3.text.equals("2FA_RECENT_CONFIRM")) {
                    dg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    break;
                } else {
                    dg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                    break;
                }
                break;
            case 22:
                hf0 hf0Var = (hf0) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.c);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.kk.g(new StringBuilder("+"), hf0Var.b, jf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.a.setOnDismissListener(new bf0(hf0Var, i12));
                alertDialog$Builder.o();
                break;
            case 23:
                hf0 hf0Var2 = (hf0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                hf0Var2.getClass();
                hf0Var2.e0 = tL_error4.text;
                break;
            case 24:
                ((hf0) this.b).s0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.c), false);
                break;
            case 25:
                hf0 hf0Var3 = (hf0) this.b;
                Runnable runnable3 = (Runnable) this.c;
                qr qrVar = hf0Var3.f;
                int i16 = 0;
                while (true) {
                    tr[] trVarArr2 = qrVar.f;
                    if (i16 >= trVarArr2.length) {
                        runnable3.run();
                        qrVar.e = false;
                        break;
                    } else {
                        trVarArr2[i16].l(0.0f);
                        i16++;
                    }
                }
            case 26:
                ((v3) this.b).run((String) this.c);
                break;
            case 27:
                cg0 cg0Var = (cg0) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                dg0 dg0Var3 = cg0Var.V;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (!globalMainSettings.getBoolean("firstloginshow", true) && !dg0Var3.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    dg0Var3.getParentActivity().requestPermissions((String[]) arrayList2.toArray(new String[0]), 7);
                    break;
                } else {
                    globalMainSettings.edit().putBoolean("firstloginshow", false).commit();
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dg0Var3.getParentActivity());
                    alertDialog$Builder2.m(R.raw.incoming_calls, 46, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
                    alertDialog$Builder2.k(LocaleController.getString("Continue", R.string.Continue), null);
                    String string2 = LocaleController.getString("AllowFillNumber", R.string.AllowFillNumber);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                    b2Var2.T = string2;
                    dg0Var3.n = dg0Var3.showDialog(b2Var2, true, null);
                    dg0Var3.c0 = true;
                    break;
                }
                break;
            case 28:
                gg0.V((gg0) this.b, (org.telegram.ui.ActionBar.b2) this.c);
                break;
            default:
                ih0 ih0Var = (ih0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                ih0Var.c0 = false;
                if (tL_error5 == null) {
                    zg0 f02 = ih0Var.f0();
                    ih0Var.j0.clear();
                    ih0Var.h0(f02);
                    break;
                }
                break;
        }
    }
}
