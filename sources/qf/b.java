package qf;

import ab.y;
import ah.h0;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.PowerManager;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.m;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.emoji2.text.v;
import androidx.fragment.app.i0;
import androidx.fragment.app.u;
import androidx.mediarouter.app.q;
import bi.h5;
import bi.q5;
import bi.rb;
import bi.sb;
import c5.g0;
import c5.j;
import c5.p;
import c6.e0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.d1;
import com.google.android.gms.internal.cast.d2;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.q3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.internal.play_billing.y3;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.h;
import d9.l;
import e2.k0;
import e2.x;
import e9.n0;
import e9.x1;
import g6.n;
import g6.w;
import gb.o;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j4.a0;
import j4.b0;
import j4.d0;
import j4.f0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.CopyOnWriteArrayList;
import ji.c4;
import ji.h1;
import ji.i6;
import ji.k3;
import ji.l4;
import ji.u3;
import ji.v3;
import k2.r;
import kotlin.jvm.internal.i;
import li.k;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.zc;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ul0;
import p4.z;
import v7.i8;
import v7.r8;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public class b implements h, OnCompleteListener, g0, s, com.google.android.gms.internal.clearcut.g, ee.b, f6.a, fa.a, g2.g, n, a0, Continuation, v3 {
    public static volatile b d;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    public static boolean A(Editable editable, KeyEvent keyEvent, boolean z10) {
        v[] vVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (vVarArr = (v[]) editable.getSpans(selectionStart, selectionEnd, v.class)) != null && vVarArr.length > 0) {
                for (v vVar : vVarArr) {
                    int spanStart = editable.getSpanStart(vVar);
                    int spanEnd = editable.getSpanEnd(vVar);
                    if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static b T() {
        b bVar;
        b bVar2 = d;
        if (bVar2 != null) {
            return bVar2;
        }
        synchronized (b.class) {
            try {
                bVar = d;
                if (bVar == null) {
                    bVar = new b();
                    d = bVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public static void s(b bVar, boolean z10, boolean z11) {
        synchronized (bVar) {
            boolean z12 = false;
            if (z10) {
                if (((PowerManager.WakeLock) bVar.c) == null) {
                    if (((Context) bVar.b).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        e2.a.l("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) ((Context) bVar.b).getSystemService("power");
                    if (powerManager == null) {
                        e2.a.l("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
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

    public static String x(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    public void B(i2.e eVar) {
        synchronized (eVar) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new r(this, eVar, 0));
        }
    }

    public void C(androidx.fragment.app.r f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.r rVar = ((i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.C(f7, true);
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

    @Override // ji.v3
    public void D() {
        ji.r rVar = (ji.r) this.c;
        if (rVar.getCurrentItemTop() != rVar.I) {
            rVar.b.b2(rVar, 0);
        }
        rVar.d0();
        ji.r.N(rVar);
    }

    public void E(androidx.fragment.app.r f7, boolean z10) {
        i.e(f7, "f");
        i0 i0Var = (i0) this.b;
        u uVar = i0Var.w.b;
        androidx.fragment.app.r rVar = i0Var.y;
        if (rVar != null) {
            rVar.p().o.E(f7, true);
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

    public void F(androidx.fragment.app.r f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.r rVar = ((i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.F(f7, true);
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

    @Override // ji.v3
    public void G(int i10) {
        ji.r rVar = (ji.r) this.c;
        rVar.b.b2(rVar, i10);
        rVar.d0();
        ji.r.N(rVar);
    }

    public void H(androidx.fragment.app.r f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.r rVar = ((i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.H(f7, true);
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

    public void I(androidx.fragment.app.r f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.r rVar = ((i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.I(f7, true);
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

    public void J(androidx.fragment.app.r f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.r rVar = ((i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.J(f7, true);
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

    public void K(androidx.fragment.app.r f7, boolean z10) {
        i.e(f7, "f");
        i0 i0Var = (i0) this.b;
        u uVar = i0Var.w.b;
        androidx.fragment.app.r rVar = i0Var.y;
        if (rVar != null) {
            rVar.p().o.K(f7, true);
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

    public void L(androidx.fragment.app.r f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.r rVar = ((i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.L(f7, true);
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

    public void M(androidx.fragment.app.r f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.r rVar = ((i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.M(f7, true);
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

    @Override // ji.v3
    public void N(ji.a aVar) {
        ji.r rVar = (ji.r) this.c;
        vi viVar = rVar.b;
        m2 m2Var = viVar.f0;
        if (m2Var != null && aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(m2Var)) {
            vi viVar2 = new vi(rVar.getContext(), viVar.f0, false, false, false, null);
            viVar2.c2 = new t7.u(11);
            viVar2.P = true;
            viVar2.A1.setVisibility(8);
            viVar2.w2 = new androidx.car.app.utils.a(rVar, aVar, viVar2, 10);
            viVar2.t1();
            viVar2.show();
        }
    }

    public void O(androidx.fragment.app.r f7, Bundle bundle, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.r rVar = ((i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.O(f7, bundle, true);
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

    public void P(androidx.fragment.app.r f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.r rVar = ((i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.P(f7, true);
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

    public void Q(androidx.fragment.app.r f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.r rVar = ((i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.Q(f7, true);
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

    public void R(androidx.fragment.app.r f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.r rVar = ((i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.R(f7, true);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o S(lb.a aVar) {
        String str;
        qb.c cVar;
        Type type = aVar.b;
        Class cls = aVar.a;
        HashMap hashMap = (HashMap) this.b;
        if (hashMap.get(type) != null) {
            throw new ClassCastException();
        }
        if (hashMap.get(cls) != null) {
            throw new ClassCastException();
        }
        int i10 = 21;
        o oVar = null;
        o cVar2 = EnumSet.class.isAssignableFrom(cls) ? new ya.c(type, i10) : cls == EnumMap.class ? new a6.i(type, i10) : null;
        if (cVar2 != null) {
            return cVar2;
        }
        gb.d.f((ArrayList) this.c);
        if (!Modifier.isAbstract(cls.getModifiers())) {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                r8 r8Var = jb.c.a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e) {
                    str = "Failed making constructor '" + jb.c.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage() + jb.c.e(e);
                }
                if (str != null) {
                    gb.e eVar = new gb.e();
                    eVar.a = str;
                    cVar = eVar;
                } else {
                    cVar = new qb.c(declaredConstructor, 20);
                }
            } catch (NoSuchMethodException unused) {
            }
            if (cVar == null) {
                return cVar;
            }
            int i11 = 9;
            if (Collection.class.isAssignableFrom(cls)) {
                oVar = SortedSet.class.isAssignableFrom(cls) ? new oa.d(i11) : Set.class.isAssignableFrom(cls) ? new pb.a(i11) : Queue.class.isAssignableFrom(cls) ? new rb.b(i11) : new sb.a(i11);
            } else if (Map.class.isAssignableFrom(cls)) {
                if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                    oVar = new t7.u(i11);
                } else {
                    int i12 = 10;
                    oVar = ConcurrentMap.class.isAssignableFrom(cls) ? new oa.d(i12) : SortedMap.class.isAssignableFrom(cls) ? new pb.a(i12) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(new lb.a(((ParameterizedType) type).getActualTypeArguments()[0]).a)) ? new sb.a(i12) : new rb.b(i12);
                }
            }
            if (oVar != null) {
                return oVar;
            }
            String x10 = x(cls);
            return x10 != null ? new l(x10, false) : new k6.h(cls, 24);
        }
        cVar = null;
        if (cVar == null) {
        }
    }

    public m U() {
        MediaController.TransportControls transportControls = ((android.support.v4.media.session.h) this.b).a.getTransportControls();
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 29 ? new android.support.v4.media.session.o(transportControls) : i10 >= 24 ? new android.support.v4.media.session.n(transportControls) : new m(transportControls);
    }

    public boolean V(CharSequence charSequence, int i10, int i11, androidx.emoji2.text.o oVar) {
        if (oVar.c == 0) {
            androidx.emoji2.text.h hVar = (androidx.emoji2.text.h) this.c;
            p1.a b10 = oVar.b();
            int a2 = b10.a(8);
            if (a2 != 0) {
                ((ByteBuffer) b10.d).getShort(a2 + b10.a);
            }
            androidx.emoji2.text.d dVar = (androidx.emoji2.text.d) hVar;
            dVar.getClass();
            ThreadLocal threadLocal = androidx.emoji2.text.d.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i10 < i11) {
                sb2.append(charSequence.charAt(i10));
                i10++;
            }
            TextPaint textPaint = dVar.a;
            String sb3 = sb2.toString();
            int i12 = i0.c.a;
            oVar.c = textPaint.hasGlyph(sb3) ? 2 : 1;
        }
        return oVar.c == 2;
    }

    public boolean W() {
        return ((a) ((k) this.b).d) != null;
    }

    @Override // ji.v3
    public void X() {
        c4 c4Var = ((ji.r) this.c).s;
        if (c4Var != null) {
            c4Var.e(false, true);
            int i10 = c4Var.b0;
            c4Var.f(i10 != 2 ? i10 : 0, true);
        }
    }

    @Override // ji.v3
    public m80 Y(View view) {
        ji.r rVar = (ji.r) this.c;
        m80 m80Var = new m80(rVar, (c6) this.b, view, false, false, true);
        rVar.H = m80Var;
        return m80Var;
    }

    public void Z(boolean z10, boolean z11, float f7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
        h5 h5Var = (h5) this.c;
        sb sbVar = h5Var.e;
        sb.B1 = f7;
        rb rbVar = sbVar.z0;
        if (rbVar != null) {
            rbVar.setSpeed(f7);
        }
        q5.a0(h5Var.l, z10);
        if (!z11 || actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() == null) {
            return;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
    }

    @Override // j4.a0
    public void a(x xVar) {
        d0 d0Var = (d0) this.c;
        SparseArray sparseArray = d0Var.h;
        a4.g gVar = (a4.g) this.b;
        if (xVar.A() == 0 && (xVar.A() & 128) != 0) {
            xVar.O(6);
            int a2 = xVar.a() / 4;
            for (int i10 = 0; i10 < a2; i10++) {
                xVar.k(0, 4, gVar.b);
                gVar.m(0);
                int g10 = gVar.g(16);
                gVar.o(3);
                if (g10 == 0) {
                    gVar.o(13);
                } else {
                    int g11 = gVar.g(13);
                    if (sparseArray.get(g11) == null) {
                        sparseArray.put(g11, new b0(new e0.g0(d0Var, g11)));
                        d0Var.n++;
                    }
                }
            }
            if (d0Var.a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    public void a0(q qVar) {
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
                    hVar.e.a().o(gVar);
                    qVar.e(13, null, null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            } else {
                qVar.c = null;
                hVar.c.add(qVar);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        e0 e0Var = (e0) this.b;
        String str = (String) this.c;
        w wVar = (w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        n6.l.j("Not connected to device", e0Var.F == 2);
        g6.f fVar = (g6.f) wVar.u();
        Parcel N0 = fVar.N0();
        N0.writeString(str);
        fVar.S0(N0, 5);
        synchronized (e0Var.s) {
            try {
                if (e0Var.p != null) {
                    taskCompletionSource.setException(n6.l.m(new Status(2001, null, null, null)));
                } else {
                    e0Var.p = taskCompletionSource;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ji.v3
    public void b0() {
        ji.r rVar = (ji.r) this.c;
        rVar.a0();
        rVar.b0();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023 A[RETURN] */
    @Override // ji.v3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(float f7) {
        boolean z10;
        c4 c4Var = ((ji.r) this.c).s;
        if (c4Var != null) {
            FrameLayout frameLayout = c4Var.H;
            if (frameLayout != null) {
                frameLayout.getLocationOnScreen(new int[2]);
                if (f7 >= r4[1]) {
                    z10 = true;
                    c4Var.e(z10, true);
                    if (!z10) {
                        return true;
                    }
                }
            }
            z10 = false;
            c4Var.e(z10, true);
            if (!z10) {
            }
        }
        return false;
    }

    @Override // ji.v3
    public void c0(h1 h1Var, boolean z10) {
        ((ji.r) this.c).b.w1(h1Var, z10);
    }

    @Override // g2.g
    public g2.h createDataSource() {
        return new g2.n((Context) this.b, ((g2.o) this.c).createDataSource());
    }

    @Override // d6.h
    public void d(d6.f fVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((d6.c) fVar).a() + " " + str);
    }

    public void d0(g gVar) {
        d dVar;
        g gVar2;
        int i10;
        Log.d("CAST_CONTROLLER", "set current media");
        k kVar = (k) this.b;
        g gVar3 = (g) kVar.c;
        if (b5.d.u()) {
            if (gVar3 == null && gVar == null) {
                return;
            }
            if (gVar3 != null) {
                ArrayList arrayList = gVar3.a;
                if (gVar != null && arrayList.size() == gVar.a.size()) {
                    for (0; i10 < arrayList.size(); i10 + 1) {
                        f a2 = gVar3.a(i10);
                        f a10 = gVar.a(i10);
                        i10 = ((a2 == null && a10 == null) || (a2 != null && a10 != null && Objects.equals(a2.a, a10.a) && Objects.equals(a2.b, a10.b) && Objects.equals(a2.c, a10.c) && Objects.equals(a2.d, a10.d) && a2.e == a10.e && a2.f == a10.f)) ? i10 + 1 : 0;
                    }
                    return;
                }
            }
        }
        if (((a) kVar.d) != null && gVar != null) {
            kVar.l(gVar);
        }
        if (((a) kVar.d) != null && (gVar2 = (g) kVar.c) != null) {
            kVar.S(gVar2);
        }
        if (gVar != null && gVar.a.size() > 0 && !gVar.a(0).a.startsWith("audio/") && (dVar = (d) kVar.b) != null) {
            dVar.l(null, null);
        }
        a aVar = (a) kVar.d;
        if (aVar != null && gVar != null) {
            aVar.d = gVar;
            aVar.g = 0;
            aVar.h = 0;
            aVar.p();
        }
        kVar.c = gVar;
    }

    @Override // d6.h
    public void e(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((d6.c) fVar).a() + " " + i10);
    }

    public void e0(p pVar) {
        this.b = pVar;
        if (pVar.a() != null) {
            pVar.a().getClass();
            String str = pVar.a().d;
            if (str != null) {
                this.c = str;
            }
        }
    }

    @Override // d6.h
    public void f(d6.f fVar, boolean z10) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((d6.c) fVar).a() + " " + z10);
    }

    public void f0(d6.c cVar) {
        k kVar = (k) this.b;
        if (cVar == null) {
            return;
        }
        n6.l.e("Must be called from the main thread.");
        e6.h hVar = cVar.j;
        String a2 = cVar.a();
        if (TextUtils.isEmpty(a2) || hVar == null) {
            return;
        }
        a aVar = (a) kVar.d;
        if (aVar == null || !TextUtils.equals(aVar.c.a(), a2)) {
            kVar.V(new a(cVar, (d6.g) this.c, hVar));
            n6.l.e("Must be called from the main thread.");
            CastDevice castDevice = cVar.k;
            String str = castDevice != null ? castDevice.d : null;
            PhotoViewer t12 = PhotoViewer.t1();
            d.i();
            if (t12.E == null || t12.e0 == null || !t12.R1()) {
                return;
            }
            new zc(t12.e0, new bi.b()).Q(R.raw.forward, 36, !TextUtils.isEmpty(str) ? LocaleController.formatString(R.string.ChromecastStartedTo, str) : LocaleController.getString(R.string.ChromecastStarted)).j();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r2.b(r6, r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // ee.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(ee.c cVar, md.c cVar2) {
        ee.d dVar;
        int i10;
        b bVar;
        Throwable th2;
        if (cVar2 instanceof ee.d) {
            dVar = (ee.d) cVar2;
            int i11 = dVar.b;
            if ((i11 & TLObject.FLAG_31) != 0) {
                dVar.b = i11 - TLObject.FLAG_31;
                Object obj = dVar.a;
                Object obj2 = ld.a.a;
                i10 = dVar.b;
                if (i10 != 0) {
                    i8.b(obj);
                    ee.b bVar2 = (ee.b) this.b;
                    dVar.d = this;
                    dVar.e = cVar;
                    dVar.b = 1;
                    obj = ee.o.a(bVar2, cVar, dVar);
                    if (obj != obj2) {
                        bVar = this;
                    }
                    return obj2;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i8.b(obj);
                    return id.i.a;
                }
                cVar = dVar.e;
                bVar = dVar.d;
                i8.b(obj);
                th2 = (Throwable) obj;
                if (th2 != null) {
                    y yVar = (y) bVar.c;
                    dVar.d = null;
                    dVar.e = null;
                    dVar.b = 2;
                }
                return id.i.a;
            }
        }
        dVar = new ee.d(this, cVar2);
        Object obj3 = dVar.a;
        Object obj22 = ld.a.a;
        i10 = dVar.b;
        if (i10 != 0) {
        }
        th2 = (Throwable) obj3;
        if (th2 != null) {
        }
        return id.i.a;
    }

    public void g0(q qVar) {
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

    @Override // ji.v3
    public void h(u3 u3Var, View view) {
        ji.r rVar = (ji.r) this.c;
        m80 m80Var = new m80(rVar, (c6) this.b, view, false, false, true);
        m80Var.Q = true;
        rVar.H = l4.c(m80Var, rVar.b.f0, rVar.getContext(), (c6) this.b, u3Var, true);
    }

    public void h0(g3 g3Var) {
        try {
            p0(g3Var, (q3) this.b);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // d6.h
    public void i(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((d6.c) fVar).a() + " " + i10);
        ((k) this.b).V(null);
    }

    public void i0(g3 g3Var, int i10, long j10) {
        try {
            p3 p3Var = (p3) ((q3) this.b).g();
            p3Var.c();
            q3.p((q3) p3Var.b, i10);
            q3 q3Var = (q3) p3Var.a();
            this.b = q3Var;
            if (j10 != 0) {
                p3 p3Var2 = (p3) q3Var.g();
                p3Var2.c();
                q3.r((q3) p3Var2.b, j10);
                q3Var = (q3) p3Var2.a();
            }
            p0(g3Var, q3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // g6.n
    public void j(String str, long j10, long j11, long j12) {
        n nVar = (n) this.b;
        if (nVar != null) {
            nVar.j(str, j10, j11, j12);
        }
    }

    public void j0(g3 g3Var, long j10, boolean z10) {
        q3 q3Var;
        try {
            f3 f3Var = (f3) g3Var.g();
            com.google.android.gms.internal.play_billing.u3 u3Var = (com.google.android.gms.internal.play_billing.u3) g3Var.o().g();
            u3Var.c();
            w3.n((w3) u3Var.b, z10);
            f3Var.c();
            g3.r((g3) f3Var.b, (w3) u3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j10 == 0) {
                q3Var = (q3) this.b;
            } else {
                p3 p3Var = (p3) ((q3) this.b).g();
                p3Var.c();
                q3.r((q3) p3Var.b, j10);
                q3Var = (q3) p3Var.a();
            }
            p0(g3Var2, q3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // d6.h
    public void k(d6.f fVar) {
        d6.c cVar = (d6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarting " + cVar.a());
        f0(cVar);
    }

    public void k0(g3 g3Var, int i10, long j10, boolean z10) {
        q3 q3Var;
        try {
            p3 p3Var = (p3) ((q3) this.b).g();
            p3Var.c();
            q3.p((q3) p3Var.b, i10);
            this.b = (q3) p3Var.a();
            f3 f3Var = (f3) g3Var.g();
            com.google.android.gms.internal.play_billing.u3 u3Var = (com.google.android.gms.internal.play_billing.u3) g3Var.o().g();
            u3Var.c();
            w3.n((w3) u3Var.b, z10);
            f3Var.c();
            g3.r((g3) f3Var.b, (w3) u3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j10 == 0) {
                q3Var = (q3) this.b;
            } else {
                p3 p3Var2 = (p3) ((q3) this.b).g();
                p3Var2.c();
                q3.r((q3) p3Var2.b, j10);
                q3Var = (q3) p3Var2.a();
            }
            p0(g3Var2, q3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // ji.v3
    public void l(ji.w3 w3Var, View view) {
        ji.r rVar = (ji.r) this.c;
        m80 m80Var = new m80(rVar, (c6) this.b, view, false, false, true);
        m80Var.Q = true;
        m2 m2Var = rVar.b.f0;
        rVar.getContext();
        rVar.H = l4.b(m80Var, m2Var, w3Var, true);
    }

    public void l0(m3 m3Var) {
        try {
            x3 t10 = y3.t();
            t10.d((q3) this.b);
            t10.c();
            y3.p((y3) t10.b, m3Var);
            ((b2.u) this.c).i((y3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // ji.v3
    public void m(int i10) {
        ji.r.R((ji.r) this.c, 74, i10);
    }

    @Override // ji.v3
    public void m0(i6 i6Var, String str) {
        ji.r rVar = (ji.r) this.c;
        if (rVar.v == null) {
            c6 c6Var = (c6) this.b;
            rVar.v = new m.q3(new h0(20, this, c6Var), c6Var);
        }
        rVar.v.f(i6Var, str);
    }

    @Override // d6.h
    public void n(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((d6.c) fVar).a() + " " + i10);
    }

    public void n0(b4 b4Var) {
        try {
            b2.u uVar = (b2.u) this.c;
            x3 t10 = y3.t();
            t10.d((q3) this.b);
            t10.c();
            y3.r((y3) t10.b, b4Var);
            uVar.i((y3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // ji.v3
    public void o() {
        ji.r rVar = (ji.r) this.c;
        ji.x3 x3Var = rVar.r;
        c4 c4Var = rVar.s;
        if (c4Var != null) {
            k3 k3Var = x3Var.l3;
            int i10 = (k3Var != null && k3Var.x() && x3Var.D4()) ? 1 : 0;
            if (c4Var.a0 == 2) {
                c4Var.b0 = i10;
            } else {
                c4Var.f(i10, true);
            }
            if (i10 != 0) {
                rVar.Z();
            }
        }
        rVar.c0();
    }

    public void o0(com.google.android.gms.internal.play_billing.c4 c4Var) {
        if (c4Var == null) {
            return;
        }
        try {
            x3 t10 = y3.t();
            t10.d((q3) this.b);
            t10.c();
            y3.s((y3) t10.b, c4Var);
            ((b2.u) this.c).i((y3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        boolean z10;
        d6.b bVar;
        switch (this.a) {
            case 2:
                a9.e eVar = (a9.e) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                synchronized (eVar.f) {
                    eVar.e.remove(taskCompletionSource);
                }
                return;
            default:
                com.google.android.gms.internal.cast.r rVar = (com.google.android.gms.internal.cast.r) this.b;
                d6.b bVar2 = (d6.b) this.c;
                p4.y yVar = rVar.c;
                g6.b bVar3 = com.google.android.gms.internal.cast.r.j;
                if (task.isSuccessful()) {
                    Bundle bundle = (Bundle) task.getResult();
                    boolean z11 = bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                    bVar3.b("The module-to-client output switcher flag %s", true != z11 ? "not existed" : "existed");
                    if (z11) {
                        z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                        Log.i(bVar3.a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.x)));
                        boolean z12 = !z10 && bVar2.x;
                        if (yVar != null || (bVar = rVar.d) == null) {
                            return;
                        }
                        boolean z13 = bVar.v;
                        boolean z14 = bVar.s;
                        z zVar = new z();
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 30) {
                            zVar.b = z12;
                        }
                        if (i10 >= 30) {
                            zVar.d = z13;
                        }
                        if (i10 >= 30) {
                            zVar.c = z14;
                        }
                        p4.y.i(new p4.a0(zVar));
                        Log.i(bVar3.a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(rVar.i), Boolean.valueOf(z12), Boolean.valueOf(z13), Boolean.valueOf(z14)));
                        if (z13) {
                            com.google.android.gms.internal.cast.u uVar = rVar.f;
                            n6.l.h(uVar);
                            com.google.android.gms.internal.cast.q qVar = new com.google.android.gms.internal.cast.q(uVar);
                            p4.y.b();
                            p4.y.c().f = qVar;
                            d2.a(d1.b0);
                            return;
                        }
                        return;
                    }
                }
                z10 = true;
                Log.i(bVar3.a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.x)));
                if (z10) {
                }
                if (yVar != null) {
                    return;
                } else {
                    return;
                }
        }
    }

    @Override // ji.v3
    public void onContentChanged() {
        ji.r rVar = (ji.r) this.c;
        c4 c4Var = rVar.s;
        if (c4Var != null) {
            c4Var.setSendLoading(rVar.r.n3());
        }
        rVar.Y(true);
        rVar.b0();
        ji.d dVar = rVar.P;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        AndroidUtilities.runOnUIThread(dVar, 1000L);
    }

    @Override // d6.h
    public void p(d6.f fVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((d6.c) fVar).a());
    }

    public void p0(g3 g3Var, q3 q3Var) {
        if (g3Var == null) {
            return;
        }
        try {
            x3 t10 = y3.t();
            t10.d(q3Var);
            t10.c();
            y3.n((y3) t10.b, g3Var);
            ((b2.u) this.c).i((y3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // d6.h
    public void q(d6.f fVar, String str) {
        d6.c cVar = (d6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarted " + cVar.a() + " " + str);
        f0(cVar);
    }

    public void q0(i3 i3Var, q3 q3Var) {
        try {
            x3 t10 = y3.t();
            t10.d(q3Var);
            t10.c();
            y3.o((y3) t10.b, i3Var);
            ((b2.u) this.c).i((y3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // d6.h
    public void r(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((d6.c) fVar).a() + " " + i10);
    }

    @Override // fa.a
    public StackTraceElement[] s0(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        fa.a[] aVarArr = (fa.a[]) this.b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            fa.a aVar = aVarArr[i10];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.s0(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? ((rb.b) this.c).s0(stackTraceElementArr2) : stackTraceElementArr2;
    }

    @Override // f6.a
    public void t(Bitmap bitmap) {
        n4.s sVar = (n4.s) this.b;
        sVar.c = bitmap;
        f6.f fVar = (f6.f) this.c;
        fVar.l = sVar;
        fVar.b();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        j6.a aVar = (j6.a) this.b;
        Bundle bundle = (Bundle) this.c;
        aVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        return (bundle2 == null || !bundle2.containsKey("google.messenger")) ? task : aVar.a(bundle).onSuccessTask(j6.m.a, j6.b.b);
    }

    public String toString() {
        switch (this.a) {
            case 22:
                return ((HashMap) this.b).toString();
            default:
                return super.toString();
        }
    }

    @Override // ji.v3
    public void u() {
        c4 c4Var = ((ji.r) this.c).s;
        if (c4Var != null) {
            int i10 = c4Var.a0;
            if (i10 == 2) {
                i10 = 0;
            }
            c4Var.b0 = i10;
            c4Var.e(false, false);
            c4Var.f(2, true);
        }
    }

    @Override // g6.n
    public void v(String str, long j10, int i10, Object obj, long j11, long j12) {
        ((g6.m) this.c).g = null;
        n nVar = (n) this.b;
        if (nVar != null) {
            nVar.v(str, j10, i10, obj, j11, j12);
        }
    }

    public c5.e w() {
        if (((p) this.b) != null) {
            return new c5.e(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    public void y() {
        this.b = null;
        this.c = null;
    }

    public boolean z(int i10) {
        return ((b2.v) this.b).a.get(i10);
    }

    @Override // com.google.android.gms.internal.clearcut.g
    public Object zzp() {
        com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) this.b;
        com.google.android.gms.internal.clearcut.b bVar = (com.google.android.gms.internal.clearcut.b) this.c;
        bVar.getClass();
        Map b10 = com.google.android.gms.internal.clearcut.d.e() ? ((Boolean) com.google.android.gms.internal.clearcut.d.c(new j("gms:phenotype:phenotype_flag:debug_disable_caching"))).booleanValue() : false ? bVar.b() : bVar.e;
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

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ b(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public b(Context context, q3 q3Var) {
        this.a = 10;
        b2.u uVar = new b2.u(1);
        try {
            l5.s.b(context);
            uVar.c = l5.s.a().c(j5.a.e).a("PLAY_BILLING_LIBRARY", new i5.c("proto"), new sb.a(4));
        } catch (Throwable unused) {
            uVar.b = true;
        }
        this.c = uVar;
        this.b = q3Var;
    }

    public b(i0 i0Var) {
        this.a = 6;
        this.b = i0Var;
        this.c = new CopyOnWriteArrayList();
    }

    public b(fa.a[] aVarArr) {
        this.a = 19;
        this.b = aVarArr;
        this.c = new rb.b(8);
    }

    public b() {
        boolean z10 = false;
        this.a = 0;
        d6.a c10 = d6.a.c(ApplicationLoader.applicationContext);
        ul0 ul0Var = new ul0(21);
        c10.getClass();
        n6.l.e("Must be called from the main thread.");
        d6.g gVar = c10.c;
        gVar.getClass();
        try {
            d6.y yVar = gVar.a;
            d6.j jVar = new d6.j(ul0Var);
            Parcel N0 = yVar.N0();
            com.google.android.gms.internal.cast.v.d(N0, jVar);
            yVar.R0(N0, 4);
        } catch (RemoteException e) {
            d6.g.c.a(e, "Unable to call %s on %s.", "addCastStateListener", d6.y.class.getSimpleName());
        }
        this.b = new k(24, z10);
        d6.g b10 = c10.b();
        this.c = b10;
        b10.a(this);
        f0(b10.c());
    }

    public b(b2.v vVar, SparseArray sparseArray) {
        this.a = 25;
        this.b = vVar;
        SparseBooleanArray sparseBooleanArray = vVar.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            int a2 = vVar.a(i10);
            j2.a aVar = (j2.a) sparseArray.get(a2);
            aVar.getClass();
            sparseArray2.append(a2, aVar);
        }
        this.c = sparseArray2;
    }

    public b(qi.e eVar, rb.b bVar, androidx.emoji2.text.d dVar) {
        this.a = 5;
        this.b = eVar;
        this.c = dVar;
    }

    public b(Context context, int i10) {
        this.a = i10;
        switch (i10) {
            case 20:
                g2.o oVar = new g2.o();
                this.b = context.getApplicationContext();
                this.c = oVar;
                break;
            default:
                this.b = context;
                break;
        }
    }

    public b(Handler handler, k2.u uVar) {
        this.a = 29;
        if (uVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = uVar;
    }

    public b(ArrayList arrayList, ArrayList arrayList2) {
        this.a = 23;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.b)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.c)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    public b(int i10, int i11) {
        this.a = 23;
        this.b = new int[]{i10, i11};
        this.c = new float[]{0.0f, 1.0f};
    }

    public b(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.a = 4;
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

    @Override // j4.a0
    public void b(k0 k0Var, c3.q qVar, f0 f0Var) {
    }

    public b(int i10, int i11, int i12) {
        this.a = 23;
        this.b = new int[]{i10, i11, i12};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public b(a3.f fVar) {
        this.a = 1;
        this.c = fVar;
    }

    public b(x1 x1Var, int[] iArr) {
        this.a = 17;
        this.b = n0.u(x1Var);
        this.c = iArr;
    }

    public b(d0 d0Var) {
        this.a = 26;
        this.c = d0Var;
        this.b = new a4.g(new byte[4], 4);
    }
}
