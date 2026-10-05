package zg;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.z5;
import org.telegram.ui.am0;
import yh.s5;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ i(o oVar, int i10) {
        this.a = i10;
        this.b = oVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        w8 w8Var;
        switch (this.a) {
            case 0:
                o oVar = this.b;
                oVar.V = (TL_stories.TL_premium_boostsStatus) obj;
                if (!oVar.H.keySet().equals(oVar.J.keySet())) {
                    oVar.Y(false);
                    break;
                }
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                o oVar2 = this.b;
                h hVar = oVar2.Z;
                if (!oVar2.b0()) {
                    int editTextSelectionEnd = oVar2.h.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oVar2.h.getText());
                    for (z5 z5Var : (z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z5.class)) {
                        if (spannableStringBuilder.getSpanEnd(z5Var) == editTextSelectionEnd) {
                            oVar2.H.remove(Long.valueOf(z5Var.documentId));
                            oVar2.I.remove(Long.valueOf(z5Var.documentId));
                            oVar2.b.A(Long.valueOf(z5Var.documentId));
                            if (z5Var.documentId == -1 && (w8Var = oVar2.r) != null) {
                                w8Var.setChecked(false);
                                oVar2.h.setMaxLength(oVar2.M);
                            }
                            if (bool.booleanValue()) {
                                oVar2.h.dispatchKeyEvent(new KeyEvent(0, 67));
                                AndroidUtilities.cancelRunOnUIThread(hVar);
                                AndroidUtilities.runOnUIThread(hVar, 350L);
                                break;
                            } else {
                                z5Var.setRemoved(new am0(oVar2, z5Var, editTextSelectionEnd, 19));
                                oVar2.W(z5Var);
                                oVar2.Y(false);
                                break;
                            }
                        }
                    }
                    break;
                }
                break;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                o oVar3 = this.b;
                if (!oVar3.isFinishing()) {
                    oVar3.s.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        oVar3.finishFragment();
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new s5(4, oVar3, tL_error), oVar3.V == null ? 200L : 0L);
                        break;
                    }
                }
                break;
            default:
                o oVar4 = this.b;
                oVar4.getClass();
                oVar4.T = ((Integer) obj).intValue();
                break;
        }
    }
}
