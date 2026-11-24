// default package

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qo6 extends Binder implements gk5 {
    public final WeakReference a;

    public qo6() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(null);
    }

    @Override // gk5
    public final void g(int i) {
        if (this.a.get() == null) {
            return;
        }
        rjb.p();
    }

    @Override // gk5
    public final void i(int i) {
        if (this.a.get() == null) {
            return;
        }
        rjb.p();
    }

    @Override // gk5
    public final void j(ge8 ge8Var) {
        if (this.a.get() == null) {
            return;
        }
        rjb.p();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 3) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            j(parcel.readInt() != 0 ? ge8.CREATOR.createFromParcel(parcel) : null);
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
                    rjb.p();
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
                    rjb.p();
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
