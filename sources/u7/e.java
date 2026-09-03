package u7;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import j7.g5;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        int q10 = g5.q(parcel, 20293);
        g5.p(parcel, 1, DesugarCollections.unmodifiableList(this.a));
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        g5.r(parcel, q10);
    }
}
