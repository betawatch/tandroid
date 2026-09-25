package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class zr0 extends FloatProperty {
    public zr0() {
        super("progress");
    }

    @Override // android.util.Property
    public final Float get(Object obj) {
        return Float.valueOf(((cv0) obj).a);
    }

    @Override // android.util.FloatProperty
    public final void setValue(Object obj, float f7) {
        ((cv0) obj).b(f7);
    }
}
