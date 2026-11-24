// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class v1 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ byte a;

    public /* synthetic */ v1(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return w1.b;
                }
                sc8.j("superState must be null");
                return null;
            case 1:
                return new m49(parcel, classLoader);
            case 2:
                return new dt9(parcel, classLoader);
            case 3:
                return new gtb(parcel, classLoader);
            default:
                return new fec(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new w1[i];
            case 1:
                return new m49[i];
            case 2:
                return new dt9[i];
            case 3:
                return new gtb[i];
            default:
                return new fec[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return w1.b;
                }
                sc8.j("superState must be null");
                return null;
            case 1:
                return new m49(parcel, null);
            case 2:
                return new dt9(parcel, null);
            case 3:
                return new gtb(parcel, null);
            default:
                return new fec(parcel, null);
        }
    }
}
