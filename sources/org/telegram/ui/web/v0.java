package org.telegram.ui.web;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.p3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class v0 extends WebView {
    public static final /* synthetic */ int P = 0;
    public boolean A;
    public f3 B;
    public int C;
    public int D;
    public Runnable E;
    public boolean F;
    public String G;
    public String H;
    public boolean I;
    public boolean J;
    public Bitmap K;
    public final HashMap L;
    public y0 M;
    public x0 N;
    public Runnable O;
    public final int a;
    public boolean b;
    public final boolean c;
    public String d;
    public z0 e;
    public v0 f;
    public boolean h;
    public String n;
    public String r;
    public boolean s;
    public boolean v;
    public int w;
    public int x;
    public String y;

    public v0(Context context, boolean z10, long j10) {
        super(context);
        int i9 = y0.J0;
        y0.J0 = i9 + 1;
        this.a = i9;
        this.y = "about:blank";
        this.L = new HashMap();
        this.c = z10;
        c("created new webview " + this);
        setOnLongClickListener(new i0(this));
        setWebViewClient(new k0(this, z10, context));
        setWebChromeClient(new s0(this, context, z10, j10));
        setFindListener(new t0(this));
        if (z10) {
            return;
        }
        setDownloadListener(new u0(this));
    }

    public static void a(v0 v0Var) {
        if (v0Var.c) {
            return;
        }
        h2 a2 = h2.a(v0Var);
        i2 b10 = i2.b();
        if (a2 == null) {
            b10.getClass();
        } else {
            if (b10.a == null) {
                b10.a = new HashMap();
            }
            if (!TextUtils.isEmpty(a2.b)) {
                b10.a.put(a2.b, a2);
                b10.c();
                b10.d();
            }
        }
        z0 z0Var = v0Var.e;
        if (z0Var == null || a2 == null) {
            return;
        }
        z0Var.d = a2;
        a1.c(z0Var);
    }

    public final void b(h2 h2Var) {
        e0 e0Var;
        if (h2Var == null) {
            return;
        }
        y0 y0Var = this.M;
        boolean z10 = false;
        if (y0Var != null && (e0Var = y0Var.c) != null) {
            int i9 = h2Var.e;
            if (i9 != 0) {
                e0Var.o(i9, true);
                this.s = true;
            }
            int i10 = h2Var.f;
            if (i10 != 0) {
                this.M.c.o(i10, false);
                this.v = true;
            } else {
                i10 = -1;
            }
            Bitmap bitmap = h2Var.i;
            if (bitmap != null) {
                y0 y0Var2 = this.M;
                this.K = bitmap;
                y0Var2.getClass();
                this.I = true;
            }
            if (!TextUtils.isEmpty(h2Var.d)) {
                String str = h2Var.d;
                this.r = str;
                y0 y0Var3 = this.M;
                this.G = str;
                y0Var3.E();
                z10 = true;
            }
            if (SharedConfig.adaptableColorInBrowser) {
                setBackgroundColor(i10);
            }
        }
        if (z10) {
            return;
        }
        setTitle(null);
        y0 y0Var4 = this.M;
        if (y0Var4 != null) {
            y0Var4.E();
        }
    }

    public final void c(String str) {
        FileLog.d("[webview] #" + this.a + " " + str);
    }

    @Override // android.webkit.WebView
    public final void clearHistory() {
        c("clearHistory");
        super.clearHistory();
    }

    public final void d(String str) {
        evaluateJavascript(str, new f0(0));
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e(String str, h2 h2Var) {
        f3 f3Var = this.B;
        if (f3Var != null) {
            f3Var.dismiss();
            this.B = null;
        }
        b(h2Var);
        this.d = str;
        String b10 = y0.b(str);
        c("loadUrl " + b10 + " with cached meta");
        super.loadUrl(b10);
        y0 y0Var = this.M;
        if (y0Var != null) {
            y0Var.F(!super.canGoBack(), !canGoForward());
        }
    }

    public final void f(y0 y0Var, x0 x0Var) {
        c("setContainers(" + y0Var + ", " + x0Var + ")");
        boolean z10 = this.M == null;
        this.M = y0Var;
        this.N = x0Var;
        if (z10) {
            d("window.__tg__postBackgroundChange()");
        }
    }

    @Override // android.webkit.WebView
    public Bitmap getFavicon() {
        if (this.h) {
            return null;
        }
        return this.K;
    }

    public String getOpenURL() {
        return this.d;
    }

    public float getScrollProgress() {
        float max = Math.max(1, computeVerticalScrollRange() - computeVerticalScrollExtent());
        if (max <= getHeight()) {
            return 0.0f;
        }
        return Utilities.clamp01(getScrollY() / max);
    }

    public int getSearchCount() {
        return this.D;
    }

    public int getSearchIndex() {
        return this.C;
    }

    @Override // android.webkit.WebView
    public String getTitle() {
        return this.G;
    }

    @Override // android.webkit.WebView
    public String getUrl() {
        return this.A ? this.y : super.getUrl();
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
        StringBuilder q10 = j3.r0.q("loadData ", str, " ", str2, " ");
        q10.append(str3);
        c(q10.toString());
        super.loadData(str, str2, str3);
    }

    @Override // android.webkit.WebView
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.d = null;
        StringBuilder q10 = j3.r0.q("loadDataWithBaseURL ", str, " ", str2, " ");
        j3.r0.A(q10, str3, " ", str4, " ");
        q10.append(str5);
        c(q10.toString());
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str) {
        f3 f3Var = this.B;
        if (f3Var != null) {
            f3Var.dismiss();
            this.B = null;
        }
        if (!this.c) {
            b(i2.b().a(AndroidUtilities.getHostAuthority(str, true)));
        }
        this.d = str;
        String b10 = y0.b(str);
        c("loadUrl " + b10);
        super.loadUrl(b10);
        y0 y0Var = this.M;
        if (y0Var != null) {
            y0Var.F(!super.canGoBack(), true ^ canGoForward());
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        c("attached");
        AndroidUtilities.checkAndroidTheme(getContext(), true);
        super.onAttachedToWindow();
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onCheckIsTextEditor() {
        y0 y0Var = this.M;
        if (y0Var == null) {
            c("onCheckIsTextEditor: no container");
            return false;
        }
        boolean isFocusable = y0Var.isFocusable();
        c("onCheckIsTextEditor: " + isFocusable);
        return isFocusable;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        c("detached");
        AndroidUtilities.checkAndroidTheme(getContext(), false);
        super.onDetachedFromWindow();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
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
    public final void onScrollChanged(int i9, int i10, int i11, int i12) {
        super.onScrollChanged(i9, i10, i11, i12);
        x0 x0Var = this.N;
        if (x0Var != null) {
            getScrollX();
            getScrollY();
            ((p3) ((org.telegram.ui.g) x0Var).b).G.f0();
        }
        getScrollX();
        getScrollY();
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.M.L = System.currentTimeMillis();
            if (!this.M.p()) {
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
        this.O = runnable;
    }

    @Override // android.view.View
    public void setFocusable(int i9) {
        c("setFocusable " + i9);
        super.setFocusable(i9);
    }

    @Override // android.view.View
    public void setFocusableInTouchMode(boolean z10) {
        c("setFocusableInTouchMode " + z10);
        super.setFocusableInTouchMode(z10);
    }

    @Override // android.view.View
    public void setFocusedByDefault(boolean z10) {
        c("setFocusedByDefault " + z10);
        super.setFocusedByDefault(z10);
    }

    public void setScrollProgress(float f10) {
        setScrollY((int) (f10 * Math.max(1, computeVerticalScrollRange() - computeVerticalScrollExtent())));
    }

    @Override // android.view.View
    public void setScrollX(int i9) {
        super.setScrollX(i9);
    }

    @Override // android.view.View
    public void setScrollY(int i9) {
        super.setScrollY(i9);
    }

    public void setTitle(String str) {
        this.G = str;
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
    public void setFocusable(boolean z10) {
        c("setFocusable " + z10);
        super.setFocusable(z10);
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str, Map map) {
        f3 f3Var = this.B;
        if (f3Var != null) {
            f3Var.dismiss();
            this.B = null;
        }
        if (!this.c) {
            b(i2.b().a(AndroidUtilities.getHostAuthority(str, true)));
        }
        this.d = str;
        String b10 = y0.b(str);
        c("loadUrl " + b10 + " " + map);
        super.loadUrl(b10, map);
        y0 y0Var = this.M;
        if (y0Var != null) {
            y0Var.F(!super.canGoBack(), !canGoForward());
        }
    }
}
