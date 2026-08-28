package r7;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import g7.f7;
import g7.l7;
import g7.m7;
import org.telegram.messenger.BuildConfig;
import x5.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class e {
    public static boolean a = false;
    public static int b = 1;

    public static synchronized int a(Context context) {
        synchronized (e.class) {
            try {
                l.i(context, "Context is null");
                Log.d("e", "preferredRenderer: ".concat(BuildConfig.BETA_URL));
                if (a) {
                    return 0;
                }
                try {
                    s7.e a2 = l7.a(context);
                    try {
                        s7.a U0 = a2.U0();
                        l.h(U0);
                        f7.a = U0;
                        c7.e W0 = a2.W0();
                        if (m7.a == null) {
                            l.i(W0, "delegate must not be null");
                            m7.a = W0;
                        }
                        a = true;
                        try {
                            Parcel L0 = a2.L0(a2.M0(), 9);
                            int readInt = L0.readInt();
                            L0.recycle();
                            if (readInt == 2) {
                                b = 2;
                            }
                            h6.b bVar = new h6.b(context);
                            Parcel M0 = a2.M0();
                            c7.b.c(M0, bVar);
                            M0.writeInt(0);
                            a2.Q0(M0, 10);
                        } catch (RemoteException e10) {
                            Log.e("e", "Failed to retrieve renderer type or log initialization.", e10);
                        }
                        int i9 = b;
                        Log.d("e", "loadedRenderer: ".concat(i9 != 1 ? i9 != 2 ? BuildConfig.BETA_URL : "LATEST" : "LEGACY"));
                        return 0;
                    } catch (RemoteException e11) {
                        throw new androidx.car.app.j(e11);
                    }
                } catch (u5.f e12) {
                    return e12.a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
