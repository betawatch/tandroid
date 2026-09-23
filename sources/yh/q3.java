package yh;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class q3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v3 b;

    public /* synthetic */ q3(v3 v3Var, int i10) {
        this.a = i10;
        this.b = v3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        switch (this.a) {
            case 0:
                CharSequence text = this.b.v.getText();
                if (text instanceof Spanned) {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                    if (clickableSpanArr.length > 0) {
                        clickableSpanArr[0].onClick(view);
                        break;
                    }
                }
                break;
            default:
                v3 v3Var = this.b;
                if (v3Var.N.getVisibility() == 0 && (onClickListener = v3Var.T) != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
        }
    }
}
