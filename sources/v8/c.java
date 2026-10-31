package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new s(5);
    public ArrayList a;
    public boolean b;
    public boolean c;
    public int d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.h(parcel, 1, this.a);
        boolean z10 = this.b;
        h0.s(parcel, 2, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.c;
        h0.s(parcel, 3, 4);
        parcel.writeInt(z11 ? 1 : 0);
        int i11 = this.d;
        h0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        h0.r(parcel, q6);
    }
}
