// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.NotificationManager;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.Intro;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class sm3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sm3(int i, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00bb  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        stc stcVar;
        stc stcVar2;
        SQLiteCursor sQLiteCursor;
        byte b = this.a;
        byte b2 = 23;
        byte b3 = 3;
        SQLiteCursor sQLiteCursor2 = null;
        byte b4 = 2;
        int i2 = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ExecutorService executorService = DictationLid.a;
                ((pz1) obj).a(Integer.valueOf(i2));
                return;
            case 1:
                ExecutorService executorService2 = DictationLid.a;
                ((um3) obj).a(null, 0L, i2);
                return;
            case 2:
                ((ew3) obj).H0(i2);
                return;
            case 3:
                t14 t14Var = (t14) obj;
                if (t14Var.Q1) {
                    u04 u04Var = t14Var.u1;
                    if (u04Var != null && u04Var.l()) {
                        try {
                            t14Var.y.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    t14Var.R1 = true;
                    int max = Math.max(50, i2 - 100);
                    gl.d3(new sm3(t14Var, max, b3), max);
                    return;
                }
                return;
            case 4:
                l34 l34Var = (l34) obj;
                l34Var.N = i2;
                l34Var.M = true;
                try {
                    l34Var.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                ValueAnimator valueAnimator = l34Var.R;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = l34Var.S;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                l34Var.R = duration;
                duration.setInterpolator(s33.f);
                l34Var.R.addUpdateListener(new h34(l34Var, (byte) 5));
                l34Var.R.addListener(new i34(l34Var, b4));
                l34Var.R.start();
                return;
            case 5:
                l93 l93Var = ((i64) obj).N;
                tj Q = l93Var.Q();
                l93Var.V(Q, 1034, new jz2(Q, i2, b2));
                return;
            case 6:
                FilesMigrationService filesMigrationService = (FilesMigrationService) obj;
                boolean z = FilesMigrationService.c;
                ir2.q();
                ((NotificationManager) filesMigrationService.getSystemService("notification")).notify(kk7.X4, fk.a(filesMigrationService, im7.k0).setContentTitle(k96.M0(2131748238, null)).setContentText(i2 + "/" + filesMigrationService.a).setSmallIcon(R.drawable.notification).setAutoCancel(false).setProgress(filesMigrationService.a, i2, false).build());
                return;
            case 7:
                ((o04) obj).x0(i2, 0, null);
                return;
            case 8:
                ((lu4) obj).F0(i2, true);
                return;
            case 9:
                c C = c.C(i2);
                kk7 f = kk7.f(i2);
                p05 p05Var = new p05(f, (kz5) obj, C);
                f.a(p05Var, kk7.c4);
                gl.d3(p05Var, 10000L);
                if (C.e == null && C.C < 0) {
                    C.g0();
                }
                C.e0();
                p05Var.a();
                return;
            case 10:
                c cVar = (c) obj;
                HashSet hashSet = cVar.G;
                hashSet.remove(Integer.valueOf(i2));
                if (hashSet.isEmpty()) {
                    cVar.Z();
                    return;
                }
                return;
            case 11:
                kk7.f(i2).n((x25) obj, kk7.c4);
                return;
            case 12:
                h75 h75Var = ((k65) obj).b;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i2);
                    h75Var.n5 = Integer.valueOf(i2);
                }
                u21 u21Var = new u21(h75Var.F, new e53());
                Resources resources = h75Var.getContext().getResources();
                if (i2 == 2) {
                    i = R.drawable.msg_voice_bluetooth;
                } else if (i2 == 0) {
                    i = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                u21Var.M(resources.getDrawable(i).mutate(), h75.X0(i2)).k(h75Var.f1());
                return;
            case 13:
                qa5 qa5Var = (qa5) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = qa5Var.n.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = qa5Var.n.getChildAt(i3);
                    qa5Var.n.getClass();
                    if (RecyclerView.R(childAt) >= i2) {
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(qa5Var.n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / qa5Var.n.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 14:
                vp5 vp5Var = (vp5) obj;
                int i4 = vp5.E;
                vp5Var.a(R.drawable.intro_powerful_mask, 17, i2, true);
                vp5Var.c();
                vp5Var.b(vp5Var.w, 23, true);
                vp5Var.d();
                Intro.a(i2);
                return;
            case 15:
                q88 q88Var = (q88) obj;
                mcb mcbVar = q88Var.A1;
                q88Var.u0(mcbVar, null);
                k38.e(i2).j(mcbVar.c);
                return;
            case 16:
                String str = LaunchActivity.C1;
                ConnectionsManager.getInstance(((LaunchActivity) obj).P).cancelRequest(i2, true);
                return;
            case 17:
                ((ad6) obj).a.f[i2].D(1.0f);
                return;
            case 18:
                MediaController mediaController = (MediaController) obj;
                String[] strArr = MediaController.W1;
                if (i2 == -1) {
                    if (mediaController.D(mediaController.v0) && !mediaController.C()) {
                        mediaController.Q(mediaController.v0, true);
                    }
                    mediaController.V = (byte) 0;
                    mediaController.Y = (byte) 0;
                } else if (i2 == 1) {
                    mediaController.Y = (byte) 2;
                    if (mediaController.Z) {
                        mediaController.Z = false;
                        if (mediaController.D(mediaController.v0) && mediaController.C()) {
                            mediaController.R(mediaController.v0);
                        }
                    }
                } else if (i2 == -3) {
                    mediaController.Y = (byte) 1;
                } else if (i2 == -2) {
                    mediaController.Y = (byte) 0;
                    if (mediaController.D(mediaController.v0) && !mediaController.C()) {
                        mediaController.Q(mediaController.v0, true);
                        mediaController.Z = true;
                    }
                }
                mediaController.m0();
                return;
            case 19:
                hd hdVar = (hd) obj;
                String[] strArr2 = MediaController.W1;
                try {
                    hdVar.n(i2);
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 20:
                MediaController mediaController2 = ((tl6) obj).a;
                if (i2 == 1) {
                    if (mediaController2.D(mediaController2.v0) && !mediaController2.C()) {
                        mediaController2.Q(mediaController2.v0, true);
                    } else if (mediaController2.E()) {
                        mediaController2.A0(2, 0, false, false);
                    }
                    ou3 ou3Var = ou3.R1;
                    if (ou3Var != null && (stcVar2 = ou3Var.m1) != null && stcVar2.x) {
                        stcVar2.a.f0();
                        stcVar2.n();
                        stcVar2.g0.d(true, true);
                    }
                    mediaController2.X = true;
                    return;
                }
                if (i2 == 0) {
                    mediaController2.X = false;
                    return;
                }
                if (i2 == 2) {
                    ou3 ou3Var2 = ou3.R1;
                    if (ou3Var2 != null && (stcVar = ou3Var2.m1) != null && stcVar.x) {
                        stcVar.a.f0();
                        stcVar.n();
                        stcVar.g0.d(true, true);
                    }
                    mediaController2.X = true;
                    return;
                }
                return;
            case 21:
                hq6 hq6Var = (hq6) obj;
                hq6Var.W[i2] = false;
                hq6Var.X[i2] = true;
                Runnable[] runnableArr = hq6Var.V;
                Runnable runnable = runnableArr[i2];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[i2] = null;
                    return;
                }
                return;
            case 22:
                ((t07) obj).b.b.H(i2);
                return;
            case 23:
                TLRPC.TL_help_appConfig tL_help_appConfig = (TLRPC.TL_help_appConfig) obj;
                try {
                    SQLiteDatabase sQLiteDatabase = ad7.Y(i2).b;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.executeFast("DELETE FROM app_config").stepThis().dispose();
                        if (tL_help_appConfig != null) {
                            SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("INSERT INTO app_config VALUES(?)");
                            executeFast.requery();
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_help_appConfig.getObjectSize());
                            tL_help_appConfig.serializeToStream(nativeByteBuffer);
                            executeFast.bindByteBuffer(1, nativeByteBuffer);
                            executeFast.step();
                            nativeByteBuffer.reuse();
                            executeFast.dispose();
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
            case 24:
                TLRPC.messages_AvailableEffects messages_availableeffects = (TLRPC.messages_AvailableEffects) obj;
                try {
                    SQLiteDatabase sQLiteDatabase2 = ad7.Y(i2).b;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.executeFast("DELETE FROM effects").stepThis().dispose();
                        if (messages_availableeffects != null) {
                            SQLitePreparedStatement executeFast2 = sQLiteDatabase2.executeFast("INSERT INTO effects VALUES(?)");
                            executeFast2.requery();
                            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(messages_availableeffects.getObjectSize());
                            messages_availableeffects.serializeToStream(nativeByteBuffer2);
                            executeFast2.bindByteBuffer(1, nativeByteBuffer2);
                            executeFast2.step();
                            nativeByteBuffer2.reuse();
                            executeFast2.dispose();
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e3) {
                    fa4.g(e3, true);
                    return;
                }
            case 25:
                i8c i8cVar = (i8c) obj;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase3 = ad7.Y(i2).b;
                        if (sQLiteDatabase3 != null) {
                            sQLiteCursor = sQLiteDatabase3.queryFinalized("SELECT data FROM web_browser_settings", new Object[0]);
                            try {
                                TL_account.WebBrowserSettings webBrowserSettings = sQLiteCursor.next() ? (TL_account.WebBrowserSettings) sQLiteCursor.tlObjectValue(0, new yw6((byte) 24), true) : null;
                                if (webBrowserSettings instanceof TL_account.TL_webBrowserSettings) {
                                    TL_account.TL_webBrowserSettings tL_webBrowserSettings = (TL_account.TL_webBrowserSettings) webBrowserSettings;
                                    i8cVar.a(Long.valueOf(tL_webBrowserSettings.hash), tL_webBrowserSettings);
                                } else {
                                    i8cVar.a(0L, null);
                                }
                                sQLiteCursor2 = sQLiteCursor;
                            } catch (Exception e4) {
                                e = e4;
                                fa4.g(e, true);
                                i8cVar.a(0L, null);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                    return;
                                }
                                return;
                            }
                        }
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor2 = 254;
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e5) {
                    e = e5;
                    sQLiteCursor = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (sQLiteCursor2 != null) {
                    }
                    throw th;
                }
            case 26:
                TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = (TL_account.TL_webBrowserSettings) obj;
                try {
                    SQLiteDatabase sQLiteDatabase4 = ad7.Y(i2).b;
                    if (sQLiteDatabase4 != null) {
                        sQLiteDatabase4.executeFast("DELETE FROM web_browser_settings").stepThis().dispose();
                        if (tL_webBrowserSettings2 != null) {
                            SQLitePreparedStatement executeFast3 = sQLiteDatabase4.executeFast("INSERT INTO web_browser_settings VALUES(?)");
                            executeFast3.requery();
                            executeFast3.bindTlObject(1, tL_webBrowserSettings2);
                            executeFast3.step();
                            executeFast3.dispose();
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e6) {
                    fa4.g(e6, true);
                    return;
                }
            case 27:
                ((ra) obj).a(Integer.valueOf(i2));
                return;
            case 28:
                ((an1) obj).a(i2);
                return;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.W = true;
                notificationsSettingsActivity.c.g(i2);
                return;
        }
    }

    public /* synthetic */ sm3(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }
}
