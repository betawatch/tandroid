package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.g0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new r(8);
    public ArrayList a;
    public boolean b;
    public boolean c;
    public int d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.h(parcel, 1, this.a);
        boolean z10 = this.b;
        g0.s(parcel, 2, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.c;
        g0.s(parcel, 3, 4);
        parcel.writeInt(z11 ? 1 : 0);
        int i11 = this.d;
        g0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        g0.r(parcel, q6);
    }
}
