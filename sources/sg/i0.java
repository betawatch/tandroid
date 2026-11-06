package sg;

import a8.s9;
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
import org.telegram.ui.Components.qt;
import org.telegram.ui.cn0;
import org.telegram.ui.l00;
import org.telegram.ui.up0;
import y7.d6;
import z7.qa;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class i0 implements te.d, v0, q5.b, com.google.android.gms.common.api.internal.p, b3.q {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public /* synthetic */ i0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // te.d
    public boolean A() {
        return false;
    }

    @Override // te.d
    public boolean B(float f10) {
        return false;
    }

    @Override // b3.q
    public Object L1(Uri uri, j2.k kVar) {
        w2.a aVar = (w2.a) ((b3.q) this.b).L1(uri, kVar);
        List list = (List) this.c;
        return (list == null || list.isEmpty()) ? aVar : (w2.a) aVar.a(list);
    }

    @Override // sg.v0
    public void Y() {
        up0 up0Var = (up0) this.c;
        up0Var.o0.a.f();
        up0Var.U0.setViewHidden(false);
    }

    @Override // te.d
    public void Y0() {
        ((te.i) this.b).f((te.j) this.c);
    }

    @Override // te.d
    public void a() {
        ((te.i) this.b).a();
    }

    @Override // com.google.android.gms.common.api.internal.p
    public void accept(Object obj, Object obj2) {
        v6.d dVar = new v6.d((v6.f) this.b, (TaskCompletionSource) obj2, 0);
        v6.c cVar = (v6.c) ((v6.g) obj).n();
        v6.a aVar = (v6.a) this.c;
        Parcel J0 = cVar.J0();
        n7.a.c(J0, dVar);
        n7.a.b(J0, aVar);
        cVar.K0(J0, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    public ArrayList b() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        qt qtVar = (qt) this.c;
        Context context = (Context) this.b;
        Class cls = (Class) qtVar.b;
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
        v4.h1 h1Var = (v4.h1) this.c;
        v4.i1 i1Var = (v4.i1) this.b;
        int A = i1Var.A();
        int N = i1Var.N();
        int i13 = i10 > i7 ? 1 : -1;
        View view = null;
        while (i7 != i10) {
            View W = i1Var.W(i7);
            int k10 = i1Var.k(W);
            int a02 = i1Var.a0(W);
            h1Var.b = A;
            h1Var.c = N;
            h1Var.d = k10;
            h1Var.e = a02;
            if (i11 != 0) {
                h1Var.a = i11;
                if (h1Var.a()) {
                    return W;
                }
            }
            if (i12 != 0) {
                h1Var.a = i12;
                if (h1Var.a()) {
                    view = W;
                }
            }
            i7 += i13;
        }
        return view;
    }

    @Override // sg.v0
    public void d0() {
        up0 up0Var = (up0) this.c;
        if (up0Var.B0 != null) {
            up0Var.r0(null, true);
        }
        up0Var.U0.setViewHidden(true);
    }

    public boolean e(View view) {
        v4.h1 h1Var = (v4.h1) this.c;
        v4.i1 i1Var = (v4.i1) this.b;
        int A = i1Var.A();
        int N = i1Var.N();
        int k10 = i1Var.k(view);
        int a02 = i1Var.a0(view);
        h1Var.b = A;
        h1Var.c = N;
        h1Var.d = k10;
        h1Var.e = a02;
        h1Var.a = 24579;
        return h1Var.a();
    }

    public f3.j0 f(int i7) {
        int i10 = 0;
        while (true) {
            int[] iArr = (int[]) this.b;
            if (i10 >= iArr.length) {
                h2.a.c("BaseMediaChunkOutput", "Unmatched track of type: " + i7);
                return new f3.n();
            }
            if (i7 == iArr[i10]) {
                return ((x2.b1[]) this.c)[i10];
            }
            i10++;
        }
    }

    @Override // fd.a
    public Object get() {
        nb.a aVar = new nb.a(28);
        w7.s sVar = new w7.s(27, false);
        Object obj = ((fd.a) this.b).get();
        fd.a aVar2 = (fd.a) this.c;
        return new v5.g(aVar, sVar, v5.a.f, (v5.i) obj, aVar2);
    }

    @Override // sg.v0
    public void n() {
        ((cn0) this.b).run();
    }

    @Override // sg.v0
    public void o() {
        l00 l00Var = ((up0) this.c).G0;
        if (l00Var != null) {
            l00Var.invalidate();
        }
    }

    @Override // sg.v0
    public void p() {
        up0 up0Var = (up0) this.c;
        if (up0Var.T0) {
            up0Var.T0 = false;
        } else {
            up0Var.c1.b(1);
            up0Var.w((h) h.a.get(0));
        }
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

    @Override // sg.v0
    public boolean z() {
        up0 up0Var = (up0) this.c;
        boolean z9 = up0Var.B0 == null;
        if (!z9) {
            up0Var.r0(null, true);
        }
        return z9;
    }

    public /* synthetic */ i0(Object obj, Object obj2, boolean z9, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    public i0(d6 d6Var) {
        this.a = 13;
        this.c = new s9();
        this.b = d6Var;
        qa.b();
    }

    public i0(Context context) {
        this.a = 10;
        this.b = context;
        this.c = null;
    }

    public i0(androidx.lifecycle.t tVar, androidx.lifecycle.t0 t0Var) {
        this.a = 12;
        this.b = tVar;
        this.c = (z1.b) new android.support.v4.media.session.a0(t0Var, z1.b.f).i(z1.b.class);
    }

    public i0(v4.i1 i1Var) {
        this.a = 5;
        this.b = i1Var;
        v4.h1 h1Var = new v4.h1();
        h1Var.a = 0;
        this.c = h1Var;
    }

    @Override // te.d
    public void l(boolean z9) {
    }

    @Override // te.d
    public void D() {
    }
}
