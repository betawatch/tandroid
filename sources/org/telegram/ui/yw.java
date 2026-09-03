package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class yw extends org.telegram.ui.Components.m6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ py c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(py pyVar, int i10) {
        super("animationValue", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = pyVar;
                super("viewPagerTranslation", 0);
                break;
            default:
                this.c = pyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.m6
    public final void b(Object obj, float f10) {
        switch (this.b) {
            case 0:
                ((py) obj).C4(f10);
                break;
            default:
                py pyVar = this.c;
                pyVar.F0 = f10;
                ((View) obj).setTranslationY(pyVar.G0 + f10);
                pyVar.F3();
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
