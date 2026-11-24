// default package

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
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class uwc extends d {
    public WebView a;
    public r7 b;
    public mx2 c;
    public final String d;
    public final String e;
    public final String f;
    public final String h;
    public final k47 n;
    public final String r;
    public zka s;

    public uwc(String str, String str2, String str3, String str4, k47 k47Var) {
        super(null);
        this.s = new zka((Object) this, (byte) 17);
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.n = k47Var;
        this.r = str4;
        StringBuilder sb = new StringBuilder("https://");
        sb.append(oc7.r1(this.currentAccount).N2);
        sb.append("/");
        sb.append(str2);
        sb.append(TextUtils.isEmpty(str4) ? "" : b10.h("?game=", str4));
        this.h = sb.toString();
    }

    public static void a0(String str, k47 k47Var, Activity activity, String str2, String str3) {
        String str4;
        try {
            SharedPreferences sharedPreferences = a.b.getSharedPreferences("botshare", 0);
            String string = sharedPreferences.getString(String.valueOf(k47Var.e1()), null);
            StringBuilder sb = new StringBuilder(string != null ? string : "");
            StringBuilder sb2 = new StringBuilder("tgShareScoreUrl=" + URLEncoder.encode("tgb://share_game_score?hash=", "UTF-8"));
            if (string == null) {
                char[] cArr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
                for (int i = 0; i < 20; i++) {
                    sb.append(cArr[Utilities.b.nextInt(52)]);
                }
            }
            sb2.append((CharSequence) sb);
            int indexOf = str.indexOf(35);
            if (indexOf < 0) {
                str4 = str + "#" + ((Object) sb2);
            } else {
                String substring = str.substring(indexOf + 1);
                if (substring.indexOf(61) >= 0 || substring.indexOf(63) >= 0) {
                    str4 = str + "&" + ((Object) sb2);
                } else if (substring.length() > 0) {
                    str4 = str + "?" + ((Object) sb2);
                } else {
                    str4 = str + ((Object) sb2);
                }
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(((Object) sb) + "_date", (int) (System.currentTimeMillis() / 1000));
            SerializedData serializedData = new SerializedData(k47Var.k.getObjectSize());
            k47Var.k.serializeToStream(serializedData);
            edit.putString(((Object) sb) + "_m", Utilities.f(serializedData.toByteArray()));
            String str5 = ((Object) sb) + "_link";
            StringBuilder sb3 = new StringBuilder();
            sb3.append("https://");
            sb3.append(oc7.r1(k47Var.K1).N2);
            sb3.append("/");
            sb3.append(str3);
            sb3.append(TextUtils.isEmpty(str2) ? "" : "?game=" + str2);
            edit.putString(str5, sb3.toString());
            edit.commit();
            l11.q(activity, str4, false);
            serializedData.cleanup();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.H7));
        hashSet.add(Integer.valueOf(cmb.G7));
        hashSet.add(Integer.valueOf(cmb.c6));
        hashSet.add(Integer.valueOf(cmb.D7));
        hashSet.add(Integer.valueOf(cmb.C7));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new swc(this));
        r6 t = this.actionBar.t();
        this.b = t.g(1, R.drawable.share, gm.L(54.0f));
        t.a(0, R.drawable.ic_ab_other).e(2, R.drawable.msg_openin, jb6.M0(2131747529, null));
        this.actionBar.setTitle(this.f);
        this.actionBar.setSubtitle("@" + this.e);
        mx2 mx2Var = new mx2(context, 1);
        this.c = mx2Var;
        this.b.addView(mx2Var, qoe.c(-1.0f, -1));
        this.c.setAlpha(0.0f);
        this.c.setScaleX(0.1f);
        this.c.setScaleY(0.1f);
        this.c.setVisibility(4);
        gm.u(context, true);
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
        this.a.addJavascriptInterface(new twc(this), "TelegramWebviewProxy");
        this.a.setWebViewClient(new sv(this, (byte) 4));
        frameLayout.addView(this.a, qoe.c(-1.0f, -1));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.F8));
        arrayList.add(new cnb(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.D8));
        arrayList.add(new cnb(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.E8));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        gm.u(getParentActivity(), false);
        gm.r(this.s);
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
            fc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        gm.r(this.s);
        this.s.run();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            if (aVar != null) {
                aVar.I(cmb.w0(null, cmb.F8, false), false);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        WebView webView;
        if (!z || z2 || (webView = this.a) == null) {
            return;
        }
        webView.loadUrl(this.d);
    }
}
