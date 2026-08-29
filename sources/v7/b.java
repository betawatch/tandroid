package v7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import s6.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b extends a6.a {
    public static final Parcelable.Creator<b> CREATOR = new i(23);
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
        int q6 = o.q(parcel, 20293);
        o.k(parcel, 2, this.a, i10);
        double d = this.b;
        o.s(parcel, 3, 8);
        parcel.writeDouble(d);
        float f9 = this.c;
        o.s(parcel, 4, 4);
        parcel.writeFloat(f9);
        int i11 = this.d;
        o.s(parcel, 5, 4);
        parcel.writeInt(i11);
        int i12 = this.e;
        o.s(parcel, 6, 4);
        parcel.writeInt(i12);
        float f10 = this.f;
        o.s(parcel, 7, 4);
        parcel.writeFloat(f10);
        boolean z10 = this.h;
        o.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.n;
        o.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        o.p(parcel, 10, this.r);
        o.r(parcel, q6);
    }
}
