package x7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import j7.f5;
import u6.p;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class h extends c6.a {
    public static final Parcelable.Creator<h> CREATOR = new p(18);
    public LatLng a;
    public String b;
    public String c;
    public a d;
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
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 2, this.a, i10);
        f5.l(parcel, 3, this.b);
        f5.l(parcel, 4, this.c);
        a aVar = this.d;
        f5.f(parcel, 5, aVar == null ? null : ((l6.a) aVar.a).asBinder());
        float f10 = this.e;
        f5.s(parcel, 6, 4);
        parcel.writeFloat(f10);
        float f11 = this.f;
        f5.s(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z4 = this.h;
        f5.s(parcel, 8, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z10 = this.n;
        f5.s(parcel, 9, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.r;
        f5.s(parcel, 10, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f12 = this.s;
        f5.s(parcel, 11, 4);
        parcel.writeFloat(f12);
        float f13 = this.v;
        f5.s(parcel, 12, 4);
        parcel.writeFloat(f13);
        float f14 = this.w;
        f5.s(parcel, 13, 4);
        parcel.writeFloat(f14);
        float f15 = this.x;
        f5.s(parcel, 14, 4);
        parcel.writeFloat(f15);
        float f16 = this.y;
        f5.s(parcel, 15, 4);
        parcel.writeFloat(f16);
        f5.r(parcel, q10);
    }
}
