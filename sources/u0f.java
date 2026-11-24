// default package

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class u0f {
    public static Context a;
    public static itd b;

    public static itd a(Context context) {
        itd itdVar;
        fre.h(context);
        Log.d("u0f", "preferredRenderer: null");
        itd itdVar2 = b;
        if (itdVar2 != null) {
            return itdVar2;
        }
        int i = yy4.e;
        int c = yy4.c(context, 13400000);
        if (c != 0) {
            throw new xy4(c);
        }
        Log.i("u0f", "Making Creator dynamically");
        ClassLoader classLoader = b(context).getClassLoader();
        try {
            fre.h(classLoader);
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl");
            try {
                try {
                    IBinder iBinder = (IBinder) loadClass.newInstance();
                    if (iBinder == null) {
                        itdVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                        itdVar = queryLocalInterface instanceof itd ? (itd) queryLocalInterface : new itd(iBinder, "com.google.android.gms.maps.internal.ICreator", (byte) 6);
                    }
                    b = itdVar;
                    try {
                        Context b2 = b(context);
                        b2.getClass();
                        bo7 bo7Var = new bo7(b2.getResources());
                        Parcel R = itdVar.R();
                        sgd.c(R, bo7Var);
                        R.writeInt(12451000);
                        itdVar.V(R, 6);
                        return b;
                    } catch (RemoteException e) {
                        fvc.g(e);
                        return null;
                    }
                } catch (InstantiationException unused) {
                    throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(loadClass.getName()));
                }
            } catch (IllegalAccessException unused2) {
                throw new IllegalStateException("Unable to call the default constructor of ".concat(loadClass.getName()));
            }
        } catch (ClassNotFoundException unused3) {
            sc8.j("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl");
            return null;
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
            context2 = ds3.c(context, ds3.b, "com.google.android.gms.maps_dynamite").a;
        } catch (Exception e) {
            try {
                if ("com.google.android.gms.maps_dynamite".equals("com.google.android.gms.maps_dynamite")) {
                    Log.e("u0f", "Failed to load maps module, use pre-Chimera", e);
                    int i = yy4.e;
                    context2 = context.createPackageContext("com.google.android.gms", 3);
                } else {
                    try {
                        Log.d("u0f", "Attempting to load maps_dynamite again.");
                        context2 = ds3.c(context, ds3.b, "com.google.android.gms.maps_dynamite").a;
                    } catch (Exception e2) {
                        Log.e("u0f", "Failed to load maps module, use pre-Chimera", e2);
                        int i2 = yy4.e;
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
