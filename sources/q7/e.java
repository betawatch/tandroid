package q7;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e extends y5.a {
    public static final Parcelable.Creator<e> CREATOR = new j(6);
    public final List a;
    public final boolean b;
    public final boolean c;

    public e(ArrayList arrayList, boolean z10, boolean z11) {
        this.a = arrayList;
        this.b = z10;
        this.c = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.p(parcel, 1, DesugarCollections.unmodifiableList(this.a));
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        p8.r(parcel, q10);
    }
}
