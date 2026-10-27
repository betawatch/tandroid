package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zf implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zf(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                wn wnVar = (wn) this.b;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) this.c;
                MessageObject messageObject = (MessageObject) this.d;
                ln lnVar = (ln) this.e;
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) bg.c.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (wnVar.getParentActivity() == null) {
                    return false;
                }
                if ((wnVar.a1.getVisibility() == 0 && tL_inlineButtonTypeUrl == null && !bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) && !bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) && !bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) && !bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) && !bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) && !bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) || tL_inlineButtonTypeUrl == null) {
                    return false;
                }
                wnVar.ma(null, tL_inlineButtonTypeUrl.url, true, null, messageObject);
                try {
                    lnVar.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                return org.telegram.ui.Components.ti.x((org.telegram.ui.Components.ti) this.b, (Context) this.c, (org.telegram.ui.ActionBar.u6) this.d, (org.telegram.ui.ActionBar.r2) this.e, view);
        }
    }
}
