// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class toe extends b4 {
    public static final Parcelable.Creator<toe> CREATOR = new sje((byte) 14);
    public final int a;
    public final float b;
    public final int c;

    public toe(int i, int i2, float f, int i3) {
        if (i != 1) {
            u36.j("Unknown language.");
            throw null;
        }
        this.a = i2;
        this.b = f;
        this.c = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 4);
        parcel.writeInt(1);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.a);
        mve.q(parcel, 4, 4);
        parcel.writeFloat(this.b);
        mve.q(parcel, 5, 4);
        parcel.writeInt(this.c);
        mve.s(parcel, r);
    }
}
