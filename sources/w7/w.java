package w7;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public abstract class w {
    public static void a(m4.l lVar) {
        if (lVar != null) {
            try {
                m4.k kVar = (m4.k) lVar;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    obtain.writeInt(0);
                    kVar.a.transact(3006, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            } catch (RemoteException unused) {
            }
        }
    }
}
