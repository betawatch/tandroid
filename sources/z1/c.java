package z1;

import android.app.Notification;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat$Token;
import cc.f;
import e0.z;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
