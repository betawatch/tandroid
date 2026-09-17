package zf;

import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public abstract class c {
    public static TL_keyboard.ButtonTypeProto a(TL_keyboard.KeyboardButtonProto keyboardButtonProto, Class cls) {
        if (keyboardButtonProto == null) {
            return null;
        }
        TL_keyboard.ButtonTypeProto type = keyboardButtonProto.getType();
        if (cls.isInstance(type)) {
            return (TL_keyboard.ButtonTypeProto) cls.cast(type);
        }
        return null;
    }

    public static boolean b(TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        return c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeWebView.class) || c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
    }

    public static boolean c(TL_keyboard.KeyboardButtonProto keyboardButtonProto, Class cls) {
        return a(keyboardButtonProto, cls) != null;
    }
}
