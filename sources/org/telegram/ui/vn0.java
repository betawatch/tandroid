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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vn0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ vn0(PhotoViewer photoViewer, int i7) {
        this.a = i7;
        this.b = photoViewer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x0247, code lost:
    
        if (r3.startsWith("https://" + org.telegram.messenger.np.u1(r8.U).X2) == false) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0453  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        uq0 uq0Var;
        float f10;
        float f11;
        int i7;
        int i10;
        TLRPC.Message message;
        int i11 = this.a;
        float f12 = 0.0f;
        String str = null;
        int i12 = 3;
        final PhotoViewer photoViewer = this.b;
        final int i13 = 0;
        int i14 = 1;
        switch (i11) {
            case 0:
                if (!photoViewer.f2 && !photoViewer.F1()) {
                    photoViewer.K2();
                    break;
                }
                break;
            case 1:
                Drawable[] drawableArr = PhotoViewer.Z8;
                if (!photoViewer.F1() && (uq0Var = photoViewer.d) != null && uq0Var.c() != null && !photoViewer.d.c().isEmpty()) {
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
                        final int i15 = photoViewer.T4.K1;
                        final fi.b bVar = new fi.b();
                        org.telegram.ui.Components.a70 H = org.telegram.ui.Components.a70.H(photoViewer.f0, bVar, photoViewer.p0, true);
                        H.b0(0.0f, -org.telegram.messenger.g0.L(46.0f));
                        H.W(5);
                        org.telegram.messenger.gj gjVar3 = photoViewer.T4;
                        if (gjVar3.W0 == null && gjVar3.X0 == null) {
                            String str2 = gjVar3.T0;
                            if (str2 != null) {
                                break;
                            }
                            if (!org.telegram.messenger.k10.i(i15).q() && !org.telegram.messenger.np.u1(photoViewer.U).K3() && !photoViewer.T4.b1) {
                                H.c(R.drawable.msg_block2, org.telegram.messenger.hd.N0(2131749130, null), new Runnable() { // from class: org.telegram.ui.mn0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i16 = i13;
                                        fi.b bVar2 = bVar;
                                        int i17 = i15;
                                        PhotoViewer photoViewer2 = photoViewer;
                                        switch (i16) {
                                            case 0:
                                                Drawable[] drawableArr3 = PhotoViewer.Z8;
                                                if (!org.telegram.messenger.k10.i(i17).q()) {
                                                    new ug.y0(photoViewer2.m4, 3, true).show();
                                                    break;
                                                } else {
                                                    new org.telegram.ui.Components.lc(photoViewer2.f0, bVar2).c(org.telegram.messenger.hd.N0(2131754485, null)).j();
                                                    org.telegram.messenger.np.u1(i17).p0(true);
                                                    org.telegram.ui.ActionBar.g2 g2Var = photoViewer2.m4;
                                                    if (g2Var instanceof bn) {
                                                        bn bnVar = (bn) g2Var;
                                                        bnVar.ib(photoViewer2.T4);
                                                        bnVar.kb(photoViewer2.T4);
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                Drawable[] drawableArr4 = PhotoViewer.Z8;
                                                if (!org.telegram.messenger.k10.i(i17).q()) {
                                                    new ug.y0(photoViewer2.m4, 3, true).show();
                                                    break;
                                                } else {
                                                    new org.telegram.ui.Components.lc(photoViewer2.f0, bVar2).c(org.telegram.messenger.hd.N0(2131754485, null)).j();
                                                    org.telegram.messenger.np.u1(i17).p0(true);
                                                    org.telegram.ui.ActionBar.g2 g2Var2 = photoViewer2.m4;
                                                    if (g2Var2 instanceof bn) {
                                                        bn bnVar2 = (bn) g2Var2;
                                                        bnVar2.ib(photoViewer2.T4);
                                                        bnVar2.kb(photoViewer2.T4);
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                }, false);
                            }
                            if (photoViewer.T4.b1) {
                                H.c(R.drawable.msg_info, org.telegram.messenger.hd.N0(2131754943, null), new fe0(20, photoViewer, bVar), false);
                                if ((photoViewer.m4 instanceof bn) && !org.telegram.messenger.np.u1(i15).K3()) {
                                    H.k();
                                    final int i16 = 1;
                                    H.c(R.drawable.msg_cancel, org.telegram.messenger.hd.N0(2131746124, null), new Runnable() { // from class: org.telegram.ui.mn0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i162 = i16;
                                            fi.b bVar2 = bVar;
                                            int i17 = i15;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (i162) {
                                                case 0:
                                                    Drawable[] drawableArr3 = PhotoViewer.Z8;
                                                    if (!org.telegram.messenger.k10.i(i17).q()) {
                                                        new ug.y0(photoViewer2.m4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.lc(photoViewer2.f0, bVar2).c(org.telegram.messenger.hd.N0(2131754485, null)).j();
                                                        org.telegram.messenger.np.u1(i17).p0(true);
                                                        org.telegram.ui.ActionBar.g2 g2Var = photoViewer2.m4;
                                                        if (g2Var instanceof bn) {
                                                            bn bnVar = (bn) g2Var;
                                                            bnVar.ib(photoViewer2.T4);
                                                            bnVar.kb(photoViewer2.T4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    Drawable[] drawableArr4 = PhotoViewer.Z8;
                                                    if (!org.telegram.messenger.k10.i(i17).q()) {
                                                        new ug.y0(photoViewer2.m4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.lc(photoViewer2.f0, bVar2).c(org.telegram.messenger.hd.N0(2131754485, null)).j();
                                                        org.telegram.messenger.np.u1(i17).p0(true);
                                                        org.telegram.ui.ActionBar.g2 g2Var2 = photoViewer2.m4;
                                                        if (g2Var2 instanceof bn) {
                                                            bn bnVar2 = (bn) g2Var2;
                                                            bnVar2.ib(photoViewer2.T4);
                                                            bnVar2.kb(photoViewer2.T4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    }, false);
                                }
                            }
                            if (H.y() > 0) {
                                H.a0();
                                break;
                            }
                        }
                        org.telegram.ui.Components.a70 K = H.K();
                        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, photoViewer.F, bVar, true, false);
                        y0Var.setItemHeight(44);
                        y0Var.j(org.telegram.messenger.hd.N0(2131753753, null), R.drawable.msg_arrow_back, null);
                        y0Var.getTextView().setPadding(org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0);
                        y0Var.setOnClickListener(new kg(H, 1));
                        K.r(y0Var, c8.ma.o(-1, -2));
                        K.r(new org.telegram.ui.ActionBar.d1(photoViewer.F, bVar), c8.ma.o(-1, 8));
                        ArrayList arrayList = new ArrayList();
                        String str3 = photoViewer.T4.T0;
                        if (str3 != null) {
                            f10 = 300.0f;
                            if (!TextUtils.equals(org.telegram.messenger.g0.K0(str3, false), org.telegram.messenger.np.u1(photoViewer.U).X2)) {
                                TextView textView = new TextView(photoViewer.F);
                                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Xc, bVar);
                                textView.setTextSize(1, 14.0f);
                                f11 = 10.0f;
                                textView.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(10.0f));
                                textView.setMaxWidth(org.telegram.messenger.g0.L(300.0f));
                                Uri parse = Uri.parse(photoViewer.T4.T0);
                                textView.setText(vf.c.w(parse, null, null, vf.c.a(parse.getHost()), null));
                                int i17 = org.telegram.ui.ActionBar.m6.I5;
                                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(photoViewer.w1(i17), 0, photoViewer.T4.X0 == null ? 6 : 0);
                                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i17);
                                textView.setBackground(a02);
                                org.telegram.ui.ActionBar.t6.j(textView, a02, null, M, bVar);
                                textView.setOnClickListener(new jg0(i12, photoViewer, H));
                                textView.setOnLongClickListener(new fi.z1(4, photoViewer, bVar));
                                arrayList.add(textView);
                                if (photoViewer.T4.W0 != null) {
                                    TextView textView2 = new TextView(photoViewer.F);
                                    org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.E8, bVar);
                                    textView2.setTextSize(1, 14.0f);
                                    textView2.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(f11));
                                    textView2.setMaxWidth(org.telegram.messenger.g0.L(f10));
                                    textView2.setText(photoViewer.T4.W0);
                                    int i18 = org.telegram.ui.ActionBar.m6.I5;
                                    org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.m6.a0(photoViewer.w1(i18), 0, photoViewer.T4.X0 == null ? 6 : 0);
                                    org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i18);
                                    textView2.setBackground(a03);
                                    org.telegram.ui.ActionBar.t6.j(textView2, a03, null, M2, bVar);
                                    textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ln0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            int i19 = i13;
                                            fi.b bVar2 = bVar;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (i19) {
                                                case 0:
                                                    if (org.telegram.messenger.g0.g(photoViewer2.T4.W0)) {
                                                        org.telegram.messenger.o10.t(null, 2131743951, new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(photoViewer2.F), bVar2));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    if (org.telegram.messenger.g0.g(photoViewer2.T4.X0)) {
                                                        org.telegram.messenger.o10.t(null, 2131743951, new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(photoViewer2.F), bVar2));
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
                                    org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.E8, bVar);
                                    textView3.setTextSize(1, 14.0f);
                                    textView3.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(f11));
                                    textView3.setMaxWidth(org.telegram.messenger.g0.L(f10));
                                    textView3.setText(photoViewer.T4.X0);
                                    int i19 = org.telegram.ui.ActionBar.m6.I5;
                                    org.telegram.ui.Cells.y a04 = org.telegram.ui.ActionBar.m6.a0(photoViewer.w1(i19), 0, 6);
                                    org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i19);
                                    textView3.setBackground(a04);
                                    org.telegram.ui.ActionBar.t6.j(textView3, a04, null, M3, bVar);
                                    final int i20 = 1;
                                    textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ln0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            int i192 = i20;
                                            fi.b bVar2 = bVar;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (i192) {
                                                case 0:
                                                    if (org.telegram.messenger.g0.g(photoViewer2.T4.W0)) {
                                                        org.telegram.messenger.o10.t(null, 2131743951, new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(photoViewer2.F), bVar2));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    if (org.telegram.messenger.g0.g(photoViewer2.T4.X0)) {
                                                        org.telegram.messenger.o10.t(null, 2131743951, new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(photoViewer2.F), bVar2));
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
                                        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d7, frameLayout, bVar);
                                        i10 = -1;
                                        LinearLayout.LayoutParams o4 = c8.ma.o(-1, 1);
                                        o4.height = 1;
                                        K.r(frameLayout, o4);
                                    } else {
                                        i10 = -1;
                                    }
                                    K.r(view2, c8.ma.o(i10, -2));
                                }
                                H.c(R.drawable.msg_channel, org.telegram.messenger.hd.N0(2131745005, null), new bi.x5(H, K, 11), false);
                                if (!org.telegram.messenger.k10.i(i15).q()) {
                                    H.c(R.drawable.msg_block2, org.telegram.messenger.hd.N0(2131749130, null), new Runnable() { // from class: org.telegram.ui.mn0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i162 = i13;
                                            fi.b bVar2 = bVar;
                                            int i172 = i15;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (i162) {
                                                case 0:
                                                    Drawable[] drawableArr3 = PhotoViewer.Z8;
                                                    if (!org.telegram.messenger.k10.i(i172).q()) {
                                                        new ug.y0(photoViewer2.m4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.lc(photoViewer2.f0, bVar2).c(org.telegram.messenger.hd.N0(2131754485, null)).j();
                                                        org.telegram.messenger.np.u1(i172).p0(true);
                                                        org.telegram.ui.ActionBar.g2 g2Var = photoViewer2.m4;
                                                        if (g2Var instanceof bn) {
                                                            bn bnVar = (bn) g2Var;
                                                            bnVar.ib(photoViewer2.T4);
                                                            bnVar.kb(photoViewer2.T4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    Drawable[] drawableArr4 = PhotoViewer.Z8;
                                                    if (!org.telegram.messenger.k10.i(i172).q()) {
                                                        new ug.y0(photoViewer2.m4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.lc(photoViewer2.f0, bVar2).c(org.telegram.messenger.hd.N0(2131754485, null)).j();
                                                        org.telegram.messenger.np.u1(i172).p0(true);
                                                        org.telegram.ui.ActionBar.g2 g2Var2 = photoViewer2.m4;
                                                        if (g2Var2 instanceof bn) {
                                                            bn bnVar2 = (bn) g2Var2;
                                                            bnVar2.ib(photoViewer2.T4);
                                                            bnVar2.kb(photoViewer2.T4);
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
                                if (H.y() > 0) {
                                }
                            }
                        } else {
                            f10 = 300.0f;
                        }
                        f11 = 10.0f;
                        if (photoViewer.T4.W0 != null) {
                        }
                        if (photoViewer.T4.X0 != null) {
                        }
                        while (i7 < arrayList.size()) {
                        }
                        H.c(R.drawable.msg_channel, org.telegram.messenger.hd.N0(2131745005, null), new bi.x5(H, K, 11), false);
                        if (!org.telegram.messenger.k10.i(i15).q()) {
                        }
                        if (photoViewer.T4.b1) {
                        }
                        if (H.y() > 0) {
                        }
                    }
                }
                break;
            case 4:
                org.telegram.messenger.gj gjVar4 = photoViewer.T4;
                if (gjVar4 != null && gjVar4.D2(true)) {
                    vq vqVar = photoViewer.K0;
                    org.telegram.messenger.gj gjVar5 = photoViewer.T4;
                    LinearLayout linearLayout = vqVar.b;
                    if (gjVar5 != null && (message = gjVar5.k) != null && message.media != null && gjVar5.D2(true)) {
                        int i21 = gjVar5.K1;
                        TLRPC.MessageMedia messageMedia = gjVar5.k.media;
                        ArrayList X = org.telegram.ui.Components.i61.X(i21, messageMedia.document, messageMedia.alt_documents, 0, true);
                        linearLayout.removeAllViews();
                        int i22 = 0;
                        while (i22 < X.size()) {
                            org.telegram.ui.Components.f61 f61Var = (org.telegram.ui.Components.f61) X.get(i22);
                            org.telegram.ui.Components.h61 a10 = f61Var.a();
                            StringBuilder sb2 = new StringBuilder();
                            Object[] objArr = new Object[i14];
                            objArr[0] = Integer.valueOf(f61Var.b());
                            sb2.append(org.telegram.messenger.hd.a0(str, str, 2131746255, objArr));
                            sb2.append(f61Var.a ? " (" + org.telegram.messenger.hd.N0(2131746254, str) + ")" : "");
                            String sb3 = sb2.toString();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (a10.b()) {
                                spannableStringBuilder.append(org.telegram.messenger.g0.i0(a10.g.size, false, false));
                                spannableStringBuilder.append(org.telegram.messenger.hd.N0(2131746258, str));
                            } else {
                                SpannableString spannableString = new SpannableString("s ");
                                org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(R.drawable.msg_mini_arrow_mediabold, 0);
                                nqVar.w = 90.0f;
                                float L = org.telegram.messenger.g0.L(1.0f);
                                nqVar.r = f12;
                                nqVar.s = L;
                                nqVar.H = 0.85f;
                                spannableString.setSpan(nqVar, 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) spannableString);
                                spannableStringBuilder.append(org.telegram.messenger.g0.i0(a10.g.size, false, false));
                            }
                            org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, linearLayout, 0, sb3, false, null);
                            c10.setSubtext(spannableStringBuilder);
                            c10.d(-328966, -328966);
                            c10.b.setPadding(0, 0, 0, 0);
                            c10.setOnClickListener(new y(vqVar, gjVar5, f61Var, 9));
                            c10.setSelectorColor(268435455);
                            i22++;
                            f12 = 0.0f;
                            str = null;
                            i14 = 1;
                        }
                        photoViewer.u0.b();
                        break;
                    }
                }
                org.telegram.ui.Components.v7 v7Var = photoViewer.G;
                if (v7Var != null && v7Var.getActionBarMenuOnItemClick() != null) {
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
                    org.telegram.ui.ActionBar.g2 g2Var = photoViewer.m4;
                    if (g2Var instanceof bn) {
                        ((bn) g2Var).ma(photoViewer.T4, false, true);
                    }
                    photoViewer.z0(true, false);
                    String str4 = photoViewer.T4.T0;
                    if (str4 != null) {
                        Context context = LaunchActivity.H1;
                        if (context == null) {
                            context = photoViewer.F;
                        }
                        vf.c.s(context, Uri.parse(str4), true, false, false, null, null, false, org.telegram.messenger.np.u1(photoViewer.U).g6, false, false);
                        break;
                    }
                }
                break;
        }
    }
}
