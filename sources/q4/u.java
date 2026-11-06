package q4;

import a8.p0;
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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
                    j2.n nVar = new j2.n(25, false);
                    nVar.b = applicationContext;
                    nVar.c = applicationContext.getContentResolver();
                    uVar2.a = nVar;
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
        j2.n nVar = (j2.n) this.a;
        t tVar = rVar.a;
        Context context = (Context) nVar.b;
        int i7 = tVar.c;
        String str = tVar.a;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 == 23 && str.equals("android.media.session.MediaController")) {
                return true;
            }
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
            if (applicationInfo != null) {
                if (i10 < 28) {
                    i7 = applicationInfo.uid;
                }
                if (i7 == 1000 || i7 == Process.myUid() || context.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", tVar.b, tVar.c) == 0 || nVar.h0(tVar, "android.permission.STATUS_BAR_SERVICE") || nVar.h0(tVar, "android.permission.MEDIA_CONTENT_CONTROL")) {
                    return true;
                }
                String string = Settings.Secure.getString((ContentResolver) nVar.c, "enabled_notification_listeners");
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
            h2.a.b("MediaSessionManager", "Package " + str + " doesn't exist");
            return false;
        }
    }

    public void c(String str, Bitmap bitmap) {
        Integer num = (Integer) i.c.get(str);
        if (num != null && num.intValue() != 2) {
            throw new IllegalArgumentException(p0.p("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.a).putParcelable(str, bitmap);
    }

    public void d(long j3, String str) {
        Integer num = (Integer) i.c.get(str);
        if (num != null && num.intValue() != 0) {
            throw new IllegalArgumentException(p0.p("The ", str, " key cannot be used to put a long"));
        }
        ((Bundle) this.a).putLong(str, j3);
    }

    public void e(String str, y yVar) {
        Rating rating;
        float f10 = yVar.b;
        int i7 = yVar.a;
        Integer num = (Integer) i.c.get(str);
        if (num != null && num.intValue() != 3) {
            throw new IllegalArgumentException(p0.p("The ", str, " key cannot be used to put a Rating"));
        }
        Bundle bundle = (Bundle) this.a;
        if (yVar.c == null) {
            if (yVar.b()) {
                switch (i7) {
                    case 1:
                        yVar.c = Rating.newHeartRating(i7 == 1 && f10 == 1.0f);
                        break;
                    case 2:
                        yVar.c = Rating.newThumbRating(i7 == 2 && f10 == 1.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        yVar.c = Rating.newStarRating(i7, yVar.a());
                        break;
                    case 6:
                        if (i7 != 6 || !yVar.b()) {
                            f10 = -1.0f;
                        }
                        yVar.c = Rating.newPercentageRating(f10);
                        break;
                    default:
                        rating = null;
                        break;
                }
                bundle.putParcelable(str, rating);
            }
            yVar.c = Rating.newUnratedRating(i7);
        }
        rating = yVar.c;
        bundle.putParcelable(str, rating);
    }

    public void f(String str, String str2) {
        Integer num = (Integer) i.c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(p0.p("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.a).putCharSequence(str, str2);
    }

    public void g(CharSequence charSequence, String str) {
        Integer num = (Integer) i.c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(p0.p("The ", str, " key cannot be used to put a CharSequence"));
        }
        ((Bundle) this.a).putCharSequence(str, charSequence);
    }
}
