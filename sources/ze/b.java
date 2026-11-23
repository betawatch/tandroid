package ze;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import hi.h;
import hi.o;
import org.telegram.messenger.a8;
import org.telegram.messenger.j6;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.s90;
import ug.m0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class b implements s90 {
    public final /* synthetic */ int a = 0;
    public Object b;

    public /* synthetic */ b() {
    }

    @Override // org.telegram.ui.Components.s90
    public Paint.FontMetricsInt P() {
        return ((o) this.b).f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // org.telegram.ui.Components.s90
    public void l0(int i7, int i10, CharSequence charSequence, boolean z10) {
        h hVar = ((o) this.b).f;
        if (hVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hVar.getText());
            spannableStringBuilder.replace(i7, i10 + i7, charSequence);
            if (z10) {
                j6.l(spannableStringBuilder, hVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            hVar.setText(spannableStringBuilder);
            hVar.setSelection(i7 + charSequence.length());
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
                stringBuffer.append(((m0) this.b).m());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    public b(o oVar) {
        this.b = oVar;
    }

    @Override // org.telegram.ui.Components.s90
    public /* synthetic */ void q0(String str) {
    }

    @Override // org.telegram.ui.Components.s90
    public /* synthetic */ void Y(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override // org.telegram.ui.Components.s90
    public /* synthetic */ void g(TLRPC.BotInlineResult botInlineResult, boolean z10, int i7) {
    }
}
