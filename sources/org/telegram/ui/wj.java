package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class wj implements org.telegram.ui.ActionBar.g6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wj(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final boolean a() {
        switch (this.a) {
            case 0:
                return org.telegram.ui.ActionBar.k6.I.q();
            case 1:
                return ((lp0) this.b).S;
            default:
                return ((mc1) this.b).f.a.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final void b(float f7, float f10, int i10, int i11) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.k6.q(f7, f10, i10, i11);
                break;
            case 1:
                org.telegram.ui.ActionBar.k6.q(f7, f10, i10, i11);
                break;
            default:
                qb1 qb1Var = ((mc1) this.b).f.a;
                if (qb1Var == null) {
                    org.telegram.ui.ActionBar.k6.q(f7, f10, i10, i11);
                    break;
                } else {
                    qb1Var.b(f7, f10, i10, i11);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final ColorFilter c() {
        switch (this.a) {
        }
        return org.telegram.ui.ActionBar.k6.v3;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final Paint d(String str) {
        switch (this.a) {
            case 0:
                return org.telegram.ui.ActionBar.k6.U0(str);
            case 1:
                return org.telegram.ui.ActionBar.k6.U0(str);
            default:
                return ((mc1) this.b).f.a.d(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final int e(int i10) {
        switch (this.a) {
            case 0:
                return g(i10);
            case 1:
                return g(i10);
            default:
                return ((mc1) this.b).f.a.g(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final boolean f() {
        switch (this.a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return ((mc1) this.b).f.a.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final int g(int i10) {
        switch (this.a) {
            case 0:
                return ((sn) this.b).getThemedColor(i10);
            case 1:
                lp0 lp0Var = (lp0) this.b;
                int indexOfKey = lp0Var.v.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return lp0Var.v.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.g6 g6Var = lp0Var.s;
                return g6Var != null ? g6Var.g(i10) : org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            default:
                return ((mc1) this.b).f.a.g(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final Drawable getDrawable(String str) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                lp0 lp0Var = (lp0) this.b;
                if (!str.equals("drawableMsgIn")) {
                    if (!str.equals("drawableMsgInSelected")) {
                        org.telegram.ui.ActionBar.g6 g6Var = lp0Var.s;
                        if (g6Var == null) {
                            break;
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            default:
                qc1 qc1Var = ((mc1) this.b).f;
                if (!str.equals("drawableMsgOut")) {
                    if (!str.equals("drawableMsgOutSelected")) {
                        if (!str.equals("drawableMsgOutMedia")) {
                            if (!str.equals("drawableMsgOutMediaSelected")) {
                                qb1 qb1Var = qc1Var.a;
                                if (qb1Var == null) {
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
        }
        return org.telegram.ui.ActionBar.k6.Q0(str);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final /* synthetic */ void h(int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final int i(int i10) {
        switch (this.a) {
            case 0:
                return g(i10);
            case 1:
                return g(i10);
            default:
                return ((mc1) this.b).f.a.i(i10);
        }
    }

    private final /* synthetic */ void j(int i10, int i11) {
    }

    private final /* synthetic */ void k(int i10, int i11) {
    }

    private final /* synthetic */ void l(int i10, int i11) {
    }
}
