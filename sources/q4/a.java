package q4;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class a implements b {
    public IBinder a;

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

    @Override // q4.b
    public final void x0(w wVar) {
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
}
