// default package

import android.text.SpannableString;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class xw7 implements p14 {
    public final /* synthetic */ dx7 a;

    public xw7(dx7 dx7Var) {
        this.a = dx7Var;
    }

    @Override // p14
    public final boolean A() {
        return false;
    }

    @Override // p14
    public final long a() {
        return 0L;
    }

    @Override // p14
    public final boolean b() {
        return false;
    }

    @Override // p14
    public final boolean c() {
        return false;
    }

    @Override // p14
    public final int f() {
        return 0;
    }

    @Override // p14
    public final boolean h() {
        return false;
    }

    @Override // p14
    public final boolean k() {
        return false;
    }

    @Override // p14
    public final boolean l() {
        ju3 editText = ((rlb) this.a.t0).getEditText();
        if (editText == null || editText.length() == 0) {
            return false;
        }
        editText.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // p14
    public final void m(String str) {
        rlb rlbVar;
        ju3 editText;
        mv3[] mv3VarArr;
        h44 h44Var = this.a.t0;
        if (!(h44Var instanceof rlb) || (editText = (rlbVar = (rlb) h44Var).getEditText()) == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m = pv3.m(str, rlbVar.getFontMetricsInt(), false, null, 0);
            if ((m instanceof Spanned) && (mv3VarArr = (mv3[]) ((Spanned) m).getSpans(0, m.length(), mv3.class)) != null) {
                for (mv3 mv3Var : mv3VarArr) {
                    mv3Var.b = 0.85f;
                }
            }
            editText.setText(editText.getText().insert(selectionEnd, m));
            int length = selectionEnd + m.length();
            editText.setSelection(length, length);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // p14
    public final void n() {
        dx7 dx7Var = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, dx7Var.q1, dx7Var.getContext());
        String M0 = ob6.M0(2131752033, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131752034, null);
        alertDialog$Builder.j(ob6.M0(2131752064, null), new bm6(this, (byte) 27));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        alertDialog$Builder.o();
    }

    @Override // p14
    public final float o() {
        return 0.0f;
    }

    @Override // p14
    public final void w(long j, TLRPC.Document document, String str, boolean z) {
        hm hmVar;
        ju3 editText = ((rlb) this.a.t0).getEditText();
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
                hmVar = new hm(document.id, 1.0f, editText.getPaint().getFontMetricsInt());
                hmVar.document = document;
            } else {
                hmVar = new hm(j, 1.0f, editText.getPaint().getFontMetricsInt());
            }
            spannableString.setSpan(hmVar, 0, spannableString.length(), 33);
            editText.setText(editText.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editText.setSelection(length, length);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // p14
    public final boolean z() {
        return false;
    }

    @Override // p14
    public final void p() {
    }

    @Override // p14
    public final void t() {
    }

    @Override // p14
    public final void v() {
    }

    @Override // p14
    public final void g(d6c d6cVar) {
    }

    @Override // p14
    public final void i(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // p14
    public final void j(int i) {
    }

    @Override // p14
    public final void q(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // p14
    public final void r(int i) {
    }

    @Override // p14
    public final void s(ArrayList arrayList) {
    }

    @Override // p14
    public final void y(long j) {
    }

    @Override // p14
    public final void e(Object obj, Object obj2) {
    }

    @Override // p14
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z) {
    }

    @Override // p14
    public final void u(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
    }

    @Override // p14
    public final void x(View view, TLRPC.Document document, String str, Object obj, n47 n47Var, boolean z, int i) {
    }
}
