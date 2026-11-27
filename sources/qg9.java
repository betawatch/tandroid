// default package

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class qg9 implements p14 {
    public final /* synthetic */ yg9 a;

    public qg9(yg9 yg9Var) {
        this.a = yg9Var;
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
        yg9 yg9Var = this.a;
        if (i != 0 && (focusedEditTextOrNull = yg9Var.Q.getFocusedEditTextOrNull()) != null) {
            yg9Var.S0 = focusedEditTextOrNull;
            yg9Var.T0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        boolean z = i != 0;
        yg9Var.D0 = z;
        yg9Var.a0(z);
    }

    @Override // p14
    public final boolean k() {
        return false;
    }

    @Override // p14
    public final boolean l() {
        dg9 s0 = this.a.s0();
        if (s0 == null || s0.length() == 0) {
            return false;
        }
        s0.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // p14
    public final void m(String str) {
        yg9 yg9Var = this.a;
        dg9 s0 = yg9Var.s0();
        if (s0 != null) {
            int t0 = yg9Var.t0(s0);
            try {
                CharSequence m = pv3.m(str, s0.getPaint().getFontMetricsInt(), false, null, 0);
                s0.setText(s0.getText().insert(t0, m));
                int length = t0 + m.length();
                s0.setSelection(length, length);
                if (s0 == yg9Var.S0) {
                    yg9Var.T0 = length;
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
    public final void s(ArrayList arrayList) {
        this.a.presentFragment(new StickersActivity(5, arrayList));
    }

    @Override // p14
    public final void v() {
        this.a.presentFragment(new StickersActivity(0, null));
    }

    @Override // p14
    public final void w(long j, TLRPC.Document document, String str, boolean z) {
        yg9 yg9Var = this.a;
        dg9 s0 = yg9Var.s0();
        if (s0 != null) {
            int t0 = yg9Var.t0(s0);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                hm hmVar = document != null ? new hm(document, s0.getPaint().getFontMetricsInt()) : new hm(j, s0.getPaint().getFontMetricsInt());
                hmVar.cacheType = wl.f();
                spannableString.setSpan(hmVar, 0, spannableString.length(), 33);
                s0.setText(s0.getText().insert(t0, spannableString));
                int length = t0 + spannableString.length();
                s0.setSelection(length, length);
                if (s0 == yg9Var.S0) {
                    yg9Var.T0 = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // p14
    public final boolean z() {
        return this.a.D0;
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
