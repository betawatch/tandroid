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
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class q1 extends ClickableSpan {
    public final /* synthetic */ byte a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q1(byte b, String str, d dVar) {
        this.a = b;
        this.c = dVar;
        this.b = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        m21 b;
        switch (this.a) {
            case 0:
                s1 s1Var = (s1) this.c;
                s1Var.d((ClickableSpan) this.b, s1Var.a, 0.0f);
                break;
            case 1:
                try {
                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                    if (u21.a((me1) this.c)) {
                        u21.j((me1) this.c).j();
                        break;
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
                break;
            case 2:
                d01.t(((ke1) this.c).getContext(), "https://fragment.com/username/" + ((String) this.b));
                break;
            case 3:
                uk1 uk1Var = (uk1) this.c;
                if (uk1Var.g1 != null) {
                    uk1Var.e0((CharacterStyle) this.b);
                    break;
                }
                break;
            case 4:
                d01.t(((z82) this.c).getContext(), "https://fragment.com/username/" + ((String) this.b));
                break;
            case 5:
                CharacterStyle characterStyle = (CharacterStyle) this.b;
                if (!(characterStyle instanceof oa2)) {
                    gb2 gb2Var = ((pa2) this.c).a;
                    bb2 bb2Var = gb2Var.eb;
                    if (bb2Var != null) {
                        bb2Var.P(gb2Var, characterStyle, false);
                        break;
                    }
                } else {
                    ((oa2) characterStyle).onClick(view);
                    break;
                }
                break;
            case 6:
                ((gu2) this.c).run();
                break;
            case 7:
                ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                u21 b0 = u21.b0(((yj8) this.c).d);
                String M0 = k96.M0(2131748729, null);
                wjb resourceProvider = ((yj8) this.c).d.getResourceProvider();
                b0.getClass();
                if (gl.C3()) {
                    t11 t11Var = new t11(b0.X(), resourceProvider);
                    t11Var.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
                    t11Var.b.setText(M0);
                    b = b0.b(t11Var, 1500);
                } else {
                    b = new j11();
                }
                b.j();
                break;
            case 8:
                try {
                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                    if (u21.a((ymb) this.c)) {
                        u21.j((ymb) this.c).j();
                        break;
                    }
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
                break;
            case 9:
                URLSpan uRLSpan = (URLSpan) this.b;
                rzb rzbVar = (rzb) this.c;
                q8c q8cVar = rzbVar.N1;
                if (q8cVar == null) {
                    d dVar = rzbVar.M1;
                    if (dVar != null) {
                        ij.n0(dVar, uRLSpan.getURL(), false, false);
                        break;
                    }
                } else if (((Boolean) q8cVar.a(uRLSpan)).booleanValue()) {
                    rzbVar.dismiss();
                    break;
                }
                break;
            default:
                gl.g((String) this.b);
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
                textPaint.setColor(bkb.v0(bkb.wj, (wjb) obj));
                break;
            case 8:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 9:
                int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & kk7.d4);
                if (!(((URLSpan) obj) instanceof g4c)) {
                    textPaint.setUnderlineText(true);
                }
                textPaint.setColor(bkb.w0(null, bkb.j5, false));
                textPaint.setAlpha(min);
                break;
            case 10:
                textPaint.setUnderlineText(false);
                break;
        }
    }

    public /* synthetic */ q1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ q1(Object obj, Runnable runnable, byte b) {
        this.a = b;
        this.b = obj;
        this.c = runnable;
    }
}
