// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class rb7 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a71 b;

    public /* synthetic */ rb7(a71 a71Var, byte b) {
        this.a = b;
        this.b = a71Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i;
        int i2;
        byte b = this.a;
        boolean z = true;
        String str = "";
        a71 a71Var = this.b;
        switch (b) {
            case 0:
                if (!(tLObject instanceof TLRPC.TL_help_appConfigNotModified)) {
                    if (!(tLObject instanceof TLRPC.TL_help_appConfig)) {
                        if (tL_error != null) {
                            str = tL_error.code + " " + tL_error.text;
                        }
                        cc4.d("getting appconfig error ".concat(str));
                        Boolean bool = Boolean.FALSE;
                        if (tL_error != null && ((i = tL_error.code) == -2000 || i == -2001)) {
                            z = false;
                        }
                        a71Var.a(bool, null, 0L, Boolean.valueOf(z));
                        break;
                    } else {
                        a71Var.a(Boolean.FALSE, (TLRPC.TL_help_appConfig) tLObject, Long.valueOf(r11.hash), Boolean.TRUE);
                        break;
                    }
                } else {
                    Boolean bool2 = Boolean.TRUE;
                    a71Var.a(bool2, null, 0L, bool2);
                    break;
                }
                break;
            case 1:
                if (!(tLObject instanceof TLRPC.TL_messages_availableEffectsNotModified)) {
                    if (!(tLObject instanceof TLRPC.TL_messages_availableEffects)) {
                        if (tL_error != null) {
                            str = tL_error.code + " " + tL_error.text;
                        }
                        cc4.d("getting available effects error ".concat(str));
                        Boolean bool3 = Boolean.FALSE;
                        if (tL_error != null && ((i2 = tL_error.code) == -2000 || i2 == -2001)) {
                            z = false;
                        }
                        a71Var.a(bool3, null, 0L, Boolean.valueOf(z));
                        break;
                    } else {
                        a71Var.a(Boolean.FALSE, (TLRPC.TL_messages_availableEffects) tLObject, Long.valueOf(r11.hash), Boolean.TRUE);
                        break;
                    }
                } else {
                    Boolean bool4 = Boolean.TRUE;
                    a71Var.a(bool4, null, 0L, bool4);
                    break;
                }
                break;
            case 2:
                if (!(tLObject instanceof TLRPC.TL_messages_emojiGroupsNotModified)) {
                    boolean z2 = tLObject instanceof TLRPC.TL_messages_emojiGroups;
                    Boolean bool5 = Boolean.FALSE;
                    if (!z2) {
                        a71Var.a(bool5, null, 0L, Boolean.TRUE);
                        break;
                    } else {
                        a71Var.a(bool5, (TLRPC.TL_messages_emojiGroups) tLObject, Long.valueOf(r11.hash), Boolean.TRUE);
                        break;
                    }
                } else {
                    Boolean bool6 = Boolean.TRUE;
                    a71Var.a(bool6, null, 0L, bool6);
                    break;
                }
            default:
                if (!(tLObject instanceof TLRPC.TL_emojiListNotModified)) {
                    boolean z3 = tLObject instanceof TLRPC.TL_emojiList;
                    Boolean bool7 = Boolean.FALSE;
                    if (!z3) {
                        a71Var.a(bool7, null, 0L, Boolean.TRUE);
                        break;
                    } else {
                        TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) tLObject;
                        a71Var.a(bool7, tL_emojiList, Long.valueOf(tL_emojiList.hash), Boolean.TRUE);
                        break;
                    }
                } else {
                    Boolean bool8 = Boolean.TRUE;
                    a71Var.a(bool8, null, 0L, bool8);
                    break;
                }
        }
    }
}
