package x7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class na extends o6.a {
    public static final Parcelable.Creator<na> CREATOR = new n5(2);
    public final String a;
    public final float b;
    public final String c;
    public final int d;

    public na(float f7, int i10, String str, String str2) {
        this.a = str;
        this.b = f7;
        this.c = str2;
        this.d = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 1, this.a);
        w7.e0.s(parcel, 2, 4);
        parcel.writeFloat(this.b);
        w7.e0.l(parcel, 3, this.c);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.e0.r(parcel, q6);
    }
}
