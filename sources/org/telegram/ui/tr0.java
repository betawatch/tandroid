package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
