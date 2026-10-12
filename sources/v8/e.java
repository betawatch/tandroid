package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.g0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new s(9);
    public ArrayList a;
    public String b;
    public String c;
    public ArrayList d;
    public boolean e;
    public String f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.h(parcel, 2, this.a);
        g0.l(parcel, 4, this.b);
        g0.l(parcel, 5, this.c);
        g0.h(parcel, 6, this.d);
        boolean z10 = this.e;
        g0.s(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        g0.l(parcel, 8, this.f);
        g0.r(parcel, q6);
    }
}
