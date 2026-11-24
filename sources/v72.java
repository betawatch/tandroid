// default package

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class v72 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c82 b;

    public /* synthetic */ v72(c82 c82Var, byte b) {
        this.a = b;
        this.b = c82Var;
    }

    @Override // p8c
    public final void a(Object obj) {
        ahb ahbVar;
        byte b = this.a;
        c82 c82Var = this.b;
        switch (b) {
            case 0:
                c82Var.X = (TL_stories.TL_premium_boostsStatus) obj;
                if (!c82Var.I.keySet().equals(c82Var.K.keySet())) {
                    c82Var.d0(false);
                    break;
                }
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                u72 u72Var = c82Var.b0;
                if (!c82Var.f0()) {
                    int editTextSelectionEnd = c82Var.h.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c82Var.h.getText());
                    for (gm gmVar : (gm[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), gm.class)) {
                        if (spannableStringBuilder.getSpanEnd(gmVar) == editTextSelectionEnd) {
                            c82Var.I.remove(Long.valueOf(gmVar.documentId));
                            c82Var.J.remove(Long.valueOf(gmVar.documentId));
                            c82Var.b.A(Long.valueOf(gmVar.documentId));
                            if (gmVar.documentId == -1 && (ahbVar = c82Var.r) != null) {
                                ahbVar.setChecked(false);
                                c82Var.h.setMaxLength(c82Var.O);
                            }
                            if (bool.booleanValue()) {
                                c82Var.h.dispatchKeyEvent(new KeyEvent(0, 67));
                                gl.r(u72Var);
                                gl.d3(u72Var, 350L);
                                break;
                            } else {
                                gmVar.setRemoved(new va7((Object) c82Var, (Object) gmVar, editTextSelectionEnd, (byte) 17));
                                c82Var.b0(gmVar);
                                c82Var.d0(false);
                                break;
                            }
                        }
                    }
                    break;
                }
                break;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (!c82Var.isFinishing()) {
                    c82Var.s.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        c82Var.finishFragment();
                        break;
                    } else {
                        gl.d3(new kx1(c82Var, tL_error, (byte) 24), c82Var.X == null ? 200L : 0L);
                        break;
                    }
                }
                break;
            default:
                c82Var.V = ((Integer) obj).intValue();
                break;
        }
    }
}
