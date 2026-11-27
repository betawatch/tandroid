// default package

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
