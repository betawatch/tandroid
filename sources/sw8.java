// default package

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class sw8 implements Parcelable {

    /* JADX INFO: Fake field, exist only in values array */
    sw8 EF5;
    public static final /* synthetic */ sw8[] a = {new sw8("PUBLIC_KEY", 0)};
    public static final Parcelable.Creator<sw8> CREATOR = new lbd((byte) 1);

    public static sw8 a(String str) {
        for (sw8 sw8Var : values()) {
            sw8Var.getClass();
            if (str.equals("public-key")) {
                return sw8Var;
            }
        }
        throw new rw8(kt6.o("PublicKeyCredentialType ", str, " not supported"));
    }

    public static sw8 valueOf(String str) {
        return (sw8) Enum.valueOf(sw8.class, str);
    }

    public static sw8[] values() {
        return (sw8[]) a.clone();
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
