package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class sn0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ sn0(PhotoViewer photoViewer, int i7) {
        this.a = i7;
        this.b = photoViewer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x0249, code lost:
    
        if (r3.startsWith("https://" + org.telegram.messenger.np.s1(r8.U).V2) == false) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0459  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        sq0 sq0Var;
        float f10;
        float f11;
        float f12;
        int i7;
        TLRPC.Message message;
        org.telegram.ui.Components.r51 r51Var;
        int i10 = this.a;
        float f13 = 0.0f;
        String str = null;
        final PhotoViewer photoViewer = this.b;
        final int i11 = 0;
        int i12 = 1;
        switch (i10) {
            case 0:
                if (!photoViewer.f2 && !photoViewer.F1()) {
                    photoViewer.K2();
                    break;
                }
                break;
            case 1:
                Drawable[] drawableArr = PhotoViewer.Z8;
                if (!photoViewer.F1() && (sq0Var = photoViewer.d) != null && sq0Var.c() != null && !photoViewer.d.c().isEmpty()) {
                    photoViewer.n3(!photoViewer.L, true);
                    break;
                }
                break;
            case 2:
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                photoViewer.S1(true);
                photoViewer.u0(0, true);
                break;
            case 3:
                org.telegram.messenger.gj gjVar = photoViewer.T4;
                if (gjVar == null || !gjVar.r4()) {
                    if (photoViewer.G.v0.a()) {
                        photoViewer.p0.V(null, null);
                        break;
                    }
                } else {
                    org.telegram.messenger.gj gjVar2 = photoViewer.T4;
                    if (gjVar2 != null && gjVar2.r4() && photoViewer.p0.getAlpha() > 0.5f) {
                        final int i13 = photoViewer.T4.K1;
                        final fi.b bVar = new fi.b();
                        org.telegram.ui.Components.m60 G = org.telegram.ui.Components.m60.G(photoViewer.f0, bVar, photoViewer.p0, true);
                        G.a0(0.0f, -org.telegram.messenger.g0.L(46.0f));
                        G.V(5);
                        org.telegram.messenger.gj gjVar3 = photoViewer.T4;
                        if (gjVar3.W0 == null && gjVar3.X0 == null) {
                            String str2 = gjVar3.T0;
                            if (str2 != null) {
                                break;
                            }
                            if (!org.telegram.messenger.m10.i(i13).q() && !org.telegram.messenger.np.s1(photoViewer.U).D3() && !photoViewer.T4.b1) {
                                G.c(R.drawable.msg_block2, org.telegram.messenger.hd.M0(2131749323, null), new Runnable() { // from class: org.telegram.ui.jn0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i14 = i11;
                                        fi.b bVar2 = bVar;
                                        int i15 = i13;
                                        PhotoViewer photoViewer2 = photoViewer;
                                        switch (i14) {
                                            case 0:
                                                Drawable[] drawableArr3 = PhotoViewer.Z8;
                                                if (!org.telegram.messenger.m10.i(i15).q()) {
                                                    new ug.x0(photoViewer2.m4, 3, true).show();
                                                    break;
                                                } else {
                                                    new org.telegram.ui.Components.cc(photoViewer2.f0, bVar2).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                                                    org.telegram.messenger.np.s1(i15).o0(true);
                                                    org.telegram.ui.ActionBar.e2 e2Var = photoViewer2.m4;
                                                    if (e2Var instanceof an) {
                                                        an anVar = (an) e2Var;
                                                        anVar.ib(photoViewer2.T4);
                                                        anVar.kb(photoViewer2.T4);
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                Drawable[] drawableArr4 = PhotoViewer.Z8;
                                                if (!org.telegram.messenger.m10.i(i15).q()) {
                                                    new ug.x0(photoViewer2.m4, 3, true).show();
                                                    break;
                                                } else {
                                                    new org.telegram.ui.Components.cc(photoViewer2.f0, bVar2).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                                                    org.telegram.messenger.np.s1(i15).o0(true);
                                                    org.telegram.ui.ActionBar.e2 e2Var2 = photoViewer2.m4;
                                                    if (e2Var2 instanceof an) {
                                                        an anVar2 = (an) e2Var2;
                                                        anVar2.ib(photoViewer2.T4);
                                                        anVar2.kb(photoViewer2.T4);
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                }, false);
                            }
                            if (photoViewer.T4.b1) {
                                G.c(R.drawable.msg_info, org.telegram.messenger.hd.M0(2131754943, null), new jd0(23, photoViewer, bVar), false);
                                if ((photoViewer.m4 instanceof an) && !org.telegram.messenger.np.s1(i13).D3()) {
                                    G.k();
                                    final int i14 = 1;
                                    G.c(R.drawable.msg_cancel, org.telegram.messenger.hd.M0(2131746320, null), new Runnable() { // from class: org.telegram.ui.jn0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i142 = i14;
                                            fi.b bVar2 = bVar;
                                            int i15 = i13;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (i142) {
                                                case 0:
                                                    Drawable[] drawableArr3 = PhotoViewer.Z8;
                                                    if (!org.telegram.messenger.m10.i(i15).q()) {
                                                        new ug.x0(photoViewer2.m4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.cc(photoViewer2.f0, bVar2).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                                                        org.telegram.messenger.np.s1(i15).o0(true);
                                                        org.telegram.ui.ActionBar.e2 e2Var = photoViewer2.m4;
                                                        if (e2Var instanceof an) {
                                                            an anVar = (an) e2Var;
                                                            anVar.ib(photoViewer2.T4);
                                                            anVar.kb(photoViewer2.T4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    Drawable[] drawableArr4 = PhotoViewer.Z8;
                                                    if (!org.telegram.messenger.m10.i(i15).q()) {
                                                        new ug.x0(photoViewer2.m4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.cc(photoViewer2.f0, bVar2).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                                                        org.telegram.messenger.np.s1(i15).o0(true);
                                                        org.telegram.ui.ActionBar.e2 e2Var2 = photoViewer2.m4;
                                                        if (e2Var2 instanceof an) {
                                                            an anVar2 = (an) e2Var2;
                                                            anVar2.ib(photoViewer2.T4);
                                                            anVar2.kb(photoViewer2.T4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    }, false);
                                }
                            }
                            if (G.x() > 0) {
                                G.Z();
                                break;
                            }
                        }
                        org.telegram.ui.Components.m60 J = G.J();
                        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, photoViewer.F, bVar, true, false);
                        z0Var.setItemHeight(44);
                        z0Var.j(org.telegram.messenger.hd.M0(2131753756, null), R.drawable.msg_arrow_back, null);
                        z0Var.getTextView().setPadding(org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0);
                        z0Var.setOnClickListener(new ig(G, 1));
                        J.r(z0Var, c8.ja.o(-1, -2));
                        J.r(new org.telegram.ui.ActionBar.d1(photoViewer.F, bVar), c8.ja.o(-1, 8));
                        ArrayList arrayList = new ArrayList();
                        String str3 = photoViewer.T4.T0;
                        if (str3 != null) {
                            f11 = 300.0f;
                            if (TextUtils.equals(org.telegram.messenger.g0.K0(str3, false), org.telegram.messenger.np.s1(photoViewer.U).V2)) {
                                f10 = 18.0f;
                            } else {
                                TextView textView = new TextView(photoViewer.F);
                                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.Xc, bVar);
                                textView.setTextSize(1, 14.0f);
                                f12 = 10.0f;
                                f10 = 18.0f;
                                textView.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(10.0f));
                                textView.setMaxWidth(org.telegram.messenger.g0.L(300.0f));
                                Uri parse = Uri.parse(photoViewer.T4.T0);
                                textView.setText(vf.c.w(parse, null, null, vf.c.a(parse.getHost()), null));
                                int i15 = org.telegram.ui.ActionBar.j6.I5;
                                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.j6.a0(photoViewer.w1(i15), 0, photoViewer.T4.X0 == null ? 6 : 0);
                                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i15);
                                textView.setBackground(a02);
                                org.telegram.ui.ActionBar.q6.j(textView, a02, null, M, bVar);
                                textView.setOnClickListener(new a90(9, photoViewer, G));
                                textView.setOnLongClickListener(new fi.b2(4, photoViewer, bVar));
                                arrayList.add(textView);
                                if (photoViewer.T4.W0 != null) {
                                    TextView textView2 = new TextView(photoViewer.F);
                                    org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.E8, bVar);
                                    textView2.setTextSize(1, 14.0f);
                                    textView2.setPadding(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f12));
                                    textView2.setMaxWidth(org.telegram.messenger.g0.L(f11));
                                    textView2.setText(photoViewer.T4.W0);
                                    int i16 = org.telegram.ui.ActionBar.j6.I5;
                                    org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.j6.a0(photoViewer.w1(i16), 0, photoViewer.T4.X0 == null ? 6 : 0);
                                    org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i16);
                                    textView2.setBackground(a03);
                                    org.telegram.ui.ActionBar.q6.j(textView2, a03, null, M2, bVar);
                                    textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.in0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            int i17 = i11;
                                            fi.b bVar2 = bVar;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (i17) {
                                                case 0:
                                                    if (org.telegram.messenger.g0.g(photoViewer2.T4.W0)) {
                                                        org.telegram.messenger.i20.s(null, 2131744194, new org.telegram.ui.Components.cc(org.telegram.ui.Components.ta.a(photoViewer2.F), bVar2));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    if (org.telegram.messenger.g0.g(photoViewer2.T4.X0)) {
                                                        org.telegram.messenger.i20.s(null, 2131744194, new org.telegram.ui.Components.cc(org.telegram.ui.Components.ta.a(photoViewer2.F), bVar2));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    arrayList.add(textView2);
                                }
                                if (photoViewer.T4.X0 != null) {
                                    TextView textView3 = new TextView(photoViewer.F);
                                    org.telegram.ui.ActionBar.q6.U(textView3, org.telegram.ui.ActionBar.j6.E8, bVar);
                                    textView3.setTextSize(1, 14.0f);
                                    textView3.setPadding(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f12));
                                    textView3.setMaxWidth(org.telegram.messenger.g0.L(f11));
                                    textView3.setText(photoViewer.T4.X0);
                                    int i17 = org.telegram.ui.ActionBar.j6.I5;
                                    org.telegram.ui.Cells.y a04 = org.telegram.ui.ActionBar.j6.a0(photoViewer.w1(i17), 0, 6);
                                    org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i17);
                                    textView3.setBackground(a04);
                                    org.telegram.ui.ActionBar.q6.j(textView3, a04, null, M3, bVar);
                                    final int i18 = 1;
                                    textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.in0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            int i172 = i18;
                                            fi.b bVar2 = bVar;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (i172) {
                                                case 0:
                                                    if (org.telegram.messenger.g0.g(photoViewer2.T4.W0)) {
                                                        org.telegram.messenger.i20.s(null, 2131744194, new org.telegram.ui.Components.cc(org.telegram.ui.Components.ta.a(photoViewer2.F), bVar2));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    if (org.telegram.messenger.g0.g(photoViewer2.T4.X0)) {
                                                        org.telegram.messenger.i20.s(null, 2131744194, new org.telegram.ui.Components.cc(org.telegram.ui.Components.ta.a(photoViewer2.F), bVar2));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    arrayList.add(textView3);
                                }
                                for (i7 = 0; i7 < arrayList.size(); i7++) {
                                    View view2 = (View) arrayList.get(i7);
                                    if (i7 > 0) {
                                        FrameLayout frameLayout = new FrameLayout(photoViewer.F);
                                        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d7, frameLayout, bVar);
                                        LinearLayout.LayoutParams o4 = c8.ja.o(-1, 1);
                                        o4.height = 1;
                                        J.r(frameLayout, o4);
                                    }
                                    J.r(view2, c8.ja.o(-1, -2));
                                }
                                G.c(R.drawable.msg_channel, org.telegram.messenger.hd.M0(2131745248, null), new bi.n3(G, J, 11), false);
                                if (!org.telegram.messenger.m10.i(i13).q()) {
                                    G.c(R.drawable.msg_block2, org.telegram.messenger.hd.M0(2131749323, null), new Runnable() { // from class: org.telegram.ui.jn0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i142 = i11;
                                            fi.b bVar2 = bVar;
                                            int i152 = i13;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (i142) {
                                                case 0:
                                                    Drawable[] drawableArr3 = PhotoViewer.Z8;
                                                    if (!org.telegram.messenger.m10.i(i152).q()) {
                                                        new ug.x0(photoViewer2.m4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.cc(photoViewer2.f0, bVar2).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                                                        org.telegram.messenger.np.s1(i152).o0(true);
                                                        org.telegram.ui.ActionBar.e2 e2Var = photoViewer2.m4;
                                                        if (e2Var instanceof an) {
                                                            an anVar = (an) e2Var;
                                                            anVar.ib(photoViewer2.T4);
                                                            anVar.kb(photoViewer2.T4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    Drawable[] drawableArr4 = PhotoViewer.Z8;
                                                    if (!org.telegram.messenger.m10.i(i152).q()) {
                                                        new ug.x0(photoViewer2.m4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.cc(photoViewer2.f0, bVar2).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                                                        org.telegram.messenger.np.s1(i152).o0(true);
                                                        org.telegram.ui.ActionBar.e2 e2Var2 = photoViewer2.m4;
                                                        if (e2Var2 instanceof an) {
                                                            an anVar2 = (an) e2Var2;
                                                            anVar2.ib(photoViewer2.T4);
                                                            anVar2.kb(photoViewer2.T4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    }, false);
                                }
                                if (photoViewer.T4.b1) {
                                }
                                if (G.x() > 0) {
                                }
                            }
                        } else {
                            f10 = 18.0f;
                            f11 = 300.0f;
                        }
                        f12 = 10.0f;
                        if (photoViewer.T4.W0 != null) {
                        }
                        if (photoViewer.T4.X0 != null) {
                        }
                        while (i7 < arrayList.size()) {
                        }
                        G.c(R.drawable.msg_channel, org.telegram.messenger.hd.M0(2131745248, null), new bi.n3(G, J, 11), false);
                        if (!org.telegram.messenger.m10.i(i13).q()) {
                        }
                        if (photoViewer.T4.b1) {
                        }
                        if (G.x() > 0) {
                        }
                    }
                }
                break;
            case 4:
                org.telegram.messenger.gj gjVar4 = photoViewer.T4;
                if (gjVar4 != null && gjVar4.D2(true)) {
                    uq uqVar = photoViewer.K0;
                    org.telegram.messenger.gj gjVar5 = photoViewer.T4;
                    LinearLayout linearLayout = uqVar.b;
                    if (gjVar5 != null && (message = gjVar5.k) != null && message.media != null && gjVar5.D2(true)) {
                        int i19 = gjVar5.K1;
                        TLRPC.MessageMedia messageMedia = gjVar5.k.media;
                        ArrayList X = org.telegram.ui.Components.u51.X(i19, messageMedia.document, messageMedia.alt_documents, 0, true);
                        linearLayout.removeAllViews();
                        int i20 = 0;
                        while (i20 < X.size()) {
                            org.telegram.ui.Components.r51 r51Var2 = (org.telegram.ui.Components.r51) X.get(i20);
                            org.telegram.ui.Components.t51 a10 = r51Var2.a();
                            StringBuilder sb2 = new StringBuilder();
                            Object[] objArr = new Object[i12];
                            objArr[0] = Integer.valueOf(r51Var2.b());
                            sb2.append(org.telegram.messenger.hd.a0(str, str, 2131746451, objArr));
                            sb2.append(r51Var2.a ? " (" + org.telegram.messenger.hd.M0(2131746450, str) + ")" : "");
                            String sb3 = sb2.toString();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (a10.b()) {
                                r51Var = r51Var2;
                                spannableStringBuilder.append(org.telegram.messenger.g0.i0(a10.g.size, false, false));
                                spannableStringBuilder.append(org.telegram.messenger.hd.M0(2131746454, str));
                            } else {
                                r51Var = r51Var2;
                                SpannableString spannableString = new SpannableString("s ");
                                org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.msg_mini_arrow_mediabold, 0);
                                eqVar.w = 90.0f;
                                float L = org.telegram.messenger.g0.L(1.0f);
                                eqVar.r = f13;
                                eqVar.s = L;
                                eqVar.H = 0.85f;
                                spannableString.setSpan(eqVar, 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) spannableString);
                                spannableStringBuilder.append(org.telegram.messenger.g0.i0(a10.g.size, false, false));
                            }
                            org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, linearLayout, 0, sb3, false, null);
                            c10.setSubtext(spannableStringBuilder);
                            c10.d(-328966, -328966);
                            c10.b.setPadding(0, 0, 0, 0);
                            c10.setOnClickListener(new y(uqVar, gjVar5, r51Var, 9));
                            c10.setSelectorColor(268435455);
                            i20++;
                            f13 = 0.0f;
                            str = null;
                            i12 = 1;
                        }
                        photoViewer.u0.b();
                        break;
                    }
                }
                org.telegram.ui.Components.o7 o7Var = photoViewer.G;
                if (o7Var != null && o7Var.getActionBarMenuOnItemClick() != null) {
                    photoViewer.G.getActionBarMenuOnItemClick().b(2);
                    photoViewer.p0.V(null, null);
                    break;
                }
                break;
            case 5:
                Activity activity = photoViewer.E;
                if (activity != null) {
                    photoViewer.Z3 = false;
                    photoViewer.Y3 = 1;
                    if (photoViewer.X3 == -10) {
                        photoViewer.X3 = activity.getRequestedOrientation();
                    }
                    if (((WindowManager) photoViewer.E.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                        photoViewer.E.setRequestedOrientation(8);
                    } else {
                        photoViewer.E.setRequestedOrientation(0);
                    }
                    photoViewer.h3(false, false);
                    break;
                }
                break;
            case 6:
                Activity activity2 = photoViewer.E;
                if (activity2 != null) {
                    photoViewer.Z3 = false;
                    photoViewer.Y3 = 2;
                    if (photoViewer.X3 == -10) {
                        photoViewer.X3 = activity2.getRequestedOrientation();
                    }
                    photoViewer.E.setRequestedOrientation(1);
                    break;
                }
                break;
            default:
                org.telegram.messenger.gj gjVar6 = photoViewer.T4;
                if (gjVar6 != null && gjVar6.r4()) {
                    org.telegram.ui.ActionBar.e2 e2Var = photoViewer.m4;
                    if (e2Var instanceof an) {
                        ((an) e2Var).ma(photoViewer.T4, false, true);
                    }
                    photoViewer.z0(true, false);
                    String str4 = photoViewer.T4.T0;
                    if (str4 != null) {
                        Context context = LaunchActivity.H1;
                        if (context == null) {
                            context = photoViewer.F;
                        }
                        vf.c.s(context, Uri.parse(str4), true, false, false, null, null, false, org.telegram.messenger.np.s1(photoViewer.U).e6, false, false);
                        break;
                    }
                }
                break;
        }
    }
}
