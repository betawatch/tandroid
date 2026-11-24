// default package

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class um7 extends jn7 {
    public IconCompat e;
    public IconCompat f;
    public boolean g;

    @Override // jn7
    public final void b(p41 p41Var) {
        Notification.Builder builder = (Notification.Builder) p41Var.c;
        Context context = (Context) p41Var.b;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(this.b);
        IconCompat iconCompat = this.e;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                tm7.a(bigContentTitle, pme.a(iconCompat, context));
            } else if (iconCompat.i() == 1) {
                bigContentTitle = bigContentTitle.bigPicture(this.e.f());
            }
        }
        if (this.g) {
            IconCompat iconCompat2 = this.f;
            if (iconCompat2 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                sm7.a(bigContentTitle, pme.a(iconCompat2, context));
            }
        }
        if (this.d) {
            bigContentTitle.setSummaryText(this.c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            tm7.c(bigContentTitle, false);
            tm7.b(bigContentTitle, null);
        }
    }

    @Override // jn7
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
