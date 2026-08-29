package za;

import a4.w;
import ag.h1;
import ag.k2;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.d0;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.fragment.app.f0;
import androidx.lifecycle.a0;
import androidx.recyclerview.widget.RecyclerView;
import b6.d;
import bg.v2;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import eg.z1;
import f2.d1;
import f2.l0;
import f2.n1;
import f2.p0;
import f2.x0;
import g.q;
import g9.h;
import g9.m;
import j$.util.DesugarCollections;
import j6.e;
import ja.e0;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import k1.f;
import l3.g0;
import l3.k;
import l3.n;
import l3.o0;
import l3.r;
import lh.d4;
import m.v3;
import m.y0;
import nh.g;
import org.json.JSONObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.rp0;
import org.telegram.ui.ws0;
import r0.j0;
import r0.m1;
import t7.j;
import z5.l;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class c implements a0, androidx.activity.result.b, s, v2, v0, o, l0, a3.b, r0.o, r, rp0, y0, f, ha0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public static p i(Looper looper, Object obj, String str) {
        l.i(obj, "Listener must not be null");
        l.i(looper, "Looper must not be null");
        return new p(looper, obj, str);
    }

    @Override // l3.r
    public void A() {
        j3.l0 l0Var = ((o0) this.b).O0;
        if (l0Var != null) {
            l0Var.a.n.d(2);
        }
    }

    public void B(g0 g0Var) {
        j jVar = (j) this.b;
        jVar.a = g0Var;
        Iterator it = jVar.c.iterator();
        while (it.hasNext()) {
            ((e) it.next()).b();
        }
        jVar.c.clear();
        jVar.b = null;
    }

    public void C(e3.f fVar, Thread thread, Throwable th2) {
        g9.p pVar = (g9.p) this.b;
        synchronized (pVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    g9.a0.a(pVar.e.R(new m(pVar, System.currentTimeMillis(), th2, thread, fVar)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e10);
            }
        }
    }

    public void D(String str, Bitmap bitmap) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(w.n("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.b).putParcelable(str, bitmap);
    }

    public void E(long j10, String str) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 0) {
            throw new IllegalArgumentException(w.n("The ", str, " key cannot be used to put a long"));
        }
        ((Bundle) this.b).putLong(str, j10);
    }

    public void F(String str, String str2) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(w.n("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.b).putCharSequence(str, str2);
    }

    public JSONObject G() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(h.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        h.c(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    h.c(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            h.c(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            h.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override // f2.l0
    public void H0(int i10, int i11) {
        ((p0) this.b).t(i10, i11);
    }

    @Override // r0.o
    public m1 I0(View view, m1 m1Var) {
        boolean z10;
        boolean z11;
        int d = m1Var.d();
        q qVar = (q) this.b;
        Context context = qVar.e;
        int d10 = m1Var.d();
        ActionBarContextView actionBarContextView = qVar.y;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qVar.y.getLayoutParams();
            if (qVar.y.isShown()) {
                if (qVar.h0 == null) {
                    qVar.h0 = new Rect();
                    qVar.i0 = new Rect();
                }
                Rect rect = qVar.h0;
                Rect rect2 = qVar.i0;
                rect.set(m1Var.b(), m1Var.d(), m1Var.c(), m1Var.a());
                ViewGroup viewGroup = qVar.F;
                Method method = v3.a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e10) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e10);
                    }
                }
                int i10 = rect.top;
                int i11 = rect.left;
                int i12 = rect.right;
                m1 f9 = j0.f(qVar.F);
                int b10 = f9 == null ? 0 : f9.b();
                int c3 = f9 == null ? 0 : f9.c();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || qVar.H != null) {
                    View view2 = qVar.H;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c3) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c3;
                            qVar.H.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    qVar.H = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c3;
                    qVar.F.addView(qVar.H, -1, layoutParams);
                }
                View view4 = qVar.H;
                r9 = view4 != null;
                if (r9 && view4.getVisibility() != 0) {
                    View view5 = qVar.H;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? f0.e.c(context, R.color.abc_decor_view_status_guard_light) : f0.e.c(context, R.color.abc_decor_view_status_guard));
                }
                if (!qVar.M && r9) {
                    d10 = 0;
                }
                z10 = r9;
                r9 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                r9 = false;
            }
            if (r9) {
                qVar.y.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = qVar.H;
        if (view6 != null) {
            view6.setVisibility(z10 ? 0 : 8);
        }
        return j0.h(view, d != d10 ? m1Var.f(m1Var.b(), d10, m1Var.c(), m1Var.a()) : m1Var);
    }

    @Override // bg.v2
    public void K(float f9) {
        ws0 ws0Var = (ws0) this.b;
        h1.e(ws0Var.L1).k(String.valueOf(ag.m.a.indexOf(ws0Var.S0.getCurrentBrush())), f9);
        k2 k2Var = ws0Var.G1;
        k2Var.c = f9;
        ws0Var.s0(k2Var, null);
    }

    @Override // androidx.lifecycle.a0
    public void S(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        androidx.biometric.q qVar = (androidx.biometric.q) this.b;
        if (charSequence != null) {
            if (qVar.R()) {
                qVar.W(charSequence);
            }
            qVar.h0.d(null);
        }
    }

    @Override // l3.r
    public void a(long j10) {
        n nVar = ((o0) this.b).F0;
        Handler handler = nVar.a;
        if (handler != null) {
            handler.post(new z1(nVar, j10, 3));
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 4:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                b6.a aVar = (b6.a) ((d) obj).u();
                z5.o oVar = (z5.o) this.b;
                Parcel G0 = aVar.G0();
                w6.a.c(G0, oVar);
                try {
                    aVar.b.transact(1, G0, null, 1);
                    G0.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th2) {
                    G0.recycle();
                    throw th2;
                }
            default:
                x7.a aVar2 = (x7.a) this.b;
                m7.d dVar = new m7.d(0, (TaskCompletionSource) obj2);
                m7.c cVar = (m7.c) ((m7.f) obj).u();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = m7.a.a;
                obtain.writeStrongBinder(dVar);
                obtain.writeInt(1);
                aVar2.writeToParcel(obtain, 0);
                cVar.E0(obtain, 2);
                return;
        }
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void c(w5.a aVar) {
        x xVar = (x) this.b;
        xVar.o.lock();
        try {
            xVar.l = aVar;
            x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // k1.f
    public Object d(bd.p pVar, uc.c cVar) {
        return ((k1.a0) this.b).d(new n1.c(pVar, null, 0), cVar);
    }

    @Override // l3.r
    public void f() {
        j3.l0 l0Var = ((o0) this.b).O0;
        if (l0Var != null) {
            l0Var.a.S = true;
        }
    }

    @Override // f2.l0
    public void f1(int i10, int i11) {
        ((p0) this.b).r(i10, i11, null);
    }

    @Override // pc.a
    public Object get() {
        String packageName = ((Context) ((pc.a) this.b).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // k1.f
    public md.b getData() {
        return ((k1.a0) this.b).c;
    }

    public MediaMetadataCompat h() {
        return new MediaMetadataCompat((Bundle) this.b);
    }

    @Override // f2.l0
    public void i0(int i10, int i11) {
        ((p0) this.b).s(i10, i11);
    }

    public void j(f2.a aVar) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int i10 = aVar.a;
        if (i10 == 1) {
            recyclerView.x.V(recyclerView, aVar.b, aVar.d);
            return;
        }
        if (i10 == 2) {
            recyclerView.x.Y(recyclerView, aVar.b, aVar.d);
        } else if (i10 == 4) {
            recyclerView.x.a0(recyclerView, aVar.b, aVar.d, aVar.c);
        } else {
            if (i10 != 8) {
                return;
            }
            recyclerView.x.X(recyclerView, aVar.b, aVar.d);
        }
    }

    @Override // com.google.android.gms.common.api.internal.o
    public /* synthetic */ void k(Object obj) {
        ((s7.c) obj).onLocationResult((LocationResult) this.b);
    }

    @Override // androidx.activity.result.b
    public void l(Object obj) {
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.b;
        f0 f0Var = (f0) j0Var.F.pollLast();
        if (f0Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = f0Var.a;
        int i10 = f0Var.b;
        androidx.fragment.app.s q6 = j0Var.c.q(str);
        if (q6 != null) {
            q6.x(i10, aVar.a, aVar.b);
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }

    public void m(e0 e0Var) {
        ((y2.o) ((v2.f) ((z9.b) this.b).get())).a("FIREBASE_APPQUALITY_SESSION", new v2.c("json"), new eg.n(this, 16)).a(new v2.a(null, e0Var, v2.d.a, null), new sg.j(17));
    }

    @Override // org.telegram.ui.Components.ha0
    public Paint.FontMetricsInt n() {
        return ((nh.m) this.b).f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // l3.r
    public void o(int i10, long j10, long j11) {
        n nVar = ((o0) this.b).F0;
        Handler handler = nVar.a;
        if (handler != null) {
            handler.post(new com.google.android.exoplayer2.upstream.d(nVar, i10, j10, j11, 1));
        }
    }

    @Override // l3.r
    public void onSkipSilenceEnabledChanged(boolean z10) {
        n nVar = ((o0) this.b).F0;
        Handler handler = nVar.a;
        if (handler != null) {
            handler.post(new hh.f(5, nVar, z10));
        }
    }

    public void q(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int u10 = recyclerView.e.u();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < u10; i15++) {
            View t10 = recyclerView.e.t(i15);
            n1 U = RecyclerView.U(t10);
            if (U != null && !U.r() && (i13 = U.c) >= i10 && i13 < i14) {
                U.a(2);
                if (obj == null) {
                    U.a(1024);
                } else if ((1024 & U.l) == 0) {
                    if (U.m == null) {
                        ArrayList arrayList = new ArrayList();
                        U.m = arrayList;
                        U.n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    U.m.add(obj);
                }
                ((x0) t10.getLayoutParams()).c = true;
            }
        }
        d1 d1Var = recyclerView.b;
        ArrayList arrayList2 = (ArrayList) d1Var.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            n1 n1Var = (n1) arrayList2.get(size);
            if (n1Var != null && (i12 = n1Var.c) >= i10 && i12 < i14) {
                n1Var.a(2);
                d1Var.f(size);
            }
        }
        recyclerView.t0 = true;
    }

    @Override // org.telegram.ui.Components.ha0
    public void r(int i10, int i11, CharSequence charSequence, boolean z10) {
        g gVar = ((nh.m) this.b).f;
        if (gVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gVar.getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, gVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            gVar.setText(spannableStringBuilder);
            gVar.setSelection(i10 + charSequence.length());
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.Components.rp0
    public void r0() {
        d4.j0((d4) this.b);
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void t(int i10) {
        w5.a aVar;
        x xVar = (x) this.b;
        Lock lock = xVar.o;
        lock.lock();
        try {
            if (!xVar.n && (aVar = xVar.m) != null && aVar.c()) {
                xVar.n = true;
                xVar.e.onConnectionSuspended(i10);
                lock.unlock();
            }
            xVar.n = false;
            x.k(xVar, i10);
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    public void u(int i10, int i11) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int u10 = recyclerView.e.u();
        for (int i12 = 0; i12 < u10; i12++) {
            n1 U = RecyclerView.U(recyclerView.e.t(i12));
            if (U != null && !U.r() && U.c >= i10) {
                U.n(i11, false);
                recyclerView.p0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            n1 n1Var = (n1) arrayList.get(i13);
            if (n1Var != null && n1Var.c >= i10) {
                n1Var.n(i11, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.s0 = true;
    }

    @Override // l3.r
    public void v(Exception exc) {
        f5.a.p("MediaCodecAudioRenderer", "Audio sink error", exc);
        n nVar = ((o0) this.b).F0;
        Handler handler = nVar.a;
        if (handler != null) {
            handler.post(new k(nVar, exc, 1));
        }
    }

    @Override // l3.r
    public void w() {
        ((o0) this.b).M0 = true;
    }

    public void x(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int u10 = recyclerView.e.u();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < u10; i20++) {
            n1 U = RecyclerView.U(recyclerView.e.t(i20));
            if (U != null && (i18 = U.c) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    U.n(i11 - i10, false);
                } else {
                    U.n(i14, false);
                }
                recyclerView.p0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            n1 n1Var = (n1) arrayList.get(i21);
            if (n1Var != null && (i17 = n1Var.c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    n1Var.n(i11 - i10, false);
                } else {
                    n1Var.n(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.s0 = true;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void y(Bundle bundle) {
        x xVar = (x) this.b;
        xVar.o.lock();
        try {
            Bundle bundle2 = xVar.k;
            if (bundle2 == null) {
                xVar.k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            xVar.l = w5.a.e;
            x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // f2.l0
    public void z(int i10, int i11) {
        ((p0) this.b).p(i10, i11);
    }

    public c(Set set) {
        this.a = 0;
        this.b = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            HashMap hashMap = (HashMap) this.b;
            bVar.getClass();
            hashMap.put(a.class, bVar.a);
        }
    }

    @Override // bg.v2
    public float get() {
        ws0 ws0Var = (ws0) this.b;
        int i10 = ws0Var.L1;
        ag.m currentBrush = ws0Var.S0.getCurrentBrush();
        if (currentBrush == null) {
            return h1.e(i10).i;
        }
        return h1.e(i10).f(String.valueOf(ag.m.a.indexOf(currentBrush)), currentBrush.d());
    }

    public c(l9.b bVar) {
        this.a = 28;
        this.b = new File(bVar.b, "com.crashlytics.settings.json");
    }

    public c(int i10) {
        this.a = i10;
        switch (i10) {
            case 8:
                this.b = Collections.newSetFromMap(new WeakHashMap());
                break;
            case 18:
                break;
            case 21:
                this.b = new g9.l[kf.b.values().length];
                break;
            default:
                this.b = new Bundle();
                break;
        }
    }

    public c(MediaMetadataCompat mediaMetadataCompat) {
        this.a = 1;
        Bundle bundle = new Bundle(mediaMetadataCompat.a);
        this.b = bundle;
        d0.a(bundle);
    }

    @Override // org.telegram.ui.Components.rp0
    public /* synthetic */ void M() {
    }

    public void e(int i10) {
    }

    public void g(int i10) {
    }

    @Override // org.telegram.ui.Components.ha0
    public /* synthetic */ void s(String str) {
    }

    @Override // org.telegram.ui.Components.ha0
    public /* synthetic */ void b(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.ha0
    public /* synthetic */ void p(TLRPC.TL_document tL_document, String str, Object obj) {
    }
}
