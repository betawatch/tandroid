package t7;

import android.location.Location;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.messenger.t9;
import p6.h0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Continuation, com.google.android.gms.common.api.internal.p, com.google.android.gms.common.api.internal.n {
    public static final /* synthetic */ a a = new a();
    public static final /* synthetic */ a b = new a();
    public static final /* synthetic */ a c = new a();

    public void a(k kVar, com.google.android.gms.common.api.internal.m mVar, boolean z10, TaskCompletionSource taskCompletionSource) {
        synchronized (kVar.G) {
            try {
                i iVar = (i) kVar.G.remove(mVar);
                if (iVar == null) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
                m6.c cVar = null;
                iVar.b.g().b = null;
                if (z10) {
                    h0 h0Var = kVar.B;
                    m6.c[] cVarArr = h0Var == null ? null : h0Var.b;
                    if (cVarArr != null) {
                        int length = cVarArr.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                break;
                            }
                            m6.c cVar2 = cVarArr[i3];
                            if ("location_updates_with_callback".equals(cVar2.a)) {
                                cVar = cVar2;
                                break;
                            }
                            i3++;
                        }
                        if (cVar != null && cVar.b() >= 1) {
                            x xVar = (x) kVar.m();
                            e eVar = new e(Boolean.TRUE, taskCompletionSource);
                            Parcel P0 = xVar.P0();
                            int i10 = d.a;
                            P0.writeInt(1);
                            int s6 = j8.a.s(P0, 20293);
                            j8.a.r(P0, 1, 4);
                            P0.writeInt(2);
                            j8.a.g(P0, 3, iVar);
                            j8.a.t(P0, s6);
                            d.c(P0, eVar);
                            xVar.T0(P0, 89);
                        }
                    }
                    x xVar2 = (x) kVar.m();
                    g gVar = new g(taskCompletionSource);
                    int i11 = i.c;
                    IInterface queryLocalInterface = iVar.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
                    IInterface iVar2 = queryLocalInterface instanceof i8.j ? (i8.j) queryLocalInterface : new i8.i(iVar, "com.google.android.gms.location.ILocationCallback", 9);
                    IInterface queryLocalInterface2 = gVar.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                    IInterface uVar = queryLocalInterface2 instanceof w ? (w) queryLocalInterface2 : new u(gVar, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 9);
                    Parcel P02 = xVar2.P0();
                    int i12 = d.a;
                    P02.writeInt(1);
                    int s10 = j8.a.s(P02, 20293);
                    j8.a.r(P02, 1, 4);
                    P02.writeInt(2);
                    j8.a.g(P02, 5, iVar2.asBinder());
                    j8.a.g(P02, 6, uVar.asBinder());
                    j8.a.t(P02, s10);
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
        i8.a aVar = new i8.a(Long.MAX_VALUE, 0, false, null, null);
        h0 h0Var = kVar.B;
        m6.c cVar = null;
        m6.c[] cVarArr = h0Var == null ? null : h0Var.b;
        if (cVarArr != null) {
            int length = cVarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                m6.c cVar2 = cVarArr[i3];
                if ("get_last_location_with_request".equals(cVar2.a)) {
                    cVar = cVar2;
                    break;
                }
                i3++;
            }
            if (cVar != null && cVar.b() >= 1) {
                x xVar = (x) kVar.m();
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
        x xVar2 = (x) kVar.m();
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
    public /* synthetic */ void c(Object obj) {
        ((t9) obj).getClass();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return null;
    }
}
