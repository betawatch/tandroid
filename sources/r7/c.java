package r7;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.aa;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c extends com.google.android.gms.common.api.j {
    public static final com.google.android.gms.common.api.e k = new com.google.android.gms.common.api.e("LocationServices.API", new a8.d(13), new com.google.android.gms.common.api.d());

    public Task f(LocationRequest locationRequest, aa aaVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            n6.l.h(looper, "invalid null looper");
        }
        com.google.android.gms.common.api.internal.p k10 = za.c.k(looper, aaVar, aa.class.getSimpleName());
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
