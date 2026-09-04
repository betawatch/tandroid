package vf;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class b extends Binder implements IInterface {
    public final Handler a;
    public final /* synthetic */ ob.a b;

    public b(ob.a aVar) {
        this.b = aVar;
        attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        this.a = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        Handler handler = this.a;
        if (i10 == 2) {
            parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            handler.post(new a(this, parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null));
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 3) {
            parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            handler.post(new a(this, parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, 1));
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 4) {
            parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            handler.post(new a(this, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null));
            parcel2.writeNoException();
            return true;
        }
        if (i10 != 5) {
            if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
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
