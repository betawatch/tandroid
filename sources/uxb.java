// default package

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;
import org.telegram.utils.twidget.w;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class uxb implements rt8, h59, ee, g59, i59, yeb, OnSuccessListener, yxc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uxb(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // i59
    public final boolean d(float f, float f2, int i, View view) {
        q7c q7cVar = (q7c) this.b;
        pac pacVar = (pac) this.c;
        c6c G = q7cVar.g3.G(i);
        if (G == null) {
            return false;
        }
        return ((Boolean) pacVar.b(G, view, Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2))).booleanValue();
    }

    @Override // yeb
    public final Object e() {
        byte b = this.a;
        Object obj = this.c;
        za0 za0Var = (za0) this.b;
        switch (b) {
            case 5:
                Iterable iterable = (Iterable) obj;
                mq9 mq9Var = (mq9) za0Var.c;
                mq9Var.getClass();
                if (iterable.iterator().hasNext()) {
                    mq9Var.a().compileStatement("DELETE FROM events WHERE _id in ".concat(mq9.g(iterable))).execute();
                    break;
                }
                break;
            default:
                Iterator it = ((HashMap) obj).entrySet().iterator();
                while (it.hasNext()) {
                    ((mq9) za0Var.i).e(((Integer) r2.getValue()).intValue(), wd6.h, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // rt8
    public final void f(zo7 zo7Var) {
        wxb wxbVar = (wxb) this.b;
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.c;
        zxb zxbVar = wxbVar.a;
        zxbVar.e.add(Integer.valueOf(tL_forumTopic.id));
        zxbVar.a0();
    }

    @Override // h59
    public final boolean g(int i, View view) {
        mzb mzbVar;
        oyb oybVar = (oyb) this.b;
        bt1 bt1Var = (bt1) this.c;
        TLRPC.TL_forumTopic tL_forumTopic = ((kyb) oybVar.s.c.get(i)).a;
        return (tL_forumTopic == null || (mzbVar = bt1Var.a.g2) == null || !mzbVar.l(tL_forumTopic, view, true)) ? false : true;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        sm2 sm2Var = (sm2) this.b;
        b61 b61Var = (b61) this.c;
        fc4.b("wear-auth: /token delivered to " + ((String) sm2Var.e));
        b61Var.setLoading(false);
        auc.d = null;
        my0 my0Var = auc.c;
        if (my0Var != null) {
            my0Var.dismiss();
            auc.c = null;
        }
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        byte b2 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 2:
                ((p5c) obj2).y0((byte[]) obj);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            default:
                l11.r((Activity) obj2, Uri.parse((String) obj), true, false);
                break;
            case 7:
                iic iicVar = (iic) obj2;
                ((boolean[]) obj)[0] = true;
                iicVar.p0 = 17;
                Intent intent = new Intent(iicVar.b, (Class<?>) VoIPService.class);
                intent.putExtra("user_id", iicVar.d.id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", iicVar.a);
                try {
                    iicVar.b.startService(intent);
                    break;
                } catch (Throwable th) {
                    fc4.g(th, true);
                    return;
                }
            case 8:
                Activity activity = (Activity) obj2;
                Intent intent2 = new Intent(activity, (Class<?>) LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND");
                intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) obj));
                activity.startActivity(intent2);
                break;
            case 9:
                heVar.dismiss();
                pqc pqcVar = new pqc();
                pqcVar.r = !((Boolean) obj).booleanValue();
                ((vqc) obj2).presentFragment(pqcVar);
                break;
            case 10:
                ((qhc) obj2).run();
                ((my0) obj).dismiss();
                break;
            case 11:
                c cVar = (c) obj;
                k11 g = heVar.g(i, true, true);
                g.d();
                sqc sqcVar = new sqc((vqc) obj2, g, b2);
                c.O("disableBackupWithoutUpdatingPhrase");
                cVar.x0(new bb1((Object) cVar, (Object) new qy1((Object) cVar, (Object) sqcVar, (byte) 29), true, false, (byte) 3));
                break;
        }
    }

    @Override // yxc
    public final Object run() {
        w wVar = (w) this.b;
        byte[] bArr = (byte[]) this.c;
        synchronized (wVar) {
            if (bArr != null) {
                if (wVar.d.size() + bArr.length <= 16777216) {
                    wVar.d.write(bArr, 0, bArr.length);
                }
            }
            wVar.d.reset();
            throw new IllegalStateException("Widget engine: argument too large");
        }
        return null;
    }

    @Override // g59
    public final boolean u(View view) {
        return false;
    }

    @Override // i59
    public final void i() {
    }

    @Override // i59
    public final void k(float f) {
    }

    @Override // rt8
    public final void v() {
    }

    @Override // g59
    public final void d(float f, float f2, int i, View view) {
        q7c q7cVar = (q7c) this.b;
        oac oacVar = (oac) this.c;
        c6c G = q7cVar.g3.G(i);
        if (G == null) {
            return;
        }
        oacVar.k(G, view, Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2));
    }

    @Override // g59
    public final void p(View view, float f, float f2) {
    }
}
