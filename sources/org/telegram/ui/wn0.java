package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class wn0 extends FloatProperty {
    public wn0() {
        super("progress");
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((sq0) obj).a);
    }

    public final void setValue(Object obj, float f10) {
        ((sq0) obj).b(f10);
    }
}
