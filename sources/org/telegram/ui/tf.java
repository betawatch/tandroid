package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tf implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tf(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
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
                tn tnVar = (tn) this.b;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) this.c;
                MessageObject messageObject = (MessageObject) this.d;
                eg.r rVar = (eg.r) this.e;
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) kf.c.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (tnVar.getParentActivity() == null) {
                    return false;
                }
                if ((tnVar.K0.getVisibility() == 0 && tL_inlineButtonTypeUrl == null && !kf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) && !kf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) && !kf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) && !kf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) && !kf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) && !kf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) || tL_inlineButtonTypeUrl == null) {
                    return false;
                }
                tnVar.Z9(null, tL_inlineButtonTypeUrl.url, true, null, messageObject);
                try {
                    rVar.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                return org.telegram.ui.Components.ni.q((org.telegram.ui.Components.ni) this.b, (Context) this.c, (org.telegram.ui.ActionBar.c6) this.d, (org.telegram.ui.ActionBar.o2) this.e, view);
        }
    }
}
