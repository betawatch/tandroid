package x7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import j7.g5;
import org.telegram.ui.Components.ai;
import u6.p;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class g extends c6.a {
    public static final Parcelable.Creator<g> CREATOR = new p(18);
    public LatLng a;
    public String b;
    public String c;
    public ai d;
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
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 2, this.a, i10);
        g5.l(parcel, 3, this.b);
        g5.l(parcel, 4, this.c);
        ai aiVar = this.d;
        g5.f(parcel, 5, aiVar == null ? null : ((l6.a) aiVar.b).asBinder());
        float f10 = this.e;
        g5.s(parcel, 6, 4);
        parcel.writeFloat(f10);
        float f11 = this.f;
        g5.s(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z4 = this.h;
        g5.s(parcel, 8, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z10 = this.n;
        g5.s(parcel, 9, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.r;
        g5.s(parcel, 10, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f12 = this.s;
        g5.s(parcel, 11, 4);
        parcel.writeFloat(f12);
        float f13 = this.v;
        g5.s(parcel, 12, 4);
        parcel.writeFloat(f13);
        float f14 = this.w;
        g5.s(parcel, 13, 4);
        parcel.writeFloat(f14);
        float f15 = this.x;
        g5.s(parcel, 14, 4);
        parcel.writeFloat(f15);
        float f16 = this.y;
        g5.s(parcel, 15, 4);
        parcel.writeFloat(f16);
        g5.r(parcel, q10);
    }
}
