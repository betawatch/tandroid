package qg;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.Components.c90;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.au0;
import yh.u5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v(int i10, d5 d5Var) {
        this.a = 3;
        this.b = i10;
        this.c = d5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                au0 au0Var = (au0) obj;
                pg.q1 q1Var = au0Var.K1;
                au0Var.t0(q1Var, null);
                pg.s0.e(i11).j(q1Var.c);
                break;
            case 1:
                p2 p2Var = (p2) obj;
                p2Var.getClass();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                p2Var.h();
                break;
            case 2:
                c90 c90Var = ((tg.s0) obj).e;
                try {
                    if (c90Var.getLayout().getLineForOffset(i11) == 0) {
                        c90Var.getEditableText().insert(i11, "\n");
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 3:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                ((d5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                break;
            case 4:
                nf.f.s(((yh.g) obj).getParentActivity(), LocaleController.getString(i11));
                break;
            case 5:
                ConnectionsManager.getInstance(((u5) obj).a).cancelRequest(i11, true);
                break;
            default:
                zg.f fVar = (zg.f) obj;
                if (fVar.b) {
                    Utilities.Callback callback = fVar.d;
                    if (callback != null) {
                        callback.run(Boolean.valueOf(i11 < 300));
                        try {
                            fVar.a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    fVar.c = true;
                    int max = Math.max(50, i11 - 100);
                    AndroidUtilities.runOnUIThread(new v(fVar, max, 6), max);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ v(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
