package sg;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Wallet.x0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ i(o oVar, int i10) {
        this.a = i10;
        this.b = oVar;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        t8 t8Var;
        switch (this.a) {
            case 0:
                o oVar = this.b;
                oVar.V = (TL_stories.TL_premium_boostsStatus) obj;
                if (!oVar.H.keySet().equals(oVar.J.keySet())) {
                    oVar.d0(false);
                    break;
                }
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                o oVar2 = this.b;
                h hVar = oVar2.Z;
                if (!oVar2.f0()) {
                    int editTextSelectionEnd = oVar2.h.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oVar2.h.getText());
                    for (o5 o5Var : (o5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), o5.class)) {
                        if (spannableStringBuilder.getSpanEnd(o5Var) == editTextSelectionEnd) {
                            oVar2.H.remove(Long.valueOf(o5Var.documentId));
                            oVar2.I.remove(Long.valueOf(o5Var.documentId));
                            oVar2.b.A(Long.valueOf(o5Var.documentId));
                            if (o5Var.documentId == -1 && (t8Var = oVar2.r) != null) {
                                t8Var.setChecked(false);
                                oVar2.h.setMaxLength(oVar2.M);
                            }
                            if (bool.booleanValue()) {
                                oVar2.h.dispatchKeyEvent(new KeyEvent(0, 67));
                                org.telegram.messenger.i0.r(hVar);
                                org.telegram.messenger.i0.h3(hVar, 350L);
                                break;
                            } else {
                                o5Var.setRemoved(new x0(oVar2, o5Var, editTextSelectionEnd, 15));
                                oVar2.b0(o5Var);
                                oVar2.d0(false);
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
                        org.telegram.messenger.i0.h3(new rh.o(21, oVar3, tL_error), oVar3.V == null ? 200L : 0L);
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
