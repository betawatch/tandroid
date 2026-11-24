// default package

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class v11 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ v11(w11 w11Var, h19 h19Var, boolean z, int i, int i2) {
        this.e = w11Var;
        this.f = h19Var;
        this.d = z;
        this.b = i;
        this.c = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e4, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) != false) goto L19;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.Document e;
        byte b = this.a;
        r2 = null;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = null;
        boolean z = this.d;
        int i = this.c;
        int i2 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        byte b2 = 1;
        switch (b) {
            case 0:
                w11 w11Var = (w11) obj2;
                h19 h19Var = (h19) obj;
                d Q = LaunchActivity.Q();
                long j = h19Var.g;
                int i3 = y6c.t0;
                if (j == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hq6.d0(i3).r.get(h19Var.f);
                    if (tL_availableReaction != null) {
                        e = tL_availableReaction.activate_animation;
                    }
                } else {
                    e = vl.e(i3, j);
                }
                if (e != null && Q != null) {
                    u21.b0(Q).y(w11Var.a.h, e, z ? new bt(i2, i, Q, b2) : null).k(true);
                    break;
                }
                break;
            case 1:
                byte b3 = 3;
                mu1 mu1Var = (mu1) obj2;
                t09 t09Var = (t09) obj;
                m8 m8Var = mu1Var.g9;
                if (m8Var != null && mu1Var.fragmentView != null && !m8Var.isShowing()) {
                    Activity parentActivity = mu1Var.getParentActivity();
                    Typeface typeface = gl.a;
                    if (parentActivity != null && !parentActivity.isDestroyed() && !parentActivity.isFinishing()) {
                        mu1Var.g9.showAtLocation(mu1Var.A0, 51, i2, i);
                        mu1Var.d8(mu1Var.g9);
                        if (z && t09Var != null) {
                            t09Var.p(true);
                        }
                        gl.d3(new vm1(mu1Var, b3), 420L);
                        break;
                    }
                }
                break;
            case 2:
                TLObject tLObject = (TLObject) obj2;
                String str = (String) obj;
                if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    na7.q1(i2).b4(tL_payments_uniqueStarGift.users, false);
                    na7.q1(i2).V3(tL_payments_uniqueStarGift.chats, false);
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                    }
                }
                if (tL_starGiftUnique != null) {
                    String str2 = tL_starGiftUnique.owner_address;
                    if (!z) {
                        break;
                    } else if (c.b(str2, c.C(i2).x())) {
                        c.C(i2).A().i(tL_starGiftUnique);
                        gta.v(i2, false).a0(tL_starGiftUnique);
                        gta.v(i2, false).M(y6c.h(i2).e());
                        break;
                    }
                }
                int i4 = i + 1;
                if (i4 < 8) {
                    gl.d3(new rn1(i2, i4, str, z), cq7.b[i4]);
                    break;
                }
                break;
            default:
                z3a z3aVar = (z3a) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                z3aVar.getMediaDataController().x0(message.dialog_id);
                z3aVar.getNotificationCenter().k(21, Integer.valueOf(i2), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i), Boolean.valueOf(z));
                z3aVar.getNotificationCenter().k(22, Integer.valueOf(i2), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i), Boolean.valueOf(z));
                z3aVar.c0(i2);
                z3aVar.h0(i2, z);
                break;
        }
    }

    public /* synthetic */ v11(mu1 mu1Var, int i, int i2, boolean z, t09 t09Var) {
        this.e = mu1Var;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.f = t09Var;
    }

    public /* synthetic */ v11(z3a z3aVar, TLRPC.Message message, int i, int i2, boolean z) {
        this.e = z3aVar;
        this.f = message;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public /* synthetic */ v11(TLObject tLObject, int i, boolean z, int i2, String str) {
        this.e = tLObject;
        this.b = i;
        this.d = z;
        this.c = i2;
        this.f = str;
    }
}
