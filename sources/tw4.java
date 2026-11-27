// default package

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Base64;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.p;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class tw4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ tw4(KeyEvent.Callback callback, TLObject tLObject, Object obj, TLRPC.TL_error tL_error, TLObject tLObject2, byte b) {
        this.a = b;
        this.b = callback;
        this.c = tLObject;
        this.d = obj;
        this.f = tL_error;
        this.e = tLObject2;
    }

    private final void a() {
        uc7 uc7Var = (uc7) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
        TLObject tLObject = (TLObject) this.c;
        Long l = (Long) this.d;
        cz3 cz3Var = (cz3) this.e;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            uc7Var.j4(tL_channels_channelParticipants.users, false);
            uc7Var.c4(tL_channels_channelParticipants.chats, false);
            uc7Var.getMessagesStorage().j1(tL_channels_channelParticipants.users, tL_channels_channelParticipants.chats, true, true);
            jf7 messagesStorage = uc7Var.getMessagesStorage();
            messagesStorage.a.c(new se7(messagesStorage, l.longValue(), (ArrayList) tL_channels_channelParticipants.participants, (byte) 7));
            uc7Var.o1.add(l);
        }
        uc7Var.n1.remove(l);
        if (cz3Var != null) {
            cz3Var.a(tLObject instanceof TLRPC.TL_channels_channelParticipants ? (TLRPC.TL_channels_channelParticipants) tLObject : null);
        }
    }

    private final void b() {
        long j;
        jf7 jf7Var = (jf7) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = (ArrayList) this.e;
        zh6 zh6Var = (zh6) this.f;
        jf7Var.getMessagesController().j4(arrayList, true);
        jf7Var.getMessagesController().c4(arrayList2, true);
        jf7Var.getMessagesController().g4(arrayList3);
        for (int i = 0; i < zh6Var.m(); i++) {
            long j2 = zh6Var.j(i);
            ff7 ff7Var = (ff7) zh6Var.n(i);
            if (jf7Var.getMessagesController().v2(j2) || jf7Var.r0(8, j2) || jf7Var.getMessagesController().C2(j2)) {
                uc7 messagesController = jf7Var.getMessagesController();
                j = j2;
                jf7 messagesStorage = messagesController.getMessagesStorage();
                messagesStorage.a.c(new ue2((Object) messagesStorage, j, (Object) new y97(messagesController, j), (byte) 5));
            } else {
                j = j2;
            }
            int i2 = ff7Var.a;
            jf7Var.getMessagesController().r3(j, i2, i2, ff7Var.b, false, 0L, ff7Var.c, true, 0);
        }
    }

    private final void c() {
        ((jf7) this.b).R1(null, (LongSparseIntArray) this.c, (LongSparseIntArray) this.d, (zh6) this.e, (LongSparseIntArray) this.f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:241:0x064e, code lost:
    
        if ("THEME_FORMAT_INVALID".equals(r0.text) != false) goto L195;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:353:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        k35 k35Var;
        String h;
        byte[] bArr;
        TLRPC.GroupCall groupCall;
        byte b;
        byte b2;
        byte b3;
        lm lmVar;
        lm lmVar2;
        TLRPC.TL_wallPaper tL_wallPaper;
        p pVar;
        d31 d;
        int i;
        int i2;
        int i3;
        int i4;
        char c;
        char c2;
        byte b4 = 5;
        byte b5 = 2;
        String str2 = null;
        final byte b6 = 0;
        r14 = 0;
        byte b7 = 0;
        final byte b8 = 1;
        switch (this.a) {
            case 0:
                bx4 bx4Var = (bx4) this.b;
                TLObject tLObject = (TLObject) this.c;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.d;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                ex0 ex0Var = bx4Var.c;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    v21 Q = new d31(ex0Var, bx4Var.J0).Q(R.raw.contact_check, 36, ob6.M0(2131746585, null));
                    Q.j = 5000;
                    Q.j();
                    return;
                }
                if (userFull != null) {
                    int i5 = userFull.flags2;
                    if (tL_birthday == null) {
                        userFull.flags2 = i5 & (-33);
                    } else {
                        userFull.flags2 = i5 | 32;
                    }
                    userFull.birthday = tL_birthday;
                    jf7.Y(bx4Var.a).g2(userFull, false);
                }
                if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
                    bs2.v(null, 2131743534, new d31(ex0Var, bx4Var.J0), R.raw.error, 36);
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bx4Var.J0, bx4Var.getContext());
                    alertDialog$Builder.a.S = ob6.M0(2131746581, null);
                    alertDialog$Builder.a.U = ob6.M0(2131746582, null);
                    c00.u(null, 2131747558, alertDialog$Builder, null);
                }
                bx4Var.i2.O(true);
                return;
            case 1:
                c cVar = (c) this.b;
                c35 c35Var = (c35) this.c;
                id idVar = (id) this.d;
                j25 j25Var = (j25) this.e;
                String str3 = (String) this.f;
                try {
                    idVar.dismiss();
                    if (c35Var != null && !c35Var.d()) {
                        TL_wallet.WalletState walletState = cVar.e;
                        if ((walletState instanceof TL_wallet.TL_walletState) && (k35Var = cVar.c) != null && !k35Var.f(((TL_wallet.TL_walletState) walletState).public_key)) {
                            cVar.c.q(yac.h(cVar.a).e(), ((TL_wallet.TL_walletState) cVar.e).public_key, c35Var, null);
                        }
                    }
                    j25Var.a(c35Var, str3);
                    if (c35Var != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (c35Var != null) {
                        c35Var.close();
                    }
                }
            case 2:
                c35 c35Var2 = (c35) this.b;
                w45 w45Var = (w45) this.c;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.d;
                v35 v35Var = (v35) this.e;
                s45 s45Var = (s45) this.f;
                try {
                    bArr = Base64.decode(WalletEngine2.tonConnectCrypto(c35Var2, w45Var.a, w45Var.h, w45Var.g, new JSONObject().put("challenge", Base64.encodeToString(tonconnectchallenge.challenge, 2))).getString("challengeAnswer"), 2);
                    h = null;
                } catch (Exception e) {
                    h = a55.h("decrypt challenge", e);
                    bArr = null;
                }
                hl.c3(new ao1(bArr, v35Var, h, s45Var, (byte) 25));
                return;
            case 3:
                a55 a55Var = (a55) this.b;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.c;
                w45 w45Var2 = (w45) this.d;
                pcc pccVar = (pcc) this.e;
                c35 c35Var3 = (c35) this.f;
                try {
                    if (!uc7.s1(a55Var.a).X3.edit().putString(a55.k(w45Var2.a.id, w45Var2.b).concat(".transfer"), new JSONObject().put("boc", Base64.encodeToString(sendtransfer.data_normal, 2)).put("randomId", sendtransfer.random_id).toString()).commit()) {
                        throw new IllegalStateException("Could not save signed transfer");
                    }
                } catch (Exception e2) {
                    str2 = a55.h("save transfer", e2);
                }
                hl.c3(new z87((Object) a55Var, str2, (Object) pccVar, (Object) w45Var2, (Object) c35Var3, (Object) sendtransfer, (byte) 11));
                return;
            case 4:
                a55 a55Var2 = (a55) this.b;
                JSONObject jSONObject = (JSONObject) this.c;
                pcc pccVar2 = (pcc) this.d;
                String str4 = (String) this.e;
                w45 w45Var3 = (w45) this.f;
                if (jSONObject == null) {
                    pccVar2.a(str4);
                    return;
                } else {
                    a55Var2.E(w45Var3.a.id, w45Var3.b, jSONObject, pccVar2);
                    return;
                }
            case 5:
                j95 j95Var = (j95) this.b;
                id idVar2 = (id) this.d;
                TLObject tLObject2 = (TLObject) this.c;
                TL_phone.exportGroupCallInvite exportgroupcallinvite = (TL_phone.exportGroupCallInvite) this.e;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f;
                idVar2.dismiss();
                if (!(tLObject2 instanceof TL_phone.exportedGroupCallInvite)) {
                    if (tL_error2 != null) {
                        new d31(j95Var.F, new w53()).g0(tL_error2, false);
                        return;
                    }
                    return;
                }
                Context context = j95Var.getContext();
                int i6 = j95Var.a;
                TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
                String str5 = ((TL_phone.exportedGroupCallInvite) tLObject2).link;
                vnb vnbVar = j95Var.J0;
                vc2 vc2Var = j95Var.T2;
                i91.l0(context, i6, inputGroupCall, str5, vnbVar, false, (vc2Var == null || (groupCall = vc2Var.b) == null || !groupCall.creator) ? false : true);
                return;
            case 6:
                j95 j95Var2 = (j95) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                String str6 = (String) this.f;
                j95Var2.getClass();
                e S = LaunchActivity.S();
                if (S != null) {
                    l46 l46Var = new l46(34, j95Var2.a, new w53(), S.getContext(), S);
                    l46Var.u1(null, arrayList, arrayList2, arrayList3, str6);
                    l46Var.show();
                    return;
                }
                return;
            case 7:
                pa5 pa5Var = (pa5) this.b;
                zc zcVar = (zc) this.c;
                WindowManager windowManager = (WindowManager) this.d;
                FrameLayout frameLayout = (FrameLayout) this.e;
                z71 z71Var = (z71) this.f;
                pa5Var.setVisibility(8);
                zcVar.setVisibility(8);
                windowManager.removeView(pa5Var);
                windowManager.removeView(zcVar);
                windowManager.removeView(frameLayout);
                windowManager.removeView(z71Var);
                return;
            case 8:
                wm5 wm5Var = (wm5) this.b;
                Drawable drawable = (Drawable) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                ArrayList arrayList5 = (ArrayList) this.e;
                String str7 = (String) this.f;
                if (drawable instanceof lm) {
                    lm lmVar3 = (lm) drawable;
                    if (!lmVar3.o0) {
                        int i7 = 0;
                        byte b9 = 0;
                        while (i7 < arrayList4.size()) {
                            ImageReceiver imageReceiver = (ImageReceiver) arrayList4.get(i7);
                            if (i7 == 0) {
                                lmVar2 = lmVar3;
                                b = b9;
                                b2 = b6;
                                b3 = b8;
                            } else {
                                AnimatedFileDrawableStream animatedFileDrawableStream = lmVar3.v0;
                                if (animatedFileDrawableStream != null) {
                                    File file = lmVar3.H;
                                    long j = lmVar3.I;
                                    boolean z = lmVar3.J;
                                    TLRPC.Document document = animatedFileDrawableStream.c;
                                    jn5 jn5Var = animatedFileDrawableStream.d;
                                    b2 = b6;
                                    b3 = b8;
                                    long j2 = lmVar3.N;
                                    int i8 = lmVar3.K;
                                    b = b9;
                                    AnimatedFileDrawableStream animatedFileDrawableStream2 = lmVar3.v0;
                                    lmVar = new lm(file, false, j, z ? 1 : 0, document, jn5Var, document, j2, i8, (animatedFileDrawableStream2 == null || !animatedFileDrawableStream2.w) ? b2 : b3);
                                } else {
                                    b = b9;
                                    b2 = b6;
                                    b3 = b8;
                                    lmVar = new lm(lmVar3.H, false, lmVar3.I, lmVar3.J ? 1 : 0, lmVar3.p0, null, null, lmVar3.N, lmVar3.K, false);
                                }
                                int[] iArr = lmVar.d;
                                int[] iArr2 = lmVar3.d;
                                iArr[b2] = iArr2[b2];
                                iArr[b3] = iArr2[b3];
                                lmVar2 = lmVar;
                            }
                            lm lmVar4 = lmVar2;
                            if (imageReceiver.h0(lmVar2, wm5Var.d, wm5Var.m, false, ((Integer) arrayList5.get(i7)).intValue())) {
                                if (lmVar4 == lmVar3) {
                                    b9 = b3;
                                    i7++;
                                    b8 = b3;
                                    b6 = b2;
                                }
                            } else if (lmVar4 != lmVar3) {
                                lmVar4.u();
                            }
                            b9 = b;
                            i7++;
                            b8 = b3;
                            b6 = b2;
                        }
                        if (b9 == 0) {
                            lmVar3.u();
                        }
                        if (str7 == null) {
                            wm5Var.A.l(str7);
                            return;
                        }
                        return;
                    }
                }
                for (int i9 = 0; i9 < arrayList4.size(); i9++) {
                    ((ImageReceiver) arrayList4.get(i9)).h0(drawable, wm5Var.d, ((Integer) wm5Var.z.get(i9)).intValue(), false, ((Integer) arrayList5.get(i9)).intValue());
                }
                if (str7 == null) {
                }
                break;
            case 9:
                hn5 hn5Var = (hn5) this.b;
                String str8 = (String) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                BitmapDrawable bitmapDrawable = (BitmapDrawable) this.e;
                ArrayList arrayList7 = (ArrayList) this.f;
                hn5Var.a();
                gn5 gn5Var = hn5Var.c;
                if (gn5Var.b != null) {
                    StringBuilder l = c00.l(str8, "@");
                    l.append(gn5Var.b);
                    str8 = l.toString();
                }
                String str9 = str8;
                for (int i10 = 0; i10 < arrayList6.size(); i10++) {
                    ((ImageReceiver) arrayList6.get(i10)).h0(bitmapDrawable, str9, 0, false, ((Integer) arrayList7.get(i10)).intValue());
                }
                if (str9.contains("nocache")) {
                    return;
                }
                hn5Var.d.c.l(str9, bitmapDrawable);
                return;
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                tg5 tg5Var = (tg5) this.d;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) this.e;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f;
                String str10 = LaunchActivity.C1;
                try {
                    tg5Var.run();
                } catch (Exception e3) {
                    cc4.g(e3, true);
                }
                if (!(tLObject3 instanceof TLRPC.TL_wallPaper)) {
                    launchActivity.F0(jj.K(launchActivity, null, ob6.M0(2131751070, null) + "\n" + tL_error3.text));
                    return;
                }
                TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) tLObject3;
                if (tL_wallPaper3.pattern) {
                    String str11 = tL_wallPaper3.slug;
                    TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper2.settings;
                    yvc yvcVar = new yvc(str11, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, hl.q1(wallPaperSettings.rotation, false), r2.intensity / 100.0f, tL_wallPaper2.settings.motion);
                    yvcVar.g = tL_wallPaper3;
                    tL_wallPaper3 = yvcVar;
                }
                pqb pqbVar = new pqb(tL_wallPaper3, null, true);
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper2.settings;
                boolean z2 = wallPaperSettings2.blur;
                boolean z3 = wallPaperSettings2.motion;
                float f = wallPaperSettings2.intensity;
                pqbVar.H1 = z2;
                pqbVar.G1 = z3;
                pqbVar.p1 = f;
                launchActivity.t0(pqbVar);
                return;
            case 11:
                LaunchActivity launchActivity2 = (LaunchActivity) this.b;
                uj3 uj3Var = (uj3) this.c;
                e eVar = (e) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                String str12 = (String) this.f;
                String str13 = LaunchActivity.C1;
                ArrayList arrayList8 = launchActivity2.D0;
                if (uj3Var == null) {
                    if (eVar instanceof zu1) {
                        ((zu1) eVar).ma(user.id, str12, true);
                        return;
                    }
                    return;
                }
                if (eVar != null) {
                    eVar.dismissCurrentDialog();
                }
                for (int i11 = 0; i11 < arrayList8.size(); i11++) {
                    if (((Dialog) arrayList8.get(i11)).isShowing()) {
                        ((Dialog) arrayList8.get(i11)).dismiss();
                    }
                }
                arrayList8.clear();
                launchActivity2.t0(uj3Var);
                return;
            case 12:
                LaunchActivity launchActivity3 = (LaunchActivity) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.d;
                String str14 = (String) this.e;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f;
                e S2 = LaunchActivity.S();
                if (tLObject4 == null) {
                    if (tL_error4 != null) {
                        if ("URL_EXPIRED".equalsIgnoreCase(tL_error4.text)) {
                            uq7.a().I(R.raw.error, ob6.M0(2131753121, null), ob6.M0(2131753122, null)).j();
                            return;
                        } else {
                            uq7.a().g0(tL_error4, false);
                            return;
                        }
                    }
                    return;
                }
                if (tLObject4 instanceof TLRPC.TL_urlAuthResultRequest) {
                    uq7.b(false, launchActivity3.P, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject4, null, null, null, false, null);
                    return;
                } else if (tLObject4 instanceof TLRPC.TL_urlAuthResultAccepted) {
                    uq7.b(false, launchActivity3.P, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject4, null, null, null, false, null);
                    return;
                } else {
                    if (tLObject4 instanceof TLRPC.TL_urlAuthResultDefault) {
                        jj.n0(S2, str14, false, true);
                        return;
                    }
                    return;
                }
            case 13:
                LaunchActivity launchActivity4 = (LaunchActivity) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                id idVar3 = (id) this.d;
                tg5 tg5Var2 = (tg5) this.e;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.f;
                String str15 = LaunchActivity.C1;
                if (tLObject5 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) tLObject5;
                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.size() > 0 ? tL_theme.settings.get(0) : null;
                    if (themeSettings != null) {
                        znb O0 = aob.O0(aob.q0(themeSettings));
                        if (O0 != null) {
                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                TLRPC.TL_wallPaper tL_wallPaper4 = (TLRPC.TL_wallPaper) wallPaper;
                                xb4.G(launchActivity4.P);
                                if (!xb4.J(tL_wallPaper4.document, null, true, true).exists()) {
                                    launchActivity4.V0 = idVar3;
                                    launchActivity4.U0 = true;
                                    launchActivity4.S0 = O0;
                                    launchActivity4.T0 = tL_theme;
                                    launchActivity4.R0 = tL_wallPaper4;
                                    launchActivity4.Q0 = xb4.r(null, tL_wallPaper4.document);
                                    xb4.G(launchActivity4.P).X(tL_wallPaper4.document, tL_wallPaper4, 1, 1);
                                    return;
                                }
                                tL_wallPaper = tL_wallPaper4;
                            } else {
                                tL_wallPaper = null;
                            }
                            try {
                                tg5Var2.run();
                            } catch (Exception e4) {
                                cc4.g(e4, true);
                            }
                            launchActivity4.r0(tL_theme, tL_wallPaper, O0);
                        } else {
                            b7 = 1;
                        }
                    } else {
                        TLRPC.Document document2 = tL_theme.document;
                        if (document2 != null) {
                            launchActivity4.U0 = false;
                            launchActivity4.T0 = tL_theme;
                            launchActivity4.P0 = xb4.r(null, document2);
                            launchActivity4.V0 = idVar3;
                            xb4.G(launchActivity4.P).X(launchActivity4.T0.document, tL_theme, 1, 1);
                        }
                        b5 = 1;
                    }
                    b5 = b7;
                } else if (tL_error5 != null) {
                    break;
                }
                if (b5 != 0) {
                    try {
                        tg5Var2.run();
                    } catch (Exception e5) {
                        cc4.g(e5, true);
                    }
                    if (b5 == 1) {
                        launchActivity4.F0(jj.K(launchActivity4, ob6.M0(2131743843, null), ob6.M0(2131743826, null)));
                        return;
                    } else {
                        launchActivity4.F0(jj.K(launchActivity4, ob6.M0(2131743843, null), ob6.M0(2131743827, null)));
                        return;
                    }
                }
                return;
            case 14:
                e66 e66Var = (e66) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.f;
                TLObject tLObject6 = (TLObject) this.c;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) this.d;
                String str16 = (String) this.e;
                int i12 = e66Var.b;
                LaunchActivity launchActivity5 = e66Var.a;
                if (tL_error6 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error6.text)) {
                        d = e66.d();
                        i = 2131747122;
                    } else {
                        d = e66.d();
                        i = 2131747123;
                    }
                    xnb.x(null, i, d, null);
                } else if (!launchActivity5.isFinishing()) {
                    if (tLObject6 instanceof TLRPC.TL_payments_paymentFormStars) {
                        r4a r4aVar = launchActivity5.Y0;
                        launchActivity5.Y0 = null;
                        jxa.v(i12, false).X(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject6, new a66(e66Var, (byte) 1), new m06(r4aVar, b8));
                        return;
                    }
                    if (tLObject6 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject6;
                        uc7.s1(i12).j4(paymentForm.users, false);
                        pVar = new p(paymentForm, null, str16, LaunchActivity.S());
                    } else {
                        pVar = tLObject6 instanceof TLRPC.PaymentReceipt ? new p((TLRPC.PaymentReceipt) tLObject6) : null;
                    }
                    if (pVar != null) {
                        r4a r4aVar2 = launchActivity5.Y0;
                        if (r4aVar2 != null) {
                            launchActivity5.Y0 = null;
                            pVar.a1 = new n06(r4aVar2, b8);
                        }
                        e66Var.u(pVar, false);
                    }
                }
                e66Var.c();
                return;
            case 15:
                ((qh6) this.b).v1((TLRPC.TL_error) this.f, (String) this.c, (String) this.d, (String) this.e);
                return;
            case 16:
                df6 df6Var = (df6) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                Bundle bundle = (Bundle) this.d;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.f;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) this.e;
                qh6 qh6Var = df6Var.a0;
                if (tLObject7 instanceof TLRPC.TL_auth_sentCode) {
                    qh6Var.q1(bundle, (TLRPC.TL_auth_sentCode) tLObject7, true);
                    return;
                } else {
                    if (tL_error7 == null || tL_error7.text == null) {
                        return;
                    }
                    i2 = ((e) qh6Var).currentAccount;
                    jj.c0(i2, tL_error7, qh6Var, tL_auth_resendCode, new Object[0]);
                    return;
                }
            case 17:
                fg6 fg6Var = (fg6) this.b;
                TLObject tLObject8 = (TLObject) this.c;
                Bundle bundle2 = (Bundle) this.d;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.f;
                TL_account.sendVerifyEmailCode sendverifyemailcode = (TL_account.sendVerifyEmailCode) this.e;
                qh6 qh6Var2 = fg6Var.F;
                qh6Var2.y1(false, true);
                fg6Var.r = false;
                if (tLObject8 instanceof TL_account.sentEmailCode) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject8;
                    bundle2.putString("emailPattern", sentemailcode.email_pattern);
                    bundle2.putInt("length", sentemailcode.length);
                    qh6Var2.J1(13, true, bundle2, false);
                    return;
                }
                String str17 = tL_error8.text;
                if (str17 != null) {
                    if (str17.contains("EMAIL_INVALID")) {
                        fg6Var.n();
                        return;
                    }
                    if (tL_error8.text.contains("EMAIL_NOT_ALLOWED")) {
                        qh6Var2.z1(ob6.M0(2131745798, null), ob6.M0(2131751165, null));
                        return;
                    }
                    if (tL_error8.text.contains("PHONE_PASSWORD_FLOOD")) {
                        qh6Var2.z1(ob6.M0(2131745798, null), ob6.M0(2131750647, "FloodWait"));
                        return;
                    }
                    if (tL_error8.text.contains("PHONE_NUMBER_FLOOD")) {
                        qh6Var2.z1(ob6.M0(2131745798, null), ob6.M0(2131747013, "PhoneNumberFlood"));
                        return;
                    }
                    if (tL_error8.text.contains("PHONE_CODE_EMPTY") || tL_error8.text.contains("PHONE_CODE_INVALID")) {
                        qh6Var2.z1(ob6.M0(2131745798, null), ob6.M0(2131748937, "InvalidCode"));
                        return;
                    }
                    if (tL_error8.text.contains("PHONE_CODE_EXPIRED")) {
                        qh6Var2.J1(0, true, null, true);
                        qh6Var2.z1(ob6.M0(2131745798, null), ob6.M0(2131751986, "CodeExpired"));
                        return;
                    } else if (tL_error8.text.startsWith("FLOOD_WAIT")) {
                        qh6Var2.z1(ob6.M0(2131745798, null), ob6.M0(2131750647, "FloodWait"));
                        return;
                    } else {
                        if (tL_error8.code != -1000) {
                            i3 = ((e) qh6Var2).currentAccount;
                            jj.c0(i3, tL_error8, qh6Var2, sendverifyemailcode, fg6Var.x);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 18:
                fg6 fg6Var2 = (fg6) this.b;
                TLObject tLObject9 = (TLObject) this.c;
                Bundle bundle3 = (Bundle) this.d;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.f;
                TL_account.verifyEmail verifyemail = (TL_account.verifyEmail) this.e;
                qh6 qh6Var3 = fg6Var2.F;
                if ((tLObject9 instanceof TL_account.TL_emailVerified) && qh6Var3.G == 3) {
                    qh6Var3.finishFragment();
                    qh6Var3.e0.run();
                    return;
                }
                if (tLObject9 instanceof TL_account.TL_emailVerifiedLogin) {
                    TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject9;
                    bundle3.putString("email", tL_emailVerifiedLogin.email);
                    qh6Var3.q1(bundle3, tL_emailVerifiedLogin.sent_code, true);
                    return;
                } else {
                    if (tL_error9 != null) {
                        if (tL_error9.text.contains("EMAIL_NOT_ALLOWED")) {
                            qh6Var3.z1(ob6.M0(2131745798, null), ob6.M0(2131751165, null));
                            return;
                        }
                        if (tL_error9.text.contains("EMAIL_TOKEN_INVALID")) {
                            qh6Var3.z1(ob6.M0(2131745798, null), ob6.M0(2131751162, null));
                            return;
                        } else {
                            if (tL_error9.code != -1000) {
                                i4 = ((e) qh6Var3).currentAccount;
                                jj.c0(i4, tL_error9, qh6Var3, verifyemail, new Object[0]);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
            case 19:
                final zg6 zg6Var = (zg6) this.b;
                TLObject tLObject10 = (TLObject) this.c;
                TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = (TLRPC.TL_inputInvoicePremiumAuthCode) this.d;
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.e;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) this.f;
                qh6 qh6Var4 = zg6Var.w;
                zg6Var.b.setLoading(false);
                if (tLObject10 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject10;
                    qh6Var4.getMessagesController().j4(paymentForm2.users, false);
                    p pVar2 = new p(tL_inputInvoicePremiumAuthCode, paymentForm2, null, null, 4, null, null, null, null, null, null, false, null, qh6Var4, true);
                    pVar2.W0 = true;
                    pVar2.d1 = new pcc() { // from class: vg6
                        @Override // pcc
                        public final void a(Object obj) {
                            byte b10 = b6;
                            final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                            final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                            final zg6 zg6Var2 = zg6Var;
                            switch (b10) {
                                case 0:
                                    final byte b11 = 0;
                                    hl.c3(new Runnable() { // from class: wg6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b12 = b11;
                                            TLRPC.PaymentForm paymentForm4 = paymentForm3;
                                            TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                            zg6 zg6Var3 = zg6Var2;
                                            switch (b12) {
                                                case 0:
                                                    String str18 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str19 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j3 = paymentForm4.form_id;
                                                    if (!zg6Var3.f) {
                                                        zg6Var3.f = true;
                                                        zg6Var3.h = str18;
                                                        zg6Var3.n = str19;
                                                        zg6Var3.r = j3;
                                                        zg6Var3.b.setLoading(true);
                                                        zg6Var3.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    String str20 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str21 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j4 = paymentForm4.form_id;
                                                    if (!zg6Var3.f) {
                                                        zg6Var3.f = true;
                                                        zg6Var3.h = str20;
                                                        zg6Var3.n = str21;
                                                        zg6Var3.r = j4;
                                                        zg6Var3.b.setLoading(true);
                                                        zg6Var3.o();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final byte b12 = 1;
                                    hl.c3(new Runnable() { // from class: wg6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b122 = b12;
                                            TLRPC.PaymentForm paymentForm4 = paymentForm3;
                                            TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                            zg6 zg6Var3 = zg6Var2;
                                            switch (b122) {
                                                case 0:
                                                    String str18 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str19 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j3 = paymentForm4.form_id;
                                                    if (!zg6Var3.f) {
                                                        zg6Var3.f = true;
                                                        zg6Var3.h = str18;
                                                        zg6Var3.n = str19;
                                                        zg6Var3.r = j3;
                                                        zg6Var3.b.setLoading(true);
                                                        zg6Var3.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    String str20 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str21 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j4 = paymentForm4.form_id;
                                                    if (!zg6Var3.f) {
                                                        zg6Var3.f = true;
                                                        zg6Var3.h = str20;
                                                        zg6Var3.n = str21;
                                                        zg6Var3.r = j4;
                                                        zg6Var3.b.setLoading(true);
                                                        zg6Var3.o();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                            }
                        }
                    };
                    pVar2.e1 = new pcc() { // from class: vg6
                        @Override // pcc
                        public final void a(Object obj) {
                            byte b10 = b8;
                            final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                            final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                            final zg6 zg6Var2 = zg6Var;
                            switch (b10) {
                                case 0:
                                    final byte b11 = 0;
                                    hl.c3(new Runnable() { // from class: wg6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b122 = b11;
                                            TLRPC.PaymentForm paymentForm4 = paymentForm3;
                                            TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                            zg6 zg6Var3 = zg6Var2;
                                            switch (b122) {
                                                case 0:
                                                    String str18 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str19 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j3 = paymentForm4.form_id;
                                                    if (!zg6Var3.f) {
                                                        zg6Var3.f = true;
                                                        zg6Var3.h = str18;
                                                        zg6Var3.n = str19;
                                                        zg6Var3.r = j3;
                                                        zg6Var3.b.setLoading(true);
                                                        zg6Var3.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    String str20 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str21 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j4 = paymentForm4.form_id;
                                                    if (!zg6Var3.f) {
                                                        zg6Var3.f = true;
                                                        zg6Var3.h = str20;
                                                        zg6Var3.n = str21;
                                                        zg6Var3.r = j4;
                                                        zg6Var3.b.setLoading(true);
                                                        zg6Var3.o();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final byte b12 = 1;
                                    hl.c3(new Runnable() { // from class: wg6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b122 = b12;
                                            TLRPC.PaymentForm paymentForm4 = paymentForm3;
                                            TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                            zg6 zg6Var3 = zg6Var2;
                                            switch (b122) {
                                                case 0:
                                                    String str18 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str19 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j3 = paymentForm4.form_id;
                                                    if (!zg6Var3.f) {
                                                        zg6Var3.f = true;
                                                        zg6Var3.h = str18;
                                                        zg6Var3.n = str19;
                                                        zg6Var3.r = j3;
                                                        zg6Var3.b.setLoading(true);
                                                        zg6Var3.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    String str20 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str21 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j4 = paymentForm4.form_id;
                                                    if (!zg6Var3.f) {
                                                        zg6Var3.f = true;
                                                        zg6Var3.h = str20;
                                                        zg6Var3.n = str21;
                                                        zg6Var3.r = j4;
                                                        zg6Var3.b.setLoading(true);
                                                        zg6Var3.o();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                            }
                        }
                    };
                    pVar2.f1 = new p12(zg6Var, b4);
                    qh6Var4.presentFragment(pVar2);
                    return;
                }
                if (tL_error10 == null) {
                    new d31(qh6Var4.a0, null).H(R.raw.error, ob6.M0(2131743534, null));
                    return;
                } else {
                    if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error10.text)) {
                        hl.c3(new ug6(zg6Var, b5));
                        return;
                    }
                    String str18 = tL_error10.text;
                    zg6Var.e = str18;
                    new d31(qh6Var4.a0, null).H(R.raw.error, ob6.a0(null, null, 2131743533, str18));
                    return;
                }
            case 20:
                MediaController mediaController = (MediaController) this.b;
                File file2 = (File) this.c;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.d;
                byte[] bArr2 = (byte[]) this.e;
                gs6 gs6Var = (gs6) this.f;
                String[] strArr = MediaController.W1;
                if (file2.exists()) {
                    c = 3;
                    c2 = 4;
                } else {
                    boolean z4 = f11.a;
                    StringBuilder sb = new StringBuilder("file not found :( recordTimeCount ");
                    c = 3;
                    c2 = 4;
                    sb.append(mediaController.l1);
                    sb.append(" writedFrames");
                    sb.append(mediaController.m1);
                    cc4.g(new RuntimeException(sb.toString()), true);
                }
                tL_document.date = ConnectionsManager.getInstance(mediaController.i1).getCurrentTime();
                tL_document.size = (int) file2.length();
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                tL_documentAttributeAudio.voice = true;
                if (bArr2 == null) {
                    short[] sArr = mediaController.v1;
                    bArr2 = mediaController.getWaveform2(sArr, sArr.length);
                }
                tL_documentAttributeAudio.waveform = bArr2;
                if (bArr2 != null) {
                    tL_documentAttributeAudio.flags |= 4;
                }
                tL_documentAttributeAudio.duration = mediaController.l1 / 1000.0d;
                tL_document.attributes.clear();
                tL_document.attributes.add(tL_documentAttributeAudio);
                jn7.f(mediaController.i1).k(jn7.o2, new Object[0]);
                jn7 f2 = jn7.f(mediaController.i1);
                Integer valueOf = Integer.valueOf(mediaController.h1);
                String absolutePath = file2.getAbsolutePath();
                Float valueOf2 = Float.valueOf(gs6Var.h);
                Float valueOf3 = Float.valueOf(gs6Var.i);
                Object[] objArr = new Object[6];
                objArr[0] = valueOf;
                objArr[1] = tL_document;
                objArr[2] = absolutePath;
                objArr[c] = Boolean.TRUE;
                objArr[c2] = valueOf2;
                objArr[5] = valueOf3;
                f2.k(jn7.s2, objArr);
                return;
            case 21:
                z67 z67Var = (z67) this.b;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) this.f;
                ok1 ok1Var = (ok1) this.c;
                String str19 = (String) this.d;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) this.e;
                z67Var.E = true;
                if (tL_error11 != null || ok1Var == null) {
                    z67Var.l0();
                    return;
                }
                z67Var.w.l(str19, ok1Var);
                i1b i1bVar = z67Var.r;
                i1bVar.e = ok1Var;
                i1bVar.c = tL_loadAsyncGraph.x;
                z67Var.l0();
                return;
            case 22:
                uc7 uc7Var = (uc7) this.b;
                TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                zh6 zh6Var = (zh6) this.e;
                zh6 zh6Var2 = (zh6) this.f;
                uc7Var.getMessagesStorage().j1(updates_difference.users, updates_difference.chats, true, false);
                if (!arrayList9.isEmpty()) {
                    SparseArray sparseArray = new SparseArray();
                    for (int i13 = 0; i13 < arrayList9.size(); i13++) {
                        TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) arrayList9.get(i13);
                        long[] X1 = uc7Var.getMessagesStorage().X1(tL_updateMessageID.random_id, 0L, null, tL_updateMessageID.id, 0, -1, 0);
                        if (X1 != null) {
                            sparseArray.put(tL_updateMessageID.id, X1);
                        }
                    }
                    if (sparseArray.size() != 0) {
                        hl.c3(new n97(uc7Var, sparseArray, b6));
                    }
                }
                Utilities.d.c(new o97(uc7Var, updates_difference, zh6Var, zh6Var2, (byte) 0));
                return;
            case 23:
                uc7 uc7Var2 = (uc7) this.b;
                String str20 = (String) this.c;
                String str21 = (String) this.d;
                ynb ynbVar = (ynb) this.e;
                znb znbVar = (znb) this.f;
                HashMap hashMap = uc7Var2.I2;
                if (str20 == null) {
                    hashMap.remove(str21);
                    return;
                }
                hashMap.put(str20, ynbVar != null ? ynbVar : znbVar);
                if (ynbVar == null) {
                    znbVar.J = str21;
                    znbVar.I = str20;
                } else {
                    ynbVar.v = str21;
                    ynbVar.u = str20;
                }
                uc7Var2.getFileLoader().h0(false, 67108864, str21, true);
                uc7Var2.getFileLoader().h0(false, 16777216, str20, true);
                return;
            case 24:
                a();
                return;
            case 25:
                uc7 uc7Var3 = (uc7) this.b;
                TLRPC.TL_messages_messageViews tL_messages_messageViews = (TLRPC.TL_messages_messageViews) this.c;
                zh6 zh6Var3 = (zh6) this.d;
                zh6 zh6Var4 = (zh6) this.e;
                zh6 zh6Var5 = (zh6) this.f;
                uc7Var3.j4(tL_messages_messageViews.users, false);
                uc7Var3.c4(tL_messages_messageViews.chats, false);
                uc7Var3.getNotificationCenter().k(78, zh6Var3, zh6Var4, zh6Var5, Boolean.FALSE);
                return;
            case 26:
                ((mcc) this.b).a((ArrayList) this.c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f);
                return;
            case 27:
                b();
                return;
            case 28:
                c();
                return;
            default:
                rl7 rl7Var = (rl7) this.b;
                TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) this.c;
                TLRPC.TL_inputPhoneContact tL_inputPhoneContact = (TLRPC.TL_inputPhoneContact) this.d;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) this.f;
                TLRPC.TL_contacts_importContacts tL_contacts_importContacts = (TLRPC.TL_contacts_importContacts) this.e;
                e eVar2 = rl7Var.F1;
                rl7Var.A1 = false;
                if (tL_contacts_importedContacts == null) {
                    hl.T3(rl7Var.Q1, true, 0.5f, true, true);
                    hl.T3(rl7Var.R1, false, 0.5f, true, true);
                    jj.c0(rl7Var.a, tL_error12, eVar2, tL_contacts_importContacts, new Object[0]);
                    return;
                } else if (!tL_contacts_importedContacts.users.isEmpty()) {
                    uc7.s1(rl7Var.a).j4(tL_contacts_importedContacts.users, false);
                    uc7.s1(rl7Var.a).I3(tL_contacts_importedContacts.users.get(0), null, eVar2, 1);
                    rl7Var.dismiss();
                    return;
                } else {
                    if (eVar2.getParentActivity() != null) {
                        hl.T3(rl7Var.Q1, true, 0.5f, true, true);
                        hl.T3(rl7Var.R1, false, 0.5f, true, true);
                        jj.u(eVar2, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ tw4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ tw4(Object obj, Object obj2, TLObject tLObject, TLObject tLObject2, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = tLObject;
        this.e = tLObject2;
        this.f = tL_error;
    }

    public /* synthetic */ tw4(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.f = tL_error;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
