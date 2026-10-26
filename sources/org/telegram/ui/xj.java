package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class xj implements org.telegram.ui.ActionBar.u6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xj(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final boolean a() {
        switch (this.a) {
            case 0:
                return org.telegram.ui.ActionBar.y6.I.q();
            case 1:
                return ((rp0) this.b).S;
            default:
                return ((pc1) this.b).f.a.a();
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
                sb1 sb1Var = ((pc1) this.b).f.a;
                if (sb1Var == null) {
                    org.telegram.ui.ActionBar.y6.q(f7, f10, i10, i11);
                    break;
                } else {
                    sb1Var.b(f7, f10, i10, i11);
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
                return ((pc1) this.b).f.a.d(str);
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
                return ((pc1) this.b).f.a.g(i10);
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
                return ((pc1) this.b).f.a.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final int g(int i10) {
        switch (this.a) {
            case 0:
                return ((un) this.b).getThemedColor(i10);
            case 1:
                rp0 rp0Var = (rp0) this.b;
                int indexOfKey = rp0Var.v.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return rp0Var.v.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.u6 u6Var = rp0Var.s;
                return u6Var != null ? u6Var.g(i10) : org.telegram.ui.ActionBar.y6.x0(null, i10, false);
            default:
                return ((pc1) this.b).f.a.g(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final Drawable getDrawable(String str) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                rp0 rp0Var = (rp0) this.b;
                if (!str.equals("drawableMsgIn")) {
                    if (!str.equals("drawableMsgInSelected")) {
                        org.telegram.ui.ActionBar.u6 u6Var = rp0Var.s;
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
                tc1 tc1Var = ((pc1) this.b).f;
                if (!str.equals("drawableMsgOut")) {
                    if (!str.equals("drawableMsgOutSelected")) {
                        if (!str.equals("drawableMsgOutMedia")) {
                            if (!str.equals("drawableMsgOutMediaSelected")) {
                                sb1 sb1Var = tc1Var.a;
                                if (sb1Var == null) {
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
                return ((pc1) this.b).f.a.i(i10);
        }
    }

    private final /* synthetic */ void j(int i10, int i11) {
    }

    private final /* synthetic */ void k(int i10, int i11) {
    }

    private final /* synthetic */ void l(int i10, int i11) {
    }
}
