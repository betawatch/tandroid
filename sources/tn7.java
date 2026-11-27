// default package

import android.app.Notification;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
