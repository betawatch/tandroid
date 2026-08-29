package v7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import com.google.android.gms.maps.model.LatLng;
import org.telegram.ui.Components.n;
import s6.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g extends a6.a {
    public static final Parcelable.Creator<g> CREATOR = new i(27);
    public LatLng a;
    public String b;
    public String c;
    public n d;
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
        int q6 = o.q(parcel, 20293);
        o.k(parcel, 2, this.a, i10);
        o.l(parcel, 3, this.b);
        o.l(parcel, 4, this.c);
        n nVar = this.d;
        o.f(parcel, 5, nVar == null ? null : ((j6.a) nVar.b).asBinder());
        float f9 = this.e;
        o.s(parcel, 6, 4);
        parcel.writeFloat(f9);
        float f10 = this.f;
        o.s(parcel, 7, 4);
        parcel.writeFloat(f10);
        boolean z10 = this.h;
        o.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.n;
        o.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.r;
        o.s(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        float f11 = this.s;
        o.s(parcel, 11, 4);
        parcel.writeFloat(f11);
        float f12 = this.v;
        o.s(parcel, 12, 4);
        parcel.writeFloat(f12);
        float f13 = this.w;
        o.s(parcel, 13, 4);
        parcel.writeFloat(f13);
        float f14 = this.x;
        o.s(parcel, 14, 4);
        parcel.writeFloat(f14);
        float f15 = this.y;
        o.s(parcel, 15, 4);
        parcel.writeFloat(f15);
        o.r(parcel, q6);
    }
}
