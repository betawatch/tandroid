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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rn0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ rn0(PhotoViewer photoViewer, int i7) {
        this.a = i7;
        this.b = photoViewer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x0248, code lost:
    
        if (r3.startsWith("https://" + org.telegram.messenger.qp.s1(r7.T).U2) == false) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0457  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        uq0 uq0Var;
        float f10;
        float f11;
        float f12;
        int i7;
        TLRPC.Message message;
        org.telegram.ui.Components.p51 p51Var;
        int i10 = this.a;
        float f13 = 0.0f;
        String str = null;
        final PhotoViewer photoViewer = this.b;
        final int i11 = 0;
        int i12 = 1;
        switch (i10) {
            case 0:
                if (!photoViewer.e2 && !photoViewer.F1()) {
                    photoViewer.J2();
                    break;
                }
                break;
            case 1:
                Drawable[] drawableArr = PhotoViewer.Y8;
                if (!photoViewer.F1() && (uq0Var = photoViewer.d) != null && uq0Var.c() != null && !photoViewer.d.c().isEmpty()) {
                    photoViewer.m3(!photoViewer.K, true);
                    break;
                }
                break;
            case 2:
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                photoViewer.S1(true);
                photoViewer.u0(0, true);
                break;
            case 3:
                org.telegram.messenger.ij ijVar = photoViewer.S4;
                if (ijVar == null || !ijVar.s4()) {
                    if (photoViewer.F.u0.a()) {
                        photoViewer.o0.U(null, null);
                        break;
                    }
                } else {
                    org.telegram.messenger.ij ijVar2 = photoViewer.S4;
                    if (ijVar2 != null && ijVar2.s4() && photoViewer.o0.getAlpha() > 0.5f) {
                        final int i13 = photoViewer.S4.I1;
                        final di.b bVar = new di.b();
                        org.telegram.ui.Components.k60 G = org.telegram.ui.Components.k60.G(photoViewer.e0, bVar, photoViewer.o0, true);
                        G.a0(0.0f, -org.telegram.messenger.g0.L(46.0f));
                        G.V(5);
                        org.telegram.messenger.ij ijVar3 = photoViewer.S4;
                        if (ijVar3.U0 == null && ijVar3.V0 == null) {
                            String str2 = ijVar3.R0;
                            if (str2 != null) {
                                break;
                            }
                            if (!org.telegram.messenger.p10.i(i13).q() && !org.telegram.messenger.qp.s1(photoViewer.T).D3() && !photoViewer.S4.Z0) {
                                G.c(R.drawable.msg_block2, org.telegram.messenger.hd.M0(2131749322, null), new Runnable() { // from class: org.telegram.ui.hn0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i14 = i11;
                                        di.b bVar2 = bVar;
                                        int i15 = i13;
                                        PhotoViewer photoViewer2 = photoViewer;
                                        switch (i14) {
                                            case 0:
                                                Drawable[] drawableArr3 = PhotoViewer.Y8;
                                                if (!org.telegram.messenger.p10.i(i15).q()) {
                                                    new ug.w0(photoViewer2.l4, 3, true).show();
                                                    break;
                                                } else {
                                                    new org.telegram.ui.Components.hc(photoViewer2.e0, bVar2).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                                                    org.telegram.messenger.qp.s1(i15).o0(true);
                                                    org.telegram.ui.ActionBar.f2 f2Var = photoViewer2.l4;
                                                    if (f2Var instanceof an) {
                                                        an anVar = (an) f2Var;
                                                        anVar.eb(photoViewer2.S4);
                                                        anVar.gb(photoViewer2.S4);
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                Drawable[] drawableArr4 = PhotoViewer.Y8;
                                                if (!org.telegram.messenger.p10.i(i15).q()) {
                                                    new ug.w0(photoViewer2.l4, 3, true).show();
                                                    break;
                                                } else {
                                                    new org.telegram.ui.Components.hc(photoViewer2.e0, bVar2).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                                                    org.telegram.messenger.qp.s1(i15).o0(true);
                                                    org.telegram.ui.ActionBar.f2 f2Var2 = photoViewer2.l4;
                                                    if (f2Var2 instanceof an) {
                                                        an anVar2 = (an) f2Var2;
                                                        anVar2.eb(photoViewer2.S4);
                                                        anVar2.gb(photoViewer2.S4);
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                }, false);
                            }
                            if (photoViewer.S4.Z0) {
                                G.c(R.drawable.msg_info, org.telegram.messenger.hd.M0(2131754943, null), new zc0(27, photoViewer, bVar), false);
                                if ((photoViewer.l4 instanceof an) && !org.telegram.messenger.qp.s1(i13).D3()) {
                                    G.k();
                                    final int i14 = 1;
                                    G.c(R.drawable.msg_cancel, org.telegram.messenger.hd.M0(2131746319, null), new Runnable() { // from class: org.telegram.ui.hn0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i142 = i14;
                                            di.b bVar2 = bVar;
                                            int i15 = i13;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (i142) {
                                                case 0:
                                                    Drawable[] drawableArr3 = PhotoViewer.Y8;
                                                    if (!org.telegram.messenger.p10.i(i15).q()) {
                                                        new ug.w0(photoViewer2.l4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.hc(photoViewer2.e0, bVar2).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                                                        org.telegram.messenger.qp.s1(i15).o0(true);
                                                        org.telegram.ui.ActionBar.f2 f2Var = photoViewer2.l4;
                                                        if (f2Var instanceof an) {
                                                            an anVar = (an) f2Var;
                                                            anVar.eb(photoViewer2.S4);
                                                            anVar.gb(photoViewer2.S4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    Drawable[] drawableArr4 = PhotoViewer.Y8;
                                                    if (!org.telegram.messenger.p10.i(i15).q()) {
                                                        new ug.w0(photoViewer2.l4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.hc(photoViewer2.e0, bVar2).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                                                        org.telegram.messenger.qp.s1(i15).o0(true);
                                                        org.telegram.ui.ActionBar.f2 f2Var2 = photoViewer2.l4;
                                                        if (f2Var2 instanceof an) {
                                                            an anVar2 = (an) f2Var2;
                                                            anVar2.eb(photoViewer2.S4);
                                                            anVar2.gb(photoViewer2.S4);
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
                        org.telegram.ui.Components.k60 J = G.J();
                        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, photoViewer.E, bVar, true, false);
                        z0Var.setItemHeight(44);
                        z0Var.j(org.telegram.messenger.hd.M0(2131753756, null), R.drawable.msg_arrow_back, null);
                        z0Var.getTextView().setPadding(org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0);
                        z0Var.setOnClickListener(new jg(G, 1));
                        J.r(z0Var, c8.ha.o(-1, -2));
                        J.r(new org.telegram.ui.ActionBar.d1(photoViewer.E, bVar), c8.ha.o(-1, 8));
                        ArrayList arrayList = new ArrayList();
                        String str3 = photoViewer.S4.R0;
                        if (str3 != null) {
                            f11 = 300.0f;
                            if (TextUtils.equals(org.telegram.messenger.g0.K0(str3, false), org.telegram.messenger.qp.s1(photoViewer.T).U2)) {
                                f10 = 18.0f;
                            } else {
                                TextView textView = new TextView(photoViewer.E);
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Uc, bVar);
                                textView.setTextSize(1, 14.0f);
                                f12 = 10.0f;
                                f10 = 18.0f;
                                textView.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(10.0f));
                                textView.setMaxWidth(org.telegram.messenger.g0.L(300.0f));
                                Uri parse = Uri.parse(photoViewer.S4.R0);
                                textView.setText(vf.c.w(parse, null, null, vf.c.a(parse.getHost()), null));
                                int i15 = org.telegram.ui.ActionBar.k6.I5;
                                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(photoViewer.w1(i15), 0, photoViewer.S4.V0 == null ? 6 : 0);
                                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i15);
                                textView.setBackground(a02);
                                org.telegram.ui.ActionBar.r6.k(textView, a02, null, N, bVar);
                                textView.setOnClickListener(new fk0(1, photoViewer, G));
                                textView.setOnLongClickListener(new di.f2(4, photoViewer, bVar));
                                arrayList.add(textView);
                                if (photoViewer.S4.U0 != null) {
                                    TextView textView2 = new TextView(photoViewer.E);
                                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.E8, bVar);
                                    textView2.setTextSize(1, 14.0f);
                                    textView2.setPadding(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f12));
                                    textView2.setMaxWidth(org.telegram.messenger.g0.L(f11));
                                    textView2.setText(photoViewer.S4.U0);
                                    int i16 = org.telegram.ui.ActionBar.k6.I5;
                                    org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.k6.a0(photoViewer.w1(i16), 0, photoViewer.S4.V0 == null ? 6 : 0);
                                    org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i16);
                                    textView2.setBackground(a03);
                                    org.telegram.ui.ActionBar.r6.k(textView2, a03, null, N2, bVar);
                                    textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.gn0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            int i17 = i11;
                                            di.b bVar2 = bVar;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (i17) {
                                                case 0:
                                                    if (org.telegram.messenger.g0.g(photoViewer2.S4.U0)) {
                                                        org.telegram.messenger.camera.q.r(null, 2131744195, new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(photoViewer2.E), bVar2));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    if (org.telegram.messenger.g0.g(photoViewer2.S4.V0)) {
                                                        org.telegram.messenger.camera.q.r(null, 2131744195, new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(photoViewer2.E), bVar2));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    arrayList.add(textView2);
                                }
                                if (photoViewer.S4.V0 != null) {
                                    TextView textView3 = new TextView(photoViewer.E);
                                    org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.E8, bVar);
                                    textView3.setTextSize(1, 14.0f);
                                    textView3.setPadding(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f12));
                                    textView3.setMaxWidth(org.telegram.messenger.g0.L(f11));
                                    textView3.setText(photoViewer.S4.V0);
                                    int i17 = org.telegram.ui.ActionBar.k6.I5;
                                    org.telegram.ui.Cells.y a04 = org.telegram.ui.ActionBar.k6.a0(photoViewer.w1(i17), 0, 6);
                                    org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i17);
                                    textView3.setBackground(a04);
                                    org.telegram.ui.ActionBar.r6.k(textView3, a04, null, N3, bVar);
                                    final int i18 = 1;
                                    textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.gn0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            int i172 = i18;
                                            di.b bVar2 = bVar;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (i172) {
                                                case 0:
                                                    if (org.telegram.messenger.g0.g(photoViewer2.S4.U0)) {
                                                        org.telegram.messenger.camera.q.r(null, 2131744195, new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(photoViewer2.E), bVar2));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    if (org.telegram.messenger.g0.g(photoViewer2.S4.V0)) {
                                                        org.telegram.messenger.camera.q.r(null, 2131744195, new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(photoViewer2.E), bVar2));
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
                                        FrameLayout frameLayout = new FrameLayout(photoViewer.E);
                                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, frameLayout, bVar);
                                        LinearLayout.LayoutParams o4 = c8.ha.o(-1, 1);
                                        o4.height = 1;
                                        J.r(frameLayout, o4);
                                    }
                                    J.r(view2, c8.ha.o(-1, -2));
                                }
                                G.c(R.drawable.msg_channel, org.telegram.messenger.hd.M0(2131745249, null), new hi.h2(G, J, 10), false);
                                if (!org.telegram.messenger.p10.i(i13).q()) {
                                    G.c(R.drawable.msg_block2, org.telegram.messenger.hd.M0(2131749322, null), new Runnable() { // from class: org.telegram.ui.hn0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i142 = i11;
                                            di.b bVar2 = bVar;
                                            int i152 = i13;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (i142) {
                                                case 0:
                                                    Drawable[] drawableArr3 = PhotoViewer.Y8;
                                                    if (!org.telegram.messenger.p10.i(i152).q()) {
                                                        new ug.w0(photoViewer2.l4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.hc(photoViewer2.e0, bVar2).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                                                        org.telegram.messenger.qp.s1(i152).o0(true);
                                                        org.telegram.ui.ActionBar.f2 f2Var = photoViewer2.l4;
                                                        if (f2Var instanceof an) {
                                                            an anVar = (an) f2Var;
                                                            anVar.eb(photoViewer2.S4);
                                                            anVar.gb(photoViewer2.S4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    Drawable[] drawableArr4 = PhotoViewer.Y8;
                                                    if (!org.telegram.messenger.p10.i(i152).q()) {
                                                        new ug.w0(photoViewer2.l4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.hc(photoViewer2.e0, bVar2).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                                                        org.telegram.messenger.qp.s1(i152).o0(true);
                                                        org.telegram.ui.ActionBar.f2 f2Var2 = photoViewer2.l4;
                                                        if (f2Var2 instanceof an) {
                                                            an anVar2 = (an) f2Var2;
                                                            anVar2.eb(photoViewer2.S4);
                                                            anVar2.gb(photoViewer2.S4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    }, false);
                                }
                                if (photoViewer.S4.Z0) {
                                }
                                if (G.x() > 0) {
                                }
                            }
                        } else {
                            f10 = 18.0f;
                            f11 = 300.0f;
                        }
                        f12 = 10.0f;
                        if (photoViewer.S4.U0 != null) {
                        }
                        if (photoViewer.S4.V0 != null) {
                        }
                        while (i7 < arrayList.size()) {
                        }
                        G.c(R.drawable.msg_channel, org.telegram.messenger.hd.M0(2131745249, null), new hi.h2(G, J, 10), false);
                        if (!org.telegram.messenger.p10.i(i13).q()) {
                        }
                        if (photoViewer.S4.Z0) {
                        }
                        if (G.x() > 0) {
                        }
                    }
                }
                break;
            case 4:
                org.telegram.messenger.ij ijVar4 = photoViewer.S4;
                if (ijVar4 != null && ijVar4.E2(true)) {
                    sq sqVar = photoViewer.J0;
                    org.telegram.messenger.ij ijVar5 = photoViewer.S4;
                    LinearLayout linearLayout = sqVar.b;
                    if (ijVar5 != null && (message = ijVar5.k) != null && message.media != null && ijVar5.E2(true)) {
                        int i19 = ijVar5.I1;
                        TLRPC.MessageMedia messageMedia = ijVar5.k.media;
                        ArrayList X = org.telegram.ui.Components.t51.X(i19, messageMedia.document, messageMedia.alt_documents, 0, true);
                        linearLayout.removeAllViews();
                        int i20 = 0;
                        while (i20 < X.size()) {
                            org.telegram.ui.Components.p51 p51Var2 = (org.telegram.ui.Components.p51) X.get(i20);
                            org.telegram.ui.Components.r51 a10 = p51Var2.a();
                            StringBuilder sb2 = new StringBuilder();
                            Object[] objArr = new Object[i12];
                            objArr[0] = Integer.valueOf(p51Var2.b());
                            sb2.append(org.telegram.messenger.hd.a0(str, str, 2131746450, objArr));
                            sb2.append(p51Var2.a ? " (" + org.telegram.messenger.hd.M0(2131746449, str) + ")" : "");
                            String sb3 = sb2.toString();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (a10.b()) {
                                p51Var = p51Var2;
                                spannableStringBuilder.append(org.telegram.messenger.g0.i0(a10.g.size, false, false));
                                spannableStringBuilder.append(org.telegram.messenger.hd.M0(2131746453, str));
                            } else {
                                p51Var = p51Var2;
                                SpannableString spannableString = new SpannableString("s ");
                                org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.msg_mini_arrow_mediabold, 0);
                                wpVar.w = 90.0f;
                                float L = org.telegram.messenger.g0.L(1.0f);
                                wpVar.r = f13;
                                wpVar.s = L;
                                wpVar.G = 0.85f;
                                spannableString.setSpan(wpVar, 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) spannableString);
                                spannableStringBuilder.append(org.telegram.messenger.g0.i0(a10.g.size, false, false));
                            }
                            org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, linearLayout, 0, sb3, false, null);
                            c10.setSubtext(spannableStringBuilder);
                            c10.d(-328966, -328966);
                            c10.b.setPadding(0, 0, 0, 0);
                            c10.setOnClickListener(new z(sqVar, ijVar5, p51Var, 9));
                            c10.setSelectorColor(268435455);
                            i20++;
                            f13 = 0.0f;
                            str = null;
                            i12 = 1;
                        }
                        photoViewer.t0.b();
                        break;
                    }
                }
                org.telegram.ui.Components.r7 r7Var = photoViewer.F;
                if (r7Var != null && r7Var.getActionBarMenuOnItemClick() != null) {
                    photoViewer.F.getActionBarMenuOnItemClick().b(2);
                    photoViewer.o0.U(null, null);
                    break;
                }
                break;
            case 5:
                Activity activity = photoViewer.D;
                if (activity != null) {
                    photoViewer.Y3 = false;
                    photoViewer.X3 = 1;
                    if (photoViewer.W3 == -10) {
                        photoViewer.W3 = activity.getRequestedOrientation();
                    }
                    if (((WindowManager) photoViewer.D.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                        photoViewer.D.setRequestedOrientation(8);
                    } else {
                        photoViewer.D.setRequestedOrientation(0);
                    }
                    photoViewer.g3(false, false);
                    break;
                }
                break;
            case 6:
                Activity activity2 = photoViewer.D;
                if (activity2 != null) {
                    photoViewer.Y3 = false;
                    photoViewer.X3 = 2;
                    if (photoViewer.W3 == -10) {
                        photoViewer.W3 = activity2.getRequestedOrientation();
                    }
                    photoViewer.D.setRequestedOrientation(1);
                    break;
                }
                break;
            default:
                org.telegram.messenger.ij ijVar6 = photoViewer.S4;
                if (ijVar6 != null && ijVar6.s4()) {
                    org.telegram.ui.ActionBar.f2 f2Var = photoViewer.l4;
                    if (f2Var instanceof an) {
                        ((an) f2Var).ja(photoViewer.S4, false, true);
                    }
                    photoViewer.z0(true, false);
                    String str4 = photoViewer.S4.R0;
                    if (str4 != null) {
                        Context context = LaunchActivity.G1;
                        if (context == null) {
                            context = photoViewer.E;
                        }
                        vf.c.s(context, Uri.parse(str4), true, false, false, null, null, false, org.telegram.messenger.qp.s1(photoViewer.T).d6, false, false);
                        break;
                    }
                }
                break;
        }
    }
}
