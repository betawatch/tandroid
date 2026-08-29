package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class qw extends ChatActivityEnterView {
    public final /* synthetic */ fy j5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw(fy fyVar, Activity activity, xx xxVar) {
        super(activity, xxVar, null, false, null);
        this.j5 = fyVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(float f9) {
        fy fyVar = this.j5;
        fyVar.u1.setInputBubbleHeight(f9);
        fyVar.s3();
        fyVar.m3();
        fyVar.t3();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        if (motionEvent.getAction() == 0) {
            fy fyVar = this.j5;
            Activity parentActivity = fyVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.o2) fyVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        fy fyVar = this.j5;
        int i10 = fyVar.O0;
        qw qwVar = fyVar.x1;
        return Math.max(1, i10 + (!TextUtils.isEmpty(qwVar == null ? "" : qwVar.getFieldText()) ? 1 : 0));
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        fy fyVar = this.j5;
        ArrayList arrayList = fyVar.E2;
        if (arrayList == null) {
            return 0L;
        }
        int size = arrayList.size();
        int i10 = 0;
        long j10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long longValue = ((Long) obj).longValue();
            long sendPaidMessagesStars = fyVar.getMessagesController().getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(fyVar.getMessagesController().isUserContactBlocked(longValue));
            }
            j10 += sendPaidMessagesStars;
        }
        return j10;
    }
}
