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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xn(Object obj, Object obj2, Object obj3, boolean z9, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.util.concurrent.Executor, java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Runnable, wi.g0] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [wi.t0] */
    /* JADX WARN: Type inference failed for: r12v7, types: [wi.o] */
    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr;
        byte[] bArr2;
        int i7;
        int i10;
        int i11;
        ?? r12;
        long h;
        boolean z9;
        int i12;
        r9 = null;
        byte[] bArr3 = null;
        r9 = null;
        String str = null;
        switch (this.a) {
            case 0:
                io ioVar = (io) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.e;
                boolean z10 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject;
                    ioVar.l0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = ioVar.Y;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z10) {
                        if (ioVar.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ioVar.getParentActivity());
                        alertDialog$Builder.a.T = org.telegram.messenger.id.M0(2131746025, null);
                        alertDialog$Builder.a.R = org.telegram.messenger.id.M0(2131746023, null);
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131747831, null), null);
                        ioVar.showDialog(alertDialog$Builder.a);
                    }
                }
                org.telegram.ui.Components.q70 q70Var = ioVar.G;
                if (q70Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ioVar.l0;
                    q70Var.setLink(tL_chatInviteExported2 != null ? tL_chatInviteExported2.link : null);
                    ioVar.G.c(ioVar.l0, ioVar.Z);
                    return;
                }
                return;
            case 1:
                qo qoVar = (qo) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z11 = this.b;
                org.telegram.ui.Components.e70 e70Var = (org.telegram.ui.Components.e70) this.e;
                chat.join_to_send = z11;
                org.telegram.messenger.qp messagesController = qoVar.y.d.getMessagesController();
                long j3 = chat.id;
                bi.u7 u7Var = new bi.u7(qoVar, z11, chat, 17);
                oe oeVar = new oe(26, qoVar, e70Var);
                messagesController.getClass();
                TLRPC.TL_channels_toggleJoinToSend tL_channels_toggleJoinToSend = new TLRPC.TL_channels_toggleJoinToSend();
                tL_channels_toggleJoinToSend.channel = messagesController.h1(j3);
                tL_channels_toggleJoinToSend.enabled = z11;
                messagesController.getConnectionsManager().sendRequest(tL_channels_toggleJoinToSend, new org.telegram.messenger.di(messagesController, u7Var, oeVar, 8), 64);
                return;
            case 2:
                qo qoVar2 = (qo) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z12 = this.b;
                org.telegram.ui.Components.d70 d70Var = (org.telegram.ui.Components.d70) this.e;
                chat2.join_request = z12;
                qoVar2.y.d.getMessagesController().c5(chat2.id, 0L, z12, false, false, new po(qoVar2, 0), new oe(25, qoVar2, d70Var));
                return;
            case 3:
                boolean z13 = this.b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.e;
                if (z13 && org.telegram.messenger.t3.T(chat3)) {
                    View d = alertDialog$Builder2.a.d(-1);
                    if (d instanceof TextView) {
                        TextView textView = (TextView) d;
                        if (zArr[0]) {
                            textView.setText(org.telegram.messenger.id.M0(org.telegram.messenger.t3.V(chat3) ? 2131752422 : 2131751530, null));
                            return;
                        }
                        if (chat3.monoforum) {
                            textView.setText(org.telegram.messenger.id.M0(2131748995, null));
                            return;
                        } else if (chat3.megagroup) {
                            textView.setText(org.telegram.messenger.id.M0(2131748991, null));
                            return;
                        } else {
                            textView.setText(org.telegram.messenger.id.M0(2131749004, null));
                            return;
                        }
                    }
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.tj tjVar = (org.telegram.ui.Components.tj) this.c;
                String str2 = (String) this.d;
                boolean z14 = this.b;
                ArrayList arrayList = (ArrayList) this.e;
                tjVar.getClass();
                String lowerCase = str2.trim().toLowerCase();
                int i13 = 21;
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new fq(i13, tjVar, new ArrayList()));
                    return;
                }
                String S0 = org.telegram.messenger.id.E0().S0(lowerCase, true, false);
                if (!lowerCase.equals(S0) && S0.length() != 0) {
                    str = S0;
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
                        org.telegram.ui.Components.oj ojVar = (org.telegram.ui.Components.oj) arrayList.get(i15);
                        File file = ojVar.f;
                        if (file != null && !file.isDirectory()) {
                            int i16 = 0;
                            while (true) {
                                if (i16 < i14) {
                                    String str3 = strArr[i16];
                                    String str4 = ojVar.b;
                                    if (str4 != null ? str4.toLowerCase().contains(str3) : false) {
                                        arrayList2.add(ojVar);
                                    } else {
                                        i16++;
                                    }
                                }
                            }
                        }
                    }
                }
                org.telegram.messenger.g0.h3(new fq(i13, tjVar, arrayList2));
                return;
            case 5:
                org.telegram.ui.Components.b70 b70Var = (org.telegram.ui.Components.b70) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                boolean z15 = this.b;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.e;
                org.telegram.ui.ActionBar.f2 f2Var = b70Var.n1;
                if (f2Var == null || f2Var.getParentActivity() == null) {
                    return;
                }
                if (tL_error2 != null) {
                    if ("INVITE_REQUEST_SENT".equals(tL_error2.text)) {
                        b70Var.setOnDismissListener(new org.telegram.ui.Components.x60(1, b70Var, z15));
                    } else {
                        org.telegram.ui.Components.u4.c0(b70Var.a, tL_error2, f2Var, tL_messages_importChatInvite, new Object[0]);
                    }
                }
                b70Var.dismiss();
                return;
            case 6:
                org.telegram.ui.Components.nv0 nv0Var = (org.telegram.ui.Components.nv0) this.c;
                TLObject tLObject2 = (TLObject) this.e;
                boolean z16 = this.b;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.d;
                org.telegram.ui.Components.yv0 yv0Var = nv0Var.a;
                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                    org.telegram.messenger.ui.b0(org.telegram.messenger.p10.s0).I1(tL_messages_stickerSet, true);
                    if (z16) {
                        org.telegram.messenger.ui.b0(org.telegram.messenger.p10.s0).f2(null, tLObject2, 0, null, false, false);
                    } else {
                        yv0Var.M1 = tL_messages_stickerSet;
                        yv0Var.R0();
                        yv0Var.Z0();
                    }
                }
                u1Var.dismiss();
                return;
            case 7:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z17 = this.b;
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) this.e;
                if (w2Var != null && !w2Var.I) {
                    w2Var.A0(true);
                    editTextBoldCursor.requestFocus();
                    if (z17) {
                        org.telegram.messenger.g0.h3(new rg(editTextBoldCursor, 3));
                        return;
                    }
                    return;
                }
                if (u1Var2 == null || !u1Var2.isShowing()) {
                    return;
                }
                u1Var2.l(true);
                editTextBoldCursor.requestFocus();
                if (z17) {
                    org.telegram.messenger.g0.h3(new rg(editTextBoldCursor, 4));
                    return;
                }
                return;
            case 8:
                f40 f40Var = (f40) this.c;
                TLObject tLObject3 = (TLObject) this.e;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.d;
                boolean z18 = this.b;
                if (tLObject3 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject3;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        f40Var.z1(null, tL_chatInviteExported3.link, true, z18);
                        return;
                    }
                }
                return;
            case 9:
                i50 i50Var = (i50) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject4 = (TLObject) this.e;
                boolean z19 = this.b;
                if (tL_error3 == null) {
                    i50Var.f = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (z19) {
                        if (i50Var.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(i50Var.getParentActivity());
                        alertDialog$Builder3.a.T = org.telegram.messenger.id.M0(2131746025, null);
                        alertDialog$Builder3.a.R = org.telegram.messenger.id.M0(2131746023, null);
                        alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131747831, null), null);
                        i50Var.showDialog(alertDialog$Builder3.a);
                    }
                }
                i50Var.e = false;
                i50Var.a.f();
                return;
            case 10:
                sj0 sj0Var = (sj0) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                boolean z20 = this.b;
                ek0 ek0Var = sj0Var.e;
                if (tL_error4 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject5;
                    ek0Var.J = password;
                    TwoStepVerificationActivity.r0(password);
                    ek0Var.F1(z20);
                    return;
                }
                return;
            case 11:
                sj0 sj0Var2 = (sj0) this.c;
                TLObject tLObject6 = (TLObject) this.e;
                String str5 = (String) this.d;
                boolean z21 = this.b;
                ek0 ek0Var2 = sj0Var2.e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject6;
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    ek0Var2.c1 = tL_secureSecretSettings.secure_secret;
                    ek0Var2.b1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        ek0Var2.e1 = Utilities.s(bArr, org.telegram.messenger.g0.h1(str5), bArr);
                    } else {
                        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                            TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                            byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                            ek0Var2.e1 = Utilities.m(org.telegram.messenger.g0.h1(str5), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                            bArr2 = bArr4;
                            org.telegram.messenger.g0.h3(new xn(sj0Var2, passwordsettings, z21, bArr2, 12));
                            return;
                        }
                        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                            org.telegram.messenger.g0.h3(new hf0(sj0Var2, 7));
                            return;
                        }
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = ek0Var2.J.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr5 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        ek0Var2.e1 = Utilities.m(org.telegram.messenger.g0.h1(str5), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr5;
                    } else {
                        bArr = new byte[0];
                    }
                    ek0Var2.c1 = null;
                    ek0Var2.b1 = 0L;
                }
                bArr2 = bArr;
                org.telegram.messenger.g0.h3(new xn(sj0Var2, passwordsettings, z21, bArr2, 12));
                return;
            case 12:
                sj0 sj0Var3 = (sj0) this.c;
                TL_account.passwordSettings passwordsettings2 = (TL_account.passwordSettings) this.d;
                boolean z22 = this.b;
                byte[] bArr6 = (byte[]) this.e;
                ek0 ek0Var3 = sj0Var3.e;
                ek0Var3.d1 = passwordsettings2.email;
                if (z22) {
                    ek0Var3.e1 = ek0Var3.P0;
                }
                byte[] bArr7 = ek0Var3.c1;
                byte[] bArr8 = ek0Var3.e1;
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
                if (ek0.d1(bArr3, Long.valueOf(ek0Var3.b1)) && bArr6.length != 0 && ek0Var3.b1 != 0) {
                    if (ek0Var3.c != 0) {
                        sj0Var3.a();
                        return;
                    }
                    TL_account.getAllSecureValues getallsecurevalues = new TL_account.getAllSecureValues();
                    i10 = ((org.telegram.ui.ActionBar.f2) ek0Var3).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getallsecurevalues, new qj0(sj0Var3, 0));
                    return;
                }
                if (z22) {
                    i7 = ((org.telegram.ui.ActionBar.f2) ek0Var3).currentAccount;
                    org.telegram.messenger.p10.i(i7).u();
                    ek0Var3.N0 = 0;
                    ek0Var3.W1();
                    return;
                }
                TL_account.authorizationForm authorizationform = ek0Var3.D;
                if (authorizationform != null) {
                    authorizationform.values.clear();
                    ek0Var3.D.errors.clear();
                }
                byte[] bArr12 = ek0Var3.c1;
                if (bArr12 == null || bArr12.length == 0) {
                    Utilities.e.c(new pc0(sj0Var3, sj0Var3.b, sj0Var3.d, 14));
                    return;
                } else {
                    sj0Var3.b();
                    return;
                }
            case 13:
                kl0 kl0Var = (kl0) this.c;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                boolean z23 = this.b;
                if (tL_error5 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject7;
                    kl0Var.a0 = password2;
                    TwoStepVerificationActivity.r0(password2);
                    kl0Var.G0(z23);
                    return;
                }
                return;
            case 14:
                cb1.h0((cb1) this.c, (TLRPC.TL_error) this.d, (TLObject) this.e, this.b);
                return;
            case 15:
                p4.d0 d0Var = (p4.d0) this.c;
                boolean z24 = this.b;
                p4.v vVar = (p4.v) this.d;
                Runnable runnable = (Runnable) this.e;
                p4.c1 c1Var = d0Var.g;
                if (z24) {
                    p4.i1 i1Var = new p4.i1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.s C = c1Var.b.C(vVar);
                        if (C != null) {
                            i11 = C.b(p4.d0.B).n;
                        } else if (d0Var.h(vVar)) {
                            c8.s9.b(new p4.m1(0));
                            i11 = 0;
                        } else {
                            c8.s9.b(new p4.m1(-100));
                        }
                        p4.u uVar = vVar.d;
                        if (uVar != null) {
                            uVar.j(i11, i1Var);
                        }
                    } catch (DeadObjectException unused) {
                        c1Var.b.T(vVar);
                        c8.s9.b(new p4.m1(-100));
                    } catch (RemoteException e10) {
                        h2.a.m("MediaSessionImpl", "Exception in " + vVar, e10);
                        c8.s9.b(new p4.m1(-1));
                    }
                }
                runnable.run();
                c1Var.b.q(vVar);
                return;
            case 16:
                sg.j0 j0Var = (sg.j0) this.c;
                a8.wa waVar = (a8.wa) this.d;
                a8.wa waVar2 = (a8.wa) this.e;
                boolean z25 = this.b;
                int i17 = 0;
                j0Var.f.f(new sg.g0(j0Var, waVar, i17));
                j0Var.f.f(new sg.g0(j0Var, waVar2, i17));
                j0Var.E = z25;
                return;
            case 17:
                org.telegram.ui.Components.gc gcVar = (org.telegram.ui.Components.gc) this.c;
                boolean z26 = this.b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.d;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.e;
                org.telegram.ui.Components.bc I = gcVar.I(R.raw.star_premium_2, z26 ? org.telegram.messenger.id.M0(2131753481, "BoostingGiveawayCreated") : org.telegram.messenger.id.M0(2131753592, "BoostingAwardsCreated"), org.telegram.messenger.g0.S2(z26 ? org.telegram.messenger.id.M0(org.telegram.messenger.t3.V(chat4) ? 2131753555 : 2131753554, null) : org.telegram.messenger.id.M0(org.telegram.messenger.t3.V(chat4) ? 2131753557 : 2131753556, null), org.telegram.ui.ActionBar.m6.uj, 0, new bi.j3(chat4), h6Var));
                I.j = 5000;
                I.j();
                return;
            default:
                wi.t0 t0Var = (wi.t0) this.c;
                wi.x xVar = (wi.x) this.d;
                boolean z27 = this.b;
                wi.p0 p0Var = (wi.p0) this.e;
                long j10 = t0Var.q;
                long nanoTime = System.nanoTime();
                try {
                    xVar.g();
                    h = xVar.h();
                    r12 = t0Var.m;
                    r12.b("active output finalized: size=" + xVar.a.length() + ", durationMs=" + h + ", elapsedMs=" + wi.t0.f(nanoTime));
                    t0Var.g();
                    z9 = h > j10;
                } catch (Exception e11) {
                    e = e11;
                    r12 = t0Var;
                }
                try {
                    if (!z27 || z9) {
                        File file2 = xVar.a;
                        try {
                            synchronized (xVar) {
                                try {
                                    i12 = xVar.s;
                                } finally {
                                    th = th;
                                    File file3 = file2;
                                    while (true) {
                                        try {
                                            try {
                                            } catch (Throwable th2) {
                                                th = th2;
                                                c8.jd.c(file3);
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    }
                                }
                            }
                            t0Var.u(file2, i12, 0L, Math.min(j10, h), z27, z9 ? 1 : 2);
                            c8.jd.c(file2);
                            t0Var = t0Var;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } else {
                        File file4 = xVar.a;
                        ?? r02 = t0Var.k;
                        ?? g0Var = new wi.g0(t0Var, p0Var, file4, h, true);
                        r02.execute(g0Var);
                        t0Var = g0Var;
                    }
                    return;
                } catch (Exception e12) {
                    e = e12;
                    r12.i.post(new wi.e0(r12, e, 2));
                    return;
                }
        }
    }

    public /* synthetic */ xn(Object obj, Object obj2, boolean z9, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = z9;
        this.e = obj3;
    }

    public /* synthetic */ xn(Object obj, TLObject tLObject, Object obj2, boolean z9, int i7) {
        this.a = i7;
        this.c = obj;
        this.e = tLObject;
        this.d = obj2;
        this.b = z9;
    }

    public /* synthetic */ xn(Object obj, boolean z9, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = z9;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ xn(org.telegram.ui.Components.nv0 nv0Var, TLObject tLObject, boolean z9, org.telegram.ui.ActionBar.u1 u1Var) {
        this.a = 6;
        this.c = nv0Var;
        this.e = tLObject;
        this.b = z9;
        this.d = u1Var;
    }

    public /* synthetic */ xn(boolean z9, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.a = 3;
        this.b = z9;
        this.c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
