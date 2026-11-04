package org.telegram.ui;

import android.util.Log;
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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rn(Object obj, Object obj2, Object obj3, boolean z10, int i3) {
        this.a = i3;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.util.concurrent.Executor, java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Runnable, wi.f0] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [wi.t0] */
    /* JADX WARN: Type inference failed for: r12v7, types: [wi.n] */
    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr;
        byte[] bArr2;
        int i3;
        int i10;
        ?? r12;
        int i11;
        int i12 = 3;
        r9 = null;
        byte[] bArr3 = null;
        r9 = null;
        String str = null;
        switch (this.a) {
            case 0:
                bo boVar = (bo) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.e;
                boolean z10 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject;
                    boVar.m0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = boVar.Z;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z10) {
                        if (boVar.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(boVar.getParentActivity());
                        alertDialog$Builder.a.U = org.telegram.messenger.bd.M0(2131746035, null);
                        alertDialog$Builder.a.S = org.telegram.messenger.bd.M0(2131746033, null);
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131747839, null), null);
                        boVar.showDialog(alertDialog$Builder.a);
                    }
                }
                org.telegram.ui.Components.m70 m70Var = boVar.H;
                if (m70Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = boVar.m0;
                    m70Var.setLink(tL_chatInviteExported2 != null ? tL_chatInviteExported2.link : null);
                    boVar.H.c(boVar.m0, boVar.a0);
                    return;
                }
                return;
            case 1:
                mo moVar = (mo) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z11 = this.b;
                org.telegram.ui.Components.a70 a70Var = (org.telegram.ui.Components.a70) this.e;
                chat.join_to_send = z11;
                org.telegram.messenger.hp messagesController = moVar.y.d.getMessagesController();
                long j10 = chat.id;
                ci.v6 v6Var = new ci.v6(moVar, z11, chat, 17);
                lo loVar = new lo(0, moVar, a70Var);
                messagesController.getClass();
                TLRPC.TL_channels_toggleJoinToSend tL_channels_toggleJoinToSend = new TLRPC.TL_channels_toggleJoinToSend();
                tL_channels_toggleJoinToSend.channel = messagesController.h1(j10);
                tL_channels_toggleJoinToSend.enabled = z11;
                messagesController.getConnectionsManager().sendRequest(tL_channels_toggleJoinToSend, new org.telegram.messenger.uh(messagesController, v6Var, loVar, 8), 64);
                return;
            case 2:
                mo moVar2 = (mo) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z12 = this.b;
                org.telegram.ui.Components.z60 z60Var = (org.telegram.ui.Components.z60) this.e;
                chat2.join_request = z12;
                moVar2.y.d.getMessagesController().c5(chat2.id, 0L, z12, false, false, new ko(moVar2, 0), new sc(29, moVar2, z60Var));
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
                            textView.setText(org.telegram.messenger.bd.M0(org.telegram.messenger.t3.V(chat3) ? 2131752422 : 2131751531, null));
                            return;
                        }
                        if (chat3.monoforum) {
                            textView.setText(org.telegram.messenger.bd.M0(2131749003, null));
                            return;
                        } else if (chat3.megagroup) {
                            textView.setText(org.telegram.messenger.bd.M0(2131748999, null));
                            return;
                        } else {
                            textView.setText(org.telegram.messenger.bd.M0(2131749012, null));
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
                int i13 = 25;
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new lo(i13, tjVar, new ArrayList()));
                    return;
                }
                String S0 = org.telegram.messenger.bd.E0().S0(lowerCase, true, false);
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
                org.telegram.messenger.g0.h3(new lo(i13, tjVar, arrayList2));
                return;
            case 5:
                org.telegram.ui.Components.x60 x60Var = (org.telegram.ui.Components.x60) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                boolean z15 = this.b;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.e;
                org.telegram.ui.ActionBar.d2 d2Var = x60Var.l1;
                if (d2Var == null || d2Var.getParentActivity() == null) {
                    return;
                }
                if (tL_error2 != null) {
                    if ("INVITE_REQUEST_SENT".equals(tL_error2.text)) {
                        x60Var.setOnDismissListener(new org.telegram.ui.Components.s60(1, x60Var, z15));
                    } else {
                        org.telegram.ui.Components.t4.e0(x60Var.a, tL_error2, d2Var, tL_messages_importChatInvite, new Object[0]);
                    }
                }
                x60Var.dismiss();
                return;
            case 6:
                org.telegram.ui.Components.mv0 mv0Var = (org.telegram.ui.Components.mv0) this.c;
                TLObject tLObject2 = (TLObject) this.e;
                boolean z16 = this.b;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.d;
                org.telegram.ui.Components.xv0 xv0Var = mv0Var.a;
                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                    org.telegram.messenger.li.b0(org.telegram.messenger.h10.t0).I1(tL_messages_stickerSet, true);
                    if (z16) {
                        org.telegram.messenger.li.b0(org.telegram.messenger.h10.t0).f2(null, tLObject2, 0, null, false, false);
                    } else {
                        xv0Var.K1 = tL_messages_stickerSet;
                        xv0Var.R0();
                        xv0Var.Z0();
                    }
                }
                s1Var.dismiss();
                return;
            case 7:
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z17 = this.b;
                org.telegram.ui.ActionBar.s1 s1Var2 = (org.telegram.ui.ActionBar.s1) this.e;
                if (t2Var != null && !t2Var.J) {
                    t2Var.A0(true);
                    editTextBoldCursor.requestFocus();
                    if (z17) {
                        org.telegram.messenger.g0.h3(new og(editTextBoldCursor, i12));
                        return;
                    }
                    return;
                }
                if (s1Var2 == null || !s1Var2.isShowing()) {
                    return;
                }
                s1Var2.l(true);
                editTextBoldCursor.requestFocus();
                if (z17) {
                    org.telegram.messenger.g0.h3(new og(editTextBoldCursor, 4));
                    return;
                }
                return;
            case 8:
                x30 x30Var = (x30) this.c;
                TLObject tLObject3 = (TLObject) this.e;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.d;
                boolean z18 = this.b;
                if (tLObject3 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject3;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        x30Var.w1(null, tL_chatInviteExported3.link, true, z18);
                        return;
                    }
                }
                return;
            case 9:
                a50 a50Var = (a50) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject4 = (TLObject) this.e;
                boolean z19 = this.b;
                if (tL_error3 == null) {
                    a50Var.f = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (z19) {
                        if (a50Var.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(a50Var.getParentActivity());
                        alertDialog$Builder3.a.U = org.telegram.messenger.bd.M0(2131746035, null);
                        alertDialog$Builder3.a.S = org.telegram.messenger.bd.M0(2131746033, null);
                        alertDialog$Builder3.h(org.telegram.messenger.bd.M0(2131747839, null), null);
                        a50Var.showDialog(alertDialog$Builder3.a);
                    }
                }
                a50Var.e = false;
                a50Var.a.f();
                return;
            case 10:
                mj0 mj0Var = (mj0) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                boolean z20 = this.b;
                yj0 yj0Var = mj0Var.e;
                if (tL_error4 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject5;
                    yj0Var.K = password;
                    TwoStepVerificationActivity.r0(password);
                    yj0Var.F1(z20);
                    return;
                }
                return;
            case 11:
                mj0 mj0Var2 = (mj0) this.c;
                TLObject tLObject6 = (TLObject) this.e;
                String str5 = (String) this.d;
                boolean z21 = this.b;
                yj0 yj0Var2 = mj0Var2.e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject6;
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    yj0Var2.d1 = tL_secureSecretSettings.secure_secret;
                    yj0Var2.c1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        yj0Var2.f1 = Utilities.s(bArr, org.telegram.messenger.g0.h1(str5), bArr);
                    } else {
                        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                            TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                            byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                            yj0Var2.f1 = Utilities.m(org.telegram.messenger.g0.h1(str5), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                            bArr2 = bArr4;
                            org.telegram.messenger.g0.h3(new rn(mj0Var2, passwordsettings, z21, bArr2, 12));
                            return;
                        }
                        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                            org.telegram.messenger.g0.h3(new sg0(mj0Var2, 6));
                            return;
                        }
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = yj0Var2.K.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr5 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        yj0Var2.f1 = Utilities.m(org.telegram.messenger.g0.h1(str5), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr5;
                    } else {
                        bArr = new byte[0];
                    }
                    yj0Var2.d1 = null;
                    yj0Var2.c1 = 0L;
                }
                bArr2 = bArr;
                org.telegram.messenger.g0.h3(new rn(mj0Var2, passwordsettings, z21, bArr2, 12));
                return;
            case 12:
                mj0 mj0Var3 = (mj0) this.c;
                TL_account.passwordSettings passwordsettings2 = (TL_account.passwordSettings) this.d;
                boolean z22 = this.b;
                byte[] bArr6 = (byte[]) this.e;
                yj0 yj0Var3 = mj0Var3.e;
                yj0Var3.e1 = passwordsettings2.email;
                if (z22) {
                    yj0Var3.f1 = yj0Var3.Q0;
                }
                byte[] bArr7 = yj0Var3.d1;
                byte[] bArr8 = yj0Var3.f1;
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
                if (yj0.d1(bArr3, Long.valueOf(yj0Var3.c1)) && bArr6.length != 0 && yj0Var3.c1 != 0) {
                    if (yj0Var3.c != 0) {
                        mj0Var3.a();
                        return;
                    }
                    TL_account.getAllSecureValues getallsecurevalues = new TL_account.getAllSecureValues();
                    i10 = ((org.telegram.ui.ActionBar.d2) yj0Var3).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getallsecurevalues, new kj0(mj0Var3, 0));
                    return;
                }
                if (z22) {
                    i3 = ((org.telegram.ui.ActionBar.d2) yj0Var3).currentAccount;
                    org.telegram.messenger.h10.i(i3).u();
                    yj0Var3.O0 = 0;
                    yj0Var3.W1();
                    return;
                }
                TL_account.authorizationForm authorizationform = yj0Var3.E;
                if (authorizationform != null) {
                    authorizationform.values.clear();
                    yj0Var3.E.errors.clear();
                }
                byte[] bArr12 = yj0Var3.d1;
                if (bArr12 == null || bArr12.length == 0) {
                    Utilities.e.c(new hc0(mj0Var3, mj0Var3.b, mj0Var3.d, 15));
                    return;
                } else {
                    mj0Var3.b();
                    return;
                }
            case 13:
                dl0 dl0Var = (dl0) this.c;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                boolean z23 = this.b;
                if (tL_error5 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject7;
                    dl0Var.b0 = password2;
                    TwoStepVerificationActivity.r0(password2);
                    dl0Var.G0(z23);
                    return;
                }
                return;
            case 14:
                ra1.h0((ra1) this.c, (TLRPC.TL_error) this.d, (TLObject) this.e, this.b);
                return;
            case 15:
                tg.i0 i0Var = (tg.i0) this.c;
                b8.kg kgVar = (b8.kg) this.d;
                b8.kg kgVar2 = (b8.kg) this.e;
                boolean z24 = this.b;
                int i17 = 0;
                i0Var.f.f(new tg.g0(i0Var, kgVar, i17));
                i0Var.f.f(new tg.g0(i0Var, kgVar2, i17));
                i0Var.E = z24;
                return;
            case 16:
                wi.t0 t0Var = (wi.t0) this.c;
                wi.w wVar = (wi.w) this.d;
                boolean z25 = this.b;
                wi.p0 p0Var = (wi.p0) this.e;
                long j11 = t0Var.q;
                long nanoTime = System.nanoTime();
                try {
                    wVar.g();
                    long h = wVar.h();
                    r12 = t0Var.m;
                    r12.b("active output finalized: size=" + wVar.a.length() + ", durationMs=" + h + ", elapsedMs=" + wi.t0.f(nanoTime));
                    t0Var.g();
                    boolean z26 = h > j11;
                    try {
                        if (!z25 || z26) {
                            File file2 = wVar.a;
                            try {
                                synchronized (wVar) {
                                    try {
                                        i11 = wVar.s;
                                    } finally {
                                        th = th;
                                        File file3 = file2;
                                        while (true) {
                                            try {
                                                try {
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    x7.u5.c(file3);
                                                    throw th;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                        }
                                    }
                                }
                                t0Var.t(file2, i11, 0L, Math.min(j11, h), z25, z26 ? 1 : 2);
                                x7.u5.c(file2);
                                t0Var = t0Var;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } else {
                            File file4 = wVar.a;
                            ?? r02 = t0Var.k;
                            ?? f0Var = new wi.f0(t0Var, p0Var, file4, h, true);
                            r02.execute(f0Var);
                            t0Var = f0Var;
                        }
                        return;
                    } catch (Exception e10) {
                        e = e10;
                        r12.i.post(new wi.d0(r12, e, 2));
                        return;
                    }
                } catch (Exception e11) {
                    e = e11;
                    r12 = t0Var;
                }
            case 17:
                org.telegram.ui.Components.fc fcVar = (org.telegram.ui.Components.fc) this.c;
                boolean z27 = this.b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.e;
                org.telegram.ui.Components.ac I = fcVar.I(R.raw.star_premium_2, z27 ? org.telegram.messenger.bd.M0(2131753481, "BoostingGiveawayCreated") : org.telegram.messenger.bd.M0(2131753592, "BoostingAwardsCreated"), org.telegram.messenger.g0.S2(z27 ? org.telegram.messenger.bd.M0(org.telegram.messenger.t3.V(chat4) ? 2131753555 : 2131753554, null) : org.telegram.messenger.bd.M0(org.telegram.messenger.t3.V(chat4) ? 2131753557 : 2131753556, null), org.telegram.ui.ActionBar.k6.uj, 0, new ci.w2(chat4), e6Var));
                I.j = 5000;
                I.j();
                return;
            default:
                z9.x xVar = (z9.x) this.c;
                ca.q2 q2Var = (ca.q2) this.d;
                ba.c cVar = (ba.c) this.e;
                boolean z28 = this.b;
                xVar.getClass();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                }
                xVar.b.e(q2Var, cVar.a, z28);
                return;
        }
    }

    public /* synthetic */ rn(Object obj, Object obj2, boolean z10, Object obj3, int i3) {
        this.a = i3;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
    }

    public /* synthetic */ rn(Object obj, TLObject tLObject, Object obj2, boolean z10, int i3) {
        this.a = i3;
        this.c = obj;
        this.e = tLObject;
        this.d = obj2;
        this.b = z10;
    }

    public /* synthetic */ rn(org.telegram.ui.Components.fc fcVar, boolean z10, TLRPC.Chat chat, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = 17;
        this.c = fcVar;
        this.b = z10;
        this.d = chat;
        this.e = e6Var;
    }

    public /* synthetic */ rn(org.telegram.ui.Components.mv0 mv0Var, TLObject tLObject, boolean z10, org.telegram.ui.ActionBar.s1 s1Var) {
        this.a = 6;
        this.c = mv0Var;
        this.e = tLObject;
        this.b = z10;
        this.d = s1Var;
    }

    public /* synthetic */ rn(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.a = 3;
        this.b = z10;
        this.c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
