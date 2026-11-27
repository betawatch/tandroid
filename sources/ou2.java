// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class ou2 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lv2 b;

    public /* synthetic */ ou2(lv2 lv2Var, byte b) {
        this.a = b;
        this.b = lv2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final byte b2 = 1;
        final lv2 lv2Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new Runnable() { // from class: ru2
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        lv2 lv2Var2 = lv2Var;
                        switch (b3) {
                            case 0:
                                if (tL_error2 == null) {
                                    lv2Var2.I = ((TLRPC.TL_accountDaysTTL) tLObject2).days;
                                    lv2Var2.H = (byte) 2;
                                } else {
                                    lv2Var2.H = (byte) 0;
                                }
                                lv2Var2.getNotificationCenter().k(48, new Object[0]);
                                break;
                            default:
                                if (tL_error2 == null) {
                                    lv2Var2.Y = (TLRPC.GlobalPrivacySettings) tLObject2;
                                    lv2Var2.G = (byte) 2;
                                } else {
                                    lv2Var2.G = (byte) 0;
                                }
                                lv2Var2.getNotificationCenter().k(48, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            case 1:
                if (tLObject != null) {
                    TLRPC.TL_help_inviteText tL_help_inviteText = (TLRPC.TL_help_inviteText) tLObject;
                    if (tL_help_inviteText.message.length() != 0) {
                        hl.c3(new ve2(lv2Var, tL_help_inviteText, b2));
                        break;
                    }
                }
                break;
            default:
                final byte b3 = 0;
                hl.c3(new Runnable() { // from class: ru2
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        lv2 lv2Var2 = lv2Var;
                        switch (b32) {
                            case 0:
                                if (tL_error2 == null) {
                                    lv2Var2.I = ((TLRPC.TL_accountDaysTTL) tLObject2).days;
                                    lv2Var2.H = (byte) 2;
                                } else {
                                    lv2Var2.H = (byte) 0;
                                }
                                lv2Var2.getNotificationCenter().k(48, new Object[0]);
                                break;
                            default:
                                if (tL_error2 == null) {
                                    lv2Var2.Y = (TLRPC.GlobalPrivacySettings) tLObject2;
                                    lv2Var2.G = (byte) 2;
                                } else {
                                    lv2Var2.G = (byte) 0;
                                }
                                lv2Var2.getNotificationCenter().k(48, new Object[0]);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
