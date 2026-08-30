package vh;

import android.text.TextUtils;
import lh.e8;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v5 b;

    public /* synthetic */ f2(v5 v5Var, int i10) {
        this.a = i10;
        this.b = v5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.x();
                break;
            default:
                v5 v5Var = this.b;
                v5Var.D = null;
                a aVar = v5Var.x;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = v5Var.f.getText().toString();
                        if (!obj.equals(v5Var.E)) {
                            a aVar2 = v5Var.x;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.b).language;
                            int i10 = v5Var.F + 1;
                            v5Var.F = i10;
                            CodeHighlighting.highlightEditable(obj, str, new e8(v5Var, i10, aVar2, obj, 4));
                            break;
                        }
                    }
                }
                break;
        }
    }
}
