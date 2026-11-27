// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class pr1 extends kv1 {
    public hf0 e;
    public int f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ zu1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr1(zu1 zu1Var, Context context, boolean z) {
        super(context);
        this.n = zu1Var;
        this.h = z;
    }

    @Override // kv1
    public final void d() {
        try {
            int themedColor = this.n.getThemedColor(aob.nf);
            if (this.e != null) {
                Drawable background = getBackground();
                Drawable drawable = this.e;
                if (background == drawable) {
                    if (themedColor != this.f) {
                        aob.F1(drawable, 436207615 & themedColor, true);
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
            hf0 W = aob.W(hl.L(19.0f), themedColor & 436207615, this.h ? hl.L(4.0f) : 0, hl.L(3.0f), 0, hl.L(3.0f));
            this.e = W;
            setBackground(W);
            if (getImageView() != null) {
                getImageView().setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            this.f = themedColor;
            if (getTextView() != null) {
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // kv1
    public final void setEditButton(boolean z) {
        super.setEditButton(z);
        if (this.h) {
            getTextView().setMaxWidth(z ? hl.L(116.0f) : ConnectionsManager.DEFAULT_DATACENTER_ID);
        }
    }
}
