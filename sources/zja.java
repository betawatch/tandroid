// default package

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zja extends r7 {
    public final yja A0;
    public boolean B0;
    public n7 C0;
    public boolean D0;
    public boolean E0;

    public zja(Context context, yja yjaVar, int i, int i2, boolean z, ylb ylbVar) {
        super(context, null, i, i2, z, ylbVar);
        this.D0 = true;
        this.E0 = true;
        this.A0 = yjaVar;
        setDelegate(new vja(yjaVar));
    }

    @Override // r7
    public final void F() {
        n7 n7Var = this.C0;
        if (n7Var != null) {
            n7Var.k(getSearchField());
        }
    }

    @Override // r7
    public final void G(boolean z) {
        this.A0.a.C(z, true);
    }

    @Override // r7
    public final r7 K(n7 n7Var) {
        this.C0 = n7Var;
        return this;
    }

    @Override // r7
    public final r7 M() {
        N();
        return this;
    }

    @Override // r7
    public final r7 N() {
        this.B0 = true;
        this.A0.a.setSearchItem(this);
        return this;
    }

    @Override // r7
    public final void P(CharSequence charSequence, boolean z) {
        this.A0.a.setSearchFieldText(charSequence);
    }

    @Override // r7
    public final boolean T(boolean z) {
        rja rjaVar = this.A0.a;
        if (!rjaVar.G) {
            return rjaVar.C(z, true);
        }
        rjaVar.o(z);
        return false;
    }

    public final void X() {
        if (this.D0) {
            return;
        }
        super.setVisibility(8);
    }

    public final void Y(boolean z, boolean z2) {
        boolean z3 = this.D0;
        yja yjaVar = this.A0;
        if (z3 == z) {
            if (!z && !z2 && getVisibility() != 8) {
                super.setVisibility(8);
                yjaVar.f = true;
                yjaVar.requestLayout();
                return;
            } else {
                if (!z || getVisibility() == 0) {
                    return;
                }
                super.setVisibility(0);
                return;
            }
        }
        this.D0 = z;
        if (z) {
            setEnabled(this.E0);
            super.setVisibility(0);
        } else {
            this.E0 = isEnabled();
            setEnabled(false);
            if (!z2 || !isLaidOut() || !yjaVar.isLaidOut()) {
                super.setVisibility(8);
            }
        }
        if (!z2 || !yjaVar.a.y()) {
            yjaVar.f = true;
        }
        yjaVar.requestLayout();
    }

    public yja getParentMenu() {
        return this.A0;
    }

    @Override // r7
    public EditTextBoldCursor getSearchField() {
        return this.A0.a.getSearchField();
    }

    public n7 getSearchListener() {
        return this.C0;
    }

    @Override // r7
    public bka getSubMenuOverlay() {
        return this.A0.a.getMenuOverlay();
    }

    @Override // r7
    public h27 getSubMenuOverlayHost() {
        return this.A0.a;
    }

    @Override // r7
    public final boolean j() {
        yja yjaVar = this.A0;
        return !yjaVar.b || yjaVar.a.x();
    }

    @Override // r7
    public final void o() {
        this.A0.a.setSearchFieldText("");
    }

    @Override // r7
    public void setSearchFieldCaption(CharSequence charSequence) {
        this.A0.a.setSearchFieldCaption(charSequence);
    }

    @Override // r7
    public void setSearchFieldHint(CharSequence charSequence) {
        this.A0.a.setSearchFieldHint(charSequence);
        setContentDescription(charSequence);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        yja yjaVar = this.A0;
        if (yjaVar == null || i == 4) {
            super.setVisibility(i);
            return;
        }
        boolean z = false;
        boolean z2 = i == 0;
        rja rjaVar = yjaVar.a;
        if (yjaVar.isLaidOut() && rjaVar.y() && (!yjaVar.b || (rjaVar.x() && rjaVar.getActionModeFactor() > 0.0f))) {
            z = true;
        }
        Y(z2, z);
    }

    @Override // r7
    public final boolean v() {
        return this.B0;
    }

    @Override // r7
    public final boolean w() {
        return this.A0.a.G;
    }

    @Override // r7
    public final boolean x() {
        return this.A0.a.G;
    }
}
