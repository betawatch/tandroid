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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vr5 extends d implements jm7 {
    public boolean E;
    public Drawable F;
    public CharSequence[] G;
    public String[] H;
    public int I;
    public ur5 J;
    public long K;
    public boolean L;
    public hb6 M;
    public boolean N;
    public boolean O;
    public int P;
    public final o04 Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final Object a;
    public final Object b;
    public final int c;
    public ggc d;
    public yx0 e;
    public TextView f;
    public GradientDrawable h;
    public t8 n;
    public FrameLayout r;
    public su s;
    public p09 w;
    public int x;
    public boolean y;

    public vr5() {
        super(null);
        this.a = new Object();
        this.b = new Object();
        this.c = z8c.t0;
        this.x = 0;
        this.y = false;
        this.E = false;
        this.Q = new o04(this, (byte) 14);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z() {
        String str;
        int i;
        hb6 hb6Var;
        int i2;
        hb6 hb6Var2;
        vr5 vr5Var;
        hb6 hb6Var3 = jb6.D0().B;
        int i3 = this.c;
        String str2 = oc7.r1(i3).s3;
        if ((str2 == null || (str2.equals("en") && jb6.D0().z.getLanguage() != null && !jb6.D0().z.getLanguage().equals("en"))) && (str2 = jb6.D0().z.getLanguage()) == null) {
            str2 = "en";
        }
        String str3 = str2.contains("-") ? str2.split("-")[0] : str2;
        if (str3 != null) {
            str = "fil";
            i = i3;
            hb6Var = hb6Var3;
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
            hb6Var2 = null;
            hb6 hb6Var4 = null;
            for (i2 = 0; i2 < jb6.D0().J.size(); i2++) {
                hb6 hb6Var5 = (hb6) jb6.D0().J.get(i2);
                if (hb6Var5.c.equals("en")) {
                    hb6Var2 = hb6Var5;
                }
                if (hb6Var5.c.replace("_", "-").equals(str2) || hb6Var5.c.equals(str3) || hb6Var5.c.equals(str)) {
                    hb6Var4 = hb6Var5;
                }
                if (hb6Var2 != null && hb6Var4 != null) {
                    hb6 hb6Var6 = hb6Var4;
                    if (hb6Var2 == null || hb6Var6 == null || hb6Var2 == hb6Var6) {
                        return;
                    }
                    TLRPC.TL_langpack_getStrings tL_langpack_getStrings = new TLRPC.TL_langpack_getStrings();
                    if (hb6Var6 != hb6Var) {
                        tL_langpack_getStrings.lang_code = hb6Var6.c();
                        vr5Var = this;
                        vr5Var.M = hb6Var6;
                    } else {
                        vr5Var = this;
                        tL_langpack_getStrings.lang_code = hb6Var2.c();
                        vr5Var.M = hb6Var2;
                    }
                    tL_langpack_getStrings.keys.add("ContinueOnThisLanguage");
                    ConnectionsManager.getInstance(i).sendRequest(tL_langpack_getStrings, new cx3(vr5Var, str2, (byte) 12), 8);
                    return;
                }
            }
            hb6 hb6Var62 = hb6Var4;
            if (hb6Var2 == null) {
                return;
            } else {
                return;
            }
        }
        hb6Var = hb6Var3;
        i = i3;
        str = null;
        hb6Var2 = null;
        hb6 hb6Var42 = null;
        while (i2 < jb6.D0().J.size()) {
        }
        hb6 hb6Var622 = hb6Var42;
        if (hb6Var2 == null) {
        }
    }

    public final void a0(boolean z) {
        GradientDrawable gradientDrawable = this.h;
        int i = cmb.Ei;
        gradientDrawable.setColors(new int[]{getThemedColor(i), getThemedColor(cmb.Fi)});
        this.F.setColorFilter(cmb.p1(0.9f, getThemedColor(cmb.z8)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i2 = cmb.c6;
        view.setBackgroundColor(cmb.w0(null, i2, false));
        this.f.setTextColor(cmb.w0(null, cmb.p6, false));
        this.n.setTextColor(cmb.w0(null, cmb.Ii, false));
        t8 t8Var = this.n;
        int L = gm.L(24.0f);
        int w0 = cmb.w0(null, cmb.Gi, false);
        t8Var.setBackground(cmb.i0(L, L, L, L, 0, w0, w0));
        this.w.setColorFilter(new PorterDuffColorFilter(cmb.w0(null, i, false), PorterDuff.Mode.SRC_IN));
        this.e.invalidate();
        this.P = cmb.w0(null, i2, false);
        if (!z) {
            Intro.a(cmb.w0(null, i2, false));
            return;
        }
        ur5 ur5Var = this.J;
        if (ur5Var != null) {
            ur5Var.postRunnable(new kg5(this, (byte) 6));
        }
        for (int i3 = 0; i3 < this.d.getChildCount(); i3++) {
            View childAt = this.d.getChildAt(i3);
            TextView textView = (TextView) childAt.findViewWithTag(this.a);
            int i4 = cmb.F6;
            textView.setTextColor(cmb.w0(null, i4, false));
            ((TextView) childAt.findViewWithTag(this.b)).setTextColor(cmb.w0(null, i4, false));
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        Drawable d = b10.d(context, R.drawable.telegram_logo);
        this.F = d;
        final byte b = 0;
        d.setBounds(0, gm.L(8.666f), gm.L(115.0f), gm.L(35.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131747481, null));
        spannableStringBuilder.setSpan(new ImageSpan(this.F), 0, spannableStringBuilder.length(), 33);
        this.G[0] = spannableStringBuilder;
        this.actionBar.setAddToContainer(false);
        ScrollView scrollView = new ScrollView(context);
        final byte b2 = 1;
        scrollView.setFillViewport(true);
        s09 s09Var = new s09(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(s09Var, qoe.e(28, 28, 17));
        su suVar = new su(this, context, frameLayout, (byte) 20);
        this.s = suVar;
        scrollView.addView(suVar, qoe.x(-1, -2, 51));
        p09 p09Var = new p09(R.raw.sun, gm.L(28.0f), gm.L(28.0f), true, null);
        this.w = p09Var;
        p09Var.h = true;
        p09Var.a0 = true;
        p09Var.j();
        this.w.K(cmb.B0().o() ? this.w.e[0] - 1 : 0);
        this.w.I(cmb.B0().o() ? this.w.e[0] - 1 : 0, false, false);
        s09Var.setContentDescription(jb6.M0(cmb.B0().o() ? 2131754750 : 2131754749, null));
        s09Var.setAnimation(this.w);
        frameLayout.setOnClickListener(new tf3(this, s09Var, (byte) 25));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        this.s.addView(frameLayout2, qoe.d(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.r.addView(textureView, qoe.e(nm7.d3, nm7.f2, 17));
        textureView.setSurfaceTextureListener(new tr5(this, b));
        ggc ggcVar = new ggc(context);
        this.d = ggcVar;
        ggcVar.setAdapter(new db5(this, b2));
        this.d.setPageMargin(0);
        this.d.setOffscreenPageLimit(1);
        this.s.addView(this.d, qoe.c(-1.0f, -1));
        this.d.b(new lw(this, b2));
        this.h = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        t8 t8Var = new t8(this, context);
        this.n = t8Var;
        rve.b(t8Var, 0.02f, 1.2f);
        this.n.setText(jb6.M0(2131744600, null));
        this.n.setGravity(17);
        this.n.setTypeface(gm.o());
        this.n.setTextSize(1, 15.0f);
        this.n.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
        this.s.addView(this.n, qoe.d(-1, 48.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: sr5
            public final /* synthetic */ vr5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                vr5 vr5Var = this.b;
                byte b4 = 1;
                switch (b3) {
                    case 0:
                        if (!vr5Var.E) {
                            vr5Var.E = true;
                            vr5Var.presentFragment(new mh6(), true);
                            vr5Var.N = true;
                            break;
                        }
                        break;
                    default:
                        if (!vr5Var.E && vr5Var.M != null) {
                            vr5Var.E = true;
                            he heVar = new he(3, null, view.getContext());
                            heVar.j0 = false;
                            heVar.q(1000L);
                            nm7.e().a(new ov0(vr5Var, heVar, b4), nm7.B4);
                            jb6.D0().d(vr5Var.M, true, false, vr5Var.c);
                            break;
                        }
                        break;
                }
            }
        });
        yx0 yx0Var = new yx0(context, this.d, 6);
        this.e = yx0Var;
        this.s.addView(yx0Var, qoe.d(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setGravity(17);
        this.f.setTextSize(1, 16.0f);
        this.s.addView(this.f, qoe.d(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        this.f.setOnClickListener(new View.OnClickListener(this) { // from class: sr5
            public final /* synthetic */ vr5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                vr5 vr5Var = this.b;
                byte b4 = 1;
                switch (b3) {
                    case 0:
                        if (!vr5Var.E) {
                            vr5Var.E = true;
                            vr5Var.presentFragment(new mh6(), true);
                            vr5Var.N = true;
                            break;
                        }
                        break;
                    default:
                        if (!vr5Var.E && vr5Var.M != null) {
                            vr5Var.E = true;
                            he heVar = new he(3, null, view.getContext());
                            heVar.j0 = false;
                            heVar.q(1000L);
                            nm7.e().a(new ov0(vr5Var, heVar, b4), nm7.B4);
                            jb6.D0().d(vr5Var.M, true, false, vr5Var.c);
                            break;
                        }
                        break;
                }
            }
        });
        this.s.addView(frameLayout, qoe.d(64, 64.0f, 53, 0.0f, 4.0f, 4.0f, 0.0f));
        this.fragmentView = scrollView;
        nm7.e().b(this, nm7.C4);
        int i = this.c;
        nm7.f(i).b(this, nm7.J2);
        ConnectionsManager.getInstance(i).updateDcSettings();
        jb6.D0().V0(i, true);
        Z();
        this.y = true;
        a0(false);
        return this.fragmentView;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.C4 || i == nm7.J2) {
            Z();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        return kwe.a(new t10(this, (byte) 8), cmb.c6, cmb.p6, cmb.O9, cmb.P9, cmb.Ii, cmb.F6);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        return on2.h(cmb.w0(null, cmb.c6, true)) > 0.699999988079071d;
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
        oc7.d1().edit().putLong("intro_crashed_time", System.currentTimeMillis()).apply();
        this.G = new CharSequence[]{null, jb6.M0(2131747479, null), jb6.M0(2131747477, null), jb6.M0(2131747473, null), jb6.M0(2131747475, null), jb6.M0(2131747471, null)};
        this.H = new String[]{jb6.M0(2131747482, null), jb6.M0(2131747480, null), jb6.M0(2131747478, null), jb6.M0(2131747474, null), jb6.M0(2131747476, null), jb6.M0(2131747472, null)};
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.N = true;
        gm.r(this.Q);
        nm7.e().n(this, nm7.C4);
        nm7.f(this.c).n(this, nm7.J2);
        oc7.d1().edit().putLong("intro_crashed_time", 0L).apply();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        gm.K3(getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        if (this.y) {
            boolean z = jb6.a0;
            ggc ggcVar = this.d;
            if (z) {
                ggcVar.setCurrentItem(6);
                this.x = 6;
            } else {
                ggcVar.setCurrentItem(0);
                this.x = 0;
            }
            this.y = false;
        }
        gm.e2(getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        o04 o04Var = this.Q;
        try {
            if (this.fragmentView != null) {
                int i = cmb.Ei;
                int themedColor = getThemedColor(i);
                int themedColor2 = getThemedColor(cmb.Fi);
                GradientDrawable gradientDrawable = this.h;
                if (gradientDrawable != null && (themedColor != this.R || themedColor2 != this.S)) {
                    this.R = themedColor;
                    this.S = themedColor2;
                    gradientDrawable.setColors(new int[]{themedColor, themedColor2});
                }
                int p1 = cmb.p1(0.9f, getThemedColor(cmb.z8));
                Drawable drawable = this.F;
                if (drawable != null && p1 != this.T) {
                    this.T = p1;
                    drawable.setColorFilter(p1, PorterDuff.Mode.MULTIPLY);
                }
                this.fragmentView.setBackgroundColor(cmb.w0(null, cmb.c6, false));
                TextView textView = this.f;
                if (textView != null) {
                    textView.setTextColor(cmb.w0(null, cmb.p6, false));
                }
                t8 t8Var = this.n;
                if (t8Var != null) {
                    t8Var.setTextColor(cmb.w0(null, cmb.Ii, false));
                    cmb.F1(this.n.getBackground(), cmb.w0(null, cmb.Gi, false), true);
                }
                int w0 = cmb.w0(null, i, false);
                p09 p09Var = this.w;
                if (p09Var != null && w0 != this.U) {
                    this.U = w0;
                    p09Var.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
                }
                yx0 yx0Var = this.e;
                if (yx0Var != null) {
                    yx0Var.invalidate();
                }
                if (this.d != null) {
                    for (int i2 = 0; i2 < this.d.getChildCount(); i2++) {
                        View childAt = this.d.getChildAt(i2);
                        TextView textView2 = (TextView) childAt.findViewWithTag(this.a);
                        if (textView2 != null) {
                            textView2.setTextColor(cmb.w0(null, cmb.F6, false));
                        }
                        TextView textView3 = (TextView) childAt.findViewWithTag(this.b);
                        if (textView3 != null) {
                            textView3.setTextColor(cmb.w0(null, cmb.F6, false));
                        }
                    }
                }
                if (this.J == null || this.P == cmb.w0(null, cmb.c6, false)) {
                    return;
                }
                gm.r(o04Var);
                gm.d3(o04Var, 100L);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
