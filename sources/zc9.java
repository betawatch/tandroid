// default package

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class zc9 implements u04 {
    public final /* synthetic */ hd9 a;

    public zc9(hd9 hd9Var) {
        this.a = hd9Var;
    }

    @Override // u04
    public final boolean A() {
        return false;
    }

    @Override // u04
    public final long a() {
        return 0L;
    }

    @Override // u04
    public final boolean b() {
        return false;
    }

    @Override // u04
    public final boolean c() {
        return false;
    }

    @Override // u04
    public final int f() {
        return 0;
    }

    @Override // u04
    public final boolean h() {
        return false;
    }

    @Override // u04
    public final void j(int i) {
        mc9 focusedEditTextOrNull;
        hd9 hd9Var = this.a;
        if (i != 0 && (focusedEditTextOrNull = hd9Var.Q.getFocusedEditTextOrNull()) != null) {
            hd9Var.S0 = focusedEditTextOrNull;
            hd9Var.T0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        boolean z = i != 0;
        hd9Var.D0 = z;
        hd9Var.a0(z);
    }

    @Override // u04
    public final boolean k() {
        return false;
    }

    @Override // u04
    public final boolean l() {
        mc9 s0 = this.a.s0();
        if (s0 == null || s0.length() == 0) {
            return false;
        }
        s0.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // u04
    public final void m(String str) {
        hd9 hd9Var = this.a;
        mc9 s0 = hd9Var.s0();
        if (s0 != null) {
            int t0 = hd9Var.t0(s0);
            try {
                CharSequence m = vu3.m(str, s0.getPaint().getFontMetricsInt(), false, null, 0);
                s0.setText(s0.getText().insert(t0, m));
                int length = t0 + m.length();
                s0.setSelection(length, length);
                if (s0 == hd9Var.S0) {
                    hd9Var.T0 = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // u04
    public final float o() {
        return 0.0f;
    }

    @Override // u04
    public final void s(ArrayList arrayList) {
        this.a.presentFragment(new StickersActivity(5, arrayList));
    }

    @Override // u04
    public final void v() {
        this.a.presentFragment(new StickersActivity(0, null));
    }

    @Override // u04
    public final void w(long j, TLRPC.Document document, String str, boolean z) {
        hd9 hd9Var = this.a;
        mc9 s0 = hd9Var.s0();
        if (s0 != null) {
            int t0 = hd9Var.t0(s0);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                gm gmVar = document != null ? new gm(document, s0.getPaint().getFontMetricsInt()) : new gm(j, s0.getPaint().getFontMetricsInt());
                gmVar.cacheType = vl.f();
                spannableString.setSpan(gmVar, 0, spannableString.length(), 33);
                s0.setText(s0.getText().insert(t0, spannableString));
                int length = t0 + spannableString.length();
                s0.setSelection(length, length);
                if (s0 == hd9Var.S0) {
                    hd9Var.T0 = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // u04
    public final boolean z() {
        return this.a.D0;
    }

    @Override // u04
    public final void n() {
    }

    @Override // u04
    public final void p() {
    }

    @Override // u04
    public final void t() {
    }

    @Override // u04
    public final void g(d2c d2cVar) {
    }

    @Override // u04
    public final void i(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // u04
    public final void q(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // u04
    public final void r(int i) {
    }

    @Override // u04
    public final void y(long j) {
    }

    @Override // u04
    public final void e(Object obj, Object obj2) {
    }

    @Override // u04
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z) {
    }

    @Override // u04
    public final void u(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
    }

    @Override // u04
    public final void x(View view, TLRPC.Document document, String str, Object obj, g27 g27Var, boolean z, int i) {
    }
}
