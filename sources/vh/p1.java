package vh;

import android.text.Editable;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import org.telegram.messenger.p6;
import org.telegram.ui.Cells.m9;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class p1 implements org.telegram.ui.Components.y4, c1, xd.b {
    public Object a;

    public /* synthetic */ p1(Object obj) {
        this.a = obj;
    }

    @Override // vh.c1
    public void D(CharSequence charSequence) {
        y2 y2Var = ((i5) this.a).B;
        if (y2Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        y2Var.a.t4(charSequence.toString());
    }

    @Override // vh.c1
    public /* synthetic */ boolean F(d1 d1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.y4
    public void J(int i10, int i11, boolean z4) {
        ((y1) this.a).s0(i10, i11, z4);
    }

    @Override // xd.b
    public void L(int i10, float f10, float f11, xd.c cVar) {
        ((xd.h) this.a).i(f10);
    }

    @Override // vh.c1
    public void N(Editable editable) {
        i5 i5Var = (i5) this.a;
        a aVar = i5Var.a;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = i5Var.r.B;
        }
        i5Var.u();
        y2 y2Var = i5Var.B;
        if (y2Var == null || i5Var.a == null) {
            return;
        }
        y2Var.a();
    }

    @Override // vh.c1
    public void O(d1 d1Var, int i10, int i11) {
        y2 y2Var;
        m9 textSelectionHelper;
        i5 i5Var = (i5) this.a;
        if (i5Var.D || i10 == i11 || (y2Var = i5Var.B) == null || (textSelectionHelper = y2Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.y() && textSelectionHelper.W == i5Var) {
            return;
        }
        i5Var.post(new p6(this, d1Var, i11, textSelectionHelper, i10, 6));
    }

    @Override // vh.c1
    public /* synthetic */ boolean R(boolean z4) {
        return false;
    }

    public void a(StringBuilder sb) {
        sb.append(((Boolean) e2.c.g(1, (ArrayList) this.a)).booleanValue() ? "</ol>" : "</ul>");
    }

    public void b(StringBuilder sb) {
        while (!((ArrayList) this.a).isEmpty()) {
            a(sb);
        }
    }

    @Override // vh.c1
    public void c(d1 d1Var) {
        y2 y2Var = ((i5) this.a).B;
        if (y2Var != null) {
            r3 r3Var = y2Var.a;
            r3.M1(r3Var, d1Var);
            r3Var.e3.e(d1Var, true);
        }
    }

    @Override // vh.c1
    public boolean d() {
        i5 i5Var = (i5) this.a;
        y2 y2Var = i5Var.B;
        if (y2Var == null || i5Var.a == null) {
            return false;
        }
        return y2Var.a.S4();
    }

    public String e(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            w9.d dVar = (w9.d) this.a;
            w9.e eVar = new w9.e(stringWriter, dVar.a, dVar.b, dVar.c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override // vh.c1
    public void i(int i10, int i11) {
        c2 c2Var;
        i5 i5Var = (i5) this.a;
        y2 y2Var = i5Var.B;
        if (y2Var == null || i5Var.a == null || (c2Var = y2Var.a.G3) == null) {
            return;
        }
        c2Var.f(i10, i11);
    }

    @Override // vh.c1
    public /* synthetic */ boolean o(d1 d1Var) {
        return false;
    }

    @Override // xd.b
    public void z(float f10, int i10) {
        ((xd.h) this.a).i(f10);
    }

    public p1() {
        this.a = new ArrayList();
    }

    @Override // vh.c1
    public /* synthetic */ void r() {
    }

    @Override // vh.c1
    public /* synthetic */ void G(d1 d1Var) {
    }
}
