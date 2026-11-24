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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ru6 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wu6 b;

    public /* synthetic */ ru6(wu6 wu6Var, byte b) {
        this.a = b;
        this.b = wu6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PlaybackStateCompat playbackStateCompat;
        PendingIntent sessionActivity;
        byte b = this.a;
        int i = 0;
        wu6 wu6Var = this.b;
        switch (b) {
            case 0:
                Context context = wu6Var.s;
                AccessibilityManager accessibilityManager = wu6Var.E0;
                int id = view.getId();
                if (id != 16908313 && id != 16908314) {
                    if (id != R.id.mr_control_playback_ctrl) {
                        if (id == R.id.mr_close) {
                            wu6Var.dismiss();
                            break;
                        }
                    } else {
                        wm4 wm4Var = wu6Var.j0;
                        if (wm4Var != null && (playbackStateCompat = wu6Var.l0) != null) {
                            if (playbackStateCompat.a == 3) {
                                long j = playbackStateCompat.e;
                                if ((514 & j) != 0) {
                                    wm4Var.a0().a.pause();
                                    i = R.string.mr_controller_pause;
                                } else if ((j & 1) != 0) {
                                    wm4Var.a0().a.stop();
                                    i = R.string.mr_controller_stop;
                                }
                            } else if ((playbackStateCompat.e & 516) != 0) {
                                wm4Var.a0().a.play();
                                i = R.string.mr_controller_play;
                            }
                            if (accessibilityManager != null && accessibilityManager.isEnabled() && i != 0) {
                                AccessibilityEvent obtain = AccessibilityEvent.obtain(TLObject.FLAG_14);
                                obtain.setPackageName(context.getPackageName());
                                obtain.setClassName(ru6.class.getName());
                                obtain.getText().add(context.getString(i));
                                accessibilityManager.sendAccessibilityEvent(obtain);
                                break;
                            }
                        }
                    }
                } else {
                    if (wu6Var.r.g()) {
                        gw6 gw6Var = wu6Var.h;
                        int i2 = id == 16908313 ? 2 : 1;
                        gw6Var.getClass();
                        gw6.j(i2);
                    }
                    wu6Var.dismiss();
                    break;
                }
                break;
            case 1:
                wu6Var.dismiss();
                break;
            case 2:
                wm4 wm4Var2 = wu6Var.j0;
                if (wm4Var2 != null && (sessionActivity = ((a) wm4Var2.b).a.getSessionActivity()) != null) {
                    try {
                        sessionActivity.send();
                        wu6Var.dismiss();
                        break;
                    } catch (PendingIntent.CanceledException unused) {
                        Log.e("MediaRouteCtrlDialog", sessionActivity + " was not sent, it had been canceled.");
                        return;
                    }
                }
                break;
            default:
                boolean z = wu6Var.v0;
                wu6Var.v0 = !z;
                if (!z) {
                    wu6Var.V.setVisibility(0);
                }
                wu6Var.B0 = wu6Var.v0 ? wu6Var.C0 : wu6Var.D0;
                wu6Var.t(true);
                break;
        }
    }
}
