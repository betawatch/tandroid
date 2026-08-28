package pf;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Components.c51;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k extends j3 {
    public final /* synthetic */ int x;
    public final /* synthetic */ l y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Context context, String str, int i9, b6 b6Var, int i10) {
        super(context, str, false, false, i9, b6Var);
        this.x = i10;
        switch (i10) {
            case 1:
                this.y = lVar;
                super(context, str, true, false, i9, b6Var);
                break;
            default:
                this.y = lVar;
                break;
        }
    }

    @Override // org.telegram.ui.Cells.j3
    public final void a(boolean z10) {
        c51 c51Var;
        c51 c51Var2;
        switch (this.x) {
            case 0:
                if (z10 && (c51Var = this.y.a) != null) {
                    c51Var.x0(2);
                    break;
                }
                break;
            default:
                if (z10 && (c51Var2 = this.y.a) != null) {
                    c51Var2.x0(3);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.j3
    public final void b(Editable editable) {
        switch (this.x) {
            case 0:
                l lVar = this.y;
                lVar.n.d(lVar.s.getText().toString(), lVar.v.getText().toString());
                lVar.d0(true);
                break;
            default:
                l lVar2 = this.y;
                lVar2.n.d(lVar2.s.getText().toString(), lVar2.v.getText().toString());
                lVar2.d0(true);
                break;
        }
    }
}
