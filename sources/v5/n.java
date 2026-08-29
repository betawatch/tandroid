package v5;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.lifecycle.t;
import androidx.lifecycle.t0;
import c2.u;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import e0.i0;
import f5.c0;
import f5.d0;
import f5.v;
import f5.w;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.beta.R;
import y3.b0;
import y3.y;
import y3.z;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Continuation, vd.e, o3.e, y, t4.f, a3.b {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ n() {
        this.a = 4;
    }

    @Override // vd.e
    public void a() {
        ((vd.j) this.b).a();
    }

    @Override // y3.y
    public void c(w wVar) {
        b0 b0Var = (b0) this.c;
        SparseArray sparseArray = b0Var.f;
        v vVar = (v) this.b;
        if (wVar.r() == 0 && (wVar.r() & 128) != 0) {
            wVar.D(6);
            int a2 = wVar.a() / 4;
            for (int i10 = 0; i10 < a2; i10++) {
                wVar.c(0, 4, vVar.b);
                vVar.p(0);
                int i11 = vVar.i(16);
                vVar.s(3);
                if (i11 == 0) {
                    vVar.s(13);
                } else {
                    int i12 = vVar.i(13);
                    if (sparseArray.get(i12) == null) {
                        sparseArray.put(i12, new z(new i0(b0Var, i12)));
                        b0Var.l++;
                    }
                }
            }
            if (b0Var.a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // o3.e
    public o3.d d(o3.l lVar, long j10) {
        long position = lVar.getPosition();
        int min = (int) Math.min(20000L, lVar.getLength() - position);
        w wVar = (w) this.c;
        wVar.z(min);
        lVar.a(0, min, wVar.a);
        int i10 = -1;
        long j11 = -9223372036854775807L;
        int i11 = -1;
        while (wVar.a() >= 4) {
            if (r3.a.a(wVar.b, wVar.a) != 442) {
                wVar.D(1);
            } else {
                wVar.D(4);
                long c3 = y3.v.c(wVar);
                if (c3 != -9223372036854775807L) {
                    long b10 = ((c0) this.b).b(c3);
                    if (b10 > j10) {
                        return j11 == -9223372036854775807L ? new o3.d(-1, b10, position) : new o3.d(0, -9223372036854775807L, position + i11);
                    }
                    if (b10 + 100000 > j10) {
                        return new o3.d(0, -9223372036854775807L, position + wVar.b);
                    }
                    j11 = b10;
                    i11 = wVar.b;
                }
                int i12 = wVar.c;
                if (wVar.a() >= 10) {
                    wVar.D(9);
                    int r6 = wVar.r() & 7;
                    if (wVar.a() >= r6) {
                        wVar.D(r6);
                        if (wVar.a() >= 4) {
                            if (r3.a.a(wVar.b, wVar.a) == 443) {
                                wVar.D(4);
                                int w10 = wVar.w();
                                if (wVar.a() < w10) {
                                    wVar.C(i12);
                                } else {
                                    wVar.D(w10);
                                }
                            }
                            while (true) {
                                if (wVar.a() < 4) {
                                    break;
                                }
                                int a2 = r3.a.a(wVar.b, wVar.a);
                                if (a2 == 442 || a2 == 441 || (a2 >>> 8) != 1) {
                                    break;
                                }
                                wVar.D(4);
                                if (wVar.a() < 2) {
                                    wVar.C(i12);
                                    break;
                                }
                                wVar.C(Math.min(wVar.c, wVar.b + wVar.w()));
                            }
                        } else {
                            wVar.C(i12);
                        }
                    } else {
                        wVar.C(i12);
                    }
                } else {
                    wVar.C(i12);
                }
                i10 = wVar.b;
            }
        }
        return j11 != -9223372036854775807L ? new o3.d(-2, j11, position + i10) : o3.d.d;
    }

    @Override // t4.f
    public int e(long j10) {
        int i10;
        switch (this.a) {
            case 7:
                ArrayList arrayList = (ArrayList) this.c;
                Long valueOf = Long.valueOf(j10);
                int i11 = d0.a;
                int binarySearch = Collections.binarySearch(arrayList, valueOf);
                if (binarySearch < 0) {
                    i10 = ~binarySearch;
                } else {
                    int size = arrayList.size();
                    do {
                        binarySearch++;
                        if (binarySearch < size) {
                        }
                        i10 = binarySearch;
                    } while (((Comparable) arrayList.get(binarySearch)).compareTo(valueOf) == 0);
                    i10 = binarySearch;
                }
                if (i10 < arrayList.size()) {
                    return i10;
                }
                return -1;
            default:
                long[] jArr = (long[]) this.c;
                int b10 = d0.b(jArr, j10, false);
                if (b10 < jArr.length) {
                    return b10;
                }
                return -1;
        }
    }

    @Override // o3.e
    public void f() {
        w wVar = (w) this.c;
        byte[] bArr = d0.f;
        wVar.getClass();
        wVar.A(bArr.length, bArr);
    }

    public void g(Object obj, String str) {
        ((ArrayList) this.b).add(a4.w.y(str, "=", String.valueOf(obj)));
    }

    @Override // pc.a
    public Object get() {
        return new z2.d((Context) ((a3.c) this.b).a, (c) ((org.telegram.ui.Components.n) this.c).get());
    }

    public void i(String str, PrintWriter printWriter) {
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
            m5.d dVar = aVar.l;
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
                u uVar = aVar.n;
                uVar.getClass();
                printWriter.print(str2 + "  ");
                printWriter.print("mDeliveredData=");
                printWriter.println(uVar.b);
            }
            printWriter.print(str2);
            printWriter.print("mData=");
            m5.d dVar2 = aVar.l;
            Object obj = aVar.e;
            Object obj2 = obj != androidx.lifecycle.z.k ? obj : null;
            dVar2.getClass();
            StringBuilder sb2 = new StringBuilder(64);
            if (obj2 == null) {
                sb2.append(BuildConfig.BETA_URL);
            } else {
                Class<?> cls = obj2.getClass();
                sb2.append(cls.getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                sb2.append("}");
            }
            printWriter.println(sb2.toString());
            printWriter.print(str2);
            printWriter.print("mStarted=");
            printWriter.println(aVar.c > 0);
            i10++;
        }
    }

    @Override // vd.e
    public boolean j() {
        return false;
    }

    @Override // vd.e
    public boolean k(float f9) {
        return false;
    }

    @Override // t4.f
    public long m(int i10) {
        switch (this.a) {
            case 7:
                ArrayList arrayList = (ArrayList) this.c;
                f5.a.f(i10 >= 0);
                f5.a.f(i10 < arrayList.size());
                return ((Long) arrayList.get(i10)).longValue();
            default:
                long[] jArr = (long[]) this.c;
                f5.a.f(i10 >= 0);
                f5.a.f(i10 < jArr.length);
                return jArr[i10];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory n(String str) {
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
        } catch (ClassNotFoundException e10) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e10);
            return null;
        } catch (IllegalAccessException e11) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e11);
            return null;
        } catch (InstantiationException e12) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e12);
            return null;
        } catch (NoSuchMethodException e13) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e13);
            return null;
        } catch (InvocationTargetException e14) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e14);
            return null;
        }
    }

    public String o(String str) {
        String str2 = (String) this.c;
        Resources resources = (Resources) this.b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public int p(Context context, com.google.android.gms.common.api.c cVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        z5.l.h(context);
        z5.l.h(cVar);
        int i10 = 0;
        if (!cVar.j()) {
            return 0;
        }
        int k9 = cVar.k();
        int i11 = sparseIntArray.get(k9, -1);
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= sparseIntArray.size()) {
                i10 = -1;
                break;
            }
            int keyAt = sparseIntArray.keyAt(i12);
            if (keyAt > k9 && sparseIntArray.get(keyAt) == 0) {
                break;
            }
            i12++;
        }
        if (i10 == -1) {
            i10 = ((w5.e) this.c).d(context, k9);
        }
        sparseIntArray.put(k9, i10);
        return i10;
    }

    @Override // t4.f
    public List q(long j10) {
        t4.b bVar;
        switch (this.a) {
            case 7:
                int c3 = d0.c((ArrayList) this.c, Long.valueOf(j10), false);
                return c3 == -1 ? Collections.EMPTY_LIST : (List) ((ArrayList) this.b).get(c3);
            default:
                int e10 = d0.e((long[]) this.c, j10, false);
                return (e10 == -1 || (bVar = ((t4.b[]) this.b)[e10]) == t4.b.D) ? Collections.EMPTY_LIST : Collections.singletonList(bVar);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        a aVar = (a) this.b;
        Bundle bundle = (Bundle) this.c;
        aVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        return (bundle2 == null || !bundle2.containsKey("google.messenger")) ? task : aVar.a(bundle).onSuccessTask(m.a, b.b);
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((t) this.b).getClass();
                sb2.append(cls.getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                sb2.append("}}");
                return sb2.toString();
            case 11:
                StringBuilder sb3 = new StringBuilder(100);
                sb3.append(this.c.getClass().getSimpleName());
                sb3.append('{');
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb3.append((String) arrayList.get(i10));
                    if (i10 < size - 1) {
                        sb3.append(", ");
                    }
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    @Override // t4.f
    public int v() {
        switch (this.a) {
            case 7:
                return ((ArrayList) this.c).size();
            default:
                return ((long[]) this.c).length;
        }
    }

    @Override // vd.e
    public void w() {
        ((vd.j) this.b).b((vd.k) this.c);
    }

    public /* synthetic */ n(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ n(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ n(Object obj) {
        this.a = 11;
        this.c = obj;
        this.b = new ArrayList();
    }

    public n(w5.e eVar) {
        this.a = 13;
        this.b = new SparseIntArray();
        z5.l.h(eVar);
        this.c = eVar;
    }

    public n(t tVar, t0 t0Var) {
        this.a = 2;
        this.b = tVar;
        this.c = (w1.b) new androidx.biometric.e(t0Var, w1.b.f).l(w1.b.class);
    }

    public n(c0 c0Var) {
        this.a = 5;
        this.b = c0Var;
        this.c = new w();
    }

    public n(Context context, int i10) {
        this.a = i10;
        switch (i10) {
            case 12:
                z5.l.h(context);
                Resources resources = context.getResources();
                this.b = resources;
                this.c = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                break;
            default:
                this.c = null;
                this.b = context;
                break;
        }
    }

    public n(b0 b0Var) {
        this.a = 6;
        this.c = b0Var;
        this.b = new v(new byte[4], 4);
    }

    @Override // vd.e
    public void l() {
    }

    @Override // vd.e
    public void h(boolean z10) {
    }

    @Override // y3.y
    public void b(c0 c0Var, o3.m mVar, y3.d0 d0Var) {
    }
}
