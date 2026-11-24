// default package

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class so6 extends Binder implements hk5 {
    public final WeakReference a;

    public so6(tu6 tu6Var) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(tu6Var);
    }

    @Override // hk5
    public final void N(PlaybackStateCompat playbackStateCompat) {
        tu6 tu6Var = (tu6) this.a.get();
        if (tu6Var != null) {
            tu6Var.e(2, playbackStateCompat, null);
        }
    }

    @Override // hk5
    public final void g(int i) {
        tu6 tu6Var = (tu6) this.a.get();
        if (tu6Var != null) {
            tu6Var.e(9, Integer.valueOf(i), null);
        }
    }

    @Override // hk5
    public final void i(int i) {
        tu6 tu6Var = (tu6) this.a.get();
        if (tu6Var != null) {
            tu6Var.e(12, Integer.valueOf(i), null);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        switch (i) {
            case 1:
                String readString = parcel.readString();
                Bundle bundle = (Bundle) bme.a(parcel, Bundle.CREATOR);
                tu6 tu6Var = (tu6) this.a.get();
                if (tu6Var != null) {
                    tu6Var.e(1, readString, bundle);
                }
                return true;
            case 2:
                zo4.f();
                return false;
            case 3:
                N((PlaybackStateCompat) bme.a(parcel, PlaybackStateCompat.CREATOR));
                return true;
            case 4:
                zo4.f();
                return false;
            case 5:
                parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR);
                zo4.f();
                return false;
            case 6:
                zo4.f();
                return false;
            case 7:
                zo4.f();
                return false;
            case 8:
                zo4.f();
                return false;
            case 9:
                g(parcel.readInt());
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                boolean z = parcel.readInt() != 0;
                tu6 tu6Var2 = (tu6) this.a.get();
                if (tu6Var2 != null) {
                    tu6Var2.e(11, Boolean.valueOf(z), null);
                }
                return true;
            case 12:
                i(parcel.readInt());
                return true;
            case 13:
                tu6 tu6Var3 = (tu6) this.a.get();
                if (tu6Var3 != null) {
                    tu6Var3.e(13, null, null);
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
