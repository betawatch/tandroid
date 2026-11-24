// default package

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.media.AudioDeviceInfo;
import android.view.KeyEvent;
import j$.util.Objects;
import java.util.concurrent.Executor;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zk extends BroadcastReceiver {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zk(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        KeyEvent a;
        switch (this.a) {
            case 0:
                al alVar = (al) this.b;
                alVar.c.execute(new yk(alVar, (byte) 2));
                break;
            case 1:
                ((yp) this.b).k();
                break;
            case 2:
                u00 u00Var = (u00) this.b;
                if (!isInitialStickyBroadcast()) {
                    u00Var.k(r00.b(context, intent, (o00) u00Var.w, (AudioDeviceInfo) u00Var.s, u00Var.j()));
                    break;
                }
                break;
            case 3:
                fo1 fo1Var = new fo1(this, (byte) 20);
                if (!"android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                    fo1Var.run();
                    break;
                } else {
                    ((p42) this.b).r.postDelayed(fo1Var, 1000L);
                    break;
                }
            case 4:
                ((er3) this.b).g();
                break;
            case 5:
                if (e21.a) {
                    fc4.b("file system changed");
                }
                kg5 kg5Var = new kg5(this, (byte) 3);
                if (!"android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                    kg5Var.run();
                    break;
                } else {
                    gm.d3(kg5Var, 1000L);
                    break;
                }
            case 6:
                gm.c3(new dt5(this, intent.getStringExtra("mode") != null ? intent.getStringExtra("mode") : "toggle", intent.getStringExtra("style") != null ? intent.getStringExtra("style") : "reveal", (byte) 8));
                break;
            case 7:
                a.d.post(new kg5(this, (byte) 24));
                break;
            case 8:
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    ((ku6) this.b).dismiss();
                    break;
                }
                break;
            case 9:
                if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && (a = bfe.a(intent)) != null) {
                    ((to6) ((lj4) ((ly6) this.b).p.c).a).a.dispatchMediaButtonEvent(a);
                    break;
                }
                break;
            case 10:
                ((Executor) ((ow2) this.b).b).execute(new bl7(this, context, (byte) 1));
                break;
            case 11:
                ((pf3) this.b).c();
                break;
            case 12:
                try {
                    ((IntentSender) this.b).sendIntent(context, 0, null, null, null);
                    break;
                } catch (IntentSender.SendIntentException unused) {
                    return;
                }
            default:
                if ("org.telegram.utils.pip.ACTION".equals(intent.getAction())) {
                    efb efbVar = (efb) this.b;
                    ad8 ad8Var = efbVar.f;
                    if (ad8Var == null) {
                        ad8Var = efbVar.e;
                    }
                    if (ad8Var != null) {
                        ad8Var.a.B0(intent.getIntExtra("action_id", -1));
                        break;
                    }
                }
                break;
        }
    }
}
