package u7;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import m4.d0;
import org.telegram.messenger.z9;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
