// default package

import android.graphics.Point;
import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class qt0 implements pcc {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qt0(int i, long j, pcc pccVar, TLRPC.WallPaper wallPaper) {
        this.d = pccVar;
        this.e = wallPaper;
        this.b = i;
        this.c = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pcc
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
                tzb tzbVar = (tzb) obj3;
                uj3 uj3Var = (uj3) obj2;
                Boolean bool = (Boolean) obj;
                if (tzbVar != null) {
                    tzbVar.finishFragment();
                    uj3Var.removeSelfFromStack();
                } else {
                    uj3Var.finishFragment();
                }
                e S = LaunchActivity.S();
                if (S != null) {
                    if (j >= 0) {
                        TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(j));
                        str = lbc.l(X1);
                        chat = X1;
                    } else {
                        TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-j));
                        if (M0 == null) {
                            str = "";
                            chat = M0;
                        } else {
                            str = M0.title;
                            chat = M0;
                        }
                    }
                    d31 b0 = d31.b0(S);
                    SpannableStringBuilder S2 = hl.S2(ob6.a0(null, null, bool.booleanValue() ? 2131752969 : 2131752968, str));
                    b0.getClass();
                    b0.V(Arrays.asList(chat), S2, null, null).k(false);
                    break;
                }
                break;
            case 1:
                pcc pccVar = (pcc) obj3;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj2;
                avc avcVar = (avc) obj;
                if (avcVar == null) {
                    jn5 b2 = jn5.b(wallPaper.document);
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    imageReceiver.A1 = false;
                    Point point = hl.q;
                    imageReceiver.d0(b2, (Math.min(point.x, point.y) / hl.p) + "_" + (Math.max(point.x, point.y) / hl.p) + "_f", null, ".jpg", wallPaper, 1);
                    imageReceiver.h1 = new lf((Object) pccVar, this.b, this.c, (byte) 3);
                    in5.z().I(imageReceiver, null);
                    break;
                } else {
                    pccVar.a(avcVar);
                    break;
                }
            default:
                String str2 = (String) obj3;
                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    vs7.g(j);
                    vs7.d.remove(vs7.a(i, j));
                    vs7.c();
                    vs7.s(2131749532, tL_messageActionStarGiftOnchainOffer.gift);
                    break;
                } else {
                    v21 G = vs7.h().G(R.raw.contact_check, 3, ob6.a0(null, null, 2131749572, str2));
                    G.u = true;
                    G.j();
                    break;
                }
        }
    }

    public /* synthetic */ qt0(tzb tzbVar, uj3 uj3Var, long j, int i) {
        this.d = tzbVar;
        this.e = uj3Var;
        this.c = j;
        this.b = i;
    }

    public /* synthetic */ qt0(String str, long j, int i, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        this.d = str;
        this.c = j;
        this.b = i;
        this.e = tL_messageActionStarGiftOnchainOffer;
    }
}
