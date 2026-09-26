package yh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xv0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z5(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                new xc(((org.telegram.ui.ActionBar.e3[]) this.b)[0].topBulletinContainer, (org.telegram.ui.ActionBar.d6) this.c).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                break;
            case 1:
                o8 o8Var = (o8) this.b;
                r5 r5Var = (r5) this.c;
                o8Var.R = true;
                o8Var.o(new p5(r5Var, 2));
                AndroidUtilities.runOnUIThread(new x7(o8Var, 1), 240L);
                break;
            case 2:
                zg.q qVar = (zg.q) this.b;
                org.telegram.ui.Components.z5 z5Var = (org.telegram.ui.Components.z5) this.c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qVar.n.getText());
                for (org.telegram.ui.Components.z5 z5Var2 : (org.telegram.ui.Components.z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.z5.class)) {
                    if (z5Var2 == z5Var) {
                        int editTextSelectionEnd = qVar.n.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(z5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(z5Var2);
                        qVar.n.getText().delete(spanStart, spanEnd);
                        int i10 = spanEnd - spanStart;
                        zg.o oVar = qVar.n;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i10;
                        }
                        oVar.setSelection(editTextSelectionEnd);
                        break;
                    }
                }
                break;
            case 3:
                zg.q qVar2 = (zg.q) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (qVar2.Q == null || !tL_error.text.equals("BOOSTS_REQUIRED")) {
                    String str = tL_error.text;
                    if (str.equals("REACTIONS_TOO_MANY")) {
                        str = LocaleController.formatPluralString("ReactionMaxCountError", qVar2.J, new Object[0]);
                    }
                    xc.a0(qVar2).t(str, null).j();
                    break;
                } else {
                    zg.q0.f(-qVar2.M, qVar2.R, qVar2.Q);
                    break;
                }
            case 4:
                zg.p pVar = (zg.p) this.b;
                org.telegram.ui.Components.z5 z5Var3 = (org.telegram.ui.Components.z5) this.c;
                zg.q qVar3 = pVar.e2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(qVar3.n.getText());
                for (org.telegram.ui.Components.z5 z5Var4 : (org.telegram.ui.Components.z5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), org.telegram.ui.Components.z5.class)) {
                    if (z5Var4 == z5Var3) {
                        int editTextSelectionEnd2 = qVar3.n.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(z5Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(z5Var4);
                        qVar3.n.getText().delete(spanStart2, spanEnd2);
                        int i11 = spanEnd2 - spanStart2;
                        zg.o oVar2 = qVar3.n;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i11;
                        }
                        oVar2.setSelection(editTextSelectionEnd2);
                        break;
                    }
                }
                break;
            case 5:
                zg.b0 b0Var = (zg.b0) this.b;
                qk0 qk0Var = (qk0) this.c;
                b0Var.l = true;
                b0Var.a.invalidate();
                qk0Var.b1 = false;
                qk0Var.invalidate();
                b0Var.c(true);
                break;
            case 6:
                zg.d0 d0Var = (zg.d0) this.b;
                zg.b bVar = (zg.b) this.c;
                d0Var.getText().delete(d0Var.getText().getSpanStart(bVar), d0Var.getText().getSpanEnd(bVar));
                d0Var.setCursorVisible(true);
                d0Var.setLongClickable(true);
                break;
            default:
                zg.p0 p0Var = (zg.p0) this.b;
                zg.m0 m0Var = (zg.m0) this.c;
                p0Var.getClass();
                TLRPC.ReactionCount reactionCount = m0Var.a;
                xv0 xv0Var = p0Var.z;
                if (com.google.android.gms.internal.vision.e2.u(xv0Var)) {
                    ((org.telegram.ui.Cells.o4) xv0Var).f(reactionCount, true, 0.0f, 0.0f);
                }
                m0Var.Y.c(false);
                p0Var.S = null;
                p0Var.T = false;
                p0Var.U = null;
                break;
        }
    }
}
