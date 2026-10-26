package s7;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import m4.w1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
