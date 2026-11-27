// default package

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class uk extends ClickableSpan {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public uk(id[] idVarArr, Context context, String str) {
        this.a = (byte) 2;
        this.b = idVarArr;
        this.d = context;
        this.c = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                xh0 xh0Var = (xh0) this.b;
                if (xh0Var != null) {
                    xh0Var.run();
                }
                m01.u(a.b, (String) this.c);
                break;
            case 1:
                ((xi5) this.b).a((ex) this.c, (plb) this.d);
                break;
            default:
                id idVar = ((id[]) this.b)[0];
                if (idVar != null) {
                    idVar.dismiss();
                }
                m01.u((Context) this.d, "https://t.me/" + ((String) this.c));
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setColor(aob.v0(aob.Xc, (vnb) this.d));
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

    public /* synthetic */ uk(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
