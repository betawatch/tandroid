package uf;

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
import fh.v;
import g7.n;
import java.util.ArrayList;
import java.util.List;
import o1.j;
import o1.k;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.lj0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public ArrayList A;
    public int B;
    public v a;
    public fq b;
    public j c;
    public j d;
    public SharedPreferences e;
    public boolean f;
    public boolean h;
    public boolean n;
    public c r;
    public boolean s;
    public int v;
    public LinearLayout w;
    public TextView x;
    public wk0 y;

    public static float a(DisplayMetrics displayMetrics, float f10) {
        return n.a(f10, AndroidUtilities.dp(16.0f), displayMetrics.widthPixels - AndroidUtilities.dp(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f10) {
        return n.a(f10, AndroidUtilities.dp(16.0f), displayMetrics.heightPixels - AndroidUtilities.dp(72.0f));
    }

    private List<a> getBuiltInDebugItems() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("Theme"));
        arrayList.add(new a("Draw action bar shadow", new lj0(14)));
        arrayList.add(new a("Show blur settings", new c(this, 0)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugGeneral)));
        arrayList.add(new a(LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuDisableWebViewDebug : R.string.DebugMenuEnableWebViewDebug), new c(this, 1)));
        arrayList.add(new a(f6.I.q() ? "Switch to day theme" : "Switch to dark theme", new lj0(15)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugSendLogs), new c(this, 2)));
        return arrayList;
    }

    public final void c(final boolean z10) {
        v vVar = this.a;
        ArrayList arrayList = this.A;
        if (this.s == z10) {
            return;
        }
        this.s = z10;
        if (z10) {
            this.w.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                b5 O = ((LaunchActivity) getContext()).O();
                if (O instanceof b) {
                    arrayList.addAll(((b) O).A());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).o0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.A());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).n0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.A());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.y.getAdapter().l();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z10) {
            this.v = window.getStatusBarColor();
        }
        final float translationX = vVar.getTranslationX();
        final float translationY = vVar.getTranslationY();
        j jVar = new j(new gb.a(z10 ? 0.0f : 1000.0f));
        k i9 = j2.i(1000.0f, 900.0f, 1.0f);
        i9.i = z10 ? 1000.0f : 0.0f;
        jVar.u = i9;
        jVar.b(new o1.g() { // from class: uf.d
            @Override // o1.g
            public final void a(o1.h hVar, float f10, float f11) {
                float f12 = f10 / 1000.0f;
                h hVar2 = h.this;
                LinearLayout linearLayout = hVar2.w;
                linearLayout.setAlpha(f12);
                float dp = AndroidUtilities.dp(8.0f);
                float f13 = translationX;
                linearLayout.setTranslationX(AndroidUtilities.lerp(f13 - dp, 0.0f, f12));
                float dp2 = AndroidUtilities.dp(8.0f);
                float f14 = translationY;
                linearLayout.setTranslationY(AndroidUtilities.lerp(f14 - dp2, 0.0f, f12));
                v vVar2 = hVar2.a;
                linearLayout.setPivotX(vVar2.getTranslationX() + AndroidUtilities.dp(28.0f));
                linearLayout.setPivotY(vVar2.getTranslationY() + AndroidUtilities.dp(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(AndroidUtilities.lerp(vVar2.getWidth() / linearLayout.getWidth(), 1.0f, f12));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(AndroidUtilities.lerp(vVar2.getHeight() / linearLayout.getHeight(), 1.0f, f12));
                }
                vVar2.setTranslationX(AndroidUtilities.lerp(f13, (hVar2.getWidth() / 2.0f) - AndroidUtilities.dp(28.0f), f12));
                vVar2.setTranslationY(AndroidUtilities.lerp(f14, (hVar2.getHeight() / 2.0f) - AndroidUtilities.dp(28.0f), f12));
                vVar2.setAlpha(1.0f - f12);
                window.setStatusBarColor(i0.a.d(f12, hVar2.v, 2046820352));
                hVar2.invalidate();
            }
        });
        jVar.a(new o1.f() { // from class: uf.e
            @Override // o1.f
            public final void a(o1.h hVar, boolean z11, float f10, float f11) {
                h hVar2 = h.this;
                v vVar2 = hVar2.a;
                vVar2.setTranslationX(translationX);
                vVar2.setTranslationY(translationY);
                if (z10) {
                    return;
                }
                hVar2.w.setVisibility(8);
            }
        });
        jVar.f();
    }

    public final void d() {
        z h02 = f6.h0(AndroidUtilities.dp(56.0f), f6.w0(null, f6.P9, false), f6.w0(null, f6.Q9, false));
        Drawable mutate = getResources().getDrawable(R.drawable.floating_shadow).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        fq fqVar = new fq(mutate, h02, 0, 0);
        int dp = AndroidUtilities.dp(56.0f);
        int dp2 = AndroidUtilities.dp(56.0f);
        fqVar.e = dp;
        fqVar.f = dp2;
        this.b = fqVar;
        Drawable drawable = getResources().getDrawable(R.drawable.popup_fixed_alert3);
        drawable.setColorFilter(new PorterDuffColorFilter(f6.w0(null, f6.h5, false), mode));
        this.w.setBackground(drawable);
        this.x.setTextColor(f6.w0(null, f6.j5, false));
        invalidate();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.didSetNewTheme) {
            d();
            this.y.getAdapter().l();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        LinearLayout linearLayout = this.w;
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
        v vVar = this.a;
        vVar.setTranslationX((f10 == -1.0f || f10 >= ((float) displayMetrics.widthPixels) / 2.0f) ? a(displayMetrics, 2.14748365E9f) : a(displayMetrics, -2.14748365E9f));
        vVar.setTranslationY(f11 == -1.0f ? b(displayMetrics, 2.14748365E9f) : b(displayMetrics, f11));
        j jVar = new j(vVar, o1.h.m, vVar.getTranslationX());
        k kVar = new k(vVar.getTranslationX());
        kVar.b(650.0f);
        kVar.a(0.75f);
        jVar.u = kVar;
        this.c = jVar;
        j jVar2 = new j(vVar, o1.h.n, vVar.getTranslationY());
        k kVar2 = new k(vVar.getTranslationY());
        kVar2.b(650.0f);
        kVar2.a(0.75f);
        jVar2.u = kVar2;
        this.d = jVar2;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.c.c();
        this.d.c();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        v vVar = this.a;
        vVar.setTranslationX(a(displayMetrics, vVar.getTranslationX() >= ((float) displayMetrics.widthPixels) / 2.0f ? 2.14748365E9f : -2.14748365E9f));
        vVar.setTranslationY(b(displayMetrics, vVar.getTranslationY()));
        this.c.u.i = vVar.getTranslationX();
        this.d.u.i = vVar.getTranslationY();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.c();
        this.d.c();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        v vVar = this.a;
        canvas.translate(vVar.getTranslationX(), vVar.getTranslationY());
        canvas.scale(vVar.getScaleX(), vVar.getScaleY(), vVar.getPivotX(), vVar.getPivotY());
        this.b.setAlpha((int) (vVar.getAlpha() * 255.0f));
        this.b.setBounds(vVar.getLeft(), vVar.getTop(), vVar.getRight(), vVar.getBottom());
        this.b.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.s;
    }
}
