package z1;

import android.app.Notification;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat$Token;
import cc.f;
import e0.z;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c extends z {
    public int[] e;
    public MediaSessionCompat$Token f;

    @Override // e0.z
    public final void b(f fVar) {
        Notification.Builder builder = (Notification.Builder) fVar.d;
        if (Build.VERSION.SDK_INT >= 34) {
            a.d(builder, a.b(b.a(a.a(), null, 0, null, Boolean.FALSE), this.e, this.f));
        } else {
            a.d(builder, a.b(a.a(), this.e, this.f));
        }
    }
}
