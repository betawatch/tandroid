package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class zu extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.im0 d;
    public ai.u1 e;
    public int f;
    public final /* synthetic */ av h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu(av avVar, Context context) {
        super(context);
        this.h = avVar;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        zu zuVar;
        super.setTranslationX(f7);
        av avVar = this.h;
        zu[] zuVarArr = avVar.f;
        if (avVar.n && (zuVar = zuVarArr[0]) == this) {
            avVar.e.j(Math.abs(zuVar.getTranslationX()) / zuVarArr[0].getMeasuredWidth(), zuVarArr[1].f);
        }
    }
}
