// default package

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ru8 implements Parcelable {

    /* JADX INFO: Fake field, exist only in values array */
    ru8 EF5;
    public static final /* synthetic */ ru8[] a = {new ru8("PUBLIC_KEY", 0)};
    public static final Parcelable.Creator<ru8> CREATOR = new j9d((byte) 1);

    public static ru8 a(String str) {
        for (ru8 ru8Var : values()) {
            ru8Var.getClass();
            if (str.equals("public-key")) {
                return ru8Var;
            }
        }
        throw new qu8(tb4.y("PublicKeyCredentialType ", str, " not supported"));
    }

    public static ru8 valueOf(String str) {
        return (ru8) Enum.valueOf(ru8.class, str);
    }

    public static ru8[] values() {
        return (ru8[]) a.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "public-key";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString("public-key");
    }
}
