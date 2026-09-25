package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class yw extends org.telegram.ui.Components.r6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ qy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(qy qyVar, int i10) {
        super("animationValue", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = qyVar;
                super("viewPagerTranslation", 0);
                break;
            default:
                this.c = qyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.r6
    public final void b(Object obj, float f7) {
        switch (this.b) {
            case 0:
                ((qy) obj).C4(f7);
                break;
            default:
                qy qyVar = this.c;
                qyVar.I0 = f7;
                ((View) obj).setTranslationY(qyVar.J0 + f7);
                qyVar.F3();
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(this.c.N);
            default:
                return Float.valueOf(this.c.I0);
        }
    }
}
