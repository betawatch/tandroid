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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class n implements fy {
    public final /* synthetic */ p a;

    public n(p pVar) {
        this.a = pVar;
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
        p pVar = this.a;
        if (i10 != 0 && (focusedEditTextOrNull = pVar.r.getFocusedEditTextOrNull()) != null) {
            pVar.B = focusedEditTextOrNull;
            pVar.C = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        pVar.y = i10 != 0;
        pVar.S();
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.fy
    public final boolean k() {
        d1 L = p.L(this.a);
        if (L == null || L.length() == 0) {
            return false;
        }
        L.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.fy
    public final void l(String str) {
        p pVar = this.a;
        d1 L = p.L(pVar);
        if (L == null) {
            return;
        }
        int M = p.M(pVar, L);
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, L.getPaint().getFontMetricsInt(), false, (int[]) null);
            L.setText(L.getText().insert(M, replaceEmoji));
            int length = M + replaceEmoji.length();
            L.setSelection(length, length);
            if (L == pVar.B) {
                pVar.C = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.fy
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.fy
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        p pVar = this.a;
        d1 L = p.L(pVar);
        if (L == null) {
            return;
        }
        int M = p.M(pVar, L);
        try {
            if (str == null) {
                str = "😀";
            }
            SpannableString spannableString = new SpannableString(str);
            y5 y5Var = document != null ? new y5(document, L.getPaint().getFontMetricsInt()) : new y5(j10, L.getPaint().getFontMetricsInt());
            y5Var.cacheType = org.telegram.ui.Components.p5.g();
            spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
            L.setText(L.getText().insert(M, spannableString));
            int length = M + spannableString.length();
            L.setSelection(length, length);
            if (L == pVar.B) {
                pVar.C = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.fy
    public final boolean z() {
        return this.a.y;
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
    public final /* synthetic */ void w() {
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
    public final /* synthetic */ void t(ArrayList arrayList) {
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
