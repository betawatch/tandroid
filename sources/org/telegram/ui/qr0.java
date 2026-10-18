package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
