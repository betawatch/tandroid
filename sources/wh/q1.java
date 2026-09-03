package wh;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.my;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class q1 implements my {
    public final /* synthetic */ z1 a;

    public q1(z1 z1Var) {
        this.a = z1Var;
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.my
    public final void i(int i10) {
        e1 focusedEditTextOrNull;
        z1 z1Var = this.a;
        if (i10 != 0 && (focusedEditTextOrNull = z1Var.M.getFocusedEditTextOrNull()) != null) {
            z1Var.O0 = focusedEditTextOrNull;
            z1Var.P0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        boolean z4 = i10 != 0;
        z1Var.z0 = z4;
        z1Var.e0(z4);
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.my
    public final boolean k() {
        e1 a02 = z1.a0(this.a);
        if (a02 == null || a02.length() == 0) {
            return false;
        }
        a02.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.my
    public final void l(String str) {
        z1 z1Var = this.a;
        e1 a02 = z1.a0(z1Var);
        if (a02 == null) {
            return;
        }
        int b02 = z1.b0(z1Var, a02);
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, a02.getPaint().getFontMetricsInt(), false, (int[]) null);
            a02.setText(a02.getText().insert(b02, replaceEmoji));
            int length = b02 + replaceEmoji.length();
            a02.setSelection(length, length);
            if (a02 == z1Var.O0) {
                z1Var.P0 = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.my
    public final void t(ArrayList arrayList) {
        this.a.presentFragment(new StickersActivity(5, arrayList));
    }

    @Override // org.telegram.ui.Components.my
    public final void w() {
        this.a.presentFragment(new StickersActivity(0, null));
    }

    @Override // org.telegram.ui.Components.my
    public final void x(long j10, TLRPC.Document document, String str, boolean z4) {
        z1 z1Var = this.a;
        e1 a02 = z1.a0(z1Var);
        if (a02 == null) {
            return;
        }
        int b02 = z1.b0(z1Var, a02);
        try {
            if (str == null) {
                str = "😀";
            }
            SpannableString spannableString = new SpannableString(str);
            org.telegram.ui.Components.u5 u5Var = document != null ? new org.telegram.ui.Components.u5(document, a02.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.u5(j10, a02.getPaint().getFontMetricsInt());
            u5Var.cacheType = org.telegram.ui.Components.l5.g();
            spannableString.setSpan(u5Var, 0, spannableString.length(), 33);
            a02.setText(a02.getText().insert(b02, spannableString));
            int length = b02 + spannableString.length();
            a02.setSelection(length, length);
            if (a02 == z1Var.O0) {
                z1Var.P0 = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.my
    public final boolean z() {
        return this.a.z0;
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ void o(d51 d51Var) {
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ void s(int i10) {
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ void y(long j10) {
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z4) {
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z4, int i10) {
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z4, int i10, int i11) {
    }
}
