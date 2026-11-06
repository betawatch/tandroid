package zf;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class b extends Binder implements IInterface {
    public final Handler a;
    public final /* synthetic */ sa.d b;

    public b(sa.d dVar) {
        this.b = dVar;
        attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        this.a = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        Handler handler = this.a;
        if (i7 == 2) {
            parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            handler.post(new a(this, parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null));
            parcel2.writeNoException();
            return true;
        }
        if (i7 == 3) {
            parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            handler.post(new a(this, parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, 1));
            parcel2.writeNoException();
            return true;
        }
        if (i7 == 4) {
            parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            handler.post(new a(this, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null));
            parcel2.writeNoException();
            return true;
        }
        if (i7 != 5) {
            if (i7 != 1598968902) {
                return super.onTransact(i7, parcel, parcel2, i10);
            }
            parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
            return true;
        }
        parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
        handler.post(new a(this, parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, 3));
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
