// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class s61 implements Parcelable {
    public static final Parcelable.Creator<s61> CREATOR = new e2f(15);
    public final jk a;

    public s61(jk jkVar) {
        this.a = jkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static s61 a(int i) {
        t09 t09Var;
        if (i == -262) {
            t09Var = t09.b;
        } else {
            t09[] values = t09.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    for (ot3 ot3Var : ot3.values()) {
                        if (ot3Var.a == i) {
                            t09Var = ot3Var;
                        }
                    }
                    throw new r61(td4.o(i, "Algorithm with COSE value ", " not supported"));
                }
                t09 t09Var2 = values[i2];
                if (t09Var2.a == i) {
                    t09Var = t09Var2;
                    break;
                }
                i2++;
            }
        }
        return new s61(t09Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s61) && this.a.a() == ((s61) obj).a.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return kt6.o("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.a), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.a());
    }
}
