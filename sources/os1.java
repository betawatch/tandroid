// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class os1 extends jw1 {
    public fg0 e;
    public int f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ yv1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os1(yv1 yv1Var, Context context, boolean z) {
        super(context);
        this.n = yv1Var;
        this.h = z;
    }

    @Override // jw1
    public final void d() {
        try {
            int themedColor = this.n.getThemedColor(cmb.mf);
            if (this.e != null) {
                Drawable background = getBackground();
                Drawable drawable = this.e;
                if (background == drawable) {
                    if (themedColor != this.f) {
                        cmb.F1(drawable, 436207615 & themedColor, true);
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
            fg0 W = cmb.W(gm.L(19.0f), themedColor & 436207615, this.h ? gm.L(4.0f) : 0, gm.L(3.0f), 0, gm.L(3.0f));
            this.e = W;
            setBackground(W);
            if (getImageView() != null) {
                getImageView().setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            this.f = themedColor;
            if (getTextView() != null) {
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // jw1
    public final void setEditButton(boolean z) {
        super.setEditButton(z);
        if (this.h) {
            getTextView().setMaxWidth(z ? gm.L(116.0f) : ConnectionsManager.DEFAULT_DATACENTER_ID);
        }
    }
}
