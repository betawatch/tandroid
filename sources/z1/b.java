package z1;

import android.app.Notification;
import android.app.PendingIntent;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public abstract class b {
    public static Notification.MediaStyle a(Notification.MediaStyle mediaStyle, CharSequence charSequence, int i10, PendingIntent pendingIntent, Boolean bool) {
        if (bool.booleanValue()) {
            mediaStyle.setRemotePlaybackInfo(charSequence, i10, pendingIntent);
        }
        return mediaStyle;
    }
}
