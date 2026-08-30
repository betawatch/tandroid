package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ro0 extends FrameLayout {
    public long a;
    public TL_stars.starGiftAttributeBackdrop b;
    public TL_stars.starGiftAttributePattern c;
    public final FrameLayout d;
    public final kh.u1 e;
    public final org.telegram.ui.Components.p9 f;
    public final kh.y1 h;
    public TLRPC.Document n;

    public ro0(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        kh.u1 u1Var = new kh.u1(frameLayout, f6Var, false);
        this.e = u1Var;
        frameLayout.setBackground(u1Var);
        addView(frameLayout, k7.b6.e(-1, -1, 119));
        k7.d6.b(frameLayout, 0.025f, 1.25f);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f = p9Var;
        frameLayout.addView(p9Var, k7.b6.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
        if (!z4) {
            this.h = null;
            return;
        }
        kh.y1 y1Var = new kh.y1(context);
        this.h = y1Var;
        addView(y1Var, k7.b6.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
    }

    public final void a(int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.a = tL_starGiftUnique.id;
        boolean z4 = i10 % 3 == 1;
        setPadding(z4 ? AndroidUtilities.dp(4.0f) : 0, 0, z4 ? AndroidUtilities.dp(4.0f) : 0, 0);
        c(tL_starGiftUnique.getDocument(), tL_starGiftUnique);
        this.b = (TL_stars.starGiftAttributeBackdrop) lh.t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.c = (TL_stars.starGiftAttributePattern) lh.t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.b;
        kh.u1 u1Var = this.e;
        u1Var.d(stargiftattributebackdrop);
        u1Var.e(this.c);
    }

    public final void b(boolean z4, boolean z10) {
        this.e.f(z4, z10);
        float f10 = z4 ? 0.9f : 1.0f;
        org.telegram.ui.Components.p9 p9Var = this.f;
        if (z10) {
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
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            p9Var.l(ImageLocation.getForDocument(document), "100_100", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "100_100", DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.j6.a7, 0.3f), starGift);
        }
    }

    public long getGiftId() {
        return this.a;
    }
}
