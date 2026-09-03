package zf;

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
import java.util.ArrayList;
import java.util.List;
import k7.n;
import o1.j;
import o1.k;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ai;
import org.telegram.ui.j21;
import ph.z4;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class h extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public ArrayList B;
    public int C;
    public z4 a;
    public mq b;
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
    public rl0 y;

    public static float a(DisplayMetrics displayMetrics, float f10) {
        return n.a(f10, AndroidUtilities.dp(16.0f), displayMetrics.widthPixels - AndroidUtilities.dp(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f10) {
        return n.a(f10, AndroidUtilities.dp(16.0f), displayMetrics.heightPixels - AndroidUtilities.dp(72.0f));
    }

    private List<a> getBuiltInDebugItems() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("Theme"));
        arrayList.add(new a("Draw action bar shadow", new j21(19)));
        arrayList.add(new a("Show blur settings", new c(this, 0)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugGeneral)));
        arrayList.add(new a(LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuDisableWebViewDebug : R.string.DebugMenuEnableWebViewDebug), new c(this, 1)));
        arrayList.add(new a(j6.I.q() ? "Switch to day theme" : "Switch to dark theme", new j21(20)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugSendLogs), new c(this, 2)));
        return arrayList;
    }

    public final void c(final boolean z4) {
        z4 z4Var = this.a;
        ArrayList arrayList = this.B;
        if (this.s == z4) {
            return;
        }
        this.s = z4;
        if (z4) {
            this.w.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                e5 O = ((LaunchActivity) getContext()).O();
                if (O instanceof b) {
                    arrayList.addAll(((b) O).B());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).p0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.B());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).o0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.B());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.y.getAdapter().l();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z4) {
            this.v = window.getStatusBarColor();
        }
        final float translationX = z4Var.getTranslationX();
        final float translationY = z4Var.getTranslationY();
        j jVar = new j(new kb.a(z4 ? 0.0f : 1000.0f));
        k m9 = ai.m(1000.0f, 900.0f, 1.0f);
        m9.i = z4 ? 1000.0f : 0.0f;
        jVar.u = m9;
        jVar.b(new o1.g() { // from class: zf.d
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
                z4 z4Var2 = hVar2.a;
                linearLayout.setPivotX(z4Var2.getTranslationX() + AndroidUtilities.dp(28.0f));
                linearLayout.setPivotY(z4Var2.getTranslationY() + AndroidUtilities.dp(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(AndroidUtilities.lerp(z4Var2.getWidth() / linearLayout.getWidth(), 1.0f, f12));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(AndroidUtilities.lerp(z4Var2.getHeight() / linearLayout.getHeight(), 1.0f, f12));
                }
                z4Var2.setTranslationX(AndroidUtilities.lerp(f13, (hVar2.getWidth() / 2.0f) - AndroidUtilities.dp(28.0f), f12));
                z4Var2.setTranslationY(AndroidUtilities.lerp(f14, (hVar2.getHeight() / 2.0f) - AndroidUtilities.dp(28.0f), f12));
                z4Var2.setAlpha(1.0f - f12);
                window.setStatusBarColor(i0.a.d(f12, hVar2.v, 2046820352));
                hVar2.invalidate();
            }
        });
        jVar.a(new o1.f() { // from class: zf.e
            @Override // o1.f
            public final void a(o1.h hVar, boolean z10, float f10, float f11) {
                h hVar2 = h.this;
                z4 z4Var2 = hVar2.a;
                z4Var2.setTranslationX(translationX);
                z4Var2.setTranslationY(translationY);
                if (z4) {
                    return;
                }
                hVar2.w.setVisibility(8);
            }
        });
        jVar.f();
    }

    public final void d() {
        z h02 = j6.h0(AndroidUtilities.dp(56.0f), j6.w0(null, j6.P9, false), j6.w0(null, j6.Q9, false));
        Drawable mutate = getResources().getDrawable(R.drawable.floating_shadow).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        mq mqVar = new mq(mutate, h02, 0, 0);
        int dp = AndroidUtilities.dp(56.0f);
        int dp2 = AndroidUtilities.dp(56.0f);
        mqVar.e = dp;
        mqVar.f = dp2;
        this.b = mqVar;
        Drawable drawable = getResources().getDrawable(R.drawable.popup_fixed_alert3);
        drawable.setColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.h5, false), mode));
        this.w.setBackground(drawable);
        this.x.setTextColor(j6.w0(null, j6.j5, false));
        invalidate();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didSetNewTheme) {
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
        z4 z4Var = this.a;
        z4Var.setTranslationX((f10 == -1.0f || f10 >= ((float) displayMetrics.widthPixels) / 2.0f) ? a(displayMetrics, 2.14748365E9f) : a(displayMetrics, -2.14748365E9f));
        z4Var.setTranslationY(f11 == -1.0f ? b(displayMetrics, 2.14748365E9f) : b(displayMetrics, f11));
        j jVar = new j(z4Var, o1.h.m, z4Var.getTranslationX());
        k kVar = new k(z4Var.getTranslationX());
        kVar.b(650.0f);
        kVar.a(0.75f);
        jVar.u = kVar;
        this.c = jVar;
        j jVar2 = new j(z4Var, o1.h.n, z4Var.getTranslationY());
        k kVar2 = new k(z4Var.getTranslationY());
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
        z4 z4Var = this.a;
        z4Var.setTranslationX(a(displayMetrics, z4Var.getTranslationX() >= ((float) displayMetrics.widthPixels) / 2.0f ? 2.14748365E9f : -2.14748365E9f));
        z4Var.setTranslationY(b(displayMetrics, z4Var.getTranslationY()));
        this.c.u.i = z4Var.getTranslationX();
        this.d.u.i = z4Var.getTranslationY();
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
        z4 z4Var = this.a;
        canvas.translate(z4Var.getTranslationX(), z4Var.getTranslationY());
        canvas.scale(z4Var.getScaleX(), z4Var.getScaleY(), z4Var.getPivotX(), z4Var.getPivotY());
        this.b.setAlpha((int) (z4Var.getAlpha() * 255.0f));
        this.b.setBounds(z4Var.getLeft(), z4Var.getTop(), z4Var.getRight(), z4Var.getBottom());
        this.b.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.s;
    }
}
