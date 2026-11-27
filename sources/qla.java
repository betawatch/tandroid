// default package

import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class qla implements z66, ve3 {
    public final View a;
    public boolean b;
    public float c = 1.0f;
    public float d = 1.0f;
    public float e = 1.0f;

    public qla(View view) {
        this.a = view;
    }

    @Override // ve3
    public final void a() {
        View view = this.a;
        if (rla.g(view)) {
            return;
        }
        if (view instanceof sla) {
            ((sla) view).X();
        } else {
            view.setVisibility(8);
        }
        c(1.0f, 1.0f);
    }

    @Override // z66
    public final int b(boolean z) {
        return 0;
    }

    public final void c(float f, float f2) {
        float f3 = this.c;
        if (f3 == f && this.d == f2) {
            return;
        }
        View view = this.a;
        if (f3 == 1.0f) {
            this.e = view.getAlpha();
        }
        this.c = f;
        this.d = f2;
        view.setAlpha(this.e * f);
        float min = Math.min(hl.R1(0.6f, 1.0f, f), f2);
        view.setScaleX(min);
        view.setScaleY(min);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qla) && ((qla) obj).a == this.a;
    }

    @Override // z66
    public final int getHeight() {
        return this.a.getMeasuredHeight();
    }

    @Override // z66
    public final int getWidth() {
        return rla.e(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
