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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class wn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wn(Object obj, Object obj2, Object obj3, boolean z10, int i7) {
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
                ho hoVar = (ho) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.e;
                boolean z10 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject;
                    hoVar.m0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = hoVar.Z;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z10) {
                        if (hoVar.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hoVar.getParentActivity());
                        alertDialog$Builder.a.U = org.telegram.messenger.hd.M0(2131746025, null);
                        alertDialog$Builder.a.S = org.telegram.messenger.hd.M0(2131746023, null);
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131747831, null), null);
                        hoVar.showDialog(alertDialog$Builder.a);
                    }
                }
                org.telegram.ui.Components.t70 t70Var = hoVar.H;
                if (t70Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = hoVar.m0;
                    t70Var.setLink(tL_chatInviteExported2 != null ? tL_chatInviteExported2.link : null);
                    hoVar.H.c(hoVar.m0, hoVar.a0);
                    return;
                }
                return;
            case 1:
                po poVar = (po) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z11 = this.b;
                org.telegram.ui.Components.h70 h70Var = (org.telegram.ui.Components.h70) this.e;
                chat.join_to_send = z11;
                org.telegram.messenger.np messagesController = poVar.y.d.getMessagesController();
                long j3 = chat.id;
                di.m6 m6Var = new di.m6(poVar, z11, chat, 17);
                zg zgVar = new zg(i13, poVar, h70Var);
                messagesController.getClass();
                TLRPC.TL_channels_toggleJoinToSend tL_channels_toggleJoinToSend = new TLRPC.TL_channels_toggleJoinToSend();
                tL_channels_toggleJoinToSend.channel = messagesController.h1(j3);
                tL_channels_toggleJoinToSend.enabled = z11;
                messagesController.getConnectionsManager().sendRequest(tL_channels_toggleJoinToSend, new org.telegram.messenger.bi(messagesController, m6Var, zgVar, 8), 64);
                return;
            case 2:
                po poVar2 = (po) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z12 = this.b;
                org.telegram.ui.Components.g70 g70Var = (org.telegram.ui.Components.g70) this.e;
                chat2.join_request = z12;
                poVar2.y.d.getMessagesController().d5(chat2.id, 0L, z12, false, false, new oo(poVar2, 0), new zg(13, poVar2, g70Var));
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
                            textView.setText(org.telegram.messenger.hd.M0(org.telegram.messenger.t3.V(chat3) ? 2131752422 : 2131751530, null));
                            return;
                        }
                        if (chat3.monoforum) {
                            textView.setText(org.telegram.messenger.hd.M0(2131748995, null));
                            return;
                        } else if (chat3.megagroup) {
                            textView.setText(org.telegram.messenger.hd.M0(2131748991, null));
                            return;
                        } else {
                            textView.setText(org.telegram.messenger.hd.M0(2131749004, null));
                            return;
                        }
                    }
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.ck ckVar = (org.telegram.ui.Components.ck) this.c;
                String str2 = (String) this.d;
                boolean z14 = this.b;
                ArrayList arrayList = (ArrayList) this.e;
                ckVar.getClass();
                String lowerCase = str2.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.od(i13, ckVar, new ArrayList()));
                    return;
                }
                String S0 = org.telegram.messenger.hd.E0().S0(lowerCase, true, false);
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
                        org.telegram.ui.Components.wj wjVar = (org.telegram.ui.Components.wj) arrayList.get(i15);
                        File file = wjVar.f;
                        if (file != null && !file.isDirectory()) {
                            int i16 = 0;
                            while (true) {
                                if (i16 < i14) {
                                    String str3 = strArr[i16];
                                    String str4 = wjVar.b;
                                    if (str4 != null ? str4.toLowerCase().contains(str3) : false) {
                                        arrayList2.add(wjVar);
                                    } else {
                                        i16++;
                                    }
                                }
                            }
                        }
                    }
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.od(i13, ckVar, arrayList2));
                return;
            case 5:
                org.telegram.ui.Components.e70 e70Var = (org.telegram.ui.Components.e70) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                boolean z15 = this.b;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.e;
                org.telegram.ui.ActionBar.e2 e2Var = e70Var.o1;
                if (e2Var == null || e2Var.getParentActivity() == null) {
                    return;
                }
                if (tL_error2 != null) {
                    if ("INVITE_REQUEST_SENT".equals(tL_error2.text)) {
                        e70Var.setOnDismissListener(new org.telegram.ui.Components.a70(1, e70Var, z15));
                    } else {
                        org.telegram.ui.Components.t4.c0(e70Var.a, tL_error2, e2Var, tL_messages_importChatInvite, new Object[0]);
                    }
                }
                e70Var.dismiss();
                return;
            case 6:
                org.telegram.ui.Components.pv0 pv0Var = (org.telegram.ui.Components.pv0) this.c;
                TLObject tLObject2 = (TLObject) this.e;
                boolean z16 = this.b;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.d;
                org.telegram.ui.Components.bw0 bw0Var = pv0Var.a;
                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                    org.telegram.messenger.si.b0(org.telegram.messenger.m10.t0).I1(tL_messages_stickerSet, true);
                    if (z16) {
                        org.telegram.messenger.si.b0(org.telegram.messenger.m10.t0).f2(null, tLObject2, 0, null, false, false);
                    } else {
                        bw0Var.N1 = tL_messages_stickerSet;
                        bw0Var.R0();
                        bw0Var.Z0();
                    }
                }
                t1Var.dismiss();
                return;
            case 7:
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z17 = this.b;
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) this.e;
                if (u2Var != null && !u2Var.J) {
                    u2Var.A0(true);
                    editTextBoldCursor.requestFocus();
                    if (z17) {
                        org.telegram.messenger.g0.h3(new og(editTextBoldCursor, 3));
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
                    org.telegram.messenger.g0.h3(new og(editTextBoldCursor, 4));
                    return;
                }
                return;
            case 8:
                c40 c40Var = (c40) this.c;
                TLObject tLObject3 = (TLObject) this.e;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.d;
                boolean z18 = this.b;
                if (tLObject3 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject3;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        c40Var.z1(null, tL_chatInviteExported3.link, true, z18);
                        return;
                    }
                }
                return;
            case 9:
                e50 e50Var = (e50) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject4 = (TLObject) this.e;
                boolean z19 = this.b;
                if (tL_error3 == null) {
                    e50Var.f = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (z19) {
                        if (e50Var.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(e50Var.getParentActivity());
                        alertDialog$Builder3.a.U = org.telegram.messenger.hd.M0(2131746025, null);
                        alertDialog$Builder3.a.S = org.telegram.messenger.hd.M0(2131746023, null);
                        alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131747831, null), null);
                        e50Var.showDialog(alertDialog$Builder3.a);
                    }
                }
                e50Var.e = false;
                e50Var.a.f();
                return;
            case 10:
                sj0 sj0Var = (sj0) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                boolean z20 = this.b;
                ek0 ek0Var = sj0Var.e;
                if (tL_error4 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject5;
                    ek0Var.K = password;
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
                    ek0Var2.d1 = tL_secureSecretSettings.secure_secret;
                    ek0Var2.c1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        ek0Var2.f1 = Utilities.s(bArr, org.telegram.messenger.g0.h1(str5), bArr);
                    } else {
                        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                            TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                            byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                            ek0Var2.f1 = Utilities.m(org.telegram.messenger.g0.h1(str5), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                            bArr2 = bArr4;
                            org.telegram.messenger.g0.h3(new wn(sj0Var2, passwordsettings, z21, bArr2, 12));
                            return;
                        }
                        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                            org.telegram.messenger.g0.h3(new ef0(sj0Var2, 7));
                            return;
                        }
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = ek0Var2.K.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr5 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        ek0Var2.f1 = Utilities.m(org.telegram.messenger.g0.h1(str5), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr5;
                    } else {
                        bArr = new byte[0];
                    }
                    ek0Var2.d1 = null;
                    ek0Var2.c1 = 0L;
                }
                bArr2 = bArr;
                org.telegram.messenger.g0.h3(new wn(sj0Var2, passwordsettings, z21, bArr2, 12));
                return;
            case 12:
                sj0 sj0Var3 = (sj0) this.c;
                TL_account.passwordSettings passwordsettings2 = (TL_account.passwordSettings) this.d;
                boolean z22 = this.b;
                byte[] bArr6 = (byte[]) this.e;
                ek0 ek0Var3 = sj0Var3.e;
                ek0Var3.e1 = passwordsettings2.email;
                if (z22) {
                    ek0Var3.f1 = ek0Var3.Q0;
                }
                byte[] bArr7 = ek0Var3.d1;
                byte[] bArr8 = ek0Var3.f1;
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
                if (ek0.d1(bArr3, Long.valueOf(ek0Var3.c1)) && bArr6.length != 0 && ek0Var3.c1 != 0) {
                    if (ek0Var3.c != 0) {
                        sj0Var3.a();
                        return;
                    }
                    TL_account.getAllSecureValues getallsecurevalues = new TL_account.getAllSecureValues();
                    i10 = ((org.telegram.ui.ActionBar.e2) ek0Var3).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getallsecurevalues, new qj0(sj0Var3, 0));
                    return;
                }
                if (z22) {
                    i7 = ((org.telegram.ui.ActionBar.e2) ek0Var3).currentAccount;
                    org.telegram.messenger.m10.i(i7).u();
                    ek0Var3.O0 = 0;
                    ek0Var3.W1();
                    return;
                }
                TL_account.authorizationForm authorizationform = ek0Var3.E;
                if (authorizationform != null) {
                    authorizationform.values.clear();
                    ek0Var3.E.errors.clear();
                }
                byte[] bArr12 = ek0Var3.d1;
                if (bArr12 == null || bArr12.length == 0) {
                    Utilities.e.c(new lc0(sj0Var3, sj0Var3.b, sj0Var3.d, i13));
                    return;
                } else {
                    sj0Var3.b();
                    return;
                }
            case 13:
                jl0 jl0Var = (jl0) this.c;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                boolean z23 = this.b;
                if (tL_error5 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject7;
                    jl0Var.b0 = password2;
                    TwoStepVerificationActivity.r0(password2);
                    jl0Var.G0(z23);
                    return;
                }
                return;
            case 14:
                xa1.h0((xa1) this.c, (TLRPC.TL_error) this.d, (TLObject) this.e, this.b);
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
                        com.google.android.gms.common.api.internal.t u10 = c1Var.b.u(vVar);
                        if (u10 != null) {
                            i11 = u10.b(p4.d0.B).n;
                        } else if (d0Var.h(vVar)) {
                            c8.r9.b(new p4.m1(0));
                            i11 = 0;
                        } else {
                            c8.r9.b(new p4.m1(-100));
                        }
                        p4.u uVar = vVar.d;
                        if (uVar != null) {
                            uVar.j(i11, i1Var);
                        }
                    } catch (DeadObjectException unused) {
                        c1Var.b.H(vVar);
                        c8.r9.b(new p4.m1(-100));
                    } catch (RemoteException e10) {
                        h2.a.m("MediaSessionImpl", "Exception in " + vVar, e10);
                        c8.r9.b(new p4.m1(-1));
                    }
                }
                runnable.run();
                c1Var.b.l(vVar);
                return;
            case 16:
                sg.i0 i0Var = (sg.i0) this.c;
                a8.xa xaVar = (a8.xa) this.d;
                a8.xa xaVar2 = (a8.xa) this.e;
                boolean z25 = this.b;
                int i17 = 0;
                i0Var.f.f(new sg.f0(i0Var, xaVar, i17));
                i0Var.f.f(new sg.f0(i0Var, xaVar2, i17));
                i0Var.E = z25;
                return;
            case 17:
                org.telegram.ui.Components.cc ccVar = (org.telegram.ui.Components.cc) this.c;
                boolean z26 = this.b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.e;
                org.telegram.ui.Components.xb I = ccVar.I(R.raw.star_premium_2, z26 ? org.telegram.messenger.hd.M0(2131753481, "BoostingGiveawayCreated") : org.telegram.messenger.hd.M0(2131753592, "BoostingAwardsCreated"), org.telegram.messenger.g0.S2(z26 ? org.telegram.messenger.hd.M0(org.telegram.messenger.t3.V(chat4) ? 2131753555 : 2131753554, null) : org.telegram.messenger.hd.M0(org.telegram.messenger.t3.V(chat4) ? 2131753557 : 2131753556, null), org.telegram.ui.ActionBar.j6.xj, 0, new di.q2(chat4), e6Var));
                I.j = 5000;
                I.j();
                return;
            default:
                zi.v0 v0Var = (zi.v0) this.c;
                zi.y yVar = (zi.y) this.d;
                boolean z27 = this.b;
                zi.r0 r0Var = (zi.r0) this.e;
                long j10 = v0Var.q;
                long nanoTime = System.nanoTime();
                int i18 = 2;
                try {
                    yVar.g();
                    long h = yVar.h();
                    v0Var.m.b("active output finalized: size=" + yVar.a.length() + ", durationMs=" + h + ", elapsedMs=" + zi.v0.f(nanoTime));
                    v0Var.g();
                    boolean z28 = h > j10;
                    if (z27 && !z28) {
                        v0Var.k.execute(new zi.h0(v0Var, r0Var, yVar.a, h, true));
                        return;
                    }
                    File file2 = yVar.a;
                    try {
                        synchronized (yVar) {
                            i12 = yVar.s;
                        }
                        try {
                            v0Var.u(file2, i12, 0L, Math.min(j10, h), z27, z28 ? 1 : 2);
                            c8.le.c(file2);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            c8.le.c(file2);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e11) {
                    v0Var.i.post(new zi.f0(v0Var, e11, i18));
                    return;
                }
        }
    }

    public /* synthetic */ wn(Object obj, Object obj2, boolean z10, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
    }

    public /* synthetic */ wn(Object obj, TLObject tLObject, Object obj2, boolean z10, int i7) {
        this.a = i7;
        this.c = obj;
        this.e = tLObject;
        this.d = obj2;
        this.b = z10;
    }

    public /* synthetic */ wn(Object obj, boolean z10, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ wn(org.telegram.ui.Components.pv0 pv0Var, TLObject tLObject, boolean z10, org.telegram.ui.ActionBar.t1 t1Var) {
        this.a = 6;
        this.c = pv0Var;
        this.e = tLObject;
        this.b = z10;
        this.d = t1Var;
    }

    public /* synthetic */ wn(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.a = 3;
        this.b = z10;
        this.c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
