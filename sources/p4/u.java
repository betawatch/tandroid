package p4;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.media.Rating;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.provider.Settings;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u {
    public static final Object b = new Object();
    public static volatile u c;
    public Object a;

    public static u a(Context context) {
        u uVar;
        synchronized (b) {
            try {
                if (c == null) {
                    Context applicationContext = context.getApplicationContext();
                    u uVar2 = new u();
                    m2.t tVar = new m2.t(19, false);
                    tVar.b = applicationContext;
                    tVar.c = applicationContext.getContentResolver();
                    uVar2.a = tVar;
                    c = uVar2;
                }
                uVar = c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }

    public boolean b(r rVar) {
        m2.t tVar = (m2.t) this.a;
        t tVar2 = rVar.a;
        Context context = (Context) tVar.b;
        int i3 = tVar2.c;
        String str = tVar2.a;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 == 23 && str.equals("android.media.session.MediaController")) {
                return true;
            }
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
            if (applicationInfo != null) {
                if (i10 < 28) {
                    i3 = applicationInfo.uid;
                }
                if (i3 == 1000 || i3 == Process.myUid() || context.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", tVar2.b, tVar2.c) == 0 || tVar.w0(tVar2, "android.permission.STATUS_BAR_SERVICE") || tVar.w0(tVar2, "android.permission.MEDIA_CONTENT_CONTROL")) {
                    return true;
                }
                String string = Settings.Secure.getString((ContentResolver) tVar.c, "enabled_notification_listeners");
                if (string != null) {
                    for (String str2 : string.split(":")) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str2);
                        if (unflattenFromString != null && unflattenFromString.getPackageName().equals(str)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            g2.a.b("MediaSessionManager", "Package " + str + " doesn't exist");
            return false;
        }
    }

    public void c(String str, Bitmap bitmap) {
        Integer num = (Integer) i.c.get(str);
        if (num != null && num.intValue() != 2) {
            throw new IllegalArgumentException(a1.g.q("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.a).putParcelable(str, bitmap);
    }

    public void d(long j10, String str) {
        Integer num = (Integer) i.c.get(str);
        if (num != null && num.intValue() != 0) {
            throw new IllegalArgumentException(a1.g.q("The ", str, " key cannot be used to put a long"));
        }
        ((Bundle) this.a).putLong(str, j10);
    }

    public void e(String str, x xVar) {
        Rating rating;
        float f10 = xVar.b;
        int i3 = xVar.a;
        Integer num = (Integer) i.c.get(str);
        if (num != null && num.intValue() != 3) {
            throw new IllegalArgumentException(a1.g.q("The ", str, " key cannot be used to put a Rating"));
        }
        Bundle bundle = (Bundle) this.a;
        if (xVar.c == null) {
            if (xVar.b()) {
                switch (i3) {
                    case 1:
                        xVar.c = Rating.newHeartRating(i3 == 1 && f10 == 1.0f);
                        break;
                    case 2:
                        xVar.c = Rating.newThumbRating(i3 == 2 && f10 == 1.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        xVar.c = Rating.newStarRating(i3, xVar.a());
                        break;
                    case 6:
                        if (i3 != 6 || !xVar.b()) {
                            f10 = -1.0f;
                        }
                        xVar.c = Rating.newPercentageRating(f10);
                        break;
                    default:
                        rating = null;
                        break;
                }
                bundle.putParcelable(str, rating);
            }
            xVar.c = Rating.newUnratedRating(i3);
        }
        rating = xVar.c;
        bundle.putParcelable(str, rating);
    }

    public void f(String str, String str2) {
        Integer num = (Integer) i.c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a1.g.q("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.a).putCharSequence(str, str2);
    }

    public void g(CharSequence charSequence, String str) {
        Integer num = (Integer) i.c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a1.g.q("The ", str, " key cannot be used to put a CharSequence"));
        }
        ((Bundle) this.a).putCharSequence(str, charSequence);
    }
}
