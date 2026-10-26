package s4;

import a8.pe;
import android.content.Context;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import sg.p2;
import sg.x1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class o0 implements j1, com.google.android.gms.common.api.internal.o, x1, com.google.android.gms.common.api.internal.r, v0.h, OnCompleteListener {
    public Object a;

    public /* synthetic */ o0(Object obj) {
        this.a = obj;
    }

    public static void b(String str, TreeMap treeMap) {
        String[] split = str.split(":", 2);
        if (split.length < 2) {
            return;
        }
        String trim = split[0].trim();
        String trim2 = split[1].trim();
        List list = (List) treeMap.get(trim);
        if (list == null) {
            list = new ArrayList();
            treeMap.put(trim, list);
        }
        list.add(trim2);
    }

    @Override // s4.j1
    public int J() {
        p0 p0Var = (p0) this.a;
        return p0Var.n - p0Var.C();
    }

    @Override // sg.x1
    public void V(float f7) {
        ((p2) this.a).setOutlineWidth(f7);
    }

    @Override // s4.j1
    public View W(int i10) {
        return ((p0) this.a).q(i10);
    }

    @Override // s4.j1
    public int X(View view) {
        return p0.v(view) + ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).bottomMargin;
    }

    public Object a(Context context, v0.e eVar, ld.c cVar) {
        ce.m mVar = new ce.m(1, pe.b(cVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new v0.g(cancellationSignal));
        me.b bVar = new me.b(mVar);
        a3.b bVar2 = new a3.b(2);
        kotlin.jvm.internal.i.e(context, "context");
        v0.j b10 = m5.j.b(new m5.j((Context) this.a, 2), eVar);
        if (b10 == null) {
            bVar.onError(new w0.c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            bVar.onError(new w0.c("createCredential is not supported on this device", 3));
        } else {
            b10.onCreateCredential(context, eVar, cancellationSignal, bVar2, bVar);
        }
        Object r6 = mVar.r();
        md.a aVar = md.a.a;
        return r6;
    }

    @Override // com.google.android.gms.common.api.internal.r
    public void accept(Object obj, Object obj2) {
        t6.g gVar = new t6.g(1, (TaskCompletionSource) obj2);
        t6.e eVar = (t6.e) ((t6.i) obj).u();
        t6.a aVar = (t6.a) this.a;
        Parcel H0 = eVar.H0();
        l7.a.d(H0, gVar);
        l7.a.c(H0, aVar);
        H0.writeStrongBinder(null);
        eVar.I0(H0, 2);
    }

    public void c(ca.a aVar, TreeMap treeMap) {
        String str;
        List list = (List) treeMap.get("Sec-WebSocket-Protocol");
        if (list == null || (str = (String) list.get(0)) == null || str.length() == 0) {
            return;
        }
        synchronized (((uc.u) this.a).c) {
        }
        throw new uc.n(19, "The protocol contained in the Sec-WebSocket-Protocol header is not supported: ".concat(str), aVar);
    }

    @Override // sg.x1
    public float get() {
        return ((p2) this.a).F;
    }

    @Override // s4.j1
    public int m(View view) {
        return p0.z(view) - ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).topMargin;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        z8.f0 f0Var = (z8.f0) this.a;
        if (task.isSuccessful()) {
            y8.m.L0(f0Var, true, (byte[]) task.getResult());
        } else {
            Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
            y8.m.L0(f0Var, false, null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.o
    public void p(Object obj) {
        com.google.android.gms.common.api.internal.n nVar;
        androidx.activity.n nVar2 = ((s7.i) this.a).b;
        synchronized (nVar2) {
            nVar2.a = false;
            nVar = ((com.google.android.gms.common.api.internal.p) nVar2.b).c;
        }
        if (nVar != null) {
            ((s7.c) nVar2.c).c(nVar, 2441);
        }
    }

    @Override // s4.j1
    public int s() {
        return ((p0) this.a).G();
    }

    public o0(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.a = context;
    }
}
