// default package

import android.util.FloatProperty;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
