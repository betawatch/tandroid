package qf;

import a4.l;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.PowerManager;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.m;
import android.support.v4.media.session.o;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import androidx.emoji2.text.v;
import androidx.fragment.app.j0;
import b2.r0;
import b2.u;
import c3.q;
import c5.j;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.internal.cast.d1;
import com.google.android.gms.internal.cast.d2;
import com.google.android.gms.internal.cast.r;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.h;
import e0.f0;
import e2.x;
import e9.n0;
import e9.x1;
import g6.n;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j4.a0;
import j4.b0;
import j4.d0;
import j9.y;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import k2.s;
import ki.g1;
import ki.h0;
import ki.h1;
import ki.k0;
import kotlin.jvm.internal.i;
import m.g3;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.xc;
import org.telegram.ui.PhotoViewer;
import p4.z;
import v7.i8;
import v7.r8;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public class b implements h, OnCompleteListener, com.google.android.gms.internal.clearcut.h, ee.b, f6.a, fa.a, g2.g, n, a0, Continuation, g1, e2.d {
    public static volatile b d;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    public static boolean C(Editable editable, KeyEvent keyEvent, boolean z10) {
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

    public static b Y() {
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

    public static String g0(b bVar) {
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
            boolean z10 = true;
            for (String str2 : collection) {
                g6.a.b(str2);
                if (!z10) {
                    sb2.append(",");
                }
                if (!g6.a.a.matcher(str2).matches()) {
                    StringBuilder sb3 = new StringBuilder(str2.length());
                    for (int i10 = 0; i10 < str2.length(); i10++) {
                        char charAt = str2.charAt(i10);
                        if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && !((charAt >= '0' && charAt <= '9') || charAt == '_' || charAt == '-' || charAt == '.' || charAt == ':'))) {
                            sb3.append(String.format("%%%04x", Integer.valueOf(charAt)));
                        } else {
                            sb3.append(charAt);
                        }
                    }
                    str2 = sb3.toString();
                }
                sb2.append(str2);
                z10 = false;
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

    public static void o(b bVar, boolean z10, boolean z11) {
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

    public static String y(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    public void A() {
        this.b = null;
        this.c = null;
    }

    public boolean B(int i10) {
        return ((u) this.b).a.get(i10);
    }

    public void D(i2.e eVar) {
        synchronized (eVar) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new s(this, eVar, 0));
        }
    }

    public void E(androidx.fragment.app.s f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.E(f7, true);
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

    public void F(androidx.fragment.app.s f7, boolean z10) {
        i.e(f7, "f");
        j0 j0Var = (j0) this.b;
        androidx.fragment.app.v vVar = j0Var.w.b;
        androidx.fragment.app.s sVar = j0Var.y;
        if (sVar != null) {
            sVar.p().o.F(f7, true);
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

    @Override // ki.g1
    public void G(Editable editable) {
        ((k0) this.c).i();
        ((ki.j0) this.b).N();
    }

    public void H(androidx.fragment.app.s f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.H(f7, true);
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

    public void I(androidx.fragment.app.s f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.I(f7, true);
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

    public void J(androidx.fragment.app.s f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.J(f7, true);
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

    public void K(androidx.fragment.app.s f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.K(f7, true);
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

    public void L(androidx.fragment.app.s f7, boolean z10) {
        i.e(f7, "f");
        j0 j0Var = (j0) this.b;
        androidx.fragment.app.v vVar = j0Var.w.b;
        androidx.fragment.app.s sVar = j0Var.y;
        if (sVar != null) {
            sVar.p().o.L(f7, true);
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

    @Override // ki.g1
    public /* synthetic */ boolean M(boolean z10) {
        return false;
    }

    public void N(androidx.fragment.app.s f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.N(f7, true);
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

    public void O(androidx.fragment.app.s f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.O(f7, true);
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

    @Override // ki.g1
    public /* synthetic */ boolean P(h1 h1Var) {
        return false;
    }

    public void Q(androidx.fragment.app.s f7, Bundle bundle, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.Q(f7, bundle, true);
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

    @Override // ki.g1
    public void R(h1 h1Var, int i10, int i11) {
        o9 w9;
        ki.j0 j0Var = (ki.j0) this.b;
        if (((k0) this.c).d || i10 == i11 || (w9 = j0Var.w()) == null) {
            return;
        }
        if (w9.x() && w9.W == j0Var.D()) {
            return;
        }
        h1Var.post(new h0(this, h1Var, i11, w9, j0Var, i10));
    }

    public void S(androidx.fragment.app.s f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.S(f7, true);
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

    public void T(androidx.fragment.app.s f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.T(f7, true);
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

    public void U(androidx.fragment.app.s f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.U(f7, true);
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory V(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.c) == null) {
            Context context = (Context) this.b;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            if (packageManager == null) {
                Log.w("BackendRegistry", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                    if (bundle != null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap hashMap = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            Object obj = bundle.get(str2);
                            if ((obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String trim = str3.trim();
                                    if (!trim.isEmpty()) {
                                        hashMap.put(trim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = hashMap;
                    }
                    this.c = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.c = map;
        }
        String str4 = (String) ((Map) this.c).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e7) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e7);
            return null;
        } catch (InstantiationException e10) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e12);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gb.n W(lb.a aVar) {
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
        int i10 = 20;
        gb.n nVar = null;
        gb.n cVar2 = EnumSet.class.isAssignableFrom(cls) ? new ya.c(type, i10) : cls == EnumMap.class ? new a6.i(type, 22) : null;
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
                    j jVar = new j();
                    jVar.a = str;
                    cVar = jVar;
                } else {
                    cVar = new qb.c(declaredConstructor, 24);
                }
            } catch (NoSuchMethodException unused) {
            }
            if (cVar == null) {
                return cVar;
            }
            int i11 = 9;
            if (Collection.class.isAssignableFrom(cls)) {
                nVar = SortedSet.class.isAssignableFrom(cls) ? new oa.d(i11) : Set.class.isAssignableFrom(cls) ? new pb.a(i11) : Queue.class.isAssignableFrom(cls) ? new rb.b(i11) : new sb.a(i11);
            } else if (Map.class.isAssignableFrom(cls)) {
                if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                    nVar = new t7.u(i11);
                } else {
                    int i12 = 10;
                    nVar = ConcurrentMap.class.isAssignableFrom(cls) ? new oa.d(i12) : SortedMap.class.isAssignableFrom(cls) ? new pb.a(i12) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(new lb.a(((ParameterizedType) type).getActualTypeArguments()[0]).a)) ? new sb.a(i12) : new rb.b(i12);
                }
            }
            if (nVar != null) {
                return nVar;
            }
            String y3 = y(cls);
            return y3 != null ? new f2.a(y3) : new l(cls, i10);
        }
        cVar = null;
        if (cVar == null) {
        }
    }

    public q X(Object... objArr) {
        Constructor a2;
        synchronized (((AtomicBoolean) this.c)) {
            if (!((AtomicBoolean) this.c).get()) {
                try {
                    a2 = ((c3.n) this.b).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.c).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            a2 = null;
        }
        if (a2 == null) {
            return null;
        }
        try {
            return (q) a2.newInstance(objArr);
        } catch (Exception e7) {
            throw new IllegalStateException("Unexpected error creating extractor", e7);
        }
    }

    public m Z() {
        MediaController.TransportControls transportControls = ((android.support.v4.media.session.h) this.b).a.getTransportControls();
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 29 ? new o(transportControls) : i10 >= 24 ? new android.support.v4.media.session.n(transportControls) : new m(transportControls);
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
                        sparseArray.put(g11, new b0(new f0(d0Var, g11)));
                        d0Var.n++;
                    }
                }
            }
            if (d0Var.a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    public boolean a0(CharSequence charSequence, int i10, int i11, androidx.emoji2.text.o oVar) {
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

    public boolean b0() {
        return ((a) ((g3) this.b).d) != null;
    }

    @Override // ki.g1
    public void c(h1 h1Var) {
        ((ki.j0) this.b).c(h1Var);
    }

    public void c0(androidx.mediarouter.app.q qVar) {
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
        g3 g3Var = (g3) this.b;
        g gVar3 = (g) g3Var.c;
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
        if (((a) g3Var.d) != null && gVar != null) {
            g3Var.n(gVar);
        }
        if (((a) g3Var.d) != null && (gVar2 = (g) g3Var.c) != null) {
            g3Var.S(gVar2);
        }
        if (gVar != null && gVar.a.size() > 0 && !gVar.a(0).a.startsWith("audio/") && (dVar = (d) g3Var.b) != null) {
            dVar.l(null, null);
        }
        a aVar = (a) g3Var.d;
        if (aVar != null && gVar != null) {
            aVar.d = gVar;
            aVar.g = 0;
            aVar.h = 0;
            aVar.p();
        }
        g3Var.c = gVar;
    }

    @Override // ki.g1
    public boolean e() {
        return ((ki.j0) this.b).H();
    }

    public void e0(d6.c cVar) {
        g3 g3Var = (g3) this.b;
        if (cVar == null) {
            return;
        }
        n6.l.e("Must be called from the main thread.");
        e6.h hVar = cVar.j;
        String a2 = cVar.a();
        if (TextUtils.isEmpty(a2) || hVar == null) {
            return;
        }
        a aVar = (a) g3Var.d;
        if (aVar == null || !TextUtils.equals(aVar.c.a(), a2)) {
            g3Var.V(new a(cVar, (d6.g) this.c, hVar));
            n6.l.e("Must be called from the main thread.");
            CastDevice castDevice = cVar.k;
            String str = castDevice != null ? castDevice.d : null;
            PhotoViewer u12 = PhotoViewer.u1();
            d.i();
            if (u12.E == null || u12.e0 == null || !u12.T1()) {
                return;
            }
            new xc(u12.e0, new ci.b()).Q(R.raw.forward, 36, !TextUtils.isEmpty(str) ? LocaleController.formatString(R.string.ChromecastStartedTo, str) : LocaleController.getString(R.string.ChromecastStarted)).j();
        }
    }

    @Override // ki.g1
    public void f(int i10, int i11) {
        ((ki.j0) this.b).K(i10, i11);
    }

    public void f0(androidx.mediarouter.app.q qVar) {
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

    @Override // e2.d
    public y g(r0 r0Var) {
        Uri uri;
        byte[] bArr;
        g3 g3Var = (g3) this.c;
        if (g3Var != null && (((uri = (Uri) g3Var.c) != null && uri.equals(r0Var.n)) || ((bArr = (byte[]) g3Var.b) != null && Arrays.equals(bArr, r0Var.k)))) {
            y yVar = (y) ((g3) this.c).d;
            yVar.getClass();
            return yVar;
        }
        y g10 = ((e2.d) this.b).g(r0Var);
        if (g10 == null) {
            return null;
        }
        this.c = new g3(r0Var, g10);
        return g10;
    }

    @Override // d6.h
    public void h(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((d6.c) fVar).a() + " " + i10);
    }

    @Override // d6.h
    public void i(d6.f fVar, boolean z10) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((d6.c) fVar).a() + " " + z10);
    }

    @Override // g6.n
    public void j(String str, long j10, long j11, long j12) {
        n nVar = (n) this.b;
        if (nVar != null) {
            nVar.j(str, j10, j11, j12);
        }
    }

    @Override // ki.g1
    public void k(h1 h1Var) {
        ((ki.j0) this.b).g();
    }

    @Override // f6.a
    public void l(Bitmap bitmap) {
        n4.s sVar = (n4.s) this.b;
        sVar.c = bitmap;
        f6.f fVar = (f6.f) this.c;
        fVar.l = sVar;
        fVar.b();
    }

    @Override // d6.h
    public void n(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((d6.c) fVar).a() + " " + i10);
        ((g3) this.b).V(null);
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
                r rVar = (r) this.b;
                d6.b bVar2 = (d6.b) this.c;
                p4.x xVar = rVar.c;
                g6.b bVar3 = r.j;
                if (task.isSuccessful()) {
                    Bundle bundle = (Bundle) task.getResult();
                    boolean z11 = bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                    bVar3.b("The module-to-client output switcher flag %s", true != z11 ? "not existed" : "existed");
                    if (z11) {
                        z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                        Log.i(bVar3.a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.x)));
                        boolean z12 = !z10 && bVar2.x;
                        if (xVar != null || (bVar = rVar.d) == null) {
                            return;
                        }
                        boolean z13 = bVar.v;
                        boolean z14 = bVar.s;
                        p4.y yVar = new p4.y();
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 30) {
                            yVar.b = z12;
                        }
                        if (i10 >= 30) {
                            yVar.d = z13;
                        }
                        if (i10 >= 30) {
                            yVar.c = z14;
                        }
                        p4.x.i(new z(yVar));
                        Log.i(bVar3.a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(rVar.i), Boolean.valueOf(z12), Boolean.valueOf(z13), Boolean.valueOf(z14)));
                        if (z13) {
                            com.google.android.gms.internal.cast.u uVar = rVar.f;
                            n6.l.h(uVar);
                            com.google.android.gms.internal.cast.q qVar = new com.google.android.gms.internal.cast.q(uVar);
                            p4.x.b();
                            p4.x.c().f = qVar;
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
                if (xVar != null) {
                    return;
                } else {
                    return;
                }
        }
    }

    @Override // d6.h
    public void p(d6.f fVar) {
        d6.c cVar = (d6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarting " + cVar.a());
        e0(cVar);
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
    public Object q(ee.c cVar, md.c cVar2) {
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
                    obj = ee.n.a(bVar2, cVar, dVar);
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
                    ab.y yVar = (ab.y) bVar.c;
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

    @Override // d6.h
    public void r(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((d6.c) fVar).a() + " " + i10);
    }

    @Override // ki.g1
    public /* synthetic */ boolean s(h1 h1Var) {
        return false;
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

    @Override // g6.n
    public void t(String str, long j10, int i10, Object obj, long j11, long j12) {
        ((g6.m) this.c).g = null;
        n nVar = (n) this.b;
        if (nVar != null) {
            nVar.t(str, j10, i10, obj, j11, j12);
        }
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
            case 20:
                return ((HashMap) this.b).toString();
            default:
                return super.toString();
        }
    }

    @Override // d6.h
    public void u(d6.f fVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((d6.c) fVar).a());
    }

    @Override // e2.d
    public y v(byte[] bArr) {
        byte[] bArr2;
        g3 g3Var = (g3) this.c;
        if (g3Var == null || (bArr2 = (byte[]) g3Var.b) == null || !Arrays.equals(bArr2, bArr)) {
            y v = ((e2.d) this.b).v(bArr);
            this.c = new g3(bArr, v);
            return v;
        }
        y yVar = (y) ((g3) this.c).d;
        yVar.getClass();
        return yVar;
    }

    @Override // d6.h
    public void w(d6.f fVar, String str) {
        d6.c cVar = (d6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarted " + cVar.a() + " " + str);
        e0(cVar);
    }

    @Override // ki.g1
    public void x(CharSequence charSequence) {
        ((ki.j0) this.b).A(charSequence);
    }

    @Override // d6.h
    public void z(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((d6.c) fVar).a() + " " + i10);
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

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public /* synthetic */ b(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.b = obj2;
        this.c = obj;
    }

    public b(j0 j0Var) {
        this.a = 6;
        this.b = j0Var;
        this.c = new CopyOnWriteArrayList();
    }

    public b(fa.a[] aVarArr) {
        this.a = 17;
        this.b = aVarArr;
        this.c = new rb.b(8);
    }

    public b() {
        boolean z10 = false;
        this.a = 0;
        d6.a c10 = d6.a.c(ApplicationLoader.applicationContext);
        org.telegram.ui.web.d0 d0Var = new org.telegram.ui.web.d0(5);
        c10.getClass();
        n6.l.e("Must be called from the main thread.");
        d6.g gVar = c10.c;
        gVar.getClass();
        try {
            d6.y yVar = gVar.a;
            d6.j jVar = new d6.j(d0Var);
            Parcel N0 = yVar.N0();
            com.google.android.gms.internal.cast.v.d(N0, jVar);
            yVar.R0(N0, 4);
        } catch (RemoteException e) {
            d6.g.c.a(e, "Unable to call %s on %s.", "addCastStateListener", d6.y.class.getSimpleName());
        }
        this.b = new g3(23, z10);
        d6.g b10 = c10.b();
        this.c = b10;
        b10.a(this);
        e0(b10.c());
    }

    @Override // ki.g1
    public /* synthetic */ void m() {
    }

    public b(Context context, int i10) {
        this.a = i10;
        switch (i10) {
            case 29:
                this.c = null;
                this.b = context;
                break;
            default:
                g2.o oVar = new g2.o();
                this.b = context.getApplicationContext();
                this.c = oVar;
                break;
        }
    }

    public b(u uVar, SparseArray sparseArray) {
        this.a = 23;
        this.b = uVar;
        SparseBooleanArray sparseBooleanArray = uVar.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            int a2 = uVar.a(i10);
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

    public b(Handler handler, k2.v vVar) {
        this.a = 26;
        if (vVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = vVar;
    }

    public b(ArrayList arrayList, ArrayList arrayList2) {
        this.a = 21;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.b)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.c)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    public b(int i10, int i11) {
        this.a = 21;
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

    public b(int i10, int i11, int i12) {
        this.a = 21;
        this.b = new int[]{i10, i11, i12};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public b(a3.f fVar) {
        this.a = 1;
        this.c = fVar;
    }

    @Override // j4.a0
    public void b(e2.k0 k0Var, c3.s sVar, j4.f0 f0Var) {
    }

    public b(x1 x1Var, int[] iArr) {
        this.a = 15;
        this.b = n0.u(x1Var);
        this.c = iArr;
    }

    public b(d0 d0Var) {
        this.a = 24;
        this.c = d0Var;
        this.b = new a4.g(new byte[4], 4);
    }

    public b(c3.n nVar) {
        this.a = 7;
        this.b = nVar;
        this.c = new AtomicBoolean(false);
    }
}
