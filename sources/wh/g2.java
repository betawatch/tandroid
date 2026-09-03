package wh;

import android.text.TextUtils;
import mh.e8;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v5 b;

    public /* synthetic */ g2(v5 v5Var, int i10) {
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
