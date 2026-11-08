package q4;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class a implements b {
    public IBinder a;

    @Override // q4.b
    public final void S0(w wVar) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(1);
            wVar.writeToParcel(obtain, 0);
            if (!this.a.transact(3, obtain, null, 1)) {
                int i7 = e.b;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // q4.b
    public final void e(int i7) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i7);
            if (!this.a.transact(9, obtain, null, 1)) {
                int i10 = e.b;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // q4.b
    public final void j(int i7) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i7);
            if (!this.a.transact(12, obtain, null, 1)) {
                int i10 = e.b;
            }
        } finally {
            obtain.recycle();
        }
    }
}
