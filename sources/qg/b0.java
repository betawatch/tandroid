package qg;

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
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.l61;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class b0 implements az {
    public final /* synthetic */ m0 a;

    public b0(m0 m0Var) {
        this.a = m0Var;
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ int f() {
        return 0;
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.az
    public final boolean k() {
        b editText = ((w2) this.a.S0).getEditText();
        if (editText == null || editText.length() == 0) {
            return false;
        }
        editText.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.az
    public final void l(String str) {
        w2 w2Var;
        b editText;
        Emoji.EmojiSpan[] emojiSpanArr;
        j jVar = this.a.S0;
        if ((jVar instanceof w2) && (editText = (w2Var = (w2) jVar).getEditText()) != null) {
            int selectionEnd = editText.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                CharSequence replaceEmoji = Emoji.replaceEmoji(str, w2Var.getFontMetricsInt(), false);
                if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                    for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                        emojiSpan.scale = 0.85f;
                    }
                }
                editText.setText(editText.getText().insert(selectionEnd, replaceEmoji));
                int length = selectionEnd + replaceEmoji.length();
                editText.setSelection(length, length);
            } catch (Exception e7) {
                FileLog.e(e7);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.Components.az
    public final void n() {
        m0 m0Var = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m0Var.getContext(), 0, m0Var.Q1);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new m4.w(this, 21));
        hg.c.p(R.string.Cancel, alertDialog$Builder, null);
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.az
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        b editText = ((w2) this.a.S0).getEditText();
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(document != null ? new b6(document, editText.getPaint().getFontMetricsInt()) : new b6(j3, editText.getPaint().getFontMetricsInt()), 0, spannableString.length(), 33);
            editText.setText(editText.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editText.setSelection(length, length);
        } catch (Exception e7) {
            FileLog.e(e7);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ boolean z() {
        return false;
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void i(int i10) {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void o(l61 l61Var) {
    }

    @Override // org.telegram.ui.Components.az
    public final void q() {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void s(int i10) {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void t(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void y(long j3) {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void e(Object obj, Object obj2) {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.az
    public final /* synthetic */ void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
