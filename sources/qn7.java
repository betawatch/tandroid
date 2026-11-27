// default package

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class qn7 extends fo7 {
    public IconCompat e;
    public IconCompat f;
    public boolean g;

    @Override // fo7
    public final void b(q31 q31Var) {
        Notification.Builder builder = (Notification.Builder) q31Var.c;
        Context context = (Context) q31Var.b;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(this.b);
        IconCompat iconCompat = this.e;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                pn7.a(bigContentTitle, jpe.a(iconCompat, context));
            } else if (iconCompat.i() == 1) {
                bigContentTitle = bigContentTitle.bigPicture(this.e.f());
            }
        }
        if (this.g) {
            IconCompat iconCompat2 = this.f;
            if (iconCompat2 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                on7.a(bigContentTitle, jpe.a(iconCompat2, context));
            }
        }
        if (this.d) {
            bigContentTitle.setSummaryText(this.c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            pn7.c(bigContentTitle, false);
            pn7.b(bigContentTitle, null);
        }
    }

    @Override // fo7
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
