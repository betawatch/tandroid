package t7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import g7.p8;
import m5.c0;
import q7.j;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g extends y5.a {
    public static final Parcelable.Creator<g> CREATOR = new j(14);
    public LatLng a;
    public String b;
    public String c;
    public c0 d;
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
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 2, this.a, i9);
        p8.l(parcel, 3, this.b);
        p8.l(parcel, 4, this.c);
        c0 c0Var = this.d;
        p8.f(parcel, 5, c0Var == null ? null : ((h6.a) c0Var.b).asBinder());
        float f10 = this.e;
        p8.s(parcel, 6, 4);
        parcel.writeFloat(f10);
        float f11 = this.f;
        p8.s(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z10 = this.h;
        p8.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.n;
        p8.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.r;
        p8.s(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        float f12 = this.s;
        p8.s(parcel, 11, 4);
        parcel.writeFloat(f12);
        float f13 = this.v;
        p8.s(parcel, 12, 4);
        parcel.writeFloat(f13);
        float f14 = this.w;
        p8.s(parcel, 13, 4);
        parcel.writeFloat(f14);
        float f15 = this.x;
        p8.s(parcel, 14, 4);
        parcel.writeFloat(f15);
        float f16 = this.y;
        p8.s(parcel, 15, 4);
        parcel.writeFloat(f16);
        p8.r(parcel, q10);
    }
}
