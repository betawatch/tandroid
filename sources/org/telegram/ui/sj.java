package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class sj extends org.telegram.ui.Components.xc {
    public org.telegram.ui.Cells.y e;
    public int f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ an n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj(an anVar, Context context, boolean z9) {
        super(context);
        this.n = anVar;
        this.h = z9;
    }

    @Override // org.telegram.ui.Components.xc
    public final void d() {
        try {
            int themedColor = this.n.getThemedColor(org.telegram.ui.ActionBar.k6.kf);
            if (this.e != null) {
                Drawable background = getBackground();
                Drawable drawable = this.e;
                if (background == drawable) {
                    if (themedColor != this.f) {
                        org.telegram.ui.ActionBar.k6.H1(drawable, themedColor & 436207615, true);
                    }
                    if (getImageView() != null && (themedColor != this.f || getImageView().getColorFilter() == null)) {
                        getImageView().setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                    }
                    this.f = themedColor;
                    if (getTextView() != null || getTextView().getCurrentTextColor() == themedColor) {
                    }
                    getTextView().setTextColor(themedColor);
                    return;
                }
            }
            org.telegram.ui.Cells.y Y = org.telegram.ui.ActionBar.k6.Y(org.telegram.messenger.g0.L(19.0f), themedColor & 436207615, this.h ? org.telegram.messenger.g0.L(4.0f) : 0, org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f));
            this.e = Y;
            setBackground(Y);
            if (getImageView() != null) {
                getImageView().setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            this.f = themedColor;
            if (getTextView() != null) {
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.xc
    public final void setEditButton(boolean z9) {
        super.setEditButton(z9);
        if (this.h) {
            getTextView().setMaxWidth(z9 ? org.telegram.messenger.g0.L(116.0f) : ConnectionsManager.DEFAULT_DATACENTER_ID);
        }
    }
}
