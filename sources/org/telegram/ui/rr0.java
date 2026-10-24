package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class rr0 extends FloatProperty {
    public rr0() {
        super("progress");
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((tu0) obj).a);
    }

    public final void setValue(Object obj, float f7) {
        ((tu0) obj).b(f7);
    }
}
