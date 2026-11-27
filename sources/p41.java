// default package

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class p41 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r41 b;

    public /* synthetic */ p41(r41 r41Var, byte b) {
        this.a = b;
        this.b = r41Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final r41 r41Var = this.b;
        switch (b) {
            case 0:
                final byte b2 = 1;
                hl.c3(new Runnable() { // from class: o41
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLObject tLObject2 = tLObject;
                        r41 r41Var2 = r41Var;
                        switch (b3) {
                            case 0:
                                int i = r41Var2.a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    r41Var2.b.add(tL_businessChatLink);
                                    jn7.f(i).k(jn7.J1, new Object[0]);
                                    jn7.f(i).k(jn7.K1, tL_businessChatLink);
                                    r41Var2.f();
                                    break;
                                }
                                break;
                            default:
                                ArrayList arrayList = r41Var2.b;
                                int i2 = r41Var2.a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    uc7.s1(i2).j4(businesschatlinks.users, false);
                                    uc7.s1(i2).c4(businesschatlinks.chats, false);
                                    jf7.Y(i2).j1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    jn7.f(i2).k(jn7.J1, new Object[0]);
                                    r41Var2.f();
                                } else {
                                    cc4.g(new RuntimeException("Unexpected response from server!"), true);
                                }
                                r41Var2.c = false;
                                r41Var2.d = true;
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b3 = 0;
                hl.c3(new Runnable() { // from class: o41
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        TLObject tLObject2 = tLObject;
                        r41 r41Var2 = r41Var;
                        switch (b32) {
                            case 0:
                                int i = r41Var2.a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    r41Var2.b.add(tL_businessChatLink);
                                    jn7.f(i).k(jn7.J1, new Object[0]);
                                    jn7.f(i).k(jn7.K1, tL_businessChatLink);
                                    r41Var2.f();
                                    break;
                                }
                                break;
                            default:
                                ArrayList arrayList = r41Var2.b;
                                int i2 = r41Var2.a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    uc7.s1(i2).j4(businesschatlinks.users, false);
                                    uc7.s1(i2).c4(businesschatlinks.chats, false);
                                    jf7.Y(i2).j1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    jn7.f(i2).k(jn7.J1, new Object[0]);
                                    r41Var2.f();
                                } else {
                                    cc4.g(new RuntimeException("Unexpected response from server!"), true);
                                }
                                r41Var2.c = false;
                                r41Var2.d = true;
                                break;
                        }
                    }
                });
                break;
        }
    }
}
