package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wf implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wf(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                qn qnVar = (qn) this.b;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) this.c;
                MessageObject messageObject = (MessageObject) this.d;
                bg.t tVar = (bg.t) this.e;
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) gf.c.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (qnVar.getParentActivity() == null) {
                    return false;
                }
                if ((qnVar.K0.getVisibility() == 0 && tL_inlineButtonTypeUrl == null && !gf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) && !gf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) && !gf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) && !gf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) && !gf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) && !gf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) || tL_inlineButtonTypeUrl == null) {
                    return false;
                }
                qnVar.Z9(null, tL_inlineButtonTypeUrl.url, true, null, messageObject);
                try {
                    tVar.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                return org.telegram.ui.Components.ki.q((org.telegram.ui.Components.ki) this.b, (Context) this.c, (org.telegram.ui.ActionBar.b6) this.d, (org.telegram.ui.ActionBar.o2) this.e, view);
        }
    }
}
