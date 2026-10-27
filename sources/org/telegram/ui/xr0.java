package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class xr0 extends FloatProperty {
    public xr0() {
        super("progress");
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((zu0) obj).a);
    }

    public final void setValue(Object obj, float f7) {
        ((zu0) obj).b(f7);
    }
}
