// default package

import android.view.KeyEvent;
import android.view.View;
import android.webkit.JsPromptResult;
import android.widget.TextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class xu0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xu0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                if (i != 6) {
                    return false;
                }
                boolean[] zArr = (boolean[]) obj4;
                if (!zArr[0]) {
                    zArr[0] = true;
                    ((JsPromptResult) obj3).confirm(((gt3) obj2).getText().toString());
                    ((hd) obj).dismiss();
                }
                return true;
            default:
                dq8 dq8Var = (dq8) obj4;
                if (i != 6) {
                    return false;
                }
                String obj5 = dq8Var.getText().toString();
                if (obj5.length() <= 0 || obj5.length() > 12) {
                    gl.A3(dq8Var);
                } else {
                    ((p8c) obj3).a(obj5);
                    hd hdVar = ((hd[]) obj2)[0];
                    if (hdVar != null) {
                        hdVar.dismiss();
                    }
                    View view = (View) obj;
                    if (view != null) {
                        view.requestFocus();
                    }
                }
                return true;
        }
    }
}
