package pg;

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
import c8.j9;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.o61;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class j extends FrameLayout implements ls {
    public pj0 D;
    public ArrayList E;
    public int F;
    public h a;
    public xp b;
    public r1.g c;
    public r1.g d;
    public SharedPreferences e;
    public boolean f;
    public boolean h;
    public boolean n;
    public d r;
    public boolean s;
    public int w;
    public LinearLayout x;
    public TextView y;

    public static float a(DisplayMetrics displayMetrics, float f10) {
        return j9.a(f10, g0.L(16.0f), displayMetrics.widthPixels - g0.L(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f10) {
        return j9.a(f10, g0.L(16.0f), displayMetrics.heightPixels - g0.L(72.0f));
    }

    private List<a> getBuiltInDebugItems() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("Theme"));
        arrayList.add(new a("Draw action bar shadow", new o61(13)));
        arrayList.add(new a("Show blur settings", new d(this, 0)));
        arrayList.add(new a(id.M0(2131751648, null)));
        arrayList.add(new a(id.M0(iz.J0 ? 2131751639 : 2131751631, null), new d(this, 1)));
        arrayList.add(new a(k6.I.q() ? "Switch to day theme" : "Switch to dark theme", new o61(14)));
        arrayList.add(new a(id.M0(2131751614, null), new d(this, 2)));
        return arrayList;
    }

    public final void c(final boolean z9) {
        h hVar = this.a;
        ArrayList arrayList = this.E;
        if (this.s == z9) {
            return;
        }
        this.s = z9;
        if (z9) {
            this.x.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                q4 M = ((LaunchActivity) getContext()).M();
                if (M instanceof b) {
                    arrayList.addAll(((b) M).E());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).q0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.E());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).p0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.E());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.D.getAdapter().f();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z9) {
            this.w = window.getStatusBarColor();
        }
        final float translationX = hVar.getTranslationX();
        final float translationY = hVar.getTranslationY();
        r1.g gVar = new r1.g(new r1.f(z9 ? 0.0f : 1000.0f));
        r1.h o4 = f1.o(1000.0f, 900.0f, 1.0f);
        o4.i = z9 ? 1000.0f : 0.0f;
        gVar.m = o4;
        gVar.b(new r1.d() { // from class: pg.e
            @Override // r1.d
            public final void a(r1.g gVar2, float f10, float f11) {
                float f12 = f10 / 1000.0f;
                j jVar = j.this;
                LinearLayout linearLayout = jVar.x;
                linearLayout.setAlpha(f12);
                float L = g0.L(8.0f);
                float f13 = translationX;
                linearLayout.setTranslationX(g0.T1(f13 - L, 0.0f, f12));
                float L2 = g0.L(8.0f);
                float f14 = translationY;
                linearLayout.setTranslationY(g0.T1(f14 - L2, 0.0f, f12));
                h hVar2 = jVar.a;
                linearLayout.setPivotX(hVar2.getTranslationX() + g0.L(28.0f));
                linearLayout.setPivotY(hVar2.getTranslationY() + g0.L(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(g0.T1(hVar2.getWidth() / linearLayout.getWidth(), 1.0f, f12));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(g0.T1(hVar2.getHeight() / linearLayout.getHeight(), 1.0f, f12));
                }
                hVar2.setTranslationX(g0.T1(f13, (jVar.getWidth() / 2.0f) - g0.L(28.0f), f12));
                hVar2.setTranslationY(g0.T1(f14, (jVar.getHeight() / 2.0f) - g0.L(28.0f), f12));
                hVar2.setAlpha(1.0f - f12);
                window.setStatusBarColor(i0.a.f(f12, jVar.w, 2046820352));
                jVar.invalidate();
            }
        });
        gVar.a(new r1.c() { // from class: pg.f
            @Override // r1.c
            public final void a(r1.g gVar2, boolean z10, float f10, float f11) {
                j jVar = j.this;
                h hVar2 = jVar.a;
                hVar2.setTranslationX(translationX);
                hVar2.setTranslationY(translationY);
                if (z9) {
                    return;
                }
                jVar.x.setVisibility(8);
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

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.n4) {
            d();
            this.D.getAdapter().f();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        LinearLayout linearLayout = this.x;
        if (view == linearLayout) {
            canvas.drawColor(Color.argb((int) (linearLayout.getAlpha() * 122.0f), 0, 0, 0));
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SharedPreferences sharedPreferences = this.e;
        float f10 = sharedPreferences.getFloat("x", -1.0f);
        float f11 = sharedPreferences.getFloat("y", -1.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        h hVar = this.a;
        hVar.setTranslationX((f10 == -1.0f || f10 >= ((float) displayMetrics.widthPixels) / 2.0f) ? a(displayMetrics, 2.14748365E9f) : a(displayMetrics, -2.14748365E9f));
        hVar.setTranslationY(f11 == -1.0f ? b(displayMetrics, 2.14748365E9f) : b(displayMetrics, f11));
        r1.g gVar = new r1.g(hVar, r1.g.o, hVar.getTranslationX());
        r1.h hVar2 = new r1.h(hVar.getTranslationX());
        hVar2.b(650.0f);
        hVar2.a(0.75f);
        gVar.m = hVar2;
        this.c = gVar;
        r1.g gVar2 = new r1.g(hVar, r1.g.p, hVar.getTranslationY());
        r1.h hVar3 = new r1.h(hVar.getTranslationY());
        hVar3.b(650.0f);
        hVar3.a(0.75f);
        gVar2.m = hVar3;
        this.d = gVar2;
        qs.e().c(this, qs.n4);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.c.d();
        this.d.d();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        h hVar = this.a;
        hVar.setTranslationX(a(displayMetrics, hVar.getTranslationX() >= ((float) displayMetrics.widthPixels) / 2.0f ? 2.14748365E9f : -2.14748365E9f));
        hVar.setTranslationY(b(displayMetrics, hVar.getTranslationY()));
        this.c.m.i = hVar.getTranslationX();
        this.d.m.i = hVar.getTranslationY();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.d();
        this.d.d();
        qs.e().n(this, qs.n4);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        h hVar = this.a;
        canvas.translate(hVar.getTranslationX(), hVar.getTranslationY());
        canvas.scale(hVar.getScaleX(), hVar.getScaleY(), hVar.getPivotX(), hVar.getPivotY());
        this.b.setAlpha((int) (hVar.getAlpha() * 255.0f));
        this.b.setBounds(hVar.getLeft(), hVar.getTop(), hVar.getRight(), hVar.getBottom());
        this.b.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.s;
    }
}
