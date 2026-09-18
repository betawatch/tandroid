package zg;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.z5;
import org.telegram.ui.fm0;
import yh.x7;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ j(q qVar, int i10) {
        this.a = i10;
        this.b = qVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        w8 w8Var;
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                q qVar = this.b;
                h hVar = qVar.U;
                if (!qVar.a0()) {
                    int editTextSelectionEnd = qVar.n.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qVar.n.getText());
                    for (z5 z5Var : (z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z5.class)) {
                        if (spannableStringBuilder.getSpanEnd(z5Var) == editTextSelectionEnd) {
                            qVar.E.remove(Long.valueOf(z5Var.documentId));
                            qVar.F.remove(Long.valueOf(z5Var.documentId));
                            qVar.b.A(Long.valueOf(z5Var.documentId));
                            if (z5Var.documentId == -1 && (w8Var = qVar.s) != null) {
                                w8Var.setChecked(false);
                                qVar.n.setMaxLength(qVar.J);
                            }
                            if (bool.booleanValue()) {
                                qVar.n.dispatchKeyEvent(new KeyEvent(0, 67));
                                AndroidUtilities.cancelRunOnUIThread(hVar);
                                AndroidUtilities.runOnUIThread(hVar, 350L);
                                break;
                            } else {
                                z5Var.setRemoved(new fm0(qVar, z5Var, editTextSelectionEnd, 19));
                                qVar.W(z5Var);
                                qVar.Y(false);
                                break;
                            }
                        }
                    }
                    break;
                }
                break;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                q qVar2 = this.b;
                if (!qVar2.isFinishing()) {
                    qVar2.v.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        qVar2.finishFragment();
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new x7(2, qVar2, tL_error), qVar2.Q == null ? 200L : 0L);
                        break;
                    }
                }
                break;
            default:
                q qVar3 = this.b;
                qVar3.getClass();
                qVar3.O = ((Integer) obj).intValue();
                break;
        }
    }
}
