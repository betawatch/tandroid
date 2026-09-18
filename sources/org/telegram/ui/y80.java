package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import java.nio.ByteBuffer;
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
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y80(int i10, Object obj, Object obj2) {
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
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                TLObject tLObject = (TLObject) this.c;
                Pattern pattern = LaunchActivity.B1;
                if (!(tLObject instanceof TL_account.resolvedBusinessChatLinks)) {
                    launchActivity.B0(org.telegram.ui.Components.e5.N(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                    break;
                } else {
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
                }
                break;
            case 1:
                LaunchActivity launchActivity2 = (LaunchActivity) this.b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.c;
                Pattern pattern2 = LaunchActivity.B1;
                MessagesController.getInstance(launchActivity2.O).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.O);
                long j3 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j3, j3, tL_chatInviteJoinResultWebView.query_id);
                break;
            case 2:
                h hVar = (h) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                Pattern pattern3 = LaunchActivity.B1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.l(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(tL_error.text);
                org.telegram.ui.Components.e5.u0(hVar, string, sb2.toString(), null);
                break;
            case 3:
                LaunchActivity launchActivity3 = (LaunchActivity) this.b;
                String str = (String) this.c;
                if (!launchActivity3.q0.getFragmentStack().isEmpty()) {
                    launchActivity3.q0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str).getQueryParameter("ref")));
                    break;
                }
                break;
            case 4:
                LaunchActivity launchActivity4 = (LaunchActivity) this.b;
                TL_account.Password password = (TL_account.Password) this.c;
                Pattern pattern4 = LaunchActivity.B1;
                launchActivity4.j0(password);
                break;
            case 5:
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
            case 6:
                LaunchActivity launchActivity6 = (LaunchActivity) this.b;
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) this.c;
                if (!launchActivity6.Q && LaunchActivity.E1) {
                    qcVar.j();
                    break;
                }
                break;
            case 7:
                LaunchActivity launchActivity7 = (LaunchActivity) this.b;
                vd1 vd1Var = (vd1) this.c;
                Pattern pattern5 = LaunchActivity.B1;
                launchActivity7.p0(vd1Var);
                break;
            case 8:
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
            case 9:
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
            case 10:
                gc0 gc0Var = (gc0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                gc0Var.a();
                if (tLObject2 != null) {
                    gc0Var.a.j0((TL_account.Password) tLObject2);
                    break;
                }
                break;
            case 11:
                ((FiltersSetupActivity) this.c).X(((gc0) this.b).a.O());
                break;
            case 12:
                jd0 jd0Var = (jd0) this.b;
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
                    AndroidUtilities.runOnUIThread(new vq(jd0Var, createBitmap2, gLSurfaceView, 21));
                    break;
                }
                break;
            case 13:
                jd0 jd0Var2 = (jd0) this.b;
                LocationController.SharingLocationInfo sharingLocationInfo = (LocationController.SharingLocationInfo) this.c;
                jd0Var2.c.setImageResource(R.drawable.msg_location_alert2);
                jd0Var2.e0(sharingLocationInfo.proximityMeters);
                jd0Var2.G = false;
                break;
            case 14:
                ((EditText) this.b).removeTextChangedListener((org.telegram.ui.Components.qn) this.c);
                break;
            case 15:
                he0 he0Var = (he0) this.b;
                Runnable runnable2 = (Runnable) this.c;
                ee0 ee0Var = he0Var.a;
                int i13 = 0;
                while (true) {
                    gs[] gsVarArr = ee0Var.f;
                    if (i13 >= gsVarArr.length) {
                        runnable2.run();
                        ee0Var.e = false;
                        break;
                    } else {
                        gsVarArr[i13].l(0.0f);
                        i13++;
                    }
                }
            case 16:
                qe0 qe0Var = (qe0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                xg0 xg0Var = qe0Var.y;
                xg0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(qe0Var.a);
                xg0Var.o1((TLRPC.TL_auth_authorization) tLObject3, false);
                break;
            case 17:
                qe0 qe0Var2 = (qe0) this.b;
                String str2 = (String) this.c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = qe0Var2.n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                byte[] x10 = z10 ? SRPHelper.getX(AndroidUtilities.getStringBytes(str2), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
                oe0 oe0Var = new oe0(qe0Var2, 2);
                if (z10) {
                    TL_account.Password password2 = qe0Var2.n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x10, password2.srp_id, password2.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck != null) {
                        TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                        tL_auth_checkPassword.password = startCheck;
                        i10 = ((org.telegram.ui.ActionBar.n2) qe0Var2.y).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, oe0Var, 10);
                        break;
                    } else {
                        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                        tL_error2.text = "PASSWORD_HASH_INVALID";
                        oe0Var.run(null, tL_error2);
                        break;
                    }
                }
                break;
            case 18:
                if0 if0Var = (if0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                if0Var.O.k1(false, false);
                AndroidUtilities.hideKeyboard(if0Var.O.fragmentView.findFocus());
                if0Var.O.o1((TLRPC.TL_auth_authorization) tLObject4, true);
                TLRPC.FileLocation fileLocation = if0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new y80(19, if0Var, fileLocation));
                    break;
                }
                break;
            case 19:
                if0 if0Var2 = (if0) this.b;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.c;
                i11 = ((org.telegram.ui.ActionBar.n2) if0Var2.O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar(fileLocation2);
                break;
            case 20:
                jf0 jf0Var = (jf0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                xg0 xg0Var2 = jf0Var.E;
                xg0Var2.k1(false, true);
                if (tL_error3 != null) {
                    if (!tL_error3.text.equals("2FA_RECENT_CONFIRM")) {
                        xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                        break;
                    } else {
                        xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                        break;
                    }
                } else if (jf0Var.r != null && jf0Var.s != null && jf0Var.v != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("phoneFormated", jf0Var.r);
                    bundle2.putString("phoneHash", jf0Var.s);
                    bundle2.putString("code", jf0Var.v);
                    xg0Var2.u1(5, true, bundle2, false);
                    break;
                } else {
                    xg0Var2.u1(0, true, null, true);
                    break;
                }
            case 21:
                ag0 ag0Var = (ag0) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.c);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.wh.g(new StringBuilder("+"), ag0Var.b, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.a.setOnDismissListener(new wf0(ag0Var, i12));
                alertDialog$Builder.o();
                break;
            case 22:
                ag0 ag0Var2 = (ag0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                ag0Var2.getClass();
                ag0Var2.e0 = tL_error4.text;
                break;
            case 23:
                ((ag0) this.b).s0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.c), false);
                break;
            case 24:
                ag0 ag0Var3 = (ag0) this.b;
                Runnable runnable3 = (Runnable) this.c;
                ds dsVar = ag0Var3.f;
                int i14 = 0;
                while (true) {
                    gs[] gsVarArr2 = dsVar.f;
                    if (i14 >= gsVarArr2.length) {
                        runnable3.run();
                        dsVar.e = false;
                        break;
                    } else {
                        gsVarArr2[i14].l(0.0f);
                        i14++;
                    }
                }
            case 25:
                ((s3) this.b).run((String) this.c);
                break;
            case 26:
                zh0 zh0Var = (zh0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                zh0Var.c0 = false;
                if (tL_error5 == null) {
                    qh0 f02 = zh0Var.f0();
                    zh0Var.j0.clear();
                    zh0Var.h0(f02);
                    break;
                }
                break;
            case 27:
                ph0 ph0Var = (ph0) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                zh0 zh0Var2 = ph0Var.a;
                qh0 f03 = zh0Var2.f0();
                zh0Var2.i0.add(0, (TLRPC.TL_chatInviteExported) tLObject5);
                TLRPC.ChatFull chatFull = zh0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    zh0Var2.getMessagesStorage().saveChatLinksCount(zh0Var2.n, zh0Var2.d.invitesCount);
                }
                zh0Var2.h0(f03);
                break;
            case 28:
                kj0 kj0Var = (kj0) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (kj0Var.getParentActivity() != null) {
                    Toast.makeText(kj0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    break;
                }
                break;
            default:
                ek0 ek0Var = (ek0) this.b;
                String str3 = (String) this.c;
                ek0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str3));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                ek0Var.getContext().startActivity(intent);
                break;
        }
    }
}
