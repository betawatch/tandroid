package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zc0 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jd0 b;

    public /* synthetic */ zc0(jd0 jd0Var, int i7) {
        this.a = i7;
        this.b = jd0Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                jd0 jd0Var = this.b;
                jd0Var.c(true);
                jd0Var.u0.M1(0, true, null, true);
                break;
            default:
                this.b.u0.M1(0, true, null, true);
                break;
        }
    }
}
