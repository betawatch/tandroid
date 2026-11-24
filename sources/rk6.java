// default package

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class rk6 {
    public static boolean a = false;
    public static int b = 1;
    public static final dhf c = new dhf(16);

    public static synchronized int a(Context context) {
        synchronized (rk6.class) {
            ite.i(context, "Context is null");
            Log.d("rk6", "preferredRenderer: null");
            if (a) {
                return 0;
            }
            try {
                lvd a2 = w2f.a(context);
                try {
                    jdd Z = a2.Z();
                    ite.h(Z);
                    ksd.a = Z;
                    qje b0 = a2.b0();
                    if (hqd.a == null) {
                        ite.i(b0, "delegate must not be null");
                        hqd.a = b0;
                    }
                    a = true;
                    try {
                        Parcel Q = a2.Q(a2.R(), 9);
                        int readInt = Q.readInt();
                        Q.recycle();
                        if (readInt == 2) {
                            b = 2;
                        }
                        eq7 eq7Var = new eq7(context);
                        Parcel R = a2.R();
                        tid.c(R, eq7Var);
                        R.writeInt(0);
                        a2.V(R, 10);
                    } catch (RemoteException e) {
                        Log.e("rk6", "Failed to retrieve renderer type or log initialization.", e);
                    }
                    int i = b;
                    Log.d("rk6", "loadedRenderer: ".concat(i != 1 ? i != 2 ? "null" : "LATEST" : "LEGACY"));
                    return 0;
                } catch (RemoteException e2) {
                    throw new rq2(e2);
                }
            } catch (w05 e3) {
                return e3.a;
            }
        }
    }
}
