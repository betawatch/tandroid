// default package

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class xib extends m74 {
    public final Rect o;
    public final /* synthetic */ zib p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xib(zib zibVar, zib zibVar2) {
        super(zibVar2);
        this.p = zibVar;
        this.o = new Rect();
    }

    @Override // m74
    public final int g(float f, float f2) {
        int i;
        zib zibVar = this.p;
        int childCount = zibVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            sib d = zibVar.d(i2);
            if (d.k > 0 && (i = d.l) > 0) {
                if (f >= d.p && f < r5 + r3) {
                    if (f2 >= d.q && f2 < r2 + i) {
                        return i2;
                    }
                }
            }
        }
        return TLObject.FLAG_31;
    }

    @Override // m74
    public final void h(ArrayList arrayList) {
        zib zibVar = this.p;
        int childCount = zibVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            sib d = zibVar.d(i);
            if (d.k > 0 && d.l > 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
    }

    @Override // m74
    public final void l(int i, v4 v4Var) {
        Rect rect = this.o;
        if (i >= 0) {
            zib zibVar = this.p;
            if (i < zibVar.getChildCount()) {
                sib d = zibVar.d(i);
                int i2 = d.p;
                int i3 = d.q;
                rect.set(i2, i3, d.k + i2, d.l + i3);
                v4Var.h(rect);
                v4Var.i("android.widget.TextView");
                v4Var.a.setEnabled(true);
                rib ribVar = d.b;
                CharSequence text = ribVar != null ? ribVar.getText() : null;
                if (text == null || text.length() == 0) {
                    text = " ";
                }
                v4Var.o(text);
                TL_iv.pageTableCell pagetablecell = d.c;
                if (pagetablecell == null || !pagetablecell.header) {
                    return;
                }
                v4Var.k(true);
                return;
            }
        }
        rect.set(0, 0, 1, 1);
        v4Var.h(rect);
        v4Var.p(false);
        v4Var.j("");
    }
}
