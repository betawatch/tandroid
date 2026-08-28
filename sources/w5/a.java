package w5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import e2.c;
import g7.p8;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import q7.j;
import x5.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a extends y5.a {
    public static final Parcelable.Creator<a> CREATOR = new j(25);
    public final int a;
    public final Uri b;
    public final int c;
    public final int d;

    public a(int i9, Uri uri, int i10, int i11) {
        this.a = i9;
        this.b = uri;
        this.c = i10;
        this.d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            if (l.l(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        String uri = this.b.toString();
        StringBuilder o6 = c.o("Image ", this.c, "x", this.d, " ");
        o6.append(uri);
        return o6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        p8.k(parcel, 2, this.b, i9);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        p8.r(parcel, q10);
    }

    public a(Uri uri, int i9, int i10) {
        this(1, uri, i9, i10);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (i9 < 0 || i10 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(JSONObject jSONObject) {
        this(r0, jSONObject.optInt("width", 0), jSONObject.optInt("height", 0));
        Uri uri = Uri.EMPTY;
        if (jSONObject.has("url")) {
            try {
                uri = Uri.parse(jSONObject.getString("url"));
            } catch (JSONException unused) {
            }
        }
    }
}
