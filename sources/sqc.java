// default package

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class sqc implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vqc b;
    public final /* synthetic */ k11 c;

    public /* synthetic */ sqc(vqc vqcVar, k11 k11Var, byte b) {
        this.a = b;
        this.b = vqcVar;
        this.c = k11Var;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        k11 k11Var = this.c;
        vqc vqcVar = this.b;
        String str = (String) obj;
        switch (b) {
            case 0:
                k11Var.c(false);
                if (str == null) {
                    tk5 parentLayout = vqcVar.getParentLayout();
                    if (parentLayout != null) {
                        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj2 = arrayList.get(i);
                            i++;
                            d dVar = (d) obj2;
                            if ((dVar instanceof asc) || (dVar instanceof drc) || (dVar instanceof hsc) || (dVar instanceof vqc)) {
                                ((ActionBarLayout) parentLayout).c0(dVar, false);
                            }
                        }
                        vqcVar.finishFragment();
                        break;
                    } else {
                        vqcVar.finishFragment();
                        break;
                    }
                } else {
                    c41.b0(vqcVar).f0(str, false);
                    break;
                }
                break;
            default:
                k11Var.c(false);
                tk5 parentLayout2 = vqcVar.getParentLayout();
                if (parentLayout2 != null) {
                    ArrayList arrayList2 = new ArrayList(parentLayout2.getFragmentStack());
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj3 = arrayList2.get(i2);
                        i2++;
                        d dVar2 = (d) obj3;
                        if ((dVar2 instanceof asc) || (dVar2 instanceof drc) || (dVar2 instanceof hsc)) {
                            ((ActionBarLayout) parentLayout2).c0(dVar2, false);
                        }
                    }
                }
                if (str == null) {
                    u31 I = c41.b0(vqcVar).I(R.raw.contact_check, jb6.M0(2131742874, null), jb6.M0(2131742872, null));
                    I.j = 5000;
                    I.j();
                    break;
                } else {
                    c41.b0(vqcVar).f0(str, false);
                    break;
                }
        }
    }
}
