package yh;

import android.text.SpannableStringBuilder;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final /* synthetic */ class x7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x7(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o8 o8Var = (o8) this.b;
                s5 s5Var = (s5) this.c;
                o8Var.R = true;
                o8Var.o(new q5(s5Var, 2));
                AndroidUtilities.runOnUIThread(new w7(o8Var, 1), 240L);
                break;
            case 1:
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
            case 2:
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
            case 3:
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
            case 4:
                zg.b0 b0Var = (zg.b0) this.b;
                qk0 qk0Var = (qk0) this.c;
                b0Var.l = true;
                b0Var.a.invalidate();
                qk0Var.b1 = false;
                qk0Var.invalidate();
                b0Var.c(true);
                break;
            case 5:
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
                ViewParent viewParent = p0Var.z;
                if (com.google.android.gms.internal.vision.e2.u(viewParent)) {
                    ((org.telegram.ui.Cells.o4) viewParent).f(reactionCount, true, 0.0f, 0.0f);
                }
                m0Var.Y.c(false);
                p0Var.S = null;
                p0Var.T = false;
                p0Var.U = null;
                break;
        }
    }
}
