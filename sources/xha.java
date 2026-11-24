// default package

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class xha extends r7 {
    public final wha A0;
    public boolean B0;
    public n7 C0;
    public boolean D0;
    public boolean E0;

    public xha(Context context, wha whaVar, int i, int i2, boolean z, wjb wjbVar) {
        super(context, null, i, i2, z, wjbVar);
        this.D0 = true;
        this.E0 = true;
        this.A0 = whaVar;
        setDelegate(new tha(whaVar));
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
        pha phaVar = this.A0.a;
        if (!phaVar.G) {
            return phaVar.C(z, true);
        }
        phaVar.n(z);
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
        wha whaVar = this.A0;
        if (z3 == z) {
            if (!z && !z2 && getVisibility() != 8) {
                super.setVisibility(8);
                whaVar.f = true;
                whaVar.requestLayout();
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
            if (!z2 || !isLaidOut() || !whaVar.isLaidOut()) {
                super.setVisibility(8);
            }
        }
        if (!z2 || !whaVar.a.y()) {
            whaVar.f = true;
        }
        whaVar.requestLayout();
    }

    public wha getParentMenu() {
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
    public zha getSubMenuOverlay() {
        return this.A0.a.getMenuOverlay();
    }

    @Override // r7
    public h07 getSubMenuOverlayHost() {
        return this.A0.a;
    }

    @Override // r7
    public final boolean j() {
        wha whaVar = this.A0;
        return !whaVar.b || whaVar.a.x();
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
        wha whaVar = this.A0;
        if (whaVar == null || i == 4) {
            super.setVisibility(i);
            return;
        }
        boolean z = false;
        boolean z2 = i == 0;
        pha phaVar = whaVar.a;
        if (whaVar.isLaidOut() && phaVar.y() && (!whaVar.b || (phaVar.x() && phaVar.getActionModeFactor() > 0.0f))) {
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
