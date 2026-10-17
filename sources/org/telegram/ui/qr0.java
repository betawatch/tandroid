package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class qr0 extends FloatProperty {
    public qr0() {
        super("progress");
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((su0) obj).a);
    }

    public final void setValue(Object obj, float f7) {
        ((su0) obj).b(f7);
    }
}
