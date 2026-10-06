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
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
                new yc(((org.telegram.ui.ActionBar.f3[]) this.b)[0].topBulletinContainer, (org.telegram.ui.ActionBar.d6) this.c).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                break;
            case 2:
                r8 r8Var = (r8) this.b;
                t5 t5Var = (t5) this.c;
                r8Var.R = true;
                r8Var.o(new q5(t5Var, 2));
                AndroidUtilities.runOnUIThread(new a8(r8Var, 1), 240L);
                break;
            case 3:
                zg.o oVar = (zg.o) this.b;
                org.telegram.ui.Components.z5 z5Var = (org.telegram.ui.Components.z5) this.c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oVar.h.getText());
                for (org.telegram.ui.Components.z5 z5Var2 : (org.telegram.ui.Components.z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.z5.class)) {
                    if (z5Var2 == z5Var) {
                        int editTextSelectionEnd = oVar.h.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(z5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(z5Var2);
                        oVar.h.getText().delete(spanStart, spanEnd);
                        int i10 = spanEnd - spanStart;
                        zg.l lVar = oVar.h;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i10;
                        }
                        lVar.setSelection(editTextSelectionEnd);
                        break;
                    }
                }
                break;
            case 4:
                zg.o oVar2 = (zg.o) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (oVar2.V == null || !tL_error.text.equals("BOOSTS_REQUIRED")) {
                    String str = tL_error.text;
                    if (str.equals("REACTIONS_TOO_MANY")) {
                        str = LocaleController.formatPluralString("ReactionMaxCountError", oVar2.M, new Object[0]);
                    }
                    yc.a0(oVar2).t(str, null).j();
                    break;
                } else {
                    zg.o0.f(-oVar2.R, oVar2.W, oVar2.V);
                    break;
                }
            case 5:
                zg.m mVar = (zg.m) this.b;
                org.telegram.ui.Components.z5 z5Var3 = (org.telegram.ui.Components.z5) this.c;
                zg.o oVar3 = mVar.e2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(oVar3.h.getText());
                for (org.telegram.ui.Components.z5 z5Var4 : (org.telegram.ui.Components.z5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), org.telegram.ui.Components.z5.class)) {
                    if (z5Var4 == z5Var3) {
                        int editTextSelectionEnd2 = oVar3.h.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(z5Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(z5Var4);
                        oVar3.h.getText().delete(spanStart2, spanEnd2);
                        int i11 = spanEnd2 - spanStart2;
                        zg.l lVar2 = oVar3.h;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i11;
                        }
                        lVar2.setSelection(editTextSelectionEnd2);
                        break;
                    }
                }
                break;
            case 6:
                zg.z zVar = (zg.z) this.b;
                sk0 sk0Var = (sk0) this.c;
                zVar.l = true;
                zVar.a.invalidate();
                sk0Var.b1 = false;
                sk0Var.invalidate();
                zVar.c(true);
                break;
            case 7:
                zg.b0 b0Var = (zg.b0) this.b;
                zg.b bVar = (zg.b) this.c;
                b0Var.getText().delete(b0Var.getText().getSpanStart(bVar), b0Var.getText().getSpanEnd(bVar));
                b0Var.setCursorVisible(true);
                b0Var.setLongClickable(true);
                break;
            default:
                zg.n0 n0Var = (zg.n0) this.b;
                zg.k0 k0Var = (zg.k0) this.c;
                n0Var.getClass();
                TLRPC.ReactionCount reactionCount = k0Var.a;
                ViewParent viewParent = n0Var.z;
                if (com.google.android.gms.internal.vision.e2.u(viewParent)) {
                    ((org.telegram.ui.Cells.o4) viewParent).f(reactionCount, true, 0.0f, 0.0f);
                }
                k0Var.Y.c(false);
                n0Var.S = null;
                n0Var.T = false;
                n0Var.U = null;
                break;
        }
    }
}
