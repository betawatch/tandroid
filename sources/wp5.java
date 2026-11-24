// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Intro;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class wp5 extends d implements gk7 {
    public boolean E;
    public Drawable F;
    public CharSequence[] G;
    public String[] H;
    public int I;
    public vp5 J;
    public long K;
    public boolean L;
    public i96 M;
    public boolean N;
    public boolean O;
    public int P;
    public final ez3 Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final Object a;
    public final Object b;
    public final int c;
    public gec d;
    public qw0 e;
    public TextView f;
    public GradientDrawable h;
    public t8 n;
    public FrameLayout r;
    public st s;
    public oy8 w;
    public int x;
    public boolean y;

    public wp5() {
        super(null);
        this.a = new Object();
        this.b = new Object();
        this.c = y6c.t0;
        this.x = 0;
        this.y = false;
        this.E = false;
        this.Q = new ez3(this, (byte) 14);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y() {
        String str;
        int i;
        i96 i96Var;
        int i2;
        i96 i96Var2;
        wp5 wp5Var;
        i96 i96Var3 = k96.D0().B;
        int i3 = this.c;
        String str2 = na7.q1(i3).s3;
        if ((str2 == null || (str2.equals("en") && k96.D0().z.getLanguage() != null && !k96.D0().z.getLanguage().equals("en"))) && (str2 = k96.D0().z.getLanguage()) == null) {
            str2 = "en";
        }
        String str3 = str2.contains("-") ? str2.split("-")[0] : str2;
        if (str3 != null) {
            str = "fil";
            i = i3;
            i96Var = i96Var3;
            switch (str3) {
                case "he":
                    str = "iw";
                    break;
                case "id":
                    str = "in";
                    break;
                case "in":
                    str = "id";
                    break;
                case "iw":
                    str = "he";
                    break;
                case "ji":
                    str = "yi";
                    break;
                case "jv":
                    str = "jw";
                    break;
                case "jw":
                    str = "jv";
                    break;
                case "nb":
                    str = "no";
                    break;
                case "no":
                    str = "nb";
                    break;
                case "yi":
                    str = "ji";
                    break;
                case "fil":
                    str = "tl";
                    break;
            }
            i96Var2 = null;
            i96 i96Var4 = null;
            for (i2 = 0; i2 < k96.D0().J.size(); i2++) {
                i96 i96Var5 = (i96) k96.D0().J.get(i2);
                if (i96Var5.c.equals("en")) {
                    i96Var2 = i96Var5;
                }
                if (i96Var5.c.replace("_", "-").equals(str2) || i96Var5.c.equals(str3) || i96Var5.c.equals(str)) {
                    i96Var4 = i96Var5;
                }
                if (i96Var2 != null && i96Var4 != null) {
                    i96 i96Var6 = i96Var4;
                    if (i96Var2 == null || i96Var6 == null || i96Var2 == i96Var6) {
                        return;
                    }
                    TLRPC.TL_langpack_getStrings tL_langpack_getStrings = new TLRPC.TL_langpack_getStrings();
                    if (i96Var6 != i96Var) {
                        tL_langpack_getStrings.lang_code = i96Var6.c();
                        wp5Var = this;
                        wp5Var.M = i96Var6;
                    } else {
                        wp5Var = this;
                        tL_langpack_getStrings.lang_code = i96Var2.c();
                        wp5Var.M = i96Var2;
                    }
                    tL_langpack_getStrings.keys.add("ContinueOnThisLanguage");
                    ConnectionsManager.getInstance(i).sendRequest(tL_langpack_getStrings, new rv3(wp5Var, str2, (byte) 12), 8);
                    return;
                }
            }
            i96 i96Var62 = i96Var4;
            if (i96Var2 == null) {
                return;
            } else {
                return;
            }
        }
        i96Var = i96Var3;
        i = i3;
        str = null;
        i96Var2 = null;
        i96 i96Var42 = null;
        while (i2 < k96.D0().J.size()) {
        }
        i96 i96Var622 = i96Var42;
        if (i96Var2 == null) {
        }
    }

    public final void Z(boolean z) {
        GradientDrawable gradientDrawable = this.h;
        int i = bkb.Ei;
        gradientDrawable.setColors(new int[]{getThemedColor(i), getThemedColor(bkb.Fi)});
        this.F.setColorFilter(bkb.p1(0.9f, getThemedColor(bkb.z8)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i2 = bkb.c6;
        view.setBackgroundColor(bkb.w0(null, i2, false));
        this.f.setTextColor(bkb.w0(null, bkb.p6, false));
        this.n.setTextColor(bkb.w0(null, bkb.Ii, false));
        t8 t8Var = this.n;
        int L = gl.L(24.0f);
        int w0 = bkb.w0(null, bkb.Gi, false);
        t8Var.setBackground(bkb.i0(L, L, L, L, 0, w0, w0));
        this.w.setColorFilter(new PorterDuffColorFilter(bkb.w0(null, i, false), PorterDuff.Mode.SRC_IN));
        this.e.invalidate();
        this.P = bkb.w0(null, i2, false);
        if (!z) {
            Intro.a(bkb.w0(null, i2, false));
            return;
        }
        vp5 vp5Var = this.J;
        if (vp5Var != null) {
            vp5Var.postRunnable(new iu4(this, (byte) 29));
        }
        for (int i3 = 0; i3 < this.d.getChildCount(); i3++) {
            View childAt = this.d.getChildAt(i3);
            TextView textView = (TextView) childAt.findViewWithTag(this.a);
            int i4 = bkb.F6;
            textView.setTextColor(bkb.w0(null, i4, false));
            ((TextView) childAt.findViewWithTag(this.b)).setTextColor(bkb.w0(null, i4, false));
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        Drawable d = b00.d(context, R.drawable.telegram_logo);
        this.F = d;
        final byte b = 0;
        d.setBounds(0, gl.L(8.666f), gl.L(115.0f), gl.L(35.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.M0(2131747555, null));
        spannableStringBuilder.setSpan(new ImageSpan(this.F), 0, spannableStringBuilder.length(), 33);
        this.G[0] = spannableStringBuilder;
        this.actionBar.setAddToContainer(false);
        ScrollView scrollView = new ScrollView(context);
        final byte b2 = 1;
        scrollView.setFillViewport(true);
        ry8 ry8Var = new ry8(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(ry8Var, nme.e(28, 28, 17));
        st stVar = new st(this, context, frameLayout, (byte) 19);
        this.s = stVar;
        scrollView.addView(stVar, nme.x(-1, -2, 51));
        oy8 oy8Var = new oy8(R.raw.sun, gl.L(28.0f), gl.L(28.0f), true, null);
        this.w = oy8Var;
        oy8Var.h = true;
        oy8Var.a0 = true;
        oy8Var.j();
        this.w.K(bkb.B0().o() ? this.w.e[0] - 1 : 0);
        this.w.I(bkb.B0().o() ? this.w.e[0] - 1 : 0, false, false);
        ry8Var.setContentDescription(k96.M0(bkb.B0().o() ? 2131754750 : 2131754749, null));
        ry8Var.setAnimation(this.w);
        frameLayout.setOnClickListener(new xf3((Object) this, (Object) ry8Var, (byte) 24));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        this.s.addView(frameLayout2, nme.d(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.r.addView(textureView, nme.e(kk7.d3, kk7.f2, 17));
        textureView.setSurfaceTextureListener(new up5(this, b));
        gec gecVar = new gec(context);
        this.d = gecVar;
        gecVar.setAdapter(new f95(this, b2));
        this.d.setPageMargin(0);
        this.d.setOffscreenPageLimit(1);
        this.s.addView(this.d, nme.c(-1.0f, -1));
        this.d.b(new lv(this, b2));
        this.h = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        t8 t8Var = new t8(this, context);
        this.n = t8Var;
        ote.b(t8Var, 0.02f, 1.2f);
        this.n.setText(k96.M0(2131744674, null));
        this.n.setGravity(17);
        this.n.setTypeface(gl.o());
        this.n.setTextSize(1, 15.0f);
        this.n.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
        this.s.addView(this.n, nme.d(-1, 48.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: sp5
            public final /* synthetic */ wp5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                wp5 wp5Var = this.b;
                byte b4 = 1;
                switch (b3) {
                    case 0:
                        if (!wp5Var.E) {
                            wp5Var.E = true;
                            wp5Var.presentFragment(new mf6(), true);
                            wp5Var.N = true;
                            break;
                        }
                        break;
                    default:
                        if (!wp5Var.E && wp5Var.M != null) {
                            wp5Var.E = true;
                            hd hdVar = new hd(3, null, view.getContext());
                            hdVar.j0 = false;
                            hdVar.q(1000L);
                            kk7.e().a(new fu0(wp5Var, hdVar, b4), kk7.z4);
                            k96.D0().d(wp5Var.M, true, false, wp5Var.c);
                            break;
                        }
                        break;
                }
            }
        });
        qw0 qw0Var = new qw0(context, this.d, 6);
        this.e = qw0Var;
        this.s.addView(qw0Var, nme.d(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setGravity(17);
        this.f.setTextSize(1, 16.0f);
        this.s.addView(this.f, nme.d(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        this.f.setOnClickListener(new View.OnClickListener(this) { // from class: sp5
            public final /* synthetic */ wp5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                wp5 wp5Var = this.b;
                byte b4 = 1;
                switch (b3) {
                    case 0:
                        if (!wp5Var.E) {
                            wp5Var.E = true;
                            wp5Var.presentFragment(new mf6(), true);
                            wp5Var.N = true;
                            break;
                        }
                        break;
                    default:
                        if (!wp5Var.E && wp5Var.M != null) {
                            wp5Var.E = true;
                            hd hdVar = new hd(3, null, view.getContext());
                            hdVar.j0 = false;
                            hdVar.q(1000L);
                            kk7.e().a(new fu0(wp5Var, hdVar, b4), kk7.z4);
                            k96.D0().d(wp5Var.M, true, false, wp5Var.c);
                            break;
                        }
                        break;
                }
            }
        });
        this.s.addView(frameLayout, nme.d(64, 64.0f, 53, 0.0f, 4.0f, 4.0f, 0.0f));
        this.fragmentView = scrollView;
        kk7.e().b(this, kk7.A4);
        int i = this.c;
        kk7.f(i).b(this, kk7.I2);
        ConnectionsManager.getInstance(i).updateDcSettings();
        k96.D0().V0(i, true);
        Y();
        this.y = true;
        Z(false);
        return this.fragmentView;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.A4 || i == kk7.I2) {
            Y();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        return hue.a(new t00(this, (byte) 8), bkb.c6, bkb.p6, bkb.O9, bkb.P9, bkb.Ii, bkb.F6);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        return bm2.h(bkb.w0(null, bkb.c6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final AnimatorSet onCustomTransitionAnimation(boolean z, Runnable runnable) {
        if (!this.O) {
            return null;
        }
        AnimatorSet duration = new AnimatorSet().setDuration(50L);
        duration.playTogether(ValueAnimator.ofFloat(new float[0]));
        return duration;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        na7.c1().edit().putLong("intro_crashed_time", System.currentTimeMillis()).apply();
        this.G = new CharSequence[]{null, k96.M0(2131747553, null), k96.M0(2131747551, null), k96.M0(2131747547, null), k96.M0(2131747549, null), k96.M0(2131747545, null)};
        this.H = new String[]{k96.M0(2131747556, null), k96.M0(2131747554, null), k96.M0(2131747552, null), k96.M0(2131747548, null), k96.M0(2131747550, null), k96.M0(2131747546, null)};
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.N = true;
        gl.r(this.Q);
        kk7.e().n(this, kk7.A4);
        kk7.f(this.c).n(this, kk7.I2);
        na7.c1().edit().putLong("intro_crashed_time", 0L).apply();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        gl.K3(getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        if (this.y) {
            boolean z = k96.a0;
            gec gecVar = this.d;
            if (z) {
                gecVar.setCurrentItem(6);
                this.x = 6;
            } else {
                gecVar.setCurrentItem(0);
                this.x = 0;
            }
            this.y = false;
        }
        gl.e2(getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        ez3 ez3Var = this.Q;
        try {
            if (this.fragmentView != null) {
                int i = bkb.Ei;
                int themedColor = getThemedColor(i);
                int themedColor2 = getThemedColor(bkb.Fi);
                GradientDrawable gradientDrawable = this.h;
                if (gradientDrawable != null && (themedColor != this.R || themedColor2 != this.S)) {
                    this.R = themedColor;
                    this.S = themedColor2;
                    gradientDrawable.setColors(new int[]{themedColor, themedColor2});
                }
                int p1 = bkb.p1(0.9f, getThemedColor(bkb.z8));
                Drawable drawable = this.F;
                if (drawable != null && p1 != this.T) {
                    this.T = p1;
                    drawable.setColorFilter(p1, PorterDuff.Mode.MULTIPLY);
                }
                this.fragmentView.setBackgroundColor(bkb.w0(null, bkb.c6, false));
                TextView textView = this.f;
                if (textView != null) {
                    textView.setTextColor(bkb.w0(null, bkb.p6, false));
                }
                t8 t8Var = this.n;
                if (t8Var != null) {
                    t8Var.setTextColor(bkb.w0(null, bkb.Ii, false));
                    bkb.F1(this.n.getBackground(), bkb.w0(null, bkb.Gi, false), true);
                }
                int w0 = bkb.w0(null, i, false);
                oy8 oy8Var = this.w;
                if (oy8Var != null && w0 != this.U) {
                    this.U = w0;
                    oy8Var.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
                }
                qw0 qw0Var = this.e;
                if (qw0Var != null) {
                    qw0Var.invalidate();
                }
                if (this.d != null) {
                    for (int i2 = 0; i2 < this.d.getChildCount(); i2++) {
                        View childAt = this.d.getChildAt(i2);
                        TextView textView2 = (TextView) childAt.findViewWithTag(this.a);
                        if (textView2 != null) {
                            textView2.setTextColor(bkb.w0(null, bkb.F6, false));
                        }
                        TextView textView3 = (TextView) childAt.findViewWithTag(this.b);
                        if (textView3 != null) {
                            textView3.setTextColor(bkb.w0(null, bkb.F6, false));
                        }
                    }
                }
                if (this.J == null || this.P == bkb.w0(null, bkb.c6, false)) {
                    return;
                }
                gl.r(ez3Var);
                gl.d3(ez3Var, 100L);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
