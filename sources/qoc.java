// default package

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qoc implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ toc b;
    public final /* synthetic */ c01 c;

    public /* synthetic */ qoc(toc tocVar, c01 c01Var, byte b) {
        this.a = b;
        this.b = tocVar;
        this.c = c01Var;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        c01 c01Var = this.c;
        toc tocVar = this.b;
        String str = (String) obj;
        switch (b) {
            case 0:
                c01Var.c(false);
                if (str == null) {
                    ui5 parentLayout = tocVar.getParentLayout();
                    if (parentLayout != null) {
                        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj2 = arrayList.get(i);
                            i++;
                            d dVar = (d) obj2;
                            if ((dVar instanceof ypc) || (dVar instanceof bpc) || (dVar instanceof fqc) || (dVar instanceof toc)) {
                                ((ActionBarLayout) parentLayout).c0(dVar, false);
                            }
                        }
                        tocVar.finishFragment();
                        break;
                    } else {
                        tocVar.finishFragment();
                        break;
                    }
                } else {
                    u21.b0(tocVar).f0(str, false);
                    break;
                }
                break;
            default:
                c01Var.c(false);
                ui5 parentLayout2 = tocVar.getParentLayout();
                if (parentLayout2 != null) {
                    ArrayList arrayList2 = new ArrayList(parentLayout2.getFragmentStack());
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj3 = arrayList2.get(i2);
                        i2++;
                        d dVar2 = (d) obj3;
                        if ((dVar2 instanceof ypc) || (dVar2 instanceof bpc) || (dVar2 instanceof fqc)) {
                            ((ActionBarLayout) parentLayout2).c0(dVar2, false);
                        }
                    }
                }
                if (str == null) {
                    m21 I = u21.b0(tocVar).I(R.raw.contact_check, k96.M0(2131742948, null), k96.M0(2131742946, null));
                    I.j = 5000;
                    I.j();
                    break;
                } else {
                    u21.b0(tocVar).f0(str, false);
                    break;
                }
        }
    }
}
