package qh;

import android.view.View;
import java.util.ArrayList;
import kh.i9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class x2 implements p5 {
    public final /* synthetic */ o3 a;

    public x2(o3 o3Var) {
        this.a = o3Var;
    }

    public final int a(a aVar) {
        int i9;
        o3 o3Var = this.a;
        int indexOf = o3Var.h3.indexOf(aVar);
        return AndroidUtilities.dp((indexOf < 0 || (i9 = indexOf + 1) >= o3Var.h3.size() || ((a) o3Var.h3.get(i9)).c <= 0) ? 11.0f : 5.0f);
    }

    public final int b(a aVar) {
        o3 o3Var = this.a;
        int indexOf = o3Var.h3.indexOf(aVar);
        return AndroidUtilities.dp((indexOf <= 0 || ((a) o3Var.h3.get(indexOf + (-1))).c <= 0) ? 8.0f : 2.0f);
    }

    public final void c(a aVar, int i9) {
        o3 o3Var = this.a;
        m3 m3Var = o3Var.d3;
        if (i9 == 7) {
            o3Var.R4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
        }
        o3Var.X3 = null;
        o3Var.Y3 = aVar;
        b2 b2Var = o3Var.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        if (aVar != null) {
            s5.f(aVar.b, "");
            View z12 = o3Var.z1(aVar);
            if (z12 instanceof s5) {
                ((s5) z12).getEditText().setTextSilently("");
            }
        }
        b2 b2Var2 = o3Var.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        switch (i9) {
            case 1:
                m3Var.c0(3);
                break;
            case 2:
                m3Var.c0(6);
                break;
            case 3:
                p.T(o3Var.getContext(), "", new i9(o3Var, 19), o3Var.c3);
                break;
            case 4:
            case 5:
                m3Var.c0(1);
                break;
            case 6:
                o3Var.t3();
                break;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i9, int i10, boolean z10, boolean z11) {
        boolean z12 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        o3 o3Var = this.a;
        if (!z12) {
            o3Var.R4(aVar, pageBlock, i9, i10, z10, z11);
            return;
        }
        if (aVar == null) {
            aVar = o3Var.X4();
        }
        if (aVar != null) {
            ArrayList arrayList = aVar.k;
            if (o3Var.h3.indexOf(aVar) < 0 || o3.x3(aVar) || aVar.i) {
                return;
            }
            b2 b2Var = o3Var.F3;
            if (b2Var != null) {
                b2Var.d();
            }
            boolean z13 = arrayList.isEmpty() && !s5.p(aVar.b);
            if (z13) {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                aVar.b = pageblockblockquote;
            } else {
                if (s5.p(aVar.b)) {
                    long a2 = m0.a();
                    TL_iv.RichText k10 = s5.k(aVar.b);
                    if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                        o3Var.i3.put(Long.valueOf(a2), k10);
                    }
                    arrayList.add(Long.valueOf(a2));
                }
                aVar.b = new TL_iv.pageBlockParagraph();
                arrayList.add(Long.valueOf(m0.a()));
            }
            o3Var.s4();
            if (z13 && (o3Var.findFocus() instanceof d1)) {
                o3Var.X1();
                b2 b2Var2 = o3Var.F3;
                if (b2Var2 != null) {
                    b2Var2.h();
                }
                o3Var.d3(aVar);
                return;
            }
            o3Var.U2.N(false);
            b2 b2Var3 = o3Var.F3;
            if (b2Var3 != null) {
                b2Var3.h();
            }
            o3Var.post(new s2(o3Var, aVar, 5));
        }
    }
}
