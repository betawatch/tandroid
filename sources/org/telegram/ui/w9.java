package org.telegram.ui;

import android.content.Intent;
import android.graphics.Point;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class w9 implements tp0 {
    public final /* synthetic */ y9 a;

    public w9(y9 y9Var) {
        this.a = y9Var;
    }

    @Override // org.telegram.ui.tp0
    public final void a(ArrayList arrayList) {
        y9 y9Var = this.a;
        try {
            if (arrayList.isEmpty()) {
                return;
            }
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList.get(0);
            if (sendingMediaInfo.path != null) {
                Point realScreenSize = AndroidUtilities.getRealScreenSize();
                m.g3 g02 = y9Var.g0(null, 0, 0, 0, ImageLoader.loadBitmap(sendingMediaInfo.path, null, realScreenSize.x, realScreenSize.y, true));
                if (g02 != null) {
                    x9 x9Var = y9Var.N;
                    if (x9Var != null) {
                        x9Var.E((String) g02.b);
                    }
                    y9Var.removeSelfFromStack();
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.tp0
    public final void b() {
        try {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            this.a.getParentActivity().startActivityForResult(intent, 11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
