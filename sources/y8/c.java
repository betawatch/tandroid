package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new u8.o(29);
    public ArrayList a;
    public boolean b;
    public boolean c;
    public int d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.h(parcel, 1, this.a);
        boolean z10 = this.b;
        yb.q(parcel, 2, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.c;
        yb.q(parcel, 3, 4);
        parcel.writeInt(z11 ? 1 : 0);
        int i10 = this.d;
        yb.q(parcel, 4, 4);
        parcel.writeInt(i10);
        yb.s(parcel, r10);
    }
}
