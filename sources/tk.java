// default package

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class tk extends ClickableSpan {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public tk(hd[] hdVarArr, Context context, String str) {
        this.a = (byte) 2;
        this.b = hdVarArr;
        this.d = context;
        this.c = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                wh0 wh0Var = (wh0) this.b;
                if (wh0Var != null) {
                    wh0Var.run();
                }
                d01.t(a.b, (String) this.c);
                break;
            case 1:
                ((vg5) this.b).a((dx) this.c, (thb) this.d);
                break;
            default:
                hd hdVar = ((hd[]) this.b)[0];
                if (hdVar != null) {
                    hdVar.dismiss();
                }
                d01.t((Context) this.d, "https://t.me/" + ((String) this.c));
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setColor(bkb.v0(bkb.Wc, (wjb) this.d));
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

    public /* synthetic */ tk(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
