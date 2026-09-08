package r7;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Continuation, com.google.android.gms.common.api.internal.s {
    public static final /* synthetic */ a a = new a();
    public static final /* synthetic */ a b = new a();
    public static final /* synthetic */ a c = new a();

    public void a(k kVar, com.google.android.gms.common.api.internal.n nVar, boolean z10, TaskCompletionSource taskCompletionSource) {
        k6.c cVar;
        synchronized (kVar.V) {
            try {
                i iVar = (i) kVar.V.remove(nVar);
                if (iVar == null) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
                com.google.android.gms.common.api.internal.p e7 = iVar.b.e();
                e7.b = null;
                e7.c = null;
                if (z10) {
                    k6.c[] m10 = kVar.m();
                    if (m10 != null) {
                        int length = m10.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= length) {
                                cVar = null;
                                break;
                            }
                            cVar = m10[i10];
                            if ("location_updates_with_callback".equals(cVar.a)) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                        if (cVar != null && cVar.b() >= 1) {
                            z zVar = (z) kVar.u();
                            l lVar = new l(2, null, iVar, null, null, null);
                            e eVar = new e(Boolean.TRUE, taskCompletionSource);
                            Parcel O0 = zVar.O0();
                            d.c(O0, lVar);
                            d.d(O0, eVar);
                            zVar.S0(O0, 89);
                        }
                    }
                    z zVar2 = (z) kVar.u();
                    o oVar = new o(2, null, null, iVar, null, new g(taskCompletionSource), null);
                    Parcel O02 = zVar2.O0();
                    d.c(O02, oVar);
                    zVar2.S0(O02, 59);
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
        g8.b bVar = new g8.b(Long.MAX_VALUE, 0, false, null, null);
        k6.c[] m10 = kVar.m();
        if (m10 != null) {
            int length = m10.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    cVar = null;
                    break;
                }
                cVar = m10[i10];
                if ("get_last_location_with_request".equals(cVar.a)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (cVar != null && cVar.b() >= 1) {
                z zVar = (z) kVar.u();
                f fVar = new f(0, taskCompletionSource);
                Parcel O0 = zVar.O0();
                d.c(O0, bVar);
                d.d(O0, fVar);
                zVar.S0(O0, 82);
                return;
            }
        }
        z zVar2 = (z) kVar.u();
        Parcel O02 = zVar2.O0();
        Parcel obtain = Parcel.obtain();
        try {
            try {
                zVar2.b.transact(7, O02, obtain, 0);
                obtain.readException();
                O02.recycle();
                Location location = (Location) d.a(obtain, Location.CREATOR);
                obtain.recycle();
                taskCompletionSource.setResult(location);
            } catch (RuntimeException e7) {
                obtain.recycle();
                throw e7;
            }
        } catch (Throwable th2) {
            O02.recycle();
            throw th2;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return null;
    }
}
