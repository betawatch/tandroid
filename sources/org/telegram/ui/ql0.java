package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ql0 extends FrameLayout {
    public long a;
    public TL_stars.starGiftAttributeBackdrop b;
    public TL_stars.starGiftAttributePattern c;
    public final FrameLayout d;
    public final zh.w0 e;
    public final org.telegram.ui.Components.l9 f;
    public final zh.a1 h;
    public TLRPC.Document n;

    public ql0(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        zh.w0 w0Var = new zh.w0(frameLayout, f6Var, false);
        this.e = w0Var;
        frameLayout.setBackground(w0Var);
        addView(frameLayout, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        c8.ka.b(frameLayout, 0.025f, 1.25f);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f = l9Var;
        frameLayout.addView(l9Var, c8.ha.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
        if (!z9) {
            this.h = null;
            return;
        }
        zh.a1 a1Var = new zh.a1(context);
        this.h = a1Var;
        addView(a1Var, c8.ha.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
    }

    public final void a(int i7, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.a = tL_starGiftUnique.id;
        boolean z9 = i7 % 3 == 1;
        setPadding(z9 ? org.telegram.messenger.g0.L(4.0f) : 0, 0, z9 ? org.telegram.messenger.g0.L(4.0f) : 0, 0);
        c(tL_starGiftUnique.getDocument(), tL_starGiftUnique);
        this.b = (TL_stars.starGiftAttributeBackdrop) bi.ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.c = (TL_stars.starGiftAttributePattern) bi.ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.b;
        zh.w0 w0Var = this.e;
        w0Var.d(stargiftattributebackdrop);
        w0Var.e(this.c);
    }

    public final void b(boolean z9, boolean z10) {
        this.e.f(z9, z10);
        float f10 = z9 ? 0.9f : 1.0f;
        org.telegram.ui.Components.l9 l9Var = this.f;
        if (z10) {
            l9Var.animate().scaleX(f10).scaleY(f10).start();
            return;
        }
        l9Var.animate().cancel();
        l9Var.setScaleX(f10);
        l9Var.setScaleY(f10);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        org.telegram.ui.Components.l9 l9Var = this.f;
        if (document == null) {
            l9Var.b();
            this.n = null;
        } else {
            if (this.n == document) {
                return;
            }
            this.n = document;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(100.0f), false, null, false);
            l9Var.m(org.telegram.messenger.hc.b(document), "100_100", org.telegram.messenger.hc.c(w10, document), "100_100", org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.k6.a7, 0.3f, null), starGift);
        }
    }

    public long getGiftId() {
        return this.a;
    }
}
