// default package

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.StatFs;
import java.io.File;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class sv1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ sv1(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        File z;
        boolean z2;
        NativeByteBuffer byteBufferValue;
        byte b = this.a;
        byte b2 = 2;
        byte b3 = 1;
        byte b4 = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i2 = ChatActivityEnterView.r7;
                if (b4 == 0) {
                    chatActivityEnterView.q3 = 0;
                }
                chatActivityEnterView.W0 = null;
                wx1 wx1Var = chatActivityEnterView.V0;
                if (wx1Var != null) {
                    if (chatActivityEnterView.d7 == null) {
                        wx1Var.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.V0.setVisibility(8);
                    chatActivityEnterView.d2.removeView(chatActivityEnterView.V0);
                    if (chatActivityEnterView.w4) {
                        chatActivityEnterView.w4 = false;
                        chatActivityEnterView.V0 = null;
                    }
                }
                hy1 hy1Var = chatActivityEnterView.P3;
                if (hy1Var != null) {
                    hy1Var.k(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 1:
                h75 h75Var = (h75) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(b4);
                    h75Var.n5 = Integer.valueOf(b4);
                }
                u21 u21Var = new u21(h75Var.F, new e53());
                Resources resources = h75Var.getContext().getResources();
                if (b4 == 2) {
                    i = R.drawable.msg_voice_bluetooth;
                } else if (b4 == 0) {
                    i = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                u21Var.M(resources.getDrawable(i).mutate(), h75.X0(b4)).k(h75Var.f1());
                break;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                String str = LaunchActivity.C1;
                if (y6c.h(launchActivity.P).o()) {
                    try {
                        SharedPreferences c1 = na7.c1();
                        if ((((b4 == 2 || b4 == 1) && Math.abs(launchActivity.x1 - System.currentTimeMillis()) > 240000) || Math.abs(c1.getLong("last_space_check", 0L) - System.currentTimeMillis()) >= 259200000) && (z = ba4.z(4)) != null) {
                            StatFs statFs = new StatFs(z.getAbsolutePath());
                            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
                            if (b4 > 0) {
                                launchActivity.x1 = System.currentTimeMillis();
                            } else if (availableBlocksLong < 52428800) {
                            }
                            c1.edit().putLong("last_space_check", System.currentTimeMillis()).commit();
                            gl.c3(new rx5(launchActivity, b2));
                            break;
                        }
                    } catch (Throwable unused) {
                        return;
                    }
                }
                break;
            case 3:
                qa6 qa6Var = (qa6) obj;
                qa6Var.V.g1(0, -gl.L(b4));
                qa6Var.M0(false);
                break;
            case 4:
                MediaController mediaController = (MediaController) obj;
                String[] strArr = MediaController.W1;
                kk7.f(mediaController.i1).k(kk7.m2, Integer.valueOf(mediaController.h1), Integer.valueOf(b4 == 2 ? 1 : 0));
                break;
            default:
                hq6 hq6Var = (hq6) obj;
                try {
                    SQLiteCursor queryFinalized = hq6Var.getMessagesStorage().b.queryFinalized("SELECT data FROM emoji_statuses WHERE type = " + ((int) b4) + " LIMIT 1", new Object[0]);
                    if (!queryFinalized.next() || queryFinalized.getColumnCount() <= 0 || queryFinalized.isNull(0) || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                        z2 = false;
                    } else {
                        TL_account.EmojiStatuses TLdeserialize = TL_account.EmojiStatuses.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        if (TLdeserialize instanceof TL_account.TL_emojiStatuses) {
                            hq6Var.E0[b4] = TLdeserialize.hash;
                            hq6Var.F0[b4] = TLdeserialize.statuses;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        try {
                            byteBufferValue.reuse();
                        } catch (Exception e) {
                            e = e;
                            fa4.g(e, true);
                            hq6Var.H0[b4] = true;
                            hq6Var.I0[b4] = false;
                            if (!z2) {
                            }
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e2) {
                    e = e2;
                    z2 = false;
                }
                hq6Var.H0[b4] = true;
                hq6Var.I0[b4] = false;
                if (!z2) {
                    gl.c3(new un6(hq6Var, b3));
                    break;
                } else {
                    hq6Var.N(b4, false);
                    break;
                }
                break;
        }
    }
}
