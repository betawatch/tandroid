// default package

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class qm6 extends Binder implements hi5 {
    public final WeakReference a;

    public qm6() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(null);
    }

    @Override // hi5
    public final void g(int i) {
        if (this.a.get() == null) {
            return;
        }
        fyb.g();
    }

    @Override // hi5
    public final void i(int i) {
        if (this.a.get() == null) {
            return;
        }
        fyb.g();
    }

    @Override // hi5
    public final void j(dc8 dc8Var) {
        if (this.a.get() == null) {
            return;
        }
        fyb.g();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 3) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            j(parcel.readInt() != 0 ? dc8.CREATOR.createFromParcel(parcel) : null);
            return true;
        }
        if (i == 9) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            g(parcel.readInt());
            return true;
        }
        if (i == 1598968902) {
            parcel2.getClass();
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        WeakReference weakReference = this.a;
        switch (i) {
            case 11:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.readInt();
                if (weakReference.get() != null) {
                    fyb.g();
                    return false;
                }
                return true;
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                i(parcel.readInt());
                return true;
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (weakReference.get() != null) {
                    fyb.g();
                    return false;
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
