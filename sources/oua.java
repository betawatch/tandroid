// default package

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class oua implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sua b;

    public /* synthetic */ oua(sua suaVar, byte b) {
        this.a = b;
        this.b = suaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        byte b = this.a;
        sua suaVar = this.b;
        switch (b) {
            case 0:
                CharSequence text = suaVar.w.getText();
                if (text instanceof Spanned) {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                    if (clickableSpanArr.length > 0) {
                        clickableSpanArr[0].onClick(view);
                        break;
                    }
                }
                break;
            default:
                if (suaVar.P.getVisibility() == 0 && (onClickListener = suaVar.a0) != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
        }
    }
}
