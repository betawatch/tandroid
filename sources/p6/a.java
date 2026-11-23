package p6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import i5.c;
import java.util.Arrays;
import java.util.Locale;
import m6.e;
import org.json.JSONException;
import org.json.JSONObject;
import q6.m;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new e(17);
    public final int a;
    public final Uri b;
    public final int c;
    public final int d;

    public a(int i7, Uri uri, int i10, int i11) {
        this.a = i7;
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
            if (m.l(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d) {
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
        StringBuilder n10 = c.n("Image ", this.c, "x", this.d, " ");
        n10.append(uri);
        return n10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bc.k(parcel, 2, this.b, i7);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        bc.s(parcel, r10);
    }

    public a(Uri uri, int i7, int i10) {
        this(1, uri, i7, i10);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (i7 < 0 || i10 < 0) {
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
