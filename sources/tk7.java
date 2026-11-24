// default package

import android.app.Notification;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
