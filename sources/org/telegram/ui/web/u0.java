package org.telegram.ui.web;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import c8.xa;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.iz;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.k3;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class u0 extends WebView {
    public static final /* synthetic */ int V = 0;
    public String D;
    public boolean E;
    public v2 F;
    public int G;
    public int H;
    public Runnable I;
    public boolean J;
    public String K;
    public String L;
    public boolean M;
    public boolean N;
    public Bitmap O;
    public final HashMap P;
    public x0 Q;
    public boolean R;
    public d6.i S;
    public w0 T;
    public Runnable U;
    public final int a;
    public boolean b;
    public final boolean c;
    public String d;
    public y0 e;
    public u0 f;
    public boolean h;
    public String n;
    public String r;
    public boolean s;
    public boolean w;
    public int x;
    public int y;

    public u0(Context context, boolean z9, long j3) {
        super(context);
        int i7 = x0.R0;
        x0.R0 = i7 + 1;
        this.a = i7;
        this.D = "about:blank";
        this.P = new HashMap();
        this.c = z9;
        c("created new webview " + this);
        setOnLongClickListener(new h0(this));
        setWebViewClient(new j0(this, z9, context));
        setWebChromeClient(new r0(this, context, z9, j3));
        setFindListener(new s0(this));
        if (z9) {
            return;
        }
        setDownloadListener(new t0(this));
    }

    public static void a(u0 u0Var) {
        if (u0Var.c) {
            return;
        }
        a2 a10 = a2.a(u0Var);
        b2 b10 = b2.b();
        if (a10 == null) {
            b10.getClass();
        } else {
            if (b10.a == null) {
                b10.a = new HashMap();
            }
            if (!TextUtils.isEmpty(a10.b)) {
                b10.a.put(a10.b, a10);
                b10.c();
                b10.d();
            }
        }
        y0 y0Var = u0Var.e;
        if (y0Var == null || a10 == null) {
            return;
        }
        y0Var.d = a10;
        xa.c(y0Var);
    }

    public final void b(a2 a2Var) {
        d0 d0Var;
        if (a2Var == null) {
            return;
        }
        x0 x0Var = this.Q;
        boolean z9 = false;
        if (x0Var != null && (d0Var = x0Var.c) != null) {
            int i7 = a2Var.e;
            if (i7 != 0) {
                d0Var.o(i7, true);
                this.s = true;
            }
            int i10 = a2Var.f;
            if (i10 != 0) {
                this.Q.c.o(i10, false);
                this.w = true;
            } else {
                i10 = -1;
            }
            Bitmap bitmap = a2Var.i;
            if (bitmap != null) {
                x0 x0Var2 = this.Q;
                this.O = bitmap;
                x0Var2.getClass();
                this.M = true;
            }
            if (!TextUtils.isEmpty(a2Var.d)) {
                String str = a2Var.d;
                this.r = str;
                x0 x0Var3 = this.Q;
                this.K = str;
                x0Var3.I();
                z9 = true;
            }
            if (iz.v0) {
                setBackgroundColor(i10);
            }
        }
        if (z9) {
            return;
        }
        setTitle(null);
        x0 x0Var4 = this.Q;
        if (x0Var4 != null) {
            x0Var4.I();
        }
    }

    public final void c(String str) {
        a8.b("[webview] #" + this.a + " " + str);
    }

    @Override // android.webkit.WebView
    public final void clearHistory() {
        c("clearHistory");
        super.clearHistory();
    }

    public final void d(String str) {
        evaluateJavascript(str, new e0(0));
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        c("destroy");
        super.destroy();
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return super.drawChild(canvas, view, j3);
    }

    public final void e(String str, a2 a2Var) {
        v2 v2Var = this.F;
        if (v2Var != null) {
            v2Var.dismiss();
            this.F = null;
        }
        b(a2Var);
        this.d = str;
        String b10 = x0.b(str);
        c("loadUrl " + b10 + " with cached meta");
        super.loadUrl(b10);
        x0 x0Var = this.Q;
        if (x0Var != null) {
            x0Var.J(!super.canGoBack(), !canGoForward());
        }
    }

    public final void f(x0 x0Var, w0 w0Var) {
        c("setContainers(" + x0Var + ", " + w0Var + ")");
        boolean z9 = this.Q == null && x0Var != null;
        this.Q = x0Var;
        this.T = w0Var;
        if (!z9 || this.c) {
            return;
        }
        d("window.__tg__postBackgroundChange && window.__tg__postBackgroundChange()");
    }

    @Override // android.webkit.WebView
    public Bitmap getFavicon() {
        if (this.h) {
            return null;
        }
        return this.O;
    }

    public String getOpenURL() {
        return this.d;
    }

    public float getScrollProgress() {
        float max = Math.max(1, computeVerticalScrollRange() - computeVerticalScrollExtent());
        if (max <= getHeight()) {
            return 0.0f;
        }
        return Utilities.l(getScrollY() / max);
    }

    public int getSearchCount() {
        return this.H;
    }

    public int getSearchIndex() {
        return this.G;
    }

    @Override // android.webkit.WebView
    public String getTitle() {
        return this.K;
    }

    @Override // android.webkit.WebView
    public String getUrl() {
        return this.E ? this.D : super.getUrl();
    }

    @Override // android.webkit.WebView
    public final void goBack() {
        c("goBack");
        super.goBack();
    }

    @Override // android.webkit.WebView
    public final void goForward() {
        c("goForward");
        super.goForward();
    }

    @Override // android.webkit.WebView
    public final void loadData(String str, String str2, String str3) {
        this.d = null;
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n("loadData ", str, " ", str2, " ");
        n10.append(str3);
        c(n10.toString());
        super.loadData(str, str2, str3);
    }

    @Override // android.webkit.WebView
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.d = null;
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n("loadDataWithBaseURL ", str, " ", str2, " ");
        com.google.android.recaptcha.internal.a.s(n10, str3, " ", str4, " ");
        n10.append(str5);
        c(n10.toString());
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str) {
        v2 v2Var = this.F;
        if (v2Var != null) {
            v2Var.dismiss();
            this.F = null;
        }
        if (!this.c) {
            b(b2.b().a(org.telegram.messenger.g0.K0(str, true)));
        }
        this.d = str;
        String b10 = x0.b(str);
        c("loadUrl " + b10);
        super.loadUrl(b10);
        x0 x0Var = this.Q;
        if (x0Var != null) {
            x0Var.J(!super.canGoBack(), true ^ canGoForward());
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        c("attached");
        org.telegram.messenger.g0.u(getContext(), true);
        super.onAttachedToWindow();
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onCheckIsTextEditor() {
        x0 x0Var = this.Q;
        if (x0Var == null) {
            c("onCheckIsTextEditor: no container");
            return false;
        }
        boolean isFocusable = x0Var.isFocusable();
        c("onCheckIsTextEditor: " + isFocusable);
        return isFocusable;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        c("detached");
        org.telegram.messenger.g0.u(getContext(), false);
        super.onDetachedFromWindow();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
    }

    @Override // android.webkit.WebView
    public final void onPause() {
        c("onPause");
        super.onPause();
    }

    @Override // android.webkit.WebView
    public final void onResume() {
        c("onResume");
        super.onResume();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        w0 w0Var = this.T;
        if (w0Var != null) {
            getScrollX();
            getScrollY();
            ((k3) ((org.telegram.ui.f) w0Var).b).L.d0();
        }
        getScrollX();
        getScrollY();
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.Q != null && motionEvent.getAction() == 0) {
            this.Q.P = System.currentTimeMillis();
            if (!this.Q.r()) {
                getSettings().setMediaPlaybackRequiresUserGesture(false);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView
    public final void pauseTimers() {
        c("pauseTimers");
        super.pauseTimers();
    }

    @Override // android.webkit.WebView
    public final void postUrl(String str, byte[] bArr) {
        c("postUrl " + str + " " + bArr);
        super.postUrl(str, bArr);
    }

    @Override // android.webkit.WebView
    public final void reload() {
        CookieManager.getInstance().flush();
        c("reload");
        super.reload();
    }

    @Override // android.webkit.WebView
    public final void resumeTimers() {
        c("resumeTimers");
        super.resumeTimers();
    }

    public void setCloseListener(Runnable runnable) {
        this.U = runnable;
    }

    @Override // android.view.View
    public void setFocusable(int i7) {
        c("setFocusable " + i7);
        super.setFocusable(i7);
    }

    @Override // android.view.View
    public void setFocusableInTouchMode(boolean z9) {
        c("setFocusableInTouchMode " + z9);
        super.setFocusableInTouchMode(z9);
    }

    @Override // android.view.View
    public void setFocusedByDefault(boolean z9) {
        c("setFocusedByDefault " + z9);
        super.setFocusedByDefault(z9);
    }

    public void setScrollProgress(float f10) {
        setScrollY((int) (f10 * Math.max(1, computeVerticalScrollRange() - computeVerticalScrollExtent())));
    }

    @Override // android.view.View
    public void setScrollX(int i7) {
        super.setScrollX(i7);
    }

    @Override // android.view.View
    public void setScrollY(int i7) {
        super.setScrollY(i7);
    }

    public void setTitle(String str) {
        this.K = str;
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        c("stopLoading");
        super.stopLoading();
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        c("stopNestedScroll");
        super.stopNestedScroll();
    }

    @Override // android.view.View
    public void setFocusable(boolean z9) {
        c("setFocusable " + z9);
        super.setFocusable(z9);
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str, Map map) {
        v2 v2Var = this.F;
        if (v2Var != null) {
            v2Var.dismiss();
            this.F = null;
        }
        if (!this.c) {
            b(b2.b().a(org.telegram.messenger.g0.K0(str, true)));
        }
        this.d = str;
        String b10 = x0.b(str);
        c("loadUrl " + b10 + " " + map);
        super.loadUrl(b10, map);
        x0 x0Var = this.Q;
        if (x0Var != null) {
            x0Var.J(!super.canGoBack(), !canGoForward());
        }
    }
}
