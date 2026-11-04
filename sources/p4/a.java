package p4;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a implements b {
    public IBinder a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // p4.b
    public final void c(int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i3);
            if (!this.a.transact(9, obtain, null, 1)) {
                int i10 = e.b;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // p4.b
    public final void i(int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i3);
            if (!this.a.transact(12, obtain, null, 1)) {
                int i10 = e.b;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // p4.b
    public final void u0(w wVar) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(1);
            wVar.writeToParcel(obtain, 0);
            if (!this.a.transact(3, obtain, null, 1)) {
                int i3 = e.b;
            }
        } finally {
            obtain.recycle();
        }
    }
}
