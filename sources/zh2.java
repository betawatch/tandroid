// default package

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zh2 extends c4 {
    public static final Parcelable.Creator<zh2> CREATOR = new zkd((byte) 2);
    public LatLng a;
    public double b;
    public float c;
    public int d;
    public int e;
    public float f;
    public boolean h;
    public boolean n;
    public ArrayList r;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 2, this.a, i);
        double d = this.b;
        bye.q(parcel, 3, 8);
        parcel.writeDouble(d);
        float f = this.c;
        bye.q(parcel, 4, 4);
        parcel.writeFloat(f);
        int i2 = this.d;
        bye.q(parcel, 5, 4);
        parcel.writeInt(i2);
        int i3 = this.e;
        bye.q(parcel, 6, 4);
        parcel.writeInt(i3);
        float f2 = this.f;
        bye.q(parcel, 7, 4);
        parcel.writeFloat(f2);
        boolean z = this.h;
        bye.q(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.n;
        bye.q(parcel, 9, 4);
        parcel.writeInt(z2 ? 1 : 0);
        bye.p(parcel, 10, this.r);
        bye.s(parcel, r);
    }
}
