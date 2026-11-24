// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class uy5 extends b4 {
    public static final Parcelable.Creator<uy5> CREATOR = new t0e((byte) 3);
    public String a;
    public String b;
    public ArrayList c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.l(parcel, 3, this.b);
        mve.p(parcel, 4, this.c);
        mve.s(parcel, r);
    }
}
