package zh;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t3 b;

    public /* synthetic */ p3(t3 t3Var, int i10) {
        this.a = i10;
        this.b = t3Var;
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
                t3 t3Var = this.b;
                if (t3Var.N.getVisibility() == 0 && (onClickListener = t3Var.T) != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
        }
    }
}
