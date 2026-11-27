// default package

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class rh8 extends zh8 {
    public final /* synthetic */ uh8 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh8(uh8 uh8Var, Context context, int i) {
        super(context, i, null, null);
        this.G = uh8Var;
    }

    @Override // zh8
    public final void j(boolean z) {
        this.G.d.n0(this, z);
    }

    @Override // zh8
    public final void k(zh8 zh8Var) {
        this.G.d.o0(zh8Var);
    }

    @Override // zh8
    public final boolean m(ArrayList arrayList) {
        wh8 wh8Var = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        qy qyVar = this.d;
        qyVar.getText().replace(qyVar.getSelectionStart(), qyVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i = 0;
        while (!arrayList.isEmpty() && i < wh8Var.n) {
            for (int length = wh8Var.w.length - 1; length > i; length--) {
                CharSequence[] charSequenceArr = wh8Var.w;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            wh8Var.w[i] = (CharSequence) arrayList.remove(0);
            wh8Var.E++;
            i++;
        }
        wh8Var.u0();
        wh8Var.h0 = (wh8Var.o0 + i) - 1;
        wh8Var.b.f();
        return true;
    }

    @Override // zh8
    public final void h(qy qyVar, ActionMode actionMode) {
    }
}
