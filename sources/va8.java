// default package

import android.util.FloatProperty;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
