// default package

import android.app.Notification;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class sn7 {
    public static Notification.BubbleMetadata a(un7 un7Var) {
        PendingIntent pendingIntent;
        if (un7Var == null || (pendingIntent = un7Var.a) == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder builder = new Notification.BubbleMetadata.Builder();
        IconCompat iconCompat = un7Var.b;
        iconCompat.getClass();
        Notification.BubbleMetadata.Builder suppressNotification = builder.setIcon(jpe.a(iconCompat, null)).setIntent(pendingIntent).setDeleteIntent(null).setAutoExpandBubble((un7Var.d & 1) != 0).setSuppressNotification((un7Var.d & 2) != 0);
        int i = un7Var.c;
        if (i != 0) {
            suppressNotification.setDesiredHeight(i);
        }
        return suppressNotification.build();
    }
}
