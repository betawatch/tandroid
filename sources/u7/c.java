package u7;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.y9;
import tg.y;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class c extends com.google.android.gms.common.api.j {
    public static final com.google.android.gms.common.api.e l = new com.google.android.gms.common.api.e("LocationServices.API", new a9.e(18), new com.google.android.gms.common.api.d());

    public Task f(LocationRequest locationRequest, y9 y9Var, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            q6.m.i(looper, "invalid null looper");
        }
        com.google.android.gms.common.api.internal.o o4 = d6.i.o(looper, y9Var, y9.class.getSimpleName());
        androidx.activity.n nVar = new androidx.activity.n(this, o4);
        y yVar = new y(1, nVar, locationRequest);
        com.google.android.gms.common.api.internal.p pVar = new com.google.android.gms.common.api.internal.p();
        pVar.b = true;
        pVar.c = yVar;
        pVar.d = nVar;
        pVar.e = o4;
        pVar.a = 2436;
        return b(pVar.a());
    }
}
