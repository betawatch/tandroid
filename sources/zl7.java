// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zl7 extends b4 {
    public static final Parcelable.Creator<zl7> CREATOR = new yhf((byte) 9);
    public final String a;
    public final int b;
    public final String c;

    public zl7(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        mve.l(parcel, 4, this.c);
        mve.s(parcel, r);
    }
}
