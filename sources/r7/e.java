package r7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e extends z5.a {
    public static final Parcelable.Creator<e> CREATOR = new r6.l(14);
    public final List a;
    public final boolean b;
    public final boolean c;

    public e(ArrayList arrayList, boolean z10, boolean z11) {
        this.a = arrayList;
        this.b = z10;
        this.c = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.p(parcel, 1, DesugarCollections.unmodifiableList(this.a));
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        r8.r(parcel, q6);
    }
}
