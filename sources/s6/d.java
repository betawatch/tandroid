package s6;

import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.j;
import com.google.android.gms.tasks.Task;
import org.telegram.ui.Components.qt;
import q6.p;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class d extends j {
    public static final com.google.android.gms.common.api.e l = new com.google.android.gms.common.api.e("ClientNotification.API", new a9.e(15), new com.google.android.gms.common.api.d());
    public static final com.google.android.gms.common.api.e m = new com.google.android.gms.common.api.e("ClientTelemetry.API", new a9.e(16), new com.google.android.gms.common.api.d());

    public Task f(p pVar) {
        s b10 = t.b();
        b10.d = new n6.c[]{n7.b.a};
        b10.b = false;
        b10.c = new qt(pVar, 14);
        return e(2, b10.a());
    }
}
