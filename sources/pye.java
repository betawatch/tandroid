// default package

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class pye {
    public static void a(gk5 gk5Var) {
        if (gk5Var != null) {
            try {
                fk5 fk5Var = (fk5) gk5Var;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    obtain.writeInt(0);
                    fk5Var.a.transact(3006, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            } catch (RemoteException unused) {
            }
        }
    }
}
