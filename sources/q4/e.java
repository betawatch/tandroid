package q4;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class e extends Binder implements b {
    public static final /* synthetic */ int b = 0;
    public final WeakReference a;

    public e() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(null);
    }

    @Override // q4.b
    public final void S0(w wVar) {
        if (this.a.get() != null) {
            throw new ClassCastException();
        }
    }

    @Override // q4.b
    public final void e(int i7) {
        if (this.a.get() != null) {
            throw new ClassCastException();
        }
    }

    @Override // q4.b
    public final void j(int i7) {
        if (this.a.get() != null) {
            throw new ClassCastException();
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        if (i7 == 3) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            S0(parcel.readInt() != 0 ? w.CREATOR.createFromParcel(parcel) : null);
            return true;
        }
        if (i7 == 9) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            e(parcel.readInt());
            return true;
        }
        if (i7 == 1598968902) {
            parcel2.getClass();
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        WeakReference weakReference = this.a;
        switch (i7) {
            case 11:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.readInt();
                if (weakReference.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                j(parcel.readInt());
                return true;
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (weakReference.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            default:
                return super.onTransact(i7, parcel, parcel2, i10);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
