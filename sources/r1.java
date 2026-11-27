// default package

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class r1 extends ClickableSpan {
    public final /* synthetic */ byte a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r1(byte b, String str, e eVar) {
        this.a = b;
        this.c = eVar;
        this.b = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        v21 b;
        switch (this.a) {
            case 0:
                t1 t1Var = (t1) this.c;
                t1Var.d((ClickableSpan) this.b, t1Var.a, 0.0f);
                break;
            case 1:
                try {
                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                    if (d31.a((ve1) this.c)) {
                        d31.j((ve1) this.c).j();
                        break;
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
                break;
            case 2:
                m01.u(((te1) this.c).getContext(), "https://fragment.com/username/" + ((String) this.b));
                break;
            case 3:
                dl1 dl1Var = (dl1) this.c;
                if (dl1Var.g1 != null) {
                    dl1Var.d0((CharacterStyle) this.b);
                    break;
                }
                break;
            case 4:
                m01.u(((p92) this.c).getContext(), "https://fragment.com/username/" + ((String) this.b));
                break;
            case 5:
                CharacterStyle characterStyle = (CharacterStyle) this.b;
                if (!(characterStyle instanceof eb2)) {
                    wb2 wb2Var = ((fb2) this.c).a;
                    rb2 rb2Var = wb2Var.eb;
                    if (rb2Var != null) {
                        rb2Var.L(wb2Var, characterStyle, false);
                        break;
                    }
                } else {
                    ((eb2) characterStyle).onClick(view);
                    break;
                }
                break;
            case 6:
                ((bv2) this.c).run();
                break;
            case 7:
                ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                d31 b0 = d31.b0(((mn8) this.c).d);
                String M0 = ob6.M0(2131748675, null);
                vnb resourceProvider = ((mn8) this.c).d.getResourceProvider();
                b0.getClass();
                if (hl.C3()) {
                    c21 c21Var = new c21(b0.X(), resourceProvider);
                    c21Var.g(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
                    c21Var.b.setText(M0);
                    b = b0.b(c21Var, 1500);
                } else {
                    b = new s11();
                }
                b.j();
                break;
            case 8:
                try {
                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                    if (d31.a((xqb) this.c)) {
                        d31.j((xqb) this.c).j();
                        break;
                    }
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
                break;
            case 9:
                URLSpan uRLSpan = (URLSpan) this.b;
                r3c r3cVar = (r3c) this.c;
                qcc qccVar = r3cVar.N1;
                if (qccVar == null) {
                    e eVar = r3cVar.M1;
                    if (eVar != null) {
                        jj.n0(eVar, uRLSpan.getURL(), false, false);
                        break;
                    }
                } else if (((Boolean) qccVar.a(uRLSpan)).booleanValue()) {
                    r3cVar.dismiss();
                    break;
                }
                break;
            default:
                hl.g((String) this.b);
                ((Runnable) this.c).run();
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 2:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 3:
            case 5:
            case 7:
            default:
                super.updateDrawState(textPaint);
                break;
            case 4:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 6:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(aob.v0(aob.xj, (vnb) obj));
                break;
            case 8:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 9:
                int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & jn7.d4);
                if (!(((URLSpan) obj) instanceof f8c)) {
                    textPaint.setUnderlineText(true);
                }
                textPaint.setColor(aob.w0(null, aob.k5, false));
                textPaint.setAlpha(min);
                break;
            case 10:
                textPaint.setUnderlineText(false);
                break;
        }
    }

    public /* synthetic */ r1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ r1(Object obj, Runnable runnable, byte b) {
        this.a = b;
        this.b = obj;
        this.c = runnable;
    }
}
