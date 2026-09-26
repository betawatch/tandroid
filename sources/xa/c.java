package xa;

import a8.e;
import a8.g;
import ai.e6;
import ai.q4;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.Window;
import android.widget.TextView;
import androidx.biometric.c0;
import androidx.biometric.e0;
import androidx.lifecycle.a0;
import c3.j;
import ci.nb;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.internal.cast.v;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import da.d;
import fb.n;
import fi.s0;
import fi.t0;
import g6.i;
import g6.q;
import g6.r;
import gg.b2;
import gg.k1;
import i7.f;
import ii.e2;
import ii.i1;
import ii.i2;
import ii.k0;
import ii.n4;
import ii.p4;
import ii.t3;
import ii.x3;
import ii.z;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import l.x;
import n6.l;
import org.json.JSONObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.jq0;
import org.telegram.ui.Components.no0;
import org.telegram.ui.vi0;
import org.telegram.ui.wn;
import pg.m;
import pg.t1;
import pg.u0;
import qg.w1;
import v7.j5;
import v7.u7;
import w9.h;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class c implements s, jq0, a0, androidx.activity.result.b, ce.b, w1, v0, OnSuccessListener, SuccessContinuation, f6.a, n, s0, x, b2, he.a, no0, d5, k0 {
    public static volatile c c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ c(r rVar, String[] strArr) {
        this.a = 22;
        this.b = strArr;
    }

    public static p t(Looper looper, Object obj, String str) {
        l.i(obj, "Listener must not be null");
        l.i(looper, "Looper must not be null");
        return new p(looper, obj, str);
    }

    @Override // ii.k0
    public q9 C() {
        n4 n4Var = ((p4) this.b).G;
        if (n4Var != null) {
            return ((t3) n4Var).a.getTextSelectionHelper();
        }
        return null;
    }

    @Override // ii.k0
    public void E(CharSequence charSequence) {
        n4 n4Var = ((p4) this.b).G;
        if (n4Var != null) {
            t3 t3Var = (t3) n4Var;
            t3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            t3Var.a.t4(charSequence.toString());
        }
    }

    @Override // gg.b2
    public void F(ArrayList arrayList) {
        k1 k1Var = (k1) this.b;
        String str = k1Var.Z;
        if (str != null) {
            k1Var.U(str, k1Var.c0, k1Var.d0, k1Var.b0, k1Var.a0);
        }
    }

    @Override // ii.k0
    public p9 I() {
        return (p4) this.b;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        e2 e2Var = (e2) this.b;
        e2Var.s0(i10, i11, z10);
        vi0 vi0Var = e2Var.O0;
        if (vi0Var != null) {
            vi0Var.i();
            e2Var.O0 = null;
        }
    }

    @Override // qg.w1
    public void K(float f7) {
        nb nbVar = (nb) this.b;
        u0.e(nbVar.F1).k(String.valueOf(m.a.indexOf(nbVar.O0.getCurrentBrush())), f7);
        t1 t1Var = nbVar.A1;
        t1Var.c = f7;
        nbVar.E0(t1Var, null, false);
    }

    @Override // ii.k0
    public ii.a M() {
        return ((p4) this.b).a;
    }

    @Override // ii.k0
    public boolean N() {
        p4 p4Var = (p4) this.b;
        n4 n4Var = p4Var.G;
        if (n4Var == null) {
            return false;
        }
        ii.a aVar = p4Var.a;
        return ((t3) n4Var).a.S4();
    }

    @Override // ii.k0
    public void Q(int i10, int i11) {
        p4 p4Var = (p4) this.b;
        n4 n4Var = p4Var.G;
        if (n4Var != null) {
            ii.a aVar = p4Var.a;
            i2 i2Var = ((t3) n4Var).a.J3;
            if (i2Var != null) {
                i2Var.f(i10, i11);
            }
        }
    }

    @Override // ii.k0
    public void W() {
        p4 p4Var = (p4) this.b;
        n4 n4Var = p4Var.G;
        if (n4Var != null) {
            ii.a aVar = p4Var.a;
            x3 x3Var = ((t3) n4Var).a;
            i2 i2Var = x3Var.J3;
            if (i2Var != null) {
                i2Var.g();
            }
            x3Var.h3.onContentChanged();
        }
    }

    @Override // gg.b2
    public void a(int i10) {
        ((k1) this.b).l();
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                l8.a aVar = (l8.a) this.b;
                e eVar = new e(0, (TaskCompletionSource) obj2);
                a8.c cVar = (a8.c) ((g) obj).u();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = a8.a.a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                aVar.writeToParcel(obtain, 0);
                cVar.G0(obtain, 2);
                break;
            case 22:
                q qVar = new q(2, (TaskCompletionSource) obj2);
                i iVar = (i) ((g6.s) obj).u();
                String[] strArr = (String[]) this.b;
                Parcel O0 = iVar.O0();
                v.d(O0, qVar);
                O0.writeStringArray(strArr);
                iVar.T0(O0, 7);
                break;
            default:
                i7.b bVar = (i7.b) this.b;
                i7.a aVar2 = new i7.a((TaskCompletionSource) obj2);
                i7.i iVar2 = (i7.i) ((i7.c) obj).u();
                String str = bVar.k;
                Parcel K0 = iVar2.K0();
                int i11 = f.a;
                K0.writeStrongBinder(aVar2);
                K0.writeString(str);
                iVar2.L0(K0, 2);
                break;
        }
    }

    @Override // org.telegram.ui.Components.no0
    public void b(float f7) {
        z zVar = (z) this.b;
        MessageObject messageObject = zVar.P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(zVar.P, f7);
    }

    @Override // ii.k0, ii.h1
    public void c(i1 i1Var) {
        n4 n4Var = ((p4) this.b).G;
        if (n4Var != null) {
            x3 x3Var = ((t3) n4Var).a;
            x3.M1(x3Var, i1Var);
            x3Var.h3.t(i1Var, true);
        }
    }

    @Override // fi.s0
    public void close() {
        ((fi.s) this.b).finishFragment();
    }

    @Override // org.telegram.ui.Components.no0
    public void d(float f7) {
        MessageObject messageObject = ((z) this.b).P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
    }

    @Override // fi.s0
    public void e(long j3) {
        ((fi.s) this.b).presentFragment(wn.R9(j3));
    }

    @Override // fi.s0
    public void f() {
        fi.s sVar = (fi.s) this.b;
        le.c cVar = sVar.a;
        t0 t0Var = sVar.v;
        cVar.a(t0Var.n && t0Var.l == 0, true);
        sVar.d.Y2.N(true);
    }

    @Override // l.x
    public void g(l.l lVar, boolean z10) {
        g.r rVar;
        g.s sVar = (g.s) this.b;
        l.l k10 = lVar.k();
        int i10 = 0;
        boolean z11 = k10 != lVar;
        if (z11) {
            lVar = k10;
        }
        g.r[] rVarArr = sVar.U;
        int length = rVarArr != null ? rVarArr.length : 0;
        while (true) {
            if (i10 < length) {
                rVar = rVarArr[i10];
                if (rVar != null && rVar.h == lVar) {
                    break;
                } else {
                    i10++;
                }
            } else {
                rVar = null;
                break;
            }
        }
        if (rVar != null) {
            if (!z11) {
                sVar.h(rVar, z10);
            } else {
                sVar.f(rVar.a, rVar, k10);
                sVar.h(rVar, true);
            }
        }
    }

    @Override // qg.w1
    public float get() {
        nb nbVar = (nb) this.b;
        int i10 = nbVar.F1;
        m currentBrush = nbVar.O0.getCurrentBrush();
        return currentBrush == null ? u0.e(i10).i : u0.e(i10).f(String.valueOf(m.a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override // ii.k0
    public void h() {
        p4 p4Var = (p4) this.b;
        n4 n4Var = p4Var.G;
        if (n4Var != null) {
            x3.P1(((t3) n4Var).a, p4Var.a);
        }
    }

    @Override // gg.b2
    public /* synthetic */ a0.i i() {
        return null;
    }

    public void j(j jVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        long[] jArr = jVar.e;
        if (jArr.length <= 0 || linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        linkedHashMap.put(Long.valueOf(jVar.e[0]), jVar);
    }

    @Override // androidx.activity.result.b
    public void k(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.b;
        int i10 = u.e("ProxyBillingActivityV2", intent).a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.N;
        if (resultReceiver != null) {
            resultReceiver.send(i10, intent == null ? null : intent.getExtras());
        }
        int i11 = aVar.a;
        if (i11 != -1 || i10 != 0) {
            u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // ii.k0
    public void k0() {
        p4 p4Var = (p4) this.b;
        n4 n4Var = p4Var.G;
        if (n4Var != null) {
            ii.a aVar = p4Var.a;
            x3.O1(((t3) n4Var).a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ce.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(ce.c cVar, kd.c cVar2) {
        ce.a aVar;
        int i10;
        Throwable th2;
        de.g gVar;
        if (cVar2 instanceof ce.a) {
            aVar = (ce.a) cVar2;
            int i11 = aVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                aVar.d = i11 - TLObject.FLAG_31;
                Object obj = aVar.b;
                jd.a aVar2 = jd.a.a;
                i10 = aVar.d;
                gd.i iVar = gd.i.a;
                if (i10 != 0) {
                    u7.b(obj);
                    de.g gVar2 = new de.g(cVar, aVar.getContext());
                    try {
                        aVar.a = gVar2;
                        aVar.d = 1;
                        Object invoke = ((k1.m) this.b).invoke(gVar2, aVar);
                        if (invoke != aVar2) {
                            invoke = iVar;
                        }
                        if (invoke == aVar2) {
                            return aVar2;
                        }
                        gVar = gVar2;
                    } catch (Throwable th3) {
                        th2 = th3;
                        gVar = gVar2;
                        gVar.releaseIntercepted();
                        throw th2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = aVar.a;
                    try {
                        u7.b(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        gVar.releaseIntercepted();
                        throw th2;
                    }
                }
                gVar.releaseIntercepted();
                return iVar;
            }
        }
        aVar = new ce.a(this, cVar2);
        Object obj2 = aVar.b;
        jd.a aVar22 = jd.a.a;
        i10 = aVar.d;
        gd.i iVar2 = gd.i.a;
        if (i10 != 0) {
        }
        gVar.releaseIntercepted();
        return iVar2;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void m(k6.a aVar) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
        xVar.o.lock();
        try {
            xVar.l = aVar;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        if (r3 == 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        if (r3 == 3) goto L23;
     */
    @Override // androidx.lifecycle.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m0(Object obj) {
        Integer num = (Integer) obj;
        e0 e0Var = (e0) this.b;
        Handler handler = e0Var.A0;
        q4 q4Var = e0Var.B0;
        handler.removeCallbacks(q4Var);
        int intValue = num.intValue();
        if (e0Var.F0 != null && Build.VERSION.SDK_INT >= 23) {
            int i10 = e0Var.C0.y;
            Context n10 = e0Var.n();
            Drawable drawable = null;
            if (n10 == null) {
                Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            } else {
                int i11 = R.drawable.fingerprint_dialog_fp_icon;
                if (i10 != 0 || intValue != 1) {
                    if (i10 == 1 && intValue == 2) {
                        i11 = R.drawable.fingerprint_dialog_error;
                    } else {
                        if (i10 == 2) {
                        }
                        if (i10 == 1) {
                        }
                    }
                }
                drawable = n10.getDrawable(i11);
            }
            if (drawable != null) {
                e0Var.F0.setImageDrawable(drawable);
                if ((i10 != 0 || intValue != 1) && ((i10 == 1 && intValue == 2) || (i10 == 2 && intValue == 1))) {
                    c0.a(drawable);
                }
                e0Var.C0.y = intValue;
            }
        }
        int intValue2 = num.intValue();
        TextView textView = e0Var.G0;
        if (textView != null) {
            textView.setTextColor(intValue2 == 2 ? e0Var.D0 : e0Var.E0);
        }
        handler.postDelayed(q4Var, 2000L);
    }

    @Override // f6.a
    public void n(Bitmap bitmap) {
        ((f6.i) this.b).e(bitmap, 3);
    }

    @Override // gg.b2
    public /* synthetic */ a0.i o() {
        return null;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((d6.a) this.b).getClass();
        j5.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    public void p(StringBuilder sb2, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb2.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.b);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb2.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // fb.n
    public Object p2() {
        Type type = (Type) this.b;
        if (!(type instanceof ParameterizedType)) {
            throw new db.j("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new db.j("Invalid EnumMap type: " + type.toString());
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void q(int i10) {
        k6.a aVar;
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
        Lock lock = xVar.o;
        lock.lock();
        try {
            if (!xVar.n && (aVar = xVar.m) != null && aVar.c()) {
                xVar.n = true;
                xVar.e.onConnectionSuspended(i10);
                lock.unlock();
            }
            xVar.n = false;
            com.google.android.gms.common.api.internal.x.k(xVar, i10);
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void r(Bundle bundle) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
        xVar.o.lock();
        try {
            Bundle bundle2 = xVar.k;
            if (bundle2 == null) {
                xVar.k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            xVar.l = k6.a.e;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // gg.b2
    public /* synthetic */ boolean s(int i10) {
        return true;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        da.b bVar = (da.b) this.b;
        c5.i iVar = (c5.i) bVar.f;
        d dVar = (d) bVar.b;
        String str = iVar.a;
        FileWriter fileWriter2 = null;
        try {
            HashMap b10 = c5.i.b(dVar);
            aa.a aVar = new aa.a(str, b10);
            aVar.q("User-Agent", "Crashlytics Android SDK/18.6.0");
            aVar.q("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            c5.i.a(aVar, dVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + b10;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObject = iVar.c(aVar.j());
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e);
            jSONObject = null;
        }
        if (jSONObject != null) {
            da.a R = ((a6.i) bVar.c).R(jSONObject);
            a4.m mVar = (a4.m) bVar.e;
            long j3 = R.c;
            mVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j3);
                fileWriter = new FileWriter((File) mVar.b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e7) {
                        e = e7;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        h.c(fileWriter, "Failed to close settings writer.");
                        da.b.f("Loaded settings: ", jSONObject);
                        String str4 = dVar.f;
                        SharedPreferences.Editor edit = ((Context) bVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str4);
                        edit.apply();
                        ((AtomicReference) bVar.h).set(R);
                        ((TaskCompletionSource) ((AtomicReference) bVar.i).get()).trySetResult(R);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    h.c(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                h.c(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            h.c(fileWriter, "Failed to close settings writer.");
            da.b.f("Loaded settings: ", jSONObject);
            String str42 = dVar.f;
            SharedPreferences.Editor edit2 = ((Context) bVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str42);
            edit2.apply();
            ((AtomicReference) bVar.h).set(R);
            ((TaskCompletionSource) ((AtomicReference) bVar.i).get()).trySetResult(R);
        }
        return Tasks.forResult(null);
    }

    public Set u() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.b);
        }
        return unmodifiableSet;
    }

    @Override // org.telegram.ui.Components.jq0
    public void u0() {
        e6.j0((e6) this.b);
    }

    @Override // l.x
    public boolean v(l.l lVar) {
        Window.Callback callback;
        g.s sVar = (g.s) this.b;
        if (lVar != lVar.k() || !sVar.O || (callback = sVar.f.getCallback()) == null || sVar.Z) {
            return true;
        }
        callback.onMenuOpened(108, lVar);
        return true;
    }

    public void w() {
        ((androidx.fragment.app.u) this.b).d.R();
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public c(x6.a aVar) {
        this.a = 29;
        l.h(aVar);
        this.b = aVar;
    }

    public c(int i10) {
        this.a = i10;
        switch (i10) {
            case 6:
                break;
            case 7:
                this.b = new LinkedHashMap();
                break;
            case 11:
                this.b = Collections.newSetFromMap(new WeakHashMap());
                break;
            default:
                this.b = new HashSet();
                break;
        }
    }

    public c(String str) {
        this.a = 15;
        str.getClass();
        this.b = str;
    }

    @Override // org.telegram.ui.Components.jq0
    public /* synthetic */ void U() {
    }
}
