// default package

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class q9c extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public q9c(Drawable.ConstantState constantState) {
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
        r9c r9cVar = new r9c();
        r9cVar.b = (VectorDrawable) this.a.newDrawable();
        return r9cVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        r9c r9cVar = new r9c();
        r9cVar.b = (VectorDrawable) this.a.newDrawable(resources);
        return r9cVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        r9c r9cVar = new r9c();
        r9cVar.b = (VectorDrawable) this.a.newDrawable(resources, theme);
        return r9cVar;
    }
}
