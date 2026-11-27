// default package

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class wo6 extends Binder implements kk5 {
    public final WeakReference a;

    public wo6(yu6 yu6Var) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(yu6Var);
    }

    @Override // kk5
    public final void N(PlaybackStateCompat playbackStateCompat) {
        yu6 yu6Var = (yu6) this.a.get();
        if (yu6Var != null) {
            yu6Var.e(2, playbackStateCompat, null);
        }
    }

    @Override // kk5
    public final void g(int i) {
        yu6 yu6Var = (yu6) this.a.get();
        if (yu6Var != null) {
            yu6Var.e(9, Integer.valueOf(i), null);
        }
    }

    @Override // kk5
    public final void i(int i) {
        yu6 yu6Var = (yu6) this.a.get();
        if (yu6Var != null) {
            yu6Var.e(12, Integer.valueOf(i), null);
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
                Bundle bundle = (Bundle) roe.a(parcel, Bundle.CREATOR);
                yu6 yu6Var = (yu6) this.a.get();
                if (yu6Var != null) {
                    yu6Var.e(1, readString, bundle);
                }
                return true;
            case 2:
                lq5.f();
                return false;
            case 3:
                N((PlaybackStateCompat) roe.a(parcel, PlaybackStateCompat.CREATOR));
                return true;
            case 4:
                lq5.f();
                return false;
            case 5:
                parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR);
                lq5.f();
                return false;
            case 6:
                lq5.f();
                return false;
            case 7:
                lq5.f();
                return false;
            case 8:
                lq5.f();
                return false;
            case 9:
                g(parcel.readInt());
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                boolean z = parcel.readInt() != 0;
                yu6 yu6Var2 = (yu6) this.a.get();
                if (yu6Var2 != null) {
                    yu6Var2.e(11, Boolean.valueOf(z), null);
                }
                return true;
            case 12:
                i(parcel.readInt());
                return true;
            case 13:
                yu6 yu6Var3 = (yu6) this.a.get();
                if (yu6Var3 != null) {
                    yu6Var3.e(13, null, null);
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
