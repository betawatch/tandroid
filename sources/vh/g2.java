package vh;

import android.text.TextUtils;
import lh.e8;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w5 b;

    public /* synthetic */ g2(w5 w5Var, int i10) {
        this.a = i10;
        this.b = w5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.x();
                break;
            default:
                w5 w5Var = this.b;
                w5Var.D = null;
                a aVar = w5Var.x;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = w5Var.f.getText().toString();
                        if (!obj.equals(w5Var.E)) {
                            a aVar2 = w5Var.x;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.b).language;
                            int i10 = w5Var.F + 1;
                            w5Var.F = i10;
                            CodeHighlighting.highlightEditable(obj, str, new e8(w5Var, i10, aVar2, obj, 4));
                            break;
                        }
                    }
                }
                break;
        }
    }
}
