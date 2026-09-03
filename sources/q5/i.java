package q5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j7.f5;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class i extends c6.a {
    public static final Parcelable.Creator<i> CREATOR = new v(5);
    public final boolean a;
    public final String b;
    public final boolean c;
    public final h d;

    public i(boolean z4, String str, boolean z10, h hVar) {
        this.a = z4;
        this.b = str;
        this.c = z10;
        this.d = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && u5.a.d(this.b, iVar.b) && this.c == iVar.c && u5.a.d(this.d, iVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, Boolean.valueOf(this.c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.a + ", language=" + this.b + ", androidReceiverCompatible: " + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.a ? 1 : 0);
        f5.l(parcel, 3, this.b);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        f5.k(parcel, 5, this.d, i10);
        f5.r(parcel, q10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i() {
        this(false, r1.toString(), false, null);
        Locale locale = Locale.getDefault();
        Pattern pattern = u5.a.a;
        StringBuilder sb = new StringBuilder(20);
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb.append('-');
            sb.append(country);
        }
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant)) {
            sb.append('-');
            sb.append(variant);
        }
    }
}
