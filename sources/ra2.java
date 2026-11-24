// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ra2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ra2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        g26 g26Var = (g26) this.b;
        nv8 nv8Var = (nv8) this.c;
        synchronized (g26Var) {
            if (g26Var.b == null) {
                g26Var.a.add(nv8Var);
            } else {
                g26Var.b.add(nv8Var.get());
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ke3 ke3Var;
        switch (this.a) {
            case 0:
                sa2 sa2Var = (sa2) this.b;
                y41 y41Var = (y41) this.c;
                sa2Var.c.d();
                y41Var.run();
                return;
            case 1:
                ((ib2) this.b).Z((he[]) this.c);
                return;
            case 2:
                ib2 ib2Var = (ib2) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    ib2Var.getMessagesController().X3(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    ib2Var.w = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (sd2.c0(next) || sd2.p0(next)) {
                            it.remove();
                        }
                    }
                }
                ib2Var.x = false;
                ib2Var.y = true;
                ib2Var.g0();
                return;
            case 3:
                eb2 eb2Var = (eb2) this.b;
                gw5 gw5Var = (gw5) this.c;
                eb2Var.y.d.Q = false;
                gw5Var.run();
                return;
            case 4:
                eb2 eb2Var2 = (eb2) this.b;
                hw5 hw5Var = (hw5) this.c;
                eb2Var2.y.d.P = false;
                hw5Var.run();
                return;
            case 5:
                eb2 eb2Var3 = (eb2) this.b;
                Runnable runnable = (Runnable) this.c;
                ib2 ib2Var2 = eb2Var3.y.d;
                ib2Var2.P = false;
                ib2Var2.Q = false;
                runnable.run();
                return;
            case 6:
                eb2 eb2Var4 = (eb2) this.b;
                ((TLRPC.Chat) this.c).join_request = true;
                eb2Var4.h = true;
                eb2Var4.c.setChecked(true);
                return;
            case 7:
                rc2 rc2Var = (rc2) this.b;
                k47 k47Var = (k47) this.c;
                if (rc2Var.Q5 == k47Var && rc2Var.B8 && rc2Var.eb != null) {
                    if (((ed8) jd8.b.get(Long.valueOf(k47Var.F0().id))) == null) {
                        rc2Var.eb.D0(rc2Var, false);
                        return;
                    }
                    rc2Var.G8 = rc2Var.F8;
                    rc2Var.E8 = true;
                    rc2Var.eb.o1(rc2Var, false);
                    return;
                }
                return;
            case 8:
                ((rc2) this.b).Q0.draw((Canvas) this.c);
                return;
            case 9:
                ((rc2) this.b).post(new dc2((rc2) this.c, (byte) 7));
                return;
            case 10:
                ((bd2) this.b).a.getMessagesController().N1().k.j((ArrayList) this.c);
                return;
            case 11:
                ((ef2) this.b).b.L0((ArrayList) this.c);
                return;
            case 12:
                ((ff2) this.b).b.L0((ArrayList) this.c);
                return;
            case 13:
                qu0 qu0Var = (qu0) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                qu0Var.a(bitmap != null ? new osc(bitmap, 0, null) : null);
                return;
            case 14:
                ((ResultCallback) this.b).onError((TLRPC.TL_error) this.c);
                return;
            case 15:
                ((ff2) this.b).onError((TLRPC.TL_error) this.c);
                return;
            case 16:
                uf2 uf2Var = (uf2) this.b;
                ff2 ff2Var = (ff2) this.c;
                tf2 tf2Var = uf2Var.f;
                tf2Var.b = System.currentTimeMillis();
                tf2Var.c = true;
                ff2Var.onComplete(null);
                return;
            case 17:
                ((wg2) this.b).getMessagesController().a3(0, ((TLRPC.Updates) this.c).chats.get(0).id, true);
                return;
            case 18:
                mg2 mg2Var = (mg2) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                wg2 wg2Var = mg2Var.a;
                if (c41.a(wg2Var)) {
                    c41.C(user.first_name, wg2Var).j();
                    return;
                }
                return;
            case 19:
                yg2 yg2Var = (yg2) this.b;
                ge7 ge7Var = (ge7) this.c;
                x41.a(yg2Var.a).b();
                ge7Var.run();
                yg2Var.dismiss();
                return;
            case 20:
                ((hh2) this.b).c0((TLObject) this.c);
                return;
            case 21:
                vj2 vj2Var = (vj2) this.b;
                View view = (View) this.c;
                uj2 uj2Var = (uj2) vj2Var.d;
                if ((vj2Var.a & 2) != 0) {
                    boolean c1 = uj2Var.c1(view, vj2Var.b, vj2Var.c);
                    int i = vj2Var.a;
                    if (!c1) {
                        vj2Var.a = i | 8;
                        return;
                    }
                    vj2Var.a = i & (-3);
                    vj2Var.e = null;
                    view.performHapticFeedback(0);
                    vj2Var.a = (vj2Var.a | 4) & (-11);
                    vj2Var.e = null;
                    return;
                }
                return;
            case 22:
                ((rp2) this.b).a((SpannableString) this.c);
                return;
            case 23:
                ap2 ap2Var = (ap2) this.b;
                vo2 vo2Var = (vo2) this.c;
                ap2Var.getClass();
                ap2Var.presentFragment(yv1.ga(vo2Var.b.id));
                return;
            case 24:
                ((pp2) this.b).t1.presentFragment(yv1.ga(((vo2) this.c).b.id));
                return;
            case 25:
                xs7 xs7Var = (xs7) this.b;
                nv8 nv8Var = (nv8) this.c;
                if (xs7Var.b != xs7.d) {
                    dq9.m("provide() can be called only once.");
                    return;
                }
                synchronized (xs7Var) {
                    ke3Var = xs7Var.a;
                    xs7Var.a = null;
                    xs7Var.b = nv8Var;
                }
                ke3Var.f(nv8Var);
                return;
            case 26:
                a();
                return;
            case 27:
                ((ConferenceCall) this.b).lambda$processUpdates$4((TLRPC.Updates) this.c);
                return;
            case 28:
                ((mx6) this.b).E((mt2) this.c);
                return;
            default:
                ((bw2) this.b).j(((Long) this.c).longValue());
                return;
        }
    }
}
