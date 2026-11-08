package v6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.common.api.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import q6.m;
import u8.o;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new o(14);
    public final List a;
    public final boolean b;
    public final String c;
    public final String d;

    public a(ArrayList arrayList, boolean z9, String str, String str2) {
        m.g(arrayList);
        this.a = arrayList;
        this.b = z9;
        this.c = str;
        this.d = str2;
    }

    public static a b(List list, boolean z9) {
        TreeSet treeSet = new TreeSet(c5.b.c);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((n) it.next()).c());
        }
        return new a(new ArrayList(treeSet), z9, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.b == aVar.b && m.k(this.a, aVar.a) && m.k(this.c, aVar.c) && m.k(this.d, aVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), this.a, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.p(parcel, 1, this.a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        xb.l(parcel, 3, this.c);
        xb.l(parcel, 4, this.d);
        xb.s(parcel, r10);
    }
}
