package qh;

import android.text.SpannableString;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.my;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class q4 implements my {
    public final /* synthetic */ a5 a;

    public q4(a5 a5Var) {
        this.a = a5Var;
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
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.my
    public final boolean k() {
        eg.b editText = ((eg.z3) this.a.G0).getEditText();
        if (editText == null || editText.length() == 0) {
            return false;
        }
        editText.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.my
    public final void l(String str) {
        eg.z3 z3Var;
        eg.b editText;
        Emoji.EmojiSpan[] emojiSpanArr;
        eg.j jVar = this.a.G0;
        if ((jVar instanceof eg.z3) && (editText = (z3Var = (eg.z3) jVar).getEditText()) != null) {
            int selectionEnd = editText.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                CharSequence replaceEmoji = Emoji.replaceEmoji(str, z3Var.getFontMetricsInt(), false);
                if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                    for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                        emojiSpan.scale = 0.85f;
                    }
                }
                editText.setText(editText.getText().insert(selectionEnd, replaceEmoji));
                int length = selectionEnd + replaceEmoji.length();
                editText.setSelection(length, length);
            } catch (Exception e6) {
                FileLog.e(e6);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.Components.my
    public final void n() {
        a5 a5Var = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a5Var.getContext(), 0, a5Var.D1);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new mh.m5(this, 28));
        l.d.u(R.string.Cancel, alertDialog$Builder, null);
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.my
    public final void x(long j10, TLRPC.Document document, String str, boolean z4) {
        org.telegram.ui.Components.u5 u5Var;
        eg.b editText = ((eg.z3) this.a.G0).getEditText();
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
                u5Var = new org.telegram.ui.Components.u5(document.id, 1.0f, editText.getPaint().getFontMetricsInt());
                u5Var.document = document;
            } else {
                u5Var = new org.telegram.ui.Components.u5(j10, 1.0f, editText.getPaint().getFontMetricsInt());
            }
            spannableString.setSpan(u5Var, 0, spannableString.length(), 33);
            editText.setText(editText.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editText.setSelection(length, length);
        } catch (Exception e6) {
            FileLog.e(e6);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ boolean z() {
        return false;
    }

    @Override // org.telegram.ui.Components.my
    public final void q() {
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.my
    public final /* synthetic */ void i(int i10) {
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
    public final /* synthetic */ void t(ArrayList arrayList) {
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
