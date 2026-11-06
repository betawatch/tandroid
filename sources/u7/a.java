package u7;

import android.location.Location;
import android.os.IInterface;
import android.os.Parcel;
import c8.xb;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.messenger.z9;
import q6.h0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Continuation, com.google.android.gms.common.api.internal.p, com.google.android.gms.common.api.internal.n {
    public static final /* synthetic */ a a = new a();
    public static final /* synthetic */ a b = new a();
    public static final /* synthetic */ a c = new a();

    public void a(k kVar, com.google.android.gms.common.api.internal.m mVar, boolean z9, TaskCompletionSource taskCompletionSource) {
        synchronized (kVar.G) {
            try {
                i iVar = (i) kVar.G.remove(mVar);
                if (iVar == null) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
                n6.c cVar = null;
                iVar.b.g().b = null;
                if (z9) {
                    h0 h0Var = kVar.B;
                    n6.c[] cVarArr = h0Var == null ? null : h0Var.b;
                    if (cVarArr != null) {
                        int length = cVarArr.length;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= length) {
                                break;
                            }
                            n6.c cVar2 = cVarArr[i7];
                            if ("location_updates_with_callback".equals(cVar2.a)) {
                                cVar = cVar2;
                                break;
                            }
                            i7++;
                        }
                        if (cVar != null && cVar.b() >= 1) {
                            x xVar = (x) kVar.n();
                            e eVar = new e(Boolean.TRUE, taskCompletionSource);
                            Parcel P0 = xVar.P0();
                            int i10 = d.a;
                            P0.writeInt(1);
                            int r10 = xb.r(P0, 20293);
                            xb.q(P0, 1, 4);
                            P0.writeInt(2);
                            xb.f(P0, 3, iVar);
                            xb.s(P0, r10);
                            d.c(P0, eVar);
                            xVar.T0(P0, 89);
                        }
                    }
                    x xVar2 = (x) kVar.n();
                    g gVar = new g(taskCompletionSource);
                    int i11 = i.c;
                    IInterface queryLocalInterface = iVar.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
                    IInterface iVar2 = queryLocalInterface instanceof j8.j ? (j8.j) queryLocalInterface : new j8.i(iVar, "com.google.android.gms.location.ILocationCallback", 10);
                    IInterface queryLocalInterface2 = gVar.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                    IInterface uVar = queryLocalInterface2 instanceof w ? (w) queryLocalInterface2 : new u(gVar, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 10);
                    Parcel P02 = xVar2.P0();
                    int i12 = d.a;
                    P02.writeInt(1);
                    int r11 = xb.r(P02, 20293);
                    xb.q(P02, 1, 4);
                    P02.writeInt(2);
                    xb.f(P02, 5, iVar2.asBinder());
                    xb.f(P02, 6, uVar.asBinder());
                    xb.s(P02, r11);
                    xVar2.T0(P02, 59);
                } else {
                    taskCompletionSource.setResult(Boolean.TRUE);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.p
    public void accept(Object obj, Object obj2) {
        k kVar = (k) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        j8.a aVar = new j8.a(Long.MAX_VALUE, 0, false, null, null);
        h0 h0Var = kVar.B;
        n6.c cVar = null;
        n6.c[] cVarArr = h0Var == null ? null : h0Var.b;
        if (cVarArr != null) {
            int length = cVarArr.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                n6.c cVar2 = cVarArr[i7];
                if ("get_last_location_with_request".equals(cVar2.a)) {
                    cVar = cVar2;
                    break;
                }
                i7++;
            }
            if (cVar != null && cVar.b() >= 1) {
                x xVar = (x) kVar.n();
                f fVar = new f(0, taskCompletionSource);
                Parcel P0 = xVar.P0();
                int i10 = d.a;
                P0.writeInt(1);
                aVar.writeToParcel(P0, 0);
                d.c(P0, fVar);
                xVar.T0(P0, 82);
                return;
            }
        }
        x xVar2 = (x) kVar.n();
        Parcel P02 = xVar2.P0();
        Parcel obtain = Parcel.obtain();
        try {
            try {
                xVar2.b.transact(7, P02, obtain, 0);
                obtain.readException();
                P02.recycle();
                Location location = (Location) d.a(obtain, Location.CREATOR);
                obtain.recycle();
                taskCompletionSource.setResult(location);
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } catch (Throwable th2) {
            P02.recycle();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.internal.n
    public /* synthetic */ void f(Object obj) {
        ((z9) obj).getClass();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return null;
    }
}
