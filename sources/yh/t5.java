package yh;

import android.text.SpannableStringBuilder;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.kl0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t5(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                new ad(((org.telegram.ui.ActionBar.f3[]) this.b)[0].topBulletinContainer, (org.telegram.ui.ActionBar.e6) this.c).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                break;
            case 1:
                h8 h8Var = (h8) this.b;
                l5 l5Var = (l5) this.c;
                h8Var.S = true;
                h8Var.q(new j5(l5Var, 2));
                AndroidUtilities.runOnUIThread(new q7(h8Var, 1), 240L);
                break;
            case 2:
                zg.q qVar = (zg.q) this.b;
                org.telegram.ui.Components.b6 b6Var = (org.telegram.ui.Components.b6) this.c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qVar.n.getText());
                for (org.telegram.ui.Components.b6 b6Var2 : (org.telegram.ui.Components.b6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.b6.class)) {
                    if (b6Var2 == b6Var) {
                        int editTextSelectionEnd = qVar.n.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(b6Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(b6Var2);
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
                    ad.a0(qVar2).t(str, null).j();
                    break;
                } else {
                    zg.p0.f(-qVar2.M, qVar2.R, qVar2.Q);
                    break;
                }
            case 4:
                zg.p pVar = (zg.p) this.b;
                org.telegram.ui.Components.b6 b6Var3 = (org.telegram.ui.Components.b6) this.c;
                zg.q qVar3 = pVar.e2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(qVar3.n.getText());
                for (org.telegram.ui.Components.b6 b6Var4 : (org.telegram.ui.Components.b6[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), org.telegram.ui.Components.b6.class)) {
                    if (b6Var4 == b6Var3) {
                        int editTextSelectionEnd2 = qVar3.n.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(b6Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(b6Var4);
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
                zg.a0 a0Var = (zg.a0) this.b;
                kl0 kl0Var = (kl0) this.c;
                a0Var.l = true;
                a0Var.a.invalidate();
                kl0Var.b1 = false;
                kl0Var.invalidate();
                a0Var.c(true);
                break;
            case 6:
                zg.c0 c0Var = (zg.c0) this.b;
                zg.b bVar = (zg.b) this.c;
                c0Var.getText().delete(c0Var.getText().getSpanStart(bVar), c0Var.getText().getSpanEnd(bVar));
                c0Var.setCursorVisible(true);
                c0Var.setLongClickable(true);
                break;
            default:
                zg.o0 o0Var = (zg.o0) this.b;
                zg.l0 l0Var = (zg.l0) this.c;
                o0Var.getClass();
                TLRPC.ReactionCount reactionCount = l0Var.a;
                ViewParent viewParent = o0Var.z;
                if (com.google.android.gms.internal.vision.e2.t(viewParent)) {
                    ((org.telegram.ui.Cells.o4) viewParent).f(reactionCount, true, 0.0f, 0.0f);
                }
                l0Var.Y.c(false);
                o0Var.S = null;
                o0Var.T = false;
                o0Var.U = null;
                break;
        }
    }
}
