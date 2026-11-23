package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class vn0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ vn0(PhotoViewer photoViewer, int i7) {
        this.a = i7;
        this.b = photoViewer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x022a, code lost:
    
        if (r4.startsWith("https://" + org.telegram.messenger.mp.u1(r6.U).X2) == false) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x045d  */
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
        org.telegram.messenger.fj fjVar;
        int i11 = this.a;
        float f12 = 0.0f;
        final int i12 = 0;
        final PhotoViewer photoViewer = this.b;
        int i13 = 1;
        switch (i11) {
            case 0:
                float f13 = -photoViewer.D1.b.getStateOrientation();
                if (Math.abs(f13) > 180.0f) {
                    f13 = f13 < 0.0f ? f13 + 360.0f : -(360.0f - f13);
                }
                photoViewer.I0(f13, photoViewer.D1.b.getStateMirror(), new kn0(photoViewer, 26));
                break;
            case 1:
                if (!photoViewer.f2 && !photoViewer.F1()) {
                    photoViewer.L2();
                    break;
                }
                break;
            case 2:
                Drawable[] drawableArr = PhotoViewer.f9;
                if (!photoViewer.F1() && (uq0Var = photoViewer.d) != null && uq0Var.c() != null && !photoViewer.d.c().isEmpty()) {
                    photoViewer.o3(!photoViewer.L, true);
                    break;
                }
                break;
            case 3:
                Drawable[] drawableArr2 = PhotoViewer.f9;
                photoViewer.T1(true);
                photoViewer.u0(0, true);
                break;
            case 4:
                org.telegram.messenger.fj fjVar2 = photoViewer.T4;
                if (fjVar2 == null || !fjVar2.r4()) {
                    if (photoViewer.G.v0.a()) {
                        photoViewer.p0.V(null, null);
                        break;
                    }
                } else {
                    org.telegram.messenger.fj fjVar3 = photoViewer.T4;
                    if (fjVar3 != null && fjVar3.r4() && photoViewer.p0.getAlpha() > 0.5f) {
                        final int i14 = photoViewer.T4.K1;
                        final fi.b bVar = new fi.b();
                        org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(photoViewer.f0, bVar, photoViewer.p0, true);
                        H.b0(0.0f, -org.telegram.messenger.g0.L(46.0f));
                        H.W(5);
                        org.telegram.messenger.fj fjVar4 = photoViewer.T4;
                        if (fjVar4.W0 == null && fjVar4.X0 == null) {
                            String str = fjVar4.T0;
                            if (str != null) {
                                break;
                            }
                            if (!org.telegram.messenger.i10.i(i14).q() && !org.telegram.messenger.mp.u1(photoViewer.U).K3() && !photoViewer.T4.b1) {
                                H.c(R.drawable.msg_block2, org.telegram.messenger.gd.N0(2131749130, null), new Runnable() { // from class: org.telegram.ui.on0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i15 = i12;
                                        fi.b bVar2 = bVar;
                                        int i16 = i14;
                                        PhotoViewer photoViewer2 = photoViewer;
                                        switch (i15) {
                                            case 0:
                                                Drawable[] drawableArr3 = PhotoViewer.f9;
                                                if (!org.telegram.messenger.i10.i(i16).q()) {
                                                    new ug.y0(photoViewer2.m4, 3, true).show();
                                                    break;
                                                } else {
                                                    new org.telegram.ui.Components.kc(photoViewer2.f0, bVar2).c(org.telegram.messenger.gd.N0(2131754485, null)).j();
                                                    org.telegram.messenger.mp.u1(i16).p0(true);
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
                                                Drawable[] drawableArr4 = PhotoViewer.f9;
                                                if (!org.telegram.messenger.i10.i(i16).q()) {
                                                    new ug.y0(photoViewer2.m4, 3, true).show();
                                                    break;
                                                } else {
                                                    new org.telegram.ui.Components.kc(photoViewer2.f0, bVar2).c(org.telegram.messenger.gd.N0(2131754485, null)).j();
                                                    org.telegram.messenger.mp.u1(i16).p0(true);
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
                                H.c(R.drawable.msg_info, org.telegram.messenger.gd.N0(2131754943, null), new bd0(25, photoViewer, bVar), false);
                                if ((photoViewer.m4 instanceof bn) && !org.telegram.messenger.mp.u1(i14).K3()) {
                                    H.k();
                                    final int i15 = 1;
                                    H.c(R.drawable.msg_cancel, org.telegram.messenger.gd.N0(2131746124, null), new Runnable() { // from class: org.telegram.ui.on0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i152 = i15;
                                            fi.b bVar2 = bVar;
                                            int i16 = i14;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (i152) {
                                                case 0:
                                                    Drawable[] drawableArr3 = PhotoViewer.f9;
                                                    if (!org.telegram.messenger.i10.i(i16).q()) {
                                                        new ug.y0(photoViewer2.m4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.kc(photoViewer2.f0, bVar2).c(org.telegram.messenger.gd.N0(2131754485, null)).j();
                                                        org.telegram.messenger.mp.u1(i16).p0(true);
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
                                                    Drawable[] drawableArr4 = PhotoViewer.f9;
                                                    if (!org.telegram.messenger.i10.i(i16).q()) {
                                                        new ug.y0(photoViewer2.m4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.kc(photoViewer2.f0, bVar2).c(org.telegram.messenger.gd.N0(2131754485, null)).j();
                                                        org.telegram.messenger.mp.u1(i16).p0(true);
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
                        org.telegram.ui.Components.x60 K = H.K();
                        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, photoViewer.F, bVar, true, false);
                        y0Var.setItemHeight(44);
                        y0Var.j(org.telegram.messenger.gd.N0(2131753753, null), R.drawable.msg_arrow_back, null);
                        y0Var.getTextView().setPadding(org.telegram.messenger.gd.a0 ? 0 : org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0);
                        y0Var.setOnClickListener(new kg(H, 1));
                        K.r(y0Var, c8.na.o(-1, -2));
                        K.r(new org.telegram.ui.ActionBar.d1(photoViewer.F, bVar), c8.na.o(-1, 8));
                        ArrayList arrayList = new ArrayList();
                        String str2 = photoViewer.T4.T0;
                        if (str2 != null) {
                            f10 = 300.0f;
                            if (!TextUtils.equals(org.telegram.messenger.g0.K0(str2, false), org.telegram.messenger.mp.u1(photoViewer.U).X2)) {
                                TextView textView = new TextView(photoViewer.F);
                                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Xc, bVar);
                                textView.setTextSize(1, 14.0f);
                                f11 = 10.0f;
                                textView.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(10.0f));
                                textView.setMaxWidth(org.telegram.messenger.g0.L(300.0f));
                                Uri parse = Uri.parse(photoViewer.T4.T0);
                                textView.setText(vf.c.w(parse, null, null, vf.c.a(parse.getHost()), null));
                                int i16 = org.telegram.ui.ActionBar.n6.I5;
                                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.n6.a0(photoViewer.w1(i16), 0, photoViewer.T4.X0 == null ? 6 : 0);
                                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i16);
                                textView.setBackground(a02);
                                org.telegram.ui.ActionBar.u6.j(textView, a02, null, M, bVar);
                                textView.setOnClickListener(new ig0(3, photoViewer, H));
                                textView.setOnLongClickListener(new fi.z1(4, photoViewer, bVar));
                                arrayList.add(textView);
                                if (photoViewer.T4.W0 != null) {
                                    TextView textView2 = new TextView(photoViewer.F);
                                    org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.E8, bVar);
                                    textView2.setTextSize(1, 14.0f);
                                    textView2.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(f11));
                                    textView2.setMaxWidth(org.telegram.messenger.g0.L(f10));
                                    textView2.setText(photoViewer.T4.W0);
                                    int i17 = org.telegram.ui.ActionBar.n6.I5;
                                    org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.n6.a0(photoViewer.w1(i17), 0, photoViewer.T4.X0 == null ? 6 : 0);
                                    org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i17);
                                    textView2.setBackground(a03);
                                    org.telegram.ui.ActionBar.u6.j(textView2, a03, null, M2, bVar);
                                    textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.nn0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            int i18 = i12;
                                            fi.b bVar2 = bVar;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (i18) {
                                                case 0:
                                                    if (org.telegram.messenger.g0.g(photoViewer2.T4.W0)) {
                                                        org.telegram.messenger.m10.t(null, 2131743949, new org.telegram.ui.Components.kc(org.telegram.ui.Components.bb.a(photoViewer2.F), bVar2));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    if (org.telegram.messenger.g0.g(photoViewer2.T4.X0)) {
                                                        org.telegram.messenger.m10.t(null, 2131743949, new org.telegram.ui.Components.kc(org.telegram.ui.Components.bb.a(photoViewer2.F), bVar2));
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
                                    org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.E8, bVar);
                                    textView3.setTextSize(1, 14.0f);
                                    textView3.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(f11));
                                    textView3.setMaxWidth(org.telegram.messenger.g0.L(f10));
                                    textView3.setText(photoViewer.T4.X0);
                                    int i18 = org.telegram.ui.ActionBar.n6.I5;
                                    org.telegram.ui.Cells.y a04 = org.telegram.ui.ActionBar.n6.a0(photoViewer.w1(i18), 0, 6);
                                    org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i18);
                                    textView3.setBackground(a04);
                                    org.telegram.ui.ActionBar.u6.j(textView3, a04, null, M3, bVar);
                                    final int i19 = 1;
                                    textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.nn0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            int i182 = i19;
                                            fi.b bVar2 = bVar;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (i182) {
                                                case 0:
                                                    if (org.telegram.messenger.g0.g(photoViewer2.T4.W0)) {
                                                        org.telegram.messenger.m10.t(null, 2131743949, new org.telegram.ui.Components.kc(org.telegram.ui.Components.bb.a(photoViewer2.F), bVar2));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    if (org.telegram.messenger.g0.g(photoViewer2.T4.X0)) {
                                                        org.telegram.messenger.m10.t(null, 2131743949, new org.telegram.ui.Components.kc(org.telegram.ui.Components.bb.a(photoViewer2.F), bVar2));
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
                                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d7, frameLayout, bVar);
                                        i10 = -1;
                                        LinearLayout.LayoutParams o4 = c8.na.o(-1, 1);
                                        o4.height = 1;
                                        K.r(frameLayout, o4);
                                    } else {
                                        i10 = -1;
                                    }
                                    K.r(view2, c8.na.o(i10, -2));
                                }
                                H.c(R.drawable.msg_channel, org.telegram.messenger.gd.N0(2131745007, null), new bi.a6(H, K, 11), false);
                                if (!org.telegram.messenger.i10.i(i14).q()) {
                                    H.c(R.drawable.msg_block2, org.telegram.messenger.gd.N0(2131749130, null), new Runnable() { // from class: org.telegram.ui.on0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i152 = i12;
                                            fi.b bVar2 = bVar;
                                            int i162 = i14;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (i152) {
                                                case 0:
                                                    Drawable[] drawableArr3 = PhotoViewer.f9;
                                                    if (!org.telegram.messenger.i10.i(i162).q()) {
                                                        new ug.y0(photoViewer2.m4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.kc(photoViewer2.f0, bVar2).c(org.telegram.messenger.gd.N0(2131754485, null)).j();
                                                        org.telegram.messenger.mp.u1(i162).p0(true);
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
                                                    Drawable[] drawableArr4 = PhotoViewer.f9;
                                                    if (!org.telegram.messenger.i10.i(i162).q()) {
                                                        new ug.y0(photoViewer2.m4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.kc(photoViewer2.f0, bVar2).c(org.telegram.messenger.gd.N0(2131754485, null)).j();
                                                        org.telegram.messenger.mp.u1(i162).p0(true);
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
                        H.c(R.drawable.msg_channel, org.telegram.messenger.gd.N0(2131745007, null), new bi.a6(H, K, 11), false);
                        if (!org.telegram.messenger.i10.i(i14).q()) {
                        }
                        if (photoViewer.T4.b1) {
                        }
                        if (H.y() > 0) {
                        }
                    }
                }
                break;
            case 5:
                org.telegram.messenger.fj fjVar5 = photoViewer.T4;
                if (fjVar5 != null && fjVar5.D2(true)) {
                    vq vqVar = photoViewer.K0;
                    org.telegram.messenger.fj fjVar6 = photoViewer.T4;
                    LinearLayout linearLayout = vqVar.b;
                    if (fjVar6 != null && (message = fjVar6.k) != null && message.media != null && fjVar6.D2(true)) {
                        int i20 = fjVar6.K1;
                        TLRPC.MessageMedia messageMedia = fjVar6.k.media;
                        ArrayList X = org.telegram.ui.Components.h61.X(i20, messageMedia.document, messageMedia.alt_documents, 0, true);
                        linearLayout.removeAllViews();
                        int i21 = 0;
                        while (i21 < X.size()) {
                            org.telegram.ui.Components.e61 e61Var = (org.telegram.ui.Components.e61) X.get(i21);
                            org.telegram.ui.Components.g61 a10 = e61Var.a();
                            StringBuilder sb2 = new StringBuilder();
                            Object[] objArr = new Object[i13];
                            objArr[0] = Integer.valueOf(e61Var.b());
                            sb2.append(org.telegram.messenger.gd.a0(null, null, 2131746255, objArr));
                            sb2.append(e61Var.a ? " (" + org.telegram.messenger.gd.N0(2131746254, null) + ")" : "");
                            String sb3 = sb2.toString();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (a10.b()) {
                                fjVar = fjVar6;
                                spannableStringBuilder.append(org.telegram.messenger.g0.i0(a10.g.size, false, false));
                                spannableStringBuilder.append(org.telegram.messenger.gd.N0(2131746258, null));
                            } else {
                                fjVar = fjVar6;
                                SpannableString spannableString = new SpannableString("s ");
                                org.telegram.ui.Components.kq kqVar = new org.telegram.ui.Components.kq(R.drawable.msg_mini_arrow_mediabold, 0);
                                kqVar.w = 90.0f;
                                float L = org.telegram.messenger.g0.L(1.0f);
                                kqVar.r = f12;
                                kqVar.s = L;
                                kqVar.H = 0.85f;
                                spannableString.setSpan(kqVar, 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) spannableString);
                                spannableStringBuilder.append(org.telegram.messenger.g0.i0(a10.g.size, false, false));
                            }
                            int i22 = i21;
                            org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, linearLayout, 0, sb3, false, null);
                            c10.setSubtext(spannableStringBuilder);
                            c10.d(-328966, -328966);
                            c10.b.setPadding(0, 0, 0, 0);
                            org.telegram.messenger.fj fjVar7 = fjVar;
                            c10.setOnClickListener(new y(vqVar, fjVar7, e61Var, 9));
                            c10.setSelectorColor(268435455);
                            i21 = i22 + 1;
                            fjVar6 = fjVar7;
                            f12 = 0.0f;
                            i13 = 1;
                        }
                        photoViewer.u0.b();
                        break;
                    }
                }
                org.telegram.ui.Components.u7 u7Var = photoViewer.G;
                if (u7Var != null && u7Var.getActionBarMenuOnItemClick() != null) {
                    photoViewer.G.getActionBarMenuOnItemClick().b(2);
                    photoViewer.p0.V(null, null);
                    break;
                }
                break;
            case 6:
                Activity activity = photoViewer.E;
                if (activity != null) {
                    photoViewer.Z3 = false;
                    photoViewer.Y3 = 2;
                    if (photoViewer.X3 == -10) {
                        photoViewer.X3 = activity.getRequestedOrientation();
                    }
                    photoViewer.E.setRequestedOrientation(1);
                    break;
                }
                break;
            case 7:
                org.telegram.messenger.fj fjVar8 = photoViewer.T4;
                if (fjVar8 != null && fjVar8.r4()) {
                    org.telegram.ui.ActionBar.g2 g2Var = photoViewer.m4;
                    if (g2Var instanceof bn) {
                        ((bn) g2Var).ma(photoViewer.T4, false, true);
                    }
                    photoViewer.z0(true, false);
                    String str3 = photoViewer.T4.T0;
                    if (str3 != null) {
                        Context context = LaunchActivity.H1;
                        if (context == null) {
                            context = photoViewer.F;
                        }
                        vf.c.s(context, Uri.parse(str3), true, false, false, null, null, false, org.telegram.messenger.mp.u1(photoViewer.U).g6, false, false);
                        break;
                    }
                }
                break;
            default:
                photoViewer.p0.p();
                photoViewer.z0(false, false);
                Activity activity2 = photoViewer.E;
                if (activity2 instanceof LaunchActivity) {
                    ((LaunchActivity) activity2).u0(new ai.r2(), false, true);
                    break;
                }
                break;
        }
    }
}
