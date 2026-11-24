// default package

import android.graphics.SurfaceTexture;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.InvocationHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.json.JSONObject;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class x59 implements wec, zw9, gk, rd9, me9, jca, qq7, ldc, w5a, mga, d73, cja, ocb, cx9, ugc, WebMessageListenerBoundaryInterface, h89, m8a {
    public final /* synthetic */ byte a;
    public Object b;

    public x59(View view) {
        this.a = (byte) 14;
        if (Build.VERSION.SDK_INT < 30) {
            this.b = new et8((Object) view, (byte) 13);
            return;
        }
        ima imaVar = new ima(view, (byte) 13);
        imaVar.c = view;
        this.b = imaVar;
    }

    @Override // wec
    public final int A(View view) {
        return f69.w(view) - ((ViewGroup.MarginLayoutParams) ((g69) view.getLayoutParams())).leftMargin;
    }

    @Override // m8a
    public final /* bridge */ /* synthetic */ void B(f7a f7aVar, boolean z) {
    }

    @Override // m8a
    public final /* bridge */ /* synthetic */ void C(f7a f7aVar, int i) {
    }

    @Override // qq7
    public final wzc C0(View view, wzc wzcVar) {
        switch (this.a) {
            case 8:
                iq5 H0 = gm.H0(wzcVar, false);
                vs9 vs9Var = (vs9) this.b;
                vs9Var.w.setPadding(H0.a, H0.b, H0.c, H0.d);
                vs9Var.s.requestLayout();
                break;
            default:
                krb krbVar = (krb) this.b;
                iq5 g = wzcVar.a.g(519);
                krbVar.n = g;
                krbVar.c.setPadding(g.a, g.b, g.c, g.d);
                krbVar.b.requestLayout();
                break;
        }
        return wzc.b;
    }

    @Override // ugc
    public final boolean D(int i) {
        ogc ogcVar = ((wgc) this.b).M;
        if (ogcVar == null) {
            return false;
        }
        return ogcVar.c(i);
    }

    @Override // wec
    public final int E() {
        return ((f69) this.b).C();
    }

    @Override // rd9
    public final void E1() {
        rh9 rh9Var = ((th9) this.b).H;
        if (rh9Var != null) {
            ch9 ch9Var = ((yg9) rh9Var).a;
            of9 of9Var = ch9Var.R3;
            if (of9Var != null) {
                of9Var.g();
            }
            ch9Var.p3.onContentChanged();
        }
    }

    @Override // jca
    public final boolean F() {
        switch (this.a) {
            case 7:
                if (gm.C3()) {
                    ((pp9) this.b).J.k(0L, 33, null, null, null, null);
                    break;
                }
                break;
            default:
                ((StickersActivity) this.b).e0();
                break;
        }
        return true;
    }

    @Override // me9
    public final boolean G(ne9 ne9Var) {
        return false;
    }

    @Override // rd9
    public final gkb H0() {
        rh9 rh9Var = ((th9) this.b).H;
        if (rh9Var != null) {
            return ((yg9) rh9Var).a.getTextSelectionHelper();
        }
        return null;
    }

    @Override // mga
    public final void I() {
        ((bu5) this.b).j();
    }

    @Override // d73
    public final long J(long j, long j2) {
        return 0L;
    }

    @Override // mga
    public final a8 K(String str) {
        a8 g = ((bu5) this.b).g();
        g.setText(str);
        return g;
    }

    @Override // m8a
    public final /* bridge */ /* synthetic */ void L(f7a f7aVar, int i) {
    }

    @Override // wec
    public final int N() {
        f69 f69Var = (f69) this.b;
        return f69Var.m - f69Var.D();
    }

    @Override // ugc
    public final void O(ArrayList arrayList) {
        ogc ogcVar = ((wgc) this.b).M;
        if (ogcVar == null) {
            return;
        }
        ogcVar.a(arrayList);
    }

    @Override // rd9
    public final void O0(CharSequence charSequence) {
        rh9 rh9Var = ((th9) this.b).H;
        if (rh9Var != null) {
            yg9 yg9Var = (yg9) rh9Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            yg9Var.a.u4(charSequence.toString());
        }
    }

    @Override // m8a
    public final /* bridge */ /* synthetic */ void P(f7a f7aVar, String str) {
    }

    @Override // w5a
    public final void Q() {
        a6a a6aVar = (a6a) this.b;
        HashMap hashMap = a6aVar.n;
        a6aVar.getNotificationCenter().k(nm7.R0, new HashMap(hashMap));
        hashMap.clear();
    }

    @Override // m8a
    public final void R(f7a f7aVar, String str) {
        gt6 gt6Var;
        ce6 ce6Var = zfd.i;
        zfd zfdVar = (zfd) this.b;
        byte b = 1;
        ce6Var.b("onSessionStarted with transferType = %d", Integer.valueOf(zfdVar.e));
        if (zfdVar.a.E && zfdVar.e == 2) {
            if (zfdVar.h == null) {
                ce6Var.b("skip restoring session state due to null SessionState", new Object[0]);
            } else {
                k89 a = zfdVar.a();
                if (a == null) {
                    ce6Var.b("skip restoring session state due to null RemoteMediaClient", new Object[0]);
                } else {
                    ce6Var.b("resume SessionState to current session", new Object[0]);
                    r8a r8aVar = zfdVar.h;
                    if (r8aVar != null && (gt6Var = r8aVar.a) != null) {
                        k89.k.b("resume SessionState", new Object[0]);
                        ite.e("Must be called from the main thread.");
                        if (a.w()) {
                            k89.x(new qbd(a, gt6Var, b));
                        } else {
                            k89.t();
                        }
                    }
                }
            }
        }
        zfdVar.c();
    }

    @Override // me9
    public final void S(Editable editable) {
        ((ck9) this.b).g();
    }

    @Override // d73
    public final boolean T() {
        return true;
    }

    @Override // w5a
    public final void U(Location location) {
        a6a a6aVar = (a6a) this.b;
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeo.geo = tL_geoPoint;
        tL_geoPoint.lat = gm.b0(location.getLatitude());
        tL_messageMediaGeo.geo._long = gm.b0(location.getLongitude());
        HashMap hashMap = a6aVar.n;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            k47 k47Var = (k47) ((Map.Entry) it.next()).getValue();
            a6aVar.q0(y5a.d(tL_messageMediaGeo, k47.B0(k47Var.k), k47Var, null, null, null, true, 0));
        }
        hashMap.clear();
    }

    @Override // d73
    public final long V() {
        return 0L;
    }

    @Override // me9
    public final void W(ne9 ne9Var) {
        ll0 ll0Var;
        ck9 ck9Var = (ck9) this.b;
        ak9 ak9Var = ck9Var.s;
        if (ak9Var == null || (ll0Var = ck9Var.a) == null) {
            return;
        }
        ch9 ch9Var = ((jg9) ak9Var).a;
        ArrayList arrayList = ch9Var.t3;
        long j = ll0Var.t;
        if (j != 0) {
            int i = -1;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((ll0) arrayList.get(i2)).k.contains(Long.valueOf(j))) {
                    i = i2;
                }
            }
            if (i >= 0) {
                of9 of9Var = ch9Var.R3;
                if (of9Var != null) {
                    of9Var.d();
                }
                ll0 ll0Var2 = new ll0(new TL_iv.pageBlockParagraph(), 0, 0);
                ArrayList arrayList2 = ll0Var.k;
                ArrayList arrayList3 = ll0Var2.k;
                arrayList3.addAll(arrayList2);
                if (!arrayList3.isEmpty()) {
                    td4.w(1, arrayList3);
                }
                arrayList.add(i + 1, ll0Var2);
                ch9Var.t4();
                ch9Var.g3.O(false);
                of9 of9Var2 = ch9Var.R3;
                if (of9Var2 != null) {
                    of9Var2.h();
                }
                ch9Var.post(new vf9(ch9Var, ll0Var2, (byte) 26));
            }
        }
    }

    @Override // d73
    public final long X(long j) {
        return 1L;
    }

    @Override // wec
    public final View Y(int i) {
        return ((f69) this.b).q(i);
    }

    @Override // rd9
    public final fkb Y0() {
        return (th9) this.b;
    }

    @Override // me9
    public final boolean Z(boolean z) {
        return false;
    }

    @Override // ugc
    public final void a(int i, boolean z) {
        wgc wgcVar = (wgc) this.b;
        wgcVar.E = z;
        wgcVar.d = i;
        wgcVar.K(1);
        wgcVar.z(i, z);
        View[] viewArr = wgcVar.e;
        View view = viewArr[0];
        int measuredWidth = view != null ? view.getMeasuredWidth() : 0;
        View view2 = viewArr[1];
        if (view2 != null) {
            if (z) {
                wgcVar.F(view2, measuredWidth);
            } else {
                wgcVar.F(view2, -measuredWidth);
            }
        }
    }

    @Override // wec
    public final int a0(View view) {
        return f69.x(view) + ((ViewGroup.MarginLayoutParams) ((g69) view.getLayoutParams())).rightMargin;
    }

    @Override // h89
    public final void accept(Object obj, Object obj2) {
        byte b = 1;
        switch (this.a) {
            case 25:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                c5d c5dVar = (c5d) ((k5d) obj).k();
                nib nibVar = (nib) this.b;
                Parcel c = c5dVar.c();
                g4d.b(c, nibVar);
                try {
                    c5dVar.b.transact(1, c, null, 1);
                    c.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th) {
                    c.recycle();
                    throw th;
                }
            case 26:
                s5d s5dVar = (s5d) this.b;
                r5d r5dVar = new r5d((TaskCompletionSource) obj2);
                n6d n6dVar = (n6d) ((t5d) obj).k();
                String str = s5dVar.l;
                Parcel e = n6dVar.e();
                int i = y5d.a;
                e.writeStrongBinder(r5dVar);
                e.writeString(str);
                n6dVar.f(e, 2);
                return;
            case 27:
                mt5 mt5Var = (mt5) this.b;
                w7d w7dVar = (w7d) obj;
                w7dVar.getClass();
                n7d n7dVar = new n7d((TaskCompletionSource) obj2, b);
                try {
                    xef xefVar = (xef) w7dVar.k();
                    Bundle B = w7dVar.B();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i2 = bjd.a;
                    obtain.writeInt(1);
                    mt5Var.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    B.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(n7dVar);
                    try {
                        xefVar.a.transact(14, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th2) {
                        obtain.recycle();
                        throw th2;
                    }
                } catch (RemoteException e2) {
                    Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e2);
                    Bundle bundle = Bundle.EMPTY;
                    fxe.a(Status.h, Boolean.FALSE, n7dVar.c);
                    return;
                }
            default:
                mjf mjfVar = (mjf) obj;
                z8d z8dVar = (z8d) mjfVar.k();
                ugd ugdVar = ((bhd) this.b).l;
                Parcel R = z8dVar.R();
                kid.d(R, ugdVar);
                z8dVar.W(R, 18);
                z8d z8dVar2 = (z8d) mjfVar.k();
                z8dVar2.W(z8dVar2.R(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                return;
        }
    }

    @Override // ugc
    public final boolean b() {
        wgc wgcVar = (wgc) this.b;
        return (wgcVar.y || wgcVar.I) ? false : true;
    }

    @Override // cja
    public final float b0() {
        int d;
        switch (this.a) {
            case 15:
                d = eh0.d(((nxa) this.b).c0);
                break;
            default:
                d = eh0.d(((yfb) this.b).c0);
                break;
        }
        return b10.c(9.66f, d, 0);
    }

    @Override // ugc
    public final void c() {
        ((wgc) this.b).q();
    }

    @Override // mga
    public final a8 c0(int i, Runnable runnable, String str, boolean z, boolean z2) {
        bu5 bu5Var = (bu5) this.b;
        int y = bu5Var.y();
        bu5Var.b(i, str, new yl6((Object) runnable, z2, (Object) bu5Var, (byte) 23), z);
        View x = bu5Var.x(y);
        if (x instanceof a8) {
            return (a8) x;
        }
        return null;
    }

    @Override // rd9
    public final void d(ne9 ne9Var) {
        switch (this.a) {
            case 5:
                rh9 rh9Var = ((th9) this.b).H;
                if (rh9Var != null) {
                    ch9 ch9Var = ((yg9) rh9Var).a;
                    ch9Var.i4(ne9Var);
                    ch9Var.p3.j(ne9Var, true);
                    break;
                }
                break;
            default:
                ak9 ak9Var = ((ck9) this.b).s;
                if (ak9Var != null) {
                    ch9 ch9Var2 = ((jg9) ak9Var).a;
                    ch9Var2.i4(ne9Var);
                    ch9Var2.p3.j(ne9Var, true);
                    break;
                }
                break;
        }
    }

    @Override // rd9
    public final ll0 d1() {
        return ((th9) this.b).a;
    }

    @Override // d73
    public final long e(long j) {
        return 0L;
    }

    @Override // d73
    public final long e0(long j, long j2) {
        return 1L;
    }

    @Override // zw9
    public final void f(float f) {
        id9 id9Var = (id9) this.b;
        k47 k47Var = id9Var.Q;
        if (k47Var == null) {
            return;
        }
        k47Var.b0 = f;
        MediaController.w().h0(id9Var.Q, f);
    }

    public final void f0() {
        c99 c99Var = ((e99) this.b).d;
        if (c99Var != null) {
            b99 b99Var = c99Var.s;
            if (b99Var != null) {
                c99Var.cancelRunnable(b99Var);
                c99Var.s = null;
            }
            b99 b99Var2 = new b99(c99Var, (byte) 1);
            c99Var.s = b99Var2;
            c99Var.postRunnable(b99Var2, 1L);
        }
    }

    @Override // ugc
    public final void g(float f) {
        wgc wgcVar = (wgc) this.b;
        View[] viewArr = wgcVar.e;
        if (f == 1.0f) {
            if (viewArr[1] != null) {
                wgcVar.G();
                wgcVar.h.put(wgcVar.f[1], viewArr[1]);
                wgcVar.removeView(viewArr[1]);
                wgcVar.F(viewArr[0], 0.0f);
                viewArr[1] = null;
            }
            wgcVar.A(wgcVar.b);
            return;
        }
        View view = viewArr[1];
        if (view == null) {
            return;
        }
        if (wgcVar.E) {
            wgcVar.F(view, (1.0f - f) * viewArr[0].getMeasuredWidth());
            wgcVar.F(viewArr[0], (-r0.getMeasuredWidth()) * f);
        } else {
            wgcVar.F(view, (1.0f - f) * (-viewArr[0].getMeasuredWidth()));
            wgcVar.F(viewArr[0], r0.getMeasuredWidth() * f);
        }
        wgcVar.x(false);
    }

    @Override // rd9
    public final boolean g1() {
        rh9 rh9Var = ((th9) this.b).H;
        return rh9Var != null && ((yg9) rh9Var).a.V4();
    }

    @Override // cx9
    public final CharSequence getContentDescription() {
        return null;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // zw9
    public final void h(float f) {
        k47 k47Var = ((id9) this.b).Q;
        if (k47Var == null) {
            return;
        }
        k47Var.b0 = f;
    }

    @Override // cja
    public final int h0() {
        switch (this.a) {
            case 15:
                return ((nxa) this.b).d0;
            default:
                return ((yfb) this.b).d0;
        }
    }

    @Override // me9
    public final boolean i() {
        return false;
    }

    public final r9a i0(JSONObject jSONObject) {
        iaa jk2Var;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            jk2Var = new q7f((byte) 17);
        } else {
            jk2Var = new jk2((byte) 26);
        }
        return jk2Var.q0((k1f) this.b, jSONObject);
    }

    @Override // cx9
    public final int j0() {
        return 0;
    }

    @Override // rd9
    public final void j2() {
        rh9 rh9Var = ((th9) this.b).H;
        if (rh9Var != null) {
            ((yg9) rh9Var).a.W3();
        }
    }

    public final void k0(u69 u69Var, az8 az8Var, az8 az8Var2) {
        int i;
        int i2;
        boolean z;
        u69 T;
        int i3;
        RecyclerView recyclerView = (RecyclerView) this.b;
        recyclerView.b.l(u69Var);
        recyclerView.h(u69Var);
        u69Var.q(false);
        jka jkaVar = (jka) recyclerView.d0;
        jkaVar.getClass();
        int i4 = az8Var.b;
        int i5 = az8Var.c;
        View view = u69Var.a;
        if (az8Var2 == null) {
            i2 = view.getLeft();
            i = view.getTop();
        } else {
            int i6 = az8Var2.b;
            i = az8Var2.c;
            i2 = i6;
        }
        if (u69Var.j() || (i4 == i2 && i5 == i)) {
            int i7 = u69Var.h;
            int i8 = -1;
            if (i7 != -1) {
                for (int i9 = 0; i9 < recyclerView.getChildCount(); i9++) {
                    View childAt = recyclerView.getChildAt(i9);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i3 = T.h) >= 0 && i3 < i7 && i3 > i8) {
                        i8 = i3;
                    }
                }
            }
            u69Var.i = (u69Var.h - i8) + (i8 * 1000);
            jkaVar.s(u69Var, az8Var);
            z = true;
        } else {
            view.layout(i2, i, view.getWidth() + i2, view.getHeight() + i);
            z = jkaVar.r(u69Var, az8Var, i4, i5, i2, i);
        }
        if (z) {
            recyclerView.n0();
        }
    }

    @Override // m8a
    public final void l(f7a f7aVar, int i) {
        ce6 ce6Var = zfd.i;
        ce6Var.b("onSessionEnded with error = %d", Integer.valueOf(i));
        zfd zfdVar = (zfd) this.b;
        byte b = zfdVar.e;
        if (b != 0) {
            if (zfdVar.h != null) {
                ce6Var.b("notify transferred with type = %d, sessionState = %s", Integer.valueOf(b), zfdVar.h);
                Iterator it = new HashSet(zfdVar.b).iterator();
                while (it.hasNext()) {
                    bpe bpeVar = (bpe) it.next();
                    byte b2 = zfdVar.e;
                    switch (bpeVar.a) {
                        case 0:
                            hue.j.b("onTransferred with type = %d", Integer.valueOf(b2));
                            hue hueVar = (hue) bpeVar.b;
                            hueVar.c();
                            y5f b3 = hueVar.c.b(hueVar.g);
                            m5f m = n5f.m(b3.d());
                            m.c();
                            n5f.v((n5f) m.b, b2);
                            b3.e((n5f) m.a());
                            hueVar.a.a((a6f) b3.a(), nm7.G3);
                            hueVar.i = false;
                            hueVar.g = null;
                            break;
                    }
                }
            } else {
                ce6Var.b("No need to notify with null sessionState", new Object[0]);
            }
        } else {
            ce6Var.b("No need to notify transferred if the transfer type is unknown", new Object[0]);
        }
        if (zfdVar.e == 2) {
            return;
        }
        zfdVar.c();
    }

    public final void l0(u69 u69Var) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        f69 f69Var = recyclerView.y;
        View view = u69Var.a;
        ki2 ki2Var = recyclerView.b;
        mx6 mx6Var = f69Var.a;
        ai4 ai4Var = (ai4) mx6Var.b;
        int indexOfChild = ((RecyclerView) ai4Var.b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((vh2) mx6Var.c).z(indexOfChild)) {
                mx6Var.y0(view);
            }
            ai4Var.S(indexOfChild);
        }
        ki2Var.h(view);
    }

    @Override // d73
    public final long m(long j, long j2) {
        return 0L;
    }

    @Override // cx9
    public final void n(boolean z, float f) {
        rob robVar = (rob) this.b;
        robVar.n1 = f;
        robVar.p1();
    }

    @Override // m8a
    public final /* bridge */ /* synthetic */ void o(f7a f7aVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z, InvocationHandler invocationHandler2) {
        ry ryVar;
        ry ryVar2;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) oz0.a(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        cf9[] cf9VarArr = new cf9[ports.length];
        for (int i = 0; i < ports.length; i++) {
            InvocationHandler invocationHandler3 = ports[i];
            cf9 cf9Var = new cf9((byte) 18);
            cf9Var.b = (WebMessagePortBoundaryInterface) oz0.a(WebMessagePortBoundaryInterface.class, invocationHandler3);
            cf9VarArr[i] = cf9Var;
        }
        if (nwc.a.b()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) oz0.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type == 0) {
                ryVar = new ry(webMessagePayloadBoundaryInterface.getAsString());
            } else {
                if (type != 1) {
                    ryVar2 = null;
                    if (ryVar2 == null) {
                        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) oz0.a(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                        ((jwc) this.b).b(webView, ryVar2, uri, z, (yu5) jsReplyProxyBoundaryInterface.getOrCreatePeer(new ml(jsReplyProxyBoundaryInterface, (byte) 2)));
                        return;
                    }
                    return;
                }
                ryVar = new ry(webMessagePayloadBoundaryInterface.getAsArrayBuffer());
            }
        } else {
            ryVar = new ry(webMessageBoundaryInterface.getData());
        }
        ryVar2 = ryVar;
        if (ryVar2 == null) {
        }
    }

    @Override // ldc
    public final void onRenderedFirstFrame() {
        gm.c3(new kf9(this, (byte) 24));
    }

    @Override // ldc
    public final void onStateChanged(boolean z, int i) {
        tw9 tw9Var = (tw9) this.b;
        if (i == 4) {
            tw9Var.dismiss();
        } else {
            gm.r(tw9Var.a0);
            gm.d3(tw9Var.a0, 16L);
        }
    }

    @Override // ldc
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // rd9
    public final void p() {
        th9 th9Var = (th9) this.b;
        rh9 rh9Var = th9Var.H;
        if (rh9Var != null) {
            ((yg9) rh9Var).a.T3(th9Var.a);
        }
    }

    @Override // m8a
    public final /* bridge */ /* synthetic */ void q(f7a f7aVar, int i) {
    }

    @Override // me9
    public final void r(ne9 ne9Var, int i, int i2) {
        ak9 ak9Var;
        gkb textSelectionHelper;
        ck9 ck9Var = (ck9) this.b;
        if (ck9Var.x || i == i2 || (ak9Var = ck9Var.s) == null || (textSelectionHelper = ((jg9) ak9Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        ne9Var.post(new g01((Object) this, (Object) ne9Var, i2, (Object) textSelectionHelper, i, (byte) 4));
    }

    @Override // rd9
    public final void r1(int i, int i2) {
        of9 of9Var;
        rh9 rh9Var = ((th9) this.b).H;
        if (rh9Var == null || (of9Var = ((yg9) rh9Var).a.R3) == null) {
            return;
        }
        of9Var.f(i, i2);
    }

    @Override // jca
    public final void s() {
        switch (this.a) {
            case 7:
                break;
            default:
                ((StickersActivity) this.b).e0();
                break;
        }
    }

    @Override // cja
    public final void t(boolean z) {
        switch (this.a) {
            case 15:
                nxa nxaVar = (nxa) this.b;
                fn0 fn0Var = nxaVar.Z;
                if (fn0Var != null) {
                    fn0Var.a(z, true);
                }
                g15 g15Var = nxaVar.s;
                if (g15Var != null) {
                    g15Var.invalidate();
                    break;
                }
                break;
            default:
                yfb yfbVar = (yfb) this.b;
                fn0 fn0Var2 = yfbVar.Z;
                if (fn0Var2 != null) {
                    fn0Var2.a(z, true);
                }
                g15 g15Var2 = yfbVar.s;
                if (g15Var2 != null) {
                    g15Var2.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // d73
    public final long u(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // me9
    public final boolean v(ne9 ne9Var) {
        return false;
    }

    @Override // d73
    public final b19 w(long j) {
        return (b19) this.b;
    }

    @Override // gk
    public final void y(int i, int i2, boolean z) {
        jf9 jf9Var = (jf9) this.b;
        jf9Var.w0(i, i2, z);
        j67 j67Var = jf9Var.P0;
        if (j67Var != null) {
            j67Var.g();
            jf9Var.P0 = null;
        }
    }

    @Override // m8a
    public final /* bridge */ /* synthetic */ void z(f7a f7aVar) {
    }

    @Override // ldc
    public final void onRenderedFirstFrame(tk tkVar) {
    }

    private final void g0() {
    }

    @Override // me9
    public final void H() {
    }

    @Override // ugc
    public final void d0() {
    }

    @Override // cx9
    public final void x() {
    }

    @Override // me9
    public final void M(CharSequence charSequence) {
    }

    @Override // ldc
    public final void onSeekFinished(tk tkVar) {
    }

    @Override // ldc
    public final void onSeekStarted(tk tkVar) {
    }

    @Override // ldc
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public /* synthetic */ x59(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public x59(byte b) {
        this.a = b;
        switch (b) {
            case 21:
                break;
            default:
                this.b = new fgf((byte) 17);
                break;
        }
    }

    @Override // d73
    public final long j(long j, long j2) {
        return j2;
    }

    @Override // me9
    public final void k(int i, int i2) {
    }

    @Override // ldc
    public final void onError(ndc ndcVar, Exception exc) {
    }

    @Override // ldc
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
    }
}
