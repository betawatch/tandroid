// default package

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import org.telegram.messenger.BringAppForegroundService;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zv3 extends my0 {
    public static zv3 R1;
    public final int A1;
    public final int B1;
    public final String C1;
    public final boolean D1;
    public final String E1;
    public int F1;
    public boolean G1;
    public boolean H1;
    public boolean I1;
    public int J1;
    public final int K1;
    public final uv3 L1;
    public ad8 M1;
    public View N1;
    public int O1;
    public int P1;
    public final nl9 Q1;
    public final vv3 l1;
    public final tvc m1;
    public View n1;
    public final FrameLayout o1;
    public WebChromeClient.CustomViewCallback p1;
    public final View q1;
    public final RadialProgressView r1;
    public final Activity s1;
    public final LinearLayout t1;
    public final TextView u1;
    public final yd v1;
    public final ImageView w1;
    public boolean x1;
    public final int[] y1;
    public tv3 z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv3(Activity activity, String str, String str2, String str3, String str4, int i, int i2, int i3) {
        super(activity, false);
        float f;
        byte b;
        byte b2 = 0;
        final byte b3 = 2;
        this.y1 = new int[2];
        this.F1 = -2;
        this.L1 = new uv3(this);
        this.Q1 = new nl9((Object) this, (byte) 29);
        byte b4 = 1;
        this.V = true;
        this.v0 = false;
        this.w0 = false;
        this.K1 = i3;
        if (wi8.A(activity)) {
            this.s1 = activity;
        }
        this.E1 = str4;
        boolean z = str2 != null && str2.length() > 0;
        this.D1 = z;
        this.C1 = str3;
        this.A1 = i;
        this.B1 = i2;
        if (i == 0 || i2 == 0) {
            Point point = gm.q;
            this.A1 = point.x;
            this.B1 = point.y / 2;
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        this.o1 = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new w02((byte) 7));
        this.c.addView(frameLayout, qoe.c(-1.0f, -1));
        frameLayout.setVisibility(4);
        yd ydVar = new yd((byte) 17, (Context) activity, (Object) this);
        this.v1 = ydVar;
        ydVar.setOnTouchListener(new w02((byte) 8));
        this.O = ydVar;
        vv3 vv3Var = new vv3(this, activity, activity, b2);
        this.l1 = vv3Var;
        vv3Var.getSettings().setJavaScriptEnabled(true);
        vv3Var.getSettings().setDomStorageEnabled(true);
        vv3Var.getSettings().setMediaPlaybackRequiresUserGesture(false);
        vv3Var.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(vv3Var, true);
        vv3Var.setWebChromeClient(new rv(this, b4));
        vv3Var.setWebViewClient(new sv(this, b4));
        ydVar.addView(vv3Var, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z ? 22 : 0) + 84));
        tvc tvcVar = new tvc(activity, true, new wv3(this));
        this.m1 = tvcVar;
        tvcVar.setVisibility(4);
        ydVar.addView(tvcVar, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z ? 22 : 0) + 74));
        View view = new View(activity);
        this.q1 = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        ydVar.addView(view, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z ? 22 : 0) + 84));
        RadialProgressView radialProgressView = new RadialProgressView(activity, null);
        this.r1 = radialProgressView;
        radialProgressView.setVisibility(4);
        ydVar.addView(radialProgressView, qoe.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, ((z ? 22 : 0) + 84) / 2));
        if (z) {
            TextView textView = new TextView(activity);
            f = 18.0f;
            textView.setTextSize(1, 16.0f);
            anb.X(textView, cmb.i5, null);
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(gm.o());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
            ydVar.addView(textView, qoe.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        } else {
            f = 18.0f;
        }
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        anb.X(textView2, cmb.o5, null);
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(gm.L(f), 0, gm.L(f), 0);
        ydVar.addView(textView2, qoe.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 57.0f));
        View view2 = new View(activity);
        anb.h(cmb.J5, null, view2);
        ydVar.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = gm.L(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        anb.h(cmb.g5, null, frameLayout2);
        ydVar.addView(frameLayout2, qoe.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, qoe.e(-2, -1, 53));
        TextView textView3 = new TextView(activity);
        textView3.setTextSize(1, 14.0f);
        int i4 = cmb.n5;
        anb.X(textView3, i4, null);
        textView3.setGravity(17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i5 = cmb.H5;
        fg0 f0 = cmb.f0(cmb.w0(null, i5, false), 0, -1);
        wmb M = anb.M(i5);
        textView3.setBackground(f0);
        anb.j(textView3, f0, null, M, null);
        textView3.setPadding(gm.L(f), 0, gm.L(f), 0);
        textView3.setText(jb6.M0(2131751978, null).toUpperCase());
        textView3.setTypeface(gm.o());
        frameLayout2.addView(textView3, qoe.r(-2, -1, 51));
        final byte b5 = 0;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: sv3
            public final /* synthetic */ zv3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b6 = b5;
                zv3 zv3Var = this.b;
                switch (b6) {
                    case 0:
                        zv3Var.dismiss();
                        break;
                    case 1:
                        vv3 vv3Var2 = zv3Var.l1;
                        ad8 a = yc3.c().a();
                        if (a == null) {
                            if (zv3Var.r1.getVisibility() != 0) {
                                zv3Var.J0(vv3Var2, zv3Var.A1, zv3Var.B1);
                                if (zv3Var.x1) {
                                    vv3Var2.evaluateJavascript("hideControls();", null);
                                }
                                zv3Var.b.setTranslationY(0.0f);
                                zv3Var.H();
                                break;
                            }
                        } else {
                            a.b();
                            Objects.requireNonNull(view3);
                            gm.d3(new ud(view3, (byte) 2), 300L);
                            break;
                        }
                        break;
                    case 2:
                        try {
                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", zv3Var.C1));
                        } catch (Exception e) {
                            fc4.g(e, true);
                        }
                        Activity activity2 = zv3Var.s1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new wa3((byte) 23));
                        }
                        zv3Var.dismiss();
                        break;
                    default:
                        l11.u(zv3Var.s1, zv3Var.C1);
                        zv3Var.dismiss();
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.t1 = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, qoe.e(-2, -1, 17));
        ImageView imageView = new ImageView(activity);
        this.w1 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(jb6.M0(2131754807, null));
        imageView.setEnabled(false);
        imageView.setAlpha(0.5f);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        anb.s(imageView, i4, null, mode);
        fg0 f02 = cmb.f0(cmb.w0(null, i5, false), 0, -1);
        wmb M2 = anb.M(i5);
        imageView.setBackground(f02);
        anb.j(imageView, f02, null, M2, null);
        linearLayout2.addView(imageView, qoe.d(48, 48.0f, 51, 0.0f, 0.0f, 4.0f, 0.0f));
        final byte b6 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: sv3
            public final /* synthetic */ zv3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b62 = b6;
                zv3 zv3Var = this.b;
                switch (b62) {
                    case 0:
                        zv3Var.dismiss();
                        break;
                    case 1:
                        vv3 vv3Var2 = zv3Var.l1;
                        ad8 a = yc3.c().a();
                        if (a == null) {
                            if (zv3Var.r1.getVisibility() != 0) {
                                zv3Var.J0(vv3Var2, zv3Var.A1, zv3Var.B1);
                                if (zv3Var.x1) {
                                    vv3Var2.evaluateJavascript("hideControls();", null);
                                }
                                zv3Var.b.setTranslationY(0.0f);
                                zv3Var.H();
                                break;
                            }
                        } else {
                            a.b();
                            Objects.requireNonNull(view3);
                            gm.d3(new ud(view3, (byte) 2), 300L);
                            break;
                        }
                        break;
                    case 2:
                        try {
                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", zv3Var.C1));
                        } catch (Exception e) {
                            fc4.g(e, true);
                        }
                        Activity activity2 = zv3Var.s1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new wa3((byte) 23));
                        }
                        zv3Var.dismiss();
                        break;
                    default:
                        l11.u(zv3Var.s1, zv3Var.C1);
                        zv3Var.dismiss();
                        break;
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: sv3
            public final /* synthetic */ zv3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b62 = b3;
                zv3 zv3Var = this.b;
                switch (b62) {
                    case 0:
                        zv3Var.dismiss();
                        break;
                    case 1:
                        vv3 vv3Var2 = zv3Var.l1;
                        ad8 a = yc3.c().a();
                        if (a == null) {
                            if (zv3Var.r1.getVisibility() != 0) {
                                zv3Var.J0(vv3Var2, zv3Var.A1, zv3Var.B1);
                                if (zv3Var.x1) {
                                    vv3Var2.evaluateJavascript("hideControls();", null);
                                }
                                zv3Var.b.setTranslationY(0.0f);
                                zv3Var.H();
                                break;
                            }
                        } else {
                            a.b();
                            Objects.requireNonNull(view3);
                            gm.d3(new ud(view3, (byte) 2), 300L);
                            break;
                        }
                        break;
                    case 2:
                        try {
                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", zv3Var.C1));
                        } catch (Exception e) {
                            fc4.g(e, true);
                        }
                        Activity activity2 = zv3Var.s1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new wa3((byte) 23));
                        }
                        zv3Var.dismiss();
                        break;
                    default:
                        l11.u(zv3Var.s1, zv3Var.C1);
                        zv3Var.dismiss();
                        break;
                }
            }
        };
        ImageView imageView2 = new ImageView(activity);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_copy);
        imageView2.setContentDescription(jb6.M0(2131751699, null));
        anb.s(imageView2, i4, null, mode);
        fg0 f03 = cmb.f0(cmb.w0(null, i5, false), 0, -1);
        wmb M3 = anb.M(i5);
        imageView2.setBackground(f03);
        anb.j(imageView2, f03, null, M3, null);
        linearLayout2.addView(imageView2, qoe.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(activity);
        this.u1 = textView4;
        textView4.setTextSize(1, 14.0f);
        anb.X(textView4, i4, null);
        textView4.setGravity(17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        fg0 f04 = cmb.f0(cmb.w0(null, i5, false), 0, -1);
        wmb M4 = anb.M(i5);
        textView4.setBackground(f04);
        anb.j(textView4, f04, null, M4, null);
        textView4.setPadding(gm.L(f), 0, gm.L(f), 0);
        textView4.setText(jb6.M0(2131751704, null).toUpperCase());
        textView4.setTypeface(gm.o());
        linearLayout.addView(textView4, qoe.e(-2, -1, 51));
        textView4.setOnClickListener(onClickListener);
        TextView textView5 = new TextView(activity);
        textView5.setTextSize(1, 14.0f);
        anb.X(textView5, i4, null);
        textView5.setGravity(17);
        textView5.setSingleLine(true);
        textView5.setEllipsize(truncateAt);
        fg0 f05 = cmb.f0(cmb.w0(null, i5, false), 0, -1);
        wmb M5 = anb.M(i5);
        textView5.setBackground(f05);
        anb.j(textView5, f05, null, M5, null);
        textView5.setPadding(gm.L(f), 0, gm.L(f), 0);
        textView5.setText(jb6.M0(2131747531, null).toUpperCase());
        textView5.setTypeface(gm.o());
        linearLayout.addView(textView5, qoe.e(-2, -1, 51));
        final byte b7 = 3;
        textView5.setOnClickListener(new View.OnClickListener(this) { // from class: sv3
            public final /* synthetic */ zv3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b62 = b7;
                zv3 zv3Var = this.b;
                switch (b62) {
                    case 0:
                        zv3Var.dismiss();
                        break;
                    case 1:
                        vv3 vv3Var2 = zv3Var.l1;
                        ad8 a = yc3.c().a();
                        if (a == null) {
                            if (zv3Var.r1.getVisibility() != 0) {
                                zv3Var.J0(vv3Var2, zv3Var.A1, zv3Var.B1);
                                if (zv3Var.x1) {
                                    vv3Var2.evaluateJavascript("hideControls();", null);
                                }
                                zv3Var.b.setTranslationY(0.0f);
                                zv3Var.H();
                                break;
                            }
                        } else {
                            a.b();
                            Objects.requireNonNull(view3);
                            gm.d3(new ud(view3, (byte) 2), 300L);
                            break;
                        }
                        break;
                    case 2:
                        try {
                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", zv3Var.C1));
                        } catch (Exception e) {
                            fc4.g(e, true);
                        }
                        Activity activity2 = zv3Var.s1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new wa3((byte) 23));
                        }
                        zv3Var.dismiss();
                        break;
                    default:
                        l11.u(zv3Var.s1, zv3Var.C1);
                        zv3Var.dismiss();
                        break;
                }
            }
        });
        boolean z2 = tvc.a(str4) || tvc.a(str3);
        tvcVar.setVisibility(z2 ? 0 : 4);
        if (z2) {
            pvc pvcVar = tvcVar.g0;
            pvcVar.setVisibility(4);
            b = 0;
            pvcVar.d(false, false);
            tvcVar.j(true, false);
        } else {
            b = 0;
        }
        this.z0 = new xv3(this, z2);
        this.z1 = new tv3(b, a.b, this);
        String e = tvc.e(str4);
        if (e != null || !z2) {
            radialProgressView.setVisibility(b);
            vv3Var.setVisibility(b);
            linearLayout2.setVisibility(b);
            if (e != null) {
                view.setVisibility(b);
            }
            textView4.setVisibility(4);
            vv3Var.setKeepScreenOn(true);
            tvcVar.setVisibility(4);
            tvcVar.getControlsView().setVisibility(4);
            tvcVar.getTextureView().setVisibility(4);
            if (tvcVar.getTextureImageView() != null) {
                tvcVar.getTextureImageView().setVisibility(4);
            }
            if (e != null && "disabled".equals(oc7.r1(this.a).l4.I0.f)) {
                imageView.setVisibility(8);
            }
        }
        boolean canDetectOrientation = this.z1.canDetectOrientation();
        tv3 tv3Var = this.z1;
        if (canDetectOrientation) {
            tv3Var.enable();
        } else {
            tv3Var.disable();
            this.z1 = null;
        }
        R1 = this;
    }

    public static void I0(d dVar, k47 k47Var, jb8 jb8Var, String str, String str2, String str3, String str4, int i, int i2, int i3, boolean z) {
        TLRPC.MessageMedia messageMedia;
        zv3 zv3Var = R1;
        if (zv3Var != null) {
            zv3Var.E0();
        }
        if (((k47Var == null || (messageMedia = k47Var.k.media) == null || messageMedia.webpage == null) ? null : tvc.e(str4)) != null) {
            PhotoViewer.r0().T1(null, dVar, null);
            PhotoViewer.r0().m1(k47Var, null, null, null, null, null, null, 0, jb8Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i3));
        } else {
            zv3 zv3Var2 = new zv3(dVar.getParentActivity(), str, str2, str3, str4, i, i2, i3);
            zv3Var2.i0 = z;
            zv3Var2.n = z;
            zv3Var2.show();
        }
    }

    @Override // my0
    public final boolean C() {
        tvc tvcVar = this.m1;
        return (tvcVar.getVisibility() == 0 && tvcVar.U) ? false : true;
    }

    public final void D0() {
        ad8 ad8Var = this.M1;
        if (ad8Var != null) {
            this.M1 = null;
            ad8Var.a(new bn0((byte) 10));
            ad8Var.g();
        }
    }

    @Override // my0
    public final boolean E() {
        return this.o1.getVisibility() != 0;
    }

    public final void E0() {
        vv3 vv3Var = this.l1;
        if (vv3Var != null && vv3Var.getVisibility() == 0) {
            this.v1.removeView(vv3Var);
            vv3Var.stopLoading();
            vv3Var.loadUrl("about:blank");
            vv3Var.destroy();
        }
        ad8 ad8Var = this.M1;
        if (ad8Var != null) {
            this.M1 = null;
            ad8Var.b();
        }
        tvc tvcVar = this.m1;
        if (tvcVar != null) {
            tvcVar.b();
        }
        R1 = null;
        H();
    }

    public final void F0() {
        ImageView imageView;
        if (this.l1 == null || !H0()) {
            return;
        }
        if (this.N1 != this.l1) {
            tvc tvcVar = this.m1;
            if (!tvcVar.V || (imageView = tvcVar.e0) == null) {
                return;
            }
            imageView.callOnClick();
            return;
        }
        if (a.x) {
            try {
                this.s1.startService(new Intent(a.b, (Class<?>) BringAppForegroundService.class));
            } catch (Throwable th) {
                fc4.g(th, true);
            }
        }
        if (this.x1) {
            this.l1.evaluateJavascript("showControls();", null);
        }
        ViewGroup viewGroup = (ViewGroup) this.l1.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.l1);
        }
        this.v1.addView(this.l1, 0, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (this.D1 ? 22 : 0) + 84));
        this.f0 = true;
        show();
        D0();
    }

    public final o49 G0(boolean z, float f) {
        ad8 ad8Var;
        tl4 tl4Var;
        RectF rectF = new RectF();
        if (z || (ad8Var = this.M1) == null || (tl4Var = ad8Var.e) == null) {
            tl4.j(rectF, 1000, Math.round(1000.0f / f));
        } else {
            tl4Var.g(rectF);
        }
        o49 o49Var = new o49();
        o49Var.a = rectF.left;
        o49Var.b = rectF.top;
        o49Var.c = rectF.width();
        o49Var.d = rectF.height();
        return o49Var;
    }

    @Override // my0
    public final void H() {
        super.H();
        tv3 tv3Var = this.z1;
        if (tv3Var != null) {
            tv3Var.disable();
            this.z1 = null;
        }
    }

    public final boolean H0() {
        ad8 ad8Var = this.M1;
        return ad8Var != null && ad8Var.f();
    }

    public final void J0(View view, int i, int i2) {
        ad8 a = yc3.c().a();
        if (a != null) {
            a.b();
        }
        this.N1 = view;
        this.O1 = i;
        this.P1 = i2;
        ad8 k = yc3.c().k(this.Q1);
        this.M1 = k;
        k.h(this.s1, null, true);
    }

    public final void K0() {
        tvc tvcVar = this.m1;
        View aspectRatioView = tvcVar.getAspectRatioView();
        int[] iArr = this.y1;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - Q();
        if (!tvcVar.f() && !this.I1) {
            TextureView textureView = tvcVar.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = tvcVar.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = tvcVar.getControlsView();
        if (controlsView.getParent() == this.c) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override // my0
    public final void Z(Configuration configuration) {
        tvc tvcVar = this.m1;
        if (tvcVar.getVisibility() == 0 && tvcVar.x && !tvcVar.f()) {
            int i = configuration.orientation;
            boolean z = tvcVar.U;
            if (i == 2) {
                if (z || z) {
                    return;
                }
                tvcVar.U = true;
                tvcVar.m();
                tvcVar.l(false);
                return;
            }
            if (z && z) {
                tvcVar.U = false;
                tvcVar.m();
                tvcVar.l(false);
            }
        }
    }

    @Override // my0
    public final void a0() {
        int i = this.J1;
        if (i != 0) {
            int i2 = i - 1;
            this.J1 = i2;
            if (i2 != 0) {
                this.c.invalidate();
                return;
            }
            tvc tvcVar = this.m1;
            TextureView textureView = tvcVar.d;
            ImageView imageView = tvcVar.e;
            if (imageView != null) {
                try {
                    int width = textureView.getWidth();
                    int height = textureView.getHeight();
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    Bitmap a = ld1.a(width, height);
                    tvcVar.h = a;
                    tvcVar.n.getBitmap(a);
                } catch (Throwable th) {
                    Bitmap bitmap = tvcVar.h;
                    if (bitmap != null) {
                        bitmap.recycle();
                        tvcVar.h = null;
                    }
                    fc4.g(th, true);
                }
                if (tvcVar.h != null) {
                    imageView.setVisibility(0);
                    imageView.setImageBitmap(tvcVar.h);
                } else {
                    imageView.setImageDrawable(null);
                }
            }
            D0();
        }
    }

    @Override // my0
    public final void d0(float f) {
        K0();
    }

    @Override // my0
    public final boolean h0(View view, int i, int i2, int i3, int i4) {
        if (view != this.m1.getControlsView()) {
            return false;
        }
        K0();
        return false;
    }

    @Override // my0
    public final boolean i0(View view, int i, int i2) {
        tvc tvcVar = this.m1;
        if (view == tvcVar.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = tvcVar.getMeasuredWidth();
            layoutParams.height = tvcVar.getAspectRatioView().getMeasuredHeight() + (tvcVar.U ? 0 : gm.L(10.0f));
        }
        return false;
    }
}
