package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
