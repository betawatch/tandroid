package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class tr0 extends FloatProperty {
    public tr0() {
        super("progress");
    }

    @Override // android.util.Property
    public final Float get(Object obj) {
        return Float.valueOf(((xu0) obj).a);
    }

    @Override // android.util.FloatProperty
    public final void setValue(Object obj, float f10) {
        ((xu0) obj).b(f10);
    }
}
