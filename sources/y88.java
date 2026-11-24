// default package

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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class y88 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ y88(PhotoViewer photoViewer, byte b) {
        this.a = b;
        this.b = photoViewer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0220, code lost:
    
        if (r3.startsWith("https://" + oc7.r1(r0.U).N2) == false) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0454  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        pb8 pb8Var;
        float f;
        float f2;
        float f3;
        int i;
        TLRPC.Message message;
        byte b = this.a;
        String str = null;
        float f4 = 0.0f;
        byte b2 = 2;
        final byte b3 = 0;
        final byte b4 = 1;
        final PhotoViewer photoViewer = this.b;
        switch (b) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.d9;
                float f5 = -photoViewer.D1.b.getStateOrientation();
                if (Math.abs(f5) > 180.0f) {
                    f5 = f5 < 0.0f ? f5 + 360.0f : -(360.0f - f5);
                }
                photoViewer.K(f5, photoViewer.D1.b.getStateMirror(), new n88(photoViewer, (byte) 26));
                break;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.d9;
                if (!photoViewer.f2 && !photoViewer.K0()) {
                    photoViewer.V1();
                    break;
                }
                break;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.d9;
                if (!photoViewer.K0() && (pb8Var = photoViewer.d) != null && pb8Var.d() != null && !photoViewer.d.d().isEmpty()) {
                    photoViewer.A2(!photoViewer.L, true);
                    break;
                }
                break;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.d9;
                photoViewer.Y0(true);
                photoViewer.u(0, true);
                break;
            case 4:
                Drawable[] drawableArr5 = PhotoViewer.d9;
                k47 k47Var = photoViewer.S4;
                if (k47Var == null || !k47Var.q4()) {
                    if (photoViewer.G.v0.a()) {
                        photoViewer.p0.U(null, null);
                        break;
                    }
                } else {
                    k47 k47Var2 = photoViewer.S4;
                    if (k47Var2 != null && k47Var2.q4() && photoViewer.p0.getAlpha() > 0.5f) {
                        final int i2 = photoViewer.S4.K1;
                        final r63 r63Var = new r63();
                        bu5 H = bu5.H(photoViewer.f0, r63Var, photoViewer.p0, true);
                        H.b0(0.0f, -gm.L(46.0f));
                        H.W(5);
                        k47 k47Var3 = photoViewer.S4;
                        byte b5 = 6;
                        if (k47Var3.W0 == null && k47Var3.X0 == null) {
                            String str2 = k47Var3.T0;
                            if (str2 != null) {
                                break;
                            }
                            if (!z8c.h(i2).p() && !oc7.r1(photoViewer.U).H3() && !photoViewer.S4.b1) {
                                H.b(R.drawable.msg_block2, jb6.M0(2131749080, null), new Runnable() { // from class: s88
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b6 = b3;
                                        r63 r63Var2 = r63Var;
                                        int i3 = i2;
                                        PhotoViewer photoViewer2 = photoViewer;
                                        switch (b6) {
                                            case 0:
                                                Drawable[] drawableArr6 = PhotoViewer.d9;
                                                if (!z8c.h(i3).p()) {
                                                    new kj8(photoViewer2.l4, 3, true).show();
                                                    break;
                                                } else {
                                                    new c41(photoViewer2.f0, r63Var2).c(jb6.M0(2131754485, null)).j();
                                                    oc7.r1(i3).l0(true);
                                                    d dVar = photoViewer2.l4;
                                                    if (dVar instanceof yv1) {
                                                        yv1 yv1Var = (yv1) dVar;
                                                        yv1Var.Za(photoViewer2.S4);
                                                        yv1Var.bb(photoViewer2.S4);
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                Drawable[] drawableArr7 = PhotoViewer.d9;
                                                if (!z8c.h(i3).p()) {
                                                    new kj8(photoViewer2.l4, 3, true).show();
                                                    break;
                                                } else {
                                                    new c41(photoViewer2.f0, r63Var2).c(jb6.M0(2131754485, null)).j();
                                                    oc7.r1(i3).l0(true);
                                                    d dVar2 = photoViewer2.l4;
                                                    if (dVar2 instanceof yv1) {
                                                        yv1 yv1Var2 = (yv1) dVar2;
                                                        yv1Var2.Za(photoViewer2.S4);
                                                        yv1Var2.bb(photoViewer2.S4);
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                }, false);
                            }
                            if (photoViewer.S4.b1) {
                                H.b(R.drawable.msg_info, jb6.M0(2131754943, null), new a18(photoViewer, r63Var, (byte) 6), false);
                                if ((photoViewer.l4 instanceof yv1) && !oc7.r1(i2).H3()) {
                                    H.j();
                                    H.b(R.drawable.msg_cancel, jb6.M0(2131746053, null), new Runnable() { // from class: s88
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b6 = b4;
                                            r63 r63Var2 = r63Var;
                                            int i3 = i2;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (b6) {
                                                case 0:
                                                    Drawable[] drawableArr6 = PhotoViewer.d9;
                                                    if (!z8c.h(i3).p()) {
                                                        new kj8(photoViewer2.l4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new c41(photoViewer2.f0, r63Var2).c(jb6.M0(2131754485, null)).j();
                                                        oc7.r1(i3).l0(true);
                                                        d dVar = photoViewer2.l4;
                                                        if (dVar instanceof yv1) {
                                                            yv1 yv1Var = (yv1) dVar;
                                                            yv1Var.Za(photoViewer2.S4);
                                                            yv1Var.bb(photoViewer2.S4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    Drawable[] drawableArr7 = PhotoViewer.d9;
                                                    if (!z8c.h(i3).p()) {
                                                        new kj8(photoViewer2.l4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new c41(photoViewer2.f0, r63Var2).c(jb6.M0(2131754485, null)).j();
                                                        oc7.r1(i3).l0(true);
                                                        d dVar2 = photoViewer2.l4;
                                                        if (dVar2 instanceof yv1) {
                                                            yv1 yv1Var2 = (yv1) dVar2;
                                                            yv1Var2.Za(photoViewer2.S4);
                                                            yv1Var2.bb(photoViewer2.S4);
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
                        bu5 K = H.K();
                        a8 a8Var = new a8(0, r63Var, photoViewer.F, true, false);
                        a8Var.setItemHeight(44);
                        a8Var.j(jb6.M0(2131753721, null), R.drawable.msg_arrow_back, null);
                        a8Var.getTextView().setPadding(jb6.a0 ? 0 : gm.L(40.0f), 0, jb6.a0 ? gm.L(40.0f) : 0, 0);
                        a8Var.setOnClickListener(new to1(H, b2));
                        K.q(a8Var, qoe.o(-1, -2));
                        K.q(new j8(photoViewer.F, r63Var), qoe.o(-1, 8));
                        ArrayList arrayList = new ArrayList();
                        String str3 = photoViewer.S4.T0;
                        if (str3 != null) {
                            f2 = 300.0f;
                            if (TextUtils.equals(gm.J0(str3, false), oc7.r1(photoViewer.U).N2)) {
                                f = 18.0f;
                            } else {
                                TextView textView = new TextView(photoViewer.F);
                                anb.X(textView, cmb.Wc, r63Var);
                                textView.setTextSize(1, 14.0f);
                                f3 = 10.0f;
                                f = 18.0f;
                                textView.setPadding(gm.L(18.0f), gm.L(10.0f), gm.L(18.0f), gm.L(10.0f));
                                textView.setMaxWidth(gm.L(300.0f));
                                Uri parse = Uri.parse(photoViewer.S4.T0);
                                textView.setText(l11.x(parse, null, null, l11.a(parse.getHost()), null));
                                int i3 = cmb.H5;
                                fg0 Y = cmb.Y(photoViewer.y0(i3), 0, photoViewer.S4.X0 == null ? 6 : 0);
                                wmb M = anb.M(i3);
                                textView.setBackground(Y);
                                anb.j(textView, Y, null, M, r63Var);
                                textView.setOnClickListener(new n06(photoViewer, H, (byte) 18));
                                textView.setOnLongClickListener(new u0(photoViewer, r63Var, (byte) 4));
                                arrayList.add(textView);
                                if (photoViewer.S4.W0 != null) {
                                    TextView textView2 = new TextView(photoViewer.F);
                                    anb.X(textView2, cmb.D8, r63Var);
                                    textView2.setTextSize(1, 14.0f);
                                    textView2.setPadding(gm.L(f), gm.L(f3), gm.L(f), gm.L(f3));
                                    textView2.setMaxWidth(gm.L(f2));
                                    textView2.setText(photoViewer.S4.W0);
                                    int i4 = cmb.H5;
                                    fg0 Y2 = cmb.Y(photoViewer.y0(i4), 0, photoViewer.S4.X0 == null ? 6 : 0);
                                    wmb M2 = anb.M(i4);
                                    textView2.setBackground(Y2);
                                    anb.j(textView2, Y2, null, M2, r63Var);
                                    textView2.setOnClickListener(new View.OnClickListener() { // from class: r88
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            byte b6 = b3;
                                            r63 r63Var2 = r63Var;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (b6) {
                                                case 0:
                                                    Drawable[] drawableArr6 = PhotoViewer.d9;
                                                    if (gm.g(photoViewer2.S4.W0)) {
                                                        new c41(n21.a(photoViewer2.F), r63Var2).i(jb6.M0(2131743879, null)).j();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    Drawable[] drawableArr7 = PhotoViewer.d9;
                                                    if (gm.g(photoViewer2.S4.X0)) {
                                                        new c41(n21.a(photoViewer2.F), r63Var2).i(jb6.M0(2131743879, null)).j();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    arrayList.add(textView2);
                                }
                                if (photoViewer.S4.X0 != null) {
                                    TextView textView3 = new TextView(photoViewer.F);
                                    anb.X(textView3, cmb.D8, r63Var);
                                    textView3.setTextSize(1, 14.0f);
                                    textView3.setPadding(gm.L(f), gm.L(f3), gm.L(f), gm.L(f3));
                                    textView3.setMaxWidth(gm.L(f2));
                                    textView3.setText(photoViewer.S4.X0);
                                    int i5 = cmb.H5;
                                    fg0 Y3 = cmb.Y(photoViewer.y0(i5), 0, 6);
                                    wmb M3 = anb.M(i5);
                                    textView3.setBackground(Y3);
                                    anb.j(textView3, Y3, null, M3, r63Var);
                                    textView3.setOnClickListener(new View.OnClickListener() { // from class: r88
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            byte b6 = b4;
                                            r63 r63Var2 = r63Var;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (b6) {
                                                case 0:
                                                    Drawable[] drawableArr6 = PhotoViewer.d9;
                                                    if (gm.g(photoViewer2.S4.W0)) {
                                                        new c41(n21.a(photoViewer2.F), r63Var2).i(jb6.M0(2131743879, null)).j();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    Drawable[] drawableArr7 = PhotoViewer.d9;
                                                    if (gm.g(photoViewer2.S4.X0)) {
                                                        new c41(n21.a(photoViewer2.F), r63Var2).i(jb6.M0(2131743879, null)).j();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    arrayList.add(textView3);
                                }
                                for (i = 0; i < arrayList.size(); i++) {
                                    View view2 = (View) arrayList.get(i);
                                    if (i > 0) {
                                        FrameLayout frameLayout = new FrameLayout(photoViewer.F);
                                        anb.h(cmb.c7, r63Var, frameLayout);
                                        LinearLayout.LayoutParams o = qoe.o(-1, 1);
                                        o.height = 1;
                                        K.q(frameLayout, o);
                                    }
                                    K.q(view2, qoe.o(-1, -2));
                                }
                                H.b(R.drawable.msg_channel, jb6.M0(2131744937, null), new c20(H, K, b5), false);
                                if (!z8c.h(i2).p()) {
                                    H.b(R.drawable.msg_block2, jb6.M0(2131749080, null), new Runnable() { // from class: s88
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b6 = b3;
                                            r63 r63Var2 = r63Var;
                                            int i32 = i2;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (b6) {
                                                case 0:
                                                    Drawable[] drawableArr6 = PhotoViewer.d9;
                                                    if (!z8c.h(i32).p()) {
                                                        new kj8(photoViewer2.l4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new c41(photoViewer2.f0, r63Var2).c(jb6.M0(2131754485, null)).j();
                                                        oc7.r1(i32).l0(true);
                                                        d dVar = photoViewer2.l4;
                                                        if (dVar instanceof yv1) {
                                                            yv1 yv1Var = (yv1) dVar;
                                                            yv1Var.Za(photoViewer2.S4);
                                                            yv1Var.bb(photoViewer2.S4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    Drawable[] drawableArr7 = PhotoViewer.d9;
                                                    if (!z8c.h(i32).p()) {
                                                        new kj8(photoViewer2.l4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new c41(photoViewer2.f0, r63Var2).c(jb6.M0(2131754485, null)).j();
                                                        oc7.r1(i32).l0(true);
                                                        d dVar2 = photoViewer2.l4;
                                                        if (dVar2 instanceof yv1) {
                                                            yv1 yv1Var2 = (yv1) dVar2;
                                                            yv1Var2.Za(photoViewer2.S4);
                                                            yv1Var2.bb(photoViewer2.S4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    }, false);
                                }
                                if (photoViewer.S4.b1) {
                                }
                                if (H.y() > 0) {
                                }
                            }
                        } else {
                            f = 18.0f;
                            f2 = 300.0f;
                        }
                        f3 = 10.0f;
                        if (photoViewer.S4.W0 != null) {
                        }
                        if (photoViewer.S4.X0 != null) {
                        }
                        while (i < arrayList.size()) {
                        }
                        H.b(R.drawable.msg_channel, jb6.M0(2131744937, null), new c20(H, K, b5), false);
                        if (!z8c.h(i2).p()) {
                        }
                        if (photoViewer.S4.b1) {
                        }
                        if (H.y() > 0) {
                        }
                    }
                }
                break;
            case 5:
                Drawable[] drawableArr6 = PhotoViewer.d9;
                k47 k47Var4 = photoViewer.S4;
                if (k47Var4 != null && k47Var4.D2(true)) {
                    zh2 zh2Var = photoViewer.K0;
                    k47 k47Var5 = photoViewer.S4;
                    LinearLayout linearLayout = zh2Var.b;
                    if (k47Var5 != null && (message = k47Var5.k) != null && message.media != null && k47Var5.D2(true)) {
                        int i6 = k47Var5.K1;
                        TLRPC.MessageMedia messageMedia = k47Var5.k.media;
                        ArrayList X = ndc.X(i6, messageMedia.document, messageMedia.alt_documents, 0, true);
                        linearLayout.removeAllViews();
                        int i7 = 0;
                        while (i7 < X.size()) {
                            kdc kdcVar = (kdc) X.get(i7);
                            mdc a = kdcVar.a();
                            String concat = jb6.a0(str, str, 2131746184, Integer.valueOf(kdcVar.b())).concat(kdcVar.a ? " (" + jb6.M0(2131746183, str) + ")" : "");
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (a.b()) {
                                spannableStringBuilder.append(gm.i0(a.g.size, false, false));
                                spannableStringBuilder.append(jb6.M0(2131746187, str));
                            } else {
                                SpannableString spannableString = new SpannableString("s ");
                                pn2 pn2Var = new pn2(R.drawable.msg_mini_arrow_mediabold, 0);
                                pn2Var.w = 90.0f;
                                float L = gm.L(1.0f);
                                pn2Var.r = f4;
                                pn2Var.s = L;
                                pn2Var.H = 0.85f;
                                spannableString.setSpan(pn2Var, 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) spannableString);
                                spannableStringBuilder.append(gm.i0(a.g.size, false, false));
                            }
                            a8 c = r7.c(false, false, linearLayout, 0, concat, false, null);
                            c.setSubtext(spannableStringBuilder);
                            c.d(-328966, -328966);
                            c.b.setPadding(0, 0, 0, 0);
                            c.setOnClickListener(new b0(zh2Var, k47Var5, kdcVar, (byte) 24));
                            c.setSelectorColor(268435455);
                            i7++;
                            str = null;
                            f4 = 0.0f;
                        }
                        photoViewer.u0.b();
                        break;
                    }
                }
                x20 x20Var = photoViewer.G;
                if (x20Var != null && x20Var.getActionBarMenuOnItemClick() != null) {
                    photoViewer.G.getActionBarMenuOnItemClick().b(2);
                    photoViewer.p0.U(null, null);
                    break;
                }
                break;
            case 6:
                Drawable[] drawableArr7 = PhotoViewer.d9;
                Activity activity = photoViewer.E;
                if (activity != null) {
                    photoViewer.Z3 = false;
                    photoViewer.Y3 = (byte) 2;
                    if (photoViewer.X3 == -10) {
                        photoViewer.X3 = activity.getRequestedOrientation();
                    }
                    photoViewer.E.setRequestedOrientation(1);
                    break;
                }
                break;
            case 7:
                Drawable[] drawableArr8 = PhotoViewer.d9;
                k47 k47Var6 = photoViewer.S4;
                if (k47Var6 != null && k47Var6.q4()) {
                    d dVar = photoViewer.l4;
                    if (dVar instanceof yv1) {
                        ((yv1) dVar).Y9(photoViewer.S4, false, true);
                    }
                    photoViewer.A(true, false);
                    String str4 = photoViewer.S4.T0;
                    if (str4 != null) {
                        Context context = LaunchActivity.H1;
                        if (context == null) {
                            context = photoViewer.F;
                        }
                        l11.t(context, Uri.parse(str4), true, false, false, null, null, false, oc7.r1(photoViewer.U).l4.A2.f, false, false);
                        break;
                    }
                }
                break;
            default:
                Drawable[] drawableArr9 = PhotoViewer.d9;
                photoViewer.p0.p();
                photoViewer.A(false, false);
                Activity activity2 = photoViewer.E;
                if (activity2 instanceof LaunchActivity) {
                    ((LaunchActivity) activity2).u0(new ana(), false, true);
                    break;
                }
                break;
        }
    }
}
