package qg;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.Components.n90;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.st0;
import yh.s5;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v(int i10, b5 b5Var) {
        this.a = 3;
        this.b = i10;
        this.c = b5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                st0 st0Var = (st0) obj;
                pg.t1 t1Var = st0Var.K1;
                st0Var.t0(t1Var, null);
                pg.u0.e(i11).j(t1Var.c);
                break;
            case 1:
                n2 n2Var = (n2) obj;
                n2Var.getClass();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                n2Var.h();
                break;
            case 2:
                n90 n90Var = ((tg.r0) obj).e;
                try {
                    if (n90Var.getLayout().getLineForOffset(i11) == 0) {
                        n90Var.getEditableText().insert(i11, "\n");
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
                ((b5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                break;
            case 4:
                nf.f.s(((yh.g) obj).getParentActivity(), LocaleController.getString(i11));
                break;
            case 5:
                ConnectionsManager.getInstance(((s5) obj).a).cancelRequest(i11, true);
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
