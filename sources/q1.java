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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
        u31 b;
        switch (this.a) {
            case 0:
                s1 s1Var = (s1) this.c;
                s1Var.d((ClickableSpan) this.b, s1Var.a, 0.0f);
                break;
            case 1:
                try {
                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                    if (c41.a((uf1) this.c)) {
                        c41.j((uf1) this.c).j();
                        break;
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
                break;
            case 2:
                l11.u(((sf1) this.c).getContext(), "https://fragment.com/username/" + ((String) this.b));
                break;
            case 3:
                cm1 cm1Var = (cm1) this.c;
                if (cm1Var.g1 != null) {
                    cm1Var.d0((CharacterStyle) this.b);
                    break;
                }
                break;
            case 4:
                l11.u(((ka2) this.c).getContext(), "https://fragment.com/username/" + ((String) this.b));
                break;
            case 5:
                CharacterStyle characterStyle = (CharacterStyle) this.b;
                if (!(characterStyle instanceof zb2)) {
                    rc2 rc2Var = ((ac2) this.c).a;
                    mc2 mc2Var = rc2Var.eb;
                    if (mc2Var != null) {
                        mc2Var.M(rc2Var, characterStyle, false);
                        break;
                    }
                } else {
                    ((zb2) characterStyle).onClick(view);
                    break;
                }
                break;
            case 6:
                ((mv2) this.c).run();
                break;
            case 7:
                ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                c41 b0 = c41.b0(((bm8) this.c).d);
                String M0 = jb6.M0(2131748678, null);
                ylb resourceProvider = ((bm8) this.c).d.getResourceProvider();
                b0.getClass();
                if (gm.C3()) {
                    b31 b31Var = new b31(b0.X(), resourceProvider);
                    b31Var.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
                    b31Var.b.setText(M0);
                    b = b0.b(b31Var, 1500);
                } else {
                    b = new r21();
                }
                b.j();
                break;
            case 8:
                try {
                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                    if (c41.a((zob) this.c)) {
                        c41.j((zob) this.c).j();
                        break;
                    }
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
                break;
            case 9:
                URLSpan uRLSpan = (URLSpan) this.b;
                s1c s1cVar = (s1c) this.c;
                rac racVar = s1cVar.N1;
                if (racVar == null) {
                    d dVar = s1cVar.M1;
                    if (dVar != null) {
                        ik.n0(dVar, uRLSpan.getURL(), false, false);
                        break;
                    }
                } else if (((Boolean) racVar.a(uRLSpan)).booleanValue()) {
                    s1cVar.dismiss();
                    break;
                }
                break;
            default:
                gm.g((String) this.b);
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
                textPaint.setColor(cmb.v0(cmb.wj, (ylb) obj));
                break;
            case 8:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 9:
                int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & nm7.d4);
                if (!(((URLSpan) obj) instanceof g6c)) {
                    textPaint.setUnderlineText(true);
                }
                textPaint.setColor(cmb.w0(null, cmb.j5, false));
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
