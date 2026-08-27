package qf;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Components.e51;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class l extends g3 {
    public final /* synthetic */ int x;
    public final /* synthetic */ m y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Context context, String str, int i10, c6 c6Var, int i11) {
        super(context, str, false, false, i10, c6Var);
        this.x = i11;
        switch (i11) {
            case 1:
                this.y = mVar;
                super(context, str, true, false, i10, c6Var);
                break;
            default:
                this.y = mVar;
                break;
        }
    }

    @Override // org.telegram.ui.Cells.g3
    public final void a(boolean z10) {
        e51 e51Var;
        e51 e51Var2;
        switch (this.x) {
            case 0:
                if (z10 && (e51Var = this.y.a) != null) {
                    e51Var.x0(2);
                    break;
                }
                break;
            default:
                if (z10 && (e51Var2 = this.y.a) != null) {
                    e51Var2.x0(3);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.g3
    public final void b(Editable editable) {
        switch (this.x) {
            case 0:
                m mVar = this.y;
                mVar.n.d(mVar.s.getText().toString(), mVar.v.getText().toString());
                mVar.e0(true);
                break;
            default:
                m mVar2 = this.y;
                mVar2.n.d(mVar2.s.getText().toString(), mVar2.v.getText().toString());
                mVar2.e0(true);
                break;
        }
    }
}
