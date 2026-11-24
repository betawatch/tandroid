// default package

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class rk7 extends gl7 {
    public IconCompat e;
    public IconCompat f;
    public boolean g;

    @Override // gl7
    public final void b(h31 h31Var) {
        Notification.Builder builder = (Notification.Builder) h31Var.c;
        Context context = (Context) h31Var.b;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(this.b);
        IconCompat iconCompat = this.e;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                qk7.a(bigContentTitle, nke.a(iconCompat, context));
            } else if (iconCompat.i() == 1) {
                bigContentTitle = bigContentTitle.bigPicture(this.e.f());
            }
        }
        if (this.g) {
            IconCompat iconCompat2 = this.f;
            if (iconCompat2 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                pk7.a(bigContentTitle, nke.a(iconCompat2, context));
            }
        }
        if (this.d) {
            bigContentTitle.setSummaryText(this.c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            qk7.c(bigContentTitle, false);
            qk7.b(bigContentTitle, null);
        }
    }

    @Override // gl7
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
