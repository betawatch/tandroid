package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class zw extends org.telegram.ui.Components.r6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ ry c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw(ry ryVar, int i10) {
        super("animationValue", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = ryVar;
                super("viewPagerTranslation", 0);
                break;
            default:
                this.c = ryVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.r6
    public final void b(Object obj, float f7) {
        switch (this.b) {
            case 0:
                ((ry) obj).C4(f7);
                break;
            default:
                ry ryVar = this.c;
                ryVar.I0 = f7;
                ((View) obj).setTranslationY(ryVar.J0 + f7);
                ryVar.F3();
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
