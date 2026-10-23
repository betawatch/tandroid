package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
