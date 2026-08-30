package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class zw extends ChatActivityEnterView {
    public final /* synthetic */ oy k5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw(oy oyVar, Activity activity, hy hyVar) {
        super(activity, hyVar, null, false, null);
        this.k5 = oyVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(float f10) {
        oy oyVar = this.k5;
        oyVar.v1.setInputBubbleHeight(f10);
        oyVar.s3();
        oyVar.m3();
        oyVar.t3();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        if (motionEvent.getAction() == 0) {
            oy oyVar = this.k5;
            Activity parentActivity = oyVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.p2) oyVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        oy oyVar = this.k5;
        int i10 = oyVar.P0;
        zw zwVar = oyVar.y1;
        return Math.max(1, i10 + (!TextUtils.isEmpty(zwVar == null ? "" : zwVar.getFieldText()) ? 1 : 0));
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        oy oyVar = this.k5;
        ArrayList arrayList = oyVar.F2;
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
            long sendPaidMessagesStars = oyVar.getMessagesController().getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(oyVar.getMessagesController().isUserContactBlocked(longValue));
            }
            j10 += sendPaidMessagesStars;
        }
        return j10;
    }
}
