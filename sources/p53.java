// default package

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class p53 extends Binder implements IInterface {
    public final /* synthetic */ byte a = 1;
    public final Object b;

    public p53(z3f z3fVar) {
        attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        this.b = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        byte b = this.a;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        byte b = 4;
        switch (this.a) {
            case 0:
                Handler handler = (Handler) this.b;
                if (i == 2) {
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    handler.post(new tv(this, parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null));
                    parcel2.writeNoException();
                    break;
                } else {
                    byte b2 = 3;
                    if (i == 3) {
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                        handler.post(new tv(this, parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, b2));
                        parcel2.writeNoException();
                        break;
                    } else if (i == 4) {
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                        handler.post(new tv(this, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, b));
                        parcel2.writeNoException();
                        break;
                    } else {
                        byte b3 = 5;
                        if (i == 5) {
                            parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                            handler.post(new tv(this, parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, b3));
                            parcel2.writeNoException();
                            break;
                        } else if (i == 1598968902) {
                            parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
                            break;
                        } else {
                            break;
                        }
                    }
                }
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                }
                if (i == 1) {
                    ((ydf) this.b).a((Status) gld.a(parcel, Status.CREATOR));
                    break;
                } else if (i == 2) {
                    break;
                } else if (i == 4) {
                    break;
                }
                break;
        }
        return true;
    }

    public p53(ydf ydfVar) {
        attachInterface(this, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
        this.b = ydfVar;
    }
}
