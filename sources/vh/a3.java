package vh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class a3 implements s5 {
    public final /* synthetic */ r3 a;

    public a3(r3 r3Var) {
        this.a = r3Var;
    }

    public final int a(a aVar) {
        int i10;
        r3 r3Var = this.a;
        int indexOf = r3Var.i3.indexOf(aVar);
        return AndroidUtilities.dp((indexOf < 0 || (i10 = indexOf + 1) >= r3Var.i3.size() || ((a) r3Var.i3.get(i10)).c <= 0) ? 11.0f : 5.0f);
    }

    public final int b(a aVar) {
        r3 r3Var = this.a;
        int indexOf = r3Var.i3.indexOf(aVar);
        return AndroidUtilities.dp((indexOf <= 0 || ((a) r3Var.i3.get(indexOf + (-1))).c <= 0) ? 8.0f : 2.0f);
    }

    public final void c(a aVar, int i10) {
        r3 r3Var = this.a;
        p3 p3Var = r3Var.e3;
        if (i10 == 7) {
            r3Var.R4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
        }
        r3Var.Y3 = null;
        r3Var.Z3 = aVar;
        c2 c2Var = r3Var.G3;
        if (c2Var != null) {
            c2Var.d();
        }
        if (aVar != null) {
            v5.f(aVar.b, "");
            View z12 = r3Var.z1(aVar);
            if (z12 instanceof v5) {
                ((v5) z12).getEditText().setTextSilently("");
            }
        }
        c2 c2Var2 = r3Var.G3;
        if (c2Var2 != null) {
            c2Var2.h();
        }
        switch (i10) {
            case 1:
                p3Var.m(3);
                break;
            case 2:
                p3Var.m(6);
                break;
            case 3:
                p.U(r3Var.getContext(), "", new org.telegram.ui.web.y0(r3Var, 26), r3Var.d3);
                break;
            case 4:
            case 5:
                p3Var.m(1);
                break;
            case 6:
                r3Var.t3();
                break;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z4, boolean z10) {
        boolean z11 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        r3 r3Var = this.a;
        if (!z11) {
            r3Var.R4(aVar, pageBlock, i10, i11, z4, z10);
            return;
        }
        if (aVar == null) {
            aVar = r3Var.X4();
        }
        if (aVar != null) {
            ArrayList arrayList = aVar.k;
            if (r3Var.i3.indexOf(aVar) < 0 || r3.x3(aVar) || aVar.i) {
                return;
            }
            c2 c2Var = r3Var.G3;
            if (c2Var != null) {
                c2Var.d();
            }
            boolean z12 = arrayList.isEmpty() && !v5.p(aVar.b);
            if (z12) {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                aVar.b = pageblockblockquote;
            } else {
                if (v5.p(aVar.b)) {
                    long a2 = m0.a();
                    TL_iv.RichText k10 = v5.k(aVar.b);
                    if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                        r3Var.j3.put(Long.valueOf(a2), k10);
                    }
                    arrayList.add(Long.valueOf(a2));
                }
                aVar.b = new TL_iv.pageBlockParagraph();
                arrayList.add(Long.valueOf(m0.a()));
            }
            r3Var.s4();
            if (z12 && (r3Var.findFocus() instanceof d1)) {
                r3Var.X1();
                c2 c2Var2 = r3Var.G3;
                if (c2Var2 != null) {
                    c2Var2.h();
                }
                r3Var.d3(aVar);
                return;
            }
            r3Var.V2.N(false);
            c2 c2Var3 = r3Var.G3;
            if (c2Var3 != null) {
                c2Var3.h();
            }
            r3Var.post(new u2(r3Var, aVar, 5));
        }
    }
}
