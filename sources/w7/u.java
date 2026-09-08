package w7;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
