// default package

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class zbc extends fm2 {
    public final /* synthetic */ acc E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbc(acc accVar, Drawable drawable, Drawable drawable2) {
        super(drawable, drawable2);
        this.E = accVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        acc accVar = this.E;
        boolean z = accVar.d;
        float f = accVar.N;
        if (z) {
            super.setBounds(i, (int) (i2 - f), i3, i4);
        } else {
            super.setBounds(i, i2, i3, (int) (i4 + f));
        }
    }
}
