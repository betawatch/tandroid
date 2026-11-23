package org.telegram.ui;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class xn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xn(Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr;
        byte[] bArr2;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = 14;
        r10 = null;
        byte[] bArr3 = null;
        r10 = null;
        String str = null;
        switch (this.a) {
            case 0:
                io ioVar = (io) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.e;
                boolean z10 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject;
                    ioVar.m0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = ioVar.Z;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z10) {
                        if (ioVar.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ioVar.getParentActivity());
                        alertDialog$Builder.a.U = org.telegram.messenger.gd.N0(2131745829, null);
                        alertDialog$Builder.a.S = org.telegram.messenger.gd.N0(2131745827, null);
                        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131747637, null), null);
                        ioVar.showDialog(alertDialog$Builder.a);
                    }
                }
                org.telegram.ui.Components.d80 d80Var = ioVar.H;
                if (d80Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ioVar.m0;
                    d80Var.setLink(tL_chatInviteExported2 != null ? tL_chatInviteExported2.link : null);
                    ioVar.H.c(ioVar.m0, ioVar.a0);
                    return;
                }
                return;
            case 1:
                qo qoVar = (qo) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z11 = this.b;
                org.telegram.ui.Components.r70 r70Var = (org.telegram.ui.Components.r70) this.e;
                chat.join_to_send = z11;
                org.telegram.messenger.mp messagesController = qoVar.y.d.getMessagesController();
                long j3 = chat.id;
                di.p6 p6Var = new di.p6(qoVar, z11, chat, 17);
                ah ahVar = new ah(i13, qoVar, r70Var);
                messagesController.getClass();
                TLRPC.TL_channels_toggleJoinToSend tL_channels_toggleJoinToSend = new TLRPC.TL_channels_toggleJoinToSend();
                tL_channels_toggleJoinToSend.channel = messagesController.j1(j3);
                tL_channels_toggleJoinToSend.enabled = z11;
                messagesController.getConnectionsManager().sendRequest(tL_channels_toggleJoinToSend, new org.telegram.messenger.ci(messagesController, p6Var, ahVar, 8), 64);
                return;
            case 2:
                qo qoVar2 = (qo) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z12 = this.b;
                org.telegram.ui.Components.q70 q70Var = (org.telegram.ui.Components.q70) this.e;
                chat2.join_request = z12;
                qoVar2.y.d.getMessagesController().o5(chat2.id, 0L, z12, false, false, new po(qoVar2, 0), new ah(13, qoVar2, q70Var));
                return;
            case 3:
                boolean z13 = this.b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.e;
                if (z13 && org.telegram.messenger.v3.T(chat3)) {
                    View d = alertDialog$Builder2.a.d(-1);
                    if (d instanceof TextView) {
                        TextView textView = (TextView) d;
                        if (zArr[0]) {
                            textView.setText(org.telegram.messenger.gd.N0(org.telegram.messenger.v3.V(chat3) ? 2131752410 : 2131751518, null));
                            return;
                        }
                        if (chat3.monoforum) {
                            textView.setText(org.telegram.messenger.gd.N0(2131748802, null));
                            return;
                        } else if (chat3.megagroup) {
                            textView.setText(org.telegram.messenger.gd.N0(2131748798, null));
                            return;
                        } else {
                            textView.setText(org.telegram.messenger.gd.N0(2131748811, null));
                            return;
                        }
                    }
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.jk jkVar = (org.telegram.ui.Components.jk) this.c;
                String str2 = (String) this.d;
                boolean z14 = this.b;
                ArrayList arrayList = (ArrayList) this.e;
                jkVar.getClass();
                String lowerCase = str2.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.g3(new org.telegram.ui.Components.xd(i13, jkVar, new ArrayList()));
                    return;
                }
                String T0 = org.telegram.messenger.gd.E0().T0(lowerCase, true, false);
                if (!lowerCase.equals(T0) && T0.length() != 0) {
                    str = T0;
                }
                int i14 = (str != null ? 1 : 0) + 1;
                String[] strArr = new String[i14];
                strArr[0] = lowerCase;
                if (str != null) {
                    strArr[1] = str;
                }
                ArrayList arrayList2 = new ArrayList();
                if (!z14) {
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        org.telegram.ui.Components.ek ekVar = (org.telegram.ui.Components.ek) arrayList.get(i15);
                        File file = ekVar.f;
                        if (file != null && !file.isDirectory()) {
                            int i16 = 0;
                            while (true) {
                                if (i16 < i14) {
                                    String str3 = strArr[i16];
                                    String str4 = ekVar.b;
                                    if (str4 != null ? str4.toLowerCase().contains(str3) : false) {
                                        arrayList2.add(ekVar);
                                    } else {
                                        i16++;
                                    }
                                }
                            }
                        }
                    }
                }
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.xd(i13, jkVar, arrayList2));
                return;
            case 5:
                org.telegram.ui.Components.o70 o70Var = (org.telegram.ui.Components.o70) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                boolean z15 = this.b;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.e;
                org.telegram.ui.ActionBar.g2 g2Var = o70Var.o1;
                if (g2Var == null || g2Var.getParentActivity() == null) {
                    return;
                }
                if (tL_error2 != null) {
                    if ("INVITE_REQUEST_SENT".equals(tL_error2.text)) {
                        o70Var.setOnDismissListener(new org.telegram.ui.Components.k70(1, o70Var, z15));
                    } else {
                        org.telegram.ui.Components.b5.c0(o70Var.a, tL_error2, g2Var, tL_messages_importChatInvite, new Object[0]);
                    }
                }
                o70Var.dismiss();
                return;
            case 6:
                org.telegram.ui.Components.yv0 yv0Var = (org.telegram.ui.Components.yv0) this.c;
                TLObject tLObject2 = (TLObject) this.e;
                boolean z16 = this.b;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.d;
                org.telegram.ui.Components.jw0 jw0Var = yv0Var.a;
                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                    org.telegram.messenger.ri.d0(org.telegram.messenger.i10.t0).N1(tL_messages_stickerSet, true);
                    if (z16) {
                        org.telegram.messenger.ri.d0(org.telegram.messenger.i10.t0).k2(null, tLObject2, 0, null, false, false);
                    } else {
                        jw0Var.N1 = tL_messages_stickerSet;
                        jw0Var.S0();
                        jw0Var.a1();
                    }
                }
                t1Var.dismiss();
                return;
            case 7:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z17 = this.b;
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) this.e;
                if (w2Var != null && !w2Var.J) {
                    w2Var.A0(true);
                    editTextBoldCursor.requestFocus();
                    if (z17) {
                        org.telegram.messenger.g0.g3(new qg(editTextBoldCursor, 3));
                        return;
                    }
                    return;
                }
                if (t1Var2 == null || !t1Var2.isShowing()) {
                    return;
                }
                t1Var2.l(true);
                editTextBoldCursor.requestFocus();
                if (z17) {
                    org.telegram.messenger.g0.g3(new qg(editTextBoldCursor, 4));
                    return;
                }
                return;
            case 8:
                e40 e40Var = (e40) this.c;
                TLObject tLObject3 = (TLObject) this.e;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.d;
                boolean z18 = this.b;
                if (tLObject3 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject3;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        e40Var.A1(null, tL_chatInviteExported3.link, true, z18);
                        return;
                    }
                }
                return;
            case 9:
                g50 g50Var = (g50) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject4 = (TLObject) this.e;
                boolean z19 = this.b;
                if (tL_error3 == null) {
                    g50Var.f = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (z19) {
                        if (g50Var.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(g50Var.getParentActivity());
                        alertDialog$Builder3.a.U = org.telegram.messenger.gd.N0(2131745829, null);
                        alertDialog$Builder3.a.S = org.telegram.messenger.gd.N0(2131745827, null);
                        alertDialog$Builder3.h(org.telegram.messenger.gd.N0(2131747637, null), null);
                        g50Var.showDialog(alertDialog$Builder3.a);
                    }
                }
                g50Var.e = false;
                g50Var.a.f();
                return;
            case 10:
                tj0 tj0Var = (tj0) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                boolean z20 = this.b;
                fk0 fk0Var = tj0Var.e;
                if (tL_error4 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject5;
                    fk0Var.K = password;
                    TwoStepVerificationActivity.r0(password);
                    fk0Var.F1(z20);
                    return;
                }
                return;
            case 11:
                tj0 tj0Var2 = (tj0) this.c;
                TLObject tLObject6 = (TLObject) this.e;
                String str5 = (String) this.d;
                boolean z21 = this.b;
                fk0 fk0Var2 = tj0Var2.e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject6;
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    fk0Var2.d1 = tL_secureSecretSettings.secure_secret;
                    fk0Var2.c1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        fk0Var2.f1 = Utilities.s(bArr, org.telegram.messenger.g0.h1(str5), bArr);
                    } else {
                        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                            TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                            byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                            fk0Var2.f1 = Utilities.m(org.telegram.messenger.g0.h1(str5), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                            bArr2 = bArr4;
                            org.telegram.messenger.g0.g3(new xn(tj0Var2, passwordsettings, z21, bArr2, 12));
                            return;
                        }
                        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                            org.telegram.messenger.g0.g3(new gf0(tj0Var2, 7));
                            return;
                        }
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = fk0Var2.K.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr5 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        fk0Var2.f1 = Utilities.m(org.telegram.messenger.g0.h1(str5), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr5;
                    } else {
                        bArr = new byte[0];
                    }
                    fk0Var2.d1 = null;
                    fk0Var2.c1 = 0L;
                }
                bArr2 = bArr;
                org.telegram.messenger.g0.g3(new xn(tj0Var2, passwordsettings, z21, bArr2, 12));
                return;
            case 12:
                tj0 tj0Var3 = (tj0) this.c;
                TL_account.passwordSettings passwordsettings2 = (TL_account.passwordSettings) this.d;
                boolean z22 = this.b;
                byte[] bArr6 = (byte[]) this.e;
                fk0 fk0Var3 = tj0Var3.e;
                fk0Var3.e1 = passwordsettings2.email;
                if (z22) {
                    fk0Var3.f1 = fk0Var3.Q0;
                }
                byte[] bArr7 = fk0Var3.d1;
                byte[] bArr8 = fk0Var3.f1;
                if (bArr7 != null && bArr7.length == 32) {
                    byte[] bArr9 = new byte[32];
                    System.arraycopy(bArr8, 0, bArr9, 0, 32);
                    byte[] bArr10 = new byte[16];
                    System.arraycopy(bArr8, 32, bArr10, 0, 16);
                    byte[] bArr11 = new byte[32];
                    System.arraycopy(bArr7, 0, bArr11, 0, 32);
                    Utilities.b(bArr11, bArr9, bArr10, 0, 32, 0, 0);
                    bArr3 = bArr11;
                }
                if (fk0.d1(bArr3, Long.valueOf(fk0Var3.c1)) && bArr6.length != 0 && fk0Var3.c1 != 0) {
                    if (fk0Var3.c != 0) {
                        tj0Var3.a();
                        return;
                    }
                    TL_account.getAllSecureValues getallsecurevalues = new TL_account.getAllSecureValues();
                    i10 = ((org.telegram.ui.ActionBar.g2) fk0Var3).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getallsecurevalues, new rj0(tj0Var3, 0));
                    return;
                }
                if (z22) {
                    i7 = ((org.telegram.ui.ActionBar.g2) fk0Var3).currentAccount;
                    org.telegram.messenger.i10.i(i7).u();
                    fk0Var3.O0 = 0;
                    fk0Var3.W1();
                    return;
                }
                TL_account.authorizationForm authorizationform = fk0Var3.E;
                if (authorizationform != null) {
                    authorizationform.values.clear();
                    fk0Var3.E.errors.clear();
                }
                byte[] bArr12 = fk0Var3.d1;
                if (bArr12 == null || bArr12.length == 0) {
                    Utilities.e.c(new lc0(tj0Var3, tj0Var3.b, tj0Var3.d, i13));
                    return;
                } else {
                    tj0Var3.b();
                    return;
                }
            case 13:
                kl0 kl0Var = (kl0) this.c;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                boolean z23 = this.b;
                if (tL_error5 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject7;
                    kl0Var.b0 = password2;
                    TwoStepVerificationActivity.r0(password2);
                    kl0Var.G0(z23);
                    return;
                }
                return;
            case 14:
                za1.h0((za1) this.c, (TLRPC.TL_error) this.d, (TLObject) this.e, this.b);
                return;
            case 15:
                p4.d0 d0Var = (p4.d0) this.c;
                boolean z24 = this.b;
                p4.v vVar = (p4.v) this.d;
                Runnable runnable = (Runnable) this.e;
                p4.d1 d1Var = d0Var.g;
                if (z24) {
                    p4.j1 j1Var = new p4.j1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.t y10 = d1Var.b.y(vVar);
                        if (y10 != null) {
                            i11 = y10.b(p4.d0.B).n;
                        } else if (d0Var.h(vVar)) {
                            c8.u9.b(new p4.n1(0));
                            i11 = 0;
                        } else {
                            c8.u9.b(new p4.n1(-100));
                        }
                        p4.u uVar = vVar.d;
                        if (uVar != null) {
                            uVar.j(i11, j1Var);
                        }
                    } catch (DeadObjectException unused) {
                        d1Var.b.K(vVar);
                        c8.u9.b(new p4.n1(-100));
                    } catch (RemoteException e10) {
                        h2.a.m("MediaSessionImpl", "Exception in " + vVar, e10);
                        c8.u9.b(new p4.n1(-1));
                    }
                }
                runnable.run();
                d1Var.b.m(vVar);
                return;
            case 16:
                sg.h0 h0Var = (sg.h0) this.c;
                a8.xa xaVar = (a8.xa) this.d;
                a8.xa xaVar2 = (a8.xa) this.e;
                boolean z25 = this.b;
                int i17 = 0;
                h0Var.f.f(new sg.f0(h0Var, xaVar, i17));
                h0Var.f.f(new sg.f0(h0Var, xaVar2, i17));
                h0Var.E = z25;
                return;
            case 17:
                org.telegram.ui.Components.kc kcVar = (org.telegram.ui.Components.kc) this.c;
                boolean z26 = this.b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.d;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.e;
                org.telegram.ui.Components.fc I = kcVar.I(R.raw.star_premium_2, z26 ? org.telegram.messenger.gd.N0(2131753478, "BoostingGiveawayCreated") : org.telegram.messenger.gd.N0(2131753589, "BoostingAwardsCreated"), org.telegram.messenger.g0.R2(z26 ? org.telegram.messenger.gd.N0(org.telegram.messenger.v3.V(chat4) ? 2131753552 : 2131753551, null) : org.telegram.messenger.gd.N0(org.telegram.messenger.v3.V(chat4) ? 2131753554 : 2131753553, null), org.telegram.ui.ActionBar.n6.xj, 0, new di.u2(chat4), i6Var));
                I.j = 5000;
                I.j();
                return;
            default:
                zi.u0 u0Var = (zi.u0) this.c;
                zi.x xVar = (zi.x) this.d;
                boolean z27 = this.b;
                zi.q0 q0Var = (zi.q0) this.e;
                long j10 = u0Var.q;
                long nanoTime = System.nanoTime();
                int i18 = 2;
                try {
                    xVar.g();
                    long h = xVar.h();
                    u0Var.m.b("active output finalized: size=" + xVar.a.length() + ", durationMs=" + h + ", elapsedMs=" + zi.u0.f(nanoTime));
                    u0Var.g();
                    boolean z28 = h > j10;
                    if (z27 && !z28) {
                        u0Var.k.execute(new zi.g0(u0Var, q0Var, xVar.a, h, true));
                        return;
                    }
                    File file2 = xVar.a;
                    try {
                        synchronized (xVar) {
                            i12 = xVar.s;
                        }
                        try {
                            u0Var.u(file2, i12, 0L, Math.min(j10, h), z27, z28 ? 1 : 2);
                            c8.pe.c(file2);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            c8.pe.c(file2);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e11) {
                    u0Var.i.post(new zi.e0(u0Var, e11, i18));
                    return;
                }
        }
    }

    public /* synthetic */ xn(Object obj, Object obj2, boolean z10, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
    }

    public /* synthetic */ xn(Object obj, TLObject tLObject, Object obj2, boolean z10, int i7) {
        this.a = i7;
        this.c = obj;
        this.e = tLObject;
        this.d = obj2;
        this.b = z10;
    }

    public /* synthetic */ xn(Object obj, boolean z10, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ xn(org.telegram.ui.Components.yv0 yv0Var, TLObject tLObject, boolean z10, org.telegram.ui.ActionBar.t1 t1Var) {
        this.a = 6;
        this.c = yv0Var;
        this.e = tLObject;
        this.b = z10;
        this.d = t1Var;
    }

    public /* synthetic */ xn(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.a = 3;
        this.b = z10;
        this.c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
