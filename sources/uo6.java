// default package

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class uo6 extends Binder implements jk5 {
    public final WeakReference a;

    public uo6() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(null);
    }

    @Override // jk5
    public final void g(int i) {
        if (this.a.get() == null) {
            return;
        }
        grb.o();
    }

    @Override // jk5
    public final void i(int i) {
        if (this.a.get() == null) {
            return;
        }
        grb.o();
    }

    @Override // jk5
    public final void j(sf8 sf8Var) {
        if (this.a.get() == null) {
            return;
        }
        grb.o();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 3) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            j(parcel.readInt() != 0 ? sf8.CREATOR.createFromParcel(parcel) : null);
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
                    grb.o();
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
                    grb.o();
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
