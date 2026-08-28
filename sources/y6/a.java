package y6;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import n6.e;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class a extends Binder implements IInterface {
    @Override // android.os.Binder
    public boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
        if (i9 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i9, parcel, parcel2, i10)) {
            return true;
        }
        e eVar = (e) this;
        if (i9 == 1) {
            eVar.init(h6.b.J0(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
        if (i9 == 2) {
            String readString = parcel.readString();
            int i11 = b.a;
            boolean booleanFlagValue = eVar.getBooleanFlagValue(readString, parcel.readInt() != 0, parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(booleanFlagValue ? 1 : 0);
            return true;
        }
        if (i9 == 3) {
            int intFlagValue = eVar.getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(intFlagValue);
            return true;
        }
        if (i9 == 4) {
            long longFlagValue = eVar.getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeLong(longFlagValue);
            return true;
        }
        if (i9 != 5) {
            return false;
        }
        String stringFlagValue = eVar.getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
        parcel2.writeNoException();
        parcel2.writeString(stringFlagValue);
        return true;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
