// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
                dq9.m("superState must be null");
                return null;
            case 1:
                return new o69(parcel, classLoader);
            case 2:
                return new fv9(parcel, classLoader);
            case 3:
                return new hvb(parcel, classLoader);
            default:
                return new fgc(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new w1[i];
            case 1:
                return new o69[i];
            case 2:
                return new fv9[i];
            case 3:
                return new hvb[i];
            default:
                return new fgc[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return w1.b;
                }
                dq9.m("superState must be null");
                return null;
            case 1:
                return new o69(parcel, null);
            case 2:
                return new fv9(parcel, null);
            case 3:
                return new hvb(parcel, null);
            default:
                return new fgc(parcel, null);
        }
    }
}
