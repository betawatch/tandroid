// default package

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rbc extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public rbc(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        sbc sbcVar = new sbc();
        sbcVar.b = (VectorDrawable) this.a.newDrawable();
        return sbcVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        sbc sbcVar = new sbc();
        sbcVar.b = (VectorDrawable) this.a.newDrawable(resources);
        return sbcVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        sbc sbcVar = new sbc();
        sbcVar.b = (VectorDrawable) this.a.newDrawable(resources, theme);
        return sbcVar;
    }
}
