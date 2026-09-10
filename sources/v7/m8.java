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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class m8 {
    public static Context a;
    public static i8.e b;

    public static i8.e a(Context context) {
        i8.e eVar;
        n6.l.h(context);
        Log.d("m8", "preferredRenderer: ".concat(BuildConfig.BETA_URL));
        i8.e eVar2 = b;
        if (eVar2 != null) {
            return eVar2;
        }
        AtomicBoolean atomicBoolean = k6.g.a;
        int b10 = k6.g.b(context, 13400000);
        if (b10 != 0) {
            throw new k6.f(b10);
        }
        Log.i("m8", "Making Creator dynamically");
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
                } catch (RemoteException e) {
                    throw new androidx.car.app.j(e);
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
        } catch (Exception e) {
            try {
                if ("com.google.android.gms.maps_dynamite".equals("com.google.android.gms.maps_dynamite")) {
                    Log.e("m8", "Failed to load maps module, use pre-Chimera", e);
                    AtomicBoolean atomicBoolean = k6.g.a;
                    context2 = context.createPackageContext("com.google.android.gms", 3);
                } else {
                    try {
                        Log.d("m8", "Attempting to load maps_dynamite again.");
                        context2 = y6.e.c(context, y6.e.b, "com.google.android.gms.maps_dynamite").a;
                    } catch (Exception e7) {
                        Log.e("m8", "Failed to load maps module, use pre-Chimera", e7);
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
