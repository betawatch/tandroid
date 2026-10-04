package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class xa implements bh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xa(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // bh.a
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.a) {
        }
        aVar.a = true;
    }

    @Override // bh.a
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.a) {
            case 0:
                ((tb) this.b).Z(canvas, rectF);
                break;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                org.telegram.ui.Components.zl0 zl0Var = premiumPreviewFragment.a;
                gh.d.a(zl0Var, canvas, rectF, zl0Var, premiumPreviewFragment.d0);
                break;
            default:
                a91 a91Var = (a91) this.b;
                org.telegram.ui.Components.c71 c71Var = a91Var.c;
                gh.d.a(c71Var, canvas, rectF, c71Var, a91Var.b);
                break;
        }
    }
}
