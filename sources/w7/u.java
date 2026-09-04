package w7;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
