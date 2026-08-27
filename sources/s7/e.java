package s7;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import h7.g7;
import h7.l7;
import h7.r7;
import org.telegram.messenger.BuildConfig;
import y5.l;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                    t7.e a2 = l7.a(context);
                    try {
                        t7.a U0 = a2.U0();
                        l.h(U0);
                        g7.a = U0;
                        d7.e W0 = a2.W0();
                        if (r7.a == null) {
                            l.i(W0, "delegate must not be null");
                            r7.a = W0;
                        }
                        a = true;
                        try {
                            Parcel L0 = a2.L0(a2.M0(), 9);
                            int readInt = L0.readInt();
                            L0.recycle();
                            if (readInt == 2) {
                                b = 2;
                            }
                            i6.b bVar = new i6.b(context);
                            Parcel M0 = a2.M0();
                            d7.b.c(M0, bVar);
                            M0.writeInt(0);
                            a2.Q0(M0, 10);
                        } catch (RemoteException e9) {
                            Log.e("e", "Failed to retrieve renderer type or log initialization.", e9);
                        }
                        int i10 = b;
                        Log.d("e", "loadedRenderer: ".concat(i10 != 1 ? i10 != 2 ? BuildConfig.BETA_URL : "LATEST" : "LEGACY"));
                        return 0;
                    } catch (RemoteException e10) {
                        throw new a7.c(e10);
                    }
                } catch (v5.f e11) {
                    return e11.a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
