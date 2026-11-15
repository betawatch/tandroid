package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class sl0 extends FrameLayout {
    public long a;
    public TL_stars.starGiftAttributeBackdrop b;
    public TL_stars.starGiftAttributePattern c;
    public final FrameLayout d;
    public final bi.e2 e;
    public final org.telegram.ui.Components.i9 f;
    public final bi.j2 h;
    public TLRPC.Document n;

    public sl0(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        bi.e2 e2Var = new bi.e2(frameLayout, e6Var, false);
        this.e = e2Var;
        frameLayout.setBackground(e2Var);
        addView(frameLayout, c8.ja.e(-1, -1, org.telegram.messenger.ns.E1));
        c8.na.b(frameLayout, 0.025f, 1.25f);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f = i9Var;
        frameLayout.addView(i9Var, c8.ja.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
        if (!z10) {
            this.h = null;
            return;
        }
        bi.j2 j2Var = new bi.j2(context);
        this.h = j2Var;
        addView(j2Var, c8.ja.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
    }

    public final void a(int i7, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.a = tL_starGiftUnique.id;
        boolean z10 = i7 % 3 == 1;
        setPadding(z10 ? org.telegram.messenger.g0.L(4.0f) : 0, 0, z10 ? org.telegram.messenger.g0.L(4.0f) : 0, 0);
        c(tL_starGiftUnique.getDocument(), tL_starGiftUnique);
        this.b = (TL_stars.starGiftAttributeBackdrop) di.u8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.c = (TL_stars.starGiftAttributePattern) di.u8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.b;
        bi.e2 e2Var = this.e;
        e2Var.d(stargiftattributebackdrop);
        e2Var.e(this.c);
    }

    public final void b(boolean z10, boolean z11) {
        this.e.f(z10, z11);
        float f10 = z10 ? 0.9f : 1.0f;
        org.telegram.ui.Components.i9 i9Var = this.f;
        if (z11) {
            i9Var.animate().scaleX(f10).scaleY(f10).start();
            return;
        }
        i9Var.animate().cancel();
        i9Var.setScaleX(f10);
        i9Var.setScaleY(f10);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        org.telegram.ui.Components.i9 i9Var = this.f;
        if (document == null) {
            i9Var.b();
            this.n = null;
        } else {
            if (this.n == document) {
                return;
            }
            this.n = document;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(100.0f), false, null, false);
            i9Var.m(org.telegram.messenger.gc.b(document), "100_100", org.telegram.messenger.gc.c(w10, document), "100_100", org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.j6.a7, 0.3f, null), starGift);
        }
    }

    public long getGiftId() {
        return this.a;
    }
}
