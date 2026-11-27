// default package

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class u72 implements p14 {
    public final /* synthetic */ v72 a;

    public u72(v72 v72Var) {
        this.a = v72Var;
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
    public final void j(int i) {
        dg9 focusedEditTextOrNull;
        v72 v72Var = this.a;
        if (i != 0 && (focusedEditTextOrNull = v72Var.r.getFocusedEditTextOrNull()) != null) {
            v72Var.G = focusedEditTextOrNull;
            v72Var.H = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        v72Var.E = i != 0;
        v72Var.R();
    }

    @Override // p14
    public final boolean k() {
        return false;
    }

    @Override // p14
    public final boolean l() {
        dg9 U = this.a.U();
        if (U == null || U.length() == 0) {
            return false;
        }
        U.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // p14
    public final void m(String str) {
        v72 v72Var = this.a;
        dg9 U = v72Var.U();
        if (U != null) {
            int V = v72Var.V(U);
            try {
                CharSequence m = pv3.m(str, U.getPaint().getFontMetricsInt(), false, null, 0);
                U.setText(U.getText().insert(V, m));
                int length = V + m.length();
                U.setSelection(length, length);
                if (U == v72Var.G) {
                    v72Var.H = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // p14
    public final float o() {
        return 0.0f;
    }

    @Override // p14
    public final void w(long j, TLRPC.Document document, String str, boolean z) {
        v72 v72Var = this.a;
        dg9 U = v72Var.U();
        if (U != null) {
            int V = v72Var.V(U);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                hm hmVar = document != null ? new hm(document, U.getPaint().getFontMetricsInt()) : new hm(j, U.getPaint().getFontMetricsInt());
                hmVar.cacheType = wl.f();
                spannableString.setSpan(hmVar, 0, spannableString.length(), 33);
                U.setText(U.getText().insert(V, spannableString));
                int length = V + spannableString.length();
                U.setSelection(length, length);
                if (U == v72Var.G) {
                    v72Var.H = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // p14
    public final boolean z() {
        return this.a.E;
    }

    @Override // p14
    public final void n() {
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
