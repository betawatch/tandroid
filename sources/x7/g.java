package x7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import j7.f5;
import ph.j5;
import u6.p;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class g extends c6.a {
    public static final Parcelable.Creator<g> CREATOR = new p(18);
    public LatLng a;
    public String b;
    public String c;
    public j5 d;
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
        j5 j5Var = this.d;
        f5.f(parcel, 5, j5Var == null ? null : ((l6.a) j5Var.b).asBinder());
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
