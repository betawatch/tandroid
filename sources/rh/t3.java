package rh;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class t3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3 b;

    public /* synthetic */ t3(y3 y3Var, int i10) {
        this.a = i10;
        this.b = y3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        switch (this.a) {
            case 0:
                CharSequence text = this.b.w.getText();
                if (text instanceof Spanned) {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                    if (clickableSpanArr.length > 0) {
                        clickableSpanArr[0].onClick(view);
                        break;
                    }
                }
                break;
            default:
                y3 y3Var = this.b;
                if (y3Var.O.getVisibility() == 0 && (onClickListener = y3Var.W) != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
        }
    }
}
