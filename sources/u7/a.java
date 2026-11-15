package u7;

import android.location.Location;
import android.os.IInterface;
import android.os.Parcel;
import c8.yb;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.messenger.y9;
import q6.h0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Continuation, com.google.android.gms.common.api.internal.q, com.google.android.gms.common.api.internal.n {
    public static final /* synthetic */ a a = new a();
    public static final /* synthetic */ a b = new a();
    public static final /* synthetic */ a c = new a();

    public void a(l lVar, com.google.android.gms.common.api.internal.m mVar, boolean z10, TaskCompletionSource taskCompletionSource) {
        synchronized (lVar.G) {
            try {
                j jVar = (j) lVar.G.remove(mVar);
                if (jVar == null) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
                n6.c cVar = null;
                jVar.b.i().b = null;
                if (z10) {
                    h0 h0Var = lVar.B;
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
                            y yVar = (y) lVar.n();
                            e eVar = new e(Boolean.TRUE, taskCompletionSource);
                            Parcel p12 = yVar.p1();
                            int i10 = d.a;
                            p12.writeInt(1);
                            int r10 = yb.r(p12, 20293);
                            yb.q(p12, 1, 4);
                            p12.writeInt(2);
                            yb.f(p12, 3, jVar);
                            yb.s(p12, r10);
                            d.c(p12, eVar);
                            yVar.t1(p12, 89);
                        }
                    }
                    y yVar2 = (y) lVar.n();
                    g gVar = new g(taskCompletionSource);
                    int i11 = j.c;
                    IInterface queryLocalInterface = jVar.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
                    IInterface iVar = queryLocalInterface instanceof j8.j ? (j8.j) queryLocalInterface : new j8.i(jVar, "com.google.android.gms.location.ILocationCallback", 10);
                    IInterface queryLocalInterface2 = gVar.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                    IInterface vVar = queryLocalInterface2 instanceof x ? (x) queryLocalInterface2 : new v(gVar, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 10);
                    Parcel p13 = yVar2.p1();
                    int i12 = d.a;
                    p13.writeInt(1);
                    int r11 = yb.r(p13, 20293);
                    yb.q(p13, 1, 4);
                    p13.writeInt(2);
                    yb.f(p13, 5, iVar.asBinder());
                    yb.f(p13, 6, vVar.asBinder());
                    yb.s(p13, r11);
                    yVar2.t1(p13, 59);
                } else {
                    taskCompletionSource.setResult(Boolean.TRUE);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        l lVar = (l) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        j8.a aVar = new j8.a(Long.MAX_VALUE, 0, false, null, null);
        h0 h0Var = lVar.B;
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
                y yVar = (y) lVar.n();
                f fVar = new f(0, taskCompletionSource);
                Parcel p12 = yVar.p1();
                int i10 = d.a;
                p12.writeInt(1);
                aVar.writeToParcel(p12, 0);
                d.c(p12, fVar);
                yVar.t1(p12, 82);
                return;
            }
        }
        y yVar2 = (y) lVar.n();
        Parcel p13 = yVar2.p1();
        Parcel obtain = Parcel.obtain();
        try {
            try {
                yVar2.b.transact(7, p13, obtain, 0);
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
    public /* synthetic */ void g(Object obj) {
        ((y9) obj).getClass();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return null;
    }
}
