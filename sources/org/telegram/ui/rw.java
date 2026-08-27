package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class rw extends ChatActivityEnterView {
    public final /* synthetic */ gy j5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw(gy gyVar, Activity activity, yx yxVar) {
        super(activity, yxVar, null, false, null);
        this.j5 = gyVar;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(float f10) {
        gy gyVar = this.j5;
        gyVar.u1.setInputBubbleHeight(f10);
        gyVar.s3();
        gyVar.m3();
        gyVar.t3();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        if (motionEvent.getAction() == 0) {
            gy gyVar = this.j5;
            Activity parentActivity = gyVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) gyVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        gy gyVar = this.j5;
        int i10 = gyVar.O0;
        rw rwVar = gyVar.x1;
        return Math.max(1, i10 + (!TextUtils.isEmpty(rwVar == null ? "" : rwVar.getFieldText()) ? 1 : 0));
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        gy gyVar = this.j5;
        ArrayList arrayList = gyVar.E2;
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
            long sendPaidMessagesStars = gyVar.getMessagesController().getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(gyVar.getMessagesController().isUserContactBlocked(longValue));
            }
            j10 += sendPaidMessagesStars;
        }
        return j10;
    }
}
