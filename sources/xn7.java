// default package

import android.app.Notification;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class xn7 extends fo7 {
    public int[] e;
    public MediaSessionCompat$Token f;

    @Override // fo7
    public final void b(q31 q31Var) {
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) q31Var.c;
        if (i >= 34) {
            mn7.d(builder, mn7.b(nn7.a(mn7.a(), null, 0, null, Boolean.FALSE), this.e, this.f));
        } else {
            mn7.d(builder, mn7.b(mn7.a(), this.e, this.f));
        }
    }
}
