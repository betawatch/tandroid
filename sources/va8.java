// default package

import android.util.FloatProperty;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class va8 extends FloatProperty {
    public va8() {
        super("progress");
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((kd8) obj).a);
    }

    public final void setValue(Object obj, float f) {
        ((kd8) obj).b(f);
    }
}
