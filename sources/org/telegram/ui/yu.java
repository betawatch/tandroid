package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class yu extends FrameLayout {
    public org.telegram.ui.ActionBar.r2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.mm0 d;
    public bi.r1 e;
    public int f;
    public final /* synthetic */ zu h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu(zu zuVar, Context context) {
        super(context);
        this.h = zuVar;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        yu yuVar;
        super.setTranslationX(f7);
        zu zuVar = this.h;
        yu[] yuVarArr = zuVar.f;
        if (zuVar.n && (yuVar = yuVarArr[0]) == this) {
            zuVar.e.i(Math.abs(yuVar.getTranslationX()) / yuVarArr[0].getMeasuredWidth(), yuVarArr[1].f);
        }
    }
}
