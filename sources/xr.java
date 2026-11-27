// default package

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class xr extends c4 {
    public static final Parcelable.Creator<xr> CREATOR = new zkd(27);
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;
    public final Uri e;
    public final String f;
    public final String h;
    public final Boolean n;
    public final Boolean r;

    public xr(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
        this.e = uri;
        this.f = str4;
        this.h = str5;
        this.n = bool;
        this.r = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xr)) {
            return false;
        }
        xr xrVar = (xr) obj;
        return qd1.d(this.a, xrVar.a) && qd1.d(this.b, xrVar.b) && qd1.d(this.c, xrVar.c) && qd1.d(this.d, xrVar.d) && qd1.d(this.e, xrVar.e) && qd1.d(this.f, xrVar.f) && qd1.d(this.h, xrVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    public final String toString() {
        ArrayList arrayList = this.c;
        int size = arrayList == null ? 0 : arrayList.size();
        String valueOf = String.valueOf(this.e);
        StringBuilder l = xnb.l("applicationId: ", this.a, ", name: ", this.b, ", namespaces.count: ");
        l.append(size);
        l.append(", senderAppIdentifier: ");
        l.append(this.d);
        l.append(", senderAppLaunchUrl: ");
        qu6.u(l, valueOf, ", iconUrl: ", this.f, ", type: ");
        l.append(this.h);
        return l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.l(parcel, 3, this.b);
        bye.n(parcel, 5, DesugarCollections.unmodifiableList(this.c));
        bye.l(parcel, 6, this.d);
        bye.k(parcel, 7, this.e, i);
        bye.l(parcel, 8, this.f);
        bye.l(parcel, 9, this.h);
        bye.a(parcel, 10, this.n);
        bye.a(parcel, 11, this.r);
        bye.s(parcel, r);
    }
}
