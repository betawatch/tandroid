// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wef extends b4 {
    public static final Parcelable.Creator<wef> CREATOR = new yhf((byte) 1);
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;

    public static wef b(in3 in3Var) {
        wef wefVar = new wef();
        pd0 pd0Var = (pd0) in3Var.b;
        wefVar.a = pd0Var.a;
        wefVar.b = pd0Var.b;
        wefVar.e = pd0Var.c;
        wefVar.c = 0;
        wefVar.d = 0L;
        return wefVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        int i2 = this.a;
        mve.q(parcel, 2, 4);
        parcel.writeInt(i2);
        int i3 = this.b;
        mve.q(parcel, 3, 4);
        parcel.writeInt(i3);
        int i4 = this.c;
        mve.q(parcel, 4, 4);
        parcel.writeInt(i4);
        long j = this.d;
        mve.q(parcel, 5, 8);
        parcel.writeLong(j);
        int i5 = this.e;
        mve.q(parcel, 6, 4);
        parcel.writeInt(i5);
        mve.s(parcel, r);
    }
}
