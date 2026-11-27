// default package

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class qdc extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public qdc(Drawable.ConstantState constantState) {
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
        rdc rdcVar = new rdc();
        rdcVar.b = (VectorDrawable) this.a.newDrawable();
        return rdcVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        rdc rdcVar = new rdc();
        rdcVar.b = (VectorDrawable) this.a.newDrawable(resources);
        return rdcVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        rdc rdcVar = new rdc();
        rdcVar.b = (VectorDrawable) this.a.newDrawable(resources, theme);
        return rdcVar;
    }
}
