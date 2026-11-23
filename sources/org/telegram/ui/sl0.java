package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class sl0 extends FrameLayout {
    public long a;
    public TL_stars.starGiftAttributeBackdrop b;
    public TL_stars.starGiftAttributePattern c;
    public final FrameLayout d;
    public final bi.e3 e;
    public final org.telegram.ui.Components.p9 f;
    public final bi.j3 h;
    public TLRPC.Document n;

    public sl0(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        bi.e3 e3Var = new bi.e3(frameLayout, i6Var, false);
        this.e = e3Var;
        frameLayout.setBackground(e3Var);
        addView(frameLayout, c8.na.e(-1, -1, org.telegram.messenger.ks.E1));
        c8.sa.b(frameLayout, 0.025f, 1.25f);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f = p9Var;
        frameLayout.addView(p9Var, c8.na.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
        if (!z10) {
            this.h = null;
            return;
        }
        bi.j3 j3Var = new bi.j3(context);
        this.h = j3Var;
        addView(j3Var, c8.na.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
    }

    public final void a(int i7, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.a = tL_starGiftUnique.id;
        boolean z10 = i7 % 3 == 1;
        setPadding(z10 ? org.telegram.messenger.g0.L(4.0f) : 0, 0, z10 ? org.telegram.messenger.g0.L(4.0f) : 0, 0);
        c(tL_starGiftUnique.getDocument(), tL_starGiftUnique);
        this.b = (TL_stars.starGiftAttributeBackdrop) di.y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.c = (TL_stars.starGiftAttributePattern) di.y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.b;
        bi.e3 e3Var = this.e;
        e3Var.d(stargiftattributebackdrop);
        e3Var.e(this.c);
    }

    public final void b(boolean z10, boolean z11) {
        this.e.f(z10, z11);
        float f10 = z10 ? 0.9f : 1.0f;
        org.telegram.ui.Components.p9 p9Var = this.f;
        if (z11) {
            p9Var.animate().scaleX(f10).scaleY(f10).start();
            return;
        }
        p9Var.animate().cancel();
        p9Var.setScaleX(f10);
        p9Var.setScaleY(f10);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        org.telegram.ui.Components.p9 p9Var = this.f;
        if (document == null) {
            p9Var.b();
            this.n = null;
        } else {
            if (this.n == document) {
                return;
            }
            this.n = document;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(100.0f), false, null, false);
            p9Var.m(org.telegram.messenger.fc.b(document), "100_100", org.telegram.messenger.fc.c(w10, document), "100_100", org.telegram.messenger.u5.f(document, org.telegram.ui.ActionBar.n6.a7, 0.3f, null), starGift);
        }
    }

    public long getGiftId() {
        return this.a;
    }
}
