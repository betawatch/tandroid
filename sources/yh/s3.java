package yh;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x3 b;

    public /* synthetic */ s3(x3 x3Var, int i10) {
        this.a = i10;
        this.b = x3Var;
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
                x3 x3Var = this.b;
                if (x3Var.N.getVisibility() == 0 && (onClickListener = x3Var.T) != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
        }
    }
}
