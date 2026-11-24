// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class rqa implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wsa b;

    public /* synthetic */ rqa(wsa wsaVar, byte b) {
        this.a = b;
        this.b = wsaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0111  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i;
        TLRPC.Message message;
        TLRPC.Message message2;
        byte b = this.a;
        int i2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        wsa wsaVar = this.b;
        switch (b) {
            case 0:
                TL_stars.TL_starGiftUnique A1 = wsaVar.A1();
                if (fs7.u(A1)) {
                    if (!wsaVar.h1()) {
                        fs7.q(wsaVar.getContext(), wsaVar.a, wsaVar.J0, wsaVar.j(), "STARGIFT_ONCHAIN_SALE_DISABLED", Boolean.valueOf(A1.fixed_sale));
                        break;
                    } else if (!fs7.m(A1)) {
                        wsaVar.W1();
                        break;
                    } else {
                        wsaVar.X1();
                        break;
                    }
                } else if (view.getAlpha() < 0.99f) {
                    wsaVar.i1();
                    break;
                } else {
                    TL_stars.TL_starGiftUnique A12 = wsaVar.A1();
                    if (A12 != null) {
                        if (A12.resell_amount != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wsaVar.J0, wsaVar.getContext());
                            String a0 = jb6.a0(null, null, 2131749819, wsaVar.s1());
                            he heVar = alertDialog$Builder.a;
                            heVar.S = a0;
                            heVar.U = jb6.M0(2131749820, null);
                            alertDialog$Builder.j(jb6.M0(2131750365, null), new uqa(wsaVar, A12, objArr2 == true ? 1 : 0));
                            alertDialog$Builder.g(jb6.M0(2131752542, null), new dq9((byte) 14));
                            alertDialog$Builder.o();
                            break;
                        } else {
                            k47 k47Var = wsaVar.C2;
                            if (k47Var != null && (message2 = k47Var.k) != null) {
                                TLRPC.MessageAction messageAction = message2.action;
                                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                    i = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_resell_at;
                                    if (i > ConnectionsManager.getInstance(wsaVar.a).getCurrentTime()) {
                                        nxa.j1(wsaVar.getContext(), wsaVar.a, null, new vqa(wsaVar, A12, objArr == true ? 1 : 0), wsaVar.J0);
                                        break;
                                    } else {
                                        Context context = wsaVar.getContext();
                                        k47 k47Var2 = wsaVar.C2;
                                        if (k47Var2 != null && (message = k47Var2.k) != null) {
                                            TLRPC.MessageAction messageAction2 = message.action;
                                            if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                i2 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_resell_at;
                                                wsaVar.v2(i2 - ConnectionsManager.getInstance(wsaVar.a).getCurrentTime(), context, true);
                                                break;
                                            }
                                        }
                                        TL_stars.SavedStarGift savedStarGift = wsaVar.A2;
                                        if (savedStarGift != null) {
                                            i2 = savedStarGift.can_resell_at;
                                        }
                                        wsaVar.v2(i2 - ConnectionsManager.getInstance(wsaVar.a).getCurrentTime(), context, true);
                                    }
                                }
                            }
                            TL_stars.SavedStarGift savedStarGift2 = wsaVar.A2;
                            i = savedStarGift2 != null ? savedStarGift2.can_resell_at : 0;
                            if (i > ConnectionsManager.getInstance(wsaVar.a).getCurrentTime()) {
                            }
                        }
                    }
                }
                break;
            case 1:
                wsaVar.Q1();
                break;
            case 2:
                wsaVar.T2 = true;
                wsaVar.A2(false);
                break;
            case 3:
                wsaVar.T1(false);
                break;
            case 4:
                wsaVar.f2();
                break;
            default:
                wsaVar.onBackPressed();
                break;
        }
    }
}
