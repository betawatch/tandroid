// default package

import android.app.Notification;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vm7 extends jn7 {
    public final /* synthetic */ byte e;
    public Object f;

    public vm7(byte b) {
        this.e = b;
        switch (b) {
            case 1:
                this.f = new ArrayList();
                break;
        }
    }

    @Override // jn7
    public final void b(p41 p41Var) {
        switch (this.e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) p41Var.c).setBigContentTitle(this.b).bigText((CharSequence) this.f);
                if (this.d) {
                    bigText.setSummaryText(this.c);
                    break;
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) p41Var.c).setBigContentTitle(this.b);
                if (this.d) {
                    bigContentTitle.setSummaryText(this.c);
                }
                ArrayList arrayList = (ArrayList) this.f;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    bigContentTitle.addLine((CharSequence) obj);
                }
                break;
        }
    }

    @Override // jn7
    public final String c() {
        switch (this.e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    public final void d(String str) {
        if (str != null) {
            ((ArrayList) this.f).add(an7.c(str));
        }
    }

    public final void e(String str) {
        this.f = an7.c(str);
    }

    public final void f(String str) {
        this.b = an7.c(str);
    }

    public final void g(String str) {
        this.c = an7.c(str);
        this.d = true;
    }
}
