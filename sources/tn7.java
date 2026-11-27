// default package

import android.app.Notification;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class tn7 {
    public static Notification.BubbleMetadata a(un7 un7Var) {
        if (un7Var == null) {
            return null;
        }
        PendingIntent pendingIntent = un7Var.a;
        IconCompat iconCompat = un7Var.b;
        iconCompat.getClass();
        Notification.BubbleMetadata.Builder builder = new Notification.BubbleMetadata.Builder(pendingIntent, jpe.a(iconCompat, null));
        builder.setDeleteIntent(null).setAutoExpandBubble((un7Var.d & 1) != 0).setSuppressNotification((un7Var.d & 2) != 0);
        int i = un7Var.c;
        if (i != 0) {
            builder.setDesiredHeight(i);
        }
        return builder.build();
    }
}
