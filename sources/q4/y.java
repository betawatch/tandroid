package q4;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new x(0);
    public final int a;
    public final float b;
    public Rating c;

    public y(int i7, float f10) {
        this.a = i7;
        this.b = f10;
    }

    public static y c(float f10) {
        if (f10 >= 0.0f && f10 <= 100.0f) {
            return new y(6, f10);
        }
        h2.a.c("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static y d(float f10, int i7) {
        float f11;
        if (i7 == 3) {
            f11 = 3.0f;
        } else if (i7 == 4) {
            f11 = 4.0f;
        } else {
            if (i7 != 5) {
                h2.a.c("Rating", "Invalid rating style (" + i7 + ") for a star rating");
                return null;
            }
            f11 = 5.0f;
        }
        if (f10 >= 0.0f && f10 <= f11) {
            return new y(i7, f10);
        }
        h2.a.c("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public final float a() {
        int i7 = this.a;
        if ((i7 == 3 || i7 == 4 || i7 == 5) && b()) {
            return this.b;
        }
        return -1.0f;
    }

    public final boolean b() {
        return this.b >= 0.0f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.a);
        sb2.append(" rating=");
        float f10 = this.b;
        sb2.append(f10 < 0.0f ? "unrated" : String.valueOf(f10));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
    }
}
