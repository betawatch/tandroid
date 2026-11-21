package wf;

import ab.c0;
import android.content.Context;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.m;
import android.support.v4.media.session.o;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import androidx.emoji2.text.p;
import androidx.emoji2.text.w;
import androidx.fragment.app.j0;
import androidx.fragment.app.s;
import androidx.fragment.app.v;
import bi.q2;
import ca.i;
import ci.a0;
import ci.b0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.internal.cast.a1;
import com.google.android.gms.internal.cast.a2;
import com.google.android.gms.internal.cast.t;
import com.google.android.gms.internal.clearcut.g;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.t3;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d1.f;
import d3.h0;
import e2.x1;
import f5.y;
import f6.e0;
import fi.e9;
import fi.f9;
import fi.r3;
import fi.z3;
import g6.h;
import gb.d0;
import gb.i1;
import gb.x0;
import gd.k;
import i2.r;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j6.n;
import j6.x;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import jb.l;
import kotlin.jvm.internal.j;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.t0;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.lc;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.md0;
import s4.z;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public class b implements h, ce.c, a0, OnCompleteListener, g, lf.b, y, q, ib.b, j2.g, n, ja.a {
    public static volatile b d;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ b(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    public static b J() {
        b bVar;
        b bVar2 = d;
        if (bVar2 != null) {
            return bVar2;
        }
        synchronized (b.class) {
            try {
                bVar = d;
                if (bVar == null) {
                    bVar = new b(0);
                    d = bVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public static void p(b bVar, boolean z10, boolean z11) {
        synchronized (bVar) {
            boolean z12 = false;
            if (z10) {
                if (((PowerManager.WakeLock) bVar.c) == null) {
                    if (((Context) bVar.b).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        h2.a.l("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) ((Context) bVar.b).getSystemService("power");
                    if (powerManager == null) {
                        h2.a.l("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        bVar.c = newWakeLock;
                        newWakeLock.setReferenceCounted(false);
                    }
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) bVar.c;
            if (wakeLock == null) {
                return;
            }
            if (z10 && z11) {
                z12 = true;
            }
            if (z12) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public static boolean s(Editable editable, KeyEvent keyEvent, boolean z10) {
        w[] wVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (wVarArr = (w[]) editable.getSpans(selectionStart, selectionEnd, w.class)) != null && wVarArr.length > 0) {
                for (w wVar : wVarArr) {
                    int spanStart = editable.getSpanStart(wVar);
                    int spanEnd = editable.getSpanEnd(wVar);
                    if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void A(s f10, boolean z10) {
        j.e(f10, "f");
        s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.A(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void C(s f10, boolean z10) {
        j.e(f10, "f");
        j0 j0Var = (j0) this.b;
        v vVar = j0Var.w.b;
        s sVar = j0Var.y;
        if (sVar != null) {
            sVar.p().o.C(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void D(s f10, boolean z10) {
        j.e(f10, "f");
        s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.D(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void E(s f10, boolean z10) {
        j.e(f10, "f");
        s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.E(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void F(s f10, Bundle bundle, boolean z10) {
        j.e(f10, "f");
        s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.F(f10, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void G(s f10, boolean z10) {
        j.e(f10, "f");
        s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.G(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void H(s f10, boolean z10) {
        j.e(f10, "f");
        s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.H(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void I(s f10, boolean z10) {
        j.e(f10, "f");
        s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.I(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public m K() {
        MediaController.TransportControls transportControls = ((android.support.v4.media.session.h) this.b).a.getTransportControls();
        int i7 = Build.VERSION.SDK_INT;
        return i7 >= 29 ? new o(transportControls) : i7 >= 24 ? new android.support.v4.media.session.n(transportControls) : new m(transportControls);
    }

    public boolean L(CharSequence charSequence, int i7, int i10, p pVar) {
        if (pVar.c == 0) {
            androidx.emoji2.text.h hVar = (androidx.emoji2.text.h) this.c;
            s1.a b10 = pVar.b();
            int a10 = b10.a(8);
            if (a10 != 0) {
                ((ByteBuffer) b10.d).getShort(a10 + b10.a);
            }
            androidx.emoji2.text.d dVar = (androidx.emoji2.text.d) hVar;
            dVar.getClass();
            ThreadLocal threadLocal = androidx.emoji2.text.d.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i7 < i10) {
                sb2.append(charSequence.charAt(i7));
                i7++;
            }
            TextPaint textPaint = dVar.a;
            String sb3 = sb2.toString();
            int i11 = i0.c.a;
            pVar.c = textPaint.hasGlyph(sb3) ? 2 : 1;
        }
        return pVar.c == 2;
    }

    public boolean M() {
        return ((a) ((md0) this.b).d) != null;
    }

    public void N(boolean z10, boolean z11, float f10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
        r3 r3Var = (r3) this.c;
        f9 f9Var = r3Var.e;
        f9.B1 = f10;
        e9 e9Var = f9Var.A0;
        if (e9Var != null) {
            e9Var.setSpeed(f10);
        }
        z3.Y(r3Var.x, z10);
        if (!z11 || actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() == null) {
            return;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
    }

    public void O(androidx.mediarouter.app.q qVar) {
        if (qVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!((Set) this.c).add(qVar)) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        Handler handler = new Handler();
        qVar.f(handler);
        android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.b;
        hVar.a.registerCallback(qVar.a, handler);
        synchronized (hVar.b) {
            if (hVar.e.a() != null) {
                android.support.v4.media.session.g gVar = new android.support.v4.media.session.g(qVar);
                hVar.d.put(qVar, gVar);
                qVar.c = gVar;
                try {
                    hVar.e.a().p(gVar);
                    qVar.e(13, null, null);
                } catch (RemoteException e10) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
                }
            } else {
                qVar.c = null;
                hVar.c.add(qVar);
            }
        }
    }

    public void P(Object obj) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new q2(this, obj, SystemClock.elapsedRealtime(), 1));
        }
    }

    public void Q(oi.z3 z3Var) {
        d dVar;
        oi.z3 z3Var2;
        int i7;
        Log.d("CAST_CONTROLLER", "set current media");
        md0 md0Var = (md0) this.b;
        oi.z3 z3Var3 = (oi.z3) md0Var.c;
        if (f.u()) {
            if (z3Var3 == null && z3Var == null) {
                return;
            }
            if (z3Var3 != null) {
                ArrayList arrayList = z3Var3.a;
                if (z3Var != null && arrayList.size() == z3Var.a.size()) {
                    for (0; i7 < arrayList.size(); i7 + 1) {
                        e j3 = z3Var3.j(i7);
                        e j10 = z3Var.j(i7);
                        i7 = ((j3 == null && j10 == null) || (j3 != null && j10 != null && Objects.equals(j3.a, j10.a) && Objects.equals(j3.b, j10.b) && Objects.equals(j3.c, j10.c) && Objects.equals(j3.d, j10.d) && j3.e == j10.e && j3.f == j10.f)) ? i7 + 1 : 0;
                    }
                    return;
                }
            }
        }
        if (((a) md0Var.d) != null && z3Var != null) {
            md0Var.j(z3Var);
        }
        if (((a) md0Var.d) != null && (z3Var2 = (oi.z3) md0Var.c) != null) {
            md0Var.F(z3Var2);
        }
        if (z3Var != null && z3Var.a.size() > 0 && !z3Var.j(0).a.startsWith("audio/") && (dVar = (d) md0Var.b) != null) {
            dVar.l(null, null);
        }
        a aVar = (a) md0Var.d;
        if (aVar != null && z3Var != null) {
            aVar.d = z3Var;
            aVar.g = 0;
            aVar.h = 0;
            aVar.p();
        }
        md0Var.c = z3Var;
    }

    public void R(f5.m mVar) {
        this.b = mVar;
        if (mVar.a() != null) {
            mVar.a().getClass();
            String str = mVar.a().d;
            if (str != null) {
                this.c = str;
            }
        }
    }

    public void S(g6.c cVar) {
        md0 md0Var = (md0) this.b;
        if (cVar == null) {
            return;
        }
        q6.m.e("Must be called from the main thread.");
        h6.h hVar = cVar.j;
        String a10 = cVar.a();
        if (TextUtils.isEmpty(a10) || hVar == null) {
            return;
        }
        a aVar = (a) md0Var.d;
        if (aVar == null || !TextUtils.equals(aVar.c.a(), a10)) {
            md0Var.I(new a(cVar, (g6.g) this.c, hVar));
            q6.m.e("Must be called from the main thread.");
            CastDevice castDevice = cVar.k;
            String str = castDevice != null ? castDevice.d : null;
            PhotoViewer p12 = PhotoViewer.p1();
            d.i();
            if (p12.F == null || p12.f0 == null || !p12.P1()) {
                return;
            }
            new lc(p12.f0, new fi.b()).Q(R.raw.forward, 36, !TextUtils.isEmpty(str) ? gd.a0(null, null, 2131752090, str) : gd.N0(2131752091, null)).j();
        }
    }

    public void T(androidx.mediarouter.app.q qVar) {
        if (qVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!((Set) this.c).remove(qVar)) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
            return;
        }
        try {
            ((android.support.v4.media.session.h) this.b).b(qVar);
        } finally {
            qVar.f(null);
        }
    }

    public void U(ArrayList arrayList) {
        r rVar;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (((i2.q) arrayList.get(i7)).a == 1) {
                try {
                    rVar = new r((i2.q) arrayList.get(i7));
                } catch (i2.p unused) {
                    rVar = null;
                }
                this.c = rVar;
            }
        }
    }

    public void V(x1 x1Var) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new c1.a(23, this, x1Var));
        }
    }

    public void W(g3 g3Var) {
        try {
            d0(g3Var, (p3) this.b);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void X(g3 g3Var, int i7, long j3) {
        try {
            o3 o3Var = (o3) ((p3) this.b).g();
            o3Var.c();
            p3.p((p3) o3Var.b, i7);
            p3 p3Var = (p3) o3Var.a();
            this.b = p3Var;
            if (j3 != 0) {
                o3 o3Var2 = (o3) p3Var.g();
                o3Var2.c();
                p3.r((p3) o3Var2.b, j3);
                p3Var = (p3) o3Var2.a();
            }
            d0(g3Var, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void Y(g3 g3Var, long j3, boolean z10) {
        p3 p3Var;
        try {
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.b, z10);
            f3Var.c();
            g3.r((g3) f3Var.b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j3 == 0) {
                p3Var = (p3) this.b;
            } else {
                o3 o3Var = (o3) ((p3) this.b).g();
                o3Var.c();
                p3.r((p3) o3Var.b, j3);
                p3Var = (p3) o3Var.a();
            }
            d0(g3Var2, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void Z(g3 g3Var, int i7, long j3, boolean z10) {
        p3 p3Var;
        try {
            o3 o3Var = (o3) ((p3) this.b).g();
            o3Var.c();
            p3.p((p3) o3Var.b, i7);
            this.b = (p3) o3Var.a();
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.b, z10);
            f3Var.c();
            g3.r((g3) f3Var.b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j3 == 0) {
                p3Var = (p3) this.b;
            } else {
                o3 o3Var2 = (o3) ((p3) this.b).g();
                o3Var2.c();
                p3.r((p3) o3Var2.b, j3);
                p3Var = (p3) o3Var2.a();
            }
            d0(g3Var2, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // g6.h
    public void a(g6.f fVar, boolean z10) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((g6.c) fVar).a() + " " + z10);
    }

    public void a0(l3 l3Var) {
        try {
            w3 t6 = x3.t();
            t6.d((p3) this.b);
            t6.c();
            x3.p((x3) t6.b, l3Var);
            ((i) this.c).m((x3) t6.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        e0 e0Var = (e0) this.b;
        String str = (String) this.c;
        x xVar = (x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        q6.m.j("Not connected to device", e0Var.G == 2);
        j6.f fVar = (j6.f) xVar.n();
        Parcel p12 = fVar.p1();
        p12.writeString(str);
        fVar.u1(p12, 5);
        synchronized (e0Var.t) {
            try {
                if (e0Var.q != null) {
                    taskCompletionSource.setException(q6.m.m(new Status(2001, null, null, null)));
                } else {
                    e0Var.q = taskCompletionSource;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // g6.h
    public void b(g6.f fVar, int i7) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((g6.c) fVar).a() + " " + i7);
    }

    public void b0(a4 a4Var) {
        try {
            i iVar = (i) this.c;
            w3 t6 = x3.t();
            t6.d((p3) this.b);
            t6.c();
            x3.r((x3) t6.b, a4Var);
            iVar.m((x3) t6.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // ci.a0
    public void c(b0 b0Var) {
        g0.E2(b0Var);
        ((Runnable) this.c).run();
    }

    public void c0(b4 b4Var) {
        if (b4Var == null) {
            return;
        }
        try {
            w3 t6 = x3.t();
            t6.d((p3) this.b);
            t6.c();
            x3.s((x3) t6.b, b4Var);
            ((i) this.c).m((x3) t6.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // j2.g
    public j2.h createDataSource() {
        return new j2.n((Context) this.b, ((j2.o) this.c).createDataSource());
    }

    @Override // lf.b
    public lf.a d(b bVar) {
        List list = (List) this.c;
        List list2 = (List) bVar.b;
        int size = list2 != null ? list2.size() : 0;
        if (size > 0) {
            ArrayList arrayList = new ArrayList(list.size() + size);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            list = arrayList;
        }
        return new ed.i(bVar, (List) this.b, list);
    }

    public void d0(g3 g3Var, p3 p3Var) {
        if (g3Var == null) {
            return;
        }
        try {
            w3 t6 = x3.t();
            t6.d(p3Var);
            t6.c();
            x3.n((x3) t6.b, g3Var);
            ((i) this.c).m((x3) t6.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // g6.h
    public void e(g6.f fVar, int i7) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((g6.c) fVar).a() + " " + i7);
    }

    public void e0(i3 i3Var, p3 p3Var) {
        try {
            w3 t6 = x3.t();
            t6.d(p3Var);
            t6.c();
            x3.o((x3) t6.b, i3Var);
            ((i) this.c).m((x3) t6.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // g6.h
    public void f(g6.f fVar, int i7) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((g6.c) fVar).a() + " " + i7);
    }

    @Override // j6.n
    public void g(String str, long j3, long j10, long j11) {
        n nVar = (n) this.b;
        if (nVar != null) {
            nVar.g(str, j3, j10, j11);
        }
    }

    @Override // fd.a
    public Object get() {
        switch (this.a) {
            case 22:
                return new d0((Context) ((d9.o) this.b).a, (i1) ((ib.c) this.c).get());
            default:
                return new l((jb.q) ((ib.c) this.b).get(), (jb.q) ((ib.c) this.c).get());
        }
    }

    @Override // g6.h
    public void h(g6.f fVar, String str) {
        g6.c cVar = (g6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarted " + cVar.a() + " " + str);
        S(cVar);
    }

    @Override // ci.a0
    public void i(String str) {
        ((x10) this.b).a(str);
    }

    @Override // j6.n
    public void j(String str, long j3, int i7, Object obj, long j10, long j11) {
        ((j6.m) this.c).g = null;
        n nVar = (n) this.b;
        if (nVar != null) {
            nVar.j(str, j3, i7, obj, j10, j11);
        }
    }

    @Override // g6.h
    public void k(g6.f fVar, int i7) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((g6.c) fVar).a() + " " + i7);
        ((md0) this.b).I(null);
    }

    @Override // g6.h
    public void l(g6.f fVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((g6.c) fVar).a() + " " + str);
    }

    @Override // g6.h
    public void m(g6.f fVar) {
        g6.c cVar = (g6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarting " + cVar.a());
        S(cVar);
    }

    @Override // g6.h
    public void n(g6.f fVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((g6.c) fVar).a());
    }

    @Override // ja.a
    public StackTraceElement[] o(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        ja.a[] aVarArr = (ja.a[]) this.b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i7 = 0; i7 < 1; i7++) {
            ja.a aVar = aVarArr[i7];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.o(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? ((w7.s) this.c).o(stackTraceElementArr2) : stackTraceElementArr2;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        boolean z10;
        g6.b bVar;
        com.google.android.gms.internal.cast.p pVar = (com.google.android.gms.internal.cast.p) this.b;
        g6.b bVar2 = (g6.b) this.c;
        s4.x xVar = pVar.c;
        j6.b bVar3 = com.google.android.gms.internal.cast.p.j;
        if (task.isSuccessful()) {
            Bundle bundle = (Bundle) task.getResult();
            boolean z11 = bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
            bVar3.b("The module-to-client output switcher flag %s", true != z11 ? "not existed" : "existed");
            if (z11) {
                z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                Log.i(bVar3.a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.y)));
                boolean z12 = !z10 && bVar2.y;
                if (xVar != null || (bVar = pVar.d) == null) {
                }
                boolean z13 = bVar.w;
                boolean z14 = bVar.s;
                s4.y yVar = new s4.y();
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 30) {
                    yVar.b = z12;
                }
                if (i7 >= 30) {
                    yVar.d = z13;
                }
                if (i7 >= 30) {
                    yVar.c = z14;
                }
                s4.x.i(new z(yVar));
                Log.i(bVar3.a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(pVar.i), Boolean.valueOf(z12), Boolean.valueOf(z13), Boolean.valueOf(z14)));
                if (z13) {
                    com.google.android.gms.internal.cast.s sVar = pVar.f;
                    q6.m.h(sVar);
                    com.google.android.gms.internal.cast.o oVar = new com.google.android.gms.internal.cast.o(sVar);
                    s4.x.b();
                    s4.x.c().f = oVar;
                    a2.a(a1.c0);
                    return;
                }
                return;
            }
        }
        z10 = true;
        Log.i(bVar3.a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.y)));
        if (z10) {
        }
        if (xVar != null) {
        }
    }

    public f5.d q() {
        if (((f5.m) this.b) != null) {
            return new f5.d(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    public void r() {
        String str = (String) this.b;
        try {
            ga.d dVar = (ga.d) this.c;
            dVar.getClass();
            new File((File) dVar.d, str).createNewFile();
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e10);
        }
    }

    public void t(l2.d dVar) {
        synchronized (dVar) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new d3.g0(this, dVar, 1));
        }
    }

    public String toString() {
        switch (this.a) {
            case 6:
                try {
                    if (((cc.b) this.c) == null) {
                        this.c = ((cc.g) this.b).a();
                    }
                    return ((cc.b) this.c).toString();
                } catch (bc.e unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    public void u(s f10, boolean z10) {
        j.e(f10, "f");
        s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.u(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097  */
    @Override // ce.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object v(ce.d dVar, kd.c cVar) {
        ce.j jVar;
        int i7;
        b bVar;
        Throwable th2;
        ce.p pVar;
        int i10;
        ce.m mVar;
        switch (this.a) {
            case 8:
                if (cVar instanceof ce.j) {
                    jVar = (ce.j) cVar;
                    int i11 = jVar.b;
                    if ((i11 & TLObject.FLAG_31) != 0) {
                        jVar.b = i11 - TLObject.FLAG_31;
                        Object obj = jVar.a;
                        Object obj2 = jd.a.a;
                        i7 = jVar.b;
                        if (i7 != 0) {
                            b7.h.b(obj);
                            ce.c cVar2 = (ce.c) this.b;
                            jVar.d = this;
                            jVar.e = dVar;
                            jVar.b = 1;
                            obj = ce.x.b(cVar2, dVar, jVar);
                            if (obj == obj2) {
                                return obj2;
                            }
                            bVar = this;
                        } else {
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                b7.h.b(obj);
                                return k.a;
                            }
                            dVar = jVar.e;
                            bVar = jVar.d;
                            b7.h.b(obj);
                        }
                        th2 = (Throwable) obj;
                        if (th2 != null) {
                            x0 x0Var = (x0) bVar.c;
                            jVar.d = null;
                            jVar.e = null;
                            jVar.b = 2;
                            if (x0Var.b(dVar, th2, jVar) == obj2) {
                                return obj2;
                            }
                        }
                        return k.a;
                    }
                }
                jVar = new ce.j(this, cVar);
                Object obj3 = jVar.a;
                Object obj22 = jd.a.a;
                i7 = jVar.b;
                if (i7 != 0) {
                }
                th2 = (Throwable) obj3;
                if (th2 != null) {
                }
                return k.a;
            default:
                if (cVar instanceof ce.p) {
                    pVar = (ce.p) cVar;
                    int i12 = pVar.b;
                    if ((i12 & TLObject.FLAG_31) != 0) {
                        pVar.b = i12 - TLObject.FLAG_31;
                        Object obj4 = pVar.a;
                        jd.a aVar = jd.a.a;
                        i10 = pVar.b;
                        if (i10 != 0) {
                            b7.h.b(obj4);
                            q4.q qVar = (q4.q) this.b;
                            ce.m mVar2 = new ce.m((jb.c) this.c, dVar);
                            try {
                                pVar.d = mVar2;
                                pVar.b = 1;
                                if (qVar.v(mVar2, pVar) == aVar) {
                                    return aVar;
                                }
                            } catch (de.a e10) {
                                e = e10;
                                mVar = mVar2;
                                if (e.a != mVar) {
                                }
                                return k.a;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mVar = pVar.d;
                            try {
                                b7.h.b(obj4);
                            } catch (de.a e11) {
                                e = e11;
                                if (e.a != mVar) {
                                    throw e;
                                }
                                return k.a;
                            }
                        }
                        return k.a;
                    }
                }
                pVar = new ce.p(this, cVar);
                Object obj42 = pVar.a;
                jd.a aVar2 = jd.a.a;
                i10 = pVar.b;
                if (i10 != 0) {
                }
                return k.a;
        }
    }

    public void w(s f10, boolean z10) {
        j.e(f10, "f");
        j0 j0Var = (j0) this.b;
        v vVar = j0Var.w.b;
        s sVar = j0Var.y;
        if (sVar != null) {
            sVar.p().o.w(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void x(s f10, boolean z10) {
        j.e(f10, "f");
        s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.x(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void y(s f10, boolean z10) {
        j.e(f10, "f");
        s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.y(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void z(s f10, boolean z10) {
        j.e(f10, "f");
        s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.z(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.g
    public Object zzp() {
        com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) this.b;
        com.google.android.gms.internal.clearcut.b bVar = (com.google.android.gms.internal.clearcut.b) this.c;
        bVar.getClass();
        Map b10 = com.google.android.gms.internal.clearcut.d.e() ? ((Boolean) com.google.android.gms.internal.clearcut.d.c(new aa.b0("gms:phenotype:phenotype_flag:debug_disable_caching"))).booleanValue() : false ? bVar.b() : bVar.e;
        if (b10 == null) {
            synchronized (bVar.d) {
                try {
                    HashMap hashMap = bVar.e;
                    b10 = hashMap;
                    if (hashMap == null) {
                        HashMap b11 = bVar.b();
                        bVar.e = b11;
                        b10 = b11;
                    }
                } finally {
                }
            }
        }
        if (b10 == null) {
            b10 = Collections.EMPTY_MAP;
        }
        return (String) b10.get(dVar.b);
    }

    public /* synthetic */ b(int i7, boolean z10) {
        this.a = i7;
    }

    public /* synthetic */ b(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public /* synthetic */ b(Object obj, Object obj2, boolean z10, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    public b(Context context, p3 p3Var) {
        this.a = 18;
        i iVar = new i(2);
        try {
            o5.s.b(context);
            iVar.c = o5.s.a().c(m5.a.e).a("PLAY_BILLING_LIBRARY", new l5.c("proto"), new nb.a(9));
        } catch (Throwable unused) {
            iVar.b = true;
        }
        this.c = iVar;
        this.b = p3Var;
    }

    public b(p6.a aVar) {
        this.a = 25;
        this.b = aVar == null ? null : aVar.b;
    }

    public b(j0 j0Var) {
        this.a = 5;
        this.b = j0Var;
        this.c = new CopyOnWriteArrayList();
    }

    public b(ja.a[] aVarArr) {
        this.a = 28;
        this.b = aVarArr;
        this.c = new w7.s(11);
    }

    public b(int i7) {
        this.a = i7;
        switch (i7) {
            case 13:
                this.b = ByteBuffer.allocateDirect(500);
                break;
            default:
                g6.a c10 = g6.a.c(t0.b);
                ug.x xVar = new ug.x(15);
                c10.getClass();
                q6.m.e("Must be called from the main thread.");
                g6.g gVar = c10.c;
                gVar.getClass();
                boolean z10 = false;
                try {
                    g6.y yVar = gVar.a;
                    g6.j jVar = new g6.j(xVar);
                    Parcel p12 = yVar.p1();
                    t.d(p12, jVar);
                    yVar.t1(p12, 4);
                } catch (RemoteException e10) {
                    g6.g.c.a(e10, "Unable to call %s on %s.", "addCastStateListener", g6.y.class.getSimpleName());
                }
                this.b = new md0(23, z10);
                g6.g b10 = c10.b();
                this.c = b10;
                b10.a(this);
                S(b10.c());
                break;
        }
    }

    public b(Context context) {
        this.a = 26;
        j2.o oVar = new j2.o();
        this.b = context.getApplicationContext();
        this.c = oVar;
    }

    public b(c0 c0Var, pb.b bVar, androidx.emoji2.text.d dVar) {
        this.a = 4;
        this.b = c0Var;
        this.c = dVar;
    }

    public b(Handler handler, h0 h0Var) {
        this.a = 14;
        if (h0Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = h0Var;
    }

    public b(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.a = 3;
        if (mediaSessionCompat$Token != null) {
            this.c = DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.b = new android.support.v4.media.session.i(context, mediaSessionCompat$Token);
                return;
            } else {
                this.b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }
}
