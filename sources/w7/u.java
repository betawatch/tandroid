package w7;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public abstract class u {
    public static void a(m4.i iVar) {
        try {
            m4.h hVar = (m4.h) iVar;
            Parcel obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(0);
                hVar.a.transact(3006, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException unused) {
        }
    }
}
