package qg;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.be;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hb1;
import org.telegram.ui.n61;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h extends FrameLayout implements cs {
    public tj0 E;
    public ArrayList F;
    public int G;
    public n61 a;
    public xp b;
    public q1.g c;
    public q1.g d;
    public SharedPreferences e;
    public boolean f;
    public boolean h;
    public boolean n;
    public c r;
    public boolean s;
    public int w;
    public LinearLayout x;
    public TextView y;

    public static float a(DisplayMetrics displayMetrics, float f10) {
        return be.a(f10, g0.L(16.0f), displayMetrics.widthPixels - g0.L(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f10) {
        return be.a(f10, g0.L(16.0f), displayMetrics.heightPixels - g0.L(72.0f));
    }

    private List<a> getBuiltInDebugItems() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("Theme"));
        arrayList.add(new a("Draw action bar shadow", new hb1(11)));
        arrayList.add(new a("Show blur settings", new c(this, 0)));
        arrayList.add(new a(bd.M0(2131751648, null)));
        arrayList.add(new a(bd.M0(az.J0 ? 2131751639 : 2131751631, null), new c(this, 1)));
        arrayList.add(new a(k6.I.q() ? "Switch to day theme" : "Switch to dark theme", new hb1(12)));
        arrayList.add(new a(bd.M0(2131751614, null), new c(this, 2)));
        return arrayList;
    }

    public final void c(final boolean z10) {
        n61 n61Var = this.a;
        ArrayList arrayList = this.F;
        if (this.s == z10) {
            return;
        }
        this.s = z10;
        if (z10) {
            this.x.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                q4 M = ((LaunchActivity) getContext()).M();
                if (M instanceof b) {
                    arrayList.addAll(((b) M).E());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).t0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.E());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).s0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.E());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.E.getAdapter().f();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z10) {
            this.w = window.getStatusBarColor();
        }
        final float translationX = n61Var.getTranslationX();
        final float translationY = n61Var.getTranslationY();
        q1.g gVar = new q1.g(new q1.f(z10 ? 0.0f : 1000.0f));
        q1.h s6 = f1.s(1000.0f, 900.0f, 1.0f);
        s6.i = z10 ? 1000.0f : 0.0f;
        gVar.m = s6;
        gVar.b(new q1.d() { // from class: qg.d
            @Override // q1.d
            public final void a(q1.g gVar2, float f10, float f11) {
                float f12 = f10 / 1000.0f;
                h hVar = h.this;
                LinearLayout linearLayout = hVar.x;
                linearLayout.setAlpha(f12);
                float L = g0.L(8.0f);
                float f13 = translationX;
                linearLayout.setTranslationX(g0.T1(f13 - L, 0.0f, f12));
                float L2 = g0.L(8.0f);
                float f14 = translationY;
                linearLayout.setTranslationY(g0.T1(f14 - L2, 0.0f, f12));
                n61 n61Var2 = hVar.a;
                linearLayout.setPivotX(n61Var2.getTranslationX() + g0.L(28.0f));
                linearLayout.setPivotY(n61Var2.getTranslationY() + g0.L(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(g0.T1(n61Var2.getWidth() / linearLayout.getWidth(), 1.0f, f12));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(g0.T1(n61Var2.getHeight() / linearLayout.getHeight(), 1.0f, f12));
                }
                n61Var2.setTranslationX(g0.T1(f13, (hVar.getWidth() / 2.0f) - g0.L(28.0f), f12));
                n61Var2.setTranslationY(g0.T1(f14, (hVar.getHeight() / 2.0f) - g0.L(28.0f), f12));
                n61Var2.setAlpha(1.0f - f12);
                window.setStatusBarColor(i0.a.f(f12, hVar.w, 2046820352));
                hVar.invalidate();
            }
        });
        gVar.a(new q1.c() { // from class: qg.e
            @Override // q1.c
            public final void a(q1.g gVar2, boolean z11, float f10, float f11) {
                h hVar = h.this;
                n61 n61Var2 = hVar.a;
                n61Var2.setTranslationX(translationX);
                n61Var2.setTranslationY(translationY);
                if (z10) {
                    return;
                }
                hVar.x.setVisibility(8);
            }
        });
        gVar.h();
    }

    public final void d() {
        y j02 = k6.j0(g0.L(56.0f), k6.x0(null, k6.P9, false), k6.x0(null, k6.Q9, false));
        Drawable mutate = getResources().getDrawable(R.drawable.floating_shadow).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        xp xpVar = new xp(mutate, j02, 0, 0);
        int L = g0.L(56.0f);
        int L2 = g0.L(56.0f);
        xpVar.e = L;
        xpVar.f = L2;
        this.b = xpVar;
        Drawable drawable = getResources().getDrawable(R.drawable.popup_fixed_alert3);
        r6.y(this, drawable, k6.h5, null, mode);
        this.x.setBackground(drawable);
        r6.V(this.y, k6.j5, null);
        invalidate();
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.n4) {
            d();
            this.E.getAdapter().f();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        LinearLayout linearLayout = this.x;
        if (view == linearLayout) {
            canvas.drawColor(Color.argb((int) (linearLayout.getAlpha() * 122.0f), 0, 0, 0));
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SharedPreferences sharedPreferences = this.e;
        float f10 = sharedPreferences.getFloat("x", -1.0f);
        float f11 = sharedPreferences.getFloat("y", -1.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        n61 n61Var = this.a;
        n61Var.setTranslationX((f10 == -1.0f || f10 >= ((float) displayMetrics.widthPixels) / 2.0f) ? a(displayMetrics, 2.14748365E9f) : a(displayMetrics, -2.14748365E9f));
        n61Var.setTranslationY(f11 == -1.0f ? b(displayMetrics, 2.14748365E9f) : b(displayMetrics, f11));
        q1.g gVar = new q1.g(n61Var, q1.g.o, n61Var.getTranslationX());
        q1.h hVar = new q1.h(n61Var.getTranslationX());
        hVar.b(650.0f);
        hVar.a(0.75f);
        gVar.m = hVar;
        this.c = gVar;
        q1.g gVar2 = new q1.g(n61Var, q1.g.p, n61Var.getTranslationY());
        q1.h hVar2 = new q1.h(n61Var.getTranslationY());
        hVar2.b(650.0f);
        hVar2.a(0.75f);
        gVar2.m = hVar2;
        this.d = gVar2;
        hs.e().c(this, hs.n4);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.c.d();
        this.d.d();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        n61 n61Var = this.a;
        n61Var.setTranslationX(a(displayMetrics, n61Var.getTranslationX() >= ((float) displayMetrics.widthPixels) / 2.0f ? 2.14748365E9f : -2.14748365E9f));
        n61Var.setTranslationY(b(displayMetrics, n61Var.getTranslationY()));
        this.c.m.i = n61Var.getTranslationX();
        this.d.m.i = n61Var.getTranslationY();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.d();
        this.d.d();
        hs.e().n(this, hs.n4);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        n61 n61Var = this.a;
        canvas.translate(n61Var.getTranslationX(), n61Var.getTranslationY());
        canvas.scale(n61Var.getScaleX(), n61Var.getScaleY(), n61Var.getPivotX(), n61Var.getPivotY());
        this.b.setAlpha((int) (n61Var.getAlpha() * 255.0f));
        this.b.setBounds(n61Var.getLeft(), n61Var.getTop(), n61Var.getRight(), n61Var.getBottom());
        this.b.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.s;
    }
}
