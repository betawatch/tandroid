// default package

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class sla extends s7 {
    public final rla A0;
    public boolean B0;
    public o7 C0;
    public boolean D0;
    public boolean E0;

    public sla(Context context, rla rlaVar, int i, int i2, boolean z, vnb vnbVar) {
        super(context, null, i, i2, z, vnbVar);
        this.D0 = true;
        this.E0 = true;
        this.A0 = rlaVar;
        setDelegate(new ola(rlaVar));
    }

    @Override // s7
    public final void F() {
        o7 o7Var = this.C0;
        if (o7Var != null) {
            o7Var.k(getSearchField());
        }
    }

    @Override // s7
    public final void G(boolean z) {
        this.A0.a.F(z, true);
    }

    @Override // s7
    public final s7 K(o7 o7Var) {
        this.C0 = o7Var;
        return this;
    }

    @Override // s7
    public final s7 M() {
        N();
        return this;
    }

    @Override // s7
    public final s7 N() {
        this.B0 = true;
        this.A0.a.setSearchItem(this);
        return this;
    }

    @Override // s7
    public final void P(CharSequence charSequence, boolean z) {
        this.A0.a.setSearchFieldText(charSequence);
    }

    @Override // s7
    public final boolean T(boolean z) {
        jla jlaVar = this.A0.a;
        if (!jlaVar.L) {
            return jlaVar.F(z, true);
        }
        jlaVar.o(z);
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
        rla rlaVar = this.A0;
        if (z3 == z) {
            if (!z && !z2 && getVisibility() != 8) {
                super.setVisibility(8);
                rlaVar.f = true;
                rlaVar.requestLayout();
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
            if (!z2 || !isLaidOut() || !rlaVar.isLaidOut()) {
                super.setVisibility(8);
            }
        }
        if (!z2 || !rlaVar.a.A()) {
            rlaVar.f = true;
        }
        rlaVar.requestLayout();
    }

    public rla getParentMenu() {
        return this.A0;
    }

    @Override // s7
    public EditTextBoldCursor getSearchField() {
        return this.A0.a.getSearchField();
    }

    public o7 getSearchListener() {
        return this.C0;
    }

    @Override // s7
    public ula getSubMenuOverlay() {
        return this.A0.a.getMenuOverlay();
    }

    @Override // s7
    public o27 getSubMenuOverlayHost() {
        return this.A0.a;
    }

    @Override // s7
    public final boolean j() {
        rla rlaVar = this.A0;
        return !rlaVar.b || rlaVar.a.z();
    }

    @Override // s7
    public final void o() {
        this.A0.a.setSearchFieldText("");
    }

    @Override // s7
    public void setSearchFieldCaption(CharSequence charSequence) {
        this.A0.a.setSearchFieldCaption(charSequence);
    }

    @Override // s7
    public void setSearchFieldHint(CharSequence charSequence) {
        this.A0.a.setSearchFieldHint(charSequence);
        setContentDescription(charSequence);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        rla rlaVar = this.A0;
        if (rlaVar == null || i == 4) {
            super.setVisibility(i);
            return;
        }
        boolean z = false;
        boolean z2 = i == 0;
        jla jlaVar = rlaVar.a;
        if (rlaVar.isLaidOut() && jlaVar.A() && (!rlaVar.b || (jlaVar.z() && jlaVar.getActionModeFactor() > 0.0f))) {
            z = true;
        }
        Y(z2, z);
    }

    @Override // s7
    public final boolean v() {
        return this.B0;
    }

    @Override // s7
    public final boolean w() {
        return this.A0.a.L;
    }

    @Override // s7
    public final boolean x() {
        return this.A0.a.L;
    }
}
