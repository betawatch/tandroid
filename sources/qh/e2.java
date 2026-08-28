package qh;

import android.text.TextUtils;
import gh.g8;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s5 b;

    public /* synthetic */ e2(s5 s5Var, int i9) {
        this.a = i9;
        this.b = s5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.x();
                break;
            default:
                s5 s5Var = this.b;
                s5Var.C = null;
                a aVar = s5Var.x;
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = s5Var.f.getText().toString();
                        if (!obj.equals(s5Var.D)) {
                            a aVar2 = s5Var.x;
                            String str = ((TL_iv.pageBlockPreformatted) aVar2.b).language;
                            int i9 = s5Var.E + 1;
                            s5Var.E = i9;
                            CodeHighlighting.highlightEditable(obj, str, new g8(s5Var, i9, aVar2, obj, 4));
                            break;
                        }
                    }
                }
                break;
        }
    }
}
