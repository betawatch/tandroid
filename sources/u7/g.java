package u7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import h7.r8;
import n2.b0;
import r6.l;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class g extends z5.a {
    public static final Parcelable.Creator<g> CREATOR = new l(23);
    public LatLng a;
    public String b;
    public String c;
    public b0 d;
    public float e;
    public float f;
    public boolean h;
    public boolean n;
    public boolean r;
    public float s;
    public float v;
    public float w;
    public float x;
    public float y;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.k(parcel, 2, this.a, i10);
        r8.l(parcel, 3, this.b);
        r8.l(parcel, 4, this.c);
        b0 b0Var = this.d;
        r8.f(parcel, 5, b0Var == null ? null : ((i6.a) b0Var.b).asBinder());
        float f10 = this.e;
        r8.s(parcel, 6, 4);
        parcel.writeFloat(f10);
        float f11 = this.f;
        r8.s(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z10 = this.h;
        r8.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.n;
        r8.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.r;
        r8.s(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        float f12 = this.s;
        r8.s(parcel, 11, 4);
        parcel.writeFloat(f12);
        float f13 = this.v;
        r8.s(parcel, 12, 4);
        parcel.writeFloat(f13);
        float f14 = this.w;
        r8.s(parcel, 13, 4);
        parcel.writeFloat(f14);
        float f15 = this.x;
        r8.s(parcel, 14, 4);
        parcel.writeFloat(f15);
        float f16 = this.y;
        r8.s(parcel, 15, 4);
        parcel.writeFloat(f16);
        r8.r(parcel, q6);
    }
}
