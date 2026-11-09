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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                            Parcel p12 = xVar.p1();
                            int i10 = d.a;
                            p12.writeInt(1);
                            int r10 = xb.r(p12, 20293);
                            xb.q(p12, 1, 4);
                            p12.writeInt(2);
                            xb.f(p12, 3, iVar);
                            xb.s(p12, r10);
                            d.c(p12, eVar);
                            xVar.t1(p12, 89);
                        }
                    }
                    x xVar2 = (x) kVar.n();
                    g gVar = new g(taskCompletionSource);
                    int i11 = i.c;
                    IInterface queryLocalInterface = iVar.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
                    IInterface iVar2 = queryLocalInterface instanceof j8.j ? (j8.j) queryLocalInterface : new j8.i(iVar, "com.google.android.gms.location.ILocationCallback", 10);
                    IInterface queryLocalInterface2 = gVar.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                    IInterface uVar = queryLocalInterface2 instanceof w ? (w) queryLocalInterface2 : new u(gVar, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 10);
                    Parcel p13 = xVar2.p1();
                    int i12 = d.a;
                    p13.writeInt(1);
                    int r11 = xb.r(p13, 20293);
                    xb.q(p13, 1, 4);
                    p13.writeInt(2);
                    xb.f(p13, 5, iVar2.asBinder());
                    xb.f(p13, 6, uVar.asBinder());
                    xb.s(p13, r11);
                    xVar2.t1(p13, 59);
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
                Parcel p12 = xVar.p1();
                int i10 = d.a;
                p12.writeInt(1);
                aVar.writeToParcel(p12, 0);
                d.c(p12, fVar);
                xVar.t1(p12, 82);
                return;
            }
        }
        x xVar2 = (x) kVar.n();
        Parcel p13 = xVar2.p1();
        Parcel obtain = Parcel.obtain();
        try {
            try {
                xVar2.b.transact(7, p13, obtain, 0);
                obtain.readException();
                p13.recycle();
                Location location = (Location) d.a(obtain, Location.CREATOR);
                obtain.recycle();
                taskCompletionSource.setResult(location);
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } catch (Throwable th2) {
            p13.recycle();
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
