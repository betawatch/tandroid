package qh;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.wx;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class p1 implements wx {
    public final /* synthetic */ x1 a;

    public p1(x1 x1Var) {
        this.a = x1Var;
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.wx
    public final void i(int i9) {
        d1 focusedEditTextOrNull;
        x1 x1Var = this.a;
        if (i9 != 0 && (focusedEditTextOrNull = x1Var.L.getFocusedEditTextOrNull()) != null) {
            x1Var.N0 = focusedEditTextOrNull;
            x1Var.O0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        boolean z10 = i9 != 0;
        x1Var.y0 = z10;
        x1Var.d0(z10);
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.wx
    public final boolean k() {
        d1 Z = x1.Z(this.a);
        if (Z == null || Z.length() == 0) {
            return false;
        }
        Z.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.wx
    public final void l(String str) {
        x1 x1Var = this.a;
        d1 Z = x1.Z(x1Var);
        if (Z == null) {
            return;
        }
        int a02 = x1.a0(x1Var, Z);
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, Z.getPaint().getFontMetricsInt(), false, (int[]) null);
            Z.setText(Z.getText().insert(a02, replaceEmoji));
            int length = a02 + replaceEmoji.length();
            Z.setSelection(length, length);
            if (Z == x1Var.N0) {
                x1Var.O0 = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.wx
    public final void t(ArrayList arrayList) {
        this.a.presentFragment(new StickersActivity(5, arrayList));
    }

    @Override // org.telegram.ui.Components.wx
    public final void w() {
        this.a.presentFragment(new StickersActivity(0, null));
    }

    @Override // org.telegram.ui.Components.wx
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        x1 x1Var = this.a;
        d1 Z = x1.Z(x1Var);
        if (Z == null) {
            return;
        }
        int a02 = x1.a0(x1Var, Z);
        try {
            if (str == null) {
                str = "😀";
            }
            SpannableString spannableString = new SpannableString(str);
            org.telegram.ui.Components.t5 t5Var = document != null ? new org.telegram.ui.Components.t5(document, Z.getPaint().getFontMetricsInt()) : new org.telegram.ui.Components.t5(j10, Z.getPaint().getFontMetricsInt());
            t5Var.cacheType = org.telegram.ui.Components.k5.g();
            spannableString.setSpan(t5Var, 0, spannableString.length(), 33);
            Z.setText(Z.getText().insert(a02, spannableString));
            int length = a02 + spannableString.length();
            Z.setSelection(length, length);
            if (Z == x1Var.N0) {
                x1Var.O0 = length;
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.wx
    public final boolean z() {
        return this.a.y0;
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ void o(h41 h41Var) {
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ void s(int i9) {
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ void y(long j10) {
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i9) {
    }

    @Override // org.telegram.ui.Components.wx
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i9, int i10) {
    }
}
