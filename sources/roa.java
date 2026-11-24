// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class roa implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vqa b;

    public /* synthetic */ roa(vqa vqaVar, byte b) {
        this.a = b;
        this.b = vqaVar;
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
        vqa vqaVar = this.b;
        switch (b) {
            case 0:
                TL_stars.TL_starGiftUnique A1 = vqaVar.A1();
                if (cq7.u(A1)) {
                    if (!vqaVar.h1()) {
                        cq7.q(vqaVar.getContext(), vqaVar.a, vqaVar.J0, vqaVar.j(), "STARGIFT_ONCHAIN_SALE_DISABLED", Boolean.valueOf(A1.fixed_sale));
                        break;
                    } else if (!cq7.m(A1)) {
                        vqaVar.W1();
                        break;
                    } else {
                        vqaVar.X1();
                        break;
                    }
                } else if (view.getAlpha() < 0.99f) {
                    vqaVar.i1();
                    break;
                } else {
                    TL_stars.TL_starGiftUnique A12 = vqaVar.A1();
                    if (A12 != null) {
                        if (A12.resell_amount != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vqaVar.J0, vqaVar.getContext());
                            String a0 = k96.a0(null, null, 2131749870, vqaVar.s1());
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = a0;
                            hdVar.U = k96.M0(2131749871, null);
                            alertDialog$Builder.j(k96.M0(2131750416, null), new uoa(vqaVar, A12, objArr2 == true ? 1 : 0));
                            alertDialog$Builder.g(k96.M0(2131752577, null), new ho9((byte) 13));
                            alertDialog$Builder.o();
                            break;
                        } else {
                            k27 k27Var = vqaVar.C2;
                            if (k27Var != null && (message2 = k27Var.k) != null) {
                                TLRPC.MessageAction messageAction = message2.action;
                                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                    i = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_resell_at;
                                    if (i > ConnectionsManager.getInstance(vqaVar.a).getCurrentTime()) {
                                        jva.i1(vqaVar.getContext(), vqaVar.a, null, new voa(vqaVar, A12, objArr == true ? 1 : 0), vqaVar.J0);
                                        break;
                                    } else {
                                        Context context = vqaVar.getContext();
                                        k27 k27Var2 = vqaVar.C2;
                                        if (k27Var2 != null && (message = k27Var2.k) != null) {
                                            TLRPC.MessageAction messageAction2 = message.action;
                                            if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                i2 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_resell_at;
                                                vqaVar.v2(i2 - ConnectionsManager.getInstance(vqaVar.a).getCurrentTime(), context, true);
                                                break;
                                            }
                                        }
                                        TL_stars.SavedStarGift savedStarGift = vqaVar.A2;
                                        if (savedStarGift != null) {
                                            i2 = savedStarGift.can_resell_at;
                                        }
                                        vqaVar.v2(i2 - ConnectionsManager.getInstance(vqaVar.a).getCurrentTime(), context, true);
                                    }
                                }
                            }
                            TL_stars.SavedStarGift savedStarGift2 = vqaVar.A2;
                            i = savedStarGift2 != null ? savedStarGift2.can_resell_at : 0;
                            if (i > ConnectionsManager.getInstance(vqaVar.a).getCurrentTime()) {
                            }
                        }
                    }
                }
                break;
            case 1:
                vqaVar.Q1();
                break;
            case 2:
                vqaVar.T2 = true;
                vqaVar.A2(false);
                break;
            case 3:
                vqaVar.T1(false);
                break;
            case 4:
                vqaVar.f2();
                break;
            default:
                vqaVar.onBackPressed();
                break;
        }
    }
}
