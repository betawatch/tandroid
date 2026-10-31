package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class we1 extends org.telegram.ui.ActionBar.k2 {
    public WebView a;
    public org.telegram.ui.ActionBar.t0 b;
    public org.telegram.ui.Components.iq c;
    public final String d;
    public final String e;
    public final String f;
    public final String h;
    public final org.telegram.messenger.jj n;
    public final String r;
    public m4 s;

    public we1(String str, String str2, String str3, String str4, org.telegram.messenger.jj jjVar) {
        super(null);
        this.s = new m4(this, 17);
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.n = jjVar;
        this.r = str4;
        StringBuilder sb2 = new StringBuilder("https://");
        sb2.append(org.telegram.messenger.vp.r1(this.currentAccount).U2);
        sb2.append("/");
        sb2.append(str2);
        sb2.append(TextUtils.isEmpty(str4) ? "" : sc.e.h("?game=", str4));
        this.h = sb2.toString();
    }

    public static void Z(String str, org.telegram.messenger.jj jjVar, Activity activity, String str2, String str3) {
        String str4;
        String str5 = "";
        try {
            SharedPreferences sharedPreferences = org.telegram.messenger.w0.b.getSharedPreferences("botshare", 0);
            String string = sharedPreferences.getString("" + jjVar.f1(), null);
            StringBuilder sb2 = new StringBuilder(string != null ? string : "");
            StringBuilder sb3 = new StringBuilder("tgShareScoreUrl=" + URLEncoder.encode("tgb://share_game_score?hash=", "UTF-8"));
            if (string == null) {
                char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
                for (int i10 = 0; i10 < 20; i10++) {
                    sb2.append(charArray[Utilities.b.nextInt(charArray.length)]);
                }
            }
            sb3.append((CharSequence) sb2);
            int indexOf = str.indexOf(35);
            if (indexOf < 0) {
                str4 = str + "#" + ((Object) sb3);
            } else {
                String substring = str.substring(indexOf + 1);
                if (substring.indexOf(61) < 0 && substring.indexOf(63) < 0) {
                    str4 = substring.length() > 0 ? str + "?" + ((Object) sb3) : str + ((Object) sb3);
                }
                str4 = str + "&" + ((Object) sb3);
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(((Object) sb2) + "_date", (int) (System.currentTimeMillis() / 1000));
            SerializedData serializedData = new SerializedData(jjVar.k.getObjectSize());
            jjVar.k.serializeToStream(serializedData);
            edit.putString(((Object) sb2) + "_m", Utilities.f(serializedData.toByteArray()));
            String str6 = ((Object) sb2) + "_link";
            StringBuilder sb4 = new StringBuilder();
            sb4.append("https://");
            sb4.append(org.telegram.messenger.vp.r1(jjVar.I1).U2);
            sb4.append("/");
            sb4.append(str3);
            if (!TextUtils.isEmpty(str2)) {
                str5 = "?game=" + str2;
            }
            sb4.append(str5);
            edit.putString(str6, sb4.toString());
            edit.commit();
            gf.f.n(activity, str4, false);
            serializedData.cleanup();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.H7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ue1(this));
        org.telegram.ui.ActionBar.y p5 = this.actionBar.p();
        this.b = p5.g(1, R.drawable.share, org.telegram.messenger.i0.L(54.0f));
        p5.a(0, R.drawable.ic_ab_other).e(2, R.drawable.msg_openin, org.telegram.messenger.cd.L0(2131747812, null));
        this.actionBar.setTitle(this.f);
        this.actionBar.setSubtitle("@" + this.e);
        org.telegram.ui.Components.iq iqVar = new org.telegram.ui.Components.iq(context, 1);
        this.c = iqVar;
        this.b.addView(iqVar, w7.b6.c(-1.0f, -1));
        this.c.setAlpha(0.0f);
        this.c.setScaleX(0.1f);
        this.c.setScaleY(0.1f);
        this.c.setVisibility(4);
        org.telegram.messenger.i0.u(context, true);
        WebView webView = new WebView(context);
        this.a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.a.getSettings().setDomStorageEnabled(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.a.setLayerType(2, null);
        this.a.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
        this.a.getSettings().setMediaPlaybackRequiresUserGesture(false);
        this.a.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.a, true);
        this.a.addJavascriptInterface(new ve1(this), "TelegramWebviewProxy");
        this.a.setWebViewClient(new ji.i(this, 4));
        frameLayout.addView(this.a, w7.b6.c(-1.0f, -1));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.F8));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.i0.u(getParentActivity(), false);
        org.telegram.messenger.i0.r(this.s);
        this.a.setLayerType(0, null);
        this.s = null;
        try {
            ViewParent parent = this.a.getParent();
            if (parent != null) {
                ((FrameLayout) parent).removeView(this.a);
            }
            this.a.stopLoading();
            this.a.loadUrl("about:blank");
            this.a.destroy();
            this.a = null;
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.i0.r(this.s);
        this.s.run();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.F(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G8, false), false);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        WebView webView;
        if (!z10 || z11 || (webView = this.a) == null) {
            return;
        }
        webView.loadUrl(this.d);
    }
}
