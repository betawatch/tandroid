package uf;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Components.a61;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class j extends i3 {
    public final /* synthetic */ int x;
    public final /* synthetic */ k y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Context context, String str, int i10, f6 f6Var, int i11) {
        super(context, str, false, false, i10, f6Var);
        this.x = i11;
        switch (i11) {
            case 1:
                this.y = kVar;
                super(context, str, true, false, i10, f6Var);
                break;
            default:
                this.y = kVar;
                break;
        }
    }

    @Override // org.telegram.ui.Cells.i3
    public final void a(boolean z4) {
        a61 a61Var;
        a61 a61Var2;
        switch (this.x) {
            case 0:
                if (z4 && (a61Var = this.y.a) != null) {
                    a61Var.x0(2);
                    break;
                }
                break;
            default:
                if (z4 && (a61Var2 = this.y.a) != null) {
                    a61Var2.x0(3);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.i3
    public final void b(Editable editable) {
        switch (this.x) {
            case 0:
                k kVar = this.y;
                kVar.n.d(kVar.s.getText().toString(), kVar.v.getText().toString());
                kVar.e0(true);
                break;
            default:
                k kVar2 = this.y;
                kVar2.n.d(kVar2.s.getText().toString(), kVar2.v.getText().toString());
                kVar2.e0(true);
                break;
        }
    }
}
