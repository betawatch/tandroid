// default package

import android.app.Notification;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class xm7 {
    public static Notification.BubbleMetadata a(ym7 ym7Var) {
        if (ym7Var == null) {
            return null;
        }
        PendingIntent pendingIntent = ym7Var.a;
        IconCompat iconCompat = ym7Var.b;
        iconCompat.getClass();
        Notification.BubbleMetadata.Builder builder = new Notification.BubbleMetadata.Builder(pendingIntent, pme.a(iconCompat, null));
        builder.setDeleteIntent(null).setAutoExpandBubble((ym7Var.d & 1) != 0).setSuppressNotification((ym7Var.d & 2) != 0);
        int i = ym7Var.c;
        if (i != 0) {
            builder.setDesiredHeight(i);
        }
        return builder.build();
    }
}
