package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class vr0 extends FloatProperty {
    public vr0() {
        super("progress");
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((xu0) obj).a);
    }

    public final void setValue(Object obj, float f7) {
        ((xu0) obj).b(f7);
    }
}
