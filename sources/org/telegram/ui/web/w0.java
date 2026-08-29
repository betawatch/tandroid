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
import org.telegram.ui.q3;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class w0 extends WebView {
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
    public z0 M;
    public y0 N;
    public Runnable O;
    public final int a;
    public boolean b;
    public final boolean c;
    public String d;
    public a1 e;
    public w0 f;
    public boolean h;
    public String n;
    public String r;
    public boolean s;
    public boolean v;
    public int w;
    public int x;
    public String y;

    public w0(Context context, boolean z10, long j10) {
        super(context);
        int i10 = z0.J0;
        z0.J0 = i10 + 1;
        this.a = i10;
        this.y = "about:blank";
        this.L = new HashMap();
        this.c = z10;
        c("created new webview " + this);
        setOnLongClickListener(new j0(this));
        setWebViewClient(new l0(this, z10, context));
        setWebChromeClient(new t0(this, context, z10, j10));
        setFindListener(new u0(this));
        if (z10) {
            return;
        }
        setDownloadListener(new v0(this));
    }

    public static void a(w0 w0Var) {
        if (w0Var.c) {
            return;
        }
        j2 a2 = j2.a(w0Var);
        k2 b10 = k2.b();
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
        a1 a1Var = w0Var.e;
        if (a1Var == null || a2 == null) {
            return;
        }
        a1Var.d = a2;
        b1.c(a1Var);
    }

    public final void b(j2 j2Var) {
        f0 f0Var;
        if (j2Var == null) {
            return;
        }
        z0 z0Var = this.M;
        boolean z10 = false;
        if (z0Var != null && (f0Var = z0Var.c) != null) {
            int i10 = j2Var.e;
            if (i10 != 0) {
                f0Var.o(i10, true);
                this.s = true;
            }
            int i11 = j2Var.f;
            if (i11 != 0) {
                this.M.c.o(i11, false);
                this.v = true;
            } else {
                i11 = -1;
            }
            Bitmap bitmap = j2Var.i;
            if (bitmap != null) {
                z0 z0Var2 = this.M;
                this.K = bitmap;
                z0Var2.getClass();
                this.I = true;
            }
            if (!TextUtils.isEmpty(j2Var.d)) {
                String str = j2Var.d;
                this.r = str;
                z0 z0Var3 = this.M;
                this.G = str;
                z0Var3.E();
                z10 = true;
            }
            if (SharedConfig.adaptableColorInBrowser) {
                setBackgroundColor(i11);
            }
        }
        if (z10) {
            return;
        }
        setTitle(null);
        z0 z0Var4 = this.M;
        if (z0Var4 != null) {
            z0Var4.E();
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
        evaluateJavascript(str, new g0(0));
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

    public final void e(String str, j2 j2Var) {
        f3 f3Var = this.B;
        if (f3Var != null) {
            f3Var.dismiss();
            this.B = null;
        }
        b(j2Var);
        this.d = str;
        String b10 = z0.b(str);
        c("loadUrl " + b10 + " with cached meta");
        super.loadUrl(b10);
        z0 z0Var = this.M;
        if (z0Var != null) {
            z0Var.F(!super.canGoBack(), !canGoForward());
        }
    }

    public final void f(z0 z0Var, y0 y0Var) {
        c("setContainers(" + z0Var + ", " + y0Var + ")");
        boolean z10 = this.M == null;
        this.M = z0Var;
        this.N = y0Var;
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
        StringBuilder k9 = th.k("loadData ", str, " ", str2, " ");
        k9.append(str3);
        c(k9.toString());
        super.loadData(str, str2, str3);
    }

    @Override // android.webkit.WebView
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.d = null;
        StringBuilder k9 = th.k("loadDataWithBaseURL ", str, " ", str2, " ");
        th.w(k9, str3, " ", str4, " ");
        k9.append(str5);
        c(k9.toString());
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
            b(k2.b().a(AndroidUtilities.getHostAuthority(str, true)));
        }
        this.d = str;
        String b10 = z0.b(str);
        c("loadUrl " + b10);
        super.loadUrl(b10);
        z0 z0Var = this.M;
        if (z0Var != null) {
            z0Var.F(!super.canGoBack(), true ^ canGoForward());
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
        z0 z0Var = this.M;
        if (z0Var == null) {
            c("onCheckIsTextEditor: no container");
            return false;
        }
        boolean isFocusable = z0Var.isFocusable();
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
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
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
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        y0 y0Var = this.N;
        if (y0Var != null) {
            getScrollX();
            getScrollY();
            ((q3) ((org.telegram.ui.h) y0Var).b).G.f0();
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
    public void setFocusable(int i10) {
        c("setFocusable " + i10);
        super.setFocusable(i10);
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

    public void setScrollProgress(float f9) {
        setScrollY((int) (f9 * Math.max(1, computeVerticalScrollRange() - computeVerticalScrollExtent())));
    }

    @Override // android.view.View
    public void setScrollX(int i10) {
        super.setScrollX(i10);
    }

    @Override // android.view.View
    public void setScrollY(int i10) {
        super.setScrollY(i10);
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
            b(k2.b().a(AndroidUtilities.getHostAuthority(str, true)));
        }
        this.d = str;
        String b10 = z0.b(str);
        c("loadUrl " + b10 + " " + map);
        super.loadUrl(b10, map);
        z0 z0Var = this.M;
        if (z0Var != null) {
            z0Var.F(!super.canGoBack(), !canGoForward());
        }
    }
}
