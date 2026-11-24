// default package

import android.app.PendingIntent;
import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.a;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class rs6 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ws6 b;

    public /* synthetic */ rs6(ws6 ws6Var, byte b) {
        this.a = b;
        this.b = ws6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PlaybackStateCompat playbackStateCompat;
        PendingIntent sessionActivity;
        byte b = this.a;
        int i = 0;
        ws6 ws6Var = this.b;
        switch (b) {
            case 0:
                Context context = ws6Var.s;
                AccessibilityManager accessibilityManager = ws6Var.E0;
                int id = view.getId();
                if (id != 16908313 && id != 16908314) {
                    if (id != R.id.mr_control_playback_ctrl) {
                        if (id == R.id.mr_close) {
                            ws6Var.dismiss();
                            break;
                        }
                    } else {
                        wk4 wk4Var = ws6Var.j0;
                        if (wk4Var != null && (playbackStateCompat = ws6Var.l0) != null) {
                            if (playbackStateCompat.a == 3) {
                                long j = playbackStateCompat.e;
                                if ((514 & j) != 0) {
                                    wk4Var.Z().a.pause();
                                    i = R.string.mr_controller_pause;
                                } else if ((j & 1) != 0) {
                                    wk4Var.Z().a.stop();
                                    i = R.string.mr_controller_stop;
                                }
                            } else if ((playbackStateCompat.e & 516) != 0) {
                                wk4Var.Z().a.play();
                                i = R.string.mr_controller_play;
                            }
                            if (accessibilityManager != null && accessibilityManager.isEnabled() && i != 0) {
                                AccessibilityEvent obtain = AccessibilityEvent.obtain(TLObject.FLAG_14);
                                obtain.setPackageName(context.getPackageName());
                                obtain.setClassName(rs6.class.getName());
                                obtain.getText().add(context.getString(i));
                                accessibilityManager.sendAccessibilityEvent(obtain);
                                break;
                            }
                        }
                    }
                } else {
                    if (ws6Var.r.g()) {
                        gu6 gu6Var = ws6Var.h;
                        int i2 = id == 16908313 ? 2 : 1;
                        gu6Var.getClass();
                        gu6.j(i2);
                    }
                    ws6Var.dismiss();
                    break;
                }
                break;
            case 1:
                ws6Var.dismiss();
                break;
            case 2:
                wk4 wk4Var2 = ws6Var.j0;
                if (wk4Var2 != null && (sessionActivity = ((a) wk4Var2.b).a.getSessionActivity()) != null) {
                    try {
                        sessionActivity.send();
                        ws6Var.dismiss();
                        break;
                    } catch (PendingIntent.CanceledException unused) {
                        Log.e("MediaRouteCtrlDialog", sessionActivity + " was not sent, it had been canceled.");
                        return;
                    }
                }
                break;
            default:
                boolean z = ws6Var.v0;
                ws6Var.v0 = !z;
                if (!z) {
                    ws6Var.V.setVisibility(0);
                }
                ws6Var.B0 = ws6Var.v0 ? ws6Var.C0 : ws6Var.D0;
                ws6Var.t(true);
                break;
        }
    }
}
