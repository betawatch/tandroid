// default package

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class tk6 {
    public static boolean a = false;
    public static int b = 1;
    public static final sjf c = new sjf(16);

    public static synchronized int a(Context context) {
        synchronized (tk6.class) {
            xve.i(context, "Context is null");
            Log.d("tk6", "preferredRenderer: null");
            if (a) {
                return 0;
            }
            try {
                yxd a2 = m5f.a(context);
                try {
                    agd Z = a2.Z();
                    xve.h(Z);
                    xud.a = Z;
                    gme b0 = a2.b0();
                    if (usd.a == null) {
                        xve.i(b0, "delegate must not be null");
                        usd.a = b0;
                    }
                    a = true;
                    try {
                        Parcel Q = a2.Q(a2.R(), 9);
                        int readInt = Q.readInt();
                        Q.recycle();
                        if (readInt == 2) {
                            b = 2;
                        }
                        br7 br7Var = new br7(context);
                        Parcel R = a2.R();
                        jld.c(R, br7Var);
                        R.writeInt(0);
                        a2.V(R, 10);
                    } catch (RemoteException e) {
                        Log.e("tk6", "Failed to retrieve renderer type or log initialization.", e);
                    }
                    int i = b;
                    Log.d("tk6", "loadedRenderer: ".concat(i != 1 ? i != 2 ? "null" : "LATEST" : "LEGACY"));
                    return 0;
                } catch (RemoteException e2) {
                    throw new zp2(e2);
                }
            } catch (b15 e3) {
                return e3.a;
            }
        }
    }
}
