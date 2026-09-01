package x7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import j7.g5;
import java.util.ArrayList;
import u6.p;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new p(14);
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
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 2, this.a, i10);
        double d = this.b;
        g5.s(parcel, 3, 8);
        parcel.writeDouble(d);
        float f10 = this.c;
        g5.s(parcel, 4, 4);
        parcel.writeFloat(f10);
        int i11 = this.d;
        g5.s(parcel, 5, 4);
        parcel.writeInt(i11);
        int i12 = this.e;
        g5.s(parcel, 6, 4);
        parcel.writeInt(i12);
        float f11 = this.f;
        g5.s(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z4 = this.h;
        g5.s(parcel, 8, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z10 = this.n;
        g5.s(parcel, 9, 4);
        parcel.writeInt(z10 ? 1 : 0);
        g5.p(parcel, 10, this.r);
        g5.r(parcel, q10);
    }
}
