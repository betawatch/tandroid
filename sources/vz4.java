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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class vz4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ vz4(mf6 mf6Var, TLRPC.TL_error tL_error, String str, String str2, String str3) {
        this.a = (byte) 14;
        this.c = mf6Var;
        this.d = tL_error;
        this.b = str;
        this.e = str2;
        this.f = str3;
    }

    private final void a() {
        jj7 jj7Var = (jj7) this.c;
        TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) this.d;
        TLRPC.TL_inputPhoneContact tL_inputPhoneContact = (TLRPC.TL_inputPhoneContact) this.e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
        TLRPC.TL_contacts_importContacts tL_contacts_importContacts = (TLRPC.TL_contacts_importContacts) this.b;
        d dVar = jj7Var.F1;
        jj7Var.A1 = false;
        if (tL_contacts_importedContacts == null) {
            gl.T3(jj7Var.Q1, true, 0.5f, true, true);
            gl.T3(jj7Var.R1, false, 0.5f, true, true);
            ij.c0(jj7Var.a, tL_error, dVar, tL_contacts_importContacts, new Object[0]);
        } else if (!tL_contacts_importedContacts.users.isEmpty()) {
            na7.q1(jj7Var.a).b4(tL_contacts_importedContacts.users, false);
            na7.q1(jj7Var.a).B3(tL_contacts_importedContacts.users.get(0), null, dVar, 1);
            jj7Var.dismiss();
        } else {
            if (dVar.getParentActivity() == null) {
                return;
            }
            gl.T3(jj7Var.Q1, true, 0.5f, true, true);
            gl.T3(jj7Var.R1, false, 0.5f, true, true);
            ij.u(dVar, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
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
        g15 g15Var;
        String h;
        byte[] bArr;
        TLRPC.GroupCall groupCall;
        byte b;
        byte b2;
        byte b3;
        km kmVar;
        km kmVar2;
        TLRPC.TL_wallPaper tL_wallPaper;
        p pVar;
        u21 d;
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
                y05 y05Var = (y05) this.d;
                hd hdVar = (hd) this.e;
                f05 f05Var = (f05) this.f;
                String str2 = (String) this.b;
                try {
                    hdVar.dismiss();
                    if (y05Var != null && !y05Var.d()) {
                        TL_wallet.WalletState walletState = cVar.e;
                        if ((walletState instanceof TL_wallet.TL_walletState) && (g15Var = cVar.c) != null && !g15Var.f(((TL_wallet.TL_walletState) walletState).public_key)) {
                            cVar.c.q(y6c.h(cVar.a).e(), ((TL_wallet.TL_walletState) cVar.e).public_key, y05Var, null);
                        }
                    }
                    f05Var.a(y05Var, str2);
                    if (y05Var != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (y05Var != null) {
                        y05Var.close();
                    }
                }
            case 1:
                w25 w25Var = (w25) this.c;
                JSONObject jSONObject = (JSONObject) this.d;
                p8c p8cVar = (p8c) this.e;
                String str3 = (String) this.b;
                s25 s25Var = (s25) this.f;
                if (jSONObject == null) {
                    p8cVar.a(str3);
                    return;
                } else {
                    w25Var.E(s25Var.a.id, s25Var.b, jSONObject, p8cVar);
                    return;
                }
            case 2:
                y05 y05Var2 = (y05) this.d;
                s25 s25Var2 = (s25) this.c;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.e;
                x15 x15Var = (x15) this.f;
                m25 m25Var = (m25) this.b;
                try {
                    bArr = Base64.decode(WalletEngine2.tonConnectCrypto(y05Var2, s25Var2.a, s25Var2.h, s25Var2.g, new JSONObject().put("challenge", Base64.encodeToString(tonconnectchallenge.challenge, 2))).getString("challengeAnswer"), 2);
                    h = null;
                } catch (Exception e) {
                    h = w25.h("decrypt challenge", e);
                    bArr = null;
                }
                gl.c3(new hn1(bArr, x15Var, h, m25Var, (byte) 26));
                return;
            case 3:
                w25 w25Var2 = (w25) this.c;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.e;
                s25 s25Var3 = (s25) this.f;
                p8c p8cVar2 = (p8c) this.b;
                y05 y05Var3 = (y05) this.d;
                try {
                    if (!na7.q1(w25Var2.a).X3.edit().putString(w25.k(s25Var3.a.id, s25Var3.b).concat(".transfer"), new JSONObject().put("boc", Base64.encodeToString(sendtransfer.data_normal, 2)).put("randomId", sendtransfer.random_id).toString()).commit()) {
                        throw new IllegalStateException("Could not save signed transfer");
                    }
                } catch (Exception e2) {
                    str = w25.h("save transfer", e2);
                }
                gl.c3(new e57((Object) w25Var2, str, (Object) p8cVar2, (Object) s25Var3, (Object) y05Var3, (Object) sendtransfer, (byte) 12));
                return;
            case 4:
                h75 h75Var = (h75) this.c;
                hd hdVar2 = (hd) this.e;
                TLObject tLObject = (TLObject) this.d;
                TL_phone.exportGroupCallInvite exportgroupcallinvite = (TL_phone.exportGroupCallInvite) this.f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                hdVar2.dismiss();
                if (!(tLObject instanceof TL_phone.exportedGroupCallInvite)) {
                    if (tL_error != null) {
                        new u21(h75Var.F, new e53()).g0(tL_error, false);
                        return;
                    }
                    return;
                }
                Context context = h75Var.getContext();
                int i5 = h75Var.a;
                TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
                String str4 = ((TL_phone.exportedGroupCallInvite) tLObject).link;
                wjb wjbVar = h75Var.J0;
                fc2 fc2Var = h75Var.T2;
                z81.l0(context, i5, inputGroupCall, str4, wjbVar, false, (fc2Var == null || (groupCall = fc2Var.b) == null || !groupCall.creator) ? false : true);
                return;
            case 5:
                h75 h75Var2 = (h75) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.f;
                String str5 = (String) this.b;
                h75Var2.getClass();
                d S = LaunchActivity.S();
                if (S != null) {
                    h26 h26Var = new h26(34, h75Var2.a, new e53(), S.getContext(), S);
                    h26Var.t1(null, arrayList, arrayList2, arrayList3, str5);
                    h26Var.show();
                    return;
                }
                return;
            case 6:
                m85 m85Var = (m85) this.c;
                yc ycVar = (yc) this.d;
                WindowManager windowManager = (WindowManager) this.e;
                FrameLayout frameLayout = (FrameLayout) this.f;
                r71 r71Var = (r71) this.b;
                m85Var.setVisibility(8);
                ycVar.setVisibility(8);
                windowManager.removeView(m85Var);
                windowManager.removeView(ycVar);
                windowManager.removeView(frameLayout);
                windowManager.removeView(r71Var);
                return;
            case 7:
                tk5 tk5Var = (tk5) this.c;
                Drawable drawable = (Drawable) this.d;
                ArrayList arrayList4 = (ArrayList) this.e;
                ArrayList arrayList5 = (ArrayList) this.f;
                String str6 = (String) this.b;
                if (drawable instanceof km) {
                    km kmVar3 = (km) drawable;
                    if (!kmVar3.o0) {
                        int i6 = 0;
                        byte b9 = 0;
                        while (i6 < arrayList4.size()) {
                            ImageReceiver imageReceiver = (ImageReceiver) arrayList4.get(i6);
                            if (i6 == 0) {
                                kmVar2 = kmVar3;
                                b = b9;
                                b2 = b6;
                                b3 = b8;
                            } else {
                                AnimatedFileDrawableStream animatedFileDrawableStream = kmVar3.v0;
                                if (animatedFileDrawableStream != null) {
                                    File file = kmVar3.H;
                                    long j2 = kmVar3.I;
                                    boolean z = kmVar3.J;
                                    TLRPC.Document document = animatedFileDrawableStream.c;
                                    gl5 gl5Var = animatedFileDrawableStream.d;
                                    b2 = b6;
                                    b3 = b8;
                                    long j3 = kmVar3.N;
                                    int i7 = kmVar3.K;
                                    b = b9;
                                    AnimatedFileDrawableStream animatedFileDrawableStream2 = kmVar3.v0;
                                    kmVar = new km(file, false, j2, z ? 1 : 0, document, gl5Var, document, j3, i7, (animatedFileDrawableStream2 == null || !animatedFileDrawableStream2.w) ? b2 : b3);
                                } else {
                                    b = b9;
                                    b2 = b6;
                                    b3 = b8;
                                    kmVar = new km(kmVar3.H, false, kmVar3.I, kmVar3.J ? 1 : 0, kmVar3.p0, null, null, kmVar3.N, kmVar3.K, false);
                                }
                                int[] iArr = kmVar.d;
                                int[] iArr2 = kmVar3.d;
                                iArr[b2] = iArr2[b2];
                                iArr[b3] = iArr2[b3];
                                kmVar2 = kmVar;
                            }
                            km kmVar4 = kmVar2;
                            if (imageReceiver.h0(kmVar2, tk5Var.d, tk5Var.m, false, ((Integer) arrayList5.get(i6)).intValue())) {
                                if (kmVar4 == kmVar3) {
                                    b9 = b3;
                                    i6++;
                                    b8 = b3;
                                    b6 = b2;
                                }
                            } else if (kmVar4 != kmVar3) {
                                kmVar4.u();
                            }
                            b9 = b;
                            i6++;
                            b8 = b3;
                            b6 = b2;
                        }
                        if (b9 == 0) {
                            kmVar3.u();
                        }
                        if (str6 == null) {
                            tk5Var.A.l(str6);
                            return;
                        }
                        return;
                    }
                }
                for (int i8 = 0; i8 < arrayList4.size(); i8++) {
                    ((ImageReceiver) arrayList4.get(i8)).h0(drawable, tk5Var.d, ((Integer) tk5Var.z.get(i8)).intValue(), false, ((Integer) arrayList5.get(i8)).intValue());
                }
                if (str6 == null) {
                }
                break;
            case 8:
                el5 el5Var = (el5) this.c;
                String str7 = (String) this.b;
                ArrayList arrayList6 = (ArrayList) this.d;
                BitmapDrawable bitmapDrawable = (BitmapDrawable) this.e;
                ArrayList arrayList7 = (ArrayList) this.f;
                el5Var.a();
                dl5 dl5Var = el5Var.c;
                if (dl5Var.b != null) {
                    StringBuilder k = b00.k(str7, "@");
                    k.append(dl5Var.b);
                    str7 = k.toString();
                }
                String str8 = str7;
                for (int i9 = 0; i9 < arrayList6.size(); i9++) {
                    ((ImageReceiver) arrayList6.get(i9)).h0(bitmapDrawable, str8, 0, false, ((Integer) arrayList7.get(i9)).intValue());
                }
                if (str8.contains("nocache")) {
                    return;
                }
                el5Var.d.c.l(str8, bitmapDrawable);
                return;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                kz5 kz5Var = (kz5) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                String str9 = LaunchActivity.C1;
                try {
                    kz5Var.run();
                } catch (Exception e3) {
                    fa4.g(e3, true);
                }
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    launchActivity.F0(ij.K(launchActivity, null, k96.M0(2131751093, null) + "\n" + tL_error2.text));
                    return;
                }
                TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) tLObject2;
                if (tL_wallPaper3.pattern) {
                    String str10 = tL_wallPaper3.slug;
                    TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper2.settings;
                    krc krcVar = new krc(str10, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, gl.q1(wallPaperSettings.rotation, false), r2.intensity / 100.0f, tL_wallPaper2.settings.motion);
                    krcVar.g = tL_wallPaper3;
                    tL_wallPaper3 = krcVar;
                }
                qmb qmbVar = new qmb(tL_wallPaper3, null, true);
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper2.settings;
                boolean z2 = wallPaperSettings2.blur;
                boolean z3 = wallPaperSettings2.motion;
                float f = wallPaperSettings2.intensity;
                qmbVar.H1 = z2;
                qmbVar.G1 = z3;
                qmbVar.p1 = f;
                launchActivity.t0(qmbVar);
                return;
            case 10:
                LaunchActivity launchActivity2 = (LaunchActivity) this.c;
                cj3 cj3Var = (cj3) this.d;
                d dVar = (d) this.e;
                TLRPC.User user = (TLRPC.User) this.f;
                String str11 = (String) this.b;
                String str12 = LaunchActivity.C1;
                ArrayList arrayList8 = launchActivity2.D0;
                if (cj3Var == null) {
                    if (dVar instanceof mu1) {
                        ((mu1) dVar).ba(user.id, str11, true);
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
                launchActivity2.t0(cj3Var);
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
                            un7.a().I(R.raw.error, k96.M0(2131753125, null), k96.M0(2131753126, null)).j();
                            return;
                        } else {
                            un7.a().g0(tL_error3, false);
                            return;
                        }
                    }
                    return;
                }
                if (tLObject3 instanceof TLRPC.TL_urlAuthResultRequest) {
                    un7.b(false, launchActivity3.P, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject3, null, null, null, false, null);
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_urlAuthResultAccepted) {
                    un7.b(false, launchActivity3.P, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject3, null, null, null, false, null);
                    return;
                } else {
                    if (tLObject3 instanceof TLRPC.TL_urlAuthResultDefault) {
                        ij.n0(S2, str13, false, true);
                        return;
                    }
                    return;
                }
            case 12:
                LaunchActivity launchActivity4 = (LaunchActivity) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                hd hdVar3 = (hd) this.e;
                kz5 kz5Var2 = (kz5) this.f;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.b;
                String str14 = LaunchActivity.C1;
                if (tLObject4 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) tLObject4;
                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.size() > 0 ? tL_theme.settings.get(0) : null;
                    if (themeSettings != null) {
                        akb O0 = bkb.O0(bkb.q0(themeSettings));
                        if (O0 != null) {
                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                TLRPC.TL_wallPaper tL_wallPaper4 = (TLRPC.TL_wallPaper) wallPaper;
                                ba4.G(launchActivity4.P);
                                if (!ba4.J(tL_wallPaper4.document, null, true, true).exists()) {
                                    launchActivity4.V0 = hdVar3;
                                    launchActivity4.U0 = true;
                                    launchActivity4.S0 = O0;
                                    launchActivity4.T0 = tL_theme;
                                    launchActivity4.R0 = tL_wallPaper4;
                                    launchActivity4.Q0 = ba4.r(null, tL_wallPaper4.document);
                                    ba4.G(launchActivity4.P).X(tL_wallPaper4.document, tL_wallPaper4, 1, 1);
                                    return;
                                }
                                tL_wallPaper = tL_wallPaper4;
                            } else {
                                tL_wallPaper = null;
                            }
                            try {
                                kz5Var2.run();
                            } catch (Exception e4) {
                                fa4.g(e4, true);
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
                            launchActivity4.P0 = ba4.r(null, document2);
                            launchActivity4.V0 = hdVar3;
                            ba4.G(launchActivity4.P).X(launchActivity4.T0.document, tL_theme, 1, 1);
                        }
                        b5 = 1;
                    }
                    b5 = b7;
                } else if (tL_error4 != null) {
                    break;
                }
                if (b5 != 0) {
                    try {
                        kz5Var2.run();
                    } catch (Exception e5) {
                        fa4.g(e5, true);
                    }
                    if (b5 == 1) {
                        launchActivity4.F0(ij.K(launchActivity4, k96.M0(2131743949, null), k96.M0(2131743932, null)));
                        return;
                    } else {
                        launchActivity4.F0(ij.K(launchActivity4, k96.M0(2131743949, null), k96.M0(2131743933, null)));
                        return;
                    }
                }
                return;
            case 13:
                a46 a46Var = (a46) this.c;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) this.f;
                String str15 = (String) this.b;
                int i11 = a46Var.b;
                LaunchActivity launchActivity5 = a46Var.a;
                if (tL_error5 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error5.text)) {
                        d = a46.d();
                        i = 2131747202;
                    } else {
                        d = a46.d();
                        i = 2131747203;
                    }
                    yjb.x(null, i, d, null);
                } else if (!launchActivity5.isFinishing()) {
                    if (tLObject5 instanceof TLRPC.TL_payments_paymentFormStars) {
                        y0a y0aVar = launchActivity5.Y0;
                        launchActivity5.Y0 = null;
                        gta.v(i11, false).W(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject5, new w36(a46Var, (byte) 1), new my5(y0aVar, b8));
                        return;
                    }
                    if (tLObject5 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject5;
                        na7.q1(i11).b4(paymentForm.users, false);
                        pVar = new p(paymentForm, null, str15, LaunchActivity.S());
                    } else {
                        pVar = tLObject5 instanceof TLRPC.PaymentReceipt ? new p((TLRPC.PaymentReceipt) tLObject5) : null;
                    }
                    if (pVar != null) {
                        y0a y0aVar2 = launchActivity5.Y0;
                        if (y0aVar2 != null) {
                            launchActivity5.Y0 = null;
                            pVar.a1 = new ny5(y0aVar2, b8);
                        }
                        a46Var.u(pVar, false);
                    }
                }
                a46Var.c();
                return;
            case 14:
                ((mf6) this.c).u1((TLRPC.TL_error) this.d, (String) this.b, (String) this.e, (String) this.f);
                return;
            case 15:
                ad6 ad6Var = (ad6) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                Bundle bundle = (Bundle) this.e;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.f;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) this.b;
                mf6 mf6Var = ad6Var.a0;
                if (tLObject6 instanceof TLRPC.TL_auth_sentCode) {
                    mf6Var.p1(bundle, (TLRPC.TL_auth_sentCode) tLObject6, true);
                    return;
                } else {
                    if (tL_error6 == null || tL_error6.text == null) {
                        return;
                    }
                    i2 = ((d) mf6Var).currentAccount;
                    ij.c0(i2, tL_error6, mf6Var, tL_auth_resendCode, new Object[0]);
                    return;
                }
            case 16:
                de6 de6Var = (de6) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                Bundle bundle2 = (Bundle) this.e;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.f;
                TL_account.sendVerifyEmailCode sendverifyemailcode = (TL_account.sendVerifyEmailCode) this.b;
                mf6 mf6Var2 = de6Var.F;
                mf6Var2.x1(false, true);
                de6Var.r = false;
                if (tLObject7 instanceof TL_account.sentEmailCode) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject7;
                    bundle2.putString("emailPattern", sentemailcode.email_pattern);
                    bundle2.putInt("length", sentemailcode.length);
                    mf6Var2.I1(13, true, bundle2, false);
                    return;
                }
                String str16 = tL_error7.text;
                if (str16 != null) {
                    if (str16.contains("EMAIL_INVALID")) {
                        de6Var.n();
                        return;
                    }
                    if (tL_error7.text.contains("EMAIL_NOT_ALLOWED")) {
                        mf6Var2.y1(k96.M0(2131745878, null), k96.M0(2131751188, null));
                        return;
                    }
                    if (tL_error7.text.contains("PHONE_PASSWORD_FLOOD")) {
                        mf6Var2.y1(k96.M0(2131745878, null), k96.M0(2131750670, "FloodWait"));
                        return;
                    }
                    if (tL_error7.text.contains("PHONE_NUMBER_FLOOD")) {
                        mf6Var2.y1(k96.M0(2131745878, null), k96.M0(2131747093, "PhoneNumberFlood"));
                        return;
                    }
                    if (tL_error7.text.contains("PHONE_CODE_EMPTY") || tL_error7.text.contains("PHONE_CODE_INVALID")) {
                        mf6Var2.y1(k96.M0(2131745878, null), k96.M0(2131748991, "InvalidCode"));
                        return;
                    }
                    if (tL_error7.text.contains("PHONE_CODE_EXPIRED")) {
                        mf6Var2.I1(0, true, null, true);
                        mf6Var2.y1(k96.M0(2131745878, null), k96.M0(2131752009, "CodeExpired"));
                        return;
                    } else if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                        mf6Var2.y1(k96.M0(2131745878, null), k96.M0(2131750670, "FloodWait"));
                        return;
                    } else {
                        if (tL_error7.code != -1000) {
                            i3 = ((d) mf6Var2).currentAccount;
                            ij.c0(i3, tL_error7, mf6Var2, sendverifyemailcode, de6Var.x);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 17:
                de6 de6Var2 = (de6) this.c;
                TLObject tLObject8 = (TLObject) this.d;
                Bundle bundle3 = (Bundle) this.e;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.f;
                TL_account.verifyEmail verifyemail = (TL_account.verifyEmail) this.b;
                mf6 mf6Var3 = de6Var2.F;
                if ((tLObject8 instanceof TL_account.TL_emailVerified) && mf6Var3.G == 3) {
                    mf6Var3.finishFragment();
                    mf6Var3.e0.run();
                    return;
                }
                if (tLObject8 instanceof TL_account.TL_emailVerifiedLogin) {
                    TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject8;
                    bundle3.putString("email", tL_emailVerifiedLogin.email);
                    mf6Var3.p1(bundle3, tL_emailVerifiedLogin.sent_code, true);
                    return;
                } else {
                    if (tL_error8 != null) {
                        if (tL_error8.text.contains("EMAIL_NOT_ALLOWED")) {
                            mf6Var3.y1(k96.M0(2131745878, null), k96.M0(2131751188, null));
                            return;
                        }
                        if (tL_error8.text.contains("EMAIL_TOKEN_INVALID")) {
                            mf6Var3.y1(k96.M0(2131745878, null), k96.M0(2131751185, null));
                            return;
                        } else {
                            if (tL_error8.code != -1000) {
                                i4 = ((d) mf6Var3).currentAccount;
                                ij.c0(i4, tL_error8, mf6Var3, verifyemail, new Object[0]);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
            case 18:
                final ve6 ve6Var = (ve6) this.c;
                TLObject tLObject9 = (TLObject) this.d;
                TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = (TLRPC.TL_inputInvoicePremiumAuthCode) this.e;
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.f;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.b;
                mf6 mf6Var4 = ve6Var.w;
                ve6Var.b.setLoading(false);
                if (tLObject9 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject9;
                    mf6Var4.getMessagesController().b4(paymentForm2.users, false);
                    p pVar2 = new p(tL_inputInvoicePremiumAuthCode, paymentForm2, null, null, 4, null, null, null, null, null, null, false, null, mf6Var4, true);
                    pVar2.W0 = true;
                    pVar2.d1 = new p8c() { // from class: se6
                        @Override // p8c
                        public final void a(Object obj) {
                            byte b10 = b6;
                            final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                            final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                            final ve6 ve6Var2 = ve6Var;
                            switch (b10) {
                                case 0:
                                    final byte b11 = 0;
                                    gl.c3(new Runnable() { // from class: te6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b12 = b11;
                                            TLRPC.PaymentForm paymentForm4 = paymentForm3;
                                            TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                            ve6 ve6Var3 = ve6Var2;
                                            switch (b12) {
                                                case 0:
                                                    String str17 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str18 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j4 = paymentForm4.form_id;
                                                    if (!ve6Var3.f) {
                                                        ve6Var3.f = true;
                                                        ve6Var3.h = str17;
                                                        ve6Var3.n = str18;
                                                        ve6Var3.r = j4;
                                                        ve6Var3.b.setLoading(true);
                                                        ve6Var3.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    String str19 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str20 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j5 = paymentForm4.form_id;
                                                    if (!ve6Var3.f) {
                                                        ve6Var3.f = true;
                                                        ve6Var3.h = str19;
                                                        ve6Var3.n = str20;
                                                        ve6Var3.r = j5;
                                                        ve6Var3.b.setLoading(true);
                                                        ve6Var3.o();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final byte b12 = 1;
                                    gl.c3(new Runnable() { // from class: te6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b122 = b12;
                                            TLRPC.PaymentForm paymentForm4 = paymentForm3;
                                            TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                            ve6 ve6Var3 = ve6Var2;
                                            switch (b122) {
                                                case 0:
                                                    String str17 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str18 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j4 = paymentForm4.form_id;
                                                    if (!ve6Var3.f) {
                                                        ve6Var3.f = true;
                                                        ve6Var3.h = str17;
                                                        ve6Var3.n = str18;
                                                        ve6Var3.r = j4;
                                                        ve6Var3.b.setLoading(true);
                                                        ve6Var3.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    String str19 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str20 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j5 = paymentForm4.form_id;
                                                    if (!ve6Var3.f) {
                                                        ve6Var3.f = true;
                                                        ve6Var3.h = str19;
                                                        ve6Var3.n = str20;
                                                        ve6Var3.r = j5;
                                                        ve6Var3.b.setLoading(true);
                                                        ve6Var3.o();
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
                    pVar2.e1 = new p8c() { // from class: se6
                        @Override // p8c
                        public final void a(Object obj) {
                            byte b10 = b8;
                            final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                            final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                            final ve6 ve6Var2 = ve6Var;
                            switch (b10) {
                                case 0:
                                    final byte b11 = 0;
                                    gl.c3(new Runnable() { // from class: te6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b122 = b11;
                                            TLRPC.PaymentForm paymentForm4 = paymentForm3;
                                            TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                            ve6 ve6Var3 = ve6Var2;
                                            switch (b122) {
                                                case 0:
                                                    String str17 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str18 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j4 = paymentForm4.form_id;
                                                    if (!ve6Var3.f) {
                                                        ve6Var3.f = true;
                                                        ve6Var3.h = str17;
                                                        ve6Var3.n = str18;
                                                        ve6Var3.r = j4;
                                                        ve6Var3.b.setLoading(true);
                                                        ve6Var3.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    String str19 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str20 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j5 = paymentForm4.form_id;
                                                    if (!ve6Var3.f) {
                                                        ve6Var3.f = true;
                                                        ve6Var3.h = str19;
                                                        ve6Var3.n = str20;
                                                        ve6Var3.r = j5;
                                                        ve6Var3.b.setLoading(true);
                                                        ve6Var3.o();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final byte b12 = 1;
                                    gl.c3(new Runnable() { // from class: te6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b122 = b12;
                                            TLRPC.PaymentForm paymentForm4 = paymentForm3;
                                            TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                            ve6 ve6Var3 = ve6Var2;
                                            switch (b122) {
                                                case 0:
                                                    String str17 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str18 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j4 = paymentForm4.form_id;
                                                    if (!ve6Var3.f) {
                                                        ve6Var3.f = true;
                                                        ve6Var3.h = str17;
                                                        ve6Var3.n = str18;
                                                        ve6Var3.r = j4;
                                                        ve6Var3.b.setLoading(true);
                                                        ve6Var3.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    String str19 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str20 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j5 = paymentForm4.form_id;
                                                    if (!ve6Var3.f) {
                                                        ve6Var3.f = true;
                                                        ve6Var3.h = str19;
                                                        ve6Var3.n = str20;
                                                        ve6Var3.r = j5;
                                                        ve6Var3.b.setLoading(true);
                                                        ve6Var3.o();
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
                    pVar2.f1 = new z02(ve6Var, b4);
                    mf6Var4.presentFragment(pVar2);
                    return;
                }
                if (tL_error9 == null) {
                    new u21(mf6Var4.a0, null).H(R.raw.error, k96.M0(2131743640, null));
                    return;
                } else {
                    if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error9.text)) {
                        gl.c3(new re6(ve6Var, b5));
                        return;
                    }
                    String str17 = tL_error9.text;
                    ve6Var.e = str17;
                    new u21(mf6Var4.a0, null).H(R.raw.error, k96.a0(null, null, 2131743639, str17));
                    return;
                }
            case 19:
                MediaController mediaController = (MediaController) this.c;
                File file2 = (File) this.d;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.e;
                byte[] bArr2 = (byte[]) this.f;
                cq6 cq6Var = (cq6) this.b;
                String[] strArr = MediaController.W1;
                if (file2.exists()) {
                    c = 3;
                    c2 = 4;
                } else {
                    boolean z4 = w01.a;
                    StringBuilder sb = new StringBuilder("file not found :( recordTimeCount ");
                    c = 3;
                    c2 = 4;
                    sb.append(mediaController.l1);
                    sb.append(" writedFrames");
                    sb.append(mediaController.m1);
                    fa4.g(new RuntimeException(sb.toString()), true);
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
                kk7.f(mediaController.i1).k(kk7.n2, new Object[0]);
                kk7 f2 = kk7.f(mediaController.i1);
                Integer valueOf = Integer.valueOf(mediaController.h1);
                String absolutePath = file2.getAbsolutePath();
                Float valueOf2 = Float.valueOf(cq6Var.h);
                Float valueOf3 = Float.valueOf(cq6Var.i);
                Object[] objArr = new Object[6];
                objArr[0] = valueOf;
                objArr[1] = tL_document;
                objArr[2] = absolutePath;
                objArr[c] = Boolean.TRUE;
                objArr[c2] = valueOf2;
                objArr[5] = valueOf3;
                f2.k(kk7.r2, objArr);
                return;
            case 20:
                s47 s47Var = (s47) this.c;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) this.d;
                fk1 fk1Var = (fk1) this.e;
                String str18 = (String) this.b;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) this.f;
                s47Var.E = true;
                if (tL_error10 != null || fk1Var == null) {
                    s47Var.l0();
                    return;
                }
                s47Var.w.l(str18, fk1Var);
                gxa gxaVar = s47Var.r;
                gxaVar.e = fk1Var;
                gxaVar.c = tL_loadAsyncGraph.x;
                s47Var.l0();
                return;
            case 21:
                na7 na7Var = (na7) this.c;
                TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) this.d;
                ArrayList arrayList9 = (ArrayList) this.e;
                vf6 vf6Var = (vf6) this.f;
                vf6 vf6Var2 = (vf6) this.b;
                na7Var.getMessagesStorage().j1(updates_difference.users, updates_difference.chats, true, false);
                if (!arrayList9.isEmpty()) {
                    SparseArray sparseArray = new SparseArray();
                    for (int i12 = 0; i12 < arrayList9.size(); i12++) {
                        TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) arrayList9.get(i12);
                        long[] X1 = na7Var.getMessagesStorage().X1(tL_updateMessageID.random_id, 0L, null, tL_updateMessageID.id, 0, -1, 0);
                        if (X1 != null) {
                            sparseArray.put(tL_updateMessageID.id, X1);
                        }
                    }
                    if (sparseArray.size() != 0) {
                        gl.c3(new r67(na7Var, sparseArray, b6));
                    }
                }
                Utilities.d.c(new s67(na7Var, updates_difference, vf6Var, vf6Var2, (byte) 0));
                return;
            case 22:
                na7 na7Var2 = (na7) this.c;
                TLRPC.TL_messages_messageViews tL_messages_messageViews = (TLRPC.TL_messages_messageViews) this.d;
                vf6 vf6Var3 = (vf6) this.e;
                vf6 vf6Var4 = (vf6) this.f;
                vf6 vf6Var5 = (vf6) this.b;
                na7Var2.b4(tL_messages_messageViews.users, false);
                na7Var2.V3(tL_messages_messageViews.chats, false);
                na7Var2.getNotificationCenter().k(77, vf6Var3, vf6Var4, vf6Var5, Boolean.FALSE);
                return;
            case 23:
                na7 na7Var3 = (na7) this.c;
                String str19 = (String) this.b;
                String str20 = (String) this.d;
                zjb zjbVar = (zjb) this.e;
                akb akbVar = (akb) this.f;
                HashMap hashMap = na7Var3.I2;
                if (str19 == null) {
                    hashMap.remove(str20);
                    return;
                }
                hashMap.put(str19, zjbVar != null ? zjbVar : akbVar);
                if (zjbVar == null) {
                    akbVar.J = str20;
                    akbVar.I = str19;
                } else {
                    zjbVar.v = str20;
                    zjbVar.u = str19;
                }
                na7Var3.getFileLoader().h0(false, 67108864, str20, true);
                na7Var3.getFileLoader().h0(false, 16777216, str19, true);
                return;
            case 24:
                na7 na7Var4 = (na7) this.c;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) this.d;
                Object obj = (TLObject) this.e;
                Long l = (Long) this.f;
                hy3 hy3Var = (hy3) this.b;
                if (tL_error11 == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) obj;
                    na7Var4.b4(tL_channels_channelParticipants.users, false);
                    na7Var4.V3(tL_channels_channelParticipants.chats, false);
                    na7Var4.getMessagesStorage().j1(tL_channels_channelParticipants.users, tL_channels_channelParticipants.chats, true, true);
                    ad7 messagesStorage = na7Var4.getMessagesStorage();
                    messagesStorage.a.c(new jc7(messagesStorage, l.longValue(), (ArrayList) tL_channels_channelParticipants.participants, (byte) 3));
                    na7Var4.o1.add(l);
                }
                na7Var4.n1.remove(l);
                if (hy3Var != null) {
                    hy3Var.a(obj instanceof TLRPC.TL_channels_channelParticipants ? (TLRPC.TL_channels_channelParticipants) obj : null);
                    return;
                }
                return;
            case 25:
                ((ad7) this.c).R1(null, (LongSparseIntArray) this.d, (LongSparseIntArray) this.e, (vf6) this.f, (LongSparseIntArray) this.b);
                return;
            case 26:
                ((m8c) this.c).a((ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f, (ArrayList) this.b);
                return;
            case 27:
                ad7 ad7Var = (ad7) this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                ArrayList arrayList11 = (ArrayList) this.e;
                ArrayList arrayList12 = (ArrayList) this.f;
                vf6 vf6Var6 = (vf6) this.b;
                ad7Var.getMessagesController().b4(arrayList10, true);
                ad7Var.getMessagesController().V3(arrayList11, true);
                ad7Var.getMessagesController().Y3(arrayList12);
                for (int i13 = 0; i13 < vf6Var6.m(); i13++) {
                    long j4 = vf6Var6.j(i13);
                    wc7 wc7Var = (wc7) vf6Var6.n(i13);
                    if (ad7Var.getMessagesController().r2(j4) || ad7Var.r0(8, j4) || ad7Var.getMessagesController().y2(j4)) {
                        na7 messagesController = ad7Var.getMessagesController();
                        ad7 messagesStorage2 = messagesController.getMessagesStorage();
                        j = j4;
                        messagesStorage2.a.c(new de2((Object) messagesStorage2, j4, (Object) new x67(messagesController, j4), (byte) 5));
                    } else {
                        j = j4;
                    }
                    na7 messagesController2 = ad7Var.getMessagesController();
                    int i14 = wc7Var.a;
                    messagesController2.l3(j, i14, i14, wc7Var.b, false, 0L, wc7Var.c, true, 0);
                }
                return;
            case 28:
                a();
                return;
            default:
                ((im7) this.c).C((ArrayList) this.d, (vf6) this.e, (ArrayList) this.f, (Collection) this.b);
                return;
        }
    }

    public /* synthetic */ vz4(w25 w25Var, TL_wallet.sendTransfer sendtransfer, s25 s25Var, p8c p8cVar, y05 y05Var) {
        this.a = (byte) 3;
        this.c = w25Var;
        this.e = sendtransfer;
        this.f = s25Var;
        this.b = p8cVar;
        this.d = y05Var;
    }

    public /* synthetic */ vz4(h75 h75Var, hd hdVar, TLObject tLObject, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLRPC.TL_error tL_error) {
        this.a = (byte) 4;
        this.c = h75Var;
        this.e = hdVar;
        this.d = tLObject;
        this.f = exportgroupcallinvite;
        this.b = tL_error;
    }

    public /* synthetic */ vz4(y05 y05Var, s25 s25Var, TL_wallet.tonConnectChallenge tonconnectchallenge, x15 x15Var, m25 m25Var) {
        this.a = (byte) 2;
        this.d = y05Var;
        this.c = s25Var;
        this.e = tonconnectchallenge;
        this.f = x15Var;
        this.b = m25Var;
    }

    public /* synthetic */ vz4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = obj5;
    }

    public /* synthetic */ vz4(Object obj, Object obj2, Object obj3, String str, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = str;
        this.f = obj4;
    }

    public /* synthetic */ vz4(Object obj, String str, Serializable serializable, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = str;
        this.d = serializable;
        this.e = obj2;
        this.f = obj3;
    }
}
