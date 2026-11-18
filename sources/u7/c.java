package u7;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.x9;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class c extends com.google.android.gms.common.api.j {
    public static final com.google.android.gms.common.api.e l = new com.google.android.gms.common.api.e("LocationServices.API", new a9.e(18), new com.google.android.gms.common.api.d());

    public Task f(LocationRequest locationRequest, x9 x9Var, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            q6.m.i(looper, "invalid null looper");
        }
        com.google.android.gms.common.api.internal.o o4 = d6.i.o(looper, x9Var, x9.class.getSimpleName());
        androidx.activity.n nVar = new androidx.activity.n(this, o4);
        tg.x xVar = new tg.x(1, nVar, locationRequest);
        com.google.android.gms.common.api.internal.p pVar = new com.google.android.gms.common.api.internal.p();
        pVar.b = true;
        pVar.c = xVar;
        pVar.d = nVar;
        pVar.e = o4;
        pVar.a = 2436;
        return b(pVar.a());
    }
}
