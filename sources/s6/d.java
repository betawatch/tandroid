package s6;

import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.j;
import com.google.android.gms.tasks.Task;
import org.telegram.ui.Components.rt;
import q6.p;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class d extends j {
    public static final com.google.android.gms.common.api.e l = new com.google.android.gms.common.api.e("ClientNotification.API", new a9.e(15), new com.google.android.gms.common.api.d());
    public static final com.google.android.gms.common.api.e m = new com.google.android.gms.common.api.e("ClientTelemetry.API", new a9.e(16), new com.google.android.gms.common.api.d());

    public Task f(p pVar) {
        s b10 = t.b();
        b10.d = new n6.c[]{n7.b.a};
        b10.b = false;
        b10.c = new rt(pVar, 14);
        return e(2, b10.a());
    }
}
