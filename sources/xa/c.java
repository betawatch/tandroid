package xa;

import a6.l;
import a6.m;
import a8.g;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.Window;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.f0;
import androidx.fragment.app.i0;
import androidx.lifecycle.a0;
import b5.p;
import bi.o5;
import c6.o;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.k0;
import com.google.android.gms.common.api.internal.m0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.internal.cast.b5;
import com.google.android.gms.internal.play_billing.r;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import di.rb;
import fb.n;
import fi.y4;
import gi.s0;
import gi.t0;
import i7.f;
import i7.i;
import j$.util.DesugarCollections;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import ji.b3;
import ji.c2;
import ji.g1;
import ji.g2;
import ji.h1;
import ji.s5;
import ji.v3;
import l.e0;
import l.j;
import l.x;
import m.h;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.cj0;
import org.telegram.ui.co;
import org.telegram.ui.h71;
import qg.q1;
import rg.x1;
import v7.m8;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class c implements s, h71, a0, androidx.activity.result.b, p, wp0, k0, v0, OnCompleteListener, x1, n, x, s0, d5, g1, y2.n, j {
    public static volatile c c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ c(m mVar) {
        this.a = 8;
        this.b = (r) mVar.b;
    }

    public static boolean L(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String P(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public e A(e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public o B() {
        o oVar = (o) this.b;
        if (oVar.a == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if (Double.isNaN(oVar.e)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if (Double.isNaN(oVar.f) || oVar.f < 0.0d) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
        return oVar;
    }

    public boolean D(String str) {
        String K = K(str);
        return "1".equals(K) || Boolean.parseBoolean(K);
    }

    public Integer E(String str) {
        String K = K(str);
        if (TextUtils.isEmpty(K)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(K));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + P(str) + "(" + K + ") into an int");
            return null;
        }
    }

    public JSONArray F(String str) {
        String K = K(str);
        if (TextUtils.isEmpty(K)) {
            return null;
        }
        try {
            return new JSONArray(K);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + P(str) + ": " + K + ", falling back to default");
            return null;
        }
    }

    public String G(Resources resources, String str, String str2) {
        String[] strArr;
        String K = K(str2);
        if (!TextUtils.isEmpty(K)) {
            return K;
        }
        String K2 = K(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(K2)) {
            return null;
        }
        int identifier = resources.getIdentifier(K2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", P(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray F = F(str2.concat("_loc_args"));
        if (F == null) {
            strArr = null;
        } else {
            int length = F.length();
            strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = F.optString(i10);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e7) {
            Log.w("NotificationParams", "Missing format argument for " + P(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e7);
            return null;
        }
    }

    @Override // rg.x1
    public void H(float f7) {
        rb rbVar = (rb) this.b;
        qg.s0.e(rbVar.F1).k(String.valueOf(qg.m.a.indexOf(rbVar.O0.getCurrentBrush())), f7);
        q1 q1Var = rbVar.A1;
        q1Var.c = f7;
        rbVar.E0(q1Var, null, false);
    }

    public Set I() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.b);
        }
        return unmodifiableSet;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 22:
                ((ji.r) this.b).I(i10, z10, i11, false, 0L);
                ji.r rVar = (ji.r) this.b;
                cj0 cj0Var = rVar.O;
                if (cj0Var != null) {
                    cj0Var.i();
                    rVar.O = null;
                    break;
                }
                break;
            default:
                ((c2) this.b).s0(i10, i11, z10);
                break;
        }
    }

    public String K(String str) {
        Bundle bundle = (Bundle) this.b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public Bundle M() {
        Bundle bundle = (Bundle) this.b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    @Override // ji.g1
    public void N(Editable editable) {
        s5 s5Var = (s5) this.b;
        ji.a aVar = s5Var.a;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = s5Var.r.E;
        }
        s5Var.u();
        b3 b3Var = s5Var.E;
        if (b3Var == null || s5Var.a == null) {
            return;
        }
        b3Var.a();
    }

    public da.a O(JSONObject jSONObject) {
        da.c aVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            aVar = new qb.b(7);
        } else {
            aVar = new rb.a(7);
        }
        return aVar.k0((ob.a) this.b, jSONObject);
    }

    @Override // ji.g1
    public /* synthetic */ boolean R(boolean z10) {
        return false;
    }

    @Override // ji.g1
    public void a(h1 h1Var) {
        b3 b3Var = ((s5) this.b).E;
        if (b3Var != null) {
            v3 v3Var = b3Var.a;
            v3.L1(v3Var, h1Var);
            v3Var.h3.v(h1Var, true);
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                l8.a aVar = (l8.a) this.b;
                a8.e eVar = new a8.e(0, (TaskCompletionSource) obj2);
                a8.c cVar = (a8.c) ((g) obj).u();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = a8.a.a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                aVar.writeToParcel(obtain, 0);
                cVar.G0(obtain, 2);
                break;
            default:
                l lVar = new l((TaskCompletionSource) obj2);
                i iVar = (i) ((i7.c) obj).u();
                x5.e eVar2 = (x5.e) this.b;
                Parcel K0 = iVar.K0();
                int i11 = f.a;
                K0.writeStrongBinder(lVar);
                f.c(K0, eVar2);
                iVar.L0(K0, 1);
                break;
        }
    }

    @Override // y2.n
    public void b() {
        l2.g gVar = (l2.g) this.b;
        gVar.A.b();
        b5 b5Var = gVar.C;
        if (b5Var != null) {
            throw b5Var;
        }
    }

    @Override // gi.s0
    public void close() {
        ((gi.s) this.b).finishFragment();
    }

    @Override // b5.p
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) se.b.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).createWebView(webView));
    }

    @Override // l.x
    public void d(l.l lVar, boolean z10) {
        switch (this.a) {
            case 18:
                ((g.s) this.b).g(lVar);
                break;
            default:
                if (lVar instanceof e0) {
                    ((e0) lVar).z.k().c(false);
                }
                x xVar = ((h) this.b).e;
                if (xVar != null) {
                    xVar.d(lVar, z10);
                    break;
                }
                break;
        }
    }

    @Override // ji.g1
    public boolean e() {
        s5 s5Var = (s5) this.b;
        b3 b3Var = s5Var.E;
        if (b3Var == null || s5Var.a == null) {
            return false;
        }
        return b3Var.a.R4();
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void f() {
        m0 m0Var = (m0) this.b;
        m0Var.a.lock();
        try {
            m0Var.m = new g0(m0Var, m0Var.j, m0Var.k, m0Var.d, m0Var.l, m0Var.a, m0Var.c);
            m0Var.m.x();
            m0Var.b.signalAll();
        } finally {
            m0Var.a.unlock();
        }
    }

    @Override // androidx.lifecycle.a0
    public void f0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        f0 f0Var = (f0) this.b;
        Handler handler = f0Var.A0;
        androidx.activity.i iVar = f0Var.B0;
        handler.removeCallbacks(iVar);
        TextView textView = f0Var.G0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(iVar, 2000L);
    }

    @Override // gi.s0
    public void g(long j3) {
        ((gi.s) this.b).presentFragment(co.R9(j3));
    }

    @Override // rg.x1
    public float get() {
        rb rbVar = (rb) this.b;
        int i10 = rbVar.F1;
        qg.m currentBrush = rbVar.O0.getCurrentBrush();
        return currentBrush == null ? qg.s0.e(i10).i : qg.s0.e(i10).f(String.valueOf(qg.m.a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override // b5.p
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) se.b.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getStatics());
    }

    @Override // ji.g1
    public /* synthetic */ boolean h(h1 h1Var) {
        return false;
    }

    @Override // fb.n
    public Object h2() {
        Constructor constructor = (Constructor) this.b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e7) {
            m8 m8Var = ib.c.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + ib.c.b(constructor) + "' with no args", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + ib.c.b(constructor) + "' with no args", e11.getCause());
        }
    }

    @Override // ji.g1
    public void i(int i10, int i11) {
        g2 g2Var;
        s5 s5Var = (s5) this.b;
        b3 b3Var = s5Var.E;
        if (b3Var == null || s5Var.a == null || (g2Var = b3Var.a.J3) == null) {
            return;
        }
        g2Var.f(i10, i11);
    }

    @Override // androidx.activity.result.b
    public void j(Object obj) {
        Map map = (Map) obj;
        i0 i0Var = (i0) this.b;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
        }
        androidx.fragment.app.e0 e0Var = (androidx.fragment.app.e0) i0Var.F.pollFirst();
        if (e0Var == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
        } else {
            String str = e0Var.a;
            if (i0Var.c.m(str) == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
            }
        }
    }

    @Override // ji.g1
    public /* synthetic */ boolean k(h1 h1Var) {
        return false;
    }

    @Override // gi.s0
    public void l() {
        gi.s sVar = (gi.s) this.b;
        le.b bVar = sVar.a;
        t0 t0Var = sVar.v;
        bVar.a(t0Var.n && t0Var.l == 0, true);
        sVar.d.Y2.N(true);
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void m(k6.a aVar) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
        xVar.o.lock();
        try {
            xVar.m = aVar;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // l.j
    public void n(l.l lVar) {
        Toolbar toolbar = (Toolbar) this.b;
        h hVar = toolbar.a.J;
        if (hVar == null || !hVar.g()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.W.c).iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.a0) it.next()).a.t();
            }
        }
    }

    @Override // ji.g1
    public void o(h1 h1Var, int i10, int i11) {
        b3 b3Var;
        q9 textSelectionHelper;
        s5 s5Var = (s5) this.b;
        if (s5Var.G || i10 == i11 || (b3Var = s5Var.E) == null || (textSelectionHelper = b3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.y() && textSelectionHelper.W == s5Var) {
            return;
        }
        s5Var.post(new y4(this, h1Var, i11, textSelectionHelper, i10, 4));
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        d6.c.h((d6.c) ((d6.j) this.b).c, "launchApplication", task);
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void p(int i10) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
        Lock lock = xVar.o;
        lock.lock();
        try {
            if (xVar.n) {
                xVar.n = false;
                com.google.android.gms.common.api.internal.x.k(xVar, i10);
            } else {
                xVar.n = true;
                xVar.d.onConnectionSuspended(i10);
            }
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override // l.x
    public boolean q(l.l lVar) {
        switch (this.a) {
            case 18:
                Window.Callback callback = ((g.s) this.b).f.getCallback();
                if (callback == null) {
                    return true;
                }
                callback.onMenuOpened(108, lVar);
                return true;
            default:
                h hVar = (h) this.b;
                if (lVar == hVar.c) {
                    return false;
                }
                ((e0) lVar).A.getClass();
                hVar.getClass();
                x xVar = hVar.e;
                if (xVar != null) {
                    return xVar.q(lVar);
                }
                return false;
        }
    }

    @Override // l.j
    public boolean s(l.l lVar, MenuItem menuItem) {
        ((Toolbar) this.b).getClass();
        return false;
    }

    @Override // b5.p
    public String[] t() {
        return ((WebViewProviderFactoryBoundaryInterface) this.b).getSupportedFeatures();
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void v(Bundle bundle) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
        xVar.o.lock();
        try {
            xVar.m = k6.a.e;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void x() {
        m0 m0Var = (m0) this.b;
        Iterator it = m0Var.f.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.c) it.next()).disconnect();
        }
        m0Var.o.F = Collections.EMPTY_SET;
    }

    @Override // ji.g1
    public void y(CharSequence charSequence) {
        b3 b3Var = ((s5) this.b).E;
        if (b3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        b3Var.a.s4(charSequence.toString());
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public boolean z() {
        return true;
    }

    @Override // org.telegram.ui.Components.wp0
    public void z0() {
        o5.j0((o5) this.b);
    }

    public /* synthetic */ c(i7.b bVar, x5.e eVar) {
        this.a = 21;
        this.b = eVar;
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public c(MediaInfo mediaInfo) {
        this.a = 9;
        o oVar = new o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public c(JSONObject jSONObject) {
        this.a = 9;
        this.b = new o(jSONObject);
    }

    public c(int i10) {
        this.a = i10;
        switch (i10) {
            case 5:
                this.b = new LinkedHashMap(0, 0.75f, true);
                break;
            case 20:
                break;
            default:
                this.b = new HashSet();
                break;
        }
    }

    public c(Bundle bundle) {
        this.a = 12;
        this.b = new Bundle(bundle);
    }

    @Override // org.telegram.ui.Components.wp0
    public /* synthetic */ void U() {
    }

    @Override // ji.g1
    public /* synthetic */ void r() {
    }

    @Override // ji.g1
    public /* synthetic */ void C(h1 h1Var) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void c(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void w(int i10) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void u(k6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }
}
