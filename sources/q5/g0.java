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
import m.r3;
import oh.h4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.nj;
import org.telegram.ui.Components.q70;
import org.telegram.ui.cl0;
import qh.m1;
import wh.d1;
import wh.d4;
import wh.e1;
import wh.f3;
import wh.h0;
import wh.i0;
import wh.o3;
import wh.p3;
import wh.q3;
import wh.v3;
import wh.v5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class g0 implements q9.a, oe.b, t5.a, u4.p, p3, d1, Continuation, xd.d, a3.b {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public /* synthetic */ g0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public static String K(g0 g0Var) {
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

    public static String f(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    @Override // wh.p3
    public void A() {
        wh.q qVar = (wh.q) this.c;
        if (qVar.getCurrentItemTop() != qVar.F) {
            qVar.b.X1(qVar, 0);
        }
        qVar.a0();
        wh.q.J(qVar);
    }

    @Override // u4.p
    public o0 B(u4.l lVar, u4.i iVar) {
        return new f7.b(29, ((u4.p) this.b).B(lVar, iVar), (List) this.c);
    }

    @Override // wh.p3
    public void C(int i10) {
        wh.q qVar = (wh.q) this.c;
        qVar.b.X1(qVar, i10);
        qVar.a0();
        wh.q.J(qVar);
    }

    @Override // wh.d1
    public /* synthetic */ boolean D(e1 e1Var) {
        return false;
    }

    @Override // xd.d
    public void E() {
        ((xd.i) this.b).e((xd.j) this.c);
    }

    @Override // wh.p3
    public void F(v5 v5Var, String str) {
        wh.q qVar = (wh.q) this.c;
        if (qVar.v == null) {
            g6 g6Var = (g6) this.b;
            qVar.v = new r3(new org.telegram.ui.web.m(11, this, g6Var), g6Var);
        }
        qVar.v.f(v5Var, str);
    }

    @Override // u4.p
    public o0 G() {
        return new f7.b(29, ((u4.p) this.b).G(), (List) this.c);
    }

    @Override // wh.d1
    public void H(CharSequence charSequence) {
        ((h0) this.b).B(charSequence);
    }

    public r3.k I(Object... objArr) {
        Constructor a2;
        synchronized (((AtomicBoolean) this.c)) {
            if (!((AtomicBoolean) this.c).get()) {
                try {
                    a2 = ((cl0) this.b).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.c).set(true);
                } catch (Exception e6) {
                    throw new RuntimeException("Error instantiating extension", e6);
                }
            }
            a2 = null;
        }
        if (a2 == null) {
            return null;
        }
        try {
            return (r3.k) a2.newInstance(objArr);
        } catch (Exception e10) {
            throw new IllegalStateException("Unexpected error creating extractor", e10);
        }
    }

    @Override // wh.p3
    public void J() {
        v3 v3Var = ((wh.q) this.c).s;
        if (v3Var != null) {
            v3Var.e(false, true);
            int i10 = v3Var.V;
            v3Var.f(i10 != 2 ? i10 : 0, true);
        }
    }

    @Override // wh.d1
    public void O(Editable editable) {
        ((i0) this.c).i();
        ((h0) this.b).Q();
    }

    @Override // wh.p3
    public q70 P(View view) {
        wh.q qVar = (wh.q) this.c;
        q70 q70Var = new q70(qVar, (g6) this.b, view, false, false, true);
        qVar.E = q70Var;
        return q70Var;
    }

    @Override // wh.p3
    public void S() {
        wh.q qVar = (wh.q) this.c;
        qVar.X();
        qVar.Y();
    }

    @Override // wh.d1
    public /* synthetic */ boolean T(boolean z4) {
        return false;
    }

    @Override // xd.d
    public void a() {
        ((xd.i) this.b).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023 A[RETURN] */
    @Override // wh.p3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b(float f10) {
        boolean z4;
        v3 v3Var = ((wh.q) this.c).s;
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

    @Override // wh.d1
    public void c(e1 e1Var) {
        ((h0) this.b).c(e1Var);
    }

    @Override // wh.p3
    public void d(o3 o3Var, View view) {
        wh.q qVar = (wh.q) this.c;
        q70 q70Var = new q70(qVar, (g6) this.b, view, false, false, true);
        q70Var.Q = true;
        qVar.E = d4.c(q70Var, qVar.b.c0, qVar.getContext(), (g6) this.b, o3Var, true);
    }

    @Override // wh.d1
    public boolean e() {
        return ((h0) this.b).L();
    }

    public void g(String str, PrintWriter printWriter) {
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

    @Override // rc.a
    public Object get() {
        return new z2.e((Context) ((a3.c) this.b).a, (s5.m) ((z2.d) this.c).get());
    }

    @Override // wh.p3
    public void h(e1 e1Var, boolean z4) {
        ((wh.q) this.c).b.t1(e1Var, z4);
    }

    @Override // wh.d1
    public void j(int i10, int i11) {
        ((h0) this.b).M(i10, i11);
    }

    @Override // xd.d
    public boolean k() {
        return false;
    }

    @Override // xd.d
    public boolean l(float f10) {
        return false;
    }

    @Override // wh.p3
    public void n(wh.a aVar) {
        wh.q qVar = (wh.q) this.c;
        mi miVar = qVar.b;
        p2 p2Var = miVar.c0;
        if (p2Var != null && aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(p2Var)) {
            mi miVar2 = new mi(qVar.getContext(), miVar.c0, false, false, false, null);
            miVar2.W1 = new db.a(24);
            miVar2.M = true;
            miVar2.u1.setVisibility(8);
            miVar2.q2 = new m1(qVar, aVar, miVar2, 5);
            miVar2.r1();
            miVar2.show();
        }
    }

    @Override // wh.d1
    public void o(e1 e1Var) {
        ((h0) this.b).f();
    }

    @Override // wh.p3
    public void onContentChanged() {
        wh.q qVar = (wh.q) this.c;
        v3 v3Var = qVar.s;
        if (v3Var != null) {
            v3Var.setSendLoading(qVar.r.m3());
        }
        qVar.V(true);
        qVar.Y();
        wh.e eVar = qVar.M;
        AndroidUtilities.cancelRunOnUIThread(eVar);
        AndroidUtilities.runOnUIThread(eVar, 1000L);
    }

    @Override // wh.p3
    public void p(int i10) {
        wh.q.O((wh.q) this.c, 74, i10);
    }

    @Override // wh.p3
    public void q() {
        wh.q qVar = (wh.q) this.c;
        wh.r3 r3Var = qVar.r;
        v3 v3Var = qVar.s;
        if (v3Var != null) {
            f3 f3Var = r3Var.k3;
            int i10 = (f3Var != null && f3Var.y() && r3Var.C4()) ? 1 : 0;
            if (v3Var.U == 2) {
                v3Var.V = i10;
            } else {
                v3Var.f(i10, true);
            }
            if (i10 != 0) {
                qVar.W();
            }
        }
        qVar.Z();
    }

    @Override // wh.d1
    public /* synthetic */ boolean r(e1 e1Var) {
        return false;
    }

    @Override // wh.d1
    public void s(e1 e1Var, int i10, int i11) {
        m9 z4;
        h0 h0Var = (h0) this.b;
        if (((i0) this.c).d || i10 == i11 || (z4 = h0Var.z()) == null) {
            return;
        }
        if (z4.y() && z4.W == h0Var.E()) {
            return;
        }
        e1Var.post(new nj(this, e1Var, i11, z4, h0Var, i10));
    }

    @Override // t5.a
    public void t(Bitmap bitmap) {
        g0 g0Var = (g0) this.b;
        g0Var.c = bitmap;
        t5.f fVar = (t5.f) this.c;
        fVar.l = g0Var;
        fVar.b();
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
            case 12:
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

    @Override // wh.p3
    public void u() {
        v3 v3Var = ((wh.q) this.c).s;
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

    @Override // oe.b
    public oe.a w(f7.b bVar) {
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

    @Override // wh.p3
    public void x(q3 q3Var, View view) {
        wh.q qVar = (wh.q) this.c;
        q70 q70Var = new q70(qVar, (g6) this.b, view, false, false, true);
        q70Var.Q = true;
        p2 p2Var = qVar.b.c0;
        qVar.getContext();
        qVar.E = d4.b(q70Var, p2Var, q3Var, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory y(String str) {
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
        } catch (ClassNotFoundException e6) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e6);
            return null;
        } catch (IllegalAccessException e10) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e10);
            return null;
        } catch (InstantiationException e11) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e11);
            return null;
        } catch (NoSuchMethodException e12) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e12);
            return null;
        } catch (InvocationTargetException e13) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e13);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ra.m z(wa.a aVar) {
        String str;
        ra.m eVar;
        Type type = aVar.b;
        Class cls = aVar.a;
        HashMap hashMap = (HashMap) this.b;
        if (hashMap.get(type) != null) {
            throw new ClassCastException();
        }
        if (hashMap.get(cls) != null) {
            throw new ClassCastException();
        }
        int i10 = 16;
        ra.m mVar = null;
        ra.m h4Var = EnumSet.class.isAssignableFrom(cls) ? new h4(type, i10) : cls == EnumMap.class ? new org.telegram.ui.web.e0(type, 9) : null;
        if (h4Var != null) {
            return h4Var;
        }
        ra.d.f((ArrayList) this.c);
        if (!Modifier.isAbstract(cls.getModifiers())) {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                a8 a8Var = ua.c.a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e6) {
                    str = "Failed making constructor '" + ua.c.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e6.getMessage() + ua.c.e(e6);
                }
                eVar = str != null ? new com.google.android.gms.internal.clearcut.e(str, 3) : new ai(declaredConstructor, 12);
            } catch (NoSuchMethodException unused) {
            }
            if (eVar == null) {
                return eVar;
            }
            int i11 = 22;
            if (Collection.class.isAssignableFrom(cls)) {
                mVar = SortedSet.class.isAssignableFrom(cls) ? new ab.a(i11) : Set.class.isAssignableFrom(cls) ? new cb.b(i11) : Queue.class.isAssignableFrom(cls) ? new db.a(i11) : new h7.u(i11);
            } else if (Map.class.isAssignableFrom(cls)) {
                if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                    mVar = new z9.d(i11);
                } else {
                    int i12 = 23;
                    mVar = ConcurrentMap.class.isAssignableFrom(cls) ? new ab.a(i12) : SortedMap.class.isAssignableFrom(cls) ? new cb.b(i12) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(new wa.a(((ParameterizedType) type).getActualTypeArguments()[0]).a)) ? new h7.u(i12) : new db.a(i12);
                }
            }
            if (mVar != null) {
                return mVar;
            }
            String f10 = f(cls);
            return f10 != null ? new hc.a(f10) : new f1(cls, i10);
        }
        eVar = null;
        if (eVar == null) {
        }
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
        this.a = 12;
        this.b = tVar;
        this.c = (w1.b) new androidx.biometric.e(t0Var, w1.b.f).m(w1.b.class);
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
    public void m() {
    }

    @Override // wh.d1
    public /* synthetic */ void v() {
    }

    public g0(cl0 cl0Var) {
        this.a = 4;
        this.b = cl0Var;
        this.c = new AtomicBoolean(false);
    }

    @Override // xd.d
    public void i(boolean z4) {
    }
}
