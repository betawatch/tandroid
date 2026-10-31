package z7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class ig extends o6.a {
    public static final Parcelable.Creator<ig> CREATOR = new dg(1);
    public final float[] a;
    public final Bitmap b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int h;

    public ig(float[] fArr, Bitmap bitmap, int i10, int i11, int i12, int i13, int i14) {
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
        int q6 = w7.h0.q(parcel, 20293);
        float[] fArr = this.a;
        if (fArr != null) {
            int q10 = w7.h0.q(parcel, 1);
            parcel.writeFloatArray(fArr);
            w7.h0.r(parcel, q10);
        }
        w7.h0.k(parcel, 2, this.b, i10);
        w7.h0.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        w7.h0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.h0.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        w7.h0.s(parcel, 6, 4);
        parcel.writeInt(this.f);
        w7.h0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        w7.h0.r(parcel, q6);
    }
}
