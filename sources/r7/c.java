package r7;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.ba;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class c extends com.google.android.gms.common.api.j {
    public static final com.google.android.gms.common.api.e k = new com.google.android.gms.common.api.e("LocationServices.API", new a8.d(13), new com.google.android.gms.common.api.d());

    public Task f(LocationRequest locationRequest, ba baVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            n6.l.h(looper, "invalid null looper");
        }
        com.google.android.gms.common.api.internal.p k10 = za.c.k(looper, baVar, ba.class.getSimpleName());
        androidx.activity.o oVar = new androidx.activity.o(this, k10);
        m4.c cVar = new m4.c(oVar, locationRequest, false, 24);
        com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r();
        rVar.b = true;
        rVar.c = cVar;
        rVar.d = oVar;
        rVar.e = k10;
        rVar.a = 2436;
        return b(rVar.a());
    }
}
