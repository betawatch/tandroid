package p4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import c8.hb;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
            hb.a(obtain, bundle);
            this.a.transact(3001, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
