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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wd0 implements org.telegram.messenger.x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.ls b;

    public /* synthetic */ wd0(org.telegram.messenger.ls lsVar, int i7) {
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
        org.telegram.ui.ActionBar.n2 n2Var;
        int i12 = this.a;
        org.telegram.messenger.ls lsVar = this.b;
        switch (i12) {
            case 0:
                ee0 ee0Var = (ee0) lsVar;
                Long l10 = (Long) obj;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj2;
                String str2 = (String) obj3;
                org.telegram.ui.Components.w70 w70Var = ee0Var.n;
                fe0 fe0Var = ee0Var.g0;
                ee0Var.f0 = null;
                ee0Var.e0 = false;
                if (str2 == null || (!"EMPTY".equals(str2) && !"CANCELLED".equals(str2))) {
                    if (l10.longValue() != 0 && (fe0Var.getParentActivity() instanceof LaunchActivity)) {
                        for (int i13 = 0; i13 < 4; i13++) {
                            org.telegram.messenger.p10 i14 = org.telegram.messenger.p10.i(i13);
                            if (i14.p() && i14.e() == l10.longValue() && ConnectionsManager.getInstance(i13).isTestBackend() == fe0Var.E) {
                                if (org.telegram.messenger.p10.s0 != i13) {
                                    ((LaunchActivity) fe0Var.getParentActivity()).O0(i13);
                                }
                                fe0Var.finishFragment();
                                fe0Var.C1(false, true);
                                break;
                            }
                        }
                    }
                    if (str2 == null || !str2.contains("SESSION_PASSWORD_NEEDED")) {
                        if (str2 != null) {
                            boolean z12 = org.telegram.messenger.r2.a;
                            org.telegram.ui.Components.gc.a0(fe0Var).e0(str2, false);
                            break;
                        }
                    } else {
                        TL_account.getPassword getpassword = new TL_account.getPassword();
                        i7 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
                        ConnectionsManager.getInstance(i7).sendRequest(getpassword, new yd0(ee0Var, 1), 10);
                    }
                    if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
                        fe0Var.G1((TLRPC.TL_auth_authorization) auth_authorization, false);
                        break;
                    }
                } else if (w70Var != null && "CANCELLED".equals(str2)) {
                    w70Var.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131744906, null), new td0(ee0Var, 3)), true));
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
                    org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, (Context) photoViewer.D, photoViewer.v2, false);
                    w2Var.v0(-14933463);
                    w2Var.O(-14933463);
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
                                if (!org.telegram.messenger.ij.L4(ijVar.k) && !photoViewer.S4.h4() && !org.telegram.messenger.ij.R4(photoViewer.S4.k) && !photoViewer.S4.I3() && (ijVar2 = photoViewer.S4.C) != null) {
                                    ijVar = ijVar2;
                                }
                                long B0 = org.telegram.messenger.ij.B0(ijVar.k);
                                int e12 = ijVar.e1();
                                TLRPC.MessageFwdHeader messageFwdHeader = ijVar.k.fwd_from;
                                if (messageFwdHeader != null) {
                                    TLRPC.Peer peer = messageFwdHeader.saved_from_peer;
                                    if (peer != null) {
                                        B0 = org.telegram.messenger.ij.B1(peer);
                                        i11 = ijVar.k.fwd_from.saved_from_msg_id;
                                    } else {
                                        TLRPC.Peer peer2 = messageFwdHeader.from_id;
                                        if (peer2 != null) {
                                            B0 = org.telegram.messenger.ij.B1(peer2);
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
                                i11 = e12;
                                boolean z132 = true;
                                if (org.telegram.messenger.m5.z(B0)) {
                                }
                            }
                            z10 = false;
                            str = url;
                            z11 = z9;
                        }
                        w2Var.O = str;
                        w2Var.P = false;
                        String M0 = org.telegram.messenger.id.M0(2131747817, null);
                        String M02 = org.telegram.messenger.id.M0(2131751762, null);
                        CharSequence[] charSequenceArr = new CharSequence[2];
                        charSequenceArr[0] = M0;
                        charSequenceArr[z11] = M02;
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.qn0
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
                                    String M03 = z10 ? org.telegram.messenger.id.M0(2131747295, "PhoneCopied") : str3.startsWith("#") ? org.telegram.messenger.id.M0(2131749362, "HashtagCopied") : str3.startsWith("@") ? org.telegram.messenger.id.M0(2131743665, "UsernameCopied") : org.telegram.messenger.id.M0(2131748921, "LinkCopied");
                                    if (org.telegram.messenger.g0.I3()) {
                                        new org.telegram.ui.Components.gc(photoViewer2.e0, photoViewer2.v2).Q(R.raw.voip_invite, 36, M03).j();
                                    }
                                }
                            }
                        };
                        w2Var.L = charSequenceArr;
                        w2Var.K = onClickListener;
                        w2Var.H0 = new q5(runnable, 11);
                        w2Var.w = z11;
                        w2Var.show();
                        photoViewer.e0.performHapticFeedback(0, 2);
                        w2Var.C0(0, -1, -1);
                        w2Var.C0(1, -1, -1);
                        w2Var.v0(-14933463);
                        n2Var = w2Var.l0;
                        if (n2Var != null) {
                            n2Var.setTextColor(-7697782);
                        }
                        w2Var.h0 = true;
                        w2Var.n = true;
                        org.telegram.messenger.g0.u3(w2Var, -14933463, false, null);
                        org.telegram.messenger.g0.n3(w2Var, false);
                        w2Var.w = true;
                        break;
                    }
                    i10 = -1;
                    if (!url.startsWith("mailto:")) {
                    }
                    w2Var.O = str;
                    w2Var.P = false;
                    String M03 = org.telegram.messenger.id.M0(2131747817, null);
                    String M022 = org.telegram.messenger.id.M0(2131751762, null);
                    CharSequence[] charSequenceArr2 = new CharSequence[2];
                    charSequenceArr2[0] = M03;
                    charSequenceArr2[z11] = M022;
                    DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.qn0
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
                                String M032 = z10 ? org.telegram.messenger.id.M0(2131747295, "PhoneCopied") : str3.startsWith("#") ? org.telegram.messenger.id.M0(2131749362, "HashtagCopied") : str3.startsWith("@") ? org.telegram.messenger.id.M0(2131743665, "UsernameCopied") : org.telegram.messenger.id.M0(2131748921, "LinkCopied");
                                if (org.telegram.messenger.g0.I3()) {
                                    new org.telegram.ui.Components.gc(photoViewer2.e0, photoViewer2.v2).Q(R.raw.voip_invite, 36, M032).j();
                                }
                            }
                        }
                    };
                    w2Var.L = charSequenceArr2;
                    w2Var.K = onClickListener2;
                    w2Var.H0 = new q5(runnable, 11);
                    w2Var.w = z11;
                    w2Var.show();
                    photoViewer.e0.performHapticFeedback(0, 2);
                    w2Var.C0(0, -1, -1);
                    w2Var.C0(1, -1, -1);
                    w2Var.v0(-14933463);
                    n2Var = w2Var.l0;
                    if (n2Var != null) {
                    }
                    w2Var.h0 = true;
                    w2Var.n = true;
                    org.telegram.messenger.g0.u3(w2Var, -14933463, false, null);
                    org.telegram.messenger.g0.n3(w2Var, false);
                    w2Var.w = true;
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
