// default package

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class uj3 {
    public final /* synthetic */ nk3 a;

    public uj3(nk3 nk3Var) {
        this.a = nk3Var;
    }

    public final long a() {
        nk3 nk3Var = this.a;
        dj3 dj3Var = nk3Var.H3;
        if (dj3Var == null || !(dj3Var.getFragment() instanceof sxb)) {
            return 0L;
        }
        return -((sxb) nk3Var.H3.getFragment()).a;
    }

    public final void b() {
        nk3 nk3Var = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nk3Var.getParentActivity());
        ov9 ov9Var = nk3Var.D0.e0;
        boolean z = ov9Var.O;
        he heVar = alertDialog$Builder.a;
        if (z && ov9Var.O()) {
            heVar.S = jb6.M0(2131751996, null);
            ov9 ov9Var2 = nk3Var.D0.e0;
            ArrayList arrayList = ov9Var2.O ? ov9Var2.w0 : ov9Var2.v0;
            final byte b = 0;
            heVar.U = jb6.G(arrayList != null ? arrayList.size() : 0, "ClearSearchAlertPartial", new Object[0]);
            alertDialog$Builder.j(jb6.M0(2131752038, null), new ee(this) { // from class: tj3
                public final /* synthetic */ uj3 b;

                {
                    this.b = this;
                }

                @Override // ee
                public final void r(he heVar2, int i) {
                    byte b2 = b;
                    uj3 uj3Var = this.b;
                    switch (b2) {
                        case 0:
                            uj3Var.a.D0.e0.E();
                            break;
                        default:
                            nk3 nk3Var2 = uj3Var.a;
                            boolean O = nk3Var2.D0.e0.O();
                            sj3 sj3Var = nk3Var2.D0;
                            if (!O) {
                                ov9 ov9Var3 = sj3Var.e0;
                                ov9Var3.k0.c();
                                ov9Var3.K.clear();
                                ov9Var3.f();
                                break;
                            } else {
                                sj3Var.e0.E();
                                break;
                            }
                    }
                }
            });
        } else {
            heVar.S = jb6.M0(2131751993, null);
            heVar.U = jb6.M0(2131751998, null);
            final byte b2 = 1;
            alertDialog$Builder.j(jb6.M0(2131752036, null), new ee(this) { // from class: tj3
                public final /* synthetic */ uj3 b;

                {
                    this.b = this;
                }

                @Override // ee
                public final void r(he heVar2, int i) {
                    byte b22 = b2;
                    uj3 uj3Var = this.b;
                    switch (b22) {
                        case 0:
                            uj3Var.a.D0.e0.E();
                            break;
                        default:
                            nk3 nk3Var2 = uj3Var.a;
                            boolean O = nk3Var2.D0.e0.O();
                            sj3 sj3Var = nk3Var2.D0;
                            if (!O) {
                                ov9 ov9Var3 = sj3Var.e0;
                                ov9Var3.k0.c();
                                ov9Var3.K.clear();
                                ov9Var3.f();
                                break;
                            } else {
                                sj3Var.e0.E();
                                break;
                            }
                    }
                }
            });
        }
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        nk3Var.showDialog(heVar);
        TextView textView = (TextView) heVar.c(-1);
        if (textView != null) {
            anb.X(textView, cmb.p7, nk3Var.getResourceProvider());
        }
    }

    public final void c() {
        sj3 sj3Var = this.a.D0;
        if (sj3Var != null) {
            w49 w49Var = sj3Var.g0;
            int i = sj3Var.V0;
            w49Var.b(i > 0 ? i + 1 : 0);
            sj3Var.V0 = sj3Var.e0.b();
        }
    }

    public final void d(boolean z, boolean z2) {
        nk3 nk3Var = this.a;
        if (nk3Var.D0.c0.getVisibility() == 0) {
            z2 = true;
        }
        if (nk3Var.l2 && nk3Var.m2) {
            sj3 sj3Var = nk3Var.D0;
            if (sj3Var.c0 != null) {
                if (z || sj3Var.e0.b() != 0) {
                    nk3Var.D0.c0.e(true, z2);
                } else {
                    nk3Var.D0.c0.e(false, z2);
                }
            }
        }
        if (z && nk3Var.D0.e0.b() == 0) {
            sj3 sj3Var2 = nk3Var.D0;
            sj3Var2.g0.a();
            sj3Var2.b0.invalidate();
            sj3Var2.V0 = 0;
        }
    }
}
