package z1;

import android.app.Notification;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat$Token;
import e0.b0;
import e0.i0;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class c extends b0 {
    public int[] e;
    public MediaSessionCompat$Token f;

    @Override // e0.b0
    public final void b(i0 i0Var) {
        Notification.Builder builder = (Notification.Builder) i0Var.c;
        if (Build.VERSION.SDK_INT >= 34) {
            a.d(builder, a.b(b.a(a.a(), null, 0, null, Boolean.FALSE), this.e, this.f));
        } else {
            a.d(builder, a.b(a.a(), this.e, this.f));
        }
    }
}
