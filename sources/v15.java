// default package

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Base64;
import android.util.SparseArray;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.p;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class v15 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ v15(mh6 mh6Var, TLRPC.TL_error tL_error, String str, String str2, String str3) {
        this.a = (byte) 14;
        this.c = mh6Var;
        this.d = tL_error;
        this.b = str;
        this.e = str2;
        this.f = str3;
    }

    private final void a() {
        ml7 ml7Var = (ml7) this.c;
        TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) this.d;
        TLRPC.TL_inputPhoneContact tL_inputPhoneContact = (TLRPC.TL_inputPhoneContact) this.e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
        TLRPC.TL_contacts_importContacts tL_contacts_importContacts = (TLRPC.TL_contacts_importContacts) this.b;
        d dVar = ml7Var.F1;
        ml7Var.A1 = false;
        if (tL_contacts_importedContacts == null) {
            gm.T3(ml7Var.Q1, true, 0.5f, true, true);
            gm.T3(ml7Var.R1, false, 0.5f, true, true);
            ik.c0(ml7Var.a, tL_error, dVar, tL_contacts_importContacts, new Object[0]);
        } else if (!tL_contacts_importedContacts.users.isEmpty()) {
            oc7.r1(ml7Var.a).d4(tL_contacts_importedContacts.users, false);
            oc7.r1(ml7Var.a).D3(tL_contacts_importedContacts.users.get(0), null, dVar, 1);
            ml7Var.dismiss();
        } else {
            if (dVar.getParentActivity() == null) {
                return;
            }
            gm.T3(ml7Var.Q1, true, 0.5f, true, true);
            gm.T3(ml7Var.R1, false, 0.5f, true, true);
            ik.u(dVar, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:255:0x0700, code lost:
    
        if ("THEME_FORMAT_INVALID".equals(r0.text) != false) goto L208;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0a27  */
    /* JADX WARN: Removed duplicated region for block: B:367:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        g35 g35Var;
        String h;
        byte[] bArr;
        TLRPC.GroupCall groupCall;
        byte b;
        byte b2;
        byte b3;
        kn knVar;
        kn knVar2;
        TLRPC.TL_wallPaper tL_wallPaper;
        p pVar;
        c41 d;
        int i;
        int i2;
        int i3;
        int i4;
        char c;
        char c2;
        long j;
        byte b4 = 5;
        byte b5 = 2;
        String str = null;
        final byte b6 = 0;
        r14 = 0;
        byte b7 = 0;
        final byte b8 = 1;
        switch (this.a) {
            case 0:
                c cVar = (c) this.c;
                y25 y25Var = (y25) this.d;
                he heVar = (he) this.e;
                f25 f25Var = (f25) this.f;
                String str2 = (String) this.b;
                try {
                    heVar.dismiss();
                    if (y25Var != null && !y25Var.d()) {
                        TL_wallet.WalletState walletState = cVar.e;
                        if ((walletState instanceof TL_wallet.TL_walletState) && (g35Var = cVar.c) != null && !g35Var.f(((TL_wallet.TL_walletState) walletState).public_key)) {
                            cVar.c.q(z8c.h(cVar.a).e(), ((TL_wallet.TL_walletState) cVar.e).public_key, y25Var, null);
                        }
                    }
                    f25Var.a(y25Var, str2);
                    if (y25Var != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (y25Var != null) {
                        y25Var.close();
                    }
                }
            case 1:
                w45 w45Var = (w45) this.c;
                JSONObject jSONObject = (JSONObject) this.d;
                qac qacVar = (qac) this.e;
                String str3 = (String) this.b;
                s45 s45Var = (s45) this.f;
                if (jSONObject == null) {
                    qacVar.a(str3);
                    return;
                } else {
                    w45Var.E(s45Var.a.id, s45Var.b, jSONObject, qacVar);
                    return;
                }
            case 2:
                y25 y25Var2 = (y25) this.d;
                s45 s45Var2 = (s45) this.c;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.e;
                u35 u35Var = (u35) this.f;
                m45 m45Var = (m45) this.b;
                try {
                    bArr = Base64.decode(WalletEngine2.tonConnectCrypto(y25Var2, s45Var2.a, s45Var2.h, s45Var2.g, new JSONObject().put("challenge", Base64.encodeToString(tonconnectchallenge.challenge, 2))).getString("challengeAnswer"), 2);
                    h = null;
                } catch (Exception e) {
                    h = w45.h("decrypt challenge", e);
                    bArr = null;
                }
                gm.c3(new xo1(bArr, u35Var, h, m45Var, (byte) 26));
                return;
            case 3:
                w45 w45Var2 = (w45) this.c;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.e;
                s45 s45Var3 = (s45) this.f;
                qac qacVar2 = (qac) this.b;
                y25 y25Var3 = (y25) this.d;
                try {
                    if (!oc7.r1(w45Var2.a).X3.edit().putString(w45.k(s45Var3.a.id, s45Var3.b).concat(".transfer"), new JSONObject().put("boc", Base64.encodeToString(sendtransfer.data_normal, 2)).put("randomId", sendtransfer.random_id).toString()).commit()) {
                        throw new IllegalStateException("Could not save signed transfer");
                    }
                } catch (Exception e2) {
                    str = w45.h("save transfer", e2);
                }
                gm.c3(new e77((Object) w45Var2, str, (Object) qacVar2, (Object) s45Var3, (Object) y25Var3, (Object) sendtransfer, (byte) 12));
                return;
            case 4:
                g95 g95Var = (g95) this.c;
                he heVar2 = (he) this.e;
                TLObject tLObject = (TLObject) this.d;
                TL_phone.exportGroupCallInvite exportgroupcallinvite = (TL_phone.exportGroupCallInvite) this.f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                heVar2.dismiss();
                if (!(tLObject instanceof TL_phone.exportedGroupCallInvite)) {
                    if (tL_error != null) {
                        new c41(g95Var.F, new q63()).g0(tL_error, false);
                        return;
                    }
                    return;
                }
                Context context = g95Var.getContext();
                int i5 = g95Var.a;
                TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
                String str4 = ((TL_phone.exportedGroupCallInvite) tLObject).link;
                ylb ylbVar = g95Var.J0;
                qd2 qd2Var = g95Var.T2;
                ia1.l0(context, i5, inputGroupCall, str4, ylbVar, false, (qd2Var == null || (groupCall = qd2Var.b) == null || !groupCall.creator) ? false : true);
                return;
            case 5:
                g95 g95Var2 = (g95) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.f;
                String str5 = (String) this.b;
                g95Var2.getClass();
                d S = LaunchActivity.S();
                if (S != null) {
                    i46 i46Var = new i46(34, g95Var2.a, new q63(), S.getContext(), S);
                    i46Var.t1(null, arrayList, arrayList2, arrayList3, str5);
                    i46Var.show();
                    return;
                }
                return;
            case 6:
                ma5 ma5Var = (ma5) this.c;
                yd ydVar = (yd) this.d;
                WindowManager windowManager = (WindowManager) this.e;
                FrameLayout frameLayout = (FrameLayout) this.f;
                z81 z81Var = (z81) this.b;
                ma5Var.setVisibility(8);
                ydVar.setVisibility(8);
                windowManager.removeView(ma5Var);
                windowManager.removeView(ydVar);
                windowManager.removeView(frameLayout);
                windowManager.removeView(z81Var);
                return;
            case 7:
                tm5 tm5Var = (tm5) this.c;
                Drawable drawable = (Drawable) this.d;
                ArrayList arrayList4 = (ArrayList) this.e;
                ArrayList arrayList5 = (ArrayList) this.f;
                String str6 = (String) this.b;
                if (drawable instanceof kn) {
                    kn knVar3 = (kn) drawable;
                    if (!knVar3.o0) {
                        int i6 = 0;
                        byte b9 = 0;
                        while (i6 < arrayList4.size()) {
                            ImageReceiver imageReceiver = (ImageReceiver) arrayList4.get(i6);
                            if (i6 == 0) {
                                knVar2 = knVar3;
                                b = b9;
                                b2 = b6;
                                b3 = b8;
                            } else {
                                AnimatedFileDrawableStream animatedFileDrawableStream = knVar3.v0;
                                if (animatedFileDrawableStream != null) {
                                    File file = knVar3.H;
                                    long j2 = knVar3.I;
                                    boolean z = knVar3.J;
                                    TLRPC.Document document = animatedFileDrawableStream.c;
                                    gn5 gn5Var = animatedFileDrawableStream.d;
                                    b2 = b6;
                                    b3 = b8;
                                    long j3 = knVar3.N;
                                    int i7 = knVar3.K;
                                    b = b9;
                                    AnimatedFileDrawableStream animatedFileDrawableStream2 = knVar3.v0;
                                    knVar = new kn(file, false, j2, z ? 1 : 0, document, gn5Var, document, j3, i7, (animatedFileDrawableStream2 == null || !animatedFileDrawableStream2.w) ? b2 : b3);
                                } else {
                                    b = b9;
                                    b2 = b6;
                                    b3 = b8;
                                    knVar = new kn(knVar3.H, false, knVar3.I, knVar3.J ? 1 : 0, knVar3.p0, null, null, knVar3.N, knVar3.K, false);
                                }
                                int[] iArr = knVar.d;
                                int[] iArr2 = knVar3.d;
                                iArr[b2] = iArr2[b2];
                                iArr[b3] = iArr2[b3];
                                knVar2 = knVar;
                            }
                            kn knVar4 = knVar2;
                            if (imageReceiver.h0(knVar2, tm5Var.d, tm5Var.m, false, ((Integer) arrayList5.get(i6)).intValue())) {
                                if (knVar4 == knVar3) {
                                    b9 = b3;
                                    i6++;
                                    b8 = b3;
                                    b6 = b2;
                                }
                            } else if (knVar4 != knVar3) {
                                knVar4.u();
                            }
                            b9 = b;
                            i6++;
                            b8 = b3;
                            b6 = b2;
                        }
                        if (b9 == 0) {
                            knVar3.u();
                        }
                        if (str6 == null) {
                            tm5Var.A.l(str6);
                            return;
                        }
                        return;
                    }
                }
                for (int i8 = 0; i8 < arrayList4.size(); i8++) {
                    ((ImageReceiver) arrayList4.get(i8)).h0(drawable, tm5Var.d, ((Integer) tm5Var.z.get(i8)).intValue(), false, ((Integer) arrayList5.get(i8)).intValue());
                }
                if (str6 == null) {
                }
                break;
            case 8:
                en5 en5Var = (en5) this.c;
                String str7 = (String) this.b;
                ArrayList arrayList6 = (ArrayList) this.d;
                BitmapDrawable bitmapDrawable = (BitmapDrawable) this.e;
                ArrayList arrayList7 = (ArrayList) this.f;
                en5Var.a();
                dn5 dn5Var = en5Var.c;
                if (dn5Var.b != null) {
                    StringBuilder k = b10.k(str7, "@");
                    k.append(dn5Var.b);
                    str7 = k.toString();
                }
                String str8 = str7;
                for (int i9 = 0; i9 < arrayList6.size(); i9++) {
                    ((ImageReceiver) arrayList6.get(i9)).h0(bitmapDrawable, str8, 0, false, ((Integer) arrayList7.get(i9)).intValue());
                }
                if (str8.contains("nocache")) {
                    return;
                }
                en5Var.d.c.l(str8, bitmapDrawable);
                return;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                k16 k16Var = (k16) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                String str9 = LaunchActivity.C1;
                try {
                    k16Var.run();
                } catch (Exception e3) {
                    fc4.g(e3, true);
                }
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    launchActivity.F0(ik.K(launchActivity, null, jb6.M0(2131751042, null) + "\n" + tL_error2.text));
                    return;
                }
                TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) tLObject2;
                if (tL_wallPaper3.pattern) {
                    String str10 = tL_wallPaper3.slug;
                    TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper2.settings;
                    mtc mtcVar = new mtc(str10, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, gm.q1(wallPaperSettings.rotation, false), r2.intensity / 100.0f, tL_wallPaper2.settings.motion);
                    mtcVar.g = tL_wallPaper3;
                    tL_wallPaper3 = mtcVar;
                }
                rob robVar = new rob(tL_wallPaper3, null, true);
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper2.settings;
                boolean z2 = wallPaperSettings2.blur;
                boolean z3 = wallPaperSettings2.motion;
                float f = wallPaperSettings2.intensity;
                robVar.H1 = z2;
                robVar.G1 = z3;
                robVar.p1 = f;
                launchActivity.t0(robVar);
                return;
            case 10:
                LaunchActivity launchActivity2 = (LaunchActivity) this.c;
                nk3 nk3Var = (nk3) this.d;
                d dVar = (d) this.e;
                TLRPC.User user = (TLRPC.User) this.f;
                String str11 = (String) this.b;
                String str12 = LaunchActivity.C1;
                ArrayList arrayList8 = launchActivity2.D0;
                if (nk3Var == null) {
                    if (dVar instanceof yv1) {
                        ((yv1) dVar).la(user.id, str11, true);
                        return;
                    }
                    return;
                }
                if (dVar != null) {
                    dVar.dismissCurrentDialog();
                }
                for (int i10 = 0; i10 < arrayList8.size(); i10++) {
                    if (((Dialog) arrayList8.get(i10)).isShowing()) {
                        ((Dialog) arrayList8.get(i10)).dismiss();
                    }
                }
                arrayList8.clear();
                launchActivity2.t0(nk3Var);
                return;
            case 11:
                LaunchActivity launchActivity3 = (LaunchActivity) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
                String str13 = (String) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f;
                d S2 = LaunchActivity.S();
                if (tLObject3 == null) {
                    if (tL_error3 != null) {
                        if ("URL_EXPIRED".equalsIgnoreCase(tL_error3.text)) {
                            xp7.a().I(R.raw.error, jb6.M0(2131753093, null), jb6.M0(2131753094, null)).j();
                            return;
                        } else {
                            xp7.a().g0(tL_error3, false);
                            return;
                        }
                    }
                    return;
                }
                if (tLObject3 instanceof TLRPC.TL_urlAuthResultRequest) {
                    xp7.b(false, launchActivity3.P, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject3, null, null, null, false, null);
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_urlAuthResultAccepted) {
                    xp7.b(false, launchActivity3.P, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject3, null, null, null, false, null);
                    return;
                } else {
                    if (tLObject3 instanceof TLRPC.TL_urlAuthResultDefault) {
                        ik.n0(S2, str13, false, true);
                        return;
                    }
                    return;
                }
            case 12:
                LaunchActivity launchActivity4 = (LaunchActivity) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                he heVar3 = (he) this.e;
                k16 k16Var2 = (k16) this.f;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.b;
                String str14 = LaunchActivity.C1;
                if (tLObject4 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) tLObject4;
                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.size() > 0 ? tL_theme.settings.get(0) : null;
                    if (themeSettings != null) {
                        bmb O0 = cmb.O0(cmb.q0(themeSettings));
                        if (O0 != null) {
                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                TLRPC.TL_wallPaper tL_wallPaper4 = (TLRPC.TL_wallPaper) wallPaper;
                                bc4.G(launchActivity4.P);
                                if (!bc4.J(tL_wallPaper4.document, null, true, true).exists()) {
                                    launchActivity4.V0 = heVar3;
                                    launchActivity4.U0 = true;
                                    launchActivity4.S0 = O0;
                                    launchActivity4.T0 = tL_theme;
                                    launchActivity4.R0 = tL_wallPaper4;
                                    launchActivity4.Q0 = bc4.r(null, tL_wallPaper4.document);
                                    bc4.G(launchActivity4.P).X(tL_wallPaper4.document, tL_wallPaper4, 1, 1);
                                    return;
                                }
                                tL_wallPaper = tL_wallPaper4;
                            } else {
                                tL_wallPaper = null;
                            }
                            try {
                                k16Var2.run();
                            } catch (Exception e4) {
                                fc4.g(e4, true);
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
                            launchActivity4.P0 = bc4.r(null, document2);
                            launchActivity4.V0 = heVar3;
                            bc4.G(launchActivity4.P).X(launchActivity4.T0.document, tL_theme, 1, 1);
                        }
                        b5 = 1;
                    }
                    b5 = b7;
                } else if (tL_error4 != null) {
                    break;
                }
                if (b5 != 0) {
                    try {
                        k16Var2.run();
                    } catch (Exception e5) {
                        fc4.g(e5, true);
                    }
                    if (b5 == 1) {
                        launchActivity4.F0(ik.K(launchActivity4, jb6.M0(2131743875, null), jb6.M0(2131743858, null)));
                        return;
                    } else {
                        launchActivity4.F0(ik.K(launchActivity4, jb6.M0(2131743875, null), jb6.M0(2131743859, null)));
                        return;
                    }
                }
                return;
            case 13:
                a66 a66Var = (a66) this.c;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) this.f;
                String str15 = (String) this.b;
                int i11 = a66Var.b;
                LaunchActivity launchActivity5 = a66Var.a;
                if (tL_error5 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error5.text)) {
                        d = a66.d();
                        i = 2131747128;
                    } else {
                        d = a66.d();
                        i = 2131747129;
                    }
                    mlb.y(null, i, d, null);
                } else if (!launchActivity5.isFinishing()) {
                    if (tLObject5 instanceof TLRPC.TL_payments_paymentFormStars) {
                        a3a a3aVar = launchActivity5.Y0;
                        launchActivity5.Y0 = null;
                        jva.v(i11, false).W(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject5, new w56(a66Var, (byte) 1), new l06(a3aVar, b8));
                        return;
                    }
                    if (tLObject5 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject5;
                        oc7.r1(i11).d4(paymentForm.users, false);
                        pVar = new p(paymentForm, null, str15, LaunchActivity.S());
                    } else {
                        pVar = tLObject5 instanceof TLRPC.PaymentReceipt ? new p((TLRPC.PaymentReceipt) tLObject5) : null;
                    }
                    if (pVar != null) {
                        a3a a3aVar2 = launchActivity5.Y0;
                        if (a3aVar2 != null) {
                            launchActivity5.Y0 = null;
                            pVar.a1 = new m06(a3aVar2, b8);
                        }
                        a66Var.u(pVar, false);
                    }
                }
                a66Var.c();
                return;
            case 14:
                ((mh6) this.c).v1((TLRPC.TL_error) this.d, (String) this.b, (String) this.e, (String) this.f);
                return;
            case 15:
                ze6 ze6Var = (ze6) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                Bundle bundle = (Bundle) this.e;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.f;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) this.b;
                mh6 mh6Var = ze6Var.a0;
                if (tLObject6 instanceof TLRPC.TL_auth_sentCode) {
                    mh6Var.q1(bundle, (TLRPC.TL_auth_sentCode) tLObject6, true);
                    return;
                } else {
                    if (tL_error6 == null || tL_error6.text == null) {
                        return;
                    }
                    i2 = ((d) mh6Var).currentAccount;
                    ik.c0(i2, tL_error6, mh6Var, tL_auth_resendCode, new Object[0]);
                    return;
                }
            case 16:
                cg6 cg6Var = (cg6) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                Bundle bundle2 = (Bundle) this.e;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.f;
                TL_account.sendVerifyEmailCode sendverifyemailcode = (TL_account.sendVerifyEmailCode) this.b;
                mh6 mh6Var2 = cg6Var.F;
                mh6Var2.y1(false, true);
                cg6Var.r = false;
                if (tLObject7 instanceof TL_account.sentEmailCode) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject7;
                    bundle2.putString("emailPattern", sentemailcode.email_pattern);
                    bundle2.putInt("length", sentemailcode.length);
                    mh6Var2.J1(13, true, bundle2, false);
                    return;
                }
                String str16 = tL_error7.text;
                if (str16 != null) {
                    if (str16.contains("EMAIL_INVALID")) {
                        cg6Var.n();
                        return;
                    }
                    if (tL_error7.text.contains("EMAIL_NOT_ALLOWED")) {
                        mh6Var2.z1(jb6.M0(2131745804, null), jb6.M0(2131751137, null));
                        return;
                    }
                    if (tL_error7.text.contains("PHONE_PASSWORD_FLOOD")) {
                        mh6Var2.z1(jb6.M0(2131745804, null), jb6.M0(2131750619, "FloodWait"));
                        return;
                    }
                    if (tL_error7.text.contains("PHONE_NUMBER_FLOOD")) {
                        mh6Var2.z1(jb6.M0(2131745804, null), jb6.M0(2131747019, "PhoneNumberFlood"));
                        return;
                    }
                    if (tL_error7.text.contains("PHONE_CODE_EMPTY") || tL_error7.text.contains("PHONE_CODE_INVALID")) {
                        mh6Var2.z1(jb6.M0(2131745804, null), jb6.M0(2131748940, "InvalidCode"));
                        return;
                    }
                    if (tL_error7.text.contains("PHONE_CODE_EXPIRED")) {
                        mh6Var2.J1(0, true, null, true);
                        mh6Var2.z1(jb6.M0(2131745804, null), jb6.M0(2131751958, "CodeExpired"));
                        return;
                    } else if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                        mh6Var2.z1(jb6.M0(2131745804, null), jb6.M0(2131750619, "FloodWait"));
                        return;
                    } else {
                        if (tL_error7.code != -1000) {
                            i3 = ((d) mh6Var2).currentAccount;
                            ik.c0(i3, tL_error7, mh6Var2, sendverifyemailcode, cg6Var.x);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 17:
                cg6 cg6Var2 = (cg6) this.c;
                TLObject tLObject8 = (TLObject) this.d;
                Bundle bundle3 = (Bundle) this.e;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.f;
                TL_account.verifyEmail verifyemail = (TL_account.verifyEmail) this.b;
                mh6 mh6Var3 = cg6Var2.F;
                if ((tLObject8 instanceof TL_account.TL_emailVerified) && mh6Var3.G == 3) {
                    mh6Var3.finishFragment();
                    mh6Var3.e0.run();
                    return;
                }
                if (tLObject8 instanceof TL_account.TL_emailVerifiedLogin) {
                    TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject8;
                    bundle3.putString("email", tL_emailVerifiedLogin.email);
                    mh6Var3.q1(bundle3, tL_emailVerifiedLogin.sent_code, true);
                    return;
                } else {
                    if (tL_error8 != null) {
                        if (tL_error8.text.contains("EMAIL_NOT_ALLOWED")) {
                            mh6Var3.z1(jb6.M0(2131745804, null), jb6.M0(2131751137, null));
                            return;
                        }
                        if (tL_error8.text.contains("EMAIL_TOKEN_INVALID")) {
                            mh6Var3.z1(jb6.M0(2131745804, null), jb6.M0(2131751134, null));
                            return;
                        } else {
                            if (tL_error8.code != -1000) {
                                i4 = ((d) mh6Var3).currentAccount;
                                ik.c0(i4, tL_error8, mh6Var3, verifyemail, new Object[0]);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
            case 18:
                final wg6 wg6Var = (wg6) this.c;
                TLObject tLObject9 = (TLObject) this.d;
                TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = (TLRPC.TL_inputInvoicePremiumAuthCode) this.e;
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.f;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.b;
                mh6 mh6Var4 = wg6Var.w;
                wg6Var.b.setLoading(false);
                if (tLObject9 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject9;
                    mh6Var4.getMessagesController().d4(paymentForm2.users, false);
                    p pVar2 = new p(tL_inputInvoicePremiumAuthCode, paymentForm2, null, null, 4, null, null, null, null, null, null, false, null, mh6Var4, true);
                    pVar2.W0 = true;
                    pVar2.d1 = new qac() { // from class: tg6
                        @Override // qac
                        public final void a(Object obj) {
                            byte b10 = b6;
                            final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                            final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                            final wg6 wg6Var2 = wg6Var;
                            switch (b10) {
                                case 0:
                                    final byte b11 = 0;
                                    gm.c3(new Runnable() { // from class: ug6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b12 = b11;
                                            TLRPC.PaymentForm paymentForm4 = paymentForm3;
                                            TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                            wg6 wg6Var3 = wg6Var2;
                                            switch (b12) {
                                                case 0:
                                                    String str17 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str18 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j4 = paymentForm4.form_id;
                                                    if (!wg6Var3.f) {
                                                        wg6Var3.f = true;
                                                        wg6Var3.h = str17;
                                                        wg6Var3.n = str18;
                                                        wg6Var3.r = j4;
                                                        wg6Var3.b.setLoading(true);
                                                        wg6Var3.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    String str19 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str20 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j5 = paymentForm4.form_id;
                                                    if (!wg6Var3.f) {
                                                        wg6Var3.f = true;
                                                        wg6Var3.h = str19;
                                                        wg6Var3.n = str20;
                                                        wg6Var3.r = j5;
                                                        wg6Var3.b.setLoading(true);
                                                        wg6Var3.o();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final byte b12 = 1;
                                    gm.c3(new Runnable() { // from class: ug6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b122 = b12;
                                            TLRPC.PaymentForm paymentForm4 = paymentForm3;
                                            TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                            wg6 wg6Var3 = wg6Var2;
                                            switch (b122) {
                                                case 0:
                                                    String str17 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str18 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j4 = paymentForm4.form_id;
                                                    if (!wg6Var3.f) {
                                                        wg6Var3.f = true;
                                                        wg6Var3.h = str17;
                                                        wg6Var3.n = str18;
                                                        wg6Var3.r = j4;
                                                        wg6Var3.b.setLoading(true);
                                                        wg6Var3.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    String str19 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str20 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j5 = paymentForm4.form_id;
                                                    if (!wg6Var3.f) {
                                                        wg6Var3.f = true;
                                                        wg6Var3.h = str19;
                                                        wg6Var3.n = str20;
                                                        wg6Var3.r = j5;
                                                        wg6Var3.b.setLoading(true);
                                                        wg6Var3.o();
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
                    pVar2.e1 = new qac() { // from class: tg6
                        @Override // qac
                        public final void a(Object obj) {
                            byte b10 = b8;
                            final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                            final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                            final wg6 wg6Var2 = wg6Var;
                            switch (b10) {
                                case 0:
                                    final byte b11 = 0;
                                    gm.c3(new Runnable() { // from class: ug6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b122 = b11;
                                            TLRPC.PaymentForm paymentForm4 = paymentForm3;
                                            TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                            wg6 wg6Var3 = wg6Var2;
                                            switch (b122) {
                                                case 0:
                                                    String str17 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str18 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j4 = paymentForm4.form_id;
                                                    if (!wg6Var3.f) {
                                                        wg6Var3.f = true;
                                                        wg6Var3.h = str17;
                                                        wg6Var3.n = str18;
                                                        wg6Var3.r = j4;
                                                        wg6Var3.b.setLoading(true);
                                                        wg6Var3.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    String str19 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str20 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j5 = paymentForm4.form_id;
                                                    if (!wg6Var3.f) {
                                                        wg6Var3.f = true;
                                                        wg6Var3.h = str19;
                                                        wg6Var3.n = str20;
                                                        wg6Var3.r = j5;
                                                        wg6Var3.b.setLoading(true);
                                                        wg6Var3.o();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final byte b12 = 1;
                                    gm.c3(new Runnable() { // from class: ug6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b122 = b12;
                                            TLRPC.PaymentForm paymentForm4 = paymentForm3;
                                            TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                            wg6 wg6Var3 = wg6Var2;
                                            switch (b122) {
                                                case 0:
                                                    String str17 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str18 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j4 = paymentForm4.form_id;
                                                    if (!wg6Var3.f) {
                                                        wg6Var3.f = true;
                                                        wg6Var3.h = str17;
                                                        wg6Var3.n = str18;
                                                        wg6Var3.r = j4;
                                                        wg6Var3.b.setLoading(true);
                                                        wg6Var3.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    String str19 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str20 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j5 = paymentForm4.form_id;
                                                    if (!wg6Var3.f) {
                                                        wg6Var3.f = true;
                                                        wg6Var3.h = str19;
                                                        wg6Var3.n = str20;
                                                        wg6Var3.r = j5;
                                                        wg6Var3.b.setLoading(true);
                                                        wg6Var3.o();
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
                    pVar2.f1 = new k22(wg6Var, b4);
                    mh6Var4.presentFragment(pVar2);
                    return;
                }
                if (tL_error9 == null) {
                    new c41(mh6Var4.a0, null).H(R.raw.error, jb6.M0(2131743566, null));
                    return;
                } else {
                    if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error9.text)) {
                        gm.c3(new sg6(wg6Var, b5));
                        return;
                    }
                    String str17 = tL_error9.text;
                    wg6Var.e = str17;
                    new c41(mh6Var4.a0, null).H(R.raw.error, jb6.a0(null, null, 2131743565, str17));
                    return;
                }
            case 19:
                MediaController mediaController = (MediaController) this.c;
                File file2 = (File) this.d;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.e;
                byte[] bArr2 = (byte[]) this.f;
                cs6 cs6Var = (cs6) this.b;
                String[] strArr = MediaController.W1;
                if (file2.exists()) {
                    c = 3;
                    c2 = 4;
                } else {
                    boolean z4 = e21.a;
                    StringBuilder sb = new StringBuilder("file not found :( recordTimeCount ");
                    c = 3;
                    c2 = 4;
                    sb.append(mediaController.l1);
                    sb.append(" writedFrames");
                    sb.append(mediaController.m1);
                    fc4.g(new RuntimeException(sb.toString()), true);
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
                nm7.f(mediaController.i1).k(nm7.o2, new Object[0]);
                nm7 f2 = nm7.f(mediaController.i1);
                Integer valueOf = Integer.valueOf(mediaController.h1);
                String absolutePath = file2.getAbsolutePath();
                Float valueOf2 = Float.valueOf(cs6Var.h);
                Float valueOf3 = Float.valueOf(cs6Var.i);
                Object[] objArr = new Object[6];
                objArr[0] = valueOf;
                objArr[1] = tL_document;
                objArr[2] = absolutePath;
                objArr[c] = Boolean.TRUE;
                objArr[c2] = valueOf2;
                objArr[5] = valueOf3;
                f2.k(nm7.s2, objArr);
                return;
            case 20:
                t67 t67Var = (t67) this.c;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) this.d;
                nl1 nl1Var = (nl1) this.e;
                String str18 = (String) this.b;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) this.f;
                t67Var.E = true;
                if (tL_error10 != null || nl1Var == null) {
                    t67Var.m0();
                    return;
                }
                t67Var.w.l(str18, nl1Var);
                jza jzaVar = t67Var.r;
                jzaVar.e = nl1Var;
                jzaVar.c = tL_loadAsyncGraph.x;
                t67Var.m0();
                return;
            case 21:
                oc7 oc7Var = (oc7) this.c;
                TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) this.d;
                ArrayList arrayList9 = (ArrayList) this.e;
                vh6 vh6Var = (vh6) this.f;
                vh6 vh6Var2 = (vh6) this.b;
                oc7Var.getMessagesStorage().j1(updates_difference.users, updates_difference.chats, true, false);
                if (!arrayList9.isEmpty()) {
                    SparseArray sparseArray = new SparseArray();
                    for (int i12 = 0; i12 < arrayList9.size(); i12++) {
                        TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) arrayList9.get(i12);
                        long[] X1 = oc7Var.getMessagesStorage().X1(tL_updateMessageID.random_id, 0L, null, tL_updateMessageID.id, 0, -1, 0);
                        if (X1 != null) {
                            sparseArray.put(tL_updateMessageID.id, X1);
                        }
                    }
                    if (sparseArray.size() != 0) {
                        gm.c3(new k97(oc7Var, sparseArray, b6));
                    }
                }
                Utilities.d.c(new l97(oc7Var, updates_difference, vh6Var, vh6Var2, (byte) 0));
                return;
            case 22:
                oc7 oc7Var2 = (oc7) this.c;
                TLRPC.TL_messages_messageViews tL_messages_messageViews = (TLRPC.TL_messages_messageViews) this.d;
                vh6 vh6Var3 = (vh6) this.e;
                vh6 vh6Var4 = (vh6) this.f;
                vh6 vh6Var5 = (vh6) this.b;
                oc7Var2.d4(tL_messages_messageViews.users, false);
                oc7Var2.X3(tL_messages_messageViews.chats, false);
                oc7Var2.getNotificationCenter().k(78, vh6Var3, vh6Var4, vh6Var5, Boolean.FALSE);
                return;
            case 23:
                oc7 oc7Var3 = (oc7) this.c;
                String str19 = (String) this.b;
                String str20 = (String) this.d;
                amb ambVar = (amb) this.e;
                bmb bmbVar = (bmb) this.f;
                HashMap hashMap = oc7Var3.I2;
                if (str19 == null) {
                    hashMap.remove(str20);
                    return;
                }
                hashMap.put(str19, ambVar != null ? ambVar : bmbVar);
                if (ambVar == null) {
                    bmbVar.J = str20;
                    bmbVar.I = str19;
                } else {
                    ambVar.v = str20;
                    ambVar.u = str19;
                }
                oc7Var3.getFileLoader().h0(false, 67108864, str20, true);
                oc7Var3.getFileLoader().h0(false, 16777216, str19, true);
                return;
            case 24:
                oc7 oc7Var4 = (oc7) this.c;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) this.d;
                Object obj = (TLObject) this.e;
                Long l = (Long) this.f;
                rz3 rz3Var = (rz3) this.b;
                if (tL_error11 == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) obj;
                    oc7Var4.d4(tL_channels_channelParticipants.users, false);
                    oc7Var4.X3(tL_channels_channelParticipants.chats, false);
                    oc7Var4.getMessagesStorage().j1(tL_channels_channelParticipants.users, tL_channels_channelParticipants.chats, true, true);
                    cf7 messagesStorage = oc7Var4.getMessagesStorage();
                    messagesStorage.a.c(new me7(messagesStorage, l.longValue(), (ArrayList) tL_channels_channelParticipants.participants, (byte) 3));
                    oc7Var4.o1.add(l);
                }
                oc7Var4.n1.remove(l);
                if (rz3Var != null) {
                    rz3Var.a(obj instanceof TLRPC.TL_channels_channelParticipants ? (TLRPC.TL_channels_channelParticipants) obj : null);
                    return;
                }
                return;
            case 25:
                ((cf7) this.c).R1(null, (LongSparseIntArray) this.d, (LongSparseIntArray) this.e, (vh6) this.f, (LongSparseIntArray) this.b);
                return;
            case 26:
                ((nac) this.c).a((ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f, (ArrayList) this.b);
                return;
            case 27:
                cf7 cf7Var = (cf7) this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                ArrayList arrayList11 = (ArrayList) this.e;
                ArrayList arrayList12 = (ArrayList) this.f;
                vh6 vh6Var6 = (vh6) this.b;
                cf7Var.getMessagesController().d4(arrayList10, true);
                cf7Var.getMessagesController().X3(arrayList11, true);
                cf7Var.getMessagesController().a4(arrayList12);
                for (int i13 = 0; i13 < vh6Var6.m(); i13++) {
                    long j4 = vh6Var6.j(i13);
                    ye7 ye7Var = (ye7) vh6Var6.n(i13);
                    if (cf7Var.getMessagesController().s2(j4) || cf7Var.r0(8, j4) || cf7Var.getMessagesController().z2(j4)) {
                        oc7 messagesController = cf7Var.getMessagesController();
                        cf7 messagesStorage2 = messagesController.getMessagesStorage();
                        j = j4;
                        messagesStorage2.a.c(new of2((Object) messagesStorage2, j4, (Object) new v87(messagesController, j4), (byte) 5));
                    } else {
                        j = j4;
                    }
                    oc7 messagesController2 = cf7Var.getMessagesController();
                    int i14 = ye7Var.a;
                    messagesController2.n3(j, i14, i14, ye7Var.b, false, 0L, ye7Var.c, true, 0);
                }
                return;
            case 28:
                a();
                return;
            default:
                ((lo7) this.c).C((ArrayList) this.d, (vh6) this.e, (ArrayList) this.f, (Collection) this.b);
                return;
        }
    }

    public /* synthetic */ v15(w45 w45Var, TL_wallet.sendTransfer sendtransfer, s45 s45Var, qac qacVar, y25 y25Var) {
        this.a = (byte) 3;
        this.c = w45Var;
        this.e = sendtransfer;
        this.f = s45Var;
        this.b = qacVar;
        this.d = y25Var;
    }

    public /* synthetic */ v15(g95 g95Var, he heVar, TLObject tLObject, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLRPC.TL_error tL_error) {
        this.a = (byte) 4;
        this.c = g95Var;
        this.e = heVar;
        this.d = tLObject;
        this.f = exportgroupcallinvite;
        this.b = tL_error;
    }

    public /* synthetic */ v15(y25 y25Var, s45 s45Var, TL_wallet.tonConnectChallenge tonconnectchallenge, u35 u35Var, m45 m45Var) {
        this.a = (byte) 2;
        this.d = y25Var;
        this.c = s45Var;
        this.e = tonconnectchallenge;
        this.f = u35Var;
        this.b = m45Var;
    }

    public /* synthetic */ v15(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = obj5;
    }

    public /* synthetic */ v15(Object obj, Object obj2, Object obj3, String str, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = str;
        this.f = obj4;
    }

    public /* synthetic */ v15(Object obj, String str, Serializable serializable, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = str;
        this.d = serializable;
        this.e = obj2;
        this.f = obj3;
    }
}
