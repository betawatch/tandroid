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
import c8.l9;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.fs;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.s4;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.c0;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.mq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cd0;
import org.telegram.ui.y61;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class i extends FrameLayout implements fs {
    public ck0 E;
    public ArrayList F;
    public int G;
    public y61 a;
    public mq b;
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
        return l9.a(f10, g0.L(16.0f), displayMetrics.widthPixels - g0.L(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f10) {
        return l9.a(f10, g0.L(16.0f), displayMetrics.heightPixels - g0.L(72.0f));
    }

    private List<a> getBuiltInDebugItems() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("Theme"));
        arrayList.add(new a("Draw action bar shadow", new cd0(20)));
        arrayList.add(new a("Show blur settings", new d(this, 0)));
        arrayList.add(new a(gd.M0(2131751636, null)));
        arrayList.add(new a(gd.M0(bz.J0 ? 2131751627 : 2131751619, null), new d(this, 1)));
        arrayList.add(new a(n6.I.q() ? "Switch to day theme" : "Switch to dark theme", new cd0(21)));
        arrayList.add(new a(gd.M0(2131751602, null), new d(this, 2)));
        return arrayList;
    }

    public final void c(final boolean z10) {
        y61 y61Var = this.a;
        ArrayList arrayList = this.F;
        if (this.s == z10) {
            return;
        }
        this.s = z10;
        if (z10) {
            this.x.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                s4 M = ((LaunchActivity) getContext()).M();
                if (M instanceof b) {
                    arrayList.addAll(((b) M).F());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).r0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.F());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).q0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.F());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.E.getAdapter().f();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z10) {
            this.w = window.getStatusBarColor();
        }
        final float translationX = y61Var.getTranslationX();
        final float translationY = y61Var.getTranslationY();
        r1.g gVar = new r1.g(new r1.f(z10 ? 0.0f : 1000.0f));
        r1.h p10 = c0.p(1000.0f, 900.0f, 1.0f);
        p10.i = z10 ? 1000.0f : 0.0f;
        gVar.m = p10;
        gVar.b(new r1.d() { // from class: pg.e
            @Override // r1.d
            public final void a(r1.g gVar2, float f10, float f11) {
                float f12 = f10 / 1000.0f;
                i iVar = i.this;
                LinearLayout linearLayout = iVar.x;
                linearLayout.setAlpha(f12);
                float L = g0.L(8.0f);
                float f13 = translationX;
                linearLayout.setTranslationX(g0.T1(f13 - L, 0.0f, f12));
                float L2 = g0.L(8.0f);
                float f14 = translationY;
                linearLayout.setTranslationY(g0.T1(f14 - L2, 0.0f, f12));
                y61 y61Var2 = iVar.a;
                linearLayout.setPivotX(y61Var2.getTranslationX() + g0.L(28.0f));
                linearLayout.setPivotY(y61Var2.getTranslationY() + g0.L(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(g0.T1(y61Var2.getWidth() / linearLayout.getWidth(), 1.0f, f12));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(g0.T1(y61Var2.getHeight() / linearLayout.getHeight(), 1.0f, f12));
                }
                y61Var2.setTranslationX(g0.T1(f13, (iVar.getWidth() / 2.0f) - g0.L(28.0f), f12));
                y61Var2.setTranslationY(g0.T1(f14, (iVar.getHeight() / 2.0f) - g0.L(28.0f), f12));
                y61Var2.setAlpha(1.0f - f12);
                window.setStatusBarColor(i0.a.f(f12, iVar.w, 2046820352));
                iVar.invalidate();
            }
        });
        gVar.a(new r1.c() { // from class: pg.f
            @Override // r1.c
            public final void a(r1.g gVar2, boolean z11, float f10, float f11) {
                i iVar = i.this;
                y61 y61Var2 = iVar.a;
                y61Var2.setTranslationX(translationX);
                y61Var2.setTranslationY(translationY);
                if (z10) {
                    return;
                }
                iVar.x.setVisibility(8);
            }
        });
        gVar.h();
    }

    public final void d() {
        y j02 = n6.j0(g0.L(56.0f), n6.x0(null, n6.P9, false), n6.x0(null, n6.Q9, false));
        Drawable mutate = getResources().getDrawable(R.drawable.floating_shadow).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        mq mqVar = new mq(mutate, j02, 0, 0);
        int L = g0.L(56.0f);
        int L2 = g0.L(56.0f);
        mqVar.e = L;
        mqVar.f = L2;
        this.b = mqVar;
        Drawable drawable = getResources().getDrawable(R.drawable.popup_fixed_alert3);
        u6.x(this, drawable, n6.h5, null, mode);
        this.x.setBackground(drawable);
        u6.U(this.y, n6.j5, null);
        invalidate();
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.p4) {
            d();
            this.E.getAdapter().f();
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
        y61 y61Var = this.a;
        y61Var.setTranslationX((f10 == -1.0f || f10 >= ((float) displayMetrics.widthPixels) / 2.0f) ? a(displayMetrics, 2.1474836E9f) : a(displayMetrics, -2.1474836E9f));
        y61Var.setTranslationY(f11 == -1.0f ? b(displayMetrics, 2.1474836E9f) : b(displayMetrics, f11));
        r1.g gVar = new r1.g(y61Var, r1.g.o, y61Var.getTranslationX());
        r1.h hVar = new r1.h(y61Var.getTranslationX());
        hVar.b(650.0f);
        hVar.a(0.75f);
        gVar.m = hVar;
        this.c = gVar;
        r1.g gVar2 = new r1.g(y61Var, r1.g.p, y61Var.getTranslationY());
        r1.h hVar2 = new r1.h(y61Var.getTranslationY());
        hVar2.b(650.0f);
        hVar2.a(0.75f);
        gVar2.m = hVar2;
        this.d = gVar2;
        ks.e().c(this, ks.p4);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.c.d();
        this.d.d();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        y61 y61Var = this.a;
        y61Var.setTranslationX(a(displayMetrics, y61Var.getTranslationX() >= ((float) displayMetrics.widthPixels) / 2.0f ? 2.1474836E9f : -2.1474836E9f));
        y61Var.setTranslationY(b(displayMetrics, y61Var.getTranslationY()));
        this.c.m.i = y61Var.getTranslationX();
        this.d.m.i = y61Var.getTranslationY();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.d();
        this.d.d();
        ks.e().n(this, ks.p4);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        y61 y61Var = this.a;
        canvas.translate(y61Var.getTranslationX(), y61Var.getTranslationY());
        canvas.scale(y61Var.getScaleX(), y61Var.getScaleY(), y61Var.getPivotX(), y61Var.getPivotY());
        this.b.setAlpha((int) (y61Var.getAlpha() * 255.0f));
        this.b.setBounds(y61Var.getLeft(), y61Var.getTop(), y61Var.getRight(), y61Var.getBottom());
        this.b.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.s;
    }
}
