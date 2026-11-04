package p4;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new n8.g(15);
    public final int a;
    public final float b;
    public Rating c;

    public x(int i3, float f10) {
        this.a = i3;
        this.b = f10;
    }

    public static x c(float f10) {
        if (f10 >= 0.0f && f10 <= 100.0f) {
            return new x(6, f10);
        }
        g2.a.c("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static x d(float f10, int i3) {
        float f11;
        if (i3 == 3) {
            f11 = 3.0f;
        } else if (i3 == 4) {
            f11 = 4.0f;
        } else {
            if (i3 != 5) {
                g2.a.c("Rating", "Invalid rating style (" + i3 + ") for a star rating");
                return null;
            }
            f11 = 5.0f;
        }
        if (f10 >= 0.0f && f10 <= f11) {
            return new x(i3, f10);
        }
        g2.a.c("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public final float a() {
        int i3 = this.a;
        if ((i3 == 3 || i3 == 4 || i3 == 5) && b()) {
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
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
    }
}
