// default package

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class osa implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ssa b;

    public /* synthetic */ osa(ssa ssaVar, byte b) {
        this.a = b;
        this.b = ssaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        byte b = this.a;
        ssa ssaVar = this.b;
        switch (b) {
            case 0:
                CharSequence text = ssaVar.w.getText();
                if (text instanceof Spanned) {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                    if (clickableSpanArr.length > 0) {
                        clickableSpanArr[0].onClick(view);
                        break;
                    }
                }
                break;
            default:
                if (ssaVar.P.getVisibility() == 0 && (onClickListener = ssaVar.a0) != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
        }
    }
}
