// default package

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tl extends ClickableSpan {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public tl(he[] heVarArr, Context context, String str) {
        this.a = (byte) 2;
        this.b = heVarArr;
        this.d = context;
        this.c = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                wi0 wi0Var = (wi0) this.b;
                if (wi0Var != null) {
                    wi0Var.run();
                }
                l11.u(a.b, (String) this.c);
                break;
            case 1:
                ((ui5) this.b).a((ey) this.c, (vjb) this.d);
                break;
            default:
                he heVar = ((he[]) this.b)[0];
                if (heVar != null) {
                    heVar.dismiss();
                }
                l11.u((Context) this.d, "https://t.me/" + ((String) this.c));
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setColor(cmb.v0(cmb.Wc, (ylb) this.d));
                textPaint.setUnderlineText(false);
                break;
            case 1:
            default:
                super.updateDrawState(textPaint);
                break;
            case 2:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
        }
    }

    public /* synthetic */ tl(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
