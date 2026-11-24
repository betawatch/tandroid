// default package

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class wte {
    public static void a(ei5 ei5Var) {
        if (ei5Var != null) {
            try {
                di5 di5Var = (di5) ei5Var;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    obtain.writeInt(0);
                    di5Var.a.transact(3006, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            } catch (RemoteException unused) {
            }
        }
    }
}
