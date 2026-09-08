package z7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class hg extends o6.a {
    public static final Parcelable.Creator<hg> CREATOR = new cg(1);
    public final float[] a;
    public final Bitmap b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int h;

    public hg(float[] fArr, Bitmap bitmap, int i10, int i11, int i12, int i13, int i14) {
        this.a = fArr;
        this.b = bitmap;
        this.c = i10;
        this.d = i11;
        this.e = i12;
        this.f = i13;
        this.h = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        float[] fArr = this.a;
        if (fArr != null) {
            int q10 = w7.e0.q(parcel, 1);
            parcel.writeFloatArray(fArr);
            w7.e0.r(parcel, q10);
        }
        w7.e0.k(parcel, 2, this.b, i10);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.e0.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        w7.e0.s(parcel, 6, 4);
        parcel.writeInt(this.f);
        w7.e0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        w7.e0.r(parcel, q6);
    }
}
