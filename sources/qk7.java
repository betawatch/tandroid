// default package

import android.app.Notification;
import android.graphics.drawable.Icon;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class qk7 {
    public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }

    public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        bigPictureStyle.setContentDescription(charSequence);
    }

    public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z) {
        bigPictureStyle.showBigPictureWhenCollapsed(z);
    }
}
