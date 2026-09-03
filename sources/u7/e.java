package u7;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import j7.f5;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class e extends c6.a {
    public static final Parcelable.Creator<e> CREATOR = new u6.p(10);
    public final List a;
    public final boolean b;
    public final boolean c;

    public e(ArrayList arrayList, boolean z4, boolean z10) {
        this.a = arrayList;
        this.b = z4;
        this.c = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.p(parcel, 1, DesugarCollections.unmodifiableList(this.a));
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        f5.r(parcel, q10);
    }
}
