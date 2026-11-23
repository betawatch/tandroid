package s6;

import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.j;
import com.google.android.gms.tasks.Task;
import org.telegram.ui.Components.qf;
import q6.p;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class d extends j {
    public static final com.google.android.gms.common.api.e l = new com.google.android.gms.common.api.e("ClientNotification.API", new a9.e(15), new com.google.android.gms.common.api.d());
    public static final com.google.android.gms.common.api.e m = new com.google.android.gms.common.api.e("ClientTelemetry.API", new a9.e(16), new com.google.android.gms.common.api.d());

    public Task f(p pVar) {
        t b10 = u.b();
        b10.d = new n6.c[]{n7.b.a};
        b10.b = false;
        b10.c = new qf(pVar, 17);
        return e(2, b10.a());
    }
}
