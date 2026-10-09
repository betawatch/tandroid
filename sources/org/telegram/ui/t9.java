package org.telegram.ui;

import android.content.Intent;
import android.graphics.Point;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class t9 implements jq0 {
    public final /* synthetic */ v9 a;

    public t9(v9 v9Var) {
        this.a = v9Var;
    }

    @Override // org.telegram.ui.jq0
    public final void a(ArrayList arrayList) {
        v9 v9Var = this.a;
        try {
            if (arrayList.isEmpty()) {
                return;
            }
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList.get(0);
            if (sendingMediaInfo.path != null) {
                Point realScreenSize = AndroidUtilities.getRealScreenSize();
                la.h g02 = v9Var.g0(null, 0, 0, 0, ImageLoader.loadBitmap(sendingMediaInfo.path, null, realScreenSize.x, realScreenSize.y, true));
                if (g02 != null) {
                    u9 u9Var = v9Var.M;
                    if (u9Var != null) {
                        u9Var.K((String) g02.b);
                    }
                    v9Var.removeSelfFromStack();
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.jq0
    public final void b() {
        try {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            this.a.getParentActivity().startActivityForResult(intent, 11);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
