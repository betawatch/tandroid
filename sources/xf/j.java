package xf;

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
import i7.w;
import java.util.ArrayList;
import java.util.List;
import o1.k;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ef0;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class j extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public ArrayList A;
    public int B;
    public rf.d a;
    public jq b;
    public k c;
    public k d;
    public SharedPreferences e;
    public boolean f;
    public boolean h;
    public boolean n;
    public d r;
    public boolean s;
    public int v;
    public LinearLayout w;
    public TextView x;
    public jl0 y;

    public static float a(DisplayMetrics displayMetrics, float f9) {
        return w.a(f9, AndroidUtilities.dp(16.0f), displayMetrics.widthPixels - AndroidUtilities.dp(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f9) {
        return w.a(f9, AndroidUtilities.dp(16.0f), displayMetrics.heightPixels - AndroidUtilities.dp(72.0f));
    }

    private List<a> getBuiltInDebugItems() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("Theme"));
        arrayList.add(new a("Draw action bar shadow", new ef0(19)));
        arrayList.add(new a("Show blur settings", new d(this, 0)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugGeneral)));
        arrayList.add(new a(LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuDisableWebViewDebug : R.string.DebugMenuEnableWebViewDebug), new d(this, 1)));
        arrayList.add(new a(g6.I.q() ? "Switch to day theme" : "Switch to dark theme", new ef0(20)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugSendLogs), new d(this, 2)));
        return arrayList;
    }

    public final void c(final boolean z10) {
        rf.d dVar = this.a;
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
                    arrayList.addAll(((b) O).B());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).o0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.B());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).n0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.B());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.y.getAdapter().l();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z10) {
            this.v = window.getStatusBarColor();
        }
        final float translationX = dVar.getTranslationX();
        final float translationY = dVar.getTranslationY();
        k kVar = new k(new ib.a(z10 ? 0.0f : 1000.0f));
        l l10 = th.l(1000.0f, 900.0f, 1.0f);
        l10.i = z10 ? 1000.0f : 0.0f;
        kVar.u = l10;
        kVar.b(new o1.h() { // from class: xf.e
            @Override // o1.h
            public final void a(o1.i iVar, float f9, float f10) {
                float f11 = f9 / 1000.0f;
                j jVar = j.this;
                LinearLayout linearLayout = jVar.w;
                linearLayout.setAlpha(f11);
                float dp = AndroidUtilities.dp(8.0f);
                float f12 = translationX;
                linearLayout.setTranslationX(AndroidUtilities.lerp(f12 - dp, 0.0f, f11));
                float dp2 = AndroidUtilities.dp(8.0f);
                float f13 = translationY;
                linearLayout.setTranslationY(AndroidUtilities.lerp(f13 - dp2, 0.0f, f11));
                rf.d dVar2 = jVar.a;
                linearLayout.setPivotX(dVar2.getTranslationX() + AndroidUtilities.dp(28.0f));
                linearLayout.setPivotY(dVar2.getTranslationY() + AndroidUtilities.dp(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(AndroidUtilities.lerp(dVar2.getWidth() / linearLayout.getWidth(), 1.0f, f11));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(AndroidUtilities.lerp(dVar2.getHeight() / linearLayout.getHeight(), 1.0f, f11));
                }
                dVar2.setTranslationX(AndroidUtilities.lerp(f12, (jVar.getWidth() / 2.0f) - AndroidUtilities.dp(28.0f), f11));
                dVar2.setTranslationY(AndroidUtilities.lerp(f13, (jVar.getHeight() / 2.0f) - AndroidUtilities.dp(28.0f), f11));
                dVar2.setAlpha(1.0f - f11);
                window.setStatusBarColor(i0.a.d(f11, jVar.v, 2046820352));
                jVar.invalidate();
            }
        });
        kVar.a(new o1.g() { // from class: xf.f
            @Override // o1.g
            public final void a(o1.i iVar, boolean z11, float f9, float f10) {
                j jVar = j.this;
                rf.d dVar2 = jVar.a;
                dVar2.setTranslationX(translationX);
                dVar2.setTranslationY(translationY);
                if (z10) {
                    return;
                }
                jVar.w.setVisibility(8);
            }
        });
        kVar.f();
    }

    public final void d() {
        z h02 = g6.h0(AndroidUtilities.dp(56.0f), g6.w0(null, g6.P9, false), g6.w0(null, g6.Q9, false));
        Drawable mutate = getResources().getDrawable(R.drawable.floating_shadow).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        jq jqVar = new jq(mutate, h02, 0, 0);
        int dp = AndroidUtilities.dp(56.0f);
        int dp2 = AndroidUtilities.dp(56.0f);
        jqVar.e = dp;
        jqVar.f = dp2;
        this.b = jqVar;
        Drawable drawable = getResources().getDrawable(R.drawable.popup_fixed_alert3);
        drawable.setColorFilter(new PorterDuffColorFilter(g6.w0(null, g6.h5, false), mode));
        this.w.setBackground(drawable);
        this.x.setTextColor(g6.w0(null, g6.j5, false));
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
        float f9 = sharedPreferences.getFloat("x", -1.0f);
        float f10 = sharedPreferences.getFloat("y", -1.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        rf.d dVar = this.a;
        dVar.setTranslationX((f9 == -1.0f || f9 >= ((float) displayMetrics.widthPixels) / 2.0f) ? a(displayMetrics, 2.14748365E9f) : a(displayMetrics, -2.14748365E9f));
        dVar.setTranslationY(f10 == -1.0f ? b(displayMetrics, 2.14748365E9f) : b(displayMetrics, f10));
        k kVar = new k(dVar, o1.i.m, dVar.getTranslationX());
        l lVar = new l(dVar.getTranslationX());
        lVar.b(650.0f);
        lVar.a(0.75f);
        kVar.u = lVar;
        this.c = kVar;
        k kVar2 = new k(dVar, o1.i.n, dVar.getTranslationY());
        l lVar2 = new l(dVar.getTranslationY());
        lVar2.b(650.0f);
        lVar2.a(0.75f);
        kVar2.u = lVar2;
        this.d = kVar2;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.c.c();
        this.d.c();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        rf.d dVar = this.a;
        dVar.setTranslationX(a(displayMetrics, dVar.getTranslationX() >= ((float) displayMetrics.widthPixels) / 2.0f ? 2.14748365E9f : -2.14748365E9f));
        dVar.setTranslationY(b(displayMetrics, dVar.getTranslationY()));
        this.c.u.i = dVar.getTranslationX();
        this.d.u.i = dVar.getTranslationY();
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
        rf.d dVar = this.a;
        canvas.translate(dVar.getTranslationX(), dVar.getTranslationY());
        canvas.scale(dVar.getScaleX(), dVar.getScaleY(), dVar.getPivotX(), dVar.getPivotY());
        this.b.setAlpha((int) (dVar.getAlpha() * 255.0f));
        this.b.setBounds(dVar.getLeft(), dVar.getTop(), dVar.getRight(), dVar.getBottom());
        this.b.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.s;
    }
}
