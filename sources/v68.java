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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class v68 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ v68(PhotoViewer photoViewer, byte b) {
        this.a = b;
        this.b = photoViewer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x021f, code lost:
    
        if (r7.startsWith("https://" + na7.q1(r0.U).N2) == false) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x044e  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        o98 o98Var;
        float f;
        float f2;
        int i;
        TLRPC.Message message;
        byte b = this.a;
        String str = null;
        float f3 = 0.0f;
        byte b2 = 2;
        final byte b3 = 0;
        final byte b4 = 1;
        final PhotoViewer photoViewer = this.b;
        switch (b) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.f9;
                float f4 = -photoViewer.D1.b.getStateOrientation();
                if (Math.abs(f4) > 180.0f) {
                    f4 = f4 < 0.0f ? f4 + 360.0f : -(360.0f - f4);
                }
                photoViewer.L(f4, photoViewer.D1.b.getStateMirror(), new l68(photoViewer, (byte) 26));
                break;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.f9;
                if (!photoViewer.f2 && !photoViewer.J0()) {
                    photoViewer.U1();
                    break;
                }
                break;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.f9;
                if (!photoViewer.J0() && (o98Var = photoViewer.d) != null && o98Var.d() != null && !photoViewer.d.d().isEmpty()) {
                    photoViewer.z2(!photoViewer.L, true);
                    break;
                }
                break;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.f9;
                photoViewer.X0(true);
                photoViewer.w(0, true);
                break;
            case 4:
                Drawable[] drawableArr5 = PhotoViewer.f9;
                k27 k27Var = photoViewer.T4;
                if (k27Var == null || !k27Var.q4()) {
                    if (photoViewer.G.v0.a()) {
                        photoViewer.p0.U(null, null);
                        break;
                    }
                } else {
                    k27 k27Var2 = photoViewer.T4;
                    if (k27Var2 != null && k27Var2.q4() && photoViewer.p0.getAlpha() > 0.5f) {
                        final int i2 = photoViewer.T4.K1;
                        final f53 f53Var = new f53();
                        cs5 H = cs5.H(photoViewer.f0, f53Var, photoViewer.p0, true);
                        H.b0(0.0f, -gl.L(46.0f));
                        H.W(5);
                        k27 k27Var3 = photoViewer.T4;
                        if (k27Var3.W0 == null && k27Var3.X0 == null) {
                            String str2 = k27Var3.T0;
                            if (str2 != null) {
                                break;
                            }
                            if (!y6c.h(i2).p() && !na7.q1(photoViewer.U).E3() && !photoViewer.T4.b1) {
                                H.b(R.drawable.msg_block2, k96.M0(2131749131, null), new Runnable() { // from class: p68
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b5 = b3;
                                        f53 f53Var2 = f53Var;
                                        int i3 = i2;
                                        PhotoViewer photoViewer2 = photoViewer;
                                        switch (b5) {
                                            case 0:
                                                Drawable[] drawableArr6 = PhotoViewer.f9;
                                                if (!y6c.h(i3).p()) {
                                                    new jh8(photoViewer2.m4, 3, true).show();
                                                    break;
                                                } else {
                                                    new u21(photoViewer2.f0, f53Var2).c(k96.M0(2131754485, null)).j();
                                                    na7.q1(i3).l0(true);
                                                    d dVar = photoViewer2.m4;
                                                    if (dVar instanceof mu1) {
                                                        mu1 mu1Var = (mu1) dVar;
                                                        mu1Var.Na(photoViewer2.T4);
                                                        mu1Var.Pa(photoViewer2.T4);
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                Drawable[] drawableArr7 = PhotoViewer.f9;
                                                if (!y6c.h(i3).p()) {
                                                    new jh8(photoViewer2.m4, 3, true).show();
                                                    break;
                                                } else {
                                                    new u21(photoViewer2.f0, f53Var2).c(k96.M0(2131754485, null)).j();
                                                    na7.q1(i3).l0(true);
                                                    d dVar2 = photoViewer2.m4;
                                                    if (dVar2 instanceof mu1) {
                                                        mu1 mu1Var2 = (mu1) dVar2;
                                                        mu1Var2.Na(photoViewer2.T4);
                                                        mu1Var2.Pa(photoViewer2.T4);
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                }, false);
                            }
                            if (photoViewer.T4.b1) {
                                H.b(R.drawable.msg_info, k96.M0(2131754943, null), new h18(photoViewer, f53Var, (byte) 5), false);
                                if ((photoViewer.m4 instanceof mu1) && !na7.q1(i2).E3()) {
                                    H.j();
                                    H.b(R.drawable.msg_cancel, k96.M0(2131746127, null), new Runnable() { // from class: p68
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b5 = b4;
                                            f53 f53Var2 = f53Var;
                                            int i3 = i2;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (b5) {
                                                case 0:
                                                    Drawable[] drawableArr6 = PhotoViewer.f9;
                                                    if (!y6c.h(i3).p()) {
                                                        new jh8(photoViewer2.m4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new u21(photoViewer2.f0, f53Var2).c(k96.M0(2131754485, null)).j();
                                                        na7.q1(i3).l0(true);
                                                        d dVar = photoViewer2.m4;
                                                        if (dVar instanceof mu1) {
                                                            mu1 mu1Var = (mu1) dVar;
                                                            mu1Var.Na(photoViewer2.T4);
                                                            mu1Var.Pa(photoViewer2.T4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    Drawable[] drawableArr7 = PhotoViewer.f9;
                                                    if (!y6c.h(i3).p()) {
                                                        new jh8(photoViewer2.m4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new u21(photoViewer2.f0, f53Var2).c(k96.M0(2131754485, null)).j();
                                                        na7.q1(i3).l0(true);
                                                        d dVar2 = photoViewer2.m4;
                                                        if (dVar2 instanceof mu1) {
                                                            mu1 mu1Var2 = (mu1) dVar2;
                                                            mu1Var2.Na(photoViewer2.T4);
                                                            mu1Var2.Pa(photoViewer2.T4);
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
                        cs5 K = H.K();
                        a8 a8Var = new a8(0, f53Var, photoViewer.F, true, false);
                        a8Var.setItemHeight(44);
                        a8Var.j(k96.M0(2131753753, null), R.drawable.msg_arrow_back, null);
                        a8Var.getTextView().setPadding(k96.a0 ? 0 : gl.L(40.0f), 0, k96.a0 ? gl.L(40.0f) : 0, 0);
                        a8Var.setOnClickListener(new ln1(H, b2));
                        K.q(a8Var, nme.o(-1, -2));
                        K.q(new j8(photoViewer.F, f53Var), nme.o(-1, 8));
                        ArrayList arrayList = new ArrayList();
                        String str3 = photoViewer.T4.T0;
                        byte b5 = 6;
                        if (str3 != null) {
                            f = 300.0f;
                            if (!TextUtils.equals(gl.J0(str3, false), na7.q1(photoViewer.U).N2)) {
                                TextView textView = new TextView(photoViewer.F);
                                zkb.X(textView, bkb.Wc, f53Var);
                                textView.setTextSize(1, 14.0f);
                                f2 = 10.0f;
                                textView.setPadding(gl.L(18.0f), gl.L(10.0f), gl.L(18.0f), gl.L(10.0f));
                                textView.setMaxWidth(gl.L(300.0f));
                                Uri parse = Uri.parse(photoViewer.T4.T0);
                                textView.setText(d01.w(parse, null, null, d01.a(parse.getHost()), null));
                                int i3 = bkb.H5;
                                ff0 Y = bkb.Y(photoViewer.y0(i3), 0, photoViewer.T4.X0 == null ? 6 : 0);
                                vkb M = zkb.M(i3);
                                textView.setBackground(Y);
                                zkb.j(textView, Y, null, M, f53Var);
                                textView.setOnClickListener(new v16(photoViewer, H, (byte) 17));
                                textView.setOnLongClickListener(new u0(photoViewer, f53Var, (byte) 4));
                                arrayList.add(textView);
                                if (photoViewer.T4.W0 != null) {
                                    TextView textView2 = new TextView(photoViewer.F);
                                    zkb.X(textView2, bkb.D8, f53Var);
                                    textView2.setTextSize(1, 14.0f);
                                    textView2.setPadding(gl.L(18.0f), gl.L(f2), gl.L(18.0f), gl.L(f2));
                                    textView2.setMaxWidth(gl.L(f));
                                    textView2.setText(photoViewer.T4.W0);
                                    int i4 = bkb.H5;
                                    ff0 Y2 = bkb.Y(photoViewer.y0(i4), 0, photoViewer.T4.X0 == null ? 6 : 0);
                                    vkb M2 = zkb.M(i4);
                                    textView2.setBackground(Y2);
                                    zkb.j(textView2, Y2, null, M2, f53Var);
                                    textView2.setOnClickListener(new View.OnClickListener() { // from class: o68
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            byte b6 = b3;
                                            f53 f53Var2 = f53Var;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (b6) {
                                                case 0:
                                                    Drawable[] drawableArr6 = PhotoViewer.f9;
                                                    if (gl.g(photoViewer2.T4.W0)) {
                                                        new u21(f11.a(photoViewer2.F), f53Var2).i(k96.M0(2131743953, null)).j();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    Drawable[] drawableArr7 = PhotoViewer.f9;
                                                    if (gl.g(photoViewer2.T4.X0)) {
                                                        new u21(f11.a(photoViewer2.F), f53Var2).i(k96.M0(2131743953, null)).j();
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
                                    zkb.X(textView3, bkb.D8, f53Var);
                                    textView3.setTextSize(1, 14.0f);
                                    textView3.setPadding(gl.L(18.0f), gl.L(f2), gl.L(18.0f), gl.L(f2));
                                    textView3.setMaxWidth(gl.L(f));
                                    textView3.setText(photoViewer.T4.X0);
                                    int i5 = bkb.H5;
                                    ff0 Y3 = bkb.Y(photoViewer.y0(i5), 0, 6);
                                    vkb M3 = zkb.M(i5);
                                    textView3.setBackground(Y3);
                                    zkb.j(textView3, Y3, null, M3, f53Var);
                                    textView3.setOnClickListener(new View.OnClickListener() { // from class: o68
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            byte b6 = b4;
                                            f53 f53Var2 = f53Var;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (b6) {
                                                case 0:
                                                    Drawable[] drawableArr6 = PhotoViewer.f9;
                                                    if (gl.g(photoViewer2.T4.W0)) {
                                                        new u21(f11.a(photoViewer2.F), f53Var2).i(k96.M0(2131743953, null)).j();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    Drawable[] drawableArr7 = PhotoViewer.f9;
                                                    if (gl.g(photoViewer2.T4.X0)) {
                                                        new u21(f11.a(photoViewer2.F), f53Var2).i(k96.M0(2131743953, null)).j();
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
                                        zkb.h(bkb.c7, f53Var, frameLayout);
                                        LinearLayout.LayoutParams o = nme.o(-1, 1);
                                        o.height = 1;
                                        K.q(frameLayout, o);
                                    }
                                    K.q(view2, nme.o(-1, -2));
                                }
                                H.b(R.drawable.msg_channel, k96.M0(2131745011, null), new c10(H, K, b5), false);
                                if (!y6c.h(i2).p()) {
                                    H.b(R.drawable.msg_block2, k96.M0(2131749131, null), new Runnable() { // from class: p68
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b52 = b3;
                                            f53 f53Var2 = f53Var;
                                            int i32 = i2;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (b52) {
                                                case 0:
                                                    Drawable[] drawableArr6 = PhotoViewer.f9;
                                                    if (!y6c.h(i32).p()) {
                                                        new jh8(photoViewer2.m4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new u21(photoViewer2.f0, f53Var2).c(k96.M0(2131754485, null)).j();
                                                        na7.q1(i32).l0(true);
                                                        d dVar = photoViewer2.m4;
                                                        if (dVar instanceof mu1) {
                                                            mu1 mu1Var = (mu1) dVar;
                                                            mu1Var.Na(photoViewer2.T4);
                                                            mu1Var.Pa(photoViewer2.T4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    Drawable[] drawableArr7 = PhotoViewer.f9;
                                                    if (!y6c.h(i32).p()) {
                                                        new jh8(photoViewer2.m4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new u21(photoViewer2.f0, f53Var2).c(k96.M0(2131754485, null)).j();
                                                        na7.q1(i32).l0(true);
                                                        d dVar2 = photoViewer2.m4;
                                                        if (dVar2 instanceof mu1) {
                                                            mu1 mu1Var2 = (mu1) dVar2;
                                                            mu1Var2.Na(photoViewer2.T4);
                                                            mu1Var2.Pa(photoViewer2.T4);
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
                            f = 300.0f;
                        }
                        f2 = 10.0f;
                        if (photoViewer.T4.W0 != null) {
                        }
                        if (photoViewer.T4.X0 != null) {
                        }
                        while (i < arrayList.size()) {
                        }
                        H.b(R.drawable.msg_channel, k96.M0(2131745011, null), new c10(H, K, b5), false);
                        if (!y6c.h(i2).p()) {
                        }
                        if (photoViewer.T4.b1) {
                        }
                        if (H.y() > 0) {
                        }
                    }
                }
                break;
            case 5:
                Drawable[] drawableArr6 = PhotoViewer.f9;
                k27 k27Var4 = photoViewer.T4;
                if (k27Var4 != null && k27Var4.D2(true)) {
                    lg2 lg2Var = photoViewer.K0;
                    k27 k27Var5 = photoViewer.T4;
                    LinearLayout linearLayout = lg2Var.b;
                    if (k27Var5 != null && (message = k27Var5.k) != null && message.media != null && k27Var5.D2(true)) {
                        int i6 = k27Var5.K1;
                        TLRPC.MessageMedia messageMedia = k27Var5.k.media;
                        ArrayList X = lbc.X(i6, messageMedia.document, messageMedia.alt_documents, 0, true);
                        linearLayout.removeAllViews();
                        int i7 = 0;
                        while (i7 < X.size()) {
                            hbc hbcVar = (hbc) X.get(i7);
                            jbc a = hbcVar.a();
                            String concat = k96.a0(str, str, 2131746258, Integer.valueOf(hbcVar.b())).concat(hbcVar.a ? " (" + k96.M0(2131746257, str) + ")" : "");
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (a.b()) {
                                spannableStringBuilder.append(gl.i0(a.g.size, false, false));
                                spannableStringBuilder.append(k96.M0(2131746261, str));
                            } else {
                                SpannableString spannableString = new SpannableString("s ");
                                cm2 cm2Var = new cm2(R.drawable.msg_mini_arrow_mediabold, 0);
                                cm2Var.w = 90.0f;
                                float L = gl.L(1.0f);
                                cm2Var.r = f3;
                                cm2Var.s = L;
                                cm2Var.H = 0.85f;
                                spannableString.setSpan(cm2Var, 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) spannableString);
                                spannableStringBuilder.append(gl.i0(a.g.size, false, false));
                            }
                            a8 c = r7.c(false, false, linearLayout, 0, concat, false, null);
                            c.setSubtext(spannableStringBuilder);
                            c.d(-328966, -328966);
                            c.b.setPadding(0, 0, 0, 0);
                            c.setOnClickListener(new b0(lg2Var, k27Var5, hbcVar, (byte) 24));
                            c.setSelectorColor(268435455);
                            i7++;
                            str = null;
                            f3 = 0.0f;
                        }
                        photoViewer.u0.b();
                        break;
                    }
                }
                x10 x10Var = photoViewer.G;
                if (x10Var != null && x10Var.getActionBarMenuOnItemClick() != null) {
                    photoViewer.G.getActionBarMenuOnItemClick().b(2);
                    photoViewer.p0.U(null, null);
                    break;
                }
                break;
            case 6:
                Drawable[] drawableArr7 = PhotoViewer.f9;
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
                Drawable[] drawableArr8 = PhotoViewer.f9;
                k27 k27Var6 = photoViewer.T4;
                if (k27Var6 != null && k27Var6.q4()) {
                    d dVar = photoViewer.m4;
                    if (dVar instanceof mu1) {
                        ((mu1) dVar).M9(photoViewer.T4, false, true);
                    }
                    photoViewer.B(true, false);
                    String str4 = photoViewer.T4.T0;
                    if (str4 != null) {
                        Context context = LaunchActivity.H1;
                        if (context == null) {
                            context = photoViewer.F;
                        }
                        d01.s(context, Uri.parse(str4), true, false, false, null, null, false, na7.q1(photoViewer.U).k4.A2.f, false, false);
                        break;
                    }
                }
                break;
            default:
                Drawable[] drawableArr9 = PhotoViewer.f9;
                photoViewer.p0.p();
                photoViewer.B(false, false);
                Activity activity2 = photoViewer.E;
                if (activity2 instanceof LaunchActivity) {
                    ((LaunchActivity) activity2).u0(new zka(), false, true);
                    break;
                }
                break;
        }
    }
}
