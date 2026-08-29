package th;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fy;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.y5;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class p1 implements fy {
    public final /* synthetic */ x1 a;

    public p1(x1 x1Var) {
        this.a = x1Var;
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.fy
    public final void i(int i10) {
        d1 focusedEditTextOrNull;
        x1 x1Var = this.a;
        if (i10 != 0 && (focusedEditTextOrNull = x1Var.L.getFocusedEditTextOrNull()) != null) {
            x1Var.N0 = focusedEditTextOrNull;
            x1Var.O0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        boolean z10 = i10 != 0;
        x1Var.y0 = z10;
        x1Var.e0(z10);
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.fy
    public final boolean k() {
        d1 a02 = x1.a0(this.a);
        if (a02 == null || a02.length() == 0) {
            return false;
        }
        a02.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.fy
    public final void l(String str) {
        x1 x1Var = this.a;
        d1 a02 = x1.a0(x1Var);
        if (a02 == null) {
            return;
        }
        int b02 = x1.b0(x1Var, a02);
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, a02.getPaint().getFontMetricsInt(), false, (int[]) null);
            a02.setText(a02.getText().insert(b02, replaceEmoji));
            int length = b02 + replaceEmoji.length();
            a02.setSelection(length, length);
            if (a02 == x1Var.N0) {
                x1Var.O0 = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.fy
    public final void t(ArrayList arrayList) {
        this.a.presentFragment(new StickersActivity(5, arrayList));
    }

    @Override // org.telegram.ui.Components.fy
    public final void w() {
        this.a.presentFragment(new StickersActivity(0, null));
    }

    @Override // org.telegram.ui.Components.fy
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        x1 x1Var = this.a;
        d1 a02 = x1.a0(x1Var);
        if (a02 == null) {
            return;
        }
        int b02 = x1.b0(x1Var, a02);
        try {
            if (str == null) {
                str = "😀";
            }
            SpannableString spannableString = new SpannableString(str);
            y5 y5Var = document != null ? new y5(document, a02.getPaint().getFontMetricsInt()) : new y5(j10, a02.getPaint().getFontMetricsInt());
            y5Var.cacheType = org.telegram.ui.Components.p5.g();
            spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
            a02.setText(a02.getText().insert(b02, spannableString));
            int length = b02 + spannableString.length();
            a02.setSelection(length, length);
            if (a02 == x1Var.N0) {
                x1Var.O0 = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.fy
    public final boolean z() {
        return this.a.y0;
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void o(s41 s41Var) {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void s(int i10) {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void y(long j10) {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
