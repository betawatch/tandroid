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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd0 implements org.telegram.messenger.p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.cs b;

    public /* synthetic */ qd0(org.telegram.messenger.cs csVar, int i3) {
        this.a = i3;
        this.b = csVar;
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
    @Override // org.telegram.messenger.p10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2, Object obj3) {
        int i3;
        int i10;
        boolean z10;
        final boolean z11;
        final String str;
        org.telegram.messenger.zi ziVar;
        int i11;
        org.telegram.messenger.zi ziVar2;
        boolean z12;
        org.telegram.ui.ActionBar.k2 k2Var;
        int i12 = this.a;
        org.telegram.messenger.cs csVar = this.b;
        switch (i12) {
            case 0:
                wd0 wd0Var = (wd0) csVar;
                Long l10 = (Long) obj;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj2;
                String str2 = (String) obj3;
                org.telegram.ui.Components.s70 s70Var = wd0Var.n;
                xd0 xd0Var = wd0Var.b0;
                wd0Var.a0 = null;
                wd0Var.W = false;
                if (str2 == null || (!"EMPTY".equals(str2) && !"CANCELLED".equals(str2))) {
                    if (l10.longValue() != 0 && (xd0Var.getParentActivity() instanceof LaunchActivity)) {
                        for (int i13 = 0; i13 < 4; i13++) {
                            org.telegram.messenger.h10 i14 = org.telegram.messenger.h10.i(i13);
                            if (i14.p() && i14.e() == l10.longValue() && ConnectionsManager.getInstance(i13).isTestBackend() == xd0Var.F) {
                                if (org.telegram.messenger.h10.t0 != i13) {
                                    ((LaunchActivity) xd0Var.getParentActivity()).O0(i13);
                                }
                                xd0Var.finishFragment();
                                xd0Var.t1(false, true);
                                break;
                            }
                        }
                    }
                    if (str2 == null || !str2.contains("SESSION_PASSWORD_NEEDED")) {
                        if (str2 != null) {
                            boolean z13 = org.telegram.messenger.r2.a;
                            org.telegram.ui.Components.fc.a0(xd0Var).e0(str2, false);
                            break;
                        }
                    } else {
                        TL_account.getPassword getpassword = new TL_account.getPassword();
                        i3 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                        ConnectionsManager.getInstance(i3).sendRequest(getpassword, new rd0(wd0Var, 1), 10);
                    }
                    if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
                        xd0Var.x1((TLRPC.TL_auth_authorization) auth_authorization, false);
                        break;
                    }
                } else if (s70Var != null && "CANCELLED".equals(str2)) {
                    s70Var.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131744916, null), new nd0(wd0Var, 3)), true));
                    break;
                }
                break;
            case 1:
                final PhotoViewer photoViewer = (PhotoViewer) csVar;
                final ClickableSpan clickableSpan = (ClickableSpan) obj;
                final TextView textView = (TextView) obj2;
                Runnable runnable = (Runnable) obj3;
                Drawable[] drawableArr = PhotoViewer.V8;
                if (clickableSpan instanceof URLSpan) {
                    String url = ((URLSpan) clickableSpan).getURL();
                    org.telegram.ui.ActionBar.t2 t2Var = new org.telegram.ui.ActionBar.t2(1, (Context) photoViewer.E, photoViewer.w2, false);
                    t2Var.v0(-14933463);
                    t2Var.O(-14933463);
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
                            if (i10 < 0 || (ziVar = photoViewer.U4) == null || ziVar.p1) {
                                z10 = true;
                            } else {
                                if (!org.telegram.messenger.zi.M4(ziVar.k) && !photoViewer.U4.i4() && !org.telegram.messenger.zi.S4(photoViewer.U4.k) && !photoViewer.U4.J3() && (ziVar2 = photoViewer.U4.C) != null) {
                                    ziVar = ziVar2;
                                }
                                long B0 = org.telegram.messenger.zi.B0(ziVar.k);
                                int f12 = ziVar.f1();
                                TLRPC.MessageFwdHeader messageFwdHeader = ziVar.k.fwd_from;
                                if (messageFwdHeader != null) {
                                    TLRPC.Peer peer = messageFwdHeader.saved_from_peer;
                                    if (peer != null) {
                                        B0 = org.telegram.messenger.zi.C1(peer);
                                        i11 = ziVar.k.fwd_from.saved_from_msg_id;
                                    } else {
                                        TLRPC.Peer peer2 = messageFwdHeader.from_id;
                                        if (peer2 != null) {
                                            B0 = org.telegram.messenger.zi.C1(peer2);
                                            i11 = ziVar.k.fwd_from.channel_post;
                                        }
                                    }
                                    boolean z14 = true;
                                    if (org.telegram.messenger.m5.z(B0)) {
                                        TLRPC.User a22 = org.telegram.messenger.hp.s1(photoViewer.U).a2(Long.valueOf(B0));
                                        String n4 = org.telegram.messenger.l10.n(a22);
                                        z10 = z14;
                                        z10 = z14;
                                        if (a22 != null && n4 != null) {
                                            url = "https://t.me/" + n4 + "/" + i11 + "?t=" + org.telegram.messenger.g0.n0(i10);
                                            z10 = z14;
                                        }
                                    } else {
                                        String K = org.telegram.messenger.t3.K(org.telegram.messenger.hp.s1(photoViewer.U).M0(Long.valueOf(-B0)), false);
                                        z10 = z14;
                                        if (K != null) {
                                            url = "https://t.me/" + K + "/" + i11 + "?t=" + org.telegram.messenger.g0.n0(i10);
                                            z10 = z14;
                                        }
                                    }
                                }
                                i11 = f12;
                                boolean z142 = true;
                                if (org.telegram.messenger.m5.z(B0)) {
                                }
                            }
                            z11 = false;
                            str = url;
                            z12 = z10;
                        }
                        t2Var.P = str;
                        t2Var.Q = false;
                        String M0 = org.telegram.messenger.bd.M0(2131747825, null);
                        String M02 = org.telegram.messenger.bd.M0(2131751762, null);
                        CharSequence[] charSequenceArr = new CharSequence[2];
                        charSequenceArr[0] = M0;
                        charSequenceArr[z12] = M02;
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.in0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i15) {
                                Drawable[] drawableArr2 = PhotoViewer.V8;
                                PhotoViewer photoViewer2 = PhotoViewer.this;
                                if (i15 == 0) {
                                    photoViewer2.a2(clickableSpan, textView);
                                    return;
                                }
                                if (i15 == 1) {
                                    String str3 = str;
                                    org.telegram.messenger.g0.g(str3);
                                    String M03 = z11 ? org.telegram.messenger.bd.M0(2131747303, "PhoneCopied") : str3.startsWith("#") ? org.telegram.messenger.bd.M0(2131749370, "HashtagCopied") : str3.startsWith("@") ? org.telegram.messenger.bd.M0(2131743675, "UsernameCopied") : org.telegram.messenger.bd.M0(2131748929, "LinkCopied");
                                    if (org.telegram.messenger.g0.I3()) {
                                        new org.telegram.ui.Components.fc(photoViewer2.f0, photoViewer2.w2).Q(R.raw.voip_invite, 36, M03).j();
                                    }
                                }
                            }
                        };
                        t2Var.M = charSequenceArr;
                        t2Var.L = onClickListener;
                        t2Var.I0 = new s5(runnable, 11);
                        t2Var.w = z12;
                        t2Var.show();
                        photoViewer.f0.performHapticFeedback(0, 2);
                        t2Var.C0(0, -1, -1);
                        t2Var.C0(1, -1, -1);
                        t2Var.v0(-14933463);
                        k2Var = t2Var.m0;
                        if (k2Var != null) {
                            k2Var.setTextColor(-7697782);
                        }
                        t2Var.i0 = true;
                        t2Var.n = true;
                        org.telegram.messenger.g0.u3(t2Var, -14933463, false, null);
                        org.telegram.messenger.g0.n3(t2Var, false);
                        t2Var.w = true;
                        break;
                    }
                    i10 = -1;
                    if (!url.startsWith("mailto:")) {
                    }
                    t2Var.P = str;
                    t2Var.Q = false;
                    String M03 = org.telegram.messenger.bd.M0(2131747825, null);
                    String M022 = org.telegram.messenger.bd.M0(2131751762, null);
                    CharSequence[] charSequenceArr2 = new CharSequence[2];
                    charSequenceArr2[0] = M03;
                    charSequenceArr2[z12] = M022;
                    DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.in0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i15) {
                            Drawable[] drawableArr2 = PhotoViewer.V8;
                            PhotoViewer photoViewer2 = PhotoViewer.this;
                            if (i15 == 0) {
                                photoViewer2.a2(clickableSpan, textView);
                                return;
                            }
                            if (i15 == 1) {
                                String str3 = str;
                                org.telegram.messenger.g0.g(str3);
                                String M032 = z11 ? org.telegram.messenger.bd.M0(2131747303, "PhoneCopied") : str3.startsWith("#") ? org.telegram.messenger.bd.M0(2131749370, "HashtagCopied") : str3.startsWith("@") ? org.telegram.messenger.bd.M0(2131743675, "UsernameCopied") : org.telegram.messenger.bd.M0(2131748929, "LinkCopied");
                                if (org.telegram.messenger.g0.I3()) {
                                    new org.telegram.ui.Components.fc(photoViewer2.f0, photoViewer2.w2).Q(R.raw.voip_invite, 36, M032).j();
                                }
                            }
                        }
                    };
                    t2Var.M = charSequenceArr2;
                    t2Var.L = onClickListener2;
                    t2Var.I0 = new s5(runnable, 11);
                    t2Var.w = z12;
                    t2Var.show();
                    photoViewer.f0.performHapticFeedback(0, 2);
                    t2Var.C0(0, -1, -1);
                    t2Var.C0(1, -1, -1);
                    t2Var.v0(-14933463);
                    k2Var = t2Var.m0;
                    if (k2Var != null) {
                    }
                    t2Var.i0 = true;
                    t2Var.n = true;
                    org.telegram.messenger.g0.u3(t2Var, -14933463, false, null);
                    org.telegram.messenger.g0.n3(t2Var, false);
                    t2Var.w = true;
                } else if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                ((SecretMediaViewer) csVar).getClass();
                break;
        }
    }
}
