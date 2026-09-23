package qg;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.Components.d90;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.tt0;
import yh.t5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v(int i10, c5 c5Var) {
        this.a = 3;
        this.b = i10;
        this.c = c5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                tt0 tt0Var = (tt0) obj;
                pg.r1 r1Var = tt0Var.K1;
                tt0Var.t0(r1Var, null);
                pg.t0.e(i11).j(r1Var.c);
                break;
            case 1:
                p2 p2Var = (p2) obj;
                p2Var.getClass();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                p2Var.h();
                break;
            case 2:
                d90 d90Var = ((tg.s0) obj).e;
                try {
                    if (d90Var.getLayout().getLineForOffset(i11) == 0) {
                        d90Var.getEditableText().insert(i11, "\n");
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
                ((c5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                break;
            case 4:
                nf.f.s(((yh.g) obj).getParentActivity(), LocaleController.getString(i11));
                break;
            case 5:
                ConnectionsManager.getInstance(((t5) obj).a).cancelRequest(i11, true);
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
