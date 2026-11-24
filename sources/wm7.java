// default package

import android.app.Notification;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class wm7 {
    public static Notification.BubbleMetadata a(ym7 ym7Var) {
        PendingIntent pendingIntent;
        if (ym7Var == null || (pendingIntent = ym7Var.a) == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder builder = new Notification.BubbleMetadata.Builder();
        IconCompat iconCompat = ym7Var.b;
        iconCompat.getClass();
        Notification.BubbleMetadata.Builder suppressNotification = builder.setIcon(pme.a(iconCompat, null)).setIntent(pendingIntent).setDeleteIntent(null).setAutoExpandBubble((ym7Var.d & 1) != 0).setSuppressNotification((ym7Var.d & 2) != 0);
        int i = ym7Var.c;
        if (i != 0) {
            suppressNotification.setDesiredHeight(i);
        }
        return suppressNotification.build();
    }
}
