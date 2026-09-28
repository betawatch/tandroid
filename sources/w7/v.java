package w7;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public abstract class v {
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
