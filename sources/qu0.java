// default package

import android.graphics.Point;
import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class qu0 implements qac {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qu0(int i, long j, qac qacVar, TLRPC.WallPaper wallPaper) {
        this.d = qacVar;
        this.e = wallPaper;
        this.b = i;
        this.c = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qac
    public final void a(Object obj) {
        String str;
        TLRPC.Chat chat;
        byte b = this.a;
        int i = this.b;
        long j = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                sxb sxbVar = (sxb) obj3;
                nk3 nk3Var = (nk3) obj2;
                Boolean bool = (Boolean) obj;
                if (sxbVar != null) {
                    sxbVar.finishFragment();
                    nk3Var.removeSelfFromStack();
                } else {
                    nk3Var.finishFragment();
                }
                d S = LaunchActivity.S();
                if (S != null) {
                    if (j >= 0) {
                        TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(j));
                        str = m9c.l(W1);
                        chat = W1;
                    } else {
                        TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-j));
                        if (L0 == null) {
                            str = "";
                            chat = L0;
                        } else {
                            str = L0.title;
                            chat = L0;
                        }
                    }
                    c41 b0 = c41.b0(S);
                    SpannableStringBuilder S2 = gm.S2(jb6.a0(null, null, bool.booleanValue() ? 2131752941 : 2131752940, str));
                    b0.getClass();
                    b0.V(Arrays.asList(chat), S2, null, null).k(false);
                    break;
                }
                break;
            case 1:
                qac qacVar = (qac) obj3;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj2;
                osc oscVar = (osc) obj;
                if (oscVar == null) {
                    gn5 b2 = gn5.b(wallPaper.document);
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    imageReceiver.A1 = false;
                    Point point = gm.q;
                    imageReceiver.d0(b2, (Math.min(point.x, point.y) / gm.p) + "_" + (Math.max(point.x, point.y) / gm.p) + "_f", null, ".jpg", wallPaper, 1);
                    imageReceiver.h1 = new hg((Object) qacVar, this.b, this.c, (byte) 3);
                    fn5.z().I(imageReceiver, null);
                    break;
                } else {
                    qacVar.a(oscVar);
                    break;
                }
            default:
                String str2 = (String) obj3;
                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    yr7.g(j);
                    yr7.d.remove(yr7.a(i, j));
                    yr7.c();
                    yr7.s(2131749520, tL_messageActionStarGiftOnchainOffer.gift);
                    break;
                } else {
                    u31 G = yr7.h().G(R.raw.contact_check, 3, jb6.a0(null, null, 2131749560, str2));
                    G.u = true;
                    G.j();
                    break;
                }
        }
    }

    public /* synthetic */ qu0(sxb sxbVar, nk3 nk3Var, long j, int i) {
        this.d = sxbVar;
        this.e = nk3Var;
        this.c = j;
        this.b = i;
    }

    public /* synthetic */ qu0(String str, long j, int i, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        this.d = str;
        this.c = j;
        this.b = i;
        this.e = tL_messageActionStarGiftOnchainOffer;
    }
}
