// default package

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class vsc extends b4 {
    public static final Parcelable.Creator<vsc> CREATOR = new b1d((byte) 9);
    public final int a;
    public final Uri b;
    public final int c;
    public final int d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vsc(JSONObject jSONObject) {
        this(r0, jSONObject.optInt("width", 0), jSONObject.optInt("height", 0));
        Uri uri = Uri.EMPTY;
        if (jSONObject.has("url")) {
            try {
                uri = Uri.parse(jSONObject.getString("url"));
            } catch (JSONException unused) {
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof vsc)) {
            vsc vscVar = (vsc) obj;
            if (cqe.a(this.b, vscVar.b) && this.c == vscVar.c && this.d == vscVar.d) {
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
        StringBuilder p = ir2.p("Image ", this.c, "x", this.d, " ");
        p.append(uri);
        return p.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        jte.k(parcel, 2, this.b, i);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        jte.s(parcel, r);
    }

    public vsc(Uri uri, int i, int i2) {
        this(1, uri, i, i2);
        if (uri == null) {
            w26.j("url cannot be null");
            throw null;
        }
        if (i < 0 || i2 < 0) {
            w26.j("width and height must not be negative");
            throw null;
        }
    }

    public vsc(int i, Uri uri, int i2, int i3) {
        this.a = i;
        this.b = uri;
        this.c = i2;
        this.d = i3;
    }
}
