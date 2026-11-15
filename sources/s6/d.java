package s6;

import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.j;
import com.google.android.gms.tasks.Task;
import org.telegram.ui.Components.ff;
import q6.p;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class d extends j {
    public static final com.google.android.gms.common.api.e l = new com.google.android.gms.common.api.e("ClientNotification.API", new a9.e(15), new com.google.android.gms.common.api.d());
    public static final com.google.android.gms.common.api.e m = new com.google.android.gms.common.api.e("ClientTelemetry.API", new a9.e(16), new com.google.android.gms.common.api.d());

    public Task f(p pVar) {
        t b10 = u.b();
        b10.d = new n6.c[]{n7.b.a};
        b10.b = false;
        b10.c = new ff(pVar, 16);
        return e(2, b10.a());
    }
}
