// default package

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.view.KeyEvent;
import j$.util.Objects;
import java.util.concurrent.Executor;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class zj extends BroadcastReceiver {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zj(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        KeyEvent a;
        switch (this.a) {
            case 0:
                ak akVar = (ak) this.b;
                akVar.c.execute(new yj(akVar, (byte) 2));
                break;
            case 1:
                ((yo) this.b).k();
                break;
            case 2:
                uz uzVar = (uz) this.b;
                if (!isInitialStickyBroadcast()) {
                    uzVar.b(rz.b(context, intent, uzVar.j, uzVar.i, uzVar.a()));
                    break;
                }
                break;
            case 3:
                hq1 hq1Var = new hq1(this, (byte) 15);
                if (!"android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                    hq1Var.run();
                    break;
                } else {
                    ((d32) this.b).r.postDelayed(hq1Var, 1000L);
                    break;
                }
            case 4:
                ((up3) this.b).g();
                break;
            case 5:
                if (w01.a) {
                    fa4.b("file system changed");
                }
                iu4 iu4Var = new iu4(this, (byte) 26);
                if (!"android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                    iu4Var.run();
                    break;
                } else {
                    gl.d3(iu4Var, 1000L);
                    break;
                }
            case 6:
                gl.c3(new sx5((Object) this, (Object) (intent.getStringExtra("mode") != null ? intent.getStringExtra("mode") : "toggle"), (Object) (intent.getStringExtra("style") != null ? intent.getStringExtra("style") : "reveal"), (byte) 6));
                break;
            case 7:
                a.d.post(new tp5(this, (byte) 17));
                break;
            case 8:
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    ((js6) this.b).dismiss();
                    break;
                }
                break;
            case 9:
                if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && (a = ade.a(intent)) != null) {
                    ((tm6) ((gi3) ((lw6) this.b).p.c).a).a.dispatchMediaButtonEvent(a);
                    break;
                }
                break;
            case 10:
                ((Executor) ((ev2) this.b).b).execute(new bj7(this, context, (byte) 0));
                break;
            case 11:
                ((ee3) this.b).c();
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
                    ddb ddbVar = (ddb) this.b;
                    xa8 xa8Var = ddbVar.f;
                    if (xa8Var == null) {
                        xa8Var = ddbVar.e;
                    }
                    if (xa8Var != null) {
                        xa8Var.a.G2(intent.getIntExtra("action_id", -1));
                        break;
                    }
                }
                break;
        }
    }
}
