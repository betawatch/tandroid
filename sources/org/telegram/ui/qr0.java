package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
