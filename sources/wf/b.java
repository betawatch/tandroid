package wf;

import ab.b0;
import ai.h0;
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
import android.support.v4.media.session.i;
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
import androidx.fragment.app.r;
import androidx.fragment.app.u;
import bi.a4;
import bi.d3;
import ce.j;
import ce.m;
import ce.p;
import ce.x;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.internal.cast.a2;
import com.google.android.gms.internal.cast.t;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import d3.g0;
import di.a1;
import di.i4;
import di.o9;
import di.p9;
import di.z3;
import e2.s;
import e2.x1;
import f3.o;
import g6.f;
import g6.h;
import gb.z0;
import gd.k;
import h6.g;
import ii.d0;
import ii.k0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j6.n;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import li.a6;
import li.g1;
import li.g3;
import li.h4;
import li.q3;
import li.r3;
import li.s3;
import li.t3;
import li.y3;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.t0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.k60;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.an;
import org.telegram.ui.hy0;
import q4.q;
import s4.y;
import s4.z;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class b implements h, h0, ce.c, OnCompleteListener, com.google.android.gms.internal.clearcut.h, k0, n, r3 {
    public static volatile b d;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ b(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    public static boolean E(Editable editable, KeyEvent keyEvent, boolean z9) {
        v[] vVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (vVarArr = (v[]) editable.getSpans(selectionStart, selectionEnd, v.class)) != null && vVarArr.length > 0) {
                for (v vVar : vVarArr) {
                    int spanStart = editable.getSpanStart(vVar);
                    int spanEnd = editable.getSpanEnd(vVar);
                    if ((z9 && spanStart == selectionStart) || ((!z9 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static b Z() {
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

    public static String n0(b bVar) {
        Collection<String> collection = (Collection) bVar.c;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) bVar.b;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (!upperCase.matches("[A-F0-9]+")) {
                throw new IllegalArgumentException("Invalid application ID: ".concat(str));
            }
            sb2.append("/");
            sb2.append(upperCase);
        }
        if (collection != null) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
            if (str == null) {
                sb2.append("/");
            }
            sb2.append("/");
            boolean z9 = true;
            for (String str2 : collection) {
                j6.a.b(str2);
                if (!z9) {
                    sb2.append(",");
                }
                if (!j6.a.a.matcher(str2).matches()) {
                    StringBuilder sb3 = new StringBuilder(str2.length());
                    for (int i7 = 0; i7 < str2.length(); i7++) {
                        char charAt = str2.charAt(i7);
                        if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && !((charAt >= '0' && charAt <= '9') || charAt == '_' || charAt == '-' || charAt == '.' || charAt == ':'))) {
                            sb3.append(String.format("%%%04x", Integer.valueOf(charAt)));
                        } else {
                            sb3.append(charAt);
                        }
                    }
                    str2 = sb3.toString();
                }
                sb2.append(str2);
                z9 = false;
            }
        }
        if (str == null && collection == null) {
            sb2.append("/");
        }
        if (collection == null) {
            sb2.append("/");
        }
        sb2.append("//ALLOW_IPV6");
        return sb2.toString();
    }

    public static void w(b bVar, boolean z9, boolean z10) {
        synchronized (bVar) {
            boolean z11 = false;
            if (z9) {
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
            if (z9 && z10) {
                z11 = true;
            }
            if (z11) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public void A() {
        this.b = null;
        this.c = null;
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
    public Object B(ce.d dVar, kd.c cVar) {
        j jVar;
        int i7;
        b bVar;
        Throwable th2;
        p pVar;
        int i10;
        m mVar;
        switch (this.a) {
            case 9:
                if (cVar instanceof j) {
                    jVar = (j) cVar;
                    int i11 = jVar.b;
                    if ((i11 & TLObject.FLAG_31) != 0) {
                        jVar.b = i11 - TLObject.FLAG_31;
                        Object obj = jVar.a;
                        Object obj2 = jd.a.a;
                        i7 = jVar.b;
                        if (i7 != 0) {
                            af.b.c(obj);
                            ce.c cVar2 = (ce.c) this.b;
                            jVar.d = this;
                            jVar.e = dVar;
                            jVar.b = 1;
                            obj = x.b(cVar2, dVar, jVar);
                            if (obj == obj2) {
                                return obj2;
                            }
                            bVar = this;
                        } else {
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                af.b.c(obj);
                                return k.a;
                            }
                            dVar = jVar.e;
                            bVar = jVar.d;
                            af.b.c(obj);
                        }
                        th2 = (Throwable) obj;
                        if (th2 != null) {
                            z0 z0Var = (z0) bVar.c;
                            jVar.d = null;
                            jVar.e = null;
                            jVar.b = 2;
                            if (z0Var.b(dVar, th2, jVar) == obj2) {
                                return obj2;
                            }
                        }
                        return k.a;
                    }
                }
                jVar = new j(this, cVar);
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
                if (cVar instanceof p) {
                    pVar = (p) cVar;
                    int i12 = pVar.b;
                    if ((i12 & TLObject.FLAG_31) != 0) {
                        pVar.b = i12 - TLObject.FLAG_31;
                        Object obj4 = pVar.a;
                        jd.a aVar = jd.a.a;
                        i10 = pVar.b;
                        if (i10 != 0) {
                            af.b.c(obj4);
                            q qVar = (q) this.b;
                            m mVar2 = new m((jb.c) this.c, dVar);
                            try {
                                pVar.d = mVar2;
                                pVar.b = 1;
                                if (qVar.B(mVar2, pVar) == aVar) {
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
                                af.b.c(obj4);
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
                pVar = new p(this, cVar);
                Object obj42 = pVar.a;
                jd.a aVar2 = jd.a.a;
                i10 = pVar.b;
                if (i10 != 0) {
                }
                return k.a;
        }
    }

    public boolean C(int i7) {
        return ((s) this.b).a.get(i7);
    }

    public void D() {
        String str = (String) this.b;
        try {
            ga.d dVar = (ga.d) this.c;
            dVar.getClass();
            new File((File) dVar.d, str).createNewFile();
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e10);
        }
    }

    public void F(l2.d dVar) {
        synchronized (dVar) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new g0(this, dVar, 1));
        }
    }

    @Override // li.r3
    public void G() {
        y3 y3Var = ((li.p) this.c).s;
        if (y3Var != null) {
            y3Var.e(false, true);
            int i7 = y3Var.b0;
            y3Var.g(i7 != 2 ? i7 : 0, true);
        }
    }

    @Override // j6.n
    public void H(String str, long j3, int i7, Object obj, long j10, long j11) {
        int i10;
        j6.m mVar = (j6.m) this.c;
        if (((n) this.b) != null) {
            if (i7 == 2001) {
                Object[] objArr = {Integer.valueOf(mVar.i)};
                j6.b bVar = mVar.a;
                Log.w(bVar.a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((h6.h) mVar.h.b).i.iterator();
                while (it.hasNext()) {
                    ((g) it.next()).o();
                }
                i10 = 2001;
            } else {
                i10 = i7;
            }
            ((n) this.b).H(str, j3, i10, obj, j10, j11);
        }
    }

    public void I(r f10, boolean z9) {
        kotlin.jvm.internal.j.e(f10, "f");
        r rVar = ((i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.I(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z9) {
                throw null;
            }
            throw null;
        }
    }

    @Override // li.r3
    public k60 J(View view) {
        li.p pVar = (li.p) this.c;
        k60 k60Var = new k60(pVar, (f6) this.b, view, false, false, true);
        pVar.H = k60Var;
        return k60Var;
    }

    public void K(r f10, boolean z9) {
        kotlin.jvm.internal.j.e(f10, "f");
        i0 i0Var = (i0) this.b;
        u uVar = i0Var.w.b;
        r rVar = i0Var.y;
        if (rVar != null) {
            rVar.p().o.K(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z9) {
                throw null;
            }
            throw null;
        }
    }

    public void L(r f10, boolean z9) {
        kotlin.jvm.internal.j.e(f10, "f");
        r rVar = ((i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.L(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z9) {
                throw null;
            }
            throw null;
        }
    }

    public void M(r f10, boolean z9) {
        kotlin.jvm.internal.j.e(f10, "f");
        r rVar = ((i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.M(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z9) {
                throw null;
            }
            throw null;
        }
    }

    @Override // li.r3
    public void N() {
        li.p pVar = (li.p) this.c;
        pVar.c0();
        pVar.d0();
    }

    public void O(r f10, boolean z9) {
        kotlin.jvm.internal.j.e(f10, "f");
        r rVar = ((i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.O(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z9) {
                throw null;
            }
            throw null;
        }
    }

    public void Q(r f10, boolean z9) {
        kotlin.jvm.internal.j.e(f10, "f");
        r rVar = ((i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.Q(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z9) {
                throw null;
            }
            throw null;
        }
    }

    public void R(r f10, boolean z9) {
        kotlin.jvm.internal.j.e(f10, "f");
        i0 i0Var = (i0) this.b;
        u uVar = i0Var.w.b;
        r rVar = i0Var.y;
        if (rVar != null) {
            rVar.p().o.R(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z9) {
                throw null;
            }
            throw null;
        }
    }

    public void S(r f10, boolean z9) {
        kotlin.jvm.internal.j.e(f10, "f");
        r rVar = ((i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.S(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z9) {
                throw null;
            }
            throw null;
        }
    }

    public void T(r f10, boolean z9) {
        kotlin.jvm.internal.j.e(f10, "f");
        r rVar = ((i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.T(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z9) {
                throw null;
            }
            throw null;
        }
    }

    public void U(r f10, Bundle bundle, boolean z9) {
        kotlin.jvm.internal.j.e(f10, "f");
        r rVar = ((i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.U(f10, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z9) {
                throw null;
            }
            throw null;
        }
    }

    public void V(r f10, boolean z9) {
        kotlin.jvm.internal.j.e(f10, "f");
        r rVar = ((i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.V(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z9) {
                throw null;
            }
            throw null;
        }
    }

    public void W(r f10, boolean z9) {
        kotlin.jvm.internal.j.e(f10, "f");
        r rVar = ((i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.W(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z9) {
                throw null;
            }
            throw null;
        }
    }

    public void X(r f10, boolean z9) {
        kotlin.jvm.internal.j.e(f10, "f");
        r rVar = ((i0) this.b).y;
        if (rVar != null) {
            rVar.p().o.X(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z9) {
                throw null;
            }
            throw null;
        }
    }

    public o Y(Object... objArr) {
        Constructor a10;
        synchronized (((AtomicBoolean) this.c)) {
            if (!((AtomicBoolean) this.c).get()) {
                try {
                    a10 = ((a1) this.b).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.c).set(true);
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
            a10 = null;
        }
        if (a10 == null) {
            return null;
        }
        try {
            return (o) a10.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023 A[RETURN] */
    @Override // li.r3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(float f10) {
        boolean z9;
        y3 y3Var = ((li.p) this.c).s;
        if (y3Var != null) {
            FrameLayout frameLayout = y3Var.H;
            if (frameLayout != null) {
                frameLayout.getLocationOnScreen(new int[2]);
                if (f10 >= r4[1]) {
                    z9 = true;
                    y3Var.e(z9, true);
                    if (!z9) {
                        return true;
                    }
                }
            }
            z9 = false;
            y3Var.e(z9, true);
            if (!z9) {
            }
        }
        return false;
    }

    public synchronized Map a0() {
        try {
            if (((Map) this.c) == null) {
                this.c = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.c;
    }

    @Override // g6.h
    public void b(f fVar, boolean z9) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((g6.c) fVar).a() + " " + z9);
    }

    public android.support.v4.media.session.m b0() {
        MediaController.TransportControls transportControls = ((android.support.v4.media.session.h) this.b).a.getTransportControls();
        int i7 = Build.VERSION.SDK_INT;
        return i7 >= 29 ? new android.support.v4.media.session.o(transportControls) : i7 >= 24 ? new android.support.v4.media.session.n(transportControls) : new android.support.v4.media.session.m(transportControls);
    }

    @Override // g6.h
    public void c(f fVar, int i7) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((g6.c) fVar).a() + " " + i7);
    }

    public boolean c0(CharSequence charSequence, int i7, int i10, androidx.emoji2.text.o oVar) {
        if (oVar.c == 0) {
            androidx.emoji2.text.h hVar = (androidx.emoji2.text.h) this.c;
            s1.a b10 = oVar.b();
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
            oVar.c = textPaint.hasGlyph(sb3) ? 2 : 1;
        }
        return oVar.c == 2;
    }

    @Override // ii.k0
    public void close() {
        ((d0) this.c).k1.E(0);
    }

    @Override // li.r3
    public void d(s3 s3Var, View view) {
        li.p pVar = (li.p) this.c;
        k60 k60Var = new k60(pVar, (f6) this.b, view, false, false, true);
        k60Var.Q = true;
        f2 f2Var = pVar.b.W1;
        pVar.getContext();
        pVar.H = h4.b(k60Var, f2Var, s3Var, true);
    }

    public boolean d0() {
        return ((a) ((hy0) this.b).d) != null;
    }

    @Override // g6.h
    public void e(f fVar, int i7) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((g6.c) fVar).a() + " " + i7);
    }

    public void e0(boolean z9, boolean z10, float f10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
        z3 z3Var = (z3) this.c;
        p9 p9Var = z3Var.e;
        p9.A1 = f10;
        o9 o9Var = p9Var.z0;
        if (o9Var != null) {
            o9Var.setSpeed(f10);
        }
        i4.Y(z3Var.x, z9);
        if (!z10 || actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() == null) {
            return;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
    }

    @Override // g6.h
    public void f(f fVar, int i7) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((g6.c) fVar).a() + " " + i7);
    }

    public void f0(androidx.mediarouter.app.q qVar) {
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

    @Override // li.r3
    public void g(int i7) {
        li.p.S((li.p) this.c, 74, i7);
    }

    public void g0(Object obj) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new d3(this, obj, SystemClock.elapsedRealtime(), 3));
        }
    }

    @Override // li.r3
    public void h() {
        li.p pVar = (li.p) this.c;
        t3 t3Var = pVar.r;
        y3 y3Var = pVar.s;
        if (y3Var != null) {
            g3 g3Var = t3Var.u3;
            int i7 = (g3Var != null && g3Var.x() && t3Var.F4()) ? 1 : 0;
            if (y3Var.a0 == 2) {
                y3Var.b0 = i7;
            } else {
                y3Var.g(i7, true);
            }
            if (i7 != 0) {
                pVar.b0();
            }
        }
        pVar.e0();
    }

    public void h0(g7.c cVar) {
        d dVar;
        g7.c cVar2;
        int i7;
        Log.d("CAST_CONTROLLER", "set current media");
        hy0 hy0Var = (hy0) this.b;
        g7.c cVar3 = (g7.c) hy0Var.c;
        if (d1.f.u()) {
            if (cVar3 == null && cVar == null) {
                return;
            }
            if (cVar3 != null) {
                ArrayList arrayList = cVar3.a;
                if (cVar != null && arrayList.size() == cVar.a.size()) {
                    for (0; i7 < arrayList.size(); i7 + 1) {
                        e a10 = cVar3.a(i7);
                        e a11 = cVar.a(i7);
                        i7 = ((a10 == null && a11 == null) || (a10 != null && a11 != null && Objects.equals(a10.a, a11.a) && Objects.equals(a10.b, a11.b) && Objects.equals(a10.c, a11.c) && Objects.equals(a10.d, a11.d) && a10.e == a11.e && a10.f == a11.f)) ? i7 + 1 : 0;
                    }
                    return;
                }
            }
        }
        if (((a) hy0Var.d) != null && cVar != null) {
            hy0Var.j(cVar);
        }
        if (((a) hy0Var.d) != null && (cVar2 = (g7.c) hy0Var.c) != null) {
            hy0Var.H(cVar2);
        }
        if (cVar != null && cVar.a.size() > 0 && !cVar.a(0).a.startsWith("audio/") && (dVar = (d) hy0Var.b) != null) {
            dVar.l(null, null);
        }
        a aVar = (a) hy0Var.d;
        if (aVar != null && cVar != null) {
            aVar.d = cVar;
            aVar.g = 0;
            aVar.h = 0;
            aVar.p();
        }
        hy0Var.c = cVar;
    }

    @Override // g6.h
    public void i(f fVar, String str) {
        g6.c cVar = (g6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarted " + cVar.a() + " " + str);
        j0(cVar);
    }

    public void i0(int i7) {
        try {
            l8.e eVar = (l8.e) this.b;
            Parcel P0 = eVar.P0();
            P0.writeInt(i7);
            eVar.T0(P0, 16);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // g6.h
    public void j(f fVar, int i7) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((g6.c) fVar).a() + " " + i7);
        ((hy0) this.b).K(null);
    }

    public void j0(g6.c cVar) {
        hy0 hy0Var = (hy0) this.b;
        if (cVar == null) {
            return;
        }
        q6.m.d("Must be called from the main thread.");
        h6.h hVar = cVar.j;
        String a10 = cVar.a();
        if (TextUtils.isEmpty(a10) || hVar == null) {
            return;
        }
        a aVar = (a) hy0Var.d;
        if (aVar == null || !TextUtils.equals(aVar.c.a(), a10)) {
            hy0Var.K(new a(cVar, (g6.g) this.c, hVar));
            q6.m.d("Must be called from the main thread.");
            CastDevice castDevice = cVar.k;
            String str = castDevice != null ? castDevice.d : null;
            PhotoViewer p12 = PhotoViewer.p1();
            d.i();
            if (p12.E == null || p12.e0 == null || !p12.P1()) {
                return;
            }
            new hc(p12.e0, new di.b()).Q(R.raw.forward, 36, !TextUtils.isEmpty(str) ? hd.a0(null, null, 2131752102, str) : hd.M0(2131752103, null)).j();
        }
    }

    @Override // ii.k0
    public void k(long j3) {
        ((f2) this.b).presentFragment(an.ra(j3));
        ((d0) this.c).dismiss();
    }

    public void k0(androidx.mediarouter.app.q qVar) {
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

    @Override // ai.h0
    public void l(ai.i0 i0Var) {
        org.telegram.messenger.g0.E2(i0Var);
        ((Runnable) this.c).run();
    }

    public void l0(ArrayList arrayList) {
        i2.r rVar;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (((i2.q) arrayList.get(i7)).a == 1) {
                try {
                    rVar = new i2.r((i2.q) arrayList.get(i7));
                } catch (i2.p unused) {
                    rVar = null;
                }
                this.c = rVar;
            }
        }
    }

    @Override // ai.h0
    public void m(String str) {
        ((c20) this.b).a(str);
    }

    public void m0(x1 x1Var) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new a4(24, this, x1Var));
        }
    }

    @Override // li.r3
    public void n(li.a aVar) {
        li.p pVar = (li.p) this.c;
        di diVar = pVar.b;
        f2 f2Var = diVar.W1;
        if (f2Var != null && aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && org.telegram.messenger.g0.J1(f2Var)) {
            di diVar2 = new di(pVar.getContext(), diVar.W1, false, false, false, null);
            diVar2.T3 = new pb.b(13);
            diVar2.G1 = true;
            diVar2.r3.setVisibility(8);
            diVar2.q4 = new a3.h(pVar, aVar, diVar2, 14);
            diVar2.e1();
            diVar2.show();
        }
    }

    @Override // li.r3
    public void o(a6 a6Var, String str) {
        li.p pVar = (li.p) this.c;
        if (pVar.w == null) {
            f6 f6Var = (f6) this.b;
            pVar.w = new ga.d(new ab.g(22, this, f6Var), f6Var);
        }
        pVar.w.k(a6Var, str);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        boolean z9;
        g6.b bVar;
        com.google.android.gms.internal.cast.p pVar = (com.google.android.gms.internal.cast.p) this.b;
        g6.b bVar2 = (g6.b) this.c;
        s4.x xVar = pVar.c;
        j6.b bVar3 = com.google.android.gms.internal.cast.p.j;
        if (task.isSuccessful()) {
            Bundle bundle = (Bundle) task.getResult();
            boolean z10 = bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
            bVar3.b("The module-to-client output switcher flag %s", true != z10 ? "not existed" : "existed");
            if (z10) {
                z9 = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                Log.i(bVar3.a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z9), Boolean.valueOf(bVar2.y)));
                boolean z11 = !z9 && bVar2.y;
                if (xVar != null || (bVar = pVar.d) == null) {
                }
                boolean z12 = bVar.w;
                boolean z13 = bVar.s;
                y yVar = new y();
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 30) {
                    yVar.b = z11;
                }
                if (i7 >= 30) {
                    yVar.d = z12;
                }
                if (i7 >= 30) {
                    yVar.c = z13;
                }
                s4.x.i(new z(yVar));
                Log.i(bVar3.a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(pVar.i), Boolean.valueOf(z11), Boolean.valueOf(z12), Boolean.valueOf(z13)));
                if (z12) {
                    com.google.android.gms.internal.cast.s sVar = pVar.f;
                    q6.m.g(sVar);
                    com.google.android.gms.internal.cast.o oVar = new com.google.android.gms.internal.cast.o(sVar);
                    s4.x.b();
                    s4.x.c().f = oVar;
                    a2.a(com.google.android.gms.internal.cast.a1.b0);
                    return;
                }
                return;
            }
        }
        z9 = true;
        Log.i(bVar3.a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z9), Boolean.valueOf(bVar2.y)));
        if (z9) {
        }
        if (xVar != null) {
        }
    }

    @Override // li.r3
    public void onContentChanged() {
        li.p pVar = (li.p) this.c;
        y3 y3Var = pVar.s;
        if (y3Var != null) {
            y3Var.setSendLoading(pVar.r.p3());
        }
        pVar.a0(true);
        pVar.d0();
        li.d dVar = pVar.P;
        org.telegram.messenger.g0.r(dVar);
        org.telegram.messenger.g0.i3(dVar, 1000L);
    }

    @Override // g6.h
    public void p(f fVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((g6.c) fVar).a() + " " + str);
    }

    @Override // li.r3
    public void q() {
        y3 y3Var = ((li.p) this.c).s;
        if (y3Var != null) {
            int i7 = y3Var.a0;
            if (i7 == 2) {
                i7 = 0;
            }
            y3Var.b0 = i7;
            y3Var.e(false, false);
            y3Var.g(2, true);
        }
    }

    @Override // li.r3
    public void r(g1 g1Var, boolean z9) {
        ((li.p) this.c).b.h1(g1Var, z9);
    }

    @Override // g6.h
    public void s(f fVar) {
        g6.c cVar = (g6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarting " + cVar.a());
        j0(cVar);
    }

    @Override // g6.h
    public void t(f fVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((g6.c) fVar).a());
    }

    public String toString() {
        switch (this.a) {
            case 7:
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

    @Override // ii.k0
    public void u() {
        d0 d0Var = (d0) this.c;
        d0Var.s1.d.f3.O(true);
        d0Var.r1.d.f3.O(true);
    }

    @Override // j6.n
    public void v(String str, long j3, long j10, long j11) {
        n nVar = (n) this.b;
        if (nVar != null) {
            nVar.v(str, j3, j10, j11);
        }
    }

    @Override // li.r3
    public void x() {
        li.p pVar = (li.p) this.c;
        if (pVar.getCurrentItemTop() != pVar.I) {
            pVar.b.M1(pVar, 0);
        }
        pVar.f0();
        li.p.O(pVar);
    }

    @Override // li.r3
    public void y(int i7) {
        li.p pVar = (li.p) this.c;
        pVar.b.M1(pVar, i7);
        pVar.f0();
        li.p.O(pVar);
    }

    @Override // li.r3
    public void z(q3 q3Var, View view) {
        li.p pVar = (li.p) this.c;
        k60 k60Var = new k60(pVar, (f6) this.b, view, false, false, true);
        k60Var.Q = true;
        pVar.H = h4.c(k60Var, pVar.b.W1, pVar.getContext(), (f6) this.b, q3Var, true);
    }

    @Override // com.google.android.gms.internal.clearcut.h
    public Object zzp() {
        com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) this.b;
        com.google.android.gms.internal.clearcut.b bVar = (com.google.android.gms.internal.clearcut.b) this.c;
        bVar.getClass();
        Map b10 = com.google.android.gms.internal.clearcut.d.e() ? ((Boolean) com.google.android.gms.internal.clearcut.d.c(new com.google.android.gms.internal.clearcut.e("gms:phenotype:phenotype_flag:debug_disable_caching", 0))).booleanValue() : false ? bVar.b() : bVar.e;
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

    public /* synthetic */ b(int i7, boolean z9) {
        this.a = i7;
    }

    public /* synthetic */ b(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public /* synthetic */ b(Object obj, Object obj2, boolean z9, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    public b(l8.e eVar) {
        this.a = 26;
        new HashMap();
        q6.m.g(eVar);
        this.b = eVar;
    }

    public b(p6.a aVar) {
        this.a = 22;
        this.b = aVar == null ? null : aVar.b;
    }

    public b(i0 i0Var) {
        this.a = 6;
        this.b = i0Var;
        this.c = new CopyOnWriteArrayList();
    }

    public b(int i7) {
        this.a = i7;
        switch (i7) {
            case 13:
                this.b = ByteBuffer.allocateDirect(500);
                break;
            case 24:
                this.b = new HashMap();
                break;
            default:
                g6.a c10 = g6.a.c(t0.b);
                v0.j jVar = new v0.j(12);
                c10.getClass();
                q6.m.d("Must be called from the main thread.");
                g6.g gVar = c10.c;
                gVar.getClass();
                boolean z9 = false;
                try {
                    g6.y yVar = gVar.a;
                    g6.j jVar2 = new g6.j(jVar);
                    Parcel P0 = yVar.P0();
                    t.d(P0, jVar2);
                    yVar.T0(P0, 4);
                } catch (RemoteException e10) {
                    g6.g.c.a(e10, "Unable to call %s on %s.", "addCastStateListener", g6.y.class.getSimpleName());
                }
                this.b = new hy0(23, z9);
                g6.g b10 = c10.b();
                this.c = b10;
                b10.a(this);
                j0(b10.c());
                break;
        }
    }

    public b(s sVar, SparseArray sparseArray) {
        this.a = 29;
        this.b = sVar;
        SparseBooleanArray sparseBooleanArray = sVar.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i7 = 0; i7 < sparseBooleanArray.size(); i7++) {
            int a10 = sVar.a(i7);
            m2.a aVar = (m2.a) sparseArray.get(a10);
            aVar.getClass();
            sparseArray2.append(a10, aVar);
        }
        this.c = sparseArray2;
    }

    public b(b0 b0Var, nb.a aVar, androidx.emoji2.text.d dVar) {
        this.a = 5;
        this.b = b0Var;
        this.c = dVar;
    }

    public b(Handler handler, d3.h0 h0Var) {
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
        this.a = 4;
        if (mediaSessionCompat$Token != null) {
            this.c = DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.b = new i(context, mediaSessionCompat$Token);
                return;
            } else {
                this.b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public b(a1 a1Var) {
        this.a = 16;
        this.b = a1Var;
        this.c = new AtomicBoolean(false);
    }
}
