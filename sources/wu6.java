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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class wu6 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bv6 b;

    public /* synthetic */ wu6(bv6 bv6Var, byte b) {
        this.a = b;
        this.b = bv6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PlaybackStateCompat playbackStateCompat;
        PendingIntent sessionActivity;
        byte b = this.a;
        int i = 0;
        bv6 bv6Var = this.b;
        switch (b) {
            case 0:
                Context context = bv6Var.s;
                AccessibilityManager accessibilityManager = bv6Var.E0;
                int id = view.getId();
                if (id != 16908313 && id != 16908314) {
                    if (id != R.id.mr_control_playback_ctrl) {
                        if (id == R.id.mr_close) {
                            bv6Var.dismiss();
                            break;
                        }
                    } else {
                        um4 um4Var = bv6Var.j0;
                        if (um4Var != null && (playbackStateCompat = bv6Var.l0) != null) {
                            if (playbackStateCompat.a == 3) {
                                long j = playbackStateCompat.e;
                                if ((514 & j) != 0) {
                                    um4Var.Y().a.pause();
                                    i = R.string.mr_controller_pause;
                                } else if ((j & 1) != 0) {
                                    um4Var.Y().a.stop();
                                    i = R.string.mr_controller_stop;
                                }
                            } else if ((playbackStateCompat.e & 516) != 0) {
                                um4Var.Y().a.play();
                                i = R.string.mr_controller_play;
                            }
                            if (accessibilityManager != null && accessibilityManager.isEnabled() && i != 0) {
                                AccessibilityEvent obtain = AccessibilityEvent.obtain(TLObject.FLAG_14);
                                obtain.setPackageName(context.getPackageName());
                                obtain.setClassName(wu6.class.getName());
                                obtain.getText().add(context.getString(i));
                                accessibilityManager.sendAccessibilityEvent(obtain);
                                break;
                            }
                        }
                    }
                } else {
                    if (bv6Var.r.g()) {
                        lw6 lw6Var = bv6Var.h;
                        int i2 = id == 16908313 ? 2 : 1;
                        lw6Var.getClass();
                        lw6.j(i2);
                    }
                    bv6Var.dismiss();
                    break;
                }
                break;
            case 1:
                bv6Var.dismiss();
                break;
            case 2:
                um4 um4Var2 = bv6Var.j0;
                if (um4Var2 != null && (sessionActivity = ((a) um4Var2.b).a.getSessionActivity()) != null) {
                    try {
                        sessionActivity.send();
                        bv6Var.dismiss();
                        break;
                    } catch (PendingIntent.CanceledException unused) {
                        Log.e("MediaRouteCtrlDialog", sessionActivity + " was not sent, it had been canceled.");
                        return;
                    }
                }
                break;
            default:
                boolean z = bv6Var.v0;
                bv6Var.v0 = !z;
                if (!z) {
                    bv6Var.V.setVisibility(0);
                }
                bv6Var.B0 = bv6Var.v0 ? bv6Var.C0 : bv6Var.D0;
                bv6Var.t(true);
                break;
        }
    }
}
