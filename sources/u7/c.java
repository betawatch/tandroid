package u7;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.y9;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class c extends com.google.android.gms.common.api.j {
    public static final com.google.android.gms.common.api.e l = new com.google.android.gms.common.api.e("LocationServices.API", new a9.e(18), new com.google.android.gms.common.api.d());

    public Task f(LocationRequest locationRequest, y9 y9Var, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            q6.m.h(looper, "invalid null looper");
        }
        com.google.android.gms.common.api.internal.o h = cb.c.h(looper, y9Var, y9.class.getSimpleName());
        androidx.activity.n nVar = new androidx.activity.n(this, h);
        tg.x xVar = new tg.x(1, nVar, locationRequest);
        com.google.android.gms.common.api.internal.p pVar = new com.google.android.gms.common.api.internal.p();
        pVar.b = true;
        pVar.c = xVar;
        pVar.d = nVar;
        pVar.e = h;
        pVar.a = 2436;
        return b(pVar.a());
    }
}
