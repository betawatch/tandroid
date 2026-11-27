// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class w1 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ byte a;

    public /* synthetic */ w1(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return x1.b;
                }
                grb.i("superState must be null");
                return null;
            case 1:
                return new z79(parcel, classLoader);
            case 2:
                return new ww9(parcel, classLoader);
            case 3:
                return new hxb(parcel, classLoader);
            default:
                return new eic(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new x1[i];
            case 1:
                return new z79[i];
            case 2:
                return new ww9[i];
            case 3:
                return new hxb[i];
            default:
                return new eic[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return x1.b;
                }
                grb.i("superState must be null");
                return null;
            case 1:
                return new z79(parcel, null);
            case 2:
                return new ww9(parcel, null);
            case 3:
                return new hxb(parcel, null);
            default:
                return new eic(parcel, null);
        }
    }
}
