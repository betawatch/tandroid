package vh;

import android.text.SpannableString;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.vx;
import org.telegram.ui.Components.w41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u3 implements vx {
    public final /* synthetic */ b4 a;

    public u3(b4 b4Var) {
        this.a = b4Var;
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.vx
    public final boolean k() {
        jg.b editText = ((jg.g3) this.a.s0).getEditText();
        if (editText == null || editText.length() == 0) {
            return false;
        }
        editText.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.vx
    public final void l(String str) {
        jg.g3 g3Var;
        jg.b editText;
        org.telegram.messenger.h6[] h6VarArr;
        jg.j jVar = this.a.s0;
        if ((jVar instanceof jg.g3) && (editText = (g3Var = (jg.g3) jVar).getEditText()) != null) {
            int selectionEnd = editText.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                CharSequence m10 = org.telegram.messenger.k6.m(str, g3Var.getFontMetricsInt(), false, null, 0);
                if ((m10 instanceof Spanned) && (h6VarArr = (org.telegram.messenger.h6[]) ((Spanned) m10).getSpans(0, m10.length(), org.telegram.messenger.h6.class)) != null) {
                    for (org.telegram.messenger.h6 h6Var : h6VarArr) {
                        h6Var.b = 0.85f;
                    }
                }
                editText.setText(editText.getText().insert(selectionEnd, m10));
                int length = selectionEnd + m10.length();
                editText.setSelection(length, length);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.Components.vx
    public final void n() {
        b4 b4Var = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, b4Var.getContext(), b4Var.p1);
        String L0 = cd.L0(2131752068, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = cd.L0(2131752069, null);
        alertDialog$Builder.k(cd.L0(2131752099, null), new rh.d0(this, 28));
        alertDialog$Builder.h(cd.L0(2131752589, null), null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.vx
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        org.telegram.ui.Components.o5 o5Var;
        jg.b editText = ((jg.g3) this.a.s0).getEditText();
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                o5Var = new org.telegram.ui.Components.o5(document.id, 1.0f, editText.getPaint().getFontMetricsInt());
                o5Var.document = document;
            } else {
                o5Var = new org.telegram.ui.Components.o5(j10, 1.0f, editText.getPaint().getFontMetricsInt());
            }
            spannableString.setSpan(o5Var, 0, spannableString.length(), 33);
            editText.setText(editText.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editText.setSelection(length, length);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ boolean z() {
        return false;
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void i(int i10) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void o(w41 w41Var) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void s(int i10) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void y(long j10) {
    }

    @Override // org.telegram.ui.Components.vx
    public final void q() {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, fj fjVar, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.vx
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
