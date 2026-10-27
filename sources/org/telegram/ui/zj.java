package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class zj implements org.telegram.ui.ActionBar.u6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zj(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final boolean a() {
        switch (this.a) {
            case 0:
                return org.telegram.ui.ActionBar.y6.I.q();
            case 1:
                return ((tp0) this.b).S;
            default:
                return ((rc1) this.b).f.a.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final void b(float f7, float f10, int i10, int i11) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.y6.q(f7, f10, i10, i11);
                break;
            case 1:
                org.telegram.ui.ActionBar.y6.q(f7, f10, i10, i11);
                break;
            default:
                ub1 ub1Var = ((rc1) this.b).f.a;
                if (ub1Var == null) {
                    org.telegram.ui.ActionBar.y6.q(f7, f10, i10, i11);
                    break;
                } else {
                    ub1Var.b(f7, f10, i10, i11);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final ColorFilter c() {
        switch (this.a) {
        }
        return org.telegram.ui.ActionBar.y6.v3;
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final Paint d(String str) {
        switch (this.a) {
            case 0:
                return org.telegram.ui.ActionBar.y6.U0(str);
            case 1:
                return org.telegram.ui.ActionBar.y6.U0(str);
            default:
                return ((rc1) this.b).f.a.d(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final int e(int i10) {
        switch (this.a) {
            case 0:
                return g(i10);
            case 1:
                return g(i10);
            default:
                return ((rc1) this.b).f.a.g(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final boolean f() {
        switch (this.a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return ((rc1) this.b).f.a.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final int g(int i10) {
        switch (this.a) {
            case 0:
                return ((wn) this.b).getThemedColor(i10);
            case 1:
                tp0 tp0Var = (tp0) this.b;
                int indexOfKey = tp0Var.v.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return tp0Var.v.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.u6 u6Var = tp0Var.s;
                return u6Var != null ? u6Var.g(i10) : org.telegram.ui.ActionBar.y6.x0(null, i10, false);
            default:
                return ((rc1) this.b).f.a.g(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final Drawable getDrawable(String str) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                tp0 tp0Var = (tp0) this.b;
                if (!str.equals("drawableMsgIn")) {
                    if (!str.equals("drawableMsgInSelected")) {
                        org.telegram.ui.ActionBar.u6 u6Var = tp0Var.s;
                        if (u6Var == null) {
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
                vc1 vc1Var = ((rc1) this.b).f;
                if (!str.equals("drawableMsgOut")) {
                    if (!str.equals("drawableMsgOutSelected")) {
                        if (!str.equals("drawableMsgOutMedia")) {
                            if (!str.equals("drawableMsgOutMediaSelected")) {
                                ub1 ub1Var = vc1Var.a;
                                if (ub1Var == null) {
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
        return org.telegram.ui.ActionBar.y6.Q0(str);
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final /* synthetic */ void h(int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final int i(int i10) {
        switch (this.a) {
            case 0:
                return g(i10);
            case 1:
                return g(i10);
            default:
                return ((rc1) this.b).f.a.i(i10);
        }
    }

    private final /* synthetic */ void j(int i10, int i11) {
    }

    private final /* synthetic */ void k(int i10, int i11) {
    }

    private final /* synthetic */ void l(int i10, int i11) {
    }
}
