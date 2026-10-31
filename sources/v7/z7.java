package v7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class z7 {
    public static Context a;
    public static i8.e b;

    public static i8.e a(Context context) {
        i8.e eVar;
        n6.l.g(context);
        Log.d("z7", "preferredRenderer: ".concat("null"));
        i8.e eVar2 = b;
        if (eVar2 != null) {
            return eVar2;
        }
        AtomicBoolean atomicBoolean = k6.g.a;
        int b10 = k6.g.b(context, 13400000);
        if (b10 != 0) {
            throw new k6.f(b10);
        }
        Log.i("z7", "Making Creator dynamically");
        ClassLoader classLoader = b(context).getClassLoader();
        try {
            n6.l.g(classLoader);
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl");
            try {
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
                        Parcel P0 = eVar.P0();
                        s7.b.c(P0, bVar);
                        P0.writeInt(12451000);
                        eVar.T0(P0, 6);
                        return b;
                    } catch (RemoteException e) {
                        throw new ad.d(e);
                    }
                } catch (InstantiationException unused) {
                    throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(loadClass.getName()));
                }
            } catch (IllegalAccessException unused2) {
                throw new IllegalStateException("Unable to call the default constructor of ".concat(loadClass.getName()));
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
                    Log.e("z7", "Failed to load maps module, use pre-Chimera", e);
                    AtomicBoolean atomicBoolean = k6.g.a;
                    context2 = context.createPackageContext("com.google.android.gms", 3);
                } else {
                    try {
                        Log.d("z7", "Attempting to load maps_dynamite again.");
                        context2 = y6.e.c(context, y6.e.b, "com.google.android.gms.maps_dynamite").a;
                    } catch (Exception e7) {
                        Log.e("z7", "Failed to load maps module, use pre-Chimera", e7);
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
