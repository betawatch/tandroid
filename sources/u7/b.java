package u7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import h7.r8;
import java.util.ArrayList;
import r6.l;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b extends z5.a {
    public static final Parcelable.Creator<b> CREATOR = new l(19);
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
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.k(parcel, 2, this.a, i10);
        double d = this.b;
        r8.s(parcel, 3, 8);
        parcel.writeDouble(d);
        float f10 = this.c;
        r8.s(parcel, 4, 4);
        parcel.writeFloat(f10);
        int i11 = this.d;
        r8.s(parcel, 5, 4);
        parcel.writeInt(i11);
        int i12 = this.e;
        r8.s(parcel, 6, 4);
        parcel.writeInt(i12);
        float f11 = this.f;
        r8.s(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z10 = this.h;
        r8.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.n;
        r8.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        r8.p(parcel, 10, this.r);
        r8.r(parcel, q6);
    }
}
