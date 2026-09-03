package q5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import j7.g5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class d extends c6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(17);
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final Uri e;
    public final String f;
    public final String h;
    public final Boolean n;
    public final Boolean r;

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
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
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return u5.a.d(this.a, dVar.a) && u5.a.d(this.b, dVar.b) && u5.a.d(this.c, dVar.c) && u5.a.d(this.d, dVar.d) && u5.a.d(this.e, dVar.e) && u5.a.d(this.f, dVar.f) && u5.a.d(this.h, dVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    public final String toString() {
        List list = this.c;
        int size = list == null ? 0 : list.size();
        String valueOf = String.valueOf(this.e);
        StringBuilder m9 = yh.m("applicationId: ", this.a, ", name: ", this.b, ", namespaces.count: ");
        m9.append(size);
        m9.append(", senderAppIdentifier: ");
        m9.append(this.d);
        m9.append(", senderAppLaunchUrl: ");
        yh.w(m9, valueOf, ", iconUrl: ", this.f, ", type: ");
        m9.append(this.h);
        return m9.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.a);
        g5.l(parcel, 3, this.b);
        g5.n(parcel, 5, DesugarCollections.unmodifiableList(this.c));
        g5.l(parcel, 6, this.d);
        g5.k(parcel, 7, this.e, i10);
        g5.l(parcel, 8, this.f);
        g5.l(parcel, 9, this.h);
        g5.a(parcel, 10, this.n);
        g5.a(parcel, 11, this.r);
        g5.r(parcel, q10);
    }
}
