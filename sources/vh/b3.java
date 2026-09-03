package vh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class b3 implements t5 {
    public final /* synthetic */ s3 a;

    public b3(s3 s3Var) {
        this.a = s3Var;
    }

    public final int a(a aVar) {
        int i10;
        s3 s3Var = this.a;
        int indexOf = s3Var.i3.indexOf(aVar);
        return AndroidUtilities.dp((indexOf < 0 || (i10 = indexOf + 1) >= s3Var.i3.size() || ((a) s3Var.i3.get(i10)).c <= 0) ? 11.0f : 5.0f);
    }

    public final int b(a aVar) {
        s3 s3Var = this.a;
        int indexOf = s3Var.i3.indexOf(aVar);
        return AndroidUtilities.dp((indexOf <= 0 || ((a) s3Var.i3.get(indexOf + (-1))).c <= 0) ? 8.0f : 2.0f);
    }

    public final void c(a aVar, int i10) {
        s3 s3Var = this.a;
        q3 q3Var = s3Var.e3;
        if (i10 == 7) {
            s3Var.Q4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
        }
        s3Var.Y3 = null;
        s3Var.Z3 = aVar;
        d2 d2Var = s3Var.G3;
        if (d2Var != null) {
            d2Var.d();
        }
        if (aVar != null) {
            w5.f(aVar.b, "");
            View y12 = s3Var.y1(aVar);
            if (y12 instanceof w5) {
                ((w5) y12).getEditText().setTextSilently("");
            }
        }
        d2 d2Var2 = s3Var.G3;
        if (d2Var2 != null) {
            d2Var2.h();
        }
        switch (i10) {
            case 1:
                q3Var.n(3);
                break;
            case 2:
                q3Var.n(6);
                break;
            case 3:
                q.U(s3Var.getContext(), "", new org.telegram.ui.web.a1(s3Var, 26), s3Var.d3);
                break;
            case 4:
            case 5:
                q3Var.n(1);
                break;
            case 6:
                s3Var.s3();
                break;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z4, boolean z10) {
        boolean z11 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        s3 s3Var = this.a;
        if (!z11) {
            s3Var.Q4(aVar, pageBlock, i10, i11, z4, z10);
            return;
        }
        if (aVar == null) {
            aVar = s3Var.W4();
        }
        if (aVar != null) {
            ArrayList arrayList = aVar.k;
            if (s3Var.i3.indexOf(aVar) < 0 || s3.w3(aVar) || aVar.i) {
                return;
            }
            d2 d2Var = s3Var.G3;
            if (d2Var != null) {
                d2Var.d();
            }
            boolean z12 = arrayList.isEmpty() && !w5.p(aVar.b);
            if (z12) {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                aVar.b = pageblockblockquote;
            } else {
                if (w5.p(aVar.b)) {
                    long a2 = n0.a();
                    TL_iv.RichText k10 = w5.k(aVar.b);
                    if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                        s3Var.j3.put(Long.valueOf(a2), k10);
                    }
                    arrayList.add(Long.valueOf(a2));
                }
                aVar.b = new TL_iv.pageBlockParagraph();
                arrayList.add(Long.valueOf(n0.a()));
            }
            s3Var.r4();
            if (z12 && (s3Var.findFocus() instanceof e1)) {
                s3Var.W1();
                d2 d2Var2 = s3Var.G3;
                if (d2Var2 != null) {
                    d2Var2.h();
                }
                s3Var.c3(aVar);
                return;
            }
            s3Var.V2.N(false);
            d2 d2Var3 = s3Var.G3;
            if (d2Var3 != null) {
                d2Var3.h();
            }
            s3Var.post(new v2(s3Var, aVar, 5));
        }
    }
}
