// default package

import android.app.Notification;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class yk7 extends gl7 {
    public int[] e;
    public MediaSessionCompat$Token f;

    @Override // gl7
    public final void b(h31 h31Var) {
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) h31Var.c;
        if (i >= 34) {
            nk7.d(builder, nk7.b(ok7.a(nk7.a(), null, 0, null, Boolean.FALSE), this.e, this.f));
        } else {
            nk7.d(builder, nk7.b(nk7.a(), this.e, this.f));
        }
    }
}
