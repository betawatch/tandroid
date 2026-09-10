package pg;

import android.os.Bundle;
import bi.q3;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.Components.m90;
import org.telegram.ui.ProfileActivity;
import xh.v5;
import zh.i5;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f2(int i10, f5 f5Var) {
        this.a = 2;
        this.b = i10;
        this.c = f5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                n2 n2Var = (n2) obj;
                n2Var.getClass();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                n2Var.h();
                break;
            case 1:
                m90 m90Var = ((sg.t0) obj).e;
                try {
                    if (m90Var.getLayout().getLineForOffset(i11) == 0) {
                        m90Var.getEditableText().insert(i11, "\n");
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 2:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                ((f5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                break;
            case 3:
                nf.f.s(((xh.h) obj).getParentActivity(), LocaleController.getString(i11));
                break;
            case 4:
                ConnectionsManager.getInstance(((v5) obj).a).cancelRequest(i11, true);
                break;
            case 5:
                yg.g gVar = (yg.g) obj;
                if (gVar.b) {
                    Utilities.Callback callback = gVar.d;
                    if (callback != null) {
                        callback.run(Boolean.valueOf(i11 < 300));
                        try {
                            gVar.a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    gVar.c = true;
                    int max = Math.max(50, i11 - 100);
                    AndroidUtilities.runOnUIThread(new f2(gVar, max, 5), max);
                    break;
                }
                break;
            default:
                i5 i5Var = (i5) obj;
                ArrayList arrayList = i5Var.g;
                i5Var.v(arrayList);
                q3 q3Var = i5Var.J;
                Collections.sort(arrayList, q3Var);
                ArrayList arrayList2 = i5Var.h;
                i5Var.v(arrayList2);
                Collections.sort(arrayList2, q3Var);
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                break;
        }
    }

    public /* synthetic */ f2(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
