// default package

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class sm6 extends Binder implements ii5 {
    public final WeakReference a;

    public sm6(ts6 ts6Var) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(ts6Var);
    }

    @Override // ii5
    public final void N(PlaybackStateCompat playbackStateCompat) {
        ts6 ts6Var = (ts6) this.a.get();
        if (ts6Var != null) {
            ts6Var.e(2, playbackStateCompat, null);
        }
    }

    @Override // ii5
    public final void g(int i) {
        ts6 ts6Var = (ts6) this.a.get();
        if (ts6Var != null) {
            ts6Var.e(9, Integer.valueOf(i), null);
        }
    }

    @Override // ii5
    public final void i(int i) {
        ts6 ts6Var = (ts6) this.a.get();
        if (ts6Var != null) {
            ts6Var.e(12, Integer.valueOf(i), null);
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
                Bundle bundle = (Bundle) zje.a(parcel, Bundle.CREATOR);
                ts6 ts6Var = (ts6) this.a.get();
                if (ts6Var != null) {
                    ts6Var.e(1, readString, bundle);
                }
                return true;
            case 2:
                wn4.f();
                return false;
            case 3:
                N((PlaybackStateCompat) zje.a(parcel, PlaybackStateCompat.CREATOR));
                return true;
            case 4:
                wn4.f();
                return false;
            case 5:
                parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR);
                wn4.f();
                return false;
            case 6:
                wn4.f();
                return false;
            case 7:
                wn4.f();
                return false;
            case 8:
                wn4.f();
                return false;
            case 9:
                g(parcel.readInt());
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                boolean z = parcel.readInt() != 0;
                ts6 ts6Var2 = (ts6) this.a.get();
                if (ts6Var2 != null) {
                    ts6Var2.e(11, Boolean.valueOf(z), null);
                }
                return true;
            case 12:
                i(parcel.readInt());
                return true;
            case 13:
                ts6 ts6Var3 = (ts6) this.a.get();
                if (ts6Var3 != null) {
                    ts6Var3.e(13, null, null);
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
