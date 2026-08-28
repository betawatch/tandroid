package x8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.car.app.j;
import g7.p8;
import w7.i;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b extends y5.a {
    public static final Parcelable.Creator<b> CREATOR = new i(12);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final a e;
    public final String f;
    public final Bundle h;

    public b(String str, String str2, String str3, String str4, a aVar, String str5, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = aVar;
        this.f = str5;
        if (bundle != null) {
            this.h = bundle;
        } else {
            this.h = Bundle.EMPTY;
        }
        ClassLoader classLoader = b.class.getClassLoader();
        if (classLoader != null) {
            this.h.setClassLoader(classLoader);
        } else {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new j(sb2.toString());
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionImpl { { actionType: '");
        sb2.append(this.a);
        sb2.append("' } { objectName: '");
        sb2.append(this.b);
        sb2.append("' } { objectUrl: '");
        sb2.append(this.c);
        sb2.append("' } ");
        String str = this.d;
        if (str != null) {
            sb2.append("{ objectSameAs: '");
            sb2.append(str);
            sb2.append("' } ");
        }
        a aVar = this.e;
        if (aVar != null) {
            sb2.append("{ metadata: '");
            sb2.append(aVar.toString());
            sb2.append("' } ");
        }
        String str2 = this.f;
        if (str2 != null) {
            sb2.append("{ actionStatus: '");
            sb2.append(str2);
            sb2.append("' } ");
        }
        Bundle bundle = this.h;
        if (!bundle.isEmpty()) {
            sb2.append("{ ");
            sb2.append(bundle);
            sb2.append(" } ");
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 1, this.a);
        p8.l(parcel, 2, this.b);
        p8.l(parcel, 3, this.c);
        p8.l(parcel, 4, this.d);
        p8.k(parcel, 5, this.e, i9);
        p8.l(parcel, 6, this.f);
        p8.b(parcel, 7, this.h);
        p8.r(parcel, q10);
    }
}
