package t7;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import mi.h0;
import org.telegram.messenger.t9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c extends com.google.android.gms.common.api.j {
    public static final com.google.android.gms.common.api.e l = new com.google.android.gms.common.api.e("LocationServices.API", new a6.b(16), new com.google.android.gms.common.api.d());

    public Task f(LocationRequest locationRequest, t9 t9Var, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            p6.m.h(looper, "invalid null looper");
        }
        com.google.android.gms.common.api.internal.o x10 = c6.i.x(looper, t9Var, t9.class.getSimpleName());
        androidx.activity.n nVar = new androidx.activity.n(this, x10);
        h0 h0Var = new h0(nVar, locationRequest, false, 22);
        ci.a aVar = new ci.a();
        aVar.a = true;
        aVar.c = h0Var;
        aVar.d = nVar;
        aVar.e = x10;
        aVar.b = 2436;
        return b(aVar.a());
    }
}
