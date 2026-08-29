package t7;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import i7.e8;
import i7.h8;
import i7.u7;
import org.telegram.messenger.BuildConfig;
import z5.l;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                    u7.e a2 = e8.a(context);
                    try {
                        u7.a U0 = a2.U0();
                        l.h(U0);
                        u7.a = U0;
                        e7.e W0 = a2.W0();
                        if (h8.a == null) {
                            l.i(W0, "delegate must not be null");
                            h8.a = W0;
                        }
                        a = true;
                        try {
                            Parcel L0 = a2.L0(a2.M0(), 9);
                            int readInt = L0.readInt();
                            L0.recycle();
                            if (readInt == 2) {
                                b = 2;
                            }
                            j6.b bVar = new j6.b(context);
                            Parcel M0 = a2.M0();
                            e7.b.c(M0, bVar);
                            M0.writeInt(0);
                            a2.Q0(M0, 10);
                        } catch (RemoteException e10) {
                            Log.e("e", "Failed to retrieve renderer type or log initialization.", e10);
                        }
                        int i10 = b;
                        Log.d("e", "loadedRenderer: ".concat(i10 != 1 ? i10 != 2 ? BuildConfig.BETA_URL : "LATEST" : "LEGACY"));
                        return 0;
                    } catch (RemoteException e11) {
                        throw new a6.b(e11);
                    }
                } catch (w5.f e12) {
                    return e12.a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
