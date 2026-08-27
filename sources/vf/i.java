package vf;

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
import h7.n;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.tq0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class i extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public ArrayList A;
    public int B;
    public g a;
    public dq b;
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
    public zk0 y;

    public static float a(DisplayMetrics displayMetrics, float f10) {
        return n.a(f10, AndroidUtilities.dp(16.0f), displayMetrics.widthPixels - AndroidUtilities.dp(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f10) {
        return n.a(f10, AndroidUtilities.dp(16.0f), displayMetrics.heightPixels - AndroidUtilities.dp(72.0f));
    }

    private List<a> getBuiltInDebugItems() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("Theme"));
        arrayList.add(new a("Draw action bar shadow", new tq0(15)));
        arrayList.add(new a("Show blur settings", new c(this, 0)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugGeneral)));
        arrayList.add(new a(LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuDisableWebViewDebug : R.string.DebugMenuEnableWebViewDebug), new c(this, 1)));
        arrayList.add(new a(g6.I.q() ? "Switch to day theme" : "Switch to dark theme", new tq0(16)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugSendLogs), new c(this, 2)));
        return arrayList;
    }

    public final void c(final boolean z10) {
        g gVar = this.a;
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
                    arrayList.addAll(((b) O).C());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).o0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.C());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).n0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.C());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.y.getAdapter().l();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z10) {
            this.v = window.getStatusBarColor();
        }
        final float translationX = gVar.getTranslationX();
        final float translationY = gVar.getTranslationY();
        j jVar = new j(new hb.a(z10 ? 0.0f : 1000.0f));
        k k10 = pa.k(1000.0f, 900.0f, 1.0f);
        k10.i = z10 ? 1000.0f : 0.0f;
        jVar.u = k10;
        jVar.b(new o1.g() { // from class: vf.d
            @Override // o1.g
            public final void a(o1.h hVar, float f10, float f11) {
                float f12 = f10 / 1000.0f;
                i iVar = i.this;
                LinearLayout linearLayout = iVar.w;
                linearLayout.setAlpha(f12);
                float dp = AndroidUtilities.dp(8.0f);
                float f13 = translationX;
                linearLayout.setTranslationX(AndroidUtilities.lerp(f13 - dp, 0.0f, f12));
                float dp2 = AndroidUtilities.dp(8.0f);
                float f14 = translationY;
                linearLayout.setTranslationY(AndroidUtilities.lerp(f14 - dp2, 0.0f, f12));
                g gVar2 = iVar.a;
                linearLayout.setPivotX(gVar2.getTranslationX() + AndroidUtilities.dp(28.0f));
                linearLayout.setPivotY(gVar2.getTranslationY() + AndroidUtilities.dp(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(AndroidUtilities.lerp(gVar2.getWidth() / linearLayout.getWidth(), 1.0f, f12));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(AndroidUtilities.lerp(gVar2.getHeight() / linearLayout.getHeight(), 1.0f, f12));
                }
                gVar2.setTranslationX(AndroidUtilities.lerp(f13, (iVar.getWidth() / 2.0f) - AndroidUtilities.dp(28.0f), f12));
                gVar2.setTranslationY(AndroidUtilities.lerp(f14, (iVar.getHeight() / 2.0f) - AndroidUtilities.dp(28.0f), f12));
                gVar2.setAlpha(1.0f - f12);
                window.setStatusBarColor(i0.b.d(f12, iVar.v, 2046820352));
                iVar.invalidate();
            }
        });
        jVar.a(new o1.f() { // from class: vf.e
            @Override // o1.f
            public final void a(o1.h hVar, boolean z11, float f10, float f11) {
                i iVar = i.this;
                g gVar2 = iVar.a;
                gVar2.setTranslationX(translationX);
                gVar2.setTranslationY(translationY);
                if (z10) {
                    return;
                }
                iVar.w.setVisibility(8);
            }
        });
        jVar.f();
    }

    public final void d() {
        z h02 = g6.h0(AndroidUtilities.dp(56.0f), g6.w0(null, g6.P9, false), g6.w0(null, g6.Q9, false));
        Drawable mutate = getResources().getDrawable(R.drawable.floating_shadow).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        dq dqVar = new dq(mutate, h02, 0, 0);
        int dp = AndroidUtilities.dp(56.0f);
        int dp2 = AndroidUtilities.dp(56.0f);
        dqVar.e = dp;
        dqVar.f = dp2;
        this.b = dqVar;
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
        float f10 = sharedPreferences.getFloat("x", -1.0f);
        float f11 = sharedPreferences.getFloat("y", -1.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        g gVar = this.a;
        gVar.setTranslationX((f10 == -1.0f || f10 >= ((float) displayMetrics.widthPixels) / 2.0f) ? a(displayMetrics, 2.14748365E9f) : a(displayMetrics, -2.14748365E9f));
        gVar.setTranslationY(f11 == -1.0f ? b(displayMetrics, 2.14748365E9f) : b(displayMetrics, f11));
        j jVar = new j(gVar, o1.h.m, gVar.getTranslationX());
        k kVar = new k(gVar.getTranslationX());
        kVar.b(650.0f);
        kVar.a(0.75f);
        jVar.u = kVar;
        this.c = jVar;
        j jVar2 = new j(gVar, o1.h.n, gVar.getTranslationY());
        k kVar2 = new k(gVar.getTranslationY());
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
        g gVar = this.a;
        gVar.setTranslationX(a(displayMetrics, gVar.getTranslationX() >= ((float) displayMetrics.widthPixels) / 2.0f ? 2.14748365E9f : -2.14748365E9f));
        gVar.setTranslationY(b(displayMetrics, gVar.getTranslationY()));
        this.c.u.i = gVar.getTranslationX();
        this.d.u.i = gVar.getTranslationY();
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
        g gVar = this.a;
        canvas.translate(gVar.getTranslationX(), gVar.getTranslationY());
        canvas.scale(gVar.getScaleX(), gVar.getScaleY(), gVar.getPivotX(), gVar.getPivotY());
        this.b.setAlpha((int) (gVar.getAlpha() * 255.0f));
        this.b.setBounds(gVar.getLeft(), gVar.getTop(), gVar.getRight(), gVar.getBottom());
        this.b.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.s;
    }
}
