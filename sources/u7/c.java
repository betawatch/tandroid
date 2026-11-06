package u7;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import m4.d0;
import org.telegram.messenger.z9;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class c extends com.google.android.gms.common.api.j {
    public static final com.google.android.gms.common.api.e l = new com.google.android.gms.common.api.e("LocationServices.API", new a9.e(18), new com.google.android.gms.common.api.d());

    public Task f(LocationRequest locationRequest, z9 z9Var, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            q6.m.h(looper, "invalid null looper");
        }
        com.google.android.gms.common.api.internal.o o4 = cb.c.o(looper, z9Var, z9.class.getSimpleName());
        androidx.activity.n nVar = new androidx.activity.n(this, o4);
        d0 d0Var = new d0(nVar, locationRequest);
        bi.a aVar = new bi.a();
        aVar.a = true;
        aVar.c = d0Var;
        aVar.d = nVar;
        aVar.e = o4;
        aVar.b = 2436;
        return b(aVar.a());
    }
}
