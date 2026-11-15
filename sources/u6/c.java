package u6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import q4.x;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new x(29);
    public final int a;
    public final boolean b;

    public c(int i7, boolean z10) {
        this.a = i7;
        this.b = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        yb.s(parcel, r10);
    }
}
