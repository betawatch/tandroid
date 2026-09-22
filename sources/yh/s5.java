package yh;

import android.text.SpannableStringBuilder;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class s5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s5(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MessagesController) this.b).processUpdates((TLRPC.Updates) ((TLObject) this.c), false);
                break;
            case 1:
                new xc(((org.telegram.ui.ActionBar.f3[]) this.b)[0].topBulletinContainer, (org.telegram.ui.ActionBar.f6) this.c).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                break;
            case 2:
                o8 o8Var = (o8) this.b;
                t5 t5Var = (t5) this.c;
                o8Var.R = true;
                o8Var.o(new q5(t5Var, 2));
                AndroidUtilities.runOnUIThread(new x7(o8Var, 1), 240L);
                break;
            case 3:
                zg.q qVar = (zg.q) this.b;
                org.telegram.ui.Components.y5 y5Var = (org.telegram.ui.Components.y5) this.c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qVar.n.getText());
                for (org.telegram.ui.Components.y5 y5Var2 : (org.telegram.ui.Components.y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.y5.class)) {
                    if (y5Var2 == y5Var) {
                        int editTextSelectionEnd = qVar.n.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(y5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(y5Var2);
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
            case 4:
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
                    zg.r0.f(-qVar2.M, qVar2.R, qVar2.Q);
                    break;
                }
            case 5:
                zg.p pVar = (zg.p) this.b;
                org.telegram.ui.Components.y5 y5Var3 = (org.telegram.ui.Components.y5) this.c;
                zg.q qVar3 = pVar.e2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(qVar3.n.getText());
                for (org.telegram.ui.Components.y5 y5Var4 : (org.telegram.ui.Components.y5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), org.telegram.ui.Components.y5.class)) {
                    if (y5Var4 == y5Var3) {
                        int editTextSelectionEnd2 = qVar3.n.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(y5Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(y5Var4);
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
            case 6:
                zg.c0 c0Var = (zg.c0) this.b;
                sk0 sk0Var = (sk0) this.c;
                c0Var.l = true;
                c0Var.a.invalidate();
                sk0Var.b1 = false;
                sk0Var.invalidate();
                c0Var.c(true);
                break;
            case 7:
                zg.e0 e0Var = (zg.e0) this.b;
                zg.b bVar = (zg.b) this.c;
                e0Var.getText().delete(e0Var.getText().getSpanStart(bVar), e0Var.getText().getSpanEnd(bVar));
                e0Var.setCursorVisible(true);
                e0Var.setLongClickable(true);
                break;
            default:
                zg.q0 q0Var = (zg.q0) this.b;
                zg.n0 n0Var = (zg.n0) this.c;
                q0Var.getClass();
                TLRPC.ReactionCount reactionCount = n0Var.a;
                ViewParent viewParent = q0Var.z;
                if (com.google.android.gms.internal.vision.e2.u(viewParent)) {
                    ((org.telegram.ui.Cells.p4) viewParent).f(reactionCount, true, 0.0f, 0.0f);
                }
                n0Var.Y.c(false);
                q0Var.S = null;
                q0Var.T = false;
                q0Var.U = null;
                break;
        }
    }
}
