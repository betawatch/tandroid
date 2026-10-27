package s7;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import m4.w1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c extends com.google.android.gms.common.api.j implements h8.a, h8.i {
    public static final com.google.android.gms.common.api.e k = new com.google.android.gms.common.api.e("LocationServices.API", new b8.d(13), new com.google.android.gms.common.api.d());

    public Task f(LocationRequest locationRequest, h8.c cVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            o6.l.i(looper, "invalid null looper");
        }
        com.google.android.gms.common.api.internal.p l4 = za.c.l(looper, cVar, h8.c.class.getSimpleName());
        androidx.activity.n nVar = new androidx.activity.n();
        nVar.c = this;
        nVar.a = true;
        nVar.b = l4;
        w1 w1Var = new w1(20, nVar, locationRequest);
        bi.a aVar = new bi.a();
        aVar.a = true;
        aVar.c = w1Var;
        aVar.d = nVar;
        aVar.e = l4;
        aVar.b = 2436;
        return b(aVar.a());
    }
}
