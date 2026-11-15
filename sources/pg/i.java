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
import c8.i9;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.o4;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Cells.y0;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ah0;
import org.telegram.ui.w61;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class i extends FrameLayout implements is {
    public uj0 E;
    public ArrayList F;
    public int G;
    public w61 a;
    public fq b;
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
        return i9.a(f10, g0.L(16.0f), displayMetrics.widthPixels - g0.L(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f10) {
        return i9.a(f10, g0.L(16.0f), displayMetrics.heightPixels - g0.L(72.0f));
    }

    private List<a> getBuiltInDebugItems() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("Theme"));
        arrayList.add(new a("Draw action bar shadow", new ah0(17)));
        arrayList.add(new a("Show blur settings", new d(this, 0)));
        arrayList.add(new a(hd.M0(2131751647, null)));
        arrayList.add(new a(hd.M0(gz.J0 ? 2131751638 : 2131751630, null), new d(this, 1)));
        arrayList.add(new a(j6.I.q() ? "Switch to day theme" : "Switch to dark theme", new ah0(18)));
        arrayList.add(new a(hd.M0(2131751613, null), new d(this, 2)));
        return arrayList;
    }

    public final void c(final boolean z10) {
        w61 w61Var = this.a;
        ArrayList arrayList = this.F;
        if (this.s == z10) {
            return;
        }
        this.s = z10;
        if (z10) {
            this.x.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                o4 M = ((LaunchActivity) getContext()).M();
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
        final float translationX = w61Var.getTranslationX();
        final float translationY = w61Var.getTranslationY();
        r1.g gVar = new r1.g(new r1.f(z10 ? 0.0f : 1000.0f));
        r1.h n10 = y0.n(1000.0f, 900.0f, 1.0f);
        n10.i = z10 ? 1000.0f : 0.0f;
        gVar.m = n10;
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
                w61 w61Var2 = iVar.a;
                linearLayout.setPivotX(w61Var2.getTranslationX() + g0.L(28.0f));
                linearLayout.setPivotY(w61Var2.getTranslationY() + g0.L(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(g0.T1(w61Var2.getWidth() / linearLayout.getWidth(), 1.0f, f12));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(g0.T1(w61Var2.getHeight() / linearLayout.getHeight(), 1.0f, f12));
                }
                w61Var2.setTranslationX(g0.T1(f13, (iVar.getWidth() / 2.0f) - g0.L(28.0f), f12));
                w61Var2.setTranslationY(g0.T1(f14, (iVar.getHeight() / 2.0f) - g0.L(28.0f), f12));
                w61Var2.setAlpha(1.0f - f12);
                window.setStatusBarColor(i0.a.f(f12, iVar.w, 2046820352));
                iVar.invalidate();
            }
        });
        gVar.a(new r1.c() { // from class: pg.f
            @Override // r1.c
            public final void a(r1.g gVar2, boolean z11, float f10, float f11) {
                i iVar = i.this;
                w61 w61Var2 = iVar.a;
                w61Var2.setTranslationX(translationX);
                w61Var2.setTranslationY(translationY);
                if (z10) {
                    return;
                }
                iVar.x.setVisibility(8);
            }
        });
        gVar.h();
    }

    public final void d() {
        y j02 = j6.j0(g0.L(56.0f), j6.x0(null, j6.P9, false), j6.x0(null, j6.Q9, false));
        Drawable mutate = getResources().getDrawable(R.drawable.floating_shadow).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        fq fqVar = new fq(mutate, j02, 0, 0);
        int L = g0.L(56.0f);
        int L2 = g0.L(56.0f);
        fqVar.e = L;
        fqVar.f = L2;
        this.b = fqVar;
        Drawable drawable = getResources().getDrawable(R.drawable.popup_fixed_alert3);
        q6.x(this, drawable, j6.h5, null, mode);
        this.x.setBackground(drawable);
        q6.U(this.y, j6.j5, null);
        invalidate();
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.n4) {
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
        w61 w61Var = this.a;
        w61Var.setTranslationX((f10 == -1.0f || f10 >= ((float) displayMetrics.widthPixels) / 2.0f) ? a(displayMetrics, 2.14748365E9f) : a(displayMetrics, -2.14748365E9f));
        w61Var.setTranslationY(f11 == -1.0f ? b(displayMetrics, 2.14748365E9f) : b(displayMetrics, f11));
        r1.g gVar = new r1.g(w61Var, r1.g.o, w61Var.getTranslationX());
        r1.h hVar = new r1.h(w61Var.getTranslationX());
        hVar.b(650.0f);
        hVar.a(0.75f);
        gVar.m = hVar;
        this.c = gVar;
        r1.g gVar2 = new r1.g(w61Var, r1.g.p, w61Var.getTranslationY());
        r1.h hVar2 = new r1.h(w61Var.getTranslationY());
        hVar2.b(650.0f);
        hVar2.a(0.75f);
        gVar2.m = hVar2;
        this.d = gVar2;
        ns.e().c(this, ns.n4);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.c.d();
        this.d.d();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        w61 w61Var = this.a;
        w61Var.setTranslationX(a(displayMetrics, w61Var.getTranslationX() >= ((float) displayMetrics.widthPixels) / 2.0f ? 2.14748365E9f : -2.14748365E9f));
        w61Var.setTranslationY(b(displayMetrics, w61Var.getTranslationY()));
        this.c.m.i = w61Var.getTranslationX();
        this.d.m.i = w61Var.getTranslationY();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.d();
        this.d.d();
        ns.e().n(this, ns.n4);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        w61 w61Var = this.a;
        canvas.translate(w61Var.getTranslationX(), w61Var.getTranslationY());
        canvas.scale(w61Var.getScaleX(), w61Var.getScaleY(), w61Var.getPivotX(), w61Var.getPivotY());
        this.b.setAlpha((int) (w61Var.getAlpha() * 255.0f));
        this.b.setBounds(w61Var.getLeft(), w61Var.getTop(), w61Var.getRight(), w61Var.getBottom());
        this.b.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.s;
    }
}
