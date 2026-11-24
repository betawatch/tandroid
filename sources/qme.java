// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class qme extends b4 {
    public static final Parcelable.Creator<qme> CREATOR = new rhe((byte) 14);
    public final int a;
    public final float b;
    public final int c;

    public qme(int i, int i2, float f, int i3) {
        if (i != 1) {
            w26.j("Unknown language.");
            throw null;
        }
        this.a = i2;
        this.b = f;
        this.c = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 4);
        parcel.writeInt(1);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.a);
        jte.q(parcel, 4, 4);
        parcel.writeFloat(this.b);
        jte.q(parcel, 5, 4);
        parcel.writeInt(this.c);
        jte.s(parcel, r);
    }
}
