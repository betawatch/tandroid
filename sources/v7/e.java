package v7;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import b6.m;
import k7.g8;
import k7.k8;
import k7.o8;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class e {
    public static boolean a = false;
    public static int b = 1;

    public static synchronized int a(Context context) {
        synchronized (e.class) {
            try {
                m.i(context, "Context is null");
                Log.d("e", "preferredRenderer: ".concat(BuildConfig.BETA_URL));
                if (a) {
                    return 0;
                }
                try {
                    w7.e a2 = k8.a(context);
                    try {
                        w7.a U0 = a2.U0();
                        m.h(U0);
                        g8.a = U0;
                        g7.e W0 = a2.W0();
                        if (o8.a == null) {
                            m.i(W0, "delegate must not be null");
                            o8.a = W0;
                        }
                        a = true;
                        try {
                            Parcel L0 = a2.L0(a2.M0(), 9);
                            int readInt = L0.readInt();
                            L0.recycle();
                            if (readInt == 2) {
                                b = 2;
                            }
                            l6.b bVar = new l6.b(context);
                            Parcel M0 = a2.M0();
                            g7.b.c(M0, bVar);
                            M0.writeInt(0);
                            a2.Q0(M0, 10);
                        } catch (RemoteException e6) {
                            Log.e("e", "Failed to retrieve renderer type or log initialization.", e6);
                        }
                        int i10 = b;
                        Log.d("e", "loadedRenderer: ".concat(i10 != 1 ? i10 != 2 ? BuildConfig.BETA_URL : "LATEST" : "LEGACY"));
                        return 0;
                    } catch (RemoteException e10) {
                        throw new a7.b(e10);
                    }
                } catch (y5.f e11) {
                    return e11.a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
