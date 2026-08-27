package rh;

import android.text.TextUtils;
import hh.f8;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t5 b;

    public /* synthetic */ e2(t5 t5Var, int i10) {
        this.a = i10;
        this.b = t5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.x();
                break;
            default:
                t5 t5Var = this.b;
                t5Var.C = null;
                a aVar = t5Var.x;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = t5Var.f.getText().toString();
                        if (!obj.equals(t5Var.D)) {
                            a aVar2 = t5Var.x;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.b).language;
                            int i10 = t5Var.E + 1;
                            t5Var.E = i10;
                            CodeHighlighting.highlightEditable(obj, str, new f8(t5Var, i10, aVar2, obj, 4));
                            break;
                        }
                    }
                }
                break;
        }
    }
}
