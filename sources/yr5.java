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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class yr5 extends e implements fn7 {
    public boolean E;
    public Drawable F;
    public CharSequence[] G;
    public String[] H;
    public int I;
    public xr5 J;
    public long K;
    public boolean L;
    public mb6 M;
    public boolean N;
    public boolean O;
    public int P;
    public final zz3 Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final Object a;
    public final Object b;
    public final int c;
    public fic d;
    public zw0 e;
    public TextView f;
    public GradientDrawable h;
    public u8 n;
    public FrameLayout r;
    public tt s;
    public b29 w;
    public int x;
    public boolean y;

    public yr5() {
        super(null);
        this.a = new Object();
        this.b = new Object();
        this.c = yac.t0;
        this.x = 0;
        this.y = false;
        this.E = false;
        this.Q = new zz3(this, (byte) 14);
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
        mb6 mb6Var;
        int i2;
        mb6 mb6Var2;
        yr5 yr5Var;
        mb6 mb6Var3 = ob6.D0().B;
        int i3 = this.c;
        String str2 = uc7.s1(i3).s3;
        if ((str2 == null || (str2.equals("en") && ob6.D0().z.getLanguage() != null && !ob6.D0().z.getLanguage().equals("en"))) && (str2 = ob6.D0().z.getLanguage()) == null) {
            str2 = "en";
        }
        String str3 = str2.contains("-") ? str2.split("-")[0] : str2;
        if (str3 != null) {
            str = "fil";
            i = i3;
            mb6Var = mb6Var3;
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
            mb6Var2 = null;
            mb6 mb6Var4 = null;
            for (i2 = 0; i2 < ob6.D0().J.size(); i2++) {
                mb6 mb6Var5 = (mb6) ob6.D0().J.get(i2);
                if (mb6Var5.c.equals("en")) {
                    mb6Var2 = mb6Var5;
                }
                if (mb6Var5.c.replace("_", "-").equals(str2) || mb6Var5.c.equals(str3) || mb6Var5.c.equals(str)) {
                    mb6Var4 = mb6Var5;
                }
                if (mb6Var2 != null && mb6Var4 != null) {
                    mb6 mb6Var6 = mb6Var4;
                    if (mb6Var2 == null || mb6Var6 == null || mb6Var2 == mb6Var6) {
                        return;
                    }
                    TLRPC.TL_langpack_getStrings tL_langpack_getStrings = new TLRPC.TL_langpack_getStrings();
                    if (mb6Var6 != mb6Var) {
                        tL_langpack_getStrings.lang_code = mb6Var6.c();
                        yr5Var = this;
                        yr5Var.M = mb6Var6;
                    } else {
                        yr5Var = this;
                        tL_langpack_getStrings.lang_code = mb6Var2.c();
                        yr5Var.M = mb6Var2;
                    }
                    tL_langpack_getStrings.keys.add("ContinueOnThisLanguage");
                    ConnectionsManager.getInstance(i).sendRequest(tL_langpack_getStrings, new mw3(yr5Var, str2, (byte) 12), 8);
                    return;
                }
            }
            mb6 mb6Var62 = mb6Var4;
            if (mb6Var2 == null) {
                return;
            } else {
                return;
            }
        }
        mb6Var = mb6Var3;
        i = i3;
        str = null;
        mb6Var2 = null;
        mb6 mb6Var42 = null;
        while (i2 < ob6.D0().J.size()) {
        }
        mb6 mb6Var622 = mb6Var42;
        if (mb6Var2 == null) {
        }
    }

    public final void Z(boolean z) {
        GradientDrawable gradientDrawable = this.h;
        int i = aob.Fi;
        gradientDrawable.setColors(new int[]{getThemedColor(i), getThemedColor(aob.Gi)});
        this.F.setColorFilter(aob.p1(0.9f, getThemedColor(aob.A8)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i2 = aob.d6;
        view.setBackgroundColor(aob.w0(null, i2, false));
        this.f.setTextColor(aob.w0(null, aob.q6, false));
        this.n.setTextColor(aob.w0(null, aob.Ji, false));
        u8 u8Var = this.n;
        int L = hl.L(24.0f);
        int w0 = aob.w0(null, aob.Hi, false);
        u8Var.setBackground(aob.i0(L, L, L, L, 0, w0, w0));
        this.w.setColorFilter(new PorterDuffColorFilter(aob.w0(null, i, false), PorterDuff.Mode.SRC_IN));
        this.e.invalidate();
        this.P = aob.w0(null, i2, false);
        if (!z) {
            Intro.a(aob.w0(null, i2, false));
            return;
        }
        xr5 xr5Var = this.J;
        if (xr5Var != null) {
            xr5Var.postRunnable(new ea5(this, (byte) 14));
        }
        for (int i3 = 0; i3 < this.d.getChildCount(); i3++) {
            View childAt = this.d.getChildAt(i3);
            TextView textView = (TextView) childAt.findViewWithTag(this.a);
            int i4 = aob.G6;
            textView.setTextColor(aob.w0(null, i4, false));
            ((TextView) childAt.findViewWithTag(this.b)).setTextColor(aob.w0(null, i4, false));
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        Drawable e = c00.e(context, R.drawable.telegram_logo);
        this.F = e;
        final byte b = 0;
        e.setBounds(0, hl.L(8.666f), hl.L(115.0f), hl.L(35.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131747475, null));
        spannableStringBuilder.setSpan(new ImageSpan(this.F), 0, spannableStringBuilder.length(), 33);
        this.G[0] = spannableStringBuilder;
        this.actionBar.setAddToContainer(false);
        ScrollView scrollView = new ScrollView(context);
        final byte b2 = 1;
        scrollView.setFillViewport(true);
        e29 e29Var = new e29(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(e29Var, tre.e(28, 28, 17));
        tt ttVar = new tt(this, context, frameLayout, (byte) 20);
        this.s = ttVar;
        scrollView.addView(ttVar, tre.x(-1, -2, 51));
        b29 b29Var = new b29(R.raw.sun, hl.L(28.0f), hl.L(28.0f), true, null);
        this.w = b29Var;
        b29Var.h = true;
        b29Var.a0 = true;
        b29Var.j();
        this.w.K(aob.B0().o() ? this.w.e[0] - 1 : 0);
        this.w.I(aob.B0().o() ? this.w.e[0] - 1 : 0, false, false);
        e29Var.setContentDescription(ob6.M0(aob.B0().o() ? 2131754746 : 2131754745, null));
        e29Var.setAnimation(this.w);
        frameLayout.setOnClickListener(new je3(this, e29Var, (byte) 27));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        this.s.addView(frameLayout2, tre.d(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.r.addView(textureView, tre.e(jn7.d3, jn7.f2, 17));
        textureView.setSurfaceTextureListener(new wr5(this, b));
        fic ficVar = new fic(context);
        this.d = ficVar;
        ficVar.setAdapter(new gb5(this, b2));
        this.d.setPageMargin(0);
        this.d.setOffscreenPageLimit(1);
        this.s.addView(this.d, tre.c(-1.0f, -1));
        this.d.b(new mv(this, b2));
        this.h = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        u8 u8Var = new u8(this, context);
        this.n = u8Var;
        iye.b(u8Var, 0.02f, 1.2f);
        this.n.setText(ob6.M0(2131744568, null));
        this.n.setGravity(17);
        this.n.setTypeface(hl.o());
        this.n.setTextSize(1, 15.0f);
        this.n.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
        this.s.addView(this.n, tre.d(-1, 48.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: vr5
            public final /* synthetic */ yr5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                yr5 yr5Var = this.b;
                byte b4 = 1;
                switch (b3) {
                    case 0:
                        if (!yr5Var.E) {
                            yr5Var.E = true;
                            yr5Var.presentFragment(new qh6(), true);
                            yr5Var.N = true;
                            break;
                        }
                        break;
                    default:
                        if (!yr5Var.E && yr5Var.M != null) {
                            yr5Var.E = true;
                            id idVar = new id(3, null, view.getContext());
                            idVar.j0 = false;
                            idVar.q(1000L);
                            jn7.e().a(new ou0(yr5Var, idVar, b4), jn7.A4);
                            ob6.D0().d(yr5Var.M, true, false, yr5Var.c);
                            break;
                        }
                        break;
                }
            }
        });
        zw0 zw0Var = new zw0(context, this.d, 6);
        this.e = zw0Var;
        this.s.addView(zw0Var, tre.d(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setGravity(17);
        this.f.setTextSize(1, 16.0f);
        this.s.addView(this.f, tre.d(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        this.f.setOnClickListener(new View.OnClickListener(this) { // from class: vr5
            public final /* synthetic */ yr5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                yr5 yr5Var = this.b;
                byte b4 = 1;
                switch (b3) {
                    case 0:
                        if (!yr5Var.E) {
                            yr5Var.E = true;
                            yr5Var.presentFragment(new qh6(), true);
                            yr5Var.N = true;
                            break;
                        }
                        break;
                    default:
                        if (!yr5Var.E && yr5Var.M != null) {
                            yr5Var.E = true;
                            id idVar = new id(3, null, view.getContext());
                            idVar.j0 = false;
                            idVar.q(1000L);
                            jn7.e().a(new ou0(yr5Var, idVar, b4), jn7.A4);
                            ob6.D0().d(yr5Var.M, true, false, yr5Var.c);
                            break;
                        }
                        break;
                }
            }
        });
        this.s.addView(frameLayout, tre.d(64, 64.0f, 53, 0.0f, 4.0f, 4.0f, 0.0f));
        this.fragmentView = scrollView;
        jn7.e().b(this, jn7.B4);
        int i = this.c;
        jn7.f(i).b(this, jn7.J2);
        ConnectionsManager.getInstance(i).updateDcSettings();
        ob6.D0().V0(i, true);
        Y();
        this.y = true;
        Z(false);
        return this.fragmentView;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.B4 || i == jn7.J2) {
            Y();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        return zye.a(new u00(this, (byte) 8), aob.d6, aob.q6, aob.P9, aob.Q9, aob.Ji, aob.G6);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isLightStatusBar() {
        return vm2.h(aob.w0(null, aob.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final AnimatorSet onCustomTransitionAnimation(boolean z, Runnable runnable) {
        if (!this.O) {
            return null;
        }
        AnimatorSet duration = new AnimatorSet().setDuration(50L);
        duration.playTogether(ValueAnimator.ofFloat(new float[0]));
        return duration;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        uc7.e1().edit().putLong("intro_crashed_time", System.currentTimeMillis()).apply();
        this.G = new CharSequence[]{null, ob6.M0(2131747473, null), ob6.M0(2131747471, null), ob6.M0(2131747467, null), ob6.M0(2131747469, null), ob6.M0(2131747465, null)};
        this.H = new String[]{ob6.M0(2131747476, null), ob6.M0(2131747474, null), ob6.M0(2131747472, null), ob6.M0(2131747468, null), ob6.M0(2131747470, null), ob6.M0(2131747466, null)};
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.N = true;
        hl.r(this.Q);
        jn7.e().n(this, jn7.B4);
        jn7.f(this.c).n(this, jn7.J2);
        uc7.e1().edit().putLong("intro_crashed_time", 0L).apply();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onPause() {
        super.onPause();
        hl.K3(getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        if (this.y) {
            boolean z = ob6.a0;
            fic ficVar = this.d;
            if (z) {
                ficVar.setCurrentItem(6);
                this.x = 6;
            } else {
                ficVar.setCurrentItem(0);
                this.x = 0;
            }
            this.y = false;
        }
        hl.e2(getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        zz3 zz3Var = this.Q;
        try {
            if (this.fragmentView != null) {
                int i = aob.Fi;
                int themedColor = getThemedColor(i);
                int themedColor2 = getThemedColor(aob.Gi);
                GradientDrawable gradientDrawable = this.h;
                if (gradientDrawable != null && (themedColor != this.R || themedColor2 != this.S)) {
                    this.R = themedColor;
                    this.S = themedColor2;
                    gradientDrawable.setColors(new int[]{themedColor, themedColor2});
                }
                int p1 = aob.p1(0.9f, getThemedColor(aob.A8));
                Drawable drawable = this.F;
                if (drawable != null && p1 != this.T) {
                    this.T = p1;
                    drawable.setColorFilter(p1, PorterDuff.Mode.MULTIPLY);
                }
                this.fragmentView.setBackgroundColor(aob.w0(null, aob.d6, false));
                TextView textView = this.f;
                if (textView != null) {
                    textView.setTextColor(aob.w0(null, aob.q6, false));
                }
                u8 u8Var = this.n;
                if (u8Var != null) {
                    u8Var.setTextColor(aob.w0(null, aob.Ji, false));
                    aob.F1(this.n.getBackground(), aob.w0(null, aob.Hi, false), true);
                }
                int w0 = aob.w0(null, i, false);
                b29 b29Var = this.w;
                if (b29Var != null && w0 != this.U) {
                    this.U = w0;
                    b29Var.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
                }
                zw0 zw0Var = this.e;
                if (zw0Var != null) {
                    zw0Var.invalidate();
                }
                if (this.d != null) {
                    for (int i2 = 0; i2 < this.d.getChildCount(); i2++) {
                        View childAt = this.d.getChildAt(i2);
                        TextView textView2 = (TextView) childAt.findViewWithTag(this.a);
                        if (textView2 != null) {
                            textView2.setTextColor(aob.w0(null, aob.G6, false));
                        }
                        TextView textView3 = (TextView) childAt.findViewWithTag(this.b);
                        if (textView3 != null) {
                            textView3.setTextColor(aob.w0(null, aob.G6, false));
                        }
                    }
                }
                if (this.J == null || this.P == aob.w0(null, aob.d6, false)) {
                    return;
                }
                hl.r(zz3Var);
                hl.d3(zz3Var, 100L);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
