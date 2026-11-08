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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class td0 implements org.telegram.messenger.x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.ls b;

    public /* synthetic */ td0(org.telegram.messenger.ls lsVar, int i7) {
        this.a = i7;
        this.b = lsVar;
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
    @Override // org.telegram.messenger.x10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2, Object obj3) {
        int i7;
        int i10;
        boolean z9;
        final boolean z10;
        final String str;
        org.telegram.messenger.ij ijVar;
        int i11;
        org.telegram.messenger.ij ijVar2;
        boolean z11;
        org.telegram.ui.ActionBar.m2 m2Var;
        int i12 = this.a;
        org.telegram.messenger.ls lsVar = this.b;
        switch (i12) {
            case 0:
                be0 be0Var = (be0) lsVar;
                Long l10 = (Long) obj;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj2;
                String str2 = (String) obj3;
                org.telegram.ui.Components.w70 w70Var = be0Var.n;
                ce0 ce0Var = be0Var.g0;
                be0Var.f0 = null;
                be0Var.e0 = false;
                if (str2 == null || (!"EMPTY".equals(str2) && !"CANCELLED".equals(str2))) {
                    if (l10.longValue() != 0 && (ce0Var.getParentActivity() instanceof LaunchActivity)) {
                        for (int i13 = 0; i13 < 4; i13++) {
                            org.telegram.messenger.p10 i14 = org.telegram.messenger.p10.i(i13);
                            if (i14.p() && i14.e() == l10.longValue() && ConnectionsManager.getInstance(i13).isTestBackend() == ce0Var.E) {
                                if (org.telegram.messenger.p10.s0 != i13) {
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
                            boolean z12 = org.telegram.messenger.r2.a;
                            org.telegram.ui.Components.hc.a0(ce0Var).e0(str2, false);
                            break;
                        }
                    } else {
                        TL_account.getPassword getpassword = new TL_account.getPassword();
                        i7 = ((org.telegram.ui.ActionBar.f2) ce0Var).currentAccount;
                        ConnectionsManager.getInstance(i7).sendRequest(getpassword, new vd0(be0Var, 1), 10);
                    }
                    if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
                        ce0Var.G1((TLRPC.TL_auth_authorization) auth_authorization, false);
                        break;
                    }
                } else if (w70Var != null && "CANCELLED".equals(str2)) {
                    w70Var.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131744909, null), new qd0(be0Var, 3)), true));
                    break;
                }
                break;
            case 1:
                final PhotoViewer photoViewer = (PhotoViewer) lsVar;
                final ClickableSpan clickableSpan = (ClickableSpan) obj;
                final TextView textView = (TextView) obj2;
                Runnable runnable = (Runnable) obj3;
                Drawable[] drawableArr = PhotoViewer.Y8;
                if (clickableSpan instanceof URLSpan) {
                    String url = ((URLSpan) clickableSpan).getURL();
                    org.telegram.ui.ActionBar.v2 v2Var = new org.telegram.ui.ActionBar.v2(1, (Context) photoViewer.D, photoViewer.v2, false);
                    v2Var.v0(-14933463);
                    v2Var.O(-14933463);
                    if (url.startsWith("video?")) {
                        try {
                            i10 = Integer.parseInt(url.substring(url.indexOf(63) + 1));
                        } catch (Throwable unused) {
                        }
                        if (!url.startsWith("mailto:")) {
                            z10 = false;
                            str = url.substring(7);
                            z11 = 1;
                        } else if (url.startsWith("tel:")) {
                            str = url.substring(4);
                            z10 = true;
                            z11 = 1;
                        } else {
                            if (i10 < 0 || (ijVar = photoViewer.S4) == null || ijVar.p1) {
                                z9 = true;
                            } else {
                                if (!org.telegram.messenger.ij.M4(ijVar.k) && !photoViewer.S4.i4() && !org.telegram.messenger.ij.S4(photoViewer.S4.k) && !photoViewer.S4.J3() && (ijVar2 = photoViewer.S4.C) != null) {
                                    ijVar = ijVar2;
                                }
                                long B0 = org.telegram.messenger.ij.B0(ijVar.k);
                                int f12 = ijVar.f1();
                                TLRPC.MessageFwdHeader messageFwdHeader = ijVar.k.fwd_from;
                                if (messageFwdHeader != null) {
                                    TLRPC.Peer peer = messageFwdHeader.saved_from_peer;
                                    if (peer != null) {
                                        B0 = org.telegram.messenger.ij.C1(peer);
                                        i11 = ijVar.k.fwd_from.saved_from_msg_id;
                                    } else {
                                        TLRPC.Peer peer2 = messageFwdHeader.from_id;
                                        if (peer2 != null) {
                                            B0 = org.telegram.messenger.ij.C1(peer2);
                                            i11 = ijVar.k.fwd_from.channel_post;
                                        }
                                    }
                                    boolean z13 = true;
                                    if (org.telegram.messenger.m5.z(B0)) {
                                        TLRPC.User a22 = org.telegram.messenger.qp.s1(photoViewer.T).a2(Long.valueOf(B0));
                                        String n10 = org.telegram.messenger.t10.n(a22);
                                        z9 = z13;
                                        z9 = z13;
                                        if (a22 != null && n10 != null) {
                                            url = "https://t.me/" + n10 + "/" + i11 + "?t=" + org.telegram.messenger.g0.n0(i10);
                                            z9 = z13;
                                        }
                                    } else {
                                        String K = org.telegram.messenger.t3.K(org.telegram.messenger.qp.s1(photoViewer.T).M0(Long.valueOf(-B0)), false);
                                        z9 = z13;
                                        if (K != null) {
                                            url = "https://t.me/" + K + "/" + i11 + "?t=" + org.telegram.messenger.g0.n0(i10);
                                            z9 = z13;
                                        }
                                    }
                                }
                                i11 = f12;
                                boolean z132 = true;
                                if (org.telegram.messenger.m5.z(B0)) {
                                }
                            }
                            z10 = false;
                            str = url;
                            z11 = z9;
                        }
                        v2Var.O = str;
                        v2Var.P = false;
                        String M0 = org.telegram.messenger.id.M0(2131747818, null);
                        String M02 = org.telegram.messenger.id.M0(2131751762, null);
                        CharSequence[] charSequenceArr = new CharSequence[2];
                        charSequenceArr[0] = M0;
                        charSequenceArr[z11] = M02;
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.nn0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i15) {
                                Drawable[] drawableArr2 = PhotoViewer.Y8;
                                PhotoViewer photoViewer2 = PhotoViewer.this;
                                if (i15 == 0) {
                                    photoViewer2.V1(clickableSpan, textView);
                                    return;
                                }
                                if (i15 == 1) {
                                    String str3 = str;
                                    org.telegram.messenger.g0.g(str3);
                                    String M03 = z10 ? org.telegram.messenger.id.M0(2131747296, "PhoneCopied") : str3.startsWith("#") ? org.telegram.messenger.id.M0(2131749363, "HashtagCopied") : str3.startsWith("@") ? org.telegram.messenger.id.M0(2131743668, "UsernameCopied") : org.telegram.messenger.id.M0(2131748922, "LinkCopied");
                                    if (org.telegram.messenger.g0.I3()) {
                                        new org.telegram.ui.Components.hc(photoViewer2.e0, photoViewer2.v2).Q(R.raw.voip_invite, 36, M03).j();
                                    }
                                }
                            }
                        };
                        v2Var.L = charSequenceArr;
                        v2Var.K = onClickListener;
                        v2Var.H0 = new q5(runnable, 11);
                        v2Var.w = z11;
                        v2Var.show();
                        photoViewer.e0.performHapticFeedback(0, 2);
                        v2Var.C0(0, -1, -1);
                        v2Var.C0(1, -1, -1);
                        v2Var.v0(-14933463);
                        m2Var = v2Var.l0;
                        if (m2Var != null) {
                            m2Var.setTextColor(-7697782);
                        }
                        v2Var.h0 = true;
                        v2Var.n = true;
                        org.telegram.messenger.g0.u3(v2Var, -14933463, false, null);
                        org.telegram.messenger.g0.n3(v2Var, false);
                        v2Var.w = true;
                        break;
                    }
                    i10 = -1;
                    if (!url.startsWith("mailto:")) {
                    }
                    v2Var.O = str;
                    v2Var.P = false;
                    String M03 = org.telegram.messenger.id.M0(2131747818, null);
                    String M022 = org.telegram.messenger.id.M0(2131751762, null);
                    CharSequence[] charSequenceArr2 = new CharSequence[2];
                    charSequenceArr2[0] = M03;
                    charSequenceArr2[z11] = M022;
                    DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.nn0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i15) {
                            Drawable[] drawableArr2 = PhotoViewer.Y8;
                            PhotoViewer photoViewer2 = PhotoViewer.this;
                            if (i15 == 0) {
                                photoViewer2.V1(clickableSpan, textView);
                                return;
                            }
                            if (i15 == 1) {
                                String str3 = str;
                                org.telegram.messenger.g0.g(str3);
                                String M032 = z10 ? org.telegram.messenger.id.M0(2131747296, "PhoneCopied") : str3.startsWith("#") ? org.telegram.messenger.id.M0(2131749363, "HashtagCopied") : str3.startsWith("@") ? org.telegram.messenger.id.M0(2131743668, "UsernameCopied") : org.telegram.messenger.id.M0(2131748922, "LinkCopied");
                                if (org.telegram.messenger.g0.I3()) {
                                    new org.telegram.ui.Components.hc(photoViewer2.e0, photoViewer2.v2).Q(R.raw.voip_invite, 36, M032).j();
                                }
                            }
                        }
                    };
                    v2Var.L = charSequenceArr2;
                    v2Var.K = onClickListener2;
                    v2Var.H0 = new q5(runnable, 11);
                    v2Var.w = z11;
                    v2Var.show();
                    photoViewer.e0.performHapticFeedback(0, 2);
                    v2Var.C0(0, -1, -1);
                    v2Var.C0(1, -1, -1);
                    v2Var.v0(-14933463);
                    m2Var = v2Var.l0;
                    if (m2Var != null) {
                    }
                    v2Var.h0 = true;
                    v2Var.n = true;
                    org.telegram.messenger.g0.u3(v2Var, -14933463, false, null);
                    org.telegram.messenger.g0.n3(v2Var, false);
                    v2Var.w = true;
                } else if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                ((SecretMediaViewer) lsVar).getClass();
                break;
        }
    }
}
