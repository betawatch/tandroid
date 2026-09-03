package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class r3 extends FrameLayout {
    public boolean B;
    public String C;
    public String D;
    public boolean E;
    public float F;
    public d3 G;
    public final /* synthetic */ n4 H;
    public int a;
    public final m3 b;
    public final l4 c;
    public final f2.i0 d;
    public final o3 e;
    public final p3 f;
    public boolean h;
    public boolean n;
    public h3 r;
    public boolean s;
    public boolean v;
    public int w;
    public int x;
    public org.telegram.ui.web.f2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(n4 n4Var, Activity activity) {
        super(activity);
        this.H = n4Var;
        int i10 = org.telegram.ui.ActionBar.j6.Pk;
        this.w = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        this.x = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        this.B = false;
        this.F = -1.0f;
        new Matrix();
        m3 m3Var = new m3(this, activity);
        this.b = m3Var;
        m3Var.setClipToPadding(false);
        m3Var.setPadding(0, AndroidUtilities.dp(56.0f), 0, 0);
        m3Var.setTopGlowOffset(AndroidUtilities.dp(56.0f));
        ((f2.l) m3Var.getItemAnimator()).C = false;
        l4 l4Var = new l4(n4Var, activity, n4Var.H != null);
        this.c = l4Var;
        m3Var.setAdapter(l4Var);
        f2.i0 i0Var = new f2.i0(1, false);
        this.d = i0Var;
        m3Var.setLayoutManager(i0Var);
        m3Var.setOnScrollListener(new n3(this, 0));
        addView(m3Var, k7.b6.c(-1.0f, -1));
        o3 o3Var = new o3(this, getContext());
        this.e = o3Var;
        o3Var.setShouldWaitWebViewScroll(true);
        o3Var.setFullSize(true);
        o3Var.setAllowFullSizeSwipe(true);
        p3 p3Var = new p3(this, getContext(), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        this.f = p3Var;
        final int i11 = 0;
        p3Var.setOnCloseRequestedListener(new Runnable(this) { // from class: org.telegram.ui.k3
            public final /* synthetic */ r3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        n4 n4Var2 = this.b.H;
                        LaunchActivity launchActivity = LaunchActivity.D1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.n3 P = launchActivity.P();
                            if (P != null) {
                                boolean z4 = false;
                                int i12 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.n3.H;
                                    if (i12 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i12));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj = arrayList.get(i13);
                                                i13++;
                                                org.telegram.ui.ActionBar.m3 m3Var2 = (org.telegram.ui.ActionBar.m3) obj;
                                                if (m3Var2.J == n4Var2) {
                                                    z4 = P.h(i12, m3Var2, true);
                                                }
                                            }
                                        }
                                        i12++;
                                    }
                                }
                                if (z4) {
                                }
                            }
                            n4Var2.o(true, true);
                            break;
                        }
                        break;
                    case 1:
                        this.b.f.o(true, false);
                        break;
                    default:
                        r3 r3Var = this.b;
                        o3 o3Var2 = r3Var.e;
                        r3Var.f.o(false, false);
                        h3 h3Var = r3Var.r;
                        if (h3Var != null) {
                            h3Var.a.setTranslationY(((o3Var2.getTopActionBarOffsetY() + (-o3Var2.getOffsetY())) - o3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        r3Var.H.f0();
                        break;
                }
            }
        });
        p3Var.setWebViewProgressListener(new l3(this, i11));
        p3Var.setDelegate(new q3(this));
        p3Var.setWebViewScrollListener(new h(this, 2));
        o3Var.addView(p3Var, k7.b6.c(-1.0f, -1));
        final int i12 = 1;
        o3Var.setScrollEndListener(new Runnable(this) { // from class: org.telegram.ui.k3
            public final /* synthetic */ r3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        n4 n4Var2 = this.b.H;
                        LaunchActivity launchActivity = LaunchActivity.D1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.n3 P = launchActivity.P();
                            if (P != null) {
                                boolean z4 = false;
                                int i122 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.n3.H;
                                    if (i122 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i122));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj = arrayList.get(i13);
                                                i13++;
                                                org.telegram.ui.ActionBar.m3 m3Var2 = (org.telegram.ui.ActionBar.m3) obj;
                                                if (m3Var2.J == n4Var2) {
                                                    z4 = P.h(i122, m3Var2, true);
                                                }
                                            }
                                        }
                                        i122++;
                                    }
                                }
                                if (z4) {
                                }
                            }
                            n4Var2.o(true, true);
                            break;
                        }
                        break;
                    case 1:
                        this.b.f.o(true, false);
                        break;
                    default:
                        r3 r3Var = this.b;
                        o3 o3Var2 = r3Var.e;
                        r3Var.f.o(false, false);
                        h3 h3Var = r3Var.r;
                        if (h3Var != null) {
                            h3Var.a.setTranslationY(((o3Var2.getTopActionBarOffsetY() + (-o3Var2.getOffsetY())) - o3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        r3Var.H.f0();
                        break;
                }
            }
        });
        o3Var.setDelegate(new c1(this, i12));
        final int i13 = 2;
        o3Var.setScrollListener(new Runnable(this) { // from class: org.telegram.ui.k3
            public final /* synthetic */ r3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        n4 n4Var2 = this.b.H;
                        LaunchActivity launchActivity = LaunchActivity.D1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.n3 P = launchActivity.P();
                            if (P != null) {
                                boolean z4 = false;
                                int i122 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.n3.H;
                                    if (i122 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i122));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i132 = 0;
                                            while (i132 < size) {
                                                Object obj = arrayList.get(i132);
                                                i132++;
                                                org.telegram.ui.ActionBar.m3 m3Var2 = (org.telegram.ui.ActionBar.m3) obj;
                                                if (m3Var2.J == n4Var2) {
                                                    z4 = P.h(i122, m3Var2, true);
                                                }
                                            }
                                        }
                                        i122++;
                                    }
                                }
                                if (z4) {
                                }
                            }
                            n4Var2.o(true, true);
                            break;
                        }
                        break;
                    case 1:
                        this.b.f.o(true, false);
                        break;
                    default:
                        r3 r3Var = this.b;
                        o3 o3Var2 = r3Var.e;
                        r3Var.f.o(false, false);
                        h3 h3Var = r3Var.r;
                        if (h3Var != null) {
                            h3Var.a.setTranslationY(((o3Var2.getTopActionBarOffsetY() + (-o3Var2.getOffsetY())) - o3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        r3Var.H.f0();
                        break;
                }
            }
        });
        o3Var.setTopActionBarOffsetY(AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight);
        addView(o3Var, k7.b6.c(-1.0f, -1));
        b();
        setType(0);
    }

    public static void a(r3 r3Var, boolean z4, int i10) {
        n4 n4Var = r3Var.H;
        a4 a4Var = n4Var.H;
        if (z4) {
            int v = org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false), i10);
            r3Var.w = v;
            if (r3Var == n4Var.r0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    n4Var.e0.d(v, true);
                }
                if (a4Var != null) {
                    a4Var.i();
                }
            }
        } else {
            int v10 = org.telegram.ui.ActionBar.j6.v(-1, i10);
            r3Var.x = v10;
            if (r3Var == n4Var.r0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    n4Var.e0.setMenuColors(v10);
                }
                if (a4Var != null) {
                    a4Var.i();
                }
            }
        }
        n4Var.f0();
    }

    public final void b() {
        this.s = false;
        this.v = false;
        setWeb(null);
        p3 p3Var = this.f;
        p3Var.i();
        p3Var.a = null;
        int i10 = org.telegram.ui.ActionBar.j6.Pk;
        this.w = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        this.x = w02;
        h3 h3Var = this.r;
        if (h3Var != null) {
            h3Var.b(AndroidUtilities.computePerceivedBrightness(w02) <= 0.721f, true);
            this.r.setBackgroundColor(this.x);
            h3 h3Var2 = this.r;
            this.n = false;
            AndroidUtilities.updateViewVisibilityAnimated(h3Var2, false, 1.0f, false);
        }
        l4 l4Var = this.c;
        l4Var.B = null;
        l4Var.e.clear();
        l4Var.f.clear();
        l4Var.s.clear();
        l4Var.v.clear();
        l4Var.h.clear();
        l4Var.r.clear();
        l4Var.n.clear();
        l4Var.x.clear();
        l4Var.w.clear();
        l4Var.C = null;
        l4Var.l();
        invalidate();
    }

    public final boolean c() {
        return this.a == 0;
    }

    public final boolean d() {
        l4 l4Var;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        return (f() || (l4Var = this.c) == null || (webPage = l4Var.B) == null || (page = webPage.cached_page) == null || page.local == null) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e() {
        org.telegram.ui.web.y0 webView;
        String v;
        return f() && (webView = getWebView()) != null && (v = org.telegram.ui.web.c1.v(webView.getUrl())) != null && org.telegram.ui.web.c1.q(Uri.parse(v));
    }

    public final boolean f() {
        return this.a == 1;
    }

    public final void g() {
        if (c()) {
            a4 a4Var = this.H.H;
            this.d.h1(a4Var != null ? 1 : 0, a4Var != null ? AndroidUtilities.dp(32.0f) : 0);
        } else if (f()) {
            o3 o3Var = this.e;
            o3Var.setSwipeOffsetY(o3Var.getTopActionBarOffsetY() + (-o3Var.getOffsetY()));
        }
    }

    public int getActionBarColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            return this.w;
        }
        int i10 = org.telegram.ui.ActionBar.j6.Pk;
        this.H.getClass();
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    public l4 getAdapter() {
        return this.c;
    }

    public int getBackgroundColor() {
        return (f() && SharedConfig.adaptableColorInBrowser) ? this.n ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false) : this.x : org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
    }

    public float getListTop() {
        int i10;
        if (!c()) {
            if (f()) {
                return this.e.getTranslationY();
            }
            return 0.0f;
        }
        m3 m3Var = this.b;
        float height = m3Var.getHeight();
        for (int i11 = 0; i11 < m3Var.getChildCount(); i11++) {
            View childAt = m3Var.getChildAt(i11);
            if (m3Var.getLayoutManager() == null) {
                i10 = 0;
            } else {
                m3Var.getLayoutManager().getClass();
                i10 = RecyclerView.U(childAt).f;
            }
            height = i10 == 2147483646 ? Math.min(height, childAt.getBottom()) : Math.min(height, childAt.getTop());
        }
        return height;
    }

    public org.telegram.ui.Components.rl0 getListView() {
        return this.b;
    }

    public float getProgress() {
        org.telegram.ui.web.y0 webView;
        a4 a4Var = this.H.H;
        if (c()) {
            float f10 = this.F;
            if (f10 >= 0.0f) {
                return f10;
            }
            f2.i0 i0Var = this.d;
            int L0 = i0Var.L0();
            if (i0Var.m(L0) != null) {
                int[] iArr = this.c.F;
                m3 m3Var = this.b;
                if (iArr != null) {
                    int i10 = L0 - 1;
                    return Utilities.clamp01((((i10 < 0 || i10 >= iArr.length) ? 0 : iArr[i10]) + ((L0 != 0 || a4Var == null) ? -r4.getTop() : 0)) / Math.max(1, r5.G - m3Var.getHeight()));
                }
                int N0 = i0Var.N0();
                if (a4Var != null) {
                    if (L0 < 1) {
                        L0 = 1;
                    }
                    if (N0 < 1) {
                        N0 = 1;
                    }
                }
                int B = i0Var.B() - 2;
                View m9 = N0 >= B ? i0Var.m(B) : i0Var.m(L0);
                if (m9 != null) {
                    float width = getWidth() / (r0 - 1);
                    float measuredHeight = m9.getMeasuredHeight();
                    return ((L0 * width) + (N0 >= B ? (((B - L0) * width) * (m3Var.getMeasuredHeight() - m9.getTop())) / measuredHeight : (1.0f - ((Math.min(0, m9.getTop() - m3Var.getPaddingTop()) + measuredHeight) / measuredHeight)) * width)) / getWidth();
                }
            }
        } else if (f() && (webView = this.f.getWebView()) != null) {
            return webView.getScrollProgress();
        }
        return 0.0f;
    }

    public String getSubtitle() {
        org.telegram.ui.web.y0 webView;
        o0 o0Var;
        if (!f() || (webView = this.f.getWebView()) == null) {
            return "";
        }
        if (TextUtils.equals(this.C, webView.getUrl())) {
            return this.D;
        }
        try {
            String url = webView.getUrl();
            this.C = url;
            Uri parse = Uri.parse(org.telegram.ui.web.c1.v(url));
            String uri = (parse.getScheme() == null || !(parse.getScheme().equalsIgnoreCase("http") || parse.getScheme().equalsIgnoreCase("https"))) ? parse.toString() : parse.getSchemeSpecificPart();
            try {
                if (!e()) {
                    try {
                        Uri parse2 = Uri.parse(uri);
                        if (parse2.getHost() != null) {
                            parse = parse2;
                        }
                        String a2 = ze.d.a(parse.getHost());
                        String[] split = a2.split("\\.");
                        if (split.length > 2 && (o0Var = this.H.e0) != null && ph.f3.g(a2, o0Var.B) > AndroidUtilities.displaySize.x - AndroidUtilities.dp(162.0f)) {
                            a2 = split[split.length - 2] + '.' + split[split.length - 1];
                        }
                        uri = ze.d.v(parse, null, "", a2, null);
                    } catch (Exception e) {
                        FileLog.e((Throwable) e, false);
                    }
                    uri = URLDecoder.decode(uri.replaceAll("\\+", "%2b"), "UTF-8");
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            if (uri.startsWith("//")) {
                uri = uri.substring(2);
            }
            if (uri.startsWith("www.")) {
                uri = uri.substring(4);
            }
            if (uri.endsWith("/")) {
                uri = uri.substring(0, uri.length() - 1);
            }
            int indexOf = uri.indexOf("#");
            if (indexOf >= 0) {
                uri = uri.substring(0, indexOf);
            }
            this.D = uri;
            return uri;
        } catch (Exception unused) {
            return webView.getUrl();
        }
    }

    public String getTitle() {
        org.telegram.ui.web.y0 webView;
        String str;
        String str2;
        if (c()) {
            TLRPC.WebPage webPage = this.c.B;
            if (webPage != null && (str2 = webPage.site_name) != null) {
                return str2;
            }
            if (webPage != null && (str = webPage.title) != null) {
                return str;
            }
        }
        return (!f() || (webView = this.f.getWebView()) == null) ? "" : webView.getTitle();
    }

    public org.telegram.ui.web.c1 getWebContainer() {
        return this.f;
    }

    public org.telegram.ui.web.y0 getWebView() {
        p3 p3Var = this.f;
        if (p3Var != null) {
            return p3Var.getWebView();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        h3 h3Var;
        super.onAttachedToWindow();
        if (!this.n || (h3Var = this.r) == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.j6.Pk;
        h3Var.b(AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, i10, false)) <= 0.721f, false);
        this.r.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
    }

    public void setLastVisible(boolean z4) {
        if (this.E != z4) {
            this.E = z4;
            this.f.setKeyboardFocusable(z4);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        n4 n4Var = this.H;
        n4Var.f0();
        if (n4Var.c0.f) {
            n4Var.d0.invalidate();
        }
        if (n4Var.c0.e) {
            n4Var.d0.invalidate();
            n4Var.X((int) (((AndroidUtilities.dp(56.0f) - n4Var.c0.h) * (f10 / getMeasuredWidth())) + n4Var.c0.h));
        }
        a4 a4Var = n4Var.H;
        if (a4Var != null) {
            a4Var.n();
        }
    }

    public void setType(int i10) {
        if (this.a != i10) {
            b();
        }
        this.a = i10;
        this.b.setVisibility(c() ? 0 : 8);
        this.e.setVisibility(f() ? 0 : 8);
    }

    public void setWeb(d3 d3Var) {
        d3 d3Var2 = this.G;
        if (d3Var2 != d3Var) {
            if (d3Var2 != null) {
                d3Var2.c(this);
            }
            this.G = d3Var;
            if (d3Var != null) {
                org.telegram.ui.web.y0 y0Var = d3Var.b;
                p3 p3Var = this.f;
                if (y0Var != null) {
                    y0Var.onResume();
                    p3Var.O(UserConfig.selectedAccount, d3Var.b, d3Var.d, d3Var.x, false);
                    a(this, true, d3Var.q);
                    a(this, false, d3Var.r);
                } else {
                    String str = d3Var.x;
                    if (str != null) {
                        p3Var.u(UserConfig.selectedAccount, str, false);
                    }
                }
            }
            org.telegram.ui.web.f2 f2Var = this.y;
            if (f2Var != null) {
                f2Var.a();
                org.telegram.ui.web.f2 f2Var2 = this.y;
                TLRPC.TL_webPage tL_webPage = f2Var2.j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.h2.o(tL_webPage);
                    f2Var2.j = null;
                }
                this.y = null;
            }
        }
    }
}
