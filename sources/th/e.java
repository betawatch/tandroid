package th;

import android.os.Bundle;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import vf.r1;
import vf.v0;
import vf.x0;
import vf.z0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class e extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == -1) {
                    ((g) this.b).finishFragment();
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((n) this.b).finishFragment();
                    break;
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((q) this.b).finishFragment();
                    break;
                }
                break;
            case 3:
                i0 i0Var = ((c0) this.b).h;
                if (i10 != -1) {
                    if (i10 == 3) {
                        i0Var.c.a(true, true);
                        i0Var.setAllowNestedScroll(false);
                        i0Var.P = null;
                        i0Var.D.V2.N(true);
                        i0Var.B.r.getText().clear();
                        i0Var.B.r.requestFocus();
                        AndroidUtilities.showKeyboard(i0Var.B.r);
                        break;
                    }
                } else if (!i0Var.K) {
                    i0Var.v.d.V2.N(false);
                    i0Var.d.D(0);
                    break;
                } else {
                    i0Var.dismiss();
                    break;
                }
                break;
            case 4:
                i0 i0Var2 = ((d0) this.b).r;
                if (i10 != 2) {
                    if (i10 == 3) {
                        i0Var2.b.a(true, true);
                        i0Var2.setAllowNestedScroll(false);
                        TextUtils.isEmpty(i0Var2.O);
                        i0Var2.O = null;
                        i0Var2.C.h(0L, i0Var2.e, 0L, 0L, null, false, null, true);
                        i0Var2.y.r.getText().clear();
                        i0Var2.y.r.requestFocus();
                        AndroidUtilities.showKeyboard(i0Var2.y.r);
                        break;
                    }
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", i0Var2.e);
                    i0Var2.s.presentFragment(new n(bundle));
                    i0Var2.dismiss();
                    break;
                }
                break;
            case 5:
                i0 i0Var3 = ((h0) this.b).h;
                if (i10 == -1) {
                    i0Var3.v.d.V2.N(false);
                    i0Var3.d.D(0);
                    break;
                }
                break;
            case 6:
                vf.c cVar = (vf.c) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        cVar.X();
                        break;
                    }
                } else if (cVar.onBackPressed(true)) {
                    cVar.finishFragment();
                    break;
                }
                break;
            case 7:
                vf.k kVar = (vf.k) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        kVar.h0();
                        break;
                    }
                } else if (kVar.onBackPressed(true)) {
                    kVar.finishFragment();
                    break;
                }
                break;
            case 8:
                vf.l0 l0Var = (vf.l0) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        l0Var.a0();
                        break;
                    }
                } else if (l0Var.onBackPressed(true)) {
                    l0Var.finishFragment();
                    break;
                }
                break;
            case 9:
                vf.n0 n0Var = (vf.n0) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        n0Var.X();
                        break;
                    }
                } else if (n0Var.onBackPressed(true)) {
                    n0Var.finishFragment();
                    break;
                }
                break;
            case 10:
                v0 v0Var = (v0) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        v0Var.W();
                        break;
                    }
                } else if (v0Var.onBackPressed(true)) {
                    v0Var.finishFragment();
                    break;
                }
                break;
            case 11:
                x0 x0Var = (x0) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        x0Var.d0();
                        break;
                    }
                } else if (x0Var.onBackPressed(true)) {
                    x0Var.finishFragment();
                    break;
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((z0) this.b).finishFragment();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((r1) this.b).finishFragment();
                    break;
                }
                break;
        }
    }
}
