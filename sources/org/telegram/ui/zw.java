package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class zw extends org.telegram.ui.Components.m6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ qy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw(qy qyVar, int i10) {
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

    @Override // org.telegram.ui.Components.m6
    public final void b(Object obj, float f10) {
        switch (this.b) {
            case 0:
                ((qy) obj).C4(f10);
                break;
            default:
                qy qyVar = this.c;
                qyVar.F0 = f10;
                ((View) obj).setTranslationY(qyVar.G0 + f10);
                qyVar.F3();
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
