package sg;

import a8.u9;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.telegram.ui.Cells.b5;
import org.telegram.ui.hn0;
import org.telegram.ui.uv;
import org.telegram.ui.vp0;
import y7.f7;
import z7.qa;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class h0 implements te.d, t0, q5.b, com.google.android.gms.common.api.internal.q, b3.r {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public /* synthetic */ h0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // te.d
    public boolean C() {
        return false;
    }

    @Override // te.d
    public boolean D(float f10) {
        return false;
    }

    @Override // te.d
    public void a() {
        ((te.i) this.b).a();
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        v6.d dVar = new v6.d((v6.e) this.b, (TaskCompletionSource) obj2, 0);
        v6.c cVar = (v6.c) ((v6.f) obj).n();
        v6.a aVar = (v6.a) this.c;
        Parcel j12 = cVar.j1();
        n7.a.c(j12, dVar);
        n7.a.b(j12, aVar);
        cVar.k1(j12, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    public ArrayList b() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        b5 b5Var = (b5) this.c;
        Context context = (Context) this.b;
        Class cls = (Class) b5Var.a;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new u9.c((String) it.next(), 0));
        }
        return arrayList2;
    }

    public void c(String str, PrintWriter printWriter) {
        z1.b bVar = (z1.b) this.c;
        if (bVar.d.c <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String str2 = str + "    ";
        int i7 = 0;
        while (true) {
            a0.m mVar = bVar.d;
            if (i7 >= mVar.c) {
                return;
            }
            z1.a aVar = (z1.a) mVar.b[i7];
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(bVar.d.a[i7]);
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
            d6.d dVar = aVar.l;
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
                ca.i iVar = aVar.n;
                iVar.getClass();
                printWriter.print(str2 + "  ");
                printWriter.print("mDeliveredData=");
                printWriter.println(iVar.b);
            }
            printWriter.print(str2);
            printWriter.print("mData=");
            d6.d dVar2 = aVar.l;
            Object obj = aVar.e;
            Object obj2 = obj != androidx.lifecycle.z.k ? obj : null;
            dVar2.getClass();
            StringBuilder sb2 = new StringBuilder(64);
            if (obj2 == null) {
                sb2.append("null");
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
            i7++;
        }
    }

    public View d(int i7, int i10, int i11, int i12) {
        v4.j1 j1Var = (v4.j1) this.c;
        v4.k1 k1Var = (v4.k1) this.b;
        int z10 = k1Var.z();
        int R = k1Var.R();
        int i13 = i10 > i7 ? 1 : -1;
        View view = null;
        while (i7 != i10) {
            View d02 = k1Var.d0(i7);
            int a10 = k1Var.a(d02);
            int f02 = k1Var.f0(d02);
            j1Var.b = z10;
            j1Var.c = R;
            j1Var.d = a10;
            j1Var.e = f02;
            if (i11 != 0) {
                j1Var.a = i11;
                if (j1Var.a()) {
                    return d02;
                }
            }
            if (i12 != 0) {
                j1Var.a = i12;
                if (j1Var.a()) {
                    view = d02;
                }
            }
            i7 += i13;
        }
        return view;
    }

    public boolean e(View view) {
        v4.j1 j1Var = (v4.j1) this.c;
        v4.k1 k1Var = (v4.k1) this.b;
        int z10 = k1Var.z();
        int R = k1Var.R();
        int a10 = k1Var.a(view);
        int f02 = k1Var.f0(view);
        j1Var.b = z10;
        j1Var.c = R;
        j1Var.d = a10;
        j1Var.e = f02;
        j1Var.a = 24579;
        return j1Var.a();
    }

    @Override // sg.t0
    public void e0() {
        vp0 vp0Var = (vp0) this.c;
        vp0Var.p0.a.u();
        vp0Var.V0.setViewHidden(false);
    }

    public f3.i0 f(int i7) {
        int i10 = 0;
        while (true) {
            int[] iArr = (int[]) this.b;
            if (i10 >= iArr.length) {
                h2.a.c("BaseMediaChunkOutput", "Unmatched track of type: " + i7);
                return new f3.n();
            }
            if (i7 == iArr[i10]) {
                return ((x2.c1[]) this.c)[i10];
            }
            i10++;
        }
    }

    @Override // fd.a
    public Object get() {
        int i7 = 28;
        qb.a aVar = new qb.a(i7);
        pb.b bVar = new pb.b(i7);
        Object obj = ((fd.a) this.b).get();
        fd.a aVar2 = (fd.a) this.c;
        return new v5.g(aVar, bVar, v5.a.f, (v5.i) obj, aVar2);
    }

    @Override // sg.t0
    public void j() {
        ((hn0) this.b).run();
    }

    @Override // sg.t0
    public void k() {
        uv uvVar = ((vp0) this.c).H0;
        if (uvVar != null) {
            uvVar.invalidate();
        }
    }

    @Override // te.d
    public void m1() {
        ((te.i) this.b).f((te.j) this.c);
    }

    @Override // sg.t0
    public void n() {
        vp0 vp0Var = (vp0) this.c;
        if (vp0Var.U0) {
            vp0Var.U0 = false;
        } else {
            vp0Var.d1.b(1);
            vp0Var.w((h) h.a.get(0));
        }
    }

    @Override // sg.t0
    public void n0() {
        vp0 vp0Var = (vp0) this.c;
        if (vp0Var.C0 != null) {
            vp0Var.r0(null, true);
        }
        vp0Var.V0.setViewHidden(true);
    }

    @Override // b3.r
    public Object t(Uri uri, j2.k kVar) {
        w2.a aVar = (w2.a) ((b3.r) this.b).t(uri, kVar);
        List list = (List) this.c;
        return (list == null || list.isEmpty()) ? aVar : (w2.a) aVar.a(list);
    }

    public String toString() {
        switch (this.a) {
            case 12:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((androidx.lifecycle.t) this.b).getClass();
                sb2.append(cls.getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                sb2.append("}}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // sg.t0
    public boolean y() {
        vp0 vp0Var = (vp0) this.c;
        boolean z10 = vp0Var.C0 == null;
        if (!z10) {
            vp0Var.r0(null, true);
        }
        return z10;
    }

    public /* synthetic */ h0(Object obj, Object obj2, boolean z10, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    public h0(f7 f7Var) {
        this.a = 13;
        this.c = new u9();
        this.b = f7Var;
        qa.b();
    }

    public h0(Context context) {
        this.a = 10;
        this.b = context;
        this.c = null;
    }

    public h0(androidx.lifecycle.t tVar, androidx.lifecycle.t0 t0Var) {
        this.a = 12;
        this.b = tVar;
        this.c = (z1.b) new android.support.v4.media.session.a0(t0Var, z1.b.f).j(z1.b.class);
    }

    public h0(v4.k1 k1Var) {
        this.a = 5;
        this.b = k1Var;
        v4.j1 j1Var = new v4.j1();
        j1Var.a = 0;
        this.c = j1Var;
    }

    @Override // te.d
    public void x(boolean z10) {
    }

    @Override // te.d
    public void H() {
    }
}
