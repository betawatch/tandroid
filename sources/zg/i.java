package zg;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.z5;
import org.telegram.ui.wl0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ i(q qVar, int i10) {
        this.a = i10;
        this.b = qVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        w8 w8Var;
        switch (this.a) {
            case 0:
                q qVar = this.b;
                qVar.Q = (TL_stories.TL_premium_boostsStatus) obj;
                if (!qVar.E.keySet().equals(qVar.G.keySet())) {
                    qVar.Y(false);
                    break;
                }
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                q qVar2 = this.b;
                h hVar = qVar2.U;
                if (!qVar2.a0()) {
                    int editTextSelectionEnd = qVar2.n.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qVar2.n.getText());
                    for (z5 z5Var : (z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z5.class)) {
                        if (spannableStringBuilder.getSpanEnd(z5Var) == editTextSelectionEnd) {
                            qVar2.E.remove(Long.valueOf(z5Var.documentId));
                            qVar2.F.remove(Long.valueOf(z5Var.documentId));
                            qVar2.b.A(Long.valueOf(z5Var.documentId));
                            if (z5Var.documentId == -1 && (w8Var = qVar2.s) != null) {
                                w8Var.setChecked(false);
                                qVar2.n.setMaxLength(qVar2.J);
                            }
                            if (bool.booleanValue()) {
                                qVar2.n.dispatchKeyEvent(new KeyEvent(0, 67));
                                AndroidUtilities.cancelRunOnUIThread(hVar);
                                AndroidUtilities.runOnUIThread(hVar, 350L);
                                break;
                            } else {
                                z5Var.setRemoved(new wl0(qVar2, z5Var, editTextSelectionEnd, 19));
                                qVar2.W(z5Var);
                                qVar2.Y(false);
                                break;
                            }
                        }
                    }
                    break;
                }
                break;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                q qVar3 = this.b;
                if (!qVar3.isFinishing()) {
                    qVar3.v.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        qVar3.finishFragment();
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new yh.z5(3, qVar3, tL_error), qVar3.Q == null ? 200L : 0L);
                        break;
                    }
                }
                break;
            default:
                q qVar4 = this.b;
                qVar4.getClass();
                qVar4.O = ((Integer) obj).intValue();
                break;
        }
    }
}
