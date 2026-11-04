package r6;

import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.j;
import com.google.android.gms.tasks.Task;
import org.telegram.ui.Components.i9;
import p6.p;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d extends j {
    public static final com.google.android.gms.common.api.e l = new com.google.android.gms.common.api.e("ClientNotification.API", new a6.b(13), new com.google.android.gms.common.api.d());
    public static final com.google.android.gms.common.api.e m = new com.google.android.gms.common.api.e("ClientTelemetry.API", new a6.b(14), new com.google.android.gms.common.api.d());

    public Task f(p pVar) {
        s b10 = t.b();
        b10.d = new m6.c[]{m7.b.a};
        b10.b = false;
        b10.c = new i9(pVar, 16);
        return e(2, b10.a());
    }
}
