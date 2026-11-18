package ze;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import hi.g;
import hi.n;
import org.telegram.messenger.a8;
import org.telegram.messenger.j6;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q90;
import ug.n0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class b implements q90 {
    public final /* synthetic */ int a = 0;
    public Object b;

    public /* synthetic */ b() {
    }

    @Override // org.telegram.ui.Components.q90
    public Paint.FontMetricsInt P() {
        return ((n) this.b).f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // org.telegram.ui.Components.q90
    public void l0(int i7, int i10, CharSequence charSequence, boolean z10) {
        g gVar = ((n) this.b).f;
        if (gVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gVar.getText());
            spannableStringBuilder.replace(i7, i10 + i7, charSequence);
            if (z10) {
                j6.l(spannableStringBuilder, gVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            gVar.setText(spannableStringBuilder);
            gVar.setSelection(i7 + charSequence.length());
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                c cVar = c.e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((n0) this.b).m());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    public b(n nVar) {
        this.b = nVar;
    }

    @Override // org.telegram.ui.Components.q90
    public /* synthetic */ void q0(String str) {
    }

    @Override // org.telegram.ui.Components.q90
    public /* synthetic */ void Y(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override // org.telegram.ui.Components.q90
    public /* synthetic */ void g(TLRPC.BotInlineResult botInlineResult, boolean z10, int i7) {
    }
}
