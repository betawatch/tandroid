// default package

import android.app.Notification;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class tk7 {
    public static Notification.BubbleMetadata a(vk7 vk7Var) {
        PendingIntent pendingIntent;
        if (vk7Var == null || (pendingIntent = vk7Var.a) == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder builder = new Notification.BubbleMetadata.Builder();
        IconCompat iconCompat = vk7Var.b;
        iconCompat.getClass();
        Notification.BubbleMetadata.Builder suppressNotification = builder.setIcon(nke.a(iconCompat, null)).setIntent(pendingIntent).setDeleteIntent(null).setAutoExpandBubble((vk7Var.d & 1) != 0).setSuppressNotification((vk7Var.d & 2) != 0);
        int i = vk7Var.c;
        if (i != 0) {
            suppressNotification.setDesiredHeight(i);
        }
        return suppressNotification.build();
    }
}
