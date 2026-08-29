package sf;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Components.o51;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k extends g3 {
    public final /* synthetic */ int x;
    public final /* synthetic */ l y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Context context, String str, int i10, c6 c6Var, int i11) {
        super(context, str, false, false, i10, c6Var);
        this.x = i11;
        switch (i11) {
            case 1:
                this.y = lVar;
                super(context, str, true, false, i10, c6Var);
                break;
            default:
                this.y = lVar;
                break;
        }
    }

    @Override // org.telegram.ui.Cells.g3
    public final void a(boolean z10) {
        o51 o51Var;
        o51 o51Var2;
        switch (this.x) {
            case 0:
                if (z10 && (o51Var = this.y.a) != null) {
                    o51Var.x0(2);
                    break;
                }
                break;
            default:
                if (z10 && (o51Var2 = this.y.a) != null) {
                    o51Var2.x0(3);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.g3
    public final void b(Editable editable) {
        switch (this.x) {
            case 0:
                l lVar = this.y;
                lVar.n.d(lVar.s.getText().toString(), lVar.v.getText().toString());
                lVar.e0(true);
                break;
            default:
                l lVar2 = this.y;
                lVar2.n.d(lVar2.s.getText().toString(), lVar2.v.getText().toString());
                lVar2.e0(true);
                break;
        }
    }
}
