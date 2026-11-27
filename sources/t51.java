// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class t51 implements Parcelable {
    public static final Parcelable.Creator<t51> CREATOR = new t4f(15);
    public final kj a;

    public t51(kj kjVar) {
        this.a = kjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static t51 a(int i) {
        f29 f29Var;
        if (i == -262) {
            f29Var = f29.b;
        } else {
            f29[] values = f29.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    for (ws3 ws3Var : ws3.values()) {
                        if (ws3Var.a == i) {
                            f29Var = ws3Var;
                        }
                    }
                    throw new s51(qd4.n(i, "Algorithm with COSE value ", " not supported"));
                }
                f29 f29Var2 = values[i2];
                if (f29Var2.a == i) {
                    f29Var = f29Var2;
                    break;
                }
                i2++;
            }
        }
        return new t51(f29Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof t51) && this.a.a() == ((t51) obj).a.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return qd4.y("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.a), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.a());
    }
}
