package q5;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.t0;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.cl0;
import ph.l1;
import vh.d1;
import vh.e1;
import vh.e4;
import vh.g3;
import vh.h0;
import vh.i0;
import vh.p3;
import vh.q3;
import vh.r3;
import vh.s3;
import vh.w3;
import vh.w5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements com.google.android.gms.common.api.internal.s, q9.a, oe.b, t5.a, u4.p, q3, d1, Continuation, xd.d, a3.b {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ c0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public static String G(c0 c0Var) {
        Collection<String> collection = (Collection) c0Var.c;
        StringBuilder sb = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) c0Var.b;
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

    public static String e(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    @Override // vh.q3
    public void A() {
        w3 w3Var = ((vh.q) this.b).s;
        if (w3Var != null) {
            w3Var.e(false, true);
            int i10 = w3Var.V;
            w3Var.f(i10 != 2 ? i10 : 0, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory B(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.b) == null) {
            Context context = (Context) this.c;
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
                    this.b = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.b = map;
        }
        String str4 = (String) ((Map) this.b).get(str);
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

    @Override // vh.q3
    public p70 C(View view) {
        vh.q qVar = (vh.q) this.b;
        p70 p70Var = new p70(qVar, (f6) this.c, view, false, false, true);
        qVar.E = p70Var;
        return p70Var;
    }

    @Override // vh.q3
    public void D() {
        vh.q qVar = (vh.q) this.b;
        qVar.X();
        qVar.Y();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ra.m E(wa.a aVar) {
        String str;
        ra.m eVar;
        Type type = aVar.b;
        Class cls = aVar.a;
        HashMap hashMap = (HashMap) this.c;
        if (hashMap.get(type) != null) {
            throw new ClassCastException();
        }
        if (hashMap.get(cls) != null) {
            throw new ClassCastException();
        }
        ra.m mVar = null;
        ra.m tp0Var = EnumSet.class.isAssignableFrom(cls) ? new tp0(type, 11) : cls == EnumMap.class ? new o3.c(type, 17) : null;
        if (tp0Var != null) {
            return tp0Var;
        }
        ra.d.f((ArrayList) this.b);
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
                eVar = str != null ? new com.google.android.gms.internal.clearcut.e(str) : new o2.i(declaredConstructor, 16);
            } catch (NoSuchMethodException unused) {
            }
            if (eVar == null) {
                return eVar;
            }
            int i10 = 22;
            if (Collection.class.isAssignableFrom(cls)) {
                mVar = SortedSet.class.isAssignableFrom(cls) ? new z9.d(21) : Set.class.isAssignableFrom(cls) ? new ab.a(i10) : Queue.class.isAssignableFrom(cls) ? new cb.b(i10) : new db.a(i10);
            } else if (Map.class.isAssignableFrom(cls)) {
                if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                    mVar = new h7.u(i10);
                } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
                    mVar = new z9.d(i10);
                } else {
                    int i11 = 23;
                    mVar = SortedMap.class.isAssignableFrom(cls) ? new ab.a(i11) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(new wa.a(((ParameterizedType) type).getActualTypeArguments()[0]).a)) ? new db.a(i11) : new cb.b(i11);
                }
            }
            if (mVar != null) {
                return mVar;
            }
            String e6 = e(cls);
            return e6 != null ? new p9.a(e6) : new c9.e(cls);
        }
        eVar = null;
        if (eVar == null) {
        }
    }

    public r3.k F(Object... objArr) {
        Constructor a2;
        synchronized (((AtomicBoolean) this.b)) {
            if (!((AtomicBoolean) this.b).get()) {
                try {
                    a2 = ((cl0) this.c).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.b).set(true);
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

    @Override // oe.b
    public oe.a P0(f7.b bVar) {
        List list = (List) this.b;
        List list2 = (List) bVar.b;
        int size = list2 != null ? list2.size() : 0;
        if (size > 0) {
            ArrayList arrayList = new ArrayList(list.size() + size);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            list = arrayList;
        }
        return new qc.i(bVar, (List) this.c, list);
    }

    @Override // vh.d1
    public void Q0(CharSequence charSequence) {
        ((h0) this.c).L0(charSequence);
    }

    @Override // vh.d1
    public /* synthetic */ boolean V0(e1 e1Var) {
        return false;
    }

    @Override // xd.d
    public void a() {
        ((xd.i) this.c).a();
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        f0 f0Var = (f0) this.c;
        String str = (String) this.b;
        u5.x xVar = (u5.x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        b6.m.j("Not connected to device", f0Var.F == 2);
        u5.f fVar = (u5.f) xVar.u();
        Parcel M0 = fVar.M0();
        M0.writeString(str);
        fVar.R0(M0, 5);
        synchronized (f0Var.s) {
            try {
                if (f0Var.p != null) {
                    taskCompletionSource.setException(b6.m.m(new Status(2001, null, null, null)));
                } else {
                    f0Var.p = taskCompletionSource;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023 A[RETURN] */
    @Override // vh.q3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b(float f10) {
        boolean z4;
        w3 w3Var = ((vh.q) this.b).s;
        if (w3Var != null) {
            FrameLayout frameLayout = w3Var.E;
            if (frameLayout != null) {
                frameLayout.getLocationOnScreen(new int[2]);
                if (f10 >= r4[1]) {
                    z4 = true;
                    w3Var.e(z4, true);
                    if (!z4) {
                        return true;
                    }
                }
            }
            z4 = false;
            w3Var.e(z4, true);
            if (!z4) {
            }
        }
        return false;
    }

    @Override // vh.d1
    public void c(e1 e1Var) {
        ((h0) this.c).c(e1Var);
    }

    @Override // vh.q3
    public void d(e1 e1Var, boolean z4) {
        ((vh.q) this.b).b.t1(e1Var, z4);
    }

    @Override // xd.d
    public boolean g() {
        return false;
    }

    @Override // vh.d1
    public void g1(e1 e1Var) {
        ((h0) this.c).l();
    }

    @Override // rc.a
    public Object get() {
        return new z2.d((Context) ((a3.c) this.c).a, (s5.m) ((xe.b) this.b).get());
    }

    @Override // vh.d1
    public boolean h() {
        return ((h0) this.c).Y0();
    }

    @Override // vh.d1
    public /* synthetic */ boolean h0(e1 e1Var) {
        return false;
    }

    @Override // xd.d
    public boolean i(float f10) {
        return false;
    }

    @Override // u4.p
    public o0 k(u4.l lVar, u4.i iVar) {
        return new f7.b(29, ((u4.p) this.c).k(lVar, iVar), (List) this.b);
    }

    @Override // u4.p
    public o0 l() {
        return new f7.b(29, ((u4.p) this.c).l(), (List) this.b);
    }

    @Override // vh.d1
    public void l1(Editable editable) {
        ((i0) this.b).i();
        ((h0) this.c).s1();
    }

    @Override // vh.q3
    public void m(p3 p3Var, View view) {
        vh.q qVar = (vh.q) this.b;
        p70 p70Var = new p70(qVar, (f6) this.c, view, false, false, true);
        p70Var.Q = true;
        qVar.E = e4.c(p70Var, qVar.b.c0, qVar.getContext(), (f6) this.c, p3Var, true);
    }

    @Override // vh.q3
    public void n(int i10) {
        vh.q.O((vh.q) this.b, 74, i10);
    }

    @Override // vh.d1
    public void n1(e1 e1Var, int i10, int i11) {
        l9 J0;
        h0 h0Var = (h0) this.c;
        if (((i0) this.b).d || i10 == i11 || (J0 = h0Var.J0()) == null) {
            return;
        }
        if (J0.y() && J0.W == h0Var.O0()) {
            return;
        }
        e1Var.post(new lj(this, e1Var, i11, J0, h0Var, i10));
    }

    @Override // vh.q3
    public void o() {
        vh.q qVar = (vh.q) this.b;
        s3 s3Var = qVar.r;
        w3 w3Var = qVar.s;
        if (w3Var != null) {
            g3 g3Var = s3Var.k3;
            int i10 = (g3Var != null && g3Var.y() && s3Var.B4()) ? 1 : 0;
            if (w3Var.U == 2) {
                w3Var.V = i10;
            } else {
                w3Var.f(i10, true);
            }
            if (i10 != 0) {
                qVar.W();
            }
        }
        qVar.Z();
    }

    @Override // vh.q3
    public void onContentChanged() {
        vh.q qVar = (vh.q) this.b;
        w3 w3Var = qVar.s;
        if (w3Var != null) {
            w3Var.setSendLoading(qVar.r.l3());
        }
        qVar.V(true);
        qVar.Y();
        vh.e eVar = qVar.M;
        AndroidUtilities.cancelRunOnUIThread(eVar);
        AndroidUtilities.runOnUIThread(eVar, 1000L);
    }

    @Override // t5.a
    public void p(Bitmap bitmap) {
        c0 c0Var = (c0) this.c;
        c0Var.b = bitmap;
        t5.f fVar = (t5.f) this.b;
        fVar.l = c0Var;
        fVar.b();
    }

    public void q(String str, PrintWriter printWriter) {
        w1.b bVar = (w1.b) this.b;
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

    @Override // vh.d1
    public void r(int i10, int i11) {
        ((h0) this.c).f1(i10, i11);
    }

    @Override // vh.q3
    public void s() {
        w3 w3Var = ((vh.q) this.b).s;
        if (w3Var != null) {
            int i10 = w3Var.U;
            if (i10 == 2) {
                i10 = 0;
            }
            w3Var.V = i10;
            w3Var.e(false, false);
            w3Var.f(2, true);
        }
    }

    @Override // vh.q3
    public void t(w5 w5Var, String str) {
        vh.q qVar = (vh.q) this.b;
        if (qVar.v == null) {
            f6 f6Var = (f6) this.c;
            qVar.v = new m.s3(new org.telegram.ui.web.m(11, this, f6Var), f6Var);
        }
        qVar.v.f(w5Var, str);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        x5.a aVar = (x5.a) this.c;
        Bundle bundle = (Bundle) this.b;
        aVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        return (bundle2 == null || !bundle2.containsKey("google.messenger")) ? task : aVar.a(bundle).onSuccessTask(x5.l.a, x5.b.b);
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return "Bounds{lower=" + ((i0.b) this.c) + " upper=" + ((i0.b) this.b) + "}";
            case 7:
                return ((HashMap) this.c).toString();
            case 15:
                StringBuilder sb = new StringBuilder(128);
                sb.append("LoaderManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                Class<?> cls = ((androidx.lifecycle.t) this.c).getClass();
                sb.append(cls.getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(cls)));
                sb.append("}}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // vh.q3
    public void u() {
        vh.q qVar = (vh.q) this.b;
        if (qVar.getCurrentItemTop() != qVar.F) {
            qVar.b.X1(qVar, 0);
        }
        qVar.a0();
        vh.q.J(qVar);
    }

    @Override // q9.a
    public StackTraceElement[] v(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        q9.a[] aVarArr = (q9.a[]) this.c;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            q9.a aVar = aVarArr[i10];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.v(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? ((db.a) this.b).v(stackTraceElementArr2) : stackTraceElementArr2;
    }

    @Override // vh.q3
    public void w(r3 r3Var, View view) {
        vh.q qVar = (vh.q) this.b;
        p70 p70Var = new p70(qVar, (f6) this.c, view, false, false, true);
        p70Var.Q = true;
        p2 p2Var = qVar.b.c0;
        qVar.getContext();
        qVar.E = e4.b(p70Var, p2Var, r3Var, true);
    }

    @Override // vh.d1
    public /* synthetic */ boolean w1(boolean z4) {
        return false;
    }

    @Override // xd.d
    public void x() {
        ((xd.i) this.c).e((xd.j) this.b);
    }

    @Override // vh.q3
    public void y(int i10) {
        vh.q qVar = (vh.q) this.b;
        qVar.b.X1(qVar, i10);
        qVar.a0();
        vh.q.J(qVar);
    }

    @Override // vh.q3
    public void z(vh.a aVar) {
        vh.q qVar = (vh.q) this.b;
        li liVar = qVar.b;
        p2 p2Var = liVar.c0;
        if (p2Var != null && aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(p2Var)) {
            li liVar2 = new li(qVar.getContext(), liVar.c0, false, false, false, null);
            liVar2.W1 = new ab.a(24);
            liVar2.M = true;
            liVar2.u1.setVisibility(8);
            liVar2.q2 = new l1(qVar, aVar, liVar2, 5);
            liVar2.r1();
            liVar2.show();
        }
    }

    public /* synthetic */ c0(Object obj, Object obj2, boolean z4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public c0(a6.a aVar) {
        this.a = 9;
        this.c = aVar == null ? null : aVar.b;
    }

    public c0(IBinder iBinder) {
        this.a = 16;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.b = new x5.f(iBinder);
            this.c = null;
            return;
        }
        this.c = new Messenger(iBinder);
        this.b = null;
    }

    public c0(q9.a[] aVarArr) {
        this.a = 2;
        this.c = aVarArr;
        this.b = new db.a(20);
    }

    public c0(androidx.lifecycle.t tVar, t0 t0Var) {
        this.a = 15;
        this.c = tVar;
        this.b = (w1.b) new af.d(t0Var, w1.b.f).m(w1.b.class);
    }

    public c0(String str, String str2) {
        this.a = 12;
        this.b = str;
        this.c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    @Override // xd.d
    public void j() {
    }

    @Override // vh.d1
    public /* synthetic */ void q0() {
    }

    public c0(Context context) {
        this.a = 20;
        this.b = null;
        this.c = context;
    }

    @Override // xd.d
    public void f(boolean z4) {
    }

    public c0(String str) {
        this.a = 11;
        this.c = null;
        this.b = str;
    }

    public c0(cl0 cl0Var) {
        this.a = 5;
        this.c = cl0Var;
        this.b = new AtomicBoolean(false);
    }
}
