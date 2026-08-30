package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class xw extends org.telegram.ui.Components.m6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ oy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(oy oyVar, int i10) {
        super("animationValue", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = oyVar;
                super("viewPagerTranslation", 0);
                break;
            default:
                this.c = oyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.m6
    public final void b(Object obj, float f10) {
        switch (this.b) {
            case 0:
                ((oy) obj).C4(f10);
                break;
            default:
                oy oyVar = this.c;
                oyVar.F0 = f10;
                ((View) obj).setTranslationY(oyVar.G0 + f10);
                oyVar.F3();
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(this.c.K);
            default:
                return Float.valueOf(this.c.F0);
        }
    }
}
