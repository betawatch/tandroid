package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ul0 extends FrameLayout {
    public long a;
    public TL_stars.starGiftAttributeBackdrop b;
    public TL_stars.starGiftAttributePattern c;
    public final FrameLayout d;
    public final bi.y2 e;
    public final org.telegram.ui.Components.q9 f;
    public final bi.d3 h;
    public TLRPC.Document n;

    public ul0(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        bi.y2 y2Var = new bi.y2(frameLayout, i6Var, false);
        this.e = y2Var;
        frameLayout.setBackground(y2Var);
        addView(frameLayout, c8.ma.e(-1, -1, org.telegram.messenger.ks.E1));
        c8.ra.b(frameLayout, 0.025f, 1.25f);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f = q9Var;
        frameLayout.addView(q9Var, c8.ma.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
        if (!z10) {
            this.h = null;
            return;
        }
        bi.d3 d3Var = new bi.d3(context);
        this.h = d3Var;
        addView(d3Var, c8.ma.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
    }

    public final void a(int i7, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.a = tL_starGiftUnique.id;
        boolean z10 = i7 % 3 == 1;
        setPadding(z10 ? org.telegram.messenger.g0.L(4.0f) : 0, 0, z10 ? org.telegram.messenger.g0.L(4.0f) : 0, 0);
        c(tL_starGiftUnique.getDocument(), tL_starGiftUnique);
        this.b = (TL_stars.starGiftAttributeBackdrop) di.x8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.c = (TL_stars.starGiftAttributePattern) di.x8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.b;
        bi.y2 y2Var = this.e;
        y2Var.d(stargiftattributebackdrop);
        y2Var.e(this.c);
    }

    public final void b(boolean z10, boolean z11) {
        this.e.f(z10, z11);
        float f10 = z10 ? 0.9f : 1.0f;
        org.telegram.ui.Components.q9 q9Var = this.f;
        if (z11) {
            q9Var.animate().scaleX(f10).scaleY(f10).start();
            return;
        }
        q9Var.animate().cancel();
        q9Var.setScaleX(f10);
        q9Var.setScaleY(f10);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        org.telegram.ui.Components.q9 q9Var = this.f;
        if (document == null) {
            q9Var.b();
            this.n = null;
        } else {
            if (this.n == document) {
                return;
            }
            this.n = document;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(100.0f), false, null, false);
            q9Var.m(org.telegram.messenger.fc.b(document), "100_100", org.telegram.messenger.fc.c(w10, document), "100_100", org.telegram.messenger.u5.f(document, org.telegram.ui.ActionBar.n6.a7, 0.3f, null), starGift);
        }
    }

    public long getGiftId() {
        return this.a;
    }
}
