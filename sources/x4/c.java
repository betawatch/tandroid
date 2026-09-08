package x4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class c extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public c(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        d dVar = new d(null);
        Drawable newDrawable = this.a.newDrawable();
        dVar.a = newDrawable;
        newDrawable.setCallback(dVar.d);
        return dVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        d dVar = new d(null);
        Drawable newDrawable = this.a.newDrawable(resources);
        dVar.a = newDrawable;
        newDrawable.setCallback(dVar.d);
        return dVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        d dVar = new d(null);
        Drawable newDrawable = this.a.newDrawable(resources, theme);
        dVar.a = newDrawable;
        newDrawable.setCallback(dVar.d);
        return dVar;
    }
}
