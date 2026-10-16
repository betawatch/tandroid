package ya;

import a0.h;
import a8.e;
import a8.g;
import ad.l;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.biometric.g0;
import androidx.fragment.app.i0;
import androidx.lifecycle.a0;
import b5.p;
import bi.ob;
import bi.pb;
import bi.r4;
import bi.s5;
import bi.t5;
import c6.d0;
import c6.e0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.x0;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.cast.v;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import di.a7;
import di.ac;
import di.i6;
import di.k8;
import di.kc;
import di.l0;
import di.mb;
import di.oc;
import di.yb;
import e2.m0;
import e2.x;
import eb.j;
import g6.f;
import g6.i;
import g6.q;
import g6.r;
import hg.j1;
import hg.z1;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.regex.Pattern;
import ji.d2;
import ji.h1;
import ji.h2;
import ji.j0;
import ji.k3;
import ji.l4;
import ji.r3;
import ji.u3;
import ji.v3;
import ji.w3;
import ji.x3;
import ji.z;
import l.k;
import l.w;
import m.t3;
import mg.o;
import oa.d;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.p71;
import org.telegram.ui.r01;
import org.telegram.ui.xz0;
import v7.f7;
import v7.u6;
import z3.m;
import z3.n;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class c implements s, p71, a0, androidx.activity.result.b, p, ob, OnCompleteListener, o, oc, f6.a, w, gb.p, z1, n, ti, j0, v3 {
    public static volatile c c;
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ c(r rVar, String[] strArr) {
        this.a = 20;
        this.b = strArr;
    }

    @Override // mg.o
    public void A() {
        ((l0) this.b).e.invalidate();
    }

    public float A0(int i10, int i11, int i12, int i13) {
        float f7;
        float f10;
        ec.b bVar = (ec.b) this.b;
        float z02 = z0(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f7 = i10 / (i10 - i14);
            i14 = 0;
        } else {
            int i16 = bVar.a;
            if (i14 >= i16) {
                float f11 = ((i16 - 1) - i10) / (i14 - i10);
                int i17 = i16 - 1;
                f7 = f11;
                i14 = i17;
            } else {
                f7 = 1.0f;
            }
        }
        float f12 = i11;
        int i18 = (int) (f12 - ((i13 - i11) * f7));
        if (i18 < 0) {
            f10 = f12 / (i11 - i18);
        } else {
            int i19 = bVar.b;
            if (i18 >= i19) {
                f10 = ((i19 - 1) - i11) / (i18 - i11);
                i15 = i19 - 1;
            } else {
                i15 = i18;
                f10 = 1.0f;
            }
        }
        return (z0(i10, i11, (int) (((i14 - i10) * f10) + i10), i15) + z02) - 1.0f;
    }

    @Override // di.oc
    public void B(float f7, int i10) {
        ArrayList arrayList;
        a7 a7Var = (a7) this.b;
        k8 k8Var = a7Var.d;
        if (k8Var == null || (arrayList = k8Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((k8) a7Var.d.T.get(i10)).P = f7;
    }

    @Override // ji.j0
    public void C0() {
        z zVar = (z) this.b;
        r3 r3Var = zVar.O;
        if (r3Var != null) {
            ji.a aVar = zVar.a;
            x3 x3Var = r3Var.a;
            h2 h2Var = x3Var.H3;
            if (h2Var != null) {
                h2Var.g();
            }
            x3Var.f3.onContentChanged();
        }
    }

    @Override // di.oc
    public void D(float f7) {
        a7 a7Var = (a7) this.b;
        k8 k8Var = a7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.P = f7;
        a7Var.c();
    }

    @Override // di.oc
    public void E(float f7, boolean z10) {
        a7 a7Var = (a7) this.b;
        k8 k8Var = a7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.Z = f7;
        k8Var.j = true;
        i81 i81Var = a7Var.e;
        if (i81Var == null || i81Var.p() == -9223372036854775807L) {
            return;
        }
        a7Var.m((long) (f7 * a7Var.e.p()));
    }

    @Override // hg.z1
    public /* synthetic */ boolean E0(int i10) {
        return true;
    }

    @Override // bi.ob
    public boolean G0(long j10, int i10, int i11, int i12, pb pbVar) {
        ImageReceiver imageReceiver;
        t5 t5Var;
        t5 t5Var2;
        pbVar.b = null;
        pbVar.c = null;
        xz0 xz0Var = (xz0) this.b;
        r01 r01Var = xz0Var.h;
        ArrayList arrayList = xz0Var.w;
        if (xz0Var.N < 0.2f) {
            pbVar.b = r01Var.getImageReceiver();
            pbVar.c = null;
            pbVar.a = r01Var;
            pbVar.h = 0.0f;
            pbVar.i = AndroidUtilities.displaySize.y;
            pbVar.g = (View) xz0Var.getParent();
            pbVar.d = xz0Var.y;
            pbVar.n = true;
            return true;
        }
        int i13 = 0;
        while (true) {
            if (i13 >= arrayList.size()) {
                imageReceiver = null;
                t5Var = null;
                t5Var2 = null;
                break;
            }
            t5 t5Var3 = (t5) arrayList.get(i13);
            if (t5Var3.e < 1.0f || t5Var3.a != i11) {
                i13++;
            } else {
                int i14 = i13 - 1;
                int i15 = i13 - 2;
                t5 d = ProfileStoriesView.d(i14 >= 0 ? (t5) arrayList.get(i14) : null, i15 >= 0 ? (t5) arrayList.get(i15) : null, t5Var3);
                imageReceiver = t5Var3.b;
                t5Var2 = d;
                t5Var = t5Var3;
            }
        }
        if (imageReceiver == null) {
            return false;
        }
        pbVar.c = imageReceiver;
        pbVar.b = null;
        pbVar.a = xz0Var;
        pbVar.h = 0.0f;
        pbVar.i = AndroidUtilities.displaySize.y;
        pbVar.g = (View) xz0Var.getParent();
        if (t5Var == null || t5Var2 == null) {
            pbVar.f = null;
            return true;
        }
        pbVar.f = new s5(this, new RectF(t5Var.m), t5Var, new RectF(t5Var2.m), t5Var2);
        return true;
    }

    @Override // b5.p
    public String[] H() {
        return ((WebViewProviderFactoryBoundaryInterface) this.b).getSupportedFeatures();
    }

    @Override // hg.z1
    public /* synthetic */ h K() {
        return null;
    }

    @Override // ji.v3
    public void L(ji.a aVar) {
        d2 d2Var = (d2) this.b;
        if (aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(d2Var)) {
            vi viVar = new vi(d2Var.getParentActivity(), d2Var, false, false, false, d2Var.getResourceProvider());
            viVar.c2 = new d(12);
            viVar.P = true;
            viVar.A1.setVisibility(8);
            viVar.w2 = new androidx.car.app.utils.a(d2Var, aVar, viVar, 11);
            viVar.t1();
            viVar.show();
        }
    }

    @Override // di.oc
    public void M(long j10) {
        a7 a7Var = (a7) this.b;
        k8 k8Var = a7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.r0 = j10;
        k8Var.j = true;
        a7Var.y(true);
    }

    @Override // di.oc
    public void N(boolean z10) {
        rg.d2 d2Var;
        kc kcVar = ((yb) ((a7) this.b)).C0;
        mb mbVar = kcVar.v1;
        if (mbVar == null) {
            return;
        }
        rg.d2 d2Var2 = null;
        if (!z10 && (mbVar.getSelectedEntity() instanceof rg.d2)) {
            kcVar.v1.C0(null, true);
            return;
        }
        if (!z10 || (kcVar.v1.getSelectedEntity() instanceof rg.d2)) {
            return;
        }
        i6 i6Var = kcVar.v1.R0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= i6Var.getChildCount()) {
                d2Var = null;
                break;
            }
            View childAt = i6Var.getChildAt(i11);
            if (childAt instanceof rg.d2) {
                d2Var = (rg.d2) childAt;
                break;
            }
            i11++;
        }
        if (d2Var != null) {
            mb mbVar2 = kcVar.v1;
            i6 i6Var2 = mbVar2.R0;
            while (true) {
                if (i10 >= i6Var2.getChildCount()) {
                    break;
                }
                View childAt2 = i6Var2.getChildAt(i10);
                if (childAt2 instanceof rg.d2) {
                    d2Var2 = (rg.d2) childAt2;
                    break;
                }
                i10++;
            }
            mbVar2.C0(d2Var2, true);
        }
    }

    @Override // di.oc
    public void O(float f7, int i10) {
        ArrayList arrayList;
        a7 a7Var = (a7) this.b;
        k8 k8Var = a7Var.d;
        if (k8Var == null || (arrayList = k8Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((k8) a7Var.d.T.get(i10)).V = f7;
    }

    @Override // hg.z1
    public void O0(ArrayList arrayList) {
        j1 j1Var = (j1) this.b;
        String str = j1Var.Z;
        if (str != null) {
            j1Var.U(str, j1Var.c0, j1Var.d0, j1Var.b0, j1Var.a0);
        }
    }

    @Override // di.oc
    public void P(float f7) {
        a7 a7Var = (a7) this.b;
        k8 k8Var = a7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.F = f7;
        k8Var.j = true;
        a7Var.w(true);
    }

    @Override // ji.v3
    public void Q() {
        d2 d2Var = (d2) this.b;
        d2.Z(d2Var, false, true);
        int i10 = d2Var.I0;
        d2Var.x0(i10 != 2 ? i10 : 0, true);
    }

    @Override // ji.v3
    public l80 R(View view) {
        return l80.H((d2) this.b, view);
    }

    @Override // ji.j0
    public void R0() {
        z zVar = (z) this.b;
        r3 r3Var = zVar.O;
        if (r3Var != null) {
            ji.a aVar = zVar.a;
            x3.P1(r3Var.a);
        }
    }

    @Override // di.oc
    public void S(float f7) {
        a7 a7Var = (a7) this.b;
        k8 k8Var = a7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.E = f7;
        k8Var.j = true;
        a7Var.w(true);
    }

    @Override // ji.v3
    public void T() {
        d2 d2Var = (d2) this.b;
        d2Var.z0();
        d2Var.C0();
    }

    @Override // ji.j0
    public o9 W() {
        r3 r3Var = ((z) this.b).O;
        if (r3Var != null) {
            return r3Var.a.getTextSelectionHelper();
        }
        return null;
    }

    @Override // z3.n
    public int X() {
        return 2;
    }

    @Override // di.oc
    public void Y(float f7, int i10) {
        ArrayList arrayList;
        a7 a7Var = (a7) this.b;
        k8 k8Var = a7Var.d;
        if (k8Var == null || (arrayList = k8Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((k8) a7Var.d.T.get(i10)).W = f7;
    }

    @Override // di.oc
    public void Z(float f7) {
        k8 k8Var = ((a7) this.b).d;
        if (k8Var == null) {
            return;
        }
        k8Var.a0 = f7;
        k8Var.j = true;
    }

    @Override // ji.j0
    public void a(h1 h1Var) {
        r3 r3Var = ((z) this.b).O;
        if (r3Var != null) {
            x3 x3Var = r3Var.a;
            x3.N1(x3Var, h1Var);
            x3Var.f3.V(h1Var, true);
        }
    }

    @Override // ji.j0
    public void a0(CharSequence charSequence) {
        r3 r3Var = ((z) this.b).O;
        if (r3Var != null) {
            r3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            r3Var.a.u4(charSequence.toString());
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        int i10 = this.a;
        Object obj3 = this.b;
        switch (i10) {
            case 1:
                e eVar = new e(0, (TaskCompletionSource) obj2);
                a8.c cVar = (a8.c) ((g) obj).u();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i11 = a8.a.a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                ((l8.a) obj3).writeToParcel(obtain, 0);
                cVar.F0(obtain, 2);
                break;
            case 10:
                g6.w wVar = (g6.w) obj;
                f fVar = (f) wVar.u();
                d0 d0Var = ((e0) obj3).k;
                Parcel N0 = fVar.N0();
                v.d(N0, d0Var);
                fVar.S0(N0, 18);
                f fVar2 = (f) wVar.u();
                fVar2.S0(fVar2.N0(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                break;
            case 20:
                q qVar = new q(0, (TaskCompletionSource) obj2);
                i iVar = (i) ((g6.s) obj).u();
                Parcel N02 = iVar.N0();
                v.d(N02, qVar);
                N02.writeStringArray((String[]) obj3);
                iVar.S0(N02, 5);
                break;
            default:
                h7.f fVar3 = new h7.f(1, (TaskCompletionSource) obj2);
                h7.d dVar = (h7.d) ((h7.e) obj).u();
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i12 = q7.a.a;
                obtain2.writeStrongBinder(fVar3);
                q7.a.b(obtain2, (GetCredentialRequest) obj3);
                q7.a.b(obtain2, gVar);
                ((h7.b) dVar).F0(obtain2, 1);
                break;
        }
    }

    @Override // ji.v3
    public boolean c(float f7) {
        boolean z10;
        d2 d2Var = (d2) this.b;
        FrameLayout frameLayout = d2Var.v0;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f7 >= r3[1]) {
                z10 = true;
                d2.Z(d2Var, z10, true);
                return z10;
            }
        }
        z10 = false;
        d2.Z(d2Var, z10, true);
        return z10;
    }

    @Override // di.oc
    public void c0() {
        ((a7) this.b).q(null);
    }

    @Override // b5.p
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) androidx.activity.result.c.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).createWebView(webView));
    }

    @Override // l.w
    public void d(k kVar, boolean z10) {
        ((g.r) this.b).g(kVar);
    }

    @Override // di.oc
    public void e(int i10) {
        di.e0 e0Var = ((a7) this.b).E;
        if (e0Var != null) {
            ArrayList arrayList = e0Var.h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                di.d0 d0Var = (di.d0) obj;
                if (d0Var.a == i10) {
                    d0Var.b.d(1.0f, true);
                    e0Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override // di.oc
    public void e0(float f7) {
        a7 a7Var = (a7) this.b;
        k8 k8Var = a7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.t0 = f7;
        k8Var.j = true;
        a7Var.y(true);
    }

    @Override // hg.z1
    public void f(int i10) {
        ((j1) this.b).l();
    }

    @Override // di.oc
    public void f0(int i10, long j10) {
        ArrayList arrayList;
        a7 a7Var = (a7) this.b;
        k8 k8Var = a7Var.d;
        if (k8Var == null || (arrayList = k8Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((k8) a7Var.d.T.get(i10)).X = j10;
    }

    @Override // di.oc
    public void g(float f7) {
        a7 a7Var = (a7) this.b;
        k8 k8Var = a7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.u0 = f7;
        k8Var.j = true;
        a7Var.c();
    }

    @Override // ji.j0
    public n9 g0() {
        return (z) this.b;
    }

    @Override // b5.p
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) androidx.activity.result.c.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getStatics());
    }

    @Override // ji.j0
    public void h() {
        z zVar = (z) this.b;
        r3 r3Var = zVar.O;
        if (r3Var != null) {
            x3.Q1(r3Var.a, zVar.a);
        }
    }

    @Override // ji.v3
    public void i(u3 u3Var, View view) {
        d2 d2Var = (d2) this.b;
        l80 H = l80.H(d2Var, view);
        H.Q = true;
        d2Var.x0 = l4.c(H, d2Var, d2Var.getParentActivity(), d2Var.getResourceProvider(), u3Var, false);
    }

    @Override // ji.v3
    public void i0(ji.i6 i6Var, String str) {
        d2 d2Var = (d2) this.b;
        if (d2Var.z0 == null) {
            d2Var.z0 = new t3(new f1.a(this, 24), d2Var.getResourceProvider());
        }
        d2Var.z0.f(i6Var, str);
    }

    @Override // gb.p
    public Object i2() {
        Type type = (Type) this.b;
        if (!(type instanceof ParameterizedType)) {
            throw new j("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new j("Invalid EnumSet type: " + type.toString());
    }

    @Override // androidx.activity.result.b
    public void j(Object obj) {
        switch (this.a) {
            case 5:
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
                    break;
                } else {
                    String str = e0Var.a;
                    if (i0Var.c.f(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    }
                }
                break;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar.b;
                int i11 = u.e("ProxyBillingActivityV2", intent).a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.M;
                if (resultReceiver != null) {
                    resultReceiver.send(i11, intent == null ? null : intent.getExtras());
                }
                int i12 = aVar.a;
                if (i12 != -1 || i11 != 0) {
                    u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i12 + " and billing's responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    @Override // ji.j0
    public ji.a j0() {
        return ((z) this.b).a;
    }

    @Override // di.oc
    public void k(float f7) {
        a7 a7Var = (a7) this.b;
        k8 k8Var = a7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.G = f7;
        k8Var.j = true;
        a7Var.c();
    }

    @Override // hg.z1
    public /* synthetic */ h k0() {
        return null;
    }

    @Override // ji.v3
    public void l(w3 w3Var, View view) {
        d2 d2Var = (d2) this.b;
        l80 H = l80.H(d2Var, view);
        H.Q = true;
        d2Var.getParentActivity();
        d2Var.getResourceProvider();
        d2Var.x0 = l4.b(H, d2Var, w3Var, false);
    }

    @Override // di.oc
    public void l0(long j10) {
        a7 a7Var = (a7) this.b;
        k8 k8Var = a7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.D = j10;
        k8Var.j = true;
        a7Var.w(true);
    }

    @Override // ji.v3
    public void m(int i10) {
        ((d2) this.b).o0(74, i10);
    }

    @Override // z3.n
    public void m0(byte[] bArr, int i10, int i11, m mVar, e2.j jVar) {
        d2.b a2;
        x xVar = (x) this.b;
        xVar.L(i10 + i11, bArr);
        xVar.N(i10);
        ArrayList arrayList = new ArrayList();
        while (xVar.a() > 0) {
            u6.f("Incomplete Mp4Webvtt Top Level box header found.", xVar.a() >= 8);
            int m10 = xVar.m();
            if (xVar.m() == 1987343459) {
                int i12 = m10 - 8;
                CharSequence charSequence = null;
                d2.a aVar = null;
                while (i12 > 0) {
                    u6.f("Incomplete vtt cue box header found.", i12 >= 8);
                    int m11 = xVar.m();
                    int m12 = xVar.m();
                    int i13 = m11 - 8;
                    byte[] bArr2 = xVar.a;
                    int i14 = xVar.b;
                    String str = m0.a;
                    String str2 = new String(bArr2, i14, i13, StandardCharsets.UTF_8);
                    xVar.O(i13);
                    i12 = (i12 - 8) - i13;
                    if (m12 == 1937011815) {
                        i4.g gVar = new i4.g();
                        i4.h.e(str2, gVar);
                        aVar = gVar.a();
                    } else if (m12 == 1885436268) {
                        charSequence = i4.h.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (aVar != null) {
                    aVar.a = charSequence;
                    aVar.b = null;
                    a2 = aVar.a();
                } else {
                    Pattern pattern = i4.h.a;
                    i4.g gVar2 = new i4.g();
                    gVar2.c = charSequence;
                    a2 = gVar2.a().a();
                }
                arrayList.add(a2);
            } else {
                xVar.O(m10 - 8);
            }
        }
        jVar.accept(new z3.b(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // di.oc
    public void n(long j10, boolean z10) {
        a7 a7Var = (a7) this.b;
        if (!z10) {
            a7Var.m(j10);
            return;
        }
        i81 i81Var = a7Var.e;
        if (i81Var != null) {
            i81Var.L(j10, true);
            return;
        }
        if (a7Var.j()) {
            a7Var.E.m(j10, true);
            return;
        }
        i81 i81Var2 = a7Var.y;
        if (i81Var2 != null) {
            i81Var2.L(j10, false);
        }
    }

    @Override // androidx.lifecycle.a0
    public void n0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        g0 g0Var = (g0) this.b;
        Handler handler = g0Var.A0;
        androidx.activity.i iVar = g0Var.B0;
        handler.removeCallbacks(iVar);
        TextView textView = g0Var.G0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(iVar, 2000L);
    }

    @Override // ji.v3
    public void o() {
        d2 d2Var = (d2) this.b;
        k3 k3Var = d2Var.P.l3;
        d2Var.x0((k3Var != null && k3Var.x() && d2Var.P.D4()) ? 1 : 0, true);
        d2Var.y0();
        d2Var.w0();
    }

    public float o0(jc.c cVar, jc.c cVar2) {
        int i10 = (int) cVar.a;
        int i11 = (int) cVar.b;
        int i12 = (int) cVar2.a;
        int i13 = (int) cVar2.b;
        float A0 = A0(i10, i11, i12, i13);
        float A02 = A0((int) cVar2.a, i13, (int) cVar.a, i11);
        return Float.isNaN(A0) ? A02 / 7.0f : Float.isNaN(A02) ? A0 / 7.0f : (A0 + A02) / 14.0f;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        d6.c.h((d6.c) ((d6.j) this.b).c, "joinApplication", task);
    }

    @Override // ji.v3
    public void onContentChanged() {
        d2 d2Var = (d2) this.b;
        if (d2Var.y0 != null) {
            boolean n32 = d2Var.P.n3();
            d2Var.L0 = n32;
            d2Var.y0.h(n32);
            d2Var.y0.invalidate();
        }
        d2Var.C0();
        Runnable runnable = d2Var.M0;
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable, 1000L);
    }

    @Override // bi.ob
    public void p(long j10, int i10, r4 r4Var) {
        xz0 xz0Var = (xz0) this.b;
        int i11 = ProfileStoriesView.s0;
        xz0Var.f(true, false);
        r4Var.run();
    }

    @Override // ji.j0
    public boolean p0() {
        z zVar = (z) this.b;
        r3 r3Var = zVar.O;
        if (r3Var == null) {
            return false;
        }
        ji.a aVar = zVar.a;
        return r3Var.a.T4();
    }

    @Override // l.w
    public boolean q(k kVar) {
        Window.Callback callback = ((g.r) this.b).f.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, kVar);
        return true;
    }

    public void q0() {
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (obj != null) {
                throw new ClassCastException();
            }
            try {
                throw null;
            } catch (Exception e) {
                l.d.log(Level.WARNING, "could not delete file ", (Throwable) e);
            }
        }
        arrayList.clear();
    }

    @Override // di.oc
    public void r() {
        a7 a7Var = (a7) this.b;
        a7Var.s(null, null, true);
        kc kcVar = ((yb) a7Var).C0;
        yb ybVar = kcVar.X0;
        if (ybVar != null) {
            ybVar.s(null, null, true);
        }
        mb mbVar = kcVar.v1;
        if (mbVar != null) {
            mbVar.p0();
        }
        ac acVar = kcVar.c1;
        if (acVar != null) {
            acVar.setHasRoundVideo(false);
        }
        k8 k8Var = kcVar.K1;
        if (k8Var != null) {
            File file = k8Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                kcVar.K1.o0 = null;
            }
            if (kcVar.K1.p0 != null) {
                try {
                    new File(kcVar.K1.p0).delete();
                } catch (Exception unused2) {
                }
                kcVar.K1.p0 = null;
            }
        }
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ boolean r0() {
        return false;
    }

    @Override // di.oc
    public void s(float f7) {
        a7 a7Var = (a7) this.b;
        k8 k8Var = a7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.s0 = f7;
        k8Var.j = true;
        a7Var.y(true);
    }

    @Override // f6.a
    public void t(Bitmap bitmap) {
        g6.b bVar = f6.h.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f7 = width;
            int height = bitmap.getHeight();
            int B = (int) a1.g.B(f7, 9.0f, 16.0f, 0.5f);
            float f10 = (B - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f10, f7, height + f10);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, B, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((f6.h) this.b).e(bitmap2, 0);
    }

    @Override // ji.j0
    public void t0(int i10, int i11) {
        z zVar = (z) this.b;
        r3 r3Var = zVar.O;
        if (r3Var != null) {
            ji.a aVar = zVar.a;
            h2 h2Var = r3Var.a.H3;
            if (h2Var != null) {
                h2Var.f(i10, i11);
            }
        }
    }

    @Override // ji.v3
    public void u() {
        d2 d2Var = (d2) this.b;
        d2Var.I0 = d2Var.K0;
        d2.Z(d2Var, false, false);
        d2Var.x0(2, true);
    }

    public int u0(int i10, int[] iArr) {
        int[] iArr2;
        int[] iArr3;
        int i11;
        int i12;
        gc.a aVar = (gc.a) this.b;
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            iArr2 = iArr;
        } else {
            int i13 = 1;
            while (i13 < length && iArr[i13] == 0) {
                i13++;
            }
            if (i13 == length) {
                iArr2 = new int[]{0};
            } else {
                int i14 = length - i13;
                int[] iArr4 = new int[i14];
                System.arraycopy(iArr, i13, iArr4, 0, i14);
                iArr2 = iArr4;
            }
        }
        int[] iArr5 = new int[i10];
        boolean z10 = true;
        for (int i15 = 0; i15 < i10; i15++) {
            int i16 = aVar.a[aVar.g + i15];
            if (i16 == 0) {
                i12 = iArr2[iArr2.length - 1];
            } else {
                if (i16 == 1) {
                    i11 = 0;
                    for (int i17 : iArr2) {
                        gc.a aVar2 = gc.a.h;
                        i11 ^= i17;
                    }
                } else {
                    i11 = iArr2[0];
                    int length2 = iArr2.length;
                    for (int i18 = 1; i18 < length2; i18++) {
                        i11 = aVar.c(i16, i11) ^ iArr2[i18];
                    }
                }
                i12 = i11;
            }
            iArr5[(i10 - 1) - i15] = i12;
            if (i12 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            return 0;
        }
        gc.b bVar = new gc.b(aVar, iArr5);
        gc.b a2 = aVar.a(i10, 1);
        gc.b bVar2 = aVar.c;
        if (a2.d() >= bVar.d()) {
            a2 = bVar;
            bVar = a2;
        }
        gc.b bVar3 = aVar.d;
        gc.b bVar4 = a2;
        gc.b bVar5 = bVar;
        gc.b bVar6 = bVar4;
        gc.b bVar7 = bVar2;
        while (bVar6.d() * 2 >= i10) {
            if (bVar6.e()) {
                throw new gc.c("r_{i-1} was zero");
            }
            int b10 = aVar.b(bVar6.c(bVar6.d()));
            gc.b bVar8 = bVar2;
            while (bVar5.d() >= bVar6.d() && !bVar5.e()) {
                int d = bVar5.d() - bVar6.d();
                int c10 = aVar.c(bVar5.c(bVar5.d()), b10);
                bVar8 = bVar8.a(aVar.a(d, c10));
                bVar5 = bVar5.a(bVar6.h(d, c10));
            }
            gc.b a10 = bVar8.g(bVar3).a(bVar7);
            if (bVar5.d() >= bVar6.d()) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + bVar5 + ", rLast: " + bVar6);
            }
            gc.b bVar9 = bVar5;
            bVar5 = bVar6;
            bVar6 = bVar9;
            bVar7 = bVar3;
            bVar3 = a10;
        }
        int c11 = bVar3.c(0);
        if (c11 == 0) {
            throw new gc.c("sigmaTilde(0) was zero");
        }
        int b11 = aVar.b(c11);
        gc.b[] bVarArr = {bVar3.f(b11), bVar6.f(b11)};
        gc.b bVar10 = bVarArr[0];
        gc.b bVar11 = bVarArr[1];
        int d10 = bVar10.d();
        if (d10 == 1) {
            iArr3 = new int[]{bVar10.c(1)};
        } else {
            int[] iArr6 = new int[d10];
            int i19 = 0;
            for (int i20 = 1; i20 < aVar.e && i19 < d10; i20++) {
                if (bVar10.b(i20) == 0) {
                    iArr6[i19] = aVar.b(i20);
                    i19++;
                }
            }
            if (i19 != d10) {
                throw new gc.c("Error locator degree does not match number of roots");
            }
            iArr3 = iArr6;
        }
        int length3 = iArr3.length;
        int[] iArr7 = new int[length3];
        for (int i21 = 0; i21 < length3; i21++) {
            int b12 = aVar.b(iArr3[i21]);
            int i22 = 1;
            for (int i23 = 0; i23 < length3; i23++) {
                if (i21 != i23) {
                    int c12 = aVar.c(iArr3[i23], b12);
                    i22 = aVar.c(i22, (c12 & 1) == 0 ? c12 | 1 : c12 & (-2));
                }
            }
            int c13 = aVar.c(bVar11.b(b12), aVar.b(i22));
            iArr7[i21] = c13;
            if (aVar.g != 0) {
                iArr7[i21] = aVar.c(c13, b12);
            }
        }
        for (int i24 = 0; i24 < iArr3.length; i24++) {
            int length4 = iArr.length - 1;
            int i25 = iArr3[i24];
            if (i25 == 0) {
                throw new IllegalArgumentException();
            }
            int i26 = length4 - aVar.b[i25];
            if (i26 < 0) {
                throw new gc.c("Bad error location");
            }
            iArr[i26] = iArr[i26] ^ iArr7[i24];
        }
        return iArr3.length;
    }

    @Override // org.telegram.ui.Components.ti
    public void v(hh hhVar) {
        int i10;
        i10 = ((m2) ((ig.m) this.b)).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(hhVar);
    }

    public synchronized void v0() {
        ((SharedPreferences) this.b).edit().clear().commit();
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ boolean w() {
        return false;
    }

    public jc.a w0(float f7, float f10, int i10, int i11) {
        jc.a b10;
        jc.a b11;
        int i12 = (int) (f10 * f7);
        int max = Math.max(0, i10 - i12);
        ec.b bVar = (ec.b) this.b;
        int min = Math.min(bVar.a - 1, i10 + i12) - max;
        float f11 = 3.0f * f7;
        if (min < f11) {
            throw dc.e.a();
        }
        int max2 = Math.max(0, i11 - i12);
        int min2 = Math.min(bVar.b - 1, i11 + i12) - max2;
        if (min2 < f11) {
            throw dc.e.a();
        }
        ec.b bVar2 = (ec.b) this.b;
        jc.b bVar3 = new jc.b(bVar2, max, max2, min, min2, f7);
        int i13 = bVar3.e;
        int i14 = bVar3.c;
        int i15 = i13 + i14;
        int i16 = bVar3.f;
        int i17 = (i16 / 2) + bVar3.d;
        int[] iArr = new int[3];
        for (int i18 = 0; i18 < i16; i18++) {
            int i19 = ((i18 & 1) == 0 ? (i18 + 1) / 2 : -((i18 + 1) / 2)) + i17;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i20 = i14;
            while (i20 < i15 && !bVar2.b(i20, i19)) {
                i20++;
            }
            int i21 = 0;
            while (i20 < i15) {
                if (!bVar2.b(i20, i19)) {
                    if (i21 == 1) {
                        i21++;
                    }
                    iArr[i21] = iArr[i21] + 1;
                } else if (i21 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i21 != 2) {
                    i21++;
                    iArr[i21] = iArr[i21] + 1;
                } else {
                    if (bVar3.a(iArr) && (b11 = bVar3.b(i19, i20, iArr)) != null) {
                        return b11;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i21 = 1;
                }
                i20++;
            }
            if (bVar3.a(iArr) && (b10 = bVar3.b(i19, i15, iArr)) != null) {
                return b10;
            }
        }
        ArrayList arrayList = bVar3.b;
        if (arrayList.isEmpty()) {
            throw dc.e.a();
        }
        return (jc.a) arrayList.get(0);
    }

    @Override // z3.n
    public /* synthetic */ z3.e x(int i10, int i11, byte[] bArr) {
        return t8.b.a(this, bArr, i11);
    }

    public Set x0() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.b);
        }
        return unmodifiableSet;
    }

    @Override // di.oc
    public void y(boolean z10) {
        a7 a7Var = (a7) this.b;
        if (a7Var.j()) {
            a7Var.E.getClass();
        }
        a7Var.x(-4, z10);
    }

    public boolean y0() {
        x0 x0Var = ((com.google.android.gms.common.api.internal.j0) this.b).d;
        return x0Var != null && x0Var.b();
    }

    public float z0(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        c cVar;
        int i20;
        int i21 = 1;
        boolean z10 = Math.abs(i13 - i11) > Math.abs(i12 - i10);
        if (z10) {
            i15 = i10;
            i14 = i11;
            i17 = i12;
            i16 = i13;
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        int abs = Math.abs(i16 - i14);
        int abs2 = Math.abs(i17 - i15);
        int i22 = 2;
        int i23 = (-abs) / 2;
        int i24 = i14 < i16 ? 1 : -1;
        int i25 = i15 < i17 ? 1 : -1;
        int i26 = i16 + i24;
        int i27 = i14;
        int i28 = i15;
        int i29 = 0;
        while (true) {
            if (i27 == i26) {
                i18 = i22;
                break;
            }
            int i30 = z10 ? i28 : i27;
            int i31 = z10 ? i27 : i28;
            boolean z11 = z10;
            if (i29 == i21) {
                i19 = i21;
                i20 = abs;
                cVar = this;
            } else {
                i19 = 0;
                cVar = this;
                i20 = abs;
            }
            if (i19 == ((ec.b) cVar.b).b(i30, i31)) {
                if (i29 == 2) {
                    return f7.b(i27, i28, i14, i15);
                }
                i29++;
            }
            i23 += abs2;
            if (i23 > 0) {
                if (i28 == i17) {
                    i18 = 2;
                    break;
                }
                i28 += i25;
                i23 -= i20;
            }
            i27 += i24;
            abs = i20;
            z10 = z11;
            i21 = 1;
            i22 = 2;
        }
        if (i29 == i18) {
            return f7.b(i26, i17, i14, i15);
        }
        return Float.NaN;
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public c(int i10) {
        this.a = i10;
        switch (i10) {
            case 2:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.b = new ArrayList();
                break;
            case 6:
                this.b = new LinkedHashMap(0, 0.75f, true);
                break;
            case 25:
                this.b = new x();
                break;
            default:
                this.b = new HashSet();
                break;
        }
    }

    public c(Context context) {
        boolean isEmpty;
        this.a = 12;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.b = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                v0();
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    @Override // ji.v3
    public void C() {
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ void F() {
    }

    @Override // mg.o
    public void h0() {
    }

    @Override // z3.n
    public /* synthetic */ void reset() {
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ void z() {
    }

    @Override // ji.v3
    public void G(int i10) {
    }

    @Override // mg.o
    public void I(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ void J(Object obj) {
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ void U(TLRPC.User user) {
    }

    @Override // bi.ob
    public /* synthetic */ void b(boolean z10) {
    }

    @Override // mg.o
    public void d0(boolean z10) {
    }

    @Override // ji.v3
    public void V(h1 h1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ void s0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override // org.telegram.ui.Components.ti
    public void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
