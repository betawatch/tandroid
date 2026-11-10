package p4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import c8.ya;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
            ya.a(obtain, bundle);
            this.a.transact(3001, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
