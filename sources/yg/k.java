package yg;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.y5;
import org.telegram.ui.uu0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;

    public /* synthetic */ k(s sVar, int i10) {
        this.a = i10;
        this.b = sVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        x8 x8Var;
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                s sVar = this.b;
                i iVar = sVar.U;
                if (!sVar.a0()) {
                    int editTextSelectionEnd = sVar.n.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sVar.n.getText());
                    for (y5 y5Var : (y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), y5.class)) {
                        if (spannableStringBuilder.getSpanEnd(y5Var) == editTextSelectionEnd) {
                            sVar.E.remove(Long.valueOf(y5Var.documentId));
                            sVar.F.remove(Long.valueOf(y5Var.documentId));
                            sVar.b.A(Long.valueOf(y5Var.documentId));
                            if (y5Var.documentId == -1 && (x8Var = sVar.s) != null) {
                                x8Var.setChecked(false);
                                sVar.n.setMaxLength(sVar.J);
                            }
                            if (bool.booleanValue()) {
                                sVar.n.dispatchKeyEvent(new KeyEvent(0, 67));
                                AndroidUtilities.cancelRunOnUIThread(iVar);
                                AndroidUtilities.runOnUIThread(iVar, 350L);
                                break;
                            } else {
                                y5Var.setRemoved(new uu0(sVar, y5Var, editTextSelectionEnd, 16));
                                sVar.W(y5Var);
                                sVar.Y(false);
                                break;
                            }
                        }
                    }
                    break;
                }
                break;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                s sVar2 = this.b;
                if (!sVar2.isFinishing()) {
                    sVar2.v.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        sVar2.finishFragment();
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new u2.k0(29, sVar2, tL_error), sVar2.Q == null ? 200L : 0L);
                        break;
                    }
                }
                break;
            default:
                s sVar3 = this.b;
                sVar3.getClass();
                sVar3.O = ((Integer) obj).intValue();
                break;
        }
    }
}
