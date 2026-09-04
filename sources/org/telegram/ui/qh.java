package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class qh implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qh(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        int i10 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i10) {
            case 0:
                co.x0((co) obj4, (TLRPC.User) obj3, (TLRPC.TL_attachMenuBot) obj2);
                break;
            case 1:
                uy.W((uy) obj4, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj3);
                break;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                of.e eVar = (of.e) obj3;
                int[] iArr = (int[]) obj2;
                Long l4 = (Long) obj;
                Pattern pattern = LaunchActivity.B1;
                if (eVar != null) {
                    launchActivity.getClass();
                    eVar.b();
                }
                if (MessagesController.getInstance(launchActivity.O).getUserOrChat(l4.longValue()) != null) {
                    new yh.p1(launchActivity, iArr[0], l4.longValue(), null, null).show();
                    break;
                } else {
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    if (R != null && (R instanceof co)) {
                        ((co) R).qb();
                        break;
                    }
                }
                break;
            default:
                fc0 fc0Var = (fc0) obj4;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                org.telegram.ui.Components.in0 in0Var = (org.telegram.ui.Components.in0) obj2;
                Long l10 = (Long) obj;
                TLRPC.User user = l10 == null ? null : MessagesController.getInstance(fc0Var.b).getUser(l10);
                userArr[0] = user;
                if (user != null) {
                    in0Var.run();
                    break;
                } else {
                    fc0Var.a();
                    org.telegram.messenger.w1.p(R.string.NoUsernameFound, fc0.b(), null);
                    break;
                }
        }
    }

    public /* synthetic */ qh(uy uyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        this.a = 1;
        this.c = uyVar;
        this.b = tL_attachMenuBot;
        this.d = launchActivity;
    }
}
