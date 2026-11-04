package p4;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e extends Binder implements b {
    public static final /* synthetic */ int b = 0;
    public final WeakReference a;

    public e() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(null);
    }

    @Override // p4.b
    public final void c(int i3) {
        if (this.a.get() != null) {
            throw new ClassCastException();
        }
    }

    @Override // p4.b
    public final void i(int i3) {
        if (this.a.get() != null) {
            throw new ClassCastException();
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i10) {
        if (i3 == 3) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            u0(parcel.readInt() != 0 ? w.CREATOR.createFromParcel(parcel) : null);
            return true;
        }
        if (i3 == 9) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            c(parcel.readInt());
            return true;
        }
        if (i3 == 1598968902) {
            parcel2.getClass();
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        WeakReference weakReference = this.a;
        switch (i3) {
            case 11:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.readInt();
                if (weakReference.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                i(parcel.readInt());
                return true;
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (weakReference.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            default:
                return super.onTransact(i3, parcel, parcel2, i10);
        }
    }

    @Override // p4.b
    public final void u0(w wVar) {
        if (this.a.get() != null) {
            throw new ClassCastException();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
