package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class td0 implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.is b;

    public /* synthetic */ td0(org.telegram.messenger.is isVar, int i7) {
        this.a = i7;
        this.b = isVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:12|(11:14|15|16|17|(1:19)(2:30|(1:32)(2:(1:68)(7:38|(1:48)|49|(4:51|(1:53)(2:64|(1:66))|54|(2:56|(1:58))(2:60|(1:63)))|67|54|(0)(0))|59))|20|21|22|23|(1:25)|26)|71|17|(0)(0)|20|21|22|23|(0)|26) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0137  */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    @Override // org.telegram.messenger.u10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2, Object obj3) {
        int i7;
        int i10;
        boolean z10;
        final boolean z11;
        final String str;
        org.telegram.messenger.gj gjVar;
        int i11;
        org.telegram.messenger.gj gjVar2;
        boolean z12;
        org.telegram.ui.ActionBar.l2 l2Var;
        int i12 = this.a;
        org.telegram.messenger.is isVar = this.b;
        switch (i12) {
            case 0:
                be0 be0Var = (be0) isVar;
                Long l10 = (Long) obj;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj2;
                String str2 = (String) obj3;
                org.telegram.ui.Components.z70 z70Var = be0Var.n;
                ce0 ce0Var = be0Var.h0;
                be0Var.g0 = null;
                be0Var.f0 = false;
                if (str2 == null || (!"EMPTY".equals(str2) && !"CANCELLED".equals(str2))) {
                    if (l10.longValue() != 0 && (ce0Var.getParentActivity() instanceof LaunchActivity)) {
                        for (int i13 = 0; i13 < 4; i13++) {
                            org.telegram.messenger.m10 i14 = org.telegram.messenger.m10.i(i13);
                            if (i14.p() && i14.e() == l10.longValue() && ConnectionsManager.getInstance(i13).isTestBackend() == ce0Var.F) {
                                if (org.telegram.messenger.m10.t0 != i13) {
                                    ((LaunchActivity) ce0Var.getParentActivity()).O0(i13);
                                }
                                ce0Var.finishFragment();
                                ce0Var.C1(false, true);
                                break;
                            }
                        }
                    }
                    if (str2 == null || !str2.contains("SESSION_PASSWORD_NEEDED")) {
                        if (str2 != null) {
                            boolean z13 = org.telegram.messenger.r2.a;
                            org.telegram.ui.Components.cc.a0(ce0Var).e0(str2, false);
                            break;
                        }
                    } else {
                        TL_account.getPassword getpassword = new TL_account.getPassword();
                        i7 = ((org.telegram.ui.ActionBar.e2) ce0Var).currentAccount;
                        ConnectionsManager.getInstance(i7).sendRequest(getpassword, new vd0(be0Var, 1), 10);
                    }
                    if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
                        ce0Var.G1((TLRPC.TL_auth_authorization) auth_authorization, false);
                        break;
                    }
                } else if (z70Var != null && "CANCELLED".equals(str2)) {
                    z70Var.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131744906, null), new qd0(be0Var, 3)), true));
                    break;
                }
                break;
            case 1:
                final PhotoViewer photoViewer = (PhotoViewer) isVar;
                final ClickableSpan clickableSpan = (ClickableSpan) obj;
                final TextView textView = (TextView) obj2;
                Runnable runnable = (Runnable) obj3;
                Drawable[] drawableArr = PhotoViewer.Z8;
                if (clickableSpan instanceof URLSpan) {
                    String url = ((URLSpan) clickableSpan).getURL();
                    org.telegram.ui.ActionBar.u2 u2Var = new org.telegram.ui.ActionBar.u2(1, (Context) photoViewer.E, photoViewer.w2, false);
                    u2Var.v0(-14933463);
                    u2Var.P(-14933463);
                    if (url.startsWith("video?")) {
                        try {
                            i10 = Integer.parseInt(url.substring(url.indexOf(63) + 1));
                        } catch (Throwable unused) {
                        }
                        if (!url.startsWith("mailto:")) {
                            z11 = false;
                            str = url.substring(7);
                            z12 = 1;
                        } else if (url.startsWith("tel:")) {
                            str = url.substring(4);
                            z11 = true;
                            z12 = 1;
                        } else {
                            if (i10 < 0 || (gjVar = photoViewer.T4) == null || gjVar.r1) {
                                z10 = true;
                            } else {
                                if (!org.telegram.messenger.gj.L4(gjVar.k) && !photoViewer.T4.h4() && !org.telegram.messenger.gj.R4(photoViewer.T4.k) && !photoViewer.T4.I3() && (gjVar2 = photoViewer.T4.C) != null) {
                                    gjVar = gjVar2;
                                }
                                long B0 = org.telegram.messenger.gj.B0(gjVar.k);
                                int e12 = gjVar.e1();
                                TLRPC.MessageFwdHeader messageFwdHeader = gjVar.k.fwd_from;
                                if (messageFwdHeader != null) {
                                    TLRPC.Peer peer = messageFwdHeader.saved_from_peer;
                                    if (peer != null) {
                                        B0 = org.telegram.messenger.gj.B1(peer);
                                        i11 = gjVar.k.fwd_from.saved_from_msg_id;
                                    } else {
                                        TLRPC.Peer peer2 = messageFwdHeader.from_id;
                                        if (peer2 != null) {
                                            B0 = org.telegram.messenger.gj.B1(peer2);
                                            i11 = gjVar.k.fwd_from.channel_post;
                                        }
                                    }
                                    boolean z14 = true;
                                    if (org.telegram.messenger.m5.z(B0)) {
                                        TLRPC.User a22 = org.telegram.messenger.np.s1(photoViewer.U).a2(Long.valueOf(B0));
                                        String n10 = org.telegram.messenger.q10.n(a22);
                                        z10 = z14;
                                        z10 = z14;
                                        if (a22 != null && n10 != null) {
                                            url = "https://t.me/" + n10 + "/" + i11 + "?t=" + org.telegram.messenger.g0.n0(i10);
                                            z10 = z14;
                                        }
                                    } else {
                                        String K = org.telegram.messenger.t3.K(org.telegram.messenger.np.s1(photoViewer.U).M0(Long.valueOf(-B0)), false);
                                        z10 = z14;
                                        if (K != null) {
                                            url = "https://t.me/" + K + "/" + i11 + "?t=" + org.telegram.messenger.g0.n0(i10);
                                            z10 = z14;
                                        }
                                    }
                                }
                                i11 = e12;
                                boolean z142 = true;
                                if (org.telegram.messenger.m5.z(B0)) {
                                }
                            }
                            z11 = false;
                            str = url;
                            z12 = z10;
                        }
                        u2Var.P = str;
                        u2Var.Q = false;
                        String M0 = org.telegram.messenger.hd.M0(2131747817, null);
                        String M02 = org.telegram.messenger.hd.M0(2131751762, null);
                        CharSequence[] charSequenceArr = new CharSequence[2];
                        charSequenceArr[0] = M0;
                        charSequenceArr[z12] = M02;
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.pn0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i15) {
                                Drawable[] drawableArr2 = PhotoViewer.Z8;
                                PhotoViewer photoViewer2 = PhotoViewer.this;
                                if (i15 == 0) {
                                    photoViewer2.V1(clickableSpan, textView);
                                    return;
                                }
                                if (i15 == 1) {
                                    String str3 = str;
                                    org.telegram.messenger.g0.g(str3);
                                    String M03 = z11 ? org.telegram.messenger.hd.M0(2131747295, "PhoneCopied") : str3.startsWith("#") ? org.telegram.messenger.hd.M0(2131749362, "HashtagCopied") : str3.startsWith("@") ? org.telegram.messenger.hd.M0(2131743665, "UsernameCopied") : org.telegram.messenger.hd.M0(2131748921, "LinkCopied");
                                    if (org.telegram.messenger.g0.H3()) {
                                        new org.telegram.ui.Components.cc(photoViewer2.f0, photoViewer2.w2).Q(R.raw.voip_invite, 36, M03).j();
                                    }
                                }
                            }
                        };
                        u2Var.M = charSequenceArr;
                        u2Var.L = onClickListener;
                        u2Var.I0 = new q5(runnable, 11);
                        u2Var.w = z12;
                        u2Var.show();
                        photoViewer.f0.performHapticFeedback(0, 2);
                        u2Var.C0(0, -1, -1);
                        u2Var.C0(1, -1, -1);
                        u2Var.v0(-14933463);
                        l2Var = u2Var.m0;
                        if (l2Var != null) {
                            l2Var.setTextColor(-7697782);
                        }
                        u2Var.i0 = true;
                        u2Var.n = true;
                        org.telegram.messenger.g0.t3(u2Var, -14933463, false, null);
                        org.telegram.messenger.g0.n3(u2Var, false);
                        u2Var.w = true;
                        break;
                    }
                    i10 = -1;
                    if (!url.startsWith("mailto:")) {
                    }
                    u2Var.P = str;
                    u2Var.Q = false;
                    String M03 = org.telegram.messenger.hd.M0(2131747817, null);
                    String M022 = org.telegram.messenger.hd.M0(2131751762, null);
                    CharSequence[] charSequenceArr2 = new CharSequence[2];
                    charSequenceArr2[0] = M03;
                    charSequenceArr2[z12] = M022;
                    DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.pn0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i15) {
                            Drawable[] drawableArr2 = PhotoViewer.Z8;
                            PhotoViewer photoViewer2 = PhotoViewer.this;
                            if (i15 == 0) {
                                photoViewer2.V1(clickableSpan, textView);
                                return;
                            }
                            if (i15 == 1) {
                                String str3 = str;
                                org.telegram.messenger.g0.g(str3);
                                String M032 = z11 ? org.telegram.messenger.hd.M0(2131747295, "PhoneCopied") : str3.startsWith("#") ? org.telegram.messenger.hd.M0(2131749362, "HashtagCopied") : str3.startsWith("@") ? org.telegram.messenger.hd.M0(2131743665, "UsernameCopied") : org.telegram.messenger.hd.M0(2131748921, "LinkCopied");
                                if (org.telegram.messenger.g0.H3()) {
                                    new org.telegram.ui.Components.cc(photoViewer2.f0, photoViewer2.w2).Q(R.raw.voip_invite, 36, M032).j();
                                }
                            }
                        }
                    };
                    u2Var.M = charSequenceArr2;
                    u2Var.L = onClickListener2;
                    u2Var.I0 = new q5(runnable, 11);
                    u2Var.w = z12;
                    u2Var.show();
                    photoViewer.f0.performHapticFeedback(0, 2);
                    u2Var.C0(0, -1, -1);
                    u2Var.C0(1, -1, -1);
                    u2Var.v0(-14933463);
                    l2Var = u2Var.m0;
                    if (l2Var != null) {
                    }
                    u2Var.i0 = true;
                    u2Var.n = true;
                    org.telegram.messenger.g0.t3(u2Var, -14933463, false, null);
                    org.telegram.messenger.g0.n3(u2Var, false);
                    u2Var.w = true;
                } else if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                ((SecretMediaViewer) isVar).getClass();
                break;
        }
    }
}
