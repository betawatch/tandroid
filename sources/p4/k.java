package p4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import c8.ab;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class k implements l {
    public IBinder a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    public final void h1(int i7, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            ab.a(obtain, bundle);
            this.a.transact(3001, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
