package vh;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.ky;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class o implements ky {
    public final /* synthetic */ q a;

    public o(q qVar) {
        this.a = qVar;
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.ky
    public final void i(int i10) {
        e1 focusedEditTextOrNull;
        q qVar = this.a;
        if (i10 != 0 && (focusedEditTextOrNull = qVar.r.getFocusedEditTextOrNull()) != null) {
            qVar.C = focusedEditTextOrNull;
            qVar.D = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        qVar.y = i10 != 0;
        qVar.S();
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.ky
    public final boolean k() {
        e1 M = q.M(this.a);
        if (M == null || M.length() == 0) {
            return false;
        }
        M.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.ky
    public final void l(String str) {
        q qVar = this.a;
        e1 M = q.M(qVar);
        if (M == null) {
            return;
        }
        int N = q.N(qVar, M);
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, M.getPaint().getFontMetricsInt(), false, (int[]) null);
            M.setText(M.getText().insert(N, replaceEmoji));
            int length = N + replaceEmoji.length();
            M.setSelection(length, length);
            if (M == qVar.C) {
                qVar.D = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.ky
    public final void x(long j10, TLRPC.Document document, String str, boolean z4) {
        q qVar = this.a;
        e1 M = q.M(qVar);
        if (M == null) {
            return;
        }
        int N = q.N(qVar, M);
        try {
            if (str == null) {
                str = "😀";
            }
            SpannableString spannableString = new SpannableString(str);
            org.telegram.ui.Components.u5 u5Var = document != null ? new org.telegram.ui.Components.u5(document, M.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.u5(j10, M.getPaint().getFontMetricsInt());
            u5Var.cacheType = org.telegram.ui.Components.l5.g();
            spannableString.setSpan(u5Var, 0, spannableString.length(), 33);
            M.setText(M.getText().insert(N, spannableString));
            int length = N + spannableString.length();
            M.setSelection(length, length);
            if (M == qVar.C) {
                qVar.D = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.ky
    public final boolean z() {
        return this.a.y;
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ void o(e51 e51Var) {
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ void s(int i10) {
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ void y(long j10) {
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z4) {
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z4, int i10) {
    }

    @Override // org.telegram.ui.Components.ky
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z4, int i10, int i11) {
    }
}
