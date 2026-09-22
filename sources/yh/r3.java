package yh;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;

    public /* synthetic */ r3(w3 w3Var, int i10) {
        this.a = i10;
        this.b = w3Var;
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
                w3 w3Var = this.b;
                if (w3Var.N.getVisibility() == 0 && (onClickListener = w3Var.T) != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
        }
    }
}
