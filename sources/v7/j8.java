package v7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class j8 {
    public static Context a;
    public static i8.e b;

    public static i8.e a(Context context) {
        i8.e eVar;
        n6.l.h(context);
        Log.d("j8", "preferredRenderer: ".concat(BuildConfig.BETA_URL));
        i8.e eVar2 = b;
        if (eVar2 != null) {
            return eVar2;
        }
        AtomicBoolean atomicBoolean = k6.g.a;
        int b10 = k6.g.b(context, 13400000);
        if (b10 != 0) {
            throw new k6.f(b10);
        }
        Log.i("j8", "Making Creator dynamically");
        ClassLoader classLoader = b(context).getClassLoader();
        try {
            n6.l.h(classLoader);
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl");
            try {
                IBinder iBinder = (IBinder) loadClass.newInstance();
                if (iBinder == null) {
                    eVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                    eVar = queryLocalInterface instanceof i8.e ? (i8.e) queryLocalInterface : new i8.e(iBinder, "com.google.android.gms.maps.internal.ICreator", 9);
                }
                b = eVar;
                try {
                    Context b11 = b(context);
                    b11.getClass();
                    x6.b bVar = new x6.b(b11.getResources());
                    Parcel O0 = eVar.O0();
                    s7.b.c(O0, bVar);
                    O0.writeInt(12451000);
                    eVar.S0(O0, 6);
                    return b;
                } catch (RemoteException e7) {
                    throw new androidx.car.app.j(e7);
                }
            } catch (IllegalAccessException unused) {
                throw new IllegalStateException("Unable to call the default constructor of ".concat(loadClass.getName()));
            } catch (InstantiationException unused2) {
                throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(loadClass.getName()));
            }
        } catch (ClassNotFoundException unused3) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl");
        }
    }

    public static Context b(Context context) {
        Context context2;
        Context context3 = a;
        if (context3 != null) {
            return context3;
        }
        context.getApplicationContext();
        try {
            context2 = y6.e.c(context, y6.e.b, "com.google.android.gms.maps_dynamite").a;
        } catch (Exception e7) {
            try {
                if ("com.google.android.gms.maps_dynamite".equals("com.google.android.gms.maps_dynamite")) {
                    Log.e("j8", "Failed to load maps module, use pre-Chimera", e7);
                    AtomicBoolean atomicBoolean = k6.g.a;
                    context2 = context.createPackageContext("com.google.android.gms", 3);
                } else {
                    try {
                        Log.d("j8", "Attempting to load maps_dynamite again.");
                        context2 = y6.e.c(context, y6.e.b, "com.google.android.gms.maps_dynamite").a;
                    } catch (Exception e10) {
                        Log.e("j8", "Failed to load maps module, use pre-Chimera", e10);
                        AtomicBoolean atomicBoolean2 = k6.g.a;
                        context2 = context.createPackageContext("com.google.android.gms", 3);
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                context2 = null;
            }
        }
        a = context2;
        return context2;
    }
}
