package r7;

import android.location.Location;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.messenger.aa;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Continuation, com.google.android.gms.common.api.internal.s, com.google.android.gms.common.api.internal.o {
    public static final /* synthetic */ a a = new a();
    public static final /* synthetic */ a b = new a();
    public static final /* synthetic */ a c = new a();

    public void a(k kVar, com.google.android.gms.common.api.internal.n nVar, boolean z10, TaskCompletionSource taskCompletionSource) {
        synchronized (kVar.V) {
            try {
                i iVar = (i) kVar.V.remove(nVar);
                if (iVar == null) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
                com.google.android.gms.common.api.internal.p h = iVar.b.h();
                k6.c cVar = null;
                h.b = null;
                h.c = null;
                if (z10) {
                    k6.c[] n10 = kVar.n();
                    if (n10 != null) {
                        int length = n10.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= length) {
                                break;
                            }
                            k6.c cVar2 = n10[i10];
                            if ("location_updates_with_callback".equals(cVar2.a)) {
                                cVar = cVar2;
                                break;
                            }
                            i10++;
                        }
                        if (cVar != null && cVar.b() >= 1) {
                            x xVar = (x) kVar.v();
                            e eVar = new e(Boolean.TRUE, taskCompletionSource);
                            Parcel P0 = xVar.P0();
                            int i11 = d.a;
                            P0.writeInt(1);
                            int q6 = h0.q(P0, 20293);
                            h0.s(P0, 1, 4);
                            P0.writeInt(2);
                            h0.f(P0, 3, iVar);
                            h0.r(P0, q6);
                            d.c(P0, eVar);
                            xVar.T0(P0, 89);
                        }
                    }
                    x xVar2 = (x) kVar.v();
                    g gVar = new g(taskCompletionSource);
                    int i12 = i.c;
                    IInterface queryLocalInterface = iVar.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
                    IInterface jVar = queryLocalInterface instanceof g8.k ? (g8.k) queryLocalInterface : new g8.j(iVar, "com.google.android.gms.location.ILocationCallback", 8);
                    IInterface queryLocalInterface2 = gVar.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                    IInterface uVar = queryLocalInterface2 instanceof w ? (w) queryLocalInterface2 : new u(gVar, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 8);
                    Parcel P02 = xVar2.P0();
                    int i13 = d.a;
                    P02.writeInt(1);
                    int q10 = h0.q(P02, 20293);
                    h0.s(P02, 1, 4);
                    P02.writeInt(2);
                    h0.f(P02, 5, jVar.asBinder());
                    h0.f(P02, 6, uVar.asBinder());
                    h0.r(P02, q10);
                    xVar2.T0(P02, 59);
                } else {
                    taskCompletionSource.setResult(Boolean.TRUE);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        k6.c cVar;
        k kVar = (k) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        g8.a aVar = new g8.a(Long.MAX_VALUE, 0, false, null, null);
        k6.c[] n10 = kVar.n();
        if (n10 != null) {
            int length = n10.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    cVar = null;
                    break;
                }
                cVar = n10[i10];
                if ("get_last_location_with_request".equals(cVar.a)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (cVar != null && cVar.b() >= 1) {
                x xVar = (x) kVar.v();
                f fVar = new f(0, taskCompletionSource);
                Parcel P0 = xVar.P0();
                int i11 = d.a;
                P0.writeInt(1);
                aVar.writeToParcel(P0, 0);
                d.c(P0, fVar);
                xVar.T0(P0, 82);
                return;
            }
        }
        x xVar2 = (x) kVar.v();
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
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } catch (Throwable th2) {
            P02.recycle();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.internal.o
    public /* synthetic */ void i(Object obj) {
        ((aa) obj).getClass();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return null;
    }
}
