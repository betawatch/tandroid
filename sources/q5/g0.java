package q5;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.t0;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import g5.o0;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.atomic.AtomicBoolean;
import k7.a8;
import m.s3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.al0;
import ph.j5;
import ph.m1;
import vh.c1;
import vh.d1;
import vh.d4;
import vh.f3;
import vh.h0;
import vh.o3;
import vh.p3;
import vh.q3;
import vh.r3;
import vh.v3;
import vh.v5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class g0 implements q9.a, oe.b, t5.a, u4.p, p3, c1, Continuation, xd.d, a3.b {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public /* synthetic */ g0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public static String L(g0 g0Var) {
        Collection<String> collection = (Collection) g0Var.c;
        StringBuilder sb = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) g0Var.b;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (!upperCase.matches("[A-F0-9]+")) {
                throw new IllegalArgumentException("Invalid application ID: ".concat(str));
            }
            sb.append("/");
            sb.append(upperCase);
        }
        if (collection != null) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
            if (str == null) {
                sb.append("/");
            }
            sb.append("/");
            boolean z4 = true;
            for (String str2 : collection) {
                u5.a.b(str2);
                if (!z4) {
                    sb.append(",");
                }
                if (!u5.a.a.matcher(str2).matches()) {
                    StringBuilder sb2 = new StringBuilder(str2.length());
                    for (int i10 = 0; i10 < str2.length(); i10++) {
                        char charAt = str2.charAt(i10);
                        if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && !((charAt >= '0' && charAt <= '9') || charAt == '_' || charAt == '-' || charAt == '.' || charAt == ':'))) {
                            sb2.append(String.format("%%%04x", Integer.valueOf(charAt)));
                        } else {
                            sb2.append(charAt);
                        }
                    }
                    str2 = sb2.toString();
                }
                sb.append(str2);
                z4 = false;
            }
        }
        if (str == null && collection == null) {
            sb.append("/");
        }
        if (collection == null) {
            sb.append("/");
        }
        sb.append("//ALLOW_IPV6");
        return sb.toString();
    }

    public static String t(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    @Override // vh.p3
    public void A(vh.a aVar) {
        vh.p pVar = (vh.p) this.c;
        li liVar = pVar.b;
        p2 p2Var = liVar.c0;
        if (p2Var != null && aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(p2Var)) {
            li liVar2 = new li(pVar.getContext(), liVar.c0, false, false, false, null);
            liVar2.W1 = new cb.b(24);
            liVar2.M = true;
            liVar2.u1.setVisibility(8);
            liVar2.q2 = new m1(pVar, aVar, liVar2, 5);
            liVar2.r1();
            liVar2.show();
        }
    }

    @Override // vh.p3
    public void B() {
        v3 v3Var = ((vh.p) this.c).s;
        if (v3Var != null) {
            v3Var.e(false, true);
            int i10 = v3Var.V;
            v3Var.f(i10 != 2 ? i10 : 0, true);
        }
    }

    @Override // vh.p3
    public o70 C(View view) {
        vh.p pVar = (vh.p) this.c;
        o70 o70Var = new o70(pVar, (f6) this.b, view, false, false, true);
        pVar.E = o70Var;
        return o70Var;
    }

    @Override // vh.c1
    public void D(CharSequence charSequence) {
        ((vh.g0) this.b).y(charSequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory E(String str) {
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
        } catch (IllegalAccessException e6) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e6);
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

    @Override // vh.c1
    public /* synthetic */ boolean F(d1 d1Var) {
        return false;
    }

    @Override // vh.c1
    public void G(d1 d1Var) {
        ((vh.g0) this.b).h();
    }

    @Override // vh.p3
    public void H() {
        vh.p pVar = (vh.p) this.c;
        pVar.X();
        pVar.Y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ra.m I(wa.a aVar) {
        String str;
        j5 j5Var;
        Type type = aVar.b;
        Class cls = aVar.a;
        HashMap hashMap = (HashMap) this.b;
        if (hashMap.get(type) != null) {
            throw new ClassCastException();
        }
        if (hashMap.get(cls) != null) {
            throw new ClassCastException();
        }
        ra.m mVar = null;
        ra.m oVar = EnumSet.class.isAssignableFrom(cls) ? new o2.o(type, 19) : cls == EnumMap.class ? new qk0(type, 10) : null;
        if (oVar != null) {
            return oVar;
        }
        ra.d.f((ArrayList) this.c);
        if (!Modifier.isAbstract(cls.getModifiers())) {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                a8 a8Var = ua.c.a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e) {
                    str = "Failed making constructor '" + ua.c.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage() + ua.c.e(e);
                }
                if (str != null) {
                    p2.i iVar = new p2.i();
                    iVar.a = str;
                    j5Var = iVar;
                } else {
                    j5Var = new j5(declaredConstructor, 5);
                }
            } catch (NoSuchMethodException unused) {
            }
            if (j5Var == null) {
                return j5Var;
            }
            int i10 = 22;
            if (Collection.class.isAssignableFrom(cls)) {
                mVar = SortedSet.class.isAssignableFrom(cls) ? new ab.a(i10) : Set.class.isAssignableFrom(cls) ? new cb.b(i10) : Queue.class.isAssignableFrom(cls) ? new db.a(i10) : new h7.u(i10);
            } else if (Map.class.isAssignableFrom(cls)) {
                if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                    mVar = new z9.d(i10);
                } else {
                    int i11 = 23;
                    mVar = ConcurrentMap.class.isAssignableFrom(cls) ? new ab.a(i11) : SortedMap.class.isAssignableFrom(cls) ? new cb.b(i11) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(new wa.a(((ParameterizedType) type).getActualTypeArguments()[0]).a)) ? new h7.u(i11) : new db.a(i11);
                }
            }
            if (mVar != null) {
                return mVar;
            }
            String t6 = t(cls);
            return t6 != null ? new com.google.android.gms.internal.clearcut.e(t6) : new f1(cls, 17);
        }
        j5Var = null;
        if (j5Var == null) {
        }
    }

    @Override // u4.p
    public o0 J() {
        return new f7.b(29, ((u4.p) this.b).J(), (List) this.c);
    }

    public r3.k K(Object... objArr) {
        Constructor a2;
        synchronized (((AtomicBoolean) this.c)) {
            if (!((AtomicBoolean) this.c).get()) {
                try {
                    a2 = ((al0) this.b).a();
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
            return (r3.k) a2.newInstance(objArr);
        } catch (Exception e6) {
            throw new IllegalStateException("Unexpected error creating extractor", e6);
        }
    }

    @Override // vh.c1
    public void N(Editable editable) {
        ((h0) this.c).i();
        ((vh.g0) this.b).P();
    }

    @Override // vh.c1
    public void O(d1 d1Var, int i10, int i11) {
        m9 u10;
        vh.g0 g0Var = (vh.g0) this.b;
        if (((h0) this.c).d || i10 == i11 || (u10 = g0Var.u()) == null) {
            return;
        }
        if (u10.y() && u10.W == g0Var.z()) {
            return;
        }
        d1Var.post(new lj(this, d1Var, i11, u10, g0Var, i10));
    }

    @Override // vh.c1
    public /* synthetic */ boolean R(boolean z4) {
        return false;
    }

    @Override // xd.d
    public void a() {
        ((xd.i) this.b).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023 A[RETURN] */
    @Override // vh.p3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b(float f10) {
        boolean z4;
        v3 v3Var = ((vh.p) this.c).s;
        if (v3Var != null) {
            FrameLayout frameLayout = v3Var.E;
            if (frameLayout != null) {
                frameLayout.getLocationOnScreen(new int[2]);
                if (f10 >= r4[1]) {
                    z4 = true;
                    v3Var.e(z4, true);
                    if (!z4) {
                        return true;
                    }
                }
            }
            z4 = false;
            v3Var.e(z4, true);
            if (!z4) {
            }
        }
        return false;
    }

    @Override // vh.c1
    public void c(d1 d1Var) {
        ((vh.g0) this.b).c(d1Var);
    }

    @Override // vh.c1
    public boolean d() {
        return ((vh.g0) this.b).L();
    }

    @Override // vh.p3
    public void e(d1 d1Var, boolean z4) {
        ((vh.p) this.c).b.t1(d1Var, z4);
    }

    @Override // u4.p
    public o0 f(u4.l lVar, u4.i iVar) {
        return new f7.b(29, ((u4.p) this.b).f(lVar, iVar), (List) this.c);
    }

    @Override // rc.a
    public Object get() {
        return new z2.d((Context) ((a3.c) this.b).b, (s5.m) ((qk0) this.c).get());
    }

    @Override // xd.d
    public boolean h() {
        return false;
    }

    @Override // vh.c1
    public void i(int i10, int i11) {
        ((vh.g0) this.b).M(i10, i11);
    }

    @Override // xd.d
    public boolean j(float f10) {
        return false;
    }

    @Override // vh.p3
    public void l(o3 o3Var, View view) {
        vh.p pVar = (vh.p) this.c;
        o70 o70Var = new o70(pVar, (f6) this.b, view, false, false, true);
        o70Var.Q = true;
        pVar.E = d4.c(o70Var, pVar.b.c0, pVar.getContext(), (f6) this.b, o3Var, true);
    }

    @Override // vh.p3
    public void m(int i10) {
        vh.p.O((vh.p) this.c, 74, i10);
    }

    @Override // vh.p3
    public void n() {
        vh.p pVar = (vh.p) this.c;
        r3 r3Var = pVar.r;
        v3 v3Var = pVar.s;
        if (v3Var != null) {
            f3 f3Var = r3Var.k3;
            int i10 = (f3Var != null && f3Var.y() && r3Var.C4()) ? 1 : 0;
            if (v3Var.U == 2) {
                v3Var.V = i10;
            } else {
                v3Var.f(i10, true);
            }
            if (i10 != 0) {
                pVar.W();
            }
        }
        pVar.Z();
    }

    @Override // vh.c1
    public /* synthetic */ boolean o(d1 d1Var) {
        return false;
    }

    @Override // vh.p3
    public void onContentChanged() {
        vh.p pVar = (vh.p) this.c;
        v3 v3Var = pVar.s;
        if (v3Var != null) {
            v3Var.setSendLoading(pVar.r.m3());
        }
        pVar.V(true);
        pVar.Y();
        vh.d dVar = pVar.M;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        AndroidUtilities.runOnUIThread(dVar, 1000L);
    }

    @Override // t5.a
    public void p(Bitmap bitmap) {
        g0 g0Var = (g0) this.b;
        g0Var.c = bitmap;
        t5.f fVar = (t5.f) this.c;
        fVar.l = g0Var;
        fVar.b();
    }

    @Override // vh.p3
    public void q() {
        v3 v3Var = ((vh.p) this.c).s;
        if (v3Var != null) {
            int i10 = v3Var.U;
            if (i10 == 2) {
                i10 = 0;
            }
            v3Var.V = i10;
            v3Var.e(false, false);
            v3Var.f(2, true);
        }
    }

    @Override // vh.p3
    public void s(v5 v5Var, String str) {
        vh.p pVar = (vh.p) this.c;
        if (pVar.v == null) {
            f6 f6Var = (f6) this.b;
            pVar.v = new s3(new org.telegram.ui.web.m(11, this, f6Var), f6Var);
        }
        pVar.v.f(v5Var, str);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        x5.a aVar = (x5.a) this.b;
        Bundle bundle = (Bundle) this.c;
        aVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        return (bundle2 == null || !bundle2.containsKey("google.messenger")) ? task : aVar.a(bundle).onSuccessTask(x5.l.a, x5.b.b);
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return "Bounds{lower=" + ((i0.b) this.b) + " upper=" + ((i0.b) this.c) + "}";
            case 6:
                return ((HashMap) this.b).toString();
            case 14:
                StringBuilder sb = new StringBuilder(128);
                sb.append("LoaderManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                Class<?> cls = ((androidx.lifecycle.t) this.b).getClass();
                sb.append(cls.getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(cls)));
                sb.append("}}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // xd.d
    public void u() {
        ((xd.i) this.b).e((xd.j) this.c);
    }

    @Override // vh.p3
    public void v() {
        vh.p pVar = (vh.p) this.c;
        if (pVar.getCurrentItemTop() != pVar.F) {
            pVar.b.X1(pVar, 0);
        }
        pVar.a0();
        vh.p.J(pVar);
    }

    @Override // q9.a
    public StackTraceElement[] v0(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        q9.a[] aVarArr = (q9.a[]) this.b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            q9.a aVar = aVarArr[i10];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.v0(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? ((h7.u) this.c).v0(stackTraceElementArr2) : stackTraceElementArr2;
    }

    @Override // vh.p3
    public void w(q3 q3Var, View view) {
        vh.p pVar = (vh.p) this.c;
        o70 o70Var = new o70(pVar, (f6) this.b, view, false, false, true);
        o70Var.Q = true;
        p2 p2Var = pVar.b.c0;
        pVar.getContext();
        pVar.E = d4.b(o70Var, p2Var, q3Var, true);
    }

    @Override // vh.p3
    public void x(int i10) {
        vh.p pVar = (vh.p) this.c;
        pVar.b.X1(pVar, i10);
        pVar.a0();
        vh.p.J(pVar);
    }

    public void y(String str, PrintWriter printWriter) {
        w1.b bVar = (w1.b) this.c;
        if (bVar.d.c <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String str2 = str + "    ";
        int i10 = 0;
        while (true) {
            a0.l lVar = bVar.d;
            if (i10 >= lVar.c) {
                return;
            }
            w1.a aVar = (w1.a) lVar.b[i10];
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(bVar.d.a[i10]);
            printWriter.print(": ");
            printWriter.println(aVar.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println(aVar.l);
            o5.d dVar = aVar.l;
            String str3 = str2 + "  ";
            dVar.getClass();
            printWriter.print(str3);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mListener=");
            printWriter.println(dVar.a);
            if (dVar.b || dVar.e) {
                printWriter.print(str3);
                printWriter.print("mStarted=");
                printWriter.print(dVar.b);
                printWriter.print(" mContentChanged=");
                printWriter.print(dVar.e);
                printWriter.print(" mProcessingChange=");
                printWriter.println(false);
            }
            if (dVar.c || dVar.d) {
                printWriter.print(str3);
                printWriter.print("mAbandoned=");
                printWriter.print(dVar.c);
                printWriter.print(" mReset=");
                printWriter.println(dVar.d);
            }
            if (dVar.g != null) {
                printWriter.print(str3);
                printWriter.print("mTask=");
                printWriter.print(dVar.g);
                printWriter.print(" waiting=");
                dVar.g.getClass();
                printWriter.println(false);
            }
            if (dVar.h != null) {
                printWriter.print(str3);
                printWriter.print("mCancellingTask=");
                printWriter.print(dVar.h);
                printWriter.print(" waiting=");
                dVar.h.getClass();
                printWriter.println(false);
            }
            if (aVar.n != null) {
                printWriter.print(str2);
                printWriter.print("mCallbacks=");
                printWriter.println(aVar.n);
                c2.u uVar = aVar.n;
                uVar.getClass();
                printWriter.print(str2 + "  ");
                printWriter.print("mDeliveredData=");
                printWriter.println(uVar.b);
            }
            printWriter.print(str2);
            printWriter.print("mData=");
            o5.d dVar2 = aVar.l;
            Object obj = aVar.e;
            Object obj2 = obj != androidx.lifecycle.z.k ? obj : null;
            dVar2.getClass();
            StringBuilder sb = new StringBuilder(64);
            if (obj2 == null) {
                sb.append(BuildConfig.BETA_URL);
            } else {
                Class<?> cls = obj2.getClass();
                sb.append(cls.getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(cls)));
                sb.append("}");
            }
            printWriter.println(sb.toString());
            printWriter.print(str2);
            printWriter.print("mStarted=");
            printWriter.println(aVar.c > 0);
            i10++;
        }
    }

    @Override // oe.b
    public oe.a z(f7.b bVar) {
        List list = (List) this.c;
        List list2 = (List) bVar.b;
        int size = list2 != null ? list2.size() : 0;
        if (size > 0) {
            ArrayList arrayList = new ArrayList(list.size() + size);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            list = arrayList;
        }
        return new qc.i(bVar, (List) this.b, list);
    }

    public /* synthetic */ g0(Object obj, int i10) {
        this.a = i10;
        this.c = null;
        this.b = obj;
    }

    public /* synthetic */ g0(Object obj, Object obj2, boolean z4, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public g0(a6.a aVar) {
        this.a = 8;
        this.b = aVar == null ? null : aVar.b;
    }

    public g0(IBinder iBinder) {
        this.a = 15;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.c = new x5.f(iBinder);
            this.b = null;
            return;
        }
        this.b = new Messenger(iBinder);
        this.c = null;
    }

    public g0(q9.a[] aVarArr) {
        this.a = 1;
        this.b = aVarArr;
        this.c = new h7.u(20);
    }

    public g0(androidx.lifecycle.t tVar, t0 t0Var) {
        this.a = 14;
        this.b = tVar;
        this.c = (w1.b) new androidx.biometric.e(t0Var, w1.b.f).n(w1.b.class);
    }

    public g0(String str, String str2) {
        this.a = 11;
        this.b = str;
        this.c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    @Override // xd.d
    public void k() {
    }

    @Override // vh.c1
    public /* synthetic */ void r() {
    }

    public g0(al0 al0Var) {
        this.a = 4;
        this.b = al0Var;
        this.c = new AtomicBoolean(false);
    }

    @Override // xd.d
    public void g(boolean z4) {
    }
}
